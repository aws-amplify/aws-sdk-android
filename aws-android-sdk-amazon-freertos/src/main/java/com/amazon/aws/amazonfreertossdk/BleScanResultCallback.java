package com.amazon.aws.amazonfreertossdk;

import android.bluetooth.le.ScanResult;

/**
 * This is a callback to notify app of BLE Scan results.
 */
public abstract class BleScanResultCallback {
    /**
     * This method is called when a nearby BLE device is found during scanning.
     * @param result BLE ScanResult
     */
    public void onBleScanResult(ScanResult result){}

    public void onBleScanFailed(int errorcode) {}
}
