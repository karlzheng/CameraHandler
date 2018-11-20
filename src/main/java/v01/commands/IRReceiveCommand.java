package v01.commands;

/**
 * Enable/Disable for IR remote commander.
 */
public class IRReceiveCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 6, 8, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 6, 8, 3});
    }

    public Command onOff() {
        return createCommand(new int[] {1, 6, 8, 16});
    }
}
