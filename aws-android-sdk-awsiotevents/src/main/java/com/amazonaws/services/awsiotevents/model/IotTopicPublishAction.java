/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information required to publish the MQTT message through the AWS IoT message
 * broker.
 * </p>
 */
public class IotTopicPublishAction implements Serializable {
    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that
     * includes variables (<code>$variable.&lt;variable-name&gt;</code>) and
     * input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * topic string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String mqttTopic;

    /**
     * <p>
     * You can configure the action payload when you publish a message to an AWS
     * IoT Core topic.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that
     * includes variables (<code>$variable.&lt;variable-name&gt;</code>) and
     * input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * topic string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The MQTT topic of the message. You can use a string expression
     *         that includes variables (
     *         <code>$variable.&lt;variable-name&gt;</code>) and input values (
     *         <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as
     *         the topic string.
     *         </p>
     */
    public String getMqttTopic() {
        return mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that
     * includes variables (<code>$variable.&lt;variable-name&gt;</code>) and
     * input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * topic string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param mqttTopic <p>
     *            The MQTT topic of the message. You can use a string expression
     *            that includes variables (
     *            <code>$variable.&lt;variable-name&gt;</code>) and input values
     *            (<code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>)
     *            as the topic string.
     *            </p>
     */
    public void setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic of the message. You can use a string expression that
     * includes variables (<code>$variable.&lt;variable-name&gt;</code>) and
     * input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * topic string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param mqttTopic <p>
     *            The MQTT topic of the message. You can use a string expression
     *            that includes variables (
     *            <code>$variable.&lt;variable-name&gt;</code>) and input values
     *            (<code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>)
     *            as the topic string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotTopicPublishAction withMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
        return this;
    }

    /**
     * <p>
     * You can configure the action payload when you publish a message to an AWS
     * IoT Core topic.
     * </p>
     *
     * @return <p>
     *         You can configure the action payload when you publish a message
     *         to an AWS IoT Core topic.
     *         </p>
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * <p>
     * You can configure the action payload when you publish a message to an AWS
     * IoT Core topic.
     * </p>
     *
     * @param payload <p>
     *            You can configure the action payload when you publish a
     *            message to an AWS IoT Core topic.
     *            </p>
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * You can configure the action payload when you publish a message to an AWS
     * IoT Core topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            You can configure the action payload when you publish a
     *            message to an AWS IoT Core topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotTopicPublishAction withPayload(Payload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMqttTopic() != null)
            sb.append("mqttTopic: " + getMqttTopic() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMqttTopic() == null) ? 0 : getMqttTopic().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotTopicPublishAction == false)
            return false;
        IotTopicPublishAction other = (IotTopicPublishAction) obj;

        if (other.getMqttTopic() == null ^ this.getMqttTopic() == null)
            return false;
        if (other.getMqttTopic() != null
                && other.getMqttTopic().equals(this.getMqttTopic()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
