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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * A statistical ranking (percentile) that indicates a threshold value by which
 * a behavior is determined to be in compliance or in violation of the behavior.
 * </p>
 */
public class StatisticalThreshold implements Serializable {
    /**
     * <p>
     * The percentile that resolves to a threshold value by which compliance
     * with a behavior is determined. Metrics are collected over the specified
     * period (<code>durationSeconds</code>) from all reporting devices in your
     * account and statistical ranks are calculated. Then, the measurements from
     * a device are collected over the same period. If the accumulated
     * measurements from the device fall above or below (
     * <code>comparisonOperator</code>) the value associated with the percentile
     * specified, then the device is considered to be in compliance with the
     * behavior, otherwise a violation occurs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(p0|p0\.1|p0\.01|p1|p10|p50|p90|p99|p99\.9|p99\.99|p100)
     * <br/>
     */
    private String statistic;

    /**
     * <p>
     * The percentile that resolves to a threshold value by which compliance
     * with a behavior is determined. Metrics are collected over the specified
     * period (<code>durationSeconds</code>) from all reporting devices in your
     * account and statistical ranks are calculated. Then, the measurements from
     * a device are collected over the same period. If the accumulated
     * measurements from the device fall above or below (
     * <code>comparisonOperator</code>) the value associated with the percentile
     * specified, then the device is considered to be in compliance with the
     * behavior, otherwise a violation occurs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(p0|p0\.1|p0\.01|p1|p10|p50|p90|p99|p99\.9|p99\.99|p100)
     * <br/>
     *
     * @return <p>
     *         The percentile that resolves to a threshold value by which
     *         compliance with a behavior is determined. Metrics are collected
     *         over the specified period (<code>durationSeconds</code>) from all
     *         reporting devices in your account and statistical ranks are
     *         calculated. Then, the measurements from a device are collected
     *         over the same period. If the accumulated measurements from the
     *         device fall above or below (<code>comparisonOperator</code>) the
     *         value associated with the percentile specified, then the device
     *         is considered to be in compliance with the behavior, otherwise a
     *         violation occurs.
     *         </p>
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * <p>
     * The percentile that resolves to a threshold value by which compliance
     * with a behavior is determined. Metrics are collected over the specified
     * period (<code>durationSeconds</code>) from all reporting devices in your
     * account and statistical ranks are calculated. Then, the measurements from
     * a device are collected over the same period. If the accumulated
     * measurements from the device fall above or below (
     * <code>comparisonOperator</code>) the value associated with the percentile
     * specified, then the device is considered to be in compliance with the
     * behavior, otherwise a violation occurs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(p0|p0\.1|p0\.01|p1|p10|p50|p90|p99|p99\.9|p99\.99|p100)
     * <br/>
     *
     * @param statistic <p>
     *            The percentile that resolves to a threshold value by which
     *            compliance with a behavior is determined. Metrics are
     *            collected over the specified period (
     *            <code>durationSeconds</code>) from all reporting devices in
     *            your account and statistical ranks are calculated. Then, the
     *            measurements from a device are collected over the same period.
     *            If the accumulated measurements from the device fall above or
     *            below (<code>comparisonOperator</code>) the value associated
     *            with the percentile specified, then the device is considered
     *            to be in compliance with the behavior, otherwise a violation
     *            occurs.
     *            </p>
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The percentile that resolves to a threshold value by which compliance
     * with a behavior is determined. Metrics are collected over the specified
     * period (<code>durationSeconds</code>) from all reporting devices in your
     * account and statistical ranks are calculated. Then, the measurements from
     * a device are collected over the same period. If the accumulated
     * measurements from the device fall above or below (
     * <code>comparisonOperator</code>) the value associated with the percentile
     * specified, then the device is considered to be in compliance with the
     * behavior, otherwise a violation occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(p0|p0\.1|p0\.01|p1|p10|p50|p90|p99|p99\.9|p99\.99|p100)
     * <br/>
     *
     * @param statistic <p>
     *            The percentile that resolves to a threshold value by which
     *            compliance with a behavior is determined. Metrics are
     *            collected over the specified period (
     *            <code>durationSeconds</code>) from all reporting devices in
     *            your account and statistical ranks are calculated. Then, the
     *            measurements from a device are collected over the same period.
     *            If the accumulated measurements from the device fall above or
     *            below (<code>comparisonOperator</code>) the value associated
     *            with the percentile specified, then the device is considered
     *            to be in compliance with the behavior, otherwise a violation
     *            occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StatisticalThreshold withStatistic(String statistic) {
        this.statistic = statistic;
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
        if (getStatistic() != null)
            sb.append("statistic: " + getStatistic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatisticalThreshold == false)
            return false;
        StatisticalThreshold other = (StatisticalThreshold) obj;

        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        return true;
    }
}
