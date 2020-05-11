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
 * Allocates an Elastic IP address to your AWS account. After you allocate the
 * Elastic IP address you can associate it with an instance or network
 * interface. After you release an Elastic IP address, it is released to the IP
 * address pool and can be allocated to a different AWS account.
 * </p>
 * <p>
 * You can allocate an Elastic IP address from an address pool owned by AWS or
 * from an address pool created from a public IPv4 address range that you have
 * brought to AWS for use with your AWS resources using bring your own IP
 * addresses (BYOIP). For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html"
 * >Bring Your Own IP Addresses (BYOIP)</a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i>.
 * </p>
 * <p>
 * [EC2-VPC] If you release an Elastic IP address, you might be able to recover
 * it. You cannot recover an Elastic IP address that you released after it is
 * allocated to another AWS account. You cannot recover an Elastic IP address
 * for EC2-Classic. To attempt to recover an Elastic IP address that you
 * released, specify it in this operation.
 * </p>
 * <p>
 * An Elastic IP address is for use either in the EC2-Classic platform or in a
 * VPC. By default, you can allocate 5 Elastic IP addresses for EC2-Classic per
 * Region and 5 Elastic IP addresses for EC2-VPC per Region.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
 * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class AllocateAddressRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in
     * a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     */
    private String domain;

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an
     * address pool.
     * </p>
     */
    private String address;

    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon
     * EC2 select an address from the address pool. To specify a specific
     * address from the address pool, use the <code>Address</code> parameter
     * instead.
     * </p>
     */
    private String publicIpv4Pool;

    /**
     * <p>
     * The location from which the IP address is advertised. Use this parameter
     * to limit the address to this location.
     * </p>
     * <p>
     * A network border group is a unique set of Availability Zones or Local
     * Zones from where AWS advertises IP addresses and limits the addresses to
     * the group. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     * >DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     */
    private String networkBorderGroup;

    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon
     * EC2 select an address from the address pool. Alternatively, specify a
     * specific address from the address pool.
     * </p>
     */
    private String customerOwnedIpv4Pool;

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
     * Set to <code>vpc</code> to allocate the address for use with instances in
     * a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @return <p>
     *         Set to <code>vpc</code> to allocate the address for use with
     *         instances in a VPC.
     *         </p>
     *         <p>
     *         Default: The address is for use with instances in EC2-Classic.
     *         </p>
     * @see DomainType
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in
     * a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Set to <code>vpc</code> to allocate the address for use with
     *            instances in a VPC.
     *            </p>
     *            <p>
     *            Default: The address is for use with instances in EC2-Classic.
     *            </p>
     * @see DomainType
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in
     * a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Set to <code>vpc</code> to allocate the address for use with
     *            instances in a VPC.
     *            </p>
     *            <p>
     *            Default: The address is for use with instances in EC2-Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainType
     */
    public AllocateAddressRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in
     * a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Set to <code>vpc</code> to allocate the address for use with
     *            instances in a VPC.
     *            </p>
     *            <p>
     *            Default: The address is for use with instances in EC2-Classic.
     *            </p>
     * @see DomainType
     */
    public void setDomain(DomainType domain) {
        this.domain = domain.toString();
    }

    /**
     * <p>
     * Set to <code>vpc</code> to allocate the address for use with instances in
     * a VPC.
     * </p>
     * <p>
     * Default: The address is for use with instances in EC2-Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc, standard
     *
     * @param domain <p>
     *            Set to <code>vpc</code> to allocate the address for use with
     *            instances in a VPC.
     *            </p>
     *            <p>
     *            Default: The address is for use with instances in EC2-Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainType
     */
    public AllocateAddressRequest withDomain(DomainType domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an
     * address pool.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The Elastic IP address to recover or an IPv4 address
     *         from an address pool.
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an
     * address pool.
     * </p>
     *
     * @param address <p>
     *            [EC2-VPC] The Elastic IP address to recover or an IPv4 address
     *            from an address pool.
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an
     * address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address <p>
     *            [EC2-VPC] The Elastic IP address to recover or an IPv4 address
     *            from an address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressRequest withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon
     * EC2 select an address from the address pool. To specify a specific
     * address from the address pool, use the <code>Address</code> parameter
     * instead.
     * </p>
     *
     * @return <p>
     *         The ID of an address pool that you own. Use this parameter to let
     *         Amazon EC2 select an address from the address pool. To specify a
     *         specific address from the address pool, use the
     *         <code>Address</code> parameter instead.
     *         </p>
     */
    public String getPublicIpv4Pool() {
        return publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon
     * EC2 select an address from the address pool. To specify a specific
     * address from the address pool, use the <code>Address</code> parameter
     * instead.
     * </p>
     *
     * @param publicIpv4Pool <p>
     *            The ID of an address pool that you own. Use this parameter to
     *            let Amazon EC2 select an address from the address pool. To
     *            specify a specific address from the address pool, use the
     *            <code>Address</code> parameter instead.
     *            </p>
     */
    public void setPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
    }

    /**
     * <p>
     * The ID of an address pool that you own. Use this parameter to let Amazon
     * EC2 select an address from the address pool. To specify a specific
     * address from the address pool, use the <code>Address</code> parameter
     * instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIpv4Pool <p>
     *            The ID of an address pool that you own. Use this parameter to
     *            let Amazon EC2 select an address from the address pool. To
     *            specify a specific address from the address pool, use the
     *            <code>Address</code> parameter instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressRequest withPublicIpv4Pool(String publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
        return this;
    }

    /**
     * <p>
     * The location from which the IP address is advertised. Use this parameter
     * to limit the address to this location.
     * </p>
     * <p>
     * A network border group is a unique set of Availability Zones or Local
     * Zones from where AWS advertises IP addresses and limits the addresses to
     * the group. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     * >DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The location from which the IP address is advertised. Use this
     *         parameter to limit the address to this location.
     *         </p>
     *         <p>
     *         A network border group is a unique set of Availability Zones or
     *         Local Zones from where AWS advertises IP addresses and limits the
     *         addresses to the group. IP addresses cannot move between network
     *         border groups.
     *         </p>
     *         <p>
     *         Use <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     *         >DescribeAvailabilityZones</a> to view the network border groups.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot use a network border group with EC2 Classic. If you
     *         attempt this operation on EC2 classic, you will receive an
     *         <code>InvalidParameterCombination</code> error. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *         >Error Codes</a>.
     *         </p>
     *         </note>
     */
    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    /**
     * <p>
     * The location from which the IP address is advertised. Use this parameter
     * to limit the address to this location.
     * </p>
     * <p>
     * A network border group is a unique set of Availability Zones or Local
     * Zones from where AWS advertises IP addresses and limits the addresses to
     * the group. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     * >DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     *
     * @param networkBorderGroup <p>
     *            The location from which the IP address is advertised. Use this
     *            parameter to limit the address to this location.
     *            </p>
     *            <p>
     *            A network border group is a unique set of Availability Zones
     *            or Local Zones from where AWS advertises IP addresses and
     *            limits the addresses to the group. IP addresses cannot move
     *            between network border groups.
     *            </p>
     *            <p>
     *            Use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     *            >DescribeAvailabilityZones</a> to view the network border
     *            groups.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot use a network border group with EC2 Classic. If you
     *            attempt this operation on EC2 classic, you will receive an
     *            <code>InvalidParameterCombination</code> error. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *            >Error Codes</a>.
     *            </p>
     *            </note>
     */
    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The location from which the IP address is advertised. Use this parameter
     * to limit the address to this location.
     * </p>
     * <p>
     * A network border group is a unique set of Availability Zones or Local
     * Zones from where AWS advertises IP addresses and limits the addresses to
     * the group. IP addresses cannot move between network border groups.
     * </p>
     * <p>
     * Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     * >DescribeAvailabilityZones</a> to view the network border groups.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBorderGroup <p>
     *            The location from which the IP address is advertised. Use this
     *            parameter to limit the address to this location.
     *            </p>
     *            <p>
     *            A network border group is a unique set of Availability Zones
     *            or Local Zones from where AWS advertises IP addresses and
     *            limits the addresses to the group. IP addresses cannot move
     *            between network border groups.
     *            </p>
     *            <p>
     *            Use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     *            >DescribeAvailabilityZones</a> to view the network border
     *            groups.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot use a network border group with EC2 Classic. If you
     *            attempt this operation on EC2 classic, you will receive an
     *            <code>InvalidParameterCombination</code> error. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *            >Error Codes</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressRequest withNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
        return this;
    }

    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon
     * EC2 select an address from the address pool. Alternatively, specify a
     * specific address from the address pool.
     * </p>
     *
     * @return <p>
     *         The ID of a customer-owned address pool. Use this parameter to
     *         let Amazon EC2 select an address from the address pool.
     *         Alternatively, specify a specific address from the address pool.
     *         </p>
     */
    public String getCustomerOwnedIpv4Pool() {
        return customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon
     * EC2 select an address from the address pool. Alternatively, specify a
     * specific address from the address pool.
     * </p>
     *
     * @param customerOwnedIpv4Pool <p>
     *            The ID of a customer-owned address pool. Use this parameter to
     *            let Amazon EC2 select an address from the address pool.
     *            Alternatively, specify a specific address from the address
     *            pool.
     *            </p>
     */
    public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The ID of a customer-owned address pool. Use this parameter to let Amazon
     * EC2 select an address from the address pool. Alternatively, specify a
     * specific address from the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerOwnedIpv4Pool <p>
     *            The ID of a customer-owned address pool. Use this parameter to
     *            let Amazon EC2 select an address from the address pool.
     *            Alternatively, specify a specific address from the address
     *            pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateAddressRequest withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
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
    public AllocateAddressRequest withDryRun(Boolean dryRun) {
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getPublicIpv4Pool() != null)
            sb.append("PublicIpv4Pool: " + getPublicIpv4Pool() + ",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: " + getNetworkBorderGroup() + ",");
        if (getCustomerOwnedIpv4Pool() != null)
            sb.append("CustomerOwnedIpv4Pool: " + getCustomerOwnedIpv4Pool() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPublicIpv4Pool() == null) ? 0 : getPublicIpv4Pool().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomerOwnedIpv4Pool() == null) ? 0 : getCustomerOwnedIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateAddressRequest == false)
            return false;
        AllocateAddressRequest other = (AllocateAddressRequest) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPublicIpv4Pool() == null ^ this.getPublicIpv4Pool() == null)
            return false;
        if (other.getPublicIpv4Pool() != null
                && other.getPublicIpv4Pool().equals(this.getPublicIpv4Pool()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null
                && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getCustomerOwnedIpv4Pool() == null ^ this.getCustomerOwnedIpv4Pool() == null)
            return false;
        if (other.getCustomerOwnedIpv4Pool() != null
                && other.getCustomerOwnedIpv4Pool().equals(this.getCustomerOwnedIpv4Pool()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
