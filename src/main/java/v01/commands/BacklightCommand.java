package v01.commands;

/**
 * Back light compensation. Gain-up to 6 dB max.
 */
public class BacklightCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 4, 51, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 4, 51, 3});
    }
}
