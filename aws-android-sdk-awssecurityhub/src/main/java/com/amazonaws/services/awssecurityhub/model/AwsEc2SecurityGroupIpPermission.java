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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * An IP permission for an EC2 security group.
 * </p>
 */
public class AwsEc2SecurityGroupIpPermission implements Serializable {
    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number
     * other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must
     * specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port
     * range, traffic for all types and codes is allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ipProtocol;

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer fromPort;

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     */
    private Integer toPort;

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupUserIdGroupPair> userIdGroupPairs;

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpRange> ipRanges;

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpv6Range> ipv6Ranges;

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules,
     * this is the AWS service to access through a VPC endpoint from instances
     * associated with the security group.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupPrefixListId> prefixListIds;

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number
     * other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must
     * specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port
     * range, traffic for all types and codes is allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *         <code>icmp</code>, <code>icmpv6</code>) or number.
     *         </p>
     *         <p>
     *         [VPC only] Use <code>-1</code> to specify all protocols.
     *         </p>
     *         <p>
     *         When authorizing security group rules, specifying -1 or a
     *         protocol number other than <code>tcp</code>, <code>udp</code>,
     *         <code>icmp</code>, or <code>icmpv6</code> allows traffic on all
     *         ports, regardless of any port range you specify.
     *         </p>
     *         <p>
     *         For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>,
     *         you must specify a port range.
     *         </p>
     *         <p>
     *         For <code>icmpv6</code>, the port range is optional. If you omit
     *         the port range, traffic for all types and codes is allowed.
     *         </p>
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number
     * other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must
     * specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port
     * range, traffic for all types and codes is allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ipProtocol <p>
     *            The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *            <code>icmp</code>, <code>icmpv6</code>) or number.
     *            </p>
     *            <p>
     *            [VPC only] Use <code>-1</code> to specify all protocols.
     *            </p>
     *            <p>
     *            When authorizing security group rules, specifying -1 or a
     *            protocol number other than <code>tcp</code>, <code>udp</code>,
     *            <code>icmp</code>, or <code>icmpv6</code> allows traffic on
     *            all ports, regardless of any port range you specify.
     *            </p>
     *            <p>
     *            For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>,
     *            you must specify a port range.
     *            </p>
     *            <p>
     *            For <code>icmpv6</code>, the port range is optional. If you
     *            omit the port range, traffic for all types and codes is
     *            allowed.
     *            </p>
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>, <code>icmpv6</code>) or number.
     * </p>
     * <p>
     * [VPC only] Use <code>-1</code> to specify all protocols.
     * </p>
     * <p>
     * When authorizing security group rules, specifying -1 or a protocol number
     * other than <code>tcp</code>, <code>udp</code>, <code>icmp</code>, or
     * <code>icmpv6</code> allows traffic on all ports, regardless of any port
     * range you specify.
     * </p>
     * <p>
     * For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>, you must
     * specify a port range.
     * </p>
     * <p>
     * For <code>icmpv6</code>, the port range is optional. If you omit the port
     * range, traffic for all types and codes is allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ipProtocol <p>
     *            The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *            <code>icmp</code>, <code>icmpv6</code>) or number.
     *            </p>
     *            <p>
     *            [VPC only] Use <code>-1</code> to specify all protocols.
     *            </p>
     *            <p>
     *            When authorizing security group rules, specifying -1 or a
     *            protocol number other than <code>tcp</code>, <code>udp</code>,
     *            <code>icmp</code>, or <code>icmpv6</code> allows traffic on
     *            all ports, regardless of any port range you specify.
     *            </p>
     *            <p>
     *            For <code>tcp</code>, <code>udp</code>, and <code>icmp</code>,
     *            you must specify a port range.
     *            </p>
     *            <p>
     *            For <code>icmpv6</code>, the port range is optional. If you
     *            omit the port range, traffic for all types and codes is
     *            allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     *
     * @return <p>
     *         The start of the port range for the TCP and UDP protocols, or an
     *         ICMP/ICMPv6 type number.
     *         </p>
     *         <p>
     *         A value of -1 indicates all ICMP/ICMPv6 types. If you specify all
     *         ICMP/ICMPv6 types, you must specify all codes.
     *         </p>
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     *
     * @param fromPort <p>
     *            The start of the port range for the TCP and UDP protocols, or
     *            an ICMP/ICMPv6 type number.
     *            </p>
     *            <p>
     *            A value of -1 indicates all ICMP/ICMPv6 types. If you specify
     *            all ICMP/ICMPv6 types, you must specify all codes.
     *            </p>
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 type number.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 types. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromPort <p>
     *            The start of the port range for the TCP and UDP protocols, or
     *            an ICMP/ICMPv6 type number.
     *            </p>
     *            <p>
     *            A value of -1 indicates all ICMP/ICMPv6 types. If you specify
     *            all ICMP/ICMPv6 types, you must specify all codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     *
     * @return <p>
     *         The end of the port range for the TCP and UDP protocols, or an
     *         ICMP/ICMPv6 code.
     *         </p>
     *         <p>
     *         A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all
     *         ICMP/ICMPv6 types, you must specify all codes.
     *         </p>
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     *
     * @param toPort <p>
     *            The end of the port range for the TCP and UDP protocols, or an
     *            ICMP/ICMPv6 code.
     *            </p>
     *            <p>
     *            A value of -1 indicates all ICMP/ICMPv6 codes. If you specify
     *            all ICMP/ICMPv6 types, you must specify all codes.
     *            </p>
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an
     * ICMP/ICMPv6 code.
     * </p>
     * <p>
     * A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all
     * ICMP/ICMPv6 types, you must specify all codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toPort <p>
     *            The end of the port range for the TCP and UDP protocols, or an
     *            ICMP/ICMPv6 code.
     *            </p>
     *            <p>
     *            A value of -1 indicates all ICMP/ICMPv6 codes. If you specify
     *            all ICMP/ICMPv6 types, you must specify all codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     *
     * @return <p>
     *         The security group and AWS account ID pairs.
     *         </p>
     */
    public java.util.List<AwsEc2SecurityGroupUserIdGroupPair> getUserIdGroupPairs() {
        return userIdGroupPairs;
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     *
     * @param userIdGroupPairs <p>
     *            The security group and AWS account ID pairs.
     *            </p>
     */
    public void setUserIdGroupPairs(
            java.util.Collection<AwsEc2SecurityGroupUserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
            return;
        }

        this.userIdGroupPairs = new java.util.ArrayList<AwsEc2SecurityGroupUserIdGroupPair>(
                userIdGroupPairs);
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdGroupPairs <p>
     *            The security group and AWS account ID pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withUserIdGroupPairs(
            AwsEc2SecurityGroupUserIdGroupPair... userIdGroupPairs) {
        if (getUserIdGroupPairs() == null) {
            this.userIdGroupPairs = new java.util.ArrayList<AwsEc2SecurityGroupUserIdGroupPair>(
                    userIdGroupPairs.length);
        }
        for (AwsEc2SecurityGroupUserIdGroupPair value : userIdGroupPairs) {
            this.userIdGroupPairs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security group and AWS account ID pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdGroupPairs <p>
     *            The security group and AWS account ID pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withUserIdGroupPairs(
            java.util.Collection<AwsEc2SecurityGroupUserIdGroupPair> userIdGroupPairs) {
        setUserIdGroupPairs(userIdGroupPairs);
        return this;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     *
     * @return <p>
     *         The IPv4 ranges.
     *         </p>
     */
    public java.util.List<AwsEc2SecurityGroupIpRange> getIpRanges() {
        return ipRanges;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     *
     * @param ipRanges <p>
     *            The IPv4 ranges.
     *            </p>
     */
    public void setIpRanges(java.util.Collection<AwsEc2SecurityGroupIpRange> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }

        this.ipRanges = new java.util.ArrayList<AwsEc2SecurityGroupIpRange>(ipRanges);
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipRanges <p>
     *            The IPv4 ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withIpRanges(AwsEc2SecurityGroupIpRange... ipRanges) {
        if (getIpRanges() == null) {
            this.ipRanges = new java.util.ArrayList<AwsEc2SecurityGroupIpRange>(ipRanges.length);
        }
        for (AwsEc2SecurityGroupIpRange value : ipRanges) {
            this.ipRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipRanges <p>
     *            The IPv4 ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withIpRanges(
            java.util.Collection<AwsEc2SecurityGroupIpRange> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     *
     * @return <p>
     *         The IPv6 ranges.
     *         </p>
     */
    public java.util.List<AwsEc2SecurityGroupIpv6Range> getIpv6Ranges() {
        return ipv6Ranges;
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     *
     * @param ipv6Ranges <p>
     *            The IPv6 ranges.
     *            </p>
     */
    public void setIpv6Ranges(java.util.Collection<AwsEc2SecurityGroupIpv6Range> ipv6Ranges) {
        if (ipv6Ranges == null) {
            this.ipv6Ranges = null;
            return;
        }

        this.ipv6Ranges = new java.util.ArrayList<AwsEc2SecurityGroupIpv6Range>(ipv6Ranges);
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Ranges <p>
     *            The IPv6 ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withIpv6Ranges(
            AwsEc2SecurityGroupIpv6Range... ipv6Ranges) {
        if (getIpv6Ranges() == null) {
            this.ipv6Ranges = new java.util.ArrayList<AwsEc2SecurityGroupIpv6Range>(
                    ipv6Ranges.length);
        }
        for (AwsEc2SecurityGroupIpv6Range value : ipv6Ranges) {
            this.ipv6Ranges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Ranges <p>
     *            The IPv6 ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withIpv6Ranges(
            java.util.Collection<AwsEc2SecurityGroupIpv6Range> ipv6Ranges) {
        setIpv6Ranges(ipv6Ranges);
        return this;
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules,
     * this is the AWS service to access through a VPC endpoint from instances
     * associated with the security group.
     * </p>
     *
     * @return <p>
     *         [VPC only] The prefix list IDs for an AWS service. With outbound
     *         rules, this is the AWS service to access through a VPC endpoint
     *         from instances associated with the security group.
     *         </p>
     */
    public java.util.List<AwsEc2SecurityGroupPrefixListId> getPrefixListIds() {
        return prefixListIds;
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules,
     * this is the AWS service to access through a VPC endpoint from instances
     * associated with the security group.
     * </p>
     *
     * @param prefixListIds <p>
     *            [VPC only] The prefix list IDs for an AWS service. With
     *            outbound rules, this is the AWS service to access through a
     *            VPC endpoint from instances associated with the security
     *            group.
     *            </p>
     */
    public void setPrefixListIds(java.util.Collection<AwsEc2SecurityGroupPrefixListId> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new java.util.ArrayList<AwsEc2SecurityGroupPrefixListId>(prefixListIds);
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules,
     * this is the AWS service to access through a VPC endpoint from instances
     * associated with the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListIds <p>
     *            [VPC only] The prefix list IDs for an AWS service. With
     *            outbound rules, this is the AWS service to access through a
     *            VPC endpoint from instances associated with the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withPrefixListIds(
            AwsEc2SecurityGroupPrefixListId... prefixListIds) {
        if (getPrefixListIds() == null) {
            this.prefixListIds = new java.util.ArrayList<AwsEc2SecurityGroupPrefixListId>(
                    prefixListIds.length);
        }
        for (AwsEc2SecurityGroupPrefixListId value : prefixListIds) {
            this.prefixListIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [VPC only] The prefix list IDs for an AWS service. With outbound rules,
     * this is the AWS service to access through a VPC endpoint from instances
     * associated with the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListIds <p>
     *            [VPC only] The prefix list IDs for an AWS service. With
     *            outbound rules, this is the AWS service to access through a
     *            VPC endpoint from instances associated with the security
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpPermission withPrefixListIds(
            java.util.Collection<AwsEc2SecurityGroupPrefixListId> prefixListIds) {
        setPrefixListIds(prefixListIds);
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
        if (getIpProtocol() != null)
            sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getFromPort() != null)
            sb.append("FromPort: " + getFromPort() + ",");
        if (getToPort() != null)
            sb.append("ToPort: " + getToPort() + ",");
        if (getUserIdGroupPairs() != null)
            sb.append("UserIdGroupPairs: " + getUserIdGroupPairs() + ",");
        if (getIpRanges() != null)
            sb.append("IpRanges: " + getIpRanges() + ",");
        if (getIpv6Ranges() != null)
            sb.append("Ipv6Ranges: " + getIpv6Ranges() + ",");
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: " + getPrefixListIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode
                + ((getUserIdGroupPairs() == null) ? 0 : getUserIdGroupPairs().hashCode());
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode());
        hashCode = prime * hashCode + ((getIpv6Ranges() == null) ? 0 : getIpv6Ranges().hashCode());
        hashCode = prime * hashCode
                + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupIpPermission == false)
            return false;
        AwsEc2SecurityGroupIpPermission other = (AwsEc2SecurityGroupIpPermission) obj;

        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null
                && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getUserIdGroupPairs() == null ^ this.getUserIdGroupPairs() == null)
            return false;
        if (other.getUserIdGroupPairs() != null
                && other.getUserIdGroupPairs().equals(this.getUserIdGroupPairs()) == false)
            return false;
        if (other.getIpRanges() == null ^ this.getIpRanges() == null)
            return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false)
            return false;
        if (other.getIpv6Ranges() == null ^ this.getIpv6Ranges() == null)
            return false;
        if (other.getIpv6Ranges() != null
                && other.getIpv6Ranges().equals(this.getIpv6Ranges()) == false)
            return false;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null
                && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        return true;
    }
}
