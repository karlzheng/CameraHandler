package v01.commands;

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

    protected int[] positionDecToHexBytes(int positionPercent, int min, int max) {
        int positionValue = (max - min) * positionPercent / 100 + min;
        int[] positionBytes = new int[4];
        for (int i = 0; i < positionBytes.length; i++) {
            positionBytes[0] = (positionValue % 16) * 16;
            positionValue /= 16;
        }
        return positionBytes;
    }

    protected void scopeValidation(int value, int minValue, int maxValue){
        if (value > maxValue || value < minValue)
            throw new IllegalArgumentException();
    }

}
