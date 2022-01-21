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
 * Disassociates a set of queues from a routing profile.
 * </p>
 */
public class DisassociateRoutingProfileQueuesRequest extends AmazonWebServiceRequest implements
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
     * The identifier of the routing profile.
     * </p>
     */
    private String routingProfileId;

    /**
     * <p>
     * The queues to disassociate from this routing profile.
     * </p>
     */
    private java.util.List<RoutingProfileQueueReference> queueReferences;

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
    public DisassociateRoutingProfileQueuesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     *
     * @return <p>
     *         The identifier of the routing profile.
     *         </p>
     */
    public String getRoutingProfileId() {
        return routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile.
     *            </p>
     */
    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateRoutingProfileQueuesRequest withRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
        return this;
    }

    /**
     * <p>
     * The queues to disassociate from this routing profile.
     * </p>
     *
     * @return <p>
     *         The queues to disassociate from this routing profile.
     *         </p>
     */
    public java.util.List<RoutingProfileQueueReference> getQueueReferences() {
        return queueReferences;
    }

    /**
     * <p>
     * The queues to disassociate from this routing profile.
     * </p>
     *
     * @param queueReferences <p>
     *            The queues to disassociate from this routing profile.
     *            </p>
     */
    public void setQueueReferences(
            java.util.Collection<RoutingProfileQueueReference> queueReferences) {
        if (queueReferences == null) {
            this.queueReferences = null;
            return;
        }

        this.queueReferences = new java.util.ArrayList<RoutingProfileQueueReference>(
                queueReferences);
    }

    /**
     * <p>
     * The queues to disassociate from this routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueReferences <p>
     *            The queues to disassociate from this routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateRoutingProfileQueuesRequest withQueueReferences(
            RoutingProfileQueueReference... queueReferences) {
        if (getQueueReferences() == null) {
            this.queueReferences = new java.util.ArrayList<RoutingProfileQueueReference>(
                    queueReferences.length);
        }
        for (RoutingProfileQueueReference value : queueReferences) {
            this.queueReferences.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The queues to disassociate from this routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueReferences <p>
     *            The queues to disassociate from this routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateRoutingProfileQueuesRequest withQueueReferences(
            java.util.Collection<RoutingProfileQueueReference> queueReferences) {
        setQueueReferences(queueReferences);
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
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: " + getRoutingProfileId() + ",");
        if (getQueueReferences() != null)
            sb.append("QueueReferences: " + getQueueReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime * hashCode
                + ((getQueueReferences() == null) ? 0 : getQueueReferences().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateRoutingProfileQueuesRequest == false)
            return false;
        DisassociateRoutingProfileQueuesRequest other = (DisassociateRoutingProfileQueuesRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null
                && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        if (other.getQueueReferences() == null ^ this.getQueueReferences() == null)
            return false;
        if (other.getQueueReferences() != null
                && other.getQueueReferences().equals(this.getQueueReferences()) == false)
            return false;
        return true;
    }
}
