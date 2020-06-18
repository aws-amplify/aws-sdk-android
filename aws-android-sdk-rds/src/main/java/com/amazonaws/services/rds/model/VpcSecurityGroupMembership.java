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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a response element for queries on VPC security
 * group membership.
 * </p>
 */
public class VpcSecurityGroupMembership implements Serializable {
    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     */
    private String vpcSecurityGroupId;

    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     *
     * @return <p>
     *         The name of the VPC security group.
     *         </p>
     */
    public String getVpcSecurityGroupId() {
        return vpcSecurityGroupId;
    }

    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     *
     * @param vpcSecurityGroupId <p>
     *            The name of the VPC security group.
     *            </p>
     */
    public void setVpcSecurityGroupId(String vpcSecurityGroupId) {
        this.vpcSecurityGroupId = vpcSecurityGroupId;
    }

    /**
     * <p>
     * The name of the VPC security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupId <p>
     *            The name of the VPC security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcSecurityGroupMembership withVpcSecurityGroupId(String vpcSecurityGroupId) {
        this.vpcSecurityGroupId = vpcSecurityGroupId;
        return this;
    }

    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     *
     * @return <p>
     *         The status of the VPC security group.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     *
     * @param status <p>
     *            The status of the VPC security group.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the VPC security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcSecurityGroupMembership withStatus(String status) {
        this.status = status;
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
        if (getVpcSecurityGroupId() != null)
            sb.append("VpcSecurityGroupId: " + getVpcSecurityGroupId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVpcSecurityGroupId() == null) ? 0 : getVpcSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcSecurityGroupMembership == false)
            return false;
        VpcSecurityGroupMembership other = (VpcSecurityGroupMembership) obj;

        if (other.getVpcSecurityGroupId() == null ^ this.getVpcSecurityGroupId() == null)
            return false;
        if (other.getVpcSecurityGroupId() != null
                && other.getVpcSecurityGroupId().equals(this.getVpcSecurityGroupId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
