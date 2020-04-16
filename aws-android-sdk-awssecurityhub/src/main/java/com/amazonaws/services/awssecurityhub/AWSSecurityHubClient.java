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

package com.amazonaws.services.awssecurityhub;

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

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.services.awssecurityhub.model.transform.*;

/**
 * Client for accessing AWS SecurityHub. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Security Hub provides you with a comprehensive view of the security state of
 * your AWS environment and resources. It also provides you with the readiness
 * status of your environment based on controls from supported security
 * standards. Security Hub collects security data from AWS accounts, services,
 * and integrated third-party products and helps you analyze security trends in
 * your environment to identify the highest priority security issues. For more
 * information about Security Hub, see the <i> <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html"
 * >AWS Security Hub User Guide</a> </i>.
 * </p>
 * <p>
 * When you use operations in the Security Hub API, the requests are executed
 * only in the AWS Region that is currently active or in the specific AWS Region
 * that you specify in your request. Any configuration or settings change that
 * results from the operation is applied only to that Region. To make the same
 * change in other Regions, execute the same command for each Region to apply
 * the change to.
 * </p>
 * <p>
 * For example, if your Region is set to <code>us-west-2</code>, when you use
 * <code> <a>CreateMembers</a> </code> to add a member account to Security Hub,
 * the association of the member account with the master account is created only
 * in the <code>us-west-2</code> Region. Security Hub must be enabled for the
 * member account in the same Region that the invitation was sent from.
 * </p>
 * <p>
 * The following throttling limits apply to using Security Hub API operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <a>GetFindings</a> </code> - <code>RateLimit</code> of 3 requests per
 * second. <code>BurstLimit</code> of 6 requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>UpdateFindings</a> </code> - <code>RateLimit</code> of 1 request
 * per second. <code>BurstLimit</code> of 5 requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * All other operations - <code>RateLimit</code> of 10 requests per second.
 * <code>BurstLimit</code> of 30 requests per second.
 * </p>
 * </li>
 * </ul>
 */
