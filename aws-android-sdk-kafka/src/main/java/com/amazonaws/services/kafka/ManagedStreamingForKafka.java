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

package com.amazonaws.services.kafka;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.kafka.model.*;

/**
 * Interface for accessing Managed Streaming for Kafka
 * <p>
 * The operations for managing an Amazon MSK cluster.
 * </p> **/
public interface ManagedStreamingForKafka {

    /**
     * Overrides the default endpoint for this client
     * ("https://kafka.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "kafka.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://kafka.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "kafka.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://kafka.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link ManagedStreamingForKafka#setEndpoint(String)},
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
     * 
     <p>
     * Creates a new MSK cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return createClusterResult The response from the CreateCluster service
     *         method, as returned by Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws TooManyRequestsException <p>
     *             429 response
     *             </p> @throws ConflictException <p>
     *             This cluster name already exists. Retry your request using
     *             another name.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Creates a new MSK configuration.
     * </p>
     * 
     * @param createConfigurationRequest
     * @return createConfigurationResult The response from the
     *         CreateConfiguration service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws TooManyRequestsException <p>
     *             429 response
     *             </p> @throws ConflictException <p>
     *             This cluster name already exists. Retry your request using
     *             another name.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CreateConfigurationResult createConfiguration(
            CreateConfigurationRequest createConfigurationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * 
     <p>
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in
     * the request.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return deleteClusterResult The response from the DeleteCluster service
     *         method, as returned by Managed Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN)
     * is specified in the request.
     * </p>
     * 
     * @param describeClusterRequest
     * @return describeClusterResult The response from the DescribeCluster
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a description of the cluster operation specified by the ARN.
     * </p>
     * 
     * @param describeClusterOperationRequest
     * @return describeClusterOperationResult The response from the
     *         DescribeClusterOperation service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeClusterOperationResult describeClusterOperation(
            DescribeClusterOperationRequest describeClusterOperationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a description of this MSK configuration.
     * </p>
     * 
     * @param describeConfigurationRequest
     * @return describeConfigurationResult The response from the
     *         DescribeConfiguration service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeConfigurationResult describeConfiguration(
            DescribeConfigurationRequest describeConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a description of this revision of the configuration.
     * </p>
     * 
     * @param describeConfigurationRevisionRequest
     * @return describeConfigurationRevisionResult The response from the
     *         DescribeConfigurationRevision service method, as returned by
     *         Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeConfigurationRevisionResult describeConfigurationRevision(
            DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * A list of brokers that a client application can use to bootstrap.
     * </p>
     * 
     * @param getBootstrapBrokersRequest
     * @return getBootstrapBrokersResult The response from the
     *         GetBootstrapBrokers service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ConflictException <p>
     *             This cluster name already exists. Retry your request using
     *             another name.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetBootstrapBrokersResult getBootstrapBrokers(
            GetBootstrapBrokersRequest getBootstrapBrokersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * 
     <p>
     * Gets the Apache Kafka versions to which you can update the MSK cluster.
     * </p>
     * 
     * @param getCompatibleKafkaVersionsRequest
     * @return getCompatibleKafkaVersionsResult The response from the
     *         GetCompatibleKafkaVersions service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException n
     *             <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p>
     *             n
     * @throws UnauthorizedException n
     *             <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p>
     *             n
     * @throws InternalServerErrorException n
     *             <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p>
     *             n
     * @throws ForbiddenException n
     *             <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p>
     *             n
     * @throws NotFoundException n
     *             <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p>
     *             n
     * @throws ServiceUnavailableException n
     *             <p>
     *             503 response
     *             </p>
     *             n
     * @throws TooManyRequestsException n
     *             <p>
     *             429 response
     *             </p>
     *             n
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    GetCompatibleKafkaVersionsResult getCompatibleKafkaVersions(
            GetCompatibleKafkaVersionsRequest getCompatibleKafkaVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a list of all the operations that have been performed on the
     * specified MSK cluster.
     * </p>
     * 
     * @param listClusterOperationsRequest
     * @return listClusterOperationsResult The response from the
     *         ListClusterOperations service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListClusterOperationsResult listClusterOperations(
            ListClusterOperationsRequest listClusterOperationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a list of all the MSK clusters in the current Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return listClustersResult The response from the ListClusters service
     *         method, as returned by Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationRevisionsRequest
     * @return listConfigurationRevisionsResult The response from the
     *         ListConfigurationRevisions service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListConfigurationRevisionsResult listConfigurationRevisions(
            ListConfigurationRevisionsRequest listConfigurationRevisionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return listConfigurationsResult The response from the ListConfigurations
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListConfigurationsResult listConfigurations(ListConfigurationsRequest listConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a list of Kafka versions.
     * </p>
     * 
     * @param listKafkaVersionsRequest
     * @return listKafkaVersionsResult The response from the ListKafkaVersions
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListKafkaVersionsResult listKafkaVersions(ListKafkaVersionsRequest listKafkaVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Returns a list of the broker nodes in the cluster.
     * </p>
     * 
     * @param listNodesRequest
     * @return listNodesResult The response from the ListNodes service method,
     *         as returned by Managed Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListNodesResult listNodes(ListNodesRequest listNodesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * 
     <p>
     * Returns a list of the tags associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * 
     <p>
     * Adds tags to the specified MSK resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * 
     <p>
     * Removes the tags associated with the keys that are provided in the query.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * 
     <p>
     * Updates the number of broker nodes in the cluster.
     * </p>
     * 
     * @param updateBrokerCountRequest
     * @return updateBrokerCountResult The response from the UpdateBrokerCount
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    UpdateBrokerCountResult updateBrokerCount(UpdateBrokerCountRequest updateBrokerCountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Updates the EBS storage associated with MSK brokers.
     * </p>
     * 
     * @param updateBrokerStorageRequest
     * @return updateBrokerStorageResult The response from the
     *         UpdateBrokerStorage service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    UpdateBrokerStorageResult updateBrokerStorage(
            UpdateBrokerStorageRequest updateBrokerStorageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * 
     <p>
     * Updates the cluster with the configuration that is specified in the
     * request body.
     * </p>
     * 
     * @param updateClusterConfigurationRequest
     * @return updateClusterConfigurationResult The response from the
     *         UpdateClusterConfiguration service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    UpdateClusterConfigurationResult updateClusterConfiguration(
            UpdateClusterConfigurationRequest updateClusterConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Updates the Apache Kafka version for the cluster.
     * </p>
     * 
     * @param updateClusterKafkaVersionRequest
     * @return updateClusterKafkaVersionResult The response from the
     *         UpdateClusterKafkaVersion service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws TooManyRequestsException <p>
     *             429 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    UpdateClusterKafkaVersionResult updateClusterKafkaVersion(
            UpdateClusterKafkaVersionRequest updateClusterKafkaVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * 
     <p>
     * Updates the monitoring settings for the cluster. You can use this
     * operation to specify which Apache Kafka metrics you want Amazon MSK to
     * send to Amazon CloudWatch. You can also specify settings for open
     * monitoring with Prometheus.
     * </p>
     * 
     * @param updateMonitoringRequest Request body for UpdateMonitoring.
     * @return updateMonitoringResult The response from the UpdateMonitoring
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             HTTP Status Code 503: Service Unavailable. Retrying your
     *             request in some time might resolve the issue.
     *             </p> @throws BadRequestException <p>
     *             HTTP Status Code 400: Bad request due to incorrect input.
     *             Correct your request and then retry it.
     *             </p> @throws UnauthorizedException <p>
     *             HTTP Status Code 401: Unauthorized request. The provided
     *             credentials couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             HTTP Status Code 500: Unexpected internal server error.
     *             Retrying your request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             HTTP Status Code 403: Access forbidden. Correct your
     *             credentials and then retry your request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    UpdateMonitoringResult updateMonitoring(UpdateMonitoringRequest updateMonitoringRequest)
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
