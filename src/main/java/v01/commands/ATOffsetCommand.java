package v01.commands;

/**
 * Shifting the Sensing Frame for AT. For Shifting use Pan/Tilt Drive Command.
 */
public class ATOffsetCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 7, 5, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 7, 5, 3});
    }

    public Command onOff() {
        return createCommand(new int[] {1, 7, 5, 16});
    }
}
