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
 * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you can
 * create uses a /28 netmask (16 IPv4 addresses), and the largest uses a /16
 * netmask (65,536 IPv4 addresses). For more information about how large to make
 * your VPC, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your
 * VPC and Subnets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 * <p>
 * You can optionally request an IPv6 CIDR block for the VPC. You can request an
 * Amazon-provided IPv6 CIDR block from Amazon's pool of IPv6 addresses, or an
 * IPv6 CIDR block from an IPv6 address pool that you provisioned through bring
 * your own IP addresses (<a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html"
 * >BYOIP</a>).
 * </p>
 * <p>
 * By default, each instance you launch in the VPC has the default DHCP options,
 * which include only a default DNS server that we provide (AmazonProvidedDNS).
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html">DHCP
 * Options Sets</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 * <p>
 * You can specify the instance tenancy value for the VPC when you create it.
 * You can't change this value for the VPC after you create it. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html"
 * >Dedicated Instances</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class CreateVpcRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IP addresses, or the size of the
     * CIDR block.
     * </p>
     */
    private Boolean amazonProvidedIpv6CidrBlock;

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     */
    private String ipv6Pool;

    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     */
    private String ipv6CidrBlock;

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
     * The tenancy options for instances launched into the VPC. For
     * <code>default</code>, instances are launched with shared tenancy by
     * default. You can launch instances with any tenancy into a shared tenancy
     * VPC. For <code>dedicated</code>, instances are launched as dedicated
     * tenancy instances by default. You can only launch instances with a
     * tenancy of <code>dedicated</code> or <code>host</code> into a dedicated
     * tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String instanceTenancy;

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the address to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     */
    private String ipv6CidrBlockNetworkBorderGroup;

    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     * </p>
     *
     * @return <p>
     *         The IPv4 network range for the VPC, in CIDR notation. For
     *         example, <code>10.0.0.0/16</code>.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     * </p>
     *
     * @param cidrBlock <p>
     *            The IPv4 network range for the VPC, in CIDR notation. For
     *            example, <code>10.0.0.0/16</code>.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 network range for the VPC, in CIDR notation. For example,
     * <code>10.0.0.0/16</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The IPv4 network range for the VPC, in CIDR notation. For
     *            example, <code>10.0.0.0/16</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IP addresses, or the size of the
     * CIDR block.
     * </p>
     *
     * @return <p>
     *         Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *         length for the VPC. You cannot specify the range of IP addresses,
     *         or the size of the CIDR block.
     *         </p>
     */
    public Boolean isAmazonProvidedIpv6CidrBlock() {
        return amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IP addresses, or the size of the
     * CIDR block.
     * </p>
     *
     * @return <p>
     *         Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *         length for the VPC. You cannot specify the range of IP addresses,
     *         or the size of the CIDR block.
     *         </p>
     */
    public Boolean getAmazonProvidedIpv6CidrBlock() {
        return amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IP addresses, or the size of the
     * CIDR block.
     * </p>
     *
     * @param amazonProvidedIpv6CidrBlock <p>
     *            Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *            length for the VPC. You cannot specify the range of IP
     *            addresses, or the size of the CIDR block.
     *            </p>
     */
    public void setAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
    }

    /**
     * <p>
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for
     * the VPC. You cannot specify the range of IP addresses, or the size of the
     * CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonProvidedIpv6CidrBlock <p>
     *            Requests an Amazon-provided IPv6 CIDR block with a /56 prefix
     *            length for the VPC. You cannot specify the range of IP
     *            addresses, or the size of the CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcRequest withAmazonProvidedIpv6CidrBlock(Boolean amazonProvidedIpv6CidrBlock) {
        this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock;
        return this;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     *
     * @return <p>
     *         The ID of an IPv6 address pool from which to allocate the IPv6
     *         CIDR block.
     *         </p>
     */
    public String getIpv6Pool() {
        return ipv6Pool;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     *
     * @param ipv6Pool <p>
     *            The ID of an IPv6 address pool from which to allocate the IPv6
     *            CIDR block.
     *            </p>
     */
    public void setIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
    }

    /**
     * <p>
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR
     * block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Pool <p>
     *            The ID of an IPv6 address pool from which to allocate the IPv6
     *            CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcRequest withIpv6Pool(String ipv6Pool) {
        this.ipv6Pool = ipv6Pool;
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR block from the IPv6 address pool. You must also
     *         specify <code>Ipv6Pool</code> in the request.
     *         </p>
     *         <p>
     *         To let Amazon choose the IPv6 CIDR block for you, omit this
     *         parameter.
     *         </p>
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 CIDR block from the IPv6 address pool. You must also
     *            specify <code>Ipv6Pool</code> in the request.
     *            </p>
     *            <p>
     *            To let Amazon choose the IPv6 CIDR block for you, omit this
     *            parameter.
     *            </p>
     */
    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify
     * <code>Ipv6Pool</code> in the request.
     * </p>
     * <p>
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlock <p>
     *            The IPv6 CIDR block from the IPv6 address pool. You must also
     *            specify <code>Ipv6Pool</code> in the request.
     *            </p>
     *            <p>
     *            To let Amazon choose the IPv6 CIDR block for you, omit this
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcRequest withIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
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
    public CreateVpcRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For
     * <code>default</code>, instances are launched with shared tenancy by
     * default. You can launch instances with any tenancy into a shared tenancy
     * VPC. For <code>dedicated</code>, instances are launched as dedicated
     * tenancy instances by default. You can only launch instances with a
     * tenancy of <code>dedicated</code> or <code>host</code> into a dedicated
     * tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return <p>
     *         The tenancy options for instances launched into the VPC. For
     *         <code>default</code>, instances are launched with shared tenancy
     *         by default. You can launch instances with any tenancy into a
     *         shared tenancy VPC. For <code>dedicated</code>, instances are
     *         launched as dedicated tenancy instances by default. You can only
     *         launch instances with a tenancy of <code>dedicated</code> or
     *         <code>host</code> into a dedicated tenancy VPC.
     *         </p>
     *         <p>
     *         <b>Important:</b> The <code>host</code> value cannot be used with
     *         this parameter. Use the <code>default</code> or
     *         <code>dedicated</code> values only.
     *         </p>
     *         <p>
     *         Default: <code>default</code>
     *         </p>
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For
     * <code>default</code>, instances are launched with shared tenancy by
     * default. You can launch instances with any tenancy into a shared tenancy
     * VPC. For <code>dedicated</code>, instances are launched as dedicated
     * tenancy instances by default. You can only launch instances with a
     * tenancy of <code>dedicated</code> or <code>host</code> into a dedicated
     * tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy options for instances launched into the VPC. For
     *            <code>default</code>, instances are launched with shared
     *            tenancy by default. You can launch instances with any tenancy
     *            into a shared tenancy VPC. For <code>dedicated</code>,
     *            instances are launched as dedicated tenancy instances by
     *            default. You can only launch instances with a tenancy of
     *            <code>dedicated</code> or <code>host</code> into a dedicated
     *            tenancy VPC.
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For
     * <code>default</code>, instances are launched with shared tenancy by
     * default. You can launch instances with any tenancy into a shared tenancy
     * VPC. For <code>dedicated</code>, instances are launched as dedicated
     * tenancy instances by default. You can only launch instances with a
     * tenancy of <code>dedicated</code> or <code>host</code> into a dedicated
     * tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy options for instances launched into the VPC. For
     *            <code>default</code>, instances are launched with shared
     *            tenancy by default. You can launch instances with any tenancy
     *            into a shared tenancy VPC. For <code>dedicated</code>,
     *            instances are launched as dedicated tenancy instances by
     *            default. You can only launch instances with a tenancy of
     *            <code>dedicated</code> or <code>host</code> into a dedicated
     *            tenancy VPC.
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public CreateVpcRequest withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For
     * <code>default</code>, instances are launched with shared tenancy by
     * default. You can launch instances with any tenancy into a shared tenancy
     * VPC. For <code>dedicated</code>, instances are launched as dedicated
     * tenancy instances by default. You can only launch instances with a
     * tenancy of <code>dedicated</code> or <code>host</code> into a dedicated
     * tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy options for instances launched into the VPC. For
     *            <code>default</code>, instances are launched with shared
     *            tenancy by default. You can launch instances with any tenancy
     *            into a shared tenancy VPC. For <code>dedicated</code>,
     *            instances are launched as dedicated tenancy instances by
     *            default. You can only launch instances with a tenancy of
     *            <code>dedicated</code> or <code>host</code> into a dedicated
     *            tenancy VPC.
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }

    /**
     * <p>
     * The tenancy options for instances launched into the VPC. For
     * <code>default</code>, instances are launched with shared tenancy by
     * default. You can launch instances with any tenancy into a shared tenancy
     * VPC. For <code>dedicated</code>, instances are launched as dedicated
     * tenancy instances by default. You can only launch instances with a
     * tenancy of <code>dedicated</code> or <code>host</code> into a dedicated
     * tenancy VPC.
     * </p>
     * <p>
     * <b>Important:</b> The <code>host</code> value cannot be used with this
     * parameter. Use the <code>default</code> or <code>dedicated</code> values
     * only.
     * </p>
     * <p>
     * Default: <code>default</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy options for instances launched into the VPC. For
     *            <code>default</code>, instances are launched with shared
     *            tenancy by default. You can launch instances with any tenancy
     *            into a shared tenancy VPC. For <code>dedicated</code>,
     *            instances are launched as dedicated tenancy instances by
     *            default. You can only launch instances with a tenancy of
     *            <code>dedicated</code> or <code>host</code> into a dedicated
     *            tenancy VPC.
     *            </p>
     *            <p>
     *            <b>Important:</b> The <code>host</code> value cannot be used
     *            with this parameter. Use the <code>default</code> or
     *            <code>dedicated</code> values only.
     *            </p>
     *            <p>
     *            Default: <code>default</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public CreateVpcRequest withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the address to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     *
     * @return <p>
     *         The name of the location from which we advertise the IPV6 CIDR
     *         block. Use this parameter to limit the address to this location.
     *         </p>
     *         <p>
     *         You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     *         <code>true</code> to use this parameter.
     *         </p>
     */
    public String getIpv6CidrBlockNetworkBorderGroup() {
        return ipv6CidrBlockNetworkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the address to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     *
     * @param ipv6CidrBlockNetworkBorderGroup <p>
     *            The name of the location from which we advertise the IPV6 CIDR
     *            block. Use this parameter to limit the address to this
     *            location.
     *            </p>
     *            <p>
     *            You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     *            <code>true</code> to use this parameter.
     *            </p>
     */
    public void setIpv6CidrBlockNetworkBorderGroup(String ipv6CidrBlockNetworkBorderGroup) {
        this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which we advertise the IPV6 CIDR block. Use
     * this parameter to limit the address to this location.
     * </p>
     * <p>
     * You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     * <code>true</code> to use this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6CidrBlockNetworkBorderGroup <p>
     *            The name of the location from which we advertise the IPV6 CIDR
     *            block. Use this parameter to limit the address to this
     *            location.
     *            </p>
     *            <p>
     *            You must set <code>AmazonProvidedIpv6CidrBlock</code> to
     *            <code>true</code> to use this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcRequest withIpv6CidrBlockNetworkBorderGroup(
            String ipv6CidrBlockNetworkBorderGroup) {
        this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
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
        if (getAmazonProvidedIpv6CidrBlock() != null)
            sb.append("AmazonProvidedIpv6CidrBlock: " + getAmazonProvidedIpv6CidrBlock() + ",");
        if (getIpv6Pool() != null)
            sb.append("Ipv6Pool: " + getIpv6Pool() + ",");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: " + getIpv6CidrBlock() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getIpv6CidrBlockNetworkBorderGroup() != null)
            sb.append("Ipv6CidrBlockNetworkBorderGroup: " + getIpv6CidrBlockNetworkBorderGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime
                * hashCode
                + ((getAmazonProvidedIpv6CidrBlock() == null) ? 0
                        : getAmazonProvidedIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getIpv6Pool() == null) ? 0 : getIpv6Pool().hashCode());
        hashCode = prime * hashCode
                + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime
                * hashCode
                + ((getIpv6CidrBlockNetworkBorderGroup() == null) ? 0
                        : getIpv6CidrBlockNetworkBorderGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcRequest == false)
            return false;
        CreateVpcRequest other = (CreateVpcRequest) obj;

        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getAmazonProvidedIpv6CidrBlock() == null
                ^ this.getAmazonProvidedIpv6CidrBlock() == null)
            return false;
        if (other.getAmazonProvidedIpv6CidrBlock() != null
                && other.getAmazonProvidedIpv6CidrBlock().equals(
                        this.getAmazonProvidedIpv6CidrBlock()) == false)
            return false;
        if (other.getIpv6Pool() == null ^ this.getIpv6Pool() == null)
            return false;
        if (other.getIpv6Pool() != null && other.getIpv6Pool().equals(this.getIpv6Pool()) == false)
            return false;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null
                && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null
                && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getIpv6CidrBlockNetworkBorderGroup() == null
                ^ this.getIpv6CidrBlockNetworkBorderGroup() == null)
            return false;
        if (other.getIpv6CidrBlockNetworkBorderGroup() != null
                && other.getIpv6CidrBlockNetworkBorderGroup().equals(
                        this.getIpv6CidrBlockNetworkBorderGroup()) == false)
            return false;
        return true;
    }
}
