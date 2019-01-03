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

package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.RequestClientOptions.Marker;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.TimingInfo;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * The Amazon HTTP Client class.
 */
public class AmazonHttpClient {

    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final String HEADER_SDK_TRANSACTION_ID = "aws-sdk-invocation-id";
    private static final String HEADER_SDK_RETRY_INFO = "aws-sdk-retry";

    private static final int HTTP_STATUS_OK = 200;
    private static final int HTTP_STATUS_TEMP_REDIRECT = 307;
    private static final int HTTP_STATUS_MULTIPLE_CHOICES = 300;
    private static final int HTTP_STATUS_REQ_TOO_LONG = 413;
    private static final int HTTP_STATUS_SERVICE_UNAVAILABLE = 503;

    private static final int TIME_MILLISEC = 1000;

    /**
     * Logger providing detailed information on requests/responses. Users can
     * enable this logger to get access to AWS request IDs for responses,
     * individual requests and parameters sent to AWS, etc.
     */
    private static final Log REQUEST_LOG = LogFactory.getLog("com.amazonaws.request");

    /**
     * Logger for more detailed debugging information, that might not be as
     * useful for end users (ex: HTTP client configuration, etc).
     */
    static final Log log = LogFactory.getLog(AmazonHttpClient.class);

    /** Internal client for sending HTTP requests */
    final HttpClient httpClient;

    /** Client configuration options, such as proxy settings, max retries, etc. */
    final ClientConfiguration config;

    /**
     * A request metric collector used specifically for this http client; or
     * null if there is none. This collector, if specified, always takes
     * precedence over the one specified at the AWS SDK level.
     *
     * @see AwsSdkMetrics
     */
    private final RequestMetricCollector requestMetricCollector;

    private final HttpRequestFactory requestFactory = new HttpRequestFactory();

    /**
     * Constructs a new AWS client using the specified client configuration
     * options (ex: max retry attempts, proxy settings, etc).
     *
     * @param config Configuration options specifying how this client will
     *            communicate with AWS (ex: proxy settings, retry count, etc.).
     */
    public AmazonHttpClient(ClientConfiguration config) {
        this(config, new UrlHttpClient(config));
    }

    /**
     * Constructs a new AWS client using the specified client configuration
     * options (ex: max retry attempts, proxy settings, etc), and request metric
     * collector.
     *
     * @param config Configuration options specifying how this client will
     *            communicate with AWS (ex: proxy settings, retry count, etc.).
     * @param requestMetricCollector client specific request metric collector,
     *            which takes precedence over the one at the AWS SDK level; or
     *            null if there is none.
     */
    @Deprecated
    public AmazonHttpClient(ClientConfiguration config,
            RequestMetricCollector requestMetricCollector) {
        this(config, new UrlHttpClient(config), requestMetricCollector);
    }

    /**
     * Constructs a new AWS client using the specified client configuration
     * options (ex: max retry attempts, proxy settings, etc), and request metric
     * collector.
     *
     * @param config Configuration options specifying how this client will
     *            communicate with AWS (ex: proxy settings, retry count, etc.).
     * @param httpClient client specific HttpClient
     */
    public AmazonHttpClient(ClientConfiguration config, HttpClient httpClient) {
        this.config = config;
        this.httpClient = httpClient;
        this.requestMetricCollector = null;
    }

    /**
     * Constructs a new AWS client using the specified client configuration
     * options (ex: max retry attempts, proxy settings, etc), and request metric
     * collector.
     *
     * @param config Configuration options specifying how this client will
     *            communicate with AWS (ex: proxy settings, retry count, etc.).
     * @param httpClient client specific HttpClient
     * @param requestMetricCollector client specific request metric collector,
     *            which takes precedence over the one at the AWS SDK level; or
     *            null if there is none.
     */
    @Deprecated
    public AmazonHttpClient(ClientConfiguration config, HttpClient httpClient,
            RequestMetricCollector requestMetricCollector) {
        this.config = config;
        this.httpClient = httpClient;
        this.requestMetricCollector = requestMetricCollector;
    }

