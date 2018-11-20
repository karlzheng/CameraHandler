package v01.commands;

/**
 * Enable/Disable for RS-232C and key control.
 */
public class KeyLockCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 4, 23, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 4, 23, 0});
    }
}
