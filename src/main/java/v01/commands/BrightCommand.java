package v01.commands;

public class BrightCommand extends GeneralCommand {

    public Command reset() {
        return createCommand(new int[] {1, 4, 13, 0});
    }

    public Command up() {
        return createCommand(new int[] {1, 4, 13, 2});
    }

    public Command down() {
        return createCommand(new int[] {1, 4, 13, 3});
    }
}
