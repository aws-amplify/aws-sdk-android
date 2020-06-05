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

package com.amazonaws.services.personalize;

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

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.services.personalize.model.transform.*;

/**
 * Client for accessing Amazon Personalize. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Personalize is a machine learning service that makes it easy to add
 * individualized recommendations to customers.
 * </p>
 */
public class AmazonPersonalizeClient extends AmazonWebServiceClient implements AmazonPersonalize {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Personalize exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize. A
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
    public AmazonPersonalizeClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize. A
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
     *            how this client connects to AmazonPersonalize (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonPersonalizeClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize
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
     *         AmazonPersonalizeClient client = new AmazonPersonalizeClient(AWSMobileClient.getInstance());
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
    public AmazonPersonalizeClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize
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
     *         AmazonPersonalizeClient client = new AmazonPersonalizeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonPersonalize (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonPersonalizeClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize
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
     *         AmazonPersonalizeClient client = new AmazonPersonalizeClient(AWSMobileClient.getInstance());
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
    public AmazonPersonalizeClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize
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
     *         AmazonPersonalizeClient client = new AmazonPersonalizeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonPersonalize (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonPersonalizeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize
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
     *            how this client connects to AmazonPersonalize (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonPersonalizeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPersonalize
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
     *         AmazonPersonalizeClient client = new AmazonPersonalizeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonPersonalize (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonPersonalizeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("personalize.us-east-1.amazonaws.com");
        this.endpointPrefix = "personalize";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/personalize/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/personalize/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a batch inference job. The operation can handle up to 50 million
     * records and the input file must be in JSON format. For more information,
     * see <a>recommendations-batch</a>.
     * </p>
     * 
     * @param createBatchInferenceJobRequest
     * @return createBatchInferenceJobResult The response from the
     *         CreateBatchInferenceJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBatchInferenceJobResult createBatchInferenceJob(
            CreateBatchInferenceJobRequest createBatchInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBatchInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBatchInferenceJobRequest> request = null;
        Response<CreateBatchInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBatchInferenceJobRequestMarshaller()
                        .marshall(createBatchInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBatchInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new CreateBatchInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateBatchInferenceJobResult> responseHandler = new JsonResponseHandler<CreateBatchInferenceJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a campaign by deploying a solution version. When a client calls
     * the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> and <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetPersonalizedRanking.html"
     * >GetPersonalizedRanking</a> APIs, a campaign is specified in the request.
     * </p>
     * <p>
     * <b>Minimum Provisioned TPS and Auto-Scaling</b>
     * </p>
     * <p>
     * A transaction is a single <code>GetRecommendations</code> or
     * <code>GetPersonalizedRanking</code> call. Transactions per second (TPS)
     * is the throughput and unit of billing for Amazon Personalize. The minimum
     * provisioned TPS (<code>minProvisionedTPS</code>) specifies the baseline
     * throughput provisioned by Amazon Personalize, and thus, the minimum
     * billing charge. If your TPS increases beyond
     * <code>minProvisionedTPS</code>, Amazon Personalize auto-scales the
     * provisioned capacity up and down, but never below
     * <code>minProvisionedTPS</code>, to maintain a 70% utilization. There's a
     * short time delay while the capacity is increased that might cause loss of
     * transactions. It's recommended to start with a low
     * <code>minProvisionedTPS</code>, track your usage using Amazon CloudWatch
     * metrics, and then increase the <code>minProvisionedTPS</code> as
     * necessary.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the campaign status, call <a>DescribeCampaign</a>.
     * </p>
     * <note>
     * <p>
     * Wait until the <code>status</code> of the campaign is <code>ACTIVE</code>
     * before asking the campaign for recommendations.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListCampaigns</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCampaign</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCampaignRequest
     * @return createCampaignResult The response from the CreateCampaign service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCampaignRequest> request = null;
        Response<CreateCampaignResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCampaignRequestMarshaller().marshall(createCampaignRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCampaignResult, JsonUnmarshallerContext> unmarshaller = new CreateCampaignResultJsonUnmarshaller();
            JsonResponseHandler<CreateCampaignResult> responseHandler = new JsonResponseHandler<CreateCampaignResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an empty dataset and adds it to the specified dataset group. Use
     * <a>CreateDatasetImportJob</a> to import your training data to a dataset.
     * </p>
     * <p>
     * There are three types of datasets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each dataset type has an associated schema with required field types.
     * Only the <code>Interactions</code> dataset is required in order to train
     * a model (also referred to as creating a solution).
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset, call <a>DescribeDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListDatasets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDataset</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetRequest
     * @return createDatasetResult The response from the CreateDataset service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetRequest> request = null;
        Response<CreateDatasetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetRequestMarshaller().marshall(createDatasetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDatasetResult, JsonUnmarshallerContext> unmarshaller = new CreateDatasetResultJsonUnmarshaller();
            JsonResponseHandler<CreateDatasetResult> responseHandler = new JsonResponseHandler<CreateDatasetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an empty dataset group. A dataset group contains related datasets
     * that supply data for training a model. A dataset group can contain at
     * most three datasets, one for each type of dataset:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * To train a model (create a solution), a dataset group that contains an
     * <code>Interactions</code> dataset is required. Call <a>CreateDataset</a>
     * to add a dataset to the group.
     * </p>
     * <p>
     * A dataset group can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset group, call <a>DescribeDatasetGroup</a>.
     * If the status shows as CREATE FAILED, the response includes a
     * <code>failureReason</code> key, which describes why the creation failed.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the dataset group is
     * <code>ACTIVE</code> before adding a dataset to the group.
     * </p>
     * </note>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the
     * datasets in the group. If you specify a KMS key, you must also include an
     * AWS Identity and Access Management (IAM) role that has permission to
     * access the key.
     * </p>
     * <p class="title">
     * <b>APIs that require a dataset group ARN in the request</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetGroups</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDatasetGroup</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetGroupRequest
     * @return createDatasetGroupResult The response from the CreateDatasetGroup
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDatasetGroupResult createDatasetGroup(
            CreateDatasetGroupRequest createDatasetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDatasetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetGroupRequest> request = null;
        Response<CreateDatasetGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetGroupRequestMarshaller()
                        .marshall(createDatasetGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDatasetGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateDatasetGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateDatasetGroupResult> responseHandler = new JsonResponseHandler<CreateDatasetGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a job that imports training data from your data source (an Amazon
     * S3 bucket) to an Amazon Personalize dataset. To allow Amazon Personalize
     * to import the training data, you must specify an AWS Identity and Access
     * Management (IAM) role that has permission to read from the data source.
     * </p>
     * <important>
     * <p>
     * The dataset import job replaces any previous data in the dataset.
     * </p>
     * </important>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the import job, call
     * <a>DescribeDatasetImportJob</a>, providing the Amazon Resource Name (ARN)
     * of the dataset import job. The dataset import is complete when the status
     * shows as ACTIVE. If the status shows as CREATE FAILED, the response
     * includes a <code>failureReason</code> key, which describes why the job
     * failed.
     * </p>
     * <note>
     * <p>
     * Importing takes time. You must wait until the status shows as ACTIVE
     * before training a model using the dataset.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetImportJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetImportJob</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetImportJobRequest
     * @return createDatasetImportJobResult The response from the
     *         CreateDatasetImportJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDatasetImportJobResult createDatasetImportJob(
            CreateDatasetImportJobRequest createDatasetImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDatasetImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetImportJobRequest> request = null;
        Response<CreateDatasetImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetImportJobRequestMarshaller()
                        .marshall(createDatasetImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDatasetImportJobResult, JsonUnmarshallerContext> unmarshaller = new CreateDatasetImportJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateDatasetImportJobResult> responseHandler = new JsonResponseHandler<CreateDatasetImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an event tracker that you use when sending event data to the
     * specified dataset group using the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     * >PutEvents</a> API.
     * </p>
     * <p>
     * When Amazon Personalize creates an event tracker, it also creates an
     * <i>event-interactions</i> dataset in the dataset group associated with
     * the event tracker. The event-interactions dataset stores the event data
     * from the <code>PutEvents</code> call. The contents of this dataset are
     * not available to the user.
     * </p>
     * <note>
     * <p>
     * Only one event tracker can be associated with a dataset group. You will
     * get an error if you call <code>CreateEventTracker</code> using the same
     * dataset group as an existing event tracker.
     * </p>
     * </note>
     * <p>
     * When you send event data you include your tracking ID. The tracking ID
     * identifies the customer and authorizes the customer to send the data.
     * </p>
     * <p>
     * The event tracker can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the event tracker, call <a>DescribeEventTracker</a>.
     * </p>
     * <note>
     * <p>
     * The event tracker must be in the ACTIVE state before using the tracking
     * ID.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListEventTrackers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteEventTracker</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventTrackerRequest
     * @return createEventTrackerResult The response from the CreateEventTracker
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateEventTrackerResult createEventTracker(
            CreateEventTrackerRequest createEventTrackerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEventTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventTrackerRequest> request = null;
        Response<CreateEventTrackerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventTrackerRequestMarshaller()
                        .marshall(createEventTrackerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateEventTrackerResult, JsonUnmarshallerContext> unmarshaller = new CreateEventTrackerResultJsonUnmarshaller();
            JsonResponseHandler<CreateEventTrackerResult> responseHandler = new JsonResponseHandler<CreateEventTrackerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a recommendation filter. For more information, see Using Filters
     * with Amazon Personalize.
     * </p>
     * 
     * @param createFilterRequest
     * @return createFilterResult The response from the CreateFilter service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateFilterResult createFilter(CreateFilterRequest createFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFilterRequest> request = null;
        Response<CreateFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFilterRequestMarshaller().marshall(createFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateFilterResult, JsonUnmarshallerContext> unmarshaller = new CreateFilterResultJsonUnmarshaller();
            JsonResponseHandler<CreateFilterResult> responseHandler = new JsonResponseHandler<CreateFilterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an Amazon Personalize schema from the specified schema string.
     * The schema you create must be in Avro JSON format.
     * </p>
     * <p>
     * Amazon Personalize recognizes three schema variants. Each schema is
     * associated with a dataset type and has a set of required field and
     * keywords. You specify a schema when you call <a>CreateDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSchemas</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSchema</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSchema</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @return createSchemaResult The response from the CreateSchema service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSchemaRequest> request = null;
        Response<CreateSchemaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSchemaRequestMarshaller().marshall(createSchemaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSchemaResult, JsonUnmarshallerContext> unmarshaller = new CreateSchemaResultJsonUnmarshaller();
            JsonResponseHandler<CreateSchemaResult> responseHandler = new JsonResponseHandler<CreateSchemaResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates the configuration for training a model. A trained model is known
     * as a solution. After the configuration is created, you train the model
     * (create a solution) by calling the <a>CreateSolutionVersion</a>
     * operation. Every time you call <code>CreateSolutionVersion</code>, a new
     * version of the solution is created.
     * </p>
     * <p>
     * After creating a solution version, you check its accuracy by calling
     * <a>GetSolutionMetrics</a>. When you are satisfied with the version, you
     * deploy it using <a>CreateCampaign</a>. The campaign provides
     * recommendations to a client through the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> API.
     * </p>
     * <p>
     * To train a model, Amazon Personalize requires training data and a recipe.
     * The training data comes from the dataset group that you provide in the
     * request. A recipe specifies the training algorithm and a feature
     * transformation. You can specify one of the predefined recipes provided by
     * Amazon Personalize. Alternatively, you can specify
     * <code>performAutoML</code> and Amazon Personalize will analyze your data
     * and select the optimum USER_PERSONALIZATION recipe for you.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the solution, call <a>DescribeSolution</a>. Wait
     * until the status shows as ACTIVE before calling
     * <code>CreateSolutionVersion</code>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolutionVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionRequest
     * @return createSolutionResult The response from the CreateSolution service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSolutionResult createSolution(CreateSolutionRequest createSolutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSolutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSolutionRequest> request = null;
        Response<CreateSolutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSolutionRequestMarshaller().marshall(createSolutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSolutionResult, JsonUnmarshallerContext> unmarshaller = new CreateSolutionResultJsonUnmarshaller();
            JsonResponseHandler<CreateSolutionResult> responseHandler = new JsonResponseHandler<CreateSolutionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Trains or retrains an active solution. A solution is created using the
     * <a>CreateSolution</a> operation and must be in the ACTIVE state before
     * calling <code>CreateSolutionVersion</code>. A new version of the solution
     * is created every time you call this operation.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the version, call <a>DescribeSolutionVersion</a>.
     * Wait until the status shows as ACTIVE before calling
     * <code>CreateCampaign</code>.
     * </p>
     * <p>
     * If the status shows as CREATE FAILED, the response includes a
     * <code>failureReason</code> key, which describes why the job failed.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionVersionRequest
     * @return createSolutionVersionResult The response from the
     *         CreateSolutionVersion service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSolutionVersionResult createSolutionVersion(
            CreateSolutionVersionRequest createSolutionVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSolutionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSolutionVersionRequest> request = null;
        Response<CreateSolutionVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSolutionVersionRequestMarshaller()
                        .marshall(createSolutionVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSolutionVersionResult, JsonUnmarshallerContext> unmarshaller = new CreateSolutionVersionResultJsonUnmarshaller();
            JsonResponseHandler<CreateSolutionVersionResult> responseHandler = new JsonResponseHandler<CreateSolutionVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes a campaign by deleting the solution deployment. The solution that
     * the campaign is based on is not deleted and can be redeployed when
     * needed. A deleted campaign can no longer be specified in a <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> request. For more information on campaigns, see
     * <a>CreateCampaign</a>.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteCampaign(DeleteCampaignRequest deleteCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCampaignRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCampaignRequestMarshaller().marshall(deleteCampaignRequest);
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
     * Deletes a dataset. You can't delete a dataset if an associated
     * <code>DatasetImportJob</code> or <code>SolutionVersion</code> is in the
     * CREATE PENDING or IN PROGRESS state. For more information on datasets,
     * see <a>CreateDataset</a>.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDataset(DeleteDatasetRequest deleteDatasetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestMarshaller().marshall(deleteDatasetRequest);
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
     * Deletes a dataset group. Before you delete a dataset group, you must
     * delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All associated event trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * All associated solutions.
     * </p>
     * </li>
     * <li>
     * <p>
     * All datasets in the dataset group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteDatasetGroupRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDatasetGroup(DeleteDatasetGroupRequest deleteDatasetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDatasetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetGroupRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetGroupRequestMarshaller()
                        .marshall(deleteDatasetGroupRequest);
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
     * Deletes the event tracker. Does not delete the event-interactions dataset
     * from the associated dataset group. For more information on event
     * trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param deleteEventTrackerRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteEventTracker(DeleteEventTrackerRequest deleteEventTrackerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEventTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventTrackerRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventTrackerRequestMarshaller()
                        .marshall(deleteEventTrackerRequest);
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
     * Deletes a filter.
     * </p>
     * 
     * @param deleteFilterRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteFilter(DeleteFilterRequest deleteFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFilterRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFilterRequestMarshaller().marshall(deleteFilterRequest);
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
     * Deletes a schema. Before deleting a schema, you must delete all datasets
     * referencing the schema. For more information on schemas, see
     * <a>CreateSchema</a>.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteSchema(DeleteSchemaRequest deleteSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaRequestMarshaller().marshall(deleteSchemaRequest);
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
     * Deletes all versions of a solution and the <code>Solution</code> object
     * itself. Before deleting a solution, you must delete all campaigns based
     * on the solution. To determine what campaigns are using the solution, call
     * <a>ListCampaigns</a> and supply the Amazon Resource Name (ARN) of the
     * solution. You can't delete a solution if an associated
     * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS
     * state. For more information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param deleteSolutionRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteSolution(DeleteSolutionRequest deleteSolutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSolutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSolutionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSolutionRequestMarshaller().marshall(deleteSolutionRequest);
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
     * Describes the given algorithm.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return describeAlgorithmResult The response from the DescribeAlgorithm
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAlgorithmResult describeAlgorithm(
            DescribeAlgorithmRequest describeAlgorithmRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAlgorithmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlgorithmRequest> request = null;
        Response<DescribeAlgorithmResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlgorithmRequestMarshaller()
                        .marshall(describeAlgorithmRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAlgorithmResult, JsonUnmarshallerContext> unmarshaller = new DescribeAlgorithmResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAlgorithmResult> responseHandler = new JsonResponseHandler<DescribeAlgorithmResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties of a batch inference job including name, Amazon
     * Resource Name (ARN), status, input and output configurations, and the ARN
     * of the solution version used to generate the recommendations.
     * </p>
     * 
     * @param describeBatchInferenceJobRequest
     * @return describeBatchInferenceJobResult The response from the
     *         DescribeBatchInferenceJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeBatchInferenceJobResult describeBatchInferenceJob(
            DescribeBatchInferenceJobRequest describeBatchInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeBatchInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBatchInferenceJobRequest> request = null;
        Response<DescribeBatchInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBatchInferenceJobRequestMarshaller()
                        .marshall(describeBatchInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeBatchInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeBatchInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBatchInferenceJobResult> responseHandler = new JsonResponseHandler<DescribeBatchInferenceJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the given campaign, including its status.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>status</code> is <code>CREATE FAILED</code>, the response
     * includes the <code>failureReason</code> key, which describes why.
     * </p>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param describeCampaignRequest
     * @return describeCampaignResult The response from the DescribeCampaign
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCampaignResult describeCampaign(DescribeCampaignRequest describeCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCampaignRequest> request = null;
        Response<DescribeCampaignResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCampaignRequestMarshaller().marshall(describeCampaignRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCampaignResult, JsonUnmarshallerContext> unmarshaller = new DescribeCampaignResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCampaignResult> responseHandler = new JsonResponseHandler<DescribeCampaignResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the given dataset. For more information on datasets, see
     * <a>CreateDataset</a>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return describeDatasetResult The response from the DescribeDataset
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestMarshaller().marshall(describeDatasetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDatasetResult, JsonUnmarshallerContext> unmarshaller = new DescribeDatasetResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDatasetResult> responseHandler = new JsonResponseHandler<DescribeDatasetResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the given dataset group. For more information on dataset
     * groups, see <a>CreateDatasetGroup</a>.
     * </p>
     * 
     * @param describeDatasetGroupRequest
     * @return describeDatasetGroupResult The response from the
     *         DescribeDatasetGroup service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDatasetGroupResult describeDatasetGroup(
            DescribeDatasetGroupRequest describeDatasetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDatasetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetGroupRequest> request = null;
        Response<DescribeDatasetGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetGroupRequestMarshaller()
                        .marshall(describeDatasetGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDatasetGroupResult, JsonUnmarshallerContext> unmarshaller = new DescribeDatasetGroupResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDatasetGroupResult> responseHandler = new JsonResponseHandler<DescribeDatasetGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the dataset import job created by
     * <a>CreateDatasetImportJob</a>, including the import job status.
     * </p>
     * 
     * @param describeDatasetImportJobRequest
     * @return describeDatasetImportJobResult The response from the
     *         DescribeDatasetImportJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDatasetImportJobResult describeDatasetImportJob(
            DescribeDatasetImportJobRequest describeDatasetImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDatasetImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetImportJobRequest> request = null;
        Response<DescribeDatasetImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetImportJobRequestMarshaller()
                        .marshall(describeDatasetImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDatasetImportJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeDatasetImportJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDatasetImportJobResult> responseHandler = new JsonResponseHandler<DescribeDatasetImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes an event tracker. The response includes the
     * <code>trackingId</code> and <code>status</code> of the event tracker. For
     * more information on event trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param describeEventTrackerRequest
     * @return describeEventTrackerResult The response from the
     *         DescribeEventTracker service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEventTrackerResult describeEventTracker(
            DescribeEventTrackerRequest describeEventTrackerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventTrackerRequest> request = null;
        Response<DescribeEventTrackerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventTrackerRequestMarshaller()
                        .marshall(describeEventTrackerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventTrackerResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventTrackerResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventTrackerResult> responseHandler = new JsonResponseHandler<DescribeEventTrackerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the given feature transformation.
     * </p>
     * 
     * @param describeFeatureTransformationRequest
     * @return describeFeatureTransformationResult The response from the
     *         DescribeFeatureTransformation service method, as returned by
     *         Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeFeatureTransformationResult describeFeatureTransformation(
            DescribeFeatureTransformationRequest describeFeatureTransformationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeFeatureTransformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFeatureTransformationRequest> request = null;
        Response<DescribeFeatureTransformationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFeatureTransformationRequestMarshaller()
                        .marshall(describeFeatureTransformationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeFeatureTransformationResult, JsonUnmarshallerContext> unmarshaller = new DescribeFeatureTransformationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeFeatureTransformationResult> responseHandler = new JsonResponseHandler<DescribeFeatureTransformationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a filter's properties.
     * </p>
     * 
     * @param describeFilterRequest
     * @return describeFilterResult The response from the DescribeFilter service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeFilterResult describeFilter(DescribeFilterRequest describeFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFilterRequest> request = null;
        Response<DescribeFilterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFilterRequestMarshaller().marshall(describeFilterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeFilterResult, JsonUnmarshallerContext> unmarshaller = new DescribeFilterResultJsonUnmarshaller();
            JsonResponseHandler<DescribeFilterResult> responseHandler = new JsonResponseHandler<DescribeFilterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a recipe.
     * </p>
     * <p>
     * A recipe contains three items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An algorithm that trains a model.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyperparameters that govern the training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature transformation information for modifying the input data before
     * training.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Personalize provides a set of predefined recipes. You specify a
     * recipe when you create a solution with the <a>CreateSolution</a> API.
     * <code>CreateSolution</code> trains a model by using the algorithm in the
     * specified recipe and a training dataset. The solution, when deployed as a
     * campaign, can provide recommendations using the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> API.
     * </p>
     * 
     * @param describeRecipeRequest
     * @return describeRecipeResult The response from the DescribeRecipe service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeRecipeResult describeRecipe(DescribeRecipeRequest describeRecipeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecipeRequest> request = null;
        Response<DescribeRecipeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecipeRequestMarshaller().marshall(describeRecipeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRecipeResult, JsonUnmarshallerContext> unmarshaller = new DescribeRecipeResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRecipeResult> responseHandler = new JsonResponseHandler<DescribeRecipeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a schema. For more information on schemas, see
     * <a>CreateSchema</a>.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return describeSchemaResult The response from the DescribeSchema service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSchemaResult describeSchema(DescribeSchemaRequest describeSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchemaRequest> request = null;
        Response<DescribeSchemaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchemaRequestMarshaller().marshall(describeSchemaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSchemaResult, JsonUnmarshallerContext> unmarshaller = new DescribeSchemaResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSchemaResult> responseHandler = new JsonResponseHandler<DescribeSchemaResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a solution. For more information on solutions, see
     * <a>CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionRequest
     * @return describeSolutionResult The response from the DescribeSolution
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSolutionResult describeSolution(DescribeSolutionRequest describeSolutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSolutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSolutionRequest> request = null;
        Response<DescribeSolutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSolutionRequestMarshaller().marshall(describeSolutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSolutionResult, JsonUnmarshallerContext> unmarshaller = new DescribeSolutionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSolutionResult> responseHandler = new JsonResponseHandler<DescribeSolutionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a specific version of a solution. For more information on
     * solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionVersionRequest
     * @return describeSolutionVersionResult The response from the
     *         DescribeSolutionVersion service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSolutionVersionResult describeSolutionVersion(
            DescribeSolutionVersionRequest describeSolutionVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSolutionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSolutionVersionRequest> request = null;
        Response<DescribeSolutionVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSolutionVersionRequestMarshaller()
                        .marshall(describeSolutionVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSolutionVersionResult, JsonUnmarshallerContext> unmarshaller = new DescribeSolutionVersionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSolutionVersionResult> responseHandler = new JsonResponseHandler<DescribeSolutionVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the metrics for the specified solution version.
     * </p>
     * 
     * @param getSolutionMetricsRequest
     * @return getSolutionMetricsResult The response from the GetSolutionMetrics
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSolutionMetricsResult getSolutionMetrics(
            GetSolutionMetricsRequest getSolutionMetricsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSolutionMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolutionMetricsRequest> request = null;
        Response<GetSolutionMetricsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolutionMetricsRequestMarshaller()
                        .marshall(getSolutionMetricsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSolutionMetricsResult, JsonUnmarshallerContext> unmarshaller = new GetSolutionMetricsResultJsonUnmarshaller();
            JsonResponseHandler<GetSolutionMetricsResult> responseHandler = new JsonResponseHandler<GetSolutionMetricsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the batch inference jobs that have been performed off of a
     * solution version.
     * </p>
     * 
     * @param listBatchInferenceJobsRequest
     * @return listBatchInferenceJobsResult The response from the
     *         ListBatchInferenceJobs service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBatchInferenceJobsResult listBatchInferenceJobs(
            ListBatchInferenceJobsRequest listBatchInferenceJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBatchInferenceJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBatchInferenceJobsRequest> request = null;
        Response<ListBatchInferenceJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBatchInferenceJobsRequestMarshaller()
                        .marshall(listBatchInferenceJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBatchInferenceJobsResult, JsonUnmarshallerContext> unmarshaller = new ListBatchInferenceJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListBatchInferenceJobsResult> responseHandler = new JsonResponseHandler<ListBatchInferenceJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of campaigns that use the given solution. When a solution
     * is not specified, all the campaigns associated with the account are
     * listed. The response provides the properties for each campaign, including
     * the Amazon Resource Name (ARN). For more information on campaigns, see
     * <a>CreateCampaign</a>.
     * </p>
     * 
     * @param listCampaignsRequest
     * @return listCampaignsResult The response from the ListCampaigns service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCampaignsResult listCampaigns(ListCampaignsRequest listCampaignsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCampaignsRequest> request = null;
        Response<ListCampaignsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCampaignsRequestMarshaller().marshall(listCampaignsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCampaignsResult, JsonUnmarshallerContext> unmarshaller = new ListCampaignsResultJsonUnmarshaller();
            JsonResponseHandler<ListCampaignsResult> responseHandler = new JsonResponseHandler<ListCampaignsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of dataset groups. The response provides the properties
     * for each dataset group, including the Amazon Resource Name (ARN). For
     * more information on dataset groups, see <a>CreateDatasetGroup</a>.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @return listDatasetGroupsResult The response from the ListDatasetGroups
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDatasetGroupsResult listDatasetGroups(
            ListDatasetGroupsRequest listDatasetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDatasetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetGroupsRequest> request = null;
        Response<ListDatasetGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetGroupsRequestMarshaller()
                        .marshall(listDatasetGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDatasetGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListDatasetGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListDatasetGroupsResult> responseHandler = new JsonResponseHandler<ListDatasetGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of dataset import jobs that use the given dataset. When a
     * dataset is not specified, all the dataset import jobs associated with the
     * account are listed. The response provides the properties for each dataset
     * import job, including the Amazon Resource Name (ARN). For more
     * information on dataset import jobs, see <a>CreateDatasetImportJob</a>.
     * For more information on datasets, see <a>CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetImportJobsRequest
     * @return listDatasetImportJobsResult The response from the
     *         ListDatasetImportJobs service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDatasetImportJobsResult listDatasetImportJobs(
            ListDatasetImportJobsRequest listDatasetImportJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDatasetImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetImportJobsRequest> request = null;
        Response<ListDatasetImportJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetImportJobsRequestMarshaller()
                        .marshall(listDatasetImportJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDatasetImportJobsResult, JsonUnmarshallerContext> unmarshaller = new ListDatasetImportJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListDatasetImportJobsResult> responseHandler = new JsonResponseHandler<ListDatasetImportJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of datasets contained in the given dataset group. The
     * response provides the properties for each dataset, including the Amazon
     * Resource Name (ARN). For more information on datasets, see
     * <a>CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return listDatasetsResult The response from the ListDatasets service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestMarshaller().marshall(listDatasetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDatasetsResult, JsonUnmarshallerContext> unmarshaller = new ListDatasetsResultJsonUnmarshaller();
            JsonResponseHandler<ListDatasetsResult> responseHandler = new JsonResponseHandler<ListDatasetsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of event trackers associated with the account. The
     * response provides the properties for each event tracker, including the
     * Amazon Resource Name (ARN) and tracking ID. For more information on event
     * trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param listEventTrackersRequest
     * @return listEventTrackersResult The response from the ListEventTrackers
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListEventTrackersResult listEventTrackers(
            ListEventTrackersRequest listEventTrackersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEventTrackersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventTrackersRequest> request = null;
        Response<ListEventTrackersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventTrackersRequestMarshaller()
                        .marshall(listEventTrackersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEventTrackersResult, JsonUnmarshallerContext> unmarshaller = new ListEventTrackersResultJsonUnmarshaller();
            JsonResponseHandler<ListEventTrackersResult> responseHandler = new JsonResponseHandler<ListEventTrackersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all filters that belong to a given dataset group.
     * </p>
     * 
     * @param listFiltersRequest
     * @return listFiltersResult The response from the ListFilters service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFiltersRequest> request = null;
        Response<ListFiltersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFiltersRequestMarshaller().marshall(listFiltersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFiltersResult, JsonUnmarshallerContext> unmarshaller = new ListFiltersResultJsonUnmarshaller();
            JsonResponseHandler<ListFiltersResult> responseHandler = new JsonResponseHandler<ListFiltersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of available recipes. The response provides the properties
     * for each recipe, including the recipe's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecipesRequest
     * @return listRecipesResult The response from the ListRecipes service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRecipesResult listRecipes(ListRecipesRequest listRecipesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRecipesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecipesRequest> request = null;
        Response<ListRecipesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecipesRequestMarshaller().marshall(listRecipesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRecipesResult, JsonUnmarshallerContext> unmarshaller = new ListRecipesResultJsonUnmarshaller();
            JsonResponseHandler<ListRecipesResult> responseHandler = new JsonResponseHandler<ListRecipesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of schemas associated with the account. The response
     * provides the properties for each schema, including the Amazon Resource
     * Name (ARN). For more information on schemas, see <a>CreateSchema</a>.
     * </p>
     * 
     * @param listSchemasRequest
     * @return listSchemasResult The response from the ListSchemas service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemasRequest> request = null;
        Response<ListSchemasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemasRequestMarshaller().marshall(listSchemasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSchemasResult, JsonUnmarshallerContext> unmarshaller = new ListSchemasResultJsonUnmarshaller();
            JsonResponseHandler<ListSchemasResult> responseHandler = new JsonResponseHandler<ListSchemasResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of solution versions for the given solution. When a
     * solution is not specified, all the solution versions associated with the
     * account are listed. The response provides the properties for each
     * solution version, including the Amazon Resource Name (ARN). For more
     * information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionVersionsRequest
     * @return listSolutionVersionsResult The response from the
     *         ListSolutionVersions service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSolutionVersionsResult listSolutionVersions(
            ListSolutionVersionsRequest listSolutionVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSolutionVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolutionVersionsRequest> request = null;
        Response<ListSolutionVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolutionVersionsRequestMarshaller()
                        .marshall(listSolutionVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSolutionVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListSolutionVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListSolutionVersionsResult> responseHandler = new JsonResponseHandler<ListSolutionVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of solutions that use the given dataset group. When a
     * dataset group is not specified, all the solutions associated with the
     * account are listed. The response provides the properties for each
     * solution, including the Amazon Resource Name (ARN). For more information
     * on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionsRequest
     * @return listSolutionsResult The response from the ListSolutions service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSolutionsResult listSolutions(ListSolutionsRequest listSolutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSolutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolutionsRequest> request = null;
        Response<ListSolutionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolutionsRequestMarshaller().marshall(listSolutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSolutionsResult, JsonUnmarshallerContext> unmarshaller = new ListSolutionsResultJsonUnmarshaller();
            JsonResponseHandler<ListSolutionsResult> responseHandler = new JsonResponseHandler<ListSolutionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a campaign by either deploying a new solution or changing the
     * value of the campaign's <code>minProvisionedTPS</code> parameter.
     * </p>
     * <p>
     * To update a campaign, the campaign status must be ACTIVE or CREATE
     * FAILED. Check the campaign status using the <a>DescribeCampaign</a> API.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the updated campaign is
     * <code>ACTIVE</code> before asking the campaign for recommendations.
     * </p>
     * </note>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return updateCampaignResult The response from the UpdateCampaign service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignRequest> request = null;
        Response<UpdateCampaignResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignRequestMarshaller().marshall(updateCampaignRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCampaignResult, JsonUnmarshallerContext> unmarshaller = new UpdateCampaignResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCampaignResult> responseHandler = new JsonResponseHandler<UpdateCampaignResult>(
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
