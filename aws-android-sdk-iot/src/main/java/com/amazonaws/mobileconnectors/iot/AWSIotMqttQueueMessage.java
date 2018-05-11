/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    /** Message delivery user data. */
    private PublishMessageUserData userData;

    /**
     * Create a new AWSIotMqttQueueMessage.
     *
     * @param topic MQTT topic on which this message was to be published.
     * @param message Message content.
     * @param qos message quality of service.
     * @param userData user data including a status callback and user message token.
     */
    public AWSIotMqttQueueMessage(String topic, byte[] message, AWSIotMqttQos qos, PublishMessageUserData userData) {
        this.topic = topic;
        this.message = message;
        this.qos = qos;
        this.userData = userData;
    }

    /**
     * Get the message topic.
     * 
     * @return MQTT topic on which this message was published.
     */
    String getTopic() {
        return topic;
    }

    /**
     * Get the message content.
     * 
     * @return Message content as a byte array.
     */
    byte[] getMessage() {
        return message;
    }

    /**
     * Get the message quality of service.
     * 
     * @return quality of service.
     */
    AWSIotMqttQos getQos() {
        return qos;
    }

    /**
     * Get the delivery callback.
     *
     * @return publish message user data.
     */
    PublishMessageUserData getUserData() {
        return userData;
    }
}
