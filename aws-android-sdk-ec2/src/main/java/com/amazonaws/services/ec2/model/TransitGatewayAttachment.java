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
 * Describes an attachment between a resource and a transit gateway.
 * </p>
 */
public class TransitGatewayAttachment implements Serializable {
    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway.
     * </p>
     */
    private String transitGatewayOwnerId;

    /**
     * <p>
     * The ID of the AWS account that owns the resource.
     * </p>
     */
    private String resourceOwnerId;

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     */
    private String resourceType;

    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The attachment state.
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
     * The association.
     * </p>
     */
    private TransitGatewayAttachmentAssociation association;

    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The tags for the attachment.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the attachment.
     *         </p>
     */
    public String getTransitGatewayAttachmentId() {
        return transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the attachment.
     *            </p>
     */
    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway.
     *         </p>
     */
    public String getTransitGatewayId() {
        return transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     */
    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the transit gateway.
     *         </p>
     */
    public String getTransitGatewayOwnerId() {
        return transitGatewayOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway.
     * </p>
     *
     * @param transitGatewayOwnerId <p>
     *            The ID of the AWS account that owns the transit gateway.
     *            </p>
     */
    public void setTransitGatewayOwnerId(String transitGatewayOwnerId) {
        this.transitGatewayOwnerId = transitGatewayOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayOwnerId <p>
     *            The ID of the AWS account that owns the transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withTransitGatewayOwnerId(String transitGatewayOwnerId) {
        this.transitGatewayOwnerId = transitGatewayOwnerId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the resource.
     *         </p>
     */
    public String getResourceOwnerId() {
        return resourceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource.
     * </p>
     *
     * @param resourceOwnerId <p>
     *            The ID of the AWS account that owns the resource.
     *            </p>
     */
    public void setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceOwnerId <p>
     *            The ID of the AWS account that owns the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @return <p>
     *         The resource type.
     *         </p>
     * @see TransitGatewayAttachmentResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @see TransitGatewayAttachmentResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentResourceType
     */
    public TransitGatewayAttachment withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @see TransitGatewayAttachmentResourceType
     */
    public void setResourceType(TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentResourceType
     */
    public TransitGatewayAttachment withResourceType(
            TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     *
     * @return <p>
     *         The ID of the resource.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     *
     * @param resourceId <p>
     *            The ID of the resource.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The ID of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @return <p>
     *         The attachment state.
     *         </p>
     * @see TransitGatewayAttachmentState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @param state <p>
     *            The attachment state.
     *            </p>
     * @see TransitGatewayAttachmentState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The attachment state.
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
     *            The attachment state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentState
     */
    public TransitGatewayAttachment withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>initiating, pendingAcceptance, rollingBack,
     * pending, available, modifying, deleting, deleted, failed, rejected,
     * rejecting, failing
     *
     * @param state <p>
     *            The attachment state.
     *            </p>
     * @see TransitGatewayAttachmentState
     */
    public void setState(TransitGatewayAttachmentState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The attachment state.
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
     *            The attachment state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentState
     */
    public TransitGatewayAttachment withState(TransitGatewayAttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The association.
     * </p>
     *
     * @return <p>
     *         The association.
     *         </p>
     */
    public TransitGatewayAttachmentAssociation getAssociation() {
        return association;
    }

    /**
     * <p>
     * The association.
     * </p>
     *
     * @param association <p>
     *            The association.
     *            </p>
     */
    public void setAssociation(TransitGatewayAttachmentAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * The association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param association <p>
     *            The association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withAssociation(TransitGatewayAttachmentAssociation association) {
        this.association = association;
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @return <p>
     *         The creation time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The tags for the attachment.
     * </p>
     *
     * @return <p>
     *         The tags for the attachment.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the attachment.
     * </p>
     *
     * @param tags <p>
     *            The tags for the attachment.
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
     * The tags for the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withTags(Tag... tags) {
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
     * The tags for the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachment withTags(java.util.Collection<Tag> tags) {
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
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getTransitGatewayOwnerId() != null)
            sb.append("TransitGatewayOwnerId: " + getTransitGatewayOwnerId() + ",");
        if (getResourceOwnerId() != null)
            sb.append("ResourceOwnerId: " + getResourceOwnerId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getAssociation() != null)
            sb.append("Association: " + getAssociation() + ",");
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
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransitGatewayOwnerId() == null) ? 0 : getTransitGatewayOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwnerId() == null) ? 0 : getResourceOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
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

        if (obj instanceof TransitGatewayAttachment == false)
            return false;
        TransitGatewayAttachment other = (TransitGatewayAttachment) obj;

        if (other.getTransitGatewayAttachmentId() == null
                ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null
                && other.getTransitGatewayAttachmentId().equals(
                        this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null
                && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getTransitGatewayOwnerId() == null ^ this.getTransitGatewayOwnerId() == null)
            return false;
        if (other.getTransitGatewayOwnerId() != null
                && other.getTransitGatewayOwnerId().equals(this.getTransitGatewayOwnerId()) == false)
            return false;
        if (other.getResourceOwnerId() == null ^ this.getResourceOwnerId() == null)
            return false;
        if (other.getResourceOwnerId() != null
                && other.getResourceOwnerId().equals(this.getResourceOwnerId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null
                && other.getAssociation().equals(this.getAssociation()) == false)
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
