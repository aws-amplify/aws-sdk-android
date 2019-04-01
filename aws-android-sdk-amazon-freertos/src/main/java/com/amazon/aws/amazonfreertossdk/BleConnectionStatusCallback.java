package com.amazon.aws.amazonfreertossdk;

/**
 * This is a callback to notify the app of BLE connection state change.
 */
public abstract class BleConnectionStatusCallback {
    /**
     * This callback is triggered when BLE connection between SDK and device has changed. The app
     * @param connectionStatus The BLE connection state.
     */
    public void onBleConnectionStatusChanged(AmazonFreeRTOSConstants.BleConnectionState connectionStatus) {}
}
