package v01.commands;

/**
 * Auto Exposure for the target.
 */
public class ATAECommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 7, 2, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 7, 2, 3});
    }

    public Command onOff() {
        return createCommand(new int[] {1, 7, 2, 16});
    }
}
