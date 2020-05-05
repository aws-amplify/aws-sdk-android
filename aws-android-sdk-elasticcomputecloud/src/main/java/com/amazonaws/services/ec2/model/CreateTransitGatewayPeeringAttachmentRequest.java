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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Requests a transit gateway peering attachment between the specified transit
 * gateway (requester) and a peer transit gateway (accepter). The transit
 * gateways must be in different Regions. The peer transit gateway can be in
 * your account or a different AWS account.
 * </p>
 * <p>
 * After you create the peering attachment, the owner of the accepter transit
 * gateway must accept the attachment request.
 * </p>
 */
public class CreateTransitGatewayPeeringAttachmentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering
     * attachment.
     * </p>
     */
    private String peerTransitGatewayId;

    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     */
    private String peerAccountId;

    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     */
    private String peerRegion;

    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

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
    public CreateTransitGatewayPeeringAttachmentRequest withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering
     * attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the peer transit gateway with which to create the
     *         peering attachment.
     *         </p>
     */
    public String getPeerTransitGatewayId() {
        return peerTransitGatewayId;
    }

    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering
     * attachment.
     * </p>
     *
     * @param peerTransitGatewayId <p>
     *            The ID of the peer transit gateway with which to create the
     *            peering attachment.
     *            </p>
     */
    public void setPeerTransitGatewayId(String peerTransitGatewayId) {
        this.peerTransitGatewayId = peerTransitGatewayId;
    }

    /**
     * <p>
     * The ID of the peer transit gateway with which to create the peering
     * attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerTransitGatewayId <p>
     *            The ID of the peer transit gateway with which to create the
     *            peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayPeeringAttachmentRequest withPeerTransitGatewayId(
            String peerTransitGatewayId) {
        this.peerTransitGatewayId = peerTransitGatewayId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the owner of the peer transit gateway.
     *         </p>
     */
    public String getPeerAccountId() {
        return peerAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     *
     * @param peerAccountId <p>
     *            The AWS account ID of the owner of the peer transit gateway.
     *            </p>
     */
    public void setPeerAccountId(String peerAccountId) {
        this.peerAccountId = peerAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the peer transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerAccountId <p>
     *            The AWS account ID of the owner of the peer transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayPeeringAttachmentRequest withPeerAccountId(String peerAccountId) {
        this.peerAccountId = peerAccountId;
        return this;
    }

    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     *
     * @return <p>
     *         The Region where the peer transit gateway is located.
     *         </p>
     */
    public String getPeerRegion() {
        return peerRegion;
    }

    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     *
     * @param peerRegion <p>
     *            The Region where the peer transit gateway is located.
     *            </p>
     */
    public void setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
    }

    /**
     * <p>
     * The Region where the peer transit gateway is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peerRegion <p>
     *            The Region where the peer transit gateway is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayPeeringAttachmentRequest withPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the transit gateway peering attachment.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the transit gateway peering attachment.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayPeeringAttachmentRequest withTagSpecifications(
            TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayPeeringAttachmentRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayPeeringAttachmentRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getPeerTransitGatewayId() != null)
            sb.append("PeerTransitGatewayId: " + getPeerTransitGatewayId() + ",");
        if (getPeerAccountId() != null)
            sb.append("PeerAccountId: " + getPeerAccountId() + ",");
        if (getPeerRegion() != null)
            sb.append("PeerRegion: " + getPeerRegion() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getPeerTransitGatewayId() == null) ? 0 : getPeerTransitGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getPeerAccountId() == null) ? 0 : getPeerAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerRegion() == null) ? 0 : getPeerRegion().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayPeeringAttachmentRequest == false)
            return false;
        CreateTransitGatewayPeeringAttachmentRequest other = (CreateTransitGatewayPeeringAttachmentRequest) obj;

        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null
                && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getPeerTransitGatewayId() == null ^ this.getPeerTransitGatewayId() == null)
            return false;
        if (other.getPeerTransitGatewayId() != null
                && other.getPeerTransitGatewayId().equals(this.getPeerTransitGatewayId()) == false)
            return false;
        if (other.getPeerAccountId() == null ^ this.getPeerAccountId() == null)
            return false;
        if (other.getPeerAccountId() != null
                && other.getPeerAccountId().equals(this.getPeerAccountId()) == false)
            return false;
        if (other.getPeerRegion() == null ^ this.getPeerRegion() == null)
            return false;
        if (other.getPeerRegion() != null
                && other.getPeerRegion().equals(this.getPeerRegion()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
