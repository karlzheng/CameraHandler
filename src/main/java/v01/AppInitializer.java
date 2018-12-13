package v01;

import jssc.SerialPort;
import jssc.SerialPortException;
import v01.commands.Command;
import v01.terminalhandler.CameraCommandsParser;
import v01.terminalhandler.CameraCommandsTranslator;
import v01.terminalhandler.CommandContainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.TimeoutException;

public final class AppInitializer {

    private AppInitializer() {
    }

    public static void init() {
        try {
            SerialPort serialPort = configConnection("COM4");
            byte[] data = { -120, 48, 1, -1 };
            serialPort.writeBytes(data);
            System.out.println("Wysłany adres");

            Command.setSerialPort(serialPort);
            Thread.sleep(1000);
            terminalHandling();

        } catch (SerialPortException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void terminalHandling() {
        CameraCommandsParser parser = new CameraCommandsParser();
        CameraCommandsTranslator translator = new CameraCommandsTranslator();

        Thread terminalHandling = new Thread(() -> {
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
        });
        terminalHandling.start();
    }

    private static SerialPort configConnection(String portName) throws SerialPortException {
        SerialPort serialPort = new SerialPort(portName);
        serialPort.openPort();
        serialPort.setParams(9600, 8, 1, 0);
        return serialPort;
    }

    public static byte[] readResponse(SerialPort serialPort) throws SerialPortException, TimeoutException {
        ArrayList<Byte> data = new ArrayList();
        long startTime = System.currentTimeMillis();

        long timeDiff;
        do {
            while(serialPort.getInputBufferBytesCount() != 0) {
                byte[] responseData = serialPort.readBytes(1);
                Byte b = responseData[0];
                data.add(b);
                if (b == -1) {
                    responseData = new byte[data.size()];
                    int idx = 0;

                    for(Iterator var7 = data.iterator(); var7.hasNext(); responseData[idx++] = b.byteValue()) {
                        b = (Byte)var7.next();
                    }

                    return responseData;
                }
            }

            long currentTime = System.currentTimeMillis();
            timeDiff = currentTime - startTime;
        } while(timeDiff <= 1000L);

        throw new TimeoutException();
    }
}
