package v01;

import jssc.SerialPort;
import jssc.SerialPortException;
import v01.commands.Command;

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

    }

    private static SerialPort configConnection(String portName) throws SerialPortException {
        SerialPort serialPort = new SerialPort(portName);
        serialPort.openPort();
        serialPort.setParams(9600, 8, 1, 0);
        return serialPort;
    }
}
