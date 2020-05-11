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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information for connecting to an Amazon VPC.
 * </p>
 */
public class DataSourceVpcConfiguration implements Serializable {
    /**
     * <p>
     * A list of identifiers for subnets within your Amazon VPC. The subnets
     * should be able to connect to each other in the VPC, and they should have
     * outgoing access to the Internet through a NAT device.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A list of identifiers of security groups within your Amazon VPC. The
     * security groups should enable Amazon Kendra to connect to the data
     * source.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * A list of identifiers for subnets within your Amazon VPC. The subnets
     * should be able to connect to each other in the VPC, and they should have
     * outgoing access to the Internet through a NAT device.
     * </p>
     *
     * @return <p>
     *         A list of identifiers for subnets within your Amazon VPC. The
     *         subnets should be able to connect to each other in the VPC, and
     *         they should have outgoing access to the Internet through a NAT
     *         device.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of identifiers for subnets within your Amazon VPC. The subnets
     * should be able to connect to each other in the VPC, and they should have
     * outgoing access to the Internet through a NAT device.
     * </p>
     *
     * @param subnetIds <p>
     *            A list of identifiers for subnets within your Amazon VPC. The
     *            subnets should be able to connect to each other in the VPC,
     *            and they should have outgoing access to the Internet through a
     *            NAT device.
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
     * A list of identifiers for subnets within your Amazon VPC. The subnets
     * should be able to connect to each other in the VPC, and they should have
     * outgoing access to the Internet through a NAT device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of identifiers for subnets within your Amazon VPC. The
     *            subnets should be able to connect to each other in the VPC,
     *            and they should have outgoing access to the Internet through a
     *            NAT device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceVpcConfiguration withSubnetIds(String... subnetIds) {
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
     * A list of identifiers for subnets within your Amazon VPC. The subnets
     * should be able to connect to each other in the VPC, and they should have
     * outgoing access to the Internet through a NAT device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of identifiers for subnets within your Amazon VPC. The
     *            subnets should be able to connect to each other in the VPC,
     *            and they should have outgoing access to the Internet through a
     *            NAT device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceVpcConfiguration withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of identifiers of security groups within your Amazon VPC. The
     * security groups should enable Amazon Kendra to connect to the data
     * source.
     * </p>
     *
     * @return <p>
     *         A list of identifiers of security groups within your Amazon VPC.
     *         The security groups should enable Amazon Kendra to connect to the
     *         data source.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of identifiers of security groups within your Amazon VPC. The
     * security groups should enable Amazon Kendra to connect to the data
     * source.
     * </p>
     *
     * @param securityGroupIds <p>
     *            A list of identifiers of security groups within your Amazon
     *            VPC. The security groups should enable Amazon Kendra to
     *            connect to the data source.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of identifiers of security groups within your Amazon VPC. The
     * security groups should enable Amazon Kendra to connect to the data
     * source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of identifiers of security groups within your Amazon
     *            VPC. The security groups should enable Amazon Kendra to
     *            connect to the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceVpcConfiguration withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers of security groups within your Amazon VPC. The
     * security groups should enable Amazon Kendra to connect to the data
     * source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            A list of identifiers of security groups within your Amazon
     *            VPC. The security groups should enable Amazon Kendra to
     *            connect to the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceVpcConfiguration withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceVpcConfiguration == false)
            return false;
        DataSourceVpcConfiguration other = (DataSourceVpcConfiguration) obj;

        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }
}
