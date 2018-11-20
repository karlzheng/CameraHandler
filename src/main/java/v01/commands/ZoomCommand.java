package v01.commands;

/**
 * zoomSpeed: values from 2 to 7
 * zoomData: values from 0 to 100
 */

public class ZoomCommand extends GeneralCommand {

    private final static int MIN_ZOOM = 0;

    private final static int MAX_ZOOM = 1023;

    public Command stop() {
        return createCommand(new int[]{1, 4, 7, 0});
    }

    public Command tele() {
        return createCommand(new int[]{1, 4, 7, 2});
    }

    public Command wide(){
        return createCommand(new int[]{1, 4, 7, 3});
    }

    public Command tele(int zoomSpeed){
        scopeValidation(zoomSpeed, 2, 7);
        return createCommand(new int[]{1, 4, 7, 32 + zoomSpeed});
    }

    public Command wide(int zoomSpeed){
        scopeValidation(zoomSpeed, 2, 7);
        return createCommand(new int[]{1, 4, 7, 48 + zoomSpeed});
    }

    public Command direct(int zoomData){
        scopeValidation(zoomData, 0, 100);
        int[] focusBytes = positionDecToHexBytes(zoomData, MIN_ZOOM, MAX_ZOOM);
        return createCommand(new int[]{1, 4, 47, focusBytes[3], focusBytes[2], focusBytes[1], focusBytes[0]});
    }
}
