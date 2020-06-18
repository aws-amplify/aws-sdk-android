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

package com.amazonaws.services.support;

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

import com.amazonaws.services.support.model.*;
import com.amazonaws.services.support.model.transform.*;

/**
 * Client for accessing AWS Support. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Support</fullname>
 * <p>
 * The AWS Support API reference is intended for programmers who need detailed
 * information about the AWS Support operations and data types. This service
 * enables you to manage your AWS Support cases programmatically. It uses HTTP
 * methods that return results in JSON format.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise support plan to use the AWS Support
 * API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the AWS Support API from an account that does not have a Business
 * or Enterprise support plan, the <code>SubscriptionRequiredException</code>
 * error message appears. For information about changing your support plan, see
 * <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * The AWS Support service also exposes a set of <a
 * href="http://aws.amazon.com/premiumsupport/trustedadvisor/">AWS Trusted
 * Advisor</a> features. You can retrieve a list of checks and their
 * descriptions, get check results, specify checks to refresh, and get the
 * refresh status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Service names, issue categories, and available severity levels. </b>The
 * <a>DescribeServices</a> and <a>DescribeSeverityLevels</a> operations return
 * AWS service names, service codes, service categories, and problem severity
 * levels. You use these values when you call the <a>CreateCase</a> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Case creation, case details, and case resolution.</b> The
 * <a>CreateCase</a>, <a>DescribeCases</a>, <a>DescribeAttachment</a>, and
 * <a>ResolveCase</a> operations create AWS Support cases, retrieve information
 * about cases, and resolve cases.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Case communication.</b> The <a>DescribeCommunications</a>,
 * <a>AddCommunicationToCase</a>, and <a>AddAttachmentsToSet</a> operations
 * retrieve and add communications and attachments to AWS Support cases.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following list describes the operations available from the AWS Support
 * service for Trusted Advisor:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorChecks</a> returns the list of checks that run
 * against your AWS resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * Using the <code>checkId</code> for a specific check returned by
 * <a>DescribeTrustedAdvisorChecks</a>, you can call
 * <a>DescribeTrustedAdvisorCheckResult</a> to obtain the results for the check
 * that you specified.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckSummaries</a> returns summarized results for
 * one or more Trusted Advisor checks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RefreshTrustedAdvisorCheck</a> requests that Trusted Advisor rerun a
 * specified check.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> reports the refresh status
 * of one or more checks.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * See <a
 * href="https://docs.aws.amazon.com/awssupport/latest/user/Welcome.html">About
 * the AWS Support API</a> in the <i>AWS Support User Guide</i> for information
 * about how to use this service to create and manage your support cases, and
 * how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
public class AWSSupportClient extends AmazonWebServiceClient implements AWSSupport {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Support exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSSupport. A
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
    public AWSSupportClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSSupport. A
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
     *            how this client connects to AWSSupport (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSSupportClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSSupport using the
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
     *         AWSSupportClient client = new AWSSupportClient(AWSMobileClient.getInstance());
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
    public AWSSupportClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSSupport using the
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
     *         AWSSupportClient client = new AWSSupportClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSSupport (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSSupportClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSSupport using the
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
     *         AWSSupportClient client = new AWSSupportClient(AWSMobileClient.getInstance());
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
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSSupport using the
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
     *         AWSSupportClient client = new AWSSupportClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSSupport (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSSupport using the
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
     *            how this client connects to AWSSupport (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSSupport using the
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
     *         AWSSupportClient client = new AWSSupportClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSSupport (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AttachmentIdNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AttachmentLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AttachmentSetExpiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AttachmentSetIdNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AttachmentSetSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CaseCreationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CaseIdNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DescribeAttachmentLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("support.us-east-1.amazonaws.com");
        this.endpointPrefix = "support";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/support/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/support/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds one or more attachments to an attachment set.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that you add
     * to a case or case communication. The set is available for 1 hour after
     * it's created. The <code>expiryTime</code> returned in the response is
     * when the set expires.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addAttachmentsToSetRequest
     * @return addAttachmentsToSetResult The response from the
     *         AddAttachmentsToSet service method, as returned by AWS Support.
     * @throws InternalServerErrorException
     * @throws AttachmentSetIdNotFoundException
     * @throws AttachmentSetExpiredException
     * @throws AttachmentSetSizeLimitExceededException
     * @throws AttachmentLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AddAttachmentsToSetResult addAttachmentsToSet(
            AddAttachmentsToSetRequest addAttachmentsToSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addAttachmentsToSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddAttachmentsToSetRequest> request = null;
        Response<AddAttachmentsToSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddAttachmentsToSetRequestMarshaller()
                        .marshall(addAttachmentsToSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddAttachmentsToSetResult, JsonUnmarshallerContext> unmarshaller = new AddAttachmentsToSetResultJsonUnmarshaller();
            JsonResponseHandler<AddAttachmentsToSetResult> responseHandler = new JsonResponseHandler<AddAttachmentsToSetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. Use the
     * <code>caseId</code> parameter to identify the case to which to add
     * communication. You can list a set of email addresses to copy on the
     * communication by using the <code>ccEmailAddresses</code> parameter. The
     * <code>communicationBody</code> value contains the text of the
     * communication.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addCommunicationToCaseRequest
     * @return addCommunicationToCaseResult The response from the
     *         AddCommunicationToCase service method, as returned by AWS
     *         Support.
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     * @throws AttachmentSetIdNotFoundException
     * @throws AttachmentSetExpiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AddCommunicationToCaseResult addCommunicationToCase(
            AddCommunicationToCaseRequest addCommunicationToCaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addCommunicationToCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCommunicationToCaseRequest> request = null;
        Response<AddCommunicationToCaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCommunicationToCaseRequestMarshaller()
                        .marshall(addCommunicationToCaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddCommunicationToCaseResult, JsonUnmarshallerContext> unmarshaller = new AddCommunicationToCaseResultJsonUnmarshaller();
            JsonResponseHandler<AddCommunicationToCaseResult> responseHandler = new JsonResponseHandler<AddCommunicationToCaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a case in the AWS Support Center. This operation is similar to
     * how you create a case in the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     * <p>
     * The AWS Support API doesn't support requesting service limit increases.
     * You can submit a service limit increase in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Submit a request from the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Service Quotas <a href=
     * "https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_RequestServiceQuotaIncrease.html"
     * >RequestServiceQuotaIncrease</a> operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A successful <code>CreateCase</code> request returns an AWS Support case
     * number. You can use the <a>DescribeCases</a> operation and specify the
     * case number to get existing AWS Support cases. After you create a case,
     * use the <a>AddCommunicationToCase</a> operation to add additional
     * communication or attachments to an existing case.
     * </p>
     * <p>
     * The <code>caseId</code> is separate from the <code>displayId</code> that
     * appears in the <a href="https://console.aws.amazon.com/support">AWS
     * Support Center</a>. Use the <a>DescribeCases</a> operation to get the
     * <code>displayId</code>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createCaseRequest
     * @return createCaseResult The response from the CreateCase service method,
     *         as returned by AWS Support.
     * @throws InternalServerErrorException
     * @throws CaseCreationLimitExceededException
     * @throws AttachmentSetIdNotFoundException
     * @throws AttachmentSetExpiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCaseResult createCase(CreateCaseRequest createCaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCaseRequest> request = null;
        Response<CreateCaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCaseRequestMarshaller().marshall(createCaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCaseResult, JsonUnmarshallerContext> unmarshaller = new CreateCaseResultJsonUnmarshaller();
            JsonResponseHandler<CreateCaseResult> responseHandler = new JsonResponseHandler<CreateCaseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachments can include
     * screenshots, error logs, or other files that describe your issue.
     * Attachment IDs are generated by the case management system when you add
     * an attachment to a case or case communication. Attachment IDs are
     * returned in the <a>AttachmentDetails</a> objects that are returned by the
     * <a>DescribeCommunications</a> operation.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeAttachmentRequest
     * @return describeAttachmentResult The response from the DescribeAttachment
     *         service method, as returned by AWS Support.
     * @throws InternalServerErrorException
     * @throws DescribeAttachmentLimitExceededException
     * @throws AttachmentIdNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAttachmentResult describeAttachment(
            DescribeAttachmentRequest describeAttachmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAttachmentRequest> request = null;
        Response<DescribeAttachmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAttachmentRequestMarshaller()
                        .marshall(describeAttachmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAttachmentResult, JsonUnmarshallerContext> unmarshaller = new DescribeAttachmentResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAttachmentResult> responseHandler = new JsonResponseHandler<DescribeAttachmentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case IDs.
     * You can use the <code>afterTime</code> and <code>beforeTime</code>
     * parameters to filter the cases by date. You can set values for the
     * <code>includeResolvedCases</code> and <code>includeCommunications</code>
     * parameters to specify how much information to return.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     * >CaseDetails</a> data types.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more <code>nextToken</code> values, which specify where to
     * paginate the returned records represented by the <code>CaseDetails</code>
     * objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request might return an error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCasesRequest
     * @return describeCasesResult The response from the DescribeCases service
     *         method, as returned by AWS Support.
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCasesResult describeCases(DescribeCasesRequest describeCasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCasesRequest> request = null;
        Response<DescribeCasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCasesRequestMarshaller().marshall(describeCasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCasesResult, JsonUnmarshallerContext> unmarshaller = new DescribeCasesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCasesResult> responseHandler = new JsonResponseHandler<DescribeCasesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns communications and attachments for one or more support cases. Use
     * the <code>afterTime</code> and <code>beforeTime</code> parameters to
     * filter by date. You can use the <code>caseId</code> parameter to restrict
     * the results to a specific case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an error.
     * </p>
     * <p>
     * You can use the <code>maxResults</code> and <code>nextToken</code>
     * parameters to control the pagination of the results. Set
     * <code>maxResults</code> to the number of cases that you want to display
     * on each page, and use <code>nextToken</code> to specify the resumption of
     * pagination.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCommunicationsRequest
     * @return describeCommunicationsResult The response from the
     *         DescribeCommunications service method, as returned by AWS
     *         Support.
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCommunicationsResult describeCommunications(
            DescribeCommunicationsRequest describeCommunicationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCommunicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCommunicationsRequest> request = null;
        Response<DescribeCommunicationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCommunicationsRequestMarshaller()
                        .marshall(describeCommunicationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCommunicationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeCommunicationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCommunicationsResult> responseHandler = new JsonResponseHandler<DescribeCommunicationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the current list of AWS services and a list of service categories
     * for each service. You then use service names and categories in your
     * <a>CreateCase</a> requests. Each AWS service has its own set of
     * categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that appear
     * in the <b>Service</b> and <b>Category</b> lists on the AWS Support Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page. The values in those fields don't necessarily match the
     * service codes and categories returned by the
     * <code>DescribeServices</code> operation. Always use the service codes and
     * categories that the <code>DescribeServices</code> operation returns, so
     * that you have the most recent set of service and category codes.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeServicesRequest
     * @return describeServicesResult The response from the DescribeServices
     *         service method, as returned by AWS Support.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServicesRequest> request = null;
        Response<DescribeServicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServicesRequestMarshaller().marshall(describeServicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeServicesResult, JsonUnmarshallerContext> unmarshaller = new DescribeServicesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeServicesResult> responseHandler = new JsonResponseHandler<DescribeServicesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS Support
     * case. The severity level for a case is also a field in the
     * <a>CaseDetails</a> data type that you include for a <a>CreateCase</a>
     * request.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeSeverityLevelsRequest
     * @return describeSeverityLevelsResult The response from the
     *         DescribeSeverityLevels service method, as returned by AWS
     *         Support.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSeverityLevelsResult describeSeverityLevels(
            DescribeSeverityLevelsRequest describeSeverityLevelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSeverityLevelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSeverityLevelsRequest> request = null;
        Response<DescribeSeverityLevelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSeverityLevelsRequestMarshaller()
                        .marshall(describeSeverityLevelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSeverityLevelsResult, JsonUnmarshallerContext> unmarshaller = new DescribeSeverityLevelsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSeverityLevelsResult> responseHandler = new JsonResponseHandler<DescribeSeverityLevelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the refresh status of the AWS Trusted Advisor checks that have
     * the specified check IDs. You can get the check IDs by calling the
     * <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * Some checks are refreshed automatically, and you can't return their
     * refresh statuses by using the
     * <code>DescribeTrustedAdvisorCheckRefreshStatuses</code> operation. If you
     * call this operation for these checks, you might see an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest
     * @return describeTrustedAdvisorCheckRefreshStatusesResult The response
     *         from the DescribeTrustedAdvisorCheckRefreshStatuses service
     *         method, as returned by AWS Support.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult describeTrustedAdvisorCheckRefreshStatuses(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckRefreshStatusesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckRefreshStatusesRequest> request = null;
        Response<DescribeTrustedAdvisorCheckRefreshStatusesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckRefreshStatusesRequestMarshaller()
                        .marshall(describeTrustedAdvisorCheckRefreshStatusesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorCheckRefreshStatusesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorCheckRefreshStatusesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorCheckRefreshStatusesResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorCheckRefreshStatusesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the results of the AWS Trusted Advisor check that has the
     * specified check ID. You can get the check IDs by calling the
     * <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckResult</a> object, which
     * contains these three objects:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>TrustedAdvisorCategorySpecificSummary</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourceDetail</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourcesSummary</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>status</b> - The alert status of the check: "ok" (green), "warning"
     * (yellow), "error" (red), or "not_available".
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>timestamp</b> - The time of the last refresh of the check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>checkId</b> - The unique identifier for the check.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckResultRequest <p/>
     * @return describeTrustedAdvisorCheckResultResult The response from the
     *         DescribeTrustedAdvisorCheckResult service method, as returned by
     *         AWS Support.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckResultResult describeTrustedAdvisorCheckResult(
            DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckResultRequest> request = null;
        Response<DescribeTrustedAdvisorCheckResultResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckResultRequestMarshaller()
                        .marshall(describeTrustedAdvisorCheckResultRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorCheckResultResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorCheckResultResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorCheckResultResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorCheckResultResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the results for the AWS Trusted Advisor check summaries for the
     * check IDs that you specified. You can get the check IDs by calling the
     * <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains an array of <a>TrustedAdvisorCheckSummary</a>
     * objects.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckSummariesRequest
     * @return describeTrustedAdvisorCheckSummariesResult The response from the
     *         DescribeTrustedAdvisorCheckSummaries service method, as returned
     *         by AWS Support.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckSummariesResult describeTrustedAdvisorCheckSummaries(
            DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckSummariesRequest> request = null;
        Response<DescribeTrustedAdvisorCheckSummariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckSummariesRequestMarshaller()
                        .marshall(describeTrustedAdvisorCheckSummariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorCheckSummariesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorCheckSummariesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorCheckSummariesResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorCheckSummariesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all available AWS Trusted Advisor checks,
     * including the name, ID, category, description, and metadata. You must
     * specify a language code. The AWS Support API currently supports English
     * ("en") and Japanese ("ja"). The response contains a
     * <a>TrustedAdvisorCheckDescription</a> object for each check. You must set
     * the AWS Region to us-east-1.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorChecksRequest
     * @return describeTrustedAdvisorChecksResult The response from the
     *         DescribeTrustedAdvisorChecks service method, as returned by AWS
     *         Support.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTrustedAdvisorChecksResult describeTrustedAdvisorChecks(
            DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorChecksRequest> request = null;
        Response<DescribeTrustedAdvisorChecksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorChecksRequestMarshaller()
                        .marshall(describeTrustedAdvisorChecksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorChecksResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorChecksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorChecksResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorChecksResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Refreshes the AWS Trusted Advisor check that you specify using the check
     * ID. You can get the check IDs by calling the
     * <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <note>
     * <p>
     * Some checks are refreshed automatically. If you call the
     * <code>RefreshTrustedAdvisorCheck</code> operation to refresh them, you
     * might see the <code>InvalidParameterValue</code> error.
     * </p>
     * </note>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckRefreshStatus</a> object.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param refreshTrustedAdvisorCheckRequest <p/>
     * @return refreshTrustedAdvisorCheckResult The response from the
     *         RefreshTrustedAdvisorCheck service method, as returned by AWS
     *         Support.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RefreshTrustedAdvisorCheckResult refreshTrustedAdvisorCheck(
            RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(refreshTrustedAdvisorCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshTrustedAdvisorCheckRequest> request = null;
        Response<RefreshTrustedAdvisorCheckResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshTrustedAdvisorCheckRequestMarshaller()
                        .marshall(refreshTrustedAdvisorCheckRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RefreshTrustedAdvisorCheckResult, JsonUnmarshallerContext> unmarshaller = new RefreshTrustedAdvisorCheckResultJsonUnmarshaller();
            JsonResponseHandler<RefreshTrustedAdvisorCheckResult> responseHandler = new JsonResponseHandler<RefreshTrustedAdvisorCheckResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Resolves a support case. This operation takes a <code>caseId</code> and
     * returns the initial and final state of the case.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise support plan to use the AWS
     * Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a
     * Business or Enterprise support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For
     * information about changing your support plan, see <a
     * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param resolveCaseRequest
     * @return resolveCaseResult The response from the ResolveCase service
     *         method, as returned by AWS Support.
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Support indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResolveCaseResult resolveCase(ResolveCaseRequest resolveCaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resolveCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveCaseRequest> request = null;
        Response<ResolveCaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveCaseRequestMarshaller().marshall(resolveCaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResolveCaseResult, JsonUnmarshallerContext> unmarshaller = new ResolveCaseResultJsonUnmarshaller();
            JsonResponseHandler<ResolveCaseResult> responseHandler = new JsonResponseHandler<ResolveCaseResult>(
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
