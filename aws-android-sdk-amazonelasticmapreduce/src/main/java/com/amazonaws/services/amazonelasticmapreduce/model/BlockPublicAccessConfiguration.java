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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A configuration for Amazon EMR block public access. When
 * <code>BlockPublicSecurityGroupRules</code> is set to <code>true</code>,
 * Amazon EMR prevents cluster creation if one of the cluster's security groups
 * has a rule that allows inbound traffic from 0.0.0.0/0 or ::/0 on a port,
 * unless the port is specified as an exception using
 * <code>PermittedPublicSecurityGroupRuleRanges</code>.
 * </p>
 */
public class BlockPublicAccessConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>)
     * or disabled (<code>false</code>). By default, the value is
     * <code>false</code> for accounts that have created EMR clusters before
     * July 2019. For accounts created after this, the default is
     * <code>true</code>.
     * </p>
     */
    private Boolean blockPublicSecurityGroupRules;

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group
     * rules that allow inbound traffic from all public sources. For example, if
     * Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows
     * cluster creation if a security group associated with the cluster has a
     * rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6
     * port ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2
     * instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     */
    private java.util.List<PortRange> permittedPublicSecurityGroupRuleRanges;

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>)
     * or disabled (<code>false</code>). By default, the value is
     * <code>false</code> for accounts that have created EMR clusters before
     * July 2019. For accounts created after this, the default is
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether EMR block public access is enabled (
     *         <code>true</code>) or disabled (<code>false</code>). By default,
     *         the value is <code>false</code> for accounts that have created
     *         EMR clusters before July 2019. For accounts created after this,
     *         the default is <code>true</code>.
     *         </p>
     */
    public Boolean isBlockPublicSecurityGroupRules() {
        return blockPublicSecurityGroupRules;
    }

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>)
     * or disabled (<code>false</code>). By default, the value is
     * <code>false</code> for accounts that have created EMR clusters before
     * July 2019. For accounts created after this, the default is
     * <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether EMR block public access is enabled (
     *         <code>true</code>) or disabled (<code>false</code>). By default,
     *         the value is <code>false</code> for accounts that have created
     *         EMR clusters before July 2019. For accounts created after this,
     *         the default is <code>true</code>.
     *         </p>
     */
    public Boolean getBlockPublicSecurityGroupRules() {
        return blockPublicSecurityGroupRules;
    }

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>)
     * or disabled (<code>false</code>). By default, the value is
     * <code>false</code> for accounts that have created EMR clusters before
     * July 2019. For accounts created after this, the default is
     * <code>true</code>.
     * </p>
     *
     * @param blockPublicSecurityGroupRules <p>
     *            Indicates whether EMR block public access is enabled (
     *            <code>true</code>) or disabled (<code>false</code>). By
     *            default, the value is <code>false</code> for accounts that
     *            have created EMR clusters before July 2019. For accounts
     *            created after this, the default is <code>true</code>.
     *            </p>
     */
    public void setBlockPublicSecurityGroupRules(Boolean blockPublicSecurityGroupRules) {
        this.blockPublicSecurityGroupRules = blockPublicSecurityGroupRules;
    }

    /**
     * <p>
     * Indicates whether EMR block public access is enabled (<code>true</code>)
     * or disabled (<code>false</code>). By default, the value is
     * <code>false</code> for accounts that have created EMR clusters before
     * July 2019. For accounts created after this, the default is
     * <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicSecurityGroupRules <p>
     *            Indicates whether EMR block public access is enabled (
     *            <code>true</code>) or disabled (<code>false</code>). By
     *            default, the value is <code>false</code> for accounts that
     *            have created EMR clusters before July 2019. For accounts
     *            created after this, the default is <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccessConfiguration withBlockPublicSecurityGroupRules(
            Boolean blockPublicSecurityGroupRules) {
        this.blockPublicSecurityGroupRules = blockPublicSecurityGroupRules;
        return this;
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group
     * rules that allow inbound traffic from all public sources. For example, if
     * Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows
     * cluster creation if a security group associated with the cluster has a
     * rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6
     * port ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2
     * instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     *
     * @return <p>
     *         Specifies ports and port ranges that are permitted to have
     *         security group rules that allow inbound traffic from all public
     *         sources. For example, if Port 23 (Telnet) is specified for
     *         <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR
     *         allows cluster creation if a security group associated with the
     *         cluster has a rule that allows inbound traffic on Port 23 from
     *         IPv4 0.0.0.0/0 or IPv6 port ::/0 as the source.
     *         </p>
     *         <p>
     *         By default, Port 22, which is used for SSH access to the cluster
     *         EC2 instances, is in the list of
     *         <code>PermittedPublicSecurityGroupRuleRanges</code>.
     *         </p>
     */
    public java.util.List<PortRange> getPermittedPublicSecurityGroupRuleRanges() {
        return permittedPublicSecurityGroupRuleRanges;
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group
     * rules that allow inbound traffic from all public sources. For example, if
     * Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows
     * cluster creation if a security group associated with the cluster has a
     * rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6
     * port ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2
     * instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     *
     * @param permittedPublicSecurityGroupRuleRanges <p>
     *            Specifies ports and port ranges that are permitted to have
     *            security group rules that allow inbound traffic from all
     *            public sources. For example, if Port 23 (Telnet) is specified
     *            for <code>PermittedPublicSecurityGroupRuleRanges</code>,
     *            Amazon EMR allows cluster creation if a security group
     *            associated with the cluster has a rule that allows inbound
     *            traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port ::/0 as
     *            the source.
     *            </p>
     *            <p>
     *            By default, Port 22, which is used for SSH access to the
     *            cluster EC2 instances, is in the list of
     *            <code>PermittedPublicSecurityGroupRuleRanges</code>.
     *            </p>
     */
    public void setPermittedPublicSecurityGroupRuleRanges(
            java.util.Collection<PortRange> permittedPublicSecurityGroupRuleRanges) {
        if (permittedPublicSecurityGroupRuleRanges == null) {
            this.permittedPublicSecurityGroupRuleRanges = null;
            return;
        }

        this.permittedPublicSecurityGroupRuleRanges = new java.util.ArrayList<PortRange>(
                permittedPublicSecurityGroupRuleRanges);
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group
     * rules that allow inbound traffic from all public sources. For example, if
     * Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows
     * cluster creation if a security group associated with the cluster has a
     * rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6
     * port ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2
     * instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permittedPublicSecurityGroupRuleRanges <p>
     *            Specifies ports and port ranges that are permitted to have
     *            security group rules that allow inbound traffic from all
     *            public sources. For example, if Port 23 (Telnet) is specified
     *            for <code>PermittedPublicSecurityGroupRuleRanges</code>,
     *            Amazon EMR allows cluster creation if a security group
     *            associated with the cluster has a rule that allows inbound
     *            traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port ::/0 as
     *            the source.
     *            </p>
     *            <p>
     *            By default, Port 22, which is used for SSH access to the
     *            cluster EC2 instances, is in the list of
     *            <code>PermittedPublicSecurityGroupRuleRanges</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccessConfiguration withPermittedPublicSecurityGroupRuleRanges(
            PortRange... permittedPublicSecurityGroupRuleRanges) {
        if (getPermittedPublicSecurityGroupRuleRanges() == null) {
            this.permittedPublicSecurityGroupRuleRanges = new java.util.ArrayList<PortRange>(
                    permittedPublicSecurityGroupRuleRanges.length);
        }
        for (PortRange value : permittedPublicSecurityGroupRuleRanges) {
            this.permittedPublicSecurityGroupRuleRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies ports and port ranges that are permitted to have security group
     * rules that allow inbound traffic from all public sources. For example, if
     * Port 23 (Telnet) is specified for
     * <code>PermittedPublicSecurityGroupRuleRanges</code>, Amazon EMR allows
     * cluster creation if a security group associated with the cluster has a
     * rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6
     * port ::/0 as the source.
     * </p>
     * <p>
     * By default, Port 22, which is used for SSH access to the cluster EC2
     * instances, is in the list of
     * <code>PermittedPublicSecurityGroupRuleRanges</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permittedPublicSecurityGroupRuleRanges <p>
     *            Specifies ports and port ranges that are permitted to have
     *            security group rules that allow inbound traffic from all
     *            public sources. For example, if Port 23 (Telnet) is specified
     *            for <code>PermittedPublicSecurityGroupRuleRanges</code>,
     *            Amazon EMR allows cluster creation if a security group
     *            associated with the cluster has a rule that allows inbound
     *            traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port ::/0 as
     *            the source.
     *            </p>
     *            <p>
     *            By default, Port 22, which is used for SSH access to the
     *            cluster EC2 instances, is in the list of
     *            <code>PermittedPublicSecurityGroupRuleRanges</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccessConfiguration withPermittedPublicSecurityGroupRuleRanges(
            java.util.Collection<PortRange> permittedPublicSecurityGroupRuleRanges) {
        setPermittedPublicSecurityGroupRuleRanges(permittedPublicSecurityGroupRuleRanges);
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
        if (getBlockPublicSecurityGroupRules() != null)
            sb.append("BlockPublicSecurityGroupRules: " + getBlockPublicSecurityGroupRules() + ",");
        if (getPermittedPublicSecurityGroupRuleRanges() != null)
            sb.append("PermittedPublicSecurityGroupRuleRanges: "
                    + getPermittedPublicSecurityGroupRuleRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBlockPublicSecurityGroupRules() == null) ? 0
                        : getBlockPublicSecurityGroupRules().hashCode());
        hashCode = prime
                * hashCode
                + ((getPermittedPublicSecurityGroupRuleRanges() == null) ? 0
                        : getPermittedPublicSecurityGroupRuleRanges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockPublicAccessConfiguration == false)
            return false;
        BlockPublicAccessConfiguration other = (BlockPublicAccessConfiguration) obj;

        if (other.getBlockPublicSecurityGroupRules() == null
                ^ this.getBlockPublicSecurityGroupRules() == null)
            return false;
        if (other.getBlockPublicSecurityGroupRules() != null
                && other.getBlockPublicSecurityGroupRules().equals(
                        this.getBlockPublicSecurityGroupRules()) == false)
            return false;
        if (other.getPermittedPublicSecurityGroupRuleRanges() == null
                ^ this.getPermittedPublicSecurityGroupRuleRanges() == null)
            return false;
        if (other.getPermittedPublicSecurityGroupRuleRanges() != null
                && other.getPermittedPublicSecurityGroupRuleRanges().equals(
                        this.getPermittedPublicSecurityGroupRuleRanges()) == false)
            return false;
        return true;
    }
}