    /**
     * Returns additional response metadata for an executed request. Response
     * metadata isn't considered part of the standard results returned by an
     * operation, so it's accessed instead through this diagnostic interface.
     * Response metadata is typically used for troubleshooting issues with AWS
     * support staff when services aren't acting as expected.
     *
     * @param request A previously executed AmazonWebServiceRequest object,
     *            whose response metadata is desired.
     * @return The response metadata for the specified request, otherwise null
     *         if there is no response metadata available for the request.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getResponseMetadataForRequest(AmazonWebServiceRequest request) {
        return null;
    }

    /**
     * Executes the request and returns the result.
     *
     * @param request The AmazonWebServices request to send to the remote server
     * @param responseHandler A response handler to accept a successful response
     *            from the remote server
     * @param errorResponseHandler A response handler to accept an unsuccessful
     *            response from the remote server
     * @param executionContext Additional information about the context of this
     *            web service call
     * @param <T> the response type.
     * @return the result of the request.
     */
    public <T> Response<T> execute(Request<?> request,
            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            ExecutionContext executionContext) {
        if (executionContext == null) {
            throw new AmazonClientException(
                    "Internal SDK Error: No execution context parameter specified.");
        }
        final List<RequestHandler2> requestHandler2s = requestHandler2s(request, executionContext);
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Response<T> response = null;
        try {
            response = executeHelper(request, responseHandler, errorResponseHandler,
                    executionContext);
            final TimingInfo timingInfo = awsRequestMetrics.getTimingInfo().endTiming();
            afterResponse(request, requestHandler2s, response, timingInfo);
            return response;
        } catch (final AmazonClientException e) {
            afterError(request, response, requestHandler2s, e);
            throw e;
        }
    }

    void afterError(Request<?> request, Response<?> response,
            List<RequestHandler2> requestHandler2s, AmazonClientException e) {
        for (final RequestHandler2 handler2 : requestHandler2s) {
            handler2.afterError(request, response, e);
        }
    }

    <T> void afterResponse(Request<?> request,
            List<RequestHandler2> requestHandler2s,
            Response<T> response,
            TimingInfo timingInfo) {
        for (final RequestHandler2 handler2 : requestHandler2s) {
            handler2.afterResponse(request, response);
        }
    }

    List<RequestHandler2> requestHandler2s(Request<?> request,
            ExecutionContext executionContext) {
        final List<RequestHandler2> requestHandler2s = executionContext
                .getRequestHandler2s();
        if (requestHandler2s == null) {
            return Collections.emptyList();
        }
        // Apply any additional service specific request handlers that need
        // to be run
        for (final RequestHandler2 requestHandler2 : requestHandler2s) {
            // If the request handler is a type of CredentialsRequestHandler,
            // then set the credentials in the request handler.
            if (requestHandler2 instanceof CredentialsRequestHandler) {
                ((CredentialsRequestHandler) requestHandler2)
                        .setCredentials(executionContext.getCredentials());
            }
            requestHandler2.beforeRequest(request);
        }
        return requestHandler2s;
    }

