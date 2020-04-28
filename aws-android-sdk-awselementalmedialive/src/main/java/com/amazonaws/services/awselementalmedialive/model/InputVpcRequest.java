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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Settings for a private VPC Input. When this property is specified, the input
 * destination addresses will be created in a VPC rather than with public
 * Internet addresses. This property requires setting the roleArn property on
 * Input creation. Not compatible with the inputSecurityGroups property.
 */
public class InputVpcRequest implements Serializable {
    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC
     * network interfaces. Requires subnetIds. If none are specified then the
     * VPC default security group will be used.
     */
    private java.util.List<String> securityGroupIds;

    /**
     * A list of 2 VPC subnet IDs from the same VPC. Subnet IDs must be mapped
     * to two unique availability zones (AZ).
     */
    private java.util.List<String> subnetIds;

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC
     * network interfaces. Requires subnetIds. If none are specified then the
     * VPC default security group will be used.
     * 
     * @return A list of up to 5 EC2 VPC security group IDs to attach to the
     *         Input VPC network interfaces. Requires subnetIds. If none are
     *         specified then the VPC default security group will be used.
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC
     * network interfaces. Requires subnetIds. If none are specified then the
     * VPC default security group will be used.
     * 
     * @param securityGroupIds A list of up to 5 EC2 VPC security group IDs to
     *            attach to the Input VPC network interfaces. Requires
     *            subnetIds. If none are specified then the VPC default security
     *            group will be used.
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC
     * network interfaces. Requires subnetIds. If none are specified then the
     * VPC default security group will be used. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds A list of up to 5 EC2 VPC security group IDs to
     *            attach to the Input VPC network interfaces. Requires
     *            subnetIds. If none are specified then the VPC default security
     *            group will be used. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputVpcRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC
     * network interfaces. Requires subnetIds. If none are specified then the
     * VPC default security group will be used. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds A list of up to 5 EC2 VPC security group IDs to
     *            attach to the Input VPC network interfaces. Requires
     *            subnetIds. If none are specified then the VPC default security
     *            group will be used. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputVpcRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * A list of 2 VPC subnet IDs from the same VPC. Subnet IDs must be mapped
     * to two unique availability zones (AZ).
     * 
     * @return A list of 2 VPC subnet IDs from the same VPC. Subnet IDs must be
     *         mapped to two unique availability zones (AZ).
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * A list of 2 VPC subnet IDs from the same VPC. Subnet IDs must be mapped
     * to two unique availability zones (AZ).
     * 
     * @param subnetIds A list of 2 VPC subnet IDs from the same VPC. Subnet IDs
     *            must be mapped to two unique availability zones (AZ).
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * A list of 2 VPC subnet IDs from the same VPC. Subnet IDs must be mapped
     * to two unique availability zones (AZ). <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds A list of 2 VPC subnet IDs from the same VPC. Subnet IDs
     *            must be mapped to two unique availability zones (AZ). @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputVpcRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * A list of 2 VPC subnet IDs from the same VPC. Subnet IDs must be mapped
     * to two unique availability zones (AZ). <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds A list of 2 VPC subnet IDs from the same VPC. Subnet IDs
     *            must be mapped to two unique availability zones (AZ). @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputVpcRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputVpcRequest == false)
            return false;
        InputVpcRequest other = (InputVpcRequest) obj;

        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }
}
