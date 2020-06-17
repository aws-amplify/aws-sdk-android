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
 * Modifies the specified attribute of the specified VPC.
 * </p>
 */
public class ModifyVpcAttributeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * enabled, instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute. You can only
     * enable DNS hostnames if you've enabled DNS support.
     * </p>
     */
    private AttributeBooleanValue enableDnsHostnames;

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If
     * enabled, queries to the Amazon provided DNS server at the 169.254.169.253
     * IP address, or the reserved IP address at the base of the VPC network
     * range "plus two" succeed. If disabled, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute.
     * </p>
     */
    private AttributeBooleanValue enableDnsSupport;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * enabled, instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute. You can only
     * enable DNS hostnames if you've enabled DNS support.
     * </p>
     *
     * @return <p>
     *         Indicates whether the instances launched in the VPC get DNS
     *         hostnames. If enabled, instances in the VPC get DNS hostnames;
     *         otherwise, they do not.
     *         </p>
     *         <p>
     *         You cannot modify the DNS resolution and DNS hostnames attributes
     *         in the same request. Use separate requests for each attribute.
     *         You can only enable DNS hostnames if you've enabled DNS support.
     *         </p>
     */
    public AttributeBooleanValue getEnableDnsHostnames() {
        return enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * enabled, instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute. You can only
     * enable DNS hostnames if you've enabled DNS support.
     * </p>
     *
     * @param enableDnsHostnames <p>
     *            Indicates whether the instances launched in the VPC get DNS
     *            hostnames. If enabled, instances in the VPC get DNS hostnames;
     *            otherwise, they do not.
     *            </p>
     *            <p>
     *            You cannot modify the DNS resolution and DNS hostnames
     *            attributes in the same request. Use separate requests for each
     *            attribute. You can only enable DNS hostnames if you've enabled
     *            DNS support.
     *            </p>
     */
    public void setEnableDnsHostnames(AttributeBooleanValue enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
    }

    /**
     * <p>
     * Indicates whether the instances launched in the VPC get DNS hostnames. If
     * enabled, instances in the VPC get DNS hostnames; otherwise, they do not.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute. You can only
     * enable DNS hostnames if you've enabled DNS support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDnsHostnames <p>
     *            Indicates whether the instances launched in the VPC get DNS
     *            hostnames. If enabled, instances in the VPC get DNS hostnames;
     *            otherwise, they do not.
     *            </p>
     *            <p>
     *            You cannot modify the DNS resolution and DNS hostnames
     *            attributes in the same request. Use separate requests for each
     *            attribute. You can only enable DNS hostnames if you've enabled
     *            DNS support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcAttributeRequest withEnableDnsHostnames(AttributeBooleanValue enableDnsHostnames) {
        this.enableDnsHostnames = enableDnsHostnames;
        return this;
    }

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If
     * enabled, queries to the Amazon provided DNS server at the 169.254.169.253
     * IP address, or the reserved IP address at the base of the VPC network
     * range "plus two" succeed. If disabled, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute.
     * </p>
     *
     * @return <p>
     *         Indicates whether the DNS resolution is supported for the VPC. If
     *         enabled, queries to the Amazon provided DNS server at the
     *         169.254.169.253 IP address, or the reserved IP address at the
     *         base of the VPC network range "plus two" succeed. If disabled,
     *         the Amazon provided DNS service in the VPC that resolves public
     *         DNS hostnames to IP addresses is not enabled.
     *         </p>
     *         <p>
     *         You cannot modify the DNS resolution and DNS hostnames attributes
     *         in the same request. Use separate requests for each attribute.
     *         </p>
     */
    public AttributeBooleanValue getEnableDnsSupport() {
        return enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If
     * enabled, queries to the Amazon provided DNS server at the 169.254.169.253
     * IP address, or the reserved IP address at the base of the VPC network
     * range "plus two" succeed. If disabled, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute.
     * </p>
     *
     * @param enableDnsSupport <p>
     *            Indicates whether the DNS resolution is supported for the VPC.
     *            If enabled, queries to the Amazon provided DNS server at the
     *            169.254.169.253 IP address, or the reserved IP address at the
     *            base of the VPC network range "plus two" succeed. If disabled,
     *            the Amazon provided DNS service in the VPC that resolves
     *            public DNS hostnames to IP addresses is not enabled.
     *            </p>
     *            <p>
     *            You cannot modify the DNS resolution and DNS hostnames
     *            attributes in the same request. Use separate requests for each
     *            attribute.
     *            </p>
     */
    public void setEnableDnsSupport(AttributeBooleanValue enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
    }

    /**
     * <p>
     * Indicates whether the DNS resolution is supported for the VPC. If
     * enabled, queries to the Amazon provided DNS server at the 169.254.169.253
     * IP address, or the reserved IP address at the base of the VPC network
     * range "plus two" succeed. If disabled, the Amazon provided DNS service in
     * the VPC that resolves public DNS hostnames to IP addresses is not
     * enabled.
     * </p>
     * <p>
     * You cannot modify the DNS resolution and DNS hostnames attributes in the
     * same request. Use separate requests for each attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDnsSupport <p>
     *            Indicates whether the DNS resolution is supported for the VPC.
     *            If enabled, queries to the Amazon provided DNS server at the
     *            169.254.169.253 IP address, or the reserved IP address at the
     *            base of the VPC network range "plus two" succeed. If disabled,
     *            the Amazon provided DNS service in the VPC that resolves
     *            public DNS hostnames to IP addresses is not enabled.
     *            </p>
     *            <p>
     *            You cannot modify the DNS resolution and DNS hostnames
     *            attributes in the same request. Use separate requests for each
     *            attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcAttributeRequest withEnableDnsSupport(AttributeBooleanValue enableDnsSupport) {
        this.enableDnsSupport = enableDnsSupport;
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
    public ModifyVpcAttributeRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getEnableDnsHostnames() != null)
            sb.append("EnableDnsHostnames: " + getEnableDnsHostnames() + ",");
        if (getEnableDnsSupport() != null)
            sb.append("EnableDnsSupport: " + getEnableDnsSupport() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableDnsHostnames() == null) ? 0 : getEnableDnsHostnames().hashCode());
        hashCode = prime * hashCode
                + ((getEnableDnsSupport() == null) ? 0 : getEnableDnsSupport().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcAttributeRequest == false)
            return false;
        ModifyVpcAttributeRequest other = (ModifyVpcAttributeRequest) obj;

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
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
