package com.multimedia.v01.commands;

public class TiltCommand extends GeneralCommand {

    public Command down() {
        return createCommand(new int[] {1, 6, 1, 1, 2, 3, 2}); // zmienić wartości
    }
}
