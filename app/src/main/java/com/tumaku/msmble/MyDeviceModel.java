package com.tumaku.msmble;

import android.bluetooth.BluetoothDevice;

/**
 * Created by Vaib on 06-07-2016.
 */
public class MyDeviceModel {
    private BluetoothDevice bluetoothDevice;
    private  int rssi;

    public BluetoothDevice getBluetoothDevice() {
        return bluetoothDevice;
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }
}
