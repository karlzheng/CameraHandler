package v01.commands;

public class AddressSetCommand extends GeneralCommand {

    public Command setAddress(int address) {
        return createCommand(new int[] {48, address});
    }

    public Command ifClear() {
        return createCommand(new int[] {1, 0, 1});
    }
}
