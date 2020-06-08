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

package com.amazonaws.services.servicediscovery;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.servicediscovery.model.*;

/**
 * Interface for accessing AWS Cloud Map
 * <p>
 * AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces
 * that your microservice applications run in. When an instance of the service
 * becomes available, you can call the AWS Cloud Map API to register the
 * instance with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud
 * Map automatically creates DNS records and an optional health check. Clients
 * that submit public or private DNS queries, or HTTP requests, for the service
 * receive an answer that contains up to eight healthy records.
 * </p>
 **/
public interface AWSCloudMap {

    /**
     * Overrides the default endpoint for this client
     * ("https://servicediscovery.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "servicediscovery.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://servicediscovery.us-east-1.amazonaws.com"). If the
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
     *            "servicediscovery.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://servicediscovery.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCloudMap#setEndpoint(String)}, sets the
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
     * Creates an HTTP namespace. Service instances that you register using an
     * HTTP namespace can be discovered using a <code>DiscoverInstances</code>
     * request but can't be discovered using DNS.
     * </p>
     * <p>
     * For the current limit on the number of namespaces that you can create
     * using the same AWS account, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html"
     * >AWS Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createHttpNamespaceRequest
     * @return createHttpNamespaceResult The response from the
     *         CreateHttpNamespace service method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws NamespaceAlreadyExistsException
     * @throws ResourceLimitExceededException
     * @throws DuplicateRequestException
     * @throws TooManyTagsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateHttpNamespaceResult createHttpNamespace(
            CreateHttpNamespaceRequest createHttpNamespaceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a private namespace based on DNS, which will be visible only
     * inside a specified Amazon VPC. The namespace defines your service naming
     * scheme. For example, if you name your namespace <code>example.com</code>
     * and name your service <code>backend</code>, the resulting DNS name for
     * the service will be <code>backend.example.com</code>. For the current
     * limit on the number of namespaces that you can create using the same AWS
     * account, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html"
     * >AWS Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPrivateDnsNamespaceRequest
     * @return createPrivateDnsNamespaceResult The response from the
     *         CreatePrivateDnsNamespace service method, as returned by AWS
     *         Cloud Map.
     * @throws InvalidInputException
     * @throws NamespaceAlreadyExistsException
     * @throws ResourceLimitExceededException
     * @throws DuplicateRequestException
     * @throws TooManyTagsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreatePrivateDnsNamespaceResult createPrivateDnsNamespace(
            CreatePrivateDnsNamespaceRequest createPrivateDnsNamespaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a public namespace based on DNS, which will be visible on the
     * internet. The namespace defines your service naming scheme. For example,
     * if you name your namespace <code>example.com</code> and name your service
     * <code>backend</code>, the resulting DNS name for the service will be
     * <code>backend.example.com</code>. For the current limit on the number of
     * namespaces that you can create using the same AWS account, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html"
     * >AWS Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPublicDnsNamespaceRequest
     * @return createPublicDnsNamespaceResult The response from the
     *         CreatePublicDnsNamespace service method, as returned by AWS Cloud
     *         Map.
     * @throws InvalidInputException
     * @throws NamespaceAlreadyExistsException
     * @throws ResourceLimitExceededException
     * @throws DuplicateRequestException
     * @throws TooManyTagsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreatePublicDnsNamespaceResult createPublicDnsNamespace(
            CreatePublicDnsNamespaceRequest createPublicDnsNamespaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a service, which defines the configuration for the following
     * entities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private DNS namespaces, one of the following combinations
     * of DNS records in Amazon Route 53:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Optionally, a health check
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create the service, you can submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request, and AWS Cloud Map uses the values in the
     * configuration to create the specified entities.
     * </p>
     * <p>
     * For the current limit on the number of instances that you can register
     * using the same namespace and using the same service, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html"
     * >AWS Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return createServiceResult The response from the CreateService service
     *         method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws ResourceLimitExceededException
     * @throws NamespaceNotFoundException
     * @throws ServiceAlreadyExistsException
     * @throws TooManyTagsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateServiceResult createService(CreateServiceRequest createServiceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a namespace from the current account. If the namespace still
     * contains one or more services, the request fails.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return deleteNamespaceResult The response from the DeleteNamespace
     *         service method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws NamespaceNotFoundException
     * @throws ResourceInUseException
     * @throws DuplicateRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified service. If the service still contains one or more
     * registered instances, the request fails.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return deleteServiceResult The response from the DeleteService service
     *         method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws ServiceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the Amazon Route 53 DNS records and health check, if any, that
     * AWS Cloud Map created for the specified instance.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return deregisterInstanceResult The response from the DeregisterInstance
     *         service method, as returned by AWS Cloud Map.
     * @throws DuplicateRequestException
     * @throws InvalidInputException
     * @throws InstanceNotFoundException
     * @throws ResourceInUseException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeregisterInstanceResult deregisterInstance(DeregisterInstanceRequest deregisterInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Discovers registered instances for a specified namespace and service. You
     * can use <code>DiscoverInstances</code> to discover instances for any type
     * of namespace. For public and private DNS namespaces, you can also use DNS
     * queries to discover instances.
     * </p>
     * 
     * @param discoverInstancesRequest
     * @return discoverInstancesResult The response from the DiscoverInstances
     *         service method, as returned by AWS Cloud Map.
     * @throws ServiceNotFoundException
     * @throws NamespaceNotFoundException
     * @throws InvalidInputException
     * @throws RequestLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DiscoverInstancesResult discoverInstances(DiscoverInstancesRequest discoverInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a specified instance.
     * </p>
     * 
     * @param getInstanceRequest
     * @return getInstanceResult The response from the GetInstance service
     *         method, as returned by AWS Cloud Map.
     * @throws InstanceNotFoundException
     * @throws InvalidInputException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstanceResult getInstance(GetInstanceRequest getInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the current health status (<code>Healthy</code>,
     * <code>Unhealthy</code>, or <code>Unknown</code>) of one or more instances
     * that are associated with a specified service.
     * </p>
     * <note>
     * <p>
     * There is a brief delay between when you register an instance and when the
     * health status for the instance is available.
     * </p>
     * </note>
     * 
     * @param getInstancesHealthStatusRequest
     * @return getInstancesHealthStatusResult The response from the
     *         GetInstancesHealthStatus service method, as returned by AWS Cloud
     *         Map.
     * @throws InstanceNotFoundException
     * @throws InvalidInputException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInstancesHealthStatusResult getInstancesHealthStatus(
            GetInstancesHealthStatusRequest getInstancesHealthStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a namespace.
     * </p>
     * 
     * @param getNamespaceRequest
     * @return getNamespaceResult The response from the GetNamespace service
     *         method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws NamespaceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetNamespaceResult getNamespace(GetNamespaceRequest getNamespaceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about any operation that returns an operation ID in the
     * response, such as a <code>CreateService</code> request.
     * </p>
     * <note>
     * <p>
     * To get a list of operations that match specified criteria, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListOperations.html"
     * >ListOperations</a>.
     * </p>
     * </note>
     * 
     * @param getOperationRequest
     * @return getOperationResult The response from the GetOperation service
     *         method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws OperationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetOperationResult getOperation(GetOperationRequest getOperationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the settings for a specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @return getServiceResult The response from the GetService service method,
     *         as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetServiceResult getService(GetServiceRequest getServiceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists summary information about the instances that you registered by
     * using a specified service.
     * </p>
     * 
     * @param listInstancesRequest
     * @return listInstancesResult The response from the ListInstances service
     *         method, as returned by AWS Cloud Map.
     * @throws ServiceNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists summary information about the namespaces that were created by the
     * current AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return listNamespacesResult The response from the ListNamespaces service
     *         method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListNamespacesResult listNamespaces(ListNamespacesRequest listNamespacesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists operations that match the criteria that you specify.
     * </p>
     * 
     * @param listOperationsRequest
     * @return listOperationsResult The response from the ListOperations service
     *         method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists summary information for all the services that are associated with
     * one or more specified namespaces.
     * </p>
     * 
     * @param listServicesRequest
     * @return listServicesResult The response from the ListServices service
     *         method, as returned by AWS Cloud Map.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Cloud Map.
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates or updates one or more records and, optionally, creates a health
     * check based on the settings in a specified service. When you submit a
     * <code>RegisterInstance</code> request, the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each DNS record that you define in the service that is specified by
     * <code>ServiceId</code>, a record is created or updated in the hosted zone
     * that is associated with the corresponding namespace.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, a health check is
     * created based on the settings in the health check configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The health check, if any, is associated with each of the new or updated
     * records.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * One <code>RegisterInstance</code> request must complete before you can
     * submit another request and specify the same service ID and instance ID.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html"
     * >CreateService</a>.
     * </p>
     * <p>
     * When AWS Cloud Map receives a DNS query for the specified DNS name, it
     * returns the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If the health check is healthy</b>: returns all the records
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If the health check is unhealthy</b>: returns the applicable value for
     * the last healthy instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you didn't specify a health check configuration</b>: returns all
     * the records
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the current limit on the number of instances that you can register
     * using the same namespace and using the same service, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html"
     * >AWS Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return registerInstanceResult The response from the RegisterInstance
     *         service method, as returned by AWS Cloud Map.
     * @throws DuplicateRequestException
     * @throws InvalidInputException
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RegisterInstanceResult registerInstance(RegisterInstanceRequest registerInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Cloud Map.
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
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
     *         method, as returned by AWS Cloud Map.
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Submits a request to change the health status of a custom health check to
     * healthy or unhealthy.
     * </p>
     * <p>
     * You can use <code>UpdateInstanceCustomHealthStatus</code> to change the
     * status only for custom health checks, which you define using
     * <code>HealthCheckCustomConfig</code> when you create a service. You can't
     * use it to change the status for Route 53 health checks, which you define
     * using <code>HealthCheckConfig</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html"
     * >HealthCheckCustomConfig</a>.
     * </p>
     * 
     * @param updateInstanceCustomHealthStatusRequest
     * @throws InstanceNotFoundException
     * @throws ServiceNotFoundException
     * @throws CustomHealthNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateInstanceCustomHealthStatus(
            UpdateInstanceCustomHealthStatusRequest updateInstanceCustomHealthStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Submits a request to perform the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update the TTL setting for existing <code>DnsRecords</code>
     * configurations
     * </p>
     * </li>
     * <li>
     * <p>
     * Add, update, or delete <code>HealthCheckConfig</code> for a specified
     * service
     * </p>
     * <note>
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code>
     * configuration.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * For public and private DNS namespaces, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you omit any existing <code>DnsRecords</code> or
     * <code>HealthCheckConfig</code> configurations from an
     * <code>UpdateService</code> request, the configurations are deleted from
     * the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you omit an existing <code>HealthCheckCustomConfig</code>
     * configuration from an <code>UpdateService</code> request, the
     * configuration is not deleted from the service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you update settings for a service, AWS Cloud Map also updates the
     * corresponding settings in all the records and health checks that were
     * created by using the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @return updateServiceResult The response from the UpdateService service
     *         method, as returned by AWS Cloud Map.
     * @throws DuplicateRequestException
     * @throws InvalidInputException
     * @throws ServiceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cloud Map indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest)
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
