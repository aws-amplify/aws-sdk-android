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

package com.amazonaws.services.chime;

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

import com.amazonaws.services.chime.model.*;
import com.amazonaws.services.chime.model.transform.*;

/**
 * Client for accessing Amazon Chime. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * The Amazon Chime API (application programming interface) is designed for
 * developers to perform key tasks, such as creating and managing Amazon Chime
 * accounts, users, and Voice Connectors. This guide provides detailed
 * information about the Amazon Chime API, including operations, types, inputs
 * and outputs, and error codes. It also includes some server-side API actions
 * to use with the Amazon Chime SDK. For more information about the Amazon Chime
 * SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using
 * the Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
 * </p>
 * <p>
 * You can use an AWS SDK, the AWS Command Line Interface (AWS CLI), or the REST
 * API to make API calls. We recommend using an AWS SDK or the AWS CLI. Each API
 * operation includes links to information about using it with a
 * language-specific AWS SDK or the AWS CLI.
 * </p>
 * <dl>
 * <dt>Using an AWS SDK</dt>
 * <dd>
 * <p>
 * You don't need to write code to calculate a signature for request
 * authentication. The SDK clients authenticate your requests by using access
 * keys that you provide. For more information about AWS SDKs, see the <a
 * href="http://aws.amazon.com/developer/">AWS Developer Center</a>.
 * </p>
 * </dd>
 * <dt>Using the AWS CLI</dt>
 * <dd>
 * <p>
 * Use your access keys with the AWS CLI to make API calls. For information
 * about setting up the AWS CLI, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/installing.html"
 * >Installing the AWS Command Line Interface</a> in the <i>AWS Command Line
 * Interface User Guide</i>. For a list of available Amazon Chime commands, see
 * the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/chime/index.html"
 * >Amazon Chime commands</a> in the <i>AWS CLI Command Reference</i>.
 * </p>
 * </dd>
 * <dt>Using REST API</dt>
 * <dd>
 * <p>
 * If you use REST to make API calls, you must authenticate your request by
 * providing a signature. Amazon Chime supports signature version 4. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a> in the <i>Amazon Web Services
 * General Reference</i>.
 * </p>
 * <p>
 * When making REST API calls, use the service name <code>chime</code> and REST
 * endpoint <code>https://service.chime.aws.amazon.com</code>.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * Administrative permissions are controlled using AWS Identity and Access
 * Management (IAM). For more information, see <a
 * href="https://docs.aws.amazon.com/chime/latest/ag/security-iam.html">Identity
 * and Access Management for Amazon Chime</a> in the <i>Amazon Chime
 * Administration Guide</i>.
 * </p>
 */
