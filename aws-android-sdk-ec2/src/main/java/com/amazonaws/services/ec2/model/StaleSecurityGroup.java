/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The ID of the security group.
     */
    private String groupId;

    /**
     * The name of the security group.
     */
    private String groupName;

    /**
     * The description of the security group.
     */
    private String description;

    /**
     * The ID of the VPC for the security group.
     */
    private String vpcId;

    /**
     * Information about the stale inbound rules in the security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission> staleIpPermissions;

    /**
     * Information about the stale outbound rules in the security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission> staleIpPermissionsEgress;

    /**
     * The ID of the security group.
     *
     * @return The ID of the security group.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * The ID of the security group.
     *
     * @param groupId The ID of the security group.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * The ID of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId The ID of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The name of the security group.
     *
     * @return The name of the security group.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the security group.
     *
     * @param groupName The name of the security group.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * The description of the security group.
     *
     * @return The description of the security group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the security group.
     *
     * @param description The description of the security group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The ID of the VPC for the security group.
     *
     * @return The ID of the VPC for the security group.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC for the security group.
     *
     * @param vpcId The ID of the VPC for the security group.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC for the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC for the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Information about the stale inbound rules in the security group.
     *
     * @return Information about the stale inbound rules in the security group.
     */
    public java.util.List<StaleIpPermission> getStaleIpPermissions() {
        if (staleIpPermissions == null) {
              staleIpPermissions = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission>();
              staleIpPermissions.setAutoConstruct(true);
        }
        return staleIpPermissions;
    }
    
    /**
     * Information about the stale inbound rules in the security group.
     *
     * @param staleIpPermissions Information about the stale inbound rules in the security group.
     */
    public void setStaleIpPermissions(java.util.Collection<StaleIpPermission> staleIpPermissions) {
        if (staleIpPermissions == null) {
            this.staleIpPermissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission> staleIpPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission>(staleIpPermissions.size());
        staleIpPermissionsCopy.addAll(staleIpPermissions);
        this.staleIpPermissions = staleIpPermissionsCopy;
    }
    
    /**
     * Information about the stale inbound rules in the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staleIpPermissions Information about the stale inbound rules in the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withStaleIpPermissions(StaleIpPermission... staleIpPermissions) {
        if (getStaleIpPermissions() == null) setStaleIpPermissions(new java.util.ArrayList<StaleIpPermission>(staleIpPermissions.length));
        for (StaleIpPermission value : staleIpPermissions) {
            getStaleIpPermissions().add(value);
        }
        return this;
    }
    
    /**
     * Information about the stale inbound rules in the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staleIpPermissions Information about the stale inbound rules in the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withStaleIpPermissions(java.util.Collection<StaleIpPermission> staleIpPermissions) {
        if (staleIpPermissions == null) {
            this.staleIpPermissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission> staleIpPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission>(staleIpPermissions.size());
            staleIpPermissionsCopy.addAll(staleIpPermissions);
            this.staleIpPermissions = staleIpPermissionsCopy;
        }

        return this;
    }

    /**
     * Information about the stale outbound rules in the security group.
     *
     * @return Information about the stale outbound rules in the security group.
     */
    public java.util.List<StaleIpPermission> getStaleIpPermissionsEgress() {
        if (staleIpPermissionsEgress == null) {
              staleIpPermissionsEgress = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission>();
              staleIpPermissionsEgress.setAutoConstruct(true);
        }
        return staleIpPermissionsEgress;
    }
    
    /**
     * Information about the stale outbound rules in the security group.
     *
     * @param staleIpPermissionsEgress Information about the stale outbound rules in the security group.
     */
    public void setStaleIpPermissionsEgress(java.util.Collection<StaleIpPermission> staleIpPermissionsEgress) {
        if (staleIpPermissionsEgress == null) {
            this.staleIpPermissionsEgress = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission> staleIpPermissionsEgressCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission>(staleIpPermissionsEgress.size());
        staleIpPermissionsEgressCopy.addAll(staleIpPermissionsEgress);
        this.staleIpPermissionsEgress = staleIpPermissionsEgressCopy;
    }
    
    /**
     * Information about the stale outbound rules in the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staleIpPermissionsEgress Information about the stale outbound rules in the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withStaleIpPermissionsEgress(StaleIpPermission... staleIpPermissionsEgress) {
        if (getStaleIpPermissionsEgress() == null) setStaleIpPermissionsEgress(new java.util.ArrayList<StaleIpPermission>(staleIpPermissionsEgress.length));
        for (StaleIpPermission value : staleIpPermissionsEgress) {
            getStaleIpPermissionsEgress().add(value);
        }
        return this;
    }
    
    /**
     * Information about the stale outbound rules in the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staleIpPermissionsEgress Information about the stale outbound rules in the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleSecurityGroup withStaleIpPermissionsEgress(java.util.Collection<StaleIpPermission> staleIpPermissionsEgress) {
        if (staleIpPermissionsEgress == null) {
            this.staleIpPermissionsEgress = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission> staleIpPermissionsEgressCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleIpPermission>(staleIpPermissionsEgress.size());
            staleIpPermissionsEgressCopy.addAll(staleIpPermissionsEgress);
            this.staleIpPermissionsEgress = staleIpPermissionsEgressCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() + ",");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getStaleIpPermissions() != null) sb.append("StaleIpPermissions: " + getStaleIpPermissions() + ",");
        if (getStaleIpPermissionsEgress() != null) sb.append("StaleIpPermissionsEgress: " + getStaleIpPermissionsEgress() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getStaleIpPermissions() == null) ? 0 : getStaleIpPermissions().hashCode()); 
        hashCode = prime * hashCode + ((getStaleIpPermissionsEgress() == null) ? 0 : getStaleIpPermissionsEgress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StaleSecurityGroup == false) return false;
        StaleSecurityGroup other = (StaleSecurityGroup)obj;
        
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getStaleIpPermissions() == null ^ this.getStaleIpPermissions() == null) return false;
        if (other.getStaleIpPermissions() != null && other.getStaleIpPermissions().equals(this.getStaleIpPermissions()) == false) return false; 
        if (other.getStaleIpPermissionsEgress() == null ^ this.getStaleIpPermissionsEgress() == null) return false;
        if (other.getStaleIpPermissionsEgress() != null && other.getStaleIpPermissionsEgress().equals(this.getStaleIpPermissionsEgress()) == false) return false; 
        return true;
    }
    
}
    