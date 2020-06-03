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

package com.amazonaws.services.directconnect;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.directconnect.model.*;

/**
 * Interface for accessing AWS Direct Connect
 * <p>
 * AWS Direct Connect links your internal network to an AWS Direct Connect
 * location over a standard Ethernet fiber-optic cable. One end of the cable is
 * connected to your router, the other to an AWS Direct Connect router. With
 * this connection in place, you can create virtual interfaces directly to the
 * AWS cloud (for example, to Amazon EC2 and Amazon S3) and to Amazon VPC,
 * bypassing Internet service providers in your network path. A connection
 * provides access to all AWS Regions except the China (Beijing) and (China)
 * Ningxia Regions. AWS resources in the China Regions can only be accessed
 * through locations associated with those Regions.
 * </p>
 **/
public interface AWSDirectConnect {

    /**
     * Overrides the default endpoint for this client
     * ("https://directconnect.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "directconnect.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://directconnect.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     * @param endpoint The endpoint (ex:
     *            "directconnect.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://directconnect.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSDirectConnect#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
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
     * Accepts a proposal request to attach a virtual private gateway or transit
     * gateway to a Direct Connect gateway.
     * </p>
     * 
     * @param acceptDirectConnectGatewayAssociationProposalRequest
     * @return acceptDirectConnectGatewayAssociationProposalResult The response
     *         from the AcceptDirectConnectGatewayAssociationProposal service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AcceptDirectConnectGatewayAssociationProposalResult acceptDirectConnectGatewayAssociationProposal(
            AcceptDirectConnectGatewayAssociationProposalRequest acceptDirectConnectGatewayAssociationProposalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deprecated. Use <a>AllocateHostedConnection</a> instead.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a
     * hosted connection on the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     * @return allocateConnectionOnInterconnectResult The response from the
     *         AllocateConnectionOnInterconnect service method, as returned by
     *         AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    @Deprecated
    AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a hosted connection on the specified interconnect or a link
     * aggregation group (LAG) of interconnects.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of capacity (bandwidth)
     * for use by a hosted connection on the specified interconnect or LAG of
     * interconnects. AWS polices the hosted connection for the specified
     * capacity and the AWS Direct Connect Partner must also police the hosted
     * connection for the specified capacity.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     * @return allocateHostedConnectionResult The response from the
     *         AllocateHostedConnection service method, as returned by AWS
     *         Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AllocateHostedConnectionResult allocateHostedConnection(
            AllocateHostedConnectionRequest allocateHostedConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provisions a private virtual interface to be owned by the specified AWS
     * account.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the
     * owner using <a>ConfirmPrivateVirtualInterface</a>. Until then, the
     * virtual interface is in the <code>Confirming</code> state and is not
     * available to handle traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     * @return allocatePrivateVirtualInterfaceResult The response from the
     *         AllocatePrivateVirtualInterface service method, as returned by
     *         AWS Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(
            AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provisions a public virtual interface to be owned by the specified AWS
     * account.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public
     * virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the
     * owner using <a>ConfirmPublicVirtualInterface</a>. Until this step has
     * been completed, the virtual interface is in the <code>confirming</code>
     * state and is not available to handle traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface, omit the Amazon address
     * and customer address. IPv6 addresses are automatically assigned from the
     * Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     * @return allocatePublicVirtualInterfaceResult The response from the
     *         AllocatePublicVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(
            AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provisions a transit virtual interface to be owned by the specified AWS
     * account. Use this type of interface to connect a transit gateway to your
     * Direct Connect gateway.
     * </p>
     * <p>
     * The owner of a connection provisions a transit virtual interface to be
     * owned by the specified AWS account.
     * </p>
     * <p>
     * After you create a transit virtual interface, it must be confirmed by the
     * owner using <a>ConfirmTransitVirtualInterface</a>. Until this step has
     * been completed, the transit virtual interface is in the
     * <code>requested</code> state and is not available to handle traffic.
     * </p>
     * 
     * @param allocateTransitVirtualInterfaceRequest
     * @return allocateTransitVirtualInterfaceResult The response from the
     *         AllocateTransitVirtualInterface service method, as returned by
     *         AWS Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AllocateTransitVirtualInterfaceResult allocateTransitVirtualInterface(
            AllocateTransitVirtualInterfaceRequest allocateTransitVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates an existing connection with a link aggregation group (LAG).
     * The connection is interrupted and re-established as a member of the LAG
     * (connectivity to AWS is interrupted). The connection must be hosted on
     * the same AWS Direct Connect endpoint as the LAG, and its bandwidth must
     * match the bandwidth for the LAG. You can re-associate a connection that's
     * currently associated with a different LAG; however, if removing the
     * connection would cause the original LAG to fall below its setting for
     * minimum number of operational connections, the request fails.
     * </p>
     * <p>
     * Any virtual interfaces that are directly associated with the connection
     * are automatically re-associated with the LAG. If the connection was
     * originally associated with a different LAG, the virtual interfaces remain
     * associated with the original LAG.
     * </p>
     * <p>
     * For interconnects, any hosted connections are automatically re-associated
     * with the LAG. If the interconnect was originally associated with a
     * different LAG, the hosted connections remain associated with the original
     * LAG.
     * </p>
     * 
     * @param associateConnectionWithLagRequest
     * @return associateConnectionWithLagResult The response from the
     *         AssociateConnectionWithLag service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateConnectionWithLagResult associateConnectionWithLag(
            AssociateConnectionWithLagRequest associateConnectionWithLagRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a hosted connection and its virtual interfaces with a link
     * aggregation group (LAG) or interconnect. If the target interconnect or
     * LAG has an existing hosted connection with a conflicting VLAN number or
     * IP address, the operation fails. This action temporarily interrupts the
     * hosted connection's connectivity to AWS as it is being migrated.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     * @return associateHostedConnectionResult The response from the
     *         AssociateHostedConnection service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateHostedConnectionResult associateHostedConnection(
            AssociateHostedConnectionRequest associateHostedConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a virtual interface with a specified link aggregation group
     * (LAG) or connection. Connectivity to AWS is temporarily interrupted as
     * the virtual interface is being migrated. If the target connection or LAG
     * has an associated virtual interface with a conflicting VLAN number or a
     * conflicting IP address, the operation fails.
     * </p>
     * <p>
     * Virtual interfaces associated with a hosted connection cannot be
     * associated with a LAG; hosted connections must be migrated along with
     * their virtual interfaces using <a>AssociateHostedConnection</a>.
     * </p>
     * <p>
     * To reassociate a virtual interface to a new connection or LAG, the
     * requester must own either the virtual interface itself or the connection
     * to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG for the association.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     * @return associateVirtualInterfaceResult The response from the
     *         AssociateVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateVirtualInterfaceResult associateVirtualInterface(
            AssociateVirtualInterfaceRequest associateVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Confirms the creation of the specified hosted connection on an
     * interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the
     * <code>Ordering</code> state, and remains in this state until the owner
     * confirms creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     * @return confirmConnectionResult The response from the ConfirmConnection
     *         service method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest confirmConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Accepts ownership of a private virtual interface created by another AWS
     * account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the virtual interface
     * is created and attached to the specified virtual private gateway or
     * Direct Connect gateway, and is made available to handle traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     * @return confirmPrivateVirtualInterfaceResult The response from the
     *         ConfirmPrivateVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(
            ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Accepts ownership of a public virtual interface created by another AWS
     * account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the specified virtual
     * interface is created and made available to handle traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     * @return confirmPublicVirtualInterfaceResult The response from the
     *         ConfirmPublicVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(
            ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Accepts ownership of a transit virtual interface created by another AWS
     * account.
     * </p>
     * <p>
     * After the owner of the transit virtual interface makes this call, the
     * specified transit virtual interface is created and made available to
     * handle traffic.
     * </p>
     * 
     * @param confirmTransitVirtualInterfaceRequest
     * @return confirmTransitVirtualInterfaceResult The response from the
     *         ConfirmTransitVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ConfirmTransitVirtualInterfaceResult confirmTransitVirtualInterface(
            ConfirmTransitVirtualInterfaceRequest confirmTransitVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a BGP peer on the specified virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family
     * (IPv4/IPv6) in order to access AWS resources that also use that address
     * family.
     * </p>
     * <p>
     * If logical redundancy is not supported by the connection, interconnect,
     * or LAG, the BGP peer cannot be in the same address family as an existing
     * BGP peer on the virtual interface.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, omit the Amazon address and customer
     * address. IPv6 addresses are automatically assigned from the Amazon pool
     * of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must
     * be private or already whitelisted for the virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     * @return createBGPPeerResult The response from the CreateBGPPeer service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateBGPPeerResult createBGPPeer(CreateBGPPeerRequest createBGPPeerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a connection between a customer network and a specific AWS Direct
     * Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect
     * location over a standard Ethernet fiber-optic cable. One end of the cable
     * is connected to your router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * To find the locations for your Region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group
     * (LAG) by specifying a LAG ID in the request. This ensures that the new
     * connection is allocated on the same AWS Direct Connect endpoint that
     * hosts the specified LAG. If there are no available ports on the endpoint,
     * the request fails and no connection is created.
     * </p>
     * 
     * @param createConnectionRequest
     * @return createConnectionResult The response from the CreateConnection
     *         service method, as returned by AWS Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Direct Connect gateway, which is an intermediate object that
     * enables you to connect a set of virtual interfaces and virtual private
     * gateways. A Direct Connect gateway is global and visible in any AWS
     * Region after it is created. The virtual interfaces and virtual private
     * gateways that are connected through a Direct Connect gateway can be in
     * different AWS Regions. This enables you to connect to a VPC in any
     * Region, regardless of the Region in which the virtual interfaces are
     * located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     * @return createDirectConnectGatewayResult The response from the
     *         CreateDirectConnectGateway service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateDirectConnectGatewayResult createDirectConnectGateway(
            CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an association between a Direct Connect gateway and a virtual
     * private gateway. The virtual private gateway must be attached to a VPC
     * and must not be associated with another Direct Connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     * @return createDirectConnectGatewayAssociationResult The response from the
     *         CreateDirectConnectGatewayAssociation service method, as returned
     *         by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateDirectConnectGatewayAssociationResult createDirectConnectGatewayAssociation(
            CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a proposal to associate the specified virtual private gateway or
     * transit gateway with the specified Direct Connect gateway.
     * </p>
     * <p>
     * You can only associate a Direct Connect gateway and virtual private
     * gateway or transit gateway when the account that owns the Direct Connect
     * gateway and the account that owns the virtual private gateway or transit
     * gateway have the same AWS Payer ID.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationProposalRequest
     * @return createDirectConnectGatewayAssociationProposalResult The response
     *         from the CreateDirectConnectGatewayAssociationProposal service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateDirectConnectGatewayAssociationProposalResult createDirectConnectGatewayAssociationProposal(
            CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an interconnect between an AWS Direct Connect Partner's network
     * and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * An interconnect is a connection that is capable of hosting other
     * connections. The AWS Direct Connect partner can use an interconnect to
     * provide AWS Direct Connect hosted connections to customers through their
     * own network services. Like a standard connection, an interconnect links
     * the partner's network to an AWS Direct Connect location over a standard
     * Ethernet fiber-optic cable. One end is connected to the partner's router,
     * the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation
     * group (LAG) by specifying a LAG ID in the request. This ensures that the
     * new interconnect is allocated on the same AWS Direct Connect endpoint
     * that hosts the specified LAG. If there are no available ports on the
     * endpoint, the request fails and no interconnect is created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect Partner provisions a
     * connection on their interconnect by calling
     * <a>AllocateHostedConnection</a>. The end customer can then connect to AWS
     * resources by creating a virtual interface on their connection, using the
     * VLAN assigned to them by the AWS Direct Connect Partner.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     * @return createInterconnectResult The response from the CreateInterconnect
     *         service method, as returned by AWS Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateInterconnectResult createInterconnect(CreateInterconnectRequest createInterconnectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a link aggregation group (LAG) with the specified number of
     * bundled physical connections between the customer network and a specific
     * AWS Direct Connect location. A LAG is a logical interface that uses the
     * Link Aggregation Control Protocol (LACP) to aggregate multiple
     * interfaces, enabling you to treat them as a single interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth and must terminate
     * at the same AWS Direct Connect endpoint.
     * </p>
     * <p>
     * You can have up to 10 connections per LAG. Regardless of this limit, if
     * you request more connections for the LAG than AWS Direct Connect can
     * allocate on a single endpoint, no LAG is created.
     * </p>
     * <p>
     * You can specify an existing physical connection or interconnect to
     * include in the LAG (which counts towards the total number of
     * connections). Doing so interrupts the current physical connection or
     * hosted connections, and re-establishes them as a member of the LAG. The
     * LAG will be created on the same AWS Direct Connect endpoint to which the
     * connection terminates. Any virtual interfaces associated with the
     * connection are automatically disassociated and re-associated with the
     * LAG. The connection ID does not change.
     * </p>
     * <p>
     * If the AWS account used to create a LAG is a registered AWS Direct
     * Connect Partner, the LAG is automatically enabled to host
     * sub-connections. For a LAG owned by a partner, any associated virtual
     * interfaces cannot be directly configured.
     * </p>
     * 
     * @param createLagRequest
     * @return createLagResult The response from the CreateLag service method,
     *         as returned by AWS Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateLagResult createLag(CreateLagRequest createLagRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a private virtual interface. A virtual interface is the VLAN that
     * transports AWS Direct Connect traffic. A private virtual interface can be
     * connected to either a Direct Connect gateway or a Virtual Private Gateway
     * (VGW). Connecting the private virtual interface to a Direct Connect
     * gateway enables the possibility for connecting to multiple VPCs,
     * including VPCs in different AWS Regions. Connecting the private virtual
     * interface to a VGW only provides access to a single VPC within the same
     * Region.
     * </p>
     * <p>
     * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause
     * an update to the underlying physical connection if it wasn't updated to
     * support jumbo frames. Updating the connection disrupts network
     * connectivity for all virtual interfaces associated with the connection
     * for up to 30 seconds. To check whether your connection supports jumbo
     * frames, call <a>DescribeConnections</a>. To check whether your virtual
     * interface supports jumbo frames, call <a>DescribeVirtualInterfaces</a>.
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     * @return createPrivateVirtualInterfaceResult The response from the
     *         CreatePrivateVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(
            CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a public virtual interface. A virtual interface is the VLAN that
     * transports AWS Direct Connect traffic. A public virtual interface
     * supports sending traffic to public services of AWS such as Amazon S3.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (
     * <code>addressFamily</code> is <code>ipv6</code>), leave the
     * <code>customer</code> and <code>amazon</code> address fields blank to use
     * auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     * @return createPublicVirtualInterfaceResult The response from the
     *         CreatePublicVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreatePublicVirtualInterfaceResult createPublicVirtualInterface(
            CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a transit virtual interface. A transit virtual interface should
     * be used to access one or more transit gateways associated with Direct
     * Connect gateways. A transit virtual interface enables the connection of
     * multiple VPCs attached to a transit gateway to a Direct Connect gateway.
     * </p>
     * <important>
     * <p>
     * If you associate your transit gateway with one or more Direct Connect
     * gateways, the Autonomous System Number (ASN) used by the transit gateway
     * and the Direct Connect gateway must be different. For example, if you use
     * the default ASN 64512 for both your the transit gateway and Direct
     * Connect gateway, the association request fails.
     * </p>
     * </important>
     * <p>
     * Setting the MTU of a virtual interface to 8500 (jumbo frames) can cause
     * an update to the underlying physical connection if it wasn't updated to
     * support jumbo frames. Updating the connection disrupts network
     * connectivity for all virtual interfaces associated with the connection
     * for up to 30 seconds. To check whether your connection supports jumbo
     * frames, call <a>DescribeConnections</a>. To check whether your virtual
     * interface supports jumbo frames, call <a>DescribeVirtualInterfaces</a>.
     * </p>
     * 
     * @param createTransitVirtualInterfaceRequest
     * @return createTransitVirtualInterfaceResult The response from the
     *         CreateTransitVirtualInterface service method, as returned by AWS
     *         Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateTransitVirtualInterfaceResult createTransitVirtualInterface(
            CreateTransitVirtualInterfaceRequest createTransitVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified BGP peer on the specified virtual interface with
     * the specified customer address and ASN.
     * </p>
     * <p>
     * You cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     * @return deleteBGPPeerResult The response from the DeleteBGPPeer service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteBGPPeerResult deleteBGPPeer(DeleteBGPPeerRequest deleteBGPPeerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and
     * data transfer charges. If you are partnering with any third parties to
     * connect with the AWS Direct Connect location, you must cancel your
     * service with them separately.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return deleteConnectionResult The response from the DeleteConnection
     *         service method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Direct Connect gateway. You must first delete all
     * virtual interfaces that are attached to the Direct Connect gateway and
     * disassociate all virtual private gateways associated with the Direct
     * Connect gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     * @return deleteDirectConnectGatewayResult The response from the
     *         DeleteDirectConnectGateway service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteDirectConnectGatewayResult deleteDirectConnectGateway(
            DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the association between the specified Direct Connect gateway and
     * virtual private gateway.
     * </p>
     * <p>
     * We recommend that you specify the <code>associationID</code> to delete
     * the association. Alternatively, if you own virtual gateway and a Direct
     * Connect gateway association, you can specify the
     * <code>virtualGatewayId</code> and <code>directConnectGatewayId</code> to
     * delete an association.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     * @return deleteDirectConnectGatewayAssociationResult The response from the
     *         DeleteDirectConnectGatewayAssociation service method, as returned
     *         by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteDirectConnectGatewayAssociationResult deleteDirectConnectGatewayAssociation(
            DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the association proposal request between the specified Direct
     * Connect gateway and virtual private gateway or transit gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationProposalRequest
     * @return deleteDirectConnectGatewayAssociationProposalResult The response
     *         from the DeleteDirectConnectGatewayAssociationProposal service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteDirectConnectGatewayAssociationProposalResult deleteDirectConnectGatewayAssociationProposal(
            DeleteDirectConnectGatewayAssociationProposalRequest deleteDirectConnectGatewayAssociationProposalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     * @return deleteInterconnectResult The response from the DeleteInterconnect
     *         service method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest deleteInterconnectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified link aggregation group (LAG). You cannot delete a
     * LAG if it has active virtual interfaces or hosted connections.
     * </p>
     * 
     * @param deleteLagRequest
     * @return deleteLagResult The response from the DeleteLag service method,
     *         as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteLagResult deleteLag(DeleteLagRequest deleteLagRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     * @return deleteVirtualInterfaceResult The response from the
     *         DeleteVirtualInterface service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteVirtualInterfaceResult deleteVirtualInterface(
            DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for a connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is
     * a document that your APN partner or service provider uses when
     * establishing your cross connect to AWS at the colocation facility. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html"
     * >Requesting Cross Connects at AWS Direct Connect Locations</a> in the
     * <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     * @return describeConnectionLoaResult The response from the
     *         DescribeConnectionLoa service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    @Deprecated
    DescribeConnectionLoaResult describeConnectionLoa(
            DescribeConnectionLoaRequest describeConnectionLoaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Displays the specified connection or all connections in this Region.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @return describeConnectionsResult The response from the
     *         DescribeConnections service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeConnectionsResult describeConnections(
            DescribeConnectionsRequest describeConnectionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deprecated. Use <a>DescribeHostedConnections</a> instead.
     * </p>
     * <p>
     * Lists the connections that have been provisioned on the specified
     * interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     * @return describeConnectionsOnInterconnectResult The response from the
     *         DescribeConnectionsOnInterconnect service method, as returned by
     *         AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    @Deprecated
    DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes one or more association proposals for connection between a
     * virtual private gateway or transit gateway and a Direct Connect gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationProposalsRequest
     * @return describeDirectConnectGatewayAssociationProposalsResult The
     *         response from the
     *         DescribeDirectConnectGatewayAssociationProposals service method,
     *         as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeDirectConnectGatewayAssociationProposalsResult describeDirectConnectGatewayAssociationProposals(
            DescribeDirectConnectGatewayAssociationProposalsRequest describeDirectConnectGatewayAssociationProposalsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the associations between your Direct Connect gateways and virtual
     * private gateways. You must specify a Direct Connect gateway, a virtual
     * private gateway, or both. If you specify a Direct Connect gateway, the
     * response contains all virtual private gateways associated with the Direct
     * Connect gateway. If you specify a virtual private gateway, the response
     * contains all Direct Connect gateways associated with the virtual private
     * gateway. If you specify both, the response contains the association
     * between the Direct Connect gateway and the virtual private gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     * @return describeDirectConnectGatewayAssociationsResult The response from
     *         the DescribeDirectConnectGatewayAssociations service method, as
     *         returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeDirectConnectGatewayAssociationsResult describeDirectConnectGatewayAssociations(
            DescribeDirectConnectGatewayAssociationsRequest describeDirectConnectGatewayAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the attachments between your Direct Connect gateways and virtual
     * interfaces. You must specify a Direct Connect gateway, a virtual
     * interface, or both. If you specify a Direct Connect gateway, the response
     * contains all virtual interfaces attached to the Direct Connect gateway.
     * If you specify a virtual interface, the response contains all Direct
     * Connect gateways attached to the virtual interface. If you specify both,
     * the response contains the attachment between the Direct Connect gateway
     * and the virtual interface.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     * @return describeDirectConnectGatewayAttachmentsResult The response from
     *         the DescribeDirectConnectGatewayAttachments service method, as
     *         returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeDirectConnectGatewayAttachmentsResult describeDirectConnectGatewayAttachments(
            DescribeDirectConnectGatewayAttachmentsRequest describeDirectConnectGatewayAttachmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all your Direct Connect gateways or only the specified Direct
     * Connect gateway. Deleted Direct Connect gateways are not returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     * @return describeDirectConnectGatewaysResult The response from the
     *         DescribeDirectConnectGateways service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeDirectConnectGatewaysResult describeDirectConnectGateways(
            DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the hosted connections that have been provisioned on the specified
     * interconnect or link aggregation group (LAG).
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     * @return describeHostedConnectionsResult The response from the
     *         DescribeHostedConnections service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeHostedConnectionsResult describeHostedConnections(
            DescribeHostedConnectionsRequest describeHostedConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for the specified interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is
     * a document that is used when establishing your cross connect to AWS at
     * the colocation facility. For more information, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html"
     * >Requesting Cross Connects at AWS Direct Connect Locations</a> in the
     * <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     * @return describeInterconnectLoaResult The response from the
     *         DescribeInterconnectLoa service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    @Deprecated
    DescribeInterconnectLoaResult describeInterconnectLoa(
            DescribeInterconnectLoaRequest describeInterconnectLoaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the interconnects owned by the AWS account or only the specified
     * interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     * @return describeInterconnectsResult The response from the
     *         DescribeInterconnects service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeInterconnectsResult describeInterconnects(
            DescribeInterconnectsRequest describeInterconnectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     * </p>
     * 
     * @param describeLagsRequest
     * @return describeLagsResult The response from the DescribeLags service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeLagsResult describeLags(DescribeLagsRequest describeLagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation
     * group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is
     * a document that is used when establishing your cross connect to AWS at
     * the colocation facility. For more information, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html"
     * >Requesting Cross Connects at AWS Direct Connect Locations</a> in the
     * <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeLoaRequest
     * @return describeLoaResult The response from the DescribeLoa service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeLoaResult describeLoa(DescribeLoaRequest describeLoaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the AWS Direct Connect locations in the current AWS Region. These
     * are the locations that can be selected when calling
     * <a>CreateConnection</a> or <a>CreateInterconnect</a>.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return describeLocationsResult The response from the DescribeLocations
     *         service method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeLocationsResult describeLocations(DescribeLocationsRequest describeLocationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the tags associated with the specified AWS Direct Connect
     * resources.
     * </p>
     * 
     * @param describeTagsRequest
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces
     * linked to a virtual private gateway.
     * </p>
     * 
     * @param describeVirtualGatewaysRequest
     * @return describeVirtualGatewaysResult The response from the
     *         DescribeVirtualGateways service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeVirtualGatewaysResult describeVirtualGateways(
            DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces
     * deleted fewer than 15 minutes before you make the request are also
     * returned. If you specify a connection ID, only the virtual interfaces
     * associated with the connection are returned. If you specify a virtual
     * interface ID, then only a single virtual interface is returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct
     * Connect location and the customer network.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     * @return describeVirtualInterfacesResult The response from the
     *         DescribeVirtualInterfaces service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeVirtualInterfacesResult describeVirtualInterfaces(
            DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a connection from a link aggregation group (LAG). The
     * connection is interrupted and re-established as a standalone connection
     * (the connection is not deleted; to delete the connection, use the
     * <a>DeleteConnection</a> request). If the LAG has associated virtual
     * interfaces or hosted connections, they remain associated with the LAG. A
     * disassociated connection owned by an AWS Direct Connect Partner is
     * automatically converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection would cause the LAG to fall below its
     * setting for minimum number of operational connections, the request fails,
     * except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no
     * physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     * @return disassociateConnectionFromLagResult The response from the
     *         DisassociateConnectionFromLag service method, as returned by AWS
     *         Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateConnectionFromLagResult disassociateConnectionFromLag(
            DisassociateConnectionFromLagRequest disassociateConnectionFromLagRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the virtual interface failover test history.
     * </p>
     * 
     * @param listVirtualInterfaceTestHistoryRequest
     * @return listVirtualInterfaceTestHistoryResult The response from the
     *         ListVirtualInterfaceTestHistory service method, as returned by
     *         AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListVirtualInterfaceTestHistoryResult listVirtualInterfaceTestHistory(
            ListVirtualInterfaceTestHistoryRequest listVirtualInterfaceTestHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts the virtual interface failover test that verifies your
     * configuration meets your resiliency requirements by placing the BGP
     * peering session in the DOWN state. You can then send traffic to verify
     * that there are no outages.
     * </p>
     * <p>
     * You can run the test on public, private, transit, and hosted virtual
     * interfaces.
     * </p>
     * <p>
     * You can use <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/APIReference/API_ListVirtualInterfaceTestHistory.html"
     * >ListVirtualInterfaceTestHistory</a> to view the virtual interface test
     * history.
     * </p>
     * <p>
     * If you need to stop the test before the test interval completes, use <a
     * href=
     * "https://docs.aws.amazon.com/directconnect/latest/APIReference/API_StopBgpFailoverTest.html"
     * >StopBgpFailoverTest</a>.
     * </p>
     * 
     * @param startBgpFailoverTestRequest
     * @return startBgpFailoverTestResult The response from the
     *         StartBgpFailoverTest service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    StartBgpFailoverTestResult startBgpFailoverTest(
            StartBgpFailoverTestRequest startBgpFailoverTestRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops the virtual interface failover test.
     * </p>
     * 
     * @param stopBgpFailoverTestRequest
     * @return stopBgpFailoverTestResult The response from the
     *         StopBgpFailoverTest service method, as returned by AWS Direct
     *         Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    StopBgpFailoverTestResult stopBgpFailoverTest(
            StopBgpFailoverTestRequest stopBgpFailoverTestRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds the specified tags to the specified AWS Direct Connect resource.
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same
     * key is already associated with the resource, this action updates its
     * value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Direct Connect.
     * @throws DuplicateTagKeysException
     * @throws TooManyTagsException
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from the specified AWS Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified attributes of the Direct Connect gateway
     * association.
     * </p>
     * <p>
     * Add or remove prefixes from the association.
     * </p>
     * 
     * @param updateDirectConnectGatewayAssociationRequest
     * @return updateDirectConnectGatewayAssociationResult The response from the
     *         UpdateDirectConnectGatewayAssociation service method, as returned
     *         by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDirectConnectGatewayAssociationResult updateDirectConnectGatewayAssociation(
            UpdateDirectConnectGatewayAssociationRequest updateDirectConnectGatewayAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the attributes of the specified link aggregation group (LAG).
     * </p>
     * <p>
     * You can update the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value for the minimum number of connections that must be operational
     * for the LAG itself to be operational.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a LAG, the default value for the minimum number of
     * operational connections is zero (0). If you update this value and the
     * number of operational connections falls below the specified value, the
     * LAG automatically goes down to avoid over-utilization of the remaining
     * connections. Adjust this value with care, as it could force the LAG down
     * if it is set higher than the current number of operational connections.
     * </p>
     * 
     * @param updateLagRequest
     * @return updateLagResult The response from the UpdateLag service method,
     *         as returned by AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateLagResult updateLag(UpdateLagRequest updateLagRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the specified attributes of the specified virtual private
     * interface.
     * </p>
     * <p>
     * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause
     * an update to the underlying physical connection if it wasn't updated to
     * support jumbo frames. Updating the connection disrupts network
     * connectivity for all virtual interfaces associated with the connection
     * for up to 30 seconds. To check whether your connection supports jumbo
     * frames, call <a>DescribeConnections</a>. To check whether your virtual q
     * interface supports jumbo frames, call <a>DescribeVirtualInterfaces</a>.
     * </p>
     * 
     * @param updateVirtualInterfaceAttributesRequest
     * @return updateVirtualInterfaceAttributesResult The response from the
     *         UpdateVirtualInterfaceAttributes service method, as returned by
     *         AWS Direct Connect.
     * @throws DirectConnectServerException
     * @throws DirectConnectClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Direct Connect indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateVirtualInterfaceAttributesResult updateVirtualInterfaceAttributes(
            UpdateVirtualInterfaceAttributesRequest updateVirtualInterfaceAttributesRequest)
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
