package com.multimedia.v01.commands;

public class GeneralCommand {

    Command createCommand(int[] data) {
        return new Command(convertByteArr(data));
    }

    private byte[] convertByteArr(int[] intData) {
        byte[] data = new byte[intData.length];

        for (int i = 0; i < data.length; i++) {
            if (intData[i] > 127)
                data[i] = (byte)(intData[i] - 256);
            else
                data[i] = (byte)intData[i];
        }

        return data;
    }
}
