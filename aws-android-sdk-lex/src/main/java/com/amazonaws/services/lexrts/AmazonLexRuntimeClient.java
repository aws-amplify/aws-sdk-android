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

package com.amazonaws.services.lexrts;

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

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.services.lexrts.model.transform.*;
import com.amazonaws.services.lexrts.internal.AmazonLexV4Signer;

/**
 * Client for accessing Amazon Lex Runtime Service. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Amazon Lex provides both build and runtime endpoints. Each endpoint provides
 * a set of operations (API). Your conversational bot uses the runtime API to
 * understand user utterances (user input text or voice). For example, suppose a
 * user says "I want pizza", your bot sends this input to Amazon Lex using the
 * runtime API. Amazon Lex recognizes that the user request is for the
 * OrderPizza intent (one of the intents defined in the bot). Then Amazon Lex
 * engages in user conversation on behalf of the bot to elicit required
 * information (slot values, such as pizza size and crust type), and then
 * performs fulfillment activity (that you configured when you created the bot).
 * You use the build-time API to create and manage your Amazon Lex bot. For a
 * list of build-time operations, see the build-time API, .
 * </p>
 */
public class AmazonLexRuntimeClient extends AmazonWebServiceClient implements AmazonLexRuntime {
    /** Custom Signer */
    private static final String CUSTOM_SIGNER = "AmazonLexV4Signer";

    static {
        SignerFactory.registerSigner(CUSTOM_SIGNER, AmazonLexV4Signer.class);
    }
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

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
        this.endpointPrefix = "runtime.lex";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/lexrts/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/lexrts/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Sends user input (text or speech) to Amazon Lex. Clients use this API to
     * send text and audio requests to Amazon Lex at runtime. Amazon Lex
     * interprets the user input using the machine learning model that it built
     * for the bot.
     * </p>
     * <p>
     * The <code>PostContent</code> operation supports audio input at 8kHz and
     * 16kHz. You can use 8kHz audio to achieve higher speech recognition
     * accuracy in telephone audio applications.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next message to convey to the user.
     * Consider the following example messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a user input "I would like a pizza," Amazon Lex might return a
     * response with a message eliciting slot data (for example,
     * <code>PizzaSize</code>): "What size pizza would you like?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user provides all of the pizza order information, Amazon Lex
     * might return a response with a message to get user confirmation:
     * "Order the pizza?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user replies "Yes" to the confirmation prompt, Amazon Lex might
     * return a conclusion statement:
     * "Thank you, your cheese pizza has been ordered.".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Not all Amazon Lex messages require a response from the user. For
     * example, conclusion statements do not require a response. Some messages
     * require only a yes or no response. In addition to the
     * <code>message</code>, Amazon Lex provides additional context about the
     * message in the response that you can use to enhance client behavior, such
     * as displaying the appropriate client user interface. Consider the
     * following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the message is to elicit slot data, Amazon Lex returns the following
     * context information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-lex-dialog-state</code> header set to <code>ElicitSlot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-intent-name</code> header set to the intent name in the
     * current context
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-slot-to-elicit</code> header set to the slot name for
     * which the <code>message</code> is eliciting information
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-slots</code> header set to a map of slots configured for
     * the intent with their current values
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the message is a confirmation prompt, the
     * <code>x-amz-lex-dialog-state</code> header is set to
     * <code>Confirmation</code> and the <code>x-amz-lex-slot-to-elicit</code>
     * header is omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the message is a clarification prompt configured for the intent,
     * indicating that the user intent is not understood, the
     * <code>x-amz-dialog-state</code> header is set to
     * <code>ElicitIntent</code> and the <code>x-amz-slot-to-elicit</code>
     * header is omitted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, Amazon Lex also returns your application-specific
     * <code>sessionAttributes</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html"
     * >Managing Conversation Context</a>.
     * </p>
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
    public PostContentResult postContent(PostContentRequest postContentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(postContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
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
            Unmarshaller<PostContentResult, JsonUnmarshallerContext> unmarshaller = new PostContentResultJsonUnmarshaller();
            JsonResponseHandler<PostContentResult> responseHandler = new JsonResponseHandler<PostContentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sends user input (text-only) to Amazon Lex. Client applications can use
     * this API to send requests to Amazon Lex at runtime. Amazon Lex then
     * interprets the user input using the machine learning model it built for
     * the bot.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next <code>message</code> to convey
     * to the user an optional <code>responseCard</code> to display. Consider
     * the following example messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a user input "I would like a pizza", Amazon Lex might return a
     * response with a message eliciting slot data (for example, PizzaSize):
     * "What size pizza would you like?"
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user provides all of the pizza order information, Amazon Lex
     * might return a response with a message to obtain user confirmation
     * "Proceed with the pizza order?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user replies to a confirmation prompt with a "yes", Amazon Lex
     * might return a conclusion statement:
     * "Thank you, your cheese pizza has been ordered.".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Not all Amazon Lex messages require a user response. For example, a
     * conclusion statement does not require a response. Some messages require
     * only a "yes" or "no" user response. In addition to the
     * <code>message</code>, Amazon Lex provides additional context about the
     * message in the response that you might use to enhance client behavior,
     * for example, to display the appropriate client user interface. These are
     * the <code>slotToElicit</code>, <code>dialogState</code>,
     * <code>intentName</code>, and <code>slots</code> fields in the response.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the message is to elicit slot data, Amazon Lex returns the following
     * context information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dialogState</code> set to ElicitSlot
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>intentName</code> set to the intent name in the current context
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElicit</code> set to the slot name for which the
     * <code>message</code> is eliciting information
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slots</code> set to a map of slots, configured for the intent, with
     * currently known values
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the message is a confirmation prompt, the <code>dialogState</code> is
     * set to ConfirmIntent and <code>SlotToElicit</code> is set to null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the message is a clarification prompt (configured for the intent) that
     * indicates that user intent is not understood, the
     * <code>dialogState</code> is set to ElicitIntent and
     * <code>slotToElicit</code> is set to null.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, Amazon Lex also returns your application-specific
     * <code>sessionAttributes</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html"
     * >Managing Conversation Context</a>.
     * </p>
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
    public PostTextResult postText(PostTextRequest postTextRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(postTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
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
            Unmarshaller<PostTextResult, JsonUnmarshallerContext> unmarshaller = new PostTextResultJsonUnmarshaller();
            JsonResponseHandler<PostTextResult> responseHandler = new JsonResponseHandler<PostTextResult>(
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
