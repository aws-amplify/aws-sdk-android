/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition;

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

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.services.rekognition.model.transform.*;

/**
 * Client for accessing Amazon Rekognition. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * This is the Amazon Rekognition API reference.
 * </p>
 */
public class AmazonRekognitionClient extends AmazonWebServiceClient implements AmazonRekognition {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Rekognition exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition. A
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
    public AmazonRekognitionClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition. A
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
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonRekognitionClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonRekognitionClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials and client configuration
     * options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRekognitionClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials provider.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
     * using the specified AWS account credentials provider and client
     * configuration options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
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
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRekognition
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
     *            how this client connects to AmazonRekognition (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonRekognitionClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdempotentParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ImageTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidImageFormatExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPaginationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidS3ObjectExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new VideoTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("rekognition.us-east-1.amazonaws.com");
        this.endpointPrefix = "rekognition";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/rekognition/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/rekognition/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Compares a face in the <i>source</i> input image with each of the 100
     * largest faces detected in the <i>target</i> input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the
     * largest face and compares it with each face detected in the target image.
     * </p>
     * </note>
     * <p>
     * You pass the input and target images either as base64-encoded image bytes
     * or as a references to images in an Amazon S3 bucket. If you use the
     * Amazon CLI to call Amazon Rekognition operations, passing image bytes is
     * not supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * In response, the operation returns an array of face matches ordered by
     * similarity score in descending order. For each face match, the response
     * provides a bounding box of the face, facial landmarks, pose details
     * (pitch, role, and yaw), quality (brightness and sharpness), and
     * confidence value (indicating the level of confidence that the bounding
     * box contains a face). The response also provides a similarity score,
     * which indicates how closely the faces match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with a similarity score of greater than or equal
     * to 80% are returned in the response. You can change this value by
     * specifying the <code>SimilarityThreshold</code> parameter.
     * </p>
     * </note>
     * <p>
     * <code>CompareFaces</code> also returns an array of faces that don't match
     * the source image. For each face, it returns a bounding box, confidence
     * value, landmarks, pose details, and quality. The response also returns
     * information about the face in the source image, including the bounding
     * box of the face and confidence value.
     * </p>
     * <p>
     * If the image doesn't contain Exif metadata, <code>CompareFaces</code>
     * returns orientation information for the source and target images. Use
     * these values to display the images with the correct image orientation.
     * </p>
     * <p>
     * If no faces are detected in the source or target images,
     * <code>CompareFaces</code> returns an
     * <code>InvalidParameterException</code> error.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, data returned by this
     * operation doesn't persist.
     * </p>
     * </note>
     * <p>
     * For an example, see Comparing Faces in Images in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CompareFaces</code> action.
     * </p>
     * 
     * @param compareFacesRequest
     * @return compareFacesResult The response from the CompareFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CompareFacesResult compareFaces(CompareFacesRequest compareFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(compareFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompareFacesRequest> request = null;
        Response<CompareFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompareFacesRequestMarshaller().marshall(compareFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CompareFacesResult, JsonUnmarshallerContext> unmarshaller = new CompareFacesResultJsonUnmarshaller();
            JsonResponseHandler<CompareFacesResult> responseHandler = new JsonResponseHandler<CompareFacesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a collection in an AWS Region. You can add faces to the
     * collection using the operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your
     * application users. A user can then index faces using the
     * <code>IndexFaces</code> operation and persist results in a specific
     * collection. Then, a user can search the collection for faces in the
     * user-specific container.
     * </p>
     * <note>
     * <p>
     * Collection names are case-sensitive.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:CreateCollection</code> action.
     * </p>
     * 
     * @param createCollectionRequest
     * @return createCollectionResult The response from the CreateCollection
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCollectionResult createCollection(CreateCollectionRequest createCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCollectionRequest> request = null;
        Response<CreateCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCollectionRequestMarshaller().marshall(createCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCollectionResult, JsonUnmarshallerContext> unmarshaller = new CreateCollectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateCollectionResult> responseHandler = new JsonResponseHandler<CreateCollectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an Amazon Rekognition stream processor that you can use to detect
     * and recognize faces in a streaming video.
     * </p>
     * <p>
     * Amazon Rekognition Video is a consumer of live video from Amazon Kinesis
     * Video Streams. Amazon Rekognition Video sends analysis results to Amazon
     * Kinesis Data Streams.
     * </p>
     * <p>
     * You provide as input a Kinesis video stream (<code>Input</code>) and a
     * Kinesis data stream (<code>Output</code>) stream. You also specify the
     * face recognition criteria in <code>Settings</code>. For example, the
     * collection containing faces that you want to recognize. Use
     * <code>Name</code> to assign an identifier for the stream processor. You
     * use <code>Name</code> to manage the stream processor. For example, you
     * can start processing the source video by calling with the
     * <code>Name</code> field.
     * </p>
     * <p>
     * After you have finished analyzing a streaming video, use to stop
     * processing. You can delete the stream processor by calling .
     * </p>
     * 
     * @param createStreamProcessorRequest
     * @return createStreamProcessorResult The response from the
     *         CreateStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateStreamProcessorResult createStreamProcessor(
            CreateStreamProcessorRequest createStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamProcessorRequest> request = null;
        Response<CreateStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamProcessorRequestMarshaller()
                        .marshall(createStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new CreateStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<CreateStreamProcessorResult> responseHandler = new JsonResponseHandler<CreateStreamProcessorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all
     * faces in the collection. For an example, see
     * <a>delete-collection-procedure</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteCollection</code> action.
     * </p>
     * 
     * @param deleteCollectionRequest
     * @return deleteCollectionResult The response from the DeleteCollection
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteCollectionResult deleteCollection(DeleteCollectionRequest deleteCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCollectionRequest> request = null;
        Response<DeleteCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCollectionRequestMarshaller().marshall(deleteCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCollectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteCollectionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCollectionResult> responseHandler = new JsonResponseHandler<DeleteCollectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes faces from a collection. You specify a collection ID and an array
     * of face IDs to remove from the collection.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DeleteFaces</code> action.
     * </p>
     * 
     * @param deleteFacesRequest
     * @return deleteFacesResult The response from the DeleteFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteFacesResult deleteFaces(DeleteFacesRequest deleteFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFacesRequest> request = null;
        Response<DeleteFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFacesRequestMarshaller().marshall(deleteFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteFacesResult, JsonUnmarshallerContext> unmarshaller = new DeleteFacesResultJsonUnmarshaller();
            JsonResponseHandler<DeleteFacesResult> responseHandler = new JsonResponseHandler<DeleteFacesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the stream processor identified by <code>Name</code>. You assign
     * the value for <code>Name</code> when you create the stream processor with
     * . You might not be able to use the same name for a stream processor for a
     * few seconds after calling <code>DeleteStreamProcessor</code>.
     * </p>
     * 
     * @param deleteStreamProcessorRequest
     * @return deleteStreamProcessorResult The response from the
     *         DeleteStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteStreamProcessorResult deleteStreamProcessor(
            DeleteStreamProcessorRequest deleteStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamProcessorRequest> request = null;
        Response<DeleteStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamProcessorRequestMarshaller()
                        .marshall(deleteStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new DeleteStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<DeleteStreamProcessorResult> responseHandler = new JsonResponseHandler<DeleteStreamProcessorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param describeCollectionRequest
     * @return describeCollectionResult The response from the DescribeCollection
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCollectionResult describeCollection(
            DescribeCollectionRequest describeCollectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCollectionRequest> request = null;
        Response<DescribeCollectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCollectionRequestMarshaller()
                        .marshall(describeCollectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCollectionResult, JsonUnmarshallerContext> unmarshaller = new DescribeCollectionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCollectionResult> responseHandler = new JsonResponseHandler<DescribeCollectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides information about a stream processor created by . You can get
     * information about the input and output streams, the input parameters for
     * the face recognition being performed, and the current status of the
     * stream processor.
     * </p>
     * 
     * @param describeStreamProcessorRequest
     * @return describeStreamProcessorResult The response from the
     *         DescribeStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeStreamProcessorResult describeStreamProcessor(
            DescribeStreamProcessorRequest describeStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamProcessorRequest> request = null;
        Response<DescribeStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamProcessorRequestMarshaller()
                        .marshall(describeStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new DescribeStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStreamProcessorResult> responseHandler = new JsonResponseHandler<DescribeStreamProcessorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects faces within an image that is provided as input.
     * </p>
     * <p>
     * <code>DetectFaces</code> detects the 100 largest faces in the image. For
     * each face detected, the operation returns face details including a
     * bounding box of the face, a confidence value (that the bounding box
     * contains a face), and a fixed set of attributes such as facial landmarks
     * (for example, coordinates of eye and mouth), gender, presence of beard,
     * sunglasses, etc.
     * </p>
     * <p>
     * The face-detection algorithm is most effective on frontal faces. For
     * non-frontal or obscured faces, the algorithm may not detect the faces or
     * might detect faces with lower confidence.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DetectFaces</code> action.
     * </p>
     * 
     * @param detectFacesRequest
     * @return detectFacesResult The response from the DetectFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectFacesResult detectFaces(DetectFacesRequest detectFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectFacesRequest> request = null;
        Response<DetectFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectFacesRequestMarshaller().marshall(detectFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectFacesResult, JsonUnmarshallerContext> unmarshaller = new DetectFacesResultJsonUnmarshaller();
            JsonResponseHandler<DetectFacesResult> responseHandler = new JsonResponseHandler<DetectFacesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects instances of real-world entities within an image (JPEG or PNG)
     * provided as input. This includes objects like flower, tree, and table;
     * events like wedding, graduation, and birthday party; and concepts like
     * landscape, evening, and nature.
     * </p>
     * <p>
     * For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the
     * Amazon Rekognition Developer Guide.
     * </p>
     * <note>
     * <p>
     * <code>DetectLabels</code> does not support the detection of activities.
     * However, activity detection is supported for label detection in videos.
     * For more information, see StartLabelDetection in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * </note>
     * <p>
     * You pass the input image as base64-encoded image bytes or as a reference
     * to an image in an Amazon S3 bucket. If you use the Amazon CLI to call
     * Amazon Rekognition operations, passing image bytes is not supported. The
     * image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For each object, scene, and concept the API returns one or more labels.
     * Each label provides the object name, and the level of confidence that the
     * image contains the object. For example, suppose the input image has a
     * lighthouse, the sea, and a rock. The response will include all three
     * labels, one for each object.
     * </p>
     * <p>
     * <code>{Name: lighthouse, Confidence: 98.4629}</code>
     * </p>
     * <p>
     * <code>{Name: rock,Confidence: 79.2097}</code>
     * </p>
     * <p>
     * <code> {Name: sea,Confidence: 75.061}</code>
     * </p>
     * <p>
     * In the preceding example, the operation returns one label for each of the
     * three objects. The operation can also return multiple labels for the same
     * object in the image. For example, if the input image shows a flower (for
     * example, a tulip), the operation might return the following three labels.
     * </p>
     * <p>
     * <code>{Name: flower,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: plant,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * <code>{Name: tulip,Confidence: 99.0562}</code>
     * </p>
     * <p>
     * In this example, the detection algorithm more precisely identifies the
     * flower as a tulip.
     * </p>
     * <p>
     * In response, the API returns an array of labels. In addition, the
     * response also includes the orientation correction. Optionally, you can
     * specify <code>MinConfidence</code> to control the confidence threshold
     * for the labels returned. The default is 50%. You can also add the
     * <code>MaxLabels</code> parameter to limit the number of labels returned.
     * </p>
     * <note>
     * <p>
     * If the object detected is a person, the operation doesn't provide the
     * same facial details that the <a>DetectFaces</a> operation provides.
     * </p>
     * </note>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:DetectLabels</code> action.
     * </p>
     * 
     * @param detectLabelsRequest
     * @return detectLabelsResult The response from the DetectLabels service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectLabelsResult detectLabels(DetectLabelsRequest detectLabelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectLabelsRequest> request = null;
        Response<DetectLabelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectLabelsRequestMarshaller().marshall(detectLabelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectLabelsResult, JsonUnmarshallerContext> unmarshaller = new DetectLabelsResultJsonUnmarshaller();
            JsonResponseHandler<DetectLabelsResult> responseHandler = new JsonResponseHandler<DetectLabelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects explicit or suggestive adult content in a specified JPEG or PNG
     * format image. Use <code>DetectModerationLabels</code> to moderate images
     * depending on your requirements. For example, you might want to filter
     * images that contain nudity, but not images containing suggestive content.
     * </p>
     * <p>
     * To filter images, use the labels returned by
     * <code>DetectModerationLabels</code> to determine which types of content
     * are appropriate.
     * </p>
     * <p>
     * For information about moderation labels, see Detecting Unsafe Content in
     * the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * 
     * @param detectModerationLabelsRequest
     * @return detectModerationLabelsResult The response from the
     *         DetectModerationLabels service method, as returned by Amazon
     *         Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectModerationLabelsResult detectModerationLabels(
            DetectModerationLabelsRequest detectModerationLabelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectModerationLabelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectModerationLabelsRequest> request = null;
        Response<DetectModerationLabelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectModerationLabelsRequestMarshaller()
                        .marshall(detectModerationLabelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectModerationLabelsResult, JsonUnmarshallerContext> unmarshaller = new DetectModerationLabelsResultJsonUnmarshaller();
            JsonResponseHandler<DetectModerationLabelsResult> responseHandler = new JsonResponseHandler<DetectModerationLabelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects text in the input image and converts it into machine-readable
     * text.
     * </p>
     * <p>
     * Pass the input image as base64-encoded image bytes or as a reference to
     * an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon
     * Rekognition operations, you must pass it as a reference to an image in an
     * Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported.
     * The image must be either a .png or .jpeg formatted file.
     * </p>
     * <p>
     * The <code>DetectText</code> operation returns text in an array of
     * elements, <code>TextDetections</code>. Each <code>TextDetection</code>
     * element provides information about a single word or line of text that was
     * detected in the image.
     * </p>
     * <p>
     * A word is one or more ISO basic latin script characters that are not
     * separated by spaces. <code>DetectText</code> can detect up to 50 words in
     * an image.
     * </p>
     * <p>
     * A line is a string of equally spaced words. A line isn't necessarily a
     * complete sentence. For example, a driver's license number is detected as
     * a line. A line ends when there is no aligned text after it. Also, a line
     * ends when there is a large gap between words, relative to the length of
     * the words. This means, depending on the gap between words, Amazon
     * Rekognition may detect multiple lines in text aligned in the same
     * direction. Periods don't represent the end of a line. If a sentence spans
     * multiple lines, the <code>DetectText</code> operation returns multiple
     * lines.
     * </p>
     * <p>
     * To determine whether a <code>TextDetection</code> element is a line of
     * text or a word, use the <code>TextDetection</code> object
     * <code>Type</code> field.
     * </p>
     * <p>
     * To be detected, text must be within +/- 30 degrees orientation of the
     * horizontal axis.
     * </p>
     * <p>
     * For more information, see DetectText in the Amazon Rekognition Developer
     * Guide.
     * </p>
     * 
     * @param detectTextRequest
     * @return detectTextResult The response from the DetectText service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectTextResult detectText(DetectTextRequest detectTextRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectTextRequest> request = null;
        Response<DetectTextResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectTextRequestMarshaller().marshall(detectTextRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectTextResult, JsonUnmarshallerContext> unmarshaller = new DetectTextResultJsonUnmarshaller();
            JsonResponseHandler<DetectTextResult> responseHandler = new JsonResponseHandler<DetectTextResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the name and additional information about a celebrity based on his
     * or her Rekognition ID. The additional information is returned as an array
     * of URLs. If there is no additional information about the celebrity, this
     * list is empty.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in an Image in the
     * Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:GetCelebrityInfo</code> action.
     * </p>
     * 
     * @param getCelebrityInfoRequest
     * @return getCelebrityInfoResult The response from the GetCelebrityInfo
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCelebrityInfoResult getCelebrityInfo(GetCelebrityInfoRequest getCelebrityInfoRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCelebrityInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCelebrityInfoRequest> request = null;
        Response<GetCelebrityInfoResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCelebrityInfoRequestMarshaller().marshall(getCelebrityInfoRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCelebrityInfoResult, JsonUnmarshallerContext> unmarshaller = new GetCelebrityInfoResultJsonUnmarshaller();
            JsonResponseHandler<GetCelebrityInfoResult> responseHandler = new JsonResponseHandler<GetCelebrityInfoResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the celebrity recognition results for a Amazon Rekognition Video
     * analysis started by .
     * </p>
     * <p>
     * Celebrity recognition in a video is an asynchronous operation. Analysis
     * is started by a call to which returns a job identifier (
     * <code>JobId</code>). When the celebrity recognition operation finishes,
     * Amazon Rekognition Video publishes a completion status to the Amazon
     * Simple Notification Service topic registered in the initial call to
     * <code>StartCelebrityRecognition</code>. To get the results of the
     * celebrity recognition analysis, first check that the status value
     * published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetCelebrityDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartCelebrityDetection</code>.
     * </p>
     * <p>
     * For more information, see Working With Stored Videos in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * <code>GetCelebrityRecognition</code> returns detected celebrities and the
     * time(s) they are detected in an array (<code>Celebrities</code>) of
     * objects. Each <code>CelebrityRecognition</code> contains information
     * about the celebrity in a object and the time, <code>Timestamp</code>, the
     * celebrity was detected.
     * </p>
     * <note>
     * <p>
     * <code>GetCelebrityRecognition</code> only returns the default facial
     * attributes (<code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
     * other facial attributes listed in the <code>Face</code> object of the
     * following response syntax are not returned. For more information, see
     * FaceDetail in the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Celebrities</code> array is sorted by time
     * (milliseconds from the start of the video). You can also sort the array
     * by celebrity by specifying the value <code>ID</code> in the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The <code>CelebrityDetail</code> object includes the celebrity identifer
     * and additional information urls. If you don't store the additional
     * information urls, you can get them later by calling with the celebrity
     * identifer.
     * </p>
     * <p>
     * No information is returned for faces not recognized as celebrities.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there
     * are more results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetCelebrityDetection</code> and populate the
     * <code>NextToken</code> request parameter with the token value returned
     * from the previous call to <code>GetCelebrityRecognition</code>.
     * </p>
     * 
     * @param getCelebrityRecognitionRequest
     * @return getCelebrityRecognitionResult The response from the
     *         GetCelebrityRecognition service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCelebrityRecognitionResult getCelebrityRecognition(
            GetCelebrityRecognitionRequest getCelebrityRecognitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCelebrityRecognitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCelebrityRecognitionRequest> request = null;
        Response<GetCelebrityRecognitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCelebrityRecognitionRequestMarshaller()
                        .marshall(getCelebrityRecognitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCelebrityRecognitionResult, JsonUnmarshallerContext> unmarshaller = new GetCelebrityRecognitionResultJsonUnmarshaller();
            JsonResponseHandler<GetCelebrityRecognitionResult> responseHandler = new JsonResponseHandler<GetCelebrityRecognitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the content moderation analysis results for a Amazon Rekognition
     * Video analysis started by .
     * </p>
     * <p>
     * Content moderation analysis of a video is an asynchronous operation. You
     * start analysis by calling . which returns a job identifier (
     * <code>JobId</code>). When analysis finishes, Amazon Rekognition Video
     * publishes a completion status to the Amazon Simple Notification Service
     * topic registered in the initial call to
     * <code>StartContentModeration</code>. To get the results of the content
     * moderation analysis, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetCelebrityDetection</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartCelebrityDetection</code>.
     * </p>
     * <p>
     * For more information, see Working with Stored Videos in the Amazon
     * Rekognition Devlopers Guide.
     * </p>
     * <p>
     * <code>GetContentModeration</code> returns detected content moderation
     * labels, and the time they are detected, in an array,
     * <code>ModerationLabels</code>, of objects.
     * </p>
     * <p>
     * By default, the moderated labels are returned sorted by time, in
     * milliseconds from the start of the video. You can also sort them by
     * moderated label by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * Since video analysis can return a large number of results, use the
     * <code>MaxResults</code> parameter to limit the number of labels returned
     * in a single call to <code>GetContentModeration</code>. If there are more
     * results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetContentModeration</code> and populate the
     * <code>NextToken</code> request parameter with the value of
     * <code>NextToken</code> returned from the previous call to
     * <code>GetContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Detecting Unsafe Content in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * 
     * @param getContentModerationRequest
     * @return getContentModerationResult The response from the
     *         GetContentModeration service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetContentModerationResult getContentModeration(
            GetContentModerationRequest getContentModerationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getContentModerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContentModerationRequest> request = null;
        Response<GetContentModerationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContentModerationRequestMarshaller()
                        .marshall(getContentModerationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetContentModerationResult, JsonUnmarshallerContext> unmarshaller = new GetContentModerationResultJsonUnmarshaller();
            JsonResponseHandler<GetContentModerationResult> responseHandler = new JsonResponseHandler<GetContentModerationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets face detection results for a Amazon Rekognition Video analysis
     * started by .
     * </p>
     * <p>
     * Face detection with Amazon Rekognition Video is an asynchronous
     * operation. You start face detection by calling which returns a job
     * identifier (<code>JobId</code>). When the face detection operation
     * finishes, Amazon Rekognition Video publishes a completion status to the
     * Amazon Simple Notification Service topic registered in the initial call
     * to <code>StartFaceDetection</code>. To get the results of the face
     * detection operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call and pass the job
     * identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * <code>GetFaceDetection</code> returns an array of detected faces (
     * <code>Faces</code>) sorted by the time the faces were detected.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there
     * are more results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetFaceDetection</code> and populate the
     * <code>NextToken</code> request parameter with the token value returned
     * from the previous call to <code>GetFaceDetection</code>.
     * </p>
     * 
     * @param getFaceDetectionRequest
     * @return getFaceDetectionResult The response from the GetFaceDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFaceDetectionResult getFaceDetection(GetFaceDetectionRequest getFaceDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFaceDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFaceDetectionRequest> request = null;
        Response<GetFaceDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFaceDetectionRequestMarshaller().marshall(getFaceDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFaceDetectionResult, JsonUnmarshallerContext> unmarshaller = new GetFaceDetectionResultJsonUnmarshaller();
            JsonResponseHandler<GetFaceDetectionResult> responseHandler = new JsonResponseHandler<GetFaceDetectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the face search results for Amazon Rekognition Video face search
     * started by . The search returns faces in a collection that match the
     * faces of persons detected in a video. It also includes the time(s) that
     * faces are matched in the video.
     * </p>
     * <p>
     * Face search in a video is an asynchronous operation. You start face
     * search by calling to which returns a job identifier (<code>JobId</code>).
     * When the search operation finishes, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic
     * registered in the initial call to <code>StartFaceSearch</code>. To get
     * the search results, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetFaceSearch</code> and pass the job identifier (
     * <code>JobId</code>) from the initial call to <code>StartFaceSearch</code>
     * .
     * </p>
     * <p>
     * For more information, see Searching Faces in a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * The search results are retured in an array, <code>Persons</code>, of
     * objects. Each<code>PersonMatch</code> element contains details about the
     * matching faces in the input collection, person information (facial
     * attributes, bounding boxes, and person identifer) for the matched person,
     * and the time the person was matched in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetFaceSearch</code> only returns the default facial attributes (
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The other facial
     * attributes listed in the <code>Face</code> object of the following
     * response syntax are not returned. For more information, see FaceDetail in
     * the Amazon Rekognition Developer Guide.
     * </p>
     * </note>
     * <p>
     * By default, the <code>Persons</code> array is sorted by the time, in
     * milliseconds from the start of the video, persons are matched. You can
     * also sort by persons by specifying <code>INDEX</code> for the
     * <code>SORTBY</code> input parameter.
     * </p>
     * 
     * @param getFaceSearchRequest
     * @return getFaceSearchResult The response from the GetFaceSearch service
     *         method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetFaceSearchResult getFaceSearch(GetFaceSearchRequest getFaceSearchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getFaceSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFaceSearchRequest> request = null;
        Response<GetFaceSearchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFaceSearchRequestMarshaller().marshall(getFaceSearchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetFaceSearchResult, JsonUnmarshallerContext> unmarshaller = new GetFaceSearchResultJsonUnmarshaller();
            JsonResponseHandler<GetFaceSearchResult> responseHandler = new JsonResponseHandler<GetFaceSearchResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the label detection results of a Amazon Rekognition Video analysis
     * started by .
     * </p>
     * <p>
     * The label detection operation is started by a call to which returns a job
     * identifier (<code>JobId</code>). When the label detection operation
     * finishes, Amazon Rekognition publishes a completion status to the Amazon
     * Simple Notification Service topic registered in the initial call to
     * <code>StartlabelDetection</code>. To get the results of the label
     * detection operation, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call and pass the job
     * identifier (<code>JobId</code>) from the initial call to
     * <code>StartLabelDetection</code>.
     * </p>
     * <p>
     * <code>GetLabelDetection</code> returns an array of detected labels (
     * <code>Labels</code>) sorted by the time the labels were detected. You can
     * also sort by the label name by specifying <code>NAME</code> for the
     * <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * The labels returned include the label name, the percentage confidence in
     * the accuracy of the detected label, and the time the label was detected
     * in the video.
     * </p>
     * <p>
     * Use MaxResults parameter to limit the number of labels returned. If there
     * are more results than specified in <code>MaxResults</code>, the value of
     * <code>NextToken</code> in the operation response contains a pagination
     * token for getting the next set of results. To get the next page of
     * results, call <code>GetlabelDetection</code> and populate the
     * <code>NextToken</code> request parameter with the token value returned
     * from the previous call to <code>GetLabelDetection</code>.
     * </p>
     * 
     * @param getLabelDetectionRequest
     * @return getLabelDetectionResult The response from the GetLabelDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetLabelDetectionResult getLabelDetection(
            GetLabelDetectionRequest getLabelDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLabelDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLabelDetectionRequest> request = null;
        Response<GetLabelDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLabelDetectionRequestMarshaller()
                        .marshall(getLabelDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLabelDetectionResult, JsonUnmarshallerContext> unmarshaller = new GetLabelDetectionResultJsonUnmarshaller();
            JsonResponseHandler<GetLabelDetectionResult> responseHandler = new JsonResponseHandler<GetLabelDetectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the person tracking results of a Amazon Rekognition Video analysis
     * started by .
     * </p>
     * <p>
     * The person detection operation is started by a call to
     * <code>StartPersonTracking</code> which returns a job identifier (
     * <code>JobId</code>). When the person detection operation finishes, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic registered in the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * To get the results of the person tracking operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * If so, call and pass the job identifier (<code>JobId</code>) from the
     * initial call to <code>StartPersonTracking</code>.
     * </p>
     * <p>
     * <code>GetPersonTracking</code> returns an array, <code>Persons</code>, of
     * tracked persons and the time(s) they were tracked in the video.
     * </p>
     * <note>
     * <p>
     * <code>GetPersonTracking</code> only returns the default facial attributes
     * (<code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
     * other facial attributes listed in the <code>Face</code> object of the
     * following response syntax are not returned.
     * </p>
     * <p>
     * For more information, see FaceDetail in the Amazon Rekognition Developer
     * Guide.
     * </p>
     * </note>
     * <p>
     * By default, the array is sorted by the time(s) a person is tracked in the
     * video. You can sort by tracked persons by specifying <code>INDEX</code>
     * for the <code>SortBy</code> input parameter.
     * </p>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of items
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetPersonTracking</code> and populate the <code>NextToken</code>
     * request parameter with the token value returned from the previous call to
     * <code>GetPersonTracking</code>.
     * </p>
     * 
     * @param getPersonTrackingRequest
     * @return getPersonTrackingResult The response from the GetPersonTracking
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPersonTrackingResult getPersonTracking(
            GetPersonTrackingRequest getPersonTrackingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPersonTrackingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPersonTrackingRequest> request = null;
        Response<GetPersonTrackingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPersonTrackingRequestMarshaller()
                        .marshall(getPersonTrackingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPersonTrackingResult, JsonUnmarshallerContext> unmarshaller = new GetPersonTrackingResultJsonUnmarshaller();
            JsonResponseHandler<GetPersonTrackingResult> responseHandler = new JsonResponseHandler<GetPersonTrackingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects faces in the input image and adds them to the specified
     * collection.
     * </p>
     * <p>
     * Amazon Rekognition does not save the actual faces detected. Instead, the
     * underlying detection algorithm first detects the faces in the input
     * image, and for each face extracts facial features into a feature vector,
     * and stores it in the back-end database. Amazon Rekognition uses feature
     * vectors when performing face match and search operations using the and
     * operations.
     * </p>
     * <p>
     * If you are using version 1.0 of the face detection model,
     * <code>IndexFaces</code> indexes the 15 largest faces in the input image.
     * Later versions of the face detection model index the 100 largest faces in
     * the input image. To determine which version of the model you are using,
     * check the the value of <code>FaceModelVersion</code> in the response from
     * <code>IndexFaces</code>.
     * </p>
     * <p>
     * For more information, see Model Versioning in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * If you provide the optional <code>ExternalImageID</code> for the input
     * image you provided, Amazon Rekognition associates this ID with all faces
     * that it detects. When you call the operation, the response returns the
     * external ID. You can use this external image ID to create a client-side
     * index to associate the faces with each image. You can then use the index
     * to find all faces in an image.
     * </p>
     * <p>
     * In response, the operation returns an array of metadata for all detected
     * faces. This includes, the bounding box of the detected face, confidence
     * value (indicating the bounding box contains a face), a face ID assigned
     * by the service for each face that is detected and stored, and an image ID
     * assigned by the service for the input image. If you request all facial
     * attributes (using the <code>detectionAttributes</code> parameter, Amazon
     * Rekognition returns detailed facial attributes such as facial landmarks
     * (for example, location of eye and mouth) and other facial attributes such
     * gender. If you provide the same image, specify the same collection, and
     * use the same external ID in the <code>IndexFaces</code> operation, Amazon
     * Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p>
     * For more information, see Adding Faces to a Collection in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * The input image is passed either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:IndexFaces</code> action.
     * </p>
     * 
     * @param indexFacesRequest
     * @return indexFacesResult The response from the IndexFaces service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public IndexFacesResult indexFaces(IndexFacesRequest indexFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(indexFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IndexFacesRequest> request = null;
        Response<IndexFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IndexFacesRequestMarshaller().marshall(indexFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<IndexFacesResult, JsonUnmarshallerContext> unmarshaller = new IndexFacesResultJsonUnmarshaller();
            JsonResponseHandler<IndexFacesResult> responseHandler = new JsonResponseHandler<IndexFacesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns list of collection IDs in your account. If the result is
     * truncated, the response also provides a <code>NextToken</code> that you
     * can use in the subsequent request to fetch the next set of collection
     * IDs.
     * </p>
     * <p>
     * For an example, see Listing Collections in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:ListCollections</code> action.
     * </p>
     * 
     * @param listCollectionsRequest
     * @return listCollectionsResult The response from the ListCollections
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCollectionsResult listCollections(ListCollectionsRequest listCollectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCollectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCollectionsRequest> request = null;
        Response<ListCollectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCollectionsRequestMarshaller().marshall(listCollectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCollectionsResult, JsonUnmarshallerContext> unmarshaller = new ListCollectionsResultJsonUnmarshaller();
            JsonResponseHandler<ListCollectionsResult> responseHandler = new JsonResponseHandler<ListCollectionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata
     * includes information such as the bounding box coordinates, the confidence
     * (that the bounding box contains a face), and face ID. For an example, see
     * Listing Faces in a Collection in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:ListFaces</code> action.
     * </p>
     * 
     * @param listFacesRequest
     * @return listFacesResult The response from the ListFaces service method,
     *         as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListFacesResult listFaces(ListFacesRequest listFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFacesRequest> request = null;
        Response<ListFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFacesRequestMarshaller().marshall(listFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListFacesResult, JsonUnmarshallerContext> unmarshaller = new ListFacesResultJsonUnmarshaller();
            JsonResponseHandler<ListFacesResult> responseHandler = new JsonResponseHandler<ListFacesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of stream processors that you have created with .
     * </p>
     * 
     * @param listStreamProcessorsRequest
     * @return listStreamProcessorsResult The response from the
     *         ListStreamProcessors service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws InvalidPaginationTokenException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListStreamProcessorsResult listStreamProcessors(
            ListStreamProcessorsRequest listStreamProcessorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStreamProcessorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamProcessorsRequest> request = null;
        Response<ListStreamProcessorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamProcessorsRequestMarshaller()
                        .marshall(listStreamProcessorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListStreamProcessorsResult, JsonUnmarshallerContext> unmarshaller = new ListStreamProcessorsResultJsonUnmarshaller();
            JsonResponseHandler<ListStreamProcessorsResult> responseHandler = new JsonResponseHandler<ListStreamProcessorsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns an array of celebrities recognized in the input image. For more
     * information, see Recognizing Celebrities in the Amazon Rekognition
     * Developer Guide.
     * </p>
     * <p>
     * <code>RecognizeCelebrities</code> returns the 100 largest faces in the
     * image. It lists recognized celebrities in the <code>CelebrityFaces</code>
     * array and unrecognized faces in the <code>UnrecognizedFaces</code> array.
     * <code>RecognizeCelebrities</code> doesn't return celebrities whose faces
     * are not amongst the largest 100 faces in the image.
     * </p>
     * <p>
     * For each celebrity recognized, the <code>RecognizeCelebrities</code>
     * returns a <code>Celebrity</code> object. The <code>Celebrity</code>
     * object contains the celebrity name, ID, URL links to additional
     * information, match confidence, and a <code>ComparedFace</code> object
     * that you can use to locate the celebrity's face on the image.
     * </p>
     * <p>
     * Rekognition does not retain information about which images a celebrity
     * has been recognized in. Your application must store this information and
     * use the <code>Celebrity</code> ID property as a unique identifier for the
     * celebrity. If you don't store the celebrity name or additional
     * information URLs returned by <code>RecognizeCelebrities</code>, you will
     * need the ID to identify the celebrity in a call to the operation.
     * </p>
     * <p>
     * You pass the imput image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * For an example, see Recognizing Celebrities in an Image in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:RecognizeCelebrities</code> operation.
     * </p>
     * 
     * @param recognizeCelebritiesRequest
     * @return recognizeCelebritiesResult The response from the
     *         RecognizeCelebrities service method, as returned by Amazon
     *         Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws InvalidImageFormatException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RecognizeCelebritiesResult recognizeCelebrities(
            RecognizeCelebritiesRequest recognizeCelebritiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(recognizeCelebritiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecognizeCelebritiesRequest> request = null;
        Response<RecognizeCelebritiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecognizeCelebritiesRequestMarshaller()
                        .marshall(recognizeCelebritiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RecognizeCelebritiesResult, JsonUnmarshallerContext> unmarshaller = new RecognizeCelebritiesResultJsonUnmarshaller();
            JsonResponseHandler<RecognizeCelebritiesResult> responseHandler = new JsonResponseHandler<RecognizeCelebritiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * For a given input face ID, searches for matching faces in the collection
     * the face belongs to. You get a face ID when you add a face to the
     * collection using the <a>IndexFaces</a> operation. The operation compares
     * the features of the input face with faces in the specified collection.
     * </p>
     * <note>
     * <p>
     * You can also search faces without indexing faces by using the
     * <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * The operation response returns an array of faces that match, ordered by
     * similarity score with the highest similarity first. More specifically, it
     * is an array of metadata for each face match that is found. Along with the
     * metadata, the response also includes a <code>confidence</code> value for
     * each face match, indicating the confidence that the specific face matches
     * the input face.
     * </p>
     * <p>
     * For an example, see Searching for a Face Using Its Face ID in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:SearchFaces</code> action.
     * </p>
     * 
     * @param searchFacesRequest
     * @return searchFacesResult The response from the SearchFaces service
     *         method, as returned by Amazon Rekognition.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchFacesResult searchFaces(SearchFacesRequest searchFacesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchFacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFacesRequest> request = null;
        Response<SearchFacesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFacesRequestMarshaller().marshall(searchFacesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchFacesResult, JsonUnmarshallerContext> unmarshaller = new SearchFacesResultJsonUnmarshaller();
            JsonResponseHandler<SearchFacesResult> responseHandler = new JsonResponseHandler<SearchFacesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * For a given input image, first detects the largest face in the image, and
     * then searches the specified collection for matching faces. The operation
     * compares the features of the input face with faces in the specified
     * collection.
     * </p>
     * <note>
     * <p>
     * To search for all faces in an input image, you might first call the
     * operation, and then use the face IDs returned in subsequent calls to the
     * operation.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> operation and use the
     * bounding boxes in the response to make face crops, which then you can
     * pass in to the <code>SearchFacesByImage</code> operation.
     * </p>
     * </note>
     * <p>
     * You pass the input image either as base64-encoded image bytes or as a
     * reference to an image in an Amazon S3 bucket. If you use the Amazon CLI
     * to call Amazon Rekognition operations, passing image bytes is not
     * supported. The image must be either a PNG or JPEG formatted file.
     * </p>
     * <p>
     * The response returns an array of faces that match, ordered by similarity
     * score with the highest similarity first. More specifically, it is an
     * array of metadata for each face match found. Along with the metadata, the
     * response also includes a <code>similarity</code> indicating how similar
     * the face is to the input face. In the response, the operation also
     * returns the bounding box (and a confidence level that the bounding box
     * contains a face) of the face that Amazon Rekognition used for the input
     * image.
     * </p>
     * <p>
     * For an example, Searching for a Face Using an Image in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:SearchFacesByImage</code> action.
     * </p>
     * 
     * @param searchFacesByImageRequest
     * @return searchFacesByImageResult The response from the SearchFacesByImage
     *         service method, as returned by Amazon Rekognition.
     * @throws InvalidS3ObjectException
     * @throws InvalidParameterException
     * @throws ImageTooLargeException
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws ProvisionedThroughputExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidImageFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchFacesByImageResult searchFacesByImage(
            SearchFacesByImageRequest searchFacesByImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchFacesByImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchFacesByImageRequest> request = null;
        Response<SearchFacesByImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchFacesByImageRequestMarshaller()
                        .marshall(searchFacesByImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchFacesByImageResult, JsonUnmarshallerContext> unmarshaller = new SearchFacesByImageResultJsonUnmarshaller();
            JsonResponseHandler<SearchFacesByImageResult> responseHandler = new JsonResponseHandler<SearchFacesByImageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts asynchronous recognition of celebrities in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect celebrities in a video must be stored
     * in an Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and
     * the filename of the video. <code>StartCelebrityRecognition</code> returns
     * a job identifier (<code>JobId</code>) which you use to get the results of
     * the analysis. When celebrity recognition analysis is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic that you specify in
     * <code>NotificationChannel</code>. To get the results of the celebrity
     * recognition analysis, first check that the status value published to the
     * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call and pass the job
     * identifier (<code>JobId</code>) from the initial call to
     * <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * For more information, see Recognizing Celebrities in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * 
     * @param startCelebrityRecognitionRequest
     * @return startCelebrityRecognitionResult The response from the
     *         StartCelebrityRecognition service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartCelebrityRecognitionResult startCelebrityRecognition(
            StartCelebrityRecognitionRequest startCelebrityRecognitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startCelebrityRecognitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCelebrityRecognitionRequest> request = null;
        Response<StartCelebrityRecognitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCelebrityRecognitionRequestMarshaller()
                        .marshall(startCelebrityRecognitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartCelebrityRecognitionResult, JsonUnmarshallerContext> unmarshaller = new StartCelebrityRecognitionResultJsonUnmarshaller();
            JsonResponseHandler<StartCelebrityRecognitionResult> responseHandler = new JsonResponseHandler<StartCelebrityRecognitionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts asynchronous detection of explicit or suggestive adult content in
     * a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can moderate content in a video stored in an
     * Amazon S3 bucket. Use <a>Video</a> to specify the bucket name and the
     * filename of the video. <code>StartContentModeration</code> returns a job
     * identifier (<code>JobId</code>) which you use to get the results of the
     * analysis. When content moderation analysis is finished, Amazon
     * Rekognition Video publishes a completion status to the Amazon Simple
     * Notification Service topic that you specify in
     * <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the content moderation analysis, first check that
     * the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartContentModeration</code>.
     * </p>
     * <p>
     * For more information, see Detecting Unsafe Content in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * 
     * @param startContentModerationRequest
     * @return startContentModerationResult The response from the
     *         StartContentModeration service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartContentModerationResult startContentModeration(
            StartContentModerationRequest startContentModerationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startContentModerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContentModerationRequest> request = null;
        Response<StartContentModerationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContentModerationRequestMarshaller()
                        .marshall(startContentModerationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartContentModerationResult, JsonUnmarshallerContext> unmarshaller = new StartContentModerationResultJsonUnmarshaller();
            JsonResponseHandler<StartContentModerationResult> responseHandler = new JsonResponseHandler<StartContentModerationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts asynchronous detection of faces in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect faces in a video stored in an Amazon
     * S3 bucket. Use <a>Video</a> to specify the bucket name and the filename
     * of the video. <code>StartFaceDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When face detection is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the label detection operation, first check that the status value
     * published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * and pass the job identifier (<code>JobId</code>) from the initial call to
     * <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * For more information, see Detecting Faces in a Stored Video in the Amazon
     * Rekognition Developer Guide.
     * </p>
     * 
     * @param startFaceDetectionRequest
     * @return startFaceDetectionResult The response from the StartFaceDetection
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartFaceDetectionResult startFaceDetection(
            StartFaceDetectionRequest startFaceDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startFaceDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFaceDetectionRequest> request = null;
        Response<StartFaceDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFaceDetectionRequestMarshaller()
                        .marshall(startFaceDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartFaceDetectionResult, JsonUnmarshallerContext> unmarshaller = new StartFaceDetectionResultJsonUnmarshaller();
            JsonResponseHandler<StartFaceDetectionResult> responseHandler = new JsonResponseHandler<StartFaceDetectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts the asynchronous search for faces in a collection that match the
     * faces of persons detected in a stored video.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video.
     * <code>StartFaceSearch</code> returns a job identifier (<code>JobId</code>
     * ) which you use to get the search results once the search has completed.
     * When searching is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>. To get the search
     * results, first check that the status value published to the Amazon SNS
     * topic is <code>SUCCEEDED</code>. If so, call and pass the job identifier
     * (<code>JobId</code>) from the initial call to
     * <code>StartFaceSearch</code>. For more information, see
     * <a>procedure-person-search-videos</a>.
     * </p>
     * 
     * @param startFaceSearchRequest
     * @return startFaceSearchResult The response from the StartFaceSearch
     *         service method, as returned by Amazon Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartFaceSearchResult startFaceSearch(StartFaceSearchRequest startFaceSearchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startFaceSearchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFaceSearchRequest> request = null;
        Response<StartFaceSearchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFaceSearchRequestMarshaller().marshall(startFaceSearchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartFaceSearchResult, JsonUnmarshallerContext> unmarshaller = new StartFaceSearchResultJsonUnmarshaller();
            JsonResponseHandler<StartFaceSearchResult> responseHandler = new JsonResponseHandler<StartFaceSearchResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts asynchronous detection of labels in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can detect labels in a video. Labels are
     * instances of real-world entities. This includes objects like flower,
     * tree, and table; events like wedding, graduation, and birthday party;
     * concepts like landscape, evening, and nature; and activities like a
     * person getting out of a car or a person skiing.
     * </p>
     * <p>
     * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to
     * specify the bucket name and the filename of the video.
     * <code>StartLabelDetection</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation.
     * When label detection is finished, Amazon Rekognition Video publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the label detection operation, first check that the
     * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
     * If so, call and pass the job identifier (<code>JobId</code>) from the
     * initial call to <code>StartLabelDetection</code>.
     * </p>
     * <p/>
     * 
     * @param startLabelDetectionRequest
     * @return startLabelDetectionResult The response from the
     *         StartLabelDetection service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartLabelDetectionResult startLabelDetection(
            StartLabelDetectionRequest startLabelDetectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startLabelDetectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLabelDetectionRequest> request = null;
        Response<StartLabelDetectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLabelDetectionRequestMarshaller()
                        .marshall(startLabelDetectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartLabelDetectionResult, JsonUnmarshallerContext> unmarshaller = new StartLabelDetectionResultJsonUnmarshaller();
            JsonResponseHandler<StartLabelDetectionResult> responseHandler = new JsonResponseHandler<StartLabelDetectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts the asynchronous tracking of persons in a stored video.
     * </p>
     * <p>
     * Amazon Rekognition Video can track persons in a video stored in an Amazon
     * S3 bucket. Use <a>Video</a> to specify the bucket name and the filename
     * of the video. <code>StartPersonTracking</code> returns a job identifier (
     * <code>JobId</code>) which you use to get the results of the operation.
     * When label detection is finished, Amazon Rekognition publishes a
     * completion status to the Amazon Simple Notification Service topic that
     * you specify in <code>NotificationChannel</code>.
     * </p>
     * <p>
     * To get the results of the person detection operation, first check that
     * the status value published to the Amazon SNS topic is
     * <code>SUCCEEDED</code>. If so, call and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartPersonTracking</code>.
     * </p>
     * 
     * @param startPersonTrackingRequest
     * @return startPersonTrackingResult The response from the
     *         StartPersonTracking service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws InternalServerErrorException
     * @throws VideoTooLargeException
     * @throws ProvisionedThroughputExceededException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartPersonTrackingResult startPersonTracking(
            StartPersonTrackingRequest startPersonTrackingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startPersonTrackingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPersonTrackingRequest> request = null;
        Response<StartPersonTrackingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPersonTrackingRequestMarshaller()
                        .marshall(startPersonTrackingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartPersonTrackingResult, JsonUnmarshallerContext> unmarshaller = new StartPersonTrackingResultJsonUnmarshaller();
            JsonResponseHandler<StartPersonTrackingResult> responseHandler = new JsonResponseHandler<StartPersonTrackingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts processing a stream processor. You create a stream processor by
     * calling . To tell <code>StartStreamProcessor</code> which stream
     * processor to start, use the value of the <code>Name</code> field
     * specified in the call to <code>CreateStreamProcessor</code>.
     * </p>
     * 
     * @param startStreamProcessorRequest
     * @return startStreamProcessorResult The response from the
     *         StartStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartStreamProcessorResult startStreamProcessor(
            StartStreamProcessorRequest startStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStreamProcessorRequest> request = null;
        Response<StartStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStreamProcessorRequestMarshaller()
                        .marshall(startStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new StartStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<StartStreamProcessorResult> responseHandler = new JsonResponseHandler<StartStreamProcessorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a running stream processor that was created by .
     * </p>
     * 
     * @param stopStreamProcessorRequest
     * @return stopStreamProcessorResult The response from the
     *         StopStreamProcessor service method, as returned by Amazon
     *         Rekognition.
     * @throws AccessDeniedException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ProvisionedThroughputExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Rekognition indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopStreamProcessorResult stopStreamProcessor(
            StopStreamProcessorRequest stopStreamProcessorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopStreamProcessorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStreamProcessorRequest> request = null;
        Response<StopStreamProcessorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStreamProcessorRequestMarshaller()
                        .marshall(stopStreamProcessorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopStreamProcessorResult, JsonUnmarshallerContext> unmarshaller = new StopStreamProcessorResultJsonUnmarshaller();
            JsonResponseHandler<StopStreamProcessorResult> responseHandler = new JsonResponseHandler<StopStreamProcessorResult>(
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
