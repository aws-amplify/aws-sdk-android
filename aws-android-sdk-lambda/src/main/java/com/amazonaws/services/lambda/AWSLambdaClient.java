/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lambda;

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

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.services.lambda.model.transform.*;

/**
 * Client for accessing AWS Lambda. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide
 * provides additional information. For the service overview, see <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS
 * Lambda</a>, and for information about how the service works, see <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"
 * >AWS Lambda: How it Works</a> in the <b>AWS Lambda Developer Guide</b>.
 * </p>
 */
public class AWSLambdaClient extends AmazonWebServiceClient implements AWSLambda {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Lambda exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSLambda. A
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
    public AWSLambdaClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSLambda. A
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
     *            how this client connects to AWSLambda (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSLambdaClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSLambda using the
     * specified AWS account credentials.
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
    public AWSLambdaClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSLambda using the
     * specified AWS account credentials and client configuration options.
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
     *            how this client connects to AWSLambda (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSLambdaClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSLambda using the
     * specified AWS account credentials provider.
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
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSLambda using the
     * specified AWS account credentials provider and client configuration
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
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSLambda (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSLambda using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSLambda (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSLambda using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSLambda (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSLambdaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new EC2AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EC2ThrottledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EC2UnexpectedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ENILimitReachedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestContentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRuntimeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSecurityGroupIDExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSubnetIDExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidZipFileExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSAccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSDisabledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSInvalidStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RequestTooLargeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SubnetIPAddressLimitReachedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedMediaTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("lambda.us-east-1.amazonaws.com");
        this.endpointPrefix = "lambda";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/lambda/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/lambda/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Invokes a Lambda function. For an example, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * Specify just a function name to invoke the latest version of the
     * function. To invoke a published version, use the <code>Qualifier</code>
     * parameter to specify a <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"
     * >version or alias</a>.
     * </p>
     * <p>
     * If you use the <code>RequestResponse</code> (synchronous) invocation
     * option, the function will be invoked only once. If you use the
     * <code>Event</code> (asynchronous) invocation option, the function will be
     * invoked at least once in response to an event and the function must be
     * idempotent to handle this.
     * </p>
     * <p>
     * For functions with a long timeout, your client may be disconnected during
     * synchronous invocation while it waits for a response. Configure your HTTP
     * client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     * <p>
     * The <code>TooManyRequestsException</code> noted below will return the
     * following: <code>ConcurrentInvocationLimitExceeded</code> will be
     * returned if you have no functions with reserved concurrency and have
     * exceeded your account concurrent limit or if a function without reserved
     * concurrency exceeds the account's unreserved concurrency limit.
     * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code> will be
     * returned when a function with reserved concurrency exceeds its configured
     * concurrency limit.
     * </p>
     * 
     * @param invokeRequest
     * @return invokeResult The response from the Invoke service method, as
     *         returned by AWS Lambda.
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestContentException
     * @throws RequestTooLargeException
     * @throws UnsupportedMediaTypeException
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     * @throws EC2UnexpectedException
     * @throws SubnetIPAddressLimitReachedException
     * @throws ENILimitReachedException
     * @throws EC2ThrottledException
     * @throws EC2AccessDeniedException
     * @throws InvalidSubnetIDException
     * @throws InvalidSecurityGroupIDException
     * @throws InvalidZipFileException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws InvalidRuntimeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Lambda indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public InvokeResult invoke(InvokeRequest invokeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(invokeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeRequest> request = null;
        Response<InvokeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeRequestMarshaller().marshall(invokeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InvokeResult, JsonUnmarshallerContext> unmarshaller = new InvokeResultJsonUnmarshaller();
            JsonResponseHandler<InvokeResult> responseHandler = new JsonResponseHandler<InvokeResult>(
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
