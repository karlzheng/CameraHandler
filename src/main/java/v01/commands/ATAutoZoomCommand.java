package v01.commands;

/**
 * Automatic Zooming for the target.
 */
public class ATAutoZoomCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 7, 3, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 7, 3, 3});
    }

    public Command onOff() {
        return createCommand(new int[] {1, 7, 3, 16});
    }
}
