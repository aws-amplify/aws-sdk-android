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

package com.amazonaws.services.amazonroute53domains;

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

import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.services.amazonroute53domains.model.transform.*;

/**
 * Client for accessing Amazon Route 53 Domains. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Amazon Route 53 API actions let you register domain names and perform related
 * operations.
 * </p>
 */
public class AmazonRoute53DomainsClient extends AmazonWebServiceClient implements
        AmazonRoute53Domains {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Route 53 Domains
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains. A credentials provider chain will be used that
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
    public AmazonRoute53DomainsClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRoute53Domains. A credentials provider chain will be used that
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
     *            how this client connects to AmazonRoute53Domains (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonRoute53DomainsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRoute53Domains
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
     *         AmazonRoute53DomainsClient client = new AmazonRoute53DomainsClient(AWSMobileClient
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
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRoute53Domains
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
     *         AmazonRoute53DomainsClient client = new AmazonRoute53DomainsClient(AWSMobileClient
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
     *            how this client connects to AmazonRoute53Domains (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRoute53Domains
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
     *         AmazonRoute53DomainsClient client = new AmazonRoute53DomainsClient(AWSMobileClient
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
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRoute53Domains
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
     *         AmazonRoute53DomainsClient client = new AmazonRoute53DomainsClient(AWSMobileClient
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
     *            how this client connects to AmazonRoute53Domains (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRoute53Domains
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
     *            how this client connects to AmazonRoute53Domains (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRoute53Domains
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
     *         AmazonRoute53DomainsClient client = new AmazonRoute53DomainsClient(AWSMobileClient
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
     *            how this client connects to AmazonRoute53Domains (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonRoute53DomainsClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DomainLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DuplicateRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TLDRulesViolationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedTLDExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("route53domains.us-east-1.amazonaws.com");
        this.endpointPrefix = "route53domains";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonroute53domains/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonroute53domains/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Accepts the transfer of a domain from another AWS account to the current
     * AWS account. You initiate a transfer between AWS accounts using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param acceptDomainTransferFromAnotherAwsAccountRequest <p>
     *            The AcceptDomainTransferFromAnotherAwsAccount request includes
     *            the following elements.
     *            </p>
     * @return acceptDomainTransferFromAnotherAwsAccountResult The response from
     *         the AcceptDomainTransferFromAnotherAwsAccount service method, as
     *         returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws DomainLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AcceptDomainTransferFromAnotherAwsAccountResult acceptDomainTransferFromAnotherAwsAccount(
            AcceptDomainTransferFromAnotherAwsAccountRequest acceptDomainTransferFromAnotherAwsAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptDomainTransferFromAnotherAwsAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptDomainTransferFromAnotherAwsAccountRequest> request = null;
        Response<AcceptDomainTransferFromAnotherAwsAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptDomainTransferFromAnotherAwsAccountRequestMarshaller()
                        .marshall(acceptDomainTransferFromAnotherAwsAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AcceptDomainTransferFromAnotherAwsAccountResult, JsonUnmarshallerContext> unmarshaller = new AcceptDomainTransferFromAnotherAwsAccountResultJsonUnmarshaller();
            JsonResponseHandler<AcceptDomainTransferFromAnotherAwsAccountResult> responseHandler = new JsonResponseHandler<AcceptDomainTransferFromAnotherAwsAccountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Cancels the transfer of a domain from the current AWS account to another
     * AWS account. You initiate a transfer between AWS accounts using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * <important>
     * <p>
     * You must cancel the transfer before the other AWS account accepts the
     * transfer using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a>.
     * </p>
     * </important>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param cancelDomainTransferToAnotherAwsAccountRequest <p>
     *            The CancelDomainTransferToAnotherAwsAccount request includes
     *            the following element.
     *            </p>
     * @return cancelDomainTransferToAnotherAwsAccountResult The response from
     *         the CancelDomainTransferToAnotherAwsAccount service method, as
     *         returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CancelDomainTransferToAnotherAwsAccountResult cancelDomainTransferToAnotherAwsAccount(
            CancelDomainTransferToAnotherAwsAccountRequest cancelDomainTransferToAnotherAwsAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelDomainTransferToAnotherAwsAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelDomainTransferToAnotherAwsAccountRequest> request = null;
        Response<CancelDomainTransferToAnotherAwsAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelDomainTransferToAnotherAwsAccountRequestMarshaller()
                        .marshall(cancelDomainTransferToAnotherAwsAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelDomainTransferToAnotherAwsAccountResult, JsonUnmarshallerContext> unmarshaller = new CancelDomainTransferToAnotherAwsAccountResultJsonUnmarshaller();
            JsonResponseHandler<CancelDomainTransferToAnotherAwsAccountResult> responseHandler = new JsonResponseHandler<CancelDomainTransferToAnotherAwsAccountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation checks the availability of one domain name. Note that if
     * the availability status of a domain is pending, you must submit another
     * request to determine the availability of the domain name.
     * </p>
     * 
     * @param checkDomainAvailabilityRequest <p>
     *            The CheckDomainAvailability request contains the following
     *            elements.
     *            </p>
     * @return checkDomainAvailabilityResult The response from the
     *         CheckDomainAvailability service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CheckDomainAvailabilityResult checkDomainAvailability(
            CheckDomainAvailabilityRequest checkDomainAvailabilityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(checkDomainAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDomainAvailabilityRequest> request = null;
        Response<CheckDomainAvailabilityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDomainAvailabilityRequestMarshaller()
                        .marshall(checkDomainAvailabilityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CheckDomainAvailabilityResult, JsonUnmarshallerContext> unmarshaller = new CheckDomainAvailabilityResultJsonUnmarshaller();
            JsonResponseHandler<CheckDomainAvailabilityResult> responseHandler = new JsonResponseHandler<CheckDomainAvailabilityResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Checks whether a domain name can be transferred to Amazon Route 53.
     * </p>
     * 
     * @param checkDomainTransferabilityRequest <p>
     *            The CheckDomainTransferability request contains the following
     *            elements.
     *            </p>
     * @return checkDomainTransferabilityResult The response from the
     *         CheckDomainTransferability service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CheckDomainTransferabilityResult checkDomainTransferability(
            CheckDomainTransferabilityRequest checkDomainTransferabilityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(checkDomainTransferabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDomainTransferabilityRequest> request = null;
        Response<CheckDomainTransferabilityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDomainTransferabilityRequestMarshaller()
                        .marshall(checkDomainTransferabilityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CheckDomainTransferabilityResult, JsonUnmarshallerContext> unmarshaller = new CheckDomainTransferabilityResultJsonUnmarshaller();
            JsonResponseHandler<CheckDomainTransferabilityResult> responseHandler = new JsonResponseHandler<CheckDomainTransferabilityResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation deletes the specified tags for a domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param deleteTagsForDomainRequest <p>
     *            The DeleteTagsForDomainRequest includes the following
     *            elements.
     *            </p>
     * @return deleteTagsForDomainResult The response from the
     *         DeleteTagsForDomain service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteTagsForDomainResult deleteTagsForDomain(
            DeleteTagsForDomainRequest deleteTagsForDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsForDomainRequest> request = null;
        Response<DeleteTagsForDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsForDomainRequestMarshaller()
                        .marshall(deleteTagsForDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTagsForDomainResult, JsonUnmarshallerContext> unmarshaller = new DeleteTagsForDomainResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTagsForDomainResult> responseHandler = new JsonResponseHandler<DeleteTagsForDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for the
     * specified domain.
     * </p>
     * 
     * @param disableDomainAutoRenewRequest
     * @return disableDomainAutoRenewResult The response from the
     *         DisableDomainAutoRenew service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisableDomainAutoRenewResult disableDomainAutoRenew(
            DisableDomainAutoRenewRequest disableDomainAutoRenewRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainAutoRenewRequest> request = null;
        Response<DisableDomainAutoRenewResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainAutoRenewRequestMarshaller()
                        .marshall(disableDomainAutoRenewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableDomainAutoRenewResult, JsonUnmarshallerContext> unmarshaller = new DisableDomainAutoRenewResultJsonUnmarshaller();
            JsonResponseHandler<DisableDomainAutoRenewResult> responseHandler = new JsonResponseHandler<DisableDomainAutoRenewResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to allow domain transfers.
     * We recommend you refrain from performing this action unless you intend to
     * transfer the domain to a different registrar. Successful submission
     * returns an operation ID that you can use to track the progress and
     * completion of the action. If the request is not completed successfully,
     * the domain registrant will be notified by email.
     * </p>
     * 
     * @param disableDomainTransferLockRequest <p>
     *            The DisableDomainTransferLock request includes the following
     *            element.
     *            </p>
     * @return disableDomainTransferLockResult The response from the
     *         DisableDomainTransferLock service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisableDomainTransferLockResult disableDomainTransferLock(
            DisableDomainTransferLockRequest disableDomainTransferLockRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainTransferLockRequest> request = null;
        Response<DisableDomainTransferLockResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainTransferLockRequestMarshaller()
                        .marshall(disableDomainTransferLockRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisableDomainTransferLockResult, JsonUnmarshallerContext> unmarshaller = new DisableDomainTransferLockResultJsonUnmarshaller();
            JsonResponseHandler<DisableDomainTransferLockResult> responseHandler = new JsonResponseHandler<DisableDomainTransferLockResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the
     * specified domain before the domain registration expires. The cost of
     * renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD. For a
     * list of TLDs and their renewal policies, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains That You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. Route 53 requires that you renew before the
     * end of the renewal period so we can complete processing before the
     * deadline.
     * </p>
     * 
     * @param enableDomainAutoRenewRequest
     * @return enableDomainAutoRenewResult The response from the
     *         EnableDomainAutoRenew service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws TLDRulesViolationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public EnableDomainAutoRenewResult enableDomainAutoRenew(
            EnableDomainAutoRenewRequest enableDomainAutoRenewRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainAutoRenewRequest> request = null;
        Response<EnableDomainAutoRenewResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainAutoRenewRequestMarshaller()
                        .marshall(enableDomainAutoRenewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableDomainAutoRenewResult, JsonUnmarshallerContext> unmarshaller = new EnableDomainAutoRenewResultJsonUnmarshaller();
            JsonResponseHandler<EnableDomainAutoRenewResult> responseHandler = new JsonResponseHandler<EnableDomainAutoRenewResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can use
     * to track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param enableDomainTransferLockRequest <p>
     *            A request to set the transfer lock for the specified domain.
     *            </p>
     * @return enableDomainTransferLockResult The response from the
     *         EnableDomainTransferLock service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public EnableDomainTransferLockResult enableDomainTransferLock(
            EnableDomainTransferLockRequest enableDomainTransferLockRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainTransferLockRequest> request = null;
        Response<EnableDomainTransferLockResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainTransferLockRequestMarshaller()
                        .marshall(enableDomainTransferLockRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<EnableDomainTransferLockResult, JsonUnmarshallerContext> unmarshaller = new EnableDomainTransferLockResultJsonUnmarshaller();
            JsonResponseHandler<EnableDomainTransferLockResult> responseHandler = new JsonResponseHandler<EnableDomainTransferLockResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * For operations that require confirmation that the email address for the
     * registrant contact is valid, such as registering a new domain, this
     * operation returns information about whether the registrant contact has
     * responded.
     * </p>
     * <p>
     * If you want us to resend the email, use the
     * <code>ResendContactReachabilityEmail</code> operation.
     * </p>
     * 
     * @param getContactReachabilityStatusRequest
     * @return getContactReachabilityStatusResult The response from the
     *         GetContactReachabilityStatus service method, as returned by
     *         Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetContactReachabilityStatusResult getContactReachabilityStatus(
            GetContactReachabilityStatusRequest getContactReachabilityStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getContactReachabilityStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactReachabilityStatusRequest> request = null;
        Response<GetContactReachabilityStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactReachabilityStatusRequestMarshaller()
                        .marshall(getContactReachabilityStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetContactReachabilityStatusResult, JsonUnmarshallerContext> unmarshaller = new GetContactReachabilityStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetContactReachabilityStatusResult> responseHandler = new JsonResponseHandler<GetContactReachabilityStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns detailed information about a specified domain that
     * is associated with the current AWS account. Contact information for the
     * domain is also returned as part of the output.
     * </p>
     * 
     * @param getDomainDetailRequest <p>
     *            The GetDomainDetail request includes the following element.
     *            </p>
     * @return getDomainDetailResult The response from the GetDomainDetail
     *         service method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDomainDetailResult getDomainDetail(GetDomainDetailRequest getDomainDetailRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainDetailRequest> request = null;
        Response<GetDomainDetailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainDetailRequestMarshaller().marshall(getDomainDetailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainDetailResult, JsonUnmarshallerContext> unmarshaller = new GetDomainDetailResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainDetailResult> responseHandler = new JsonResponseHandler<GetDomainDetailResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The GetDomainSuggestions operation returns a list of suggested domain
     * names.
     * </p>
     * 
     * @param getDomainSuggestionsRequest
     * @return getDomainSuggestionsResult The response from the
     *         GetDomainSuggestions service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDomainSuggestionsResult getDomainSuggestions(
            GetDomainSuggestionsRequest getDomainSuggestionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainSuggestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainSuggestionsRequest> request = null;
        Response<GetDomainSuggestionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainSuggestionsRequestMarshaller()
                        .marshall(getDomainSuggestionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainSuggestionsResult, JsonUnmarshallerContext> unmarshaller = new GetDomainSuggestionsResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainSuggestionsResult> responseHandler = new JsonResponseHandler<GetDomainSuggestionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     * 
     * @param getOperationDetailRequest <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *            >GetOperationDetail</a> request includes the following
     *            element.
     *            </p>
     * @return getOperationDetailResult The response from the GetOperationDetail
     *         service method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetOperationDetailResult getOperationDetail(
            GetOperationDetailRequest getOperationDetailRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOperationDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationDetailRequest> request = null;
        Response<GetOperationDetailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationDetailRequestMarshaller()
                        .marshall(getOperationDetailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOperationDetailResult, JsonUnmarshallerContext> unmarshaller = new GetOperationDetailResultJsonUnmarshaller();
            JsonResponseHandler<GetOperationDetailResult> responseHandler = new JsonResponseHandler<GetOperationDetailResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon Route
     * 53 for the current AWS account.
     * </p>
     * 
     * @param listDomainsRequest <p>
     *            The ListDomains request includes the following elements.
     *            </p>
     * @return listDomainsResult The response from the ListDomains service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller().marshall(listDomainsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDomainsResult, JsonUnmarshallerContext> unmarshaller = new ListDomainsResultJsonUnmarshaller();
            JsonResponseHandler<ListDomainsResult> responseHandler = new JsonResponseHandler<ListDomainsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all of the operations that return an operation
     * ID and that have ever been performed on domains that were registered by
     * the current account.
     * </p>
     * 
     * @param listOperationsRequest <p>
     *            The ListOperations request includes the following elements.
     *            </p>
     * @return listOperationsResult The response from the ListOperations service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * This operation returns all of the tags that are associated with the
     * specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param listTagsForDomainRequest <p>
     *            The ListTagsForDomainRequest includes the following elements.
     *            </p>
     * @return listTagsForDomainResult The response from the ListTagsForDomain
     *         service method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTagsForDomainResult listTagsForDomain(
            ListTagsForDomainRequest listTagsForDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForDomainRequest> request = null;
        Response<ListTagsForDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForDomainRequestMarshaller()
                        .marshall(listTagsForDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForDomainResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForDomainResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForDomainResult> responseHandler = new JsonResponseHandler<ListTagsForDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation registers a domain. Domains are registered either by
     * Amazon Registrar (for .com, .net, and .org domains) or by our registrar
     * associate, Gandi (for all other domains). For some top-level domains
     * (TLDs), this operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a Route 53 hosted zone that has the same name as the domain.
     * Route 53 assigns four name servers to your hosted zone and automatically
     * updates your domain registration with the names of these name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enables autorenew, so your domain registration will renew automatically
     * each year. We'll notify you in advance of the renewal date so you can
     * choose whether to renew the registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optionally enables privacy protection, so WHOIS queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you don't enable privacy protection, WHOIS queries return the information
     * that you entered for the registrant, admin, and tech contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If registration is successful, returns an operation ID that you can use
     * to track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant is notified by email.
     * </p>
     * </li>
     * <li>
     * <p>
     * Charges your AWS account an amount based on the top-level domain. For
     * more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerDomainRequest <p>
     *            The RegisterDomain request includes the following elements.
     *            </p>
     * @return registerDomainResult The response from the RegisterDomain service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RegisterDomainResult registerDomain(RegisterDomainRequest registerDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDomainRequest> request = null;
        Response<RegisterDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDomainRequestMarshaller().marshall(registerDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterDomainResult, JsonUnmarshallerContext> unmarshaller = new RegisterDomainResultJsonUnmarshaller();
            JsonResponseHandler<RegisterDomainResult> responseHandler = new JsonResponseHandler<RegisterDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Rejects the transfer of a domain from another AWS account to the current
     * AWS account. You initiate a transfer between AWS accounts using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param rejectDomainTransferFromAnotherAwsAccountRequest <p>
     *            The RejectDomainTransferFromAnotherAwsAccount request includes
     *            the following element.
     *            </p>
     * @return rejectDomainTransferFromAnotherAwsAccountResult The response from
     *         the RejectDomainTransferFromAnotherAwsAccount service method, as
     *         returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RejectDomainTransferFromAnotherAwsAccountResult rejectDomainTransferFromAnotherAwsAccount(
            RejectDomainTransferFromAnotherAwsAccountRequest rejectDomainTransferFromAnotherAwsAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rejectDomainTransferFromAnotherAwsAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectDomainTransferFromAnotherAwsAccountRequest> request = null;
        Response<RejectDomainTransferFromAnotherAwsAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectDomainTransferFromAnotherAwsAccountRequestMarshaller()
                        .marshall(rejectDomainTransferFromAnotherAwsAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RejectDomainTransferFromAnotherAwsAccountResult, JsonUnmarshallerContext> unmarshaller = new RejectDomainTransferFromAnotherAwsAccountResultJsonUnmarshaller();
            JsonResponseHandler<RejectDomainTransferFromAnotherAwsAccountResult> responseHandler = new JsonResponseHandler<RejectDomainTransferFromAnotherAwsAccountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation renews a domain for the specified number of years. The
     * cost of renewing your domain is billed to your AWS account.
     * </p>
     * <p>
     * We recommend that you renew your domain several weeks before the
     * expiration date. Some TLD registries delete domains before the expiration
     * date if you haven't renewed far enough in advance. For more information
     * about renewing domain registration, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-renew.html"
     * >Renewing Registration for a Domain</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * 
     * @param renewDomainRequest <p>
     *            A <code>RenewDomain</code> request includes the number of
     *            years that you want to renew for and the current expiration
     *            year.
     *            </p>
     * @return renewDomainResult The response from the RenewDomain service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RenewDomainResult renewDomain(RenewDomainRequest renewDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(renewDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RenewDomainRequest> request = null;
        Response<RenewDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RenewDomainRequestMarshaller().marshall(renewDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RenewDomainResult, JsonUnmarshallerContext> unmarshaller = new RenewDomainResultJsonUnmarshaller();
            JsonResponseHandler<RenewDomainResult> responseHandler = new JsonResponseHandler<RenewDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * For operations that require confirmation that the email address for the
     * registrant contact is valid, such as registering a new domain, this
     * operation resends the confirmation email to the current email address for
     * the registrant contact.
     * </p>
     * 
     * @param resendContactReachabilityEmailRequest
     * @return resendContactReachabilityEmailResult The response from the
     *         ResendContactReachabilityEmail service method, as returned by
     *         Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ResendContactReachabilityEmailResult resendContactReachabilityEmail(
            ResendContactReachabilityEmailRequest resendContactReachabilityEmailRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resendContactReachabilityEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendContactReachabilityEmailRequest> request = null;
        Response<ResendContactReachabilityEmailResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendContactReachabilityEmailRequestMarshaller()
                        .marshall(resendContactReachabilityEmailRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResendContactReachabilityEmailResult, JsonUnmarshallerContext> unmarshaller = new ResendContactReachabilityEmailResultJsonUnmarshaller();
            JsonResponseHandler<ResendContactReachabilityEmailResult> responseHandler = new JsonResponseHandler<ResendContactReachabilityEmailResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a domain
     * to another registrar, you provide this value to the new registrar.
     * </p>
     * 
     * @param retrieveDomainAuthCodeRequest <p>
     *            A request for the authorization code for the specified domain.
     *            To transfer a domain to another registrar, you provide this
     *            value to the new registrar.
     *            </p>
     * @return retrieveDomainAuthCodeResult The response from the
     *         RetrieveDomainAuthCode service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RetrieveDomainAuthCodeResult retrieveDomainAuthCode(
            RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(retrieveDomainAuthCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveDomainAuthCodeRequest> request = null;
        Response<RetrieveDomainAuthCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveDomainAuthCodeRequestMarshaller()
                        .marshall(retrieveDomainAuthCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RetrieveDomainAuthCodeResult, JsonUnmarshallerContext> unmarshaller = new RetrieveDomainAuthCodeResultJsonUnmarshaller();
            JsonResponseHandler<RetrieveDomainAuthCodeResult> responseHandler = new JsonResponseHandler<RetrieveDomainAuthCodeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Transfers a domain from another registrar to Amazon Route 53. When the
     * transfer is complete, the domain is registered either with Amazon
     * Registrar (for .com, .net, and .org domains) or with our registrar
     * associate, Gandi (for all other TLDs).
     * </p>
     * <p>
     * For more information about transferring domains, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For transfer requirements, a detailed procedure, and information about
     * viewing the status of a domain that you're transferring to Route 53, see
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html"
     * >Transferring Registration for a Domain to Amazon Route 53</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about how to transfer a domain from one AWS account to
     * another, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about how to transfer a domain to another domain
     * registrar, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-from-route-53.html"
     * >Transferring a Domain from Amazon Route 53 to Another Registrar</a> in
     * the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the
     * domain, we highly recommend that you transfer your DNS service to Route
     * 53 or to another DNS service provider before you transfer your
     * registration. Some registrars provide free DNS service when you purchase
     * a domain registration. When you transfer the registration, the previous
     * registrar will not renew your domain registration and could end your DNS
     * service at any time.
     * </p>
     * <important>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the
     * domain and you don't transfer DNS service to another provider, your
     * website, email, and the web applications associated with the domain might
     * become unavailable.
     * </p>
     * </important>
     * <p>
     * If the transfer is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * transfer doesn't complete successfully, the domain registrant will be
     * notified by email.
     * </p>
     * 
     * @param transferDomainRequest <p>
     *            The TransferDomain request includes the following elements.
     *            </p>
     * @return transferDomainResult The response from the TransferDomain service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public TransferDomainResult transferDomain(TransferDomainRequest transferDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(transferDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferDomainRequest> request = null;
        Response<TransferDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferDomainRequestMarshaller().marshall(transferDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TransferDomainResult, JsonUnmarshallerContext> unmarshaller = new TransferDomainResultJsonUnmarshaller();
            JsonResponseHandler<TransferDomainResult> responseHandler = new JsonResponseHandler<TransferDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Transfers a domain from the current AWS account to another AWS account.
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The AWS account that you're transferring the domain to must accept the
     * transfer. If the other account doesn't accept the transfer within 3 days,
     * we cancel the transfer. See <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can cancel the transfer before the other account accepts it. See <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_CancelDomainTransferToAnotherAwsAccount.html"
     * >CancelDomainTransferToAnotherAwsAccount</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other account can reject the transfer. See <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_RejectDomainTransferFromAnotherAwsAccount.html"
     * >RejectDomainTransferFromAnotherAwsAccount</a>.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you transfer a domain from one AWS account to another, Route 53
     * doesn't transfer the hosted zone that is associated with the domain. DNS
     * resolution isn't affected if the domain and the hosted zone are owned by
     * separate accounts, so transferring the hosted zone is optional. For
     * information about transferring the hosted zone to another AWS account,
     * see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/hosted-zones-migrating.html"
     * >Migrating a Hosted Zone to a Different AWS Account</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param transferDomainToAnotherAwsAccountRequest <p>
     *            The TransferDomainToAnotherAwsAccount request includes the
     *            following elements.
     *            </p>
     * @return transferDomainToAnotherAwsAccountResult The response from the
     *         TransferDomainToAnotherAwsAccount service method, as returned by
     *         Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws DuplicateRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public TransferDomainToAnotherAwsAccountResult transferDomainToAnotherAwsAccount(
            TransferDomainToAnotherAwsAccountRequest transferDomainToAnotherAwsAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(transferDomainToAnotherAwsAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferDomainToAnotherAwsAccountRequest> request = null;
        Response<TransferDomainToAnotherAwsAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferDomainToAnotherAwsAccountRequestMarshaller()
                        .marshall(transferDomainToAnotherAwsAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TransferDomainToAnotherAwsAccountResult, JsonUnmarshallerContext> unmarshaller = new TransferDomainToAnotherAwsAccountResultJsonUnmarshaller();
            JsonResponseHandler<TransferDomainToAnotherAwsAccountResult> responseHandler = new JsonResponseHandler<TransferDomainToAnotherAwsAccountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation updates the contact information for a particular domain.
     * You must specify information for at least one contact: registrant,
     * administrator, or technical.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     * 
     * @param updateDomainContactRequest <p>
     *            The UpdateDomainContact request includes the following
     *            elements.
     *            </p>
     * @return updateDomainContactResult The response from the
     *         UpdateDomainContact service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDomainContactResult updateDomainContact(
            UpdateDomainContactRequest updateDomainContactRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactRequest> request = null;
        Response<UpdateDomainContactResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactRequestMarshaller()
                        .marshall(updateDomainContactRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainContactResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainContactResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainContactResult> responseHandler = new JsonResponseHandler<UpdateDomainContactResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation updates the specified domain contact's privacy setting.
     * When privacy protection is enabled, contact information such as email
     * address is replaced either with contact information for Amazon Registrar
     * (for .com, .net, and .org domains) or with contact information for our
     * registrar associate, Gandi.
     * </p>
     * <p>
     * This operation affects only the contact information for the specified
     * contact type (registrant, administrator, or tech). If the request
     * succeeds, Amazon Route 53 returns an operation ID that you can use with
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to track the progress and completion of the
     * action. If the request doesn't complete successfully, the domain
     * registrant will be notified by email.
     * </p>
     * <important>
     * <p>
     * By disabling the privacy service via API, you consent to the publication
     * of the contact information provided for this domain via the public WHOIS
     * database. You certify that you are the registrant of this domain name and
     * have the authority to make this decision. You may withdraw your consent
     * at any time by enabling privacy protection using either
     * <code>UpdateDomainContactPrivacy</code> or the Route 53 console. Enabling
     * privacy protection removes the contact information provided for this
     * domain from the WHOIS database. For more information on our privacy
     * practices, see <a
     * href="https://aws.amazon.com/privacy/">https://aws.amazon
     * .com/privacy/</a>.
     * </p>
     * </important>
     * 
     * @param updateDomainContactPrivacyRequest <p>
     *            The UpdateDomainContactPrivacy request includes the following
     *            elements.
     *            </p>
     * @return updateDomainContactPrivacyResult The response from the
     *         UpdateDomainContactPrivacy service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDomainContactPrivacyResult updateDomainContactPrivacy(
            UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainContactPrivacyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactPrivacyRequest> request = null;
        Response<UpdateDomainContactPrivacyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactPrivacyRequestMarshaller()
                        .marshall(updateDomainContactPrivacyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainContactPrivacyResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainContactPrivacyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainContactPrivacyResult> responseHandler = new JsonResponseHandler<UpdateDomainContactPrivacyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation replaces the current set of name servers for the domain
     * with the specified set of name servers. If you use Amazon Route 53 as
     * your DNS service, specify the four name servers in the delegation set for
     * the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can use to
     * track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainNameserversRequest <p>
     *            Replaces the current set of name servers for the domain with
     *            the specified set of name servers. If you use Amazon Route 53
     *            as your DNS service, specify the four name servers in the
     *            delegation set for the hosted zone for the domain.
     *            </p>
     *            <p>
     *            If successful, this operation returns an operation ID that you
     *            can use to track the progress and completion of the action. If
     *            the request is not completed successfully, the domain
     *            registrant will be notified by email.
     *            </p>
     * @return updateDomainNameserversResult The response from the
     *         UpdateDomainNameservers service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDomainNameserversResult updateDomainNameservers(
            UpdateDomainNameserversRequest updateDomainNameserversRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainNameserversRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainNameserversRequest> request = null;
        Response<UpdateDomainNameserversResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainNameserversRequestMarshaller()
                        .marshall(updateDomainNameserversRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainNameserversResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainNameserversResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainNameserversResult> responseHandler = new JsonResponseHandler<UpdateDomainNameserversResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * This operation adds or updates tags for a specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param updateTagsForDomainRequest <p>
     *            The UpdateTagsForDomainRequest includes the following
     *            elements.
     *            </p>
     * @return updateTagsForDomainResult The response from the
     *         UpdateTagsForDomain service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateTagsForDomainResult updateTagsForDomain(
            UpdateTagsForDomainRequest updateTagsForDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTagsForDomainRequest> request = null;
        Response<UpdateTagsForDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTagsForDomainRequestMarshaller()
                        .marshall(updateTagsForDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTagsForDomainResult, JsonUnmarshallerContext> unmarshaller = new UpdateTagsForDomainResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTagsForDomainResult> responseHandler = new JsonResponseHandler<UpdateTagsForDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all the domain-related billing records for the current AWS
     * account for a specified period
     * </p>
     * 
     * @param viewBillingRequest <p>
     *            The ViewBilling request includes the following elements.
     *            </p>
     * @return viewBillingResult The response from the ViewBilling service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ViewBillingResult viewBilling(ViewBillingRequest viewBillingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(viewBillingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ViewBillingRequest> request = null;
        Response<ViewBillingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ViewBillingRequestMarshaller().marshall(viewBillingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ViewBillingResult, JsonUnmarshallerContext> unmarshaller = new ViewBillingResultJsonUnmarshaller();
            JsonResponseHandler<ViewBillingResult> responseHandler = new JsonResponseHandler<ViewBillingResult>(
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
