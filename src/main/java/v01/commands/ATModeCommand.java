package v01.commands;

/**
 * Target Tracking Mode ON/OFF.
 */
public class ATModeCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 7, 1, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 7, 1, 3});
    }

    public Command onOff() {
        return createCommand(new int[] {1, 7, 1, 16});
    }
}
