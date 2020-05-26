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

public class DescribeVpcAttributeResult implements Serializable {
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     */
    private AttributeBooleanValue enableDnsHostnames;

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     * </p>
     */
    private AttributeBooleanValue enableDnsSupport;

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
    public DescribeVpcAttributeResult withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instances launched in the VPC get DNS
     *         hostnames. If this attribute is <code>true</code>, instances in
     *         the VPC get DNS hostnames; otherwise, they do not.
     *         </p>
     */
    public AttributeBooleanValue getEnableDnsHostnames() {
        return enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     *
     * @param enableDnsHostnames <p>
     *            Indicates whether the instances launched in the VPC get DNS
     *            hostnames. If this attribute is <code>true</code>, instances
     *            in the VPC get DNS hostnames; otherwise, they do not.
     *            </p>
     */
    public void setEnableDnsHostnames(AttributeBooleanValue enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * this attribute is <code>true</code>, instances in the VPC get DNS
     * hostnames; otherwise, they do not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDnsHostnames <p>
     *            Indicates whether the instances launched in the VPC get DNS
     *            hostnames. If this attribute is <code>true</code>, instances
     *            in the VPC get DNS hostnames; otherwise, they do not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcAttributeResult withEnableDnsHostnames(
            AttributeBooleanValue enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     * </p>
     *
     * @return <p>
     *         Indicates whether DNS resolution is enabled for the VPC. If this
     *         attribute is <code>true</code>, the Amazon DNS server resolves
     *         DNS hostnames for your instances to their corresponding IP
     *         addresses; otherwise, it does not.
     *         </p>
     */
    public AttributeBooleanValue getEnableDnsSupport() {
        return enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     * </p>
     *
     * @param enableDnsSupport <p>
     *            Indicates whether DNS resolution is enabled for the VPC. If
     *            this attribute is <code>true</code>, the Amazon DNS server
     *            resolves DNS hostnames for your instances to their
     *            corresponding IP addresses; otherwise, it does not.
     *            </p>
     */
    public void setEnableDnsSupport(AttributeBooleanValue enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether DNS resolution is enabled for the VPC. If this
     * attribute is <code>true</code>, the Amazon DNS server resolves DNS
     * hostnames for your instances to their corresponding IP addresses;
     * otherwise, it does not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDnsSupport <p>
     *            Indicates whether DNS resolution is enabled for the VPC. If
     *            this attribute is <code>true</code>, the Amazon DNS server
     *            resolves DNS hostnames for your instances to their
     *            corresponding IP addresses; otherwise, it does not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcAttributeResult withEnableDnsSupport(AttributeBooleanValue enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
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
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getEnableDnsHostnames() != null)
            sb.append("EnableDnsHostnames: " + getEnableDnsHostnames() + ",");
        if (getEnableDnsSupport() != null)
            sb.append("EnableDnsSupport: " + getEnableDnsSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getEnableDnsHostnames() == null) ? 0 : getEnableDnsHostnames().hashCode());
        hashCode = prime * hashCode
                + ((getEnableDnsSupport() == null) ? 0 : getEnableDnsSupport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcAttributeResult == false)
            return false;
        DescribeVpcAttributeResult other = (DescribeVpcAttributeResult) obj;

        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getEnableDnsHostnames() == null ^ this.getEnableDnsHostnames() == null)
            return false;
        if (other.getEnableDnsHostnames() != null
                && other.getEnableDnsHostnames().equals(this.getEnableDnsHostnames()) == false)
            return false;
        if (other.getEnableDnsSupport() == null ^ this.getEnableDnsSupport() == null)
            return false;
        if (other.getEnableDnsSupport() != null
                && other.getEnableDnsSupport().equals(this.getEnableDnsSupport()) == false)
            return false;
        return true;
    }
}
