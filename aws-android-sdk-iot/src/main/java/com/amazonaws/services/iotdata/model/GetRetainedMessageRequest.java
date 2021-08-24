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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the details of a single retained message for the specified topic.
 * </p>
 * <p>
 * This action returns the message payload of the retained message, which can
 * incur messaging costs. To list only the topic names of the retained messages,
 * call <a
 * href="/iot/latest/developerguide/API_iotdata_ListRetainedMessages.html"
 * >ListRetainedMessages</a>.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
 * >GetRetainedMessage</a> action.
 * </p>
 * <p>
 * For more information about messaging costs, see <a
 * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing -
 * Messaging</a>.
 * </p>
 */
public class GetRetainedMessageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     *
     * @return <p>
     *         The topic name of the retained message to retrieve.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     *
     * @param topic <p>
     *            The topic name of the retained message to retrieve.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            The topic name of the retained message to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRetainedMessageRequest withTopic(String topic) {
        this.topic = topic;
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
            sb.append("topic: " + getTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRetainedMessageRequest == false)
            return false;
        GetRetainedMessageRequest other = (GetRetainedMessageRequest) obj;

        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        return true;
    }
}
