package com.amazon.aws.amazonfreertossdk.deviceinfo;

/**
 * This class represents the AmazonFreeRTOS BLE library version running on the device. When SDK
 * sends a read characteristic command to get the BLE library version on the device, this object
 * is returned in the response.
 */
public class Version {
    public String version;
}
