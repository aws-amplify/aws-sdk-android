/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.lexrts.internal.AmazonLexV4Signer;
import com.amazonaws.services.lexrts.model.BadGatewayException;
import com.amazonaws.services.lexrts.model.BadRequestException;
import com.amazonaws.services.lexrts.model.ConflictException;
import com.amazonaws.services.lexrts.model.DependencyFailedException;
import com.amazonaws.services.lexrts.model.InternalFailureException;
import com.amazonaws.services.lexrts.model.LimitExceededException;
import com.amazonaws.services.lexrts.model.LoopDetectedException;
import com.amazonaws.services.lexrts.model.NotAcceptableException;
import com.amazonaws.services.lexrts.model.NotFoundException;
import com.amazonaws.services.lexrts.model.PostContentRequest;
import com.amazonaws.services.lexrts.model.PostContentResult;
import com.amazonaws.services.lexrts.model.PostTextRequest;
import com.amazonaws.services.lexrts.model.PostTextResult;
import com.amazonaws.services.lexrts.model.RequestTimeoutException;
import com.amazonaws.services.lexrts.model.UnsupportedMediaTypeException;
import com.amazonaws.services.lexrts.model.transform.BadGatewayExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.BadRequestExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.ConflictExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.DependencyFailedExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.InternalFailureExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.LimitExceededExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.LoopDetectedExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.NotAcceptableExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.NotFoundExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.PostContentRequestMarshaller;
import com.amazonaws.services.lexrts.model.transform.PostContentResultJsonUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.PostTextRequestMarshaller;
import com.amazonaws.services.lexrts.model.transform.PostTextResultJsonUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.RequestTimeoutExceptionUnmarshaller;
import com.amazonaws.services.lexrts.model.transform.UnsupportedMediaTypeExceptionUnmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;

import java.util.ArrayList;
import java.util.List;

/**
 * Client for accessing Amazon Lex Runtime Service. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Amazon Lex provides both build and runtime endpoints. Each endpoint provides
 * a set of operations (API). Your application uses the runtime API to
 * understand user utterances (user input text or voice). For example, suppose
 * user says "I want pizza", your application sends this input to Amazon Lex
 * using the runtime API. Amazon Lex recognizes that the user request is for the
 * OrderPizza intent (one of the intents defined in the application). Then
 * Amazon Lex engages in user conversation on behalf of the application to
 * elicit required information (slot values, such as pizza size and crust type),
 * and then performs fulfillment activity (that you configured when you created
 * the application). You use the build-time API to create and manage your Amazon
 * Lex applications. For a list of build-time operations, see the build-time
 * API. .
 * </p>
 */
public class AmazonLexRuntimeClient extends AmazonWebServiceClient implements AmazonLexRuntime {
    /** Custom Signer */
    private static final String CUSTOM_SIGNER = "AmazonLexV4Signer";

