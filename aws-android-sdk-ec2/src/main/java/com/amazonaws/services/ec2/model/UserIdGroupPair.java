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
 * Describes a security group and AWS account ID pair.
 * </p>
 */
public class UserIdGroupPair implements Serializable {
    /**
     * <p>
     * A description for the security group rule that references this user ID
     * group pair.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
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
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security group
     * in a nondefault VPC, use the security group ID.
     * </p>
     * <p>
     * For a referenced security group in another VPC, this value is not
     * returned if the referenced security group is deleted.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
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
     * security group in another AWS account.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * A description for the security group rule that references this user ID
     * group pair.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
     * </p>
     *
     * @return <p>
     *         A description for the security group rule that references this
     *         user ID group pair.
     *         </p>
     *         <p>
     *         Constraints: Up to 255 characters in length. Allowed characters
     *         are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the security group rule that references this user ID
     * group pair.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
     * </p>
     *
     * @param description <p>
     *            A description for the security group rule that references this
     *            user ID group pair.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length. Allowed
     *            characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group rule that references this user ID
     * group pair.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the security group rule that references this
     *            user ID group pair.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length. Allowed
     *            characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdGroupPair withDescription(String description) {
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
    public UserIdGroupPair withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security group
     * in a nondefault VPC, use the security group ID.
     * </p>
     * <p>
     * For a referenced security group in another VPC, this value is not
     * returned if the referenced security group is deleted.
     * </p>
     *
     * @return <p>
     *         The name of the security group. In a request, use this parameter
     *         for a security group in EC2-Classic or a default VPC only. For a
     *         security group in a nondefault VPC, use the security group ID.
     *         </p>
     *         <p>
     *         For a referenced security group in another VPC, this value is not
     *         returned if the referenced security group is deleted.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security group
     * in a nondefault VPC, use the security group ID.
     * </p>
     * <p>
     * For a referenced security group in another VPC, this value is not
     * returned if the referenced security group is deleted.
     * </p>
     *
     * @param groupName <p>
     *            The name of the security group. In a request, use this
     *            parameter for a security group in EC2-Classic or a default VPC
     *            only. For a security group in a nondefault VPC, use the
     *            security group ID.
     *            </p>
     *            <p>
     *            For a referenced security group in another VPC, this value is
     *            not returned if the referenced security group is deleted.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group. In a request, use this parameter for a
     * security group in EC2-Classic or a default VPC only. For a security group
     * in a nondefault VPC, use the security group ID.
     * </p>
     * <p>
     * For a referenced security group in another VPC, this value is not
     * returned if the referenced security group is deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the security group. In a request, use this
     *            parameter for a security group in EC2-Classic or a default VPC
     *            only. For a security group in a nondefault VPC, use the
     *            security group ID.
     *            </p>
     *            <p>
     *            For a referenced security group in another VPC, this value is
     *            not returned if the referenced security group is deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdGroupPair withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The status of a VPC peering connection, if applicable.
     * </p>
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
     *
     * @param peeringStatus <p>
     *            The status of a VPC peering connection, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdGroupPair withPeeringStatus(String peeringStatus) {
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
     * security group in another AWS account.
     * </p>
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
     *         reference a security group in another AWS account.
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
     * security group in another AWS account.
     * </p>
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
     *            reference a security group in another AWS account.
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
     * security group in another AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
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
     *            reference a security group in another AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdGroupPair withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the referenced security group, if applicable.
     * </p>
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
     *
     * @param vpcId <p>
     *            The ID of the VPC for the referenced security group, if
     *            applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdGroupPair withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection, if applicable.
     * </p>
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
     *
     * @param vpcPeeringConnectionId <p>
     *            The ID of the VPC peering connection, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdGroupPair withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
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

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
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

        if (obj instanceof UserIdGroupPair == false)
            return false;
        UserIdGroupPair other = (UserIdGroupPair) obj;

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
