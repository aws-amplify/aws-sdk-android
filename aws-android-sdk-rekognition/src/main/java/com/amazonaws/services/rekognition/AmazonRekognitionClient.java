/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This is Amazon Rekognition API guide.
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
        jsonErrorUnmarshallers.add(new ImageTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidImageFormatExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPaginationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidS3ObjectExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("rekognition.us-east-1.amazonaws.com");

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
     * Compares a face in the <i>source</i> input image with each face detected
     * in the <i>target</i> input image.
     * </p>
     * <note>
     * <p>
     * If the source image contains multiple faces, the service detects the
     * largest face and uses it to compare with each face detected in the target
     * image.
     * </p>
     * </note>
     * <p>
     * In response, the operation returns an array of face matches ordered by
     * similarity score with the highest similarity scores first. For each face
     * match, the response provides a bounding box of the face and
     * <code>confidence</code> value (indicating the level of confidence that
     * the bounding box contains a face). The response also provides a
     * <code>similarity</code> score, which indicates how closely the faces
     * match.
     * </p>
     * <note>
     * <p>
     * By default, only faces with the similarity score of greater than or equal
     * to 80% are returned in the response. You can change this value.
     * </p>
     * </note>
     * <p>
     * In addition to the face matches, the response returns information about
     * the face in the source image, including the bounding box of the face and
     * confidence value.
     * </p>
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-compare-faces</a>
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
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a collection in an AWS region. You can add faces to the
     * collection using the operation.
     * </p>
     * <p>
     * For example, you might create collections, one for each of your
     * application users. A user can then index faces using the
     * <code>IndexFaces</code> operation and persist results in a specific
     * collection. Then, a user can search the collection for faces in the
     * user-specific container.
     * </p>
     * <p>
     * For an example, see <a>example1</a>.
     * </p>
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
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified collection. Note that this operation removes all
     * faces in the collection. For an example, see <a>example1</a>.
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
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects faces within an image (JPEG or PNG) that is provided as input.
     * </p>
     * <p>
     * For each face detected, the operation returns face details including a
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
     * <note>
     * <p>
     * This is a stateless API operation. That is, the operation does not
     * persist any data.
     * </p>
     * </note>
     * <p>
     * For an example, see <a>get-started-exercise-detect-faces</a>.
     * </p>
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
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects instances of real-world labels within an image (JPEG or PNG)
     * provided as input. This includes objects like flower, tree, and table;
     * events like wedding, graduation, and birthday party; and concepts like
     * landscape, evening, and nature. For an example, see
     * <a>get-started-exercise-detect-labels</a>.
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
     * You can provide the input image as an S3 object or as base64-encoded
     * bytes. In response, the API returns an array of labels. In addition, the
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
     * If you provide the optional <code>externalImageID</code> for the input
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
     * assigned by the service for the input image If you request all facial
     * attributes (using the <code>detectionAttributes</code> parameter,
     * Rekognition returns detailed facial attributes such as facial landmarks
     * (for example, location of eye and mount) and other facial attributes such
     * gender. If you provide the same image, specify the same collection, and
     * use the same external ID in the <code>IndexFaces</code> operation,
     * Rekognition doesn't save duplicate face metadata.
     * </p>
     * <p>
     * For an example, see <a>example2</a>.
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
     * For an example, see <a>example1</a>.
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
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns metadata for faces in the specified collection. This metadata
     * includes information such as the bounding box coordinates, the confidence
     * (that the bounding box contains a face), and face ID. For an example, see
     * <a>example3</a>.
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
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * For a given input face ID, searches the specified collection for matching
     * faces. You get a face ID when you add a face to the collection using the
     * <a>IndexFaces</a> operation. The operation compares the features of the
     * input face with faces in the specified collection.
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
     * For an example, see <a>example3</a>.
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
     * To search for all faces in an input image, you might first call the API,
     * and then use the face IDs returned in subsequent calls to the API.
     * </p>
     * <p>
     * You can also call the <code>DetectFaces</code> API and use the bounding
     * boxes in the response to make face crops, which then you can pass in to
     * the <code>SearchFacesByImage</code> API.
     * </p>
     * </note>
     * <p>
     * The response returns an array of faces that match, ordered by similarity
     * score with the highest similarity first. More specifically, it is an
     * array of metadata for each face match found. Along with the metadata, the
     * response also includes a <code>similarity</code> indicating how similar
     * the face is to the input face. In the response, the API also returns the
     * bounding box (and a confidence level that the bounding box contains a
     * face) of the face that Rekognition used for the input image.
     * </p>
     * <p>
     * For an example, see <a>example3</a>.
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
