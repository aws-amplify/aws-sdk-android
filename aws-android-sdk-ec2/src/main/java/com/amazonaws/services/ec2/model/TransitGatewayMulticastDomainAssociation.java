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
 * Describes the resources associated with the transit gateway multicast domain.
 * </p>
 */
public class TransitGatewayMulticastDomainAssociation implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway attachment.
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
     * The type of resource, for example a VPC attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     */
    private String resourceType;

    /**
     * <p>
     * The subnet associated with the transit gateway multicast domain.
     * </p>
     */
    private SubnetAssociation subnet;

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway attachment.
     *         </p>
     */
    public String getTransitGatewayAttachmentId() {
        return transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the transit gateway attachment.
     *            </p>
     */
    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the transit gateway attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDomainAssociation withTransitGatewayAttachmentId(
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
    public TransitGatewayMulticastDomainAssociation withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @return <p>
     *         The type of resource, for example a VPC attachment.
     *         </p>
     * @see TransitGatewayAttachmentResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The type of resource, for example a VPC attachment.
     *            </p>
     * @see TransitGatewayAttachmentResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The type of resource, for example a VPC attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentResourceType
     */
    public TransitGatewayMulticastDomainAssociation withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The type of resource, for example a VPC attachment.
     *            </p>
     * @see TransitGatewayAttachmentResourceType
     */
    public void setResourceType(TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, vpn, direct-connect-gateway, tgw-peering
     *
     * @param resourceType <p>
     *            The type of resource, for example a VPC attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayAttachmentResourceType
     */
    public TransitGatewayMulticastDomainAssociation withResourceType(
            TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The subnet associated with the transit gateway multicast domain.
     * </p>
     *
     * @return <p>
     *         The subnet associated with the transit gateway multicast domain.
     *         </p>
     */
    public SubnetAssociation getSubnet() {
        return subnet;
    }

    /**
     * <p>
     * The subnet associated with the transit gateway multicast domain.
     * </p>
     *
     * @param subnet <p>
     *            The subnet associated with the transit gateway multicast
     *            domain.
     *            </p>
     */
    public void setSubnet(SubnetAssociation subnet) {
        this.subnet = subnet;
    }

    /**
     * <p>
     * The subnet associated with the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnet <p>
     *            The subnet associated with the transit gateway multicast
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastDomainAssociation withSubnet(SubnetAssociation subnet) {
        this.subnet = subnet;
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
        if (getSubnet() != null)
            sb.append("Subnet: " + getSubnet());
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
        hashCode = prime * hashCode + ((getSubnet() == null) ? 0 : getSubnet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayMulticastDomainAssociation == false)
            return false;
        TransitGatewayMulticastDomainAssociation other = (TransitGatewayMulticastDomainAssociation) obj;

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
        if (other.getSubnet() == null ^ this.getSubnet() == null)
            return false;
        if (other.getSubnet() != null && other.getSubnet().equals(this.getSubnet()) == false)
            return false;
        return true;
    }
}