    /**
     * Internal method to execute the HTTP method given.
     *
     * @see AmazonHttpClient#execute(Request, HttpResponseHandler,
     *      HttpResponseHandler)
     * @see AmazonHttpClient#execute(Request, HttpResponseHandler,
     *      HttpResponseHandler, ExecutionContext)
     */
    @SuppressWarnings("checkstyle:methodlength")
    <T> Response<T> executeHelper(Request<?> request,
            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            ExecutionContext executionContext) {
        /*
         * Depending on which response handler we end up choosing to handle the
         * HTTP response, it might require us to leave the underlying HTTP
         * connection open, depending on whether or not it reads the complete
         * HTTP response stream from the HTTP connection, or if delays reading
         * any of the content until after a response is returned to the caller.
         */
        boolean leaveHttpConnectionOpen = false;
        final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        /*
         * add the service endpoint to the logs. You can infer service name from
         * service endpoint
         */
        awsRequestMetrics.addProperty(Field.ServiceName, request.getServiceName());
        awsRequestMetrics.addProperty(Field.ServiceEndpoint, request.getEndpoint());

        // Apply whatever request options we know how to handle, such as
        // user-agent.
        setUserAgent(request);
        request.addHeader(HEADER_SDK_TRANSACTION_ID, UUID.randomUUID().toString());
        int requestCount = 0;
        long lastBackoffDelay = 0;
        URI redirectedURI = null;
        AmazonClientException retriedException = null;

        // Make a copy of the original request params and headers so that we can
        // permute it in this loop and start over with the original every time.
        final Map<String, String> originalParameters = new LinkedHashMap<String, String>(
                request.getParameters());
        final Map<String, String> originalHeaders = new HashMap<String, String>(request.getHeaders());
        // mark input stream if supported
        final InputStream originalContent = request.getContent();
        if (originalContent != null && originalContent.markSupported()) {
            originalContent.mark(-1);
        }

        final AWSCredentials credentials = executionContext.getCredentials();
        Signer signer = null;
        HttpResponse httpResponse = null;
        HttpRequest httpRequest = null;

        while (true) {
            ++requestCount;
            awsRequestMetrics.setCounter(Field.RequestCount, requestCount);
            if (requestCount > 1) { // retry
                request.setParameters(originalParameters);
                request.setHeaders(originalHeaders);
                request.setContent(originalContent);
            }
            if (redirectedURI != null && request.getEndpoint() == null
                    && request.getResourcePath() == null) {
                request.setEndpoint(URI.create(
                        redirectedURI.getScheme() + "://" + redirectedURI.getAuthority()));
                request.setResourcePath(redirectedURI.getPath());
            }

            try {
                if (requestCount > 1) { // retry
                    awsRequestMetrics.startEvent(Field.RetryPauseTime);
                    try {
                        lastBackoffDelay = pauseBeforeNextRetry(request.getOriginalRequest(),
                                retriedException,
                                requestCount,
                                config.getRetryPolicy());
                    } finally {
                        awsRequestMetrics.endEvent(Field.RetryPauseTime);
                    }
                    final InputStream content = request.getContent();
                    if (content != null && content.markSupported()) {
                        content.reset();
                    }
                }
                request.addHeader(HEADER_SDK_RETRY_INFO,
                        (requestCount - 1) + "/" + lastBackoffDelay);

                // Sign the request if a signer was provided
                if (signer == null) {
                    signer = executionContext.getSignerByURI(request.getEndpoint());
                }
                if (signer != null && credentials != null) {
                    awsRequestMetrics.startEvent(Field.RequestSigningTime);
                    try {
                        signer.sign(request, credentials);
                    } finally {
                        awsRequestMetrics.endEvent(Field.RequestSigningTime);
                    }
                }

                if (REQUEST_LOG.isDebugEnabled()) {
                    REQUEST_LOG.debug("Sending Request: " + request.toString());
                }

                httpRequest = requestFactory.createHttpRequest(request, config,
                        executionContext);

                retriedException = null;
                awsRequestMetrics.startEvent(Field.HttpRequestTime);
                try {
                    httpResponse = httpClient.execute(httpRequest);
                } finally {
                    awsRequestMetrics.endEvent(Field.HttpRequestTime);
                }

                if (isRequestSuccessful(httpResponse)) {
                    awsRequestMetrics.addProperty(Field.StatusCode, httpResponse.getStatusCode());
                    /*
                     * If we get back any 2xx status code, then we know we
                     * should treat the service call as successful.
                     */
                    leaveHttpConnectionOpen = responseHandler.needsConnectionLeftOpen();
                    final T response = handleResponse(request, responseHandler,
                            httpResponse,
                            executionContext);
                    return new Response<T>(response, httpResponse);
                } else if (isTemporaryRedirect(httpResponse)) {
                    /*
                     * S3 sends 307 Temporary Redirects if you try to delete an
                     * EU bucket from the US endpoint. If we get a 307, we'll
                     * point the HTTP method to the redirected location, and let
                     * the next retry deliver the request to the right location.
                     */
                    final String redirectedLocation = httpResponse.getHeaders().get("Location");
                    log.debug("Redirecting to: " + redirectedLocation);
                    // set redirect uri and retry
                    redirectedURI = URI.create(redirectedLocation);
                    request.setEndpoint(null);
                    request.setResourcePath(null);
                    awsRequestMetrics.addProperty(Field.StatusCode, httpResponse.getStatusCode());
                    awsRequestMetrics.addProperty(Field.RedirectLocation, redirectedLocation);
                    awsRequestMetrics.addProperty(Field.AWSRequestID, null);
                } else {
                    leaveHttpConnectionOpen = errorResponseHandler.needsConnectionLeftOpen();
                    final AmazonServiceException ase = handleErrorResponse(request, errorResponseHandler,
                            httpResponse);
                    awsRequestMetrics.addProperty(Field.AWSRequestID, ase.getRequestId());
                    awsRequestMetrics.addProperty(Field.AWSErrorCode, ase.getErrorCode());
                    awsRequestMetrics.addProperty(Field.StatusCode, ase.getStatusCode());

                    if (!shouldRetry(request.getOriginalRequest(),
                            httpRequest.getContent(),
                            ase,
                            requestCount,
                            config.getRetryPolicy())) {
                        throw ase;
                    }

                    // Cache the retryable exception
                    retriedException = ase;
                    /*
                     * Checking for clock skew error again because we don't want
                     * to set the global time offset for every service
                     * exception.
                     */
                    if (RetryUtils.isClockSkewError(ase)) {
                        final int timeOffset = parseClockSkewOffset(httpResponse, ase);
                        SDKGlobalConfiguration.setGlobalTimeOffset(timeOffset);
                    }
                    resetRequestAfterError(request, ase);
                }
            } catch (final IOException ioe) {
                if (log.isDebugEnabled()) {
                    log.debug("Unable to execute HTTP request: " + ioe.getMessage(), ioe);
                }
                awsRequestMetrics.incrementCounter(Field.Exception);
                awsRequestMetrics.addProperty(Field.Exception, ioe);
                awsRequestMetrics.addProperty(Field.AWSRequestID, null);

                final AmazonClientException ace = new AmazonClientException(
                        "Unable to execute HTTP request: " + ioe.getMessage(), ioe);
                if (!shouldRetry(request.getOriginalRequest(),
                        httpRequest.getContent(),
                        ace,
                        requestCount,
                        config.getRetryPolicy())) {
                    throw ace;
                }

                // Cache the retryable exception
                retriedException = ace;
                resetRequestAfterError(request, ioe);
            } catch (final RuntimeException e) {
                throw handleUnexpectedFailure(e, awsRequestMetrics);
            } catch (final Error e) {
                throw handleUnexpectedFailure(e, awsRequestMetrics);
            } finally {
                /*
                 * Some response handlers need to manually manage the HTTP
                 * connection and will take care of releasing the connection on
                 * their own, but if this response handler doesn't need the
                 * connection left open, we go ahead and release the it to free
                 * up resources.
                 */
                if (!leaveHttpConnectionOpen && httpResponse != null) {
                    try {
                        if (httpResponse.getRawContent() != null) {
                            httpResponse.getRawContent().close();
                        }
                    } catch (final IOException e) {
                        log.warn("Cannot close the response content.", e);
                    }
                }
            }
        } /* end while (true) */
    }

