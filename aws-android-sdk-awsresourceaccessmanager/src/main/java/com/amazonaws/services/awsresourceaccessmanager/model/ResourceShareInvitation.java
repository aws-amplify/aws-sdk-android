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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an invitation to join a resource share.
 * </p>
 */
public class ResourceShareInvitation implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     */
    private String resourceShareInvitationArn;

    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String resourceShareName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     */
    private String senderAccountId;

    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     */
    private String receiverAccountId;

    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     */
    private java.util.Date invitationTimestamp;

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACCEPTED, REJECTED, EXPIRED
     */
    private String status;

    /**
     * <p>
     * To view the resources associated with a pending resource share
     * invitation, use <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     * > ListPendingInvitationResources</a>.
     * </p>
     */
    private java.util.List<ResourceShareAssociation> resourceShareAssociations;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the invitation.
     *         </p>
     */
    public String getResourceShareInvitationArn() {
        return resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     *
     * @param resourceShareInvitationArn <p>
     *            The Amazon Resource Name (ARN) of the invitation.
     *            </p>
     */
    public void setResourceShareInvitationArn(String resourceShareInvitationArn) {
        this.resourceShareInvitationArn = resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareInvitationArn <p>
     *            The Amazon Resource Name (ARN) of the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withResourceShareInvitationArn(String resourceShareInvitationArn) {
        this.resourceShareInvitationArn = resourceShareInvitationArn;
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @return <p>
     *         The name of the resource share.
     *         </p>
     */
    public String getResourceShareName() {
        return resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @param resourceShareName <p>
     *            The name of the resource share.
     *            </p>
     */
    public void setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareName <p>
     *            The name of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource share.
     *         </p>
     */
    public String getResourceShareArn() {
        return resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     */
    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that sent the invitation.
     *         </p>
     */
    public String getSenderAccountId() {
        return senderAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     *
     * @param senderAccountId <p>
     *            The ID of the AWS account that sent the invitation.
     *            </p>
     */
    public void setSenderAccountId(String senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderAccountId <p>
     *            The ID of the AWS account that sent the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withSenderAccountId(String senderAccountId) {
        this.senderAccountId = senderAccountId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that received the invitation.
     *         </p>
     */
    public String getReceiverAccountId() {
        return receiverAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     *
     * @param receiverAccountId <p>
     *            The ID of the AWS account that received the invitation.
     *            </p>
     */
    public void setReceiverAccountId(String receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receiverAccountId <p>
     *            The ID of the AWS account that received the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withReceiverAccountId(String receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
        return this;
    }

    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     *
     * @return <p>
     *         The date and time when the invitation was sent.
     *         </p>
     */
    public java.util.Date getInvitationTimestamp() {
        return invitationTimestamp;
    }

    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     *
     * @param invitationTimestamp <p>
     *            The date and time when the invitation was sent.
     *            </p>
     */
    public void setInvitationTimestamp(java.util.Date invitationTimestamp) {
        this.invitationTimestamp = invitationTimestamp;
    }

    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitationTimestamp <p>
     *            The date and time when the invitation was sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withInvitationTimestamp(java.util.Date invitationTimestamp) {
        this.invitationTimestamp = invitationTimestamp;
        return this;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACCEPTED, REJECTED, EXPIRED
     *
     * @return <p>
     *         The status of the invitation.
     *         </p>
     * @see ResourceShareInvitationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACCEPTED, REJECTED, EXPIRED
     *
     * @param status <p>
     *            The status of the invitation.
     *            </p>
     * @see ResourceShareInvitationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACCEPTED, REJECTED, EXPIRED
     *
     * @param status <p>
     *            The status of the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareInvitationStatus
     */
    public ResourceShareInvitation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACCEPTED, REJECTED, EXPIRED
     *
     * @param status <p>
     *            The status of the invitation.
     *            </p>
     * @see ResourceShareInvitationStatus
     */
    public void setStatus(ResourceShareInvitationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACCEPTED, REJECTED, EXPIRED
     *
     * @param status <p>
     *            The status of the invitation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareInvitationStatus
     */
    public ResourceShareInvitation withStatus(ResourceShareInvitationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * To view the resources associated with a pending resource share
     * invitation, use <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     * > ListPendingInvitationResources</a>.
     * </p>
     *
     * @return <p>
     *         To view the resources associated with a pending resource share
     *         invitation, use <a href=
     *         "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     *         > ListPendingInvitationResources</a>.
     *         </p>
     */
    public java.util.List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    /**
     * <p>
     * To view the resources associated with a pending resource share
     * invitation, use <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     * > ListPendingInvitationResources</a>.
     * </p>
     *
     * @param resourceShareAssociations <p>
     *            To view the resources associated with a pending resource share
     *            invitation, use <a href=
     *            "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     *            > ListPendingInvitationResources</a>.
     *            </p>
     */
    public void setResourceShareAssociations(
            java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        if (resourceShareAssociations == null) {
            this.resourceShareAssociations = null;
            return;
        }

        this.resourceShareAssociations = new java.util.ArrayList<ResourceShareAssociation>(
                resourceShareAssociations);
    }

    /**
     * <p>
     * To view the resources associated with a pending resource share
     * invitation, use <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     * > ListPendingInvitationResources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareAssociations <p>
     *            To view the resources associated with a pending resource share
     *            invitation, use <a href=
     *            "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     *            > ListPendingInvitationResources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withResourceShareAssociations(
            ResourceShareAssociation... resourceShareAssociations) {
        if (getResourceShareAssociations() == null) {
            this.resourceShareAssociations = new java.util.ArrayList<ResourceShareAssociation>(
                    resourceShareAssociations.length);
        }
        for (ResourceShareAssociation value : resourceShareAssociations) {
            this.resourceShareAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * To view the resources associated with a pending resource share
     * invitation, use <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     * > ListPendingInvitationResources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareAssociations <p>
     *            To view the resources associated with a pending resource share
     *            invitation, use <a href=
     *            "https://docs.aws.amazon.com/ram/latest/APIReference/API_ListPendingInvitationResources.html"
     *            > ListPendingInvitationResources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareInvitation withResourceShareAssociations(
            java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        setResourceShareAssociations(resourceShareAssociations);
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
        if (getResourceShareInvitationArn() != null)
            sb.append("resourceShareInvitationArn: " + getResourceShareInvitationArn() + ",");
        if (getResourceShareName() != null)
            sb.append("resourceShareName: " + getResourceShareName() + ",");
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn() + ",");
        if (getSenderAccountId() != null)
            sb.append("senderAccountId: " + getSenderAccountId() + ",");
        if (getReceiverAccountId() != null)
            sb.append("receiverAccountId: " + getReceiverAccountId() + ",");
        if (getInvitationTimestamp() != null)
            sb.append("invitationTimestamp: " + getInvitationTimestamp() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getResourceShareAssociations() != null)
            sb.append("resourceShareAssociations: " + getResourceShareAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceShareInvitationArn() == null) ? 0 : getResourceShareInvitationArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareName() == null) ? 0 : getResourceShareName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode
                + ((getSenderAccountId() == null) ? 0 : getSenderAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getReceiverAccountId() == null) ? 0 : getReceiverAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getInvitationTimestamp() == null) ? 0 : getInvitationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceShareAssociations() == null) ? 0 : getResourceShareAssociations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceShareInvitation == false)
            return false;
        ResourceShareInvitation other = (ResourceShareInvitation) obj;

        if (other.getResourceShareInvitationArn() == null
                ^ this.getResourceShareInvitationArn() == null)
            return false;
        if (other.getResourceShareInvitationArn() != null
                && other.getResourceShareInvitationArn().equals(
                        this.getResourceShareInvitationArn()) == false)
            return false;
        if (other.getResourceShareName() == null ^ this.getResourceShareName() == null)
            return false;
        if (other.getResourceShareName() != null
                && other.getResourceShareName().equals(this.getResourceShareName()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getSenderAccountId() == null ^ this.getSenderAccountId() == null)
            return false;
        if (other.getSenderAccountId() != null
                && other.getSenderAccountId().equals(this.getSenderAccountId()) == false)
            return false;
        if (other.getReceiverAccountId() == null ^ this.getReceiverAccountId() == null)
            return false;
        if (other.getReceiverAccountId() != null
                && other.getReceiverAccountId().equals(this.getReceiverAccountId()) == false)
            return false;
        if (other.getInvitationTimestamp() == null ^ this.getInvitationTimestamp() == null)
            return false;
        if (other.getInvitationTimestamp() != null
                && other.getInvitationTimestamp().equals(this.getInvitationTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResourceShareAssociations() == null
                ^ this.getResourceShareAssociations() == null)
            return false;
        if (other.getResourceShareAssociations() != null
                && other.getResourceShareAssociations().equals(this.getResourceShareAssociations()) == false)
            return false;
        return true;
    }
}
