package v01;

import jssc.SerialPort;
import jssc.SerialPortException;
import v01.commands.Command;
import v01.terminalhandler.CameraCommandsParser;
import v01.terminalhandler.CameraCommandsTranslator;
import v01.terminalhandler.CommandContainer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            SerialPort serialPort = configConnection("COM4");

            // bez makr, ale ma być rozkaz jak szybko ma się obracać; broadcast albo konkretna kamera
            byte[] data = { -120, 48, 1, -1 };
            serialPort.writeBytes(data);
            System.out.println("Wysłany adres");

            Command.setSerialPort(serialPort);
            Thread.sleep(1000);

        } catch (SerialPortException | InterruptedException e) {
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        CameraCommandsParser parser = new CameraCommandsParser();
        CameraCommandsTranslator translator = new CameraCommandsTranslator();

//        Thread terminalHandling = new Thread(){
//            public void run(){
//                while (true){
//                    String consoleIn = input.next();
//                    CommandContainer container = parser.parseCommand(consoleIn);
//                    try {
//                        translator.transalate(container).execute();
//                    } catch (SerialPortException e) {
//                        e.printStackTrace();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        terminalHandling.start();
    }

    private static SerialPort configConnection(String portName) throws SerialPortException {
        SerialPort serialPort = new SerialPort(portName);
        serialPort.openPort();
        serialPort.setParams(9600, 8, 1, 0);
        return serialPort;
    }
}
