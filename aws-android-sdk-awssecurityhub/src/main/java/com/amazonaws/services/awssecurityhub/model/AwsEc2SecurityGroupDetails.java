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
 * Details about an EC2 security group.
 * </p>
 */
public class AwsEc2SecurityGroupDetails implements Serializable {
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
     * The ID of the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String groupId;

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ownerId;

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String vpcId;

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpPermission> ipPermissions;

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpPermission> ipPermissionsEgress;

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
    public AwsEc2SecurityGroupDetails withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

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
    public AwsEc2SecurityGroupDetails withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ownerId <p>
     *            The AWS account ID of the owner of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupDetails withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param vpcId <p>
     *            [VPC only] The ID of the VPC for the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupDetails withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
    public java.util.List<AwsEc2SecurityGroupIpPermission> getIpPermissions() {
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
    public void setIpPermissions(java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(ipPermissions);
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
    public AwsEc2SecurityGroupDetails withIpPermissions(
            AwsEc2SecurityGroupIpPermission... ipPermissions) {
        if (getIpPermissions() == null) {
            this.ipPermissions = new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(
                    ipPermissions.length);
        }
        for (AwsEc2SecurityGroupIpPermission value : ipPermissions) {
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
    public AwsEc2SecurityGroupDetails withIpPermissions(
            java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
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
    public java.util.List<AwsEc2SecurityGroupIpPermission> getIpPermissionsEgress() {
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
    public void setIpPermissionsEgress(
            java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissionsEgress) {
        if (ipPermissionsEgress == null) {
            this.ipPermissionsEgress = null;
            return;
        }

        this.ipPermissionsEgress = new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(
                ipPermissionsEgress);
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
    public AwsEc2SecurityGroupDetails withIpPermissionsEgress(
            AwsEc2SecurityGroupIpPermission... ipPermissionsEgress) {
        if (getIpPermissionsEgress() == null) {
            this.ipPermissionsEgress = new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(
                    ipPermissionsEgress.length);
        }
        for (AwsEc2SecurityGroupIpPermission value : ipPermissionsEgress) {
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
    public AwsEc2SecurityGroupDetails withIpPermissionsEgress(
            java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissionsEgress) {
        setIpPermissionsEgress(ipPermissionsEgress);
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: " + getIpPermissions() + ",");
        if (getIpPermissionsEgress() != null)
            sb.append("IpPermissionsEgress: " + getIpPermissionsEgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode
                + ((getIpPermissionsEgress() == null) ? 0 : getIpPermissionsEgress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupDetails == false)
            return false;
        AwsEc2SecurityGroupDetails other = (AwsEc2SecurityGroupDetails) obj;

        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null
                && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getIpPermissionsEgress() == null ^ this.getIpPermissionsEgress() == null)
            return false;
        if (other.getIpPermissionsEgress() != null
                && other.getIpPermissionsEgress().equals(this.getIpPermissionsEgress()) == false)
            return false;
        return true;
    }
}
