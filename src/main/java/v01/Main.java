package v01;

import jssc.SerialPort;
import jssc.SerialPortException;

public class Main {

    public static void main(String[] args) {

        try {
            SerialPort serialPort = configConnection("COM4");

            // bez makr, ale ma być rozkaz jak szybko ma się obracać; broadcast albo konkretna kamera
            byte[] data = { -120, 48, 1, -1 };
            serialPort.writeBytes(data);
            System.out.println("Wysłany adres");

            Thread.sleep(1000);

            data = new byte[] { -127, 1, 6, 1, 1, 2, 3, 2, -1};
            serialPort.writeBytes(data);
            System.out.println("Home");

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