public class AmazonChimeClient extends AmazonWebServiceClient implements AmazonChime {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Chime exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonChime. A
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
    public AmazonChimeClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonChime. A
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
     *            how this client connects to AmazonChime (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonChimeClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonChime using
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
     *         AmazonChimeClient client = new AmazonChimeClient(AWSMobileClient.getInstance());
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
    public AmazonChimeClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonChime using
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
     *         AmazonChimeClient client = new AmazonChimeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonChime (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonChimeClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonChime using
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
     *         AmazonChimeClient client = new AmazonChimeClient(AWSMobileClient.getInstance());
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
    public AmazonChimeClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonChime using
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
     *         AmazonChimeClient client = new AmazonChimeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonChime (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonChimeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonChime using
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
     *            how this client connects to AmazonChime (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonChimeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonChime using
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
     *         AmazonChimeClient client = new AmazonChimeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonChime (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonChimeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ForbiddenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottledClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnprocessableEntityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("chime.us-east-1.amazonaws.com");
        this.endpointPrefix = "chime";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/chime/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/chime/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Associates a phone number with the specified Amazon Chime user.
     * </p>
     * 
     * @param associatePhoneNumberWithUserRequest
     * @return associatePhoneNumberWithUserResult The response from the
     *         AssociatePhoneNumberWithUser service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociatePhoneNumberWithUserResult associatePhoneNumberWithUser(
            AssociatePhoneNumberWithUserRequest associatePhoneNumberWithUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associatePhoneNumberWithUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumberWithUserRequest> request = null;
        Response<AssociatePhoneNumberWithUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumberWithUserRequestMarshaller()
                        .marshall(associatePhoneNumberWithUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociatePhoneNumberWithUserResult, JsonUnmarshallerContext> unmarshaller = new AssociatePhoneNumberWithUserResultJsonUnmarshaller();
            JsonResponseHandler<AssociatePhoneNumberWithUserResult> responseHandler = new JsonResponseHandler<AssociatePhoneNumberWithUserResult>(
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
     * Associates phone numbers with the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return associatePhoneNumbersWithVoiceConnectorResult The response from
     *         the AssociatePhoneNumbersWithVoiceConnector service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associatePhoneNumbersWithVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumbersWithVoiceConnectorRequest> request = null;
        Response<AssociatePhoneNumbersWithVoiceConnectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumbersWithVoiceConnectorRequestMarshaller()
                        .marshall(associatePhoneNumbersWithVoiceConnectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociatePhoneNumbersWithVoiceConnectorResult, JsonUnmarshallerContext> unmarshaller = new AssociatePhoneNumbersWithVoiceConnectorResultJsonUnmarshaller();
            JsonResponseHandler<AssociatePhoneNumbersWithVoiceConnectorResult> responseHandler = new JsonResponseHandler<AssociatePhoneNumbersWithVoiceConnectorResult>(
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
     * Associates phone numbers with the specified Amazon Chime Voice Connector
     * group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return associatePhoneNumbersWithVoiceConnectorGroupResult The response
     *         from the AssociatePhoneNumbersWithVoiceConnectorGroup service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociatePhoneNumbersWithVoiceConnectorGroupResult associatePhoneNumbersWithVoiceConnectorGroup(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associatePhoneNumbersWithVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumbersWithVoiceConnectorGroupRequest> request = null;
        Response<AssociatePhoneNumbersWithVoiceConnectorGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumbersWithVoiceConnectorGroupRequestMarshaller()
                        .marshall(associatePhoneNumbersWithVoiceConnectorGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociatePhoneNumbersWithVoiceConnectorGroupResult, JsonUnmarshallerContext> unmarshaller = new AssociatePhoneNumbersWithVoiceConnectorGroupResultJsonUnmarshaller();
            JsonResponseHandler<AssociatePhoneNumbersWithVoiceConnectorGroupResult> responseHandler = new JsonResponseHandler<AssociatePhoneNumbersWithVoiceConnectorGroupResult>(
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
     * Associates the specified sign-in delegate groups with the specified
     * Amazon Chime account.
     * </p>
     * 
     * @param associateSigninDelegateGroupsWithAccountRequest
     * @return associateSigninDelegateGroupsWithAccountResult The response from
     *         the AssociateSigninDelegateGroupsWithAccount service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(
            AssociateSigninDelegateGroupsWithAccountRequest associateSigninDelegateGroupsWithAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateSigninDelegateGroupsWithAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSigninDelegateGroupsWithAccountRequest> request = null;
        Response<AssociateSigninDelegateGroupsWithAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSigninDelegateGroupsWithAccountRequestMarshaller()
                        .marshall(associateSigninDelegateGroupsWithAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateSigninDelegateGroupsWithAccountResult, JsonUnmarshallerContext> unmarshaller = new AssociateSigninDelegateGroupsWithAccountResultJsonUnmarshaller();
            JsonResponseHandler<AssociateSigninDelegateGroupsWithAccountResult> responseHandler = new JsonResponseHandler<AssociateSigninDelegateGroupsWithAccountResult>(
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
     * Creates up to 100 new attendees for an active Amazon Chime SDK meeting.
     * For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @return batchCreateAttendeeResult The response from the
     *         BatchCreateAttendee service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchCreateAttendeeResult batchCreateAttendee(
            BatchCreateAttendeeRequest batchCreateAttendeeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchCreateAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateAttendeeRequest> request = null;
        Response<BatchCreateAttendeeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateAttendeeRequestMarshaller()
                        .marshall(batchCreateAttendeeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchCreateAttendeeResult, JsonUnmarshallerContext> unmarshaller = new BatchCreateAttendeeResultJsonUnmarshaller();
            JsonResponseHandler<BatchCreateAttendeeResult> responseHandler = new JsonResponseHandler<BatchCreateAttendeeResult>(
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
     * Adds up to 50 members to a chat room in an Amazon Chime Enterprise
     * account. Members can be either users or bots. The member role designates
     * whether the member is a chat room administrator or a general chat room
     * member.
     * </p>
     * 
     * @param batchCreateRoomMembershipRequest
     * @return batchCreateRoomMembershipResult The response from the
     *         BatchCreateRoomMembership service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchCreateRoomMembershipResult batchCreateRoomMembership(
            BatchCreateRoomMembershipRequest batchCreateRoomMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchCreateRoomMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateRoomMembershipRequest> request = null;
        Response<BatchCreateRoomMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateRoomMembershipRequestMarshaller()
                        .marshall(batchCreateRoomMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchCreateRoomMembershipResult, JsonUnmarshallerContext> unmarshaller = new BatchCreateRoomMembershipResultJsonUnmarshaller();
            JsonResponseHandler<BatchCreateRoomMembershipResult> responseHandler = new JsonResponseHandler<BatchCreateRoomMembershipResult>(
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
     * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be
     * disassociated from any users or Amazon Chime Voice Connectors before they
     * can be deleted.
     * </p>
     * <p>
     * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they
     * are deleted permanently.
     * </p>
     * 
     * @param batchDeletePhoneNumberRequest
     * @return batchDeletePhoneNumberResult The response from the
     *         BatchDeletePhoneNumber service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeletePhoneNumberResult batchDeletePhoneNumber(
            BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeletePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeletePhoneNumberRequest> request = null;
        Response<BatchDeletePhoneNumberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeletePhoneNumberRequestMarshaller()
                        .marshall(batchDeletePhoneNumberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeletePhoneNumberResult, JsonUnmarshallerContext> unmarshaller = new BatchDeletePhoneNumberResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeletePhoneNumberResult> responseHandler = new JsonResponseHandler<BatchDeletePhoneNumberResult>(
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
     * Suspends up to 50 users from a <code>Team</code> or
     * <code>EnterpriseLWA</code> Amazon Chime account. For more information
     * about different account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * Users suspended from a <code>Team</code> account are disassociated from
     * the account, but they can continue to use Amazon Chime as free users. To
     * remove the suspension from suspended <code>Team</code> account users,
     * invite them to the <code>Team</code> account again. You can use the
     * <a>InviteUsers</a> action to do so.
     * </p>
     * <p>
     * Users suspended from an <code>EnterpriseLWA</code> account are
     * immediately signed out of Amazon Chime and can no longer sign in. To
     * remove the suspension from suspended <code>EnterpriseLWA</code> account
     * users, use the <a>BatchUnsuspendUser</a> action.
     * </p>
     * <p>
     * To sign out users without suspending them, use the <a>LogoutUser</a>
     * action.
     * </p>
     * 
     * @param batchSuspendUserRequest
     * @return batchSuspendUserResult The response from the BatchSuspendUser
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchSuspendUserResult batchSuspendUser(BatchSuspendUserRequest batchSuspendUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchSuspendUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchSuspendUserRequest> request = null;
        Response<BatchSuspendUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchSuspendUserRequestMarshaller().marshall(batchSuspendUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchSuspendUserResult, JsonUnmarshallerContext> unmarshaller = new BatchSuspendUserResultJsonUnmarshaller();
            JsonResponseHandler<BatchSuspendUserResult> responseHandler = new JsonResponseHandler<BatchSuspendUserResult>(
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
     * Removes the suspension from up to 50 previously suspended users for the
     * specified Amazon Chime <code>EnterpriseLWA</code> account. Only users on
     * <code>EnterpriseLWA</code> accounts can be unsuspended using this action.
     * For more information about different account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * <p>
     * Previously suspended users who are unsuspended using this action are
     * returned to <code>Registered</code> status. Users who are not previously
     * suspended are ignored.
     * </p>
     * 
     * @param batchUnsuspendUserRequest
     * @return batchUnsuspendUserResult The response from the BatchUnsuspendUser
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchUnsuspendUserResult batchUnsuspendUser(
            BatchUnsuspendUserRequest batchUnsuspendUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchUnsuspendUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUnsuspendUserRequest> request = null;
        Response<BatchUnsuspendUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUnsuspendUserRequestMarshaller()
                        .marshall(batchUnsuspendUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchUnsuspendUserResult, JsonUnmarshallerContext> unmarshaller = new BatchUnsuspendUserResultJsonUnmarshaller();
            JsonResponseHandler<BatchUnsuspendUserResult> responseHandler = new JsonResponseHandler<BatchUnsuspendUserResult>(
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
     * Updates phone number product types or calling names. You can update one
     * attribute at a time for each <code>UpdatePhoneNumberRequestItem</code>.
     * For example, you can update either the product type or the calling name.
     * </p>
     * <p>
     * For product types, choose from Amazon Chime Business Calling and Amazon
     * Chime Voice Connector. For toll-free numbers, you must use the Amazon
     * Chime Voice Connector product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete.
     * Pending updates to outbound calling names must be complete before you can
     * request another update.
     * </p>
     * 
     * @param batchUpdatePhoneNumberRequest
     * @return batchUpdatePhoneNumberResult The response from the
     *         BatchUpdatePhoneNumber service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchUpdatePhoneNumberResult batchUpdatePhoneNumber(
            BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchUpdatePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdatePhoneNumberRequest> request = null;
        Response<BatchUpdatePhoneNumberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdatePhoneNumberRequestMarshaller()
                        .marshall(batchUpdatePhoneNumberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchUpdatePhoneNumberResult, JsonUnmarshallerContext> unmarshaller = new BatchUpdatePhoneNumberResultJsonUnmarshaller();
            JsonResponseHandler<BatchUpdatePhoneNumberResult> responseHandler = new JsonResponseHandler<BatchUpdatePhoneNumberResult>(
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
     * Updates user details within the <a>UpdateUserRequestItem</a> object for
     * up to 20 users for the specified Amazon Chime account. Currently, only
     * <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param batchUpdateUserRequest
     * @return batchUpdateUserResult The response from the BatchUpdateUser
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchUpdateUserResult batchUpdateUser(BatchUpdateUserRequest batchUpdateUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchUpdateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateUserRequest> request = null;
        Response<BatchUpdateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateUserRequestMarshaller().marshall(batchUpdateUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchUpdateUserResult, JsonUnmarshallerContext> unmarshaller = new BatchUpdateUserResultJsonUnmarshaller();
            JsonResponseHandler<BatchUpdateUserResult> responseHandler = new JsonResponseHandler<BatchUpdateUserResult>(
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
     * Creates an Amazon Chime account under the administrator's AWS account.
     * Only <code>Team</code> account types are currently supported for this
     * action. For more information about different account types, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html"
     * >Managing Your Amazon Chime Accounts</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param createAccountRequest
     * @return createAccountResult The response from the CreateAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAccountResult createAccount(CreateAccountRequest createAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAccountRequest> request = null;
        Response<CreateAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAccountRequestMarshaller().marshall(createAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAccountResult, JsonUnmarshallerContext> unmarshaller = new CreateAccountResultJsonUnmarshaller();
            JsonResponseHandler<CreateAccountResult> responseHandler = new JsonResponseHandler<CreateAccountResult>(
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
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more
     * information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @return createAttendeeResult The response from the CreateAttendee service
     *         method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAttendeeResult createAttendee(CreateAttendeeRequest createAttendeeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAttendeeRequest> request = null;
        Response<CreateAttendeeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAttendeeRequestMarshaller().marshall(createAttendeeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAttendeeResult, JsonUnmarshallerContext> unmarshaller = new CreateAttendeeResultJsonUnmarshaller();
            JsonResponseHandler<CreateAttendeeResult> responseHandler = new JsonResponseHandler<CreateAttendeeResult>(
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
     * Creates a bot for an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createBotRequest
     * @return createBotResult The response from the CreateBot service method,
     *         as returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBotResult createBot(CreateBotRequest createBotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBotRequest> request = null;
        Response<CreateBotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBotRequestMarshaller().marshall(createBotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBotResult, JsonUnmarshallerContext> unmarshaller = new CreateBotResultJsonUnmarshaller();
            JsonResponseHandler<CreateBotResult> responseHandler = new JsonResponseHandler<CreateBotResult>(
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
     * Creates a new Amazon Chime SDK meeting in the specified media Region with
     * no initial attendees. For more information about specifying media
     * Regions, see <a href=
     * "https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html"
     * >Amazon Chime SDK Media Regions</a> in the <i>Amazon Chime Developer
     * Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param createMeetingRequest
     * @return createMeetingResult The response from the CreateMeeting service
     *         method, as returned by Amazon Chime.
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateMeetingResult createMeeting(CreateMeetingRequest createMeetingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMeetingRequest> request = null;
        Response<CreateMeetingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMeetingRequestMarshaller().marshall(createMeetingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMeetingResult, JsonUnmarshallerContext> unmarshaller = new CreateMeetingResultJsonUnmarshaller();
            JsonResponseHandler<CreateMeetingResult> responseHandler = new JsonResponseHandler<CreateMeetingResult>(
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
     * Creates a new Amazon Chime SDK meeting in the specified media Region,
     * with attendees. For more information about specifying media Regions, see
     * <a href=
     * "https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html"
     * >Amazon Chime SDK Media Regions</a> in the <i>Amazon Chime Developer
     * Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param createMeetingWithAttendeesRequest
     * @return createMeetingWithAttendeesResult The response from the
     *         CreateMeetingWithAttendees service method, as returned by Amazon
     *         Chime.
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateMeetingWithAttendeesResult createMeetingWithAttendees(
            CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMeetingWithAttendeesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMeetingWithAttendeesRequest> request = null;
        Response<CreateMeetingWithAttendeesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMeetingWithAttendeesRequestMarshaller()
                        .marshall(createMeetingWithAttendeesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMeetingWithAttendeesResult, JsonUnmarshallerContext> unmarshaller = new CreateMeetingWithAttendeesResultJsonUnmarshaller();
            JsonResponseHandler<CreateMeetingWithAttendeesResult> responseHandler = new JsonResponseHandler<CreateMeetingWithAttendeesResult>(
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
     * Creates an order for phone numbers to be provisioned. Choose from Amazon
     * Chime Business Calling and Amazon Chime Voice Connector product types.
     * For toll-free numbers, you must use the Amazon Chime Voice Connector
     * product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return createPhoneNumberOrderResult The response from the
     *         CreatePhoneNumberOrder service method, as returned by Amazon
     *         Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreatePhoneNumberOrderResult createPhoneNumberOrder(
            CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPhoneNumberOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePhoneNumberOrderRequest> request = null;
        Response<CreatePhoneNumberOrderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePhoneNumberOrderRequestMarshaller()
                        .marshall(createPhoneNumberOrderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePhoneNumberOrderResult, JsonUnmarshallerContext> unmarshaller = new CreatePhoneNumberOrderResultJsonUnmarshaller();
            JsonResponseHandler<CreatePhoneNumberOrderResult> responseHandler = new JsonResponseHandler<CreatePhoneNumberOrderResult>(
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
     * Creates a proxy session on the specified Amazon Chime Voice Connector for
     * the specified participant phone numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @return createProxySessionResult The response from the CreateProxySession
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateProxySessionResult createProxySession(
            CreateProxySessionRequest createProxySessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProxySessionRequest> request = null;
        Response<CreateProxySessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProxySessionRequestMarshaller()
                        .marshall(createProxySessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProxySessionResult, JsonUnmarshallerContext> unmarshaller = new CreateProxySessionResultJsonUnmarshaller();
            JsonResponseHandler<CreateProxySessionResult> responseHandler = new JsonResponseHandler<CreateProxySessionResult>(
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
     * Creates a chat room for the specified Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createRoomRequest
     * @return createRoomResult The response from the CreateRoom service method,
     *         as returned by Amazon Chime.
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRoomResult createRoom(CreateRoomRequest createRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoomRequest> request = null;
        Response<CreateRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoomRequestMarshaller().marshall(createRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRoomResult, JsonUnmarshallerContext> unmarshaller = new CreateRoomResultJsonUnmarshaller();
            JsonResponseHandler<CreateRoomResult> responseHandler = new JsonResponseHandler<CreateRoomResult>(
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
     * Adds a member to a chat room in an Amazon Chime Enterprise account. A
     * member can be either a user or a bot. The member role designates whether
     * the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param createRoomMembershipRequest
     * @return createRoomMembershipResult The response from the
     *         CreateRoomMembership service method, as returned by Amazon Chime.
     * @throws ConflictException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRoomMembershipResult createRoomMembership(
            CreateRoomMembershipRequest createRoomMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRoomMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoomMembershipRequest> request = null;
        Response<CreateRoomMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoomMembershipRequestMarshaller()
                        .marshall(createRoomMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRoomMembershipResult, JsonUnmarshallerContext> unmarshaller = new CreateRoomMembershipResultJsonUnmarshaller();
            JsonResponseHandler<CreateRoomMembershipResult> responseHandler = new JsonResponseHandler<CreateRoomMembershipResult>(
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
     * Creates a user under the specified Amazon Chime account.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
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
     * Creates an Amazon Chime Voice Connector under the administrator's AWS
     * account. You can choose to create an Amazon Chime Voice Connector in a
     * specific AWS Region.
     * </p>
     * <p>
     * Enabling <a>CreateVoiceConnectorRequest$RequireEncryption</a> configures
     * your Amazon Chime Voice Connector to use TLS transport for SIP signaling
     * and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and
     * unencrypted outbound calls are blocked.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return createVoiceConnectorResult The response from the
     *         CreateVoiceConnector service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateVoiceConnectorResult createVoiceConnector(
            CreateVoiceConnectorRequest createVoiceConnectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceConnectorRequest> request = null;
        Response<CreateVoiceConnectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceConnectorRequestMarshaller()
                        .marshall(createVoiceConnectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVoiceConnectorResult, JsonUnmarshallerContext> unmarshaller = new CreateVoiceConnectorResultJsonUnmarshaller();
            JsonResponseHandler<CreateVoiceConnectorResult> responseHandler = new JsonResponseHandler<CreateVoiceConnectorResult>(
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
     * Creates an Amazon Chime Voice Connector group under the administrator's
     * AWS account. You can associate Amazon Chime Voice Connectors with the
     * Amazon Chime Voice Connector group by including
     * <code>VoiceConnectorItems</code> in the request.
     * </p>
     * <p>
     * You can include Amazon Chime Voice Connectors from different AWS Regions
     * in your group. This creates a fault tolerant mechanism for fallback in
     * case of availability events.
     * </p>
     * 
     * @param createVoiceConnectorGroupRequest
     * @return createVoiceConnectorGroupResult The response from the
     *         CreateVoiceConnectorGroup service method, as returned by Amazon
     *         Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateVoiceConnectorGroupResult createVoiceConnectorGroup(
            CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceConnectorGroupRequest> request = null;
        Response<CreateVoiceConnectorGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceConnectorGroupRequestMarshaller()
                        .marshall(createVoiceConnectorGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVoiceConnectorGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateVoiceConnectorGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateVoiceConnectorGroupResult> responseHandler = new JsonResponseHandler<CreateVoiceConnectorGroupResult>(
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
     * Deletes the specified Amazon Chime account. You must suspend all users
     * before deleting a <code>Team</code> account. You can use the
     * <a>BatchSuspendUser</a> action to do so.
     * </p>
     * <p>
     * For <code>EnterpriseLWA</code> and <code>EnterpriseAD</code> accounts,
     * you must release the claimed domains for your Amazon Chime account before
     * deletion. As soon as you release the domain, all users under that account
     * are suspended.
     * </p>
     * <p>
     * Deleted accounts appear in your <code>Disabled</code> accounts list for
     * 90 days. To restore a deleted account from your <code>Disabled</code>
     * accounts list, you must contact AWS Support.
     * </p>
     * <p>
     * After 90 days, deleted accounts are permanently removed from your
     * <code>Disabled</code> accounts list.
     * </p>
     * 
     * @param deleteAccountRequest
     * @return deleteAccountResult The response from the DeleteAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws UnprocessableEntityException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteAccountResult deleteAccount(DeleteAccountRequest deleteAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountRequest> request = null;
        Response<DeleteAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountRequestMarshaller().marshall(deleteAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAccountResult, JsonUnmarshallerContext> unmarshaller = new DeleteAccountResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAccountResult> responseHandler = new JsonResponseHandler<DeleteAccountResult>(
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
     * Deletes an attendee from the specified Amazon Chime SDK meeting and
     * deletes their <code>JoinToken</code>. Attendees are automatically deleted
     * when a Amazon Chime SDK meeting is deleted. For more information about
     * the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteAttendee(DeleteAttendeeRequest deleteAttendeeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttendeeRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttendeeRequestMarshaller().marshall(deleteAttendeeRequest);
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
     * Deletes the events configuration that allows a bot to receive outgoing
     * events.
     * </p>
     * 
     * @param deleteEventsConfigurationRequest
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteEventsConfiguration(
            DeleteEventsConfigurationRequest deleteEventsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEventsConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventsConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventsConfigurationRequestMarshaller()
                        .marshall(deleteEventsConfigurationRequest);
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
     * Deletes the specified Amazon Chime SDK meeting. When a meeting is
     * deleted, its attendees are also deleted and clients can no longer join
     * it. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteMeeting(DeleteMeetingRequest deleteMeetingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMeetingRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMeetingRequestMarshaller().marshall(deleteMeetingRequest);
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
     * Moves the specified phone number into the <b>Deletion queue</b>. A phone
     * number must be disassociated from any users or Amazon Chime Voice
     * Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> for 7 days
     * before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deletePhoneNumber(DeletePhoneNumberRequest deletePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePhoneNumberRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePhoneNumberRequestMarshaller()
                        .marshall(deletePhoneNumberRequest);
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
     * Deletes the specified proxy session from the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteProxySession(DeleteProxySessionRequest deleteProxySessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProxySessionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProxySessionRequestMarshaller()
                        .marshall(deleteProxySessionRequest);
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
     * Deletes a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteRoom(DeleteRoomRequest deleteRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomRequestMarshaller().marshall(deleteRoomRequest);
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
     * Removes a member from a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomMembershipRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteRoomMembership(DeleteRoomMembershipRequest deleteRoomMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRoomMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomMembershipRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomMembershipRequestMarshaller()
                        .marshall(deleteRoomMembershipRequest);
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
     * Deletes the specified Amazon Chime Voice Connector. Any phone numbers
     * associated with the Amazon Chime Voice Connector must be disassociated
     * from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVoiceConnector(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorRequestMarshaller()
                        .marshall(deleteVoiceConnectorRequest);
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
     * Deletes the specified Amazon Chime Voice Connector group. Any
     * <code>VoiceConnectorItems</code> and phone numbers associated with the
     * group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVoiceConnectorGroup(
            DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorGroupRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorGroupRequestMarshaller()
                        .marshall(deleteVoiceConnectorGroupRequest);
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
     * Deletes the origination settings for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVoiceConnectorOrigination(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorOriginationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorOriginationRequestMarshaller()
                        .marshall(deleteVoiceConnectorOriginationRequest);
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
     * Deletes the proxy configuration from the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVoiceConnectorProxy(
            DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorProxyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorProxyRequestMarshaller()
                        .marshall(deleteVoiceConnectorProxyRequest);
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
     * Deletes the streaming configuration for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVoiceConnectorStreamingConfiguration(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorStreamingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorStreamingConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorStreamingConfigurationRequestMarshaller()
                        .marshall(deleteVoiceConnectorStreamingConfigurationRequest);
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
     * Deletes the termination settings for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVoiceConnectorTermination(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorTerminationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorTerminationRequestMarshaller()
                        .marshall(deleteVoiceConnectorTerminationRequest);
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
     * Deletes the specified SIP credentials used by your equipment to
     * authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVoiceConnectorTerminationCredentials(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorTerminationCredentialsRequestMarshaller()
                        .marshall(deleteVoiceConnectorTerminationCredentialsRequest);
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
     * Disassociates the primary provisioned phone number from the specified
     * Amazon Chime user.
     * </p>
     * 
     * @param disassociatePhoneNumberFromUserRequest
     * @return disassociatePhoneNumberFromUserResult The response from the
     *         DisassociatePhoneNumberFromUser service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociatePhoneNumberFromUserResult disassociatePhoneNumberFromUser(
            DisassociatePhoneNumberFromUserRequest disassociatePhoneNumberFromUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumberFromUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumberFromUserRequest> request = null;
        Response<DisassociatePhoneNumberFromUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumberFromUserRequestMarshaller()
                        .marshall(disassociatePhoneNumberFromUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociatePhoneNumberFromUserResult, JsonUnmarshallerContext> unmarshaller = new DisassociatePhoneNumberFromUserResultJsonUnmarshaller();
            JsonResponseHandler<DisassociatePhoneNumberFromUserResult> responseHandler = new JsonResponseHandler<DisassociatePhoneNumberFromUserResult>(
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
     * Disassociates the specified phone numbers from the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return disassociatePhoneNumbersFromVoiceConnectorResult The response
     *         from the DisassociatePhoneNumbersFromVoiceConnector service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumbersFromVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumbersFromVoiceConnectorRequest> request = null;
        Response<DisassociatePhoneNumbersFromVoiceConnectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumbersFromVoiceConnectorRequestMarshaller()
                        .marshall(disassociatePhoneNumbersFromVoiceConnectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociatePhoneNumbersFromVoiceConnectorResult, JsonUnmarshallerContext> unmarshaller = new DisassociatePhoneNumbersFromVoiceConnectorResultJsonUnmarshaller();
            JsonResponseHandler<DisassociatePhoneNumbersFromVoiceConnectorResult> responseHandler = new JsonResponseHandler<DisassociatePhoneNumbersFromVoiceConnectorResult>(
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
     * Disassociates the specified phone numbers from the specified Amazon Chime
     * Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return disassociatePhoneNumbersFromVoiceConnectorGroupResult The
     *         response from the DisassociatePhoneNumbersFromVoiceConnectorGroup
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociatePhoneNumbersFromVoiceConnectorGroupResult disassociatePhoneNumbersFromVoiceConnectorGroup(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumbersFromVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumbersFromVoiceConnectorGroupRequest> request = null;
        Response<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumbersFromVoiceConnectorGroupRequestMarshaller()
                        .marshall(disassociatePhoneNumbersFromVoiceConnectorGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociatePhoneNumbersFromVoiceConnectorGroupResult, JsonUnmarshallerContext> unmarshaller = new DisassociatePhoneNumbersFromVoiceConnectorGroupResultJsonUnmarshaller();
            JsonResponseHandler<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> responseHandler = new JsonResponseHandler<DisassociatePhoneNumbersFromVoiceConnectorGroupResult>(
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
     * Disassociates the specified sign-in delegate groups from the specified
     * Amazon Chime account.
     * </p>
     * 
     * @param disassociateSigninDelegateGroupsFromAccountRequest
     * @return disassociateSigninDelegateGroupsFromAccountResult The response
     *         from the DisassociateSigninDelegateGroupsFromAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateSigninDelegateGroupsFromAccountResult disassociateSigninDelegateGroupsFromAccount(
            DisassociateSigninDelegateGroupsFromAccountRequest disassociateSigninDelegateGroupsFromAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateSigninDelegateGroupsFromAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSigninDelegateGroupsFromAccountRequest> request = null;
        Response<DisassociateSigninDelegateGroupsFromAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSigninDelegateGroupsFromAccountRequestMarshaller()
                        .marshall(disassociateSigninDelegateGroupsFromAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateSigninDelegateGroupsFromAccountResult, JsonUnmarshallerContext> unmarshaller = new DisassociateSigninDelegateGroupsFromAccountResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateSigninDelegateGroupsFromAccountResult> responseHandler = new JsonResponseHandler<DisassociateSigninDelegateGroupsFromAccountResult>(
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
     * Retrieves details for the specified Amazon Chime account, such as account
     * type and supported licenses.
     * </p>
     * 
     * @param getAccountRequest
     * @return getAccountResult The response from the GetAccount service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAccountResult getAccount(GetAccountRequest getAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountRequest> request = null;
        Response<GetAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountRequestMarshaller().marshall(getAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAccountResult, JsonUnmarshallerContext> unmarshaller = new GetAccountResultJsonUnmarshaller();
            JsonResponseHandler<GetAccountResult> responseHandler = new JsonResponseHandler<GetAccountResult>(
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
     * Retrieves account settings for the specified Amazon Chime account ID,
     * such as remote control and dial out settings. For more information about
     * these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the
     * Policies Page</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return getAccountSettingsResult The response from the GetAccountSettings
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAccountSettingsResult getAccountSettings(
            GetAccountSettingsRequest getAccountSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestMarshaller()
                        .marshall(getAccountSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAccountSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetAccountSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetAccountSettingsResult> responseHandler = new JsonResponseHandler<GetAccountSettingsResult>(
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
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and
     * attendee ID. For more information about the Amazon Chime SDK, see <a
     * href=
     * "https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getAttendeeRequest
     * @return getAttendeeResult The response from the GetAttendee service
     *         method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAttendeeResult getAttendee(GetAttendeeRequest getAttendeeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttendeeRequest> request = null;
        Response<GetAttendeeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttendeeRequestMarshaller().marshall(getAttendeeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAttendeeResult, JsonUnmarshallerContext> unmarshaller = new GetAttendeeResultJsonUnmarshaller();
            JsonResponseHandler<GetAttendeeResult> responseHandler = new JsonResponseHandler<GetAttendeeResult>(
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
     * Retrieves details for the specified bot, such as bot email address, bot
     * type, status, and display name.
     * </p>
     * 
     * @param getBotRequest
     * @return getBotResult The response from the GetBot service method, as
     *         returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBotResult getBot(GetBotRequest getBotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBotRequest> request = null;
        Response<GetBotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBotRequestMarshaller().marshall(getBotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBotResult, JsonUnmarshallerContext> unmarshaller = new GetBotResultJsonUnmarshaller();
            JsonResponseHandler<GetBotResult> responseHandler = new JsonResponseHandler<GetBotResult>(
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
     * Gets details for an events configuration that allows a bot to receive
     * outgoing events, such as an HTTPS endpoint or Lambda function ARN.
     * </p>
     * 
     * @param getEventsConfigurationRequest
     * @return getEventsConfigurationResult The response from the
     *         GetEventsConfiguration service method, as returned by Amazon
     *         Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetEventsConfigurationResult getEventsConfiguration(
            GetEventsConfigurationRequest getEventsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEventsConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventsConfigurationRequest> request = null;
        Response<GetEventsConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventsConfigurationRequestMarshaller()
                        .marshall(getEventsConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEventsConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetEventsConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetEventsConfigurationResult> responseHandler = new JsonResponseHandler<GetEventsConfigurationResult>(
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
     * Retrieves global settings for the administrator's AWS account, such as
     * Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return getGlobalSettingsResult The response from the GetGlobalSettings
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetGlobalSettingsResult getGlobalSettings(
            GetGlobalSettingsRequest getGlobalSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGlobalSettingsRequest> request = null;
        Response<GetGlobalSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGlobalSettingsRequestMarshaller()
                        .marshall(getGlobalSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGlobalSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetGlobalSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetGlobalSettingsResult> responseHandler = new JsonResponseHandler<GetGlobalSettingsResult>(
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
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID.
     * For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param getMeetingRequest
     * @return getMeetingResult The response from the GetMeeting service method,
     *         as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMeetingResult getMeeting(GetMeetingRequest getMeetingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMeetingRequest> request = null;
        Response<GetMeetingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMeetingRequestMarshaller().marshall(getMeetingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMeetingResult, JsonUnmarshallerContext> unmarshaller = new GetMeetingResultJsonUnmarshaller();
            JsonResponseHandler<GetMeetingResult> responseHandler = new JsonResponseHandler<GetMeetingResult>(
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
     * Retrieves details for the specified phone number ID, such as
     * associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return getPhoneNumberResult The response from the GetPhoneNumber service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest getPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberRequest> request = null;
        Response<GetPhoneNumberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberRequestMarshaller().marshall(getPhoneNumberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPhoneNumberResult, JsonUnmarshallerContext> unmarshaller = new GetPhoneNumberResultJsonUnmarshaller();
            JsonResponseHandler<GetPhoneNumberResult> responseHandler = new JsonResponseHandler<GetPhoneNumberResult>(
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
     * Retrieves details for the specified phone number order, such as order
     * creation timestamp, phone numbers in E.164 format, product type, and
     * order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return getPhoneNumberOrderResult The response from the
     *         GetPhoneNumberOrder service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPhoneNumberOrderResult getPhoneNumberOrder(
            GetPhoneNumberOrderRequest getPhoneNumberOrderRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPhoneNumberOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberOrderRequest> request = null;
        Response<GetPhoneNumberOrderResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberOrderRequestMarshaller()
                        .marshall(getPhoneNumberOrderRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPhoneNumberOrderResult, JsonUnmarshallerContext> unmarshaller = new GetPhoneNumberOrderResultJsonUnmarshaller();
            JsonResponseHandler<GetPhoneNumberOrderResult> responseHandler = new JsonResponseHandler<GetPhoneNumberOrderResult>(
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
     * Retrieves the phone number settings for the administrator's AWS account,
     * such as the default outbound calling name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @return getPhoneNumberSettingsResult The response from the
     *         GetPhoneNumberSettings service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPhoneNumberSettingsResult getPhoneNumberSettings(
            GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPhoneNumberSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberSettingsRequest> request = null;
        Response<GetPhoneNumberSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberSettingsRequestMarshaller()
                        .marshall(getPhoneNumberSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPhoneNumberSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetPhoneNumberSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetPhoneNumberSettingsResult> responseHandler = new JsonResponseHandler<GetPhoneNumberSettingsResult>(
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
     * Gets the specified proxy session details for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @return getProxySessionResult The response from the GetProxySession
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetProxySessionResult getProxySession(GetProxySessionRequest getProxySessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProxySessionRequest> request = null;
        Response<GetProxySessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProxySessionRequestMarshaller().marshall(getProxySessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetProxySessionResult, JsonUnmarshallerContext> unmarshaller = new GetProxySessionResultJsonUnmarshaller();
            JsonResponseHandler<GetProxySessionResult> responseHandler = new JsonResponseHandler<GetProxySessionResult>(
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
     * Gets the retention settings for the specified Amazon Chime Enterprise
     * account. For more information about retention settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html"
     * >Managing Chat Retention Policies</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param getRetentionSettingsRequest
     * @return getRetentionSettingsResult The response from the
     *         GetRetentionSettings service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRetentionSettingsResult getRetentionSettings(
            GetRetentionSettingsRequest getRetentionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRetentionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRetentionSettingsRequest> request = null;
        Response<GetRetentionSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRetentionSettingsRequestMarshaller()
                        .marshall(getRetentionSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRetentionSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetRetentionSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetRetentionSettingsResult> responseHandler = new JsonResponseHandler<GetRetentionSettingsResult>(
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
     * Retrieves room details, such as the room name, for a room in an Amazon
     * Chime Enterprise account.
     * </p>
     * 
     * @param getRoomRequest
     * @return getRoomResult The response from the GetRoom service method, as
     *         returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRoomResult getRoom(GetRoomRequest getRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomRequest> request = null;
        Response<GetRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomRequestMarshaller().marshall(getRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRoomResult, JsonUnmarshallerContext> unmarshaller = new GetRoomResultJsonUnmarshaller();
            JsonResponseHandler<GetRoomResult> responseHandler = new JsonResponseHandler<GetRoomResult>(
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
     * Retrieves details for the specified user ID, such as primary email
     * address, license type, and personal meeting PIN.
     * </p>
     * <p>
     * To retrieve user details with an email address instead of a user ID, use
     * the <a>ListUsers</a> action, and then filter by email address.
     * </p>
     * 
     * @param getUserRequest
     * @return getUserResult The response from the GetUser service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUserResult getUser(GetUserRequest getUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestMarshaller().marshall(getUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserResult, JsonUnmarshallerContext> unmarshaller = new GetUserResultJsonUnmarshaller();
            JsonResponseHandler<GetUserResult> responseHandler = new JsonResponseHandler<GetUserResult>(
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
     * Retrieves settings for the specified user ID, such as any associated
     * phone number settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return getUserSettingsResult The response from the GetUserSettings
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUserSettingsResult getUserSettings(GetUserSettingsRequest getUserSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserSettingsRequest> request = null;
        Response<GetUserSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserSettingsRequestMarshaller().marshall(getUserSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetUserSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetUserSettingsResult> responseHandler = new JsonResponseHandler<GetUserSettingsResult>(
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
     * Retrieves details for the specified Amazon Chime Voice Connector, such as
     * timestamps, name, outbound host, and encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return getVoiceConnectorResult The response from the GetVoiceConnector
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorResult getVoiceConnector(
            GetVoiceConnectorRequest getVoiceConnectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorRequest> request = null;
        Response<GetVoiceConnectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorRequestMarshaller()
                        .marshall(getVoiceConnectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorResult>(
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
     * Retrieves details for the specified Amazon Chime Voice Connector group,
     * such as timestamps, name, and associated <code>VoiceConnectorItems</code>
     * .
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @return getVoiceConnectorGroupResult The response from the
     *         GetVoiceConnectorGroup service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorGroupResult getVoiceConnectorGroup(
            GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorGroupRequest> request = null;
        Response<GetVoiceConnectorGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorGroupRequestMarshaller()
                        .marshall(getVoiceConnectorGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorGroupResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorGroupResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorGroupResult>(
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
     * Retrieves the logging configuration details for the specified Amazon
     * Chime Voice Connector. Shows whether SIP message logs are enabled for
     * sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return getVoiceConnectorLoggingConfigurationResult The response from the
     *         GetVoiceConnectorLoggingConfiguration service method, as returned
     *         by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorLoggingConfigurationResult getVoiceConnectorLoggingConfiguration(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorLoggingConfigurationRequest> request = null;
        Response<GetVoiceConnectorLoggingConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorLoggingConfigurationRequestMarshaller()
                        .marshall(getVoiceConnectorLoggingConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorLoggingConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorLoggingConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorLoggingConfigurationResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorLoggingConfigurationResult>(
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
     * Retrieves origination setting details for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return getVoiceConnectorOriginationResult The response from the
     *         GetVoiceConnectorOrigination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorOriginationResult getVoiceConnectorOrigination(
            GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorOriginationRequest> request = null;
        Response<GetVoiceConnectorOriginationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorOriginationRequestMarshaller()
                        .marshall(getVoiceConnectorOriginationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorOriginationResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorOriginationResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorOriginationResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorOriginationResult>(
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
     * Gets the proxy configuration details for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @return getVoiceConnectorProxyResult The response from the
     *         GetVoiceConnectorProxy service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorProxyResult getVoiceConnectorProxy(
            GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorProxyRequest> request = null;
        Response<GetVoiceConnectorProxyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorProxyRequestMarshaller()
                        .marshall(getVoiceConnectorProxyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorProxyResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorProxyResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorProxyResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorProxyResult>(
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
     * Retrieves the streaming configuration details for the specified Amazon
     * Chime Voice Connector. Shows whether media streaming is enabled for
     * sending to Amazon Kinesis. It also shows the retention period, in hours,
     * for the Amazon Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return getVoiceConnectorStreamingConfigurationResult The response from
     *         the GetVoiceConnectorStreamingConfiguration service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorStreamingConfigurationResult getVoiceConnectorStreamingConfiguration(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorStreamingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorStreamingConfigurationRequest> request = null;
        Response<GetVoiceConnectorStreamingConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorStreamingConfigurationRequestMarshaller()
                        .marshall(getVoiceConnectorStreamingConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorStreamingConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorStreamingConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorStreamingConfigurationResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorStreamingConfigurationResult>(
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
     * Retrieves termination setting details for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return getVoiceConnectorTerminationResult The response from the
     *         GetVoiceConnectorTermination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorTerminationResult getVoiceConnectorTermination(
            GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorTerminationRequest> request = null;
        Response<GetVoiceConnectorTerminationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorTerminationRequestMarshaller()
                        .marshall(getVoiceConnectorTerminationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorTerminationResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorTerminationResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorTerminationResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorTerminationResult>(
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
     * Retrieves information about the last time a SIP <code>OPTIONS</code> ping
     * was received from your SIP infrastructure for the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return getVoiceConnectorTerminationHealthResult The response from the
     *         GetVoiceConnectorTerminationHealth service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVoiceConnectorTerminationHealthResult getVoiceConnectorTerminationHealth(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorTerminationHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorTerminationHealthRequest> request = null;
        Response<GetVoiceConnectorTerminationHealthResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorTerminationHealthRequestMarshaller()
                        .marshall(getVoiceConnectorTerminationHealthRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceConnectorTerminationHealthResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceConnectorTerminationHealthResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceConnectorTerminationHealthResult> responseHandler = new JsonResponseHandler<GetVoiceConnectorTerminationHealthResult>(
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
     * Sends email to a maximum of 50 users, inviting them to the specified
     * Amazon Chime <code>Team</code> account. Only <code>Team</code> account
     * types are currently supported for this action.
     * </p>
     * 
     * @param inviteUsersRequest
     * @return inviteUsersResult The response from the InviteUsers service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public InviteUsersResult inviteUsers(InviteUsersRequest inviteUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(inviteUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InviteUsersRequest> request = null;
        Response<InviteUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InviteUsersRequestMarshaller().marshall(inviteUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InviteUsersResult, JsonUnmarshallerContext> unmarshaller = new InviteUsersResultJsonUnmarshaller();
            JsonResponseHandler<InviteUsersResult> responseHandler = new JsonResponseHandler<InviteUsersResult>(
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
     * Lists the Amazon Chime accounts under the administrator's AWS account.
     * You can filter accounts by account name prefix. To find out which Amazon
     * Chime account a user belongs to, you can filter by the user's email
     * address, which returns one account result.
     * </p>
     * 
     * @param listAccountsRequest
     * @return listAccountsResult The response from the ListAccounts service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAccountsResult listAccounts(ListAccountsRequest listAccountsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountsRequest> request = null;
        Response<ListAccountsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountsRequestMarshaller().marshall(listAccountsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAccountsResult, JsonUnmarshallerContext> unmarshaller = new ListAccountsResultJsonUnmarshaller();
            JsonResponseHandler<ListAccountsResult> responseHandler = new JsonResponseHandler<ListAccountsResult>(
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
     * Lists the tags applied to an Amazon Chime SDK attendee resource.
     * </p>
     * 
     * @param listAttendeeTagsRequest
     * @return listAttendeeTagsResult The response from the ListAttendeeTags
     *         service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAttendeeTagsResult listAttendeeTags(ListAttendeeTagsRequest listAttendeeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAttendeeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttendeeTagsRequest> request = null;
        Response<ListAttendeeTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttendeeTagsRequestMarshaller().marshall(listAttendeeTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAttendeeTagsResult, JsonUnmarshallerContext> unmarshaller = new ListAttendeeTagsResultJsonUnmarshaller();
            JsonResponseHandler<ListAttendeeTagsResult> responseHandler = new JsonResponseHandler<ListAttendeeTagsResult>(
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
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more
     * information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param listAttendeesRequest
     * @return listAttendeesResult The response from the ListAttendees service
     *         method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAttendeesResult listAttendees(ListAttendeesRequest listAttendeesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAttendeesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttendeesRequest> request = null;
        Response<ListAttendeesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttendeesRequestMarshaller().marshall(listAttendeesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAttendeesResult, JsonUnmarshallerContext> unmarshaller = new ListAttendeesResultJsonUnmarshaller();
            JsonResponseHandler<ListAttendeesResult> responseHandler = new JsonResponseHandler<ListAttendeesResult>(
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
     * Lists the bots associated with the administrator's Amazon Chime
     * Enterprise account ID.
     * </p>
     * 
     * @param listBotsRequest
     * @return listBotsResult The response from the ListBots service method, as
     *         returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBotsResult listBots(ListBotsRequest listBotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBotsRequest> request = null;
        Response<ListBotsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBotsRequestMarshaller().marshall(listBotsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBotsResult, JsonUnmarshallerContext> unmarshaller = new ListBotsResultJsonUnmarshaller();
            JsonResponseHandler<ListBotsResult> responseHandler = new JsonResponseHandler<ListBotsResult>(
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
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listMeetingTagsRequest
     * @return listMeetingTagsResult The response from the ListMeetingTags
     *         service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListMeetingTagsResult listMeetingTags(ListMeetingTagsRequest listMeetingTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMeetingTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMeetingTagsRequest> request = null;
        Response<ListMeetingTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMeetingTagsRequestMarshaller().marshall(listMeetingTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMeetingTagsResult, JsonUnmarshallerContext> unmarshaller = new ListMeetingTagsResultJsonUnmarshaller();
            JsonResponseHandler<ListMeetingTagsResult> responseHandler = new JsonResponseHandler<ListMeetingTagsResult>(
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
     * Lists up to 100 active Amazon Chime SDK meetings. For more information
     * about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"
     * >Using the Amazon Chime SDK</a> in the <i>Amazon Chime Developer
     * Guide</i>.
     * </p>
     * 
     * @param listMeetingsRequest
     * @return listMeetingsResult The response from the ListMeetings service
     *         method, as returned by Amazon Chime.
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListMeetingsResult listMeetings(ListMeetingsRequest listMeetingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMeetingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMeetingsRequest> request = null;
        Response<ListMeetingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMeetingsRequestMarshaller().marshall(listMeetingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMeetingsResult, JsonUnmarshallerContext> unmarshaller = new ListMeetingsResultJsonUnmarshaller();
            JsonResponseHandler<ListMeetingsResult> responseHandler = new JsonResponseHandler<ListMeetingsResult>(
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
     * Lists the phone number orders for the administrator's Amazon Chime
     * account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return listPhoneNumberOrdersResult The response from the
     *         ListPhoneNumberOrders service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListPhoneNumberOrdersResult listPhoneNumberOrders(
            ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPhoneNumberOrdersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumberOrdersRequest> request = null;
        Response<ListPhoneNumberOrdersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumberOrdersRequestMarshaller()
                        .marshall(listPhoneNumberOrdersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPhoneNumberOrdersResult, JsonUnmarshallerContext> unmarshaller = new ListPhoneNumberOrdersResultJsonUnmarshaller();
            JsonResponseHandler<ListPhoneNumberOrdersResult> responseHandler = new JsonResponseHandler<ListPhoneNumberOrdersResult>(
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
     * Lists the phone numbers for the specified Amazon Chime account, Amazon
     * Chime user, Amazon Chime Voice Connector, or Amazon Chime Voice Connector
     * group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return listPhoneNumbersResult The response from the ListPhoneNumbers
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
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
     * Lists the proxy sessions for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @return listProxySessionsResult The response from the ListProxySessions
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListProxySessionsResult listProxySessions(
            ListProxySessionsRequest listProxySessionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProxySessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProxySessionsRequest> request = null;
        Response<ListProxySessionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProxySessionsRequestMarshaller()
                        .marshall(listProxySessionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProxySessionsResult, JsonUnmarshallerContext> unmarshaller = new ListProxySessionsResultJsonUnmarshaller();
            JsonResponseHandler<ListProxySessionsResult> responseHandler = new JsonResponseHandler<ListProxySessionsResult>(
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
     * Lists the membership details for the specified room in an Amazon Chime
     * Enterprise account, such as the members' IDs, email addresses, and names.
     * </p>
     * 
     * @param listRoomMembershipsRequest
     * @return listRoomMembershipsResult The response from the
     *         ListRoomMemberships service method, as returned by Amazon Chime.
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRoomMembershipsResult listRoomMemberships(
            ListRoomMembershipsRequest listRoomMembershipsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRoomMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoomMembershipsRequest> request = null;
        Response<ListRoomMembershipsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoomMembershipsRequestMarshaller()
                        .marshall(listRoomMembershipsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRoomMembershipsResult, JsonUnmarshallerContext> unmarshaller = new ListRoomMembershipsResultJsonUnmarshaller();
            JsonResponseHandler<ListRoomMembershipsResult> responseHandler = new JsonResponseHandler<ListRoomMembershipsResult>(
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
     * Lists the room details for the specified Amazon Chime Enterprise account.
     * Optionally, filter the results by a member ID (user ID or bot ID) to see
     * a list of rooms that the member belongs to.
     * </p>
     * 
     * @param listRoomsRequest
     * @return listRoomsResult The response from the ListRooms service method,
     *         as returned by Amazon Chime.
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRoomsResult listRooms(ListRoomsRequest listRoomsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRoomsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoomsRequest> request = null;
        Response<ListRoomsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoomsRequestMarshaller().marshall(listRoomsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRoomsResult, JsonUnmarshallerContext> unmarshaller = new ListRoomsResultJsonUnmarshaller();
            JsonResponseHandler<ListRoomsResult> responseHandler = new JsonResponseHandler<ListRoomsResult>(
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
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
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
     * Lists the users that belong to the specified Amazon Chime account. You
     * can specify an email address to list only the user that the email address
     * belongs to.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
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
     * Lists the Amazon Chime Voice Connector groups for the administrator's AWS
     * account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @return listVoiceConnectorGroupsResult The response from the
     *         ListVoiceConnectorGroups service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListVoiceConnectorGroupsResult listVoiceConnectorGroups(
            ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorGroupsRequest> request = null;
        Response<ListVoiceConnectorGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorGroupsRequestMarshaller()
                        .marshall(listVoiceConnectorGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVoiceConnectorGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListVoiceConnectorGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListVoiceConnectorGroupsResult> responseHandler = new JsonResponseHandler<ListVoiceConnectorGroupsResult>(
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
     * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return listVoiceConnectorTerminationCredentialsResult The response from
     *         the ListVoiceConnectorTerminationCredentials service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<ListVoiceConnectorTerminationCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorTerminationCredentialsRequestMarshaller()
                        .marshall(listVoiceConnectorTerminationCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVoiceConnectorTerminationCredentialsResult, JsonUnmarshallerContext> unmarshaller = new ListVoiceConnectorTerminationCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<ListVoiceConnectorTerminationCredentialsResult> responseHandler = new JsonResponseHandler<ListVoiceConnectorTerminationCredentialsResult>(
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
     * Lists the Amazon Chime Voice Connectors for the administrator's AWS
     * account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return listVoiceConnectorsResult The response from the
     *         ListVoiceConnectors service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListVoiceConnectorsResult listVoiceConnectors(
            ListVoiceConnectorsRequest listVoiceConnectorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorsRequest> request = null;
        Response<ListVoiceConnectorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorsRequestMarshaller()
                        .marshall(listVoiceConnectorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListVoiceConnectorsResult, JsonUnmarshallerContext> unmarshaller = new ListVoiceConnectorsResultJsonUnmarshaller();
            JsonResponseHandler<ListVoiceConnectorsResult> responseHandler = new JsonResponseHandler<ListVoiceConnectorsResult>(
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
     * Logs out the specified user from all of the devices they are currently
     * logged into.
     * </p>
     * 
     * @param logoutUserRequest
     * @return logoutUserResult The response from the LogoutUser service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public LogoutUserResult logoutUser(LogoutUserRequest logoutUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(logoutUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LogoutUserRequest> request = null;
        Response<LogoutUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LogoutUserRequestMarshaller().marshall(logoutUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<LogoutUserResult, JsonUnmarshallerContext> unmarshaller = new LogoutUserResultJsonUnmarshaller();
            JsonResponseHandler<LogoutUserResult> responseHandler = new JsonResponseHandler<LogoutUserResult>(
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
     * Creates an events configuration that allows a bot to receive outgoing
     * events sent by Amazon Chime. Choose either an HTTPS endpoint or a Lambda
     * function ARN. For more information, see <a>Bot</a>.
     * </p>
     * 
     * @param putEventsConfigurationRequest
     * @return putEventsConfigurationResult The response from the
     *         PutEventsConfiguration service method, as returned by Amazon
     *         Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws ResourceLimitExceededException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutEventsConfigurationResult putEventsConfiguration(
            PutEventsConfigurationRequest putEventsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putEventsConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventsConfigurationRequest> request = null;
        Response<PutEventsConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventsConfigurationRequestMarshaller()
                        .marshall(putEventsConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutEventsConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutEventsConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutEventsConfigurationResult> responseHandler = new JsonResponseHandler<PutEventsConfigurationResult>(
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
     * Puts retention settings for the specified Amazon Chime Enterprise
     * account. We recommend using AWS CloudTrail to monitor usage of this API
     * for your account. For more information, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/cloudtrail.html"
     * >Logging Amazon Chime API Calls with AWS CloudTrail</a> in the <i>Amazon
     * Chime Administration Guide</i>.
     * </p>
     * <p>
     * To turn off existing retention settings, remove the number of days from
     * the corresponding <b>RetentionDays</b> field in the
     * <b>RetentionSettings</b> object. For more information about retention
     * settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html"
     * >Managing Chat Retention Policies</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param putRetentionSettingsRequest
     * @return putRetentionSettingsResult The response from the
     *         PutRetentionSettings service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutRetentionSettingsResult putRetentionSettings(
            PutRetentionSettingsRequest putRetentionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRetentionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRetentionSettingsRequest> request = null;
        Response<PutRetentionSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRetentionSettingsRequestMarshaller()
                        .marshall(putRetentionSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRetentionSettingsResult, JsonUnmarshallerContext> unmarshaller = new PutRetentionSettingsResultJsonUnmarshaller();
            JsonResponseHandler<PutRetentionSettingsResult> responseHandler = new JsonResponseHandler<PutRetentionSettingsResult>(
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
     * Adds a logging configuration for the specified Amazon Chime Voice
     * Connector. The logging configuration specifies whether SIP message logs
     * are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return putVoiceConnectorLoggingConfigurationResult The response from the
     *         PutVoiceConnectorLoggingConfiguration service method, as returned
     *         by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutVoiceConnectorLoggingConfigurationResult putVoiceConnectorLoggingConfiguration(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorLoggingConfigurationRequest> request = null;
        Response<PutVoiceConnectorLoggingConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorLoggingConfigurationRequestMarshaller()
                        .marshall(putVoiceConnectorLoggingConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutVoiceConnectorLoggingConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutVoiceConnectorLoggingConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutVoiceConnectorLoggingConfigurationResult> responseHandler = new JsonResponseHandler<PutVoiceConnectorLoggingConfigurationResult>(
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
     * Adds origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return putVoiceConnectorOriginationResult The response from the
     *         PutVoiceConnectorOrigination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutVoiceConnectorOriginationResult putVoiceConnectorOrigination(
            PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorOriginationRequest> request = null;
        Response<PutVoiceConnectorOriginationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorOriginationRequestMarshaller()
                        .marshall(putVoiceConnectorOriginationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutVoiceConnectorOriginationResult, JsonUnmarshallerContext> unmarshaller = new PutVoiceConnectorOriginationResultJsonUnmarshaller();
            JsonResponseHandler<PutVoiceConnectorOriginationResult> responseHandler = new JsonResponseHandler<PutVoiceConnectorOriginationResult>(
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
     * Puts the specified proxy configuration to the specified Amazon Chime
     * Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @return putVoiceConnectorProxyResult The response from the
     *         PutVoiceConnectorProxy service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws AccessDeniedException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutVoiceConnectorProxyResult putVoiceConnectorProxy(
            PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorProxyRequest> request = null;
        Response<PutVoiceConnectorProxyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorProxyRequestMarshaller()
                        .marshall(putVoiceConnectorProxyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutVoiceConnectorProxyResult, JsonUnmarshallerContext> unmarshaller = new PutVoiceConnectorProxyResultJsonUnmarshaller();
            JsonResponseHandler<PutVoiceConnectorProxyResult> responseHandler = new JsonResponseHandler<PutVoiceConnectorProxyResult>(
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
     * Adds a streaming configuration for the specified Amazon Chime Voice
     * Connector. The streaming configuration specifies whether media streaming
     * is enabled for sending to Amazon Kinesis. It also sets the retention
     * period, in hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return putVoiceConnectorStreamingConfigurationResult The response from
     *         the PutVoiceConnectorStreamingConfiguration service method, as
     *         returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorStreamingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorStreamingConfigurationRequest> request = null;
        Response<PutVoiceConnectorStreamingConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorStreamingConfigurationRequestMarshaller()
                        .marshall(putVoiceConnectorStreamingConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutVoiceConnectorStreamingConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutVoiceConnectorStreamingConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutVoiceConnectorStreamingConfigurationResult> responseHandler = new JsonResponseHandler<PutVoiceConnectorStreamingConfigurationResult>(
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
     * Adds termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return putVoiceConnectorTerminationResult The response from the
     *         PutVoiceConnectorTermination service method, as returned by
     *         Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws AccessDeniedException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutVoiceConnectorTerminationResult putVoiceConnectorTermination(
            PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorTerminationRequest> request = null;
        Response<PutVoiceConnectorTerminationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorTerminationRequestMarshaller()
                        .marshall(putVoiceConnectorTerminationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutVoiceConnectorTerminationResult, JsonUnmarshallerContext> unmarshaller = new PutVoiceConnectorTerminationResultJsonUnmarshaller();
            JsonResponseHandler<PutVoiceConnectorTerminationResult> responseHandler = new JsonResponseHandler<PutVoiceConnectorTerminationResult>(
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
     * Adds termination SIP credentials for the specified Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void putVoiceConnectorTerminationCredentials(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorTerminationCredentialsRequestMarshaller()
                        .marshall(putVoiceConnectorTerminationCredentialsRequest);
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
     * Redacts the specified message from the specified Amazon Chime
     * conversation.
     * </p>
     * 
     * @param redactConversationMessageRequest
     * @return redactConversationMessageResult The response from the
     *         RedactConversationMessage service method, as returned by Amazon
     *         Chime.
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws BadRequestException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RedactConversationMessageResult redactConversationMessage(
            RedactConversationMessageRequest redactConversationMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(redactConversationMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RedactConversationMessageRequest> request = null;
        Response<RedactConversationMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RedactConversationMessageRequestMarshaller()
                        .marshall(redactConversationMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RedactConversationMessageResult, JsonUnmarshallerContext> unmarshaller = new RedactConversationMessageResultJsonUnmarshaller();
            JsonResponseHandler<RedactConversationMessageResult> responseHandler = new JsonResponseHandler<RedactConversationMessageResult>(
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
     * Redacts the specified message from the specified Amazon Chime chat room.
     * </p>
     * 
     * @param redactRoomMessageRequest
     * @return redactRoomMessageResult The response from the RedactRoomMessage
     *         service method, as returned by Amazon Chime.
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws BadRequestException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RedactRoomMessageResult redactRoomMessage(
            RedactRoomMessageRequest redactRoomMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(redactRoomMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RedactRoomMessageRequest> request = null;
        Response<RedactRoomMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RedactRoomMessageRequestMarshaller()
                        .marshall(redactRoomMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RedactRoomMessageResult, JsonUnmarshallerContext> unmarshaller = new RedactRoomMessageResultJsonUnmarshaller();
            JsonResponseHandler<RedactRoomMessageResult> responseHandler = new JsonResponseHandler<RedactRoomMessageResult>(
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
     * Regenerates the security token for a bot.
     * </p>
     * 
     * @param regenerateSecurityTokenRequest
     * @return regenerateSecurityTokenResult The response from the
     *         RegenerateSecurityToken service method, as returned by Amazon
     *         Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RegenerateSecurityTokenResult regenerateSecurityToken(
            RegenerateSecurityTokenRequest regenerateSecurityTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(regenerateSecurityTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegenerateSecurityTokenRequest> request = null;
        Response<RegenerateSecurityTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegenerateSecurityTokenRequestMarshaller()
                        .marshall(regenerateSecurityTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegenerateSecurityTokenResult, JsonUnmarshallerContext> unmarshaller = new RegenerateSecurityTokenResultJsonUnmarshaller();
            JsonResponseHandler<RegenerateSecurityTokenResult> responseHandler = new JsonResponseHandler<RegenerateSecurityTokenResult>(
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
     * Resets the personal meeting PIN for the specified user on an Amazon Chime
     * account. Returns the <a>User</a> object with the updated personal meeting
     * PIN.
     * </p>
     * 
     * @param resetPersonalPINRequest
     * @return resetPersonalPINResult The response from the ResetPersonalPIN
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResetPersonalPINResult resetPersonalPIN(ResetPersonalPINRequest resetPersonalPINRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetPersonalPINRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetPersonalPINRequest> request = null;
        Response<ResetPersonalPINResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetPersonalPINRequestMarshaller().marshall(resetPersonalPINRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResetPersonalPINResult, JsonUnmarshallerContext> unmarshaller = new ResetPersonalPINResultJsonUnmarshaller();
            JsonResponseHandler<ResetPersonalPINResult> responseHandler = new JsonResponseHandler<ResetPersonalPINResult>(
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
     * Moves a phone number from the <b>Deletion queue</b> back into the phone
     * number <b>Inventory</b>.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return restorePhoneNumberResult The response from the RestorePhoneNumber
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ResourceLimitExceededException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RestorePhoneNumberResult restorePhoneNumber(
            RestorePhoneNumberRequest restorePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restorePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestorePhoneNumberRequest> request = null;
        Response<RestorePhoneNumberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestorePhoneNumberRequestMarshaller()
                        .marshall(restorePhoneNumberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RestorePhoneNumberResult, JsonUnmarshallerContext> unmarshaller = new RestorePhoneNumberResultJsonUnmarshaller();
            JsonResponseHandler<RestorePhoneNumberResult> responseHandler = new JsonResponseHandler<RestorePhoneNumberResult>(
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
     * Searches phone numbers that can be ordered.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return searchAvailablePhoneNumbersResult The response from the
     *         SearchAvailablePhoneNumbers service method, as returned by Amazon
     *         Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws AccessDeniedException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchAvailablePhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAvailablePhoneNumbersRequest> request = null;
        Response<SearchAvailablePhoneNumbersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAvailablePhoneNumbersRequestMarshaller()
                        .marshall(searchAvailablePhoneNumbersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchAvailablePhoneNumbersResult, JsonUnmarshallerContext> unmarshaller = new SearchAvailablePhoneNumbersResultJsonUnmarshaller();
            JsonResponseHandler<SearchAvailablePhoneNumbersResult> responseHandler = new JsonResponseHandler<SearchAvailablePhoneNumbersResult>(
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
     * Applies the specified tags to the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param tagAttendeeRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void tagAttendee(TagAttendeeRequest tagAttendeeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagAttendeeRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagAttendeeRequestMarshaller().marshall(tagAttendeeRequest);
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
     * Applies the specified tags to the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param tagMeetingRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
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
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void tagMeeting(TagMeetingRequest tagMeetingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagMeetingRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagMeetingRequestMarshaller().marshall(tagMeetingRequest);
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
     * Applies the specified tags to the specified Amazon Chime SDK meeting
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
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
     * Untags the specified tags from the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param untagAttendeeRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void untagAttendee(UntagAttendeeRequest untagAttendeeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagAttendeeRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagAttendeeRequestMarshaller().marshall(untagAttendeeRequest);
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
     * Untags the specified tags from the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param untagMeetingRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void untagMeeting(UntagMeetingRequest untagMeetingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagMeetingRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagMeetingRequestMarshaller().marshall(untagMeetingRequest);
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
     * Untags the specified tags from the specified Amazon Chime SDK meeting
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
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
     * Updates account details for the specified Amazon Chime account.
     * Currently, only account name updates are supported for this action.
     * </p>
     * 
     * @param updateAccountRequest
     * @return updateAccountResult The response from the UpdateAccount service
     *         method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAccountResult updateAccount(UpdateAccountRequest updateAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountRequest> request = null;
        Response<UpdateAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountRequestMarshaller().marshall(updateAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAccountResult, JsonUnmarshallerContext> unmarshaller = new UpdateAccountResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAccountResult> responseHandler = new JsonResponseHandler<UpdateAccountResult>(
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
     * Updates the settings for the specified Amazon Chime account. You can
     * update settings for remote control of shared screens, or for the dial-out
     * option. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the
     * Policies Page</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return updateAccountSettingsResult The response from the
     *         UpdateAccountSettings service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAccountSettingsResult updateAccountSettings(
            UpdateAccountSettingsRequest updateAccountSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountSettingsRequest> request = null;
        Response<UpdateAccountSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountSettingsRequestMarshaller()
                        .marshall(updateAccountSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAccountSettingsResult, JsonUnmarshallerContext> unmarshaller = new UpdateAccountSettingsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAccountSettingsResult> responseHandler = new JsonResponseHandler<UpdateAccountSettingsResult>(
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
     * Updates the status of the specified bot, such as starting or stopping the
     * bot from running in your Amazon Chime Enterprise account.
     * </p>
     * 
     * @param updateBotRequest
     * @return updateBotResult The response from the UpdateBot service method,
     *         as returned by Amazon Chime.
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateBotResult updateBot(UpdateBotRequest updateBotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBotRequest> request = null;
        Response<UpdateBotResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBotRequestMarshaller().marshall(updateBotRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBotResult, JsonUnmarshallerContext> unmarshaller = new UpdateBotResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBotResult> responseHandler = new JsonResponseHandler<UpdateBotResult>(
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
     * Updates global settings for the administrator's AWS account, such as
     * Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalSettingsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalSettingsRequestMarshaller()
                        .marshall(updateGlobalSettingsRequest);
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
     * Updates phone number details, such as product type or calling name, for
     * the specified phone number ID. You can update one phone number detail at
     * a time. For example, you can update either the product type or the
     * calling name in one action.
     * </p>
     * <p>
     * For toll-free numbers, you must use the Amazon Chime Voice Connector
     * product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete.
     * Pending updates to outbound calling names must be complete before you can
     * request another update.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return updatePhoneNumberResult The response from the UpdatePhoneNumber
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePhoneNumberResult updatePhoneNumber(
            UpdatePhoneNumberRequest updatePhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePhoneNumberRequest> request = null;
        Response<UpdatePhoneNumberResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePhoneNumberRequestMarshaller()
                        .marshall(updatePhoneNumberRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePhoneNumberResult, JsonUnmarshallerContext> unmarshaller = new UpdatePhoneNumberResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePhoneNumberResult> responseHandler = new JsonResponseHandler<UpdatePhoneNumberResult>(
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
     * Updates the phone number settings for the administrator's AWS account,
     * such as the default outbound calling name. You can update the default
     * outbound calling name once every seven days. Outbound calling names can
     * take up to 72 hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updatePhoneNumberSettings(
            UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePhoneNumberSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePhoneNumberSettingsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePhoneNumberSettingsRequestMarshaller()
                        .marshall(updatePhoneNumberSettingsRequest);
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
     * Updates the specified proxy session details, such as voice or SMS
     * capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @return updateProxySessionResult The response from the UpdateProxySession
     *         service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateProxySessionResult updateProxySession(
            UpdateProxySessionRequest updateProxySessionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProxySessionRequest> request = null;
        Response<UpdateProxySessionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProxySessionRequestMarshaller()
                        .marshall(updateProxySessionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProxySessionResult, JsonUnmarshallerContext> unmarshaller = new UpdateProxySessionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProxySessionResult> responseHandler = new JsonResponseHandler<UpdateProxySessionResult>(
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
     * Updates room details, such as the room name, for a room in an Amazon
     * Chime Enterprise account.
     * </p>
     * 
     * @param updateRoomRequest
     * @return updateRoomResult The response from the UpdateRoom service method,
     *         as returned by Amazon Chime.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRoomResult updateRoom(UpdateRoomRequest updateRoomRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoomRequest> request = null;
        Response<UpdateRoomResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoomRequestMarshaller().marshall(updateRoomRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRoomResult, JsonUnmarshallerContext> unmarshaller = new UpdateRoomResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRoomResult> responseHandler = new JsonResponseHandler<UpdateRoomResult>(
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
     * Updates room membership details, such as the member role, for a room in
     * an Amazon Chime Enterprise account. The member role designates whether
     * the member is a chat room administrator or a general chat room member.
     * The member role can be updated only for user IDs.
     * </p>
     * 
     * @param updateRoomMembershipRequest
     * @return updateRoomMembershipResult The response from the
     *         UpdateRoomMembership service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRoomMembershipResult updateRoomMembership(
            UpdateRoomMembershipRequest updateRoomMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRoomMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoomMembershipRequest> request = null;
        Response<UpdateRoomMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoomMembershipRequestMarshaller()
                        .marshall(updateRoomMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRoomMembershipResult, JsonUnmarshallerContext> unmarshaller = new UpdateRoomMembershipResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRoomMembershipResult> responseHandler = new JsonResponseHandler<UpdateRoomMembershipResult>(
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
     * Updates user details for a specified user ID. Currently, only
     * <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param updateUserRequest
     * @return updateUserResult The response from the UpdateUser service method,
     *         as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateUserResult updateUser(UpdateUserRequest updateUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestMarshaller().marshall(updateUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserResult> responseHandler = new JsonResponseHandler<UpdateUserResult>(
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
     * Updates the settings for the specified user, such as phone number
     * settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateUserSettings(UpdateUserSettingsRequest updateUserSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserSettingsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserSettingsRequestMarshaller()
                        .marshall(updateUserSettingsRequest);
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
     * Updates details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return updateVoiceConnectorResult The response from the
     *         UpdateVoiceConnector service method, as returned by Amazon Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateVoiceConnectorResult updateVoiceConnector(
            UpdateVoiceConnectorRequest updateVoiceConnectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceConnectorRequest> request = null;
        Response<UpdateVoiceConnectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceConnectorRequestMarshaller()
                        .marshall(updateVoiceConnectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVoiceConnectorResult, JsonUnmarshallerContext> unmarshaller = new UpdateVoiceConnectorResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVoiceConnectorResult> responseHandler = new JsonResponseHandler<UpdateVoiceConnectorResult>(
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
     * Updates details for the specified Amazon Chime Voice Connector group,
     * such as the name and Amazon Chime Voice Connector priority ranking.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @return updateVoiceConnectorGroupResult The response from the
     *         UpdateVoiceConnectorGroup service method, as returned by Amazon
     *         Chime.
     * @throws UnauthorizedClientException
     * @throws NotFoundException
     * @throws ForbiddenException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Chime indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateVoiceConnectorGroupResult updateVoiceConnectorGroup(
            UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceConnectorGroupRequest> request = null;
        Response<UpdateVoiceConnectorGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceConnectorGroupRequestMarshaller()
                        .marshall(updateVoiceConnectorGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVoiceConnectorGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateVoiceConnectorGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVoiceConnectorGroupResult> responseHandler = new JsonResponseHandler<UpdateVoiceConnectorGroupResult>(
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
