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

package com.amazonaws.services.worklink;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.worklink.model.*;

/**
 * Interface for accessing Amazon WorkLink
 * <p>
 * Amazon WorkLink is a cloud-based service that provides secure access to
 * internal websites and web apps from iOS and Android phones. In a single step,
 * your users, such as employees, can access internal websites as efficiently as
 * they access any other public website. They enter a URL in their web browser,
 * or choose a link to an internal website in an email. Amazon WorkLink
 * authenticates the user's access and securely renders authorized internal web
 * content in a secure rendering service in the AWS cloud. Amazon WorkLink
 * doesn't download or store any internal web content on mobile devices.
 * </p>
 **/
public interface AmazonWorkLink {

    /**
     * Overrides the default endpoint for this client
     * ("https://worklink.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "worklink.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://worklink.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
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
     * @param endpoint The endpoint (ex: "worklink.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://worklink.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonWorkLink#setEndpoint(String)}, sets the
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
     * Specifies a domain to be associated to Amazon WorkLink.
     * </p>
     * 
     * @param associateDomainRequest
     * @return associateDomainResult The response from the AssociateDomain
     *         service method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateDomainResult associateDomain(AssociateDomainRequest associateDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a website authorization provider with a specified fleet. This
     * is used to authorize users against associated websites in the company
     * network.
     * </p>
     * 
     * @param associateWebsiteAuthorizationProviderRequest
     * @return associateWebsiteAuthorizationProviderResult The response from the
     *         AssociateWebsiteAuthorizationProvider service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateWebsiteAuthorizationProviderResult associateWebsiteAuthorizationProvider(
            AssociateWebsiteAuthorizationProviderRequest associateWebsiteAuthorizationProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports the root certificate of a certificate authority (CA) used to
     * obtain TLS certificates used by associated websites within the company
     * network.
     * </p>
     * 
     * @param associateWebsiteCertificateAuthorityRequest
     * @return associateWebsiteCertificateAuthorityResult The response from the
     *         AssociateWebsiteCertificateAuthority service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateWebsiteCertificateAuthorityResult associateWebsiteCertificateAuthority(
            AssociateWebsiteCertificateAuthorityRequest associateWebsiteCertificateAuthorityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a fleet. A fleet consists of resources and the configuration that
     * delivers associated websites to authorized users who download and set up
     * the Amazon WorkLink app.
     * </p>
     * 
     * @param createFleetRequest
     * @return createFleetResult The response from the CreateFleet service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a fleet. Prevents users from accessing previously associated
     * websites.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return deleteFleetResult The response from the DeleteFleet service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the configuration for delivering audit streams to the customer
     * account.
     * </p>
     * 
     * @param describeAuditStreamConfigurationRequest
     * @return describeAuditStreamConfigurationResult The response from the
     *         DescribeAuditStreamConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAuditStreamConfigurationResult describeAuditStreamConfiguration(
            DescribeAuditStreamConfigurationRequest describeAuditStreamConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the networking configuration to access the internal websites
     * associated with the specified fleet.
     * </p>
     * 
     * @param describeCompanyNetworkConfigurationRequest
     * @return describeCompanyNetworkConfigurationResult The response from the
     *         DescribeCompanyNetworkConfiguration service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCompanyNetworkConfigurationResult describeCompanyNetworkConfiguration(
            DescribeCompanyNetworkConfigurationRequest describeCompanyNetworkConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about a user's device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return describeDeviceResult The response from the DescribeDevice service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDeviceResult describeDevice(DescribeDeviceRequest describeDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the device policy configuration for the specified fleet.
     * </p>
     * 
     * @param describeDevicePolicyConfigurationRequest
     * @return describeDevicePolicyConfigurationResult The response from the
     *         DescribeDevicePolicyConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDevicePolicyConfigurationResult describeDevicePolicyConfiguration(
            DescribeDevicePolicyConfigurationRequest describeDevicePolicyConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return describeDomainResult The response from the DescribeDomain service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides basic information for the specified fleet, excluding identity
     * provider, networking, and device configuration details.
     * </p>
     * 
     * @param describeFleetMetadataRequest
     * @return describeFleetMetadataResult The response from the
     *         DescribeFleetMetadata service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeFleetMetadataResult describeFleetMetadata(
            DescribeFleetMetadataRequest describeFleetMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the identity provider configuration of the specified fleet.
     * </p>
     * 
     * @param describeIdentityProviderConfigurationRequest
     * @return describeIdentityProviderConfigurationResult The response from the
     *         DescribeIdentityProviderConfiguration service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeIdentityProviderConfigurationResult describeIdentityProviderConfiguration(
            DescribeIdentityProviderConfigurationRequest describeIdentityProviderConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about the certificate authority.
     * </p>
     * 
     * @param describeWebsiteCertificateAuthorityRequest
     * @return describeWebsiteCertificateAuthorityResult The response from the
     *         DescribeWebsiteCertificateAuthority service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeWebsiteCertificateAuthorityResult describeWebsiteCertificateAuthority(
            DescribeWebsiteCertificateAuthorityRequest describeWebsiteCertificateAuthorityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a domain from Amazon WorkLink. End users lose the ability
     * to access the domain with Amazon WorkLink.
     * </p>
     * 
     * @param disassociateDomainRequest
     * @return disassociateDomainResult The response from the DisassociateDomain
     *         service method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateDomainResult disassociateDomain(DisassociateDomainRequest disassociateDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a website authorization provider from a specified fleet.
     * After the disassociation, users can't load any associated websites that
     * require this authorization provider.
     * </p>
     * 
     * @param disassociateWebsiteAuthorizationProviderRequest
     * @return disassociateWebsiteAuthorizationProviderResult The response from
     *         the DisassociateWebsiteAuthorizationProvider service method, as
     *         returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateWebsiteAuthorizationProviderResult disassociateWebsiteAuthorizationProvider(
            DisassociateWebsiteAuthorizationProviderRequest disassociateWebsiteAuthorizationProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a certificate authority (CA).
     * </p>
     * 
     * @param disassociateWebsiteCertificateAuthorityRequest
     * @return disassociateWebsiteCertificateAuthorityResult The response from
     *         the DisassociateWebsiteCertificateAuthority service method, as
     *         returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateWebsiteCertificateAuthorityResult disassociateWebsiteCertificateAuthority(
            DisassociateWebsiteCertificateAuthorityRequest disassociateWebsiteCertificateAuthorityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of devices registered with the specified fleet.
     * </p>
     * 
     * @param listDevicesRequest
     * @return listDevicesResult The response from the ListDevices service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of domains associated to a specified fleet.
     * </p>
     * 
     * @param listDomainsRequest
     * @return listDomainsResult The response from the ListDomains service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of fleets for the current account and Region.
     * </p>
     * 
     * @param listFleetsRequest
     * @return listFleetsResult The response from the ListFleets service method,
     *         as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         WorkLink.
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of website authorization providers associated with a
     * specified fleet.
     * </p>
     * 
     * @param listWebsiteAuthorizationProvidersRequest
     * @return listWebsiteAuthorizationProvidersResult The response from the
     *         ListWebsiteAuthorizationProviders service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListWebsiteAuthorizationProvidersResult listWebsiteAuthorizationProviders(
            ListWebsiteAuthorizationProvidersRequest listWebsiteAuthorizationProvidersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of certificate authorities added for the current account
     * and Region.
     * </p>
     * 
     * @param listWebsiteCertificateAuthoritiesRequest
     * @return listWebsiteCertificateAuthoritiesResult The response from the
     *         ListWebsiteCertificateAuthorities service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListWebsiteCertificateAuthoritiesResult listWebsiteCertificateAuthorities(
            ListWebsiteCertificateAuthoritiesRequest listWebsiteCertificateAuthoritiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Moves a domain to ACTIVE status if it was in the INACTIVE status.
     * </p>
     * 
     * @param restoreDomainAccessRequest
     * @return restoreDomainAccessResult The response from the
     *         RestoreDomainAccess service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RestoreDomainAccessResult restoreDomainAccess(
            RestoreDomainAccessRequest restoreDomainAccessRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Moves a domain to INACTIVE status if it was in the ACTIVE status.
     * </p>
     * 
     * @param revokeDomainAccessRequest
     * @return revokeDomainAccessResult The response from the RevokeDomainAccess
     *         service method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RevokeDomainAccessResult revokeDomainAccess(RevokeDomainAccessRequest revokeDomainAccessRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Signs the user out from all of their devices. The user can sign in again
     * if they have valid credentials.
     * </p>
     * 
     * @param signOutUserRequest
     * @return signOutUserResult The response from the SignOutUser service
     *         method, as returned by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SignOutUserResult signOutUser(SignOutUserRequest signOutUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource, such as a
     * fleet. Each tag consists of a key and an optional value. If a resource
     * already has a tag with the same key, this operation updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon WorkLink.
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon WorkLink.
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the audit stream configuration for the fleet.
     * </p>
     * 
     * @param updateAuditStreamConfigurationRequest
     * @return updateAuditStreamConfigurationResult The response from the
     *         UpdateAuditStreamConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAuditStreamConfigurationResult updateAuditStreamConfiguration(
            UpdateAuditStreamConfigurationRequest updateAuditStreamConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the company network configuration for the fleet.
     * </p>
     * 
     * @param updateCompanyNetworkConfigurationRequest
     * @return updateCompanyNetworkConfigurationResult The response from the
     *         UpdateCompanyNetworkConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateCompanyNetworkConfigurationResult updateCompanyNetworkConfiguration(
            UpdateCompanyNetworkConfigurationRequest updateCompanyNetworkConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the device policy configuration for the fleet.
     * </p>
     * 
     * @param updateDevicePolicyConfigurationRequest
     * @return updateDevicePolicyConfigurationResult The response from the
     *         UpdateDevicePolicyConfiguration service method, as returned by
     *         Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDevicePolicyConfigurationResult updateDevicePolicyConfiguration(
            UpdateDevicePolicyConfigurationRequest updateDevicePolicyConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates domain metadata, such as DisplayName.
     * </p>
     * 
     * @param updateDomainMetadataRequest
     * @return updateDomainMetadataResult The response from the
     *         UpdateDomainMetadata service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDomainMetadataResult updateDomainMetadata(
            UpdateDomainMetadataRequest updateDomainMetadataRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates fleet metadata, such as DisplayName.
     * </p>
     * 
     * @param updateFleetMetadataRequest
     * @return updateFleetMetadataResult The response from the
     *         UpdateFleetMetadata service method, as returned by Amazon
     *         WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateFleetMetadataResult updateFleetMetadata(
            UpdateFleetMetadataRequest updateFleetMetadataRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the identity provider configuration for the fleet.
     * </p>
     * 
     * @param updateIdentityProviderConfigurationRequest
     * @return updateIdentityProviderConfigurationResult The response from the
     *         UpdateIdentityProviderConfiguration service method, as returned
     *         by Amazon WorkLink.
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             WorkLink indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateIdentityProviderConfigurationResult updateIdentityProviderConfiguration(
            UpdateIdentityProviderConfigurationRequest updateIdentityProviderConfigurationRequest)
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