    /**
     * Handles an unexpected failure, returning the Throwable instance as given.
     */
    private <T extends Throwable> T handleUnexpectedFailure(T t, AWSRequestMetrics awsRequestMetrics) {
        awsRequestMetrics.incrementCounter(Field.Exception);
        awsRequestMetrics.addProperty(Field.Exception, t);
        return t;
    }

    /**
     * Resets the specified request, so that it can be sent again, after
     * receiving the specified error. If a problem is encountered with resetting
     * the request, then an AmazonClientException is thrown with the original
     * error as the cause (not an error about being unable to reset the stream).
     *
     * @param request The request being executed that failed and needs to be
     *            reset.
     * @param cause The original error that caused the request to fail.
     * @throws AmazonClientException If the request can't be reset.
     */
    void resetRequestAfterError(Request<?> request, Exception cause) {
        if (request.getContent() == null) {
            return; // no reset needed
        }
        if (!request.getContent().markSupported()) {
            throw new AmazonClientException(
                    "Encountered an exception and stream is not resettable", cause);
        }
        try {
            request.getContent().reset();
        } catch (final IOException e) {
            // This exception comes from being unable to reset the input stream,
            // so throw the original, more meaningful exception
            throw new AmazonClientException(
                    "Encountered an exception and couldn't reset the stream to retry", cause);
        }
    }

