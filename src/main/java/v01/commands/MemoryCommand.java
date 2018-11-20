package v01.commands;

/**
 * Preset memory for memorize camera condition.
 *
 * positionNumber: values from 0 to 5
 */
public class MemoryCommand extends GeneralCommand {

    public Command reset(int positionNumber) {
        scopeValidation(positionNumber, 0, 5);
        return createCommand(new int[] {1, 4, 63, 0, positionNumber});
    }

    public Command set(int positionNumber) {
        scopeValidation(positionNumber, 0, 5);
        return createCommand(new int[] {1, 4, 63, 1, positionNumber});
    }

    public Command recall(int positionNumber) {
        scopeValidation(positionNumber, 0, 5);
        return createCommand(new int[] {1, 4, 63, 2, positionNumber});
    }
}
