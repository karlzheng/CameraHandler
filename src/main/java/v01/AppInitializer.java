package v01;

import jssc.SerialPort;
import jssc.SerialPortException;
import v01.terminalhandler.CameraCommandsParser;
import v01.terminalhandler.CameraCommandsTranslator;
import v01.terminalhandler.CommandContainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                while (true){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                    String command = null;
                    try {
                        command = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    CommandContainer container = null;
                    container = parser.parseCommand(command);

                    if(container != null){
//                        try {
//                            translator.transalate(container).execute();
//                        } catch (SerialPortException e) {
//                            e.printStackTrace();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    }
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
