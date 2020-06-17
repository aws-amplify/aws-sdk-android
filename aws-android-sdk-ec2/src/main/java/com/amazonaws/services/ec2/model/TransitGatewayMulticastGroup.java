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
 * Describes the transit gateway multicast group resources.
 * </p>
 */
public class TransitGatewayMulticastGroup implements Serializable {
    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     */
    private String groupIpAddress;

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

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
     * The ID of the transit gateway attachment.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     */
    private Boolean groupMember;

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     */
    private Boolean groupSource;

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     */
    private String memberType;

    /**
     * <p>
     * The source type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     */
    private String sourceType;

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the transit gateway multicast group.
     *         </p>
     */
    public String getGroupIpAddress() {
        return groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     *
     * @param groupIpAddress <p>
     *            The IP address assigned to the transit gateway multicast
     *            group.
     *            </p>
     */
    public void setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupIpAddress <p>
     *            The IP address assigned to the transit gateway multicast
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastGroup withGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }

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
    public TransitGatewayMulticastGroup withTransitGatewayAttachmentId(
            String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastGroup withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
    public TransitGatewayMulticastGroup withResourceId(String resourceId) {
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
    public TransitGatewayMulticastGroup withResourceType(String resourceType) {
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
    public TransitGatewayMulticastGroup withResourceType(
            TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway attachment.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the transit gateway attachment.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the transit gateway attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastGroup withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     *
     * @return <p>
     *         Indicates that the resource is a transit gateway multicast group
     *         member.
     *         </p>
     */
    public Boolean isGroupMember() {
        return groupMember;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     *
     * @return <p>
     *         Indicates that the resource is a transit gateway multicast group
     *         member.
     *         </p>
     */
    public Boolean getGroupMember() {
        return groupMember;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     *
     * @param groupMember <p>
     *            Indicates that the resource is a transit gateway multicast
     *            group member.
     *            </p>
     */
    public void setGroupMember(Boolean groupMember) {
        this.groupMember = groupMember;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupMember <p>
     *            Indicates that the resource is a transit gateway multicast
     *            group member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastGroup withGroupMember(Boolean groupMember) {
        this.groupMember = groupMember;
        return this;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     *
     * @return <p>
     *         Indicates that the resource is a transit gateway multicast group
     *         member.
     *         </p>
     */
    public Boolean isGroupSource() {
        return groupSource;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     *
     * @return <p>
     *         Indicates that the resource is a transit gateway multicast group
     *         member.
     *         </p>
     */
    public Boolean getGroupSource() {
        return groupSource;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     *
     * @param groupSource <p>
     *            Indicates that the resource is a transit gateway multicast
     *            group member.
     *            </p>
     */
    public void setGroupSource(Boolean groupSource) {
        this.groupSource = groupSource;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupSource <p>
     *            Indicates that the resource is a transit gateway multicast
     *            group member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastGroup withGroupSource(Boolean groupSource) {
        this.groupSource = groupSource;
        return this;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @return <p>
     *         The member type (for example, <code>static</code>).
     *         </p>
     * @see MembershipType
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param memberType <p>
     *            The member type (for example, <code>static</code>).
     *            </p>
     * @see MembershipType
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param memberType <p>
     *            The member type (for example, <code>static</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MembershipType
     */
    public TransitGatewayMulticastGroup withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param memberType <p>
     *            The member type (for example, <code>static</code>).
     *            </p>
     * @see MembershipType
     */
    public void setMemberType(MembershipType memberType) {
        this.memberType = memberType.toString();
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param memberType <p>
     *            The member type (for example, <code>static</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MembershipType
     */
    public TransitGatewayMulticastGroup withMemberType(MembershipType memberType) {
        this.memberType = memberType.toString();
        return this;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @return <p>
     *         The source type.
     *         </p>
     * @see MembershipType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param sourceType <p>
     *            The source type.
     *            </p>
     * @see MembershipType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param sourceType <p>
     *            The source type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MembershipType
     */
    public TransitGatewayMulticastGroup withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param sourceType <p>
     *            The source type.
     *            </p>
     * @see MembershipType
     */
    public void setSourceType(MembershipType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * The source type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, igmp
     *
     * @param sourceType <p>
     *            The source type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MembershipType
     */
    public TransitGatewayMulticastGroup withSourceType(MembershipType sourceType) {
        this.sourceType = sourceType.toString();
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
        if (getGroupIpAddress() != null)
            sb.append("GroupIpAddress: " + getGroupIpAddress() + ",");
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: " + getTransitGatewayAttachmentId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getGroupMember() != null)
            sb.append("GroupMember: " + getGroupMember() + ",");
        if (getGroupSource() != null)
            sb.append("GroupSource: " + getGroupSource() + ",");
        if (getMemberType() != null)
            sb.append("MemberType: " + getMemberType() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGroupIpAddress() == null) ? 0 : getGroupIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId()
                        .hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getGroupMember() == null) ? 0 : getGroupMember().hashCode());
        hashCode = prime * hashCode
                + ((getGroupSource() == null) ? 0 : getGroupSource().hashCode());
        hashCode = prime * hashCode + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayMulticastGroup == false)
            return false;
        TransitGatewayMulticastGroup other = (TransitGatewayMulticastGroup) obj;

        if (other.getGroupIpAddress() == null ^ this.getGroupIpAddress() == null)
            return false;
        if (other.getGroupIpAddress() != null
                && other.getGroupIpAddress().equals(this.getGroupIpAddress()) == false)
            return false;
        if (other.getTransitGatewayAttachmentId() == null
                ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null
                && other.getTransitGatewayAttachmentId().equals(
                        this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
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
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getGroupMember() == null ^ this.getGroupMember() == null)
            return false;
        if (other.getGroupMember() != null
                && other.getGroupMember().equals(this.getGroupMember()) == false)
            return false;
        if (other.getGroupSource() == null ^ this.getGroupSource() == null)
            return false;
        if (other.getGroupSource() != null
                && other.getGroupSource().equals(this.getGroupSource()) == false)
            return false;
        if (other.getMemberType() == null ^ this.getMemberType() == null)
            return false;
        if (other.getMemberType() != null
                && other.getMemberType().equals(this.getMemberType()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }
}
