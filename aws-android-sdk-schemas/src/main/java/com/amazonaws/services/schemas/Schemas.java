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

package com.amazonaws.services.schemas;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.schemas.model.*;

/**
 * Interface for accessing Schemas
 * <p>
 * Amazon EventBridge Schema Registry
 * </p>
 **/
public interface Schemas {

    /**
     * Overrides the default endpoint for this client
     * ("https://schemas.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "schemas.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://schemas.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "schemas.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://schemas.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link Schemas#setEndpoint(String)}, sets the regional
     * endpoint for this client's service calls. Callers can use this method to
     * control which AWS region they want to work with.
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
     * Creates a discoverer.
     * </p>
     * 
     * @param createDiscovererRequest
     * @return createDiscovererResult The response from the CreateDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDiscovererResult createDiscoverer(CreateDiscovererRequest createDiscovererRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a registry.
     * </p>
     * 
     * @param createRegistryRequest
     * @return createRegistryResult The response from the CreateRegistry service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRegistryResult createRegistry(CreateRegistryRequest createRegistryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a schema definition.
     * </p>
     * <note>
     * <p>
     * Inactive schemas will be deleted after two years.
     * </p>
     * </note>
     * 
     * @param createSchemaRequest
     * @return createSchemaResult The response from the CreateSchema service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a discoverer.
     * </p>
     * 
     * @param deleteDiscovererRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDiscoverer(DeleteDiscovererRequest deleteDiscovererRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Registry.
     * </p>
     * 
     * @param deleteRegistryRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteRegistry(DeleteRegistryRequest deleteRegistryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Delete the resource-based policy attached to the specified registry.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete a schema definition.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteSchema(DeleteSchemaRequest deleteSchemaRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Delete the schema version definition
     * </p>
     * 
     * @param deleteSchemaVersionRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteSchemaVersion(DeleteSchemaVersionRequest deleteSchemaVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describe the code binding URI.
     * </p>
     * 
     * @param describeCodeBindingRequest
     * @return describeCodeBindingResult The response from the
     *         DescribeCodeBinding service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws TooManyRequestsException <p>
     *             429 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCodeBindingResult describeCodeBinding(
            DescribeCodeBindingRequest describeCodeBindingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the discoverer.
     * </p>
     * 
     * @param describeDiscovererRequest
     * @return describeDiscovererResult The response from the DescribeDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDiscovererResult describeDiscoverer(DescribeDiscovererRequest describeDiscovererRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the registry.
     * </p>
     * 
     * @param describeRegistryRequest
     * @return describeRegistryResult The response from the DescribeRegistry
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRegistryResult describeRegistry(DescribeRegistryRequest describeRegistryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve the schema definition.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return describeSchemaResult The response from the DescribeSchema service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeSchemaResult describeSchema(DescribeSchemaRequest describeSchemaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Get the code binding source URI.
     * </p>
     * 
     * @param getCodeBindingSourceRequest
     * @return getCodeBindingSourceResult The response from the
     *         GetCodeBindingSource service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws TooManyRequestsException <p>
     *             429 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCodeBindingSourceResult getCodeBindingSource(
            GetCodeBindingSourceRequest getCodeBindingSourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Get the discovered schema that was generated based on sampled events.
     * </p>
     * 
     * @param getDiscoveredSchemaRequest
     * @return getDiscoveredSchemaResult The response from the
     *         GetDiscoveredSchema service method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDiscoveredSchemaResult getDiscoveredSchema(
            GetDiscoveredSchemaRequest getDiscoveredSchemaRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the resource-based policy attached to a given registry.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return getResourcePolicyResult The response from the GetResourcePolicy
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the discoverers.
     * </p>
     * 
     * @param listDiscoverersRequest
     * @return listDiscoverersResult The response from the ListDiscoverers
     *         service method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDiscoverersResult listDiscoverers(ListDiscoverersRequest listDiscoverersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the registries.
     * </p>
     * 
     * @param listRegistriesRequest
     * @return listRegistriesResult The response from the ListRegistries service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRegistriesResult listRegistries(ListRegistriesRequest listRegistriesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a list of the schema versions and related information.
     * </p>
     * 
     * @param listSchemaVersionsRequest
     * @return listSchemaVersionsResult The response from the ListSchemaVersions
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSchemaVersionsResult listSchemaVersions(ListSchemaVersionsRequest listSchemaVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the schemas.
     * </p>
     * 
     * @param listSchemasRequest
     * @return listSchemasResult The response from the ListSchemas service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Get tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Schemas.
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Put code binding URI
     * </p>
     * 
     * @param putCodeBindingRequest
     * @return putCodeBindingResult The response from the PutCodeBinding service
     *         method, as returned by Schemas.
     * @throws GoneException <p>
     *             410 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws TooManyRequestsException <p>
     *             429 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutCodeBindingResult putCodeBinding(PutCodeBindingRequest putCodeBindingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param putResourcePolicyRequest <p>
     *            The name of the policy.
     *            </p>
     * @return putResourcePolicyResult The response from the PutResourcePolicy
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws PreconditionFailedException <p>
     *             412 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Search the schemas
     * </p>
     * 
     * @param searchSchemasRequest
     * @return searchSchemasResult The response from the SearchSchemas service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchSchemasResult searchSchemas(SearchSchemasRequest searchSchemasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts the discoverer
     * </p>
     * 
     * @param startDiscovererRequest
     * @return startDiscovererResult The response from the StartDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartDiscovererResult startDiscoverer(StartDiscovererRequest startDiscovererRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops the discoverer
     * </p>
     * 
     * @param stopDiscovererRequest
     * @return stopDiscovererResult The response from the StopDiscoverer service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopDiscovererResult stopDiscoverer(StopDiscovererRequest stopDiscovererRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Add tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the discoverer
     * </p>
     * 
     * @param updateDiscovererRequest
     * @return updateDiscovererResult The response from the UpdateDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDiscovererResult updateDiscoverer(UpdateDiscovererRequest updateDiscovererRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a registry.
     * </p>
     * 
     * @param updateRegistryRequest <p>
     *            Updates the registry.
     *            </p>
     * @return updateRegistryResult The response from the UpdateRegistry service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRegistryResult updateRegistry(UpdateRegistryRequest updateRegistryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the schema definition
     * </p>
     * <note>
     * <p>
     * Inactive schemas will be deleted after two years.
     * </p>
     * </note>
     * 
     * @param updateSchemaRequest
     * @return updateSchemaResult The response from the UpdateSchema service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateSchemaResult updateSchema(UpdateSchemaRequest updateSchemaRequest)
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
