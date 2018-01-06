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
 * Describes a VPC with a security group that references your security
 * group.
 * </p>
 */
public class SecurityGroupReference implements Serializable {

    /**
     * The ID of your security group.
     */
    private String groupId;

    /**
     * The ID of the VPC with the referencing security group.
     */
    private String referencingVpcId;

    /**
     * The ID of the VPC peering connection.
     */
    private String vpcPeeringConnectionId;

    /**
     * The ID of your security group.
     *
     * @return The ID of your security group.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * The ID of your security group.
     *
     * @param groupId The ID of your security group.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * The ID of your security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId The ID of your security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SecurityGroupReference withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The ID of the VPC with the referencing security group.
     *
     * @return The ID of the VPC with the referencing security group.
     */
    public String getReferencingVpcId() {
        return referencingVpcId;
    }
    
    /**
     * The ID of the VPC with the referencing security group.
     *
     * @param referencingVpcId The ID of the VPC with the referencing security group.
     */
    public void setReferencingVpcId(String referencingVpcId) {
        this.referencingVpcId = referencingVpcId;
    }
    
    /**
     * The ID of the VPC with the referencing security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param referencingVpcId The ID of the VPC with the referencing security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SecurityGroupReference withReferencingVpcId(String referencingVpcId) {
        this.referencingVpcId = referencingVpcId;
        return this;
    }

    /**
     * The ID of the VPC peering connection.
     *
     * @return The ID of the VPC peering connection.
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SecurityGroupReference withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
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
        if (getReferencingVpcId() != null) sb.append("ReferencingVpcId: " + getReferencingVpcId() + ",");
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getReferencingVpcId() == null) ? 0 : getReferencingVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SecurityGroupReference == false) return false;
        SecurityGroupReference other = (SecurityGroupReference)obj;
        
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        if (other.getReferencingVpcId() == null ^ this.getReferencingVpcId() == null) return false;
        if (other.getReferencingVpcId() != null && other.getReferencingVpcId().equals(this.getReferencingVpcId()) == false) return false; 
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        return true;
    }
    
}
    