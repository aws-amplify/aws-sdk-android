package com.amazon.aws.amazonfreertossdk;

/**
 * This is a callback class to notify the app of device information, including mtu, broker endpoint
 * and device software version.
 */
public abstract class DeviceInfoCallback {
    /**
     * This callback is triggered when device sends the current mtu number in response to getMtu.
     * @param mtu the current mtu value negotiated between device and Android phone.
     */
    public void onObtainMtu(int mtu){}

    /**
     * This callback is triggered when device sends its MQTT broker endpoint in response to
     * getBrokerEndpoint.
     * @param endpoint The current MQTT broker endpoint set on the device.
     */
    public void onObtainBrokerEndpoint(String endpoint){}

    /**
     * This callback is triggered when device sends its current software version in response to
     * getDeviceVersion.
     * @param version The current device library version on the device.
     */
    public void onObtainDeviceSoftwareVersion(String version){}
}