    static {
        SignerFactory.registerSigner(CUSTOM_SIGNER, AmazonLexV4Signer.class);
    }
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Lex Runtime Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime. A
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
    public AmazonLexRuntimeClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime. A
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
     *            how this client connects to AmazonLexRuntime (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonLexRuntimeClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime
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
    public AmazonLexRuntimeClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime
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
     *            how this client connects to AmazonLexRuntime (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonLexRuntimeClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime
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
    public AmazonLexRuntimeClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime
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
     *            how this client connects to AmazonLexRuntime (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonLexRuntimeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime
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
     *            how this client connects to AmazonLexRuntime (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonLexRuntimeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonLexRuntime
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
     *            how this client connects to AmazonLexRuntime (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonLexRuntimeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadGatewayExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DependencyFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LoopDetectedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotAcceptableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RequestTimeoutExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedMediaTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("runtime.lex.us-east-1.amazonaws.com");

        final HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/lexrts/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/lexrts/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        final ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Sends user input (speech or text), at runtime, to Amazon Lex. Amazon Lex
     * uses the machine learning model (built for the specific bot), in order to
     * interpret the user input specified in the request.
     * </p>
     * <note>
     * <p>
     * When building Amazon Lex text bots, you can use the <code>PostText</code>
     * API operation, which supports response cards. When building Amazon Lex
     * bots that communicate by speech alone or by speech and text, you use the
     * this API.
     * </p>
     * </note>
     * <p>
     * In response, Amazon Lex returns the next <code>message</code> to convey
     * to the user and the message type (<code>dialogState</code>). Based on the
     * user interaction context, Amazon Lex knows the message to return and the
     * message type indicates whether to expect a user response for that
     * message. For example, consider the following response messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "What pizza toppings would you like?" - For this message, the
     * <code>dialogState</code> would be <code>ElicitSlot</code> (that is, a
     * user response is expected).
     * </p>
     * </li>
     * <li>
     * <p>
     * "Your order has been placed." - For this message, Amazon Lex returns one
     * of the following dialog states depending on how the fulfillment is
     * configured for the intent (see <code>fulfillmentActivity</code> in
     * <code>CreateIntent</code>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FulFilled</code> – The intent <code>fulfillmentActivity</code> is
     * configured with a Lambda function to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfilment</code> – The intent's
     * <code>fulfillmentActivity</code> is configured to simply return the
     * intent data back to the client application.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param postContentRequest
     * @return postContentResult The response from the PostContent service
     *         method, as returned by Amazon Lex Runtime Service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws UnsupportedMediaTypeException
     * @throws NotAcceptableException
     * @throws RequestTimeoutException
     * @throws DependencyFailedException
     * @throws BadGatewayException
     * @throws LoopDetectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Runtime Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Override
    public PostContentResult postContent(PostContentRequest postContentRequest)
            throws AmazonServiceException, AmazonClientException {
        final ExecutionContext executionContext = createExecutionContext(postContentRequest);
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostContentRequest> request = null;
        Response<PostContentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostContentRequestMarshaller().marshall(postContentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            final Unmarshaller<PostContentResult, JsonUnmarshallerContext> unmarshaller = new PostContentResultJsonUnmarshaller();
            final JsonResponseHandler<PostContentResult> responseHandler = new JsonResponseHandler<PostContentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sends user input text to Amazon Lex at runtime. Amazon Lex uses the
     * machine learning model that the service built for the application to
     * interpret user input.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next message to convey to the user
     * (based on the context of the user interaction) and whether to expect a
     * user response to the message (<code>dialogState</code>). For example,
     * consider the following response messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "What pizza toppings would you like?" – In this case, the
     * <code>dialogState</code> would be <code>ElicitSlot</code> (that is, a
     * user response is expected).
     * </p>
     * </li>
     * <li>
     * <p>
     * "Your order has been placed." – In this case, Amazon Lex returns one of
     * the following <code>dialogState</code> values depending on how the intent
     * fulfillment is configured (see <code>fulfillmentActivity</code> in
     * <code>CreateIntent</code>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FulFilled</code> – The intent fulfillment is configured through a
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfilment</code> – The intent's
     * <code>fulfillmentActivity</code> is to simply return the intent data back
     * to the client application.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param postTextRequest
     * @return postTextResult The response from the PostText service method, as
     *         returned by Amazon Lex Runtime Service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws DependencyFailedException
     * @throws BadGatewayException
     * @throws LoopDetectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Runtime Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Override
    public PostTextResult postText(PostTextRequest postTextRequest)
            throws AmazonServiceException, AmazonClientException {
        final ExecutionContext executionContext = createExecutionContext(postTextRequest);
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PostTextRequest> request = null;
        Response<PostTextResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PostTextRequestMarshaller().marshall(postTextRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            final Unmarshaller<PostTextResult, JsonUnmarshallerContext> unmarshaller = new PostTextResultJsonUnmarshaller();
            final JsonResponseHandler<PostTextResult> responseHandler = new JsonResponseHandler<PostTextResult>(
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
    @Override
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        final AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        final JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        final Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
