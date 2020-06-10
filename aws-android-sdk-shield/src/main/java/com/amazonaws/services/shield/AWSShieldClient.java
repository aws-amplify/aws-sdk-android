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

package com.amazonaws.services.shield;

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

import com.amazonaws.services.shield.model.*;
import com.amazonaws.services.shield.model.transform.*;

/**
 * Client for accessing AWS Shield. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Shield Advanced</fullname>
 * <p>
 * This is the <i>AWS Shield Advanced API Reference</i>. This guide is for
 * developers who need detailed information about the AWS Shield Advanced API
 * actions, data types, and errors. For detailed information about AWS WAF and
 * AWS Shield Advanced features and an overview of how to use the AWS WAF and
 * AWS Shield Advanced APIs, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS
 * Shield Developer Guide</a>.
 * </p>
 */
public class AWSShieldClient extends AmazonWebServiceClient implements AWSShield {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Shield exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSShield. A
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
    public AWSShieldClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSShield. A
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
     *            how this client connects to AWSShield (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSShieldClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSShield using the
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
     *         AWSShieldClient client = new AWSShieldClient(AWSMobileClient.getInstance());
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
    public AWSShieldClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSShield using the
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
     *         AWSShieldClient client = new AWSShieldClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSShield (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSShieldClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSShield using the
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
     *         AWSShieldClient client = new AWSShieldClient(AWSMobileClient.getInstance());
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
    public AWSShieldClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSShield using the
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
     *         AWSShieldClient client = new AWSShieldClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSShield (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSShieldClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSShield using the
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
     *            how this client connects to AWSShield (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSShieldClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSShield using the
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
     *         AWSShieldClient client = new AWSShieldClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSShield (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSShieldClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AccessDeniedForDependencyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPaginationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitsExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LockedSubscriptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoAssociatedRoleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OptimisticLockExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("shield.us-east-1.amazonaws.com");
        this.endpointPrefix = "shield";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/shield/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/shield/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Authorizes the DDoS Response Team (DRT) to access the specified Amazon S3
     * bucket containing your AWS WAF logs. You can associate up to 10 Amazon S3
     * buckets with your subscription.
     * </p>
     * <p>
     * To use the services of the DRT and make an
     * <code>AssociateDRTLogBucket</code> request, you must be subscribed to the
     * <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTLogBucketRequest
     * @return associateDRTLogBucketResult The response from the
     *         AssociateDRTLogBucket service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws NoAssociatedRoleException
     * @throws LimitsExceededException
     * @throws InvalidParameterException
     * @throws AccessDeniedForDependencyException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateDRTLogBucketResult associateDRTLogBucket(
            AssociateDRTLogBucketRequest associateDRTLogBucketRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateDRTLogBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDRTLogBucketRequest> request = null;
        Response<AssociateDRTLogBucketResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDRTLogBucketRequestMarshaller()
                        .marshall(associateDRTLogBucketRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateDRTLogBucketResult, JsonUnmarshallerContext> unmarshaller = new AssociateDRTLogBucketResultJsonUnmarshaller();
            JsonResponseHandler<AssociateDRTLogBucketResult> responseHandler = new JsonResponseHandler<AssociateDRTLogBucketResult>(
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
     * Authorizes the DDoS Response Team (DRT), using the specified role, to
     * access your AWS account to assist with DDoS attack mitigation during
     * potential attacks. This enables the DRT to inspect your AWS WAF
     * configuration and create or update AWS WAF rules and web ACLs.
     * </p>
     * <p>
     * You can associate only one <code>RoleArn</code> with your subscription.
     * If you submit an <code>AssociateDRTRole</code> request for an account
     * that already has an associated role, the new <code>RoleArn</code> will
     * replace the existing <code>RoleArn</code>.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must
     * attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to the role you will specify
     * in the request. For more information see <a href=
     * " https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html"
     * >Attaching and Detaching IAM Policies</a>. The role must also trust the
     * service principal <code> drt.shield.amazonaws.com</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html"
     * >IAM JSON Policy Elements: Principal</a>.
     * </p>
     * <p>
     * The DRT will have access only to your AWS WAF and Shield resources. By
     * submitting this request, you authorize the DRT to inspect your AWS WAF
     * and Shield configuration and create and update AWS WAF rules and web ACLs
     * on your behalf. The DRT takes these actions only if explicitly authorized
     * by you.
     * </p>
     * <p>
     * You must have the <code>iam:PassRole</code> permission to make an
     * <code>AssociateDRTRole</code> request. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html"
     * >Granting a User Permissions to Pass a Role to an AWS Service</a>.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTRole</code>
     * request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTRoleRequest
     * @return associateDRTRoleResult The response from the AssociateDRTRole
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws AccessDeniedForDependencyException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateDRTRoleResult associateDRTRole(AssociateDRTRoleRequest associateDRTRoleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateDRTRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDRTRoleRequest> request = null;
        Response<AssociateDRTRoleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDRTRoleRequestMarshaller().marshall(associateDRTRoleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateDRTRoleResult, JsonUnmarshallerContext> unmarshaller = new AssociateDRTRoleResultJsonUnmarshaller();
            JsonResponseHandler<AssociateDRTRoleResult> responseHandler = new JsonResponseHandler<AssociateDRTRoleResult>(
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
     * Adds health-based detection to the Shield Advanced protection for a
     * resource. Shield Advanced health-based detection uses the health of your
     * AWS resource to improve responsiveness and accuracy in attack detection
     * and mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate it with your
     * Shield Advanced protection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and
     * AWS Shield Developer Guide</a>.
     * </p>
     * 
     * @param associateHealthCheckRequest
     * @return associateHealthCheckResult The response from the
     *         AssociateHealthCheck service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws LimitsExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateHealthCheckResult associateHealthCheck(
            AssociateHealthCheckRequest associateHealthCheckRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateHealthCheckRequest> request = null;
        Response<AssociateHealthCheckResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateHealthCheckRequestMarshaller()
                        .marshall(associateHealthCheckRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateHealthCheckResult, JsonUnmarshallerContext> unmarshaller = new AssociateHealthCheckResultJsonUnmarshaller();
            JsonResponseHandler<AssociateHealthCheckResult> responseHandler = new JsonResponseHandler<AssociateHealthCheckResult>(
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
     * Initializes proactive engagement and sets the list of contacts for the
     * DDoS Response Team (DRT) to use. You must provide at least one phone
     * number in the emergency contact list.
     * </p>
     * <p>
     * After you have initialized proactive engagement using this call, to
     * disable or enable proactive engagement, use the calls
     * <code>DisableProactiveEngagement</code> and
     * <code>EnableProactiveEngagement</code>.
     * </p>
     * <note>
     * <p>
     * This call defines the list of email addresses and phone numbers that the
     * DDoS Response Team (DRT) can use to contact you for escalations to the
     * DRT and to initiate proactive customer support.
     * </p>
     * <p>
     * The contacts that you provide in the request replace any contacts that
     * were already defined. If you already have contacts defined and want to
     * use them, retrieve the list using
     * <code>DescribeEmergencyContactSettings</code> and then provide it to this
     * call.
     * </p>
     * </note>
     * 
     * @param associateProactiveEngagementDetailsRequest
     * @return associateProactiveEngagementDetailsResult The response from the
     *         AssociateProactiveEngagementDetails service method, as returned
     *         by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AssociateProactiveEngagementDetailsResult associateProactiveEngagementDetails(
            AssociateProactiveEngagementDetailsRequest associateProactiveEngagementDetailsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateProactiveEngagementDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateProactiveEngagementDetailsRequest> request = null;
        Response<AssociateProactiveEngagementDetailsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateProactiveEngagementDetailsRequestMarshaller()
                        .marshall(associateProactiveEngagementDetailsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateProactiveEngagementDetailsResult, JsonUnmarshallerContext> unmarshaller = new AssociateProactiveEngagementDetailsResultJsonUnmarshaller();
            JsonResponseHandler<AssociateProactiveEngagementDetailsResult> responseHandler = new JsonResponseHandler<AssociateProactiveEngagementDetailsResult>(
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
     * Enables AWS Shield Advanced for a specific AWS resource. The resource can
     * be an Amazon CloudFront distribution, Elastic Load Balancing load
     * balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an
     * Amazon Route 53 hosted zone.
     * </p>
     * <p>
     * You can add protection to only a single resource with each
     * CreateProtection request. If you want to add protection to multiple
     * resources at once, use the <a
     * href="https://console.aws.amazon.com/waf/">AWS WAF console</a>. For more
     * information see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html"
     * >Getting Started with AWS Shield Advanced</a> and <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html"
     * >Add AWS Shield Advanced Protection to more AWS Resources</a>.
     * </p>
     * 
     * @param createProtectionRequest
     * @return createProtectionResult The response from the CreateProtection
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidResourceException
     * @throws InvalidOperationException
     * @throws LimitsExceededException
     * @throws ResourceAlreadyExistsException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateProtectionResult createProtection(CreateProtectionRequest createProtectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProtectionRequest> request = null;
        Response<CreateProtectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProtectionRequestMarshaller().marshall(createProtectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProtectionResult, JsonUnmarshallerContext> unmarshaller = new CreateProtectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateProtectionResult> responseHandler = new JsonResponseHandler<CreateProtectionResult>(
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
     * Activates AWS Shield Advanced for an account.
     * </p>
     * <p>
     * When you initally create a subscription, your subscription is set to be
     * automatically renewed at the end of the existing subscription period. You
     * can change this by submitting an <code>UpdateSubscription</code> request.
     * </p>
     * 
     * @param createSubscriptionRequest
     * @return createSubscriptionResult The response from the CreateSubscription
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSubscriptionResult createSubscription(
            CreateSubscriptionRequest createSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriptionRequest> request = null;
        Response<CreateSubscriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriptionRequestMarshaller()
                        .marshall(createSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSubscriptionResult, JsonUnmarshallerContext> unmarshaller = new CreateSubscriptionResultJsonUnmarshaller();
            JsonResponseHandler<CreateSubscriptionResult> responseHandler = new JsonResponseHandler<CreateSubscriptionResult>(
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
     * Deletes an AWS Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @return deleteProtectionResult The response from the DeleteProtection
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteProtectionResult deleteProtection(DeleteProtectionRequest deleteProtectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProtectionRequest> request = null;
        Response<DeleteProtectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProtectionRequestMarshaller().marshall(deleteProtectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProtectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteProtectionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProtectionResult> responseHandler = new JsonResponseHandler<DeleteProtectionResult>(
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
     * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires
     * a 1-year subscription commitment. You cannot delete a subscription prior
     * to the completion of that commitment.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @return deleteSubscriptionResult The response from the DeleteSubscription
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws LockedSubscriptionException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    public DeleteSubscriptionResult deleteSubscription(
            DeleteSubscriptionRequest deleteSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionRequest> request = null;
        Response<DeleteSubscriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionRequestMarshaller()
                        .marshall(deleteSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSubscriptionResult, JsonUnmarshallerContext> unmarshaller = new DeleteSubscriptionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSubscriptionResult> responseHandler = new JsonResponseHandler<DeleteSubscriptionResult>(
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
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @return describeAttackResult The response from the DescribeAttack service
     *         method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAttackResult describeAttack(DescribeAttackRequest describeAttackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAttackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAttackRequest> request = null;
        Response<DescribeAttackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAttackRequestMarshaller().marshall(describeAttackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAttackResult, JsonUnmarshallerContext> unmarshaller = new DescribeAttackResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAttackResult> responseHandler = new JsonResponseHandler<DescribeAttackResult>(
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
     * Returns the current role and list of Amazon S3 log buckets used by the
     * DDoS Response Team (DRT) to access your AWS account while assisting with
     * attack mitigation.
     * </p>
     * 
     * @param describeDRTAccessRequest
     * @return describeDRTAccessResult The response from the DescribeDRTAccess
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDRTAccessResult describeDRTAccess(
            DescribeDRTAccessRequest describeDRTAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDRTAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDRTAccessRequest> request = null;
        Response<DescribeDRTAccessResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDRTAccessRequestMarshaller()
                        .marshall(describeDRTAccessRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDRTAccessResult, JsonUnmarshallerContext> unmarshaller = new DescribeDRTAccessResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDRTAccessResult> responseHandler = new JsonResponseHandler<DescribeDRTAccessResult>(
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
     * A list of email addresses and phone numbers that the DDoS Response Team
     * (DRT) can use to contact you if you have proactive engagement enabled,
     * for escalations to the DRT and to initiate proactive customer support.
     * </p>
     * 
     * @param describeEmergencyContactSettingsRequest
     * @return describeEmergencyContactSettingsResult The response from the
     *         DescribeEmergencyContactSettings service method, as returned by
     *         AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEmergencyContactSettingsResult describeEmergencyContactSettings(
            DescribeEmergencyContactSettingsRequest describeEmergencyContactSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEmergencyContactSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEmergencyContactSettingsRequest> request = null;
        Response<DescribeEmergencyContactSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEmergencyContactSettingsRequestMarshaller()
                        .marshall(describeEmergencyContactSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEmergencyContactSettingsResult, JsonUnmarshallerContext> unmarshaller = new DescribeEmergencyContactSettingsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEmergencyContactSettingsResult> responseHandler = new JsonResponseHandler<DescribeEmergencyContactSettingsResult>(
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
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @return describeProtectionResult The response from the DescribeProtection
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeProtectionResult describeProtection(
            DescribeProtectionRequest describeProtectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProtectionRequest> request = null;
        Response<DescribeProtectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProtectionRequestMarshaller()
                        .marshall(describeProtectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProtectionResult, JsonUnmarshallerContext> unmarshaller = new DescribeProtectionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProtectionResult> responseHandler = new JsonResponseHandler<DescribeProtectionResult>(
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
     * Provides details about the AWS Shield Advanced subscription for an
     * account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @return describeSubscriptionResult The response from the
     *         DescribeSubscription service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSubscriptionResult describeSubscription(
            DescribeSubscriptionRequest describeSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscriptionRequest> request = null;
        Response<DescribeSubscriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscriptionRequestMarshaller()
                        .marshall(describeSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSubscriptionResult, JsonUnmarshallerContext> unmarshaller = new DescribeSubscriptionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSubscriptionResult> responseHandler = new JsonResponseHandler<DescribeSubscriptionResult>(
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
     * Removes authorization from the DDoS Response Team (DRT) to notify
     * contacts about escalations to the DRT and to initiate proactive customer
     * support.
     * </p>
     * 
     * @param disableProactiveEngagementRequest
     * @return disableProactiveEngagementResult The response from the
     *         DisableProactiveEngagement service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableProactiveEngagementResult disableProactiveEngagement(
            DisableProactiveEngagementRequest disableProactiveEngagementRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableProactiveEngagementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableProactiveEngagementRequest> request = null;
        Response<DisableProactiveEngagementResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableProactiveEngagementRequestMarshaller()
                        .marshall(disableProactiveEngagementRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableProactiveEngagementResult, JsonUnmarshallerContext> unmarshaller = new DisableProactiveEngagementResultJsonUnmarshaller();
            JsonResponseHandler<DisableProactiveEngagementResult> responseHandler = new JsonResponseHandler<DisableProactiveEngagementResult>(
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
     * Removes the DDoS Response Team's (DRT) access to the specified Amazon S3
     * bucket containing your AWS WAF logs.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTLogBucket</code> request, you must be
     * subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>. However, if you are not subscribed to one
     * of these support plans, but had been previously and had granted the DRT
     * access to your account, you can submit a
     * <code>DisassociateDRTLogBucket</code> request to remove this access.
     * </p>
     * 
     * @param disassociateDRTLogBucketRequest
     * @return disassociateDRTLogBucketResult The response from the
     *         DisassociateDRTLogBucket service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws NoAssociatedRoleException
     * @throws AccessDeniedForDependencyException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateDRTLogBucketResult disassociateDRTLogBucket(
            DisassociateDRTLogBucketRequest disassociateDRTLogBucketRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateDRTLogBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDRTLogBucketRequest> request = null;
        Response<DisassociateDRTLogBucketResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDRTLogBucketRequestMarshaller()
                        .marshall(disassociateDRTLogBucketRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateDRTLogBucketResult, JsonUnmarshallerContext> unmarshaller = new DisassociateDRTLogBucketResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateDRTLogBucketResult> responseHandler = new JsonResponseHandler<DisassociateDRTLogBucketResult>(
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
     * Removes the DDoS Response Team's (DRT) access to your AWS account.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTRole</code> request, you must be
     * subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business
     * Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/"
     * >Enterprise Support plan</a>. However, if you are not subscribed to one
     * of these support plans, but had been previously and had granted the DRT
     * access to your account, you can submit a <code>DisassociateDRTRole</code>
     * request to remove this access.
     * </p>
     * 
     * @param disassociateDRTRoleRequest
     * @return disassociateDRTRoleResult The response from the
     *         DisassociateDRTRole service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateDRTRoleResult disassociateDRTRole(
            DisassociateDRTRoleRequest disassociateDRTRoleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateDRTRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDRTRoleRequest> request = null;
        Response<DisassociateDRTRoleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDRTRoleRequestMarshaller()
                        .marshall(disassociateDRTRoleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateDRTRoleResult, JsonUnmarshallerContext> unmarshaller = new DisassociateDRTRoleResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateDRTRoleResult> responseHandler = new JsonResponseHandler<DisassociateDRTRoleResult>(
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
     * Removes health-based detection from the Shield Advanced protection for a
     * resource. Shield Advanced health-based detection uses the health of your
     * AWS resource to improve responsiveness and accuracy in attack detection
     * and mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate or
     * disassociate it with your Shield Advanced protection. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and
     * AWS Shield Developer Guide</a>.
     * </p>
     * 
     * @param disassociateHealthCheckRequest
     * @return disassociateHealthCheckResult The response from the
     *         DisassociateHealthCheck service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateHealthCheckResult disassociateHealthCheck(
            DisassociateHealthCheckRequest disassociateHealthCheckRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateHealthCheckRequest> request = null;
        Response<DisassociateHealthCheckResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateHealthCheckRequestMarshaller()
                        .marshall(disassociateHealthCheckRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateHealthCheckResult, JsonUnmarshallerContext> unmarshaller = new DisassociateHealthCheckResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateHealthCheckResult> responseHandler = new JsonResponseHandler<DisassociateHealthCheckResult>(
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
     * Authorizes the DDoS Response Team (DRT) to use email and phone to notify
     * contacts about escalations to the DRT and to initiate proactive customer
     * support.
     * </p>
     * 
     * @param enableProactiveEngagementRequest
     * @return enableProactiveEngagementResult The response from the
     *         EnableProactiveEngagement service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidOperationException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableProactiveEngagementResult enableProactiveEngagement(
            EnableProactiveEngagementRequest enableProactiveEngagementRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableProactiveEngagementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableProactiveEngagementRequest> request = null;
        Response<EnableProactiveEngagementResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableProactiveEngagementRequestMarshaller()
                        .marshall(enableProactiveEngagementRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableProactiveEngagementResult, JsonUnmarshallerContext> unmarshaller = new EnableProactiveEngagementResultJsonUnmarshaller();
            JsonResponseHandler<EnableProactiveEngagementResult> responseHandler = new JsonResponseHandler<EnableProactiveEngagementResult>(
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
     * Returns the <code>SubscriptionState</code>, either <code>Active</code> or
     * <code>Inactive</code>.
     * </p>
     * 
     * @param getSubscriptionStateRequest
     * @return getSubscriptionStateResult The response from the
     *         GetSubscriptionState service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSubscriptionStateResult getSubscriptionState(
            GetSubscriptionStateRequest getSubscriptionStateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSubscriptionStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionStateRequest> request = null;
        Response<GetSubscriptionStateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriptionStateRequestMarshaller()
                        .marshall(getSubscriptionStateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSubscriptionStateResult, JsonUnmarshallerContext> unmarshaller = new GetSubscriptionStateResultJsonUnmarshaller();
            JsonResponseHandler<GetSubscriptionStateResult> responseHandler = new JsonResponseHandler<GetSubscriptionStateResult>(
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
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified
     * time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @return listAttacksResult The response from the ListAttacks service
     *         method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAttacksResult listAttacks(ListAttacksRequest listAttacksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAttacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttacksRequest> request = null;
        Response<ListAttacksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttacksRequestMarshaller().marshall(listAttacksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAttacksResult, JsonUnmarshallerContext> unmarshaller = new ListAttacksResultJsonUnmarshaller();
            JsonResponseHandler<ListAttacksResult> responseHandler = new JsonResponseHandler<ListAttacksResult>(
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
     * Lists all <a>Protection</a> objects for the account.
     * </p>
     * 
     * @param listProtectionsRequest
     * @return listProtectionsResult The response from the ListProtections
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws ResourceNotFoundException
     * @throws InvalidPaginationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListProtectionsResult listProtections(ListProtectionsRequest listProtectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProtectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProtectionsRequest> request = null;
        Response<ListProtectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProtectionsRequestMarshaller().marshall(listProtectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProtectionsResult, JsonUnmarshallerContext> unmarshaller = new ListProtectionsResultJsonUnmarshaller();
            JsonResponseHandler<ListProtectionsResult> responseHandler = new JsonResponseHandler<ListProtectionsResult>(
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
     * Updates the details of the list of email addresses and phone numbers that
     * the DDoS Response Team (DRT) can use to contact you if you have proactive
     * engagement enabled, for escalations to the DRT and to initiate proactive
     * customer support.
     * </p>
     * 
     * @param updateEmergencyContactSettingsRequest
     * @return updateEmergencyContactSettingsResult The response from the
     *         UpdateEmergencyContactSettings service method, as returned by AWS
     *         Shield.
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws OptimisticLockException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateEmergencyContactSettingsResult updateEmergencyContactSettings(
            UpdateEmergencyContactSettingsRequest updateEmergencyContactSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEmergencyContactSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEmergencyContactSettingsRequest> request = null;
        Response<UpdateEmergencyContactSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEmergencyContactSettingsRequestMarshaller()
                        .marshall(updateEmergencyContactSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEmergencyContactSettingsResult, JsonUnmarshallerContext> unmarshaller = new UpdateEmergencyContactSettingsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEmergencyContactSettingsResult> responseHandler = new JsonResponseHandler<UpdateEmergencyContactSettingsResult>(
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
     * Updates the details of an existing subscription. Only enter values for
     * parameters you want to change. Empty parameters are not updated.
     * </p>
     * 
     * @param updateSubscriptionRequest
     * @return updateSubscriptionResult The response from the UpdateSubscription
     *         service method, as returned by AWS Shield.
     * @throws InternalErrorException
     * @throws LockedSubscriptionException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterException
     * @throws OptimisticLockException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Shield indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateSubscriptionResult updateSubscription(
            UpdateSubscriptionRequest updateSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriptionRequest> request = null;
        Response<UpdateSubscriptionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriptionRequestMarshaller()
                        .marshall(updateSubscriptionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSubscriptionResult, JsonUnmarshallerContext> unmarshaller = new UpdateSubscriptionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSubscriptionResult> responseHandler = new JsonResponseHandler<UpdateSubscriptionResult>(
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
