package v01.commands;

public class Command {

    private byte[] data;
    private static int selectedCamera = 1;

    public Command(byte[] data) {
        this.data = data;
    }

    public void execute() {
        // do sth with data
    }

    public static void setSelectedCamera(int selectedCamera) {
        selectedCamera = selectedCamera;
    }
}