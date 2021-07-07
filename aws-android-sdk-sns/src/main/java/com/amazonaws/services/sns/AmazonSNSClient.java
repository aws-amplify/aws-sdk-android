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

package com.amazonaws.services.sns;

import org.w3c.dom.*;

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

import com.amazonaws.services.sns.model.*;
import com.amazonaws.services.sns.model.transform.*;

/**
 * Client for accessing Amazon Simple Notification Service. All service calls
 * made using this client are blocking, and will not return until the service
 * call completes.
 * <p>
 * <fullname>Amazon Simple Notification Service</fullname>
 * <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables
 * you to build distributed web-enabled applications. Applications can use
 * Amazon SNS to easily push real-time notification messages to interested
 * subscribers over multiple delivery protocols. For more information about this
 * product see the <a href="http://aws.amazon.com/sns/">Amazon SNS product
 * page</a>. For detailed information about Amazon SNS features and their
 * associated API calls, see the <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/">Amazon SNS Developer
 * Guide</a>.
 * </p>
 * <p>
 * For information on the permissions you need to use this API, see <a href=
 * "https://docs.aws.amazon.com/sns/latest/dg/sns-authentication-and-access-control.html"
 * >Identity and access management in Amazon SNS</a> in the <i>Amazon SNS
 * Developer Guide.</i>
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred
 * programming language. The SDKs contain functionality that automatically takes
 * care of tasks such as: cryptographically signing your service requests,
 * retrying requests, and handling error responses. For a list of available
 * SDKs, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 */
