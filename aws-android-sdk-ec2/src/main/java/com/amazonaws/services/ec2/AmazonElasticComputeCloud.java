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

package com.amazonaws.services.ec2;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.ec2.model.*;

/**
 * Interface for accessing Amazon Elastic Compute Cloud <fullname>Amazon Elastic
 * Compute Cloud</fullname>
 * <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides secure and resizable
 * computing capacity in the AWS cloud. Using Amazon EC2 eliminates the need to
 * invest in hardware up front, so you can develop and deploy applications
 * faster.
 * </p>
 * <p>
 * To learn more, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon EC2: <a href="http://aws.amazon.com/ec2">AmazonEC2 product page</a>,
 * <a href="http://aws.amazon.com/documentation/ec2">Amazon EC2
 * documentation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EBS: <a href="http://aws.amazon.com/ebs">Amazon EBS product page</a>,
 * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html">
 * Amazon EBS documentation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon VPC: <a href="http://aws.amazon.com/vpc">Amazon VPC product page</a>,
 * <a href="http://aws.amazon.com/documentation/vpc">Amazon VPC
 * documentation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS VPN: <a href="http://aws.amazon.com/vpn">AWS VPN product page</a>, <a
 * href="http://aws.amazon.com/documentation/vpn">AWS VPN documentation</a>
 * </p>
 * </li>
 * </ul>
 **/
public interface AmazonElasticComputeCloud {

