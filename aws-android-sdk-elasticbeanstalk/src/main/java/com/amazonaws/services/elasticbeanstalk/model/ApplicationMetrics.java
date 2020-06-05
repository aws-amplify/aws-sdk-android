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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Application request metrics for an AWS Elastic Beanstalk environment.
 * </p>
 */
public class ApplicationMetrics implements Serializable {
    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For
     * example, you might have 5 requests (<code>request_count</code>) within
     * the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * Average number of requests handled by the web server per second over the
     * last 10 seconds.
     * </p>
     */
    private Integer requestCount;

    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that
     * resulted in each type of status code response.
     * </p>
     */
    private StatusCodes statusCodes;

    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over
     * the last 10 seconds. Latencies are in seconds with one millisecond
     * resolution.
     * </p>
     */
    private Latency latency;

    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For
     * example, you might have 5 requests (<code>request_count</code>) within
     * the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     *
     * @return <p>
     *         The amount of time that the metrics cover (usually 10 seconds).
     *         For example, you might have 5 requests (
     *         <code>request_count</code>) within the most recent time slice of
     *         10 seconds (<code>duration</code>).
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For
     * example, you might have 5 requests (<code>request_count</code>) within
     * the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     *
     * @param duration <p>
     *            The amount of time that the metrics cover (usually 10
     *            seconds). For example, you might have 5 requests (
     *            <code>request_count</code>) within the most recent time slice
     *            of 10 seconds (<code>duration</code>).
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For
     * example, you might have 5 requests (<code>request_count</code>) within
     * the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The amount of time that the metrics cover (usually 10
     *            seconds). For example, you might have 5 requests (
     *            <code>request_count</code>) within the most recent time slice
     *            of 10 seconds (<code>duration</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationMetrics withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * Average number of requests handled by the web server per second over the
     * last 10 seconds.
     * </p>
     *
     * @return <p>
     *         Average number of requests handled by the web server per second
     *         over the last 10 seconds.
     *         </p>
     */
    public Integer getRequestCount() {
        return requestCount;
    }

    /**
     * <p>
     * Average number of requests handled by the web server per second over the
     * last 10 seconds.
     * </p>
     *
     * @param requestCount <p>
     *            Average number of requests handled by the web server per
     *            second over the last 10 seconds.
     *            </p>
     */
    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    /**
     * <p>
     * Average number of requests handled by the web server per second over the
     * last 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestCount <p>
     *            Average number of requests handled by the web server per
     *            second over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationMetrics withRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
        return this;
    }

    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that
     * resulted in each type of status code response.
     * </p>
     *
     * @return <p>
     *         Represents the percentage of requests over the last 10 seconds
     *         that resulted in each type of status code response.
     *         </p>
     */
    public StatusCodes getStatusCodes() {
        return statusCodes;
    }

    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that
     * resulted in each type of status code response.
     * </p>
     *
     * @param statusCodes <p>
     *            Represents the percentage of requests over the last 10 seconds
     *            that resulted in each type of status code response.
     *            </p>
     */
    public void setStatusCodes(StatusCodes statusCodes) {
        this.statusCodes = statusCodes;
    }

    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that
     * resulted in each type of status code response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCodes <p>
     *            Represents the percentage of requests over the last 10 seconds
     *            that resulted in each type of status code response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationMetrics withStatusCodes(StatusCodes statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over
     * the last 10 seconds. Latencies are in seconds with one millisecond
     * resolution.
     * </p>
     *
     * @return <p>
     *         Represents the average latency for the slowest X percent of
     *         requests over the last 10 seconds. Latencies are in seconds with
     *         one millisecond resolution.
     *         </p>
     */
    public Latency getLatency() {
        return latency;
    }

    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over
     * the last 10 seconds. Latencies are in seconds with one millisecond
     * resolution.
     * </p>
     *
     * @param latency <p>
     *            Represents the average latency for the slowest X percent of
     *            requests over the last 10 seconds. Latencies are in seconds
     *            with one millisecond resolution.
     *            </p>
     */
    public void setLatency(Latency latency) {
        this.latency = latency;
    }

    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over
     * the last 10 seconds. Latencies are in seconds with one millisecond
     * resolution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latency <p>
     *            Represents the average latency for the slowest X percent of
     *            requests over the last 10 seconds. Latencies are in seconds
     *            with one millisecond resolution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationMetrics withLatency(Latency latency) {
        this.latency = latency;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getRequestCount() != null)
            sb.append("RequestCount: " + getRequestCount() + ",");
        if (getStatusCodes() != null)
            sb.append("StatusCodes: " + getStatusCodes() + ",");
        if (getLatency() != null)
            sb.append("Latency: " + getLatency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCount() == null) ? 0 : getRequestCount().hashCode());
        hashCode = prime * hashCode
                + ((getStatusCodes() == null) ? 0 : getStatusCodes().hashCode());
        hashCode = prime * hashCode + ((getLatency() == null) ? 0 : getLatency().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationMetrics == false)
            return false;
        ApplicationMetrics other = (ApplicationMetrics) obj;

        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getRequestCount() == null ^ this.getRequestCount() == null)
            return false;
        if (other.getRequestCount() != null
                && other.getRequestCount().equals(this.getRequestCount()) == false)
            return false;
        if (other.getStatusCodes() == null ^ this.getStatusCodes() == null)
            return false;
        if (other.getStatusCodes() != null
                && other.getStatusCodes().equals(this.getStatusCodes()) == false)
            return false;
        if (other.getLatency() == null ^ this.getLatency() == null)
            return false;
        if (other.getLatency() != null && other.getLatency().equals(this.getLatency()) == false)
            return false;
        return true;
    }
}
