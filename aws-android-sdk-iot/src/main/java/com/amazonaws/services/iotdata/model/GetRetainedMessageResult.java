/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The output from the GetRetainedMessage operation.
 * </p>
 */
public class GetRetainedMessageResult implements Serializable {
    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Integer qos;

    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was
     * stored by IoT.
     * </p>
     */
    private Long lastModifiedTime;

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     *
     * @return <p>
     *         The topic name to which the retained message was published.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     *
     * @param topic <p>
     *            The topic name to which the retained message was published.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic name to which the retained message was published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            The topic name to which the retained message was published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRetainedMessageResult withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
     * </p>
     *
     * @return <p>
     *         The Base64-encoded message payload of the retained message body.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
     * </p>
     *
     * @param payload <p>
     *            The Base64-encoded message payload of the retained message
     *            body.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The Base64-encoded message payload of the retained message body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            The Base64-encoded message payload of the retained message
     *            body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRetainedMessageResult withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
        return this;
    }

    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The quality of service (QoS) level used to publish the retained
     *         message.
     *         </p>
     */
    public Integer getQos() {
        return qos;
    }

    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param qos <p>
     *            The quality of service (QoS) level used to publish the
     *            retained message.
     *            </p>
     */
    public void setQos(Integer qos) {
        this.qos = qos;
    }

    /**
     * <p>
     * The quality of service (QoS) level used to publish the retained message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param qos <p>
     *            The quality of service (QoS) level used to publish the
     *            retained message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRetainedMessageResult withQos(Integer qos) {
        this.qos = qos;
        return this;
    }

    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was
     * stored by IoT.
     * </p>
     *
     * @return <p>
     *         The Epoch date and time, in milliseconds, when the retained
     *         message was stored by IoT.
     *         </p>
     */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was
     * stored by IoT.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The Epoch date and time, in milliseconds, when the retained
     *            message was stored by IoT.
     *            </p>
     */
    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The Epoch date and time, in milliseconds, when the retained message was
     * stored by IoT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The Epoch date and time, in milliseconds, when the retained
     *            message was stored by IoT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRetainedMessageResult withLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        if (getPayload() != null)
            sb.append("payload: " + getPayload() + ",");
        if (getQos() != null)
            sb.append("qos: " + getQos() + ",");
        if (getLastModifiedTime() != null)
            sb.append("lastModifiedTime: " + getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getQos() == null) ? 0 : getQos().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRetainedMessageResult == false)
            return false;
        GetRetainedMessageResult other = (GetRetainedMessageResult) obj;

        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getQos() == null ^ this.getQos() == null)
            return false;
        if (other.getQos() != null && other.getQos().equals(this.getQos()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }
}