public class AWSSecurityHubClient extends AmazonWebServiceClient implements AWSSecurityHub {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS SecurityHub exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub. A
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
    public AWSSecurityHubClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub. A
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
     *            how this client connects to AWSSecurityHub (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSSecurityHubClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub using
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
     *         AWSSecurityHubClient client = new AWSSecurityHubClient(AWSMobileClient.getInstance());
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
    public AWSSecurityHubClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub using
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
     *         AWSSecurityHubClient client = new AWSSecurityHubClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSSecurityHub (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSSecurityHubClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub using
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
     *         AWSSecurityHubClient client = new AWSSecurityHubClient(AWSMobileClient.getInstance());
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
    public AWSSecurityHubClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub using
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
     *         AWSSecurityHubClient client = new AWSSecurityHubClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSSecurityHub (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSSecurityHubClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub using
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
     *            how this client connects to AWSSecurityHub (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSSecurityHubClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSSecurityHub using
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
     *         AWSSecurityHubClient client = new AWSSecurityHubClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSSecurityHub (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSSecurityHubClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAccessExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("securityhub.us-east-1.amazonaws.com");
        this.endpointPrefix = "securityhub";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awssecurityhub/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awssecurityhub/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Accepts the invitation to be a member account and be monitored by the
     * Security Hub master account that the invitation was sent from.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to
     * the master account to view findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return acceptInvitationResult The response from the AcceptInvitation
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInvitationRequest> request = null;
        Response<AcceptInvitationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInvitationRequestMarshaller().marshall(acceptInvitationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AcceptInvitationResult, JsonUnmarshallerContext> unmarshaller = new AcceptInvitationResultJsonUnmarshaller();
            JsonResponseHandler<AcceptInvitationResult> responseHandler = new JsonResponseHandler<AcceptInvitationResult>(
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
     * Disables the standards specified by the provided
     * <code>StandardsSubscriptionArns</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html"
     * >Security Standards</a> section of the <i>AWS Security Hub User
     * Guide</i>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return batchDisableStandardsResult The response from the
     *         BatchDisableStandards service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDisableStandardsResult batchDisableStandards(
            BatchDisableStandardsRequest batchDisableStandardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDisableStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisableStandardsRequest> request = null;
        Response<BatchDisableStandardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisableStandardsRequestMarshaller()
                        .marshall(batchDisableStandardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDisableStandardsResult, JsonUnmarshallerContext> unmarshaller = new BatchDisableStandardsResultJsonUnmarshaller();
            JsonResponseHandler<BatchDisableStandardsResult> responseHandler = new JsonResponseHandler<BatchDisableStandardsResult>(
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
     * Enables the standards specified by the provided <code>StandardsArn</code>
     * . To obtain the ARN for a standard, use the
     * <code> <a>DescribeStandards</a> </code> operation.
     * </p>
     * <p>
     * For more information, see the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html"
     * >Security Standards</a> section of the <i>AWS Security Hub User
     * Guide</i>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return batchEnableStandardsResult The response from the
     *         BatchEnableStandards service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchEnableStandardsResult batchEnableStandards(
            BatchEnableStandardsRequest batchEnableStandardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchEnableStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchEnableStandardsRequest> request = null;
        Response<BatchEnableStandardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchEnableStandardsRequestMarshaller()
                        .marshall(batchEnableStandardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchEnableStandardsResult, JsonUnmarshallerContext> unmarshaller = new BatchEnableStandardsResultJsonUnmarshaller();
            JsonResponseHandler<BatchEnableStandardsResult> responseHandler = new JsonResponseHandler<BatchEnableStandardsResult>(
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
     * Imports security findings generated from an integrated third-party
     * product into Security Hub. This action is requested by the integrated
     * product to import its findings into Security Hub.
     * </p>
     * <p>
     * The maximum allowed size for a finding is 240 Kb. An error is returned
     * for any finding larger than 240 Kb.
     * </p>
     * <p>
     * After a finding is created, <code>BatchImportFindings</code> cannot be
     * used to update the following finding fields and objects, which Security
     * Hub customers use to manage their investigation workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchImportFindingsRequest
     * @return batchImportFindingsResult The response from the
     *         BatchImportFindings service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchImportFindingsResult batchImportFindings(
            BatchImportFindingsRequest batchImportFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchImportFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchImportFindingsRequest> request = null;
        Response<BatchImportFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchImportFindingsRequestMarshaller()
                        .marshall(batchImportFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchImportFindingsResult, JsonUnmarshallerContext> unmarshaller = new BatchImportFindingsResultJsonUnmarshaller();
            JsonResponseHandler<BatchImportFindingsResult> responseHandler = new JsonResponseHandler<BatchImportFindingsResult>(
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
     * Used by Security Hub customers to update information about their
     * investigation into a finding. Requested by master accounts or member
     * accounts. Master accounts can update findings for their account and their
     * member accounts. Member accounts can update findings for their account.
     * </p>
     * <p>
     * Updates from <code>BatchUpdateFindings</code> do not affect the value of
     * <code>UpdatedAt</code> for a finding.
     * </p>
     * <p>
     * Master accounts can use <code>BatchUpdateFindings</code> to update the
     * following finding fields and objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts can only use <code>BatchUpdateFindings</code> to update
     * the Note object.
     * </p>
     * 
     * @param batchUpdateFindingsRequest
     * @return batchUpdateFindingsResult The response from the
     *         BatchUpdateFindings service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchUpdateFindingsResult batchUpdateFindings(
            BatchUpdateFindingsRequest batchUpdateFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchUpdateFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateFindingsRequest> request = null;
        Response<BatchUpdateFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateFindingsRequestMarshaller()
                        .marshall(batchUpdateFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchUpdateFindingsResult, JsonUnmarshallerContext> unmarshaller = new BatchUpdateFindingsResultJsonUnmarshaller();
            JsonResponseHandler<BatchUpdateFindingsResult> responseHandler = new JsonResponseHandler<BatchUpdateFindingsResult>(
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
     * Creates a custom action target in Security Hub.
     * </p>
     * <p>
     * You can use custom actions on findings and insights in Security Hub to
     * trigger target actions in Amazon CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @return createActionTargetResult The response from the CreateActionTarget
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateActionTargetResult createActionTarget(
            CreateActionTargetRequest createActionTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createActionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateActionTargetRequest> request = null;
        Response<CreateActionTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateActionTargetRequestMarshaller()
                        .marshall(createActionTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateActionTargetResult, JsonUnmarshallerContext> unmarshaller = new CreateActionTargetResultJsonUnmarshaller();
            JsonResponseHandler<CreateActionTargetResult> responseHandler = new JsonResponseHandler<CreateActionTargetResult>(
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
     * Creates a custom insight in Security Hub. An insight is a consolidation
     * of findings that relate to a security issue that requires attention or
     * remediation.
     * </p>
     * <p>
     * To group the related findings in the insight, use the
     * <code>GroupByAttribute</code>.
     * </p>
     * 
     * @param createInsightRequest
     * @return createInsightResult The response from the CreateInsight service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateInsightResult createInsight(CreateInsightRequest createInsightRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInsightRequest> request = null;
        Response<CreateInsightResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInsightRequestMarshaller().marshall(createInsightRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInsightResult, JsonUnmarshallerContext> unmarshaller = new CreateInsightResultJsonUnmarshaller();
            JsonResponseHandler<CreateInsightResult> responseHandler = new JsonResponseHandler<CreateInsightResult>(
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
     * Creates a member association in Security Hub between the specified
     * accounts and the account used to make the request, which is the master
     * account. To successfully create a member, you must use this action from
     * an account that already has Security Hub enabled. To enable Security Hub,
     * you can use the <code> <a>EnableSecurityHub</a> </code> operation.
     * </p>
     * <p>
     * After you use <code>CreateMembers</code> to create member account
     * associations in Security Hub, you must use the
     * <code> <a>InviteMembers</a> </code> operation to invite the accounts to
     * enable Security Hub and become member accounts in Security Hub.
     * </p>
     * <p>
     * If the account owner accepts the invitation, the account becomes a member
     * account in Security Hub, and a permission policy is added that permits
     * the master account to view the findings generated in the member account.
     * When Security Hub is enabled in the invited account, findings start to be
     * sent to both the member and master accounts.
     * </p>
     * <p>
     * To remove the association between the master and member accounts, use the
     * <code> <a>DisassociateFromMasterAccount</a> </code> or
     * <code> <a>DisassociateMembers</a> </code> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @return createMembersResult The response from the CreateMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateMembersResult createMembers(CreateMembersRequest createMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMembersRequest> request = null;
        Response<CreateMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMembersRequestMarshaller().marshall(createMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMembersResult, JsonUnmarshallerContext> unmarshaller = new CreateMembersResultJsonUnmarshaller();
            JsonResponseHandler<CreateMembersResult> responseHandler = new JsonResponseHandler<CreateMembersResult>(
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
     * Declines invitations to become a member account.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return declineInvitationsResult The response from the DeclineInvitations
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeclineInvitationsResult declineInvitations(
            DeclineInvitationsRequest declineInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(declineInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeclineInvitationsRequest> request = null;
        Response<DeclineInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeclineInvitationsRequestMarshaller()
                        .marshall(declineInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeclineInvitationsResult, JsonUnmarshallerContext> unmarshaller = new DeclineInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<DeclineInvitationsResult> responseHandler = new JsonResponseHandler<DeclineInvitationsResult>(
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
     * Deletes a custom action target from Security Hub.
     * </p>
     * <p>
     * Deleting a custom action target does not affect any findings or insights
     * that were already sent to Amazon CloudWatch Events using the custom
     * action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @return deleteActionTargetResult The response from the DeleteActionTarget
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteActionTargetResult deleteActionTarget(
            DeleteActionTargetRequest deleteActionTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteActionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteActionTargetRequest> request = null;
        Response<DeleteActionTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteActionTargetRequestMarshaller()
                        .marshall(deleteActionTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteActionTargetResult, JsonUnmarshallerContext> unmarshaller = new DeleteActionTargetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteActionTargetResult> responseHandler = new JsonResponseHandler<DeleteActionTargetResult>(
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
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return deleteInsightResult The response from the DeleteInsight service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteInsightResult deleteInsight(DeleteInsightRequest deleteInsightRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInsightRequest> request = null;
        Response<DeleteInsightResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInsightRequestMarshaller().marshall(deleteInsightRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInsightResult, JsonUnmarshallerContext> unmarshaller = new DeleteInsightResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInsightResult> responseHandler = new JsonResponseHandler<DeleteInsightResult>(
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
     * Deletes invitations received by the AWS account to become a member
     * account.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return deleteInvitationsResult The response from the DeleteInvitations
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteInvitationsResult deleteInvitations(
            DeleteInvitationsRequest deleteInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInvitationsRequest> request = null;
        Response<DeleteInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInvitationsRequestMarshaller()
                        .marshall(deleteInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInvitationsResult, JsonUnmarshallerContext> unmarshaller = new DeleteInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInvitationsResult> responseHandler = new JsonResponseHandler<DeleteInvitationsResult>(
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
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return deleteMembersResult The response from the DeleteMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMembersRequest> request = null;
        Response<DeleteMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMembersRequestMarshaller().marshall(deleteMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMembersResult, JsonUnmarshallerContext> unmarshaller = new DeleteMembersResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMembersResult> responseHandler = new JsonResponseHandler<DeleteMembersResult>(
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
     * Returns a list of the custom action targets in Security Hub in your
     * account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @return describeActionTargetsResult The response from the
     *         DescribeActionTargets service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeActionTargetsResult describeActionTargets(
            DescribeActionTargetsRequest describeActionTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeActionTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActionTargetsRequest> request = null;
        Response<DescribeActionTargetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActionTargetsRequestMarshaller()
                        .marshall(describeActionTargetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeActionTargetsResult, JsonUnmarshallerContext> unmarshaller = new DescribeActionTargetsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeActionTargetsResult> responseHandler = new JsonResponseHandler<DescribeActionTargetsResult>(
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
     * Returns details about the Hub resource in your account, including the
     * <code>HubArn</code> and the time when you enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @return describeHubResult The response from the DescribeHub service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeHubResult describeHub(DescribeHubRequest describeHubRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHubRequest> request = null;
        Response<DescribeHubResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHubRequestMarshaller().marshall(describeHubRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeHubResult, JsonUnmarshallerContext> unmarshaller = new DescribeHubResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHubResult> responseHandler = new JsonResponseHandler<DescribeHubResult>(
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
     * Returns information about the available products that you can subscribe
     * to and integrate with Security Hub in order to consolidate findings.
     * </p>
     * 
     * @param describeProductsRequest
     * @return describeProductsResult The response from the DescribeProducts
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeProductsResult describeProducts(DescribeProductsRequest describeProductsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductsRequest> request = null;
        Response<DescribeProductsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductsRequestMarshaller().marshall(describeProductsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProductsResult, JsonUnmarshallerContext> unmarshaller = new DescribeProductsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProductsResult> responseHandler = new JsonResponseHandler<DescribeProductsResult>(
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
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a
     * description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @return describeStandardsResult The response from the DescribeStandards
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeStandardsResult describeStandards(
            DescribeStandardsRequest describeStandardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStandardsRequest> request = null;
        Response<DescribeStandardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStandardsRequestMarshaller()
                        .marshall(describeStandardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStandardsResult, JsonUnmarshallerContext> unmarshaller = new DescribeStandardsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStandardsResult> responseHandler = new JsonResponseHandler<DescribeStandardsResult>(
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
     * Returns a list of security standards controls.
     * </p>
     * <p>
     * For each control, the results include information about whether it is
     * currently enabled, the severity, and a link to remediation information.
     * </p>
     * 
     * @param describeStandardsControlsRequest
     * @return describeStandardsControlsResult The response from the
     *         DescribeStandardsControls service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeStandardsControlsResult describeStandardsControls(
            DescribeStandardsControlsRequest describeStandardsControlsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStandardsControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStandardsControlsRequest> request = null;
        Response<DescribeStandardsControlsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStandardsControlsRequestMarshaller()
                        .marshall(describeStandardsControlsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStandardsControlsResult, JsonUnmarshallerContext> unmarshaller = new DescribeStandardsControlsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStandardsControlsResult> responseHandler = new JsonResponseHandler<DescribeStandardsControlsResult>(
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
     * Disables the integration of the specified product with Security Hub.
     * After the integration is disabled, findings from that product are no
     * longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return disableImportFindingsForProductResult The response from the
     *         DisableImportFindingsForProduct service method, as returned by
     *         AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableImportFindingsForProductResult disableImportFindingsForProduct(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableImportFindingsForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableImportFindingsForProductRequest> request = null;
        Response<DisableImportFindingsForProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableImportFindingsForProductRequestMarshaller()
                        .marshall(disableImportFindingsForProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableImportFindingsForProductResult, JsonUnmarshallerContext> unmarshaller = new DisableImportFindingsForProductResultJsonUnmarshaller();
            JsonResponseHandler<DisableImportFindingsForProductResult> responseHandler = new JsonResponseHandler<DisableImportFindingsForProductResult>(
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
     * Disables Security Hub in your account only in the current Region. To
     * disable Security Hub in all Regions, you must submit one request per
     * Region where you have enabled Security Hub.
     * </p>
     * <p>
     * When you disable Security Hub for a master account, it doesn't disable
     * Security Hub for any associated member accounts.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and
     * any Security Hub configuration settings are deleted after 90 days and
     * cannot be recovered. Any standards that were enabled are disabled, and
     * your master and member account associations are removed.
     * </p>
     * <p>
     * If you want to save your existing findings, you must export them before
     * you disable Security Hub.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return disableSecurityHubResult The response from the DisableSecurityHub
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableSecurityHubResult disableSecurityHub(
            DisableSecurityHubRequest disableSecurityHubRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableSecurityHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSecurityHubRequest> request = null;
        Response<DisableSecurityHubResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSecurityHubRequestMarshaller()
                        .marshall(disableSecurityHubRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableSecurityHubResult, JsonUnmarshallerContext> unmarshaller = new DisableSecurityHubResultJsonUnmarshaller();
            JsonResponseHandler<DisableSecurityHubResult> responseHandler = new JsonResponseHandler<DisableSecurityHubResult>(
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
     * Disassociates the current Security Hub member account from the associated
     * master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return disassociateFromMasterAccountResult The response from the
     *         DisassociateFromMasterAccount service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateFromMasterAccountResult disassociateFromMasterAccount(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateFromMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFromMasterAccountRequest> request = null;
        Response<DisassociateFromMasterAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFromMasterAccountRequestMarshaller()
                        .marshall(disassociateFromMasterAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateFromMasterAccountResult, JsonUnmarshallerContext> unmarshaller = new DisassociateFromMasterAccountResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateFromMasterAccountResult> responseHandler = new JsonResponseHandler<DisassociateFromMasterAccountResult>(
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
     * Disassociates the specified member accounts from the associated master
     * account.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return disassociateMembersResult The response from the
     *         DisassociateMembers service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisassociateMembersResult disassociateMembers(
            DisassociateMembersRequest disassociateMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMembersRequest> request = null;
        Response<DisassociateMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMembersRequestMarshaller()
                        .marshall(disassociateMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateMembersResult, JsonUnmarshallerContext> unmarshaller = new DisassociateMembersResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateMembersResult> responseHandler = new JsonResponseHandler<DisassociateMembersResult>(
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
     * Enables the integration of a partner product with Security Hub.
     * Integrated products send findings to Security Hub.
     * </p>
     * <p>
     * When you enable a product integration, a permission policy that grants
     * permission for the product to send findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return enableImportFindingsForProductResult The response from the
     *         EnableImportFindingsForProduct service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableImportFindingsForProductResult enableImportFindingsForProduct(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableImportFindingsForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableImportFindingsForProductRequest> request = null;
        Response<EnableImportFindingsForProductResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableImportFindingsForProductRequestMarshaller()
                        .marshall(enableImportFindingsForProductRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableImportFindingsForProductResult, JsonUnmarshallerContext> unmarshaller = new EnableImportFindingsForProductResultJsonUnmarshaller();
            JsonResponseHandler<EnableImportFindingsForProductResult> responseHandler = new JsonResponseHandler<EnableImportFindingsForProductResult>(
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
     * Enables Security Hub for your account in the current Region or the Region
     * you specify in the request.
     * </p>
     * <p>
     * When you enable Security Hub, you grant to Security Hub the permissions
     * necessary to gather findings from other services that are integrated with
     * Security Hub.
     * </p>
     * <p>
     * When you use the <code>EnableSecurityHub</code> operation to enable
     * Security Hub, you also automatically enable the CIS AWS Foundations
     * standard. You do not enable the Payment Card Industry Data Security
     * Standard (PCI DSS) standard. To not enable the CIS AWS Foundations
     * standard, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * After you enable Security Hub, to enable a standard, use the
     * <code> <a>BatchEnableStandards</a> </code> operation. To disable a
     * standard, use the <code> <a>BatchDisableStandards</a> </code> operation.
     * </p>
     * <p>
     * To learn more, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html"
     * >Setting Up AWS Security Hub</a> in the <i>AWS Security Hub User
     * Guide</i>.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return enableSecurityHubResult The response from the EnableSecurityHub
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceConflictException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableSecurityHubResult enableSecurityHub(
            EnableSecurityHubRequest enableSecurityHubRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableSecurityHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSecurityHubRequest> request = null;
        Response<EnableSecurityHubResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSecurityHubRequestMarshaller()
                        .marshall(enableSecurityHubRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableSecurityHubResult, JsonUnmarshallerContext> unmarshaller = new EnableSecurityHubResultJsonUnmarshaller();
            JsonResponseHandler<EnableSecurityHubResult> responseHandler = new JsonResponseHandler<EnableSecurityHubResult>(
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
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return getEnabledStandardsResult The response from the
     *         GetEnabledStandards service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetEnabledStandardsResult getEnabledStandards(
            GetEnabledStandardsRequest getEnabledStandardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEnabledStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnabledStandardsRequest> request = null;
        Response<GetEnabledStandardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnabledStandardsRequestMarshaller()
                        .marshall(getEnabledStandardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEnabledStandardsResult, JsonUnmarshallerContext> unmarshaller = new GetEnabledStandardsResultJsonUnmarshaller();
            JsonResponseHandler<GetEnabledStandardsResult> responseHandler = new JsonResponseHandler<GetEnabledStandardsResult>(
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
     * Returns a list of findings that match the specified criteria.
     * </p>
     * 
     * @param getFindingsRequest
     * @return getFindingsResult The response from the GetFindings service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsRequest> request = null;
        Response<GetFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsRequestMarshaller().marshall(getFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFindingsResult, JsonUnmarshallerContext> unmarshaller = new GetFindingsResultJsonUnmarshaller();
            JsonResponseHandler<GetFindingsResult> responseHandler = new JsonResponseHandler<GetFindingsResult>(
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
     * Lists the results of the Security Hub insight specified by the insight
     * ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return getInsightResultsResult The response from the GetInsightResults
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInsightResultsResult getInsightResults(
            GetInsightResultsRequest getInsightResultsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInsightResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightResultsRequest> request = null;
        Response<GetInsightResultsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightResultsRequestMarshaller()
                        .marshall(getInsightResultsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInsightResultsResult, JsonUnmarshallerContext> unmarshaller = new GetInsightResultsResultJsonUnmarshaller();
            JsonResponseHandler<GetInsightResultsResult> responseHandler = new JsonResponseHandler<GetInsightResultsResult>(
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
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return getInsightsResult The response from the GetInsights service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInsightsResult getInsights(GetInsightsRequest getInsightsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightsRequest> request = null;
        Response<GetInsightsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightsRequestMarshaller().marshall(getInsightsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInsightsResult, JsonUnmarshallerContext> unmarshaller = new GetInsightsResultJsonUnmarshaller();
            JsonResponseHandler<GetInsightsResult> responseHandler = new JsonResponseHandler<GetInsightsResult>(
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
     * Returns the count of all Security Hub membership invitations that were
     * sent to the current member account, not including the currently accepted
     * invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return getInvitationsCountResult The response from the
     *         GetInvitationsCount service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetInvitationsCountResult getInvitationsCount(
            GetInvitationsCountRequest getInvitationsCountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInvitationsCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvitationsCountRequest> request = null;
        Response<GetInvitationsCountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInvitationsCountRequestMarshaller()
                        .marshall(getInvitationsCountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInvitationsCountResult, JsonUnmarshallerContext> unmarshaller = new GetInvitationsCountResultJsonUnmarshaller();
            JsonResponseHandler<GetInvitationsCountResult> responseHandler = new JsonResponseHandler<GetInvitationsCountResult>(
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
     * Provides the details for the Security Hub master account for the current
     * member account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return getMasterAccountResult The response from the GetMasterAccount
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMasterAccountRequest> request = null;
        Response<GetMasterAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMasterAccountRequestMarshaller().marshall(getMasterAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMasterAccountResult, JsonUnmarshallerContext> unmarshaller = new GetMasterAccountResultJsonUnmarshaller();
            JsonResponseHandler<GetMasterAccountResult> responseHandler = new JsonResponseHandler<GetMasterAccountResult>(
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
     * Returns the details for the Security Hub member accounts for the
     * specified account IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return getMembersResult The response from the GetMembers service method,
     *         as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMembersResult getMembers(GetMembersRequest getMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMembersRequest> request = null;
        Response<GetMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMembersRequestMarshaller().marshall(getMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMembersResult, JsonUnmarshallerContext> unmarshaller = new GetMembersResultJsonUnmarshaller();
            JsonResponseHandler<GetMembersResult> responseHandler = new JsonResponseHandler<GetMembersResult>(
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
     * Invites other AWS accounts to become member accounts for the Security Hub
     * master account that the invitation is sent from.
     * </p>
     * <p>
     * Before you can use this action to invite a member, you must first use the
     * <code> <a>CreateMembers</a> </code> action to create the member account
     * in Security Hub.
     * </p>
     * <p>
     * When the account owner accepts the invitation to become a member account
     * and enables Security Hub, the master account can view the findings
     * generated from the member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return inviteMembersResult The response from the InviteMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(inviteMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InviteMembersRequest> request = null;
        Response<InviteMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InviteMembersRequestMarshaller().marshall(inviteMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InviteMembersResult, JsonUnmarshallerContext> unmarshaller = new InviteMembersResultJsonUnmarshaller();
            JsonResponseHandler<InviteMembersResult> responseHandler = new JsonResponseHandler<InviteMembersResult>(
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
     * Lists all findings-generating solutions (products) that you are
     * subscribed to receive findings from in Security Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return listEnabledProductsForImportResult The response from the
     *         ListEnabledProductsForImport service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListEnabledProductsForImportResult listEnabledProductsForImport(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEnabledProductsForImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnabledProductsForImportRequest> request = null;
        Response<ListEnabledProductsForImportResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnabledProductsForImportRequestMarshaller()
                        .marshall(listEnabledProductsForImportRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEnabledProductsForImportResult, JsonUnmarshallerContext> unmarshaller = new ListEnabledProductsForImportResultJsonUnmarshaller();
            JsonResponseHandler<ListEnabledProductsForImportResult> responseHandler = new JsonResponseHandler<ListEnabledProductsForImportResult>(
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
     * Lists all Security Hub membership invitations that were sent to the
     * current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return listInvitationsResult The response from the ListInvitations
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInvitationsRequest> request = null;
        Response<ListInvitationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInvitationsRequestMarshaller().marshall(listInvitationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInvitationsResult, JsonUnmarshallerContext> unmarshaller = new ListInvitationsResultJsonUnmarshaller();
            JsonResponseHandler<ListInvitationsResult> responseHandler = new JsonResponseHandler<ListInvitationsResult>(
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
     * Lists details about all member accounts for the current Security Hub
     * master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return listMembersResult The response from the ListMembers service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListMembersResult listMembers(ListMembersRequest listMembersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMembersRequest> request = null;
        Response<ListMembersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMembersRequestMarshaller().marshall(listMembersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMembersResult, JsonUnmarshallerContext> unmarshaller = new ListMembersResultJsonUnmarshaller();
            JsonResponseHandler<ListMembersResult> responseHandler = new JsonResponseHandler<ListMembersResult>(
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
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
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
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
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
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
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
     * Updates the name and description of a custom action target in Security
     * Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @return updateActionTargetResult The response from the UpdateActionTarget
     *         service method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateActionTargetResult updateActionTarget(
            UpdateActionTargetRequest updateActionTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateActionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateActionTargetRequest> request = null;
        Response<UpdateActionTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateActionTargetRequestMarshaller()
                        .marshall(updateActionTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateActionTargetResult, JsonUnmarshallerContext> unmarshaller = new UpdateActionTargetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateActionTargetResult> responseHandler = new JsonResponseHandler<UpdateActionTargetResult>(
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
     * <code>UpdateFindings</code> is deprecated. Instead of
     * <code>UpdateFindings</code>, use <code>BatchUpdateFindings</code>.
     * </p>
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the
     * Security Hub-aggregated findings that the filter attributes specify. Any
     * member account that can view the finding also sees the update to the
     * finding.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return updateFindingsResult The response from the UpdateFindings service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateFindingsResult updateFindings(UpdateFindingsRequest updateFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFindingsRequest> request = null;
        Response<UpdateFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFindingsRequestMarshaller().marshall(updateFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateFindingsResult, JsonUnmarshallerContext> unmarshaller = new UpdateFindingsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateFindingsResult> responseHandler = new JsonResponseHandler<UpdateFindingsResult>(
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
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return updateInsightResult The response from the UpdateInsight service
     *         method, as returned by AWS SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateInsightResult updateInsight(UpdateInsightRequest updateInsightRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInsightRequest> request = null;
        Response<UpdateInsightResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInsightRequestMarshaller().marshall(updateInsightRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateInsightResult, JsonUnmarshallerContext> unmarshaller = new UpdateInsightResultJsonUnmarshaller();
            JsonResponseHandler<UpdateInsightResult> responseHandler = new JsonResponseHandler<UpdateInsightResult>(
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
     * Used to control whether an individual security standard control is
     * enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @return updateStandardsControlResult The response from the
     *         UpdateStandardsControl service method, as returned by AWS
     *         SecurityHub.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws InvalidAccessException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             SecurityHub indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateStandardsControlResult updateStandardsControl(
            UpdateStandardsControlRequest updateStandardsControlRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStandardsControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStandardsControlRequest> request = null;
        Response<UpdateStandardsControlResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStandardsControlRequestMarshaller()
                        .marshall(updateStandardsControlRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateStandardsControlResult, JsonUnmarshallerContext> unmarshaller = new UpdateStandardsControlResultJsonUnmarshaller();
            JsonResponseHandler<UpdateStandardsControlResult> responseHandler = new JsonResponseHandler<UpdateStandardsControlResult>(
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
