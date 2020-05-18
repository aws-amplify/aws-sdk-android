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
 * Creates an entry (a rule) in a network ACL with the specified rule number.
 * Each network ACL has a set of numbered ingress rules and a separate set of
 * numbered egress rules. When determining whether a packet should be allowed in
 * or out of a subnet associated with the ACL, we process the entries in the ACL
 * according to the rule numbers, in ascending order. Each network ACL has a set
 * of ingress rules and a separate set of egress rules.
 * </p>
 * <p>
 * We recommend that you leave room between the rule numbers (for example, 100,
 * 110, 120, ...), and not number them one right after the other (for example,
 * 101, 102, 103, ...). This makes it easier to add a rule between existing ones
 * without having to renumber the rules.
 * </p>
 * <p>
 * After you add an entry, you can't modify it; you must either replace it, or
 * create an entry and delete the old one.
 * </p>
 * <p>
 * For more information about network ACLs, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">Network
 * ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class CreateNetworkAclEntryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     * </p>
     */
    private Boolean egress;

    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying
     * protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
     * </p>
     */
    private IcmpTypeCode icmpTypeCode;

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example
     * <code>2001:db8:1234:1a00::/64</code>).
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     */
    private String networkAclId;

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if
     * specifying protocol 6 (TCP) or 17 (UDP).
     * </p>
     */
    private PortRange portRange;

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify
     * "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1"
     * (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP
     * types or codes that you specify. If you specify protocol "58" (ICMPv6)
     * and specify an IPv4 CIDR block, traffic for all ICMP types and codes
     * allowed, regardless of any that you specify. If you specify protocol "58"
     * (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type
     * and code.
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
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number.
     * </p>
     * <p>
     * Constraints: Positive integer from 1 to 32766. The range 32767 to 65535
     * is reserved for internal use.
     * </p>
     */
    private Integer ruleNumber;

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     * </p>
     *
     * @return <p>
     *         The IPv4 network range to allow or deny, in CIDR notation (for
     *         example <code>172.16.0.0/24</code>).
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     * </p>
     *
     * @param cidrBlock <p>
     *            The IPv4 network range to allow or deny, in CIDR notation (for
     *            example <code>172.16.0.0/24</code>).
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The IPv4 network range to allow or deny, in CIDR notation (for
     *            example <code>172.16.0.0/24</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     * </p>
     *
     * @return <p>
     *         Indicates whether this is an egress rule (rule is applied to
     *         traffic leaving the subnet).
     *         </p>
     */
    public Boolean isEgress() {
        return egress;
    }

    /**
     * <p>
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     * </p>
     *
     * @return <p>
     *         Indicates whether this is an egress rule (rule is applied to
     *         traffic leaving the subnet).
     *         </p>
     */
    public Boolean getEgress() {
        return egress;
    }

    /**
     * <p>
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     * </p>
     *
     * @param egress <p>
     *            Indicates whether this is an egress rule (rule is applied to
     *            traffic leaving the subnet).
     *            </p>
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    /**
     * <p>
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param egress <p>
     *            Indicates whether this is an egress rule (rule is applied to
     *            traffic leaving the subnet).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying
     * protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
     * </p>
     *
     * @return <p>
     *         ICMP protocol: The ICMP or ICMPv6 type and code. Required if
     *         specifying protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6
     *         CIDR block.
     *         </p>
     */
    public IcmpTypeCode getIcmpTypeCode() {
        return icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying
     * protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
     * </p>
     *
     * @param icmpTypeCode <p>
     *            ICMP protocol: The ICMP or ICMPv6 type and code. Required if
     *            specifying protocol 1 (ICMP) or protocol 58 (ICMPv6) with an
     *            IPv6 CIDR block.
     *            </p>
     */
    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }

    /**
     * <p>
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying
     * protocol 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param icmpTypeCode <p>
     *            ICMP protocol: The ICMP or ICMPv6 type and code. Required if
     *            specifying protocol 1 (ICMP) or protocol 58 (ICMPv6) with an
     *            IPv6 CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
        return this;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example
     * <code>2001:db8:1234:1a00::/64</code>).
     * </p>
     *
     * @return <p>
     *         The IPv6 network range to allow or deny, in CIDR notation (for
     *         example <code>2001:db8:1234:1a00::/64</code>).
     *         </p>
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example
     * <code>2001:db8:1234:1a00::/64</code>).
     * </p>
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 network range to allow or deny, in CIDR notation (for
     *            example <code>2001:db8:1234:1a00::/64</code>).
     *            </p>
     */
    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range to allow or deny, in CIDR notation (for example
     * <code>2001:db8:1234:1a00::/64</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 network range to allow or deny, in CIDR notation (for
     *            example <code>2001:db8:1234:1a00::/64</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     *
     * @return <p>
     *         The ID of the network ACL.
     *         </p>
     */
    public String getNetworkAclId() {
        return networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     *
     * @param networkAclId <p>
     *            The ID of the network ACL.
     *            </p>
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkAclId <p>
     *            The ID of the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if
     * specifying protocol 6 (TCP) or 17 (UDP).
     * </p>
     *
     * @return <p>
     *         TCP or UDP protocols: The range of ports the rule applies to.
     *         Required if specifying protocol 6 (TCP) or 17 (UDP).
     *         </p>
     */
    public PortRange getPortRange() {
        return portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if
     * specifying protocol 6 (TCP) or 17 (UDP).
     * </p>
     *
     * @param portRange <p>
     *            TCP or UDP protocols: The range of ports the rule applies to.
     *            Required if specifying protocol 6 (TCP) or 17 (UDP).
     *            </p>
     */
    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * TCP or UDP protocols: The range of ports the rule applies to. Required if
     * specifying protocol 6 (TCP) or 17 (UDP).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portRange <p>
     *            TCP or UDP protocols: The range of ports the rule applies to.
     *            Required if specifying protocol 6 (TCP) or 17 (UDP).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withPortRange(PortRange portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify
     * "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1"
     * (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP
     * types or codes that you specify. If you specify protocol "58" (ICMPv6)
     * and specify an IPv4 CIDR block, traffic for all ICMP types and codes
     * allowed, regardless of any that you specify. If you specify protocol "58"
     * (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type
     * and code.
     * </p>
     *
     * @return <p>
     *         The protocol number. A value of "-1" means all protocols. If you
     *         specify "-1" or a protocol number other than "6" (TCP), "17"
     *         (UDP), or "1" (ICMP), traffic on all ports is allowed, regardless
     *         of any ports or ICMP types or codes that you specify. If you
     *         specify protocol "58" (ICMPv6) and specify an IPv4 CIDR block,
     *         traffic for all ICMP types and codes allowed, regardless of any
     *         that you specify. If you specify protocol "58" (ICMPv6) and
     *         specify an IPv6 CIDR block, you must specify an ICMP type and
     *         code.
     *         </p>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify
     * "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1"
     * (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP
     * types or codes that you specify. If you specify protocol "58" (ICMPv6)
     * and specify an IPv4 CIDR block, traffic for all ICMP types and codes
     * allowed, regardless of any that you specify. If you specify protocol "58"
     * (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type
     * and code.
     * </p>
     *
     * @param protocol <p>
     *            The protocol number. A value of "-1" means all protocols. If
     *            you specify "-1" or a protocol number other than "6" (TCP),
     *            "17" (UDP), or "1" (ICMP), traffic on all ports is allowed,
     *            regardless of any ports or ICMP types or codes that you
     *            specify. If you specify protocol "58" (ICMPv6) and specify an
     *            IPv4 CIDR block, traffic for all ICMP types and codes allowed,
     *            regardless of any that you specify. If you specify protocol
     *            "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify
     *            an ICMP type and code.
     *            </p>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol number. A value of "-1" means all protocols. If you specify
     * "-1" or a protocol number other than "6" (TCP), "17" (UDP), or "1"
     * (ICMP), traffic on all ports is allowed, regardless of any ports or ICMP
     * types or codes that you specify. If you specify protocol "58" (ICMPv6)
     * and specify an IPv4 CIDR block, traffic for all ICMP types and codes
     * allowed, regardless of any that you specify. If you specify protocol "58"
     * (ICMPv6) and specify an IPv6 CIDR block, you must specify an ICMP type
     * and code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol number. A value of "-1" means all protocols. If
     *            you specify "-1" or a protocol number other than "6" (TCP),
     *            "17" (UDP), or "1" (ICMP), traffic on all ports is allowed,
     *            regardless of any ports or ICMP types or codes that you
     *            specify. If you specify protocol "58" (ICMPv6) and specify an
     *            IPv4 CIDR block, traffic for all ICMP types and codes allowed,
     *            regardless of any that you specify. If you specify protocol
     *            "58" (ICMPv6) and specify an IPv6 CIDR block, you must specify
     *            an ICMP type and code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withProtocol(String protocol) {
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
    public CreateNetworkAclEntryRequest withRuleAction(String ruleAction) {
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
    public CreateNetworkAclEntryRequest withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number.
     * </p>
     * <p>
     * Constraints: Positive integer from 1 to 32766. The range 32767 to 65535
     * is reserved for internal use.
     * </p>
     *
     * @return <p>
     *         The rule number for the entry (for example, 100). ACL entries are
     *         processed in ascending order by rule number.
     *         </p>
     *         <p>
     *         Constraints: Positive integer from 1 to 32766. The range 32767 to
     *         65535 is reserved for internal use.
     *         </p>
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number.
     * </p>
     * <p>
     * Constraints: Positive integer from 1 to 32766. The range 32767 to 65535
     * is reserved for internal use.
     * </p>
     *
     * @param ruleNumber <p>
     *            The rule number for the entry (for example, 100). ACL entries
     *            are processed in ascending order by rule number.
     *            </p>
     *            <p>
     *            Constraints: Positive integer from 1 to 32766. The range 32767
     *            to 65535 is reserved for internal use.
     *            </p>
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number.
     * </p>
     * <p>
     * Constraints: Positive integer from 1 to 32766. The range 32767 to 65535
     * is reserved for internal use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleNumber <p>
     *            The rule number for the entry (for example, 100). ACL entries
     *            are processed in ascending order by rule number.
     *            </p>
     *            <p>
     *            Constraints: Positive integer from 1 to 32766. The range 32767
     *            to 65535 is reserved for internal use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNetworkAclEntryRequest withRuleNumber(Integer ruleNumber) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEgress() != null)
            sb.append("Egress: " + getEgress() + ",");
        if (getIcmpTypeCode() != null)
            sb.append("IcmpTypeCode: " + getIcmpTypeCode() + ",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: " + getIpv6CidrBlock() + ",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: " + getNetworkAclId() + ",");
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getEgress() == null) ? 0 : getEgress().hashCode());
        hashCode = prime * hashCode
                + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
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

        if (obj instanceof CreateNetworkAclEntryRequest == false)
            return false;
        CreateNetworkAclEntryRequest other = (CreateNetworkAclEntryRequest) obj;

        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null
                && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
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
