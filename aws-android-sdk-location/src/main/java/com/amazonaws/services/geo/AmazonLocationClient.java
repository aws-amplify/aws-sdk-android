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

package com.amazonaws.services.geo;

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

import com.amazonaws.services.geo.model.*;
import com.amazonaws.services.geo.model.transform.*;

/**
 * Client for accessing AWS Location service. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Suite of geospatial services including Maps, Places, Tracking, and Geofencing
 * </p>
 */
public class AmazonLocationClient extends AmazonWebServiceClient implements AmazonLocation {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Location service exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonLocation. A
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
    public AmazonLocationClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLocation. A
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
     *            how this client connects to AmazonLocation (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonLocationClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLocation using
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
     *         AmazonLocationClient client = new AmazonLocationClient(AWSMobileClient.getInstance());
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
    public AmazonLocationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLocation using
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
     *         AmazonLocationClient client = new AmazonLocationClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonLocation (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonLocationClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLocation using
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
     *         AmazonLocationClient client = new AmazonLocationClient(AWSMobileClient.getInstance());
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
    public AmazonLocationClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLocation using
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
     *         AmazonLocationClient client = new AmazonLocationClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonLocation (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonLocationClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLocation using
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
     *            how this client connects to AmazonLocation (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonLocationClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLocation using
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
     *         AmazonLocationClient client = new AmazonLocationClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonLocation (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonLocationClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        setServiceNameIntern("geo");
        this.setEndpoint("geo.us-east-1.amazonaws.com");
        this.endpointPrefix = "geo";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/geo/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/geo/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates an association between a geofence collection and a tracker
     * resource. This allows the tracker resource to communicate location data
     * to the linked geofence collection.
     * </p>
     * 
     * @param associateTrackerConsumerRequest
     * @return associateTrackerConsumerResult The response from the
     *         AssociateTrackerConsumer service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public AssociateTrackerConsumerResult associateTrackerConsumer(
            AssociateTrackerConsumerRequest associateTrackerConsumerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateTrackerConsumerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTrackerConsumerRequest> request = null;
        Response<AssociateTrackerConsumerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTrackerConsumerRequestMarshaller()
                        .marshall(associateTrackerConsumerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateTrackerConsumerResult, JsonUnmarshallerContext> unmarshaller = new AssociateTrackerConsumerResultJsonUnmarshaller();
            JsonResponseHandler<AssociateTrackerConsumerResult> responseHandler = new JsonResponseHandler<AssociateTrackerConsumerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a batch of geofences from a geofence collection.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You can't undo this action.
     * </p>
     * </note>
     * 
     * @param batchDeleteGeofenceRequest
     * @return batchDeleteGeofenceResult The response from the
     *         BatchDeleteGeofence service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchDeleteGeofenceResult batchDeleteGeofence(
            BatchDeleteGeofenceRequest batchDeleteGeofenceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteGeofenceRequest> request = null;
        Response<BatchDeleteGeofenceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteGeofenceRequestMarshaller()
                        .marshall(batchDeleteGeofenceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeleteGeofenceResult, JsonUnmarshallerContext> unmarshaller = new BatchDeleteGeofenceResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeleteGeofenceResult> responseHandler = new JsonResponseHandler<BatchDeleteGeofenceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Used in geofence monitoring. Evaluates device positions against the
     * position of geofences in a given geofence collection.
     * </p>
     * 
     * @param batchEvaluateGeofencesRequest
     * @return batchEvaluateGeofencesResult The response from the
     *         BatchEvaluateGeofences service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchEvaluateGeofencesResult batchEvaluateGeofences(
            BatchEvaluateGeofencesRequest batchEvaluateGeofencesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchEvaluateGeofencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchEvaluateGeofencesRequest> request = null;
        Response<BatchEvaluateGeofencesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchEvaluateGeofencesRequestMarshaller()
                        .marshall(batchEvaluateGeofencesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchEvaluateGeofencesResult, JsonUnmarshallerContext> unmarshaller = new BatchEvaluateGeofencesResultJsonUnmarshaller();
            JsonResponseHandler<BatchEvaluateGeofencesResult> responseHandler = new JsonResponseHandler<BatchEvaluateGeofencesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * A batch request to retrieve device positions.
     * </p>
     * <note>
     * <p>
     * The response will return the device positions from the last 24 hours.
     * </p>
     * </note>
     * 
     * @param batchGetDevicePositionRequest
     * @return batchGetDevicePositionResult The response from the
     *         BatchGetDevicePosition service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchGetDevicePositionResult batchGetDevicePosition(
            BatchGetDevicePositionRequest batchGetDevicePositionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetDevicePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDevicePositionRequest> request = null;
        Response<BatchGetDevicePositionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDevicePositionRequestMarshaller()
                        .marshall(batchGetDevicePositionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetDevicePositionResult, JsonUnmarshallerContext> unmarshaller = new BatchGetDevicePositionResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetDevicePositionResult> responseHandler = new JsonResponseHandler<BatchGetDevicePositionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * A batch request for storing geofences into a given geofence collection.
     * </p>
     * 
     * @param batchPutGeofenceRequest
     * @return batchPutGeofenceResult The response from the BatchPutGeofence
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchPutGeofenceResult batchPutGeofence(BatchPutGeofenceRequest batchPutGeofenceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchPutGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutGeofenceRequest> request = null;
        Response<BatchPutGeofenceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutGeofenceRequestMarshaller().marshall(batchPutGeofenceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchPutGeofenceResult, JsonUnmarshallerContext> unmarshaller = new BatchPutGeofenceResultJsonUnmarshaller();
            JsonResponseHandler<BatchPutGeofenceResult> responseHandler = new JsonResponseHandler<BatchPutGeofenceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Uploads a position update for one or more devices to a tracker resource.
     * The data is used for API queries requesting the device position and
     * position history.
     * </p>
     * <note>
     * <p>
     * Limitation — Location data is sampled at a fixed rate of 1 position per
     * 30 second interval, and retained for 1 year before it is deleted.
     * </p>
     * </note>
     * 
     * @param batchUpdateDevicePositionRequest
     * @return batchUpdateDevicePositionResult The response from the
     *         BatchUpdateDevicePosition service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public BatchUpdateDevicePositionResult batchUpdateDevicePosition(
            BatchUpdateDevicePositionRequest batchUpdateDevicePositionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchUpdateDevicePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateDevicePositionRequest> request = null;
        Response<BatchUpdateDevicePositionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateDevicePositionRequestMarshaller()
                        .marshall(batchUpdateDevicePositionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchUpdateDevicePositionResult, JsonUnmarshallerContext> unmarshaller = new BatchUpdateDevicePositionResultJsonUnmarshaller();
            JsonResponseHandler<BatchUpdateDevicePositionResult> responseHandler = new JsonResponseHandler<BatchUpdateDevicePositionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a geofence collection, which manages and stores geofences.
     * </p>
     * 
     * @param createGeofenceCollectionRequest
     * @return createGeofenceCollectionResult The response from the
     *         CreateGeofenceCollection service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateGeofenceCollectionResult createGeofenceCollection(
            CreateGeofenceCollectionRequest createGeofenceCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGeofenceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGeofenceCollectionRequest> request = null;
        Response<CreateGeofenceCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGeofenceCollectionRequestMarshaller()
                        .marshall(createGeofenceCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGeofenceCollectionResult, JsonUnmarshallerContext> unmarshaller = new CreateGeofenceCollectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateGeofenceCollectionResult> responseHandler = new JsonResponseHandler<CreateGeofenceCollectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a map resource in your AWS account, which provides map tiles of
     * different styles sourced from global location data providers.
     * </p>
     * <note>
     * <p>
     * By using Maps, you agree that AWS may transmit your API queries to your
     * selected third party provider for processing, which may be outside the
     * AWS region you are currently using. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     * 
     * @param createMapRequest
     * @return createMapResult The response from the CreateMap service method,
     *         as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateMapResult createMap(CreateMapRequest createMapRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMapRequest> request = null;
        Response<CreateMapResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMapRequestMarshaller().marshall(createMapRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMapResult, JsonUnmarshallerContext> unmarshaller = new CreateMapResultJsonUnmarshaller();
            JsonResponseHandler<CreateMapResult> responseHandler = new JsonResponseHandler<CreateMapResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Place index resource in your AWS account, which supports Places
     * functions with geospatial data sourced from your chosen data provider.
     * </p>
     * <note>
     * <p>
     * By using Places, you agree that AWS may transmit your API queries to your
     * selected third party provider for processing, which may be outside the
     * AWS region you are currently using.
     * </p>
     * <p>
     * Because of licensing limitations, you may not use HERE to store results
     * for locations in Japan. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     * 
     * @param createPlaceIndexRequest
     * @return createPlaceIndexResult The response from the CreatePlaceIndex
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreatePlaceIndexResult createPlaceIndex(CreatePlaceIndexRequest createPlaceIndexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPlaceIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlaceIndexRequest> request = null;
        Response<CreatePlaceIndexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlaceIndexRequestMarshaller().marshall(createPlaceIndexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePlaceIndexResult, JsonUnmarshallerContext> unmarshaller = new CreatePlaceIndexResultJsonUnmarshaller();
            JsonResponseHandler<CreatePlaceIndexResult> responseHandler = new JsonResponseHandler<CreatePlaceIndexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a tracker resource in your AWS account, which lets you retrieve
     * current and historical location of devices.
     * </p>
     * 
     * @param createTrackerRequest
     * @return createTrackerResult The response from the CreateTracker service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateTrackerResult createTracker(CreateTrackerRequest createTrackerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrackerRequest> request = null;
        Response<CreateTrackerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrackerRequestMarshaller().marshall(createTrackerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTrackerResult, JsonUnmarshallerContext> unmarshaller = new CreateTrackerResultJsonUnmarshaller();
            JsonResponseHandler<CreateTrackerResult> responseHandler = new JsonResponseHandler<CreateTrackerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a geofence collection from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You can't undo this action.
     * If the geofence collection is the target of a tracker resource, the
     * devices will no longer be monitored.
     * </p>
     * </note>
     * 
     * @param deleteGeofenceCollectionRequest
     * @return deleteGeofenceCollectionResult The response from the
     *         DeleteGeofenceCollection service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteGeofenceCollectionResult deleteGeofenceCollection(
            DeleteGeofenceCollectionRequest deleteGeofenceCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGeofenceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGeofenceCollectionRequest> request = null;
        Response<DeleteGeofenceCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGeofenceCollectionRequestMarshaller()
                        .marshall(deleteGeofenceCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGeofenceCollectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteGeofenceCollectionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGeofenceCollectionResult> responseHandler = new JsonResponseHandler<DeleteGeofenceCollectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a map resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You cannot undo this
     * action. If the map is being used in an application, the map may not
     * render.
     * </p>
     * </note>
     * 
     * @param deleteMapRequest
     * @return deleteMapResult The response from the DeleteMap service method,
     *         as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteMapResult deleteMap(DeleteMapRequest deleteMapRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMapRequest> request = null;
        Response<DeleteMapResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMapRequestMarshaller().marshall(deleteMapRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMapResult, JsonUnmarshallerContext> unmarshaller = new DeleteMapResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMapResult> responseHandler = new JsonResponseHandler<DeleteMapResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a Place index resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You cannot undo this
     * action.
     * </p>
     * </note>
     * 
     * @param deletePlaceIndexRequest
     * @return deletePlaceIndexResult The response from the DeletePlaceIndex
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeletePlaceIndexResult deletePlaceIndex(DeletePlaceIndexRequest deletePlaceIndexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePlaceIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlaceIndexRequest> request = null;
        Response<DeletePlaceIndexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePlaceIndexRequestMarshaller().marshall(deletePlaceIndexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePlaceIndexResult, JsonUnmarshallerContext> unmarshaller = new DeletePlaceIndexResultJsonUnmarshaller();
            JsonResponseHandler<DeletePlaceIndexResult> responseHandler = new JsonResponseHandler<DeletePlaceIndexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a tracker resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This action deletes the resource permanently. You can't undo this action.
     * If the tracker resource is in use, you may encounter an error. Make sure
     * that the target resource is not a dependency for your applications.
     * </p>
     * </note>
     * 
     * @param deleteTrackerRequest
     * @return deleteTrackerResult The response from the DeleteTracker service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteTrackerResult deleteTracker(DeleteTrackerRequest deleteTrackerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrackerRequest> request = null;
        Response<DeleteTrackerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrackerRequestMarshaller().marshall(deleteTrackerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTrackerResult, JsonUnmarshallerContext> unmarshaller = new DeleteTrackerResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTrackerResult> responseHandler = new JsonResponseHandler<DeleteTrackerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the geofence collection details.
     * </p>
     * 
     * @param describeGeofenceCollectionRequest
     * @return describeGeofenceCollectionResult The response from the
     *         DescribeGeofenceCollection service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeGeofenceCollectionResult describeGeofenceCollection(
            DescribeGeofenceCollectionRequest describeGeofenceCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGeofenceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGeofenceCollectionRequest> request = null;
        Response<DescribeGeofenceCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGeofenceCollectionRequestMarshaller()
                        .marshall(describeGeofenceCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeGeofenceCollectionResult, JsonUnmarshallerContext> unmarshaller = new DescribeGeofenceCollectionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeGeofenceCollectionResult> responseHandler = new JsonResponseHandler<DescribeGeofenceCollectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the map resource details.
     * </p>
     * 
     * @param describeMapRequest
     * @return describeMapResult The response from the DescribeMap service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeMapResult describeMap(DescribeMapRequest describeMapRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMapRequest> request = null;
        Response<DescribeMapResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMapRequestMarshaller().marshall(describeMapRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMapResult, JsonUnmarshallerContext> unmarshaller = new DescribeMapResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMapResult> responseHandler = new JsonResponseHandler<DescribeMapResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the Place index resource details.
     * </p>
     * 
     * @param describePlaceIndexRequest
     * @return describePlaceIndexResult The response from the DescribePlaceIndex
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribePlaceIndexResult describePlaceIndex(
            DescribePlaceIndexRequest describePlaceIndexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePlaceIndexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlaceIndexRequest> request = null;
        Response<DescribePlaceIndexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePlaceIndexRequestMarshaller()
                        .marshall(describePlaceIndexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePlaceIndexResult, JsonUnmarshallerContext> unmarshaller = new DescribePlaceIndexResultJsonUnmarshaller();
            JsonResponseHandler<DescribePlaceIndexResult> responseHandler = new JsonResponseHandler<DescribePlaceIndexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the tracker resource details.
     * </p>
     * 
     * @param describeTrackerRequest
     * @return describeTrackerResult The response from the DescribeTracker
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DescribeTrackerResult describeTracker(DescribeTrackerRequest describeTrackerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrackerRequest> request = null;
        Response<DescribeTrackerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrackerRequestMarshaller().marshall(describeTrackerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrackerResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrackerResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrackerResult> responseHandler = new JsonResponseHandler<DescribeTrackerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the association bewteen a tracker resource and a geofence
     * collection.
     * </p>
     * <note>
     * <p>
     * Once you unlink a tracker resource from a geofence collection, the
     * tracker positions will no longer be automatically evaluated against
     * geofences.
     * </p>
     * </note>
     * 
     * @param disassociateTrackerConsumerRequest
     * @return disassociateTrackerConsumerResult The response from the
     *         DisassociateTrackerConsumer service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DisassociateTrackerConsumerResult disassociateTrackerConsumer(
            DisassociateTrackerConsumerRequest disassociateTrackerConsumerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateTrackerConsumerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTrackerConsumerRequest> request = null;
        Response<DisassociateTrackerConsumerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTrackerConsumerRequestMarshaller()
                        .marshall(disassociateTrackerConsumerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateTrackerConsumerResult, JsonUnmarshallerContext> unmarshaller = new DisassociateTrackerConsumerResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateTrackerConsumerResult> responseHandler = new JsonResponseHandler<DisassociateTrackerConsumerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the latest device position.
     * </p>
     * <note>
     * <p>
     * Limitation — Device positions are deleted after one year.
     * </p>
     * </note>
     * 
     * @param getDevicePositionRequest
     * @return getDevicePositionResult The response from the GetDevicePosition
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDevicePositionResult getDevicePosition(
            GetDevicePositionRequest getDevicePositionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDevicePositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicePositionRequest> request = null;
        Response<GetDevicePositionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicePositionRequestMarshaller()
                        .marshall(getDevicePositionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDevicePositionResult, JsonUnmarshallerContext> unmarshaller = new GetDevicePositionResultJsonUnmarshaller();
            JsonResponseHandler<GetDevicePositionResult> responseHandler = new JsonResponseHandler<GetDevicePositionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the device position history from a tracker resource within a
     * specified range of time.
     * </p>
     * <note>
     * <p>
     * Limitation — Device positions are deleted after one year.
     * </p>
     * </note>
     * 
     * @param getDevicePositionHistoryRequest
     * @return getDevicePositionHistoryResult The response from the
     *         GetDevicePositionHistory service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDevicePositionHistoryResult getDevicePositionHistory(
            GetDevicePositionHistoryRequest getDevicePositionHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDevicePositionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicePositionHistoryRequest> request = null;
        Response<GetDevicePositionHistoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicePositionHistoryRequestMarshaller()
                        .marshall(getDevicePositionHistoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDevicePositionHistoryResult, JsonUnmarshallerContext> unmarshaller = new GetDevicePositionHistoryResultJsonUnmarshaller();
            JsonResponseHandler<GetDevicePositionHistoryResult> responseHandler = new JsonResponseHandler<GetDevicePositionHistoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the geofence details from a geofence collection.
     * </p>
     * 
     * @param getGeofenceRequest
     * @return getGeofenceResult The response from the GetGeofence service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetGeofenceResult getGeofence(GetGeofenceRequest getGeofenceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGeofenceRequest> request = null;
        Response<GetGeofenceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGeofenceRequestMarshaller().marshall(getGeofenceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGeofenceResult, JsonUnmarshallerContext> unmarshaller = new GetGeofenceResultJsonUnmarshaller();
            JsonResponseHandler<GetGeofenceResult> responseHandler = new JsonResponseHandler<GetGeofenceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves glyphs used to display labels on a map.
     * </p>
     * 
     * @param getMapGlyphsRequest
     * @return getMapGlyphsResult The response from the GetMapGlyphs service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetMapGlyphsResult getMapGlyphs(GetMapGlyphsRequest getMapGlyphsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMapGlyphsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapGlyphsRequest> request = null;
        Response<GetMapGlyphsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapGlyphsRequestMarshaller().marshall(getMapGlyphsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMapGlyphsResult, JsonUnmarshallerContext> unmarshaller = new GetMapGlyphsResultJsonUnmarshaller();
            JsonResponseHandler<GetMapGlyphsResult> responseHandler = new JsonResponseHandler<GetMapGlyphsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the sprite sheet corresponding to a map resource. The sprite
     * sheet is a PNG image paired with a JSON document describing the offsets
     * of individual icons that will be displayed on a rendered map.
     * </p>
     * 
     * @param getMapSpritesRequest
     * @return getMapSpritesResult The response from the GetMapSprites service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetMapSpritesResult getMapSprites(GetMapSpritesRequest getMapSpritesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMapSpritesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapSpritesRequest> request = null;
        Response<GetMapSpritesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapSpritesRequestMarshaller().marshall(getMapSpritesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMapSpritesResult, JsonUnmarshallerContext> unmarshaller = new GetMapSpritesResultJsonUnmarshaller();
            JsonResponseHandler<GetMapSpritesResult> responseHandler = new JsonResponseHandler<GetMapSpritesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the map style descriptor from a map resource.
     * </p>
     * <p>
     * The style descriptor contains speciﬁcations on how features render on a
     * map. For example, what data to display, what order to display the data
     * in, and the style for the data. Style descriptors follow the Mapbox Style
     * Specification.
     * </p>
     * 
     * @param getMapStyleDescriptorRequest
     * @return getMapStyleDescriptorResult The response from the
     *         GetMapStyleDescriptor service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetMapStyleDescriptorResult getMapStyleDescriptor(
            GetMapStyleDescriptorRequest getMapStyleDescriptorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMapStyleDescriptorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapStyleDescriptorRequest> request = null;
        Response<GetMapStyleDescriptorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapStyleDescriptorRequestMarshaller()
                        .marshall(getMapStyleDescriptorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMapStyleDescriptorResult, JsonUnmarshallerContext> unmarshaller = new GetMapStyleDescriptorResultJsonUnmarshaller();
            JsonResponseHandler<GetMapStyleDescriptorResult> responseHandler = new JsonResponseHandler<GetMapStyleDescriptorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves a vector data tile from the map resource. Map tiles are used by
     * clients to render a map. They are addressed using a grid arrangement with
     * an X coordinate, Y coordinate, and Z (zoom) level.
     * </p>
     * <p>
     * The origin (0, 0) is the top left of the map. Increasing the zoom level
     * by 1 doubles both the X and Y dimensions, so a tile containing data for
     * the entire world at (0/0/0) will be split into 4 tiles at zoom 1 (1/0/0,
     * 1/0/1, 1/1/0, 1/1/1).
     * </p>
     * 
     * @param getMapTileRequest
     * @return getMapTileResult The response from the GetMapTile service method,
     *         as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetMapTileResult getMapTile(GetMapTileRequest getMapTileRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMapTileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMapTileRequest> request = null;
        Response<GetMapTileResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMapTileRequestMarshaller().marshall(getMapTileRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMapTileResult, JsonUnmarshallerContext> unmarshaller = new GetMapTileResultJsonUnmarshaller();
            JsonResponseHandler<GetMapTileResult> responseHandler = new JsonResponseHandler<GetMapTileResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists geofence collections in your AWS account.
     * </p>
     * 
     * @param listGeofenceCollectionsRequest
     * @return listGeofenceCollectionsResult The response from the
     *         ListGeofenceCollections service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListGeofenceCollectionsResult listGeofenceCollections(
            ListGeofenceCollectionsRequest listGeofenceCollectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGeofenceCollectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGeofenceCollectionsRequest> request = null;
        Response<ListGeofenceCollectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGeofenceCollectionsRequestMarshaller()
                        .marshall(listGeofenceCollectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGeofenceCollectionsResult, JsonUnmarshallerContext> unmarshaller = new ListGeofenceCollectionsResultJsonUnmarshaller();
            JsonResponseHandler<ListGeofenceCollectionsResult> responseHandler = new JsonResponseHandler<ListGeofenceCollectionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists geofences stored in a given geofence collection.
     * </p>
     * 
     * @param listGeofencesRequest
     * @return listGeofencesResult The response from the ListGeofences service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListGeofencesResult listGeofences(ListGeofencesRequest listGeofencesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGeofencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGeofencesRequest> request = null;
        Response<ListGeofencesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGeofencesRequestMarshaller().marshall(listGeofencesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGeofencesResult, JsonUnmarshallerContext> unmarshaller = new ListGeofencesResultJsonUnmarshaller();
            JsonResponseHandler<ListGeofencesResult> responseHandler = new JsonResponseHandler<ListGeofencesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists map resources in your AWS account.
     * </p>
     * 
     * @param listMapsRequest
     * @return listMapsResult The response from the ListMaps service method, as
     *         returned by AWS Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListMapsResult listMaps(ListMapsRequest listMapsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMapsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMapsRequest> request = null;
        Response<ListMapsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMapsRequestMarshaller().marshall(listMapsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMapsResult, JsonUnmarshallerContext> unmarshaller = new ListMapsResultJsonUnmarshaller();
            JsonResponseHandler<ListMapsResult> responseHandler = new JsonResponseHandler<ListMapsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists Place index resources in your AWS account.
     * </p>
     * 
     * @param listPlaceIndexesRequest
     * @return listPlaceIndexesResult The response from the ListPlaceIndexes
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListPlaceIndexesResult listPlaceIndexes(ListPlaceIndexesRequest listPlaceIndexesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPlaceIndexesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlaceIndexesRequest> request = null;
        Response<ListPlaceIndexesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPlaceIndexesRequestMarshaller().marshall(listPlaceIndexesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPlaceIndexesResult, JsonUnmarshallerContext> unmarshaller = new ListPlaceIndexesResultJsonUnmarshaller();
            JsonResponseHandler<ListPlaceIndexesResult> responseHandler = new JsonResponseHandler<ListPlaceIndexesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists geofence collections currently associated to the given tracker
     * resource.
     * </p>
     * 
     * @param listTrackerConsumersRequest
     * @return listTrackerConsumersResult The response from the
     *         ListTrackerConsumers service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTrackerConsumersResult listTrackerConsumers(
            ListTrackerConsumersRequest listTrackerConsumersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTrackerConsumersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrackerConsumersRequest> request = null;
        Response<ListTrackerConsumersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrackerConsumersRequestMarshaller()
                        .marshall(listTrackerConsumersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTrackerConsumersResult, JsonUnmarshallerContext> unmarshaller = new ListTrackerConsumersResultJsonUnmarshaller();
            JsonResponseHandler<ListTrackerConsumersResult> responseHandler = new JsonResponseHandler<ListTrackerConsumersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists tracker resources in your AWS account.
     * </p>
     * 
     * @param listTrackersRequest
     * @return listTrackersResult The response from the ListTrackers service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListTrackersResult listTrackers(ListTrackersRequest listTrackersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTrackersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrackersRequest> request = null;
        Response<ListTrackersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrackersRequestMarshaller().marshall(listTrackersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTrackersResult, JsonUnmarshallerContext> unmarshaller = new ListTrackersResultJsonUnmarshaller();
            JsonResponseHandler<ListTrackersResult> responseHandler = new JsonResponseHandler<ListTrackersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stores a geofence to a given geofence collection, or updates the geometry
     * of an existing geofence if a geofence ID is included in the request.
     * </p>
     * 
     * @param putGeofenceRequest
     * @return putGeofenceResult The response from the PutGeofence service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutGeofenceResult putGeofence(PutGeofenceRequest putGeofenceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putGeofenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutGeofenceRequest> request = null;
        Response<PutGeofenceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutGeofenceRequestMarshaller().marshall(putGeofenceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutGeofenceResult, JsonUnmarshallerContext> unmarshaller = new PutGeofenceResultJsonUnmarshaller();
            JsonResponseHandler<PutGeofenceResult> responseHandler = new JsonResponseHandler<PutGeofenceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Reverse geocodes a given coordinate and returns a legible address. Allows
     * you to search for Places or points of interest near a given position.
     * </p>
     * <note>
     * <p>
     * By using Places, you agree that AWS may transmit your API queries to your
     * selected third party provider for processing, which may be outside the
     * AWS region you are currently using.
     * </p>
     * <p>
     * Because of licensing limitations, you may not use HERE to store results
     * for locations in Japan. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForPositionRequest
     * @return searchPlaceIndexForPositionResult The response from the
     *         SearchPlaceIndexForPosition service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SearchPlaceIndexForPositionResult searchPlaceIndexForPosition(
            SearchPlaceIndexForPositionRequest searchPlaceIndexForPositionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchPlaceIndexForPositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchPlaceIndexForPositionRequest> request = null;
        Response<SearchPlaceIndexForPositionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchPlaceIndexForPositionRequestMarshaller()
                        .marshall(searchPlaceIndexForPositionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchPlaceIndexForPositionResult, JsonUnmarshallerContext> unmarshaller = new SearchPlaceIndexForPositionResultJsonUnmarshaller();
            JsonResponseHandler<SearchPlaceIndexForPositionResult> responseHandler = new JsonResponseHandler<SearchPlaceIndexForPositionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Geocodes free-form text, such as an address, name, city, or region to
     * allow you to search for Places or points of interest.
     * </p>
     * <p>
     * Includes the option to apply additional parameters to narrow your list of
     * results.
     * </p>
     * <note>
     * <p>
     * You can search for places near a given position using
     * <code>BiasPosition</code>, or filter results within a bounding box using
     * <code>FilterBBox</code>. Providing both parameters simultaneously returns
     * an error.
     * </p>
     * </note> <note>
     * <p>
     * By using Places, you agree that AWS may transmit your API queries to your
     * selected third party provider for processing, which may be outside the
     * AWS region you are currently using.
     * </p>
     * <p>
     * Also, when using HERE as your data provider, you may not (a) use HERE
     * Places for Asset Management, or (b) select the <code>Storage</code>
     * option for the <code>IntendedUse</code> parameter when requesting Places
     * in Japan. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForTextRequest
     * @return searchPlaceIndexForTextResult The response from the
     *         SearchPlaceIndexForText service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SearchPlaceIndexForTextResult searchPlaceIndexForText(
            SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchPlaceIndexForTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchPlaceIndexForTextRequest> request = null;
        Response<SearchPlaceIndexForTextResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchPlaceIndexForTextRequestMarshaller()
                        .marshall(searchPlaceIndexForTextRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchPlaceIndexForTextResult, JsonUnmarshallerContext> unmarshaller = new SearchPlaceIndexForTextResultJsonUnmarshaller();
            JsonResponseHandler<SearchPlaceIndexForTextResult> responseHandler = new JsonResponseHandler<SearchPlaceIndexForTextResult>(
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
