package v01.commands;

/**
 * Tracking or Detecting Start/Stop.
 */
public class ATMDStartStopCommand extends GeneralCommand {

    public Command startStop() {
        return createCommand(new int[] {1, 7, 6, 16});
    }

}
