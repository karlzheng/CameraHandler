package com.multimedia.v01.commands;

/*
 * panSpeed: values from 1 to 18
 * tiltSpeed: values from 1 to 14
 * panPosition: values from 0 to 100
 * tiltPosition: values from 0 to 100
 */

public class TiltCommand extends GeneralCommand {

    private final int PAN_MIN = 880;
    private final int PAN_MAX = 64656;
    private final int TILT_MIN = 300;
    private final int TILT_MAX = 65236;

    public Command up(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 3, 1});
    }

    public Command down(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 3, 2});
    }

    public Command left(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 1, 3});
    }

    public Command right(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 2, 3});
    }

    public Command upLeft(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 1, 1});
    }

    public Command upRight(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 2, 1});
    }

    public Command downLeft(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 1, 2});
    }

    public Command downRight(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 2, 2});
    }

    public Command stop(int panSpeed, int tiltSpeed) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        return createCommand(new int[] {1, 6, 1, panSpeed, tiltSpeed, 3, 3});
    }

    public Command absolutePosition(int panSpeed, int tiltSpeed, int panPosition, int tiltPosition) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        validatePanAndTiltPosition(panPosition, tiltPosition);
        int[] panBytes = positionDecToHexBytes(panPosition, PAN_MIN, PAN_MAX);
        int[] tiltBytes = positionDecToHexBytes(tiltPosition, TILT_MIN, TILT_MAX);

        return createCommand(new int[] {1, 6, 2, panSpeed, tiltSpeed,
                panBytes[3], panBytes[2], panBytes[1], panBytes[0],
                tiltBytes[3], tiltBytes[2], tiltBytes[1], tiltBytes[0]});
    }

    public Command relativePosition(int panSpeed, int tiltSpeed, int panPosition, int tiltPosition) {
        validatePanAndTiltSpeed(panSpeed, tiltSpeed);
        validatePanAndTiltPosition(panPosition, tiltPosition);
        int[] panBytes = positionDecToHexBytes(panPosition, PAN_MIN, PAN_MAX);
        int[] tiltBytes = positionDecToHexBytes(tiltPosition, TILT_MIN, TILT_MAX);

        return createCommand(new int[] {1, 6, 3, panSpeed, tiltSpeed,
                panBytes[3], panBytes[2], panBytes[1], panBytes[0],
                tiltBytes[3], tiltBytes[2], tiltBytes[1], tiltBytes[0]});
    }

    public Command home() {
        return createCommand(new int[] {1, 6, 4});
    }

    public Command reset() {
        return createCommand(new int[] {1, 6, 5});
    }

    private void validatePanAndTiltSpeed(int panSpeed, int tiltSpeed) {
        if(!scopeValidation(panSpeed, 1, 18)){
            throw new IllegalArgumentException();
        }
        if(!scopeValidation(tiltSpeed, 1, 14)){
            throw new IllegalArgumentException();
        }
    }

    private void validatePanAndTiltPosition(int panPosition, int tiltPosition) {
        if(!scopeValidation(panPosition, 0, 100)){
            throw new IllegalArgumentException();
        }
        if(!scopeValidation(tiltPosition, 0, 100)){
            throw new IllegalArgumentException();
        }
    }

}
