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
 * Adds the specified ingress rules to a security group.
 * </p>
 * <p>
 * An inbound rule permits instances to receive traffic from the specified IPv4
 * or IPv6 CIDR address ranges, or from the instances associated with the
 * specified destination security groups.
 * </p>
 * <p>
 * You specify a protocol for each rule (for example, TCP). For TCP and UDP, you
 * must also specify the destination port or port range. For ICMP/ICMPv6, you
 * must also specify the ICMP/ICMPv6 type and code. You can use -1 to mean all
 * types or all codes.
 * </p>
 * <p>
 * Rule changes are propagated to instances within the security group as quickly
 * as possible. However, a small delay might occur.
 * </p>
 * <p>
 * For more information about VPC security group limits, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html"
 * >Amazon VPC Limits</a>.
 * </p>
 */
public class AuthorizeSecurityGroupIngressRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The IPv4 address range, in CIDR format. You can't specify this parameter
     * when specifying a source security group. To specify an IPv6 address
     * range, use a set of IP permissions.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     */
    private String cidrIp;

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * types. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     */
    private Integer fromPort;

    /**
     * <p>
     * The ID of the security group. You must specify either the security group
     * ID or the security group name in the request. For security groups in a
     * nondefault VPC, you must specify the security group ID.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must
     * specify either the security group ID or the security group name in the
     * request.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The sets of IP permissions.
     * </p>
     */
    private java.util.List<IpPermission> ipPermissions;

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a>). To specify <code>icmpv6</code>, use a set of IP
     * permissions.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols. If you specify
     * <code>-1</code> or a protocol other than <code>tcp</code>,
     * <code>udp</code>, or <code>icmp</code>, traffic on all ports is allowed,
     * regardless of any ports you specify.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     */
    private String ipProtocol;

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range, the
     * IP protocol, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol
     * and port range, use a set of IP permissions instead. For EC2-VPC, the
     * source security group must be in the same VPC.
     * </p>
     */
    private String sourceSecurityGroupName;

    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the
     * source security group is in a different account. You can't specify this
     * parameter in combination with the following parameters: the CIDR IP
     * address range, the IP protocol, the start of the port range, and the end
     * of the port range. Creates rules that grant full ICMP, UDP, and TCP
     * access. To create a rule with a specific IP protocol and port range, use
     * a set of IP permissions instead.
     * </p>
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * codes. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     */
    private Integer toPort;

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
     * The IPv4 address range, in CIDR format. You can't specify this parameter
     * when specifying a source security group. To specify an IPv6 address
     * range, use a set of IP permissions.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR format. You can't specify this
     *         parameter when specifying a source security group. To specify an
     *         IPv6 address range, use a set of IP permissions.
     *         </p>
     *         <p>
     *         Alternatively, use a set of IP permissions to specify multiple
     *         rules and a description for the rule.
     *         </p>
     */
    public String getCidrIp() {
        return cidrIp;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR format. You can't specify this parameter
     * when specifying a source security group. To specify an IPv6 address
     * range, use a set of IP permissions.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @param cidrIp <p>
     *            The IPv4 address range, in CIDR format. You can't specify this
     *            parameter when specifying a source security group. To specify
     *            an IPv6 address range, use a set of IP permissions.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR format. You can't specify this parameter
     * when specifying a source security group. To specify an IPv6 address
     * range, use a set of IP permissions.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrIp <p>
     *            The IPv4 address range, in CIDR format. You can't specify this
     *            parameter when specifying a source security group. To specify
     *            an IPv6 address range, use a set of IP permissions.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * types. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @return <p>
     *         The start of port range for the TCP and UDP protocols, or an ICMP
     *         type number. For the ICMP type number, use <code>-1</code> to
     *         specify all types. If you specify all ICMP types, you must
     *         specify all codes.
     *         </p>
     *         <p>
     *         Alternatively, use a set of IP permissions to specify multiple
     *         rules and a description for the rule.
     *         </p>
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * types. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @param fromPort <p>
     *            The start of port range for the TCP and UDP protocols, or an
     *            ICMP type number. For the ICMP type number, use
     *            <code>-1</code> to specify all types. If you specify all ICMP
     *            types, you must specify all codes.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * types. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromPort <p>
     *            The start of port range for the TCP and UDP protocols, or an
     *            ICMP type number. For the ICMP type number, use
     *            <code>-1</code> to specify all types. If you specify all ICMP
     *            types, you must specify all codes.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group
     * ID or the security group name in the request. For security groups in a
     * nondefault VPC, you must specify the security group ID.
     * </p>
     *
     * @return <p>
     *         The ID of the security group. You must specify either the
     *         security group ID or the security group name in the request. For
     *         security groups in a nondefault VPC, you must specify the
     *         security group ID.
     *         </p>
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group
     * ID or the security group name in the request. For security groups in a
     * nondefault VPC, you must specify the security group ID.
     * </p>
     *
     * @param groupId <p>
     *            The ID of the security group. You must specify either the
     *            security group ID or the security group name in the request.
     *            For security groups in a nondefault VPC, you must specify the
     *            security group ID.
     *            </p>
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group. You must specify either the security group
     * ID or the security group name in the request. For security groups in a
     * nondefault VPC, you must specify the security group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupId <p>
     *            The ID of the security group. You must specify either the
     *            security group ID or the security group name in the request.
     *            For security groups in a nondefault VPC, you must specify the
     *            security group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must
     * specify either the security group ID or the security group name in the
     * request.
     * </p>
     *
     * @return <p>
     *         [EC2-Classic, default VPC] The name of the security group. You
     *         must specify either the security group ID or the security group
     *         name in the request.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must
     * specify either the security group ID or the security group name in the
     * request.
     * </p>
     *
     * @param groupName <p>
     *            [EC2-Classic, default VPC] The name of the security group. You
     *            must specify either the security group ID or the security
     *            group name in the request.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the security group. You must
     * specify either the security group ID or the security group name in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            [EC2-Classic, default VPC] The name of the security group. You
     *            must specify either the security group ID or the security
     *            group name in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The sets of IP permissions.
     * </p>
     *
     * @return <p>
     *         The sets of IP permissions.
     *         </p>
     */
    public java.util.List<IpPermission> getIpPermissions() {
        return ipPermissions;
    }

    /**
     * <p>
     * The sets of IP permissions.
     * </p>
     *
     * @param ipPermissions <p>
     *            The sets of IP permissions.
     *            </p>
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new java.util.ArrayList<IpPermission>(ipPermissions);
    }

    /**
     * <p>
     * The sets of IP permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissions <p>
     *            The sets of IP permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (getIpPermissions() == null) {
            this.ipPermissions = new java.util.ArrayList<IpPermission>(ipPermissions.length);
        }
        for (IpPermission value : ipPermissions) {
            this.ipPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The sets of IP permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissions <p>
     *            The sets of IP permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withIpPermissions(
            java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a>). To specify <code>icmpv6</code>, use a set of IP
     * permissions.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols. If you specify
     * <code>-1</code> or a protocol other than <code>tcp</code>,
     * <code>udp</code>, or <code>icmp</code>, traffic on all ports is allowed,
     * regardless of any ports you specify.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @return <p>
     *         The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *         <code>icmp</code>) or number (see <a href=
     *         "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *         >Protocol Numbers</a>). To specify <code>icmpv6</code>, use a set
     *         of IP permissions.
     *         </p>
     *         <p>
     *         [VPC only] Use <code>-1</code> to specify all protocols. If you
     *         specify <code>-1</code> or a protocol other than <code>tcp</code>, <code>udp</code>, or <code>icmp</code>, traffic on all ports is
     *         allowed, regardless of any ports you specify.
     *         </p>
     *         <p>
     *         Alternatively, use a set of IP permissions to specify multiple
     *         rules and a description for the rule.
     *         </p>
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a>). To specify <code>icmpv6</code>, use a set of IP
     * permissions.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols. If you specify
     * <code>-1</code> or a protocol other than <code>tcp</code>,
     * <code>udp</code>, or <code>icmp</code>, traffic on all ports is allowed,
     * regardless of any ports you specify.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @param ipProtocol <p>
     *            The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *            <code>icmp</code>) or number (see <a href=
     *            "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *            >Protocol Numbers</a>). To specify <code>icmpv6</code>, use a
     *            set of IP permissions.
     *            </p>
     *            <p>
     *            [VPC only] Use <code>-1</code> to specify all protocols. If
     *            you specify <code>-1</code> or a protocol other than
     *            <code>tcp</code>, <code>udp</code>, or <code>icmp</code>,
     *            traffic on all ports is allowed, regardless of any ports you
     *            specify.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers</a>). To specify <code>icmpv6</code>, use a set of IP
     * permissions.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols. If you specify
     * <code>-1</code> or a protocol other than <code>tcp</code>,
     * <code>udp</code>, or <code>icmp</code>, traffic on all ports is allowed,
     * regardless of any ports you specify.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipProtocol <p>
     *            The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *            <code>icmp</code>) or number (see <a href=
     *            "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *            >Protocol Numbers</a>). To specify <code>icmpv6</code>, use a
     *            set of IP permissions.
     *            </p>
     *            <p>
     *            [VPC only] Use <code>-1</code> to specify all protocols. If
     *            you specify <code>-1</code> or a protocol other than
     *            <code>tcp</code>, <code>udp</code>, or <code>icmp</code>,
     *            traffic on all ports is allowed, regardless of any ports you
     *            specify.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range, the
     * IP protocol, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol
     * and port range, use a set of IP permissions instead. For EC2-VPC, the
     * source security group must be in the same VPC.
     * </p>
     *
     * @return <p>
     *         [EC2-Classic, default VPC] The name of the source security group.
     *         You can't specify this parameter in combination with the
     *         following parameters: the CIDR IP address range, the start of the
     *         port range, the IP protocol, and the end of the port range.
     *         Creates rules that grant full ICMP, UDP, and TCP access. To
     *         create a rule with a specific IP protocol and port range, use a
     *         set of IP permissions instead. For EC2-VPC, the source security
     *         group must be in the same VPC.
     *         </p>
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range, the
     * IP protocol, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol
     * and port range, use a set of IP permissions instead. For EC2-VPC, the
     * source security group must be in the same VPC.
     * </p>
     *
     * @param sourceSecurityGroupName <p>
     *            [EC2-Classic, default VPC] The name of the source security
     *            group. You can't specify this parameter in combination with
     *            the following parameters: the CIDR IP address range, the start
     *            of the port range, the IP protocol, and the end of the port
     *            range. Creates rules that grant full ICMP, UDP, and TCP
     *            access. To create a rule with a specific IP protocol and port
     *            range, use a set of IP permissions instead. For EC2-VPC, the
     *            source security group must be in the same VPC.
     *            </p>
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range, the
     * IP protocol, and the end of the port range. Creates rules that grant full
     * ICMP, UDP, and TCP access. To create a rule with a specific IP protocol
     * and port range, use a set of IP permissions instead. For EC2-VPC, the
     * source security group must be in the same VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSecurityGroupName <p>
     *            [EC2-Classic, default VPC] The name of the source security
     *            group. You can't specify this parameter in combination with
     *            the following parameters: the CIDR IP address range, the start
     *            of the port range, the IP protocol, and the end of the port
     *            range. Creates rules that grant full ICMP, UDP, and TCP
     *            access. To create a rule with a specific IP protocol and port
     *            range, use a set of IP permissions instead. For EC2-VPC, the
     *            source security group must be in the same VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupName(
            String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the
     * source security group is in a different account. You can't specify this
     * parameter in combination with the following parameters: the CIDR IP
     * address range, the IP protocol, the start of the port range, and the end
     * of the port range. Creates rules that grant full ICMP, UDP, and TCP
     * access. To create a rule with a specific IP protocol and port range, use
     * a set of IP permissions instead.
     * </p>
     *
     * @return <p>
     *         [nondefault VPC] The AWS account ID for the source security
     *         group, if the source security group is in a different account.
     *         You can't specify this parameter in combination with the
     *         following parameters: the CIDR IP address range, the IP protocol,
     *         the start of the port range, and the end of the port range.
     *         Creates rules that grant full ICMP, UDP, and TCP access. To
     *         create a rule with a specific IP protocol and port range, use a
     *         set of IP permissions instead.
     *         </p>
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the
     * source security group is in a different account. You can't specify this
     * parameter in combination with the following parameters: the CIDR IP
     * address range, the IP protocol, the start of the port range, and the end
     * of the port range. Creates rules that grant full ICMP, UDP, and TCP
     * access. To create a rule with a specific IP protocol and port range, use
     * a set of IP permissions instead.
     * </p>
     *
     * @param sourceSecurityGroupOwnerId <p>
     *            [nondefault VPC] The AWS account ID for the source security
     *            group, if the source security group is in a different account.
     *            You can't specify this parameter in combination with the
     *            following parameters: the CIDR IP address range, the IP
     *            protocol, the start of the port range, and the end of the port
     *            range. Creates rules that grant full ICMP, UDP, and TCP
     *            access. To create a rule with a specific IP protocol and port
     *            range, use a set of IP permissions instead.
     *            </p>
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * [nondefault VPC] The AWS account ID for the source security group, if the
     * source security group is in a different account. You can't specify this
     * parameter in combination with the following parameters: the CIDR IP
     * address range, the IP protocol, the start of the port range, and the end
     * of the port range. Creates rules that grant full ICMP, UDP, and TCP
     * access. To create a rule with a specific IP protocol and port range, use
     * a set of IP permissions instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSecurityGroupOwnerId <p>
     *            [nondefault VPC] The AWS account ID for the source security
     *            group, if the source security group is in a different account.
     *            You can't specify this parameter in combination with the
     *            following parameters: the CIDR IP address range, the IP
     *            protocol, the start of the port range, and the end of the port
     *            range. Creates rules that grant full ICMP, UDP, and TCP
     *            access. To create a rule with a specific IP protocol and port
     *            range, use a set of IP permissions instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(
            String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * codes. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @return <p>
     *         The end of port range for the TCP and UDP protocols, or an ICMP
     *         code number. For the ICMP code number, use <code>-1</code> to
     *         specify all codes. If you specify all ICMP types, you must
     *         specify all codes.
     *         </p>
     *         <p>
     *         Alternatively, use a set of IP permissions to specify multiple
     *         rules and a description for the rule.
     *         </p>
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * codes. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     *
     * @param toPort <p>
     *            The end of port range for the TCP and UDP protocols, or an
     *            ICMP code number. For the ICMP code number, use
     *            <code>-1</code> to specify all codes. If you specify all ICMP
     *            types, you must specify all codes.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * codes. If you specify all ICMP types, you must specify all codes.
     * </p>
     * <p>
     * Alternatively, use a set of IP permissions to specify multiple rules and
     * a description for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toPort <p>
     *            The end of port range for the TCP and UDP protocols, or an
     *            ICMP code number. For the ICMP code number, use
     *            <code>-1</code> to specify all codes. If you specify all ICMP
     *            types, you must specify all codes.
     *            </p>
     *            <p>
     *            Alternatively, use a set of IP permissions to specify multiple
     *            rules and a description for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupIngressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
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
    public AuthorizeSecurityGroupIngressRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getCidrIp() != null)
            sb.append("CidrIp: " + getCidrIp() + ",");
        if (getFromPort() != null)
            sb.append("FromPort: " + getFromPort() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: " + getIpPermissions() + ",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getSourceSecurityGroupName() != null)
            sb.append("SourceSecurityGroupName: " + getSourceSecurityGroupName() + ",");
        if (getSourceSecurityGroupOwnerId() != null)
            sb.append("SourceSecurityGroupOwnerId: " + getSourceSecurityGroupOwnerId() + ",");
        if (getToPort() != null)
            sb.append("ToPort: " + getToPort() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId()
                        .hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeSecurityGroupIngressRequest == false)
            return false;
        AuthorizeSecurityGroupIngressRequest other = (AuthorizeSecurityGroupIngressRequest) obj;

        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null
                && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null
                && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null)
            return false;
        if (other.getSourceSecurityGroupName() != null
                && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false)
            return false;
        if (other.getSourceSecurityGroupOwnerId() == null
                ^ this.getSourceSecurityGroupOwnerId() == null)
            return false;
        if (other.getSourceSecurityGroupOwnerId() != null
                && other.getSourceSecurityGroupOwnerId().equals(
                        this.getSourceSecurityGroupOwnerId()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