    /**
     * Sets a User-Agent for the specified request, taking into account any
     * custom data.
     */
    void setUserAgent(Request<?> request) {
        String userAgent = ClientConfiguration.DEFAULT_USER_AGENT;
        // append request specific user agent marker
        final AmazonWebServiceRequest awsreq = request.getOriginalRequest();
        if (awsreq != null) {
            final RequestClientOptions opts = awsreq.getRequestClientOptions();
            if (opts != null) {
                final String userAgentMarker = opts.getClientMarker(Marker.USER_AGENT);
                if (userAgentMarker != null) {
                    userAgent = createUserAgentString(userAgent, userAgentMarker);
                }
            }
        }
        // if custom user agent is set via ClientConfiguration, append it to the end
        if (!ClientConfiguration.DEFAULT_USER_AGENT.equals(config.getUserAgent())) {
            userAgent = createUserAgentString(userAgent, config.getUserAgent());
        }
        request.addHeader(HEADER_USER_AGENT, userAgent);
    }

    /**
     * Appends the given user-agent string to the existing one and returns it.
     */
    static String createUserAgentString(String existingUserAgentString, String userAgent) {
        if (existingUserAgentString.contains(userAgent)) {
            return existingUserAgentString;
        } else {
            return existingUserAgentString.trim() + " " + userAgent.trim();
        }
    }

    /**
     * Shuts down this HTTP client object, releasing any resources that might be
     * held open. This is an optional method, and callers are not expected to
     * call it, but can if they want to explicitly release any open resources.
     * Once a client has been shutdown, it cannot be used to make more requests.
     */
    public void shutdown() {
        httpClient.shutdown();
    }

    /**
     * Returns true if a failed request should be retried.
     *
     * @param originalRequest The original service request that is being
     *            executed.
     * @param method The current HTTP method being executed.
     * @param exception The client/service exception from the failed request.
     * @param requestCount The number of times the current request has been
     *            attempted.
     * @return True if the failed request should be retried.
     */
    private boolean shouldRetry(AmazonWebServiceRequest originalRequest,
            InputStream inputStream,
            AmazonClientException exception,
            int requestCount,
            RetryPolicy retryPolicy) {
        final int retries = requestCount - 1;

        int maxErrorRetry = config.getMaxErrorRetry();
        // We should use the maxErrorRetry in
        // the RetryPolicy if either the user has not explicitly set it in
        // ClientConfiguration, or the RetryPolicy is configured to take
        // higher precedence.
        if (maxErrorRetry < 0
                || !retryPolicy.isMaxErrorRetryInClientConfigHonored()) {
            maxErrorRetry = retryPolicy.getMaxErrorRetry();
        }

        // Immediately fails when it has exceeds the max retry count.
        if (retries >= maxErrorRetry) {
            return false;
        }

        // Never retry on requests containing non-repeatable entity
        if (inputStream != null && !inputStream.markSupported()) {
            if (log.isDebugEnabled()) {
                log.debug("Content not repeatable");
            }
            return false;
        }

        // Pass all the context information to the RetryCondition and let it
        // decide whether it should be retried.
        return retryPolicy.getRetryCondition().shouldRetry(originalRequest,
                exception,
                retries);
    }

