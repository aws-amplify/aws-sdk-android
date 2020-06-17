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

package com.amazonaws.services.appmesh;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.appmesh.model.*;

/**
 * Interface for accessing AWS App Mesh
 * <p>
 * AWS App Mesh is a service mesh based on the Envoy proxy that makes it easy to
 * monitor and control microservices. App Mesh standardizes how your
 * microservices communicate, giving you end-to-end visibility and helping to
 * ensure high availability for your applications.
 * </p>
 * <p>
 * App Mesh gives you consistent visibility and network traffic controls for
 * every microservice in an application. You can use App Mesh with AWS Fargate,
 * Amazon ECS, Amazon EKS, Kubernetes on AWS, and Amazon EC2.
 * </p>
 * <note>
 * <p>
 * App Mesh supports microservice applications that use service discovery naming
 * for their components. For more information about service discovery on Amazon
 * ECS, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
 * >Service Discovery</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>. Kubernetes <code>kube-dns</code> and <code>coredns</code> are
 * supported. For more information, see <a href=
 * "https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/"
 * >DNS for Services and Pods</a> in the Kubernetes documentation.
 * </p>
 * </note>
 **/
public interface AWSAppMesh {

    /**
     * Overrides the default endpoint for this client
     * ("https://appmesh.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "appmesh.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://appmesh.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "appmesh.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://appmesh.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSAppMesh#setEndpoint(String)}, sets the
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
     * Creates a service mesh.
     * </p>
     * <p>
     * A service mesh is a logical boundary for network traffic between services
     * that are represented by resources within the mesh. After you create your
     * service mesh, you can create virtual services, virtual nodes, virtual
     * routers, and routes to distribute traffic between the applications in
     * your mesh.
     * </p>
     * <p>
     * For more information about service meshes, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/meshes.html"
     * >Service meshes</a>.
     * </p>
     * 
     * @param createMeshRequest
     * @return createMeshResult The response from the CreateMesh service method,
     *         as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateMeshResult createMesh(CreateMeshRequest createMeshRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a route that is associated with a virtual router.
     * </p>
     * <p>
     * You can route several different protocols and define a retry policy for a
     * route. Traffic can be routed to one or more virtual nodes.
     * </p>
     * <p>
     * For more information about routes, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/routes.html"
     * >Routes</a>.
     * </p>
     * 
     * @param createRouteRequest
     * @return createRouteResult The response from the CreateRoute service
     *         method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a virtual node within a service mesh.
     * </p>
     * <p>
     * A virtual node acts as a logical pointer to a particular task group, such
     * as an Amazon ECS service or a Kubernetes deployment. When you create a
     * virtual node, you can specify the service discovery information for your
     * task group, and whether the proxy running in a task group will
     * communicate with other proxies using Transport Layer Security (TLS).
     * </p>
     * <p>
     * You define a <code>listener</code> for any inbound traffic that your
     * virtual node expects. Any virtual service that your virtual node expects
     * to communicate to is specified as a <code>backend</code>.
     * </p>
     * <p>
     * The response metadata for your new virtual node contains the
     * <code>arn</code> that is associated with the virtual node. Set this value
     * (either the full ARN or the truncated resource name: for example,
     * <code>mesh/default/virtualNode/simpleapp</code>) as the
     * <code>APPMESH_VIRTUAL_NODE_NAME</code> environment variable for your task
     * group's Envoy proxy container in your task definition or pod spec. This
     * is then mapped to the <code>node.id</code> and <code>node.cluster</code>
     * Envoy parameters.
     * </p>
     * <note>
     * <p>
     * If you require your Envoy stats or tracing to use a different name, you
     * can override the <code>node.cluster</code> value that is set by
     * <code>APPMESH_VIRTUAL_NODE_NAME</code> with the
     * <code>APPMESH_VIRTUAL_NODE_CLUSTER</code> environment variable.
     * </p>
     * </note>
     * <p>
     * For more information about virtual nodes, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html"
     * >Virtual nodes</a>.
     * </p>
     * 
     * @param createVirtualNodeRequest
     * @return createVirtualNodeResult The response from the CreateVirtualNode
     *         service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateVirtualNodeResult createVirtualNode(CreateVirtualNodeRequest createVirtualNodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a virtual router within a service mesh.
     * </p>
     * <p>
     * Specify a <code>listener</code> for any inbound traffic that your virtual
     * router receives. Create a virtual router for each protocol and port that
     * you need to route. Virtual routers handle traffic for one or more virtual
     * services within your mesh. After you create your virtual router, create
     * and associate routes for your virtual router that direct incoming
     * requests to different virtual nodes.
     * </p>
     * <p>
     * For more information about virtual routers, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_routers.html"
     * >Virtual routers</a>.
     * </p>
     * 
     * @param createVirtualRouterRequest
     * @return createVirtualRouterResult The response from the
     *         CreateVirtualRouter service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateVirtualRouterResult createVirtualRouter(
            CreateVirtualRouterRequest createVirtualRouterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a virtual service within a service mesh.
     * </p>
     * <p>
     * A virtual service is an abstraction of a real service that is provided by
     * a virtual node directly or indirectly by means of a virtual router.
     * Dependent services call your virtual service by its
     * <code>virtualServiceName</code>, and those requests are routed to the
     * virtual node or virtual router that is specified as the provider for the
     * virtual service.
     * </p>
     * <p>
     * For more information about virtual services, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_services.html"
     * >Virtual services</a>.
     * </p>
     * 
     * @param createVirtualServiceRequest
     * @return createVirtualServiceResult The response from the
     *         CreateVirtualService service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateVirtualServiceResult createVirtualService(
            CreateVirtualServiceRequest createVirtualServiceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an existing service mesh.
     * </p>
     * <p>
     * You must delete all resources (virtual services, routes, virtual routers,
     * and virtual nodes) in the service mesh before you can delete the mesh
     * itself.
     * </p>
     * 
     * @param deleteMeshRequest
     * @return deleteMeshResult The response from the DeleteMesh service method,
     *         as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ResourceInUseException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteMeshResult deleteMesh(DeleteMeshRequest deleteMeshRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an existing route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return deleteRouteResult The response from the DeleteRoute service
     *         method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ResourceInUseException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing virtual node.
     * </p>
     * <p>
     * You must delete any virtual services that list a virtual node as a
     * service provider before you can delete the virtual node itself.
     * </p>
     * 
     * @param deleteVirtualNodeRequest
     * @return deleteVirtualNodeResult The response from the DeleteVirtualNode
     *         service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ResourceInUseException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteVirtualNodeResult deleteVirtualNode(DeleteVirtualNodeRequest deleteVirtualNodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing virtual router.
     * </p>
     * <p>
     * You must delete any routes associated with the virtual router before you
     * can delete the router itself.
     * </p>
     * 
     * @param deleteVirtualRouterRequest
     * @return deleteVirtualRouterResult The response from the
     *         DeleteVirtualRouter service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ResourceInUseException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteVirtualRouterResult deleteVirtualRouter(
            DeleteVirtualRouterRequest deleteVirtualRouterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an existing virtual service.
     * </p>
     * 
     * @param deleteVirtualServiceRequest
     * @return deleteVirtualServiceResult The response from the
     *         DeleteVirtualService service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ResourceInUseException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteVirtualServiceResult deleteVirtualService(
            DeleteVirtualServiceRequest deleteVirtualServiceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes an existing service mesh.
     * </p>
     * 
     * @param describeMeshRequest
     * @return describeMeshResult The response from the DescribeMesh service
     *         method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeMeshResult describeMesh(DescribeMeshRequest describeMeshRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an existing route.
     * </p>
     * 
     * @param describeRouteRequest
     * @return describeRouteResult The response from the DescribeRoute service
     *         method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRouteResult describeRoute(DescribeRouteRequest describeRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an existing virtual node.
     * </p>
     * 
     * @param describeVirtualNodeRequest
     * @return describeVirtualNodeResult The response from the
     *         DescribeVirtualNode service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeVirtualNodeResult describeVirtualNode(
            DescribeVirtualNodeRequest describeVirtualNodeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes an existing virtual router.
     * </p>
     * 
     * @param describeVirtualRouterRequest
     * @return describeVirtualRouterResult The response from the
     *         DescribeVirtualRouter service method, as returned by AWS App
     *         Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeVirtualRouterResult describeVirtualRouter(
            DescribeVirtualRouterRequest describeVirtualRouterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an existing virtual service.
     * </p>
     * 
     * @param describeVirtualServiceRequest
     * @return describeVirtualServiceResult The response from the
     *         DescribeVirtualService service method, as returned by AWS App
     *         Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeVirtualServiceResult describeVirtualService(
            DescribeVirtualServiceRequest describeVirtualServiceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of existing service meshes.
     * </p>
     * 
     * @param listMeshesRequest
     * @return listMeshesResult The response from the ListMeshes service method,
     *         as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMeshesResult listMeshes(ListMeshesRequest listMeshesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of existing routes in a service mesh.
     * </p>
     * 
     * @param listRoutesRequest
     * @return listRoutesResult The response from the ListRoutes service method,
     *         as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRoutesResult listRoutes(ListRoutesRequest listRoutesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * List the tags for an App Mesh resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of existing virtual nodes.
     * </p>
     * 
     * @param listVirtualNodesRequest
     * @return listVirtualNodesResult The response from the ListVirtualNodes
     *         service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListVirtualNodesResult listVirtualNodes(ListVirtualNodesRequest listVirtualNodesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of existing virtual routers in a service mesh.
     * </p>
     * 
     * @param listVirtualRoutersRequest
     * @return listVirtualRoutersResult The response from the ListVirtualRouters
     *         service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListVirtualRoutersResult listVirtualRouters(ListVirtualRoutersRequest listVirtualRoutersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of existing virtual services in a service mesh.
     * </p>
     * 
     * @param listVirtualServicesRequest
     * @return listVirtualServicesResult The response from the
     *         ListVirtualServices service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListVirtualServicesResult listVirtualServices(
            ListVirtualServicesRequest listVirtualServicesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Associates the specified tags to a resource with the specified
     * <code>resourceArn</code>. If existing tags on a resource aren't specified
     * in the request parameters, they aren't changed. When a resource is
     * deleted, the tags associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing service mesh.
     * </p>
     * 
     * @param updateMeshRequest
     * @return updateMeshResult The response from the UpdateMesh service method,
     *         as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateMeshResult updateMesh(UpdateMeshRequest updateMeshRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates an existing route for a specified service mesh and virtual
     * router.
     * </p>
     * 
     * @param updateRouteRequest
     * @return updateRouteResult The response from the UpdateRoute service
     *         method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing virtual node in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualNodeRequest
     * @return updateVirtualNodeResult The response from the UpdateVirtualNode
     *         service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateVirtualNodeResult updateVirtualNode(UpdateVirtualNodeRequest updateVirtualNodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing virtual router in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualRouterRequest
     * @return updateVirtualRouterResult The response from the
     *         UpdateVirtualRouter service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateVirtualRouterResult updateVirtualRouter(
            UpdateVirtualRouterRequest updateVirtualRouterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates an existing virtual service in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualServiceRequest
     * @return updateVirtualServiceResult The response from the
     *         UpdateVirtualService service method, as returned by AWS App Mesh.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws InternalServerErrorException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             App Mesh indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateVirtualServiceResult updateVirtualService(
            UpdateVirtualServiceRequest updateVirtualServiceRequest) throws AmazonClientException,
            AmazonServiceException;

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
