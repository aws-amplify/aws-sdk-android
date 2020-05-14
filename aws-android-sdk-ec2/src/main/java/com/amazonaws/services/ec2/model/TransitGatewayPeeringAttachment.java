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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the transit gateway peering attachment.
 * </p>
 */
public class TransitGatewayPeeringAttachment implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;

    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     */
    private PeeringTgwInfo requesterTgwInfo;

    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     */
    private PeeringTgwInfo accepterTgwInfo;

    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     */
    private PeeringAttachmentStatus status;

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     */
    private String state;

    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway peering attachment.
     *         </p>
     */
    public String getTransitGatewayAttachmentId() {
        return transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the transit gateway peering attachment.
     *            </p>
     */
    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayPeeringAttachment withTransitGatewayAttachmentId(
            String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        return this;
    }

    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     *
     * @return <p>
     *         Information about the requester transit gateway.
     *         </p>
     */
    public PeeringTgwInfo getRequesterTgwInfo() {
        return requesterTgwInfo;
    }

    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     *
     * @param requesterTgwInfo <p>
     *            Information about the requester transit gateway.
     *            </p>
     */
    public void setRequesterTgwInfo(PeeringTgwInfo requesterTgwInfo) {
        this.requesterTgwInfo = requesterTgwInfo;
    }

    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterTgwInfo <p>
     *            Information about the requester transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayPeeringAttachment withRequesterTgwInfo(PeeringTgwInfo requesterTgwInfo) {
        this.requesterTgwInfo = requesterTgwInfo;
        return this;
    }

    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     *
     * @return <p>
     *         Information about the accepter transit gateway.
     *         </p>
     */
    public PeeringTgwInfo getAccepterTgwInfo() {
        return accepterTgwInfo;
    }

    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     *
     * @param accepterTgwInfo <p>
     *            Information about the accepter transit gateway.
     *            </p>
     */
    public void setAccepterTgwInfo(PeeringTgwInfo accepterTgwInfo) {
        this.accepterTgwInfo = accepterTgwInfo;
    }

    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accepterTgwInfo <p>
     *            Information about the accepter transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayPeeringAttachment withAccepterTgwInfo(PeeringTgwInfo accepterTgwInfo) {
        this.accepterTgwInfo = accepterTgwInfo;
        return this;
    }

    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     *
     * @return <p>
     *         The status of the transit gateway peering attachment.
     *         </p>
     */
    public PeeringAttachmentStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     *
     * @param status <p>
     *            The status of the transit gateway peering attachment.
     *            </p>
     */
    public void setStatus(PeeringAttachmentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayPeeringAttachment withStatus(PeeringAttachmentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @return <p>
     *         The state of the transit gateway peering attachment.
     *         </p>
     * @see TransitGatewayAttachmentState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @param state <p>
     *            The state of the transit gateway peering attachment.
     *            </p>
     * @see TransitGatewayAttachmentState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @param state <p>
     *            The state of the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentState
     */
    public TransitGatewayPeeringAttachment withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @param state <p>
     *            The state of the transit gateway peering attachment.
     *            </p>
     * @see TransitGatewayAttachmentState
     */
    public void setState(TransitGatewayAttachmentState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @param state <p>
     *            The state of the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentState
     */
    public TransitGatewayPeeringAttachment withState(TransitGatewayAttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     *
     * @return <p>
     *         The time the transit gateway peering attachment was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time the transit gateway peering attachment was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time the transit gateway peering attachment was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayPeeringAttachment withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     *
     * @return <p>
     *         The tags for the transit gateway peering attachment.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     *
     * @param tags <p>
     *            The tags for the transit gateway peering attachment.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayPeeringAttachment withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayPeeringAttachment withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: " + getTransitGatewayAttachmentId() + ",");
        if (getRequesterTgwInfo() != null)
            sb.append("RequesterTgwInfo: " + getRequesterTgwInfo() + ",");
        if (getAccepterTgwInfo() != null)
            sb.append("AccepterTgwInfo: " + getAccepterTgwInfo() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRequesterTgwInfo() == null) ? 0 : getRequesterTgwInfo().hashCode());
        hashCode = prime * hashCode
                + ((getAccepterTgwInfo() == null) ? 0 : getAccepterTgwInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPeeringAttachment == false)
            return false;
        TransitGatewayPeeringAttachment other = (TransitGatewayPeeringAttachment) obj;

        if (other.getTransitGatewayAttachmentId() == null
                ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null
                && other.getTransitGatewayAttachmentId().equals(
                        this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getRequesterTgwInfo() == null ^ this.getRequesterTgwInfo() == null)
            return false;
        if (other.getRequesterTgwInfo() != null
                && other.getRequesterTgwInfo().equals(this.getRequesterTgwInfo()) == false)
            return false;
        if (other.getAccepterTgwInfo() == null ^ this.getAccepterTgwInfo() == null)
            return false;
        if (other.getAccepterTgwInfo() != null
                && other.getAccepterTgwInfo().equals(this.getAccepterTgwInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
