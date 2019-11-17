/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect;

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

import com.amazonaws.services.connect.model.*;
import com.amazonaws.services.connect.model.transform.*;

/**
 * Client for accessing Amazon Connect. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to
 * set up and manage a customer contact center and provide reliable customer
 * engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides rich metrics and real-time reporting that allow you
 * to optimize contact routing. You can also resolve customer issues more
 * efficiently by putting customers in touch with the right agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can
 * create and limits to the number of requests that you can make per second. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >Amazon Connect Service Limits</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 */
public class AmazonConnectClient extends AmazonWebServiceClient implements AmazonConnect {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Connect exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonConnect. A
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
    public AmazonConnectClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnect. A
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
     *            how this client connects to AmazonConnect (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonConnectClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnect using
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
     *         AmazonConnectClient client = new AmazonConnectClient(AWSMobileClient.getInstance());
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
    public AmazonConnectClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnect using
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
     *         AmazonConnectClient client = new AmazonConnectClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonConnect (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonConnectClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnect using
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
     *         AmazonConnectClient client = new AmazonConnectClient(AWSMobileClient.getInstance());
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
    public AmazonConnectClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnect using
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
     *         AmazonConnectClient client = new AmazonConnectClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonConnect (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonConnectClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnect using
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
     *            how this client connects to AmazonConnect (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonConnectClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnect using
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
     *         AmazonConnectClient client = new AmazonConnectClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonConnect (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonConnectClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ContactNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DestinationNotAllowedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateResourceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OutboundContactNotPermittedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UserNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("connect.us-east-1.amazonaws.com");
        this.endpointPrefix = "connect";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/connect/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/connect/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUserResult createUser(CreateUserRequest createUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestMarshaller().marshall(createUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserResult, JsonUnmarshallerContext> unmarshaller = new CreateUserResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserResult> responseHandler = new JsonResponseHandler<CreateUserResult>(
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
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteUserRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteUser(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(deleteUserRequest);
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
     * Describes the specified user account. You can find the instance ID in the
     * console (it’s the final part of the ARN). The console does not display
     * the user IDs. Instead, list the users and note the IDs provided in the
     * output.
     * </p>
     * 
     * @param describeUserRequest
     * @return describeUserResult The response from the DescribeUser service
     *         method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeUserResult describeUser(DescribeUserRequest describeUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestMarshaller().marshall(describeUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserResult> responseHandler = new JsonResponseHandler<DescribeUserResult>(
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
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return describeUserHierarchyGroupResult The response from the
     *         DescribeUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeUserHierarchyGroupResult describeUserHierarchyGroup(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserHierarchyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserHierarchyGroupRequest> request = null;
        Response<DescribeUserHierarchyGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserHierarchyGroupRequestMarshaller()
                        .marshall(describeUserHierarchyGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserHierarchyGroupResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserHierarchyGroupResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserHierarchyGroupResult> responseHandler = new JsonResponseHandler<DescribeUserHierarchyGroupResult>(
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
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return describeUserHierarchyStructureResult The response from the
     *         DescribeUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeUserHierarchyStructureResult describeUserHierarchyStructure(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserHierarchyStructureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserHierarchyStructureRequest> request = null;
        Response<DescribeUserHierarchyStructureResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserHierarchyStructureRequestMarshaller()
                        .marshall(describeUserHierarchyStructureRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserHierarchyStructureResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserHierarchyStructureResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserHierarchyStructureResult> responseHandler = new JsonResponseHandler<DescribeUserHierarchyStructureResult>(
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
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return getContactAttributesResult The response from the
     *         GetContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetContactAttributesResult getContactAttributes(
            GetContactAttributesRequest getContactAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getContactAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactAttributesRequest> request = null;
        Response<GetContactAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactAttributesRequestMarshaller()
                        .marshall(getContactAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetContactAttributesResult, JsonUnmarshallerContext> unmarshaller = new GetContactAttributesResultJsonUnmarshaller();
            JsonResponseHandler<GetContactAttributesResult> responseHandler = new JsonResponseHandler<GetContactAttributesResult>(
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
     * Gets the real-time metric data from the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-reports.html"
     * >Real-time Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return getCurrentMetricDataResult The response from the
     *         GetCurrentMetricData service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCurrentMetricDataResult getCurrentMetricData(
            GetCurrentMetricDataRequest getCurrentMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCurrentMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCurrentMetricDataRequest> request = null;
        Response<GetCurrentMetricDataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCurrentMetricDataRequestMarshaller()
                        .marshall(getCurrentMetricDataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCurrentMetricDataResult, JsonUnmarshallerContext> unmarshaller = new GetCurrentMetricDataResultJsonUnmarshaller();
            JsonResponseHandler<GetCurrentMetricDataResult> responseHandler = new JsonResponseHandler<GetCurrentMetricDataResult>(
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
     * Retrieves a token for federation.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return getFederationTokenResult The response from the GetFederationToken
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFederationTokenResult getFederationToken(
            GetFederationTokenRequest getFederationTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFederationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFederationTokenRequest> request = null;
        Response<GetFederationTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFederationTokenRequestMarshaller()
                        .marshall(getFederationTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFederationTokenResult, JsonUnmarshallerContext> unmarshaller = new GetFederationTokenResultJsonUnmarshaller();
            JsonResponseHandler<GetFederationTokenResult> responseHandler = new JsonResponseHandler<GetFederationTokenResult>(
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
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics.html"
     * >Historical Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return getMetricDataResult The response from the GetMetricData service
     *         method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMetricDataResult getMetricData(GetMetricDataRequest getMetricDataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricDataRequest> request = null;
        Response<GetMetricDataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricDataRequestMarshaller().marshall(getMetricDataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMetricDataResult, JsonUnmarshallerContext> unmarshaller = new GetMetricDataResultJsonUnmarshaller();
            JsonResponseHandler<GetMetricDataResult> responseHandler = new JsonResponseHandler<GetMetricDataResult>(
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
     * Provides information about the contact flows for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return listContactFlowsResult The response from the ListContactFlows
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListContactFlowsResult listContactFlows(ListContactFlowsRequest listContactFlowsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listContactFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactFlowsRequest> request = null;
        Response<ListContactFlowsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactFlowsRequestMarshaller().marshall(listContactFlowsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListContactFlowsResult, JsonUnmarshallerContext> unmarshaller = new ListContactFlowsResultJsonUnmarshaller();
            JsonResponseHandler<ListContactFlowsResult> responseHandler = new JsonResponseHandler<ListContactFlowsResult>(
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
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return listHoursOfOperationsResult The response from the
     *         ListHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListHoursOfOperationsResult listHoursOfOperations(
            ListHoursOfOperationsRequest listHoursOfOperationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listHoursOfOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHoursOfOperationsRequest> request = null;
        Response<ListHoursOfOperationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHoursOfOperationsRequestMarshaller()
                        .marshall(listHoursOfOperationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListHoursOfOperationsResult, JsonUnmarshallerContext> unmarshaller = new ListHoursOfOperationsResultJsonUnmarshaller();
            JsonResponseHandler<ListHoursOfOperationsResult> responseHandler = new JsonResponseHandler<ListHoursOfOperationsResult>(
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
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return listPhoneNumbersResult The response from the ListPhoneNumbers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumbersRequest> request = null;
        Response<ListPhoneNumbersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumbersRequestMarshaller().marshall(listPhoneNumbersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPhoneNumbersResult, JsonUnmarshallerContext> unmarshaller = new ListPhoneNumbersResultJsonUnmarshaller();
            JsonResponseHandler<ListPhoneNumbersResult> responseHandler = new JsonResponseHandler<ListPhoneNumbersResult>(
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
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listQueuesRequest
     * @return listQueuesResult The response from the ListQueues service method,
     *         as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuesRequestMarshaller().marshall(listQueuesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListQueuesResult, JsonUnmarshallerContext> unmarshaller = new ListQueuesResultJsonUnmarshaller();
            JsonResponseHandler<ListQueuesResult> responseHandler = new JsonResponseHandler<ListQueuesResult>(
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
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return listRoutingProfilesResult The response from the
     *         ListRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRoutingProfilesResult listRoutingProfiles(
            ListRoutingProfilesRequest listRoutingProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRoutingProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoutingProfilesRequest> request = null;
        Response<ListRoutingProfilesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoutingProfilesRequestMarshaller()
                        .marshall(listRoutingProfilesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRoutingProfilesResult, JsonUnmarshallerContext> unmarshaller = new ListRoutingProfilesResultJsonUnmarshaller();
            JsonResponseHandler<ListRoutingProfilesResult> responseHandler = new JsonResponseHandler<ListRoutingProfilesResult>(
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
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return listSecurityProfilesResult The response from the
     *         ListSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSecurityProfilesResult listSecurityProfiles(
            ListSecurityProfilesRequest listSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSecurityProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityProfilesRequest> request = null;
        Response<ListSecurityProfilesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityProfilesRequestMarshaller()
                        .marshall(listSecurityProfilesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSecurityProfilesResult, JsonUnmarshallerContext> unmarshaller = new ListSecurityProfilesResultJsonUnmarshaller();
            JsonResponseHandler<ListSecurityProfilesResult> responseHandler = new JsonResponseHandler<ListSecurityProfilesResult>(
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
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
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
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return listUserHierarchyGroupsResult The response from the
     *         ListUserHierarchyGroups service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListUserHierarchyGroupsResult listUserHierarchyGroups(
            ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUserHierarchyGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserHierarchyGroupsRequest> request = null;
        Response<ListUserHierarchyGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserHierarchyGroupsRequestMarshaller()
                        .marshall(listUserHierarchyGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUserHierarchyGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListUserHierarchyGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListUserHierarchyGroupsResult> responseHandler = new JsonResponseHandler<ListUserHierarchyGroupsResult>(
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
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller().marshall(listUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUsersResult, JsonUnmarshallerContext> unmarshaller = new ListUsersResultJsonUnmarshaller();
            JsonResponseHandler<ListUsersResult> responseHandler = new JsonResponseHandler<ListUsersResult>(
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
     * Initiates a contact flow to place an outbound call to a customer.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * 
     * @param startOutboundVoiceContactRequest
     * @return startOutboundVoiceContactResult The response from the
     *         StartOutboundVoiceContact service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws DestinationNotAllowedException
     * @throws OutboundContactNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartOutboundVoiceContactResult startOutboundVoiceContact(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startOutboundVoiceContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartOutboundVoiceContactRequest> request = null;
        Response<StartOutboundVoiceContactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartOutboundVoiceContactRequestMarshaller()
                        .marshall(startOutboundVoiceContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartOutboundVoiceContactResult, JsonUnmarshallerContext> unmarshaller = new StartOutboundVoiceContactResultJsonUnmarshaller();
            JsonResponseHandler<StartOutboundVoiceContactResult> responseHandler = new JsonResponseHandler<StartOutboundVoiceContactResult>(
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
     * Ends the specified contact.
     * </p>
     * 
     * @param stopContactRequest
     * @return stopContactResult The response from the StopContact service
     *         method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ContactNotFoundException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopContactResult stopContact(StopContactRequest stopContactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopContactRequest> request = null;
        Response<StopContactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopContactRequestMarshaller().marshall(stopContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopContactResult, JsonUnmarshallerContext> unmarshaller = new StopContactResultJsonUnmarshaller();
            JsonResponseHandler<StopContactResult> responseHandler = new JsonResponseHandler<StopContactResult>(
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
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * The supported resource type is users.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
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
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
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
     * Creates or updates the contact attributes associated with the specified
     * contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts.
     * For example, you can update the customer's name or the reason the
     * customer called while the call is active, or add notes about steps that
     * the agent took during the call that are displayed to the next agent that
     * takes the call. You can also update attributes for a contact using data
     * from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal
     * review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for
     * contacts that occurred prior to the release of the API, September 12,
     * 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact
     * that occurred prior to the release of the API, a 400 error is returned.
     * This applies also to queued callbacks that were initiated prior to the
     * release of the API but are still active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return updateContactAttributesResult The response from the
     *         UpdateContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateContactAttributesResult updateContactAttributes(
            UpdateContactAttributesRequest updateContactAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateContactAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactAttributesRequest> request = null;
        Response<UpdateContactAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactAttributesRequestMarshaller()
                        .marshall(updateContactAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateContactAttributesResult, JsonUnmarshallerContext> unmarshaller = new UpdateContactAttributesResultJsonUnmarshaller();
            JsonResponseHandler<UpdateContactAttributesResult> responseHandler = new JsonResponseHandler<UpdateContactAttributesResult>(
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
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateUserHierarchy(UpdateUserHierarchyRequest updateUserHierarchyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserHierarchyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserHierarchyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserHierarchyRequestMarshaller()
                        .marshall(updateUserHierarchyRequest);
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
     * Updates the identity information for the specified user.
     * </p>
     * 
     * @param updateUserIdentityInfoRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateUserIdentityInfo(UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserIdentityInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserIdentityInfoRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserIdentityInfoRequestMarshaller()
                        .marshall(updateUserIdentityInfoRequest);
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
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateUserPhoneConfig(UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserPhoneConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPhoneConfigRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPhoneConfigRequestMarshaller()
                        .marshall(updateUserPhoneConfigRequest);
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
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateUserRoutingProfile(
            UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserRoutingProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRoutingProfileRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRoutingProfileRequestMarshaller()
                        .marshall(updateUserRoutingProfileRequest);
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
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateUserSecurityProfiles(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserSecurityProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserSecurityProfilesRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserSecurityProfilesRequestMarshaller()
                        .marshall(updateUserSecurityProfilesRequest);
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
