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

package com.amazonaws.services.api.sagemaker;

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

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.services.api.sagemaker.model.transform.*;

/**
 * Client for accessing Amazon SageMaker Service. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 * <p>
 * Other Resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/whatis.html#first-time-user"
 * >Amazon SageMaker Developer Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/augmented-ai/2019-11-07/APIReference/Welcome.html"
 * >Amazon Augmented AI Runtime API Reference</a>
 * </p>
 * </li>
 * </ul>
 */
public class AmazonSageMakerServiceClient extends AmazonWebServiceClient implements
        AmazonSageMakerService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon SageMaker Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService. A credentials provider chain will be used that
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
    public AmazonSageMakerServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService. A credentials provider chain will be used that
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
     *            how this client connects to AmazonSageMakerService (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSageMakerServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService using the specified AWS account credentials.
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
     *         AmazonSageMakerServiceClient client = new AmazonSageMakerServiceClient(AWSMobileClient
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
    public AmazonSageMakerServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService using the specified AWS account credentials and
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
     *         AmazonSageMakerServiceClient client = new AmazonSageMakerServiceClient(AWSMobileClient
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
     *            how this client connects to AmazonSageMakerService (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonSageMakerServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService using the specified AWS account credentials
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
     *         AmazonSageMakerServiceClient client = new AmazonSageMakerServiceClient(AWSMobileClient
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
    public AmazonSageMakerServiceClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService using the specified AWS account credentials
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
     *         AmazonSageMakerServiceClient client = new AmazonSageMakerServiceClient(AWSMobileClient
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
     *            how this client connects to AmazonSageMakerService (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonSageMakerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonSageMakerService (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonSageMakerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSageMakerService using the specified AWS account credentials
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
     *         AmazonSageMakerServiceClient client = new AmazonSageMakerServiceClient(AWSMobileClient
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
     *            how this client connects to AmazonSageMakerService (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonSageMakerServiceClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("api.sagemaker.us-east-1.amazonaws.com");
        this.endpointPrefix = "api.sagemaker";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/api.sagemaker/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/api.sagemaker/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon SageMaker
     * resource. You can add tags to notebook instances, training jobs,
     * hyperparameter tuning jobs, batch transform jobs, models, labeling jobs,
     * work teams, endpoint configurations, and endpoints.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource. For more information about tags, see For more information,
     * see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >AWS Tagging Strategies</a>.
     * </p>
     * <note>
     * <p>
     * Tags that you add to a hyperparameter tuning job by calling this API are
     * also added to any training jobs that the hyperparameter tuning job
     * launches after you call this API, but not to training jobs that the
     * hyperparameter tuning job launched before you called this API. To make
     * sure that the tags associated with a hyperparameter tuning job are also
     * added to all training jobs that the hyperparameter tuning job launches,
     * add the tags when you first create the tuning job by specifying them in
     * the <code>Tags</code> parameter of <a>CreateHyperParameterTuningJob</a>
     * </p>
     * </note>
     * 
     * @param addTagsRequest
     * @return addTagsResult The response from the AddTags service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public AddTagsResult addTags(AddTagsRequest addTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestMarshaller().marshall(addTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddTagsResult, JsonUnmarshallerContext> unmarshaller = new AddTagsResultJsonUnmarshaller();
            JsonResponseHandler<AddTagsResult> responseHandler = new JsonResponseHandler<AddTagsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Associates a trial component with a trial. A trial component can be
     * associated with multiple trials. To disassociate a trial component from a
     * trial, call the <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param associateTrialComponentRequest
     * @return associateTrialComponentResult The response from the
     *         AssociateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public AssociateTrialComponentResult associateTrialComponent(
            AssociateTrialComponentRequest associateTrialComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTrialComponentRequest> request = null;
        Response<AssociateTrialComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTrialComponentRequestMarshaller()
                        .marshall(associateTrialComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateTrialComponentResult, JsonUnmarshallerContext> unmarshaller = new AssociateTrialComponentResultJsonUnmarshaller();
            JsonResponseHandler<AssociateTrialComponentResult> responseHandler = new JsonResponseHandler<AssociateTrialComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker
     * and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @return createAlgorithmResult The response from the CreateAlgorithm
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest createAlgorithmRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAlgorithmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAlgorithmRequest> request = null;
        Response<CreateAlgorithmResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAlgorithmRequestMarshaller().marshall(createAlgorithmRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAlgorithmResult, JsonUnmarshallerContext> unmarshaller = new CreateAlgorithmResultJsonUnmarshaller();
            JsonResponseHandler<CreateAlgorithmResult> responseHandler = new JsonResponseHandler<CreateAlgorithmResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a running App for the specified UserProfile. Supported Apps are
     * <code>JupyterServer</code>, <code>KernelGateway</code>, and
     * <code>TensorBoard</code>. This operation is automatically invoked by
     * Amazon SageMaker Studio upon access to the associated Studio Domain, and
     * when new kernel configurations are selected by the user. A user may have
     * multiple Apps active simultaneously. Apps will automatically terminate
     * and be deleted when stopped from within Studio, or when the DeleteApp API
     * is manually called. UserProfiles are limited to 5 concurrently running
     * Apps at a time.
     * </p>
     * 
     * @param createAppRequest
     * @return createAppResult The response from the CreateApp service method,
     *         as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateAppResult createApp(CreateAppRequest createAppRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestMarshaller().marshall(createAppRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAppResult, JsonUnmarshallerContext> unmarshaller = new CreateAppResultJsonUnmarshaller();
            JsonResponseHandler<CreateAppResult> responseHandler = new JsonResponseHandler<CreateAppResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an AutoPilot job.
     * </p>
     * <p>
     * After you run an AutoPilot job, you can find the best performing model by
     * calling , and then deploy that model by following the steps described in
     * <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html"
     * >Step 6.1: Deploy the Model to Amazon SageMaker Hosting Services</a>.
     * </p>
     * <p>
     * For information about how to use AutoPilot, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development.html"
     * >Use AutoPilot to Automate Model Development</a>.
     * </p>
     * 
     * @param createAutoMLJobRequest
     * @return createAutoMLJobResult The response from the CreateAutoMLJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateAutoMLJobResult createAutoMLJob(CreateAutoMLJobRequest createAutoMLJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAutoMLJobRequest> request = null;
        Response<CreateAutoMLJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAutoMLJobRequestMarshaller().marshall(createAutoMLJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAutoMLJobResult, JsonUnmarshallerContext> unmarshaller = new CreateAutoMLJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateAutoMLJobResult> responseHandler = new JsonResponseHandler<CreateAutoMLJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account.
     * You can associate the repository with notebook instances so that you can
     * use Git source control for the notebooks you create. The Git repository
     * is a resource in your Amazon SageMaker account, so it can be associated
     * with more than one notebook instance, and it persists independently from
     * the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @return createCodeRepositoryResult The response from the
     *         CreateCodeRepository service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateCodeRepositoryResult createCodeRepository(
            CreateCodeRepositoryRequest createCodeRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCodeRepositoryRequest> request = null;
        Response<CreateCodeRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCodeRepositoryRequestMarshaller()
                        .marshall(createCodeRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCodeRepositoryResult, JsonUnmarshallerContext> unmarshaller = new CreateCodeRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<CreateCodeRepositoryResult> responseHandler = new JsonResponseHandler<CreateCodeRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a model compilation job. After the model has been compiled, Amazon
     * SageMaker saves the resulting model artifacts to an Amazon Simple Storage
     * Service (Amazon S3) bucket that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services,
     * you can use the resulting model artifacts as part of the model. You can
     * also use the artifacts with AWS IoT Greengrass. In that case, deploy them
     * as an ML resource.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name for the compilation job
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about the input model artifacts
     * </p>
     * </li>
     * <li>
     * <p>
     * The output location for the compiled model and the device (target) that
     * the model runs on
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide a <code>Tag</code> to track the model compilation
     * job's resource use and costs. The response body contains the
     * <code>CompilationJobArn</code> for the compiled job.
     * </p>
     * <p>
     * To stop a model compilation job, use <a>StopCompilationJob</a>. To get
     * information about a particular model compilation job, use
     * <a>DescribeCompilationJob</a>. To get information about multiple model
     * compilation jobs, use <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param createCompilationJobRequest
     * @return createCompilationJobResult The response from the
     *         CreateCompilationJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateCompilationJobResult createCompilationJob(
            CreateCompilationJobRequest createCompilationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCompilationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCompilationJobRequest> request = null;
        Response<CreateCompilationJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCompilationJobRequestMarshaller()
                        .marshall(createCompilationJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCompilationJobResult, JsonUnmarshallerContext> unmarshaller = new CreateCompilationJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateCompilationJobResult> responseHandler = new JsonResponseHandler<CreateCompilationJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Domain for Amazon SageMaker Studio, which can be accessed by
     * end-users in a web browser. A Domain has an associated directory, list of
     * authorized users, and a variety of security, application, policies, and
     * Amazon Virtual Private Cloud configurations. An AWS account is limited to
     * one Domain, per region. Users within a domain can share notebook files
     * and other artifacts with each other. When a Domain is created, an Amazon
     * Elastic File System (EFS) is also created for use by all of the users
     * within the Domain. Each user receives a private home directory within the
     * EFS for notebooks, Git repositories, and data files.
     * </p>
     * 
     * @param createDomainRequest
     * @return createDomainResult The response from the CreateDomain service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestMarshaller().marshall(createDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDomainResult, JsonUnmarshallerContext> unmarshaller = new CreateDomainResultJsonUnmarshaller();
            JsonResponseHandler<CreateDomainResult> responseHandler = new JsonResponseHandler<CreateDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the
     * request. Amazon SageMaker uses the endpoint to provision resources and
     * deploy models. You create the endpoint configuration with the
     * <a>CreateEndpointConfig</a> API.
     * </p>
     * <p>
     * Use this API to deploy models using Amazon SageMaker hosting services.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon
     * SageMaker hosting services, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
     * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for
     * Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> that is in use by an
     * endpoint that is live or while the <code>UpdateEndpoint</code> or
     * <code>CreateEndpoint</code> operations are being performed on the
     * endpoint. To update an endpoint, you must create a new
     * <code>EndpointConfig</code>.
     * </p>
     * </note>
     * <p>
     * The endpoint name must be unique within an AWS Region in your AWS
     * account.
     * </p>
     * <p>
     * When it receives the request, Amazon SageMaker creates the endpoint,
     * launches the resources (ML compute instances), and deploys the model(s)
     * on them.
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status
     * to <code>Creating</code>. After it creates the endpoint, it sets the
     * status to <code>InService</code>. Amazon SageMaker can then process
     * incoming requests for inferences. To check the status of an endpoint, use
     * the <a>DescribeEndpoint</a> API.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an
     * Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to
     * download model artifacts from the S3 path you provided. AWS STS is
     * activated in your IAM user account by default. If you previously
     * deactivated AWS STS for a region, you need to reactivate AWS STS for that
     * region. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param createEndpointRequest
     * @return createEndpointResult The response from the CreateEndpoint service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointRequest> request = null;
        Response<CreateEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointRequestMarshaller().marshall(createEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateEndpointResult, JsonUnmarshallerContext> unmarshaller = new CreateEndpointResultJsonUnmarshaller();
            JsonResponseHandler<CreateEndpointResult> responseHandler = new JsonResponseHandler<CreateEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services
     * uses to deploy models. In the configuration, you identify one or more
     * models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the
     * <a>CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API if you want to use Amazon SageMaker hosting services to
     * deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define a <code>ProductionVariant</code>, for each
     * model that you want to deploy. Each <code>ProductionVariant</code>
     * parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to
     * deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a
     * <code>VariantWeight</code> to specify how much traffic you want to
     * allocate to each model. For example, suppose that you want to host two
     * models, A and B, and you assign traffic weight 2 for model A and 1 for
     * model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon
     * SageMaker hosting services, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
     * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for
     * Python (Boto 3)).</a>
     * </p>
     * 
     * @param createEndpointConfigRequest
     * @return createEndpointConfigResult The response from the
     *         CreateEndpointConfig service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateEndpointConfigResult createEndpointConfig(
            CreateEndpointConfigRequest createEndpointConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEndpointConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointConfigRequest> request = null;
        Response<CreateEndpointConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointConfigRequestMarshaller()
                        .marshall(createEndpointConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateEndpointConfigResult, JsonUnmarshallerContext> unmarshaller = new CreateEndpointConfigResultJsonUnmarshaller();
            JsonResponseHandler<CreateEndpointConfigResult> responseHandler = new JsonResponseHandler<CreateEndpointConfigResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an Amazon SageMaker <i>experiment</i>. An experiment is a
     * collection of <i>trials</i> that are observed, compared and evaluated as
     * a group. A trial is a set of steps, called <i>trial components</i>, that
     * produce a machine learning model.
     * </p>
     * <p>
     * The goal of an experiment is to determine the components that produce the
     * best model. Multiple trials are performed, each one isolating and
     * measuring the impact of a change to one or more inputs, while keeping the
     * remaining inputs constant.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK,
     * all experiments, trials, and trial components are automatically tracked,
     * logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to experiments, trials, trial components and then use
     * the <a>Search</a> API to search for the tags.
     * </p>
     * <p>
     * To add a description to an experiment, specify the optional
     * <code>Description</code> parameter. To add a description later, or to
     * change the description, call the <a>UpdateExperiment</a> API.
     * </p>
     * <p>
     * To get a list of all your experiments, call the <a>ListExperiments</a>
     * API. To view an experiment's properties, call the
     * <a>DescribeExperiment</a> API. To get a list of all the trials associated
     * with an experiment, call the <a>ListTrials</a> API. To create a trial
     * call the <a>CreateTrial</a> API.
     * </p>
     * 
     * @param createExperimentRequest
     * @return createExperimentResult The response from the CreateExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateExperimentResult createExperiment(CreateExperimentRequest createExperimentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExperimentRequest> request = null;
        Response<CreateExperimentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExperimentRequestMarshaller().marshall(createExperimentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateExperimentResult, JsonUnmarshallerContext> unmarshaller = new CreateExperimentResultJsonUnmarshaller();
            JsonResponseHandler<CreateExperimentResult> responseHandler = new JsonResponseHandler<CreateExperimentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a flow definition.
     * </p>
     * 
     * @param createFlowDefinitionRequest
     * @return createFlowDefinitionResult The response from the
     *         CreateFlowDefinition service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateFlowDefinitionResult createFlowDefinition(
            CreateFlowDefinitionRequest createFlowDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createFlowDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowDefinitionRequest> request = null;
        Response<CreateFlowDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowDefinitionRequestMarshaller()
                        .marshall(createFlowDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateFlowDefinitionResult, JsonUnmarshallerContext> unmarshaller = new CreateFlowDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<CreateFlowDefinitionResult> responseHandler = new JsonResponseHandler<CreateFlowDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Defines the settings you will use for the human review workflow user
     * interface. Reviewers will see a three-panel interface with an instruction
     * area, the item to review, and an input area.
     * </p>
     * 
     * @param createHumanTaskUiRequest
     * @return createHumanTaskUiResult The response from the CreateHumanTaskUi
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateHumanTaskUiResult createHumanTaskUi(
            CreateHumanTaskUiRequest createHumanTaskUiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createHumanTaskUiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHumanTaskUiRequest> request = null;
        Response<CreateHumanTaskUiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHumanTaskUiRequestMarshaller()
                        .marshall(createHumanTaskUiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateHumanTaskUiResult, JsonUnmarshallerContext> unmarshaller = new CreateHumanTaskUiResultJsonUnmarshaller();
            JsonResponseHandler<CreateHumanTaskUiResult> responseHandler = new JsonResponseHandler<CreateHumanTaskUiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the
     * best version of a model by running many training jobs on your dataset
     * using the algorithm you choose and values for hyperparameters within
     * ranges that you specify. It then chooses the hyperparameter values that
     * result in a model that performs the best, as measured by an objective
     * metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @return createHyperParameterTuningJobResult The response from the
     *         CreateHyperParameterTuningJob service method, as returned by
     *         Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateHyperParameterTuningJobResult createHyperParameterTuningJob(
            CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHyperParameterTuningJobRequest> request = null;
        Response<CreateHyperParameterTuningJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHyperParameterTuningJobRequestMarshaller()
                        .marshall(createHyperParameterTuningJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateHyperParameterTuningJobResult, JsonUnmarshallerContext> unmarshaller = new CreateHyperParameterTuningJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateHyperParameterTuningJobResult> responseHandler = new JsonResponseHandler<CreateHyperParameterTuningJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a job that uses workers to label the data objects in your input
     * dataset. You can use the labeled data to train machine learning models.
     * </p>
     * <p>
     * You can select your workforce from one of three providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A private workforce that you create. It can include employees,
     * contractors, and outside experts. Use a private workforce when want the
     * data to stay within your organization or when a specific set of skills is
     * required.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more vendors that you select from the AWS Marketplace. Vendors
     * provide expertise in specific areas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Mechanical Turk workforce. This is the largest workforce, but
     * it should only be used for public data or data that has been stripped of
     * any personally identifiable information.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use <i>automated data labeling</i> to reduce the number of
     * data objects that need to be labeled by a human. Automated data labeling
     * uses <i>active learning</i> to determine if a data object can be labeled
     * by machine or if it needs to be sent to a human worker. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html"
     * >Using Automated Data Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You
     * create a <i>manifest file</i> that describes the location of each object.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html"
     * >Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or
     * as training data for your machine learning models.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @return createLabelingJobResult The response from the CreateLabelingJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateLabelingJobResult createLabelingJob(
            CreateLabelingJobRequest createLabelingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createLabelingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLabelingJobRequest> request = null;
        Response<CreateLabelingJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLabelingJobRequestMarshaller()
                        .marshall(createLabelingJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateLabelingJobResult, JsonUnmarshallerContext> unmarshaller = new CreateLabelingJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateLabelingJobResult> responseHandler = new JsonResponseHandler<CreateLabelingJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model
     * and describe a primary container. For the primary container, you specify
     * the Docker image that contains inference code, artifacts (from prior
     * training), and a custom environment map that the inference code uses when
     * you deploy the model for predictions.
     * </p>
     * <p>
     * Use this API to create a model if you want to use Amazon SageMaker
     * hosting services or run a batch transform job.
     * </p>
     * <p>
     * To host your model, you create an endpoint configuration with the
     * <code>CreateEndpointConfig</code> API, and then create an endpoint with
     * the <code>CreateEndpoint</code> API. Amazon SageMaker then deploys all of
     * the containers that you defined for the model in the hosting environment.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon
     * SageMaker hosting services, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
     * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for
     * Python (Boto 3)).</a>
     * </p>
     * <p>
     * To run a batch transform using your model, you start a job with the
     * <code>CreateTransformJob</code> API. Amazon SageMaker uses your model and
     * your dataset to get inferences which are then saved to a specified S3
     * location.
     * </p>
     * <p>
     * In the <code>CreateModel</code> request, you must define a container with
     * the <code>PrimaryContainer</code> parameter.
     * </p>
     * <p>
     * In the request, you also provide an IAM role that Amazon SageMaker can
     * assume to access model artifacts and docker image for deployment on ML
     * compute hosting instances or for batch transform jobs. In addition, you
     * also use the IAM role to manage permissions the inference code needs. For
     * example, if the inference code access any other AWS resources, you grant
     * necessary permissions via this role.
     * </p>
     * 
     * @param createModelRequest
     * @return createModelResult The response from the CreateModel service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateModelResult createModel(CreateModelRequest createModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestMarshaller().marshall(createModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateModelResult, JsonUnmarshallerContext> unmarshaller = new CreateModelResultJsonUnmarshaller();
            JsonResponseHandler<CreateModelResult> responseHandler = new JsonResponseHandler<CreateModelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a model package that you can use to create Amazon SageMaker
     * models or list on AWS Marketplace. Buyers can subscribe to model packages
     * listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * <p>
     * To create a model package by specifying a Docker container that contains
     * your inference code and the Amazon S3 location of your model artifacts,
     * provide values for <code>InferenceSpecification</code>. To create a model
     * from an algorithm resource that you created or subscribed to in AWS
     * Marketplace, provide a value for
     * <code>SourceAlgorithmSpecification</code>.
     * </p>
     * 
     * @param createModelPackageRequest
     * @return createModelPackageResult The response from the CreateModelPackage
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateModelPackageResult createModelPackage(
            CreateModelPackageRequest createModelPackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createModelPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelPackageRequest> request = null;
        Response<CreateModelPackageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelPackageRequestMarshaller()
                        .marshall(createModelPackageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateModelPackageResult, JsonUnmarshallerContext> unmarshaller = new CreateModelPackageResultJsonUnmarshaller();
            JsonResponseHandler<CreateModelPackageResult> responseHandler = new JsonResponseHandler<CreateModelPackageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs
     * to monitor the data captured for an Amazon SageMaker Endoint.
     * </p>
     * 
     * @param createMonitoringScheduleRequest
     * @return createMonitoringScheduleResult The response from the
     *         CreateMonitoringSchedule service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateMonitoringScheduleResult createMonitoringSchedule(
            CreateMonitoringScheduleRequest createMonitoringScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMonitoringScheduleRequest> request = null;
        Response<CreateMonitoringScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMonitoringScheduleRequestMarshaller()
                        .marshall(createMonitoringScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMonitoringScheduleResult, JsonUnmarshallerContext> unmarshaller = new CreateMonitoringScheduleResultJsonUnmarshaller();
            JsonResponseHandler<CreateMonitoringScheduleResult> responseHandler = new JsonResponseHandler<CreateMonitoringScheduleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a
     * machine learning (ML) compute instance running on a Jupyter notebook.
     * </p>
     * <p>
     * In a <code>CreateNotebookInstance</code> request, specify the type of ML
     * compute instance that you want to run. Amazon SageMaker launches the
     * instance, installs common libraries that you can use to explore datasets
     * for model training, and attaches an ML storage volume to the notebook
     * instance.
     * </p>
     * <p>
     * Amazon SageMaker also provides a set of example notebooks. Each notebook
     * demonstrates how to use Amazon SageMaker with a specific algorithm or
     * with a machine learning framework.
     * </p>
     * <p>
     * After receiving the request, Amazon SageMaker does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Creates a network interface in the Amazon SageMaker VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Option) If you specified <code>SubnetId</code>, Amazon SageMaker creates
     * a network interface in your own VPC, which is inferred from the subnet ID
     * that you provide in the input. When creating this network interface,
     * Amazon SageMaker attaches the security group that you specified in the
     * request to the network interface that it creates in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launches an EC2 instance of the type specified in the request in the
     * Amazon SageMaker VPC. If you specified <code>SubnetId</code> of your VPC,
     * Amazon SageMaker specifies both network interfaces when launching this
     * instance. This enables inbound traffic from your own VPC to the notebook
     * instance, assuming that the security groups allow it.
     * </p>
     * </li>
     * </ol>
     * <p>
     * After creating the notebook instance, Amazon SageMaker returns its Amazon
     * Resource Name (ARN). You can't change the name of a notebook instance
     * after you create it.
     * </p>
     * <p>
     * After Amazon SageMaker creates the notebook instance, you can connect to
     * the Jupyter server and work in Jupyter notebooks. For example, you can
     * write code to explore a dataset that you can use for model training,
     * train a model, host models by creating Amazon SageMaker endpoints, and
     * validate hosted models.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
     * It Works</a>.
     * </p>
     * 
     * @param createNotebookInstanceRequest
     * @return createNotebookInstanceResult The response from the
     *         CreateNotebookInstance service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateNotebookInstanceResult createNotebookInstance(
            CreateNotebookInstanceRequest createNotebookInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotebookInstanceRequest> request = null;
        Response<CreateNotebookInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotebookInstanceRequestMarshaller()
                        .marshall(createNotebookInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateNotebookInstanceResult, JsonUnmarshallerContext> unmarshaller = new CreateNotebookInstanceResultJsonUnmarshaller();
            JsonResponseHandler<CreateNotebookInstanceResult> responseHandler = new JsonResponseHandler<CreateNotebookInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a lifecycle configuration that you can associate with a notebook
     * instance. A <i>lifecycle configuration</i> is a collection of shell
     * scripts that run when you create or start a notebook instance.
     * </p>
     * <p>
     * Each lifecycle configuration script has a limit of 16384 characters.
     * </p>
     * <p>
     * The value of the <code>$PATH</code> environment variable that is
     * available to both scripts is <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
     * </p>
     * <p>
     * View CloudWatch Logs for notebook instance lifecycle configurations in
     * log group <code>/aws/sagemaker/NotebookInstances</code> in log stream
     * <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
     * </p>
     * <p>
     * Lifecycle configuration scripts cannot run for longer than 5 minutes. If
     * a script runs for longer than 5 minutes, it fails and the notebook
     * instance is not created or started.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param createNotebookInstanceLifecycleConfigRequest
     * @return createNotebookInstanceLifecycleConfigResult The response from the
     *         CreateNotebookInstanceLifecycleConfig service method, as returned
     *         by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateNotebookInstanceLifecycleConfigResult createNotebookInstanceLifecycleConfig(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNotebookInstanceLifecycleConfigRequest> request = null;
        Response<CreateNotebookInstanceLifecycleConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNotebookInstanceLifecycleConfigRequestMarshaller()
                        .marshall(createNotebookInstanceLifecycleConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateNotebookInstanceLifecycleConfigResult, JsonUnmarshallerContext> unmarshaller = new CreateNotebookInstanceLifecycleConfigResultJsonUnmarshaller();
            JsonResponseHandler<CreateNotebookInstanceLifecycleConfigResult> responseHandler = new JsonResponseHandler<CreateNotebookInstanceLifecycleConfigResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a URL for a specified UserProfile in a Domain. When accessed in a
     * web browser, the user will be automatically signed in to Amazon SageMaker
     * Studio, and granted access to all of the Apps and files associated with
     * that Amazon Elastic File System (EFS). This operation can only be called
     * when AuthMode equals IAM.
     * </p>
     * 
     * @param createPresignedDomainUrlRequest
     * @return createPresignedDomainUrlResult The response from the
     *         CreatePresignedDomainUrl service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreatePresignedDomainUrlResult createPresignedDomainUrl(
            CreatePresignedDomainUrlRequest createPresignedDomainUrlRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPresignedDomainUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresignedDomainUrlRequest> request = null;
        Response<CreatePresignedDomainUrlResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresignedDomainUrlRequestMarshaller()
                        .marshall(createPresignedDomainUrlRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePresignedDomainUrlResult, JsonUnmarshallerContext> unmarshaller = new CreatePresignedDomainUrlResultJsonUnmarshaller();
            JsonResponseHandler<CreatePresignedDomainUrlResult> responseHandler = new JsonResponseHandler<CreatePresignedDomainUrlResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a
     * notebook instance. In the Amazon SageMaker console, when you choose
     * <code>Open</code> next to a notebook instance, Amazon SageMaker opens a
     * new tab showing the Jupyter server home page from the notebook instance.
     * The console uses this API to get the URL and show the page.
     * </p>
     * <p>
     * IAM authorization policies for this API are also enforced for every HTTP
     * request and WebSocket frame that attempts to connect to the notebook
     * instance.For example, you can restrict access to this API and to the URL
     * that it returns to a list of IP addresses that you specify. Use the
     * <code>NotIpAddress</code> condition operator and the
     * <code>aws:SourceIP</code> condition context key to specify the list of IP
     * addresses that you want to have access to the notebook instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/security_iam_id-based-policy-examples.html#nbi-ip-filter"
     * >Limit Access to a Notebook Instance by IP Address</a>.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to
     * <a>CreatePresignedNotebookInstanceUrl</a> is valid only for 5 minutes. If
     * you try to use the URL after the 5-minute limit expires, you are directed
     * to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @return createPresignedNotebookInstanceUrlResult The response from the
     *         CreatePresignedNotebookInstanceUrl service method, as returned by
     *         Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreatePresignedNotebookInstanceUrlResult createPresignedNotebookInstanceUrl(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPresignedNotebookInstanceUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePresignedNotebookInstanceUrlRequest> request = null;
        Response<CreatePresignedNotebookInstanceUrlResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePresignedNotebookInstanceUrlRequestMarshaller()
                        .marshall(createPresignedNotebookInstanceUrlRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePresignedNotebookInstanceUrlResult, JsonUnmarshallerContext> unmarshaller = new CreatePresignedNotebookInstanceUrlResultJsonUnmarshaller();
            JsonResponseHandler<CreatePresignedNotebookInstanceUrlResult> responseHandler = new JsonResponseHandler<CreatePresignedNotebookInstanceUrlResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a processing job.
     * </p>
     * 
     * @param createProcessingJobRequest
     * @return createProcessingJobResult The response from the
     *         CreateProcessingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateProcessingJobResult createProcessingJob(
            CreateProcessingJobRequest createProcessingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProcessingJobRequest> request = null;
        Response<CreateProcessingJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProcessingJobRequestMarshaller()
                        .marshall(createProcessingJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProcessingJobResult, JsonUnmarshallerContext> unmarshaller = new CreateProcessingJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateProcessingJobResult> responseHandler = new JsonResponseHandler<CreateProcessingJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a model training job. After training completes, Amazon SageMaker
     * saves the resulting model artifacts to an Amazon S3 location that you
     * specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services,
     * you can use the resulting model artifacts as part of the model. You can
     * also use the artifacts in a machine learning service other than Amazon
     * SageMaker, provided that you know how to use them for inferences.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmSpecification</code> - Identifies the training algorithm
     * to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HyperParameters</code> - Specify these algorithm-specific
     * parameters to enable the estimation of model parameters during training.
     * Hyperparameters can be tuned to optimize this learning process. For a
     * list of hyperparameters for each training algorithm provided by Amazon
     * SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the
     * Amazon S3, EFS, or FSx location where it is stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 bucket where you
     * want Amazon SageMaker to save the results of model training.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>ResourceConfig</code> - Identifies the resources, ML compute
     * instances, and ML storage volumes to deploy for model training. In
     * distributed training, you specify more than one instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableManagedSpotTraining</code> - Optimize the cost of training
     * machine learning models by up to 80% by using Amazon EC2 Spot instances.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     * >Managed Spot Training</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoleARN</code> - The Amazon Resource Number (ARN) that Amazon
     * SageMaker assumes to perform tasks on your behalf during model training.
     * You must grant this role the necessary permissions so that Amazon
     * SageMaker can successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - To help cap training costs, use
     * <code>MaxRuntimeInSeconds</code> to set a time limit for training. Use
     * <code>MaxWaitTimeInSeconds</code> to specify how long you are willing to
     * wait for a managed spot training job to complete.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
     * It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @return createTrainingJobResult The response from the CreateTrainingJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateTrainingJobResult createTrainingJob(
            CreateTrainingJobRequest createTrainingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrainingJobRequest> request = null;
        Response<CreateTrainingJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrainingJobRequestMarshaller()
                        .marshall(createTrainingJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTrainingJobResult, JsonUnmarshallerContext> unmarshaller = new CreateTrainingJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateTrainingJobResult> responseHandler = new JsonResponseHandler<CreateTrainingJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a transform job. A transform job uses a trained model to get
     * inferences on a dataset and saves these results to an Amazon S3 location
     * that you specify.
     * </p>
     * <p>
     * To perform batch transformations, you create a transform job and use the
     * data that you have readily available.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TransformJobName</code> - Identifies the transform job. The name
     * must be unique within an AWS Region in an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModelName</code> - Identifies the model to use.
     * <code>ModelName</code> must be the name of an existing Amazon SageMaker
     * model in the same AWS Region and AWS account. For information on creating
     * a model, see <a>CreateModel</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformInput</code> - Describes the dataset to be transformed and
     * the Amazon S3 location where it is stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformOutput</code> - Identifies the Amazon S3 location where
     * you want Amazon SageMaker to save the results from the transform job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformResources</code> - Identifies the ML compute instances for
     * the transform job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how batch transformation works, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html"
     * >Batch Transform</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @return createTransformJobResult The response from the CreateTransformJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateTransformJobResult createTransformJob(
            CreateTransformJobRequest createTransformJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTransformJobRequest> request = null;
        Response<CreateTransformJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTransformJobRequestMarshaller()
                        .marshall(createTransformJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTransformJobResult, JsonUnmarshallerContext> unmarshaller = new CreateTransformJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateTransformJobResult> responseHandler = new JsonResponseHandler<CreateTransformJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an Amazon SageMaker <i>trial</i>. A trial is a set of steps
     * called <i>trial components</i> that produce a machine learning model. A
     * trial is part of a single Amazon SageMaker <i>experiment</i>.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK,
     * all experiments, trials, and trial components are automatically tracked,
     * logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial and then use the <a>Search</a> API to search
     * for the tags.
     * </p>
     * <p>
     * To get a list of all your trials, call the <a>ListTrials</a> API. To view
     * a trial's properties, call the <a>DescribeTrial</a> API. To create a
     * trial component, call the <a>CreateTrialComponent</a> API.
     * </p>
     * 
     * @param createTrialRequest
     * @return createTrialResult The response from the CreateTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateTrialResult createTrial(CreateTrialRequest createTrialRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrialRequest> request = null;
        Response<CreateTrialResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrialRequestMarshaller().marshall(createTrialRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTrialResult, JsonUnmarshallerContext> unmarshaller = new CreateTrialResultJsonUnmarshaller();
            JsonResponseHandler<CreateTrialResult> responseHandler = new JsonResponseHandler<CreateTrialResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <i>trial component</i>, which is a stage of a machine learning
     * <i>trial</i>. A trial is composed of one or more trial components. A
     * trial component can be used in multiple trials.
     * </p>
     * <p>
     * Trial components include pre-processing jobs, training jobs, and batch
     * transform jobs.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK,
     * all experiments, trials, and trial components are automatically tracked,
     * logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial component and then use the <a>Search</a> API
     * to search for the tags.
     * </p>
     * <note>
     * <p>
     * <code>CreateTrialComponent</code> can only be invoked from within an
     * Amazon SageMaker managed environment. This includes Amazon SageMaker
     * training jobs, processing jobs, transform jobs, and Amazon SageMaker
     * notebooks. A call to <code>CreateTrialComponent</code> from outside one
     * of these environments results in an error.
     * </p>
     * </note>
     * 
     * @param createTrialComponentRequest
     * @return createTrialComponentResult The response from the
     *         CreateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateTrialComponentResult createTrialComponent(
            CreateTrialComponentRequest createTrialComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrialComponentRequest> request = null;
        Response<CreateTrialComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrialComponentRequestMarshaller()
                        .marshall(createTrialComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTrialComponentResult, JsonUnmarshallerContext> unmarshaller = new CreateTrialComponentResultJsonUnmarshaller();
            JsonResponseHandler<CreateTrialComponentResult> responseHandler = new JsonResponseHandler<CreateTrialComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a user profile. A user profile represents a single user within a
     * Domain, and is the main way to reference a "person" for the purposes of
     * sharing, reporting and other user-oriented features. This entity is
     * created during on-boarding to Amazon SageMaker Studio. If an
     * administrator invites a person by email or imports them from SSO, a
     * UserProfile is automatically created.
     * </p>
     * <p>
     * This entity is the primary holder of settings for an individual user and,
     * through the domain, has a reference to the user's private Amazon Elastic
     * File System (EFS) home directory.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return createUserProfileResult The response from the CreateUserProfile
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateUserProfileResult createUserProfile(
            CreateUserProfileRequest createUserProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserProfileRequest> request = null;
        Response<CreateUserProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserProfileRequestMarshaller()
                        .marshall(createUserProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserProfileResult, JsonUnmarshallerContext> unmarshaller = new CreateUserProfileResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserProfileResult> responseHandler = new JsonResponseHandler<CreateUserProfileResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new work team for labeling your data. A work team is defined by
     * one or more Amazon Cognito user pools. You must first create the user
     * pools before you can create a work team.
     * </p>
     * <p>
     * You cannot create more than 25 work teams in an account and region.
     * </p>
     * 
     * @param createWorkteamRequest
     * @return createWorkteamResult The response from the CreateWorkteam service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateWorkteamResult createWorkteam(CreateWorkteamRequest createWorkteamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkteamRequest> request = null;
        Response<CreateWorkteamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkteamRequestMarshaller().marshall(createWorkteamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateWorkteamResult, JsonUnmarshallerContext> unmarshaller = new CreateWorkteamResultJsonUnmarshaller();
            JsonResponseHandler<CreateWorkteamResult> responseHandler = new JsonResponseHandler<CreateWorkteamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteAlgorithm(DeleteAlgorithmRequest deleteAlgorithmRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAlgorithmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlgorithmRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlgorithmRequestMarshaller().marshall(deleteAlgorithmRequest);
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
     * Used to stop and delete an app.
     * </p>
     * 
     * @param deleteAppRequest
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteApp(DeleteAppRequest deleteAppRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestMarshaller().marshall(deleteAppRequest);
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
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteCodeRepository(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCodeRepositoryRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCodeRepositoryRequestMarshaller()
                        .marshall(deleteCodeRepositoryRequest);
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
     * Used to delete a domain. Use with caution. If
     * <code>RetentionPolicy</code> is set to <code>Delete</code>, all of the
     * members of the domain will lose access to their EFS volume, including
     * data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteDomainRequest
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteDomain(DeleteDomainRequest deleteDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestMarshaller().marshall(deleteDomainRequest);
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
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that
     * were deployed when the endpoint was created.
     * </p>
     * <p>
     * Amazon SageMaker retires any custom KMS key grants associated with the
     * endpoint, meaning you don't need to use the <a href=
     * "http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html"
     * >RevokeGrant</a> API call.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestMarshaller().marshall(deleteEndpointRequest);
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
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code>
     * API deletes only the specified configuration. It does not delete
     * endpoints created using the configuration.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteEndpointConfig(DeleteEndpointConfigRequest deleteEndpointConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointConfigRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointConfigRequestMarshaller()
                        .marshall(deleteEndpointConfigRequest);
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
     * Deletes an Amazon SageMaker experiment. All trials associated with the
     * experiment must be deleted first. Use the <a>ListTrials</a> API to get a
     * list of the trials associated with the experiment.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @return deleteExperimentResult The response from the DeleteExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteExperimentResult deleteExperiment(DeleteExperimentRequest deleteExperimentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExperimentRequest> request = null;
        Response<DeleteExperimentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExperimentRequestMarshaller().marshall(deleteExperimentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteExperimentResult, JsonUnmarshallerContext> unmarshaller = new DeleteExperimentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteExperimentResult> responseHandler = new JsonResponseHandler<DeleteExperimentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified flow definition.
     * </p>
     * 
     * @param deleteFlowDefinitionRequest
     * @return deleteFlowDefinitionResult The response from the
     *         DeleteFlowDefinition service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteFlowDefinitionResult deleteFlowDefinition(
            DeleteFlowDefinitionRequest deleteFlowDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFlowDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowDefinitionRequest> request = null;
        Response<DeleteFlowDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowDefinitionRequestMarshaller()
                        .marshall(deleteFlowDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFlowDefinitionResult, JsonUnmarshallerContext> unmarshaller = new DeleteFlowDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFlowDefinitionResult> responseHandler = new JsonResponseHandler<DeleteFlowDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model
     * entry that was created in Amazon SageMaker when you called the
     * <a>CreateModel</a> API. It does not delete model artifacts, inference
     * code, or the IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteModel(DeleteModelRequest deleteModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestMarshaller().marshall(deleteModelRequest);
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
     * Deletes a model package.
     * </p>
     * <p>
     * A model package is used to create Amazon SageMaker models or list on AWS
     * Marketplace. Buyers can subscribe to model packages listed on AWS
     * Marketplace to create models in Amazon SageMaker.
     * </p>
     * 
     * @param deleteModelPackageRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteModelPackage(DeleteModelPackageRequest deleteModelPackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteModelPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelPackageRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelPackageRequestMarshaller()
                        .marshall(deleteModelPackageRequest);
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
     * Deletes a monitoring schedule. Also stops the schedule had not already
     * been stopped. This does not delete the job execution history of the
     * monitoring schedule.
     * </p>
     * 
     * @param deleteMonitoringScheduleRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteMonitoringSchedule(
            DeleteMonitoringScheduleRequest deleteMonitoringScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMonitoringScheduleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMonitoringScheduleRequestMarshaller()
                        .marshall(deleteMonitoringScheduleRequest);
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
     * Deletes an Amazon SageMaker notebook instance. Before you can delete a
     * notebook instance, you must call the <code>StopNotebookInstance</code>
     * API.
     * </p>
     * <important>
     * <p>
     * When you delete a notebook instance, you lose all of your data. Amazon
     * SageMaker removes the ML compute instance, and deletes the ML storage
     * volume and the network interface associated with the notebook instance.
     * </p>
     * </important>
     * 
     * @param deleteNotebookInstanceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteNotebookInstance(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotebookInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotebookInstanceRequestMarshaller()
                        .marshall(deleteNotebookInstanceRequest);
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
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteNotebookInstanceLifecycleConfig(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotebookInstanceLifecycleConfigRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotebookInstanceLifecycleConfigRequestMarshaller()
                        .marshall(deleteNotebookInstanceLifecycleConfigRequest);
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
     * Deletes the specified tags from an Amazon SageMaker resource.
     * </p>
     * <p>
     * To list a resource's tags, use the <code>ListTags</code> API.
     * </p>
     * <note>
     * <p>
     * When you call this API to delete tags from a hyperparameter tuning job,
     * the deleted tags are not removed from training jobs that the
     * hyperparameter tuning job launched before you called this API.
     * </p>
     * </note>
     * 
     * @param deleteTagsRequest
     * @return deleteTagsResult The response from the DeleteTags service method,
     *         as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestMarshaller().marshall(deleteTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTagsResult, JsonUnmarshallerContext> unmarshaller = new DeleteTagsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTagsResult> responseHandler = new JsonResponseHandler<DeleteTagsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified trial. All trial components that make up the trial
     * must be deleted first. Use the <a>DescribeTrialComponent</a> API to get
     * the list of trial components.
     * </p>
     * 
     * @param deleteTrialRequest
     * @return deleteTrialResult The response from the DeleteTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteTrialResult deleteTrial(DeleteTrialRequest deleteTrialRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrialRequest> request = null;
        Response<DeleteTrialResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrialRequestMarshaller().marshall(deleteTrialRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTrialResult, JsonUnmarshallerContext> unmarshaller = new DeleteTrialResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTrialResult> responseHandler = new JsonResponseHandler<DeleteTrialResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified trial component. A trial component must be
     * disassociated from all trials before the trial component can be deleted.
     * To disassociate a trial component from a trial, call the
     * <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param deleteTrialComponentRequest
     * @return deleteTrialComponentResult The response from the
     *         DeleteTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteTrialComponentResult deleteTrialComponent(
            DeleteTrialComponentRequest deleteTrialComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrialComponentRequest> request = null;
        Response<DeleteTrialComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrialComponentRequestMarshaller()
                        .marshall(deleteTrialComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTrialComponentResult, JsonUnmarshallerContext> unmarshaller = new DeleteTrialComponentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTrialComponentResult> responseHandler = new JsonResponseHandler<DeleteTrialComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserProfileRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserProfileRequestMarshaller()
                        .marshall(deleteUserProfileRequest);
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
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @return deleteWorkteamResult The response from the DeleteWorkteam service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteWorkteamResult deleteWorkteam(DeleteWorkteamRequest deleteWorkteamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkteamRequest> request = null;
        Response<DeleteWorkteamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkteamRequestMarshaller().marshall(deleteWorkteamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteWorkteamResult, JsonUnmarshallerContext> unmarshaller = new DeleteWorkteamResultJsonUnmarshaller();
            JsonResponseHandler<DeleteWorkteamResult> responseHandler = new JsonResponseHandler<DeleteWorkteamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return describeAlgorithmResult The response from the DescribeAlgorithm
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Describes the app.
     * </p>
     * 
     * @param describeAppRequest
     * @return describeAppResult The response from the DescribeApp service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAppResult describeApp(DescribeAppRequest describeAppRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppRequest> request = null;
        Response<DescribeAppResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppRequestMarshaller().marshall(describeAppRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAppResult, JsonUnmarshallerContext> unmarshaller = new DescribeAppResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAppResult> responseHandler = new JsonResponseHandler<DescribeAppResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about an Amazon SageMaker job.
     * </p>
     * 
     * @param describeAutoMLJobRequest
     * @return describeAutoMLJobResult The response from the DescribeAutoMLJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeAutoMLJobResult describeAutoMLJob(
            DescribeAutoMLJobRequest describeAutoMLJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoMLJobRequest> request = null;
        Response<DescribeAutoMLJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutoMLJobRequestMarshaller()
                        .marshall(describeAutoMLJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAutoMLJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeAutoMLJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAutoMLJobResult> responseHandler = new JsonResponseHandler<DescribeAutoMLJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @return describeCodeRepositoryResult The response from the
     *         DescribeCodeRepository service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeCodeRepositoryResult describeCodeRepository(
            DescribeCodeRepositoryRequest describeCodeRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCodeRepositoryRequest> request = null;
        Response<DescribeCodeRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCodeRepositoryRequestMarshaller()
                        .marshall(describeCodeRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCodeRepositoryResult, JsonUnmarshallerContext> unmarshaller = new DescribeCodeRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCodeRepositoryResult> responseHandler = new JsonResponseHandler<DescribeCodeRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a model compilation job.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To
     * get information about multiple model compilation jobs, use
     * <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param describeCompilationJobRequest
     * @return describeCompilationJobResult The response from the
     *         DescribeCompilationJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeCompilationJobResult describeCompilationJob(
            DescribeCompilationJobRequest describeCompilationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCompilationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCompilationJobRequest> request = null;
        Response<DescribeCompilationJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCompilationJobRequestMarshaller()
                        .marshall(describeCompilationJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCompilationJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeCompilationJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCompilationJobResult> responseHandler = new JsonResponseHandler<DescribeCompilationJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The desciption of the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return describeDomainResult The response from the DescribeDomain service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestMarshaller().marshall(describeDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDomainResult, JsonUnmarshallerContext> unmarshaller = new DescribeDomainResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDomainResult> responseHandler = new JsonResponseHandler<DescribeDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return describeEndpointResult The response from the DescribeEndpoint
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointRequest> request = null;
        Response<DescribeEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointRequestMarshaller().marshall(describeEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointResult> responseHandler = new JsonResponseHandler<DescribeEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the
     * <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @return describeEndpointConfigResult The response from the
     *         DescribeEndpointConfig service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEndpointConfigResult describeEndpointConfig(
            DescribeEndpointConfigRequest describeEndpointConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEndpointConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointConfigRequest> request = null;
        Response<DescribeEndpointConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointConfigRequestMarshaller()
                        .marshall(describeEndpointConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointConfigResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointConfigResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointConfigResult> responseHandler = new JsonResponseHandler<DescribeEndpointConfigResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides a list of an experiment's properties.
     * </p>
     * 
     * @param describeExperimentRequest
     * @return describeExperimentResult The response from the DescribeExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeExperimentResult describeExperiment(
            DescribeExperimentRequest describeExperimentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExperimentRequest> request = null;
        Response<DescribeExperimentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExperimentRequestMarshaller()
                        .marshall(describeExperimentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeExperimentResult, JsonUnmarshallerContext> unmarshaller = new DescribeExperimentResultJsonUnmarshaller();
            JsonResponseHandler<DescribeExperimentResult> responseHandler = new JsonResponseHandler<DescribeExperimentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the specified flow definition.
     * </p>
     * 
     * @param describeFlowDefinitionRequest
     * @return describeFlowDefinitionResult The response from the
     *         DescribeFlowDefinition service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeFlowDefinitionResult describeFlowDefinition(
            DescribeFlowDefinitionRequest describeFlowDefinitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeFlowDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFlowDefinitionRequest> request = null;
        Response<DescribeFlowDefinitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFlowDefinitionRequestMarshaller()
                        .marshall(describeFlowDefinitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeFlowDefinitionResult, JsonUnmarshallerContext> unmarshaller = new DescribeFlowDefinitionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeFlowDefinitionResult> responseHandler = new JsonResponseHandler<DescribeFlowDefinitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the requested human task user interface.
     * </p>
     * 
     * @param describeHumanTaskUiRequest
     * @return describeHumanTaskUiResult The response from the
     *         DescribeHumanTaskUi service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeHumanTaskUiResult describeHumanTaskUi(
            DescribeHumanTaskUiRequest describeHumanTaskUiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHumanTaskUiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHumanTaskUiRequest> request = null;
        Response<DescribeHumanTaskUiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHumanTaskUiRequestMarshaller()
                        .marshall(describeHumanTaskUiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeHumanTaskUiResult, JsonUnmarshallerContext> unmarshaller = new DescribeHumanTaskUiResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHumanTaskUiResult> responseHandler = new JsonResponseHandler<DescribeHumanTaskUiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @return describeHyperParameterTuningJobResult The response from the
     *         DescribeHyperParameterTuningJob service method, as returned by
     *         Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeHyperParameterTuningJobResult describeHyperParameterTuningJob(
            DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHyperParameterTuningJobRequest> request = null;
        Response<DescribeHyperParameterTuningJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHyperParameterTuningJobRequestMarshaller()
                        .marshall(describeHyperParameterTuningJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeHyperParameterTuningJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeHyperParameterTuningJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHyperParameterTuningJobResult> responseHandler = new JsonResponseHandler<DescribeHyperParameterTuningJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @return describeLabelingJobResult The response from the
     *         DescribeLabelingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeLabelingJobResult describeLabelingJob(
            DescribeLabelingJobRequest describeLabelingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLabelingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLabelingJobRequest> request = null;
        Response<DescribeLabelingJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLabelingJobRequestMarshaller()
                        .marshall(describeLabelingJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeLabelingJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeLabelingJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLabelingJobResult> responseHandler = new JsonResponseHandler<DescribeLabelingJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code>
     * API.
     * </p>
     * 
     * @param describeModelRequest
     * @return describeModelResult The response from the DescribeModel service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeModelResult describeModel(DescribeModelRequest describeModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelRequest> request = null;
        Response<DescribeModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelRequestMarshaller().marshall(describeModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeModelResult, JsonUnmarshallerContext> unmarshaller = new DescribeModelResultJsonUnmarshaller();
            JsonResponseHandler<DescribeModelResult> responseHandler = new JsonResponseHandler<DescribeModelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a description of the specified model package, which is used to
     * create Amazon SageMaker models or list them on AWS Marketplace.
     * </p>
     * <p>
     * To create models in Amazon SageMaker, buyers can subscribe to model
     * packages listed on AWS Marketplace.
     * </p>
     * 
     * @param describeModelPackageRequest
     * @return describeModelPackageResult The response from the
     *         DescribeModelPackage service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeModelPackageResult describeModelPackage(
            DescribeModelPackageRequest describeModelPackageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeModelPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelPackageRequest> request = null;
        Response<DescribeModelPackageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelPackageRequestMarshaller()
                        .marshall(describeModelPackageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeModelPackageResult, JsonUnmarshallerContext> unmarshaller = new DescribeModelPackageResultJsonUnmarshaller();
            JsonResponseHandler<DescribeModelPackageResult> responseHandler = new JsonResponseHandler<DescribeModelPackageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the schedule for a monitoring job.
     * </p>
     * 
     * @param describeMonitoringScheduleRequest
     * @return describeMonitoringScheduleResult The response from the
     *         DescribeMonitoringSchedule service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeMonitoringScheduleResult describeMonitoringSchedule(
            DescribeMonitoringScheduleRequest describeMonitoringScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMonitoringScheduleRequest> request = null;
        Response<DescribeMonitoringScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMonitoringScheduleRequestMarshaller()
                        .marshall(describeMonitoringScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMonitoringScheduleResult, JsonUnmarshallerContext> unmarshaller = new DescribeMonitoringScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMonitoringScheduleResult> responseHandler = new JsonResponseHandler<DescribeMonitoringScheduleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @return describeNotebookInstanceResult The response from the
     *         DescribeNotebookInstance service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeNotebookInstanceResult describeNotebookInstance(
            DescribeNotebookInstanceRequest describeNotebookInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotebookInstanceRequest> request = null;
        Response<DescribeNotebookInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotebookInstanceRequestMarshaller()
                        .marshall(describeNotebookInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeNotebookInstanceResult, JsonUnmarshallerContext> unmarshaller = new DescribeNotebookInstanceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeNotebookInstanceResult> responseHandler = new JsonResponseHandler<DescribeNotebookInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a description of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param describeNotebookInstanceLifecycleConfigRequest
     * @return describeNotebookInstanceLifecycleConfigResult The response from
     *         the DescribeNotebookInstanceLifecycleConfig service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotebookInstanceLifecycleConfigRequest> request = null;
        Response<DescribeNotebookInstanceLifecycleConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotebookInstanceLifecycleConfigRequestMarshaller()
                        .marshall(describeNotebookInstanceLifecycleConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeNotebookInstanceLifecycleConfigResult, JsonUnmarshallerContext> unmarshaller = new DescribeNotebookInstanceLifecycleConfigResultJsonUnmarshaller();
            JsonResponseHandler<DescribeNotebookInstanceLifecycleConfigResult> responseHandler = new JsonResponseHandler<DescribeNotebookInstanceLifecycleConfigResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a description of a processing job.
     * </p>
     * 
     * @param describeProcessingJobRequest
     * @return describeProcessingJobResult The response from the
     *         DescribeProcessingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeProcessingJobResult describeProcessingJob(
            DescribeProcessingJobRequest describeProcessingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProcessingJobRequest> request = null;
        Response<DescribeProcessingJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProcessingJobRequestMarshaller()
                        .marshall(describeProcessingJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeProcessingJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeProcessingJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeProcessingJobResult> responseHandler = new JsonResponseHandler<DescribeProcessingJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns
     * details about the subscription with a vendor in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @return describeSubscribedWorkteamResult The response from the
     *         DescribeSubscribedWorkteam service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeSubscribedWorkteamResult describeSubscribedWorkteam(
            DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSubscribedWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscribedWorkteamRequest> request = null;
        Response<DescribeSubscribedWorkteamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscribedWorkteamRequestMarshaller()
                        .marshall(describeSubscribedWorkteamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSubscribedWorkteamResult, JsonUnmarshallerContext> unmarshaller = new DescribeSubscribedWorkteamResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSubscribedWorkteamResult> responseHandler = new JsonResponseHandler<DescribeSubscribedWorkteamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @return describeTrainingJobResult The response from the
     *         DescribeTrainingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeTrainingJobResult describeTrainingJob(
            DescribeTrainingJobRequest describeTrainingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrainingJobRequest> request = null;
        Response<DescribeTrainingJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrainingJobRequestMarshaller()
                        .marshall(describeTrainingJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrainingJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrainingJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrainingJobResult> responseHandler = new JsonResponseHandler<DescribeTrainingJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @return describeTransformJobResult The response from the
     *         DescribeTransformJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeTransformJobResult describeTransformJob(
            DescribeTransformJobRequest describeTransformJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTransformJobRequest> request = null;
        Response<DescribeTransformJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTransformJobRequestMarshaller()
                        .marshall(describeTransformJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTransformJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeTransformJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTransformJobResult> responseHandler = new JsonResponseHandler<DescribeTransformJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides a list of a trial's properties.
     * </p>
     * 
     * @param describeTrialRequest
     * @return describeTrialResult The response from the DescribeTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeTrialResult describeTrial(DescribeTrialRequest describeTrialRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrialRequest> request = null;
        Response<DescribeTrialResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrialRequestMarshaller().marshall(describeTrialRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrialResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrialResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrialResult> responseHandler = new JsonResponseHandler<DescribeTrialResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides a list of a trials component's properties.
     * </p>
     * 
     * @param describeTrialComponentRequest
     * @return describeTrialComponentResult The response from the
     *         DescribeTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeTrialComponentResult describeTrialComponent(
            DescribeTrialComponentRequest describeTrialComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrialComponentRequest> request = null;
        Response<DescribeTrialComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrialComponentRequestMarshaller()
                        .marshall(describeTrialComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrialComponentResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrialComponentResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrialComponentResult> responseHandler = new JsonResponseHandler<DescribeTrialComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the user profile.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return describeUserProfileResult The response from the
     *         DescribeUserProfile service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeUserProfileResult describeUserProfile(
            DescribeUserProfileRequest describeUserProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserProfileRequest> request = null;
        Response<DescribeUserProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserProfileRequestMarshaller()
                        .marshall(describeUserProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserProfileResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserProfileResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserProfileResult> responseHandler = new JsonResponseHandler<DescribeUserProfileResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists private workforce information, including workforce name, Amazon
     * Resource Name (ARN), and, if applicable, allowed IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">
     * CIDRs</a>). Allowable IP address ranges are the IP addresses that workers
     * can use to access tasks.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param describeWorkforceRequest
     * @return describeWorkforceResult The response from the DescribeWorkforce
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeWorkforceResult describeWorkforce(
            DescribeWorkforceRequest describeWorkforceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeWorkforceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkforceRequest> request = null;
        Response<DescribeWorkforceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkforceRequestMarshaller()
                        .marshall(describeWorkforceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeWorkforceResult, JsonUnmarshallerContext> unmarshaller = new DescribeWorkforceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWorkforceResult> responseHandler = new JsonResponseHandler<DescribeWorkforceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about a specific work team. You can see information such
     * as the create date, the last updated date, membership information, and
     * the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @return describeWorkteamResult The response from the DescribeWorkteam
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeWorkteamResult describeWorkteam(DescribeWorkteamRequest describeWorkteamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkteamRequest> request = null;
        Response<DescribeWorkteamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkteamRequestMarshaller().marshall(describeWorkteamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeWorkteamResult, JsonUnmarshallerContext> unmarshaller = new DescribeWorkteamResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWorkteamResult> responseHandler = new JsonResponseHandler<DescribeWorkteamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Disassociates a trial component from a trial. This doesn't effect other
     * trials the component is associated with. Before you can delete a
     * component, you must disassociate the component from all trials it is
     * associated with. To associate a trial component with a trial, call the
     * <a>AssociateTrialComponent</a> API.
     * </p>
     * <p>
     * To get a list of the trials a component is associated with, use the
     * <a>Search</a> API. Specify <code>ExperimentTrialComponent</code> for the
     * <code>Resource</code> parameter. The list appears in the response under
     * <code>Results.TrialComponent.Parents</code>.
     * </p>
     * 
     * @param disassociateTrialComponentRequest
     * @return disassociateTrialComponentResult The response from the
     *         DisassociateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DisassociateTrialComponentResult disassociateTrialComponent(
            DisassociateTrialComponentRequest disassociateTrialComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTrialComponentRequest> request = null;
        Response<DisassociateTrialComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTrialComponentRequestMarshaller()
                        .marshall(disassociateTrialComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateTrialComponentResult, JsonUnmarshallerContext> unmarshaller = new DisassociateTrialComponentResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateTrialComponentResult> responseHandler = new JsonResponseHandler<DisassociateTrialComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker
     * console. It returns suggestions of possible matches for the property name
     * to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>
     * .
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @return getSearchSuggestionsResult The response from the
     *         GetSearchSuggestions service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetSearchSuggestionsResult getSearchSuggestions(
            GetSearchSuggestionsRequest getSearchSuggestionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSearchSuggestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSearchSuggestionsRequest> request = null;
        Response<GetSearchSuggestionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSearchSuggestionsRequestMarshaller()
                        .marshall(getSearchSuggestionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSearchSuggestionsResult, JsonUnmarshallerContext> unmarshaller = new GetSearchSuggestionsResultJsonUnmarshaller();
            JsonResponseHandler<GetSearchSuggestionsResult> responseHandler = new JsonResponseHandler<GetSearchSuggestionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @return listAlgorithmsResult The response from the ListAlgorithms service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAlgorithmsResult listAlgorithms(ListAlgorithmsRequest listAlgorithmsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAlgorithmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAlgorithmsRequest> request = null;
        Response<ListAlgorithmsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAlgorithmsRequestMarshaller().marshall(listAlgorithmsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAlgorithmsResult, JsonUnmarshallerContext> unmarshaller = new ListAlgorithmsResultJsonUnmarshaller();
            JsonResponseHandler<ListAlgorithmsResult> responseHandler = new JsonResponseHandler<ListAlgorithmsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists apps.
     * </p>
     * 
     * @param listAppsRequest
     * @return listAppsResult The response from the ListApps service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAppsResult listApps(ListAppsRequest listAppsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppsRequest> request = null;
        Response<ListAppsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppsRequestMarshaller().marshall(listAppsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAppsResult, JsonUnmarshallerContext> unmarshaller = new ListAppsResultJsonUnmarshaller();
            JsonResponseHandler<ListAppsResult> responseHandler = new JsonResponseHandler<ListAppsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Request a list of jobs.
     * </p>
     * 
     * @param listAutoMLJobsRequest
     * @return listAutoMLJobsResult The response from the ListAutoMLJobs service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListAutoMLJobsResult listAutoMLJobs(ListAutoMLJobsRequest listAutoMLJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAutoMLJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAutoMLJobsRequest> request = null;
        Response<ListAutoMLJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAutoMLJobsRequestMarshaller().marshall(listAutoMLJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAutoMLJobsResult, JsonUnmarshallerContext> unmarshaller = new ListAutoMLJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListAutoMLJobsResult> responseHandler = new JsonResponseHandler<ListAutoMLJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List the Candidates created for the job.
     * </p>
     * 
     * @param listCandidatesForAutoMLJobRequest
     * @return listCandidatesForAutoMLJobResult The response from the
     *         ListCandidatesForAutoMLJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListCandidatesForAutoMLJobResult listCandidatesForAutoMLJob(
            ListCandidatesForAutoMLJobRequest listCandidatesForAutoMLJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCandidatesForAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCandidatesForAutoMLJobRequest> request = null;
        Response<ListCandidatesForAutoMLJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCandidatesForAutoMLJobRequestMarshaller()
                        .marshall(listCandidatesForAutoMLJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCandidatesForAutoMLJobResult, JsonUnmarshallerContext> unmarshaller = new ListCandidatesForAutoMLJobResultJsonUnmarshaller();
            JsonResponseHandler<ListCandidatesForAutoMLJobResult> responseHandler = new JsonResponseHandler<ListCandidatesForAutoMLJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @return listCodeRepositoriesResult The response from the
     *         ListCodeRepositories service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListCodeRepositoriesResult listCodeRepositories(
            ListCodeRepositoriesRequest listCodeRepositoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCodeRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCodeRepositoriesRequest> request = null;
        Response<ListCodeRepositoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCodeRepositoriesRequestMarshaller()
                        .marshall(listCodeRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCodeRepositoriesResult, JsonUnmarshallerContext> unmarshaller = new ListCodeRepositoriesResultJsonUnmarshaller();
            JsonResponseHandler<ListCodeRepositoriesResult> responseHandler = new JsonResponseHandler<ListCodeRepositoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists model compilation jobs that satisfy various filters.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To
     * get information about a particular model compilation job you have
     * created, use <a>DescribeCompilationJob</a>.
     * </p>
     * 
     * @param listCompilationJobsRequest
     * @return listCompilationJobsResult The response from the
     *         ListCompilationJobs service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListCompilationJobsResult listCompilationJobs(
            ListCompilationJobsRequest listCompilationJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCompilationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCompilationJobsRequest> request = null;
        Response<ListCompilationJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCompilationJobsRequestMarshaller()
                        .marshall(listCompilationJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCompilationJobsResult, JsonUnmarshallerContext> unmarshaller = new ListCompilationJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListCompilationJobsResult> responseHandler = new JsonResponseHandler<ListCompilationJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return listDomainsResult The response from the ListDomains service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @return listEndpointConfigsResult The response from the
     *         ListEndpointConfigs service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListEndpointConfigsResult listEndpointConfigs(
            ListEndpointConfigsRequest listEndpointConfigsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEndpointConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointConfigsRequest> request = null;
        Response<ListEndpointConfigsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointConfigsRequestMarshaller()
                        .marshall(listEndpointConfigsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEndpointConfigsResult, JsonUnmarshallerContext> unmarshaller = new ListEndpointConfigsResultJsonUnmarshaller();
            JsonResponseHandler<ListEndpointConfigsResult> responseHandler = new JsonResponseHandler<ListEndpointConfigsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return listEndpointsResult The response from the ListEndpoints service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListEndpointsResult listEndpoints(ListEndpointsRequest listEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointsRequest> request = null;
        Response<ListEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointsRequestMarshaller().marshall(listEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEndpointsResult, JsonUnmarshallerContext> unmarshaller = new ListEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<ListEndpointsResult> responseHandler = new JsonResponseHandler<ListEndpointsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all the experiments in your account. The list can be filtered to
     * show only experiments that were created in a specific time range. The
     * list can be sorted by experiment name or creation time.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return listExperimentsResult The response from the ListExperiments
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListExperimentsResult listExperiments(ListExperimentsRequest listExperimentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listExperimentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExperimentsRequest> request = null;
        Response<ListExperimentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExperimentsRequestMarshaller().marshall(listExperimentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListExperimentsResult, JsonUnmarshallerContext> unmarshaller = new ListExperimentsResultJsonUnmarshaller();
            JsonResponseHandler<ListExperimentsResult> responseHandler = new JsonResponseHandler<ListExperimentsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the flow definitions in your account.
     * </p>
     * 
     * @param listFlowDefinitionsRequest
     * @return listFlowDefinitionsResult The response from the
     *         ListFlowDefinitions service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListFlowDefinitionsResult listFlowDefinitions(
            ListFlowDefinitionsRequest listFlowDefinitionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFlowDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowDefinitionsRequest> request = null;
        Response<ListFlowDefinitionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowDefinitionsRequestMarshaller()
                        .marshall(listFlowDefinitionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFlowDefinitionsResult, JsonUnmarshallerContext> unmarshaller = new ListFlowDefinitionsResultJsonUnmarshaller();
            JsonResponseHandler<ListFlowDefinitionsResult> responseHandler = new JsonResponseHandler<ListFlowDefinitionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about the human task user interfaces in your account.
     * </p>
     * 
     * @param listHumanTaskUisRequest
     * @return listHumanTaskUisResult The response from the ListHumanTaskUis
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListHumanTaskUisResult listHumanTaskUis(ListHumanTaskUisRequest listHumanTaskUisRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listHumanTaskUisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHumanTaskUisRequest> request = null;
        Response<ListHumanTaskUisResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHumanTaskUisRequestMarshaller().marshall(listHumanTaskUisRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListHumanTaskUisResult, JsonUnmarshallerContext> unmarshaller = new ListHumanTaskUisResultJsonUnmarshaller();
            JsonResponseHandler<ListHumanTaskUisResult> responseHandler = new JsonResponseHandler<ListHumanTaskUisResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that
     * describe the hyperparameter tuning jobs launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @return listHyperParameterTuningJobsResult The response from the
     *         ListHyperParameterTuningJobs service method, as returned by
     *         Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(
            ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listHyperParameterTuningJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHyperParameterTuningJobsRequest> request = null;
        Response<ListHyperParameterTuningJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHyperParameterTuningJobsRequestMarshaller()
                        .marshall(listHyperParameterTuningJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListHyperParameterTuningJobsResult, JsonUnmarshallerContext> unmarshaller = new ListHyperParameterTuningJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListHyperParameterTuningJobsResult> responseHandler = new JsonResponseHandler<ListHyperParameterTuningJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @return listLabelingJobsResult The response from the ListLabelingJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListLabelingJobsResult listLabelingJobs(ListLabelingJobsRequest listLabelingJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLabelingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLabelingJobsRequest> request = null;
        Response<ListLabelingJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLabelingJobsRequestMarshaller().marshall(listLabelingJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLabelingJobsResult, JsonUnmarshallerContext> unmarshaller = new ListLabelingJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListLabelingJobsResult> responseHandler = new JsonResponseHandler<ListLabelingJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @return listLabelingJobsForWorkteamResult The response from the
     *         ListLabelingJobsForWorkteam service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListLabelingJobsForWorkteamResult listLabelingJobsForWorkteam(
            ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listLabelingJobsForWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLabelingJobsForWorkteamRequest> request = null;
        Response<ListLabelingJobsForWorkteamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLabelingJobsForWorkteamRequestMarshaller()
                        .marshall(listLabelingJobsForWorkteamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListLabelingJobsForWorkteamResult, JsonUnmarshallerContext> unmarshaller = new ListLabelingJobsForWorkteamResultJsonUnmarshaller();
            JsonResponseHandler<ListLabelingJobsForWorkteamResult> responseHandler = new JsonResponseHandler<ListLabelingJobsForWorkteamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @return listModelPackagesResult The response from the ListModelPackages
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListModelPackagesResult listModelPackages(
            ListModelPackagesRequest listModelPackagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listModelPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelPackagesRequest> request = null;
        Response<ListModelPackagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelPackagesRequestMarshaller()
                        .marshall(listModelPackagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListModelPackagesResult, JsonUnmarshallerContext> unmarshaller = new ListModelPackagesResultJsonUnmarshaller();
            JsonResponseHandler<ListModelPackagesResult> responseHandler = new JsonResponseHandler<ListModelPackagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists models created with the <a>CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @return listModelsResult The response from the ListModels service method,
     *         as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListModelsResult listModels(ListModelsRequest listModelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListModelsRequest> request = null;
        Response<ListModelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListModelsRequestMarshaller().marshall(listModelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListModelsResult, JsonUnmarshallerContext> unmarshaller = new ListModelsResultJsonUnmarshaller();
            JsonResponseHandler<ListModelsResult> responseHandler = new JsonResponseHandler<ListModelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns list of all monitoring job executions.
     * </p>
     * 
     * @param listMonitoringExecutionsRequest
     * @return listMonitoringExecutionsResult The response from the
     *         ListMonitoringExecutions service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListMonitoringExecutionsResult listMonitoringExecutions(
            ListMonitoringExecutionsRequest listMonitoringExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMonitoringExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitoringExecutionsRequest> request = null;
        Response<ListMonitoringExecutionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitoringExecutionsRequestMarshaller()
                        .marshall(listMonitoringExecutionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMonitoringExecutionsResult, JsonUnmarshallerContext> unmarshaller = new ListMonitoringExecutionsResultJsonUnmarshaller();
            JsonResponseHandler<ListMonitoringExecutionsResult> responseHandler = new JsonResponseHandler<ListMonitoringExecutionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns list of all monitoring schedules.
     * </p>
     * 
     * @param listMonitoringSchedulesRequest
     * @return listMonitoringSchedulesResult The response from the
     *         ListMonitoringSchedules service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListMonitoringSchedulesResult listMonitoringSchedules(
            ListMonitoringSchedulesRequest listMonitoringSchedulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMonitoringSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitoringSchedulesRequest> request = null;
        Response<ListMonitoringSchedulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitoringSchedulesRequestMarshaller()
                        .marshall(listMonitoringSchedulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMonitoringSchedulesResult, JsonUnmarshallerContext> unmarshaller = new ListMonitoringSchedulesResultJsonUnmarshaller();
            JsonResponseHandler<ListMonitoringSchedulesResult> responseHandler = new JsonResponseHandler<ListMonitoringSchedulesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the
     * <a>CreateNotebookInstanceLifecycleConfig</a> API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @return listNotebookInstanceLifecycleConfigsResult The response from the
     *         ListNotebookInstanceLifecycleConfigs service method, as returned
     *         by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListNotebookInstanceLifecycleConfigsResult listNotebookInstanceLifecycleConfigs(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listNotebookInstanceLifecycleConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotebookInstanceLifecycleConfigsRequest> request = null;
        Response<ListNotebookInstanceLifecycleConfigsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotebookInstanceLifecycleConfigsRequestMarshaller()
                        .marshall(listNotebookInstanceLifecycleConfigsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListNotebookInstanceLifecycleConfigsResult, JsonUnmarshallerContext> unmarshaller = new ListNotebookInstanceLifecycleConfigsResultJsonUnmarshaller();
            JsonResponseHandler<ListNotebookInstanceLifecycleConfigsResult> responseHandler = new JsonResponseHandler<ListNotebookInstanceLifecycleConfigsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the
     * requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @return listNotebookInstancesResult The response from the
     *         ListNotebookInstances service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListNotebookInstancesResult listNotebookInstances(
            ListNotebookInstancesRequest listNotebookInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listNotebookInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotebookInstancesRequest> request = null;
        Response<ListNotebookInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotebookInstancesRequestMarshaller()
                        .marshall(listNotebookInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListNotebookInstancesResult, JsonUnmarshallerContext> unmarshaller = new ListNotebookInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListNotebookInstancesResult> responseHandler = new JsonResponseHandler<ListNotebookInstancesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists processing jobs that satisfy various filters.
     * </p>
     * 
     * @param listProcessingJobsRequest
     * @return listProcessingJobsResult The response from the ListProcessingJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListProcessingJobsResult listProcessingJobs(
            ListProcessingJobsRequest listProcessingJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProcessingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProcessingJobsRequest> request = null;
        Response<ListProcessingJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProcessingJobsRequestMarshaller()
                        .marshall(listProcessingJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProcessingJobsResult, JsonUnmarshallerContext> unmarshaller = new ListProcessingJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListProcessingJobsResult> responseHandler = new JsonResponseHandler<ListProcessingJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS
     * Marketplace. The list may be empty if no work team satisfies the filter
     * specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @return listSubscribedWorkteamsResult The response from the
     *         ListSubscribedWorkteams service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListSubscribedWorkteamsResult listSubscribedWorkteams(
            ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSubscribedWorkteamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSubscribedWorkteamsRequest> request = null;
        Response<ListSubscribedWorkteamsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSubscribedWorkteamsRequestMarshaller()
                        .marshall(listSubscribedWorkteamsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSubscribedWorkteamsResult, JsonUnmarshallerContext> unmarshaller = new ListSubscribedWorkteamsResultJsonUnmarshaller();
            JsonResponseHandler<ListSubscribedWorkteamsResult> responseHandler = new JsonResponseHandler<ListSubscribedWorkteamsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListTagsResult listTags(ListTagsRequest listTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestMarshaller().marshall(listTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsResult, JsonUnmarshallerContext> unmarshaller = new ListTagsResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsResult> responseHandler = new JsonResponseHandler<ListTagsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * 
     * @param listTrainingJobsRequest
     * @return listTrainingJobsResult The response from the ListTrainingJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListTrainingJobsResult listTrainingJobs(ListTrainingJobsRequest listTrainingJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTrainingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrainingJobsRequest> request = null;
        Response<ListTrainingJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrainingJobsRequestMarshaller().marshall(listTrainingJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTrainingJobsResult, JsonUnmarshallerContext> unmarshaller = new ListTrainingJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListTrainingJobsResult> responseHandler = new JsonResponseHandler<ListTrainingJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the
     * training jobs that a hyperparameter tuning job launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @return listTrainingJobsForHyperParameterTuningJobResult The response
     *         from the ListTrainingJobsForHyperParameterTuningJob service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListTrainingJobsForHyperParameterTuningJobResult listTrainingJobsForHyperParameterTuningJob(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTrainingJobsForHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrainingJobsForHyperParameterTuningJobRequest> request = null;
        Response<ListTrainingJobsForHyperParameterTuningJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrainingJobsForHyperParameterTuningJobRequestMarshaller()
                        .marshall(listTrainingJobsForHyperParameterTuningJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTrainingJobsForHyperParameterTuningJobResult, JsonUnmarshallerContext> unmarshaller = new ListTrainingJobsForHyperParameterTuningJobResultJsonUnmarshaller();
            JsonResponseHandler<ListTrainingJobsForHyperParameterTuningJobResult> responseHandler = new JsonResponseHandler<ListTrainingJobsForHyperParameterTuningJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @return listTransformJobsResult The response from the ListTransformJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListTransformJobsResult listTransformJobs(
            ListTransformJobsRequest listTransformJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTransformJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTransformJobsRequest> request = null;
        Response<ListTransformJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTransformJobsRequestMarshaller()
                        .marshall(listTransformJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTransformJobsResult, JsonUnmarshallerContext> unmarshaller = new ListTransformJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListTransformJobsResult> responseHandler = new JsonResponseHandler<ListTransformJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the trial components in your account. You can sort the list by
     * trial component name or creation time. You can filter the list to show
     * only components that were created in a specific time range. You can also
     * filter on one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExperimentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TrialName</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrialComponentsRequest
     * @return listTrialComponentsResult The response from the
     *         ListTrialComponents service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListTrialComponentsResult listTrialComponents(
            ListTrialComponentsRequest listTrialComponentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTrialComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrialComponentsRequest> request = null;
        Response<ListTrialComponentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrialComponentsRequestMarshaller()
                        .marshall(listTrialComponentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTrialComponentsResult, JsonUnmarshallerContext> unmarshaller = new ListTrialComponentsResultJsonUnmarshaller();
            JsonResponseHandler<ListTrialComponentsResult> responseHandler = new JsonResponseHandler<ListTrialComponentsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the trials in your account. Specify an experiment name to limit the
     * list to the trials that are part of that experiment. Specify a trial
     * component name to limit the list to the trials that associated with that
     * trial component. The list can be filtered to show only trials that were
     * created in a specific time range. The list can be sorted by trial name or
     * creation time.
     * </p>
     * 
     * @param listTrialsRequest
     * @return listTrialsResult The response from the ListTrials service method,
     *         as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListTrialsResult listTrials(ListTrialsRequest listTrialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTrialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrialsRequest> request = null;
        Response<ListTrialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrialsRequestMarshaller().marshall(listTrialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTrialsResult, JsonUnmarshallerContext> unmarshaller = new ListTrialsResultJsonUnmarshaller();
            JsonResponseHandler<ListTrialsResult> responseHandler = new JsonResponseHandler<ListTrialsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists user profiles.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return listUserProfilesResult The response from the ListUserProfiles
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest listUserProfilesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUserProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserProfilesRequest> request = null;
        Response<ListUserProfilesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserProfilesRequestMarshaller().marshall(listUserProfilesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUserProfilesResult, JsonUnmarshallerContext> unmarshaller = new ListUserProfilesResultJsonUnmarshaller();
            JsonResponseHandler<ListUserProfilesResult> responseHandler = new JsonResponseHandler<ListUserProfilesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of work teams that you have defined in a region. The list may
     * be empty if no work team satisfies the filter specified in the
     * <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @return listWorkteamsResult The response from the ListWorkteams service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListWorkteamsResult listWorkteams(ListWorkteamsRequest listWorkteamsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listWorkteamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkteamsRequest> request = null;
        Response<ListWorkteamsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkteamsRequestMarshaller().marshall(listWorkteamsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListWorkteamsResult, JsonUnmarshallerContext> unmarshaller = new ListWorkteamsResultJsonUnmarshaller();
            JsonResponseHandler<ListWorkteamsResult> responseHandler = new JsonResponseHandler<ListWorkteamsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @return renderUiTemplateResult The response from the RenderUiTemplate
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RenderUiTemplateResult renderUiTemplate(RenderUiTemplateRequest renderUiTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(renderUiTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RenderUiTemplateRequest> request = null;
        Response<RenderUiTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RenderUiTemplateRequestMarshaller().marshall(renderUiTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RenderUiTemplateResult, JsonUnmarshallerContext> unmarshaller = new RenderUiTemplateResultJsonUnmarshaller();
            JsonResponseHandler<RenderUiTemplateResult> responseHandler = new JsonResponseHandler<RenderUiTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching
     * resources are returned as a list of <code>SearchRecord</code> objects in
     * the response. You can sort the search results by any resource property in
     * a ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numeric, text, Boolean,
     * and timestamp.
     * </p>
     * 
     * @param searchRequest
     * @return searchResult The response from the Search service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public SearchResult search(SearchRequest searchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRequest> request = null;
        Response<SearchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRequestMarshaller().marshall(searchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchResult, JsonUnmarshallerContext> unmarshaller = new SearchResultJsonUnmarshaller();
            JsonResponseHandler<SearchResult> responseHandler = new JsonResponseHandler<SearchResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a previously stopped monitoring schedule.
     * </p>
     * <note>
     * <p>
     * New monitoring schedules are immediately started after creation.
     * </p>
     * </note>
     * 
     * @param startMonitoringScheduleRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void startMonitoringSchedule(
            StartMonitoringScheduleRequest startMonitoringScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMonitoringScheduleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMonitoringScheduleRequestMarshaller()
                        .marshall(startMonitoringScheduleRequest);
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
     * Launches an ML compute instance with the latest version of the libraries
     * and attaches your ML storage volume. After configuring the notebook
     * instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be
     * <code>InService</code> before you can connect to your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void startNotebookInstance(StartNotebookInstanceRequest startNotebookInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartNotebookInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartNotebookInstanceRequestMarshaller()
                        .marshall(startNotebookInstanceRequest);
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
     * A method for forcing the termination of a running job.
     * </p>
     * 
     * @param stopAutoMLJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopAutoMLJob(StopAutoMLJobRequest stopAutoMLJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopAutoMLJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAutoMLJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAutoMLJobRequestMarshaller().marshall(stopAutoMLJobRequest);
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
     * Stops a model compilation job.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal.
     * This gracefully shuts the job down. If the job hasn't stopped, it sends
     * the SIGKILL signal.
     * </p>
     * <p>
     * When it receives a <code>StopCompilationJob</code> request, Amazon
     * SageMaker changes the <a>CompilationJobSummary$CompilationJobStatus</a>
     * of the job to <code>Stopping</code>. After Amazon SageMaker stops the
     * job, it sets the <a>CompilationJobSummary$CompilationJobStatus</a> to
     * <code>Stopped</code>.
     * </p>
     * 
     * @param stopCompilationJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopCompilationJob(StopCompilationJobRequest stopCompilationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopCompilationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCompilationJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCompilationJobRequestMarshaller()
                        .marshall(stopCompilationJobRequest);
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
     * Stops a running hyperparameter tuning job and all running training jobs
     * that the tuning job launched.
     * </p>
     * <p>
     * All model artifacts output from the training jobs are stored in Amazon
     * Simple Storage Service (Amazon S3). All data that the training jobs write
     * to Amazon CloudWatch Logs are still available in CloudWatch. After the
     * tuning job moves to the <code>Stopped</code> state, it releases all
     * reserved resources for the tuning job.
     * </p>
     * 
     * @param stopHyperParameterTuningJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopHyperParameterTuningJob(
            StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopHyperParameterTuningJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopHyperParameterTuningJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopHyperParameterTuningJobRequestMarshaller()
                        .marshall(stopHyperParameterTuningJobRequest);
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
     * Stops a running labeling job. A job that is stopped cannot be restarted.
     * Any results obtained before the job is stopped are placed in the Amazon
     * S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopLabelingJob(StopLabelingJobRequest stopLabelingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopLabelingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopLabelingJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopLabelingJobRequestMarshaller().marshall(stopLabelingJobRequest);
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
     * Stops a previously started monitoring schedule.
     * </p>
     * 
     * @param stopMonitoringScheduleRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopMonitoringSchedule(StopMonitoringScheduleRequest stopMonitoringScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopMonitoringScheduleRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopMonitoringScheduleRequestMarshaller()
                        .marshall(stopMonitoringScheduleRequest);
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
     * Terminates the ML compute instance. Before terminating the instance,
     * Amazon SageMaker disconnects the ML storage volume from it. Amazon
     * SageMaker preserves the ML storage volume. Amazon SageMaker stops
     * charging you for the ML compute instance when you call
     * <code>StopNotebookInstance</code>.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has
     * been terminated, call the <code>StartNotebookInstance</code> API.
     * <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can
     * continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopNotebookInstance(StopNotebookInstanceRequest stopNotebookInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopNotebookInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopNotebookInstanceRequestMarshaller()
                        .marshall(stopNotebookInstanceRequest);
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
     * Stops a processing job.
     * </p>
     * 
     * @param stopProcessingJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopProcessingJob(StopProcessingJobRequest stopProcessingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopProcessingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopProcessingJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopProcessingJobRequestMarshaller()
                        .marshall(stopProcessingJobRequest);
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
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm
     * the <code>SIGTERM</code> signal, which delays job termination for 120
     * seconds. Algorithms might use this 120-second window to save the model
     * artifacts, so the results of the training is not lost.
     * </p>
     * <p>
     * When it receives a <code>StopTrainingJob</code> request, Amazon SageMaker
     * changes the status of the job to <code>Stopping</code>. After Amazon
     * SageMaker stops the job, it sets the status to <code>Stopped</code>.
     * </p>
     * 
     * @param stopTrainingJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopTrainingJob(StopTrainingJobRequest stopTrainingJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopTrainingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTrainingJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTrainingJobRequestMarshaller().marshall(stopTrainingJobRequest);
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
     * Stops a transform job.
     * </p>
     * <p>
     * When Amazon SageMaker receives a <code>StopTransformJob</code> request,
     * the status of the job changes to <code>Stopping</code>. After Amazon
     * SageMaker stops the job, the status is set to <code>Stopped</code>. When
     * you stop a transform job before it is completed, Amazon SageMaker doesn't
     * store the job's output in Amazon S3.
     * </p>
     * 
     * @param stopTransformJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void stopTransformJob(StopTransformJobRequest stopTransformJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopTransformJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTransformJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTransformJobRequestMarshaller().marshall(stopTransformJobRequest);
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
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @return updateCodeRepositoryResult The response from the
     *         UpdateCodeRepository service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateCodeRepositoryResult updateCodeRepository(
            UpdateCodeRepositoryRequest updateCodeRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCodeRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCodeRepositoryRequest> request = null;
        Response<UpdateCodeRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCodeRepositoryRequestMarshaller()
                        .marshall(updateCodeRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCodeRepositoryResult, JsonUnmarshallerContext> unmarshaller = new UpdateCodeRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCodeRepositoryResult> responseHandler = new JsonResponseHandler<UpdateCodeRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a domain. Changes will impact all of the people in the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return updateDomainResult The response from the UpdateDomain service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateDomainResult updateDomain(UpdateDomainRequest updateDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainRequest> request = null;
        Response<UpdateDomainResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainRequestMarshaller().marshall(updateDomainRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainResult> responseHandler = new JsonResponseHandler<UpdateDomainResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deploys the new <code>EndpointConfig</code> specified in the request,
     * switches to using newly created endpoint, and then deletes resources
     * provisioned for the endpoint using the previous
     * <code>EndpointConfig</code> (there is no availability loss).
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status
     * to <code>Updating</code>. After updating the endpoint, it sets the status
     * to <code>InService</code>. To check the status of an endpoint, use the
     * <a>DescribeEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint
     * that is live or while the <code>UpdateEndpoint</code> or
     * <code>CreateEndpoint</code> operations are being performed on the
     * endpoint. To update an endpoint, you must create a new
     * <code>EndpointConfig</code>.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @return updateEndpointResult The response from the UpdateEndpoint service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointRequest> request = null;
        Response<UpdateEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointRequestMarshaller().marshall(updateEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEndpointResult, JsonUnmarshallerContext> unmarshaller = new UpdateEndpointResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEndpointResult> responseHandler = new JsonResponseHandler<UpdateEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates variant weight of one or more variants associated with an
     * existing endpoint, or capacity of one variant associated with an existing
     * endpoint. When it receives the request, Amazon SageMaker sets the
     * endpoint status to <code>Updating</code>. After updating the endpoint, it
     * sets the status to <code>InService</code>. To check the status of an
     * endpoint, use the <a>DescribeEndpoint</a> API.
     * </p>
     * 
     * @param updateEndpointWeightsAndCapacitiesRequest
     * @return updateEndpointWeightsAndCapacitiesResult The response from the
     *         UpdateEndpointWeightsAndCapacities service method, as returned by
     *         Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateEndpointWeightsAndCapacitiesResult updateEndpointWeightsAndCapacities(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEndpointWeightsAndCapacitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointWeightsAndCapacitiesRequest> request = null;
        Response<UpdateEndpointWeightsAndCapacitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointWeightsAndCapacitiesRequestMarshaller()
                        .marshall(updateEndpointWeightsAndCapacitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEndpointWeightsAndCapacitiesResult, JsonUnmarshallerContext> unmarshaller = new UpdateEndpointWeightsAndCapacitiesResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEndpointWeightsAndCapacitiesResult> responseHandler = new JsonResponseHandler<UpdateEndpointWeightsAndCapacitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds, updates, or removes the description of an experiment. Updates the
     * display name of an experiment.
     * </p>
     * 
     * @param updateExperimentRequest
     * @return updateExperimentResult The response from the UpdateExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateExperimentResult updateExperiment(UpdateExperimentRequest updateExperimentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateExperimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateExperimentRequest> request = null;
        Response<UpdateExperimentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateExperimentRequestMarshaller().marshall(updateExperimentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateExperimentResult, JsonUnmarshallerContext> unmarshaller = new UpdateExperimentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateExperimentResult> responseHandler = new JsonResponseHandler<UpdateExperimentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a previously created schedule.
     * </p>
     * 
     * @param updateMonitoringScheduleRequest
     * @return updateMonitoringScheduleResult The response from the
     *         UpdateMonitoringSchedule service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateMonitoringScheduleResult updateMonitoringSchedule(
            UpdateMonitoringScheduleRequest updateMonitoringScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMonitoringScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMonitoringScheduleRequest> request = null;
        Response<UpdateMonitoringScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMonitoringScheduleRequestMarshaller()
                        .marshall(updateMonitoringScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMonitoringScheduleResult, JsonUnmarshallerContext> unmarshaller = new UpdateMonitoringScheduleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMonitoringScheduleResult> responseHandler = new JsonResponseHandler<UpdateMonitoringScheduleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading
     * or downgrading the ML compute instance used for your notebook instance to
     * accommodate changes in your workload requirements.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @return updateNotebookInstanceResult The response from the
     *         UpdateNotebookInstance service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateNotebookInstanceResult updateNotebookInstance(
            UpdateNotebookInstanceRequest updateNotebookInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateNotebookInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotebookInstanceRequest> request = null;
        Response<UpdateNotebookInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotebookInstanceRequestMarshaller()
                        .marshall(updateNotebookInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateNotebookInstanceResult, JsonUnmarshallerContext> unmarshaller = new UpdateNotebookInstanceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateNotebookInstanceResult> responseHandler = new JsonResponseHandler<UpdateNotebookInstanceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the
     * <a>CreateNotebookInstanceLifecycleConfig</a> API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @return updateNotebookInstanceLifecycleConfigResult The response from the
     *         UpdateNotebookInstanceLifecycleConfig service method, as returned
     *         by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateNotebookInstanceLifecycleConfigResult updateNotebookInstanceLifecycleConfig(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateNotebookInstanceLifecycleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotebookInstanceLifecycleConfigRequest> request = null;
        Response<UpdateNotebookInstanceLifecycleConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotebookInstanceLifecycleConfigRequestMarshaller()
                        .marshall(updateNotebookInstanceLifecycleConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateNotebookInstanceLifecycleConfigResult, JsonUnmarshallerContext> unmarshaller = new UpdateNotebookInstanceLifecycleConfigResultJsonUnmarshaller();
            JsonResponseHandler<UpdateNotebookInstanceLifecycleConfigResult> responseHandler = new JsonResponseHandler<UpdateNotebookInstanceLifecycleConfigResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the display name of a trial.
     * </p>
     * 
     * @param updateTrialRequest
     * @return updateTrialResult The response from the UpdateTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateTrialResult updateTrial(UpdateTrialRequest updateTrialRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTrialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrialRequest> request = null;
        Response<UpdateTrialResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrialRequestMarshaller().marshall(updateTrialRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTrialResult, JsonUnmarshallerContext> unmarshaller = new UpdateTrialResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTrialResult> responseHandler = new JsonResponseHandler<UpdateTrialResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates one or more properties of a trial component.
     * </p>
     * 
     * @param updateTrialComponentRequest
     * @return updateTrialComponentResult The response from the
     *         UpdateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateTrialComponentResult updateTrialComponent(
            UpdateTrialComponentRequest updateTrialComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTrialComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrialComponentRequest> request = null;
        Response<UpdateTrialComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrialComponentRequestMarshaller()
                        .marshall(updateTrialComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTrialComponentResult, JsonUnmarshallerContext> unmarshaller = new UpdateTrialComponentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTrialComponentResult> responseHandler = new JsonResponseHandler<UpdateTrialComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a user profile.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return updateUserProfileResult The response from the UpdateUserProfile
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateUserProfileResult updateUserProfile(
            UpdateUserProfileRequest updateUserProfileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserProfileRequest> request = null;
        Response<UpdateUserProfileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserProfileRequestMarshaller()
                        .marshall(updateUserProfileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserProfileResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserProfileResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserProfileResult> responseHandler = new JsonResponseHandler<UpdateUserProfileResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Restricts access to tasks assigned to workers in the specified workforce
     * to those within specific ranges of IP addresses. You specify allowed IP
     * addresses by creating a list of up to four <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>.
     * </p>
     * <p>
     * By default, a workforce isn't restricted to specific IP addresses. If you
     * specify a range of IP addresses, workers who attempt to access tasks
     * using any IP address outside the specified range are denied access and
     * get a <code>Not Found</code> error message on the worker portal. After
     * restricting access with this operation, you can see the allowed IP values
     * for a private workforce with the operation.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param updateWorkforceRequest
     * @return updateWorkforceResult The response from the UpdateWorkforce
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateWorkforceResult updateWorkforce(UpdateWorkforceRequest updateWorkforceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateWorkforceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkforceRequest> request = null;
        Response<UpdateWorkforceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkforceRequestMarshaller().marshall(updateWorkforceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateWorkforceResult, JsonUnmarshallerContext> unmarshaller = new UpdateWorkforceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateWorkforceResult> responseHandler = new JsonResponseHandler<UpdateWorkforceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @return updateWorkteamResult The response from the UpdateWorkteam service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateWorkteamResult updateWorkteam(UpdateWorkteamRequest updateWorkteamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateWorkteamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkteamRequest> request = null;
        Response<UpdateWorkteamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkteamRequestMarshaller().marshall(updateWorkteamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateWorkteamResult, JsonUnmarshallerContext> unmarshaller = new UpdateWorkteamResultJsonUnmarshaller();
            JsonResponseHandler<UpdateWorkteamResult> responseHandler = new JsonResponseHandler<UpdateWorkteamResult>(
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
