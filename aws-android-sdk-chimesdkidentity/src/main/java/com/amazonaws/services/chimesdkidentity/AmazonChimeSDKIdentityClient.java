/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity;

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

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.services.chimesdkidentity.model.transform.*;

/**
 * Client for accessing Amazon ChimeSDK Identity. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * The Amazon Chime SDK Identity APIs in this section allow software developers
 * to create and manage unique instances of their messaging applications. These
 * APIs provide the overarching framework for creating and sending messages. For
 * more information about the identity APIs, refer to <a href=
 * "https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Identity.html"
 * >Amazon Chime SDK identity</a>.
 * </p>
 */
public class AmazonChimeSDKIdentityClient extends AmazonWebServiceClient implements
        AmazonChimeSDKIdentity {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon ChimeSDK Identity
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AmazonChimeSDKIdentityClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *            how this client connects to AmazonChimeSDKIdentity (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonChimeSDKIdentityClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity using the specified AWS account credentials.
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
     *         AmazonChimeSDKIdentityClient client = new AmazonChimeSDKIdentityClient(AWSMobileClient
     *                 .getInstance());
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
    public AmazonChimeSDKIdentityClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity using the specified AWS account credentials and
     * client configuration options.
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
     *         AmazonChimeSDKIdentityClient client = new AmazonChimeSDKIdentityClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AmazonChimeSDKIdentity (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonChimeSDKIdentityClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity using the specified AWS account credentials
     * provider.
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
     *         AmazonChimeSDKIdentityClient client = new AmazonChimeSDKIdentityClient(AWSMobileClient
     *                 .getInstance());
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
    public AmazonChimeSDKIdentityClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity using the specified AWS account credentials
     * provider and client configuration options.
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
     *         AmazonChimeSDKIdentityClient client = new AmazonChimeSDKIdentityClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AmazonChimeSDKIdentity (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonChimeSDKIdentityClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonChimeSDKIdentity (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonChimeSDKIdentityClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKIdentity using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
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
     *         AmazonChimeSDKIdentityClient client = new AmazonChimeSDKIdentityClient(AWSMobileClient
     *                 .getInstance());
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
     *            how this client connects to AmazonChimeSDKIdentity (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonChimeSDKIdentityClient(AWSCredentialsProvider awsCredentialsProvider,
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
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottledClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        setServiceNameIntern("chime");
        this.setEndpoint("identity-chime.us-east-1.amazonaws.com");
        this.endpointPrefix = "identity-chime";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/chimesdkidentity/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/chimesdkidentity/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates an Amazon Chime SDK messaging <code>AppInstance</code> under an
     * AWS account. Only SDK messaging customers use this API.
     * <code>CreateAppInstance</code> supports idempotency behavior as described
     * in the AWS API Standard.
     * </p>
     * <p>
     * identity
     * </p>
     * 
     * @param createAppInstanceRequest
     * @return createAppInstanceResult The response from the CreateAppInstance
     *         service method, as returned by Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateAppInstanceResult createAppInstance(
            CreateAppInstanceRequest createAppInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppInstanceRequest> request = null;
        Response<CreateAppInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppInstanceRequestMarshaller()
                        .marshall(createAppInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAppInstanceResult, JsonUnmarshallerContext> unmarshaller = new CreateAppInstanceResultJsonUnmarshaller();
            JsonResponseHandler<CreateAppInstanceResult> responseHandler = new JsonResponseHandler<CreateAppInstanceResult>(
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
     * Promotes an <code>AppInstanceUser</code> to an
     * <code>AppInstanceAdmin</code>. The promoted user can perform the
     * following actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChannelModerator</code> actions across all channels in the
     * <code>AppInstance</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteChannelMessage</code> actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only an <code>AppInstanceUser</code> can be promoted to an
     * <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @return createAppInstanceAdminResult The response from the
     *         CreateAppInstanceAdmin service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateAppInstanceAdminResult createAppInstanceAdmin(
            CreateAppInstanceAdminRequest createAppInstanceAdminRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAppInstanceAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppInstanceAdminRequest> request = null;
        Response<CreateAppInstanceAdminResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppInstanceAdminRequestMarshaller()
                        .marshall(createAppInstanceAdminRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAppInstanceAdminResult, JsonUnmarshallerContext> unmarshaller = new CreateAppInstanceAdminResultJsonUnmarshaller();
            JsonResponseHandler<CreateAppInstanceAdminResult> responseHandler = new JsonResponseHandler<CreateAppInstanceAdminResult>(
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
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The
     * request consists of a unique <code>appInstanceUserId</code> and
     * <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @return createAppInstanceUserResult The response from the
     *         CreateAppInstanceUser service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateAppInstanceUserResult createAppInstanceUser(
            CreateAppInstanceUserRequest createAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppInstanceUserRequest> request = null;
        Response<CreateAppInstanceUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppInstanceUserRequestMarshaller()
                        .marshall(createAppInstanceUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAppInstanceUserResult, JsonUnmarshallerContext> unmarshaller = new CreateAppInstanceUserResultJsonUnmarshaller();
            JsonResponseHandler<CreateAppInstanceUserResult> responseHandler = new JsonResponseHandler<CreateAppInstanceUserResult>(
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
     * Deletes an <code>AppInstance</code> and all associated data
     * asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteAppInstance(DeleteAppInstanceRequest deleteAppInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppInstanceRequestMarshaller()
                        .marshall(deleteAppInstanceRequest);
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
     * Demotes an <code>AppInstanceAdmin</code> to an
     * <code>AppInstanceUser</code>. This action does not delete the user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteAppInstanceAdmin(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAppInstanceAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppInstanceAdminRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppInstanceAdminRequestMarshaller()
                        .marshall(deleteAppInstanceAdminRequest);
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
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteAppInstanceUser(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppInstanceUserRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppInstanceUserRequestMarshaller()
                        .marshall(deleteAppInstanceUserRequest);
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
     * Deregisters an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param deregisterAppInstanceUserEndpointRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deregisterAppInstanceUserEndpoint(
            DeregisterAppInstanceUserEndpointRequest deregisterAppInstanceUserEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterAppInstanceUserEndpointRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterAppInstanceUserEndpointRequestMarshaller()
                        .marshall(deregisterAppInstanceUserEndpointRequest);
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
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @return describeAppInstanceResult The response from the
     *         DescribeAppInstance service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAppInstanceResult describeAppInstance(
            DescribeAppInstanceRequest describeAppInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceRequest> request = null;
        Response<DescribeAppInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceRequestMarshaller()
                        .marshall(describeAppInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAppInstanceResult, JsonUnmarshallerContext> unmarshaller = new DescribeAppInstanceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAppInstanceResult> responseHandler = new JsonResponseHandler<DescribeAppInstanceResult>(
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
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @return describeAppInstanceAdminResult The response from the
     *         DescribeAppInstanceAdmin service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAppInstanceAdminResult describeAppInstanceAdmin(
            DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAppInstanceAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceAdminRequest> request = null;
        Response<DescribeAppInstanceAdminResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceAdminRequestMarshaller()
                        .marshall(describeAppInstanceAdminRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAppInstanceAdminResult, JsonUnmarshallerContext> unmarshaller = new DescribeAppInstanceAdminResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAppInstanceAdminResult> responseHandler = new JsonResponseHandler<DescribeAppInstanceAdminResult>(
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
     * Returns the full details of an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @return describeAppInstanceUserResult The response from the
     *         DescribeAppInstanceUser service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAppInstanceUserResult describeAppInstanceUser(
            DescribeAppInstanceUserRequest describeAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceUserRequest> request = null;
        Response<DescribeAppInstanceUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceUserRequestMarshaller()
                        .marshall(describeAppInstanceUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAppInstanceUserResult, JsonUnmarshallerContext> unmarshaller = new DescribeAppInstanceUserResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAppInstanceUserResult> responseHandler = new JsonResponseHandler<DescribeAppInstanceUserResult>(
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
     * Returns the full details of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param describeAppInstanceUserEndpointRequest
     * @return describeAppInstanceUserEndpointResult The response from the
     *         DescribeAppInstanceUserEndpoint service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAppInstanceUserEndpointResult describeAppInstanceUserEndpoint(
            DescribeAppInstanceUserEndpointRequest describeAppInstanceUserEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceUserEndpointRequest> request = null;
        Response<DescribeAppInstanceUserEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceUserEndpointRequestMarshaller()
                        .marshall(describeAppInstanceUserEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAppInstanceUserEndpointResult, JsonUnmarshallerContext> unmarshaller = new DescribeAppInstanceUserEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAppInstanceUserEndpointResult> responseHandler = new JsonResponseHandler<DescribeAppInstanceUserEndpointResult>(
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
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @return getAppInstanceRetentionSettingsResult The response from the
     *         GetAppInstanceRetentionSettings service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetAppInstanceRetentionSettingsResult getAppInstanceRetentionSettings(
            GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAppInstanceRetentionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppInstanceRetentionSettingsRequest> request = null;
        Response<GetAppInstanceRetentionSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppInstanceRetentionSettingsRequestMarshaller()
                        .marshall(getAppInstanceRetentionSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAppInstanceRetentionSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetAppInstanceRetentionSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetAppInstanceRetentionSettingsResult> responseHandler = new JsonResponseHandler<GetAppInstanceRetentionSettingsResult>(
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
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @return listAppInstanceAdminsResult The response from the
     *         ListAppInstanceAdmins service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAppInstanceAdminsResult listAppInstanceAdmins(
            ListAppInstanceAdminsRequest listAppInstanceAdminsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAppInstanceAdminsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstanceAdminsRequest> request = null;
        Response<ListAppInstanceAdminsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstanceAdminsRequestMarshaller()
                        .marshall(listAppInstanceAdminsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAppInstanceAdminsResult, JsonUnmarshallerContext> unmarshaller = new ListAppInstanceAdminsResultJsonUnmarshaller();
            JsonResponseHandler<ListAppInstanceAdminsResult> responseHandler = new JsonResponseHandler<ListAppInstanceAdminsResult>(
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
     * Lists all the <code>AppInstanceUserEndpoints</code> created under a
     * single <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param listAppInstanceUserEndpointsRequest
     * @return listAppInstanceUserEndpointsResult The response from the
     *         ListAppInstanceUserEndpoints service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAppInstanceUserEndpointsResult listAppInstanceUserEndpoints(
            ListAppInstanceUserEndpointsRequest listAppInstanceUserEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAppInstanceUserEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstanceUserEndpointsRequest> request = null;
        Response<ListAppInstanceUserEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstanceUserEndpointsRequestMarshaller()
                        .marshall(listAppInstanceUserEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAppInstanceUserEndpointsResult, JsonUnmarshallerContext> unmarshaller = new ListAppInstanceUserEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<ListAppInstanceUserEndpointsResult> responseHandler = new JsonResponseHandler<ListAppInstanceUserEndpointsResult>(
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
     * List all <code>AppInstanceUsers</code> created under a single
     * <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @return listAppInstanceUsersResult The response from the
     *         ListAppInstanceUsers service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAppInstanceUsersResult listAppInstanceUsers(
            ListAppInstanceUsersRequest listAppInstanceUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAppInstanceUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstanceUsersRequest> request = null;
        Response<ListAppInstanceUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstanceUsersRequestMarshaller()
                        .marshall(listAppInstanceUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAppInstanceUsersResult, JsonUnmarshallerContext> unmarshaller = new ListAppInstanceUsersResultJsonUnmarshaller();
            JsonResponseHandler<ListAppInstanceUsersResult> responseHandler = new JsonResponseHandler<ListAppInstanceUsersResult>(
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
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single
     * AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @return listAppInstancesResult The response from the ListAppInstances
     *         service method, as returned by Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAppInstancesResult listAppInstances(ListAppInstancesRequest listAppInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAppInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstancesRequest> request = null;
        Response<ListAppInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstancesRequestMarshaller().marshall(listAppInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAppInstancesResult, JsonUnmarshallerContext> unmarshaller = new ListAppInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListAppInstancesResult> responseHandler = new JsonResponseHandler<ListAppInstancesResult>(
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
     * Lists the tags applied to an Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Sets the amount of time in days that a given <code>AppInstance</code>
     * retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @return putAppInstanceRetentionSettingsResult The response from the
     *         PutAppInstanceRetentionSettings service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PutAppInstanceRetentionSettingsResult putAppInstanceRetentionSettings(
            PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putAppInstanceRetentionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAppInstanceRetentionSettingsRequest> request = null;
        Response<PutAppInstanceRetentionSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAppInstanceRetentionSettingsRequestMarshaller()
                        .marshall(putAppInstanceRetentionSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutAppInstanceRetentionSettingsResult, JsonUnmarshallerContext> unmarshaller = new PutAppInstanceRetentionSettingsResultJsonUnmarshaller();
            JsonResponseHandler<PutAppInstanceRetentionSettingsResult> responseHandler = new JsonResponseHandler<PutAppInstanceRetentionSettingsResult>(
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
     * Registers an endpoint under an Amazon Chime <code>AppInstanceUser</code>.
     * The endpoint receives messages for a user. For push notifications, the
     * endpoint is a mobile device used to receive mobile push notifications for
     * a user.
     * </p>
     * 
     * @param registerAppInstanceUserEndpointRequest
     * @return registerAppInstanceUserEndpointResult The response from the
     *         RegisterAppInstanceUserEndpoint service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RegisterAppInstanceUserEndpointResult registerAppInstanceUserEndpoint(
            RegisterAppInstanceUserEndpointRequest registerAppInstanceUserEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterAppInstanceUserEndpointRequest> request = null;
        Response<RegisterAppInstanceUserEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterAppInstanceUserEndpointRequestMarshaller()
                        .marshall(registerAppInstanceUserEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterAppInstanceUserEndpointResult, JsonUnmarshallerContext> unmarshaller = new RegisterAppInstanceUserEndpointResultJsonUnmarshaller();
            JsonResponseHandler<RegisterAppInstanceUserEndpointResult> responseHandler = new JsonResponseHandler<RegisterAppInstanceUserEndpointResult>(
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
     * Applies the specified tags to the specified Amazon Chime SDK identity
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Removes the specified tags from the specified Amazon Chime SDK identity
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @return updateAppInstanceResult The response from the UpdateAppInstance
     *         service method, as returned by Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateAppInstanceResult updateAppInstance(
            UpdateAppInstanceRequest updateAppInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppInstanceRequest> request = null;
        Response<UpdateAppInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppInstanceRequestMarshaller()
                        .marshall(updateAppInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAppInstanceResult, JsonUnmarshallerContext> unmarshaller = new UpdateAppInstanceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAppInstanceResult> responseHandler = new JsonResponseHandler<UpdateAppInstanceResult>(
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
     * Updates the details of an <code>AppInstanceUser</code>. You can update
     * names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @return updateAppInstanceUserResult The response from the
     *         UpdateAppInstanceUser service method, as returned by Amazon
     *         ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateAppInstanceUserResult updateAppInstanceUser(
            UpdateAppInstanceUserRequest updateAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppInstanceUserRequest> request = null;
        Response<UpdateAppInstanceUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppInstanceUserRequestMarshaller()
                        .marshall(updateAppInstanceUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAppInstanceUserResult, JsonUnmarshallerContext> unmarshaller = new UpdateAppInstanceUserResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAppInstanceUserResult> responseHandler = new JsonResponseHandler<UpdateAppInstanceUserResult>(
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
     * Updates the details of an <code>AppInstanceUserEndpoint</code>. You can
     * update the name and <code>AllowMessage</code> values.
     * </p>
     * 
     * @param updateAppInstanceUserEndpointRequest
     * @return updateAppInstanceUserEndpointResult The response from the
     *         UpdateAppInstanceUserEndpoint service method, as returned by
     *         Amazon ChimeSDK Identity.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Identity indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateAppInstanceUserEndpointResult updateAppInstanceUserEndpoint(
            UpdateAppInstanceUserEndpointRequest updateAppInstanceUserEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppInstanceUserEndpointRequest> request = null;
        Response<UpdateAppInstanceUserEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppInstanceUserEndpointRequestMarshaller()
                        .marshall(updateAppInstanceUserEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAppInstanceUserEndpointResult, JsonUnmarshallerContext> unmarshaller = new UpdateAppInstanceUserEndpointResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAppInstanceUserEndpointResult> responseHandler = new JsonResponseHandler<UpdateAppInstanceUserEndpointResult>(
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
