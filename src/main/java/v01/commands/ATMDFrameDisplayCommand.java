package v01.commands;

/**
 * Sensing Frame Display ON/OFF.
 */
public class ATMDFrameDisplayCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 7, 4, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 7, 4, 3});
    }

    public Command onOff() {
        return createCommand(new int[] {1, 7, 4, 16});
    }
}