    private static boolean isTemporaryRedirect(HttpResponse response) {
        final int statusCode = response.getStatusCode();
        final String location = response.getHeaders().get("Location");
        return statusCode == HTTP_STATUS_TEMP_REDIRECT &&
                location != null && !location.isEmpty();
    }

    private boolean isRequestSuccessful(HttpResponse response) {
        final int statusCode = response.getStatusCode();
        return statusCode >= HTTP_STATUS_OK && statusCode < HTTP_STATUS_MULTIPLE_CHOICES;
    }

    /**
     * Handles a successful response from a service call by unmarshalling the
     * results using the specified response handler.
     *
     * @param <T> The type of object expected in the response.
     * @param request The original request that generated the response being
     *            handled.
     * @param responseHandler The response unmarshaller used to interpret the
     *            contents of the response.
     * @param method The HTTP method that was invoked, and contains the contents
     *            of the response.
     * @param executionContext Extra state information about the request
     *            currently being executed.
     * @return The contents of the response, unmarshalled using the specified
     *         response handler.
     * @throws IOException If any problems were encountered reading the response
     *             contents from the HTTP method object.
     */
    <T> T handleResponse(Request<?> request,
            HttpResponseHandler<AmazonWebServiceResponse<T>> responseHandler,
            HttpResponse response,
            ExecutionContext executionContext) throws IOException {
        try {
            final AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
            AmazonWebServiceResponse<? extends T> awsResponse;
            awsRequestMetrics.startEvent(Field.ResponseProcessingTime);
            try {
                awsResponse = responseHandler.handle(response);
            } finally {
                awsRequestMetrics.endEvent(Field.ResponseProcessingTime);
            }

            if (awsResponse == null) {
                throw new RuntimeException(
                        "Unable to unmarshall response metadata. Response Code: " +
                                response.getStatusCode() + ", Response Text: "
                                + response.getStatusText());
            }

            if (REQUEST_LOG.isDebugEnabled()) {
                REQUEST_LOG.debug("Received successful response: " + response.getStatusCode()
                        + ", AWS Request ID: " + awsResponse.getRequestId());
            }
            awsRequestMetrics.addProperty(Field.AWSRequestID, awsResponse.getRequestId());

            return awsResponse.getResult();
        } catch (final CRC32MismatchException e) {
            throw e;
        } catch (final IOException e) {
            throw e;
        } catch (final Exception e) {
            final String errorMessage = "Unable to unmarshall response (" + e.getMessage()
                    + "). Response Code: " +
                    response.getStatusCode() + ", Response Text: " + response.getStatusText();
            throw new AmazonClientException(errorMessage, e);
        }
    }

    /**
     * Responsible for handling an error response, including unmarshalling the
     * error response into the most specific exception type possible, and
     * throwing the exception.
     *
     * @param request The request that generated the error response being
     *            handled.
     * @param errorResponseHandler The response handler responsible for
     *            unmarshalling the error response.
     * @param method The HTTP method containing the actual response content.
     * @throws IOException If any problems are encountering reading the error
     *             response.
     */
    AmazonServiceException handleErrorResponse(Request<?> request,
            HttpResponseHandler<AmazonServiceException> errorResponseHandler,
            HttpResponse response) throws IOException {
        final int status = response.getStatusCode();

        AmazonServiceException exception = null;
        try {
            exception = errorResponseHandler.handle(response);
            REQUEST_LOG.debug("Received error response: " + exception.toString());
        } catch (final Exception e) {
            // If the errorResponseHandler doesn't work, then check for error
            // responses that don't have any content
            if (status == HTTP_STATUS_REQ_TOO_LONG) {
                exception = new AmazonServiceException("Request entity too large");
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(HTTP_STATUS_REQ_TOO_LONG);
                exception.setErrorType(ErrorType.Client);
                exception.setErrorCode("Request entity too large");
            } else if (status == HTTP_STATUS_SERVICE_UNAVAILABLE
                    && "Service Unavailable".equalsIgnoreCase(response.getStatusText())) {
                exception = new AmazonServiceException("Service unavailable");
                exception.setServiceName(request.getServiceName());
                exception.setStatusCode(HTTP_STATUS_SERVICE_UNAVAILABLE);
                exception.setErrorType(ErrorType.Service);
                exception.setErrorCode("Service unavailable");
            } else if (e instanceof IOException) {
                throw (IOException) e;
            } else {
                final String errorMessage = "Unable to unmarshall error response (" + e.getMessage()
                        + "). Response Code: " + status
                        + ", Response Text: " + response.getStatusText()
                        + ", Response Headers: " + response.getHeaders();
                throw new AmazonClientException(errorMessage, e);
            }
        }

        exception.setStatusCode(status);
        exception.setServiceName(request.getServiceName());
        exception.fillInStackTrace();
        return exception;
    }

