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

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.services.directconnect.model.transform.*;

/**
 * Client for accessing AWS Direct Connect. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
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
 */
public class AWSDirectConnectClient extends AmazonWebServiceClient implements AWSDirectConnect {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Direct Connect exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect. A
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
    public AWSDirectConnectClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect. A
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
     *            how this client connects to AWSDirectConnect (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSDirectConnectClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect
     * using the specified AWS account credentials.
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
     *         AWSDirectConnectClient client = new AWSDirectConnectClient(AWSMobileClient.getInstance());
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
    public AWSDirectConnectClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect
     * using the specified AWS account credentials and client configuration
     * options.
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
     *         AWSDirectConnectClient client = new AWSDirectConnectClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSDirectConnect (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSDirectConnectClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect
     * using the specified AWS account credentials provider.
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
     *         AWSDirectConnectClient client = new AWSDirectConnectClient(AWSMobileClient.getInstance());
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
    public AWSDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *         AWSDirectConnectClient client = new AWSDirectConnectClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSDirectConnect (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSDirectConnect (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSDirectConnect
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
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
     *         AWSDirectConnectClient client = new AWSDirectConnectClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSDirectConnect (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DirectConnectClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DirectConnectServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateTagKeysExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("directconnect.us-east-1.amazonaws.com");
        this.endpointPrefix = "directconnect";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/directconnect/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/directconnect/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

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
    public AcceptDirectConnectGatewayAssociationProposalResult acceptDirectConnectGatewayAssociationProposal(
            AcceptDirectConnectGatewayAssociationProposalRequest acceptDirectConnectGatewayAssociationProposalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptDirectConnectGatewayAssociationProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptDirectConnectGatewayAssociationProposalRequest> request = null;
        Response<AcceptDirectConnectGatewayAssociationProposalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptDirectConnectGatewayAssociationProposalRequestMarshaller()
                        .marshall(acceptDirectConnectGatewayAssociationProposalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AcceptDirectConnectGatewayAssociationProposalResult, JsonUnmarshallerContext> unmarshaller = new AcceptDirectConnectGatewayAssociationProposalResultJsonUnmarshaller();
            JsonResponseHandler<AcceptDirectConnectGatewayAssociationProposalResult> responseHandler = new JsonResponseHandler<AcceptDirectConnectGatewayAssociationProposalResult>(
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
    public AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(allocateConnectionOnInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateConnectionOnInterconnectRequest> request = null;
        Response<AllocateConnectionOnInterconnectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateConnectionOnInterconnectRequestMarshaller()
                        .marshall(allocateConnectionOnInterconnectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AllocateConnectionOnInterconnectResult, JsonUnmarshallerContext> unmarshaller = new AllocateConnectionOnInterconnectResultJsonUnmarshaller();
            JsonResponseHandler<AllocateConnectionOnInterconnectResult> responseHandler = new JsonResponseHandler<AllocateConnectionOnInterconnectResult>(
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
    public AllocateHostedConnectionResult allocateHostedConnection(
            AllocateHostedConnectionRequest allocateHostedConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(allocateHostedConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateHostedConnectionRequest> request = null;
        Response<AllocateHostedConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateHostedConnectionRequestMarshaller()
                        .marshall(allocateHostedConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AllocateHostedConnectionResult, JsonUnmarshallerContext> unmarshaller = new AllocateHostedConnectionResultJsonUnmarshaller();
            JsonResponseHandler<AllocateHostedConnectionResult> responseHandler = new JsonResponseHandler<AllocateHostedConnectionResult>(
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
    public AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(
            AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(allocatePrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocatePrivateVirtualInterfaceRequest> request = null;
        Response<AllocatePrivateVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocatePrivateVirtualInterfaceRequestMarshaller()
                        .marshall(allocatePrivateVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AllocatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new AllocatePrivateVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<AllocatePrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AllocatePrivateVirtualInterfaceResult>(
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
    public AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(
            AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(allocatePublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocatePublicVirtualInterfaceRequest> request = null;
        Response<AllocatePublicVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocatePublicVirtualInterfaceRequestMarshaller()
                        .marshall(allocatePublicVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AllocatePublicVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new AllocatePublicVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<AllocatePublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AllocatePublicVirtualInterfaceResult>(
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
    public AllocateTransitVirtualInterfaceResult allocateTransitVirtualInterface(
            AllocateTransitVirtualInterfaceRequest allocateTransitVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(allocateTransitVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateTransitVirtualInterfaceRequest> request = null;
        Response<AllocateTransitVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateTransitVirtualInterfaceRequestMarshaller()
                        .marshall(allocateTransitVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AllocateTransitVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new AllocateTransitVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<AllocateTransitVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AllocateTransitVirtualInterfaceResult>(
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
    public AssociateConnectionWithLagResult associateConnectionWithLag(
            AssociateConnectionWithLagRequest associateConnectionWithLagRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateConnectionWithLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateConnectionWithLagRequest> request = null;
        Response<AssociateConnectionWithLagResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateConnectionWithLagRequestMarshaller()
                        .marshall(associateConnectionWithLagRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateConnectionWithLagResult, JsonUnmarshallerContext> unmarshaller = new AssociateConnectionWithLagResultJsonUnmarshaller();
            JsonResponseHandler<AssociateConnectionWithLagResult> responseHandler = new JsonResponseHandler<AssociateConnectionWithLagResult>(
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
    public AssociateHostedConnectionResult associateHostedConnection(
            AssociateHostedConnectionRequest associateHostedConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateHostedConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateHostedConnectionRequest> request = null;
        Response<AssociateHostedConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateHostedConnectionRequestMarshaller()
                        .marshall(associateHostedConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateHostedConnectionResult, JsonUnmarshallerContext> unmarshaller = new AssociateHostedConnectionResultJsonUnmarshaller();
            JsonResponseHandler<AssociateHostedConnectionResult> responseHandler = new JsonResponseHandler<AssociateHostedConnectionResult>(
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
    public AssociateVirtualInterfaceResult associateVirtualInterface(
            AssociateVirtualInterfaceRequest associateVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateVirtualInterfaceRequest> request = null;
        Response<AssociateVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateVirtualInterfaceRequestMarshaller()
                        .marshall(associateVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new AssociateVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<AssociateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<AssociateVirtualInterfaceResult>(
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
    public ConfirmConnectionResult confirmConnection(
            ConfirmConnectionRequest confirmConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmConnectionRequest> request = null;
        Response<ConfirmConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmConnectionRequestMarshaller()
                        .marshall(confirmConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmConnectionResult, JsonUnmarshallerContext> unmarshaller = new ConfirmConnectionResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmConnectionResult> responseHandler = new JsonResponseHandler<ConfirmConnectionResult>(
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
    public ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(
            ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmPrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmPrivateVirtualInterfaceRequest> request = null;
        Response<ConfirmPrivateVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmPrivateVirtualInterfaceRequestMarshaller()
                        .marshall(confirmPrivateVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmPrivateVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new ConfirmPrivateVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmPrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<ConfirmPrivateVirtualInterfaceResult>(
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
    public ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(
            ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmPublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmPublicVirtualInterfaceRequest> request = null;
        Response<ConfirmPublicVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmPublicVirtualInterfaceRequestMarshaller()
                        .marshall(confirmPublicVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmPublicVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new ConfirmPublicVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmPublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<ConfirmPublicVirtualInterfaceResult>(
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
    public ConfirmTransitVirtualInterfaceResult confirmTransitVirtualInterface(
            ConfirmTransitVirtualInterfaceRequest confirmTransitVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmTransitVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmTransitVirtualInterfaceRequest> request = null;
        Response<ConfirmTransitVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmTransitVirtualInterfaceRequestMarshaller()
                        .marshall(confirmTransitVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ConfirmTransitVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new ConfirmTransitVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<ConfirmTransitVirtualInterfaceResult> responseHandler = new JsonResponseHandler<ConfirmTransitVirtualInterfaceResult>(
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
    public CreateBGPPeerResult createBGPPeer(CreateBGPPeerRequest createBGPPeerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBGPPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBGPPeerRequest> request = null;
        Response<CreateBGPPeerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBGPPeerRequestMarshaller().marshall(createBGPPeerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBGPPeerResult, JsonUnmarshallerContext> unmarshaller = new CreateBGPPeerResultJsonUnmarshaller();
            JsonResponseHandler<CreateBGPPeerResult> responseHandler = new JsonResponseHandler<CreateBGPPeerResult>(
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
    public CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionRequest> request = null;
        Response<CreateConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionRequestMarshaller().marshall(createConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateConnectionResult, JsonUnmarshallerContext> unmarshaller = new CreateConnectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateConnectionResult> responseHandler = new JsonResponseHandler<CreateConnectionResult>(
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
    public CreateDirectConnectGatewayResult createDirectConnectGateway(
            CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDirectConnectGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectConnectGatewayRequest> request = null;
        Response<CreateDirectConnectGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectConnectGatewayRequestMarshaller()
                        .marshall(createDirectConnectGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDirectConnectGatewayResult, JsonUnmarshallerContext> unmarshaller = new CreateDirectConnectGatewayResultJsonUnmarshaller();
            JsonResponseHandler<CreateDirectConnectGatewayResult> responseHandler = new JsonResponseHandler<CreateDirectConnectGatewayResult>(
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
    public CreateDirectConnectGatewayAssociationResult createDirectConnectGatewayAssociation(
            CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDirectConnectGatewayAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectConnectGatewayAssociationRequest> request = null;
        Response<CreateDirectConnectGatewayAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectConnectGatewayAssociationRequestMarshaller()
                        .marshall(createDirectConnectGatewayAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDirectConnectGatewayAssociationResult, JsonUnmarshallerContext> unmarshaller = new CreateDirectConnectGatewayAssociationResultJsonUnmarshaller();
            JsonResponseHandler<CreateDirectConnectGatewayAssociationResult> responseHandler = new JsonResponseHandler<CreateDirectConnectGatewayAssociationResult>(
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
    public CreateDirectConnectGatewayAssociationProposalResult createDirectConnectGatewayAssociationProposal(
            CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDirectConnectGatewayAssociationProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectConnectGatewayAssociationProposalRequest> request = null;
        Response<CreateDirectConnectGatewayAssociationProposalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectConnectGatewayAssociationProposalRequestMarshaller()
                        .marshall(createDirectConnectGatewayAssociationProposalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDirectConnectGatewayAssociationProposalResult, JsonUnmarshallerContext> unmarshaller = new CreateDirectConnectGatewayAssociationProposalResultJsonUnmarshaller();
            JsonResponseHandler<CreateDirectConnectGatewayAssociationProposalResult> responseHandler = new JsonResponseHandler<CreateDirectConnectGatewayAssociationProposalResult>(
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
    public CreateInterconnectResult createInterconnect(
            CreateInterconnectRequest createInterconnectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInterconnectRequest> request = null;
        Response<CreateInterconnectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInterconnectRequestMarshaller()
                        .marshall(createInterconnectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInterconnectResult, JsonUnmarshallerContext> unmarshaller = new CreateInterconnectResultJsonUnmarshaller();
            JsonResponseHandler<CreateInterconnectResult> responseHandler = new JsonResponseHandler<CreateInterconnectResult>(
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
    public CreateLagResult createLag(CreateLagRequest createLagRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLagRequest> request = null;
        Response<CreateLagResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLagRequestMarshaller().marshall(createLagRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateLagResult, JsonUnmarshallerContext> unmarshaller = new CreateLagResultJsonUnmarshaller();
            JsonResponseHandler<CreateLagResult> responseHandler = new JsonResponseHandler<CreateLagResult>(
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
    public CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(
            CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePrivateVirtualInterfaceRequest> request = null;
        Response<CreatePrivateVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePrivateVirtualInterfaceRequestMarshaller()
                        .marshall(createPrivateVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new CreatePrivateVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<CreatePrivateVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreatePrivateVirtualInterfaceResult>(
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
    public CreatePublicVirtualInterfaceResult createPublicVirtualInterface(
            CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePublicVirtualInterfaceRequest> request = null;
        Response<CreatePublicVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePublicVirtualInterfaceRequestMarshaller()
                        .marshall(createPublicVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePublicVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new CreatePublicVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<CreatePublicVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreatePublicVirtualInterfaceResult>(
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
    public CreateTransitVirtualInterfaceResult createTransitVirtualInterface(
            CreateTransitVirtualInterfaceRequest createTransitVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTransitVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTransitVirtualInterfaceRequest> request = null;
        Response<CreateTransitVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTransitVirtualInterfaceRequestMarshaller()
                        .marshall(createTransitVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTransitVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new CreateTransitVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<CreateTransitVirtualInterfaceResult> responseHandler = new JsonResponseHandler<CreateTransitVirtualInterfaceResult>(
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
    public DeleteBGPPeerResult deleteBGPPeer(DeleteBGPPeerRequest deleteBGPPeerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBGPPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBGPPeerRequest> request = null;
        Response<DeleteBGPPeerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBGPPeerRequestMarshaller().marshall(deleteBGPPeerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBGPPeerResult, JsonUnmarshallerContext> unmarshaller = new DeleteBGPPeerResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBGPPeerResult> responseHandler = new JsonResponseHandler<DeleteBGPPeerResult>(
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
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestMarshaller().marshall(deleteConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteConnectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteConnectionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteConnectionResult> responseHandler = new JsonResponseHandler<DeleteConnectionResult>(
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
    public DeleteDirectConnectGatewayResult deleteDirectConnectGateway(
            DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDirectConnectGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectConnectGatewayRequest> request = null;
        Response<DeleteDirectConnectGatewayResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectConnectGatewayRequestMarshaller()
                        .marshall(deleteDirectConnectGatewayRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDirectConnectGatewayResult, JsonUnmarshallerContext> unmarshaller = new DeleteDirectConnectGatewayResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDirectConnectGatewayResult> responseHandler = new JsonResponseHandler<DeleteDirectConnectGatewayResult>(
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
    public DeleteDirectConnectGatewayAssociationResult deleteDirectConnectGatewayAssociation(
            DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDirectConnectGatewayAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectConnectGatewayAssociationRequest> request = null;
        Response<DeleteDirectConnectGatewayAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectConnectGatewayAssociationRequestMarshaller()
                        .marshall(deleteDirectConnectGatewayAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDirectConnectGatewayAssociationResult, JsonUnmarshallerContext> unmarshaller = new DeleteDirectConnectGatewayAssociationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDirectConnectGatewayAssociationResult> responseHandler = new JsonResponseHandler<DeleteDirectConnectGatewayAssociationResult>(
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
    public DeleteDirectConnectGatewayAssociationProposalResult deleteDirectConnectGatewayAssociationProposal(
            DeleteDirectConnectGatewayAssociationProposalRequest deleteDirectConnectGatewayAssociationProposalRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDirectConnectGatewayAssociationProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectConnectGatewayAssociationProposalRequest> request = null;
        Response<DeleteDirectConnectGatewayAssociationProposalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectConnectGatewayAssociationProposalRequestMarshaller()
                        .marshall(deleteDirectConnectGatewayAssociationProposalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDirectConnectGatewayAssociationProposalResult, JsonUnmarshallerContext> unmarshaller = new DeleteDirectConnectGatewayAssociationProposalResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDirectConnectGatewayAssociationProposalResult> responseHandler = new JsonResponseHandler<DeleteDirectConnectGatewayAssociationProposalResult>(
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
    public DeleteInterconnectResult deleteInterconnect(
            DeleteInterconnectRequest deleteInterconnectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInterconnectRequest> request = null;
        Response<DeleteInterconnectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInterconnectRequestMarshaller()
                        .marshall(deleteInterconnectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInterconnectResult, JsonUnmarshallerContext> unmarshaller = new DeleteInterconnectResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInterconnectResult> responseHandler = new JsonResponseHandler<DeleteInterconnectResult>(
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
    public DeleteLagResult deleteLag(DeleteLagRequest deleteLagRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLagRequest> request = null;
        Response<DeleteLagResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLagRequestMarshaller().marshall(deleteLagRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteLagResult, JsonUnmarshallerContext> unmarshaller = new DeleteLagResultJsonUnmarshaller();
            JsonResponseHandler<DeleteLagResult> responseHandler = new JsonResponseHandler<DeleteLagResult>(
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
    public DeleteVirtualInterfaceResult deleteVirtualInterface(
            DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualInterfaceRequest> request = null;
        Response<DeleteVirtualInterfaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualInterfaceRequestMarshaller()
                        .marshall(deleteVirtualInterfaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVirtualInterfaceResult, JsonUnmarshallerContext> unmarshaller = new DeleteVirtualInterfaceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVirtualInterfaceResult> responseHandler = new JsonResponseHandler<DeleteVirtualInterfaceResult>(
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
    public DescribeConnectionLoaResult describeConnectionLoa(
            DescribeConnectionLoaRequest describeConnectionLoaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConnectionLoaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionLoaRequest> request = null;
        Response<DescribeConnectionLoaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionLoaRequestMarshaller()
                        .marshall(describeConnectionLoaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeConnectionLoaResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionLoaResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConnectionLoaResult> responseHandler = new JsonResponseHandler<DescribeConnectionLoaResult>(
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
    public DescribeConnectionsResult describeConnections(
            DescribeConnectionsRequest describeConnectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsRequest> request = null;
        Response<DescribeConnectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsRequestMarshaller()
                        .marshall(describeConnectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeConnectionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConnectionsResult> responseHandler = new JsonResponseHandler<DescribeConnectionsResult>(
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
    public DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConnectionsOnInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsOnInterconnectRequest> request = null;
        Response<DescribeConnectionsOnInterconnectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsOnInterconnectRequestMarshaller()
                        .marshall(describeConnectionsOnInterconnectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeConnectionsOnInterconnectResult, JsonUnmarshallerContext> unmarshaller = new DescribeConnectionsOnInterconnectResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConnectionsOnInterconnectResult> responseHandler = new JsonResponseHandler<DescribeConnectionsOnInterconnectResult>(
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
    public DescribeDirectConnectGatewayAssociationProposalsResult describeDirectConnectGatewayAssociationProposals(
            DescribeDirectConnectGatewayAssociationProposalsRequest describeDirectConnectGatewayAssociationProposalsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewayAssociationProposalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewayAssociationProposalsRequest> request = null;
        Response<DescribeDirectConnectGatewayAssociationProposalsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewayAssociationProposalsRequestMarshaller()
                        .marshall(describeDirectConnectGatewayAssociationProposalsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDirectConnectGatewayAssociationProposalsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDirectConnectGatewayAssociationProposalsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDirectConnectGatewayAssociationProposalsResult> responseHandler = new JsonResponseHandler<DescribeDirectConnectGatewayAssociationProposalsResult>(
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
    public DescribeDirectConnectGatewayAssociationsResult describeDirectConnectGatewayAssociations(
            DescribeDirectConnectGatewayAssociationsRequest describeDirectConnectGatewayAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewayAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewayAssociationsRequest> request = null;
        Response<DescribeDirectConnectGatewayAssociationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewayAssociationsRequestMarshaller()
                        .marshall(describeDirectConnectGatewayAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDirectConnectGatewayAssociationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDirectConnectGatewayAssociationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDirectConnectGatewayAssociationsResult> responseHandler = new JsonResponseHandler<DescribeDirectConnectGatewayAssociationsResult>(
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
    public DescribeDirectConnectGatewayAttachmentsResult describeDirectConnectGatewayAttachments(
            DescribeDirectConnectGatewayAttachmentsRequest describeDirectConnectGatewayAttachmentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewayAttachmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewayAttachmentsRequest> request = null;
        Response<DescribeDirectConnectGatewayAttachmentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewayAttachmentsRequestMarshaller()
                        .marshall(describeDirectConnectGatewayAttachmentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDirectConnectGatewayAttachmentsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDirectConnectGatewayAttachmentsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDirectConnectGatewayAttachmentsResult> responseHandler = new JsonResponseHandler<DescribeDirectConnectGatewayAttachmentsResult>(
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
    public DescribeDirectConnectGatewaysResult describeDirectConnectGateways(
            DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewaysRequest> request = null;
        Response<DescribeDirectConnectGatewaysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewaysRequestMarshaller()
                        .marshall(describeDirectConnectGatewaysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDirectConnectGatewaysResult, JsonUnmarshallerContext> unmarshaller = new DescribeDirectConnectGatewaysResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDirectConnectGatewaysResult> responseHandler = new JsonResponseHandler<DescribeDirectConnectGatewaysResult>(
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
    public DescribeHostedConnectionsResult describeHostedConnections(
            DescribeHostedConnectionsRequest describeHostedConnectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHostedConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHostedConnectionsRequest> request = null;
        Response<DescribeHostedConnectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHostedConnectionsRequestMarshaller()
                        .marshall(describeHostedConnectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeHostedConnectionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeHostedConnectionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHostedConnectionsResult> responseHandler = new JsonResponseHandler<DescribeHostedConnectionsResult>(
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
    public DescribeInterconnectLoaResult describeInterconnectLoa(
            DescribeInterconnectLoaRequest describeInterconnectLoaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInterconnectLoaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInterconnectLoaRequest> request = null;
        Response<DescribeInterconnectLoaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInterconnectLoaRequestMarshaller()
                        .marshall(describeInterconnectLoaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInterconnectLoaResult, JsonUnmarshallerContext> unmarshaller = new DescribeInterconnectLoaResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInterconnectLoaResult> responseHandler = new JsonResponseHandler<DescribeInterconnectLoaResult>(
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
    public DescribeInterconnectsResult describeInterconnects(
            DescribeInterconnectsRequest describeInterconnectsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInterconnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInterconnectsRequest> request = null;
        Response<DescribeInterconnectsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInterconnectsRequestMarshaller()
                        .marshall(describeInterconnectsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInterconnectsResult, JsonUnmarshallerContext> unmarshaller = new DescribeInterconnectsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInterconnectsResult> responseHandler = new JsonResponseHandler<DescribeInterconnectsResult>(
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
    public DescribeLagsResult describeLags(DescribeLagsRequest describeLagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLagsRequest> request = null;
        Response<DescribeLagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLagsRequestMarshaller().marshall(describeLagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLagsResult, JsonUnmarshallerContext> unmarshaller = new DescribeLagsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLagsResult> responseHandler = new JsonResponseHandler<DescribeLagsResult>(
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
    public DescribeLoaResult describeLoa(DescribeLoaRequest describeLoaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoaRequest> request = null;
        Response<DescribeLoaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoaRequestMarshaller().marshall(describeLoaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLoaResult, JsonUnmarshallerContext> unmarshaller = new DescribeLoaResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLoaResult> responseHandler = new JsonResponseHandler<DescribeLoaResult>(
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
    public DescribeLocationsResult describeLocations(
            DescribeLocationsRequest describeLocationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationsRequest> request = null;
        Response<DescribeLocationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationsRequestMarshaller()
                        .marshall(describeLocationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLocationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeLocationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLocationsResult> responseHandler = new JsonResponseHandler<DescribeLocationsResult>(
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
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller().marshall(describeTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTagsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTagsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTagsResult> responseHandler = new JsonResponseHandler<DescribeTagsResult>(
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
    public DescribeVirtualGatewaysResult describeVirtualGateways(
            DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeVirtualGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualGatewaysRequest> request = null;
        Response<DescribeVirtualGatewaysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualGatewaysRequestMarshaller()
                        .marshall(describeVirtualGatewaysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVirtualGatewaysResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualGatewaysResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVirtualGatewaysResult> responseHandler = new JsonResponseHandler<DescribeVirtualGatewaysResult>(
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
    public DescribeVirtualInterfacesResult describeVirtualInterfaces(
            DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeVirtualInterfacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualInterfacesRequest> request = null;
        Response<DescribeVirtualInterfacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualInterfacesRequestMarshaller()
                        .marshall(describeVirtualInterfacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeVirtualInterfacesResult, JsonUnmarshallerContext> unmarshaller = new DescribeVirtualInterfacesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeVirtualInterfacesResult> responseHandler = new JsonResponseHandler<DescribeVirtualInterfacesResult>(
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
    public DisassociateConnectionFromLagResult disassociateConnectionFromLag(
            DisassociateConnectionFromLagRequest disassociateConnectionFromLagRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateConnectionFromLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateConnectionFromLagRequest> request = null;
        Response<DisassociateConnectionFromLagResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateConnectionFromLagRequestMarshaller()
                        .marshall(disassociateConnectionFromLagRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateConnectionFromLagResult, JsonUnmarshallerContext> unmarshaller = new DisassociateConnectionFromLagResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateConnectionFromLagResult> responseHandler = new JsonResponseHandler<DisassociateConnectionFromLagResult>(
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
    public ListVirtualInterfaceTestHistoryResult listVirtualInterfaceTestHistory(
            ListVirtualInterfaceTestHistoryRequest listVirtualInterfaceTestHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVirtualInterfaceTestHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualInterfaceTestHistoryRequest> request = null;
        Response<ListVirtualInterfaceTestHistoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualInterfaceTestHistoryRequestMarshaller()
                        .marshall(listVirtualInterfaceTestHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVirtualInterfaceTestHistoryResult, JsonUnmarshallerContext> unmarshaller = new ListVirtualInterfaceTestHistoryResultJsonUnmarshaller();
            JsonResponseHandler<ListVirtualInterfaceTestHistoryResult> responseHandler = new JsonResponseHandler<ListVirtualInterfaceTestHistoryResult>(
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
    public StartBgpFailoverTestResult startBgpFailoverTest(
            StartBgpFailoverTestRequest startBgpFailoverTestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startBgpFailoverTestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBgpFailoverTestRequest> request = null;
        Response<StartBgpFailoverTestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBgpFailoverTestRequestMarshaller()
                        .marshall(startBgpFailoverTestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartBgpFailoverTestResult, JsonUnmarshallerContext> unmarshaller = new StartBgpFailoverTestResultJsonUnmarshaller();
            JsonResponseHandler<StartBgpFailoverTestResult> responseHandler = new JsonResponseHandler<StartBgpFailoverTestResult>(
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
    public StopBgpFailoverTestResult stopBgpFailoverTest(
            StopBgpFailoverTestRequest stopBgpFailoverTestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopBgpFailoverTestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopBgpFailoverTestRequest> request = null;
        Response<StopBgpFailoverTestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopBgpFailoverTestRequestMarshaller()
                        .marshall(stopBgpFailoverTestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopBgpFailoverTestResult, JsonUnmarshallerContext> unmarshaller = new StopBgpFailoverTestResultJsonUnmarshaller();
            JsonResponseHandler<StopBgpFailoverTestResult> responseHandler = new JsonResponseHandler<StopBgpFailoverTestResult>(
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
    public UpdateDirectConnectGatewayAssociationResult updateDirectConnectGatewayAssociation(
            UpdateDirectConnectGatewayAssociationRequest updateDirectConnectGatewayAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDirectConnectGatewayAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDirectConnectGatewayAssociationRequest> request = null;
        Response<UpdateDirectConnectGatewayAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDirectConnectGatewayAssociationRequestMarshaller()
                        .marshall(updateDirectConnectGatewayAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDirectConnectGatewayAssociationResult, JsonUnmarshallerContext> unmarshaller = new UpdateDirectConnectGatewayAssociationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDirectConnectGatewayAssociationResult> responseHandler = new JsonResponseHandler<UpdateDirectConnectGatewayAssociationResult>(
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
    public UpdateLagResult updateLag(UpdateLagRequest updateLagRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLagRequest> request = null;
        Response<UpdateLagResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLagRequestMarshaller().marshall(updateLagRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateLagResult, JsonUnmarshallerContext> unmarshaller = new UpdateLagResultJsonUnmarshaller();
            JsonResponseHandler<UpdateLagResult> responseHandler = new JsonResponseHandler<UpdateLagResult>(
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
    public UpdateVirtualInterfaceAttributesResult updateVirtualInterfaceAttributes(
            UpdateVirtualInterfaceAttributesRequest updateVirtualInterfaceAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVirtualInterfaceAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualInterfaceAttributesRequest> request = null;
        Response<UpdateVirtualInterfaceAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualInterfaceAttributesRequestMarshaller()
                        .marshall(updateVirtualInterfaceAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVirtualInterfaceAttributesResult, JsonUnmarshallerContext> unmarshaller = new UpdateVirtualInterfaceAttributesResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVirtualInterfaceAttributesResult> responseHandler = new JsonResponseHandler<UpdateVirtualInterfaceAttributesResult>(
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
