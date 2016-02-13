/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

/**
 * Class for storage of queued messages. Stores information needed to hold the
 * publish message in a queue until connectivity is restored and the message can
 * be published.
 */
class AWSIotMqttQueueMessage {
    /** Topic of saved message. */
    private String topic;
    /** Message content. */
    private byte[] message;
    /** Message quality of service. */
    private AWSIotMqttQos qos;

    /**
     * Create a new AWSIotMqttQueueMessage.
     * 
     * @param topic MQTT topic on which this message was to be published.
     * @param message Message content.
     * @param qos message quality of service.
     */
    public AWSIotMqttQueueMessage(String topic, byte[] message, AWSIotMqttQos qos) {
        this.topic = topic;
        this.message = message;
        this.qos = qos;
    }

    /**
     * Get the message topic.
     * 
     * @return MQTT topic on which this message was published.
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Set the topic.
     * 
     * @param topic MQTT topic on which this message is to be published.
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * Get the message content.
     * 
     * @return Message content as a byte array.
     */
    public byte[] getMessage() {
        return message;
    }

    /**
     * Set the message content.
     * 
     * @param message Message content as a byte array.
     */
    public void setMessage(byte[] message) {
        this.message = message;
    }

    /**
     * Get the message quality of service.
     * 
     * @return quality of service.
     */
    public AWSIotMqttQos getQos() {
        return qos;
    }

    /**
     * Set the message quality of service.
     * 
     * @param qos message quality of service.
     */
    public void setQos(AWSIotMqttQos qos) {
        this.qos = qos;
    }
}
