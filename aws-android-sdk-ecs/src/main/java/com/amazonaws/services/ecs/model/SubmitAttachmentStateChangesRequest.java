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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This action is only used by the Amazon ECS agent, and it is not intended for
 * use outside of the agent.
 * </p>
 * </note>
 * <p>
 * Sent to acknowledge that an attachment changed states.
 * </p>
 */
public class SubmitAttachmentStateChangesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container
     * instance the attachment belongs to.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     */
    private java.util.List<AttachmentStateChange> attachments;

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container
     * instance the attachment belongs to.
     * </p>
     *
     * @return <p>
     *         The short name or full ARN of the cluster that hosts the
     *         container instance the attachment belongs to.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container
     * instance the attachment belongs to.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full ARN of the cluster that hosts the
     *            container instance the attachment belongs to.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container
     * instance the attachment belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full ARN of the cluster that hosts the
     *            container instance the attachment belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitAttachmentStateChangesRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     *
     * @return <p>
     *         Any attachments associated with the state change request.
     *         </p>
     */
    public java.util.List<AttachmentStateChange> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     *
     * @param attachments <p>
     *            Any attachments associated with the state change request.
     *            </p>
     */
    public void setAttachments(java.util.Collection<AttachmentStateChange> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AttachmentStateChange>(attachments);
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Any attachments associated with the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitAttachmentStateChangesRequest withAttachments(AttachmentStateChange... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<AttachmentStateChange>(attachments.length);
        }
        for (AttachmentStateChange value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            Any attachments associated with the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitAttachmentStateChangesRequest withAttachments(
            java.util.Collection<AttachmentStateChange> attachments) {
        setAttachments(attachments);
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getAttachments() != null)
            sb.append("attachments: " + getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitAttachmentStateChangesRequest == false)
            return false;
        SubmitAttachmentStateChangesRequest other = (SubmitAttachmentStateChangesRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }
}
