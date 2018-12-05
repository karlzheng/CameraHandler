package v01.commands;

import jssc.SerialPort;
import jssc.SerialPortException;

public class Command {

    private byte[] data;
    private static int selectedCamera = 1;
    private static SerialPort serialPort;

    public Command(byte[] data) {
        this.data = data;
    }

    public void execute() throws SerialPortException, InterruptedException {
        if(data.length == 1){
            Thread.sleep(data[0] * 1000);
        }

        byte firstBit = (byte) (-128 + selectedCamera);
        byte lastBit = -1;
        byte[] command = new byte[data.length+2]; // +2 for first & last bit

        command[0] = firstBit;
        command[command.length-1] = lastBit;

        for(int i = 1; i < command.length-2; i++){
            command[i] = data[i-1];
        }

        serialPort.writeBytes(command);
        // do sth with data
    }

    public static void setSelectedCamera(int selectedCamera) {
        selectedCamera = selectedCamera;
    }

    public static void setSerialPort(SerialPort serialPort){}
}