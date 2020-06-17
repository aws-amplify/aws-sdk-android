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

/**
 * <p>
 * Describes an entry in a network ACL.
 * </p>
 */
public class NetworkAclEntry implements Serializable {
    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving
     * the subnet).
     * </p>
     */
    private Boolean egress;

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     */
    private IcmpTypeCode icmpTypeCode;

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     */
    private PortRange portRange;

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     */
    private String ruleAction;

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     *
     * @return <p>
     *         The IPv4 network range to allow or deny, in CIDR notation.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     *
     * @param cidrBlock <p>
     *            The IPv4 network range to allow or deny, in CIDR notation.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The IPv4 network range to allow or deny, in CIDR notation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclEntry withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving
     * the subnet).
     * </p>
     *
     * @return <p>
     *         Indicates whether the rule is an egress rule (applied to traffic
     *         leaving the subnet).
     *         </p>
     */
    public Boolean isEgress() {
        return egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving
     * the subnet).
     * </p>
     *
     * @return <p>
     *         Indicates whether the rule is an egress rule (applied to traffic
     *         leaving the subnet).
     *         </p>
     */
    public Boolean getEgress() {
        return egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving
     * the subnet).
     * </p>
     *
     * @param egress <p>
     *            Indicates whether the rule is an egress rule (applied to
     *            traffic leaving the subnet).
     *            </p>
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Indicates whether the rule is an egress rule (applied to traffic leaving
     * the subnet).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egress <p>
     *            Indicates whether the rule is an egress rule (applied to
     *            traffic leaving the subnet).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclEntry withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     *
     * @return <p>
     *         ICMP protocol: The ICMP type and code.
     *         </p>
     */
    public IcmpTypeCode getIcmpTypeCode() {
        return icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     *
     * @param icmpTypeCode <p>
     *            ICMP protocol: The ICMP type and code.
     *            </p>
     */
    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP type and code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param icmpTypeCode <p>
     *            ICMP protocol: The ICMP type and code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclEntry withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
        return this;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     *
     * @return <p>
     *         The IPv6 network range to allow or deny, in CIDR notation.
     *         </p>
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 network range to allow or deny, in CIDR notation.
     *            </p>
     */
    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 network range to allow or deny, in CIDR notation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclEntry withIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     *
     * @return <p>
     *         TCP or UDP protocols: The range of ports the rule applies to.
     *         </p>
     */
    public PortRange getPortRange() {
        return portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     *
     * @param portRange <p>
     *            TCP or UDP protocols: The range of ports the rule applies to.
     *            </p>
     */
    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portRange <p>
     *            TCP or UDP protocols: The range of ports the rule applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclEntry withPortRange(PortRange portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     *
     * @return <p>
     *         The protocol number. A value of "-1" means all protocols.
     *         </p>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     *
     * @param protocol <p>
     *            The protocol number. A value of "-1" means all protocols.
     *            </p>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol number. A value of "-1" means all protocols.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclEntry withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @return <p>
     *         Indicates whether to allow or deny the traffic that matches the
     *         rule.
     *         </p>
     * @see RuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction <p>
     *            Indicates whether to allow or deny the traffic that matches
     *            the rule.
     *            </p>
     * @see RuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction <p>
     *            Indicates whether to allow or deny the traffic that matches
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RuleAction
     */
    public NetworkAclEntry withRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction <p>
     *            Indicates whether to allow or deny the traffic that matches
     *            the rule.
     *            </p>
     * @see RuleAction
     */
    public void setRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
    }

    /**
     * <p>
     * Indicates whether to allow or deny the traffic that matches the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction <p>
     *            Indicates whether to allow or deny the traffic that matches
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RuleAction
     */
    public NetworkAclEntry withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     * </p>
     *
     * @return <p>
     *         The rule number for the entry. ACL entries are processed in
     *         ascending order by rule number.
     *         </p>
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     * </p>
     *
     * @param ruleNumber <p>
     *            The rule number for the entry. ACL entries are processed in
     *            ascending order by rule number.
     *            </p>
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry. ACL entries are processed in ascending
     * order by rule number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleNumber <p>
     *            The rule number for the entry. ACL entries are processed in
     *            ascending order by rule number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclEntry withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getEgress() != null)
            sb.append("Egress: " + getEgress() + ",");
        if (getIcmpTypeCode() != null)
            sb.append("IcmpTypeCode: " + getIcmpTypeCode() + ",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: " + getIpv6CidrBlock() + ",");
        if (getPortRange() != null)
            sb.append("PortRange: " + getPortRange() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getRuleAction() != null)
            sb.append("RuleAction: " + getRuleAction() + ",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: " + getRuleNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        hashCode = prime * hashCode
                + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAclEntry == false)
            return false;
        NetworkAclEntry other = (NetworkAclEntry) obj;

        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getEgress() == null ^ this.getEgress() == null)
            return false;
        if (other.getEgress() != null && other.getEgress().equals(this.getEgress()) == false)
            return false;
        if (other.getIcmpTypeCode() == null ^ this.getIcmpTypeCode() == null)
            return false;
        if (other.getIcmpTypeCode() != null
                && other.getIcmpTypeCode().equals(this.getIcmpTypeCode()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null
                && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null
                && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null
                && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null)
            return false;
        if (other.getRuleNumber() != null
                && other.getRuleNumber().equals(this.getRuleNumber()) == false)
            return false;
        return true;
    }
}
