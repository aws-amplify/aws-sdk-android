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
 * Describes an association between a route table and a resource attachment.
 * </p>
 */
public class TransitGatewayRouteTableAssociation implements Serializable {
    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;

    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;

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
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     */
    private String state;

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
    public TransitGatewayRouteTableAssociation withTransitGatewayAttachmentId(
            String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
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
    public TransitGatewayRouteTableAssociation withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
    public TransitGatewayRouteTableAssociation withResourceType(String resourceType) {
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
    public TransitGatewayRouteTableAssociation withResourceType(
            TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @return <p>
     *         The state of the association.
     *         </p>
     * @see TransitGatewayAssociationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @see TransitGatewayAssociationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAssociationState
     */
    public TransitGatewayRouteTableAssociation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @see TransitGatewayAssociationState
     */
    public void setState(TransitGatewayAssociationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAssociationState
     */
    public TransitGatewayRouteTableAssociation withState(TransitGatewayAssociationState state) {
        this.state = state.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
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
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayRouteTableAssociation == false)
            return false;
        TransitGatewayRouteTableAssociation other = (TransitGatewayRouteTableAssociation) obj;

        if (other.getTransitGatewayAttachmentId() == null
                ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null
                && other.getTransitGatewayAttachmentId().equals(
                        this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
