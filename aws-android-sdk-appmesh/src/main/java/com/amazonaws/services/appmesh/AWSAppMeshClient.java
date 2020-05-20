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

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.services.appmesh.model.transform.*;

/**
 * Client for accessing AWS App Mesh. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
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
 */
public class AWSAppMeshClient extends AmazonWebServiceClient implements AWSAppMesh {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS App Mesh exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSAppMeshClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSAppMesh (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSAppMeshClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh using the
     * specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSAppMeshClient client = new AWSAppMeshClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AWSAppMeshClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh using the
     * specified AWS account credentials and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSAppMeshClient client = new AWSAppMeshClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSAppMesh (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSAppMeshClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh using the
     * specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSAppMeshClient client = new AWSAppMeshClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AWSAppMeshClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh using the
     * specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSAppMeshClient client = new AWSAppMeshClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSAppMesh (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSAppMeshClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSAppMesh (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSAppMeshClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSAppMesh using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSAppMeshClient client = new AWSAppMeshClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSAppMesh (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSAppMeshClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ForbiddenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("appmesh.us-east-1.amazonaws.com");
        this.endpointPrefix = "appmesh";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/appmesh/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/appmesh/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

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
    public CreateMeshResult createMesh(CreateMeshRequest createMeshRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMeshRequest> request = null;
        Response<CreateMeshResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMeshRequestMarshaller().marshall(createMeshRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMeshResult, JsonUnmarshallerContext> unmarshaller = new CreateMeshResultJsonUnmarshaller();
            JsonResponseHandler<CreateMeshResult> responseHandler = new JsonResponseHandler<CreateMeshResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateRouteResult createRoute(CreateRouteRequest createRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteRequest> request = null;
        Response<CreateRouteResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteRequestMarshaller().marshall(createRouteRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRouteResult, JsonUnmarshallerContext> unmarshaller = new CreateRouteResultJsonUnmarshaller();
            JsonResponseHandler<CreateRouteResult> responseHandler = new JsonResponseHandler<CreateRouteResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateVirtualNodeResult createVirtualNode(
            CreateVirtualNodeRequest createVirtualNodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualNodeRequest> request = null;
        Response<CreateVirtualNodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualNodeRequestMarshaller()
                        .marshall(createVirtualNodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVirtualNodeResult, JsonUnmarshallerContext> unmarshaller = new CreateVirtualNodeResultJsonUnmarshaller();
            JsonResponseHandler<CreateVirtualNodeResult> responseHandler = new JsonResponseHandler<CreateVirtualNodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateVirtualRouterResult createVirtualRouter(
            CreateVirtualRouterRequest createVirtualRouterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualRouterRequest> request = null;
        Response<CreateVirtualRouterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualRouterRequestMarshaller()
                        .marshall(createVirtualRouterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVirtualRouterResult, JsonUnmarshallerContext> unmarshaller = new CreateVirtualRouterResultJsonUnmarshaller();
            JsonResponseHandler<CreateVirtualRouterResult> responseHandler = new JsonResponseHandler<CreateVirtualRouterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateVirtualServiceResult createVirtualService(
            CreateVirtualServiceRequest createVirtualServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualServiceRequest> request = null;
        Response<CreateVirtualServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualServiceRequestMarshaller()
                        .marshall(createVirtualServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVirtualServiceResult, JsonUnmarshallerContext> unmarshaller = new CreateVirtualServiceResultJsonUnmarshaller();
            JsonResponseHandler<CreateVirtualServiceResult> responseHandler = new JsonResponseHandler<CreateVirtualServiceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteMeshResult deleteMesh(DeleteMeshRequest deleteMeshRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMeshRequest> request = null;
        Response<DeleteMeshResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMeshRequestMarshaller().marshall(deleteMeshRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMeshResult, JsonUnmarshallerContext> unmarshaller = new DeleteMeshResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMeshResult> responseHandler = new JsonResponseHandler<DeleteMeshResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteRequest> request = null;
        Response<DeleteRouteResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteRequestMarshaller().marshall(deleteRouteRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRouteResult, JsonUnmarshallerContext> unmarshaller = new DeleteRouteResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRouteResult> responseHandler = new JsonResponseHandler<DeleteRouteResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteVirtualNodeResult deleteVirtualNode(
            DeleteVirtualNodeRequest deleteVirtualNodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualNodeRequest> request = null;
        Response<DeleteVirtualNodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualNodeRequestMarshaller()
                        .marshall(deleteVirtualNodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVirtualNodeResult, JsonUnmarshallerContext> unmarshaller = new DeleteVirtualNodeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVirtualNodeResult> responseHandler = new JsonResponseHandler<DeleteVirtualNodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteVirtualRouterResult deleteVirtualRouter(
            DeleteVirtualRouterRequest deleteVirtualRouterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualRouterRequest> request = null;
        Response<DeleteVirtualRouterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualRouterRequestMarshaller()
                        .marshall(deleteVirtualRouterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVirtualRouterResult, JsonUnmarshallerContext> unmarshaller = new DeleteVirtualRouterResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVirtualRouterResult> responseHandler = new JsonResponseHandler<DeleteVirtualRouterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteVirtualServiceResult deleteVirtualService(
            DeleteVirtualServiceRequest deleteVirtualServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualServiceRequest> request = null;
        Response<DeleteVirtualServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualServiceRequestMarshaller()
                        .marshall(deleteVirtualServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVirtualServiceResult, JsonUnmarshallerContext> unmarshaller = new DeleteVirtualServiceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVirtualServiceResult> responseHandler = new JsonResponseHandler<DeleteVirtualServiceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeMeshResult describeMesh(DescribeMeshRequest describeMeshRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMeshRequest> request = null;
        Response<DescribeMeshResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMeshRequestMarshaller().marshall(describeMeshRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMeshResult, JsonUnmarshallerContext> unmarshaller = new DescribeMeshResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMeshResult> responseHandler = new JsonResponseHandler<DescribeMeshResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeRouteResult describeRoute(DescribeRouteRequest describeRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRouteRequest> request = null;
        Response<DescribeRouteResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRouteRequestMarshaller().marshall(describeRouteRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRouteResult, JsonUnmarshallerContext> unmarshaller = new DescribeRouteResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRouteResult> responseHandler = new JsonResponseHandler<DescribeRouteResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeVirtualNodeResult describeVirtualNode(
            DescribeVirtualNodeRequest describeVirtualNodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualNodeRequest> request = null;
        Response<DescribeVirtualNodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualNodeRequestMarshaller()
                        .marshall(describeVirtualNodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVirtualNodeResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualNodeResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVirtualNodeResult> responseHandler = new JsonResponseHandler<DescribeVirtualNodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeVirtualRouterResult describeVirtualRouter(
            DescribeVirtualRouterRequest describeVirtualRouterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualRouterRequest> request = null;
        Response<DescribeVirtualRouterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualRouterRequestMarshaller()
                        .marshall(describeVirtualRouterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVirtualRouterResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualRouterResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVirtualRouterResult> responseHandler = new JsonResponseHandler<DescribeVirtualRouterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeVirtualServiceResult describeVirtualService(
            DescribeVirtualServiceRequest describeVirtualServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualServiceRequest> request = null;
        Response<DescribeVirtualServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualServiceRequestMarshaller()
                        .marshall(describeVirtualServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVirtualServiceResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualServiceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVirtualServiceResult> responseHandler = new JsonResponseHandler<DescribeVirtualServiceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListMeshesResult listMeshes(ListMeshesRequest listMeshesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMeshesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMeshesRequest> request = null;
        Response<ListMeshesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMeshesRequestMarshaller().marshall(listMeshesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMeshesResult, JsonUnmarshallerContext> unmarshaller = new ListMeshesResultJsonUnmarshaller();
            JsonResponseHandler<ListMeshesResult> responseHandler = new JsonResponseHandler<ListMeshesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListRoutesResult listRoutes(ListRoutesRequest listRoutesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoutesRequest> request = null;
        Response<ListRoutesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoutesRequestMarshaller().marshall(listRoutesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRoutesResult, JsonUnmarshallerContext> unmarshaller = new ListRoutesResultJsonUnmarshaller();
            JsonResponseHandler<ListRoutesResult> responseHandler = new JsonResponseHandler<ListRoutesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(listTagsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListVirtualNodesResult listVirtualNodes(ListVirtualNodesRequest listVirtualNodesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVirtualNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualNodesRequest> request = null;
        Response<ListVirtualNodesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualNodesRequestMarshaller().marshall(listVirtualNodesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVirtualNodesResult, JsonUnmarshallerContext> unmarshaller = new ListVirtualNodesResultJsonUnmarshaller();
            JsonResponseHandler<ListVirtualNodesResult> responseHandler = new JsonResponseHandler<ListVirtualNodesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListVirtualRoutersResult listVirtualRouters(
            ListVirtualRoutersRequest listVirtualRoutersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVirtualRoutersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualRoutersRequest> request = null;
        Response<ListVirtualRoutersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualRoutersRequestMarshaller()
                        .marshall(listVirtualRoutersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVirtualRoutersResult, JsonUnmarshallerContext> unmarshaller = new ListVirtualRoutersResultJsonUnmarshaller();
            JsonResponseHandler<ListVirtualRoutersResult> responseHandler = new JsonResponseHandler<ListVirtualRoutersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListVirtualServicesResult listVirtualServices(
            ListVirtualServicesRequest listVirtualServicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVirtualServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualServicesRequest> request = null;
        Response<ListVirtualServicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualServicesRequestMarshaller()
                        .marshall(listVirtualServicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVirtualServicesResult, JsonUnmarshallerContext> unmarshaller = new ListVirtualServicesResultJsonUnmarshaller();
            JsonResponseHandler<ListVirtualServicesResult> responseHandler = new JsonResponseHandler<ListVirtualServicesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourceResult, JsonUnmarshallerContext> unmarshaller = new TagResourceResultJsonUnmarshaller();
            JsonResponseHandler<TagResourceResult> responseHandler = new JsonResponseHandler<TagResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> unmarshaller = new UntagResourceResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourceResult> responseHandler = new JsonResponseHandler<UntagResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdateMeshResult updateMesh(UpdateMeshRequest updateMeshRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMeshRequest> request = null;
        Response<UpdateMeshResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMeshRequestMarshaller().marshall(updateMeshRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMeshResult, JsonUnmarshallerContext> unmarshaller = new UpdateMeshResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMeshResult> responseHandler = new JsonResponseHandler<UpdateMeshResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteRequest> request = null;
        Response<UpdateRouteResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteRequestMarshaller().marshall(updateRouteRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRouteResult, JsonUnmarshallerContext> unmarshaller = new UpdateRouteResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRouteResult> responseHandler = new JsonResponseHandler<UpdateRouteResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdateVirtualNodeResult updateVirtualNode(
            UpdateVirtualNodeRequest updateVirtualNodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualNodeRequest> request = null;
        Response<UpdateVirtualNodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualNodeRequestMarshaller()
                        .marshall(updateVirtualNodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVirtualNodeResult, JsonUnmarshallerContext> unmarshaller = new UpdateVirtualNodeResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVirtualNodeResult> responseHandler = new JsonResponseHandler<UpdateVirtualNodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdateVirtualRouterResult updateVirtualRouter(
            UpdateVirtualRouterRequest updateVirtualRouterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualRouterRequest> request = null;
        Response<UpdateVirtualRouterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualRouterRequestMarshaller()
                        .marshall(updateVirtualRouterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVirtualRouterResult, JsonUnmarshallerContext> unmarshaller = new UpdateVirtualRouterResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVirtualRouterResult> responseHandler = new JsonResponseHandler<UpdateVirtualRouterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdateVirtualServiceResult updateVirtualService(
            UpdateVirtualServiceRequest updateVirtualServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualServiceRequest> request = null;
        Response<UpdateVirtualServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualServiceRequestMarshaller()
                        .marshall(updateVirtualServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVirtualServiceResult, JsonUnmarshallerContext> unmarshaller = new UpdateVirtualServiceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVirtualServiceResult> responseHandler = new JsonResponseHandler<UpdateVirtualServiceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
