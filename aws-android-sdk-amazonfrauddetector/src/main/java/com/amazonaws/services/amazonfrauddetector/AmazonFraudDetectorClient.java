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

package com.amazonaws.services.amazonfrauddetector;

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

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.services.amazonfrauddetector.model.transform.*;

/**
 * Client for accessing Amazon Fraud Detector. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * This is the Amazon Fraud Detector API Reference. This guide is for developers
 * who need detailed information about Amazon Fraud Detector API actions, data
 * types, and errors. For more information about Amazon Fraud Detector features,
 * see the <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/">Amazon
 * Fraud Detector User Guide</a>.
 * </p>
 */
public class AmazonFraudDetectorClient extends AmazonWebServiceClient implements
        AmazonFraudDetector {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Fraud Detector exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
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
    public AmazonFraudDetectorClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
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
     *            how this client connects to AmazonFraudDetector (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonFraudDetectorClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector
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
     *         AmazonFraudDetectorClient client = new AmazonFraudDetectorClient(AWSMobileClient
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
    public AmazonFraudDetectorClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector
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
     *         AmazonFraudDetectorClient client = new AmazonFraudDetectorClient(AWSMobileClient
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
     *            how this client connects to AmazonFraudDetector (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonFraudDetectorClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector
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
     *         AmazonFraudDetectorClient client = new AmazonFraudDetectorClient(AWSMobileClient
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
    public AmazonFraudDetectorClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector
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
     *         AmazonFraudDetectorClient client = new AmazonFraudDetectorClient(AWSMobileClient
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
     *            how this client connects to AmazonFraudDetector (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonFraudDetectorClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector
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
     *            how this client connects to AmazonFraudDetector (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonFraudDetectorClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonFraudDetector
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
     *         AmazonFraudDetectorClient client = new AmazonFraudDetectorClient(AWSMobileClient
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
     *            how this client connects to AmazonFraudDetector (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonFraudDetectorClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("frauddetector.us-east-1.amazonaws.com");
        this.endpointPrefix = "frauddetector";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonfrauddetector/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonfrauddetector/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a batch of variables.
     * </p>
     * 
     * @param batchCreateVariableRequest
     * @return batchCreateVariableResult The response from the
     *         BatchCreateVariable service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchCreateVariableResult batchCreateVariable(
            BatchCreateVariableRequest batchCreateVariableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchCreateVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateVariableRequest> request = null;
        Response<BatchCreateVariableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateVariableRequestMarshaller()
                        .marshall(batchCreateVariableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchCreateVariableResult, JsonUnmarshallerContext> unmarshaller = new BatchCreateVariableResultJsonUnmarshaller();
            JsonResponseHandler<BatchCreateVariableResult> responseHandler = new JsonResponseHandler<BatchCreateVariableResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a batch of variables.
     * </p>
     * 
     * @param batchGetVariableRequest
     * @return batchGetVariableResult The response from the BatchGetVariable
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchGetVariableResult batchGetVariable(BatchGetVariableRequest batchGetVariableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetVariableRequest> request = null;
        Response<BatchGetVariableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetVariableRequestMarshaller().marshall(batchGetVariableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetVariableResult, JsonUnmarshallerContext> unmarshaller = new BatchGetVariableResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetVariableResult> responseHandler = new JsonResponseHandler<BatchGetVariableResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a detector version. The detector version starts in a
     * <code>DRAFT</code> status.
     * </p>
     * 
     * @param createDetectorVersionRequest
     * @return createDetectorVersionResult The response from the
     *         CreateDetectorVersion service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateDetectorVersionResult createDetectorVersion(
            CreateDetectorVersionRequest createDetectorVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDetectorVersionRequest> request = null;
        Response<CreateDetectorVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDetectorVersionRequestMarshaller()
                        .marshall(createDetectorVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDetectorVersionResult, JsonUnmarshallerContext> unmarshaller = new CreateDetectorVersionResultJsonUnmarshaller();
            JsonResponseHandler<CreateDetectorVersionResult> responseHandler = new JsonResponseHandler<CreateDetectorVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a version of the model using the specified model type.
     * </p>
     * 
     * @param createModelVersionRequest
     * @return createModelVersionResult The response from the CreateModelVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateModelVersionResult createModelVersion(
            CreateModelVersionRequest createModelVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelVersionRequest> request = null;
        Response<CreateModelVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelVersionRequestMarshaller()
                        .marshall(createModelVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateModelVersionResult, JsonUnmarshallerContext> unmarshaller = new CreateModelVersionResultJsonUnmarshaller();
            JsonResponseHandler<CreateModelVersionResult> responseHandler = new JsonResponseHandler<CreateModelVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a rule for use with the specified detector.
     * </p>
     * 
     * @param createRuleRequest
     * @return createRuleResult The response from the CreateRule service method,
     *         as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateRuleResult createRule(CreateRuleRequest createRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestMarshaller().marshall(createRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRuleResult, JsonUnmarshallerContext> unmarshaller = new CreateRuleResultJsonUnmarshaller();
            JsonResponseHandler<CreateRuleResult> responseHandler = new JsonResponseHandler<CreateRuleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a variable.
     * </p>
     * 
     * @param createVariableRequest
     * @return createVariableResult The response from the CreateVariable service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateVariableResult createVariable(CreateVariableRequest createVariableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVariableRequest> request = null;
        Response<CreateVariableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVariableRequestMarshaller().marshall(createVariableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVariableResult, JsonUnmarshallerContext> unmarshaller = new CreateVariableResultJsonUnmarshaller();
            JsonResponseHandler<CreateVariableResult> responseHandler = new JsonResponseHandler<CreateVariableResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the detector. Before deleting a detector, you must first delete
     * all detector versions and rule versions associated with the detector.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return deleteDetectorResult The response from the DeleteDetector service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ConflictException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteDetectorResult deleteDetector(DeleteDetectorRequest deleteDetectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDetectorRequest> request = null;
        Response<DeleteDetectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDetectorRequestMarshaller().marshall(deleteDetectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDetectorResult, JsonUnmarshallerContext> unmarshaller = new DeleteDetectorResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDetectorResult> responseHandler = new JsonResponseHandler<DeleteDetectorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the detector version. You cannot delete detector versions that
     * are in <code>ACTIVE</code> status.
     * </p>
     * 
     * @param deleteDetectorVersionRequest
     * @return deleteDetectorVersionResult The response from the
     *         DeleteDetectorVersion service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteDetectorVersionResult deleteDetectorVersion(
            DeleteDetectorVersionRequest deleteDetectorVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDetectorVersionRequest> request = null;
        Response<DeleteDetectorVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDetectorVersionRequestMarshaller()
                        .marshall(deleteDetectorVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDetectorVersionResult, JsonUnmarshallerContext> unmarshaller = new DeleteDetectorVersionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDetectorVersionResult> responseHandler = new JsonResponseHandler<DeleteDetectorVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * 
     * @param deleteEventRequest
     * @return deleteEventResult The response from the DeleteEvent service
     *         method, as returned by Amazon Fraud Detector.
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteEventResult deleteEvent(DeleteEventRequest deleteEventRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventRequest> request = null;
        Response<DeleteEventResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventRequestMarshaller().marshall(deleteEventRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEventResult, JsonUnmarshallerContext> unmarshaller = new DeleteEventResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEventResult> responseHandler = new JsonResponseHandler<DeleteEventResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the rule version. You cannot delete a rule version if it is used
     * by an <code>ACTIVE</code> or <code>INACTIVE</code> detector version.
     * </p>
     * 
     * @param deleteRuleVersionRequest
     * @return deleteRuleVersionResult The response from the DeleteRuleVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ConflictException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteRuleVersionResult deleteRuleVersion(
            DeleteRuleVersionRequest deleteRuleVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRuleVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleVersionRequest> request = null;
        Response<DeleteRuleVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleVersionRequestMarshaller()
                        .marshall(deleteRuleVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRuleVersionResult, JsonUnmarshallerContext> unmarshaller = new DeleteRuleVersionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRuleVersionResult> responseHandler = new JsonResponseHandler<DeleteRuleVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all versions for a specified detector.
     * </p>
     * 
     * @param describeDetectorRequest
     * @return describeDetectorResult The response from the DescribeDetector
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeDetectorResult describeDetector(DescribeDetectorRequest describeDetectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDetectorRequest> request = null;
        Response<DescribeDetectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDetectorRequestMarshaller().marshall(describeDetectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDetectorResult, JsonUnmarshallerContext> unmarshaller = new DescribeDetectorResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDetectorResult> responseHandler = new JsonResponseHandler<DescribeDetectorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all of the model versions for the specified model type or for the
     * specified model type and model ID. You can also get details for a single,
     * specified model version.
     * </p>
     * 
     * @param describeModelVersionsRequest
     * @return describeModelVersionsResult The response from the
     *         DescribeModelVersions service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeModelVersionsResult describeModelVersions(
            DescribeModelVersionsRequest describeModelVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeModelVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeModelVersionsRequest> request = null;
        Response<DescribeModelVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeModelVersionsRequestMarshaller()
                        .marshall(describeModelVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeModelVersionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeModelVersionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeModelVersionsResult> responseHandler = new JsonResponseHandler<DescribeModelVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a particular detector version.
     * </p>
     * 
     * @param getDetectorVersionRequest
     * @return getDetectorVersionResult The response from the GetDetectorVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDetectorVersionResult getDetectorVersion(
            GetDetectorVersionRequest getDetectorVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDetectorVersionRequest> request = null;
        Response<GetDetectorVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDetectorVersionRequestMarshaller()
                        .marshall(getDetectorVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDetectorVersionResult, JsonUnmarshallerContext> unmarshaller = new GetDetectorVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetDetectorVersionResult> responseHandler = new JsonResponseHandler<GetDetectorVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all of detectors. This is a paginated API. If you provide a null
     * <code>maxSizePerPage</code>, this actions retrieves a maximum of 10
     * records per page. If you provide a <code>maxSizePerPage</code>, the value
     * must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetEventTypesResponse</code> as part of
     * your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getDetectorsRequest
     * @return getDetectorsResult The response from the GetDetectors service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDetectorsResult getDetectors(GetDetectorsRequest getDetectorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDetectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDetectorsRequest> request = null;
        Response<GetDetectorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDetectorsRequestMarshaller().marshall(getDetectorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDetectorsResult, JsonUnmarshallerContext> unmarshaller = new GetDetectorsResultJsonUnmarshaller();
            JsonResponseHandler<GetDetectorsResult> responseHandler = new JsonResponseHandler<GetDetectorsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been
     * imported into the service. This is a paginated API. If you provide a null
     * <code>maxSizePerPage</code>, this actions retrieves a maximum of 10
     * records per page. If you provide a <code>maxSizePerPage</code>, the value
     * must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetExternalModelsResult</code> as part of
     * your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param getExternalModelsRequest
     * @return getExternalModelsResult The response from the GetExternalModels
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetExternalModelsResult getExternalModels(
            GetExternalModelsRequest getExternalModelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getExternalModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExternalModelsRequest> request = null;
        Response<GetExternalModelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExternalModelsRequestMarshaller()
                        .marshall(getExternalModelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetExternalModelsResult, JsonUnmarshallerContext> unmarshaller = new GetExternalModelsResultJsonUnmarshaller();
            JsonResponseHandler<GetExternalModelsResult> responseHandler = new JsonResponseHandler<GetExternalModelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a model version.
     * </p>
     * 
     * @param getModelVersionRequest
     * @return getModelVersionResult The response from the GetModelVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetModelVersionResult getModelVersion(GetModelVersionRequest getModelVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelVersionRequest> request = null;
        Response<GetModelVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelVersionRequestMarshaller().marshall(getModelVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetModelVersionResult, JsonUnmarshallerContext> unmarshaller = new GetModelVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetModelVersionResult> responseHandler = new JsonResponseHandler<GetModelVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all of the models for the AWS account, or the specified model type,
     * or gets a single model for the specified model type, model ID
     * combination.
     * </p>
     * 
     * @param getModelsRequest
     * @return getModelsResult The response from the GetModels service method,
     *         as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetModelsResult getModels(GetModelsRequest getModelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelsRequest> request = null;
        Response<GetModelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelsRequestMarshaller().marshall(getModelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetModelsResult, JsonUnmarshallerContext> unmarshaller = new GetModelsResultJsonUnmarshaller();
            JsonResponseHandler<GetModelsResult> responseHandler = new JsonResponseHandler<GetModelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null
     * <code>maxSizePerPage</code>, this actions retrieves a maximum of 10
     * records per page. If you provide a <code>maxSizePerPage</code>, the value
     * must be between 50 and 100. To get the next page results, provide the
     * pagination token from the <code>GetOutcomesResult</code> as part of your
     * request. A null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getOutcomesRequest
     * @return getOutcomesResult The response from the GetOutcomes service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetOutcomesResult getOutcomes(GetOutcomesRequest getOutcomesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOutcomesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOutcomesRequest> request = null;
        Response<GetOutcomesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOutcomesRequestMarshaller().marshall(getOutcomesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOutcomesResult, JsonUnmarshallerContext> unmarshaller = new GetOutcomesResultJsonUnmarshaller();
            JsonResponseHandler<GetOutcomesResult> responseHandler = new JsonResponseHandler<GetOutcomesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not
     * provided, the detector’s (<code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getPredictionRequest
     * @return getPredictionResult The response from the GetPrediction service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetPredictionResult getPrediction(GetPredictionRequest getPredictionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPredictionRequest> request = null;
        Response<GetPredictionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPredictionRequestMarshaller().marshall(getPredictionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPredictionResult, JsonUnmarshallerContext> unmarshaller = new GetPredictionResultJsonUnmarshaller();
            JsonResponseHandler<GetPredictionResult> responseHandler = new JsonResponseHandler<GetPredictionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all rules available for the specified detector.
     * </p>
     * 
     * @param getRulesRequest
     * @return getRulesResult The response from the GetRules service method, as
     *         returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetRulesResult getRules(GetRulesRequest getRulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRulesRequest> request = null;
        Response<GetRulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRulesRequestMarshaller().marshall(getRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRulesResult, JsonUnmarshallerContext> unmarshaller = new GetRulesResultJsonUnmarshaller();
            JsonResponseHandler<GetRulesResult> responseHandler = new JsonResponseHandler<GetRulesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all of the variables or the specific variable. This is a paginated
     * API. Providing null <code>maxSizePerPage</code> results in retrieving
     * maximum of 100 records per page. If you provide
     * <code>maxSizePerPage</code> the value must be between 50 and 100. To get
     * the next page result, a provide a pagination token from
     * <code>GetVariablesResult</code> as part of your request. Null pagination
     * token fetches the records from the beginning.
     * </p>
     * 
     * @param getVariablesRequest
     * @return getVariablesResult The response from the GetVariables service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetVariablesResult getVariables(GetVariablesRequest getVariablesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVariablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVariablesRequest> request = null;
        Response<GetVariablesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVariablesRequestMarshaller().marshall(getVariablesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVariablesResult, JsonUnmarshallerContext> unmarshaller = new GetVariablesResultJsonUnmarshaller();
            JsonResponseHandler<GetVariablesResult> responseHandler = new JsonResponseHandler<GetVariablesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates a detector.
     * </p>
     * 
     * @param putDetectorRequest
     * @return putDetectorResult The response from the PutDetector service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutDetectorResult putDetector(PutDetectorRequest putDetectorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDetectorRequest> request = null;
        Response<PutDetectorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDetectorRequestMarshaller().marshall(putDetectorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutDetectorResult, JsonUnmarshallerContext> unmarshaller = new PutDetectorResultJsonUnmarshaller();
            JsonResponseHandler<PutDetectorResult> responseHandler = new JsonResponseHandler<PutDetectorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates an Amazon SageMaker model endpoint. You can also use
     * this action to update the configuration of the model endpoint, including
     * the IAM role and/or the mapped variables.
     * </p>
     * 
     * @param putExternalModelRequest
     * @return putExternalModelResult The response from the PutExternalModel
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutExternalModelResult putExternalModel(PutExternalModelRequest putExternalModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putExternalModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutExternalModelRequest> request = null;
        Response<PutExternalModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutExternalModelRequestMarshaller().marshall(putExternalModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutExternalModelResult, JsonUnmarshallerContext> unmarshaller = new PutExternalModelResultJsonUnmarshaller();
            JsonResponseHandler<PutExternalModelResult> responseHandler = new JsonResponseHandler<PutExternalModelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates a model.
     * </p>
     * 
     * @param putModelRequest
     * @return putModelResult The response from the PutModel service method, as
     *         returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutModelResult putModel(PutModelRequest putModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutModelRequest> request = null;
        Response<PutModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutModelRequestMarshaller().marshall(putModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutModelResult, JsonUnmarshallerContext> unmarshaller = new PutModelResultJsonUnmarshaller();
            JsonResponseHandler<PutModelResult> responseHandler = new JsonResponseHandler<PutModelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates an outcome.
     * </p>
     * 
     * @param putOutcomeRequest
     * @return putOutcomeResult The response from the PutOutcome service method,
     *         as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutOutcomeResult putOutcome(PutOutcomeRequest putOutcomeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putOutcomeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutOutcomeRequest> request = null;
        Response<PutOutcomeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutOutcomeRequestMarshaller().marshall(putOutcomeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutOutcomeResult, JsonUnmarshallerContext> unmarshaller = new PutOutcomeResultJsonUnmarshaller();
            JsonResponseHandler<PutOutcomeResult> responseHandler = new JsonResponseHandler<PutOutcomeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can
     * update include models, external model endpoints, rules, and description.
     * You can only update a <code>DRAFT</code> detector version.
     * </p>
     * 
     * @param updateDetectorVersionRequest
     * @return updateDetectorVersionResult The response from the
     *         UpdateDetectorVersion service method, as returned by Amazon Fraud
     *         Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDetectorVersionResult updateDetectorVersion(
            UpdateDetectorVersionRequest updateDetectorVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionRequest> request = null;
        Response<UpdateDetectorVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionRequestMarshaller()
                        .marshall(updateDetectorVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDetectorVersionResult, JsonUnmarshallerContext> unmarshaller = new UpdateDetectorVersionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDetectorVersionResult> responseHandler = new JsonResponseHandler<UpdateDetectorVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the detector version's description. You can update the metadata
     * for any detector version (<code>DRAFT, ACTIVE,</code> or
     * <code>INACTIVE</code>).
     * </p>
     * 
     * @param updateDetectorVersionMetadataRequest
     * @return updateDetectorVersionMetadataResult The response from the
     *         UpdateDetectorVersionMetadata service method, as returned by
     *         Amazon Fraud Detector.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDetectorVersionMetadataResult updateDetectorVersionMetadata(
            UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionMetadataRequest> request = null;
        Response<UpdateDetectorVersionMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionMetadataRequestMarshaller()
                        .marshall(updateDetectorVersionMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDetectorVersionMetadataResult, JsonUnmarshallerContext> unmarshaller = new UpdateDetectorVersionMetadataResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDetectorVersionMetadataResult> responseHandler = new JsonResponseHandler<UpdateDetectorVersionMetadataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the detector version’s status. You can perform the following
     * promotions or demotions using <code>UpdateDetectorVersionStatus</code>:
     * <code>DRAFT</code> to <code>ACTIVE</code>, <code>ACTIVE</code> to
     * <code>INACTIVE</code>, and <code>INACTIVE</code> to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateDetectorVersionStatusRequest
     * @return updateDetectorVersionStatusResult The response from the
     *         UpdateDetectorVersionStatus service method, as returned by Amazon
     *         Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDetectorVersionStatusResult updateDetectorVersionStatus(
            UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDetectorVersionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDetectorVersionStatusRequest> request = null;
        Response<UpdateDetectorVersionStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDetectorVersionStatusRequestMarshaller()
                        .marshall(updateDetectorVersionStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDetectorVersionStatusResult, JsonUnmarshallerContext> unmarshaller = new UpdateDetectorVersionStatusResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDetectorVersionStatusResult> responseHandler = new JsonResponseHandler<UpdateDetectorVersionStatusResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a model version. You can update the description and status
     * attributes using this action. You can perform the following status
     * updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code> back to <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionRequest
     * @return updateModelVersionResult The response from the UpdateModelVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateModelVersionResult updateModelVersion(
            UpdateModelVersionRequest updateModelVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateModelVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelVersionRequest> request = null;
        Response<UpdateModelVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelVersionRequestMarshaller()
                        .marshall(updateModelVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateModelVersionResult, JsonUnmarshallerContext> unmarshaller = new UpdateModelVersionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateModelVersionResult> responseHandler = new JsonResponseHandler<UpdateModelVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a rule's metadata.
     * </p>
     * 
     * @param updateRuleMetadataRequest
     * @return updateRuleMetadataResult The response from the UpdateRuleMetadata
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateRuleMetadataResult updateRuleMetadata(
            UpdateRuleMetadataRequest updateRuleMetadataRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRuleMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleMetadataRequest> request = null;
        Response<UpdateRuleMetadataResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleMetadataRequestMarshaller()
                        .marshall(updateRuleMetadataRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRuleMetadataResult, JsonUnmarshallerContext> unmarshaller = new UpdateRuleMetadataResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRuleMetadataResult> responseHandler = new JsonResponseHandler<UpdateRuleMetadataResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a rule version resulting in a new rule version.
     * </p>
     * 
     * @param updateRuleVersionRequest
     * @return updateRuleVersionResult The response from the UpdateRuleVersion
     *         service method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateRuleVersionResult updateRuleVersion(
            UpdateRuleVersionRequest updateRuleVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRuleVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleVersionRequest> request = null;
        Response<UpdateRuleVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleVersionRequestMarshaller()
                        .marshall(updateRuleVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRuleVersionResult, JsonUnmarshallerContext> unmarshaller = new UpdateRuleVersionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRuleVersionResult> responseHandler = new JsonResponseHandler<UpdateRuleVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a variable.
     * </p>
     * 
     * @param updateVariableRequest
     * @return updateVariableResult The response from the UpdateVariable service
     *         method, as returned by Amazon Fraud Detector.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Fraud Detector indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateVariableResult updateVariable(UpdateVariableRequest updateVariableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVariableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVariableRequest> request = null;
        Response<UpdateVariableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVariableRequestMarshaller().marshall(updateVariableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVariableResult, JsonUnmarshallerContext> unmarshaller = new UpdateVariableResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVariableResult> responseHandler = new JsonResponseHandler<UpdateVariableResult>(
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