public class AmazonSNSClient extends AmazonWebServiceClient implements AmazonSNS {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Simple Notification
     * Service exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AmazonSNS. A
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
    public AmazonSNSClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSNS. A
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
     *            how this client connects to AmazonSNS (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSNSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSNS using the
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
     *         AmazonSNSClient client = new AmazonSNSClient(AWSMobileClient.getInstance());
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
    public AmazonSNSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSNS using the
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
     *         AmazonSNSClient client = new AmazonSNSClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonSNS (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonSNSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSNS using the
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
     *         AmazonSNSClient client = new AmazonSNSClient(AWSMobileClient.getInstance());
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
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSNS using the
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
     *         AmazonSNSClient client = new AmazonSNSClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonSNS (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSNS using the
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
     *            how this client connects to AmazonSNS (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonSNS using the
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
     *         AmazonSNSClient client = new AmazonSNSClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonSNS (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new AuthorizationErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ConcurrentAccessExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EndpointDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FilterPolicyLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSecurityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSAccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSInvalidStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSOptInRequiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSThrottlingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OptedOutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PlatformApplicationDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StaleTagExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ThrottledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TopicLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UserErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ValidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new VerificationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("sns.us-east-1.amazonaws.com");
        this.endpointPrefix = "sns";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/sns/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/sns/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for
     * the specified accounts to the specified actions.
     * </p>
     * 
     * @param addPermissionRequest
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void addPermission(AddPermissionRequest addPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPermissionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new AddPermissionRequestMarshaller().marshall(addPermissionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts a phone number and indicates whether the phone holder has opted
     * out of receiving SMS messages from your account. You cannot send SMS
     * messages to a number that is opted out.
     * </p>
     * <p>
     * To resume sending messages, you can opt in the number by using the
     * <code>OptInPhoneNumber</code> action.
     * </p>
     * 
     * @param checkIfPhoneNumberIsOptedOutRequest <p>
     *            The input for the <code>CheckIfPhoneNumberIsOptedOut</code>
     *            action.
     *            </p>
     * @return checkIfPhoneNumberIsOptedOutResult The response from the
     *         CheckIfPhoneNumberIsOptedOut service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CheckIfPhoneNumberIsOptedOutResult checkIfPhoneNumberIsOptedOut(
            CheckIfPhoneNumberIsOptedOutRequest checkIfPhoneNumberIsOptedOutRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(checkIfPhoneNumberIsOptedOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckIfPhoneNumberIsOptedOutRequest> request = null;
        Response<CheckIfPhoneNumberIsOptedOutResult> response = null;
        try {
            request = new CheckIfPhoneNumberIsOptedOutRequestMarshaller()
                    .marshall(checkIfPhoneNumberIsOptedOutRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CheckIfPhoneNumberIsOptedOutResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the
     * token sent to the endpoint by an earlier <code>Subscribe</code> action.
     * If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only
     * when the <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param confirmSubscriptionRequest <p>
     *            Input for ConfirmSubscription action.
     *            </p>
     * @return confirmSubscriptionResult The response from the
     *         ConfirmSubscription service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     * @throws NotFoundException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws FilterPolicyLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ConfirmSubscriptionResult confirmSubscription(
            ConfirmSubscriptionRequest confirmSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(confirmSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmSubscriptionRequest> request = null;
        Response<ConfirmSubscriptionResult> response = null;
        try {
            request = new ConfirmSubscriptionRequestMarshaller()
                    .marshall(confirmSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ConfirmSubscriptionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging),
     * to which devices and mobile apps may register. You must specify
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code>
     * attributes when using the <code>CreatePlatformApplication</code> action.
     * </p>
     * <p>
     * <code>PlatformPrincipal</code> and <code>PlatformCredential</code> are
     * received from the notification service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>ADM</code>, <code>PlatformPrincipal</code> is
     * <code>client id</code> and <code>PlatformCredential</code> is
     * <code>client secret</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>Baidu</code>, <code>PlatformPrincipal</code> is
     * <code>API key</code> and <code>PlatformCredential</code> is
     * <code>secret key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>APNS</code> and <code>APNS_SANDBOX</code>,
     * <code>PlatformPrincipal</code> is <code>SSL certificate</code> and
     * <code>PlatformCredential</code> is <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>GCM</code> (Firebase Cloud Messaging), there is no
     * <code>PlatformPrincipal</code> and the <code>PlatformCredential</code> is
     * <code>API key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>MPNS</code>, <code>PlatformPrincipal</code> is
     * <code>TLS certificate</code> and <code>PlatformCredential</code> is
     * <code>private key</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>WNS</code>, <code>PlatformPrincipal</code> is
     * <code>Package Security Identifier</code> and
     * <code>PlatformCredential</code> is <code>secret key</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use the returned <code>PlatformApplicationArn</code> as an
     * attribute for the <code>CreatePlatformEndpoint</code> action.
     * </p>
     * 
     * @param createPlatformApplicationRequest <p>
     *            Input for CreatePlatformApplication action.
     *            </p>
     * @return createPlatformApplicationResult The response from the
     *         CreatePlatformApplication service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreatePlatformApplicationResult createPlatformApplication(
            CreatePlatformApplicationRequest createPlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlatformApplicationRequest> request = null;
        Response<CreatePlatformApplicationResult> response = null;
        try {
            request = new CreatePlatformApplicationRequestMarshaller()
                    .marshall(createPlatformApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreatePlatformApplicationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for a device and mobile app on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. <code>CreatePlatformEndpoint</code> requires the
     * <code>PlatformApplicationArn</code> that is returned from
     * <code>CreatePlatformApplication</code>. You can use the returned
     * <code>EndpointArn</code> to send a message to a mobile app or by the
     * <code>Subscribe</code> action for subscription to a topic. The
     * <code>CreatePlatformEndpoint</code> action is idempotent, so if the
     * requester already owns an endpoint with the same device token and
     * attributes, that endpoint's ARN is returned without creating a new
     * endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When using <code>CreatePlatformEndpoint</code> with Baidu, two attributes
     * must be provided: ChannelId and UserId. The token field must also contain
     * the ChannelId. For more information, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePushBaiduEndpoint.html"
     * >Creating an Amazon SNS Endpoint for Baidu</a>.
     * </p>
     * 
     * @param createPlatformEndpointRequest <p>
     *            Input for CreatePlatformEndpoint action.
     *            </p>
     * @return createPlatformEndpointResult The response from the
     *         CreatePlatformEndpoint service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreatePlatformEndpointResult createPlatformEndpoint(
            CreatePlatformEndpointRequest createPlatformEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPlatformEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlatformEndpointRequest> request = null;
        Response<CreatePlatformEndpointResult> response = null;
        try {
            request = new CreatePlatformEndpointRequestMarshaller()
                    .marshall(createPlatformEndpointRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreatePlatformEndpointResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a destination phone number to an account in the SMS sandbox and
     * sends a one-time password (OTP) to that phone number.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param createSMSSandboxPhoneNumberRequest
     * @return createSMSSandboxPhoneNumberResult The response from the
     *         CreateSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws OptedOutException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateSMSSandboxPhoneNumberResult createSMSSandboxPhoneNumber(
            CreateSMSSandboxPhoneNumberRequest createSMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSMSSandboxPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSMSSandboxPhoneNumberRequest> request = null;
        Response<CreateSMSSandboxPhoneNumberResult> response = null;
        try {
            request = new CreateSMSSandboxPhoneNumberRequestMarshaller()
                    .marshall(createSMSSandboxPhoneNumberRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateSMSSandboxPhoneNumberResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create
     * at most 100,000 standard topics (at most 1,000 FIFO topics). For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html"
     * >Creating an Amazon SNS topic</a> in the <i>Amazon SNS Developer
     * Guide</i>. This action is idempotent, so if the requester already owns a
     * topic with the specified name, that topic's ARN is returned without
     * creating a new topic.
     * </p>
     * 
     * @param createTopicRequest <p>
     *            Input for CreateTopic action.
     *            </p>
     * @return createTopicResult The response from the CreateTopic service
     *         method, as returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateTopicResult createTopic(CreateTopicRequest createTopicRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTopicRequest> request = null;
        Response<CreateTopicResult> response = null;
        try {
            request = new CreateTopicRequestMarshaller().marshall(createTopicRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateTopicResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This
     * action is idempotent. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * When you delete an endpoint that is also subscribed to a topic, then you
     * must also unsubscribe the endpoint from the topic.
     * </p>
     * 
     * @param deleteEndpointRequest <p>
     *            Input for DeleteEndpoint action.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteEndpointRequestMarshaller().marshall(deleteEndpointRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a platform application object for one of the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param deletePlatformApplicationRequest <p>
     *            Input for DeletePlatformApplication action.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deletePlatformApplication(
            DeletePlatformApplicationRequest deletePlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlatformApplicationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeletePlatformApplicationRequestMarshaller()
                    .marshall(deletePlatformApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an account's verified or pending phone number from the SMS
     * sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param deleteSMSSandboxPhoneNumberRequest
     * @return deleteSMSSandboxPhoneNumberResult The response from the
     *         DeleteSMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteSMSSandboxPhoneNumberResult deleteSMSSandboxPhoneNumber(
            DeleteSMSSandboxPhoneNumberRequest deleteSMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSMSSandboxPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSMSSandboxPhoneNumberRequest> request = null;
        Response<DeleteSMSSandboxPhoneNumberResult> response = null;
        try {
            request = new DeleteSMSSandboxPhoneNumberRequestMarshaller()
                    .marshall(deleteSMSSandboxPhoneNumberRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteSMSSandboxPhoneNumberResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent
     * some messages previously sent to the topic from being delivered to
     * subscribers. This action is idempotent, so deleting a topic that does not
     * exist does not result in an error.
     * </p>
     * 
     * @param deleteTopicRequest
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteTopic(DeleteTopicRequest deleteTopicRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTopicRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteTopicRequestMarshaller().marshall(deleteTopicRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the endpoint attributes for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getEndpointAttributesRequest <p>
     *            Input for GetEndpointAttributes action.
     *            </p>
     * @return getEndpointAttributesResult The response from the
     *         GetEndpointAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetEndpointAttributesResult getEndpointAttributes(
            GetEndpointAttributesRequest getEndpointAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEndpointAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEndpointAttributesRequest> request = null;
        Response<GetEndpointAttributesResult> response = null;
        try {
            request = new GetEndpointAttributesRequestMarshaller()
                    .marshall(getEndpointAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetEndpointAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the attributes of the platform application object for the
     * supported push notification services, such as APNS and GCM (Firebase
     * Cloud Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param getPlatformApplicationAttributesRequest <p>
     *            Input for GetPlatformApplicationAttributes action.
     *            </p>
     * @return getPlatformApplicationAttributesResult The response from the
     *         GetPlatformApplicationAttributes service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetPlatformApplicationAttributesResult getPlatformApplicationAttributes(
            GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPlatformApplicationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlatformApplicationAttributesRequest> request = null;
        Response<GetPlatformApplicationAttributesResult> response = null;
        try {
            request = new GetPlatformApplicationAttributesRequestMarshaller()
                    .marshall(getPlatformApplicationAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetPlatformApplicationAttributesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the settings for sending SMS messages from your account.
     * </p>
     * <p>
     * These settings are set with the <code>SetSMSAttributes</code> action.
     * </p>
     * 
     * @param getSMSAttributesRequest <p>
     *            The input for the <code>GetSMSAttributes</code> request.
     *            </p>
     * @return getSMSAttributesResult The response from the GetSMSAttributes
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetSMSAttributesResult getSMSAttributes(GetSMSAttributesRequest getSMSAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSMSAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSMSAttributesRequest> request = null;
        Response<GetSMSAttributesResult> response = null;
        try {
            request = new GetSMSAttributesRequestMarshaller().marshall(getSMSAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetSMSAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the SMS sandbox status for the calling account in the target
     * Region.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param getSMSSandboxAccountStatusRequest
     * @return getSMSSandboxAccountStatusResult The response from the
     *         GetSMSSandboxAccountStatus service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetSMSSandboxAccountStatusResult getSMSSandboxAccountStatus(
            GetSMSSandboxAccountStatusRequest getSMSSandboxAccountStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSMSSandboxAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSMSSandboxAccountStatusRequest> request = null;
        Response<GetSMSSandboxAccountStatusResult> response = null;
        try {
            request = new GetSMSSandboxAccountStatusRequestMarshaller()
                    .marshall(getSMSSandboxAccountStatusRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetSMSSandboxAccountStatusResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param getSubscriptionAttributesRequest <p>
     *            Input for GetSubscriptionAttributes.
     *            </p>
     * @return getSubscriptionAttributesResult The response from the
     *         GetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetSubscriptionAttributesResult getSubscriptionAttributes(
            GetSubscriptionAttributesRequest getSubscriptionAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSubscriptionAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionAttributesRequest> request = null;
        Response<GetSubscriptionAttributesResult> response = null;
        try {
            request = new GetSubscriptionAttributesRequestMarshaller()
                    .marshall(getSubscriptionAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetSubscriptionAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might
     * differ based on the authorization of the user.
     * </p>
     * 
     * @param getTopicAttributesRequest <p>
     *            Input for GetTopicAttributes action.
     *            </p>
     * @return getTopicAttributesResult The response from the GetTopicAttributes
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetTopicAttributesResult getTopicAttributes(
            GetTopicAttributesRequest getTopicAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTopicAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTopicAttributesRequest> request = null;
        Response<GetTopicAttributesResult> response = null;
        try {
            request = new GetTopicAttributesRequestMarshaller().marshall(getTopicAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetTopicAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the endpoints and endpoint attributes for devices in a supported
     * push notification service, such as GCM (Firebase Cloud Messaging) and
     * APNS. The results for <code>ListEndpointsByPlatformApplication</code> are
     * paginated and return a limited list of endpoints, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the NextToken
     * string received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listEndpointsByPlatformApplicationRequest <p>
     *            Input for ListEndpointsByPlatformApplication action.
     *            </p>
     * @return listEndpointsByPlatformApplicationResult The response from the
     *         ListEndpointsByPlatformApplication service method, as returned by
     *         Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListEndpointsByPlatformApplicationResult listEndpointsByPlatformApplication(
            ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEndpointsByPlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointsByPlatformApplicationRequest> request = null;
        Response<ListEndpointsByPlatformApplicationResult> response = null;
        try {
            request = new ListEndpointsByPlatformApplicationRequestMarshaller()
                    .marshall(listEndpointsByPlatformApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ListEndpointsByPlatformApplicationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the calling account's dedicated origination numbers and their
     * metadata. For more information about origination numbers, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/channels-sms-originating-identities-origination-numbers.html"
     * >Origination numbers</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listOriginationNumbersRequest
     * @return listOriginationNumbersResult The response from the
     *         ListOriginationNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws ThrottledException
     * @throws InvalidParameterException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListOriginationNumbersResult listOriginationNumbers(
            ListOriginationNumbersRequest listOriginationNumbersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOriginationNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOriginationNumbersRequest> request = null;
        Response<ListOriginationNumbersResult> response = null;
        try {
            request = new ListOriginationNumbersRequestMarshaller()
                    .marshall(listOriginationNumbersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListOriginationNumbersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of phone numbers that are opted out, meaning you cannot
     * send SMS messages to them.
     * </p>
     * <p>
     * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and
     * each page returns up to 100 phone numbers. If additional phone numbers
     * are available after the first page of results, then a
     * <code>NextToken</code> string will be returned. To receive the next page,
     * you call <code>ListPhoneNumbersOptedOut</code> again using the
     * <code>NextToken</code> string received from the previous call. When there
     * are no more records to return, <code>NextToken</code> will be null.
     * </p>
     * 
     * @param listPhoneNumbersOptedOutRequest <p>
     *            The input for the <code>ListPhoneNumbersOptedOut</code>
     *            action.
     *            </p>
     * @return listPhoneNumbersOptedOutResult The response from the
     *         ListPhoneNumbersOptedOut service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListPhoneNumbersOptedOutResult listPhoneNumbersOptedOut(
            ListPhoneNumbersOptedOutRequest listPhoneNumbersOptedOutRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPhoneNumbersOptedOutRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumbersOptedOutRequest> request = null;
        Response<ListPhoneNumbersOptedOutResult> response = null;
        try {
            request = new ListPhoneNumbersOptedOutRequestMarshaller()
                    .marshall(listPhoneNumbersOptedOutRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListPhoneNumbersOptedOutResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the platform application objects for the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * The results for <code>ListPlatformApplications</code> are paginated and
     * return a limited list of applications, up to 100. If additional records
     * are available after the first page results, then a NextToken string will
     * be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string received
     * from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @param listPlatformApplicationsRequest <p>
     *            Input for ListPlatformApplications action.
     *            </p>
     * @return listPlatformApplicationsResult The response from the
     *         ListPlatformApplications service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListPlatformApplicationsResult listPlatformApplications(
            ListPlatformApplicationsRequest listPlatformApplicationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPlatformApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlatformApplicationsRequest> request = null;
        Response<ListPlatformApplicationsResult> response = null;
        try {
            request = new ListPlatformApplicationsRequestMarshaller()
                    .marshall(listPlatformApplicationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListPlatformApplicationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the calling account's current verified and pending destination
     * phone numbers in the SMS sandbox.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param listSMSSandboxPhoneNumbersRequest
     * @return listSMSSandboxPhoneNumbersResult The response from the
     *         ListSMSSandboxPhoneNumbers service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListSMSSandboxPhoneNumbersResult listSMSSandboxPhoneNumbers(
            ListSMSSandboxPhoneNumbersRequest listSMSSandboxPhoneNumbersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSMSSandboxPhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSMSSandboxPhoneNumbersRequest> request = null;
        Response<ListSMSSandboxPhoneNumbersResult> response = null;
        try {
            request = new ListSMSSandboxPhoneNumbersRequestMarshaller()
                    .marshall(listSMSSandboxPhoneNumbersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListSMSSandboxPhoneNumbersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a
     * limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new <code>ListSubscriptions</code>
     * call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsRequest <p>
     *            Input for ListSubscriptions action.
     *            </p>
     * @return listSubscriptionsResult The response from the ListSubscriptions
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListSubscriptionsResult listSubscriptions(
            ListSubscriptionsRequest listSubscriptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionsRequest> request = null;
        Response<ListSubscriptionsResult> response = null;
        try {
            request = new ListSubscriptionsRequestMarshaller().marshall(listSubscriptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListSubscriptionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call
     * returns a limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listSubscriptionsByTopicRequest <p>
     *            Input for ListSubscriptionsByTopic action.
     *            </p>
     * @return listSubscriptionsByTopicResult The response from the
     *         ListSubscriptionsByTopic service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(
            ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSubscriptionsByTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscriptionsByTopicRequest> request = null;
        Response<ListSubscriptionsByTopicResult> response = null;
        try {
            request = new ListSubscriptionsByTopicRequestMarshaller()
                    .marshall(listSubscriptionsByTopicRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListSubscriptionsByTopicResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all tags added to the specified Amazon SNS topic. For an overview,
     * see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon Simple Notification Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
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
            request = new ListTagsForResourceRequestMarshaller()
                    .marshall(listTagsForResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTagsForResourceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited
     * list of topics, up to 100. If there are more topics, a
     * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param listTopicsRequest
     * @return listTopicsResult The response from the ListTopics service method,
     *         as returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListTopicsResult listTopics(ListTopicsRequest listTopicsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTopicsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicsRequest> request = null;
        Response<ListTopicsResult> response = null;
        try {
            request = new ListTopicsRequestMarshaller().marshall(listTopicsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListTopicsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this request to opt in a phone number that is opted out, which
     * enables you to resume sending SMS messages to the number.
     * </p>
     * <p>
     * You can opt in a phone number only once every 30 days.
     * </p>
     * 
     * @param optInPhoneNumberRequest <p>
     *            Input for the OptInPhoneNumber action.
     *            </p>
     * @return optInPhoneNumberResult The response from the OptInPhoneNumber
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public OptInPhoneNumberResult optInPhoneNumber(OptInPhoneNumberRequest optInPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(optInPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<OptInPhoneNumberRequest> request = null;
        Response<OptInPhoneNumberResult> response = null;
        try {
            request = new OptInPhoneNumberRequestMarshaller().marshall(optInPhoneNumberRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new OptInPhoneNumberResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a message to an Amazon SNS topic, a text message (SMS message)
     * directly to a phone number, or a message to a mobile platform endpoint
     * (when you specify the <code>TargetArn</code>).
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each
     * endpoint that is subscribed to the topic. The format of the message
     * depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and
     * Amazon SNS will attempt to deliver it shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile
     * endpoint, such as an app on a Kindle device or mobile phone, you must
     * specify the EndpointArn for the TargetArn parameter. The EndpointArn is
     * returned when making a call with the <code>CreatePlatformEndpoint</code>
     * action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
     * >Send Custom Platform-Specific Payloads in Messages to Mobile
     * Devices</a>.
     * </p>
     * <important>
     * <p>
     * You can publish messages only to topics and endpoints in the same Region.
     * </p>
     * </important>
     * 
     * @param publishRequest <p>
     *            Input for Publish action.
     *            </p>
     * @return publishResult The response from the Publish service method, as
     *         returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PublishResult publish(PublishRequest publishRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(publishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishRequest> request = null;
        Response<PublishResult> response = null;
        try {
            request = new PublishRequestMarshaller().marshall(publishRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new PublishResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param removePermissionRequest <p>
     *            Input for RemovePermission action.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void removePermission(RemovePermissionRequest removePermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemovePermissionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new RemovePermissionRequestMarshaller().marshall(removePermissionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the attributes for an endpoint for a device on one of the supported
     * push notification services, such as GCM (Firebase Cloud Messaging) and
     * APNS. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * 
     * @param setEndpointAttributesRequest <p>
     *            Input for SetEndpointAttributes action.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void setEndpointAttributes(SetEndpointAttributesRequest setEndpointAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setEndpointAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetEndpointAttributesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetEndpointAttributesRequestMarshaller()
                    .marshall(setEndpointAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the attributes of the platform application object for the supported
     * push notification services, such as APNS and GCM (Firebase Cloud
     * Messaging). For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>. For information on configuring
     * attributes for message delivery status, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html"
     * >Using Amazon SNS Application Attributes for Message Delivery Status</a>.
     * </p>
     * 
     * @param setPlatformApplicationAttributesRequest <p>
     *            Input for SetPlatformApplicationAttributes action.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void setPlatformApplicationAttributes(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setPlatformApplicationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetPlatformApplicationAttributesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetPlatformApplicationAttributesRequestMarshaller()
                    .marshall(setPlatformApplicationAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this request to set the default settings for sending SMS messages and
     * receiving daily SMS usage reports.
     * </p>
     * <p>
     * You can override some of these settings for a single message when you use
     * the <code>Publish</code> action with the
     * <code>MessageAttributes.entry.N</code> parameter. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html"
     * >Publishing to a mobile phone</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this operation, you must grant the Amazon SNS service principal (
     * <code>sns.amazonaws.com</code>) permission to perform the
     * <code>s3:ListBucket</code> action.
     * </p>
     * </note>
     * 
     * @param setSMSAttributesRequest <p>
     *            The input for the SetSMSAttributes action.
     *            </p>
     * @return setSMSAttributesResult The response from the SetSMSAttributes
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public SetSMSAttributesResult setSMSAttributes(SetSMSAttributesRequest setSMSAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setSMSAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSMSAttributesRequest> request = null;
        Response<SetSMSAttributesResult> response = null;
        try {
            request = new SetSMSAttributesRequestMarshaller().marshall(setSMSAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SetSMSAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a
     * new value.
     * </p>
     * 
     * @param setSubscriptionAttributesRequest <p>
     *            Input for SetSubscriptionAttributes action.
     *            </p>
     * @throws InvalidParameterException
     * @throws FilterPolicyLimitExceededException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void setSubscriptionAttributes(
            SetSubscriptionAttributesRequest setSubscriptionAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setSubscriptionAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetSubscriptionAttributesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetSubscriptionAttributesRequestMarshaller()
                    .marshall(setSubscriptionAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param setTopicAttributesRequest <p>
     *            Input for SetTopicAttributes action.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void setTopicAttributes(SetTopicAttributesRequest setTopicAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setTopicAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTopicAttributesRequest> request = null;
        Response<Void> response = null;
        try {
            request = new SetTopicAttributesRequestMarshaller().marshall(setTopicAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is
     * HTTP/S or email, or if the endpoint and the topic are not in the same
     * account, the endpoint owner must run the <code>ConfirmSubscription</code>
     * action to confirm the subscription.
     * </p>
     * <p>
     * You call the <code>ConfirmSubscription</code> action with the token from
     * the subscription response. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscribeRequest <p>
     *            Input for Subscribe action.
     *            </p>
     * @return subscribeResult The response from the Subscribe service method,
     *         as returned by Amazon Simple Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws FilterPolicyLimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public SubscribeResult subscribe(SubscribeRequest subscribeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(subscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeRequest> request = null;
        Response<SubscribeResult> response = null;
        try {
            request = new SubscribeRequestMarshaller().marshall(subscribeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new SubscribeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add tags to the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * When you use topic tags, keep the following guidelines in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Adding more than 50 tags to a topic isn't recommended.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags don't have any semantic meaning. Amazon SNS interprets tags as
     * character strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A new tag with a key identical to that of an existing tag overwrites the
     * existing tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tagging actions are limited to 10 TPS per account, per Region. If your
     * application requires a higher throughput, file a <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=technical"
     * >technical support request</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Simple Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new TagResourceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for
     * deletion, only the owner of the subscription or the topic's owner can
     * unsubscribe, and an Amazon Web Services signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the
     * requester is not the subscription owner, a final cancellation message is
     * delivered to the endpoint, so that the endpoint owner can easily
     * resubscribe to the topic if the <code>Unsubscribe</code> request was
     * unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param unsubscribeRequest <p>
     *            Input for Unsubscribe action.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void unsubscribe(UnsubscribeRequest unsubscribeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(unsubscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeRequest> request = null;
        Response<Void> response = null;
        try {
            request = new UnsubscribeRequestMarshaller().marshall(unsubscribeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove tags from the specified Amazon SNS topic. For an overview, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
     * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Simple Notification Service.
     * @throws ResourceNotFoundException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws InvalidParameterException
     * @throws AuthorizationErrorException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UntagResourceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Verifies a destination phone number with a one-time password (OTP) for
     * the calling account.
     * </p>
     * <p>
     * When you start using Amazon SNS to send SMS messages, your account is in
     * the <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for
     * you to try Amazon SNS features without risking your reputation as an SMS
     * sender. While your account is in the SMS sandbox, you can use all of the
     * features of Amazon SNS. However, you can send SMS messages only to
     * verified destination phone numbers. For more information, including how
     * to move out of the sandbox to send messages without restrictions, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
     * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param verifySMSSandboxPhoneNumberRequest
     * @return verifySMSSandboxPhoneNumberResult The response from the
     *         VerifySMSSandboxPhoneNumber service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws VerificationException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public VerifySMSSandboxPhoneNumberResult verifySMSSandboxPhoneNumber(
            VerifySMSSandboxPhoneNumberRequest verifySMSSandboxPhoneNumberRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(verifySMSSandboxPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifySMSSandboxPhoneNumberRequest> request = null;
        Response<VerifySMSSandboxPhoneNumberResult> response = null;
        try {
            request = new VerifySMSSandboxPhoneNumberRequestMarshaller()
                    .marshall(verifySMSSandboxPhoneNumberRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new VerifySMSSandboxPhoneNumberResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a subscription owner to set an attribute of the subscription to a
     * new value.
     * </p>
     * 
     * @param subscriptionArn <p>
     *            The ARN of the subscription to modify.
     *            </p>
     * @param attributeName <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that this action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> – The policy that defines how
     *            Amazon SNS retries failed deliveries to HTTP/S endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FilterPolicy</code> – The simple JSON object that lets
     *            your subscriber receive only a subset of messages, rather than
     *            receiving every message published to the topic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RawMessageDelivery</code> – When set to
     *            <code>true</code>, enables raw message delivery to Amazon SQS
     *            or HTTP/S endpoints. This eliminates the need for the
     *            endpoints to process JSON formatting, which is otherwise
     *            created for Amazon SNS metadata.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> – When specified, sends
     *            undeliverable messages to the specified Amazon SQS dead-letter
     *            queue. Messages that can't be delivered due to client errors
     *            (for example, when the subscribed endpoint is unreachable) or
     *            server errors (for example, when the service that powers the
     *            subscribed endpoint becomes unavailable) are held in the
     *            dead-letter queue for further analysis or reprocessing.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to Amazon Kinesis Data
     *            Firehose delivery stream subscriptions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SubscriptionRoleArn</code> – The ARN of the IAM role
     *            that has the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Permission to write to the Kinesis Data Firehose delivery
     *            stream
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SNS listed as a trusted entity
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Specifying a valid ARN for this attribute is required for
     *            Kinesis Data Firehose delivery stream subscriptions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     *            >Fanout to Kinesis Data Firehose delivery streams</a> in the
     *            <i>Amazon SNS Developer Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @param attributeValue <p>
     *            The new value for the attribute in JSON format.
     *            </p>
     * @throws InvalidParameterException
     * @throws FilterPolicyLimitExceededException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void setSubscriptionAttributes(String subscriptionArn, String attributeName,
            String attributeValue)
            throws AmazonServiceException, AmazonClientException {
        SetSubscriptionAttributesRequest setSubscriptionAttributesRequest = new SetSubscriptionAttributesRequest();
        setSubscriptionAttributesRequest.setSubscriptionArn(subscriptionArn);
        setSubscriptionAttributesRequest.setAttributeName(attributeName);
        setSubscriptionAttributesRequest.setAttributeValue(attributeValue);
        setSubscriptionAttributes(setSubscriptionAttributesRequest);
    }

    /**
     * <p>
     * Returns all of the properties of a subscription.
     * </p>
     * 
     * @param subscriptionArn <p>
     *            The ARN of the subscription whose properties you want to get.
     *            </p>
     * @return getSubscriptionAttributesResult The response from the
     *         GetSubscriptionAttributes service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetSubscriptionAttributesResult getSubscriptionAttributes(String subscriptionArn)
            throws AmazonServiceException, AmazonClientException {
        GetSubscriptionAttributesRequest getSubscriptionAttributesRequest = new GetSubscriptionAttributesRequest();
        getSubscriptionAttributesRequest.setSubscriptionArn(subscriptionArn);
        return getSubscriptionAttributes(getSubscriptionAttributesRequest);
    }

    /**
     * <p>
     * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is
     * HTTP/S or email, or if the endpoint and the topic are not in the same
     * account, the endpoint owner must run the <code>ConfirmSubscription</code>
     * action to confirm the subscription.
     * </p>
     * <p>
     * You call the <code>ConfirmSubscription</code> action with the token from
     * the subscription response. Confirmation tokens are valid for three days.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic you want to subscribe to.
     *            </p>
     * @param protocol <p>
     *            The protocol that you want to use. Supported protocols
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http</code> – delivery of JSON-encoded message via HTTP
     *            POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https</code> – delivery of JSON-encoded message via
     *            HTTPS POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code> – delivery of message via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email-json</code> – delivery of JSON-encoded message via
     *            SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sms</code> – delivery of message via SMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqs</code> – delivery of JSON-encoded message to an
     *            Amazon SQS queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application</code> – delivery of JSON-encoded message to
     *            an EndpointArn for a mobile app and device
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda</code> – delivery of JSON-encoded message to an
     *            Lambda function
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firehose</code> – delivery of JSON-encoded message to an
     *            Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     * @param endpoint <p>
     *            The endpoint that you want to receive notifications. Endpoints
     *            vary by protocol:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>http</code> protocol, the (public) endpoint is a
     *            URL beginning with <code>http://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>https</code> protocol, the (public) endpoint is
     *            a URL beginning with <code>https://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email</code> protocol, the endpoint is an email
     *            address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email-json</code> protocol, the endpoint is an
     *            email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sms</code> protocol, the endpoint is a phone
     *            number of an SMS-enabled device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sqs</code> protocol, the endpoint is the ARN of
     *            an Amazon SQS queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>application</code> protocol, the endpoint is the
     *            EndpointArn of a mobile app and device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>lambda</code> protocol, the endpoint is the ARN
     *            of an Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>firehose</code> protocol, the endpoint is the
     *            ARN of an Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     * @return subscribeResult The response from the Subscribe service method,
     *         as returned by Amazon Simple Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws FilterPolicyLimitExceededException
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public SubscribeResult subscribe(String topicArn, String protocol, String endpoint)
            throws AmazonServiceException, AmazonClientException {
        SubscribeRequest subscribeRequest = new SubscribeRequest();
        subscribeRequest.setTopicArn(topicArn);
        subscribeRequest.setProtocol(protocol);
        subscribeRequest.setEndpoint(endpoint);
        return subscribe(subscribeRequest);
    }

    /**
     * <p>
     * Adds a statement to a topic's access control policy, granting access for
     * the specified accounts to the specified actions.
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic whose access control policy you wish to
     *            modify.
     *            </p>
     * @param label <p>
     *            A unique identifier for the new policy statement.
     *            </p>
     * @param aWSAccountIds <p>
     *            The account IDs of the users (principals) who will be given
     *            access to the specified actions. The users must have account,
     *            but do not need to be signed up for this service.
     *            </p>
     * @param actionNames <p>
     *            The action you want to allow for the specified principal(s).
     *            </p>
     *            <p>
     *            Valid values: Any Amazon SNS action name, for example
     *            <code>Publish</code>.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void addPermission(String topicArn, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames)
            throws AmazonServiceException, AmazonClientException {
        AddPermissionRequest addPermissionRequest = new AddPermissionRequest();
        addPermissionRequest.setTopicArn(topicArn);
        addPermissionRequest.setLabel(label);
        addPermissionRequest.setAWSAccountIds(aWSAccountIds);
        addPermissionRequest.setActionNames(actionNames);
        addPermission(addPermissionRequest);
    }

    /**
     * <p>
     * Returns all of the properties of a topic. Topic properties returned might
     * differ based on the authorization of the user.
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic whose properties you want to get.
     *            </p>
     * @return getTopicAttributesResult The response from the GetTopicAttributes
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetTopicAttributesResult getTopicAttributes(String topicArn)
            throws AmazonServiceException, AmazonClientException {
        GetTopicAttributesRequest getTopicAttributesRequest = new GetTopicAttributesRequest();
        getTopicAttributesRequest.setTopicArn(topicArn);
        return getTopicAttributes(getTopicAttributesRequest);
    }

    /**
     * <p>
     * Removes a statement from a topic's access control policy.
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic whose access control policy you wish to
     *            modify.
     *            </p>
     * @param label <p>
     *            The unique label of the statement you want to remove.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void removePermission(String topicArn, String label)
            throws AmazonServiceException, AmazonClientException {
        RemovePermissionRequest removePermissionRequest = new RemovePermissionRequest();
        removePermissionRequest.setTopicArn(topicArn);
        removePermissionRequest.setLabel(label);
        removePermission(removePermissionRequest);
    }

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited
     * list of topics, up to 100. If there are more topics, a
     * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @return listTopicsResult The response from the ListTopics service method,
     *         as returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListTopicsResult listTopics()
            throws AmazonServiceException, AmazonClientException {
        ListTopicsRequest listTopicsRequest = new ListTopicsRequest();
        return listTopics(listTopicsRequest);
    }

    /**
     * <p>
     * Returns a list of the requester's topics. Each call returns a limited
     * list of topics, up to 100. If there are more topics, a
     * <code>NextToken</code> is also returned. Use the <code>NextToken</code>
     * parameter in a new <code>ListTopics</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param nextToken <p>
     *            Token returned by the previous <code>ListTopics</code>
     *            request.
     *            </p>
     * @return listTopicsResult The response from the ListTopics service method,
     *         as returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListTopicsResult listTopics(String nextToken)
            throws AmazonServiceException, AmazonClientException {
        ListTopicsRequest listTopicsRequest = new ListTopicsRequest();
        listTopicsRequest.setNextToken(nextToken);
        return listTopics(listTopicsRequest);
    }

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the
     * token sent to the endpoint by an earlier <code>Subscribe</code> action.
     * If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only
     * when the <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to confirm a
     *            subscription.
     *            </p>
     * @param token <p>
     *            Short-lived token sent to an endpoint during the
     *            <code>Subscribe</code> action.
     *            </p>
     * @param authenticateOnUnsubscribe <p>
     *            Disallows unauthenticated unsubscribes of the subscription. If
     *            the value of this parameter is <code>true</code> and the
     *            request has an Amazon Web Services signature, then only the
     *            topic owner and the subscription owner can unsubscribe the
     *            endpoint. The unsubscribe action requires Amazon Web Services
     *            authentication.
     *            </p>
     * @return confirmSubscriptionResult The response from the
     *         ConfirmSubscription service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     * @throws NotFoundException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws FilterPolicyLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ConfirmSubscriptionResult confirmSubscription(String topicArn, String token,
            String authenticateOnUnsubscribe)
            throws AmazonServiceException, AmazonClientException {
        ConfirmSubscriptionRequest confirmSubscriptionRequest = new ConfirmSubscriptionRequest();
        confirmSubscriptionRequest.setTopicArn(topicArn);
        confirmSubscriptionRequest.setToken(token);
        confirmSubscriptionRequest.setAuthenticateOnUnsubscribe(authenticateOnUnsubscribe);
        return confirmSubscription(confirmSubscriptionRequest);
    }

    /**
     * <p>
     * Verifies an endpoint owner's intent to receive messages by validating the
     * token sent to the endpoint by an earlier <code>Subscribe</code> action.
     * If the token is valid, the action creates a new subscription and returns
     * its Amazon Resource Name (ARN). This call requires an AWS signature only
     * when the <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to confirm a
     *            subscription.
     *            </p>
     * @param token <p>
     *            Short-lived token sent to an endpoint during the
     *            <code>Subscribe</code> action.
     *            </p>
     * @return confirmSubscriptionResult The response from the
     *         ConfirmSubscription service method, as returned by Amazon Simple
     *         Notification Service.
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     * @throws NotFoundException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws FilterPolicyLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ConfirmSubscriptionResult confirmSubscription(String topicArn, String token)
            throws AmazonServiceException, AmazonClientException {
        ConfirmSubscriptionRequest confirmSubscriptionRequest = new ConfirmSubscriptionRequest();
        confirmSubscriptionRequest.setTopicArn(topicArn);
        confirmSubscriptionRequest.setToken(token);
        return confirmSubscription(confirmSubscriptionRequest);
    }

    /**
     * <p>
     * Allows a topic owner to set an attribute of the topic to a new value.
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic to modify.
     *            </p>
     * @param attributeName <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the
     *            <code>SetTopicAttributes</code> action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> – The policy that defines how
     *            Amazon SNS retries failed deliveries to HTTP/S endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DisplayName</code> – The display name to use for a topic
     *            with SMS subscriptions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Policy</code> – The policy that defines who can access
     *            your topic. By default, only the topic owner can publish or
     *            subscribe to the topic.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html"
     *            >server-side-encryption</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsMasterKeyId</code> – The ID of an Amazon Web Services
     *            managed customer master key (CMK) for Amazon SNS or a custom
     *            CMK. For more information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms"
     *            >Key Terms</a>. For more examples, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters"
     *            >KeyId</a> in the <i>Key Management Service API Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html"
     *            >FIFO topics</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ContentBasedDeduplication</code> – Enables content-based
     *            deduplication for FIFO topics.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            By default, <code>ContentBasedDeduplication</code> is set to
     *            <code>false</code>. If you create a FIFO topic and this
     *            attribute is <code>false</code>, you must specify a value for
     *            the <code>MessageDeduplicationId</code> parameter for the <a
     *            href=
     *            "https://docs.aws.amazon.com/sns/latest/api/API_Publish.html"
     *            >Publish</a> action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When you set <code>ContentBasedDeduplication</code> to
     *            <code>true</code>, Amazon SNS uses a SHA-256 hash to generate
     *            the <code>MessageDeduplicationId</code> using the body of the
     *            message (but not the attributes of the message).
     *            </p>
     *            <p>
     *            (Optional) To override the generated value, you can specify a
     *            value for the <code>MessageDeduplicationId</code> parameter
     *            for the <code>Publish</code> action.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @param attributeValue <p>
     *            The new value for the attribute.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void setTopicAttributes(String topicArn, String attributeName, String attributeValue)
            throws AmazonServiceException, AmazonClientException {
        SetTopicAttributesRequest setTopicAttributesRequest = new SetTopicAttributesRequest();
        setTopicAttributesRequest.setTopicArn(topicArn);
        setTopicAttributesRequest.setAttributeName(attributeName);
        setTopicAttributesRequest.setAttributeValue(attributeValue);
        setTopicAttributes(setTopicAttributesRequest);
    }

    /**
     * <p>
     * Creates a topic to which notifications can be published. Users can create
     * at most 100,000 standard topics (at most 1,000 FIFO topics). For more
     * information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-create-topic.html"
     * >Creating an Amazon SNS topic</a> in the <i>Amazon SNS Developer
     * Guide</i>. This action is idempotent, so if the requester already owns a
     * topic with the specified name, that topic's ARN is returned without
     * creating a new topic.
     * </p>
     * 
     * @param name <p>
     *            The name of the topic you want to create.
     *            </p>
     *            <p>
     *            Constraints: Topic names must be made up of only uppercase and
     *            lowercase ASCII letters, numbers, underscores, and hyphens,
     *            and must be between 1 and 256 characters long.
     *            </p>
     *            <p>
     *            For a FIFO (first-in-first-out) topic, the name must end with
     *            the <code>.fifo</code> suffix.
     *            </p>
     * @return createTopicResult The response from the CreateTopic service
     *         method, as returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws InvalidSecurityException
     * @throws TagLimitExceededException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateTopicResult createTopic(String name)
            throws AmazonServiceException, AmazonClientException {
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setName(name);
        return createTopic(createTopicRequest);
    }

    /**
     * <p>
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent
     * some messages previously sent to the topic from being delivered to
     * subscribers. This action is idempotent, so deleting a topic that does not
     * exist does not result in an error.
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic you want to delete.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws StaleTagException
     * @throws TagPolicyException
     * @throws ConcurrentAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void deleteTopic(String topicArn)
            throws AmazonServiceException, AmazonClientException {
        DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest();
        deleteTopicRequest.setTopicArn(topicArn);
        deleteTopic(deleteTopicRequest);
    }

    /**
     * <p>
     * Deletes a subscription. If the subscription requires authentication for
     * deletion, only the owner of the subscription or the topic's owner can
     * unsubscribe, and an Amazon Web Services signature is required. If the
     * <code>Unsubscribe</code> call does not require authentication and the
     * requester is not the subscription owner, a final cancellation message is
     * delivered to the endpoint, so that the endpoint owner can easily
     * resubscribe to the topic if the <code>Unsubscribe</code> request was
     * unintended.
     * </p>
     * <p>
     * This action is throttled at 100 transactions per second (TPS).
     * </p>
     * 
     * @param subscriptionArn <p>
     *            The ARN of the subscription to be deleted.
     *            </p>
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws NotFoundException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void unsubscribe(String subscriptionArn)
            throws AmazonServiceException, AmazonClientException {
        UnsubscribeRequest unsubscribeRequest = new UnsubscribeRequest();
        unsubscribeRequest.setSubscriptionArn(subscriptionArn);
        unsubscribe(unsubscribeRequest);
    }

    /**
     * <p>
     * Sends a message to an Amazon SNS topic, a text message (SMS message)
     * directly to a phone number, or a message to a mobile platform endpoint
     * (when you specify the <code>TargetArn</code>).
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each
     * endpoint that is subscribed to the topic. The format of the message
     * depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and
     * Amazon SNS will attempt to deliver it shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile
     * endpoint, such as an app on a Kindle device or mobile phone, you must
     * specify the EndpointArn for the TargetArn parameter. The EndpointArn is
     * returned when making a call with the <code>CreatePlatformEndpoint</code>
     * action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
     * >Send Custom Platform-Specific Payloads in Messages to Mobile
     * Devices</a>.
     * </p>
     * <important>
     * <p>
     * You can publish messages only to topics and endpoints in the same Region.
     * </p>
     * </important>
     * 
     * @param topicArn <p>
     *            The topic you want to publish to.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TopicArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     *            </p>
     * @param message <p>
     *            The message you want to send.
     *            </p>
     *            <p>
     *            If you are publishing to a topic and you want to send the same
     *            message to all transport protocols, include the text of the
     *            message as a String value. If you want to send different
     *            messages for each transport protocol, set the value of the
     *            <code>MessageStructure</code> parameter to <code>json</code>
     *            and use a JSON object for the <code>Message</code> parameter.
     *            </p>
     *            <p/>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With the exception of SMS, messages must be UTF-8 encoded
     *            strings and at most 256 KB in size (262,144 bytes, not 262,144
     *            characters).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For SMS, each message can contain up to 140 characters. This
     *            character limit depends on the encoding schema. For example,
     *            an SMS message can contain 160 GSM characters, 140 ASCII
     *            characters, or 70 UCS-2 characters.
     *            </p>
     *            <p>
     *            If you publish a message that exceeds this size limit, Amazon
     *            SNS sends the message as multiple messages, each fitting
     *            within the size limit. Messages aren't truncated mid-word but
     *            are cut off at whole-word boundaries.
     *            </p>
     *            <p>
     *            The total size limit for a single SMS <code>Publish</code>
     *            action is 1,600 characters.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            JSON-specific constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Keys in the JSON object that correspond to supported transport
     *            protocols must have simple JSON string values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The values will be parsed (unescaped) before they are used in
     *            outgoing messages.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Outbound notifications are JSON encoded (meaning that the
     *            characters will be reescaped for sending).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a minimum length of 0 (the empty string, "", is
     *            allowed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a maximum length bounded by the overall message
     *            size (so, including multiple protocols may limit message
     *            sizes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Non-string values will cause the key to be ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Keys that do not correspond to supported transport protocols
     *            are ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Duplicate keys are not allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failure to parse or validate any key or value in the message
     *            will cause the <code>Publish</code> call to return an error
     *            (no partial delivery).
     *            </p>
     *            </li>
     *            </ul>
     * @return publishResult The response from the Publish service method, as
     *         returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PublishResult publish(String topicArn, String message)
            throws AmazonServiceException, AmazonClientException {
        PublishRequest publishRequest = new PublishRequest();
        publishRequest.setTopicArn(topicArn);
        publishRequest.setMessage(message);
        return publish(publishRequest);
    }

    /**
     * <p>
     * Sends a message to an Amazon SNS topic, a text message (SMS message)
     * directly to a phone number, or a message to a mobile platform endpoint
     * (when you specify the <code>TargetArn</code>).
     * </p>
     * <p>
     * If you send a message to a topic, Amazon SNS delivers the message to each
     * endpoint that is subscribed to the topic. The format of the message
     * depends on the notification protocol for each subscribed endpoint.
     * </p>
     * <p>
     * When a <code>messageId</code> is returned, the message has been saved and
     * Amazon SNS will attempt to deliver it shortly.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a mobile
     * endpoint, such as an app on a Kindle device or mobile phone, you must
     * specify the EndpointArn for the TargetArn parameter. The EndpointArn is
     * returned when making a call with the <code>CreatePlatformEndpoint</code>
     * action.
     * </p>
     * <p>
     * For more information about formatting messages, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
     * >Send Custom Platform-Specific Payloads in Messages to Mobile
     * Devices</a>.
     * </p>
     * <important>
     * <p>
     * You can publish messages only to topics and endpoints in the same Region.
     * </p>
     * </important>
     * 
     * @param topicArn <p>
     *            The topic you want to publish to.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TopicArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     *            </p>
     * @param message <p>
     *            The message you want to send.
     *            </p>
     *            <p>
     *            If you are publishing to a topic and you want to send the same
     *            message to all transport protocols, include the text of the
     *            message as a String value. If you want to send different
     *            messages for each transport protocol, set the value of the
     *            <code>MessageStructure</code> parameter to <code>json</code>
     *            and use a JSON object for the <code>Message</code> parameter.
     *            </p>
     *            <p/>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With the exception of SMS, messages must be UTF-8 encoded
     *            strings and at most 256 KB in size (262,144 bytes, not 262,144
     *            characters).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For SMS, each message can contain up to 140 characters. This
     *            character limit depends on the encoding schema. For example,
     *            an SMS message can contain 160 GSM characters, 140 ASCII
     *            characters, or 70 UCS-2 characters.
     *            </p>
     *            <p>
     *            If you publish a message that exceeds this size limit, Amazon
     *            SNS sends the message as multiple messages, each fitting
     *            within the size limit. Messages aren't truncated mid-word but
     *            are cut off at whole-word boundaries.
     *            </p>
     *            <p>
     *            The total size limit for a single SMS <code>Publish</code>
     *            action is 1,600 characters.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            JSON-specific constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Keys in the JSON object that correspond to supported transport
     *            protocols must have simple JSON string values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The values will be parsed (unescaped) before they are used in
     *            outgoing messages.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Outbound notifications are JSON encoded (meaning that the
     *            characters will be reescaped for sending).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a minimum length of 0 (the empty string, "", is
     *            allowed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a maximum length bounded by the overall message
     *            size (so, including multiple protocols may limit message
     *            sizes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Non-string values will cause the key to be ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Keys that do not correspond to supported transport protocols
     *            are ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Duplicate keys are not allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failure to parse or validate any key or value in the message
     *            will cause the <code>Publish</code> call to return an error
     *            (no partial delivery).
     *            </p>
     *            </li>
     *            </ul>
     * @param subject <p>
     *            Optional parameter to be used as the "Subject" line when the
     *            message is delivered to email endpoints. This field will also
     *            be included, if present, in the standard JSON messages
     *            delivered to other endpoints.
     *            </p>
     *            <p>
     *            Constraints: Subjects must be ASCII text that begins with a
     *            letter, number, or punctuation mark; must not include line
     *            breaks or control characters; and must be less than 100
     *            characters long.
     *            </p>
     * @return publishResult The response from the Publish service method, as
     *         returned by Amazon Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InvalidParameterValueException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws EndpointDisabledException
     * @throws PlatformApplicationDisabledException
     * @throws AuthorizationErrorException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSNotFoundException
     * @throws KMSOptInRequiredException
     * @throws KMSThrottlingException
     * @throws KMSAccessDeniedException
     * @throws InvalidSecurityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public PublishResult publish(String topicArn, String message, String subject)
            throws AmazonServiceException, AmazonClientException {
        PublishRequest publishRequest = new PublishRequest();
        publishRequest.setTopicArn(topicArn);
        publishRequest.setMessage(message);
        publishRequest.setSubject(subject);
        return publish(publishRequest);
    }

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a
     * limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new <code>ListSubscriptions</code>
     * call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @return listSubscriptionsResult The response from the ListSubscriptions
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListSubscriptionsResult listSubscriptions()
            throws AmazonServiceException, AmazonClientException {
        ListSubscriptionsRequest listSubscriptionsRequest = new ListSubscriptionsRequest();
        return listSubscriptions(listSubscriptionsRequest);
    }

    /**
     * <p>
     * Returns a list of the requester's subscriptions. Each call returns a
     * limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new <code>ListSubscriptions</code>
     * call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param nextToken <p>
     *            Token returned by the previous <code>ListSubscriptions</code>
     *            request.
     *            </p>
     * @return listSubscriptionsResult The response from the ListSubscriptions
     *         service method, as returned by Amazon Simple Notification
     *         Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListSubscriptionsResult listSubscriptions(String nextToken)
            throws AmazonServiceException, AmazonClientException {
        ListSubscriptionsRequest listSubscriptionsRequest = new ListSubscriptionsRequest();
        listSubscriptionsRequest.setNextToken(nextToken);
        return listSubscriptions(listSubscriptionsRequest);
    }

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call
     * returns a limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to find subscriptions.
     *            </p>
     * @return listSubscriptionsByTopicResult The response from the
     *         ListSubscriptionsByTopic service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(String topicArn)
            throws AmazonServiceException, AmazonClientException {
        ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest = new ListSubscriptionsByTopicRequest();
        listSubscriptionsByTopicRequest.setTopicArn(topicArn);
        return listSubscriptionsByTopic(listSubscriptionsByTopicRequest);
    }

    /**
     * <p>
     * Returns a list of the subscriptions to a specific topic. Each call
     * returns a limited list of subscriptions, up to 100. If there are more
     * subscriptions, a <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     * <p>
     * This action is throttled at 30 transactions per second (TPS).
     * </p>
     * 
     * @param topicArn <p>
     *            The ARN of the topic for which you wish to find subscriptions.
     *            </p>
     * @param nextToken <p>
     *            Token returned by the previous
     *            <code>ListSubscriptionsByTopic</code> request.
     *            </p>
     * @return listSubscriptionsByTopicResult The response from the
     *         ListSubscriptionsByTopic service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(String topicArn, String nextToken)
            throws AmazonServiceException, AmazonClientException {
        ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest = new ListSubscriptionsByTopicRequest();
        listSubscriptionsByTopicRequest.setTopicArn(topicArn);
        listSubscriptionsByTopicRequest.setNextToken(nextToken);
        return listSubscriptionsByTopic(listSubscriptionsByTopicRequest);
    }

    /**
     * <p>
     * Lists the platform application objects for the supported push
     * notification services, such as APNS and GCM (Firebase Cloud Messaging).
     * The results for <code>ListPlatformApplications</code> are paginated and
     * return a limited list of applications, up to 100. If additional records
     * are available after the first page results, then a NextToken string will
     * be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string received
     * from the previous call. When there are no more records to return,
     * <code>NextToken</code> will be null. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
     * Amazon SNS Mobile Push Notifications</a>.
     * </p>
     * <p>
     * This action is throttled at 15 transactions per second (TPS).
     * </p>
     * 
     * @return listPlatformApplicationsResult The response from the
     *         ListPlatformApplications service method, as returned by Amazon
     *         Simple Notification Service.
     * @throws InvalidParameterException
     * @throws InternalErrorException
     * @throws AuthorizationErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Notification Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListPlatformApplicationsResult listPlatformApplications()
            throws AmazonServiceException, AmazonClientException {
        ListPlatformApplicationsRequest listPlatformApplicationsRequest = new ListPlatformApplicationsRequest();
        return listPlatformApplications(listPlatformApplicationsRequest);
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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
