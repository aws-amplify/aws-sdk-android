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
 * Describes a stale security group (a security group that contains stale
 * rules).
 * </p>
 */
public class StaleSecurityGroup implements Serializable {
    /**
     * <p>
     * The description of the security group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     */
    private java.util.List<StaleIpPermission> staleIpPermissions;

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     */
    private java.util.List<StaleIpPermission> staleIpPermissionsEgress;

    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The description of the security group.
     * </p>
     *
     * @return <p>
     *         The description of the security group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the security group.
     * </p>
     *
     * @param description <p>
     *            The description of the security group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleSecurityGroup withDescription(String description) {
        this.description = description;
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
    public StaleSecurityGroup withGroupId(String groupId) {
        this.groupId = groupId;
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
    public StaleSecurityGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     *
     * @return <p>
     *         Information about the stale inbound rules in the security group.
     *         </p>
     */
    public java.util.List<StaleIpPermission> getStaleIpPermissions() {
        return staleIpPermissions;
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     *
     * @param staleIpPermissions <p>
     *            Information about the stale inbound rules in the security
     *            group.
     *            </p>
     */
    public void setStaleIpPermissions(java.util.Collection<StaleIpPermission> staleIpPermissions) {
        if (staleIpPermissions == null) {
            this.staleIpPermissions = null;
            return;
        }

        this.staleIpPermissions = new java.util.ArrayList<StaleIpPermission>(staleIpPermissions);
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staleIpPermissions <p>
     *            Information about the stale inbound rules in the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleSecurityGroup withStaleIpPermissions(StaleIpPermission... staleIpPermissions) {
        if (getStaleIpPermissions() == null) {
            this.staleIpPermissions = new java.util.ArrayList<StaleIpPermission>(
                    staleIpPermissions.length);
        }
        for (StaleIpPermission value : staleIpPermissions) {
            this.staleIpPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staleIpPermissions <p>
     *            Information about the stale inbound rules in the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleSecurityGroup withStaleIpPermissions(
            java.util.Collection<StaleIpPermission> staleIpPermissions) {
        setStaleIpPermissions(staleIpPermissions);
        return this;
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     *
     * @return <p>
     *         Information about the stale outbound rules in the security group.
     *         </p>
     */
    public java.util.List<StaleIpPermission> getStaleIpPermissionsEgress() {
        return staleIpPermissionsEgress;
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     *
     * @param staleIpPermissionsEgress <p>
     *            Information about the stale outbound rules in the security
     *            group.
     *            </p>
     */
    public void setStaleIpPermissionsEgress(
            java.util.Collection<StaleIpPermission> staleIpPermissionsEgress) {
        if (staleIpPermissionsEgress == null) {
            this.staleIpPermissionsEgress = null;
            return;
        }

        this.staleIpPermissionsEgress = new java.util.ArrayList<StaleIpPermission>(
                staleIpPermissionsEgress);
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staleIpPermissionsEgress <p>
     *            Information about the stale outbound rules in the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleSecurityGroup withStaleIpPermissionsEgress(
            StaleIpPermission... staleIpPermissionsEgress) {
        if (getStaleIpPermissionsEgress() == null) {
            this.staleIpPermissionsEgress = new java.util.ArrayList<StaleIpPermission>(
                    staleIpPermissionsEgress.length);
        }
        for (StaleIpPermission value : staleIpPermissionsEgress) {
            this.staleIpPermissionsEgress.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staleIpPermissionsEgress <p>
     *            Information about the stale outbound rules in the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleSecurityGroup withStaleIpPermissionsEgress(
            java.util.Collection<StaleIpPermission> staleIpPermissionsEgress) {
        setStaleIpPermissionsEgress(staleIpPermissionsEgress);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC for the security group.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC for the security group.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC for the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleSecurityGroup withVpcId(String vpcId) {
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
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getStaleIpPermissions() != null)
            sb.append("StaleIpPermissions: " + getStaleIpPermissions() + ",");
        if (getStaleIpPermissionsEgress() != null)
            sb.append("StaleIpPermissionsEgress: " + getStaleIpPermissionsEgress() + ",");
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
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getStaleIpPermissions() == null) ? 0 : getStaleIpPermissions().hashCode());
        hashCode = prime
                * hashCode
                + ((getStaleIpPermissionsEgress() == null) ? 0 : getStaleIpPermissionsEgress()
                        .hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaleSecurityGroup == false)
            return false;
        StaleSecurityGroup other = (StaleSecurityGroup) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStaleIpPermissions() == null ^ this.getStaleIpPermissions() == null)
            return false;
        if (other.getStaleIpPermissions() != null
                && other.getStaleIpPermissions().equals(this.getStaleIpPermissions()) == false)
            return false;
        if (other.getStaleIpPermissionsEgress() == null
                ^ this.getStaleIpPermissionsEgress() == null)
            return false;
        if (other.getStaleIpPermissionsEgress() != null
                && other.getStaleIpPermissionsEgress().equals(this.getStaleIpPermissionsEgress()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
