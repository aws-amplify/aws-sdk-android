package com.amazon.aws.amazonfreertossdk.deviceinfo;

/**
 * This class represents the mtu object transferred between ble device and the SDK.
 * When SDK sends a read characteristic command to device to get the current mtu size, this object
 * is returned in the response.
 */
public class Mtu {
    public String mtu;
}
