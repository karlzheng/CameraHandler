package com.multimedia.v01;

import jssc.SerialPort;

public class CameraHandler {

    private SerialPort serialPort;

    public CameraHandler(SerialPort serialPort) {
        this.serialPort = serialPort;
    }


}

/*
tutaj będziemy:
- ustawiać header, żeby wybrać kamerę lub wszystkie
- ustawiać prędkość ruchu w bok i w górę
- konfiguracja połączenia RS232
- wykonywanie Command
- zamykanie połączenia
- sprawdzić czy FF jest zawsze na końcu
 */