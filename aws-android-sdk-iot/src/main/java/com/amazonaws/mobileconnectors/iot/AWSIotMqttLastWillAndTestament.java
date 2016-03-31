package com.amazonaws.mobileconnectors.iot;

/**
 * Defines the Last Will and Testament parameters for the AWSIotMqttManager.
 */
public class AWSIotMqttLastWillAndTestament {
    /** The topic on which the will message will be delivered. */
    private String topic;
    /** Message payload of will message. */
    private String message;
    /** The quality of service requested for the will message. */
    private AWSIotMqttQos qos;
    // Currently AWS IoT does not support retained.
    //public Boolean willRetained;

    /**
     * Create a new LWT parameter object.
     * @param willTopic the topic on which the will message will be delivered.
     * @param willMessage payload of will message.
     * @param willQos the quality of service requested for the will message.
     */
    public AWSIotMqttLastWillAndTestament(String willTopic, String willMessage, AWSIotMqttQos willQos) {
        if (willTopic == null || willTopic.isEmpty()) {
            throw new IllegalArgumentException("LWT topic cannot be null");
        }
        if (willMessage == null) {
            throw new IllegalArgumentException("LWT message cannot be null");
        }
        if (willQos == null) {
            throw new IllegalArgumentException("LWT QoS cannot be null");
        }
        topic = willTopic;
        message = willMessage;
        qos = willQos;
    }

    /**
     * Get the LWT topic.
     * @return the topic on which the will message will be delivered.
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Get the LWT message to be delivered.
     * @return the message payload of the LWT message.
     */
    public String getMessage() {
        return message;
    }
    /**
     * Get the Quality of Service for the LWT message.
     * @return the quality of service requested for the will message.
     */
    public AWSIotMqttQos getQos() {
        return qos;
    }
}
