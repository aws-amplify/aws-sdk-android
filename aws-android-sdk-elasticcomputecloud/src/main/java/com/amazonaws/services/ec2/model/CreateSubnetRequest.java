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
 * Creates a subnet in an existing VPC.
 * </p>
 * <p>
 * When you create each subnet, you provide the VPC ID and IPv4 CIDR block for
 * the subnet. After you create a subnet, you can't change its CIDR block. The
 * size of the subnet's IPv4 CIDR block can be the same as a VPC's IPv4 CIDR
 * block, or a subset of a VPC's IPv4 CIDR block. If you create more than one
 * subnet in a VPC, the subnets' CIDR blocks must not overlap. The smallest IPv4
 * subnet (and VPC) you can create uses a /28 netmask (16 IPv4 addresses), and
 * the largest uses a /16 netmask (65,536 IPv4 addresses).
 * </p>
 * <p>
 * If you've associated an IPv6 CIDR block with your VPC, you can create a
 * subnet with an IPv6 CIDR block that uses a /64 prefix length.
 * </p>
 * <important>
 * <p>
 * AWS reserves both the first four and the last IPv4 address in each subnet's
 * CIDR block. They're not available for use.
 * </p>
 * </important>
 * <p>
 * If you add more than one subnet to a VPC, they're set up in a star topology
 * with a logical router in the middle.
 * </p>
 * <p>
 * If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP
 * address doesn't change if you stop and restart the instance (unlike a similar
 * instance launched outside a VPC, which gets a new IP address when restarted).
 * It's therefore possible to have a subnet with no running instances (they're
 * all stopped), but no remaining IP addresses available.
 * </p>
 * <p>
 * For more information about subnets, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your
 * VPC and Subnets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class CreateSubnetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in
     * your VPC, we do not necessarily select a different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID,
     * for example <code>us-west-2-lax-1a</code>. For information about the
     * Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone
     * for the Outpost and specify the Outpost ARN.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     */
    private String availabilityZoneId;

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example,
     * <code>10.0.0.0/24</code>.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size
     * must use a /64 prefix length.
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

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
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in
     * your VPC, we do not necessarily select a different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID,
     * for example <code>us-west-2-lax-1a</code>. For information about the
     * Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone
     * for the Outpost and specify the Outpost ARN.
     * </p>
     *
     * @return <p>
     *         The Availability Zone or Local Zone for the subnet.
     *         </p>
     *         <p>
     *         Default: AWS selects one for you. If you create more than one
     *         subnet in your VPC, we do not necessarily select a different zone
     *         for each subnet.
     *         </p>
     *         <p>
     *         To create a subnet in a Local Zone, set this value to the Local
     *         Zone ID, for example <code>us-west-2-lax-1a</code>. For
     *         information about the Regions that support Local Zones, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     *         >Available Regions</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         To create a subnet in an Outpost, set this value to the
     *         Availability Zone for the Outpost and specify the Outpost ARN.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in
     * your VPC, we do not necessarily select a different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID,
     * for example <code>us-west-2-lax-1a</code>. For information about the
     * Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone
     * for the Outpost and specify the Outpost ARN.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone or Local Zone for the subnet.
     *            </p>
     *            <p>
     *            Default: AWS selects one for you. If you create more than one
     *            subnet in your VPC, we do not necessarily select a different
     *            zone for each subnet.
     *            </p>
     *            <p>
     *            To create a subnet in a Local Zone, set this value to the
     *            Local Zone ID, for example <code>us-west-2-lax-1a</code>. For
     *            information about the Regions that support Local Zones, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     *            >Available Regions</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            To create a subnet in an Outpost, set this value to the
     *            Availability Zone for the Outpost and specify the Outpost ARN.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone or Local Zone for the subnet.
     * </p>
     * <p>
     * Default: AWS selects one for you. If you create more than one subnet in
     * your VPC, we do not necessarily select a different zone for each subnet.
     * </p>
     * <p>
     * To create a subnet in a Local Zone, set this value to the Local Zone ID,
     * for example <code>us-west-2-lax-1a</code>. For information about the
     * Regions that support Local Zones, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     * >Available Regions</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * To create a subnet in an Outpost, set this value to the Availability Zone
     * for the Outpost and specify the Outpost ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone or Local Zone for the subnet.
     *            </p>
     *            <p>
     *            Default: AWS selects one for you. If you create more than one
     *            subnet in your VPC, we do not necessarily select a different
     *            zone for each subnet.
     *            </p>
     *            <p>
     *            To create a subnet in a Local Zone, set this value to the
     *            Local Zone ID, for example <code>us-west-2-lax-1a</code>. For
     *            information about the Regions that support Local Zones, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions"
     *            >Available Regions</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            To create a subnet in an Outpost, set this value to the
     *            Availability Zone for the Outpost and specify the Outpost ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSubnetRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The AZ ID or the Local Zone ID of the subnet.
     *         </p>
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     *
     * @param availabilityZoneId <p>
     *            The AZ ID or the Local Zone ID of the subnet.
     *            </p>
     */
    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The AZ ID or the Local Zone ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneId <p>
     *            The AZ ID or the Local Zone ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSubnetRequest withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example,
     * <code>10.0.0.0/24</code>.
     * </p>
     *
     * @return <p>
     *         The IPv4 network range for the subnet, in CIDR notation. For
     *         example, <code>10.0.0.0/24</code>.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example,
     * <code>10.0.0.0/24</code>.
     * </p>
     *
     * @param cidrBlock <p>
     *            The IPv4 network range for the subnet, in CIDR notation. For
     *            example, <code>10.0.0.0/24</code>.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the subnet, in CIDR notation. For example,
     * <code>10.0.0.0/24</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The IPv4 network range for the subnet, in CIDR notation. For
     *            example, <code>10.0.0.0/24</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSubnetRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size
     * must use a /64 prefix length.
     * </p>
     *
     * @return <p>
     *         The IPv6 network range for the subnet, in CIDR notation. The
     *         subnet size must use a /64 prefix length.
     *         </p>
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size
     * must use a /64 prefix length.
     * </p>
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 network range for the subnet, in CIDR notation. The
     *            subnet size must use a /64 prefix length.
     *            </p>
     */
    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size
     * must use a /64 prefix length.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 network range for the subnet, in CIDR notation. The
     *            subnet size must use a /64 prefix length.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSubnetRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSubnetRequest withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
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
    public CreateSubnetRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
    public CreateSubnetRequest withDryRun(Boolean dryRun) {
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: " + getAvailabilityZoneId() + ",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: " + getIpv6CidrBlock() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubnetRequest == false)
            return false;
        CreateSubnetRequest other = (CreateSubnetRequest) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null
                && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null
                && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
