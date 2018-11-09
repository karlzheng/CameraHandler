package com.multimedia.v01.commands;

public class Command {

    private byte[] data;

    public Command(byte[] data) {
        this.data = data;
    }


    public void execute() {
        // do sth with data
    }

}