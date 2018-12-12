package v01;

import jssc.SerialPort;
import jssc.SerialPortException;
import v01.terminalhandler.CameraCommandsParser;
import v01.terminalhandler.CameraCommandsTranslator;
import v01.terminalhandler.CommandContainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class AppInitializer {

    private AppInitializer() {
    }

    public static void init() throws IOException {
//        try {
//            SerialPort serialPort = configConnection("COM4");
//            byte[] data = { -120, 48, 1, -1 };
//            serialPort.writeBytes(data);
//            System.out.println("Wysłany adres");
//
//            Command.setSerialPort(serialPort);
//            Thread.sleep(1000);
//
//        } catch (SerialPortException | InterruptedException e) {
//            e.printStackTrace();
//        }
        terminalHandling();
    }

    private static void terminalHandling() {
        CameraCommandsParser parser = new CameraCommandsParser();
        CameraCommandsTranslator translator = new CameraCommandsTranslator();

        Thread terminalHandling = new Thread() {
            public void run(){
                while (true) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                    String command = null;
                    try {
                        command = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                        continue;
                    }

                    final CommandContainer container = parser.parseCommand(command);

                    if (container == null)
                        continue;

                    CamMethod method = CommandList.getCommands()
                            .entrySet()
                            .stream()
                            .filter(e -> Objects.equals(e.getKey().toLowerCase(), container.getGroupName()))
                            .findAny()
                            .orElse(new AbstractMap.SimpleEntry<>("",new ArrayList<>()))
                            .getValue()
                            .stream()
                            .filter(m -> Objects.equals(m.getName().toLowerCase(), container.getCommandName()))
                            .findAny()
                            .orElse(null);

                    if (method == null)
                        continue;

                    Param[] params = method.getParams();
                    List<Integer> console_params = container.getParams();

                    for (int i = 0; i < params.length; i++)
                        params[i].setVal(console_params.get(i));

                    method.execute();
                }
            }
        };
        terminalHandling.start();
    }

    private static SerialPort configConnection(String portName) throws SerialPortException {
        SerialPort serialPort = new SerialPort(portName);
        serialPort.openPort();
        serialPort.setParams(9600, 8, 1, 0);
        return serialPort;
    }
}
