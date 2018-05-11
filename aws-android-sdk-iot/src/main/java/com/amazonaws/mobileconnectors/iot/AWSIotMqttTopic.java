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
 * Class for storage of subscriptions. Used to keep track of subscriptions in
 * order to resubscribe on reconnect. Used to allow per-topic callbacks on top
 * of the Paho MQTT client's single message received callback.
 */
class AWSIotMqttTopic {
    /** Subscription topic. */
    private String topic;
    /** Quality of Service of subscription. */
    private AWSIotMqttQos qos;
    /** Callback of subscription. */
    private AWSIotMqttNewMessageCallback callback;

    /**
     * AWSIOTMQTTTopicModel constructor.
     *
     * @param topic MQTT topic of subscription.
     * @param qos Quality of Service of subscription.
     * @param callback Callback associated with this subscription.
     */
    public AWSIotMqttTopic(String topic, AWSIotMqttQos qos, AWSIotMqttNewMessageCallback callback) {
        this.topic = topic;
        this.qos = qos;
        this.callback = callback;
    }

    /**
     * Get subscription topic.
     * 
     * @return MQTT topic of subscription.
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Set subscription topic.
     * 
     * @param topic Desired MQTT subscription topic.
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * Get Quality of Service of subscription.
     * 
     * @return QoS of subscription.
     */
    public AWSIotMqttQos getQos() {
        return qos;
    }

    /**
     * Set Quality of Service of subscription.
     * 
     * @param qos Desired QoS of subscription.
     */
    public void setQos(AWSIotMqttQos qos) {
        this.qos = qos;
    }

    /**
     * Get the callback associated with this subscription.
     * 
     * @return The callback.
     */
    public AWSIotMqttNewMessageCallback getCallback() {
        return callback;
    }

    /**
     * Set the callback associated with this subscrition.
     * 
     * @param callback The callback.
     */
    public void setCallback(AWSIotMqttNewMessageCallback callback) {
        this.callback = callback;
    }
}
