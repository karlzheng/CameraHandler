package v01.commands;

/**
 * Send replies what command received from IR Commander.
 */
public class IRReceiveReturnCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 125, 1, 3, 0, 0});
    }

    public Command off() {
        return createCommand(new int[] {1, 125, 1, 19, 0, 0});
    }
}
