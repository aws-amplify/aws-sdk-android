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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a security group.
 * </p>
 * <p>
 * A security group acts as a virtual firewall for your instance to control
 * inbound and outbound traffic. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
 * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i> and <a href=
 * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
 * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * When you create a security group, you specify a friendly name of your choice.
 * You can have a security group for use in EC2-Classic with the same name as a
 * security group for use in a VPC. However, you can't have two security groups
 * for use in EC2-Classic with the same name or two security groups for use in a
 * VPC with the same name.
 * </p>
 * <p>
 * You have a default security group for use in EC2-Classic and a default
 * security group for use in your VPC. If you don't specify a security group
 * when you launch an instance, the instance is launched into the appropriate
 * default security group. A default security group includes a default rule that
 * grants instances unrestricted network access to each other.
 * </p>
 * <p>
 * You can add or remove rules from your security groups using
 * <a>AuthorizeSecurityGroupIngress</a>, <a>AuthorizeSecurityGroupEgress</a>,
 * <a>RevokeSecurityGroupIngress</a>, and <a>RevokeSecurityGroupEgress</a>.
 * </p>
 * <p>
 * For more information about VPC security group limits, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html"
 * >Amazon VPC Limits</a>.
 * </p>
 */
public class CreateSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Cannot start with
     * <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     *
     * @return <p>
     *         A description for the security group. This is informational only.
     *         </p>
     *         <p>
     *         Constraints: Up to 255 characters in length
     *         </p>
     *         <p>
     *         Constraints for EC2-Classic: ASCII characters
     *         </p>
     *         <p>
     *         Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *         ._-:/()#,@[]+=&amp;;{}!$*
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     *
     * @param description <p>
     *            A description for the security group. This is informational
     *            only.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length
     *            </p>
     *            <p>
     *            Constraints for EC2-Classic: ASCII characters
     *            </p>
     *            <p>
     *            Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *            ._-:/()#,@[]+=&amp;;{}!$*
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the security group. This is informational
     *            only.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length
     *            </p>
     *            <p>
     *            Constraints for EC2-Classic: ASCII characters
     *            </p>
     *            <p>
     *            Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *            ._-:/()#,@[]+=&amp;;{}!$*
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Cannot start with
     * <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     *
     * @return <p>
     *         The name of the security group.
     *         </p>
     *         <p>
     *         Constraints: Up to 255 characters in length. Cannot start with
     *         <code>sg-</code>.
     *         </p>
     *         <p>
     *         Constraints for EC2-Classic: ASCII characters
     *         </p>
     *         <p>
     *         Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *         ._-:/()#,@[]+=&amp;;{}!$*
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
     * Constraints: Up to 255 characters in length. Cannot start with
     * <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     *
     * @param groupName <p>
     *            The name of the security group.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length. Cannot start with
     *            <code>sg-</code>.
     *            </p>
     *            <p>
     *            Constraints for EC2-Classic: ASCII characters
     *            </p>
     *            <p>
     *            Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *            ._-:/()#,@[]+=&amp;;{}!$*
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
     * Constraints: Up to 255 characters in length. Cannot start with
     * <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     * ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the security group.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length. Cannot start with
     *            <code>sg-</code>.
     *            </p>
     *            <p>
     *            Constraints for EC2-Classic: ASCII characters
     *            </p>
     *            <p>
     *            Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and
     *            ._-:/()#,@[]+=&amp;;{}!$*
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     *
     * @param vpcId <p>
     *            [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityGroupRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityGroupRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
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
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityGroupRequest == false)
            return false;
        CreateSecurityGroupRequest other = (CreateSecurityGroupRequest) obj;

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
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
