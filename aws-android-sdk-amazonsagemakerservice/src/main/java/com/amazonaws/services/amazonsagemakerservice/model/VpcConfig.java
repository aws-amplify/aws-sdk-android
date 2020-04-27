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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a VPC that your training jobs and hosted models have access to.
 * Control access to and from your training and model containers by configuring
 * the VPC. For more information, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html">Protect
 * Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">Protect
 * Training Jobs by Using an Amazon Virtual Private Cloud</a>.
 * </p>
 */
public class VpcConfig implements Serializable {
    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security
     * groups for the VPC that is specified in the <code>Subnets</code> field.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The ID of the subnets in the VPC to which you want to connect your
     * training job or model. For information about the availability of specific
     * instance types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     * >Supported Instance Types and Availability Zones</a>.
     * </p>
     */
    private java.util.List<String> subnets;

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security
     * groups for the VPC that is specified in the <code>Subnets</code> field.
     * </p>
     *
     * @return <p>
     *         The VPC security group IDs, in the form sg-xxxxxxxx. Specify the
     *         security groups for the VPC that is specified in the
     *         <code>Subnets</code> field.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security
     * groups for the VPC that is specified in the <code>Subnets</code> field.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The VPC security group IDs, in the form sg-xxxxxxxx. Specify
     *            the security groups for the VPC that is specified in the
     *            <code>Subnets</code> field.
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
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security
     * groups for the VPC that is specified in the <code>Subnets</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The VPC security group IDs, in the form sg-xxxxxxxx. Specify
     *            the security groups for the VPC that is specified in the
     *            <code>Subnets</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSecurityGroupIds(String... securityGroupIds) {
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
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security
     * groups for the VPC that is specified in the <code>Subnets</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The VPC security group IDs, in the form sg-xxxxxxxx. Specify
     *            the security groups for the VPC that is specified in the
     *            <code>Subnets</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the subnets in the VPC to which you want to connect your
     * training job or model. For information about the availability of specific
     * instance types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     * >Supported Instance Types and Availability Zones</a>.
     * </p>
     *
     * @return <p>
     *         The ID of the subnets in the VPC to which you want to connect
     *         your training job or model. For information about the
     *         availability of specific instance types, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     *         >Supported Instance Types and Availability Zones</a>.
     *         </p>
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The ID of the subnets in the VPC to which you want to connect your
     * training job or model. For information about the availability of specific
     * instance types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     * >Supported Instance Types and Availability Zones</a>.
     * </p>
     *
     * @param subnets <p>
     *            The ID of the subnets in the VPC to which you want to connect
     *            your training job or model. For information about the
     *            availability of specific instance types, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     *            >Supported Instance Types and Availability Zones</a>.
     *            </p>
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The ID of the subnets in the VPC to which you want to connect your
     * training job or model. For information about the availability of specific
     * instance types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     * >Supported Instance Types and Availability Zones</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The ID of the subnets in the VPC to which you want to connect
     *            your training job or model. For information about the
     *            availability of specific instance types, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     *            >Supported Instance Types and Availability Zones</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSubnets(String... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<String>(subnets.length);
        }
        for (String value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the subnets in the VPC to which you want to connect your
     * training job or model. For information about the availability of specific
     * instance types, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     * >Supported Instance Types and Availability Zones</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The ID of the subnets in the VPC to which you want to connect
     *            your training job or model. For information about the
     *            availability of specific instance types, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/instance-types-az.html"
     *            >Supported Instance Types and Availability Zones</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcConfig withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
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
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcConfig == false)
            return false;
        VpcConfig other = (VpcConfig) obj;

        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }
}
