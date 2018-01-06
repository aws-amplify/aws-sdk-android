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
 * Describes a security group and AWS account ID pair.
 * </p>
 */
public class UserIdGroupPair implements Serializable {

    /**
     * The ID of an AWS account. For a referenced security group in another
     * VPC, the account ID of the referenced security group is returned.
     * <p>[EC2-Classic] Required when adding or removing rules that reference
     * a security group in another AWS account.
     */
    private String userId;

    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use the security group ID.
     */
    private String groupName;

    /**
     * The ID of the security group.
     */
    private String groupId;

    /**
     * The ID of the VPC for the referenced security group, if applicable.
     */
    private String vpcId;

    /**
     * The ID of the VPC peering connection, if applicable.
     */
    private String vpcPeeringConnectionId;

    /**
     * The status of a VPC peering connection, if applicable.
     */
    private String peeringStatus;

    /**
     * The ID of an AWS account. For a referenced security group in another
     * VPC, the account ID of the referenced security group is returned.
     * <p>[EC2-Classic] Required when adding or removing rules that reference
     * a security group in another AWS account.
     *
     * @return The ID of an AWS account. For a referenced security group in another
     *         VPC, the account ID of the referenced security group is returned.
     *         <p>[EC2-Classic] Required when adding or removing rules that reference
     *         a security group in another AWS account.
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * The ID of an AWS account. For a referenced security group in another
     * VPC, the account ID of the referenced security group is returned.
     * <p>[EC2-Classic] Required when adding or removing rules that reference
     * a security group in another AWS account.
     *
     * @param userId The ID of an AWS account. For a referenced security group in another
     *         VPC, the account ID of the referenced security group is returned.
     *         <p>[EC2-Classic] Required when adding or removing rules that reference
     *         a security group in another AWS account.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * The ID of an AWS account. For a referenced security group in another
     * VPC, the account ID of the referenced security group is returned.
     * <p>[EC2-Classic] Required when adding or removing rules that reference
     * a security group in another AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userId The ID of an AWS account. For a referenced security group in another
     *         VPC, the account ID of the referenced security group is returned.
     *         <p>[EC2-Classic] Required when adding or removing rules that reference
     *         a security group in another AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use the security group ID.
     *
     * @return The name of the security group. In a request, use this parameter for a
     *         security group in EC2-Classic or a default VPC only. For a security
     *         group in a nondefault VPC, use the security group ID.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use the security group ID.
     *
     * @param groupName The name of the security group. In a request, use this parameter for a
     *         security group in EC2-Classic or a default VPC only. For a security
     *         group in a nondefault VPC, use the security group ID.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security
     * group in a nondefault VPC, use the security group ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the security group. In a request, use this parameter for a
     *         security group in EC2-Classic or a default VPC only. For a security
     *         group in a nondefault VPC, use the security group ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

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
    public UserIdGroupPair withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The ID of the VPC for the referenced security group, if applicable.
     *
     * @return The ID of the VPC for the referenced security group, if applicable.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC for the referenced security group, if applicable.
     *
     * @param vpcId The ID of the VPC for the referenced security group, if applicable.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC for the referenced security group, if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC for the referenced security group, if applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The ID of the VPC peering connection, if applicable.
     *
     * @return The ID of the VPC peering connection, if applicable.
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection, if applicable.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection, if applicable.
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection, if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection, if applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
        return this;
    }

    /**
     * The status of a VPC peering connection, if applicable.
     *
     * @return The status of a VPC peering connection, if applicable.
     */
    public String getPeeringStatus() {
        return peeringStatus;
    }
    
    /**
     * The status of a VPC peering connection, if applicable.
     *
     * @param peeringStatus The status of a VPC peering connection, if applicable.
     */
    public void setPeeringStatus(String peeringStatus) {
        this.peeringStatus = peeringStatus;
    }
    
    /**
     * The status of a VPC peering connection, if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param peeringStatus The status of a VPC peering connection, if applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserIdGroupPair withPeeringStatus(String peeringStatus) {
        this.peeringStatus = peeringStatus;
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
        if (getUserId() != null) sb.append("UserId: " + getUserId() + ",");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() + ",");
        if (getPeeringStatus() != null) sb.append("PeeringStatus: " + getPeeringStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode()); 
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getPeeringStatus() == null) ? 0 : getPeeringStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UserIdGroupPair == false) return false;
        UserIdGroupPair other = (UserIdGroupPair)obj;
        
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false; 
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        if (other.getPeeringStatus() == null ^ this.getPeeringStatus() == null) return false;
        if (other.getPeeringStatus() != null && other.getPeeringStatus().equals(this.getPeeringStatus()) == false) return false; 
        return true;
    }
    
}
    