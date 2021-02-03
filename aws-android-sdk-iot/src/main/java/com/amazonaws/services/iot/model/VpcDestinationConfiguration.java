/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration information for a virtual private cloud (VPC) destination.
 * </p>
 */
public class VpcDestinationConfiguration implements Serializable {
    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic
     * network interfaces (ENIs).
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     *
     * @return <p>
     *         The subnet IDs of the VPC destination.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     *
     * @param subnetIds <p>
     *            The subnet IDs of the VPC destination.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            The subnet IDs of the VPC destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcDestinationConfiguration withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The subnet IDs of the VPC destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            The subnet IDs of the VPC destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcDestinationConfiguration withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     *
     * @return <p>
     *         The security groups of the VPC destination.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     *
     * @param securityGroups <p>
     *            The security groups of the VPC destination.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups of the VPC destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcDestinationConfiguration withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups of the VPC destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups of the VPC destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcDestinationConfiguration withSecurityGroups(
            java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcDestinationConfiguration withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic
     * network interfaces (ENIs).
     * </p>
     *
     * @return <p>
     *         The ARN of a role that has permission to create and attach to
     *         elastic network interfaces (ENIs).
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic
     * network interfaces (ENIs).
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of a role that has permission to create and attach to
     *            elastic network interfaces (ENIs).
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of a role that has permission to create and attach to elastic
     * network interfaces (ENIs).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of a role that has permission to create and attach to
     *            elastic network interfaces (ENIs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcDestinationConfiguration withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getSubnetIds() != null)
            sb.append("subnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroups() != null)
            sb.append("securityGroups: " + getSecurityGroups() + ",");
        if (getVpcId() != null)
            sb.append("vpcId: " + getVpcId() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcDestinationConfiguration == false)
            return false;
        VpcDestinationConfiguration other = (VpcDestinationConfiguration) obj;

        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
