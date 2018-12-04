package v01.commands;

public class DelayCommand extends GeneralCommand {

    public Command delay(int seconds) {
        scopeValidation(seconds, 1, 120);
        return createCommand(new int[] {seconds});
    }
}
