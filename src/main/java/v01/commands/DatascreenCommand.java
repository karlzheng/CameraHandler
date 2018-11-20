package v01.commands;

/**
 * On screen Data Display ON/OFF.
 */
public class DatascreenCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 6, 6, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 6, 6, 3});
    }

    public Command onOff() {
        return createCommand(new int[] {1, 6, 6, 16});
    }
}
