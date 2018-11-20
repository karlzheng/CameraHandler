package v01.commands;

/**
 * Focus control.
 * When adjust the focus, change the mode to Manual the send Far/Near or Direct command.
 *
 * focusData: values from 0 to 100
 */

public class FocusCommand extends GeneralCommand {

    private final static int MAX_FOCUS = 40959;

    private final static int MIN_FOCUS = 4096;

    public Command stop(){
        return createCommand(new int[]{1, 4, 8, 0});
    }

    public Command far(){
        return createCommand(new int[]{1, 4, 8, 2});
    }

    public Command near(){
        return createCommand(new int[]{1, 4, 8, 3});
    }

    public Command autoFocusOn(){
        return createCommand(new int[]{1, 4, 56, 2});
    }

    public Command manualFocusOn(){
        return createCommand(new int[]{1, 4, 56, 3});
    }

    public Command mixedFocus(){
        return createCommand(new int[]{1, 4, 56, 16});
    }

    public Command direct(int focusData){
        if(!scopeValidation(focusData, 0, 100)){
            throw new IllegalArgumentException();
        }
        int[] focusBytes = positionDecToHexBytes(focusData, MIN_FOCUS, MAX_FOCUS);
        return createCommand(new int[]{1, 4, 72, focusBytes[3], focusBytes[2], focusBytes[1], focusBytes[0]});
    }
}