    /**
     * Overrides the default endpoint for this client
     * ("https://ec2.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://ec2.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "ec2.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://ec2.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticComputeCloud#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Accepts the Convertible Reserved Instance exchange quote described in the
     * <a>GetReservedInstancesExchangeQuote</a> call.
     * </p>
     * 
     * @param acceptReservedInstancesExchangeQuoteRequest <p>
     *            Contains the parameters for accepting the quote.
     *            </p>
     * @return acceptReservedInstancesExchangeQuoteResult The response from the
     *         AcceptReservedInstancesExchangeQuote service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AcceptReservedInstancesExchangeQuoteResult acceptReservedInstancesExchangeQuote(
            AcceptReservedInstancesExchangeQuoteRequest acceptReservedInstancesExchangeQuoteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Accepts a transit gateway peering attachment request. The peering
     * attachment must be in the <code>pendingAcceptance</code> state.
     * </p>
     * 
     * @param acceptTransitGatewayPeeringAttachmentRequest
     * @return acceptTransitGatewayPeeringAttachmentResult The response from the
     *         AcceptTransitGatewayPeeringAttachment service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AcceptTransitGatewayPeeringAttachmentResult acceptTransitGatewayPeeringAttachment(
            AcceptTransitGatewayPeeringAttachmentRequest acceptTransitGatewayPeeringAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Accepts a request to attach a VPC to a transit gateway.
     * </p>
     * <p>
     * The VPC attachment must be in the <code>pendingAcceptance</code> state.
     * Use <a>DescribeTransitGatewayVpcAttachments</a> to view your pending VPC
     * attachment requests. Use <a>RejectTransitGatewayVpcAttachment</a> to
     * reject a VPC attachment request.
     * </p>
     * 
     * @param acceptTransitGatewayVpcAttachmentRequest
     * @return acceptTransitGatewayVpcAttachmentResult The response from the
     *         AcceptTransitGatewayVpcAttachment service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AcceptTransitGatewayVpcAttachmentResult acceptTransitGatewayVpcAttachment(
            AcceptTransitGatewayVpcAttachmentRequest acceptTransitGatewayVpcAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Accepts one or more interface VPC endpoint connection requests to your
     * VPC endpoint service.
     * </p>
     * 
     * @param acceptVpcEndpointConnectionsRequest
     * @return acceptVpcEndpointConnectionsResult The response from the
     *         AcceptVpcEndpointConnections service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AcceptVpcEndpointConnectionsResult acceptVpcEndpointConnections(
            AcceptVpcEndpointConnectionsRequest acceptVpcEndpointConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC
     * peering connection must be in the <code>pending-acceptance</code> state,
     * and you must be the owner of the peer VPC. Use
     * <a>DescribeVpcPeeringConnections</a> to view your outstanding VPC peering
     * connection requests.
     * </p>
     * <p>
     * For an inter-Region VPC peering connection request, you must accept the
     * VPC peering connection in the Region of the accepter VPC.
     * </p>
     * 
     * @param acceptVpcPeeringConnectionRequest
     * @return acceptVpcPeeringConnectionResult The response from the
     *         AcceptVpcPeeringConnection service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(
            AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Advertises an IPv4 or IPv6 address range that is provisioned for use with
     * your AWS resources through bring your own IP addresses (BYOIP).
     * </p>
     * <p>
     * You can perform this operation at most once every 10 seconds, even if you
     * specify different address ranges each time.
     * </p>
     * <p>
     * We recommend that you stop advertising the BYOIP CIDR from other
     * locations when you advertise it from AWS. To minimize down time, you can
     * configure your AWS resources to use an address from a BYOIP CIDR before
     * it is advertised, and then simultaneously stop advertising it from the
     * current location and start advertising it through AWS.
     * </p>
     * <p>
     * It can take a few minutes before traffic to the specified addresses
     * starts routing to AWS because of BGP propagation delays.
     * </p>
     * <p>
     * To stop advertising the BYOIP CIDR, use <a>WithdrawByoipCidr</a>.
     * </p>
     * 
     * @param advertiseByoipCidrRequest
     * @return advertiseByoipCidrResult The response from the AdvertiseByoipCidr
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AdvertiseByoipCidrResult advertiseByoipCidr(AdvertiseByoipCidrRequest advertiseByoipCidrRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allocates an Elastic IP address to your AWS account. After you allocate
     * the Elastic IP address you can associate it with an instance or network
     * interface. After you release an Elastic IP address, it is released to the
     * IP address pool and can be allocated to a different AWS account.
     * </p>
     * <p>
     * You can allocate an Elastic IP address from an address pool owned by AWS
     * or from an address pool created from a public IPv4 address range that you
     * have brought to AWS for use with your AWS resources using bring your own
     * IP addresses (BYOIP). For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html"
     * >Bring Your Own IP Addresses (BYOIP)</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * [EC2-VPC] If you release an Elastic IP address, you might be able to
     * recover it. You cannot recover an Elastic IP address that you released
     * after it is allocated to another AWS account. You cannot recover an
     * Elastic IP address for EC2-Classic. To attempt to recover an Elastic IP
     * address that you released, specify it in this operation.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform or in
     * a VPC. By default, you can allocate 5 Elastic IP addresses for
     * EC2-Classic per Region and 5 Elastic IP addresses for EC2-VPC per Region.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param allocateAddressRequest
     * @return allocateAddressResult The response from the AllocateAddress
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allocates a Dedicated Host to your account. At a minimum, specify the
     * supported instance type or instance family, the Availability Zone in
     * which to allocate the host, and the number of hosts to allocate.
     * </p>
     * 
     * @param allocateHostsRequest
     * @return allocateHostsResult The response from the AllocateHosts service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AllocateHostsResult allocateHosts(AllocateHostsRequest allocateHostsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies a security group to the association between the target network
     * and the Client VPN endpoint. This action replaces the existing security
     * groups with the specified security groups.
     * </p>
     * 
     * @param applySecurityGroupsToClientVpnTargetNetworkRequest
     * @return applySecurityGroupsToClientVpnTargetNetworkResult The response
     *         from the ApplySecurityGroupsToClientVpnTargetNetwork service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ApplySecurityGroupsToClientVpnTargetNetworkResult applySecurityGroupsToClientVpnTargetNetwork(
            ApplySecurityGroupsToClientVpnTargetNetworkRequest applySecurityGroupsToClientVpnTargetNetworkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns one or more IPv6 addresses to the specified network interface.
     * You can specify one or more specific IPv6 addresses, or you can specify
     * the number of IPv6 addresses to be automatically assigned from within the
     * subnet's IPv6 CIDR block range. You can assign as many IPv6 addresses to
     * a network interface as you can assign private IPv4 addresses, and the
     * limit varies per instance type. For information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI"
     * >IP Addresses Per Network Interface Per Instance Type</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You must specify either the IPv6 addresses or the IPv6 address count in
     * the request.
     * </p>
     * 
     * @param assignIpv6AddressesRequest
     * @return assignIpv6AddressesResult The response from the
     *         AssignIpv6Addresses service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssignIpv6AddressesResult assignIpv6Addresses(
            AssignIpv6AddressesRequest assignIpv6AddressesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Assigns one or more secondary private IP addresses to the specified
     * network interface.
     * </p>
     * <p>
     * You can specify one or more specific secondary IP addresses, or you can
     * specify the number of secondary IP addresses to be automatically assigned
     * within the subnet's CIDR block range. The number of secondary IP
     * addresses that you can assign to an instance varies by instance type. For
     * information about instance types, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. For more information about Elastic IP addresses, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * When you move a secondary private IP address to another network
     * interface, any Elastic IP address that is associated with the IP address
     * is also moved.
     * </p>
     * <p>
     * Remapping an IP address is an asynchronous operation. When you move an IP
     * address from one network interface to another, check
     * <code>network/interfaces/macs/mac/local-ipv4s</code> in the instance
     * metadata to confirm that the remapping is complete.
     * </p>
     * <p>
     * You must specify either the IP addresses or the IP address count in the
     * request.
     * </p>
     * 
     * @param assignPrivateIpAddressesRequest <p>
     *            Contains the parameters for AssignPrivateIpAddresses.
     *            </p>
     * @return assignPrivateIpAddressesResult The response from the
     *         AssignPrivateIpAddresses service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssignPrivateIpAddressesResult assignPrivateIpAddresses(
            AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates an Elastic IP address with an instance or a network interface.
     * Before you can use an Elastic IP address, you must allocate it to your
     * account.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in
     * a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address
     * is already associated with a different instance, it is disassociated from
     * that instance and associated with the specified instance. If you
     * associate an Elastic IP address with an instance that has an existing
     * Elastic IP address, the existing address is disassociated from the
     * instance, but remains allocated to your account.
     * </p>
     * <p>
     * [VPC in an EC2-Classic account] If you don't specify a private IP
     * address, the Elastic IP address is associated with the primary IP
     * address. If the Elastic IP address is already associated with a different
     * instance or a network interface, you get an error unless you allow
     * reassociation. You cannot associate an Elastic IP address with an
     * instance or network interface that has an existing Elastic IP address.
     * </p>
     * <p>
     * You cannot associate an Elastic IP address with an interface in a
     * different network border group.
     * </p>
     * <important>
     * <p>
     * This is an idempotent operation. If you perform the operation more than
     * once, Amazon EC2 doesn't return an error, and you may be charged for each
     * time the Elastic IP address is remapped to the same instance. For more
     * information, see the <i>Elastic IP Addresses</i> section of <a
     * href="http://aws.amazon.com/ec2/pricing/">Amazon EC2 Pricing</a>.
     * </p>
     * </important>
     * 
     * @param associateAddressRequest
     * @return associateAddressResult The response from the AssociateAddress
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a target network with a Client VPN endpoint. A target network
     * is a subnet in a VPC. You can associate multiple subnets from the same
     * VPC with a Client VPN endpoint. You can associate only one subnet in each
     * Availability Zone. We recommend that you associate at least two subnets
     * to provide Availability Zone redundancy.
     * </p>
     * <p>
     * If you specified a VPC when you created the Client VPN endpoint or if you
     * have previous subnet associations, the specified subnet must be in the
     * same VPC. To specify a subnet that's in a different VPC, you must first
     * modify the Client VPN endpoint (<a>ModifyClientVpnEndpoint</a>) and
     * change the VPC that's associated with it.
     * </p>
     * 
     * @param associateClientVpnTargetNetworkRequest
     * @return associateClientVpnTargetNetworkResult The response from the
     *         AssociateClientVpnTargetNetwork service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateClientVpnTargetNetworkResult associateClientVpnTargetNetwork(
            AssociateClientVpnTargetNetworkRequest associateClientVpnTargetNetworkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created) with
     * the specified VPC, or associates no DHCP options with the VPC.
     * </p>
     * <p>
     * After you associate the options with the VPC, any existing instances and
     * all new instances that you launch in that VPC use the options. You don't
     * need to restart or relaunch the instances. They automatically pick up the
     * changes within a few hours, depending on how frequently the instance
     * renews its DHCP lease. You can explicitly renew the lease using the
     * operating system on the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html"
     * >DHCP Options Sets</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param associateDhcpOptionsRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates an IAM instance profile with a running or stopped instance.
     * You cannot associate more than one IAM instance profile with an instance.
     * </p>
     * 
     * @param associateIamInstanceProfileRequest
     * @return associateIamInstanceProfileResult The response from the
     *         AssociateIamInstanceProfile service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateIamInstanceProfileResult associateIamInstanceProfile(
            AssociateIamInstanceProfileRequest associateIamInstanceProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a subnet in your VPC or an internet gateway or virtual private
     * gateway attached to your VPC with a route table in your VPC. This
     * association causes traffic from the subnet or gateway to be routed
     * according to the routes in the route table. The action returns an
     * association ID, which you need in order to disassociate the route table
     * later. A route table can be associated with multiple subnets.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
     * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param associateRouteTableRequest
     * @return associateRouteTableResult The response from the
     *         AssociateRouteTable service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateRouteTableResult associateRouteTable(
            AssociateRouteTableRequest associateRouteTableRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Associates a CIDR block with your subnet. You can only associate a single
     * IPv6 CIDR block with your subnet. An IPv6 CIDR block must have a prefix
     * length of /64.
     * </p>
     * 
     * @param associateSubnetCidrBlockRequest
     * @return associateSubnetCidrBlockResult The response from the
     *         AssociateSubnetCidrBlock service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateSubnetCidrBlockResult associateSubnetCidrBlock(
            AssociateSubnetCidrBlockRequest associateSubnetCidrBlockRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the specified subnets and transit gateway attachments with the
     * specified transit gateway multicast domain.
     * </p>
     * <p>
     * The transit gateway attachment must be in the available state before you
     * can add a resource. Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html"
     * >DescribeTransitGatewayAttachments</a> to see the state of the
     * attachment.
     * </p>
     * 
     * @param associateTransitGatewayMulticastDomainRequest
     * @return associateTransitGatewayMulticastDomainResult The response from
     *         the AssociateTransitGatewayMulticastDomain service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateTransitGatewayMulticastDomainResult associateTransitGatewayMulticastDomain(
            AssociateTransitGatewayMulticastDomainRequest associateTransitGatewayMulticastDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the specified attachment with the specified transit gateway
     * route table. You can associate only one route table with an attachment.
     * </p>
     * 
     * @param associateTransitGatewayRouteTableRequest
     * @return associateTransitGatewayRouteTableResult The response from the
     *         AssociateTransitGatewayRouteTable service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateTransitGatewayRouteTableResult associateTransitGatewayRouteTable(
            AssociateTransitGatewayRouteTableRequest associateTransitGatewayRouteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a CIDR block with your VPC. You can associate a secondary IPv4
     * CIDR block, an Amazon-provided IPv6 CIDR block, or an IPv6 CIDR block
     * from an IPv6 address pool that you provisioned through bring your own IP
     * addresses (<a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html"
     * >BYOIP</a>). The IPv6 CIDR block size is fixed at /56.
     * </p>
     * <p>
     * You must specify one of the following in the request: an IPv4 CIDR block,
     * an IPv6 pool, or an Amazon-provided IPv6 CIDR block.
     * </p>
     * <p>
     * For more information about associating CIDR blocks with your VPC and
     * applicable restrictions, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#VPC_Sizing"
     * >VPC and Subnet Sizing</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param associateVpcCidrBlockRequest
     * @return associateVpcCidrBlockResult The response from the
     *         AssociateVpcCidrBlock service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociateVpcCidrBlockResult associateVpcCidrBlock(
            AssociateVpcCidrBlockRequest associateVpcCidrBlockRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Links an EC2-Classic instance to a ClassicLink-enabled VPC through one or
     * more of the VPC's security groups. You cannot link an EC2-Classic
     * instance to more than one VPC at a time. You can only link an instance
     * that's in the <code>running</code> state. An instance is automatically
     * unlinked from a VPC when it's stopped - you can link it to the VPC again
     * when you restart it.
     * </p>
     * <p>
     * After you've linked an instance, you cannot change the VPC security
     * groups that are associated with it. To change the security groups, you
     * must first unlink the instance, and then link it again.
     * </p>
     * <p>
     * Linking your instance to a VPC is sometimes referred to as
     * <i>attaching</i> your instance.
     * </p>
     * 
     * @param attachClassicLinkVpcRequest
     * @return attachClassicLinkVpcResult The response from the
     *         AttachClassicLinkVpc service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AttachClassicLinkVpcResult attachClassicLinkVpc(
            AttachClassicLinkVpcRequest attachClassicLinkVpcRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Attaches an internet gateway or a virtual private gateway to a VPC,
     * enabling connectivity between the internet and the VPC. For more
     * information about your VPC and internet gateway, see the <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon Virtual
     * Private Cloud User Guide</a>.
     * </p>
     * 
     * @param attachInternetGatewayRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     * 
     * @param attachNetworkInterfaceRequest <p>
     *            Contains the parameters for AttachNetworkInterface.
     *            </p>
     * @return attachNetworkInterfaceResult The response from the
     *         AttachNetworkInterface service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AttachNetworkInterfaceResult attachNetworkInterface(
            AttachNetworkInterfaceRequest attachNetworkInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches an EBS volume to a running or stopped instance and exposes it to
     * the instance with the specified device name.
     * </p>
     * <p>
     * Encrypted EBS volumes must be attached to instances that support Amazon
     * EBS encryption. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * After you attach an EBS volume, you must make it available. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-using-volumes.html"
     * >Making an EBS Volume Available For Use</a>.
     * </p>
     * <p>
     * If a volume has an AWS Marketplace product code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The volume can be attached only to a stopped instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Marketplace product codes are copied from the volume to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must be subscribed to the product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance type and operating system of the instance must support the
     * product. For example, you can't detach a volume from a Windows instance
     * and attach it to a Linux instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"
     * >Attaching Amazon EBS Volumes</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param attachVolumeRequest
     * @return attachVolumeResult The response from the AttachVolume service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. You can attach one virtual
     * private gateway to one VPC at a time.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param attachVpnGatewayRequest <p>
     *            Contains the parameters for AttachVpnGateway.
     *            </p>
     * @return attachVpnGatewayResult The response from the AttachVpnGateway
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AttachVpnGatewayResult attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds an ingress authorization rule to a Client VPN endpoint. Ingress
     * authorization rules act as firewall rules that grant access to networks.
     * You must configure ingress authorization rules to enable clients to
     * access resources in AWS or on-premises networks.
     * </p>
     * 
     * @param authorizeClientVpnIngressRequest
     * @return authorizeClientVpnIngressResult The response from the
     *         AuthorizeClientVpnIngress service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AuthorizeClientVpnIngressResult authorizeClientVpnIngress(
            AuthorizeClientVpnIngressRequest authorizeClientVpnIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * [VPC only] Adds the specified egress rules to a security group for use
     * with a VPC.
     * </p>
     * <p>
     * An outbound rule permits instances to send traffic to the specified IPv4
     * or IPv6 CIDR address ranges, or to the instances associated with the
     * specified destination security groups.
     * </p>
     * <p>
     * You specify a protocol for each rule (for example, TCP). For the TCP and
     * UDP protocols, you must also specify the destination port or port range.
     * For the ICMP protocol, you must also specify the ICMP type and code. You
     * can use -1 for the type or code to mean all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as possible.
     * However, a small delay might occur.
     * </p>
     * <p>
     * For more information about VPC security group limits, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html"
     * >Amazon VPC Limits</a>.
     * </p>
     * 
     * @param authorizeSecurityGroupEgressRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void authorizeSecurityGroupEgress(
            AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds the specified ingress rules to a security group.
     * </p>
     * <p>
     * An inbound rule permits instances to receive traffic from the specified
     * IPv4 or IPv6 CIDR address ranges, or from the instances associated with
     * the specified destination security groups.
     * </p>
     * <p>
     * You specify a protocol for each rule (for example, TCP). For TCP and UDP,
     * you must also specify the destination port or port range. For
     * ICMP/ICMPv6, you must also specify the ICMP/ICMPv6 type and code. You can
     * use -1 to mean all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * <p>
     * For more information about VPC security group limits, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html"
     * >Amazon VPC Limits</a>.
     * </p>
     * 
     * @param authorizeSecurityGroupIngressRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void authorizeSecurityGroupIngress(
            AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Bundles an Amazon instance store-backed Windows instance.
     * </p>
     * <p>
     * During bundling, only the root device volume (C:\) is bundled. Data on
     * other instance store volumes is not preserved.
     * </p>
     * <note>
     * <p>
     * This action is not applicable for Linux/Unix instances or Windows
     * instances that are backed by Amazon EBS.
     * </p>
     * </note>
     * 
     * @param bundleInstanceRequest <p>
     *            Contains the parameters for BundleInstance.
     *            </p>
     * @return bundleInstanceResult The response from the BundleInstance service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    BundleInstanceResult bundleInstance(BundleInstanceRequest bundleInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows
     * instance.
     * </p>
     * 
     * @param cancelBundleTaskRequest <p>
     *            Contains the parameters for CancelBundleTask.
     *            </p>
     * @return cancelBundleTaskResult The response from the CancelBundleTask
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelBundleTaskResult cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels the specified Capacity Reservation, releases the reserved
     * capacity, and changes the Capacity Reservation's state to
     * <code>cancelled</code>.
     * </p>
     * <p>
     * Instances running in the reserved capacity continue running until you
     * stop them. Stopped instances that target the Capacity Reservation can no
     * longer launch. Modify these instances to either target a different
     * Capacity Reservation, launch On-Demand Instance capacity, or run in any
     * open Capacity Reservation that has matching attributes and sufficient
     * capacity.
     * </p>
     * 
     * @param cancelCapacityReservationRequest
     * @return cancelCapacityReservationResult The response from the
     *         CancelCapacityReservation service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelCapacityReservationResult cancelCapacityReservation(
            CancelCapacityReservationRequest cancelCapacityReservationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels an active conversion task. The task can be the import of an
     * instance or volume. The action removes all artifacts of the conversion,
     * including a partially uploaded volume or instance. If the conversion is
     * complete or is in the process of transferring the final disk image, the
     * command fails and returns an exception.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/ec2-cli-vmimport-export.html"
     * >Importing a Virtual Machine Using the Amazon EC2 CLI</a>.
     * </p>
     * 
     * @param cancelConversionTaskRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of the
     * export, including any partially-created Amazon S3 objects. If the export
     * task is complete or is in the process of transferring the final disk
     * image, the command fails and returns an error.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels an in-process import virtual machine or import snapshot task.
     * </p>
     * 
     * @param cancelImportTaskRequest
     * @return cancelImportTaskResult The response from the CancelImportTask
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelImportTaskResult cancelImportTask(CancelImportTaskRequest cancelImportTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels the specified Reserved Instance listing in the Reserved Instance
     * Marketplace.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
     * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param cancelReservedInstancesListingRequest <p>
     *            Contains the parameters for CancelReservedInstancesListing.
     *            </p>
     * @return cancelReservedInstancesListingResult The response from the
     *         CancelReservedInstancesListing service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelReservedInstancesListingResult cancelReservedInstancesListing(
            CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels the specified Spot Fleet requests.
     * </p>
     * <p>
     * After you cancel a Spot Fleet request, the Spot Fleet launches no new
     * Spot Instances. You must specify whether the Spot Fleet should also
     * terminate its Spot Instances. If you terminate the instances, the Spot
     * Fleet request enters the <code>cancelled_terminating</code> state.
     * Otherwise, the Spot Fleet request enters the
     * <code>cancelled_running</code> state and the instances continue to run
     * until they are interrupted or you terminate them manually.
     * </p>
     * 
     * @param cancelSpotFleetRequestsRequest <p>
     *            Contains the parameters for CancelSpotFleetRequests.
     *            </p>
     * @return cancelSpotFleetRequestsResult The response from the
     *         CancelSpotFleetRequests service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelSpotFleetRequestsResult cancelSpotFleetRequests(
            CancelSpotFleetRequestsRequest cancelSpotFleetRequestsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels one or more Spot Instance requests.
     * </p>
     * <important>
     * <p>
     * Canceling a Spot Instance request does not terminate running Spot
     * Instances associated with the request.
     * </p>
     * </important>
     * 
     * @param cancelSpotInstanceRequestsRequest <p>
     *            Contains the parameters for CancelSpotInstanceRequests.
     *            </p>
     * @return cancelSpotInstanceRequestsResult The response from the
     *         CancelSpotInstanceRequests service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelSpotInstanceRequestsResult cancelSpotInstanceRequests(
            CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Determines whether a product code is associated with an instance. This
     * action can only be used by the owner of the product code. It is useful
     * when a product code owner must verify whether another user's instance is
     * eligible for support.
     * </p>
     * 
     * @param confirmProductInstanceRequest
     * @return confirmProductInstanceResult The response from the
     *         ConfirmProductInstance service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ConfirmProductInstanceResult confirmProductInstance(
            ConfirmProductInstanceRequest confirmProductInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies the specified Amazon FPGA Image (AFI) to the current Region.
     * </p>
     * 
     * @param copyFpgaImageRequest
     * @return copyFpgaImageResult The response from the CopyFpgaImage service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CopyFpgaImageResult copyFpgaImage(CopyFpgaImageRequest copyFpgaImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates the copy of an AMI from the specified source Region to the
     * current Region. You specify the destination Region by using its endpoint
     * when making the request.
     * </p>
     * <p>
     * Copies of encrypted backing snapshots for the AMI are encrypted. Copies
     * of unencrypted backing snapshots remain unencrypted, unless you set
     * <code>Encrypted</code> during the copy operation. You cannot create an
     * unencrypted copy of an encrypted backing snapshot.
     * </p>
     * <p>
     * For more information about the prerequisites and limits when copying an
     * AMI, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html"
     * >Copying an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param copyImageRequest <p>
     *            Contains the parameters for CopyImage.
     *            </p>
     * @return copyImageResult The response from the CopyImage service method,
     *         as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CopyImageResult copyImage(CopyImageRequest copyImageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon
     * S3. You can copy the snapshot within the same Region or from one Region
     * to another. You can use the snapshot to create EBS volumes or Amazon
     * Machine Images (AMIs).
     * </p>
     * <p>
     * Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted
     * snapshots remain unencrypted, unless you enable encryption for the
     * snapshot copy operation. By default, encrypted snapshot copies use the
     * default AWS Key Management Service (AWS KMS) customer master key (CMK);
     * however, you can specify a different CMK.
     * </p>
     * <p>
     * To copy an encrypted snapshot that has been shared from another account,
     * you must have permissions for the CMK used to encrypt the snapshot.
     * </p>
     * <p>
     * Snapshots created by copying another snapshot have an arbitrary volume ID
     * that should not be used for any purpose.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"
     * >Copying an Amazon EBS Snapshot</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return copySnapshotResult The response from the CopySnapshot service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Capacity Reservation with the specified attributes.
     * </p>
     * <p>
     * Capacity Reservations enable you to reserve capacity for your Amazon EC2
     * instances in a specific Availability Zone for any duration. This gives
     * you the flexibility to selectively add capacity reservations and still
     * get the Regional RI discounts for that usage. By creating Capacity
     * Reservations, you ensure that you always have access to Amazon EC2
     * capacity when you need it, for as long as you need it. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html"
     * >Capacity Reservations</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Your request to create a Capacity Reservation could fail if Amazon EC2
     * does not have sufficient capacity to fulfill the request. If your request
     * fails due to Amazon EC2 capacity constraints, either try again at a later
     * time, try in a different Availability Zone, or request a smaller capacity
     * reservation. If your application is flexible across instance types and
     * sizes, try to create a Capacity Reservation with different instance
     * attributes.
     * </p>
     * <p>
     * Your request could also fail if the requested quantity exceeds your
     * On-Demand Instance limit for the selected instance type. If your request
     * fails due to limit constraints, increase your On-Demand Instance limit
     * for the required instance type and try again. For more information about
     * increasing your instance limits, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-resource-limits.html"
     * >Amazon EC2 Service Limits</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param createCapacityReservationRequest
     * @return createCapacityReservationResult The response from the
     *         CreateCapacityReservation service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateCapacityReservationResult createCapacityReservation(
            CreateCapacityReservationRequest createCapacityReservationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Client VPN endpoint. A Client VPN endpoint is the resource you
     * create and configure to enable and manage client VPN sessions. It is the
     * destination endpoint at which all client VPN sessions are terminated.
     * </p>
     * 
     * @param createClientVpnEndpointRequest
     * @return createClientVpnEndpointResult The response from the
     *         CreateClientVpnEndpoint service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateClientVpnEndpointResult createClientVpnEndpoint(
            CreateClientVpnEndpointRequest createClientVpnEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a route to a network to a Client VPN endpoint. Each Client VPN
     * endpoint has a route table that describes the available destination
     * network routes. Each route in the route table specifies the path for
     * traﬃc to speciﬁc resources or networks.
     * </p>
     * 
     * @param createClientVpnRouteRequest
     * @return createClientVpnRouteResult The response from the
     *         CreateClientVpnRoute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateClientVpnRouteResult createClientVpnRoute(
            CreateClientVpnRouteRequest createClientVpnRouteRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides information to AWS about your VPN customer gateway device. The
     * customer gateway is the appliance at your end of the VPN connection. (The
     * device on the AWS side of the VPN connection is the virtual private
     * gateway.) You must provide the Internet-routable IP address of the
     * customer gateway's external interface. The IP address must be static and
     * can be behind a device performing network address translation (NAT).
     * </p>
     * <p>
     * For devices that use Border Gateway Protocol (BGP), you can also provide
     * the device's BGP Autonomous System Number (ASN). You can use an existing
     * ASN assigned to your network. If you don't have an ASN already, you can
     * use a private ASN (in the 64512 - 65534 range).
     * </p>
     * <note>
     * <p>
     * Amazon EC2 supports all 2-byte ASN numbers in the range of 1 - 65534,
     * with the exception of 7224, which is reserved in the
     * <code>us-east-1</code> Region, and 9059, which is reserved in the
     * <code>eu-west-1</code> Region.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * <important>
     * <p>
     * To create more than one customer gateway with the same VPN type, IP
     * address, and BGP ASN, specify a unique device name for each customer
     * gateway. Identical requests return information about the existing
     * customer gateway and do not create new customer gateways.
     * </p>
     * </important>
     * 
     * @param createCustomerGatewayRequest <p>
     *            Contains the parameters for CreateCustomerGateway.
     *            </p>
     * @return createCustomerGatewayResult The response from the
     *         CreateCustomerGateway service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateCustomerGatewayResult createCustomerGateway(
            CreateCustomerGatewayRequest createCustomerGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a default subnet with a size <code>/20</code> IPv4 CIDR block in
     * the specified Availability Zone in your default VPC. You can have only
     * one default subnet per Availability Zone. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html#create-default-subnet"
     * >Creating a Default Subnet</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param createDefaultSubnetRequest
     * @return createDefaultSubnetResult The response from the
     *         CreateDefaultSubnet service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateDefaultSubnetResult createDefaultSubnet(
            CreateDefaultSubnetRequest createDefaultSubnetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a default VPC with a size <code>/16</code> IPv4 CIDR block and a
     * default subnet in each Availability Zone. For more information about the
     * components of a default VPC, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/default-vpc.html"
     * >Default VPC and Default Subnets</a> in the <i>Amazon Virtual Private
     * Cloud User Guide</i>. You cannot specify the components of the default
     * VPC yourself.
     * </p>
     * <p>
     * If you deleted your previous default VPC, you can create a default VPC.
     * You cannot have more than one default VPC per Region.
     * </p>
     * <p>
     * If your account supports EC2-Classic, you cannot use this action to
     * create a default VPC in a Region that supports EC2-Classic. If you want a
     * default VPC in a Region that supports EC2-Classic, see
     * "I really want a default VPC for my existing EC2 account. Is that possible?"
     * in the <a href="http://aws.amazon.com/vpc/faqs/#Default_VPCs">Default
     * VPCs FAQ</a>.
     * </p>
     * 
     * @param createDefaultVpcRequest
     * @return createDefaultVpcResult The response from the CreateDefaultVpc
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateDefaultVpcResult createDefaultVpc(CreateDefaultVpcRequest createDefaultVpcRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a set of DHCP options for your VPC. After creating the set, you
     * must associate it with the VPC, causing all existing and new instances
     * that you launch in the VPC to use this set of DHCP options. The following
     * are the individual DHCP options you can specify. For more information
     * about the options, see <a href="http://www.ietf.org/rfc/rfc2132.txt">RFC
     * 2132</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>domain-name-servers</code> - The IP addresses of up to four domain
     * name servers, or AmazonProvidedDNS. The default DHCP option set specifies
     * AmazonProvidedDNS. If specifying more than one domain name server,
     * specify the IP addresses in a single parameter, separated by commas. To
     * have your instance receive a custom DNS hostname as specified in
     * <code>domain-name</code>, you must set <code>domain-name-servers</code>
     * to a custom DNS server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain-name</code> - If you're using AmazonProvidedDNS in
     * <code>us-east-1</code>, specify <code>ec2.internal</code>. If you're
     * using AmazonProvidedDNS in another Region, specify
     * <code>region.compute.internal</code> (for example,
     * <code>ap-northeast-1.compute.internal</code>). Otherwise, specify a
     * domain name (for example, <code>MyCompany.com</code>). This value is used
     * to complete unqualified DNS hostnames. <b>Important</b>: Some Linux
     * operating systems accept multiple domain names separated by spaces.
     * However, Windows and other Linux operating systems treat the value as a
     * single domain, which results in unexpected behavior. If your DHCP options
     * set is associated with a VPC that has instances with multiple operating
     * systems, specify only one domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ntp-servers</code> - The IP addresses of up to four Network Time
     * Protocol (NTP) servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>netbios-name-servers</code> - The IP addresses of up to four
     * NetBIOS name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>netbios-node-type</code> - The NetBIOS node type (1, 2, 4, or 8).
     * We recommend that you specify 2 (broadcast and multicast are not
     * currently supported). For more information about these node types, see <a
     * href="http://www.ietf.org/rfc/rfc2132.txt">RFC 2132</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Your VPC automatically starts out with a set of DHCP options that
     * includes only a DNS server that we provide (AmazonProvidedDNS). If you
     * create a set of options, and if your VPC has an internet gateway, make
     * sure to set the <code>domain-name-servers</code> option either to
     * <code>AmazonProvidedDNS</code> or to a domain name server of your choice.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html"
     * >DHCP Options Sets</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param createDhcpOptionsRequest
     * @return createDhcpOptionsResult The response from the CreateDhcpOptions
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateDhcpOptionsResult createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * [IPv6 only] Creates an egress-only internet gateway for your VPC. An
     * egress-only internet gateway is used to enable outbound communication
     * over IPv6 from instances in your VPC to the internet, and prevents hosts
     * outside of your VPC from initiating an IPv6 connection with your
     * instance.
     * </p>
     * 
     * @param createEgressOnlyInternetGatewayRequest
     * @return createEgressOnlyInternetGatewayResult The response from the
     *         CreateEgressOnlyInternetGateway service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateEgressOnlyInternetGatewayResult createEgressOnlyInternetGateway(
            CreateEgressOnlyInternetGatewayRequest createEgressOnlyInternetGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Launches an EC2 Fleet.
     * </p>
     * <p>
     * You can create a single EC2 Fleet that includes multiple launch
     * specifications that vary by instance type, AMI, Availability Zone, or
     * subnet.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html"
     * >Launching an EC2 Fleet</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param createFleetRequest
     * @return createFleetResult The response from the CreateFleet service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates one or more flow logs to capture information about IP traffic for
     * a specific network interface, subnet, or VPC.
     * </p>
     * <p>
     * Flow log data for a monitored network interface is recorded as flow log
     * records, which are log events consisting of fields that describe the
     * traffic flow. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records"
     * >Flow Log Records</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * When publishing to CloudWatch Logs, flow log records are published to a
     * log group, and each network interface has a unique log stream in the log
     * group. When publishing to Amazon S3, flow log records for all of the
     * monitored network interfaces are published to a single log file object
     * that is stored in the specified bucket.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html"
     * >VPC Flow Logs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createFlowLogsRequest
     * @return createFlowLogsResult The response from the CreateFlowLogs service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateFlowLogsResult createFlowLogs(CreateFlowLogsRequest createFlowLogsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon FPGA Image (AFI) from the specified design checkpoint
     * (DCP).
     * </p>
     * <p>
     * The create operation is asynchronous. To verify that the AFI is ready for
     * use, check the output logs.
     * </p>
     * <p>
     * An AFI contains the FPGA bitstream that is ready to download to an FPGA.
     * You can securely deploy an AFI on multiple FPGA-accelerated instances.
     * For more information, see the <a
     * href="https://github.com/aws/aws-fpga/">AWS FPGA Hardware Development
     * Kit</a>.
     * </p>
     * 
     * @param createFpgaImageRequest
     * @return createFpgaImageResult The response from the CreateFpgaImage
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateFpgaImageResult createFpgaImage(CreateFpgaImageRequest createFpgaImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that
     * is either running or stopped.
     * </p>
     * <p>
     * If you customized your instance with instance store volumes or EBS
     * volumes in addition to the root device volume, the new AMI contains block
     * device mapping information for those volumes. When you launch an instance
     * from this new AMI, the instance automatically launches with those
     * additional volumes.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
     * >Creating Amazon EBS-Backed Linux AMIs</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createImageRequest
     * @return createImageResult The response from the CreateImage service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateImageResult createImage(CreateImageRequest createImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Exports a running or stopped instance to an S3 bucket.
     * </p>
     * <p>
     * For information about the supported operating systems, image formats, and
     * known limitations for the types of instances you can export, see <a href=
     * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmexport.html"
     * >Exporting an Instance as a VM Using VM Import/Export</a> in the <i>VM
     * Import/Export User Guide</i>.
     * </p>
     * 
     * @param createInstanceExportTaskRequest
     * @return createInstanceExportTaskResult The response from the
     *         CreateInstanceExportTask service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateInstanceExportTaskResult createInstanceExportTask(
            CreateInstanceExportTaskRequest createInstanceExportTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an internet gateway for use with a VPC. After creating the
     * internet gateway, you attach it to a VPC using
     * <a>AttachInternetGateway</a>.
     * </p>
     * <p>
     * For more information about your VPC and internet gateway, see the <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon Virtual
     * Private Cloud User Guide</a>.
     * </p>
     * 
     * @param createInternetGatewayRequest
     * @return createInternetGatewayResult The response from the
     *         CreateInternetGateway service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateInternetGatewayResult createInternetGateway(
            CreateInternetGatewayRequest createInternetGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2
     * stores the public key and displays the private key for you to save to a
     * file. The private key is returned as an unencrypted PEM encoded PKCS#1
     * private key. If a key with the specified name already exists, Amazon EC2
     * returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per Region.
     * </p>
     * <p>
     * The key pair returned to you is available only in the Region in which you
     * create it. If you prefer, you can create your own key pair using a
     * third-party tool and upload it to any Region using <a>ImportKeyPair</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return createKeyPairResult The response from the CreateKeyPair service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a launch template. A launch template contains the parameters to
     * launch an instance. When you launch an instance using
     * <a>RunInstances</a>, you can specify a launch template instead of
     * providing the launch parameters in the request. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html"
     * >Launching an instance from a launch template</a>in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createLaunchTemplateRequest
     * @return createLaunchTemplateResult The response from the
     *         CreateLaunchTemplate service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateLaunchTemplateResult createLaunchTemplate(
            CreateLaunchTemplateRequest createLaunchTemplateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new version for a launch template. You can specify an existing
     * version of launch template from which to base the new version.
     * </p>
     * <p>
     * Launch template versions are numbered in the order in which they are
     * created. You cannot specify, change, or replace the numbering of launch
     * template versions.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#manage-launch-template-versions"
     * >Managing launch template versions</a>in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param createLaunchTemplateVersionRequest
     * @return createLaunchTemplateVersionResult The response from the
     *         CreateLaunchTemplateVersion service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateLaunchTemplateVersionResult createLaunchTemplateVersion(
            CreateLaunchTemplateVersionRequest createLaunchTemplateVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a static route for the specified local gateway route table.
     * </p>
     * 
     * @param createLocalGatewayRouteRequest
     * @return createLocalGatewayRouteResult The response from the
     *         CreateLocalGatewayRoute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateLocalGatewayRouteResult createLocalGatewayRoute(
            CreateLocalGatewayRouteRequest createLocalGatewayRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the specified VPC with the specified local gateway route
     * table.
     * </p>
     * 
     * @param createLocalGatewayRouteTableVpcAssociationRequest
     * @return createLocalGatewayRouteTableVpcAssociationResult The response
     *         from the CreateLocalGatewayRouteTableVpcAssociation service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateLocalGatewayRouteTableVpcAssociationResult createLocalGatewayRouteTableVpcAssociation(
            CreateLocalGatewayRouteTableVpcAssociationRequest createLocalGatewayRouteTableVpcAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a NAT gateway in the specified public subnet. This action creates
     * a network interface in the specified subnet with a private IP address
     * from the IP address range of the subnet. Internet-bound traffic from a
     * private subnet can be routed to the NAT gateway, therefore enabling
     * instances in the private subnet to connect to the internet. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html"
     * >NAT Gateways</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNatGatewayRequest
     * @return createNatGatewayResult The response from the CreateNatGateway
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateNatGatewayResult createNatGateway(CreateNatGatewayRequest createNatGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a network ACL in a VPC. Network ACLs provide an optional layer of
     * security (in addition to security groups) for the instances in your VPC.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html"
     * >Network ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkAclRequest
     * @return createNetworkAclResult The response from the CreateNetworkAcl
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an entry (a rule) in a network ACL with the specified rule
     * number. Each network ACL has a set of numbered ingress rules and a
     * separate set of numbered egress rules. When determining whether a packet
     * should be allowed in or out of a subnet associated with the ACL, we
     * process the entries in the ACL according to the rule numbers, in
     * ascending order. Each network ACL has a set of ingress rules and a
     * separate set of egress rules.
     * </p>
     * <p>
     * We recommend that you leave room between the rule numbers (for example,
     * 100, 110, 120, ...), and not number them one right after the other (for
     * example, 101, 102, 103, ...). This makes it easier to add a rule between
     * existing ones without having to renumber the rules.
     * </p>
     * <p>
     * After you add an entry, you can't modify it; you must either replace it,
     * or create an entry and delete the old one.
     * </p>
     * <p>
     * For more information about network ACLs, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html"
     * >Network ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createNetworkAclEntryRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a network interface in the specified subnet.
     * </p>
     * <p>
     * For more information about network interfaces, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"
     * >Elastic Network Interfaces</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param createNetworkInterfaceRequest <p>
     *            Contains the parameters for CreateNetworkInterface.
     *            </p>
     * @return createNetworkInterfaceResult The response from the
     *         CreateNetworkInterface service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateNetworkInterfaceResult createNetworkInterface(
            CreateNetworkInterfaceRequest createNetworkInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Grants an AWS-authorized account permission to attach the specified
     * network interface to an instance in their account.
     * </p>
     * <p>
     * You can grant permission to a single AWS account only, and only one
     * account at a time.
     * </p>
     * 
     * @param createNetworkInterfacePermissionRequest <p>
     *            Contains the parameters for CreateNetworkInterfacePermission.
     *            </p>
     * @return createNetworkInterfacePermissionResult The response from the
     *         CreateNetworkInterfacePermission service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateNetworkInterfacePermissionResult createNetworkInterfacePermission(
            CreateNetworkInterfacePermissionRequest createNetworkInterfacePermissionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a placement group in which to launch instances. The strategy of
     * the placement group determines how the instances are organized within the
     * group.
     * </p>
     * <p>
     * A <code>cluster</code> placement group is a logical grouping of instances
     * within a single Availability Zone that benefit from low network latency,
     * high network throughput. A <code>spread</code> placement group places
     * instances on distinct hardware. A <code>partition</code> placement group
     * places groups of instances in different partitions, where instances in
     * one partition do not share the same hardware with instances in another
     * partition.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param createPlacementGroupRequest
     * @return createPlacementGroupResult The response from the
     *         CreatePlacementGroup service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreatePlacementGroupResult createPlacementGroup(
            CreatePlacementGroupRequest createPlacementGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a listing for Amazon EC2 Standard Reserved Instances to be sold
     * in the Reserved Instance Marketplace. You can submit one Standard
     * Reserved Instance listing at a time. To get a list of your Standard
     * Reserved Instances, you can use the <a>DescribeReservedInstances</a>
     * operation.
     * </p>
     * <note>
     * <p>
     * Only Standard Reserved Instances can be sold in the Reserved Instance
     * Marketplace. Convertible Reserved Instances cannot be sold.
     * </p>
     * </note>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell
     * Standard Reserved Instance capacity that they no longer need with buyers
     * who want to purchase additional capacity. Reserved Instances bought and
     * sold through the Reserved Instance Marketplace work like any other
     * Reserved Instances.
     * </p>
     * <p>
     * To sell your Standard Reserved Instances, you must first register as a
     * seller in the Reserved Instance Marketplace. After completing the
     * registration process, you can create a Reserved Instance Marketplace
     * listing of some or all of your Standard Reserved Instances, and specify
     * the upfront price to receive for them. Your Standard Reserved Instance
     * listings then become available for purchase. To view the details of your
     * Standard Reserved Instance listing, you can use the
     * <a>DescribeReservedInstancesListings</a> operation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
     * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param createReservedInstancesListingRequest <p>
     *            Contains the parameters for CreateReservedInstancesListing.
     *            </p>
     * @return createReservedInstancesListingResult The response from the
     *         CreateReservedInstancesListing service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateReservedInstancesListingResult createReservedInstancesListing(
            CreateReservedInstancesListingRequest createReservedInstancesListingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a route in a route table within a VPC.
     * </p>
     * <p>
     * You must specify one of the following targets: internet gateway or
     * virtual private gateway, NAT instance, NAT gateway, VPC peering
     * connection, network interface, egress-only internet gateway, or transit
     * gateway.
     * </p>
     * <p>
     * When determining how to route traffic, we use the route with the most
     * specific match. For example, traffic is destined for the IPv4 address
     * <code>192.0.2.3</code>, and the route table includes the following two
     * IPv4 routes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>192.0.2.0/24</code> (goes to some target A)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>192.0.2.0/28</code> (goes to some target B)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Both routes apply to the traffic destined for <code>192.0.2.3</code>.
     * However, the second route in the list covers a smaller number of IP
     * addresses and is therefore more specific, so we use that route to
     * determine where to target the traffic.
     * </p>
     * <p>
     * For more information about route tables, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
     * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createRouteRequest
     * @return createRouteResult The response from the CreateRoute service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a route table for the specified VPC. After you create a route
     * table, you can add routes and associate the table with a subnet.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
     * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createRouteTableRequest
     * @return createRouteTableResult The response from the CreateRouteTable
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateRouteTableResult createRouteTable(CreateRouteTableRequest createRouteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a security group.
     * </p>
     * <p>
     * A security group acts as a virtual firewall for your instance to control
     * inbound and outbound traffic. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i> and <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * When you create a security group, you specify a friendly name of your
     * choice. You can have a security group for use in EC2-Classic with the
     * same name as a security group for use in a VPC. However, you can't have
     * two security groups for use in EC2-Classic with the same name or two
     * security groups for use in a VPC with the same name.
     * </p>
     * <p>
     * You have a default security group for use in EC2-Classic and a default
     * security group for use in your VPC. If you don't specify a security group
     * when you launch an instance, the instance is launched into the
     * appropriate default security group. A default security group includes a
     * default rule that grants instances unrestricted network access to each
     * other.
     * </p>
     * <p>
     * You can add or remove rules from your security groups using
     * <a>AuthorizeSecurityGroupIngress</a>,
     * <a>AuthorizeSecurityGroupEgress</a>, <a>RevokeSecurityGroupIngress</a>,
     * and <a>RevokeSecurityGroupEgress</a>.
     * </p>
     * <p>
     * For more information about VPC security group limits, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html"
     * >Amazon VPC Limits</a>.
     * </p>
     * 
     * @param createSecurityGroupRequest
     * @return createSecurityGroupResult The response from the
     *         CreateSecurityGroup service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateSecurityGroupResult createSecurityGroup(
            CreateSecurityGroupRequest createSecurityGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a snapshot of an EBS volume and stores it in Amazon S3. You can
     * use snapshots for backups, to make copies of EBS volumes, and to save
     * data before shutting down an instance.
     * </p>
     * <p>
     * When a snapshot is created, any AWS Marketplace product codes that are
     * associated with the source volume are propagated to the snapshot.
     * </p>
     * <p>
     * You can take a snapshot of an attached volume that is in use. However,
     * snapshots only capture data that has been written to your EBS volume at
     * the time the snapshot command is issued; this may exclude any data that
     * has been cached by any applications or the operating system. If you can
     * pause any file systems on the volume long enough to take a snapshot, your
     * snapshot should be complete. However, if you cannot pause all file writes
     * to the volume, you should unmount the volume from within the instance,
     * issue the snapshot command, and then remount the volume to ensure a
     * consistent and complete snapshot. You may remount and use your volume
     * while the snapshot status is <code>pending</code>.
     * </p>
     * <p>
     * To create a snapshot for EBS volumes that serve as root devices, you
     * should stop the instance before taking the snapshot.
     * </p>
     * <p>
     * Snapshots that are taken from encrypted volumes are automatically
     * encrypted. Volumes that are created from encrypted snapshots are also
     * automatically encrypted. Your encrypted volumes and any associated
     * snapshots always remain protected.
     * </p>
     * <p>
     * You can tag your snapshots during creation. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html"
     * >Amazon Elastic Block Store</a> and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return createSnapshotResult The response from the CreateSnapshot service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates crash-consistent snapshots of multiple EBS volumes and stores the
     * data in S3. Volumes are chosen by specifying an instance. Any attached
     * volumes will produce one snapshot each that is crash-consistent across
     * the instance. Boot volumes can be excluded by changing the parameters.
     * </p>
     * 
     * @param createSnapshotsRequest
     * @return createSnapshotsResult The response from the CreateSnapshots
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateSnapshotsResult createSnapshots(CreateSnapshotsRequest createSnapshotsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a data feed for Spot Instances, enabling you to view Spot
     * Instance usage logs. You can create one data feed per AWS account. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html"
     * >Spot Instance Data Feed</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * 
     * @param createSpotDatafeedSubscriptionRequest <p>
     *            Contains the parameters for CreateSpotDatafeedSubscription.
     *            </p>
     * @return createSpotDatafeedSubscriptionResult The response from the
     *         CreateSpotDatafeedSubscription service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateSpotDatafeedSubscriptionResult createSpotDatafeedSubscription(
            CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and IPv4 CIDR block
     * for the subnet. After you create a subnet, you can't change its CIDR
     * block. The size of the subnet's IPv4 CIDR block can be the same as a
     * VPC's IPv4 CIDR block, or a subset of a VPC's IPv4 CIDR block. If you
     * create more than one subnet in a VPC, the subnets' CIDR blocks must not
     * overlap. The smallest IPv4 subnet (and VPC) you can create uses a /28
     * netmask (16 IPv4 addresses), and the largest uses a /16 netmask (65,536
     * IPv4 addresses).
     * </p>
     * <p>
     * If you've associated an IPv6 CIDR block with your VPC, you can create a
     * subnet with an IPv6 CIDR block that uses a /64 prefix length.
     * </p>
     * <important>
     * <p>
     * AWS reserves both the first four and the last IPv4 address in each
     * subnet's CIDR block. They're not available for use.
     * </p>
     * </important>
     * <p>
     * If you add more than one subnet to a VPC, they're set up in a star
     * topology with a logical router in the middle.
     * </p>
     * <p>
     * If you launch an instance in a VPC using an Amazon EBS-backed AMI, the IP
     * address doesn't change if you stop and restart the instance (unlike a
     * similar instance launched outside a VPC, which gets a new IP address when
     * restarted). It's therefore possible to have a subnet with no running
     * instances (they're all stopped), but no remaining IP addresses available.
     * </p>
     * <p>
     * For more information about subnets, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your
     * VPC and Subnets</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param createSubnetRequest
     * @return createSubnetResult The response from the CreateSubnet service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or overwrites the specified tags for the specified Amazon EC2
     * resource or resources. Each resource can have a maximum of 50 tags. Each
     * tag consists of a key and optional value. Tag keys must be unique per
     * resource.
     * </p>
     * <p>
     * For more information about tags, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Resources</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. For more information about creating IAM policies that control
     * users' access to resources based on tags, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-iam-actions-resources.html"
     * >Supported Resource-Level Permissions for Amazon EC2 API Actions</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param createTagsRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void createTags(CreateTagsRequest createTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a Traffic Mirror filter.
     * </p>
     * <p>
     * A Traffic Mirror filter is a set of rules that defines the traffic to
     * mirror.
     * </p>
     * <p>
     * By default, no traffic is mirrored. To mirror traffic, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTrafficMirrorFilterRule.htm"
     * >CreateTrafficMirrorFilterRule</a> to add Traffic Mirror rules to the
     * filter. The rules you add define what traffic gets mirrored. You can also
     * use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyTrafficMirrorFilterNetworkServices.html"
     * >ModifyTrafficMirrorFilterNetworkServices</a> to mirror supported network
     * services.
     * </p>
     * 
     * @param createTrafficMirrorFilterRequest
     * @return createTrafficMirrorFilterResult The response from the
     *         CreateTrafficMirrorFilter service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTrafficMirrorFilterResult createTrafficMirrorFilter(
            CreateTrafficMirrorFilterRequest createTrafficMirrorFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Traffic Mirror filter rule.
     * </p>
     * <p>
     * A Traffic Mirror rule defines the Traffic Mirror source traffic to
     * mirror.
     * </p>
     * <p>
     * You need the Traffic Mirror filter ID when you create the rule.
     * </p>
     * 
     * @param createTrafficMirrorFilterRuleRequest
     * @return createTrafficMirrorFilterRuleResult The response from the
     *         CreateTrafficMirrorFilterRule service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTrafficMirrorFilterRuleResult createTrafficMirrorFilterRule(
            CreateTrafficMirrorFilterRuleRequest createTrafficMirrorFilterRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Traffic Mirror session.
     * </p>
     * <p>
     * A Traffic Mirror session actively copies packets from a Traffic Mirror
     * source to a Traffic Mirror target. Create a filter, and then assign it to
     * the session to define a subset of the traffic to mirror, for example all
     * TCP traffic.
     * </p>
     * <p>
     * The Traffic Mirror source and the Traffic Mirror target (monitoring
     * appliances) can be in the same VPC, or in a different VPC connected via
     * VPC peering or a transit gateway.
     * </p>
     * <p>
     * By default, no traffic is mirrored. Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTrafficMirrorFilter.htm"
     * >CreateTrafficMirrorFilter</a> to create filter rules that specify the
     * traffic to mirror.
     * </p>
     * 
     * @param createTrafficMirrorSessionRequest
     * @return createTrafficMirrorSessionResult The response from the
     *         CreateTrafficMirrorSession service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTrafficMirrorSessionResult createTrafficMirrorSession(
            CreateTrafficMirrorSessionRequest createTrafficMirrorSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a target for your Traffic Mirror session.
     * </p>
     * <p>
     * A Traffic Mirror target is the destination for mirrored traffic. The
     * Traffic Mirror source and the Traffic Mirror target (monitoring
     * appliances) can be in the same VPC, or in different VPCs connected via
     * VPC peering or a transit gateway.
     * </p>
     * <p>
     * A Traffic Mirror target can be a network interface, or a Network Load
     * Balancer.
     * </p>
     * <p>
     * To use the target in a Traffic Mirror session, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTrafficMirrorSession.htm"
     * >CreateTrafficMirrorSession</a>.
     * </p>
     * 
     * @param createTrafficMirrorTargetRequest
     * @return createTrafficMirrorTargetResult The response from the
     *         CreateTrafficMirrorTarget service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTrafficMirrorTargetResult createTrafficMirrorTarget(
            CreateTrafficMirrorTargetRequest createTrafficMirrorTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a transit gateway.
     * </p>
     * <p>
     * You can use a transit gateway to interconnect your virtual private clouds
     * (VPC) and on-premises networks. After the transit gateway enters the
     * <code>available</code> state, you can attach your VPCs and VPN
     * connections to the transit gateway.
     * </p>
     * <p>
     * To attach your VPCs, use <a>CreateTransitGatewayVpcAttachment</a>.
     * </p>
     * <p>
     * To attach a VPN connection, use <a>CreateCustomerGateway</a> to create a
     * customer gateway and specify the ID of the customer gateway and the ID of
     * the transit gateway in a call to <a>CreateVpnConnection</a>.
     * </p>
     * <p>
     * When you create a transit gateway, we create a default transit gateway
     * route table and use it as the default association route table and the
     * default propagation route table. You can use
     * <a>CreateTransitGatewayRouteTable</a> to create additional transit
     * gateway route tables. If you disable automatic route propagation, we do
     * not create a default transit gateway route table. You can use
     * <a>EnableTransitGatewayRouteTablePropagation</a> to propagate routes from
     * a resource attachment to a transit gateway route table. If you disable
     * automatic associations, you can use
     * <a>AssociateTransitGatewayRouteTable</a> to associate a resource
     * attachment with a transit gateway route table.
     * </p>
     * 
     * @param createTransitGatewayRequest
     * @return createTransitGatewayResult The response from the
     *         CreateTransitGateway service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTransitGatewayResult createTransitGateway(
            CreateTransitGatewayRequest createTransitGatewayRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a multicast domain using the specified transit gateway.
     * </p>
     * <p>
     * The transit gateway must be in the available state before you create a
     * domain. Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGateways.html"
     * >DescribeTransitGateways</a> to see the state of transit gateway.
     * </p>
     * 
     * @param createTransitGatewayMulticastDomainRequest
     * @return createTransitGatewayMulticastDomainResult The response from the
     *         CreateTransitGatewayMulticastDomain service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTransitGatewayMulticastDomainResult createTransitGatewayMulticastDomain(
            CreateTransitGatewayMulticastDomainRequest createTransitGatewayMulticastDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Requests a transit gateway peering attachment between the specified
     * transit gateway (requester) and a peer transit gateway (accepter). The
     * transit gateways must be in different Regions. The peer transit gateway
     * can be in your account or a different AWS account.
     * </p>
     * <p>
     * After you create the peering attachment, the owner of the accepter
     * transit gateway must accept the attachment request.
     * </p>
     * 
     * @param createTransitGatewayPeeringAttachmentRequest
     * @return createTransitGatewayPeeringAttachmentResult The response from the
     *         CreateTransitGatewayPeeringAttachment service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTransitGatewayPeeringAttachmentResult createTransitGatewayPeeringAttachment(
            CreateTransitGatewayPeeringAttachmentRequest createTransitGatewayPeeringAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a static route for the specified transit gateway route table.
     * </p>
     * 
     * @param createTransitGatewayRouteRequest
     * @return createTransitGatewayRouteResult The response from the
     *         CreateTransitGatewayRoute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTransitGatewayRouteResult createTransitGatewayRoute(
            CreateTransitGatewayRouteRequest createTransitGatewayRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a route table for the specified transit gateway.
     * </p>
     * 
     * @param createTransitGatewayRouteTableRequest
     * @return createTransitGatewayRouteTableResult The response from the
     *         CreateTransitGatewayRouteTable service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTransitGatewayRouteTableResult createTransitGatewayRouteTable(
            CreateTransitGatewayRouteTableRequest createTransitGatewayRouteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches the specified VPC to the specified transit gateway.
     * </p>
     * <p>
     * If you attach a VPC with a CIDR range that overlaps the CIDR range of a
     * VPC that is already attached, the new VPC CIDR range is not propagated to
     * the default propagation route table.
     * </p>
     * <p>
     * To send VPC traffic to an attached transit gateway, add a route to the
     * VPC route table using <a>CreateRoute</a>.
     * </p>
     * 
     * @param createTransitGatewayVpcAttachmentRequest
     * @return createTransitGatewayVpcAttachmentResult The response from the
     *         CreateTransitGatewayVpcAttachment service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateTransitGatewayVpcAttachmentResult createTransitGatewayVpcAttachment(
            CreateTransitGatewayVpcAttachmentRequest createTransitGatewayVpcAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an EBS volume that can be attached to an instance in the same
     * Availability Zone. The volume is created in the regional endpoint that
     * you send the HTTP request to. For more information see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * </p>
     * <p>
     * You can create a new empty volume or restore a volume from an EBS
     * snapshot. Any AWS Marketplace product codes from the snapshot are
     * propagated to the volume.
     * </p>
     * <p>
     * You can create encrypted volumes. Encrypted volumes must be attached to
     * instances that support Amazon EBS encryption. Volumes that are created
     * from encrypted snapshots are also automatically encrypted. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * You can tag your volumes during creation. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html"
     * >Creating an Amazon EBS Volume</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param createVolumeRequest
     * @return createVolumeResult The response from the CreateVolume service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a VPC with the specified IPv4 CIDR block. The smallest VPC you
     * can create uses a /28 netmask (16 IPv4 addresses), and the largest uses a
     * /16 netmask (65,536 IPv4 addresses). For more information about how large
     * to make your VPC, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your
     * VPC and Subnets</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * You can optionally request an IPv6 CIDR block for the VPC. You can
     * request an Amazon-provided IPv6 CIDR block from Amazon's pool of IPv6
     * addresses, or an IPv6 CIDR block from an IPv6 address pool that you
     * provisioned through bring your own IP addresses (<a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html"
     * >BYOIP</a>).
     * </p>
     * <p>
     * By default, each instance you launch in the VPC has the default DHCP
     * options, which include only a default DNS server that we provide
     * (AmazonProvidedDNS). For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html"
     * >DHCP Options Sets</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * You can specify the instance tenancy value for the VPC when you create
     * it. You can't change this value for the VPC after you create it. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html"
     * >Dedicated Instances</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param createVpcRequest
     * @return createVpcResult The response from the CreateVpc service method,
     *         as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVpcResult createVpc(CreateVpcRequest createVpcRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a VPC endpoint for a specified service. An endpoint enables you
     * to create a private connection between your VPC and the service. The
     * service may be provided by AWS, an AWS Marketplace Partner, or another
     * AWS account. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html">VPC
     * Endpoints</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * A <code>gateway</code> endpoint serves as a target for a route in your
     * route table for traffic destined for the AWS service. You can specify an
     * endpoint policy to attach to the endpoint, which will control access to
     * the service from your VPC. You can also specify the VPC route tables that
     * use the endpoint.
     * </p>
     * <p>
     * An <code>interface</code> endpoint is a network interface in your subnet
     * that serves as an endpoint for communicating with the specified service.
     * You can specify the subnets in which to create an endpoint, and the
     * security groups to associate with the endpoint network interface.
     * </p>
     * <p>
     * Use <a>DescribeVpcEndpointServices</a> to get a list of supported
     * services.
     * </p>
     * 
     * @param createVpcEndpointRequest <p>
     *            Contains the parameters for CreateVpcEndpoint.
     *            </p>
     * @return createVpcEndpointResult The response from the CreateVpcEndpoint
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a connection notification for a specified VPC endpoint or VPC
     * endpoint service. A connection notification notifies you of specific
     * endpoint events. You must create an SNS topic to receive notifications.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Create
     * a Topic</a> in the <i>Amazon Simple Notification Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can create a connection notification for interface endpoints only.
     * </p>
     * 
     * @param createVpcEndpointConnectionNotificationRequest
     * @return createVpcEndpointConnectionNotificationResult The response from
     *         the CreateVpcEndpointConnectionNotification service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVpcEndpointConnectionNotificationResult createVpcEndpointConnectionNotification(
            CreateVpcEndpointConnectionNotificationRequest createVpcEndpointConnectionNotificationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a VPC endpoint service configuration to which service consumers
     * (AWS accounts, IAM users, and IAM roles) can connect. Service consumers
     * can create an interface VPC endpoint to connect to your service.
     * </p>
     * <p>
     * To create an endpoint service configuration, you must first create a
     * Network Load Balancer for your service. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html"
     * >VPC Endpoint Services</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * If you set the private DNS name, you must prove that you own the private
     * DNS domain name. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html"
     * >VPC Endpoint Service Private DNS Name Verification</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param createVpcEndpointServiceConfigurationRequest
     * @return createVpcEndpointServiceConfigurationResult The response from the
     *         CreateVpcEndpointServiceConfiguration service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVpcEndpointServiceConfigurationResult createVpcEndpointServiceConfiguration(
            CreateVpcEndpointServiceConfigurationRequest createVpcEndpointServiceConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC that
     * you own and an accepter VPC with which to create the connection. The
     * accepter VPC can belong to another AWS account and can be in a different
     * Region to the requester VPC. The requester VPC and accepter VPC cannot
     * have overlapping CIDR blocks.
     * </p>
     * <note>
     * <p>
     * Limitations and rules apply to a VPC peering connection. For more
     * information, see the <a href=
     * "https://docs.aws.amazon.com/vpc/latest/peering/vpc-peering-basics.html#vpc-peering-limitations"
     * >limitations</a> section in the <i>VPC Peering Guide</i>.
     * </p>
     * </note>
     * <p>
     * The owner of the accepter VPC must accept the peering request to activate
     * the peering connection. The VPC peering connection request expires after
     * 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * If you create a VPC peering connection request between VPCs with
     * overlapping CIDR blocks, the VPC peering connection has a status of
     * <code>failed</code>.
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     * @return createVpcPeeringConnectionResult The response from the
     *         CreateVpcPeeringConnection service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVpcPeeringConnectionResult createVpcPeeringConnection(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a VPN connection between an existing virtual private gateway and
     * a VPN customer gateway. The supported connection type is
     * <code>ipsec.1</code>.
     * </p>
     * <p>
     * The response includes information that you need to give to your network
     * administrator to configure your customer gateway.
     * </p>
     * <important>
     * <p>
     * We strongly recommend that you use HTTPS when calling this operation
     * because the response contains sensitive cryptographic information for
     * configuring your customer gateway.
     * </p>
     * </important>
     * <p>
     * If you decide to shut down your VPN connection for any reason and later
     * create a new VPN connection, you must reconfigure your customer gateway
     * with the new information returned from this call.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more than
     * once, Amazon EC2 doesn't return an error.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRequest <p>
     *            Contains the parameters for CreateVpnConnection.
     *            </p>
     * @return createVpnConnectionResult The response from the
     *         CreateVpnConnection service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVpnConnectionResult createVpnConnection(
            CreateVpnConnectionRequest createVpnConnectionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a static route associated with a VPN connection between an
     * existing virtual private gateway and a VPN customer gateway. The static
     * route allows traffic to be routed from the virtual private gateway to the
     * VPN customer gateway.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param createVpnConnectionRouteRequest <p>
     *            Contains the parameters for CreateVpnConnectionRoute.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the
     * endpoint on the VPC side of your VPN connection. You can create a virtual
     * private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param createVpnGatewayRequest <p>
     *            Contains the parameters for CreateVpnGateway.
     *            </p>
     * @return createVpnGatewayResult The response from the CreateVpnGateway
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Client VPN endpoint. You must disassociate all
     * target networks before you can delete a Client VPN endpoint.
     * </p>
     * 
     * @param deleteClientVpnEndpointRequest
     * @return deleteClientVpnEndpointResult The response from the
     *         DeleteClientVpnEndpoint service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteClientVpnEndpointResult deleteClientVpnEndpoint(
            DeleteClientVpnEndpointRequest deleteClientVpnEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a route from a Client VPN endpoint. You can only delete routes
     * that you manually added using the <b>CreateClientVpnRoute</b> action. You
     * cannot delete routes that were automatically added when associating a
     * subnet. To remove routes that have been automatically added, disassociate
     * the target subnet from the Client VPN endpoint.
     * </p>
     * 
     * @param deleteClientVpnRouteRequest
     * @return deleteClientVpnRouteResult The response from the
     *         DeleteClientVpnRoute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteClientVpnRouteResult deleteClientVpnRoute(
            DeleteClientVpnRouteRequest deleteClientVpnRouteRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN
     * connection before you can delete the customer gateway.
     * </p>
     * 
     * @param deleteCustomerGatewayRequest <p>
     *            Contains the parameters for DeleteCustomerGateway.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the set
     * of DHCP options before you can delete it. You can disassociate the set of
     * DHCP options by associating either a new set of options or the default
     * set of options with the VPC.
     * </p>
     * 
     * @param deleteDhcpOptionsRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an egress-only internet gateway.
     * </p>
     * 
     * @param deleteEgressOnlyInternetGatewayRequest
     * @return deleteEgressOnlyInternetGatewayResult The response from the
     *         DeleteEgressOnlyInternetGateway service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteEgressOnlyInternetGatewayResult deleteEgressOnlyInternetGateway(
            DeleteEgressOnlyInternetGatewayRequest deleteEgressOnlyInternetGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified EC2 Fleet.
     * </p>
     * <p>
     * After you delete an EC2 Fleet, it launches no new instances. You must
     * specify whether an EC2 Fleet should also terminate its instances. If you
     * terminate the instances, the EC2 Fleet enters the
     * <code>deleted_terminating</code> state. Otherwise, the EC2 Fleet enters
     * the <code>deleted_running</code> state, and the instances continue to run
     * until they are interrupted or you terminate them manually.
     * </p>
     * 
     * @param deleteFleetsRequest
     * @return deleteFleetsResult The response from the DeleteFleets service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteFleetsResult deleteFleets(DeleteFleetsRequest deleteFleetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes one or more flow logs.
     * </p>
     * 
     * @param deleteFlowLogsRequest
     * @return deleteFlowLogsResult The response from the DeleteFlowLogs service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteFlowLogsResult deleteFlowLogs(DeleteFlowLogsRequest deleteFlowLogsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Amazon FPGA Image (AFI).
     * </p>
     * 
     * @param deleteFpgaImageRequest
     * @return deleteFpgaImageResult The response from the DeleteFpgaImage
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteFpgaImageResult deleteFpgaImage(DeleteFpgaImageRequest deleteFpgaImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified internet gateway. You must detach the internet
     * gateway from the VPC before you can delete it.
     * </p>
     * 
     * @param deleteInternetGatewayRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from Amazon
     * EC2.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a launch template. Deleting a launch template deletes all of its
     * versions.
     * </p>
     * 
     * @param deleteLaunchTemplateRequest
     * @return deleteLaunchTemplateResult The response from the
     *         DeleteLaunchTemplate service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteLaunchTemplateResult deleteLaunchTemplate(
            DeleteLaunchTemplateRequest deleteLaunchTemplateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes one or more versions of a launch template. You cannot delete the
     * default version of a launch template; you must first assign a different
     * version as the default. If the default version is the only version for
     * the launch template, you must delete the entire launch template using
     * <a>DeleteLaunchTemplate</a>.
     * </p>
     * 
     * @param deleteLaunchTemplateVersionsRequest
     * @return deleteLaunchTemplateVersionsResult The response from the
     *         DeleteLaunchTemplateVersions service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteLaunchTemplateVersionsResult deleteLaunchTemplateVersions(
            DeleteLaunchTemplateVersionsRequest deleteLaunchTemplateVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified route from the specified local gateway route table.
     * </p>
     * 
     * @param deleteLocalGatewayRouteRequest
     * @return deleteLocalGatewayRouteResult The response from the
     *         DeleteLocalGatewayRoute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteLocalGatewayRouteResult deleteLocalGatewayRoute(
            DeleteLocalGatewayRouteRequest deleteLocalGatewayRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified association between a VPC and local gateway route
     * table.
     * </p>
     * 
     * @param deleteLocalGatewayRouteTableVpcAssociationRequest
     * @return deleteLocalGatewayRouteTableVpcAssociationResult The response
     *         from the DeleteLocalGatewayRouteTableVpcAssociation service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteLocalGatewayRouteTableVpcAssociationResult deleteLocalGatewayRouteTableVpcAssociation(
            DeleteLocalGatewayRouteTableVpcAssociationRequest deleteLocalGatewayRouteTableVpcAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified NAT gateway. Deleting a NAT gateway disassociates
     * its Elastic IP address, but does not release the address from your
     * account. Deleting a NAT gateway does not delete any NAT gateway routes in
     * your route tables.
     * </p>
     * 
     * @param deleteNatGatewayRequest
     * @return deleteNatGatewayResult The response from the DeleteNatGateway
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteNatGatewayResult deleteNatGateway(DeleteNatGatewayRequest deleteNatGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's
     * associated with any subnets. You can't delete the default network ACL.
     * </p>
     * 
     * @param deleteNetworkAclRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the specified
     * network ACL.
     * </p>
     * 
     * @param deleteNetworkAclEntryRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network
     * interface before you can delete it.
     * </p>
     * 
     * @param deleteNetworkInterfaceRequest <p>
     *            Contains the parameters for DeleteNetworkInterface.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a permission for a network interface. By default, you cannot
     * delete the permission if the account for which you're removing the
     * permission has attached the network interface to an instance. However,
     * you can force delete the permission, regardless of any attachment.
     * </p>
     * 
     * @param deleteNetworkInterfacePermissionRequest <p>
     *            Contains the parameters for DeleteNetworkInterfacePermission.
     *            </p>
     * @return deleteNetworkInterfacePermissionResult The response from the
     *         DeleteNetworkInterfacePermission service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteNetworkInterfacePermissionResult deleteNetworkInterfacePermission(
            DeleteNetworkInterfacePermissionRequest deleteNetworkInterfacePermissionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified placement group. You must terminate all instances
     * in the placement group before you can delete the placement group. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param deletePlacementGroupRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the queued purchases for the specified Reserved Instances.
     * </p>
     * 
     * @param deleteQueuedReservedInstancesRequest
     * @return deleteQueuedReservedInstancesResult The response from the
     *         DeleteQueuedReservedInstances service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteQueuedReservedInstancesResult deleteQueuedReservedInstances(
            DeleteQueuedReservedInstancesRequest deleteQueuedReservedInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     * 
     * @param deleteRouteRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteRoute(DeleteRouteRequest deleteRouteRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route table
     * from any subnets before you can delete it. You can't delete the main
     * route table.
     * </p>
     * 
     * @param deleteRouteTableRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a security group.
     * </p>
     * <p>
     * If you attempt to delete a security group that is associated with an
     * instance, or is referenced by another security group, the operation fails
     * with <code>InvalidGroup.InUse</code> in EC2-Classic or
     * <code>DependencyViolation</code> in EC2-VPC.
     * </p>
     * 
     * @param deleteSecurityGroupRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a volume, the snapshots are
     * incremental, and only the blocks on the device that have changed since
     * your last snapshot are saved in the new snapshot. When you delete a
     * snapshot, only the data not needed for any other snapshot is removed. So
     * regardless of which prior snapshots have been deleted, all active
     * snapshots will have access to all the information needed to restore the
     * volume.
     * </p>
     * <p>
     * You cannot delete a snapshot of the root device of an EBS volume used by
     * a registered AMI. You must first de-register the AMI before you can
     * delete the snapshot.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html"
     * >Deleting an Amazon EBS Snapshot</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the data feed for Spot Instances.
     * </p>
     * 
     * @param deleteSpotDatafeedSubscriptionRequest <p>
     *            Contains the parameters for DeleteSpotDatafeedSubscription.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteSpotDatafeedSubscription(
            DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running instances in
     * the subnet before you can delete the subnet.
     * </p>
     * 
     * @param deleteSubnetRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteSubnet(DeleteSubnetRequest deleteSubnetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of resources.
     * </p>
     * <p>
     * To list the current tags, use <a>DescribeTags</a>. For more information
     * about tags, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Resources</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param deleteTagsRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteTags(DeleteTagsRequest deleteTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Traffic Mirror filter.
     * </p>
     * <p>
     * You cannot delete a Traffic Mirror filter that is in use by a Traffic
     * Mirror session.
     * </p>
     * 
     * @param deleteTrafficMirrorFilterRequest
     * @return deleteTrafficMirrorFilterResult The response from the
     *         DeleteTrafficMirrorFilter service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTrafficMirrorFilterResult deleteTrafficMirrorFilter(
            DeleteTrafficMirrorFilterRequest deleteTrafficMirrorFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Traffic Mirror rule.
     * </p>
     * 
     * @param deleteTrafficMirrorFilterRuleRequest
     * @return deleteTrafficMirrorFilterRuleResult The response from the
     *         DeleteTrafficMirrorFilterRule service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTrafficMirrorFilterRuleResult deleteTrafficMirrorFilterRule(
            DeleteTrafficMirrorFilterRuleRequest deleteTrafficMirrorFilterRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Traffic Mirror session.
     * </p>
     * 
     * @param deleteTrafficMirrorSessionRequest
     * @return deleteTrafficMirrorSessionResult The response from the
     *         DeleteTrafficMirrorSession service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTrafficMirrorSessionResult deleteTrafficMirrorSession(
            DeleteTrafficMirrorSessionRequest deleteTrafficMirrorSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Traffic Mirror target.
     * </p>
     * <p>
     * You cannot delete a Traffic Mirror target that is in use by a Traffic
     * Mirror session.
     * </p>
     * 
     * @param deleteTrafficMirrorTargetRequest
     * @return deleteTrafficMirrorTargetResult The response from the
     *         DeleteTrafficMirrorTarget service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTrafficMirrorTargetResult deleteTrafficMirrorTarget(
            DeleteTrafficMirrorTargetRequest deleteTrafficMirrorTargetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified transit gateway.
     * </p>
     * 
     * @param deleteTransitGatewayRequest
     * @return deleteTransitGatewayResult The response from the
     *         DeleteTransitGateway service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTransitGatewayResult deleteTransitGateway(
            DeleteTransitGatewayRequest deleteTransitGatewayRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified transit gateway multicast domain.
     * </p>
     * 
     * @param deleteTransitGatewayMulticastDomainRequest
     * @return deleteTransitGatewayMulticastDomainResult The response from the
     *         DeleteTransitGatewayMulticastDomain service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTransitGatewayMulticastDomainResult deleteTransitGatewayMulticastDomain(
            DeleteTransitGatewayMulticastDomainRequest deleteTransitGatewayMulticastDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a transit gateway peering attachment.
     * </p>
     * 
     * @param deleteTransitGatewayPeeringAttachmentRequest
     * @return deleteTransitGatewayPeeringAttachmentResult The response from the
     *         DeleteTransitGatewayPeeringAttachment service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTransitGatewayPeeringAttachmentResult deleteTransitGatewayPeeringAttachment(
            DeleteTransitGatewayPeeringAttachmentRequest deleteTransitGatewayPeeringAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified route from the specified transit gateway route
     * table.
     * </p>
     * 
     * @param deleteTransitGatewayRouteRequest
     * @return deleteTransitGatewayRouteResult The response from the
     *         DeleteTransitGatewayRoute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTransitGatewayRouteResult deleteTransitGatewayRoute(
            DeleteTransitGatewayRouteRequest deleteTransitGatewayRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified transit gateway route table. You must disassociate
     * the route table from any transit gateway route tables before you can
     * delete it.
     * </p>
     * 
     * @param deleteTransitGatewayRouteTableRequest
     * @return deleteTransitGatewayRouteTableResult The response from the
     *         DeleteTransitGatewayRouteTable service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTransitGatewayRouteTableResult deleteTransitGatewayRouteTable(
            DeleteTransitGatewayRouteTableRequest deleteTransitGatewayRouteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified VPC attachment.
     * </p>
     * 
     * @param deleteTransitGatewayVpcAttachmentRequest
     * @return deleteTransitGatewayVpcAttachmentResult The response from the
     *         DeleteTransitGatewayVpcAttachment service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTransitGatewayVpcAttachmentResult deleteTransitGatewayVpcAttachment(
            DeleteTransitGatewayVpcAttachmentRequest deleteTransitGatewayVpcAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified EBS volume. The volume must be in the
     * <code>available</code> state (not attached to an instance).
     * </p>
     * <p>
     * The volume can remain in the <code>deleting</code> state for several
     * minutes.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-volume.html"
     * >Deleting an Amazon EBS Volume</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param deleteVolumeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteVolume(DeleteVolumeRequest deleteVolumeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified VPC. You must detach or delete all gateways and
     * resources that are associated with the VPC before you can delete it. For
     * example, you must terminate all instances running in the VPC, delete all
     * security groups associated with the VPC (except the default one), delete
     * all route tables associated with the VPC (except the default one), and so
     * on.
     * </p>
     * 
     * @param deleteVpcRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteVpc(DeleteVpcRequest deleteVpcRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes one or more VPC endpoint connection notifications.
     * </p>
     * 
     * @param deleteVpcEndpointConnectionNotificationsRequest
     * @return deleteVpcEndpointConnectionNotificationsResult The response from
     *         the DeleteVpcEndpointConnectionNotifications service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteVpcEndpointConnectionNotificationsResult deleteVpcEndpointConnectionNotifications(
            DeleteVpcEndpointConnectionNotificationsRequest deleteVpcEndpointConnectionNotificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes one or more VPC endpoint service configurations in your account.
     * Before you delete the endpoint service configuration, you must reject any
     * <code>Available</code> or <code>PendingAcceptance</code> interface
     * endpoint connections that are attached to the service.
     * </p>
     * 
     * @param deleteVpcEndpointServiceConfigurationsRequest
     * @return deleteVpcEndpointServiceConfigurationsResult The response from
     *         the DeleteVpcEndpointServiceConfigurations service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteVpcEndpointServiceConfigurationsResult deleteVpcEndpointServiceConfigurations(
            DeleteVpcEndpointServiceConfigurationsRequest deleteVpcEndpointServiceConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes one or more specified VPC endpoints. Deleting a gateway endpoint
     * also deletes the endpoint routes in the route tables that were associated
     * with the endpoint. Deleting an interface endpoint deletes the endpoint
     * network interfaces.
     * </p>
     * 
     * @param deleteVpcEndpointsRequest <p>
     *            Contains the parameters for DeleteVpcEndpoints.
     *            </p>
     * @return deleteVpcEndpointsResult The response from the DeleteVpcEndpoints
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteVpcEndpointsResult deleteVpcEndpoints(DeleteVpcEndpointsRequest deleteVpcEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a VPC peering connection. Either the owner of the requester VPC
     * or the owner of the accepter VPC can delete the VPC peering connection if
     * it's in the <code>active</code> state. The owner of the requester VPC can
     * delete a VPC peering connection in the <code>pending-acceptance</code>
     * state. You cannot delete a VPC peering connection that's in the
     * <code>failed</code> state.
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
     * @return deleteVpcPeeringConnectionResult The response from the
     *         DeleteVpcPeeringConnection service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(
            DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified VPN connection.
     * </p>
     * <p>
     * If you're deleting the VPC and its associated components, we recommend
     * that you detach the virtual private gateway from the VPC and delete the
     * VPC before deleting the VPN connection. If you believe that the tunnel
     * credentials for your VPN connection have been compromised, you can delete
     * the VPN connection and create a new one that has new keys, without
     * needing to delete the VPC or virtual private gateway. If you create a new
     * VPN connection, you must reconfigure the customer gateway device using
     * the new configuration information returned with the new VPN connection
     * ID.
     * </p>
     * <p>
     * For certificate-based authentication, delete all AWS Certificate Manager
     * (ACM) private certificates used for the AWS-side tunnel endpoints for the
     * VPN connection before deleting the VPN connection.
     * </p>
     * 
     * @param deleteVpnConnectionRequest <p>
     *            Contains the parameters for DeleteVpnConnection.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection
     * between an existing virtual private gateway and a VPN customer gateway.
     * The static route allows traffic to be routed from the virtual private
     * gateway to the VPN customer gateway.
     * </p>
     * 
     * @param deleteVpnConnectionRouteRequest <p>
     *            Contains the parameters for DeleteVpnConnectionRoute.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified virtual private gateway. You must first detach the
     * virtual private gateway from the VPC. Note that you don't need to delete
     * the virtual private gateway if you plan to delete and recreate the VPN
     * connection between your VPC and your network.
     * </p>
     * 
     * @param deleteVpnGatewayRequest <p>
     *            Contains the parameters for DeleteVpnGateway.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Releases the specified address range that you provisioned for use with
     * your AWS resources through bring your own IP addresses (BYOIP) and
     * deletes the corresponding address pool.
     * </p>
     * <p>
     * Before you can release an address range, you must stop advertising it
     * using <a>WithdrawByoipCidr</a> and you must not have any IP addresses
     * allocated from its address range.
     * </p>
     * 
     * @param deprovisionByoipCidrRequest
     * @return deprovisionByoipCidrResult The response from the
     *         DeprovisionByoipCidr service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeprovisionByoipCidrResult deprovisionByoipCidr(
            DeprovisionByoipCidrRequest deprovisionByoipCidrRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't be
     * used to launch new instances; however, it doesn't affect any instances
     * that you've already launched from the AMI. You'll continue to incur usage
     * costs for those instances until you terminate them.
     * </p>
     * <p>
     * When you deregister an Amazon EBS-backed AMI, it doesn't affect the
     * snapshot that was created for the root volume of the instance during the
     * AMI creation process. When you deregister an instance store-backed AMI,
     * it doesn't affect the files that you uploaded to Amazon S3 when you
     * created the AMI.
     * </p>
     * 
     * @param deregisterImageRequest <p>
     *            Contains the parameters for DeregisterImage.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deregisterImage(DeregisterImageRequest deregisterImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deregisters tag keys to prevent tags that have the specified tag keys
     * from being included in scheduled event notifications for resources in the
     * Region.
     * </p>
     * 
     * @param deregisterInstanceEventNotificationAttributesRequest
     * @return deregisterInstanceEventNotificationAttributesResult The response
     *         from the DeregisterInstanceEventNotificationAttributes service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeregisterInstanceEventNotificationAttributesResult deregisterInstanceEventNotificationAttributes(
            DeregisterInstanceEventNotificationAttributesRequest deregisterInstanceEventNotificationAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deregisters the specified members (network interfaces) from the transit
     * gateway multicast group.
     * </p>
     * 
     * @param deregisterTransitGatewayMulticastGroupMembersRequest
     * @return deregisterTransitGatewayMulticastGroupMembersResult The response
     *         from the DeregisterTransitGatewayMulticastGroupMembers service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeregisterTransitGatewayMulticastGroupMembersResult deregisterTransitGatewayMulticastGroupMembers(
            DeregisterTransitGatewayMulticastGroupMembersRequest deregisterTransitGatewayMulticastGroupMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deregisters the specified sources (network interfaces) from the transit
     * gateway multicast group.
     * </p>
     * 
     * @param deregisterTransitGatewayMulticastGroupSourcesRequest
     * @return deregisterTransitGatewayMulticastGroupSourcesResult The response
     *         from the DeregisterTransitGatewayMulticastGroupSources service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeregisterTransitGatewayMulticastGroupSourcesResult deregisterTransitGatewayMulticastGroupSources(
            DeregisterTransitGatewayMulticastGroupSourcesRequest deregisterTransitGatewayMulticastGroupSourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes attributes of your AWS account. The following are the supported
     * account attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>supported-platforms</code>: Indicates whether your account can
     * launch instances into EC2-Classic and EC2-VPC, or only into EC2-VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-vpc</code>: The ID of the default VPC for your account, or
     * <code>none</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>max-instances</code>: This attribute is no longer supported. The
     * returned value does not reflect your actual vCPU limit for running
     * On-Demand Instances. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-on-demand-instances.html#ec2-on-demand-instances-limits"
     * >On-Demand Instance Limits</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-max-security-groups-per-interface</code>: The maximum number of
     * security groups that you can assign to a network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>max-elastic-ips</code>: The maximum number of Elastic IP addresses
     * that you can allocate for use with EC2-Classic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-max-elastic-ips</code>: The maximum number of Elastic IP
     * addresses that you can allocate for use with EC2-VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeAccountAttributesRequest
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified Elastic IP addresses or all of your Elastic IP
     * addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in
     * a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeAddressesRequest
     * @return describeAddressesResult The response from the DescribeAddresses
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the longer ID format settings for all resource types in a
     * specific Region. This request is useful for performing a quick audit to
     * determine whether a specific Region is fully opted in for longer IDs
     * (17-character IDs).
     * </p>
     * <p>
     * This request only returns information about resource types that support
     * longer IDs.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> |
     * <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> |
     * <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * 
     * @param describeAggregateIdFormatRequest
     * @return describeAggregateIdFormatResult The response from the
     *         DescribeAggregateIdFormat service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeAggregateIdFormatResult describeAggregateIdFormat(
            DescribeAggregateIdFormatRequest describeAggregateIdFormatRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Availability Zones and Local Zones that are available to
     * you. If there is an event impacting an Availability Zone or Local Zone,
     * you can use this request to view the state and any provided messages for
     * that Availability Zone or Local Zone.
     * </p>
     * <p>
     * For more information about Availability Zones and Local Zones, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html"
     * >Regions and Availability Zones</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param describeAvailabilityZonesRequest
     * @return describeAvailabilityZonesResult The response from the
     *         DescribeAvailabilityZones service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeAvailabilityZonesResult describeAvailabilityZones(
            DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified bundle tasks or all of your bundle tasks.
     * </p>
     * <note>
     * <p>
     * Completed bundle tasks are listed for only a limited time. If your bundle
     * task is no longer in the list, you can still register an AMI from it.
     * Just use <code>RegisterImage</code> with the Amazon S3 bucket name and
     * image manifest name you provided to the bundle task.
     * </p>
     * </note>
     * 
     * @param describeBundleTasksRequest
     * @return describeBundleTasksResult The response from the
     *         DescribeBundleTasks service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeBundleTasksResult describeBundleTasks(
            DescribeBundleTasksRequest describeBundleTasksRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the IP address ranges that were specified in calls to
     * <a>ProvisionByoipCidr</a>.
     * </p>
     * <p>
     * To describe the address pools that were created when you provisioned the
     * address ranges, use <a>DescribePublicIpv4Pools</a> or
     * <a>DescribeIpv6Pools</a>.
     * </p>
     * 
     * @param describeByoipCidrsRequest
     * @return describeByoipCidrsResult The response from the DescribeByoipCidrs
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest describeByoipCidrsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your Capacity Reservations. The results describe
     * only the Capacity Reservations in the AWS Region that you're currently
     * using.
     * </p>
     * 
     * @param describeCapacityReservationsRequest
     * @return describeCapacityReservationsResult The response from the
     *         DescribeCapacityReservations service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeCapacityReservationsResult describeCapacityReservations(
            DescribeCapacityReservationsRequest describeCapacityReservationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your linked EC2-Classic instances. This request
     * only returns information about EC2-Classic instances linked to a VPC
     * through ClassicLink. You cannot use this request to return information
     * about other instances.
     * </p>
     * 
     * @param describeClassicLinkInstancesRequest
     * @return describeClassicLinkInstancesResult The response from the
     *         DescribeClassicLinkInstances service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeClassicLinkInstancesResult describeClassicLinkInstances(
            DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the authorization rules for a specified Client VPN endpoint.
     * </p>
     * 
     * @param describeClientVpnAuthorizationRulesRequest
     * @return describeClientVpnAuthorizationRulesResult The response from the
     *         DescribeClientVpnAuthorizationRules service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeClientVpnAuthorizationRulesResult describeClientVpnAuthorizationRules(
            DescribeClientVpnAuthorizationRulesRequest describeClientVpnAuthorizationRulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes active client connections and connections that have been
     * terminated within the last 60 minutes for the specified Client VPN
     * endpoint.
     * </p>
     * 
     * @param describeClientVpnConnectionsRequest
     * @return describeClientVpnConnectionsResult The response from the
     *         DescribeClientVpnConnections service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeClientVpnConnectionsResult describeClientVpnConnections(
            DescribeClientVpnConnectionsRequest describeClientVpnConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more Client VPN endpoints in the account.
     * </p>
     * 
     * @param describeClientVpnEndpointsRequest
     * @return describeClientVpnEndpointsResult The response from the
     *         DescribeClientVpnEndpoints service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeClientVpnEndpointsResult describeClientVpnEndpoints(
            DescribeClientVpnEndpointsRequest describeClientVpnEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the routes for the specified Client VPN endpoint.
     * </p>
     * 
     * @param describeClientVpnRoutesRequest
     * @return describeClientVpnRoutesResult The response from the
     *         DescribeClientVpnRoutes service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeClientVpnRoutesResult describeClientVpnRoutes(
            DescribeClientVpnRoutesRequest describeClientVpnRoutesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the target networks associated with the specified Client VPN
     * endpoint.
     * </p>
     * 
     * @param describeClientVpnTargetNetworksRequest
     * @return describeClientVpnTargetNetworksResult The response from the
     *         DescribeClientVpnTargetNetworks service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeClientVpnTargetNetworksResult describeClientVpnTargetNetworks(
            DescribeClientVpnTargetNetworksRequest describeClientVpnTargetNetworksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified customer-owned address pools or all of your
     * customer-owned address pools.
     * </p>
     * 
     * @param describeCoipPoolsRequest
     * @return describeCoipPoolsResult The response from the DescribeCoipPools
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeCoipPoolsResult describeCoipPools(DescribeCoipPoolsRequest describeCoipPoolsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified conversion tasks or all your conversion tasks.
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/">VM
     * Import/Export User Guide</a>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM
     * Import Manifest</a>.
     * </p>
     * 
     * @param describeConversionTasksRequest
     * @return describeConversionTasksResult The response from the
     *         DescribeConversionTasks service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeConversionTasksResult describeConversionTasks(
            DescribeConversionTasksRequest describeConversionTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param describeCustomerGatewaysRequest <p>
     *            Contains the parameters for DescribeCustomerGateways.
     *            </p>
     * @return describeCustomerGatewaysResult The response from the
     *         DescribeCustomerGateways service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeCustomerGatewaysResult describeCustomerGateways(
            DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your DHCP options sets.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_DHCP_Options.html"
     * >DHCP Options Sets</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeDhcpOptionsRequest
     * @return describeDhcpOptionsResult The response from the
     *         DescribeDhcpOptions service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeDhcpOptionsResult describeDhcpOptions(
            DescribeDhcpOptionsRequest describeDhcpOptionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your egress-only internet gateways.
     * </p>
     * 
     * @param describeEgressOnlyInternetGatewaysRequest
     * @return describeEgressOnlyInternetGatewaysResult The response from the
     *         DescribeEgressOnlyInternetGateways service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeEgressOnlyInternetGatewaysResult describeEgressOnlyInternetGateways(
            DescribeEgressOnlyInternetGatewaysRequest describeEgressOnlyInternetGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Elastic Graphics accelerator associated with your
     * instances. For more information about Elastic Graphics, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html"
     * >Amazon Elastic Graphics</a>.
     * </p>
     * 
     * @param describeElasticGpusRequest
     * @return describeElasticGpusResult The response from the
     *         DescribeElasticGpus service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeElasticGpusResult describeElasticGpus(
            DescribeElasticGpusRequest describeElasticGpusRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the specified export image tasks or all your export image
     * tasks.
     * </p>
     * 
     * @param describeExportImageTasksRequest
     * @return describeExportImageTasksResult The response from the
     *         DescribeExportImageTasks service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeExportImageTasksResult describeExportImageTasks(
            DescribeExportImageTasksRequest describeExportImageTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified export instance tasks or all your export instance
     * tasks.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return describeExportTasksResult The response from the
     *         DescribeExportTasks service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeExportTasksResult describeExportTasks(
            DescribeExportTasksRequest describeExportTasksRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the state of fast snapshot restores for your snapshots.
     * </p>
     * 
     * @param describeFastSnapshotRestoresRequest
     * @return describeFastSnapshotRestoresResult The response from the
     *         DescribeFastSnapshotRestores service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFastSnapshotRestoresResult describeFastSnapshotRestores(
            DescribeFastSnapshotRestoresRequest describeFastSnapshotRestoresRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the events for the specified EC2 Fleet during the specified
     * time.
     * </p>
     * <p>
     * EC2 Fleet events are delayed by up to 30 seconds before they can be
     * described. This ensures that you can query by the last evaluated time and
     * not miss a recorded event. EC2 Fleet events are available for 48 hours.
     * </p>
     * 
     * @param describeFleetHistoryRequest
     * @return describeFleetHistoryResult The response from the
     *         DescribeFleetHistory service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFleetHistoryResult describeFleetHistory(
            DescribeFleetHistoryRequest describeFleetHistoryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the running instances for the specified EC2 Fleet.
     * </p>
     * 
     * @param describeFleetInstancesRequest
     * @return describeFleetInstancesResult The response from the
     *         DescribeFleetInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFleetInstancesResult describeFleetInstances(
            DescribeFleetInstancesRequest describeFleetInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified EC2 Fleets or all of your EC2 Fleets.
     * </p>
     * 
     * @param describeFleetsRequest
     * @return describeFleetsResult The response from the DescribeFleets service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFleetsResult describeFleets(DescribeFleetsRequest describeFleetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more flow logs. To view the information in your flow
     * logs (the log streams for the network interfaces), you must use the
     * CloudWatch Logs console or the CloudWatch Logs API.
     * </p>
     * 
     * @param describeFlowLogsRequest
     * @return describeFlowLogsResult The response from the DescribeFlowLogs
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFlowLogsResult describeFlowLogs(DescribeFlowLogsRequest describeFlowLogsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified attribute of the specified Amazon FPGA Image
     * (AFI).
     * </p>
     * 
     * @param describeFpgaImageAttributeRequest
     * @return describeFpgaImageAttributeResult The response from the
     *         DescribeFpgaImageAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFpgaImageAttributeResult describeFpgaImageAttribute(
            DescribeFpgaImageAttributeRequest describeFpgaImageAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Amazon FPGA Images (AFIs) available to you. These include
     * public AFIs, private AFIs that you own, and AFIs owned by other AWS
     * accounts for which you have load permissions.
     * </p>
     * 
     * @param describeFpgaImagesRequest
     * @return describeFpgaImagesResult The response from the DescribeFpgaImages
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFpgaImagesResult describeFpgaImages(DescribeFpgaImagesRequest describeFpgaImagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Dedicated Host reservations that are available to purchase.
     * </p>
     * <p>
     * The results describe all of the Dedicated Host reservation offerings,
     * including offerings that might not match the instance family and Region
     * of your Dedicated Hosts. When purchasing an offering, ensure that the
     * instance family and Region of the offering matches that of the Dedicated
     * Hosts with which it is to be associated. For more information about
     * supported instance types, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html"
     * >Dedicated Hosts Overview</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeHostReservationOfferingsRequest
     * @return describeHostReservationOfferingsResult The response from the
     *         DescribeHostReservationOfferings service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeHostReservationOfferingsResult describeHostReservationOfferings(
            DescribeHostReservationOfferingsRequest describeHostReservationOfferingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes reservations that are associated with Dedicated Hosts in your
     * account.
     * </p>
     * 
     * @param describeHostReservationsRequest
     * @return describeHostReservationsResult The response from the
     *         DescribeHostReservations service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeHostReservationsResult describeHostReservations(
            DescribeHostReservationsRequest describeHostReservationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified Dedicated Hosts or all your Dedicated Hosts.
     * </p>
     * <p>
     * The results describe only the Dedicated Hosts in the Region you're
     * currently using. All listed instances consume capacity on your Dedicated
     * Host. Dedicated Hosts that have recently been released are listed with
     * the state <code>released</code>.
     * </p>
     * 
     * @param describeHostsRequest
     * @return describeHostsResult The response from the DescribeHosts service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeHostsResult describeHosts(DescribeHostsRequest describeHostsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your IAM instance profile associations.
     * </p>
     * 
     * @param describeIamInstanceProfileAssociationsRequest
     * @return describeIamInstanceProfileAssociationsResult The response from
     *         the DescribeIamInstanceProfileAssociations service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeIamInstanceProfileAssociationsResult describeIamInstanceProfileAssociations(
            DescribeIamInstanceProfileAssociationsRequest describeIamInstanceProfileAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the ID format settings for your resources on a per-Region
     * basis, for example, to view which resource types are enabled for longer
     * IDs. This request only returns information about resource types whose ID
     * formats can be modified; it does not return information about other
     * resource types.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> |
     * <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> |
     * <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * These settings apply to the IAM user who makes the request; they do not
     * apply to the entire AWS account. By default, an IAM user defaults to the
     * same settings as the root user, unless they explicitly override the
     * settings by running the <a>ModifyIdFormat</a> command. Resources created
     * with longer IDs are visible to all IAM users, regardless of these
     * settings and provided that they have permission to use the relevant
     * <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @param describeIdFormatRequest
     * @return describeIdFormatResult The response from the DescribeIdFormat
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeIdFormatResult describeIdFormat(DescribeIdFormatRequest describeIdFormatRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the ID format settings for resources for the specified IAM
     * user, IAM role, or root user. For example, you can view the resource
     * types that are enabled for longer IDs. This request only returns
     * information about resource types whose ID formats can be modified; it
     * does not return information about other resource types. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html"
     * >Resource IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> |
     * <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> |
     * <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * <p>
     * These settings apply to the principal specified in the request. They do
     * not apply to the principal that makes the request.
     * </p>
     * 
     * @param describeIdentityIdFormatRequest
     * @return describeIdentityIdFormatResult The response from the
     *         DescribeIdentityIdFormat service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeIdentityIdFormatResult describeIdentityIdFormat(
            DescribeIdentityIdFormatRequest describeIdentityIdFormatRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified attribute of the specified AMI. You can specify
     * only one attribute at a time.
     * </p>
     * 
     * @param describeImageAttributeRequest <p>
     *            Contains the parameters for DescribeImageAttribute.
     *            </p>
     * @return describeImageAttributeResult The response from the
     *         DescribeImageAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeImageAttributeResult describeImageAttribute(
            DescribeImageAttributeRequest describeImageAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified images (AMIs, AKIs, and ARIs) available to you or
     * all of the images available to you.
     * </p>
     * <p>
     * The images available to you include public images, private images that
     * you own, and private images owned by other AWS accounts for which you
     * have explicit launch permissions.
     * </p>
     * <p>
     * Recently deregistered images appear in the returned results for a short
     * interval and then return empty results. After all instances that
     * reference a deregistered AMI are terminated, specifying the ID of the
     * image results in an error indicating that the AMI ID cannot be found.
     * </p>
     * 
     * @param describeImagesRequest
     * @return describeImagesResult The response from the DescribeImages service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Displays details about an import virtual machine or import snapshot tasks
     * that are already created.
     * </p>
     * 
     * @param describeImportImageTasksRequest
     * @return describeImportImageTasksResult The response from the
     *         DescribeImportImageTasks service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeImportImageTasksResult describeImportImageTasks(
            DescribeImportImageTasksRequest describeImportImageTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your import snapshot tasks.
     * </p>
     * 
     * @param describeImportSnapshotTasksRequest
     * @return describeImportSnapshotTasksResult The response from the
     *         DescribeImportSnapshotTasks service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeImportSnapshotTasksResult describeImportSnapshotTasks(
            DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified attribute of the specified instance. You can
     * specify only one attribute at a time. Valid attribute values are:
     * <code>instanceType</code> | <code>kernel</code> | <code>ramdisk</code> |
     * <code>userData</code> | <code>disableApiTermination</code> |
     * <code>instanceInitiatedShutdownBehavior</code> |
     * <code>rootDeviceName</code> | <code>blockDeviceMapping</code> |
     * <code>productCodes</code> | <code>sourceDestCheck</code> |
     * <code>groupSet</code> | <code>ebsOptimized</code> |
     * <code>sriovNetSupport</code>
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return describeInstanceAttributeResult The response from the
     *         DescribeInstanceAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInstanceAttributeResult describeInstanceAttribute(
            DescribeInstanceAttributeRequest describeInstanceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the credit option for CPU usage of the specified burstable
     * performance instances. The credit options are <code>standard</code> and
     * <code>unlimited</code>.
     * </p>
     * <p>
     * If you do not specify an instance ID, Amazon EC2 returns burstable
     * performance instances with the <code>unlimited</code> credit option, as
     * well as instances that were previously configured as T2, T3, and T3a with
     * the <code>unlimited</code> credit option. For example, if you resize a T2
     * instance, while it is configured as <code>unlimited</code>, to an M4
     * instance, Amazon EC2 returns the M4 instance.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns the credit
     * option (<code>standard</code> or <code>unlimited</code>) of those
     * instances. If you specify an instance ID that is not valid, such as an
     * instance that is not a burstable performance instance, an error is
     * returned.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results. This
     * interval is usually less than one hour.
     * </p>
     * <p>
     * If an Availability Zone is experiencing a service disruption and you
     * specify instance IDs in the affected zone, or do not specify any instance
     * IDs at all, the call fails. If you specify only instance IDs in an
     * unaffected zone, the call works normally.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable Performance Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param describeInstanceCreditSpecificationsRequest
     * @return describeInstanceCreditSpecificationsResult The response from the
     *         DescribeInstanceCreditSpecifications service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInstanceCreditSpecificationsResult describeInstanceCreditSpecifications(
            DescribeInstanceCreditSpecificationsRequest describeInstanceCreditSpecificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the tag keys that are registered to appear in scheduled event
     * notifications for resources in the current Region.
     * </p>
     * 
     * @param describeInstanceEventNotificationAttributesRequest
     * @return describeInstanceEventNotificationAttributesResult The response
     *         from the DescribeInstanceEventNotificationAttributes service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInstanceEventNotificationAttributesResult describeInstanceEventNotificationAttributes(
            DescribeInstanceEventNotificationAttributesRequest describeInstanceEventNotificationAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the status of the specified instances or all of your instances.
     * By default, only running instances are described, unless you specifically
     * indicate to return the status of all instances.
     * </p>
     * <p>
     * Instance status includes the following components:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Status checks</b> - Amazon EC2 performs status checks on running EC2
     * instances to identify hardware and software issues. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-system-instance-status-check.html"
     * >Status Checks for Your Instances</a> and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html"
     * >Troubleshooting Instances with Failed Status Checks</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Scheduled events</b> - Amazon EC2 can schedule events (such as reboot,
     * stop, or terminate) for your instances related to hardware issues,
     * software updates, or system maintenance. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html"
     * >Scheduled Events for Your Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Instance state</b> - You can manage your instances from the moment you
     * launch them through their termination. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"
     * >Instance Lifecycle</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeInstanceStatusRequest
     * @return describeInstanceStatusResult The response from the
     *         DescribeInstanceStatus service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInstanceStatusResult describeInstanceStatus(
            DescribeInstanceStatusRequest describeInstanceStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of all instance types offered. The results can be filtered
     * by location (Region or Availability Zone). If no location is specified,
     * the instance types offered in the current Region are returned.
     * </p>
     * 
     * @param describeInstanceTypeOfferingsRequest
     * @return describeInstanceTypeOfferingsResult The response from the
     *         DescribeInstanceTypeOfferings service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInstanceTypeOfferingsResult describeInstanceTypeOfferings(
            DescribeInstanceTypeOfferingsRequest describeInstanceTypeOfferingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of all instance types offered in your current AWS Region.
     * The results can be filtered by the attributes of the instance types.
     * </p>
     * 
     * @param describeInstanceTypesRequest
     * @return describeInstanceTypesResult The response from the
     *         DescribeInstanceTypes service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInstanceTypesResult describeInstanceTypes(
            DescribeInstanceTypesRequest describeInstanceTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified instances or all of AWS account's instances.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns information
     * for those instances. If you do not specify instance IDs, Amazon EC2
     * returns information for all relevant instances. If you specify an
     * instance ID that is not valid, an error is returned. If you specify an
     * instance that you do not own, it is not included in the returned results.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results. This
     * interval is usually less than one hour.
     * </p>
     * <p>
     * If you describe instances in the rare case where an Availability Zone is
     * experiencing a service disruption and you specify instance IDs that are
     * in the affected zone, or do not specify any instance IDs at all, the call
     * fails. If you describe instances and specify only instance IDs that are
     * in an unaffected zone, the call works normally.
     * </p>
     * 
     * @param describeInstancesRequest
     * @return describeInstancesResult The response from the DescribeInstances
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your internet gateways.
     * </p>
     * 
     * @param describeInternetGatewaysRequest
     * @return describeInternetGatewaysResult The response from the
     *         DescribeInternetGateways service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeInternetGatewaysResult describeInternetGateways(
            DescribeInternetGatewaysRequest describeInternetGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your IPv6 address pools.
     * </p>
     * 
     * @param describeIpv6PoolsRequest
     * @return describeIpv6PoolsResult The response from the DescribeIpv6Pools
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeIpv6PoolsResult describeIpv6Pools(DescribeIpv6PoolsRequest describeIpv6PoolsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified key pairs or all of your key pairs.
     * </p>
     * <p>
     * For more information about key pairs, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeKeyPairsRequest
     * @return describeKeyPairsResult The response from the DescribeKeyPairs
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more versions of a specified launch template. You can
     * describe all versions, individual versions, or a range of versions.
     * </p>
     * 
     * @param describeLaunchTemplateVersionsRequest
     * @return describeLaunchTemplateVersionsResult The response from the
     *         DescribeLaunchTemplateVersions service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLaunchTemplateVersionsResult describeLaunchTemplateVersions(
            DescribeLaunchTemplateVersionsRequest describeLaunchTemplateVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more launch templates.
     * </p>
     * 
     * @param describeLaunchTemplatesRequest
     * @return describeLaunchTemplatesResult The response from the
     *         DescribeLaunchTemplates service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLaunchTemplatesResult describeLaunchTemplates(
            DescribeLaunchTemplatesRequest describeLaunchTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the associations between virtual interface groups and local
     * gateway route tables.
     * </p>
     * 
     * @param describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
     * @return 
     *         describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult
     *         The response from the
     *         DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociations
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
            DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified associations between VPCs and local gateway route
     * tables.
     * </p>
     * 
     * @param describeLocalGatewayRouteTableVpcAssociationsRequest
     * @return describeLocalGatewayRouteTableVpcAssociationsResult The response
     *         from the DescribeLocalGatewayRouteTableVpcAssociations service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLocalGatewayRouteTableVpcAssociationsResult describeLocalGatewayRouteTableVpcAssociations(
            DescribeLocalGatewayRouteTableVpcAssociationsRequest describeLocalGatewayRouteTableVpcAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more local gateway route tables. By default, all local
     * gateway route tables are described. Alternatively, you can filter the
     * results.
     * </p>
     * 
     * @param describeLocalGatewayRouteTablesRequest
     * @return describeLocalGatewayRouteTablesResult The response from the
     *         DescribeLocalGatewayRouteTables service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLocalGatewayRouteTablesResult describeLocalGatewayRouteTables(
            DescribeLocalGatewayRouteTablesRequest describeLocalGatewayRouteTablesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified local gateway virtual interface groups.
     * </p>
     * 
     * @param describeLocalGatewayVirtualInterfaceGroupsRequest
     * @return describeLocalGatewayVirtualInterfaceGroupsResult The response
     *         from the DescribeLocalGatewayVirtualInterfaceGroups service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLocalGatewayVirtualInterfaceGroupsResult describeLocalGatewayVirtualInterfaceGroups(
            DescribeLocalGatewayVirtualInterfaceGroupsRequest describeLocalGatewayVirtualInterfaceGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified local gateway virtual interfaces.
     * </p>
     * 
     * @param describeLocalGatewayVirtualInterfacesRequest
     * @return describeLocalGatewayVirtualInterfacesResult The response from the
     *         DescribeLocalGatewayVirtualInterfaces service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(
            DescribeLocalGatewayVirtualInterfacesRequest describeLocalGatewayVirtualInterfacesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more local gateways. By default, all local gateways are
     * described. Alternatively, you can filter the results.
     * </p>
     * 
     * @param describeLocalGatewaysRequest
     * @return describeLocalGatewaysResult The response from the
     *         DescribeLocalGateways service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeLocalGatewaysResult describeLocalGateways(
            DescribeLocalGatewaysRequest describeLocalGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your Elastic IP addresses that are being moved to the EC2-VPC
     * platform, or that are being restored to the EC2-Classic platform. This
     * request does not return information about any other Elastic IP addresses
     * in your account.
     * </p>
     * 
     * @param describeMovingAddressesRequest
     * @return describeMovingAddressesResult The response from the
     *         DescribeMovingAddresses service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeMovingAddressesResult describeMovingAddresses(
            DescribeMovingAddressesRequest describeMovingAddressesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your NAT gateways.
     * </p>
     * 
     * @param describeNatGatewaysRequest
     * @return describeNatGatewaysResult The response from the
     *         DescribeNatGateways service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeNatGatewaysResult describeNatGateways(
            DescribeNatGatewaysRequest describeNatGatewaysRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your network ACLs.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html"
     * >Network ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeNetworkAclsRequest
     * @return describeNetworkAclsResult The response from the
     *         DescribeNetworkAcls service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeNetworkAclsResult describeNetworkAcls(
            DescribeNetworkAclsRequest describeNetworkAclsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     * 
     * @param describeNetworkInterfaceAttributeRequest <p>
     *            Contains the parameters for DescribeNetworkInterfaceAttribute.
     *            </p>
     * @return describeNetworkInterfaceAttributeResult The response from the
     *         DescribeNetworkInterfaceAttribute service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttribute(
            DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the permissions for your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacePermissionsRequest <p>
     *            Contains the parameters for
     *            DescribeNetworkInterfacePermissions.
     *            </p>
     * @return describeNetworkInterfacePermissionsResult The response from the
     *         DescribeNetworkInterfacePermissions service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeNetworkInterfacePermissionsResult describeNetworkInterfacePermissions(
            DescribeNetworkInterfacePermissionsRequest describeNetworkInterfacePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     * 
     * @param describeNetworkInterfacesRequest <p>
     *            Contains the parameters for DescribeNetworkInterfaces.
     *            </p>
     * @return describeNetworkInterfacesResult The response from the
     *         DescribeNetworkInterfaces service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeNetworkInterfacesResult describeNetworkInterfaces(
            DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified placement groups or all of your placement groups.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describePlacementGroupsRequest
     * @return describePlacementGroupsResult The response from the
     *         DescribePlacementGroups service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribePlacementGroupsResult describePlacementGroups(
            DescribePlacementGroupsRequest describePlacementGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes available AWS services in a prefix list format, which includes
     * the prefix list name and prefix list ID of the service and the IP address
     * range for the service. A prefix list ID is required for creating an
     * outbound security group rule that allows traffic from a VPC to access an
     * AWS service through a gateway VPC endpoint. Currently, the services that
     * support this action are Amazon S3 and Amazon DynamoDB.
     * </p>
     * 
     * @param describePrefixListsRequest
     * @return describePrefixListsResult The response from the
     *         DescribePrefixLists service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribePrefixListsResult describePrefixLists(
            DescribePrefixListsRequest describePrefixListsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the ID format settings for the root user and all IAM roles and
     * IAM users that have explicitly specified a longer ID (17-character ID)
     * preference.
     * </p>
     * <p>
     * By default, all IAM roles and IAM users default to the same ID settings
     * as the root user, unless they explicitly override the settings. This
     * request is useful for identifying those IAM users and IAM roles that have
     * overridden the default ID settings.
     * </p>
     * <p>
     * The following resource types support longer IDs: <code>bundle</code> |
     * <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     * <code>elastic-ip-association</code> | <code>export-task</code> |
     * <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>.
     * </p>
     * 
     * @param describePrincipalIdFormatRequest
     * @return describePrincipalIdFormatResult The response from the
     *         DescribePrincipalIdFormat service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribePrincipalIdFormatResult describePrincipalIdFormat(
            DescribePrincipalIdFormatRequest describePrincipalIdFormatRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified IPv4 address pools.
     * </p>
     * 
     * @param describePublicIpv4PoolsRequest
     * @return describePublicIpv4PoolsResult The response from the
     *         DescribePublicIpv4Pools service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribePublicIpv4PoolsResult describePublicIpv4Pools(
            DescribePublicIpv4PoolsRequest describePublicIpv4PoolsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Regions that are enabled for your account, or all Regions.
     * </p>
     * <p>
     * For a list of the Regions supported by Amazon EC2, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region">
     * Regions and Endpoints</a>.
     * </p>
     * <p>
     * For information about enabling and disabling Regions for your account,
     * see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html"
     * >Managing AWS Regions</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param describeRegionsRequest
     * @return describeRegionsResult The response from the DescribeRegions
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeRegionsResult describeRegions(DescribeRegionsRequest describeRegionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of the Reserved Instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved Instances, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"
     * >Reserved Instances</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesRequest <p>
     *            Contains the parameters for DescribeReservedInstances.
     *            </p>
     * @return describeReservedInstancesResult The response from the
     *         DescribeReservedInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeReservedInstancesResult describeReservedInstances(
            DescribeReservedInstancesRequest describeReservedInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your account's Reserved Instance listings in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell
     * Reserved Instance capacity that they no longer need with buyers who want
     * to purchase additional capacity. Reserved Instances bought and sold
     * through the Reserved Instance Marketplace work like any other Reserved
     * Instances.
     * </p>
     * <p>
     * As a seller, you choose to list some or all of your Reserved Instances,
     * and you specify the upfront price to receive for them. Your Reserved
     * Instances are then listed in the Reserved Instance Marketplace and are
     * available for purchase.
     * </p>
     * <p>
     * As a buyer, you specify the configuration of the Reserved Instance to
     * purchase, and the Marketplace matches what you're searching for with
     * what's available. The Marketplace first sells the lowest priced Reserved
     * Instances to you, and continues to sell available Reserved Instance
     * listings to you until your demand is met. You are charged based on the
     * total price of all of the listings that you purchase.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
     * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesListingsRequest <p>
     *            Contains the parameters for DescribeReservedInstancesListings.
     *            </p>
     * @return describeReservedInstancesListingsResult The response from the
     *         DescribeReservedInstancesListings service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeReservedInstancesListingsResult describeReservedInstancesListings(
            DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the modifications made to your Reserved Instances. If no
     * parameter is specified, information about all your Reserved Instances
     * modification requests is returned. If a modification ID is specified,
     * only information about the specific modification is returned.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html"
     * >Modifying Reserved Instances</a> in the Amazon Elastic Compute Cloud
     * User Guide.
     * </p>
     * 
     * @param describeReservedInstancesModificationsRequest <p>
     *            Contains the parameters for
     *            DescribeReservedInstancesModifications.
     *            </p>
     * @return describeReservedInstancesModificationsResult The response from
     *         the DescribeReservedInstancesModifications service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeReservedInstancesModificationsResult describeReservedInstancesModifications(
            DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes Reserved Instance offerings that are available for purchase.
     * With Reserved Instances, you purchase the right to launch instances for a
     * period of time. During that time period, you do not receive insufficient
     * capacity errors, and you pay a lower usage rate than the rate charged for
     * On-Demand instances for the actual time used.
     * </p>
     * <p>
     * If you have listed your own Reserved Instances for sale in the Reserved
     * Instance Marketplace, they will be excluded from these results. This is
     * to ensure that you do not purchase your own Reserved Instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
     * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param describeReservedInstancesOfferingsRequest <p>
     *            Contains the parameters for
     *            DescribeReservedInstancesOfferings.
     *            </p>
     * @return describeReservedInstancesOfferingsResult The response from the
     *         DescribeReservedInstancesOfferings service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings(
            DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * Each subnet in your VPC must be associated with a route table. If a
     * subnet is not explicitly associated with any route table, it is
     * implicitly associated with the main route table. This command does not
     * return the subnet ID for implicit associations.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
     * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param describeRouteTablesRequest
     * @return describeRouteTablesResult The response from the
     *         DescribeRouteTables service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeRouteTablesResult describeRouteTables(
            DescribeRouteTablesRequest describeRouteTablesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Finds available schedules that meet the specified criteria.
     * </p>
     * <p>
     * You can search for an available schedule no more than 3 months in
     * advance. You must meet the minimum required duration of 1,200 hours per
     * year. For example, the minimum daily schedule is 4 hours, the minimum
     * weekly schedule is 24 hours, and the minimum monthly schedule is 100
     * hours.
     * </p>
     * <p>
     * After you find a schedule that meets your needs, call
     * <a>PurchaseScheduledInstances</a> to purchase Scheduled Instances with
     * that schedule.
     * </p>
     * 
     * @param describeScheduledInstanceAvailabilityRequest <p>
     *            Contains the parameters for
     *            DescribeScheduledInstanceAvailability.
     *            </p>
     * @return describeScheduledInstanceAvailabilityResult The response from the
     *         DescribeScheduledInstanceAvailability service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeScheduledInstanceAvailabilityResult describeScheduledInstanceAvailability(
            DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified Scheduled Instances or all your Scheduled
     * Instances.
     * </p>
     * 
     * @param describeScheduledInstancesRequest <p>
     *            Contains the parameters for DescribeScheduledInstances.
     *            </p>
     * @return describeScheduledInstancesResult The response from the
     *         DescribeScheduledInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeScheduledInstancesResult describeScheduledInstances(
            DescribeScheduledInstancesRequest describeScheduledInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * [VPC only] Describes the VPCs on the other side of a VPC peering
     * connection that are referencing the security groups you've specified in
     * this request.
     * </p>
     * 
     * @param describeSecurityGroupReferencesRequest
     * @return describeSecurityGroupReferencesResult The response from the
     *         DescribeSecurityGroupReferences service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSecurityGroupReferencesResult describeSecurityGroupReferences(
            DescribeSecurityGroupReferencesRequest describeSecurityGroupReferencesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified security groups or all of your security groups.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i> and <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param describeSecurityGroupsRequest
     * @return describeSecurityGroupsResult The response from the
     *         DescribeSecurityGroups service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSecurityGroupsResult describeSecurityGroups(
            DescribeSecurityGroupsRequest describeSecurityGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified attribute of the specified snapshot. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS snapshots, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"
     * >Amazon EBS Snapshots</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeSnapshotAttributeRequest
     * @return describeSnapshotAttributeResult The response from the
     *         DescribeSnapshotAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSnapshotAttributeResult describeSnapshotAttribute(
            DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified EBS snapshots available to you or all of the EBS
     * snapshots available to you.
     * </p>
     * <p>
     * The snapshots available to you include public snapshots, private
     * snapshots that you own, and private snapshots owned by other AWS accounts
     * for which you have explicit create volume permissions.
     * </p>
     * <p>
     * The create volume permissions fall into the following categories:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>public</i>: The owner of the snapshot granted create volume
     * permissions for the snapshot to the <code>all</code> group. All AWS
     * accounts have create volume permissions for these snapshots.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>explicit</i>: The owner of the snapshot granted create volume
     * permissions to a specific AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>implicit</i>: An AWS account has implicit create volume permissions
     * for all snapshots it owns.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The list of snapshots returned can be filtered by specifying snapshot
     * IDs, snapshot owners, or AWS accounts with create volume permissions. If
     * no options are specified, Amazon EC2 returns all snapshots for which you
     * have create volume permissions.
     * </p>
     * <p>
     * If you specify one or more snapshot IDs, only snapshots that have the
     * specified IDs are returned. If you specify an invalid snapshot ID, an
     * error is returned. If you specify a snapshot ID for which you do not have
     * access, it is not included in the returned results.
     * </p>
     * <p>
     * If you specify one or more snapshot owners using the
     * <code>OwnerIds</code> option, only snapshots from the specified owners
     * and for which you have access are returned. The results can include the
     * AWS account IDs of the specified owners, <code>amazon</code> for
     * snapshots owned by Amazon, or <code>self</code> for snapshots that you
     * own.
     * </p>
     * <p>
     * If you specify a list of restorable users, only snapshots with create
     * snapshot permissions for those users are returned. You can specify AWS
     * account IDs (if you own the snapshots), <code>self</code> for snapshots
     * for which you own or have explicit permissions, or <code>all</code> for
     * public snapshots.
     * </p>
     * <p>
     * If you are describing a long list of snapshots, you can paginate the
     * output to make the list more manageable. The <code>MaxResults</code>
     * parameter sets the maximum number of results returned in a single page.
     * If the list of results exceeds your <code>MaxResults</code> value, then
     * that number of results is returned along with a <code>NextToken</code>
     * value that can be passed to a subsequent <code>DescribeSnapshots</code>
     * request to retrieve the remaining results.
     * </p>
     * <p>
     * To get the state of fast snapshot restores for a snapshot, use
     * <a>DescribeFastSnapshotRestores</a>.
     * </p>
     * <p>
     * For more information about EBS snapshots, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"
     * >Amazon EBS Snapshots</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeSnapshotsRequest
     * @return describeSnapshotsResult The response from the DescribeSnapshots
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the data feed for Spot Instances. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html"
     * >Spot Instance Data Feed</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * 
     * @param describeSpotDatafeedSubscriptionRequest <p>
     *            Contains the parameters for DescribeSpotDatafeedSubscription.
     *            </p>
     * @return describeSpotDatafeedSubscriptionResult The response from the
     *         DescribeSpotDatafeedSubscription service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription(
            DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the running instances for the specified Spot Fleet.
     * </p>
     * 
     * @param describeSpotFleetInstancesRequest <p>
     *            Contains the parameters for DescribeSpotFleetInstances.
     *            </p>
     * @return describeSpotFleetInstancesResult The response from the
     *         DescribeSpotFleetInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSpotFleetInstancesResult describeSpotFleetInstances(
            DescribeSpotFleetInstancesRequest describeSpotFleetInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the events for the specified Spot Fleet request during the
     * specified time.
     * </p>
     * <p>
     * Spot Fleet events are delayed by up to 30 seconds before they can be
     * described. This ensures that you can query by the last evaluated time and
     * not miss a recorded event. Spot Fleet events are available for 48 hours.
     * </p>
     * 
     * @param describeSpotFleetRequestHistoryRequest <p>
     *            Contains the parameters for DescribeSpotFleetRequestHistory.
     *            </p>
     * @return describeSpotFleetRequestHistoryResult The response from the
     *         DescribeSpotFleetRequestHistory service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSpotFleetRequestHistoryResult describeSpotFleetRequestHistory(
            DescribeSpotFleetRequestHistoryRequest describeSpotFleetRequestHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your Spot Fleet requests.
     * </p>
     * <p>
     * Spot Fleet requests are deleted 48 hours after they are canceled and
     * their instances are terminated.
     * </p>
     * 
     * @param describeSpotFleetRequestsRequest <p>
     *            Contains the parameters for DescribeSpotFleetRequests.
     *            </p>
     * @return describeSpotFleetRequestsResult The response from the
     *         DescribeSpotFleetRequests service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSpotFleetRequestsResult describeSpotFleetRequests(
            DescribeSpotFleetRequestsRequest describeSpotFleetRequestsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified Spot Instance requests.
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a running
     * Spot Instance by examining the response. If the status of the Spot
     * Instance is <code>fulfilled</code>, the instance ID appears in the
     * response and contains the identifier of the instance. Alternatively, you
     * can use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances"
     * >DescribeInstances</a> with a filter to look for instances where the
     * instance lifecycle is <code>spot</code>.
     * </p>
     * <p>
     * We recommend that you set <code>MaxResults</code> to a value between 5
     * and 1000 to limit the number of results returned. This paginates the
     * output, which makes the list more manageable and returns the results
     * faster. If the list of results exceeds your <code>MaxResults</code>
     * value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent
     * <code>DescribeSpotInstanceRequests</code> request to retrieve the
     * remaining results.
     * </p>
     * <p>
     * Spot Instance requests are deleted four hours after they are canceled and
     * their instances are terminated.
     * </p>
     * 
     * @param describeSpotInstanceRequestsRequest <p>
     *            Contains the parameters for DescribeSpotInstanceRequests.
     *            </p>
     * @return describeSpotInstanceRequestsResult The response from the
     *         DescribeSpotInstanceRequests service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSpotInstanceRequestsResult describeSpotInstanceRequests(
            DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the Spot price history. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-history.html"
     * >Spot Instance Pricing History</a> in the <i>Amazon EC2 User Guide for
     * Linux Instances</i>.
     * </p>
     * <p>
     * When you specify a start and end time, this operation returns the prices
     * of the instance types within the time range that you specified and the
     * time when the price changed. The price is valid within the time period
     * that you specified; the response merely indicates the last time that the
     * price changed.
     * </p>
     * 
     * @param describeSpotPriceHistoryRequest <p>
     *            Contains the parameters for DescribeSpotPriceHistory.
     *            </p>
     * @return describeSpotPriceHistoryResult The response from the
     *         DescribeSpotPriceHistory service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSpotPriceHistoryResult describeSpotPriceHistory(
            DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * [VPC only] Describes the stale security group rules for security groups
     * in a specified VPC. Rules are stale when they reference a deleted
     * security group in a peer VPC, or a security group in a peer VPC for which
     * the VPC peering connection has been deleted.
     * </p>
     * 
     * @param describeStaleSecurityGroupsRequest
     * @return describeStaleSecurityGroupsResult The response from the
     *         DescribeStaleSecurityGroups service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeStaleSecurityGroupsResult describeStaleSecurityGroups(
            DescribeStaleSecurityGroupsRequest describeStaleSecurityGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your subnets.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Your
     * VPC and Subnets</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeSubnetsRequest
     * @return describeSubnetsResult The response from the DescribeSubnets
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified tags for your EC2 resources.
     * </p>
     * <p>
     * For more information about tags, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Resources</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeTagsRequest
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more Traffic Mirror filters.
     * </p>
     * 
     * @param describeTrafficMirrorFiltersRequest
     * @return describeTrafficMirrorFiltersResult The response from the
     *         DescribeTrafficMirrorFilters service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTrafficMirrorFiltersResult describeTrafficMirrorFilters(
            DescribeTrafficMirrorFiltersRequest describeTrafficMirrorFiltersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic
     * Mirror sessions are described. Alternatively, you can filter the results.
     * </p>
     * 
     * @param describeTrafficMirrorSessionsRequest
     * @return describeTrafficMirrorSessionsResult The response from the
     *         DescribeTrafficMirrorSessions service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTrafficMirrorSessionsResult describeTrafficMirrorSessions(
            DescribeTrafficMirrorSessionsRequest describeTrafficMirrorSessionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Information about one or more Traffic Mirror targets.
     * </p>
     * 
     * @param describeTrafficMirrorTargetsRequest
     * @return describeTrafficMirrorTargetsResult The response from the
     *         DescribeTrafficMirrorTargets service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTrafficMirrorTargetsResult describeTrafficMirrorTargets(
            DescribeTrafficMirrorTargetsRequest describeTrafficMirrorTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more attachments between resources and transit gateways.
     * By default, all attachments are described. Alternatively, you can filter
     * the results by attachment ID, attachment state, resource ID, or resource
     * owner.
     * </p>
     * 
     * @param describeTransitGatewayAttachmentsRequest
     * @return describeTransitGatewayAttachmentsResult The response from the
     *         DescribeTransitGatewayAttachments service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTransitGatewayAttachmentsResult describeTransitGatewayAttachments(
            DescribeTransitGatewayAttachmentsRequest describeTransitGatewayAttachmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more transit gateway multicast domains.
     * </p>
     * 
     * @param describeTransitGatewayMulticastDomainsRequest
     * @return describeTransitGatewayMulticastDomainsResult The response from
     *         the DescribeTransitGatewayMulticastDomains service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTransitGatewayMulticastDomainsResult describeTransitGatewayMulticastDomains(
            DescribeTransitGatewayMulticastDomainsRequest describeTransitGatewayMulticastDomainsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes your transit gateway peering attachments.
     * </p>
     * 
     * @param describeTransitGatewayPeeringAttachmentsRequest
     * @return describeTransitGatewayPeeringAttachmentsResult The response from
     *         the DescribeTransitGatewayPeeringAttachments service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTransitGatewayPeeringAttachmentsResult describeTransitGatewayPeeringAttachments(
            DescribeTransitGatewayPeeringAttachmentsRequest describeTransitGatewayPeeringAttachmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more transit gateway route tables. By default, all
     * transit gateway route tables are described. Alternatively, you can filter
     * the results.
     * </p>
     * 
     * @param describeTransitGatewayRouteTablesRequest
     * @return describeTransitGatewayRouteTablesResult The response from the
     *         DescribeTransitGatewayRouteTables service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTransitGatewayRouteTablesResult describeTransitGatewayRouteTables(
            DescribeTransitGatewayRouteTablesRequest describeTransitGatewayRouteTablesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more VPC attachments. By default, all VPC attachments
     * are described. Alternatively, you can filter the results.
     * </p>
     * 
     * @param describeTransitGatewayVpcAttachmentsRequest
     * @return describeTransitGatewayVpcAttachmentsResult The response from the
     *         DescribeTransitGatewayVpcAttachments service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(
            DescribeTransitGatewayVpcAttachmentsRequest describeTransitGatewayVpcAttachmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more transit gateways. By default, all transit gateways
     * are described. Alternatively, you can filter the results.
     * </p>
     * 
     * @param describeTransitGatewaysRequest
     * @return describeTransitGatewaysResult The response from the
     *         DescribeTransitGateways service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeTransitGatewaysResult describeTransitGateways(
            DescribeTransitGatewaysRequest describeTransitGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified attribute of the specified volume. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS volumes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"
     * >Amazon EBS Volumes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeVolumeAttributeRequest
     * @return describeVolumeAttributeResult The response from the
     *         DescribeVolumeAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVolumeAttributeResult describeVolumeAttribute(
            DescribeVolumeAttributeRequest describeVolumeAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the status of the specified volumes. Volume status provides the
     * result of the checks performed on your volumes to determine events that
     * can impair the performance of your volumes. The performance of a volume
     * can be affected if an issue occurs on the volume's underlying host. If
     * the volume's underlying host experiences a power outage or system issue,
     * after the system is restored, there could be data inconsistencies on the
     * volume. Volume events notify you if this occurs. Volume actions notify
     * you if any action needs to be taken in response to the event.
     * </p>
     * <p>
     * The <code>DescribeVolumeStatus</code> operation provides the following
     * information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i>: Reflects the current status of the volume. The possible
     * values are <code>ok</code>, <code>impaired</code> , <code>warning</code>,
     * or <code>insufficient-data</code>. If all checks pass, the overall status
     * of the volume is <code>ok</code>. If the check fails, the overall status
     * is <code>impaired</code>. If the status is <code>insufficient-data</code>
     * , then the checks may still be taking place on your volume at the time.
     * We recommend that you retry the request. For more information about
     * volume status, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html"
     * >Monitoring the Status of Your Volumes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <i>Events</i>: Reflect the cause of a volume status and may require you
     * to take action. For example, if your volume returns an
     * <code>impaired</code> status, then the volume event might be
     * <code>potential-data-inconsistency</code>. This means that your volume
     * has been affected by an issue with the underlying host, has all I/O
     * operations disabled, and may have inconsistent data.
     * </p>
     * <p>
     * <i>Actions</i>: Reflect the actions you may have to take in response to
     * an event. For example, if the status of the volume is
     * <code>impaired</code> and the volume event shows
     * <code>potential-data-inconsistency</code>, then the action shows
     * <code>enable-volume-io</code>. This means that you may want to enable the
     * I/O operations for the volume by calling the <a>EnableVolumeIO</a> action
     * and then check the volume for data consistency.
     * </p>
     * <p>
     * Volume status is based on the volume status checks, and does not reflect
     * the volume state. Therefore, volume status does not indicate volumes in
     * the <code>error</code> state (for example, when a volume is incapable of
     * accepting I/O.)
     * </p>
     * 
     * @param describeVolumeStatusRequest
     * @return describeVolumeStatusResult The response from the
     *         DescribeVolumeStatus service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVolumeStatusResult describeVolumeStatus(
            DescribeVolumeStatusRequest describeVolumeStatusRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the specified EBS volumes or all of your EBS volumes.
     * </p>
     * <p>
     * If you are describing a long list of volumes, you can paginate the output
     * to make the list more manageable. The <code>MaxResults</code> parameter
     * sets the maximum number of results returned in a single page. If the list
     * of results exceeds your <code>MaxResults</code> value, then that number
     * of results is returned along with a <code>NextToken</code> value that can
     * be passed to a subsequent <code>DescribeVolumes</code> request to
     * retrieve the remaining results.
     * </p>
     * <p>
     * For more information about EBS volumes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"
     * >Amazon EBS Volumes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return describeVolumesResult The response from the DescribeVolumes
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Reports the current modification status of EBS volumes.
     * </p>
     * <p>
     * Current-generation EBS volumes support modification of attributes
     * including type, size, and (for <code>io1</code> volumes) IOPS
     * provisioning while either attached to or detached from an instance.
     * Following an action from the API or the console to modify a volume, the
     * status of the modification may be <code>modifying</code>,
     * <code>optimizing</code>, <code>completed</code>, or <code>failed</code>.
     * If a volume has never been modified, then certain elements of the
     * returned <code>VolumeModification</code> objects are null.
     * </p>
     * <p>
     * You can also use CloudWatch Events to check the status of a modification
     * to an EBS volume. For information about CloudWatch Events, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon
     * CloudWatch Events User Guide</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods"
     * >Monitoring Volume Modifications"</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVolumesModificationsRequest
     * @return describeVolumesModificationsResult The response from the
     *         DescribeVolumesModifications service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVolumesModificationsResult describeVolumesModifications(
            DescribeVolumesModificationsRequest describeVolumesModificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can specify
     * only one attribute at a time.
     * </p>
     * 
     * @param describeVpcAttributeRequest
     * @return describeVpcAttributeResult The response from the
     *         DescribeVpcAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcAttributeResult describeVpcAttribute(
            DescribeVpcAttributeRequest describeVpcAttributeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @param describeVpcClassicLinkRequest
     * @return describeVpcClassicLinkResult The response from the
     *         DescribeVpcClassicLink service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcClassicLinkResult describeVpcClassicLink(
            DescribeVpcClassicLinkRequest describeVpcClassicLinkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the ClassicLink DNS support status of one or more VPCs. If
     * enabled, the DNS hostname of a linked EC2-Classic instance resolves to
     * its private IP address when addressed from an instance in the VPC to
     * which it's linked. Similarly, the DNS hostname of an instance in a VPC
     * resolves to its private IP address when addressed from a linked
     * EC2-Classic instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param describeVpcClassicLinkDnsSupportRequest
     * @return describeVpcClassicLinkDnsSupportResult The response from the
     *         DescribeVpcClassicLinkDnsSupport service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcClassicLinkDnsSupportResult describeVpcClassicLinkDnsSupport(
            DescribeVpcClassicLinkDnsSupportRequest describeVpcClassicLinkDnsSupportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the connection notifications for VPC endpoints and VPC endpoint
     * services.
     * </p>
     * 
     * @param describeVpcEndpointConnectionNotificationsRequest
     * @return describeVpcEndpointConnectionNotificationsResult The response
     *         from the DescribeVpcEndpointConnectionNotifications service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcEndpointConnectionNotificationsResult describeVpcEndpointConnectionNotifications(
            DescribeVpcEndpointConnectionNotificationsRequest describeVpcEndpointConnectionNotificationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the VPC endpoint connections to your VPC endpoint services,
     * including any endpoints that are pending your acceptance.
     * </p>
     * 
     * @param describeVpcEndpointConnectionsRequest
     * @return describeVpcEndpointConnectionsResult The response from the
     *         DescribeVpcEndpointConnections service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcEndpointConnectionsResult describeVpcEndpointConnections(
            DescribeVpcEndpointConnectionsRequest describeVpcEndpointConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the VPC endpoint service configurations in your account (your
     * services).
     * </p>
     * 
     * @param describeVpcEndpointServiceConfigurationsRequest
     * @return describeVpcEndpointServiceConfigurationsResult The response from
     *         the DescribeVpcEndpointServiceConfigurations service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcEndpointServiceConfigurationsResult describeVpcEndpointServiceConfigurations(
            DescribeVpcEndpointServiceConfigurationsRequest describeVpcEndpointServiceConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the principals (service consumers) that are permitted to
     * discover your VPC endpoint service.
     * </p>
     * 
     * @param describeVpcEndpointServicePermissionsRequest
     * @return describeVpcEndpointServicePermissionsResult The response from the
     *         DescribeVpcEndpointServicePermissions service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcEndpointServicePermissionsResult describeVpcEndpointServicePermissions(
            DescribeVpcEndpointServicePermissionsRequest describeVpcEndpointServicePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes available services to which you can create a VPC endpoint.
     * </p>
     * 
     * @param describeVpcEndpointServicesRequest <p>
     *            Contains the parameters for DescribeVpcEndpointServices.
     *            </p>
     * @return describeVpcEndpointServicesResult The response from the
     *         DescribeVpcEndpointServices service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcEndpointServicesResult describeVpcEndpointServices(
            DescribeVpcEndpointServicesRequest describeVpcEndpointServicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your VPC endpoints.
     * </p>
     * 
     * @param describeVpcEndpointsRequest <p>
     *            Contains the parameters for DescribeVpcEndpoints.
     *            </p>
     * @return describeVpcEndpointsResult The response from the
     *         DescribeVpcEndpoints service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcEndpointsResult describeVpcEndpoints(
            DescribeVpcEndpointsRequest describeVpcEndpointsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
     * @return describeVpcPeeringConnectionsResult The response from the
     *         DescribeVpcPeeringConnections service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(
            DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     * 
     * @param describeVpcsRequest
     * @return describeVpcsResult The response from the DescribeVpcs service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param describeVpnConnectionsRequest <p>
     *            Contains the parameters for DescribeVpnConnections.
     *            </p>
     * @return describeVpnConnectionsResult The response from the
     *         DescribeVpnConnections service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpnConnectionsResult describeVpnConnections(
            DescribeVpnConnectionsRequest describeVpnConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html">AWS
     * Site-to-Site VPN</a> in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param describeVpnGatewaysRequest <p>
     *            Contains the parameters for DescribeVpnGateways.
     *            </p>
     * @return describeVpnGatewaysResult The response from the
     *         DescribeVpnGateways service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeVpnGatewaysResult describeVpnGateways(
            DescribeVpnGatewaysRequest describeVpnGatewaysRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After the
     * instance has been unlinked, the VPC security groups are no longer
     * associated with it. An instance is automatically unlinked from a VPC when
     * it's stopped.
     * </p>
     * 
     * @param detachClassicLinkVpcRequest
     * @return detachClassicLinkVpcResult The response from the
     *         DetachClassicLinkVpc service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DetachClassicLinkVpcResult detachClassicLinkVpc(
            DetachClassicLinkVpcRequest detachClassicLinkVpcRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Detaches an internet gateway from a VPC, disabling connectivity between
     * the internet and the VPC. The VPC must not contain any running instances
     * with Elastic IP addresses or public IPv4 addresses.
     * </p>
     * 
     * @param detachInternetGatewayRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     * 
     * @param detachNetworkInterfaceRequest <p>
     *            Contains the parameters for DetachNetworkInterface.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches an EBS volume from an instance. Make sure to unmount any file
     * systems on the device within your operating system before detaching the
     * volume. Failure to do so can result in the volume becoming stuck in the
     * <code>busy</code> state while detaching. If this happens, detachment can
     * be delayed indefinitely until you unmount the volume, force detachment,
     * reboot the instance, or all three. If an EBS volume is the root device of
     * an instance, it can't be detached while the instance is running. To
     * detach the root volume, stop the instance first.
     * </p>
     * <p>
     * When a volume with an AWS Marketplace product code is detached from an
     * instance, the product code is no longer associated with the instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html"
     * >Detaching an Amazon EBS Volume</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param detachVolumeRequest
     * @return detachVolumeResult The response from the DetachVolume service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detaches a virtual private gateway from a VPC. You do this if you're
     * planning to turn off the VPC and not use it anymore. You can confirm a
     * virtual private gateway has been completely detached from a VPC by
     * describing the virtual private gateway (any attachments to the virtual
     * private gateway are also described).
     * </p>
     * <p>
     * You must wait for the attachment's state to switch to
     * <code>detached</code> before you can delete the VPC or attach a different
     * VPC to the virtual private gateway.
     * </p>
     * 
     * @param detachVpnGatewayRequest <p>
     *            Contains the parameters for DetachVpnGateway.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables EBS encryption by default for your account in the current
     * Region.
     * </p>
     * <p>
     * After you disable encryption by default, you can still create encrypted
     * volumes by enabling encryption when you create each volume.
     * </p>
     * <p>
     * Disabling encryption by default does not change the encryption status of
     * your existing volumes.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param disableEbsEncryptionByDefaultRequest
     * @return disableEbsEncryptionByDefaultResult The response from the
     *         DisableEbsEncryptionByDefault service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisableEbsEncryptionByDefaultResult disableEbsEncryptionByDefault(
            DisableEbsEncryptionByDefaultRequest disableEbsEncryptionByDefaultRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables fast snapshot restores for the specified snapshots in the
     * specified Availability Zones.
     * </p>
     * 
     * @param disableFastSnapshotRestoresRequest
     * @return disableFastSnapshotRestoresResult The response from the
     *         DisableFastSnapshotRestores service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisableFastSnapshotRestoresResult disableFastSnapshotRestores(
            DisableFastSnapshotRestoresRequest disableFastSnapshotRestoresRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables the specified resource attachment from propagating routes to the
     * specified propagation route table.
     * </p>
     * 
     * @param disableTransitGatewayRouteTablePropagationRequest
     * @return disableTransitGatewayRouteTablePropagationResult The response
     *         from the DisableTransitGatewayRouteTablePropagation service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisableTransitGatewayRouteTablePropagationResult disableTransitGatewayRouteTablePropagation(
            DisableTransitGatewayRouteTablePropagationRequest disableTransitGatewayRouteTablePropagationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to a
     * specified route table of a VPC.
     * </p>
     * 
     * @param disableVgwRoutePropagationRequest <p>
     *            Contains the parameters for DisableVgwRoutePropagation.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void disableVgwRoutePropagation(
            DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a VPC
     * that has EC2-Classic instances linked to it.
     * </p>
     * 
     * @param disableVpcClassicLinkRequest
     * @return disableVpcClassicLinkResult The response from the
     *         DisableVpcClassicLink service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisableVpcClassicLinkResult disableVpcClassicLink(
            DisableVpcClassicLinkRequest disableVpcClassicLinkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables ClassicLink DNS support for a VPC. If disabled, DNS hostnames
     * resolve to public IP addresses when addressed between a linked
     * EC2-Classic instance and instances in the VPC to which it's linked. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You must specify a VPC ID in the request.
     * </p>
     * 
     * @param disableVpcClassicLinkDnsSupportRequest
     * @return disableVpcClassicLinkDnsSupportResult The response from the
     *         DisableVpcClassicLinkDnsSupport service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisableVpcClassicLinkDnsSupportResult disableVpcClassicLinkDnsSupport(
            DisableVpcClassicLinkDnsSupportRequest disableVpcClassicLinkDnsSupportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates an Elastic IP address from the instance or network
     * interface it's associated with.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or in
     * a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more than
     * once, Amazon EC2 doesn't return an error.
     * </p>
     * 
     * @param disassociateAddressRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void disassociateAddress(DisassociateAddressRequest disassociateAddressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a target network from the specified Client VPN endpoint.
     * When you disassociate the last target network from a Client VPN, the
     * following happens:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The route that was automatically added for the VPC is deleted
     * </p>
     * </li>
     * <li>
     * <p>
     * All active client connections are terminated
     * </p>
     * </li>
     * <li>
     * <p>
     * New client connections are disallowed
     * </p>
     * </li>
     * <li>
     * <p>
     * The Client VPN endpoint's status changes to
     * <code>pending-associate</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateClientVpnTargetNetworkRequest
     * @return disassociateClientVpnTargetNetworkResult The response from the
     *         DisassociateClientVpnTargetNetwork service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateClientVpnTargetNetworkResult disassociateClientVpnTargetNetwork(
            DisassociateClientVpnTargetNetworkRequest disassociateClientVpnTargetNetworkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates an IAM instance profile from a running or stopped instance.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association
     * ID.
     * </p>
     * 
     * @param disassociateIamInstanceProfileRequest
     * @return disassociateIamInstanceProfileResult The response from the
     *         DisassociateIamInstanceProfile service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateIamInstanceProfileResult disassociateIamInstanceProfile(
            DisassociateIamInstanceProfileRequest disassociateIamInstanceProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a subnet or gateway from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes in
     * the route table. Instead, it uses the routes in the VPC's main route
     * table. For more information about route tables, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
     * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param disassociateRouteTableRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a CIDR block from a subnet. Currently, you can disassociate
     * an IPv6 CIDR block only. You must detach or delete all gateways and
     * resources that are associated with the CIDR block before you can
     * disassociate it.
     * </p>
     * 
     * @param disassociateSubnetCidrBlockRequest
     * @return disassociateSubnetCidrBlockResult The response from the
     *         DisassociateSubnetCidrBlock service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateSubnetCidrBlockResult disassociateSubnetCidrBlock(
            DisassociateSubnetCidrBlockRequest disassociateSubnetCidrBlockRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified subnets from the transit gateway multicast
     * domain.
     * </p>
     * 
     * @param disassociateTransitGatewayMulticastDomainRequest
     * @return disassociateTransitGatewayMulticastDomainResult The response from
     *         the DisassociateTransitGatewayMulticastDomain service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateTransitGatewayMulticastDomainResult disassociateTransitGatewayMulticastDomain(
            DisassociateTransitGatewayMulticastDomainRequest disassociateTransitGatewayMulticastDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a resource attachment from a transit gateway route table.
     * </p>
     * 
     * @param disassociateTransitGatewayRouteTableRequest
     * @return disassociateTransitGatewayRouteTableResult The response from the
     *         DisassociateTransitGatewayRouteTable service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateTransitGatewayRouteTableResult disassociateTransitGatewayRouteTable(
            DisassociateTransitGatewayRouteTableRequest disassociateTransitGatewayRouteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a CIDR block from a VPC. To disassociate the CIDR block,
     * you must specify its association ID. You can get the association ID by
     * using <a>DescribeVpcs</a>. You must detach or delete all gateways and
     * resources that are associated with the CIDR block before you can
     * disassociate it.
     * </p>
     * <p>
     * You cannot disassociate the CIDR block with which you originally created
     * the VPC (the primary CIDR block).
     * </p>
     * 
     * @param disassociateVpcCidrBlockRequest
     * @return disassociateVpcCidrBlockResult The response from the
     *         DisassociateVpcCidrBlock service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DisassociateVpcCidrBlockResult disassociateVpcCidrBlock(
            DisassociateVpcCidrBlockRequest disassociateVpcCidrBlockRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables EBS encryption by default for your account in the current Region.
     * </p>
     * <p>
     * After you enable encryption by default, the EBS volumes that you create
     * are are always encrypted, either using the default CMK or the CMK that
     * you specified when you created each volume. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * You can specify the default CMK for encryption by default using
     * <a>ModifyEbsDefaultKmsKeyId</a> or <a>ResetEbsDefaultKmsKeyId</a>.
     * </p>
     * <p>
     * Enabling encryption by default has no effect on the encryption status of
     * your existing volumes.
     * </p>
     * <p>
     * After you enable encryption by default, you can no longer launch
     * instances using instance types that do not support encryption. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances"
     * >Supported Instance Types</a>.
     * </p>
     * 
     * @param enableEbsEncryptionByDefaultRequest
     * @return enableEbsEncryptionByDefaultResult The response from the
     *         EnableEbsEncryptionByDefault service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    EnableEbsEncryptionByDefaultResult enableEbsEncryptionByDefault(
            EnableEbsEncryptionByDefaultRequest enableEbsEncryptionByDefaultRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables fast snapshot restores for the specified snapshots in the
     * specified Availability Zones.
     * </p>
     * <p>
     * You get the full benefit of fast snapshot restores after they enter the
     * <code>enabled</code> state. To get the current state of fast snapshot
     * restores, use <a>DescribeFastSnapshotRestores</a>. To disable fast
     * snapshot restores, use <a>DisableFastSnapshotRestores</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-fast-snapshot-restore.html"
     * >Amazon EBS Fast Snapshot Restore</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param enableFastSnapshotRestoresRequest
     * @return enableFastSnapshotRestoresResult The response from the
     *         EnableFastSnapshotRestores service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    EnableFastSnapshotRestoresResult enableFastSnapshotRestores(
            EnableFastSnapshotRestoresRequest enableFastSnapshotRestoresRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the specified attachment to propagate routes to the specified
     * propagation route table.
     * </p>
     * 
     * @param enableTransitGatewayRouteTablePropagationRequest
     * @return enableTransitGatewayRouteTablePropagationResult The response from
     *         the EnableTransitGatewayRouteTablePropagation service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    EnableTransitGatewayRouteTablePropagationResult enableTransitGatewayRouteTablePropagation(
            EnableTransitGatewayRouteTablePropagationRequest enableTransitGatewayRouteTablePropagationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the
     * specified route table of a VPC.
     * </p>
     * 
     * @param enableVgwRoutePropagationRequest <p>
     *            Contains the parameters for EnableVgwRoutePropagation.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void enableVgwRoutePropagation(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled
     * because the data on the volume was potentially inconsistent.
     * </p>
     * 
     * @param enableVolumeIORequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void enableVolumeIO(EnableVolumeIORequest enableVolumeIORequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Enables a VPC for ClassicLink. You can then link EC2-Classic instances to
     * your ClassicLink-enabled VPC to allow communication over private IP
     * addresses. You cannot enable your VPC for ClassicLink if any of your VPC
     * route tables have existing routes for address ranges within the
     * <code>10.0.0.0/8</code> IP address range, excluding local routes for VPCs
     * in the <code>10.0.0.0/16</code> and <code>10.1.0.0/16</code> IP address
     * ranges. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param enableVpcClassicLinkRequest
     * @return enableVpcClassicLinkResult The response from the
     *         EnableVpcClassicLink service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    EnableVpcClassicLinkResult enableVpcClassicLink(
            EnableVpcClassicLinkRequest enableVpcClassicLinkRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Enables a VPC to support DNS hostname resolution for ClassicLink. If
     * enabled, the DNS hostname of a linked EC2-Classic instance resolves to
     * its private IP address when addressed from an instance in the VPC to
     * which it's linked. Similarly, the DNS hostname of an instance in a VPC
     * resolves to its private IP address when addressed from a linked
     * EC2-Classic instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You must specify a VPC ID in the request.
     * </p>
     * 
     * @param enableVpcClassicLinkDnsSupportRequest
     * @return enableVpcClassicLinkDnsSupportResult The response from the
     *         EnableVpcClassicLinkDnsSupport service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    EnableVpcClassicLinkDnsSupportResult enableVpcClassicLinkDnsSupport(
            EnableVpcClassicLinkDnsSupportRequest enableVpcClassicLinkDnsSupportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Downloads the client certificate revocation list for the specified Client
     * VPN endpoint.
     * </p>
     * 
     * @param exportClientVpnClientCertificateRevocationListRequest
     * @return exportClientVpnClientCertificateRevocationListResult The response
     *         from the ExportClientVpnClientCertificateRevocationList service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ExportClientVpnClientCertificateRevocationListResult exportClientVpnClientCertificateRevocationList(
            ExportClientVpnClientCertificateRevocationListRequest exportClientVpnClientCertificateRevocationListRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Downloads the contents of the Client VPN endpoint configuration file for
     * the specified Client VPN endpoint. The Client VPN endpoint configuration
     * file includes the Client VPN endpoint and certificate information clients
     * need to establish a connection with the Client VPN endpoint.
     * </p>
     * 
     * @param exportClientVpnClientConfigurationRequest
     * @return exportClientVpnClientConfigurationResult The response from the
     *         ExportClientVpnClientConfiguration service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ExportClientVpnClientConfigurationResult exportClientVpnClientConfiguration(
            ExportClientVpnClientConfigurationRequest exportClientVpnClientConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Exports an Amazon Machine Image (AMI) to a VM file. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmexport_image.html"
     * >Exporting a VM Directory from an Amazon Machine Image (AMI)</a> in the
     * <i>VM Import/Export User Guide</i>.
     * </p>
     * 
     * @param exportImageRequest
     * @return exportImageResult The response from the ExportImage service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ExportImageResult exportImage(ExportImageRequest exportImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Exports routes from the specified transit gateway route table to the
     * specified S3 bucket. By default, all routes are exported. Alternatively,
     * you can filter by CIDR range.
     * </p>
     * <p>
     * The routes are saved to the specified bucket in a JSON file. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/tgw/tgw-route-tables.html#tgw-export-route-tables"
     * >Export Route Tables to Amazon S3</a> in <i>Transit Gateways</i>.
     * </p>
     * 
     * @param exportTransitGatewayRoutesRequest
     * @return exportTransitGatewayRoutesResult The response from the
     *         ExportTransitGatewayRoutes service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ExportTransitGatewayRoutesResult exportTransitGatewayRoutes(
            ExportTransitGatewayRoutesRequest exportTransitGatewayRoutesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the IPv6 CIDR block associations for a specified
     * IPv6 address pool.
     * </p>
     * 
     * @param getAssociatedIpv6PoolCidrsRequest
     * @return getAssociatedIpv6PoolCidrsResult The response from the
     *         GetAssociatedIpv6PoolCidrs service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetAssociatedIpv6PoolCidrsResult getAssociatedIpv6PoolCidrs(
            GetAssociatedIpv6PoolCidrsRequest getAssociatedIpv6PoolCidrsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets usage information about a Capacity Reservation. If the Capacity
     * Reservation is shared, it shows usage information for the Capacity
     * Reservation owner and each AWS account that is currently using the shared
     * capacity. If the Capacity Reservation is not shared, it shows only the
     * Capacity Reservation owner's usage.
     * </p>
     * 
     * @param getCapacityReservationUsageRequest
     * @return getCapacityReservationUsageResult The response from the
     *         GetCapacityReservationUsage service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCapacityReservationUsageResult getCapacityReservationUsage(
            GetCapacityReservationUsageRequest getCapacityReservationUsageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the allocations from the specified customer-owned address pool.
     * </p>
     * 
     * @param getCoipPoolUsageRequest
     * @return getCoipPoolUsageResult The response from the GetCoipPoolUsage
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCoipPoolUsageResult getCoipPoolUsage(GetCoipPoolUsageRequest getCoipPoolUsageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the console output for the specified instance. For Linux instances,
     * the instance console output displays the exact console output that would
     * normally be displayed on a physical monitor attached to a computer. For
     * Windows instances, the instance console output includes the last three
     * system event log errors.
     * </p>
     * <p>
     * By default, the console output returns buffered information that was
     * posted shortly after an instance transition state (start, stop, reboot,
     * or terminate). This information is available for at least one hour after
     * the most recent post. Only the most recent 64 KB of console output is
     * available.
     * </p>
     * <p>
     * You can optionally retrieve the latest serial console output at any time
     * during the instance lifecycle. This option is supported on instance types
     * that use the Nitro hypervisor.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html#instance-console-console-output"
     * >Instance Console Output</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param getConsoleOutputRequest
     * @return getConsoleOutputResult The response from the GetConsoleOutput
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve a JPG-format screenshot of a running instance to help with
     * troubleshooting.
     * </p>
     * <p>
     * The returned content is Base64-encoded.
     * </p>
     * 
     * @param getConsoleScreenshotRequest
     * @return getConsoleScreenshotResult The response from the
     *         GetConsoleScreenshot service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetConsoleScreenshotResult getConsoleScreenshot(
            GetConsoleScreenshotRequest getConsoleScreenshotRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the default credit option for CPU usage of a burstable
     * performance instance family.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable Performance Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param getDefaultCreditSpecificationRequest
     * @return getDefaultCreditSpecificationResult The response from the
     *         GetDefaultCreditSpecification service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetDefaultCreditSpecificationResult getDefaultCreditSpecification(
            GetDefaultCreditSpecificationRequest getDefaultCreditSpecificationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the default customer master key (CMK) for EBS encryption by
     * default for your account in this Region. You can change the default CMK
     * for encryption by default using <a>ModifyEbsDefaultKmsKeyId</a> or
     * <a>ResetEbsDefaultKmsKeyId</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param getEbsDefaultKmsKeyIdRequest
     * @return getEbsDefaultKmsKeyIdResult The response from the
     *         GetEbsDefaultKmsKeyId service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetEbsDefaultKmsKeyIdResult getEbsDefaultKmsKeyId(
            GetEbsDefaultKmsKeyIdRequest getEbsDefaultKmsKeyIdRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes whether EBS encryption by default is enabled for your account
     * in the current Region.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param getEbsEncryptionByDefaultRequest
     * @return getEbsEncryptionByDefaultResult The response from the
     *         GetEbsEncryptionByDefault service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetEbsEncryptionByDefaultResult getEbsEncryptionByDefault(
            GetEbsEncryptionByDefaultRequest getEbsEncryptionByDefaultRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Preview a reservation purchase with configurations that match those of
     * your Dedicated Host. You must have active Dedicated Hosts in your account
     * before you purchase a reservation.
     * </p>
     * <p>
     * This is a preview of the <a>PurchaseHostReservation</a> action and does
     * not result in the offering being purchased.
     * </p>
     * 
     * @param getHostReservationPurchasePreviewRequest
     * @return getHostReservationPurchasePreviewResult The response from the
     *         GetHostReservationPurchasePreview service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetHostReservationPurchasePreviewResult getHostReservationPurchasePreview(
            GetHostReservationPurchasePreviewRequest getHostReservationPurchasePreviewRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the configuration data of the specified instance. You can use
     * this data to create a launch template.
     * </p>
     * 
     * @param getLaunchTemplateDataRequest
     * @return getLaunchTemplateDataResult The response from the
     *         GetLaunchTemplateData service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetLaunchTemplateDataResult getLaunchTemplateData(
            GetLaunchTemplateDataRequest getLaunchTemplateDataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the encrypted administrator password for a running Windows
     * instance.
     * </p>
     * <p>
     * The Windows password is generated at boot by the <code>EC2Config</code>
     * service or <code>EC2Launch</code> scripts (Windows Server 2016 and
     * later). This usually only happens the first time an instance is launched.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/UsingConfig_WinAMI.html"
     * >EC2Config</a> and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2launch.html"
     * >EC2Launch</a> in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * <p>
     * For the <code>EC2Config</code> service, the password is not generated for
     * rebundled AMIs unless <code>Ec2SetPassword</code> is enabled before
     * bundling.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when you
     * launched the instance. You must provide the corresponding key pair file.
     * </p>
     * <p>
     * When you launch an instance, password generation and encryption may take
     * a few minutes. If you try to retrieve the password before it's available,
     * the output returns an empty string. We recommend that you wait up to 15
     * minutes after launching an instance before trying to retrieve the
     * generated password.
     * </p>
     * 
     * @param getPasswordDataRequest
     * @return getPasswordDataResult The response from the GetPasswordData
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetPasswordDataResult getPasswordData(GetPasswordDataRequest getPasswordDataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a quote and exchange information for exchanging one or more
     * specified Convertible Reserved Instances for a new Convertible Reserved
     * Instance. If the exchange cannot be performed, the reason is returned in
     * the response. Use <a>AcceptReservedInstancesExchangeQuote</a> to perform
     * the exchange.
     * </p>
     * 
     * @param getReservedInstancesExchangeQuoteRequest <p>
     *            Contains the parameters for GetReservedInstanceExchangeQuote.
     *            </p>
     * @return getReservedInstancesExchangeQuoteResult The response from the
     *         GetReservedInstancesExchangeQuote service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetReservedInstancesExchangeQuoteResult getReservedInstancesExchangeQuote(
            GetReservedInstancesExchangeQuoteRequest getReservedInstancesExchangeQuoteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the route tables to which the specified resource attachment
     * propagates routes.
     * </p>
     * 
     * @param getTransitGatewayAttachmentPropagationsRequest
     * @return getTransitGatewayAttachmentPropagationsResult The response from
     *         the GetTransitGatewayAttachmentPropagations service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetTransitGatewayAttachmentPropagationsResult getTransitGatewayAttachmentPropagations(
            GetTransitGatewayAttachmentPropagationsRequest getTransitGatewayAttachmentPropagationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the associations for the transit gateway multicast
     * domain.
     * </p>
     * 
     * @param getTransitGatewayMulticastDomainAssociationsRequest
     * @return getTransitGatewayMulticastDomainAssociationsResult The response
     *         from the GetTransitGatewayMulticastDomainAssociations service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetTransitGatewayMulticastDomainAssociationsResult getTransitGatewayMulticastDomainAssociations(
            GetTransitGatewayMulticastDomainAssociationsRequest getTransitGatewayMulticastDomainAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the associations for the specified transit gateway
     * route table.
     * </p>
     * 
     * @param getTransitGatewayRouteTableAssociationsRequest
     * @return getTransitGatewayRouteTableAssociationsResult The response from
     *         the GetTransitGatewayRouteTableAssociations service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetTransitGatewayRouteTableAssociationsResult getTransitGatewayRouteTableAssociations(
            GetTransitGatewayRouteTableAssociationsRequest getTransitGatewayRouteTableAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the route table propagations for the specified
     * transit gateway route table.
     * </p>
     * 
     * @param getTransitGatewayRouteTablePropagationsRequest
     * @return getTransitGatewayRouteTablePropagationsResult The response from
     *         the GetTransitGatewayRouteTablePropagations service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetTransitGatewayRouteTablePropagationsResult getTransitGatewayRouteTablePropagations(
            GetTransitGatewayRouteTablePropagationsRequest getTransitGatewayRouteTablePropagationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads a client certificate revocation list to the specified Client VPN
     * endpoint. Uploading a client certificate revocation list overwrites the
     * existing client certificate revocation list.
     * </p>
     * <p>
     * Uploading a client certificate revocation list resets existing client
     * connections.
     * </p>
     * 
     * @param importClientVpnClientCertificateRevocationListRequest
     * @return importClientVpnClientCertificateRevocationListResult The response
     *         from the ImportClientVpnClientCertificateRevocationList service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ImportClientVpnClientCertificateRevocationListResult importClientVpnClientCertificateRevocationList(
            ImportClientVpnClientCertificateRevocationListRequest importClientVpnClientCertificateRevocationListRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Import single or multi-volume disk images or EBS snapshots into an Amazon
     * Machine Image (AMI). For more information, see <a href=
     * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html"
     * >Importing a VM as an Image Using VM Import/Export</a> in the <i>VM
     * Import/Export User Guide</i>.
     * </p>
     * 
     * @param importImageRequest
     * @return importImageResult The response from the ImportImage service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ImportImageResult importImage(ImportImageRequest importImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an import instance task using metadata from the specified disk
     * image. <code>ImportInstance</code> only supports single-volume VMs. To
     * import multi-volume VMs, use <a>ImportImage</a>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/ec2-cli-vmimport-export.html"
     * >Importing a Virtual Machine Using the Amazon EC2 CLI</a>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM
     * Import Manifest</a>.
     * </p>
     * 
     * @param importInstanceRequest
     * @return importInstanceResult The response from the ImportInstance service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ImportInstanceResult importInstance(ImportInstanceRequest importInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports the public key from an RSA key pair that you created with a
     * third-party tool. Compare this with <a>CreateKeyPair</a>, in which AWS
     * creates the key pair and gives the keys to you (AWS keeps a copy of the
     * public key). With ImportKeyPair, you create the key pair and give AWS
     * just the public key. The private key is never transferred between you and
     * AWS.
     * </p>
     * <p>
     * For more information about key pairs, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return importKeyPairResult The response from the ImportKeyPair service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports a disk into an EBS snapshot.
     * </p>
     * 
     * @param importSnapshotRequest
     * @return importSnapshotResult The response from the ImportSnapshot service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ImportSnapshotResult importSnapshot(ImportSnapshotRequest importSnapshotRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an import volume task using metadata from the specified disk
     * image.For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/importing-your-volumes-into-amazon-ebs.html"
     * >Importing Disks to Amazon EBS</a>.
     * </p>
     * <p>
     * For information about the import manifest referenced by this API action,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html">VM
     * Import Manifest</a>.
     * </p>
     * 
     * @param importVolumeRequest
     * @return importVolumeResult The response from the ImportVolume service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ImportVolumeResult importVolume(ImportVolumeRequest importVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables or disables an Availability Zone group for your account.
     * </p>
     * <p>
     * Use <a href=
     * "https://docs.aws.amazon.com/AWSEC2ApiDocReef/build/server-root/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
     * >describe-availability-zones</a> to view the value for
     * <code>GroupName</code>.
     * </p>
     * 
     * @param modifyAvailabilityZoneGroupRequest
     * @return modifyAvailabilityZoneGroupResult The response from the
     *         ModifyAvailabilityZoneGroup service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyAvailabilityZoneGroupResult modifyAvailabilityZoneGroup(
            ModifyAvailabilityZoneGroupRequest modifyAvailabilityZoneGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies a Capacity Reservation's capacity and the conditions under which
     * it is to be released. You cannot change a Capacity Reservation's instance
     * type, EBS optimization, instance store settings, platform, Availability
     * Zone, or instance eligibility. If you need to modify any of these
     * attributes, we recommend that you cancel the Capacity Reservation, and
     * then create a new one with the required attributes.
     * </p>
     * 
     * @param modifyCapacityReservationRequest
     * @return modifyCapacityReservationResult The response from the
     *         ModifyCapacityReservation service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyCapacityReservationResult modifyCapacityReservation(
            ModifyCapacityReservationRequest modifyCapacityReservationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified Client VPN endpoint. Modifying the DNS server
     * resets existing client connections.
     * </p>
     * 
     * @param modifyClientVpnEndpointRequest
     * @return modifyClientVpnEndpointResult The response from the
     *         ModifyClientVpnEndpoint service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyClientVpnEndpointResult modifyClientVpnEndpoint(
            ModifyClientVpnEndpointRequest modifyClientVpnEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the default credit option for CPU usage of burstable performance
     * instances. The default credit option is set at the account level per AWS
     * Region, and is specified per instance family. All new burstable
     * performance instances in the account launch using the default credit
     * option.
     * </p>
     * <p>
     * <code>ModifyDefaultCreditSpecification</code> is an asynchronous
     * operation, which works at an AWS Region level and modifies the credit
     * option for each Availability Zone. All zones in a Region are updated
     * within five minutes. But if instances are launched during this operation,
     * they might not get the new credit option until the zone is updated. To
     * verify whether the update has occurred, you can call
     * <code>GetDefaultCreditSpecification</code> and check
     * <code>DefaultCreditSpecification</code> for updates.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable Performance Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyDefaultCreditSpecificationRequest
     * @return modifyDefaultCreditSpecificationResult The response from the
     *         ModifyDefaultCreditSpecification service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyDefaultCreditSpecificationResult modifyDefaultCreditSpecification(
            ModifyDefaultCreditSpecificationRequest modifyDefaultCreditSpecificationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes the default customer master key (CMK) for EBS encryption by
     * default for your account in this Region.
     * </p>
     * <p>
     * AWS creates a unique AWS managed CMK in each Region for use with
     * encryption by default. If you change the default CMK to a symmetric
     * customer managed CMK, it is used instead of the AWS managed CMK. To reset
     * the default CMK to the AWS managed CMK for EBS, use
     * <a>ResetEbsDefaultKmsKeyId</a>. Amazon EBS does not support asymmetric
     * CMKs.
     * </p>
     * <p>
     * If you delete or disable the customer managed CMK that you specified for
     * use with encryption by default, your instances will fail to launch.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param modifyEbsDefaultKmsKeyIdRequest
     * @return modifyEbsDefaultKmsKeyIdResult The response from the
     *         ModifyEbsDefaultKmsKeyId service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyEbsDefaultKmsKeyIdResult modifyEbsDefaultKmsKeyId(
            ModifyEbsDefaultKmsKeyIdRequest modifyEbsDefaultKmsKeyIdRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified EC2 Fleet.
     * </p>
     * <p>
     * You can only modify an EC2 Fleet request of type <code>maintain</code>.
     * </p>
     * <p>
     * While the EC2 Fleet is being modified, it is in the
     * <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your EC2 Fleet, increase its target capacity. The EC2 Fleet
     * launches the additional Spot Instances according to the allocation
     * strategy for the EC2 Fleet request. If the allocation strategy is
     * <code>lowest-price</code>, the EC2 Fleet launches instances using the
     * Spot Instance pool with the lowest price. If the allocation strategy is
     * <code>diversified</code>, the EC2 Fleet distributes the instances across
     * the Spot Instance pools. If the allocation strategy is
     * <code>capacity-optimized</code>, EC2 Fleet launches instances from Spot
     * Instance pools with optimal capacity for the number of instances that are
     * launching.
     * </p>
     * <p>
     * To scale down your EC2 Fleet, decrease its target capacity. First, the
     * EC2 Fleet cancels any open requests that exceed the new target capacity.
     * You can request that the EC2 Fleet terminate Spot Instances until the
     * size of the fleet no longer exceeds the new target capacity. If the
     * allocation strategy is <code>lowest-price</code>, the EC2 Fleet
     * terminates the instances with the highest price per unit. If the
     * allocation strategy is <code>capacity-optimized</code>, the EC2 Fleet
     * terminates the instances in the Spot Instance pools that have the least
     * available Spot Instance capacity. If the allocation strategy is
     * <code>diversified</code>, the EC2 Fleet terminates instances across the
     * Spot Instance pools. Alternatively, you can request that the EC2 Fleet
     * keep the fleet at its current size, but not replace any Spot Instances
     * that are interrupted or that you terminate manually.
     * </p>
     * <p>
     * If you are finished with your EC2 Fleet for now, but will use it again
     * later, you can set the target capacity to 0.
     * </p>
     * 
     * @param modifyFleetRequest
     * @return modifyFleetResult The response from the ModifyFleet service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyFleetResult modifyFleet(ModifyFleetRequest modifyFleetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified attribute of the specified Amazon FPGA Image
     * (AFI).
     * </p>
     * 
     * @param modifyFpgaImageAttributeRequest
     * @return modifyFpgaImageAttributeResult The response from the
     *         ModifyFpgaImageAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyFpgaImageAttributeResult modifyFpgaImageAttribute(
            ModifyFpgaImageAttributeRequest modifyFpgaImageAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modify the auto-placement setting of a Dedicated Host. When
     * auto-placement is enabled, any instances that you launch with a tenancy
     * of <code>host</code> but without a specific host ID are placed onto any
     * available Dedicated Host in your account that has auto-placement enabled.
     * When auto-placement is disabled, you need to provide a host ID to have
     * the instance launch onto a specific host. If no host ID is provided, the
     * instance is launched onto a suitable host with auto-placement enabled.
     * </p>
     * <p>
     * You can also use this API action to modify a Dedicated Host to support
     * either multiple instance types in an instance family, or to support a
     * specific instance type only.
     * </p>
     * 
     * @param modifyHostsRequest
     * @return modifyHostsResult The response from the ModifyHosts service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyHostsResult modifyHosts(ModifyHostsRequest modifyHostsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the ID format for the specified resource on a per-Region basis.
     * You can specify that resources should receive longer IDs (17-character
     * IDs) when they are created.
     * </p>
     * <p>
     * This request can only be used to modify longer ID settings for resource
     * types that are within the opt-in period. Resources currently in their
     * opt-in period include: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> |
     * <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>.
     * </p>
     * <p>
     * This setting applies to the IAM user who makes the request; it does not
     * apply to the entire AWS account. By default, an IAM user defaults to the
     * same settings as the root user. If you're using this action as the root
     * user, then these settings apply to the entire account, unless an IAM user
     * explicitly overrides these settings for themselves. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html"
     * >Resource IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Resources created with longer IDs are visible to all IAM roles and users,
     * regardless of these settings and provided that they have permission to
     * use the relevant <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @param modifyIdFormatRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifyIdFormat(ModifyIdFormatRequest modifyIdFormatRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies the ID format of a resource for a specified IAM user, IAM role,
     * or the root user for an account; or all IAM users, IAM roles, and the
     * root user for an account. You can specify that resources should receive
     * longer IDs (17-character IDs) when they are created.
     * </p>
     * <p>
     * This request can only be used to modify longer ID settings for resource
     * types that are within the opt-in period. Resources currently in their
     * opt-in period include: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>internet-gateway</code> |
     * <code>network-acl</code> | <code>network-acl-association</code> |
     * <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>route-table</code> | <code>route-table-association</code> |
     * <code>security-group</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> |
     * <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/resource-ids.html"
     * >Resource IDs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * This setting applies to the principal specified in the request; it does
     * not apply to the principal that makes the request.
     * </p>
     * <p>
     * Resources created with longer IDs are visible to all IAM roles and users,
     * regardless of these settings and provided that they have permission to
     * use the relevant <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @param modifyIdentityIdFormatRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifyIdentityIdFormat(ModifyIdentityIdFormatRequest modifyIdentityIdFormatRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can specify
     * only one attribute at a time. You can use the <code>Attribute</code>
     * parameter to specify the attribute or one of the following parameters:
     * <code>Description</code>, <code>LaunchPermission</code>, or
     * <code>ProductCode</code>.
     * </p>
     * <p>
     * AWS Marketplace product codes cannot be modified. Images with an AWS
     * Marketplace product code cannot be made public.
     * </p>
     * <p>
     * To enable the SriovNetSupport enhanced networking attribute of an image,
     * enable SriovNetSupport on an instance and create an AMI from the
     * instance.
     * </p>
     * 
     * @param modifyImageAttributeRequest <p>
     *            Contains the parameters for ModifyImageAttribute.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified attribute of the specified instance. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * <b>Note: </b>Using this action to change the security groups associated
     * with an elastic network interface (ENI) attached to an instance in a VPC
     * can result in an error if the instance has more than one ENI. To change
     * the security groups associated with an ENI attached to an instance that
     * has multiple ENIs, we recommend that you use the
     * <a>ModifyNetworkInterfaceAttribute</a> action.
     * </p>
     * <p>
     * To modify some attributes, the instance must be stopped. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"
     * >Modifying Attributes of a Stopped Instance</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceAttributeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the Capacity Reservation settings for a stopped instance. Use
     * this action to configure an instance to target a specific Capacity
     * Reservation, run in any <code>open</code> Capacity Reservation with
     * matching attributes, or run On-Demand Instance capacity.
     * </p>
     * 
     * @param modifyInstanceCapacityReservationAttributesRequest
     * @return modifyInstanceCapacityReservationAttributesResult The response
     *         from the ModifyInstanceCapacityReservationAttributes service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyInstanceCapacityReservationAttributesResult modifyInstanceCapacityReservationAttributes(
            ModifyInstanceCapacityReservationAttributesRequest modifyInstanceCapacityReservationAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the credit option for CPU usage on a running or stopped
     * burstable performance instance. The credit options are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
     * >Burstable Performance Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyInstanceCreditSpecificationRequest
     * @return modifyInstanceCreditSpecificationResult The response from the
     *         ModifyInstanceCreditSpecification service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyInstanceCreditSpecificationResult modifyInstanceCreditSpecification(
            ModifyInstanceCreditSpecificationRequest modifyInstanceCreditSpecificationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the start time for a scheduled Amazon EC2 instance event.
     * </p>
     * 
     * @param modifyInstanceEventStartTimeRequest
     * @return modifyInstanceEventStartTimeResult The response from the
     *         ModifyInstanceEventStartTime service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyInstanceEventStartTimeResult modifyInstanceEventStartTime(
            ModifyInstanceEventStartTimeRequest modifyInstanceEventStartTimeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modify the instance metadata parameters on a running or stopped instance.
     * When you modify the parameters on a stopped instance, they are applied
     * when the instance is started. When you modify the parameters on a running
     * instance, the API responds with a state of “pending”. After the parameter
     * modifications are successfully applied to the instance, the state of the
     * modifications changes from “pending” to “applied” in subsequent
     * describe-instances API calls. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a>.
     * </p>
     * 
     * @param modifyInstanceMetadataOptionsRequest
     * @return modifyInstanceMetadataOptionsResult The response from the
     *         ModifyInstanceMetadataOptions service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyInstanceMetadataOptionsResult modifyInstanceMetadataOptions(
            ModifyInstanceMetadataOptionsRequest modifyInstanceMetadataOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the placement attributes for a specified instance. You can do
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Modify the affinity between an instance and a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html"
     * >Dedicated Host</a>. When affinity is set to <code>host</code> and the
     * instance is not associated with a specific Dedicated Host, the next time
     * the instance is launched, it is automatically associated with the host on
     * which it lands. If the instance is restarted or rebooted, this
     * relationship persists.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the Dedicated Host with which an instance is associated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the instance tenancy of an instance from <code>host</code> to
     * <code>dedicated</code>, or from <code>dedicated</code> to
     * <code>host</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Move an instance to or from a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >placement group</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * At least one attribute for affinity, host ID, tenancy, or placement group
     * name must be specified in the request. Affinity and tenancy can be
     * modified in the same request.
     * </p>
     * <p>
     * To modify the host ID, tenancy, placement group, or partition for an
     * instance, the instance must be in the <code>stopped</code> state.
     * </p>
     * 
     * @param modifyInstancePlacementRequest
     * @return modifyInstancePlacementResult The response from the
     *         ModifyInstancePlacement service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyInstancePlacementResult modifyInstancePlacement(
            ModifyInstancePlacementRequest modifyInstancePlacementRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies a launch template. You can specify which version of the launch
     * template to set as the default version. When launching an instance, the
     * default version applies when a launch template version is not specified.
     * </p>
     * 
     * @param modifyLaunchTemplateRequest
     * @return modifyLaunchTemplateResult The response from the
     *         ModifyLaunchTemplate service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyLaunchTemplateResult modifyLaunchTemplate(
            ModifyLaunchTemplateRequest modifyLaunchTemplateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify only
     * one attribute at a time. You can use this action to attach and detach
     * security groups from an existing EC2 instance.
     * </p>
     * 
     * @param modifyNetworkInterfaceAttributeRequest <p>
     *            Contains the parameters for ModifyNetworkInterfaceAttribute.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifyNetworkInterfaceAttribute(
            ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or network
     * platform (EC2-Classic or EC2-VPC) of your Reserved Instances. The
     * Reserved Instances to be modified must be identical, except for
     * Availability Zone, network platform, and instance type.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html"
     * >Modifying Reserved Instances</a> in the Amazon Elastic Compute Cloud
     * User Guide.
     * </p>
     * 
     * @param modifyReservedInstancesRequest <p>
     *            Contains the parameters for ModifyReservedInstances.
     *            </p>
     * @return modifyReservedInstancesResult The response from the
     *         ModifyReservedInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyReservedInstancesResult modifyReservedInstances(
            ModifyReservedInstancesRequest modifyReservedInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or removes permission settings for the specified snapshot. You may
     * add or remove specified AWS account IDs from a snapshot's list of create
     * volume permissions, but you cannot do both in a single operation. If you
     * need to both add and remove account IDs for a snapshot, you must use
     * multiple operations. You can make up to 500 modifications to a snapshot
     * in a single operation.
     * </p>
     * <p>
     * Encrypted snapshots and snapshots with AWS Marketplace product codes
     * cannot be made public. Snapshots encrypted with your default CMK cannot
     * be shared with other accounts.
     * </p>
     * <p>
     * For more information about modifying snapshot permissions, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"
     * >Sharing Snapshots</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param modifySnapshotAttributeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified Spot Fleet request.
     * </p>
     * <p>
     * You can only modify a Spot Fleet request of type <code>maintain</code>.
     * </p>
     * <p>
     * While the Spot Fleet request is being modified, it is in the
     * <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your Spot Fleet, increase its target capacity. The Spot Fleet
     * launches the additional Spot Instances according to the allocation
     * strategy for the Spot Fleet request. If the allocation strategy is
     * <code>lowestPrice</code>, the Spot Fleet launches instances using the
     * Spot Instance pool with the lowest price. If the allocation strategy is
     * <code>diversified</code>, the Spot Fleet distributes the instances across
     * the Spot Instance pools. If the allocation strategy is
     * <code>capacityOptimized</code>, Spot Fleet launches instances from Spot
     * Instance pools with optimal capacity for the number of instances that are
     * launching.
     * </p>
     * <p>
     * To scale down your Spot Fleet, decrease its target capacity. First, the
     * Spot Fleet cancels any open requests that exceed the new target capacity.
     * You can request that the Spot Fleet terminate Spot Instances until the
     * size of the fleet no longer exceeds the new target capacity. If the
     * allocation strategy is <code>lowestPrice</code>, the Spot Fleet
     * terminates the instances with the highest price per unit. If the
     * allocation strategy is <code>capacityOptimized</code>, the Spot Fleet
     * terminates the instances in the Spot Instance pools that have the least
     * available Spot Instance capacity. If the allocation strategy is
     * <code>diversified</code>, the Spot Fleet terminates instances across the
     * Spot Instance pools. Alternatively, you can request that the Spot Fleet
     * keep the fleet at its current size, but not replace any Spot Instances
     * that are interrupted or that you terminate manually.
     * </p>
     * <p>
     * If you are finished with your Spot Fleet for now, but will use it again
     * later, you can set the target capacity to 0.
     * </p>
     * 
     * @param modifySpotFleetRequestRequest <p>
     *            Contains the parameters for ModifySpotFleetRequest.
     *            </p>
     * @return modifySpotFleetRequestResult The response from the
     *         ModifySpotFleetRequest service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifySpotFleetRequestResult modifySpotFleetRequest(
            ModifySpotFleetRequestRequest modifySpotFleetRequestRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies a subnet attribute. You can only modify one attribute at a time.
     * </p>
     * 
     * @param modifySubnetAttributeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifySubnetAttribute(ModifySubnetAttributeRequest modifySubnetAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows or restricts mirroring network services.
     * </p>
     * <p>
     * By default, Amazon DNS network services are not eligible for Traffic
     * Mirror. Use <code>AddNetworkServices</code> to add network services to a
     * Traffic Mirror filter. When a network service is added to the Traffic
     * Mirror filter, all traffic related to that network service will be
     * mirrored. When you no longer want to mirror network services, use
     * <code>RemoveNetworkServices</code> to remove the network services from
     * the Traffic Mirror filter.
     * </p>
     * <p>
     * For information about filter rule properties, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/mirroring/traffic-mirroring-considerations.html"
     * >Network Services</a> in the <i>Traffic Mirroring User Guide </i>.
     * </p>
     * 
     * @param modifyTrafficMirrorFilterNetworkServicesRequest
     * @return modifyTrafficMirrorFilterNetworkServicesResult The response from
     *         the ModifyTrafficMirrorFilterNetworkServices service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyTrafficMirrorFilterNetworkServicesResult modifyTrafficMirrorFilterNetworkServices(
            ModifyTrafficMirrorFilterNetworkServicesRequest modifyTrafficMirrorFilterNetworkServicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified Traffic Mirror rule.
     * </p>
     * <p>
     * <code>DestinationCidrBlock</code> and <code>SourceCidrBlock</code> must
     * both be an IPv4 range or an IPv6 range.
     * </p>
     * 
     * @param modifyTrafficMirrorFilterRuleRequest
     * @return modifyTrafficMirrorFilterRuleResult The response from the
     *         ModifyTrafficMirrorFilterRule service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyTrafficMirrorFilterRuleResult modifyTrafficMirrorFilterRule(
            ModifyTrafficMirrorFilterRuleRequest modifyTrafficMirrorFilterRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies a Traffic Mirror session.
     * </p>
     * 
     * @param modifyTrafficMirrorSessionRequest
     * @return modifyTrafficMirrorSessionResult The response from the
     *         ModifyTrafficMirrorSession service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyTrafficMirrorSessionResult modifyTrafficMirrorSession(
            ModifyTrafficMirrorSessionRequest modifyTrafficMirrorSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified VPC attachment.
     * </p>
     * 
     * @param modifyTransitGatewayVpcAttachmentRequest
     * @return modifyTransitGatewayVpcAttachmentResult The response from the
     *         ModifyTransitGatewayVpcAttachment service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyTransitGatewayVpcAttachmentResult modifyTransitGatewayVpcAttachment(
            ModifyTransitGatewayVpcAttachmentRequest modifyTransitGatewayVpcAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * You can modify several parameters of an existing EBS volume, including
     * volume size, volume type, and IOPS capacity. If your EBS volume is
     * attached to a current-generation EC2 instance type, you may be able to
     * apply these changes without stopping the instance or detaching the volume
     * from it. For more information about modifying an EBS volume running
     * Linux, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html"
     * >Modifying the Size, IOPS, or Type of an EBS Volume on Linux</a>. For
     * more information about modifying an EBS volume running Windows, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html"
     * >Modifying the Size, IOPS, or Type of an EBS Volume on Windows</a>.
     * </p>
     * <p>
     * When you complete a resize operation on your volume, you need to extend
     * the volume's file-system size to take advantage of the new storage
     * capacity. For information about extending a Linux file system, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#recognize-expanded-volume-linux"
     * >Extending a Linux File System</a>. For information about extending a
     * Windows file system, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html#recognize-expanded-volume-windows"
     * >Extending a Windows File System</a>.
     * </p>
     * <p>
     * You can use CloudWatch Events to check the status of a modification to an
     * EBS volume. For information about CloudWatch Events, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon
     * CloudWatch Events User Guide</a>. You can also track the status of a
     * modification using <a>DescribeVolumesModifications</a>. For information
     * about tracking status changes using either method, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods"
     * >Monitoring Volume Modifications</a>.
     * </p>
     * <p>
     * With previous-generation instance types, resizing an EBS volume may
     * require detaching and reattaching the volume or stopping and restarting
     * the instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html"
     * >Modifying the Size, IOPS, or Type of an EBS Volume on Linux</a> and <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html"
     * >Modifying the Size, IOPS, or Type of an EBS Volume on Windows</a>.
     * </p>
     * <p>
     * If you reach the maximum volume modification rate per volume limit, you
     * will need to wait at least six hours before applying further
     * modifications to the affected EBS volume.
     * </p>
     * 
     * @param modifyVolumeRequest
     * @return modifyVolumeResult The response from the ModifyVolume service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVolumeResult modifyVolume(ModifyVolumeRequest modifyVolumeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies a volume attribute.
     * </p>
     * <p>
     * By default, all I/O operations for the volume are suspended when the data
     * on the volume is determined to be potentially inconsistent, to prevent
     * undetectable, latent data corruption. The I/O access to the volume can be
     * resumed by first enabling I/O access and then checking the data
     * consistency on your volume.
     * </p>
     * <p>
     * You can change the default behavior to resume I/O operations. We
     * recommend that you change this only for boot volumes or for volumes that
     * are stateless or disposable.
     * </p>
     * 
     * @param modifyVolumeAttributeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifyVolumeAttribute(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     * 
     * @param modifyVpcAttributeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void modifyVpcAttribute(ModifyVpcAttributeRequest modifyVpcAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies attributes of a specified VPC endpoint. The attributes that you
     * can modify depend on the type of VPC endpoint (interface or gateway). For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html">VPC
     * Endpoints</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcEndpointRequest <p>
     *            Contains the parameters for ModifyVpcEndpoint.
     *            </p>
     * @return modifyVpcEndpointResult The response from the ModifyVpcEndpoint
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpcEndpointResult modifyVpcEndpoint(ModifyVpcEndpointRequest modifyVpcEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies a connection notification for VPC endpoint or VPC endpoint
     * service. You can change the SNS topic for the notification, or the events
     * for which to be notified.
     * </p>
     * 
     * @param modifyVpcEndpointConnectionNotificationRequest
     * @return modifyVpcEndpointConnectionNotificationResult The response from
     *         the ModifyVpcEndpointConnectionNotification service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpcEndpointConnectionNotificationResult modifyVpcEndpointConnectionNotification(
            ModifyVpcEndpointConnectionNotificationRequest modifyVpcEndpointConnectionNotificationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the attributes of your VPC endpoint service configuration. You
     * can change the Network Load Balancers for your service, and you can
     * specify whether acceptance is required for requests to connect to your
     * endpoint service through an interface VPC endpoint.
     * </p>
     * <p>
     * If you set or modify the private DNS name, you must prove that you own
     * the private DNS domain name. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-services-dns-validation.html"
     * >VPC Endpoint Service Private DNS Name Verification</a> in the <i>Amazon
     * Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param modifyVpcEndpointServiceConfigurationRequest
     * @return modifyVpcEndpointServiceConfigurationResult The response from the
     *         ModifyVpcEndpointServiceConfiguration service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpcEndpointServiceConfigurationResult modifyVpcEndpointServiceConfiguration(
            ModifyVpcEndpointServiceConfigurationRequest modifyVpcEndpointServiceConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the permissions for your <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/endpoint-service.html"
     * >VPC endpoint service</a>. You can add or remove permissions for service
     * consumers (IAM users, IAM roles, and AWS accounts) to connect to your
     * endpoint service.
     * </p>
     * <p>
     * If you grant permissions to all principals, the service is public. Any
     * users who know the name of a public service can send a request to attach
     * an endpoint. If the service does not require manual approval, attachments
     * are automatically approved.
     * </p>
     * 
     * @param modifyVpcEndpointServicePermissionsRequest
     * @return modifyVpcEndpointServicePermissionsResult The response from the
     *         ModifyVpcEndpointServicePermissions service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpcEndpointServicePermissionsResult modifyVpcEndpointServicePermissions(
            ModifyVpcEndpointServicePermissionsRequest modifyVpcEndpointServicePermissionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the VPC peering connection options on one side of a VPC peering
     * connection. You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enable/disable communication over the peering connection between an
     * EC2-Classic instance that's linked to your VPC (using ClassicLink) and
     * instances in the peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable/disable communication over the peering connection between
     * instances in your VPC and an EC2-Classic instance that's linked to the
     * peer VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable/disable the ability to resolve public DNS hostnames to private IP
     * addresses when queried from instances in the peer VPC.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the peered VPCs are in the same AWS account, you can enable DNS
     * resolution for queries from the local VPC. This ensures that queries from
     * the local VPC resolve to private IP addresses in the peer VPC. This
     * option is not available if the peered VPCs are in different AWS accounts
     * or different Regions. For peered VPCs in different AWS accounts, each AWS
     * account owner must initiate a separate request to modify the peering
     * connection options. For inter-region peering connections, you must use
     * the Region for the requester VPC to modify the requester VPC peering
     * options and the Region for the accepter VPC to modify the accepter VPC
     * peering options. To verify which VPCs are the accepter and the requester
     * for a VPC peering connection, use the
     * <a>DescribeVpcPeeringConnections</a> command.
     * </p>
     * 
     * @param modifyVpcPeeringConnectionOptionsRequest
     * @return modifyVpcPeeringConnectionOptionsResult The response from the
     *         ModifyVpcPeeringConnectionOptions service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpcPeeringConnectionOptionsResult modifyVpcPeeringConnectionOptions(
            ModifyVpcPeeringConnectionOptionsRequest modifyVpcPeeringConnectionOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the instance tenancy attribute of the specified VPC. You can
     * change the instance tenancy attribute of a VPC to <code>default</code>
     * only. You cannot change the instance tenancy attribute to
     * <code>dedicated</code>.
     * </p>
     * <p>
     * After you modify the tenancy of the VPC, any new instances that you
     * launch into the VPC have a tenancy of <code>default</code>, unless you
     * specify otherwise during launch. The tenancy of any existing instances in
     * the VPC is not affected.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-instance.html"
     * >Dedicated Instances</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param modifyVpcTenancyRequest
     * @return modifyVpcTenancyResult The response from the ModifyVpcTenancy
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpcTenancyResult modifyVpcTenancy(ModifyVpcTenancyRequest modifyVpcTenancyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the customer gateway or the target gateway of an AWS
     * Site-to-Site VPN connection. To modify the target gateway, the following
     * migration options are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An existing virtual private gateway to a new virtual private gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * An existing virtual private gateway to a transit gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * An existing transit gateway to a new transit gateway
     * </p>
     * </li>
     * <li>
     * <p>
     * An existing transit gateway to a virtual private gateway
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you perform the migration to the new gateway, you must configure
     * the new gateway. Use <a>CreateVpnGateway</a> to create a virtual private
     * gateway, or <a>CreateTransitGateway</a> to create a transit gateway.
     * </p>
     * <p>
     * This step is required when you migrate from a virtual private gateway
     * with static routes to a transit gateway.
     * </p>
     * <p>
     * You must delete the static routes before you migrate to the new gateway.
     * </p>
     * <p>
     * Keep a copy of the static route before you delete it. You will need to
     * add back these routes to the transit gateway after the VPN connection
     * migration is complete.
     * </p>
     * <p>
     * After you migrate to the new gateway, you might need to modify your VPC
     * route table. Use <a>CreateRoute</a> and <a>DeleteRoute</a> to make the
     * changes described in <a href=
     * "https://docs.aws.amazon.com/vpn/latest/s2svpn/modify-vpn-target.html#step-update-routing"
     * >VPN Gateway Target Modification Required VPC Route Table Updates</a> in
     * the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * <p>
     * When the new gateway is a transit gateway, modify the transit gateway
     * route table to allow traffic between the VPC and the AWS Site-to-Site VPN
     * connection. Use <a>CreateTransitGatewayRoute</a> to add the routes.
     * </p>
     * <p>
     * If you deleted VPN static routes, you must add the static routes to the
     * transit gateway route table.
     * </p>
     * <p>
     * After you perform this operation, the AWS VPN endpoint's IP addresses on
     * the AWS side and the tunnel options remain intact. Your AWS Site-to-Site
     * VPN connection will be temporarily unavailable for a brief period while
     * we provision the new endpoints.
     * </p>
     * 
     * @param modifyVpnConnectionRequest
     * @return modifyVpnConnectionResult The response from the
     *         ModifyVpnConnection service method, as returned by Amazon Elastic
     *         Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpnConnectionResult modifyVpnConnection(
            ModifyVpnConnectionRequest modifyVpnConnectionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies the VPN tunnel endpoint certificate.
     * </p>
     * 
     * @param modifyVpnTunnelCertificateRequest
     * @return modifyVpnTunnelCertificateResult The response from the
     *         ModifyVpnTunnelCertificate service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpnTunnelCertificateResult modifyVpnTunnelCertificate(
            ModifyVpnTunnelCertificateRequest modifyVpnTunnelCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the options for a VPN tunnel in an AWS Site-to-Site VPN
     * connection. You can modify multiple options for a tunnel in a single
     * request, but you can only modify one tunnel at a time. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/s2svpn/VPNTunnels.html"
     * >Site-to-Site VPN Tunnel Options for Your Site-to-Site VPN Connection</a>
     * in the <i>AWS Site-to-Site VPN User Guide</i>.
     * </p>
     * 
     * @param modifyVpnTunnelOptionsRequest
     * @return modifyVpnTunnelOptionsResult The response from the
     *         ModifyVpnTunnelOptions service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ModifyVpnTunnelOptionsResult modifyVpnTunnelOptions(
            ModifyVpnTunnelOptionsRequest modifyVpnTunnelOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables detailed monitoring for a running instance. Otherwise, basic
     * monitoring is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"
     * >Monitoring Your Instances and Volumes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * To disable detailed monitoring, see .
     * </p>
     * 
     * @param monitorInstancesRequest
     * @return monitorInstancesResult The response from the MonitorInstances
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Moves an Elastic IP address from the EC2-Classic platform to the EC2-VPC
     * platform. The Elastic IP address must be allocated to your account for
     * more than 24 hours, and it must not be associated with an instance. After
     * the Elastic IP address is moved, it is no longer available for use in the
     * EC2-Classic platform, unless you move it back using the
     * <a>RestoreAddressToClassic</a> request. You cannot move an Elastic IP
     * address that was originally allocated for use in the EC2-VPC platform to
     * the EC2-Classic platform.
     * </p>
     * 
     * @param moveAddressToVpcRequest
     * @return moveAddressToVpcResult The response from the MoveAddressToVpc
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    MoveAddressToVpcResult moveAddressToVpc(MoveAddressToVpcRequest moveAddressToVpcRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provisions an IPv4 or IPv6 address range for use with your AWS resources
     * through bring your own IP addresses (BYOIP) and creates a corresponding
     * address pool. After the address range is provisioned, it is ready to be
     * advertised using <a>AdvertiseByoipCidr</a>.
     * </p>
     * <p>
     * AWS verifies that you own the address range and are authorized to
     * advertise it. You must ensure that the address range is registered to you
     * and that you created an RPKI ROA to authorize Amazon ASNs 16509 and 14618
     * to advertise the address range. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html"
     * >Bring Your Own IP Addresses (BYOIP)</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * Provisioning an address range is an asynchronous operation, so the call
     * returns immediately, but the address range is not ready to use until its
     * status changes from <code>pending-provision</code> to
     * <code>provisioned</code>. To monitor the status of an address range, use
     * <a>DescribeByoipCidrs</a>. To allocate an Elastic IP address from your
     * IPv4 address pool, use <a>AllocateAddress</a> with either the specific
     * address from the address pool or the ID of the address pool.
     * </p>
     * 
     * @param provisionByoipCidrRequest
     * @return provisionByoipCidrResult The response from the ProvisionByoipCidr
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ProvisionByoipCidrResult provisionByoipCidr(ProvisionByoipCidrRequest provisionByoipCidrRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Purchase a reservation with configurations that match those of your
     * Dedicated Host. You must have active Dedicated Hosts in your account
     * before you purchase a reservation. This action results in the specified
     * reservation being purchased and charged to your account.
     * </p>
     * 
     * @param purchaseHostReservationRequest
     * @return purchaseHostReservationResult The response from the
     *         PurchaseHostReservation service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PurchaseHostReservationResult purchaseHostReservation(
            PurchaseHostReservationRequest purchaseHostReservationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Purchases a Reserved Instance for use with your account. With Reserved
     * Instances, you pay a lower hourly rate compared to On-Demand instance
     * pricing.
     * </p>
     * <p>
     * Use <a>DescribeReservedInstancesOfferings</a> to get a list of Reserved
     * Instance offerings that match your specifications. After you've purchased
     * a Reserved Instance, you can check for your new Reserved Instance with
     * <a>DescribeReservedInstances</a>.
     * </p>
     * <p>
     * To queue a purchase for a future date and time, specify a purchase time.
     * If you do not specify a purchase time, the default is the current time.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"
     * >Reserved Instances</a> and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"
     * >Reserved Instance Marketplace</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param purchaseReservedInstancesOfferingRequest <p>
     *            Contains the parameters for PurchaseReservedInstancesOffering.
     *            </p>
     * @return purchaseReservedInstancesOfferingResult The response from the
     *         PurchaseReservedInstancesOffering service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PurchaseReservedInstancesOfferingResult purchaseReservedInstancesOffering(
            PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Purchases the Scheduled Instances with the specified schedule.
     * </p>
     * <p>
     * Scheduled Instances enable you to purchase Amazon EC2 compute capacity by
     * the hour for a one-year term. Before you can purchase a Scheduled
     * Instance, you must call <a>DescribeScheduledInstanceAvailability</a> to
     * check for available schedules and obtain a purchase token. After you
     * purchase a Scheduled Instance, you must call <a>RunScheduledInstances</a>
     * during each scheduled time period.
     * </p>
     * <p>
     * After you purchase a Scheduled Instance, you can't cancel, modify, or
     * resell your purchase.
     * </p>
     * 
     * @param purchaseScheduledInstancesRequest <p>
     *            Contains the parameters for PurchaseScheduledInstances.
     *            </p>
     * @return purchaseScheduledInstancesResult The response from the
     *         PurchaseScheduledInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PurchaseScheduledInstancesResult purchaseScheduledInstances(
            PurchaseScheduledInstancesRequest purchaseScheduledInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Requests a reboot of the specified instances. This operation is
     * asynchronous; it only queues a request to reboot the specified instances.
     * The operation succeeds if the instances are valid and belong to you.
     * Requests to reboot terminated instances are ignored.
     * </p>
     * <p>
     * If an instance does not cleanly shut down within four minutes, Amazon EC2
     * performs a hard reboot.
     * </p>
     * <p>
     * For more information about troubleshooting, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html"
     * >Getting Console Output and Rebooting Instances</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param rebootInstancesRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void rebootInstances(RebootInstancesRequest rebootInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers an AMI. When you're creating an AMI, this is the final step you
     * must complete before you can launch an instance from the AMI. For more
     * information about creating AMIs, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html"
     * >Creating Your Own AMIs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * For Amazon EBS-backed instances, <a>CreateImage</a> creates and registers
     * the AMI in a single request, so you don't have to register the AMI
     * yourself.
     * </p>
     * </note>
     * <p>
     * You can also use <code>RegisterImage</code> to create an Amazon
     * EBS-backed Linux AMI from a snapshot of a root device volume. You specify
     * the snapshot using the block device mapping. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-launch-snapshot.html"
     * >Launching a Linux Instance from a Backup</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * You can't register an image where a secondary (non-root) snapshot has AWS
     * Marketplace product codes.
     * </p>
     * <p>
     * Windows and some Linux distributions, such as Red Hat Enterprise Linux
     * (RHEL) and SUSE Linux Enterprise Server (SLES), use the EC2 billing
     * product code associated with an AMI to verify the subscription status for
     * package updates. To create a new AMI for operating systems that require a
     * billing product code, instead of registering the AMI, do the following to
     * preserve the billing product code association:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Launch an instance from an existing AMI with that billing product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * Customize the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create an AMI from the instance using <a>CreateImage</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you purchase a Reserved Instance to apply to an On-Demand Instance
     * that was launched from an AMI with a billing product code, make sure that
     * the Reserved Instance has the matching billing product code. If you
     * purchase a Reserved Instance without the matching billing product code,
     * the Reserved Instance will not be applied to the On-Demand Instance. For
     * information about how to obtain the platform details and billing
     * information of an AMI, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html"
     * >Obtaining Billing Information</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * If needed, you can deregister an AMI at any time. Any modifications you
     * make to an AMI backed by an instance store volume invalidates its
     * registration. If you make changes to an image, deregister the previous
     * image and register the new image.
     * </p>
     * 
     * @param registerImageRequest <p>
     *            Contains the parameters for RegisterImage.
     *            </p>
     * @return registerImageResult The response from the RegisterImage service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RegisterImageResult registerImage(RegisterImageRequest registerImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a set of tag keys to include in scheduled event notifications
     * for your resources.
     * </p>
     * <p>
     * To remove tags, use .
     * </p>
     * 
     * @param registerInstanceEventNotificationAttributesRequest
     * @return registerInstanceEventNotificationAttributesResult The response
     *         from the RegisterInstanceEventNotificationAttributes service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RegisterInstanceEventNotificationAttributesResult registerInstanceEventNotificationAttributes(
            RegisterInstanceEventNotificationAttributesRequest registerInstanceEventNotificationAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers members (network interfaces) with the transit gateway multicast
     * group. A member is a network interface associated with a supported EC2
     * instance that receives multicast traffic. For information about supported
     * instances, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits"
     * >Multicast Consideration</a> in <i>Amazon VPC Transit Gateways</i>.
     * </p>
     * <p>
     * After you add the members, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SearchTransitGatewayMulticastGroups.html"
     * >SearchTransitGatewayMulticastGroups</a> to verify that the members were
     * added to the transit gateway multicast group.
     * </p>
     * 
     * @param registerTransitGatewayMulticastGroupMembersRequest
     * @return registerTransitGatewayMulticastGroupMembersResult The response
     *         from the RegisterTransitGatewayMulticastGroupMembers service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RegisterTransitGatewayMulticastGroupMembersResult registerTransitGatewayMulticastGroupMembers(
            RegisterTransitGatewayMulticastGroupMembersRequest registerTransitGatewayMulticastGroupMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers sources (network interfaces) with the specified transit gateway
     * multicast group.
     * </p>
     * <p>
     * A multicast source is a network interface attached to a supported
     * instance that sends multicast traffic. For information about supported
     * instances, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/tgw/transit-gateway-limits.html#multicast-limits"
     * >Multicast Considerations</a> in <i>Amazon VPC Transit Gateways</i>.
     * </p>
     * <p>
     * After you add the source, use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SearchTransitGatewayMulticastGroups.html"
     * >SearchTransitGatewayMulticastGroups</a> to verify that the source was
     * added to the multicast group.
     * </p>
     * 
     * @param registerTransitGatewayMulticastGroupSourcesRequest
     * @return registerTransitGatewayMulticastGroupSourcesResult The response
     *         from the RegisterTransitGatewayMulticastGroupSources service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RegisterTransitGatewayMulticastGroupSourcesResult registerTransitGatewayMulticastGroupSources(
            RegisterTransitGatewayMulticastGroupSourcesRequest registerTransitGatewayMulticastGroupSourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects a transit gateway peering attachment request.
     * </p>
     * 
     * @param rejectTransitGatewayPeeringAttachmentRequest
     * @return rejectTransitGatewayPeeringAttachmentResult The response from the
     *         RejectTransitGatewayPeeringAttachment service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RejectTransitGatewayPeeringAttachmentResult rejectTransitGatewayPeeringAttachment(
            RejectTransitGatewayPeeringAttachmentRequest rejectTransitGatewayPeeringAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects a request to attach a VPC to a transit gateway.
     * </p>
     * <p>
     * The VPC attachment must be in the <code>pendingAcceptance</code> state.
     * Use <a>DescribeTransitGatewayVpcAttachments</a> to view your pending VPC
     * attachment requests. Use <a>AcceptTransitGatewayVpcAttachment</a> to
     * accept a VPC attachment request.
     * </p>
     * 
     * @param rejectTransitGatewayVpcAttachmentRequest
     * @return rejectTransitGatewayVpcAttachmentResult The response from the
     *         RejectTransitGatewayVpcAttachment service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RejectTransitGatewayVpcAttachmentResult rejectTransitGatewayVpcAttachment(
            RejectTransitGatewayVpcAttachmentRequest rejectTransitGatewayVpcAttachmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects one or more VPC endpoint connection requests to your VPC endpoint
     * service.
     * </p>
     * 
     * @param rejectVpcEndpointConnectionsRequest
     * @return rejectVpcEndpointConnectionsResult The response from the
     *         RejectVpcEndpointConnections service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RejectVpcEndpointConnectionsResult rejectVpcEndpointConnections(
            RejectVpcEndpointConnectionsRequest rejectVpcEndpointConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects a VPC peering connection request. The VPC peering connection must
     * be in the <code>pending-acceptance</code> state. Use the
     * <a>DescribeVpcPeeringConnections</a> request to view your outstanding VPC
     * peering connection requests. To delete an active VPC peering connection,
     * or to delete a VPC peering connection request that you initiated, use
     * <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * 
     * @param rejectVpcPeeringConnectionRequest
     * @return rejectVpcPeeringConnectionResult The response from the
     *         RejectVpcPeeringConnection service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(
            RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address automatically
     * disassociates it from any instance that it's associated with. To
     * disassociate an Elastic IP address without releasing it, use
     * <a>DisassociateAddress</a>.
     * </p>
     * <p>
     * [Nondefault VPC] You must use <a>DisassociateAddress</a> to disassociate
     * the Elastic IP address before you can release it. Otherwise, Amazon EC2
     * returns an error (<code>InvalidIPAddress.InUse</code>).
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP address
     * pool. Be sure to update your DNS records and any servers or devices that
     * communicate with the address. If you attempt to release an Elastic IP
     * address that you already released, you'll get an <code>AuthFailure</code>
     * error if the address is already allocated to another AWS account.
     * </p>
     * <p>
     * [EC2-VPC] After you release an Elastic IP address for use in a VPC, you
     * might be able to recover it. For more information, see
     * <a>AllocateAddress</a>.
     * </p>
     * 
     * @param releaseAddressRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void releaseAddress(ReleaseAddressRequest releaseAddressRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * When you no longer want to use an On-Demand Dedicated Host it can be
     * released. On-Demand billing is stopped and the host goes into
     * <code>released</code> state. The host ID of Dedicated Hosts that have
     * been released can no longer be specified in another request, for example,
     * to modify the host. You must stop or terminate all instances on a host
     * before it can be released.
     * </p>
     * <p>
     * When Dedicated Hosts are released, it may take some time for them to stop
     * counting toward your limit and you may receive capacity errors when
     * trying to allocate new Dedicated Hosts. Wait a few minutes and then try
     * again.
     * </p>
     * <p>
     * Released hosts still appear in a <a>DescribeHosts</a> response.
     * </p>
     * 
     * @param releaseHostsRequest
     * @return releaseHostsResult The response from the ReleaseHosts service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ReleaseHostsResult releaseHosts(ReleaseHostsRequest releaseHostsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Replaces an IAM instance profile for the specified running instance. You
     * can use this action to change the IAM instance profile that's associated
     * with an instance without having to disassociate the existing IAM instance
     * profile first.
     * </p>
     * <p>
     * Use <a>DescribeIamInstanceProfileAssociations</a> to get the association
     * ID.
     * </p>
     * 
     * @param replaceIamInstanceProfileAssociationRequest
     * @return replaceIamInstanceProfileAssociationResult The response from the
     *         ReplaceIamInstanceProfileAssociation service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ReplaceIamInstanceProfileAssociationResult replaceIamInstanceProfileAssociation(
            ReplaceIamInstanceProfileAssociationRequest replaceIamInstanceProfileAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default when
     * you create a subnet, it's automatically associated with the default
     * network ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html"
     * >Network ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * This is an idempotent operation.
     * </p>
     * 
     * @param replaceNetworkAclAssociationRequest
     * @return replaceNetworkAclAssociationResult The response from the
     *         ReplaceNetworkAclAssociation service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ReplaceNetworkAclAssociationResult replaceNetworkAclAssociation(
            ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_ACLs.html">
     * Network ACLs</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceNetworkAclEntryRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. You must
     * provide only one of the following: internet gateway, virtual private
     * gateway, NAT instance, NAT gateway, VPC peering connection, network
     * interface, egress-only internet gateway, or transit gateway.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
     * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param replaceRouteRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void replaceRoute(ReplaceRouteRequest replaceRouteRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes the route table associated with a given subnet, internet gateway,
     * or virtual private gateway in a VPC. After the operation completes, the
     * subnet or gateway uses the routes in the new route table. For more
     * information about route tables, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html"
     * >Route Tables</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * <p>
     * You can also use this operation to change which table is the main route
     * table in the VPC. Specify the main route table's association ID and the
     * route table ID of the new main route table.
     * </p>
     * 
     * @param replaceRouteTableAssociationRequest
     * @return replaceRouteTableAssociationResult The response from the
     *         ReplaceRouteTableAssociation service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ReplaceRouteTableAssociationResult replaceRouteTableAssociation(
            ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Replaces the specified route in the specified transit gateway route
     * table.
     * </p>
     * 
     * @param replaceTransitGatewayRouteRequest
     * @return replaceTransitGatewayRouteResult The response from the
     *         ReplaceTransitGatewayRoute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ReplaceTransitGatewayRouteResult replaceTransitGatewayRoute(
            ReplaceTransitGatewayRouteRequest replaceTransitGatewayRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Submits feedback about the status of an instance. The instance must be in
     * the <code>running</code> state. If your experience with the instance
     * differs from the instance status returned by
     * <a>DescribeInstanceStatus</a>, use <a>ReportInstanceStatus</a> to report
     * your experience with the instance. Amazon EC2 collects this information
     * to improve the accuracy of status checks.
     * </p>
     * <p>
     * Use of this action does not change the value returned by
     * <a>DescribeInstanceStatus</a>.
     * </p>
     * 
     * @param reportInstanceStatusRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Spot Fleet request.
     * </p>
     * <p>
     * The Spot Fleet request specifies the total target capacity and the
     * On-Demand target capacity. Amazon EC2 calculates the difference between
     * the total capacity and On-Demand capacity, and launches the difference as
     * Spot capacity.
     * </p>
     * <p>
     * You can submit a single request that includes multiple launch
     * specifications that vary by instance type, AMI, Availability Zone, or
     * subnet.
     * </p>
     * <p>
     * By default, the Spot Fleet requests Spot Instances in the Spot Instance
     * pool where the price per unit is the lowest. Each launch specification
     * can include its own instance weighting that reflects the value of the
     * instance type to your application workload.
     * </p>
     * <p>
     * Alternatively, you can specify that the Spot Fleet distribute the target
     * capacity across the Spot pools included in its launch specifications. By
     * ensuring that the Spot Instances in your Spot Fleet are in different Spot
     * pools, you can improve the availability of your fleet.
     * </p>
     * <p>
     * You can specify tags for the Spot Fleet request and instances launched by
     * the fleet. You cannot tag other resource types in a Spot Fleet request
     * because only the <code>spot-fleet-request</code> and
     * <code>instance</code> resource types are supported.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html"
     * >Spot Fleet Requests</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * 
     * @param requestSpotFleetRequest <p>
     *            Contains the parameters for RequestSpotFleet.
     *            </p>
     * @return requestSpotFleetResult The response from the RequestSpotFleet
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RequestSpotFleetResult requestSpotFleet(RequestSpotFleetRequest requestSpotFleetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Spot Instance request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html"
     * >Spot Instance Requests</a> in the <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * 
     * @param requestSpotInstancesRequest <p>
     *            Contains the parameters for RequestSpotInstances.
     *            </p>
     * @return requestSpotInstancesResult The response from the
     *         RequestSpotInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RequestSpotInstancesResult requestSpotInstances(
            RequestSpotInstancesRequest requestSpotInstancesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Resets the default customer master key (CMK) for EBS encryption for your
     * account in this Region to the AWS managed CMK for EBS.
     * </p>
     * <p>
     * After resetting the default CMK to the AWS managed CMK, you can continue
     * to encrypt by a customer managed CMK by specifying it when you create the
     * volume. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param resetEbsDefaultKmsKeyIdRequest
     * @return resetEbsDefaultKmsKeyIdResult The response from the
     *         ResetEbsDefaultKmsKeyId service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ResetEbsDefaultKmsKeyIdResult resetEbsDefaultKmsKeyId(
            ResetEbsDefaultKmsKeyIdRequest resetEbsDefaultKmsKeyIdRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets the specified attribute of the specified Amazon FPGA Image (AFI)
     * to its default value. You can only reset the load permission attribute.
     * </p>
     * 
     * @param resetFpgaImageAttributeRequest
     * @return resetFpgaImageAttributeResult The response from the
     *         ResetFpgaImageAttribute service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ResetFpgaImageAttributeResult resetFpgaImageAttribute(
            ResetFpgaImageAttributeRequest resetFpgaImageAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets an attribute of an AMI to its default value.
     * </p>
     * <note>
     * <p>
     * The productCodes attribute can't be reset.
     * </p>
     * </note>
     * 
     * @param resetImageAttributeRequest <p>
     *            Contains the parameters for ResetImageAttribute.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets an attribute of an instance to its default value. To reset the
     * <code>kernel</code> or <code>ramdisk</code>, the instance must be in a
     * stopped state. To reset the <code>sourceDestCheck</code>, the instance
     * can be either running or stopped.
     * </p>
     * <p>
     * The <code>sourceDestCheck</code> attribute controls whether
     * source/destination checking is enabled. The default value is
     * <code>true</code>, which means checking is enabled. This value must be
     * <code>false</code> for a NAT instance to perform NAT. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param resetInstanceAttributeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one attribute
     * at a time.
     * </p>
     * 
     * @param resetNetworkInterfaceAttributeRequest <p>
     *            Contains the parameters for ResetNetworkInterfaceAttribute.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void resetNetworkInterfaceAttribute(
            ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information about modifying snapshot permissions, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"
     * >Sharing Snapshots</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param resetSnapshotAttributeRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Restores an Elastic IP address that was previously moved to the EC2-VPC
     * platform back to the EC2-Classic platform. You cannot move an Elastic IP
     * address that was originally allocated for use in EC2-VPC. The Elastic IP
     * address must not be associated with an instance or network interface.
     * </p>
     * 
     * @param restoreAddressToClassicRequest
     * @return restoreAddressToClassicResult The response from the
     *         RestoreAddressToClassic service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RestoreAddressToClassicResult restoreAddressToClassic(
            RestoreAddressToClassicRequest restoreAddressToClassicRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes an ingress authorization rule from a Client VPN endpoint.
     * </p>
     * 
     * @param revokeClientVpnIngressRequest
     * @return revokeClientVpnIngressResult The response from the
     *         RevokeClientVpnIngress service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RevokeClientVpnIngressResult revokeClientVpnIngress(
            RevokeClientVpnIngressRequest revokeClientVpnIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * [VPC only] Removes the specified egress rules from a security group for
     * EC2-VPC. This action doesn't apply to security groups for use in
     * EC2-Classic. To remove a rule, the values that you specify (for example,
     * ports) must match the existing rule's values exactly.
     * </p>
     * <p>
     * Each rule consists of the protocol and the IPv4 or IPv6 CIDR range or
     * source security group. For the TCP and UDP protocols, you must also
     * specify the destination port or range of ports. For the ICMP protocol,
     * you must also specify the ICMP type and code. If the security group rule
     * has a description, you do not have to specify the description to revoke
     * the rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * 
     * @param revokeSecurityGroupEgressRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified ingress rules from a security group. To remove a
     * rule, the values that you specify (for example, ports) must match the
     * existing rule's values exactly.
     * </p>
     * <note>
     * <p>
     * [EC2-Classic only] If the values you specify do not match the existing
     * rule's values, no error is returned. Use <a>DescribeSecurityGroups</a> to
     * verify that the rule has been removed.
     * </p>
     * </note>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source security
     * group. For the TCP and UDP protocols, you must also specify the
     * destination port or range of ports. For the ICMP protocol, you must also
     * specify the ICMP type and code. If the security group rule has a
     * description, you do not have to specify the description to revoke the
     * rule.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * 
     * @param revokeSecurityGroupIngressRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void revokeSecurityGroupIngress(
            RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Launches the specified number of instances using an AMI for which you
     * have permissions.
     * </p>
     * <p>
     * You can specify a number of options, or leave the default options. The
     * following rules apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * [EC2-VPC] If you don't specify a subnet ID, we choose a default subnet
     * from your default VPC for you. If you don't have a default VPC, you must
     * specify a subnet ID in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * [EC2-Classic] If don't specify an Availability Zone, we choose one for
     * you.
     * </p>
     * </li>
     * <li>
     * <p>
     * Some instance types must be launched into a VPC. If you do not have a
     * default VPC, or if you do not specify a subnet ID, the request fails. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-vpc.html#vpc-only-instance-types"
     * >Instance Types Available Only in a VPC</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * [EC2-VPC] All instances have a network interface with a primary private
     * IPv4 address. If you don't specify this address, we choose one from the
     * IPv4 range of your subnet.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not all instance types support IPv6 addresses. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify a security group ID, we use the default security
     * group. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Security Groups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the AMIs have a product code attached for which the user has
     * not subscribed, the request fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can create a <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html"
     * >launch template</a>, which is a resource that contains the parameters to
     * launch an instance. When you launch an instance using
     * <a>RunInstances</a>, you can specify the launch template instead of
     * specifying the launch parameters.
     * </p>
     * <p>
     * To ensure faster instance launches, break up large requests into smaller
     * batches. For example, create five separate launch requests for 100
     * instances each instead of one launch request for 500 instances.
     * </p>
     * <p>
     * An instance is ready for you to use when it's in the <code>running</code>
     * state. You can check the state of your instance using
     * <a>DescribeInstances</a>. You can tag instances and EBS volumes during
     * launch, after launch, or both. For more information, see
     * <a>CreateTags</a> and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging Your Amazon EC2 Resources</a>.
     * </p>
     * <p>
     * Linux instances have access to the public key of the key pair at boot.
     * You can use this key to provide secure access to the instance. Amazon EC2
     * public images use this feature to provide secure access without
     * passwords. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * For troubleshooting, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_InstanceStraightToTerminated.html"
     * >What To Do If An Instance Immediately Terminates</a>, and <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesConnecting.html"
     * >Troubleshooting Connecting to Your Instance</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param runInstancesRequest
     * @return runInstancesResult The response from the RunInstances service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Launches the specified Scheduled Instances.
     * </p>
     * <p>
     * Before you can launch a Scheduled Instance, you must purchase it and
     * obtain an identifier using <a>PurchaseScheduledInstances</a>.
     * </p>
     * <p>
     * You must launch a Scheduled Instance during its scheduled time period.
     * You can't stop or reboot a Scheduled Instance, but you can terminate it
     * as needed. If you terminate a Scheduled Instance before the current
     * scheduled time period ends, you can launch it again after a few minutes.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-scheduled-instances.html"
     * >Scheduled Instances</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param runScheduledInstancesRequest <p>
     *            Contains the parameters for RunScheduledInstances.
     *            </p>
     * @return runScheduledInstancesResult The response from the
     *         RunScheduledInstances service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RunScheduledInstancesResult runScheduledInstances(
            RunScheduledInstancesRequest runScheduledInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches for routes in the specified local gateway route table.
     * </p>
     * 
     * @param searchLocalGatewayRoutesRequest
     * @return searchLocalGatewayRoutesResult The response from the
     *         SearchLocalGatewayRoutes service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SearchLocalGatewayRoutesResult searchLocalGatewayRoutes(
            SearchLocalGatewayRoutesRequest searchLocalGatewayRoutesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches one or more transit gateway multicast groups and returns the
     * group membership information.
     * </p>
     * 
     * @param searchTransitGatewayMulticastGroupsRequest
     * @return searchTransitGatewayMulticastGroupsResult The response from the
     *         SearchTransitGatewayMulticastGroups service method, as returned
     *         by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SearchTransitGatewayMulticastGroupsResult searchTransitGatewayMulticastGroups(
            SearchTransitGatewayMulticastGroupsRequest searchTransitGatewayMulticastGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches for routes in the specified transit gateway route table.
     * </p>
     * 
     * @param searchTransitGatewayRoutesRequest
     * @return searchTransitGatewayRoutesResult The response from the
     *         SearchTransitGatewayRoutes service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SearchTransitGatewayRoutesResult searchTransitGatewayRoutes(
            SearchTransitGatewayRoutesRequest searchTransitGatewayRoutesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends a diagnostic interrupt to the specified Amazon EC2 instance to
     * trigger a <i>kernel panic</i> (on Linux instances), or a <i>blue
     * screen</i>/<i>stop error</i> (on Windows instances). For instances based
     * on Intel and AMD processors, the interrupt is received as a
     * <i>non-maskable interrupt</i> (NMI).
     * </p>
     * <p>
     * In general, the operating system crashes and reboots when a kernel panic
     * or stop error is triggered. The operating system can also be configured
     * to perform diagnostic tasks, such as generating a memory dump file,
     * loading a secondary kernel, or obtaining a call trace.
     * </p>
     * <p>
     * Before sending a diagnostic interrupt to your instance, ensure that its
     * operating system is configured to perform the required diagnostic tasks.
     * </p>
     * <p>
     * For more information about configuring your operating system to generate
     * a crash dump when a kernel panic or stop error occurs, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/diagnostic-interrupt.html"
     * >Send a Diagnostic Interrupt</a> (Linux instances) or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/diagnostic-interrupt.html"
     * >Send a Diagnostic Interrupt</a> (Windows instances).
     * </p>
     * 
     * @param sendDiagnosticInterruptRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void sendDiagnosticInterrupt(SendDiagnosticInterruptRequest sendDiagnosticInterruptRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an Amazon EBS-backed instance that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for instance usage.
     * However, your root partition Amazon EBS volume remains and continues to
     * persist your data, and you are charged for Amazon EBS volume usage. You
     * can restart your instance at any time. Every time you start your Windows
     * instance, Amazon EC2 charges you for a full instance hour. If you stop
     * and restart your Windows instance, a new instance hour begins and Amazon
     * EC2 charges you for another full instance hour even if you are still
     * within the same 60-minute period when it was stopped. Every time you
     * start your Linux instance, Amazon EC2 charges a one-minute minimum for
     * instance usage, and thereafter charges per second for instance usage.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it can
     * be restarted. Stopping an instance does not preserve data stored in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store as
     * its root device returns an error.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html"
     * >Stopping Instances</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param startInstancesRequest
     * @return startInstancesResult The response from the StartInstances service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates the verification process to prove that the service provider
     * owns the private DNS name domain for the endpoint service.
     * </p>
     * <p>
     * The service provider must successfully perform the verification before
     * the consumer can use the name to access the service.
     * </p>
     * <p>
     * Before the service provider runs this command, they must add a record to
     * the DNS server. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/ndpoint-services-dns-validation.html#add-dns-txt-record"
     * >Adding a TXT Record to Your Domain's DNS Server </a> in the <i>Amazon
     * VPC User Guide</i>.
     * </p>
     * 
     * @param startVpcEndpointServicePrivateDnsVerificationRequest
     * @return startVpcEndpointServicePrivateDnsVerificationResult The response
     *         from the StartVpcEndpointServicePrivateDnsVerification service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartVpcEndpointServicePrivateDnsVerificationResult startVpcEndpointServicePrivateDnsVerification(
            StartVpcEndpointServicePrivateDnsVerificationRequest startVpcEndpointServicePrivateDnsVerificationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops an Amazon EBS-backed instance.
     * </p>
     * <p>
     * You can use the Stop action to hibernate an instance if the instance is
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#enabling-hibernation"
     * >enabled for hibernation</a> and it meets the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
     * >hibernation prerequisites</a>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
     * >Hibernate Your Instance</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * We don't charge usage for a stopped instance, or data transfer fees;
     * however, your root partition Amazon EBS volume remains and continues to
     * persist your data, and you are charged for Amazon EBS volume usage. Every
     * time you start your Windows instance, Amazon EC2 charges you for a full
     * instance hour. If you stop and restart your Windows instance, a new
     * instance hour begins and Amazon EC2 charges you for another full instance
     * hour even if you are still within the same 60-minute period when it was
     * stopped. Every time you start your Linux instance, Amazon EC2 charges a
     * one-minute minimum for instance usage, and thereafter charges per second
     * for instance usage.
     * </p>
     * <p>
     * You can't stop or hibernate instance store-backed instances. You can't
     * use the Stop action to hibernate Spot Instances, but you can specify that
     * Amazon EC2 should hibernate Spot Instances when they are interrupted. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-interruptions.html#hibernate-spot-instances"
     * >Hibernating Interrupted Spot Instances</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * When you stop or hibernate an instance, we shut it down. You can restart
     * your instance at any time. Before stopping or hibernating an instance,
     * make sure it is in a state from which it can be restarted. Stopping an
     * instance does not preserve data stored in RAM, but hibernating an
     * instance does preserve data stored in RAM. If an instance cannot
     * hibernate successfully, a normal shutdown occurs.
     * </p>
     * <p>
     * Stopping and hibernating an instance is different to rebooting or
     * terminating it. For example, when you stop or hibernate an instance, the
     * root device and any other devices attached to the instance persist. When
     * you terminate an instance, the root device and any other devices attached
     * during the instance launch are automatically deleted. For more
     * information about the differences between rebooting, stopping,
     * hibernating, and terminating instances, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"
     * >Instance Lifecycle</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * When you stop an instance, we attempt to shut it down forcibly after a
     * short while. If your instance appears stuck in the stopping state after a
     * period of time, there may be an issue with the underlying host computer.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesStopping.html"
     * >Troubleshooting Stopping Your Instance</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param stopInstancesRequest
     * @return stopInstancesResult The response from the StopInstances service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Terminates active Client VPN endpoint connections. This action can be
     * used to terminate a specific client connection, or up to five connections
     * established by a specific user.
     * </p>
     * 
     * @param terminateClientVpnConnectionsRequest
     * @return terminateClientVpnConnectionsResult The response from the
     *         TerminateClientVpnConnections service method, as returned by
     *         Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TerminateClientVpnConnectionsResult terminateClientVpnConnections(
            TerminateClientVpnConnectionsRequest terminateClientVpnConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Shuts down the specified instances. This operation is idempotent; if you
     * terminate an instance more than once, each call succeeds.
     * </p>
     * <p>
     * If you specify multiple instances and the request fails (for example,
     * because of a single incorrect instance ID), none of the instances are
     * terminated.
     * </p>
     * <p>
     * Terminated instances remain visible after termination (for approximately
     * one hour).
     * </p>
     * <p>
     * By default, Amazon EC2 deletes all EBS volumes that were attached when
     * the instance launched. Volumes attached after instance launch continue
     * running.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the instance
     * persist. When you terminate an instance, any attached EBS volumes with
     * the <code>DeleteOnTermination</code> block device mapping parameter set
     * to <code>true</code> are automatically deleted. For more information
     * about the differences between stopping and terminating instances, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"
     * >Instance Lifecycle</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * For more information about troubleshooting, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesShuttingDown.html"
     * >Troubleshooting Terminating Your Instance</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param terminateInstancesRequest
     * @return terminateInstancesResult The response from the TerminateInstances
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Unassigns one or more IPv6 addresses from a network interface.
     * </p>
     * 
     * @param unassignIpv6AddressesRequest
     * @return unassignIpv6AddressesResult The response from the
     *         UnassignIpv6Addresses service method, as returned by Amazon
     *         Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UnassignIpv6AddressesResult unassignIpv6Addresses(
            UnassignIpv6AddressesRequest unassignIpv6AddressesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network
     * interface.
     * </p>
     * 
     * @param unassignPrivateIpAddressesRequest <p>
     *            Contains the parameters for UnassignPrivateIpAddresses.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void unassignPrivateIpAddresses(
            UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables detailed monitoring for a running instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"
     * >Monitoring Your Instances and Volumes</a> in the <i>Amazon Elastic
     * Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param unmonitorInstancesRequest
     * @return unmonitorInstancesResult The response from the UnmonitorInstances
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * [VPC only] Updates the description of an egress (outbound) security group
     * rule. You can replace an existing description, or add a description to a
     * rule that did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You
     * can remove a description for a security group rule by omitting the
     * description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsEgressRequest
     * @return updateSecurityGroupRuleDescriptionsEgressResult The response from
     *         the UpdateSecurityGroupRuleDescriptionsEgress service method, as
     *         returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateSecurityGroupRuleDescriptionsEgressResult updateSecurityGroupRuleDescriptionsEgress(
            UpdateSecurityGroupRuleDescriptionsEgressRequest updateSecurityGroupRuleDescriptionsEgressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the description of an ingress (inbound) security group rule. You
     * can replace an existing description, or add a description to a rule that
     * did not have one previously.
     * </p>
     * <p>
     * You specify the description as part of the IP permissions structure. You
     * can remove a description for a security group rule by omitting the
     * description parameter in the request.
     * </p>
     * 
     * @param updateSecurityGroupRuleDescriptionsIngressRequest
     * @return updateSecurityGroupRuleDescriptionsIngressResult The response
     *         from the UpdateSecurityGroupRuleDescriptionsIngress service
     *         method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateSecurityGroupRuleDescriptionsIngressResult updateSecurityGroupRuleDescriptionsIngress(
            UpdateSecurityGroupRuleDescriptionsIngressRequest updateSecurityGroupRuleDescriptionsIngressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops advertising an address range that is provisioned as an address
     * pool.
     * </p>
     * <p>
     * You can perform this operation at most once every 10 seconds, even if you
     * specify different address ranges each time.
     * </p>
     * <p>
     * It can take a few minutes before traffic to the specified addresses stops
     * routing to AWS because of BGP propagation delays.
     * </p>
     * 
     * @param withdrawByoipCidrRequest
     * @return withdrawByoipCidrResult The response from the WithdrawByoipCidr
     *         service method, as returned by Amazon Elastic Compute Cloud.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic Compute Cloud indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    WithdrawByoipCidrResult withdrawByoipCidr(WithdrawByoipCidrRequest withdrawByoipCidrRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
