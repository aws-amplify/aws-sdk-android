package com.amazon.aws.amazonfreertossdk.deviceinfo;

/**
 * This class represents the broker endpoint object that is transferred between ble device and SDK.
 * When SDK sends a read characteristic command to the ble device, this class object is returned in
 * the response back to SDK.
 * The broker endpoint is the AWS IoT endpoint from AWS IOT Console.
 */
public class BrokerEndpoint {
    public String brokerEndpoint;
}
