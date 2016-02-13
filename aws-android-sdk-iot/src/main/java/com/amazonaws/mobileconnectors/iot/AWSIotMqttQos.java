
package com.amazonaws.mobileconnectors.iot;

/**
 * Enum to encapsulate the QoS levels allowed by the AWS IoT Service. See:
 * http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html
 */
public enum AWSIotMqttQos {
    /** QoS zero. */
    QOS0,
    /** QoS one. */
    QOS1;

    /**
     * Get as an integer to use in MQTT calls requiring an int.
     * 
     * @return integer equivalent of the QoS value.
     */
    public int asInt() {
        return (this == QOS0 ? 0 : 1);
    }
}
