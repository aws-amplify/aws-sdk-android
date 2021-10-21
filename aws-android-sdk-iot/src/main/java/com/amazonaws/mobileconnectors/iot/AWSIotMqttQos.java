
package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.services.iotdata.model.InvalidRequestException;

/**
 * Enum to encapsulate the QoS levels allowed by the AWS IoT Service. See:
 * http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html
 */
public enum AWSIotMqttQos {
    QOS0,
    /** QoS one. */
    QOS1,
    /** QoS two. */
    QOS2;

    /**
     * Get as an integer to use in MQTT calls requiring an int.
     *
     * @return integer equivalent of the QoS value.
     */
    public int asInt() {
        switch (this) {
            case QOS0:
                return 0;
            case QOS1:
                return 1;
            case QOS2:
                return 2;
            default:
                throw new InvalidRequestException("QoS level not supported.");
        }
    }
}
