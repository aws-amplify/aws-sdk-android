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
 * Describes a security group
 * </p>
 */
public class SecurityGroup implements Serializable {
    /**
     * <p>
     * A description of the security group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     */
    private java.util.List<IpPermission> ipPermissions;

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     */
    private java.util.List<IpPermission> ipPermissionsEgress;

    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * A description of the security group.
     * </p>
     *
     * @return <p>
     *         A description of the security group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     *
     * @param description <p>
     *            A description of the security group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     *
     * @return <p>
     *         The name of the security group.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     *
     * @param groupName <p>
     *            The name of the security group.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     *
     * @return <p>
     *         The inbound rules associated with the security group.
     *         </p>
     */
    public java.util.List<IpPermission> getIpPermissions() {
        return ipPermissions;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     *
     * @param ipPermissions <p>
     *            The inbound rules associated with the security group.
     *            </p>
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new java.util.ArrayList<IpPermission>(ipPermissions);
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissions <p>
     *            The inbound rules associated with the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withIpPermissions(IpPermission... ipPermissions) {
        if (getIpPermissions() == null) {
            this.ipPermissions = new java.util.ArrayList<IpPermission>(ipPermissions.length);
        }
        for (IpPermission value : ipPermissions) {
            this.ipPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissions <p>
     *            The inbound rules associated with the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the owner of the security group.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the owner of the security group.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the owner of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     *
     * @return <p>
     *         The ID of the security group.
     *         </p>
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     *
     * @param groupId <p>
     *            The ID of the security group.
     *            </p>
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupId <p>
     *            The ID of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     *
     * @return <p>
     *         [VPC only] The outbound rules associated with the security group.
     *         </p>
     */
    public java.util.List<IpPermission> getIpPermissionsEgress() {
        return ipPermissionsEgress;
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     *
     * @param ipPermissionsEgress <p>
     *            [VPC only] The outbound rules associated with the security
     *            group.
     *            </p>
     */
    public void setIpPermissionsEgress(java.util.Collection<IpPermission> ipPermissionsEgress) {
        if (ipPermissionsEgress == null) {
            this.ipPermissionsEgress = null;
            return;
        }

        this.ipPermissionsEgress = new java.util.ArrayList<IpPermission>(ipPermissionsEgress);
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissionsEgress <p>
     *            [VPC only] The outbound rules associated with the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withIpPermissionsEgress(IpPermission... ipPermissionsEgress) {
        if (getIpPermissionsEgress() == null) {
            this.ipPermissionsEgress = new java.util.ArrayList<IpPermission>(
                    ipPermissionsEgress.length);
        }
        for (IpPermission value : ipPermissionsEgress) {
            this.ipPermissionsEgress.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissionsEgress <p>
     *            [VPC only] The outbound rules associated with the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withIpPermissionsEgress(
            java.util.Collection<IpPermission> ipPermissionsEgress) {
        setIpPermissionsEgress(ipPermissionsEgress);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the security group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the security group.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the security group.
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
     * Any tags assigned to the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withTags(Tag... tags) {
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
     * Any tags assigned to the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     *
     * @return <p>
     *         [VPC only] The ID of the VPC for the security group.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     *
     * @param vpcId <p>
     *            [VPC only] The ID of the VPC for the security group.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            [VPC only] The ID of the VPC for the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: " + getIpPermissions() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getIpPermissionsEgress() != null)
            sb.append("IpPermissionsEgress: " + getIpPermissionsEgress() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getIpPermissionsEgress() == null) ? 0 : getIpPermissionsEgress().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroup == false)
            return false;
        SecurityGroup other = (SecurityGroup) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null
                && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getIpPermissionsEgress() == null ^ this.getIpPermissionsEgress() == null)
            return false;
        if (other.getIpPermissionsEgress() != null
                && other.getIpPermissionsEgress().equals(this.getIpPermissionsEgress()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
