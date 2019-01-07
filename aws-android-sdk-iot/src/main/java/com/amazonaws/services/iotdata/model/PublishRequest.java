/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iotdata.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Publishes state information.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html#http"
 * >HTTP Protocol</a> in the <i>AWS IoT Developer Guide</i>.
 * </p>
 */
public class PublishRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Integer qos;

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     *
     * @return <p>
     *         The name of the MQTT topic.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     *
     * @param topic <p>
     *            The name of the MQTT topic.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The name of the MQTT topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            The name of the MQTT topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The Quality of Service (QoS) level.
     *         </p>
     */
    public Integer getQos() {
        return qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param qos <p>
     *            The Quality of Service (QoS) level.
     *            </p>
     */
    public void setQos(Integer qos) {
        this.qos = qos;
    }

    /**
     * <p>
     * The Quality of Service (QoS) level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param qos <p>
     *            The Quality of Service (QoS) level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withQos(Integer qos) {
        this.qos = qos;
        return this;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     *
     * @return <p>
     *         The state information, in JSON format.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     *
     * @param payload <p>
     *            The state information, in JSON format.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            The state information, in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withPayload(java.nio.ByteBuffer payload) {
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
        if (getTopic() != null)
            sb.append("topic: " + getTopic() + ",");
        if (getQos() != null)
            sb.append("qos: " + getQos() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getQos() == null) ? 0 : getQos().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishRequest == false)
            return false;
        PublishRequest other = (PublishRequest) obj;

        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getQos() == null ^ this.getQos() == null)
            return false;
        if (other.getQos() != null && other.getQos().equals(this.getQos()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
