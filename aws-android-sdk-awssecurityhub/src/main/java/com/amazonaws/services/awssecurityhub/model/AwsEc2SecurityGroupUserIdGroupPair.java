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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A relationship between a security group and a user.
 * </p>
 */
public class AwsEc2SecurityGroupUserIdGroupPair implements Serializable {
    /**
     * <p>
     * The ID of the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String groupId;

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String groupName;

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String peeringStatus;

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     * <p>
     * For a referenced security group in another VPC, the account ID of the
     * referenced security group is returned in the response. If the referenced
     * security group is deleted, this value is not returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a
     * security group in another AWS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String userId;

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupId <p>
     *            The ID of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupUserIdGroupPair withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param groupName <p>
     *            The name of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupUserIdGroupPair withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The status of a VPC peering connection, if applicable.
     *         </p>
     */
    public String getPeeringStatus() {
        return peeringStatus;
    }

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param peeringStatus <p>
     *            The status of a VPC peering connection, if applicable.
     *            </p>
     */
    public void setPeeringStatus(String peeringStatus) {
        this.peeringStatus = peeringStatus;
    }

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param peeringStatus <p>
     *            The status of a VPC peering connection, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupUserIdGroupPair withPeeringStatus(String peeringStatus) {
        this.peeringStatus = peeringStatus;
        return this;
    }

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     * <p>
     * For a referenced security group in another VPC, the account ID of the
     * referenced security group is returned in the response. If the referenced
     * security group is deleted, this value is not returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a
     * security group in another AWS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of an AWS account.
     *         </p>
     *         <p>
     *         For a referenced security group in another VPC, the account ID of
     *         the referenced security group is returned in the response. If the
     *         referenced security group is deleted, this value is not returned.
     *         </p>
     *         <p>
     *         [EC2-Classic] Required when adding or removing rules that
     *         reference a security group in another AWS.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     * <p>
     * For a referenced security group in another VPC, the account ID of the
     * referenced security group is returned in the response. If the referenced
     * security group is deleted, this value is not returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a
     * security group in another AWS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param userId <p>
     *            The ID of an AWS account.
     *            </p>
     *            <p>
     *            For a referenced security group in another VPC, the account ID
     *            of the referenced security group is returned in the response.
     *            If the referenced security group is deleted, this value is not
     *            returned.
     *            </p>
     *            <p>
     *            [EC2-Classic] Required when adding or removing rules that
     *            reference a security group in another AWS.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of an AWS account.
     * </p>
     * <p>
     * For a referenced security group in another VPC, the account ID of the
     * referenced security group is returned in the response. If the referenced
     * security group is deleted, this value is not returned.
     * </p>
     * <p>
     * [EC2-Classic] Required when adding or removing rules that reference a
     * security group in another AWS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param userId <p>
     *            The ID of an AWS account.
     *            </p>
     *            <p>
     *            For a referenced security group in another VPC, the account ID
     *            of the referenced security group is returned in the response.
     *            If the referenced security group is deleted, this value is not
     *            returned.
     *            </p>
     *            <p>
     *            [EC2-Classic] Required when adding or removing rules that
     *            reference a security group in another AWS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupUserIdGroupPair withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the VPC for the referenced security group, if
     *         applicable.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcId <p>
     *            The ID of the VPC for the referenced security group, if
     *            applicable.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcId <p>
     *            The ID of the VPC for the referenced security group, if
     *            applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupUserIdGroupPair withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the VPC peering connection, if applicable.
     *         </p>
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcPeeringConnectionId <p>
     *            The ID of the VPC peering connection, if applicable.
     *            </p>
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcPeeringConnectionId <p>
     *            The ID of the VPC peering connection, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupUserIdGroupPair withVpcPeeringConnectionId(
            String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
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
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getPeeringStatus() != null)
            sb.append("PeeringStatus: " + getPeeringStatus() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getPeeringStatus() == null) ? 0 : getPeeringStatus().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupUserIdGroupPair == false)
            return false;
        AwsEc2SecurityGroupUserIdGroupPair other = (AwsEc2SecurityGroupUserIdGroupPair) obj;

        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getPeeringStatus() == null ^ this.getPeeringStatus() == null)
            return false;
        if (other.getPeeringStatus() != null
                && other.getPeeringStatus().equals(this.getPeeringStatus()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null
                && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }
}
