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

package com.amazonaws.services.awscostexplorerservice;

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

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.services.awscostexplorerservice.model.transform.*;

/**
 * Client for accessing AWS Cost Explorer Service. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * The Cost Explorer API enables you to programmatically query your cost and
 * usage data. You can query for aggregated data such as total monthly costs or
 * total daily usage. You can also query for granular data, such as the number
 * of daily write operations for Amazon DynamoDB database tables in your
 * production environment.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The Cost Explorer API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>https://ce.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs associated with the Cost Explorer API, see <a
 * href="http://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management
 * Pricing</a>.
 * </p>
 */
public class AWSCostExplorerServiceClient extends AmazonWebServiceClient implements
        AWSCostExplorerService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Cost Explorer Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService. A credentials provider chain will be used that
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
    public AWSCostExplorerServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService. A credentials provider chain will be used that
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
     *            how this client connects to AWSCostExplorerService (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSCostExplorerServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService using the specified AWS account credentials.
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
     *         AWSCostExplorerServiceClient client = new AWSCostExplorerServiceClient(AWSMobileClient
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
    public AWSCostExplorerServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService using the specified AWS account credentials and
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
     *         AWSCostExplorerServiceClient client = new AWSCostExplorerServiceClient(AWSMobileClient
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
     *            how this client connects to AWSCostExplorerService (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSCostExplorerServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService using the specified AWS account credentials
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
     *         AWSCostExplorerServiceClient client = new AWSCostExplorerServiceClient(AWSMobileClient
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
    public AWSCostExplorerServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService using the specified AWS account credentials
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
     *         AWSCostExplorerServiceClient client = new AWSCostExplorerServiceClient(AWSMobileClient
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
     *            how this client connects to AWSCostExplorerService (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSCostExplorerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCostExplorerService (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSCostExplorerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCostExplorerService using the specified AWS account credentials
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
     *         AWSCostExplorerServiceClient client = new AWSCostExplorerServiceClient(AWSMobileClient
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
     *            how this client connects to AWSCostExplorerService (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSCostExplorerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BillExpirationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DataUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RequestChangedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnresolvableUsageUnitExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("ce.us-east-1.amazonaws.com");
        this.endpointPrefix = "ce";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awscostexplorerservice/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awscostexplorerservice/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a new Cost Category with the requested name and rules.
     * </p>
     * 
     * @param createCostCategoryDefinitionRequest
     * @return createCostCategoryDefinitionResult The response from the
     *         CreateCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ServiceQuotaExceededException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateCostCategoryDefinitionResult createCostCategoryDefinition(
            CreateCostCategoryDefinitionRequest createCostCategoryDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCostCategoryDefinitionRequest> request = null;
        Response<CreateCostCategoryDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCostCategoryDefinitionRequestMarshaller()
                        .marshall(createCostCategoryDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCostCategoryDefinitionResult, JsonUnmarshallerContext> unmarshaller = new CreateCostCategoryDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<CreateCostCategoryDefinitionResult> responseHandler = new JsonResponseHandler<CreateCostCategoryDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a Cost Category. Expenses from this month going forward will no
     * longer be categorized with this Cost Category.
     * </p>
     * 
     * @param deleteCostCategoryDefinitionRequest
     * @return deleteCostCategoryDefinitionResult The response from the
     *         DeleteCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteCostCategoryDefinitionResult deleteCostCategoryDefinition(
            DeleteCostCategoryDefinitionRequest deleteCostCategoryDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCostCategoryDefinitionRequest> request = null;
        Response<DeleteCostCategoryDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCostCategoryDefinitionRequestMarshaller()
                        .marshall(deleteCostCategoryDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCostCategoryDefinitionResult, JsonUnmarshallerContext> unmarshaller = new DeleteCostCategoryDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCostCategoryDefinitionResult> responseHandler = new JsonResponseHandler<DeleteCostCategoryDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the name, ARN, rules, definition, and effective dates of a Cost
     * Category that's defined in the account.
     * </p>
     * <p>
     * You have the option to use <code>EffectiveOn</code> to return a Cost
     * Category that is active on a specific date. If there is no
     * <code>EffectiveOn</code> specified, you’ll see a Cost Category that is
     * effective on the current date. If Cost Category is still effective,
     * <code>EffectiveEnd</code> is omitted in the response.
     * </p>
     * 
     * @param describeCostCategoryDefinitionRequest
     * @return describeCostCategoryDefinitionResult The response from the
     *         DescribeCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeCostCategoryDefinitionResult describeCostCategoryDefinition(
            DescribeCostCategoryDefinitionRequest describeCostCategoryDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCostCategoryDefinitionRequest> request = null;
        Response<DescribeCostCategoryDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCostCategoryDefinitionRequestMarshaller()
                        .marshall(describeCostCategoryDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCostCategoryDefinitionResult, JsonUnmarshallerContext> unmarshaller = new DescribeCostCategoryDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCostCategoryDefinitionResult> responseHandler = new JsonResponseHandler<DescribeCostCategoryDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves cost and usage metrics for your account. You can specify which
     * cost and usage-related metric, such as <code>BlendedCosts</code> or
     * <code>UsageQuantity</code>, that you want the request to return. You can
     * also filter and group your data by various dimensions, such as
     * <code>SERVICE</code> or <code>AZ</code>, in a specific time range. For a
     * complete list of valid dimensions, see the <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Master accounts in an organization in
     * AWS Organizations have access to all member accounts.
     * </p>
     * 
     * @param getCostAndUsageRequest
     * @return getCostAndUsageResult The response from the GetCostAndUsage
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetCostAndUsageResult getCostAndUsage(GetCostAndUsageRequest getCostAndUsageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCostAndUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostAndUsageRequest> request = null;
        Response<GetCostAndUsageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostAndUsageRequestMarshaller().marshall(getCostAndUsageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCostAndUsageResult, JsonUnmarshallerContext> unmarshaller = new GetCostAndUsageResultJsonUnmarshaller();
            JsonResponseHandler<GetCostAndUsageResult> responseHandler = new JsonResponseHandler<GetCostAndUsageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves cost and usage metrics with resources for your account. You can
     * specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want
     * the request to return. You can also filter and group your data by various
     * dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a
     * specific time range. For a complete list of valid dimensions, see the <a
     * href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Master accounts in an organization in
     * AWS Organizations have access to all member accounts. This API is
     * currently available for the Amazon Elastic Compute Cloud – Compute
     * service only.
     * </p>
     * <note>
     * <p>
     * This is an opt-in only feature. You can enable this feature from the Cost
     * Explorer Settings page. For information on how to access the Settings
     * page, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-access.html"
     * >Controlling Access for Cost Explorer</a> in the <i>AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getCostAndUsageWithResourcesRequest
     * @return getCostAndUsageWithResourcesResult The response from the
     *         GetCostAndUsageWithResources service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws DataUnavailableException
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetCostAndUsageWithResourcesResult getCostAndUsageWithResources(
            GetCostAndUsageWithResourcesRequest getCostAndUsageWithResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCostAndUsageWithResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostAndUsageWithResourcesRequest> request = null;
        Response<GetCostAndUsageWithResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostAndUsageWithResourcesRequestMarshaller()
                        .marshall(getCostAndUsageWithResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCostAndUsageWithResourcesResult, JsonUnmarshallerContext> unmarshaller = new GetCostAndUsageWithResourcesResultJsonUnmarshaller();
            JsonResponseHandler<GetCostAndUsageWithResourcesResult> responseHandler = new JsonResponseHandler<GetCostAndUsageWithResourcesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you
     * will spend over the forecast time period that you select, based on your
     * past costs.
     * </p>
     * 
     * @param getCostForecastRequest
     * @return getCostForecastResult The response from the GetCostForecast
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetCostForecastResult getCostForecast(GetCostForecastRequest getCostForecastRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCostForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostForecastRequest> request = null;
        Response<GetCostForecastResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostForecastRequestMarshaller().marshall(getCostForecastRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCostForecastResult, JsonUnmarshallerContext> unmarshaller = new GetCostForecastResultJsonUnmarshaller();
            JsonResponseHandler<GetCostForecastResult> responseHandler = new JsonResponseHandler<GetCostForecastResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves all available filter values for a specified filter over a
     * period of time. You can search the dimension values for an arbitrary
     * string.
     * </p>
     * 
     * @param getDimensionValuesRequest
     * @return getDimensionValuesResult The response from the GetDimensionValues
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetDimensionValuesResult getDimensionValues(
            GetDimensionValuesRequest getDimensionValuesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDimensionValuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDimensionValuesRequest> request = null;
        Response<GetDimensionValuesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDimensionValuesRequestMarshaller()
                        .marshall(getDimensionValuesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDimensionValuesResult, JsonUnmarshallerContext> unmarshaller = new GetDimensionValuesResultJsonUnmarshaller();
            JsonResponseHandler<GetDimensionValuesResult> responseHandler = new JsonResponseHandler<GetDimensionValuesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the reservation coverage for your account. This enables you to
     * see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache,
     * Amazon Relational Database Service, or Amazon Redshift usage is covered
     * by a reservation. An organization's master account can see the coverage
     * of the associated member accounts. This supports dimensions, Cost
     * Categories, and nested expressions. For any time period, you can filter
     * data about reservation usage by the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * To determine valid values for a dimension, use the
     * <code>GetDimensionValues</code> operation.
     * </p>
     * 
     * @param getReservationCoverageRequest <p>
     *            You can use the following request parameters to query for how
     *            much of your instance usage a reservation covered.
     *            </p>
     * @return getReservationCoverageResult The response from the
     *         GetReservationCoverage service method, as returned by AWS Cost
     *         Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetReservationCoverageResult getReservationCoverage(
            GetReservationCoverageRequest getReservationCoverageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getReservationCoverageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservationCoverageRequest> request = null;
        Response<GetReservationCoverageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReservationCoverageRequestMarshaller()
                        .marshall(getReservationCoverageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetReservationCoverageResult, JsonUnmarshallerContext> unmarshaller = new GetReservationCoverageResultJsonUnmarshaller();
            JsonResponseHandler<GetReservationCoverageResult> responseHandler = new JsonResponseHandler<GetReservationCoverageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets recommendations for which reservations to purchase. These
     * recommendations could help you reduce your costs. Reservations provide a
     * discounted hourly rate (up to 75%) compared to On-Demand pricing.
     * </p>
     * <p>
     * AWS generates your recommendations by identifying your On-Demand usage
     * during a specific time period and collecting your usage into categories
     * that are eligible for a reservation. After AWS has these categories, it
     * simulates every combination of reservations in each category of usage to
     * identify the best number of each type of RI to purchase to maximize your
     * estimated savings.
     * </p>
     * <p>
     * For example, AWS automatically aggregates your Amazon EC2 Linux, shared
     * tenancy, and c4 family usage in the US West (Oregon) Region and
     * recommends that you buy size-flexible regional reservations to apply to
     * the c4 family usage. AWS recommends the smallest size instance in an
     * instance family. This makes it easier to purchase a size-flexible RI. AWS
     * also shows the equal number of normalized units so that you can purchase
     * any instance size that you want. For this example, your RI recommendation
     * would be for <code>c4.large</code> because that is the smallest size
     * instance in the c4 instance family.
     * </p>
     * 
     * @param getReservationPurchaseRecommendationRequest
     * @return getReservationPurchaseRecommendationResult The response from the
     *         GetReservationPurchaseRecommendation service method, as returned
     *         by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetReservationPurchaseRecommendationResult getReservationPurchaseRecommendation(
            GetReservationPurchaseRecommendationRequest getReservationPurchaseRecommendationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getReservationPurchaseRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservationPurchaseRecommendationRequest> request = null;
        Response<GetReservationPurchaseRecommendationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReservationPurchaseRecommendationRequestMarshaller()
                        .marshall(getReservationPurchaseRecommendationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetReservationPurchaseRecommendationResult, JsonUnmarshallerContext> unmarshaller = new GetReservationPurchaseRecommendationResultJsonUnmarshaller();
            JsonResponseHandler<GetReservationPurchaseRecommendationResult> responseHandler = new JsonResponseHandler<GetReservationPurchaseRecommendationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the reservation utilization for your account. Master accounts
     * in an organization have access to member accounts. You can filter data by
     * dimensions in a time period. You can use <code>GetDimensionValues</code>
     * to determine the possible dimension values. Currently, you can group only
     * by <code>SUBSCRIPTION_ID</code>.
     * </p>
     * 
     * @param getReservationUtilizationRequest
     * @return getReservationUtilizationResult The response from the
     *         GetReservationUtilization service method, as returned by AWS Cost
     *         Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetReservationUtilizationResult getReservationUtilization(
            GetReservationUtilizationRequest getReservationUtilizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getReservationUtilizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservationUtilizationRequest> request = null;
        Response<GetReservationUtilizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReservationUtilizationRequestMarshaller()
                        .marshall(getReservationUtilizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetReservationUtilizationResult, JsonUnmarshallerContext> unmarshaller = new GetReservationUtilizationResultJsonUnmarshaller();
            JsonResponseHandler<GetReservationUtilizationResult> responseHandler = new JsonResponseHandler<GetReservationUtilizationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates recommendations that helps you save cost by identifying idle and
     * underutilized Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are generated to either downsize or terminate instances,
     * along with providing savings detail and metrics. For details on
     * calculation and function, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-what-is.html"
     * >Optimizing Your Cost with Rightsizing Recommendations</a>.
     * </p>
     * 
     * @param getRightsizingRecommendationRequest
     * @return getRightsizingRecommendationResult The response from the
     *         GetRightsizingRecommendation service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws LimitExceededException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetRightsizingRecommendationResult getRightsizingRecommendation(
            GetRightsizingRecommendationRequest getRightsizingRecommendationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRightsizingRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRightsizingRecommendationRequest> request = null;
        Response<GetRightsizingRecommendationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRightsizingRecommendationRequestMarshaller()
                        .marshall(getRightsizingRecommendationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRightsizingRecommendationResult, JsonUnmarshallerContext> unmarshaller = new GetRightsizingRecommendationResultJsonUnmarshaller();
            JsonResponseHandler<GetRightsizingRecommendationResult> responseHandler = new JsonResponseHandler<GetRightsizingRecommendationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the Savings Plans covered for your account. This enables you to
     * see how much of your cost is covered by a Savings Plan. An organization’s
     * master account can see the coverage of the associated member accounts.
     * This supports dimensions, Cost Categories, and nested expressions. For
     * any time period, you can filter data for Savings Plans usage with the
     * following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To determine valid values for a dimension, use the
     * <code>GetDimensionValues</code> operation.
     * </p>
     * 
     * @param getSavingsPlansCoverageRequest
     * @return getSavingsPlansCoverageResult The response from the
     *         GetSavingsPlansCoverage service method, as returned by AWS Cost
     *         Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetSavingsPlansCoverageResult getSavingsPlansCoverage(
            GetSavingsPlansCoverageRequest getSavingsPlansCoverageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSavingsPlansCoverageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansCoverageRequest> request = null;
        Response<GetSavingsPlansCoverageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansCoverageRequestMarshaller()
                        .marshall(getSavingsPlansCoverageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSavingsPlansCoverageResult, JsonUnmarshallerContext> unmarshaller = new GetSavingsPlansCoverageResultJsonUnmarshaller();
            JsonResponseHandler<GetSavingsPlansCoverageResult> responseHandler = new JsonResponseHandler<GetSavingsPlansCoverageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves your request parameters, Savings Plan Recommendations Summary
     * and Details.
     * </p>
     * 
     * @param getSavingsPlansPurchaseRecommendationRequest
     * @return getSavingsPlansPurchaseRecommendationResult The response from the
     *         GetSavingsPlansPurchaseRecommendation service method, as returned
     *         by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetSavingsPlansPurchaseRecommendationResult getSavingsPlansPurchaseRecommendation(
            GetSavingsPlansPurchaseRecommendationRequest getSavingsPlansPurchaseRecommendationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSavingsPlansPurchaseRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansPurchaseRecommendationRequest> request = null;
        Response<GetSavingsPlansPurchaseRecommendationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansPurchaseRecommendationRequestMarshaller()
                        .marshall(getSavingsPlansPurchaseRecommendationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSavingsPlansPurchaseRecommendationResult, JsonUnmarshallerContext> unmarshaller = new GetSavingsPlansPurchaseRecommendationResultJsonUnmarshaller();
            JsonResponseHandler<GetSavingsPlansPurchaseRecommendationResult> responseHandler = new JsonResponseHandler<GetSavingsPlansPurchaseRecommendationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the Savings Plans utilization for your account across date
     * ranges with daily or monthly granularity. Master accounts in an
     * organization have access to member accounts. You can use
     * <code>GetDimensionValues</code> in <code>SAVINGS_PLANS</code> to
     * determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * You cannot group by any dimension values for
     * <code>GetSavingsPlansUtilization</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationRequest
     * @return getSavingsPlansUtilizationResult The response from the
     *         GetSavingsPlansUtilization service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetSavingsPlansUtilizationResult getSavingsPlansUtilization(
            GetSavingsPlansUtilizationRequest getSavingsPlansUtilizationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSavingsPlansUtilizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansUtilizationRequest> request = null;
        Response<GetSavingsPlansUtilizationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansUtilizationRequestMarshaller()
                        .marshall(getSavingsPlansUtilizationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSavingsPlansUtilizationResult, JsonUnmarshallerContext> unmarshaller = new GetSavingsPlansUtilizationResultJsonUnmarshaller();
            JsonResponseHandler<GetSavingsPlansUtilizationResult> responseHandler = new JsonResponseHandler<GetSavingsPlansUtilizationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves attribute data along with aggregate utilization and savings
     * data for a given time period. This doesn't support granular or grouped
     * data (daily/monthly) in response. You can't retrieve data by dates in a
     * single response similar to <code>GetSavingsPlanUtilization</code>, but
     * you have the option to make multiple calls to
     * <code>GetSavingsPlanUtilizationDetails</code> by providing individual
     * dates. You can use <code>GetDimensionValues</code> in
     * <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * <code>GetSavingsPlanUtilizationDetails</code> internally groups data by
     * <code>SavingsPlansArn</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationDetailsRequest
     * @return getSavingsPlansUtilizationDetailsResult The response from the
     *         GetSavingsPlansUtilizationDetails service method, as returned by
     *         AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetSavingsPlansUtilizationDetailsResult getSavingsPlansUtilizationDetails(
            GetSavingsPlansUtilizationDetailsRequest getSavingsPlansUtilizationDetailsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSavingsPlansUtilizationDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansUtilizationDetailsRequest> request = null;
        Response<GetSavingsPlansUtilizationDetailsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansUtilizationDetailsRequestMarshaller()
                        .marshall(getSavingsPlansUtilizationDetailsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSavingsPlansUtilizationDetailsResult, JsonUnmarshallerContext> unmarshaller = new GetSavingsPlansUtilizationDetailsResultJsonUnmarshaller();
            JsonResponseHandler<GetSavingsPlansUtilizationDetailsResult> responseHandler = new JsonResponseHandler<GetSavingsPlansUtilizationDetailsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Queries for available tag keys and tag values for a specified period. You
     * can search the tag values for an arbitrary string.
     * </p>
     * 
     * @param getTagsRequest
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws BillExpirationException
     * @throws DataUnavailableException
     * @throws InvalidNextTokenException
     * @throws RequestChangedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetTagsResult getTags(GetTagsRequest getTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagsRequest> request = null;
        Response<GetTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagsRequestMarshaller().marshall(getTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTagsResult, JsonUnmarshallerContext> unmarshaller = new GetTagsResultJsonUnmarshaller();
            JsonResponseHandler<GetTagsResult> responseHandler = new JsonResponseHandler<GetTagsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you
     * will use over the forecast time period that you select, based on your
     * past usage.
     * </p>
     * 
     * @param getUsageForecastRequest
     * @return getUsageForecastResult The response from the GetUsageForecast
     *         service method, as returned by AWS Cost Explorer Service.
     * @throws LimitExceededException
     * @throws DataUnavailableException
     * @throws UnresolvableUsageUnitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetUsageForecastResult getUsageForecast(GetUsageForecastRequest getUsageForecastRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsageForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageForecastRequest> request = null;
        Response<GetUsageForecastResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageForecastRequestMarshaller().marshall(getUsageForecastRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsageForecastResult, JsonUnmarshallerContext> unmarshaller = new GetUsageForecastResultJsonUnmarshaller();
            JsonResponseHandler<GetUsageForecastResult> responseHandler = new JsonResponseHandler<GetUsageForecastResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the name, ARN, <code>NumberOfRules</code> and effective dates of
     * all Cost Categories defined in the account. You have the option to use
     * <code>EffectiveOn</code> to return a list of Cost Categories that were
     * active on a specific date. If there is no <code>EffectiveOn</code>
     * specified, you’ll see Cost Categories that are effective on the current
     * date. If Cost Category is still effective, <code>EffectiveEnd</code> is
     * omitted in the response. <code>ListCostCategoryDefinitions</code>
     * supports pagination. The request can have a <code>MaxResults</code> range
     * up to 100.
     * </p>
     * 
     * @param listCostCategoryDefinitionsRequest
     * @return listCostCategoryDefinitionsResult The response from the
     *         ListCostCategoryDefinitions service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListCostCategoryDefinitionsResult listCostCategoryDefinitions(
            ListCostCategoryDefinitionsRequest listCostCategoryDefinitionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCostCategoryDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCostCategoryDefinitionsRequest> request = null;
        Response<ListCostCategoryDefinitionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCostCategoryDefinitionsRequestMarshaller()
                        .marshall(listCostCategoryDefinitionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCostCategoryDefinitionsResult, JsonUnmarshallerContext> unmarshaller = new ListCostCategoryDefinitionsResultJsonUnmarshaller();
            JsonResponseHandler<ListCostCategoryDefinitionsResult> responseHandler = new JsonResponseHandler<ListCostCategoryDefinitionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an existing Cost Category. Changes made to the Cost Category
     * rules will be used to categorize the current month’s expenses and future
     * expenses. This won’t change categorization for the previous months.
     * </p>
     * 
     * @param updateCostCategoryDefinitionRequest
     * @return updateCostCategoryDefinitionResult The response from the
     *         UpdateCostCategoryDefinition service method, as returned by AWS
     *         Cost Explorer Service.
     * @throws ResourceNotFoundException
     * @throws ServiceQuotaExceededException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Cost Explorer Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateCostCategoryDefinitionResult updateCostCategoryDefinition(
            UpdateCostCategoryDefinitionRequest updateCostCategoryDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCostCategoryDefinitionRequest> request = null;
        Response<UpdateCostCategoryDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCostCategoryDefinitionRequestMarshaller()
                        .marshall(updateCostCategoryDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCostCategoryDefinitionResult, JsonUnmarshallerContext> unmarshaller = new UpdateCostCategoryDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCostCategoryDefinitionResult> responseHandler = new JsonResponseHandler<UpdateCostCategoryDefinitionResult>(
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
