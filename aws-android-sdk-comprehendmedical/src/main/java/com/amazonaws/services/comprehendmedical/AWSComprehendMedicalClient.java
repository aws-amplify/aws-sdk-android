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

package com.amazonaws.services.comprehendmedical;

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

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.services.comprehendmedical.model.transform.*;

/**
 * Client for accessing AWS Comprehend Medical. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Amazon Comprehend Medical extracts structured information from unstructured
 * clinical text. Use these actions to gain insight in your documents.
 * </p>
 */
public class AWSComprehendMedicalClient extends AmazonWebServiceClient implements
        AWSComprehendMedical {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Comprehend Medical
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSComprehendMedical. A credentials provider chain will be used that
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
    public AWSComprehendMedicalClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSComprehendMedical. A credentials provider chain will be used that
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
     *            how this client connects to AWSComprehendMedical (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSComprehendMedicalClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSComprehendMedical
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
     *         AWSComprehendMedicalClient client = new AWSComprehendMedicalClient(AWSMobileClient
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
    public AWSComprehendMedicalClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSComprehendMedical
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
     *         AWSComprehendMedicalClient client = new AWSComprehendMedicalClient(AWSMobileClient
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
     *            how this client connects to AWSComprehendMedical (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSComprehendMedicalClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSComprehendMedical
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
     *         AWSComprehendMedicalClient client = new AWSComprehendMedicalClient(AWSMobileClient
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
    public AWSComprehendMedicalClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSComprehendMedical
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
     *         AWSComprehendMedicalClient client = new AWSComprehendMedicalClient(AWSMobileClient
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
     *            how this client connects to AWSComprehendMedical (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSComprehendMedicalClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSComprehendMedical
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
     *            how this client connects to AWSComprehendMedical (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSComprehendMedicalClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSComprehendMedical
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
     *         AWSComprehendMedicalClient client = new AWSComprehendMedicalClient(AWSMobileClient
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
     *            how this client connects to AWSComprehendMedical (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSComprehendMedicalClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidEncodingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TextSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("comprehendmedical.us-east-1.amazonaws.com");
        this.endpointPrefix = "comprehendmedical";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/comprehendmedical/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/comprehendmedical/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Gets the properties associated with a medical entities detection job. Use
     * this operation to get the status of a detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionV2JobRequest
     * @return describeEntitiesDetectionV2JobResult The response from the
     *         DescribeEntitiesDetectionV2Job service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeEntitiesDetectionV2JobResult describeEntitiesDetectionV2Job(
            DescribeEntitiesDetectionV2JobRequest describeEntitiesDetectionV2JobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEntitiesDetectionV2JobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntitiesDetectionV2JobRequest> request = null;
        Response<DescribeEntitiesDetectionV2JobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntitiesDetectionV2JobRequestMarshaller()
                        .marshall(describeEntitiesDetectionV2JobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEntitiesDetectionV2JobResult, JsonUnmarshallerContext> unmarshaller = new DescribeEntitiesDetectionV2JobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEntitiesDetectionV2JobResult> responseHandler = new JsonResponseHandler<DescribeEntitiesDetectionV2JobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with an InferICD10CM job. Use this
     * operation to get the status of an inference job.
     * </p>
     * 
     * @param describeICD10CMInferenceJobRequest
     * @return describeICD10CMInferenceJobResult The response from the
     *         DescribeICD10CMInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeICD10CMInferenceJobResult describeICD10CMInferenceJob(
            DescribeICD10CMInferenceJobRequest describeICD10CMInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeICD10CMInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeICD10CMInferenceJobRequest> request = null;
        Response<DescribeICD10CMInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeICD10CMInferenceJobRequestMarshaller()
                        .marshall(describeICD10CMInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeICD10CMInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeICD10CMInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeICD10CMInferenceJobResult> responseHandler = new JsonResponseHandler<DescribeICD10CMInferenceJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a protected health information (PHI)
     * detection job. Use this operation to get the status of a detection job.
     * </p>
     * 
     * @param describePHIDetectionJobRequest
     * @return describePHIDetectionJobResult The response from the
     *         DescribePHIDetectionJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribePHIDetectionJobResult describePHIDetectionJob(
            DescribePHIDetectionJobRequest describePHIDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePHIDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePHIDetectionJobRequest> request = null;
        Response<DescribePHIDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePHIDetectionJobRequestMarshaller()
                        .marshall(describePHIDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePHIDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribePHIDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribePHIDetectionJobResult> responseHandler = new JsonResponseHandler<DescribePHIDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with an InferRxNorm job. Use this
     * operation to get the status of an inference job.
     * </p>
     * 
     * @param describeRxNormInferenceJobRequest
     * @return describeRxNormInferenceJobResult The response from the
     *         DescribeRxNormInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeRxNormInferenceJobResult describeRxNormInferenceJob(
            DescribeRxNormInferenceJobRequest describeRxNormInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRxNormInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRxNormInferenceJobRequest> request = null;
        Response<DescribeRxNormInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRxNormInferenceJobRequestMarshaller()
                        .marshall(describeRxNormInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRxNormInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeRxNormInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRxNormInferenceJobResult> responseHandler = new JsonResponseHandler<DescribeRxNormInferenceJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The <code>DetectEntities</code> operation is deprecated. You should use
     * the <a>DetectEntitiesV2</a> operation instead.
     * </p>
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns
     * specific information about them such as entity category, location, and
     * confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return detectEntitiesResult The response from the DetectEntities service
     *         method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    public DetectEntitiesResult detectEntities(DetectEntitiesRequest detectEntitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectEntitiesRequest> request = null;
        Response<DetectEntitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectEntitiesRequestMarshaller().marshall(detectEntitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectEntitiesResult, JsonUnmarshallerContext> unmarshaller = new DetectEntitiesResultJsonUnmarshaller();
            JsonResponseHandler<DetectEntitiesResult> responseHandler = new JsonResponseHandler<DetectEntitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns
     * specific information about them such as entity category, location, and
     * confidence score on that information. Amazon Comprehend Medical only
     * detects medical entities in English language texts.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation replaces the
     * <a>DetectEntities</a> operation. This new action uses a different model
     * for determining the entities in your medical text and changes the way
     * that some entities are returned in the output. You should use the
     * <code>DetectEntitiesV2</code> operation in all new applications.
     * </p>
     * <p>
     * The <code>DetectEntitiesV2</code> operation returns the
     * <code>Acuity</code> and <code>Direction</code> entities as attributes
     * instead of types.
     * </p>
     * 
     * @param detectEntitiesV2Request
     * @return detectEntitiesV2Result The response from the DetectEntitiesV2
     *         service method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DetectEntitiesV2Result detectEntitiesV2(DetectEntitiesV2Request detectEntitiesV2Request)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectEntitiesV2Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectEntitiesV2Request> request = null;
        Response<DetectEntitiesV2Result> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectEntitiesV2RequestMarshaller().marshall(detectEntitiesV2Request);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectEntitiesV2Result, JsonUnmarshallerContext> unmarshaller = new DetectEntitiesV2ResultJsonUnmarshaller();
            JsonResponseHandler<DetectEntitiesV2Result> responseHandler = new JsonResponseHandler<DetectEntitiesV2Result>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects the clinical text for protected health information (PHI)
     * entities and returns the entity category, location, and confidence score
     * for each entity. Amazon Comprehend Medical only detects entities in
     * English language texts.
     * </p>
     * 
     * @param detectPHIRequest
     * @return detectPHIResult The response from the DetectPHI service method,
     *         as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DetectPHIResult detectPHI(DetectPHIRequest detectPHIRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectPHIRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectPHIRequest> request = null;
        Response<DetectPHIResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectPHIRequestMarshaller().marshall(detectPHIRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectPHIResult, JsonUnmarshallerContext> unmarshaller = new DetectPHIResultJsonUnmarshaller();
            JsonResponseHandler<DetectPHIResult> responseHandler = new JsonResponseHandler<DetectPHIResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * InferICD10CM detects medical conditions as entities listed in a patient
     * record and links those entities to normalized concept identifiers in the
     * ICD-10-CM knowledge base from the Centers for Disease Control. Amazon
     * Comprehend Medical only detects medical entities in English language
     * texts.
     * </p>
     * 
     * @param inferICD10CMRequest
     * @return inferICD10CMResult The response from the InferICD10CM service
     *         method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public InferICD10CMResult inferICD10CM(InferICD10CMRequest inferICD10CMRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(inferICD10CMRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InferICD10CMRequest> request = null;
        Response<InferICD10CMResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InferICD10CMRequestMarshaller().marshall(inferICD10CMRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InferICD10CMResult, JsonUnmarshallerContext> unmarshaller = new InferICD10CMResultJsonUnmarshaller();
            JsonResponseHandler<InferICD10CMResult> responseHandler = new JsonResponseHandler<InferICD10CMResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * InferRxNorm detects medications as entities listed in a patient record
     * and links to the normalized concept identifiers in the RxNorm database
     * from the National Library of Medicine. Amazon Comprehend Medical only
     * detects medical entities in English language texts.
     * </p>
     * 
     * @param inferRxNormRequest
     * @return inferRxNormResult The response from the InferRxNorm service
     *         method, as returned by AWS Comprehend Medical.
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws InvalidRequestException
     * @throws InvalidEncodingException
     * @throws TextSizeLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public InferRxNormResult inferRxNorm(InferRxNormRequest inferRxNormRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(inferRxNormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InferRxNormRequest> request = null;
        Response<InferRxNormResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InferRxNormRequestMarshaller().marshall(inferRxNormRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InferRxNormResult, JsonUnmarshallerContext> unmarshaller = new InferRxNormResultJsonUnmarshaller();
            JsonResponseHandler<InferRxNormResult> responseHandler = new JsonResponseHandler<InferRxNormResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of medical entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionV2JobsRequest
     * @return listEntitiesDetectionV2JobsResult The response from the
     *         ListEntitiesDetectionV2Jobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListEntitiesDetectionV2JobsResult listEntitiesDetectionV2Jobs(
            ListEntitiesDetectionV2JobsRequest listEntitiesDetectionV2JobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEntitiesDetectionV2JobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesDetectionV2JobsRequest> request = null;
        Response<ListEntitiesDetectionV2JobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesDetectionV2JobsRequestMarshaller()
                        .marshall(listEntitiesDetectionV2JobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEntitiesDetectionV2JobsResult, JsonUnmarshallerContext> unmarshaller = new ListEntitiesDetectionV2JobsResultJsonUnmarshaller();
            JsonResponseHandler<ListEntitiesDetectionV2JobsResult> responseHandler = new JsonResponseHandler<ListEntitiesDetectionV2JobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of InferICD10CM jobs that you have submitted.
     * </p>
     * 
     * @param listICD10CMInferenceJobsRequest
     * @return listICD10CMInferenceJobsResult The response from the
     *         ListICD10CMInferenceJobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListICD10CMInferenceJobsResult listICD10CMInferenceJobs(
            ListICD10CMInferenceJobsRequest listICD10CMInferenceJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listICD10CMInferenceJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListICD10CMInferenceJobsRequest> request = null;
        Response<ListICD10CMInferenceJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListICD10CMInferenceJobsRequestMarshaller()
                        .marshall(listICD10CMInferenceJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListICD10CMInferenceJobsResult, JsonUnmarshallerContext> unmarshaller = new ListICD10CMInferenceJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListICD10CMInferenceJobsResult> responseHandler = new JsonResponseHandler<ListICD10CMInferenceJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of protected health information (PHI) detection jobs that you
     * have submitted.
     * </p>
     * 
     * @param listPHIDetectionJobsRequest
     * @return listPHIDetectionJobsResult The response from the
     *         ListPHIDetectionJobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListPHIDetectionJobsResult listPHIDetectionJobs(
            ListPHIDetectionJobsRequest listPHIDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPHIDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPHIDetectionJobsRequest> request = null;
        Response<ListPHIDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPHIDetectionJobsRequestMarshaller()
                        .marshall(listPHIDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPHIDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListPHIDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListPHIDetectionJobsResult> responseHandler = new JsonResponseHandler<ListPHIDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of InferRxNorm jobs that you have submitted.
     * </p>
     * 
     * @param listRxNormInferenceJobsRequest
     * @return listRxNormInferenceJobsResult The response from the
     *         ListRxNormInferenceJobs service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ValidationException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListRxNormInferenceJobsResult listRxNormInferenceJobs(
            ListRxNormInferenceJobsRequest listRxNormInferenceJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRxNormInferenceJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRxNormInferenceJobsRequest> request = null;
        Response<ListRxNormInferenceJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRxNormInferenceJobsRequestMarshaller()
                        .marshall(listRxNormInferenceJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRxNormInferenceJobsResult, JsonUnmarshallerContext> unmarshaller = new ListRxNormInferenceJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListRxNormInferenceJobsResult> responseHandler = new JsonResponseHandler<ListRxNormInferenceJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous medical entity detection job for a collection of
     * documents. Use the <code>DescribeEntitiesDetectionV2Job</code> operation
     * to track the status of a job.
     * </p>
     * 
     * @param startEntitiesDetectionV2JobRequest
     * @return startEntitiesDetectionV2JobResult The response from the
     *         StartEntitiesDetectionV2Job service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StartEntitiesDetectionV2JobResult startEntitiesDetectionV2Job(
            StartEntitiesDetectionV2JobRequest startEntitiesDetectionV2JobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startEntitiesDetectionV2JobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEntitiesDetectionV2JobRequest> request = null;
        Response<StartEntitiesDetectionV2JobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEntitiesDetectionV2JobRequestMarshaller()
                        .marshall(startEntitiesDetectionV2JobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartEntitiesDetectionV2JobResult, JsonUnmarshallerContext> unmarshaller = new StartEntitiesDetectionV2JobResultJsonUnmarshaller();
            JsonResponseHandler<StartEntitiesDetectionV2JobResult> responseHandler = new JsonResponseHandler<StartEntitiesDetectionV2JobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous job to detect medical conditions and link them to
     * the ICD-10-CM ontology. Use the <code>DescribeICD10CMInferenceJob</code>
     * operation to track the status of a job.
     * </p>
     * 
     * @param startICD10CMInferenceJobRequest
     * @return startICD10CMInferenceJobResult The response from the
     *         StartICD10CMInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StartICD10CMInferenceJobResult startICD10CMInferenceJob(
            StartICD10CMInferenceJobRequest startICD10CMInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startICD10CMInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartICD10CMInferenceJobRequest> request = null;
        Response<StartICD10CMInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartICD10CMInferenceJobRequestMarshaller()
                        .marshall(startICD10CMInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartICD10CMInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new StartICD10CMInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<StartICD10CMInferenceJobResult> responseHandler = new JsonResponseHandler<StartICD10CMInferenceJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous job to detect protected health information (PHI).
     * Use the <code>DescribePHIDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startPHIDetectionJobRequest
     * @return startPHIDetectionJobResult The response from the
     *         StartPHIDetectionJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StartPHIDetectionJobResult startPHIDetectionJob(
            StartPHIDetectionJobRequest startPHIDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startPHIDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPHIDetectionJobRequest> request = null;
        Response<StartPHIDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPHIDetectionJobRequestMarshaller()
                        .marshall(startPHIDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartPHIDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartPHIDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartPHIDetectionJobResult> responseHandler = new JsonResponseHandler<StartPHIDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous job to detect medication entities and link them to
     * the RxNorm ontology. Use the <code>DescribeRxNormInferenceJob</code>
     * operation to track the status of a job.
     * </p>
     * 
     * @param startRxNormInferenceJobRequest
     * @return startRxNormInferenceJobResult The response from the
     *         StartRxNormInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StartRxNormInferenceJobResult startRxNormInferenceJob(
            StartRxNormInferenceJobRequest startRxNormInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startRxNormInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRxNormInferenceJobRequest> request = null;
        Response<StartRxNormInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRxNormInferenceJobRequestMarshaller()
                        .marshall(startRxNormInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartRxNormInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new StartRxNormInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<StartRxNormInferenceJobResult> responseHandler = new JsonResponseHandler<StartRxNormInferenceJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a medical entities detection job in progress.
     * </p>
     * 
     * @param stopEntitiesDetectionV2JobRequest
     * @return stopEntitiesDetectionV2JobResult The response from the
     *         StopEntitiesDetectionV2Job service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StopEntitiesDetectionV2JobResult stopEntitiesDetectionV2Job(
            StopEntitiesDetectionV2JobRequest stopEntitiesDetectionV2JobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopEntitiesDetectionV2JobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEntitiesDetectionV2JobRequest> request = null;
        Response<StopEntitiesDetectionV2JobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEntitiesDetectionV2JobRequestMarshaller()
                        .marshall(stopEntitiesDetectionV2JobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopEntitiesDetectionV2JobResult, JsonUnmarshallerContext> unmarshaller = new StopEntitiesDetectionV2JobResultJsonUnmarshaller();
            JsonResponseHandler<StopEntitiesDetectionV2JobResult> responseHandler = new JsonResponseHandler<StopEntitiesDetectionV2JobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops an InferICD10CM inference job in progress.
     * </p>
     * 
     * @param stopICD10CMInferenceJobRequest
     * @return stopICD10CMInferenceJobResult The response from the
     *         StopICD10CMInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StopICD10CMInferenceJobResult stopICD10CMInferenceJob(
            StopICD10CMInferenceJobRequest stopICD10CMInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopICD10CMInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopICD10CMInferenceJobRequest> request = null;
        Response<StopICD10CMInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopICD10CMInferenceJobRequestMarshaller()
                        .marshall(stopICD10CMInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopICD10CMInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new StopICD10CMInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<StopICD10CMInferenceJobResult> responseHandler = new JsonResponseHandler<StopICD10CMInferenceJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a protected health information (PHI) detection job in progress.
     * </p>
     * 
     * @param stopPHIDetectionJobRequest
     * @return stopPHIDetectionJobResult The response from the
     *         StopPHIDetectionJob service method, as returned by AWS Comprehend
     *         Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StopPHIDetectionJobResult stopPHIDetectionJob(
            StopPHIDetectionJobRequest stopPHIDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopPHIDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopPHIDetectionJobRequest> request = null;
        Response<StopPHIDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopPHIDetectionJobRequestMarshaller()
                        .marshall(stopPHIDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopPHIDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StopPHIDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StopPHIDetectionJobResult> responseHandler = new JsonResponseHandler<StopPHIDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops an InferRxNorm inference job in progress.
     * </p>
     * 
     * @param stopRxNormInferenceJobRequest
     * @return stopRxNormInferenceJobResult The response from the
     *         StopRxNormInferenceJob service method, as returned by AWS
     *         Comprehend Medical.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Comprehend Medical indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StopRxNormInferenceJobResult stopRxNormInferenceJob(
            StopRxNormInferenceJobRequest stopRxNormInferenceJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopRxNormInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopRxNormInferenceJobRequest> request = null;
        Response<StopRxNormInferenceJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopRxNormInferenceJobRequestMarshaller()
                        .marshall(stopRxNormInferenceJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopRxNormInferenceJobResult, JsonUnmarshallerContext> unmarshaller = new StopRxNormInferenceJobResultJsonUnmarshaller();
            JsonResponseHandler<StopRxNormInferenceJobResult> responseHandler = new JsonResponseHandler<StopRxNormInferenceJobResult>(
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
