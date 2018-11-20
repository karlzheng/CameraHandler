package v01.commands;

/**
 * When camera main power is on, camera can be changed to Power Save Mode.
 */
public class PowerCommand extends GeneralCommand {

    public Command on() {
        return createCommand(new int[] {1, 4, 0, 2});
    }

    public Command off() {
        return createCommand(new int[] {1, 4, 0, 3});
    }
}
