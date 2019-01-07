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

package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricType;

import java.util.Collections;
import java.util.List;

/**
 * Used as both a base class and a minimal support of AWS SDK request metrics.
 * The base class of supporting AWS SDK request metrics.
 * <p>
 * In contrast to {@link AWSRequestMetricsFullSupport}, which is intended to be
 * a full support of AWS SDK request metrics, this class only provides access to
 * a {@link TimingInfo} instance that only has minimal support for start and end
 * time (ie with no-ops for sub-event measurements) for backward compatibility
 * reason. The other methods related to properties and counters in this class
 * are effectively no-ops.
 * <p>
 * This class is instantiated instead of {@link AWSRequestMetricsFullSupport}
 * when request metric collection is not required during a particular service
 * request/response cycle.
 *
 * @deprecated metrics is deprecated
 */
@Deprecated
public class AWSRequestMetrics {
    /**
     * Predefined AWS SDK metric types general across all AWS clients. Client
     * specific predefined metrics like S3 or DynamoDB are defined in the client
     * specific packages.
     */
    public static enum Field implements RequestMetricType {

        /** AWSErrorCode. */
        AWSErrorCode,

        /** AWSRequestID. */
        AWSRequestID,

        /** BytesProcessed. */
        BytesProcessed,

        /**
         * Total number of milliseconds taken for a request/response including
         * the time taken to execute the request handlers, round trip to AWS,
         * and the time taken to execute the response handlers.
         */
        ClientExecuteTime,

        /** CredentialsRequestTime. */
        CredentialsRequestTime,

        /** Exception. */
        Exception,
        /**
         * Number of milliseconds taken for a request/response round trip to
         * AWS.
         */
        HttpRequestTime,

        /** RedirectLocation. */
        RedirectLocation,

        /** RequestMarshallTime. */
        RequestMarshallTime,
        /**
         * Number of milliseconds taken to sign a request.
         */
        RequestSigningTime,
        /**
         * Number of milliseconds taken to execute the response handler for a
         * response from AWS.
         */
        ResponseProcessingTime,
        /**
         * Number of requests to AWS.
         */
        RequestCount,
        /**
         * Number of retries of AWS SDK sending a request to AWS.
         */
        RetryCount, // captured via the RequestCount since (RetryCount =
                    // RequestCount - 1)
        /**
         * Number of retries of the underlying http client library in sending a
         * request to AWS.
         */
        HttpClientRetryCount,
        /**
         * Time taken to send a request to AWS by the http client library,
         * excluding any retry.
         */
        HttpClientSendRequestTime,
        /**
         * Time taken to receive a response from AWS by the http client library,
         * excluding any retry.
         */
        HttpClientReceiveResponseTime,

        /**
         * The number of idle persistent connections.
         * <p>
         * Reference: https://hc.apache
         * .org/httpcomponents-core-ga/httpcore/apidocs/org/apache
         * /http/pool/PoolStats.html
         */
        HttpClientPoolAvailableCount,
        /**
         * The number of persistent connections tracked by the connection
         * manager currently being used to execute requests.
         * <p>
         * Reference: https://hc
         * .apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache
         * /http/pool/PoolStats.html
         */
        HttpClientPoolLeasedCount,
        /**
         * The number of connection requests being blocked awaiting a free
         * connection.
         * <p>
         * Reference: https://hc.apache.org/httpcomponents-core-ga/httpcore
         * /apidocs/org/apache/http/pool/PoolStats.html
         */
        HttpClientPoolPendingCount,

        /** RetryPauseTime. */
        RetryPauseTime,
        // S3DownloadThroughput, // migrated to S3RequestMetric in the S3 clint
        // library
        // S3UploadThroughput, // migrated to S3RequestMetric in the S3 clint
        // library
        /** ServiceEndpoint. */
        ServiceEndpoint,

        /** ServiceName. */
        ServiceName,

        /** StatusCode. */
        StatusCode; // The http status code
    }

    protected final TimingInfo timingInfo;

    /**
     * This constructor should be used only in the case when AWS SDK metrics
     * collector is disabled, when minimal timing info is supported for backward
     * compatibility reasons.
     *
     * @see AWSRequestMetricsFullSupport
     */
    public AWSRequestMetrics() {
        this.timingInfo = TimingInfo.startTiming();
    }

    protected AWSRequestMetrics(TimingInfo timingInfo) {
        this.timingInfo = timingInfo;
    }

    public final TimingInfo getTimingInfo() {
        return timingInfo;
    }

    /**
     * @return true if this metrics is enabled; false otherwise. Returns false
     * by default.
     */
    public boolean isEnabled() {
        return false;
    }

    /**
     * @param eventName the event name to start.
     */
    public void startEvent(String eventName) {
    }

    /**
     * @param f the metric type.
     */
    public void startEvent(MetricType f) {
    }

    /**
     * @param eventName the event name.
     */
    public void endEvent(String eventName) {
    }

    /**
     * @param f the metric type.
     */
    public void endEvent(MetricType f) {
    }

    /**
     * @param event the event.
     */
    public void incrementCounter(String event) {
    }

    /**
     * @param f the metric type.
     */
    public void incrementCounter(MetricType f) {
    }

    /**
     * @param counterName the counter name.
     * @param count the count.
     */
    public void setCounter(String counterName, long count) {
    }

    /**
     * @param f the metric type.
     * @param count the count.
     */
    public void setCounter(MetricType f, long count) {
    }

    /**
     * @param propertyName the property name.
     * @param value the value.
     */
    public void addProperty(String propertyName, Object value) {
    }

    /**
     * @param f the metric type.
     * @param value the value.
     */
    public void addProperty(MetricType f, Object value) {
    }

    /**
     * log.
     */
    public void log() {
    }

    /**
     * @param propertyName the property name.
     * @return list of property objects.
     */
    public List<Object> getProperty(String propertyName) {
        return Collections.emptyList();
    }

    /**
     * @param f the metric type.
     * @return the list of property objects.
     */
    public List<Object> getProperty(MetricType f) {
        return Collections.emptyList();
    }
}
