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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the results of a query that retrieved the data for a standard
 * execution metric that applies to a journey, and provides information about
 * that query.
 * </p>
 */
public class JourneyExecutionMetricsResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     */
    private String journeyId;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint last
     * evaluated the journey and updated the data for the metric.
     * </p>
     */
    private String lastEvaluatedTime;

    /**
     * <p>
     * A JSON object that contains the results of the query. For information
     * about the structure and contents of the results, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     */
    private java.util.Map<String, String> metrics;

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that the metric applies
     *         to.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the metric
     *            applies to.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the metric
     *            applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneyExecutionMetricsResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the journey that the metric applies to.
     *         </p>
     */
    public String getJourneyId() {
        return journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     *
     * @param journeyId <p>
     *            The unique identifier for the journey that the metric applies
     *            to.
     *            </p>
     */
    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journeyId <p>
     *            The unique identifier for the journey that the metric applies
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneyExecutionMetricsResponse withJourneyId(String journeyId) {
        this.journeyId = journeyId;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint last
     * evaluated the journey and updated the data for the metric.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when Amazon Pinpoint last
     *         evaluated the journey and updated the data for the metric.
     *         </p>
     */
    public String getLastEvaluatedTime() {
        return lastEvaluatedTime;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint last
     * evaluated the journey and updated the data for the metric.
     * </p>
     *
     * @param lastEvaluatedTime <p>
     *            The date and time, in ISO 8601 format, when Amazon Pinpoint
     *            last evaluated the journey and updated the data for the
     *            metric.
     *            </p>
     */
    public void setLastEvaluatedTime(String lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint last
     * evaluated the journey and updated the data for the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastEvaluatedTime <p>
     *            The date and time, in ISO 8601 format, when Amazon Pinpoint
     *            last evaluated the journey and updated the data for the
     *            metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneyExecutionMetricsResponse withLastEvaluatedTime(String lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
        return this;
    }

    /**
     * <p>
     * A JSON object that contains the results of the query. For information
     * about the structure and contents of the results, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         A JSON object that contains the results of the query. For
     *         information about the structure and contents of the results, see
     *         the <a href=
     *         "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     *         >Amazon Pinpoint Developer Guide</a>.
     *         </p>
     */
    public java.util.Map<String, String> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * A JSON object that contains the results of the query. For information
     * about the structure and contents of the results, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     *
     * @param metrics <p>
     *            A JSON object that contains the results of the query. For
     *            information about the structure and contents of the results,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     *            >Amazon Pinpoint Developer Guide</a>.
     *            </p>
     */
    public void setMetrics(java.util.Map<String, String> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * A JSON object that contains the results of the query. For information
     * about the structure and contents of the results, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            A JSON object that contains the results of the query. For
     *            information about the structure and contents of the results,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     *            >Amazon Pinpoint Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneyExecutionMetricsResponse withMetrics(java.util.Map<String, String> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * <p>
     * A JSON object that contains the results of the query. For information
     * about the structure and contents of the results, see the <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html"
     * >Amazon Pinpoint Developer Guide</a>.
     * </p>
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneyExecutionMetricsResponse addMetricsEntry(String key, String value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, String>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public JourneyExecutionMetricsResponse clearMetricsEntries() {
        this.metrics = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getJourneyId() != null)
            sb.append("JourneyId: " + getJourneyId() + ",");
        if (getLastEvaluatedTime() != null)
            sb.append("LastEvaluatedTime: " + getLastEvaluatedTime() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getJourneyId() == null) ? 0 : getJourneyId().hashCode());
        hashCode = prime * hashCode
                + ((getLastEvaluatedTime() == null) ? 0 : getLastEvaluatedTime().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyExecutionMetricsResponse == false)
            return false;
        JourneyExecutionMetricsResponse other = (JourneyExecutionMetricsResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJourneyId() == null ^ this.getJourneyId() == null)
            return false;
        if (other.getJourneyId() != null
                && other.getJourneyId().equals(this.getJourneyId()) == false)
            return false;
        if (other.getLastEvaluatedTime() == null ^ this.getLastEvaluatedTime() == null)
            return false;
        if (other.getLastEvaluatedTime() != null
                && other.getLastEvaluatedTime().equals(this.getLastEvaluatedTime()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
