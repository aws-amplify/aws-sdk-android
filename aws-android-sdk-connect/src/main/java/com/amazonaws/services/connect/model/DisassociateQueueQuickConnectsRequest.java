/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Disassociates a set of quick connects from a queue.
 * </p>
 */
public class DisassociateQueueQuickConnectsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * The quick connects to disassociate from the queue.
     * </p>
     */
    private java.util.List<String> quickConnectIds;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateQueueQuickConnectsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @return <p>
     *         The identifier for the queue.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateQueueQuickConnectsRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * <p>
     * The quick connects to disassociate from the queue.
     * </p>
     *
     * @return <p>
     *         The quick connects to disassociate from the queue.
     *         </p>
     */
    public java.util.List<String> getQuickConnectIds() {
        return quickConnectIds;
    }

    /**
     * <p>
     * The quick connects to disassociate from the queue.
     * </p>
     *
     * @param quickConnectIds <p>
     *            The quick connects to disassociate from the queue.
     *            </p>
     */
    public void setQuickConnectIds(java.util.Collection<String> quickConnectIds) {
        if (quickConnectIds == null) {
            this.quickConnectIds = null;
            return;
        }

        this.quickConnectIds = new java.util.ArrayList<String>(quickConnectIds);
    }

    /**
     * <p>
     * The quick connects to disassociate from the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectIds <p>
     *            The quick connects to disassociate from the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateQueueQuickConnectsRequest withQuickConnectIds(String... quickConnectIds) {
        if (getQuickConnectIds() == null) {
            this.quickConnectIds = new java.util.ArrayList<String>(quickConnectIds.length);
        }
        for (String value : quickConnectIds) {
            this.quickConnectIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The quick connects to disassociate from the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectIds <p>
     *            The quick connects to disassociate from the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateQueueQuickConnectsRequest withQuickConnectIds(
            java.util.Collection<String> quickConnectIds) {
        setQuickConnectIds(quickConnectIds);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getQueueId() != null)
            sb.append("QueueId: " + getQueueId() + ",");
        if (getQuickConnectIds() != null)
            sb.append("QuickConnectIds: " + getQuickConnectIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode
                + ((getQuickConnectIds() == null) ? 0 : getQuickConnectIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateQueueQuickConnectsRequest == false)
            return false;
        DisassociateQueueQuickConnectsRequest other = (DisassociateQueueQuickConnectsRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getQuickConnectIds() == null ^ this.getQuickConnectIds() == null)
            return false;
        if (other.getQuickConnectIds() != null
                && other.getQuickConnectIds().equals(this.getQuickConnectIds()) == false)
            return false;
        return true;
    }
}
