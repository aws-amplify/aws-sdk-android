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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AuthorizeDBSecurityGroupIngress</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDBSecurityGroups</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RevokeDBSecurityGroupIngress</code>
 * </p>
 * </li>
 * </ul>
 */
public class EC2SecurityGroup implements Serializable {
    /**
     * <p>
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     */
    private String eC2SecurityGroupName;

    /**
     * <p>
     * Specifies the id of the EC2 security group.
     * </p>
     */
    private String eC2SecurityGroupId;

    /**
     * <p>
     * Specifies the AWS ID of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> field.
     * </p>
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * <p>
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     *
     * @return <p>
     *         Provides the status of the EC2 security group. Status can be
     *         "authorizing", "authorized", "revoking", and "revoked".
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     *
     * @param status <p>
     *            Provides the status of the EC2 security group. Status can be
     *            "authorizing", "authorized", "revoking", and "revoked".
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Provides the status of the EC2 security group. Status can be
     *            "authorizing", "authorized", "revoking", and "revoked".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2SecurityGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the EC2 security group.
     *         </p>
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     *
     * @param eC2SecurityGroupName <p>
     *            Specifies the name of the EC2 security group.
     *            </p>
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    /**
     * <p>
     * Specifies the name of the EC2 security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroupName <p>
     *            Specifies the name of the EC2 security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2SecurityGroup withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * <p>
     * Specifies the id of the EC2 security group.
     * </p>
     *
     * @return <p>
     *         Specifies the id of the EC2 security group.
     *         </p>
     */
    public String getEC2SecurityGroupId() {
        return eC2SecurityGroupId;
    }

    /**
     * <p>
     * Specifies the id of the EC2 security group.
     * </p>
     *
     * @param eC2SecurityGroupId <p>
     *            Specifies the id of the EC2 security group.
     *            </p>
     */
    public void setEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }

    /**
     * <p>
     * Specifies the id of the EC2 security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroupId <p>
     *            Specifies the id of the EC2 security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2SecurityGroup withEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
        return this;
    }

    /**
     * <p>
     * Specifies the AWS ID of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> field.
     * </p>
     *
     * @return <p>
     *         Specifies the AWS ID of the owner of the EC2 security group
     *         specified in the <code>EC2SecurityGroupName</code> field.
     *         </p>
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * Specifies the AWS ID of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> field.
     * </p>
     *
     * @param eC2SecurityGroupOwnerId <p>
     *            Specifies the AWS ID of the owner of the EC2 security group
     *            specified in the <code>EC2SecurityGroupName</code> field.
     *            </p>
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * Specifies the AWS ID of the owner of the EC2 security group specified in
     * the <code>EC2SecurityGroupName</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroupOwnerId <p>
     *            Specifies the AWS ID of the owner of the EC2 security group
     *            specified in the <code>EC2SecurityGroupName</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2SecurityGroup withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEC2SecurityGroupName() != null)
            sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupId() != null)
            sb.append("EC2SecurityGroupId: " + getEC2SecurityGroupId() + ",");
        if (getEC2SecurityGroupOwnerId() != null)
            sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getEC2SecurityGroupId() == null) ? 0 : getEC2SecurityGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2SecurityGroup == false)
            return false;
        EC2SecurityGroup other = (EC2SecurityGroup) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null)
            return false;
        if (other.getEC2SecurityGroupName() != null
                && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false)
            return false;
        if (other.getEC2SecurityGroupId() == null ^ this.getEC2SecurityGroupId() == null)
            return false;
        if (other.getEC2SecurityGroupId() != null
                && other.getEC2SecurityGroupId().equals(this.getEC2SecurityGroupId()) == false)
            return false;
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null)
            return false;
        if (other.getEC2SecurityGroupOwnerId() != null
                && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false)
            return false;
        return true;
    }
}
