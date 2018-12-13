package v01;

import jssc.SerialPortException;
import v01.commands.Command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

public class Macros {

    private static List<CamMethod> newMacroMethods = new LinkedList<>();
    private static List<Macro> macros = new LinkedList<>();

    public static void execute(String macroName) {
        for (Macro macro : macros) {
            if (macro.getName().equals(macroName)) {
                Macros.executeMacro(macro);

                return;
            }

        }
    }

    private static void executeMacro(Macro macro) {
        for (CamMethod cm : macro.getMethods()) {
            cm.execute();

            try {
                byte[] response = AppInitializer.readResponse(Command.getSerialPort());
                System.out.println(byteArrayToString(response));
            } catch (SerialPortException | TimeoutException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void addMethod(CamMethod method) {
        newMacroMethods.add(method);
    }

    public static List<CamMethod> getNewMacroMethods() {
        return newMacroMethods;
    }

    public static void addMacro(String name) {
        macros.add(new Macro(name, new ArrayList<>(newMacroMethods)));
        newMacroMethods.clear();
    }

    public static boolean isNameBusy(String name){
        return macros.stream().anyMatch(e -> e.getName().equals(name));
    }

    public static List<String> getMacrosName() {
        return macros.stream().map(Macro::getName).collect(Collectors.toList());
    }

    public static List<Macro> getMacros() {
        return macros;
    }

    private static String byteArrayToString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        byte[] var5 = bytes;
        int var4 = bytes.length;

        for(int var3 = 0; var3 < var4; ++var3) {
            byte b = var5[var3];
            sb.append(String.format("%02X ", b));
        }

        return sb.toString();
    }
}

