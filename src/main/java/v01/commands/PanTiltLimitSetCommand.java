package v01.commands;

/**
 * Pan/Tilt limit set.
 *
 *  panPosition: values from 0 to 100
 *  tiltPosition: values from 0 to 100
 *  corner: values 0 (DownLeft) or 1 (UpRight)
 */
public class PanTiltLimitSetCommand extends GeneralCommand {

    private final int PAN_MIN = 880;
    private final int PAN_MAX = 64656;
    private final int TILT_MIN = 300;
    private final int TILT_MAX = 65236;

    public Command limitSet(int corner, int panPosition, int tiltPosition) {
        scopeValidation(corner, 0, 1);
        scopeValidation(panPosition, 0, 100);
        scopeValidation(tiltPosition, 0, 100);

        int[] panBytes = positionDecToHexBytes(panPosition, PAN_MIN, PAN_MAX);
        int[] tiltBytes = positionDecToHexBytes(tiltPosition, TILT_MIN, TILT_MAX);

        return createCommand(new int[] {1, 6, 7, 0, corner,
                panBytes[3], panBytes[2], panBytes[1], panBytes[0],
                tiltBytes[3], tiltBytes[2], tiltBytes[1], tiltBytes[0]});
    }

    public Command limitClear(int corner) {
        scopeValidation(corner, 0, 1);
        return createCommand(new int[] {1, 6, 7, 1, corner, 7, 15, 15, 15, 7, 15, 15, 15});
    }
}
