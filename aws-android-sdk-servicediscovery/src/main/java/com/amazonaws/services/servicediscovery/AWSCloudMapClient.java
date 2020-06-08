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

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.services.servicediscovery.model.transform.*;

/**
 * Client for accessing AWS Cloud Map. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces
 * that your microservice applications run in. When an instance of the service
 * becomes available, you can call the AWS Cloud Map API to register the
 * instance with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud
 * Map automatically creates DNS records and an optional health check. Clients
 * that submit public or private DNS queries, or HTTP requests, for the service
 * receive an answer that contains up to eight healthy records.
 * </p>
 */
public class AWSCloudMapClient extends AmazonWebServiceClient implements AWSCloudMap {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Cloud Map exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap. A
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
    public AWSCloudMapClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap. A
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
     *            how this client connects to AWSCloudMap (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSCloudMapClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap using
     * the specified AWS account credentials.
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
     *         AWSCloudMapClient client = new AWSCloudMapClient(AWSMobileClient.getInstance());
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
    public AWSCloudMapClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap using
     * the specified AWS account credentials and client configuration options.
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
     *         AWSCloudMapClient client = new AWSCloudMapClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCloudMap (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCloudMapClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap using
     * the specified AWS account credentials provider.
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
     *         AWSCloudMapClient client = new AWSCloudMapClient(AWSMobileClient.getInstance());
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
    public AWSCloudMapClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap using
     * the specified AWS account credentials provider and client configuration
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
     *         AWSCloudMapClient client = new AWSCloudMapClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCloudMap (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCloudMapClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCloudMap (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSCloudMapClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSCloudMap using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
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
     *         AWSCloudMapClient client = new AWSCloudMapClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCloudMap (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSCloudMapClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new CustomHealthNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NamespaceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NamespaceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RequestLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("servicediscovery.us-east-1.amazonaws.com");
        this.endpointPrefix = "servicediscovery";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/servicediscovery/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/servicediscovery/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

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
    public CreateHttpNamespaceResult createHttpNamespace(
            CreateHttpNamespaceRequest createHttpNamespaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createHttpNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHttpNamespaceRequest> request = null;
        Response<CreateHttpNamespaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHttpNamespaceRequestMarshaller()
                        .marshall(createHttpNamespaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateHttpNamespaceResult, JsonUnmarshallerContext> unmarshaller = new CreateHttpNamespaceResultJsonUnmarshaller();
            JsonResponseHandler<CreateHttpNamespaceResult> responseHandler = new JsonResponseHandler<CreateHttpNamespaceResult>(
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
    public CreatePrivateDnsNamespaceResult createPrivateDnsNamespace(
            CreatePrivateDnsNamespaceRequest createPrivateDnsNamespaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPrivateDnsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePrivateDnsNamespaceRequest> request = null;
        Response<CreatePrivateDnsNamespaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePrivateDnsNamespaceRequestMarshaller()
                        .marshall(createPrivateDnsNamespaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePrivateDnsNamespaceResult, JsonUnmarshallerContext> unmarshaller = new CreatePrivateDnsNamespaceResultJsonUnmarshaller();
            JsonResponseHandler<CreatePrivateDnsNamespaceResult> responseHandler = new JsonResponseHandler<CreatePrivateDnsNamespaceResult>(
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
    public CreatePublicDnsNamespaceResult createPublicDnsNamespace(
            CreatePublicDnsNamespaceRequest createPublicDnsNamespaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPublicDnsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePublicDnsNamespaceRequest> request = null;
        Response<CreatePublicDnsNamespaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePublicDnsNamespaceRequestMarshaller()
                        .marshall(createPublicDnsNamespaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePublicDnsNamespaceResult, JsonUnmarshallerContext> unmarshaller = new CreatePublicDnsNamespaceResultJsonUnmarshaller();
            JsonResponseHandler<CreatePublicDnsNamespaceResult> responseHandler = new JsonResponseHandler<CreatePublicDnsNamespaceResult>(
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
    public CreateServiceResult createService(CreateServiceRequest createServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestMarshaller().marshall(createServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateServiceResult, JsonUnmarshallerContext> unmarshaller = new CreateServiceResultJsonUnmarshaller();
            JsonResponseHandler<CreateServiceResult> responseHandler = new JsonResponseHandler<CreateServiceResult>(
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
    public DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNamespaceRequest> request = null;
        Response<DeleteNamespaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNamespaceRequestMarshaller().marshall(deleteNamespaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteNamespaceResult, JsonUnmarshallerContext> unmarshaller = new DeleteNamespaceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteNamespaceResult> responseHandler = new JsonResponseHandler<DeleteNamespaceResult>(
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
    public DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestMarshaller().marshall(deleteServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteServiceResult, JsonUnmarshallerContext> unmarshaller = new DeleteServiceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteServiceResult> responseHandler = new JsonResponseHandler<DeleteServiceResult>(
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
    public DeregisterInstanceResult deregisterInstance(
            DeregisterInstanceRequest deregisterInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterInstanceRequest> request = null;
        Response<DeregisterInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterInstanceRequestMarshaller()
                        .marshall(deregisterInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterInstanceResult, JsonUnmarshallerContext> unmarshaller = new DeregisterInstanceResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterInstanceResult> responseHandler = new JsonResponseHandler<DeregisterInstanceResult>(
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
    public DiscoverInstancesResult discoverInstances(
            DiscoverInstancesRequest discoverInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(discoverInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DiscoverInstancesRequest> request = null;
        Response<DiscoverInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DiscoverInstancesRequestMarshaller()
                        .marshall(discoverInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DiscoverInstancesResult, JsonUnmarshallerContext> unmarshaller = new DiscoverInstancesResultJsonUnmarshaller();
            JsonResponseHandler<DiscoverInstancesResult> responseHandler = new JsonResponseHandler<DiscoverInstancesResult>(
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
    public GetInstanceResult getInstance(GetInstanceRequest getInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceRequest> request = null;
        Response<GetInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceRequestMarshaller().marshall(getInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstanceResult, JsonUnmarshallerContext> unmarshaller = new GetInstanceResultJsonUnmarshaller();
            JsonResponseHandler<GetInstanceResult> responseHandler = new JsonResponseHandler<GetInstanceResult>(
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
    public GetInstancesHealthStatusResult getInstancesHealthStatus(
            GetInstancesHealthStatusRequest getInstancesHealthStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInstancesHealthStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancesHealthStatusRequest> request = null;
        Response<GetInstancesHealthStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancesHealthStatusRequestMarshaller()
                        .marshall(getInstancesHealthStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInstancesHealthStatusResult, JsonUnmarshallerContext> unmarshaller = new GetInstancesHealthStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetInstancesHealthStatusResult> responseHandler = new JsonResponseHandler<GetInstancesHealthStatusResult>(
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
    public GetNamespaceResult getNamespace(GetNamespaceRequest getNamespaceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNamespaceRequest> request = null;
        Response<GetNamespaceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNamespaceRequestMarshaller().marshall(getNamespaceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetNamespaceResult, JsonUnmarshallerContext> unmarshaller = new GetNamespaceResultJsonUnmarshaller();
            JsonResponseHandler<GetNamespaceResult> responseHandler = new JsonResponseHandler<GetNamespaceResult>(
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
    public GetOperationResult getOperation(GetOperationRequest getOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationRequest> request = null;
        Response<GetOperationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationRequestMarshaller().marshall(getOperationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOperationResult, JsonUnmarshallerContext> unmarshaller = new GetOperationResultJsonUnmarshaller();
            JsonResponseHandler<GetOperationResult> responseHandler = new JsonResponseHandler<GetOperationResult>(
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
    public GetServiceResult getService(GetServiceRequest getServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceRequest> request = null;
        Response<GetServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceRequestMarshaller().marshall(getServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetServiceResult, JsonUnmarshallerContext> unmarshaller = new GetServiceResultJsonUnmarshaller();
            JsonResponseHandler<GetServiceResult> responseHandler = new JsonResponseHandler<GetServiceResult>(
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
    public ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestMarshaller().marshall(listInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInstancesResult, JsonUnmarshallerContext> unmarshaller = new ListInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListInstancesResult> responseHandler = new JsonResponseHandler<ListInstancesResult>(
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
    public ListNamespacesResult listNamespaces(ListNamespacesRequest listNamespacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listNamespacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNamespacesRequest> request = null;
        Response<ListNamespacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNamespacesRequestMarshaller().marshall(listNamespacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListNamespacesResult, JsonUnmarshallerContext> unmarshaller = new ListNamespacesResultJsonUnmarshaller();
            JsonResponseHandler<ListNamespacesResult> responseHandler = new JsonResponseHandler<ListNamespacesResult>(
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
    public ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOperationsRequest> request = null;
        Response<ListOperationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOperationsRequestMarshaller().marshall(listOperationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOperationsResult, JsonUnmarshallerContext> unmarshaller = new ListOperationsResultJsonUnmarshaller();
            JsonResponseHandler<ListOperationsResult> responseHandler = new JsonResponseHandler<ListOperationsResult>(
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
    public ListServicesResult listServices(ListServicesRequest listServicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestMarshaller().marshall(listServicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListServicesResult, JsonUnmarshallerContext> unmarshaller = new ListServicesResultJsonUnmarshaller();
            JsonResponseHandler<ListServicesResult> responseHandler = new JsonResponseHandler<ListServicesResult>(
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
    public RegisterInstanceResult registerInstance(RegisterInstanceRequest registerInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterInstanceRequest> request = null;
        Response<RegisterInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterInstanceRequestMarshaller().marshall(registerInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterInstanceResult, JsonUnmarshallerContext> unmarshaller = new RegisterInstanceResultJsonUnmarshaller();
            JsonResponseHandler<RegisterInstanceResult> responseHandler = new JsonResponseHandler<RegisterInstanceResult>(
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
    public void updateInstanceCustomHealthStatus(
            UpdateInstanceCustomHealthStatusRequest updateInstanceCustomHealthStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateInstanceCustomHealthStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceCustomHealthStatusRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceCustomHealthStatusRequestMarshaller()
                        .marshall(updateInstanceCustomHealthStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceRequest> request = null;
        Response<UpdateServiceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceRequestMarshaller().marshall(updateServiceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateServiceResult, JsonUnmarshallerContext> unmarshaller = new UpdateServiceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateServiceResult> responseHandler = new JsonResponseHandler<UpdateServiceResult>(
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
