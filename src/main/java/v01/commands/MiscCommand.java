package v01.commands;


/**
 * Send addressSet command and IFClear command before starting communication.
 *
 * tiltPosition: values 0 or 1
 */
public class MiscCommand extends GeneralCommand {

    /**
     * Ta metoda musi być wysłana w trybie broadcast.
     */
    public Command addressSet() {
        return createCommand(new int[] {48, 1});
    }

    /**
     * Ta metoda musi być wysłana w trybie broadcast.
     */
    public Command IFClear() {
        return createCommand(new int[] {1, 0, 1});
    }

    public Command commandCancel(int socketNumber) {
        scopeValidation(socketNumber, 0, 1);
        return createCommand(new int[] {32 + socketNumber});
    }

}