    /**
     * Sleep for a period of time on failed request to avoid flooding a service
     * with retries.
     *
     * @param originalRequest The original service request that is being
     *            executed.
     * @param previousException Exception information for the previous attempt,
     *            if any.
     * @param requestCount current request count (including the next attempt
     *            after the delay)
     * @param retryPolicy The retry policy configured in this http client.
     */
    private long pauseBeforeNextRetry(AmazonWebServiceRequest originalRequest,
            AmazonClientException previousException,
            int requestCount,
            RetryPolicy retryPolicy) {
        final int retries = requestCount // including next attempt
                - 1 // number of attempted requests
                - 1; // number of attempted retries

        final long delay = retryPolicy.getBackoffStrategy().delayBeforeNextRetry(
                originalRequest, previousException, retries);

        if (log.isDebugEnabled()) {
            log.debug("Retriable error detected, " +
                    "will retry in " + delay + "ms, attempt number: " + retries);
        }

        try {
            Thread.sleep(delay);
            return delay;
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    /**
     * Returns date string from the exception message body in form of
     * yyyyMMdd'T'HHmmss'Z' We needed to extract date from the message body
     * because SQS is the only service that does not provide date header in the
     * response. Example, when device time is behind than the server time than
     * we get a string that looks something like this:
     * "Signature expired: 20130401T030113Z is now earlier than 20130401T034613Z (20130401T040113Z - 15 min.)"
     *
     * @param body The message from where the server time is being extracted
     * @return Return datetime in string format (yyyyMMdd'T'HHmmss'Z')
     */
    private String getServerDateFromException(String body) {
        final int startPos = body.indexOf("(");
        int endPos = 0;
        if (body.contains(" + 15")) {
            endPos = body.indexOf(" + 15");
        } else {
            endPos = body.indexOf(" - 15");
        }
        final String msg = body.substring(startPos + 1, endPos);
        return msg;
    }

    int parseClockSkewOffset(HttpResponse response, AmazonServiceException exception) {
        final Date deviceDate = new Date();
        Date serverDate = null;
        String serverDateStr = null;
        final String responseDateHeader = response.getHeaders().get("Date");

        try {

            if (responseDateHeader == null || responseDateHeader.isEmpty()) {
                // SQS doesn't return Date header
                serverDateStr = getServerDateFromException(exception.getMessage());
                serverDate = DateUtils.parseCompressedISO8601Date(serverDateStr);
            } else {
                serverDateStr = responseDateHeader;
                serverDate = DateUtils.parseRFC822Date(serverDateStr);
            }
        } catch (final RuntimeException e) {
            log.warn("Unable to parse clock skew offset from response: "
                    + serverDateStr,
                    e);
            return 0;
        }

        final long diff = deviceDate.getTime() - serverDate.getTime();
        return (int) (diff / TIME_MILLISEC);
    }

    @Override
    protected void finalize() throws Throwable {
        this.shutdown();
        super.finalize();
    }

    /**
     * @return the http client specific request metric collector; or null if
     * there is none.
     */
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }
}
