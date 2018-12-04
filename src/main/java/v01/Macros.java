package v01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Macros {

    private static List<CommandList.CamMethod> newMacroMethods = new LinkedList<>();
    private static List<Macro> macros = new LinkedList<>();

    public static void addMethod(CommandList.CamMethod method) {
        newMacroMethods.add(method);
    }

    public static List<CommandList.CamMethod> getNewMacroMethods() {
        return newMacroMethods;
    }

    public static void addMacro(String name) {
        macros.add(new Macro(name, new ArrayList<>()));
        newMacroMethods.clear();
    }

    public static boolean isNameBusy(String name){
        return macros.stream().anyMatch(e -> e.getName().equals(name));
    }

    public static List<String> getMacrosName() {
        return macros.stream().map(e -> e.getName()).collect(Collectors.toList());
    }

    public static List<Macro> getMacros() {
        return macros;
    }
}

class Macro {

    private String name;
    private List<CommandList.CamMethod> methods;

    public Macro(String name, List<CommandList.CamMethod> macroMethods) {
        this.name = name;
        methods = macroMethods;
    }

    public String getName() {
        return name;
    }

    public List<CommandList.CamMethod> getMethods() {
        return methods;
    }
}
