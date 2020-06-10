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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Returns the projected utilization metrics of Amazon EC2 instance recommendations.</p>
 */
public class GetEC2RecommendationProjectedMetricsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.</p>
     */
    private String instanceArn;

    /**
     * <p>The statistic of the projected metrics.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     */
    private String stat;

    /**
     * <p>The granularity, in seconds, of the projected metrics data points.</p>
     */
    private Integer period;

    /**
     * <p>The time stamp of the first projected metrics data point to return.</p>
     */
    private java.util.Date startTime;

    /**
     * <p>The time stamp of the last projected metrics data point to return.</p>
     */
    private java.util.Date endTime;

    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.</p>
     *
     * @return <p>The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.</p>
     */
    public String getInstanceArn() {
        return instanceArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.</p>
     *
     * @param instanceArn <p>The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.</p>
     */
    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceArn <p>The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2RecommendationProjectedMetricsRequest withInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
        return this;
    }

    /**
     * <p>The statistic of the projected metrics.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @return <p>The statistic of the projected metrics.</p>
     *
     * @see MetricStatistic
     */
    public String getStat() {
        return stat;
    }

    /**
     * <p>The statistic of the projected metrics.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param stat <p>The statistic of the projected metrics.</p>
     *
     * @see MetricStatistic
     */
    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * <p>The statistic of the projected metrics.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param stat <p>The statistic of the projected metrics.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricStatistic
     */
    public GetEC2RecommendationProjectedMetricsRequest withStat(String stat) {
        this.stat = stat;
        return this;
    }

    /**
     * <p>The statistic of the projected metrics.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param stat <p>The statistic of the projected metrics.</p>
     *
     * @see MetricStatistic
     */
    public void setStat(MetricStatistic stat) {
        this.stat = stat.toString();
    }

    /**
     * <p>The statistic of the projected metrics.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Maximum, Average
     *
     * @param stat <p>The statistic of the projected metrics.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricStatistic
     */
    public GetEC2RecommendationProjectedMetricsRequest withStat(MetricStatistic stat) {
        this.stat = stat.toString();
        return this;
    }

    /**
     * <p>The granularity, in seconds, of the projected metrics data points.</p>
     *
     * @return <p>The granularity, in seconds, of the projected metrics data points.</p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>The granularity, in seconds, of the projected metrics data points.</p>
     *
     * @param period <p>The granularity, in seconds, of the projected metrics data points.</p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>The granularity, in seconds, of the projected metrics data points.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param period <p>The granularity, in seconds, of the projected metrics data points.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2RecommendationProjectedMetricsRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * <p>The time stamp of the first projected metrics data point to return.</p>
     *
     * @return <p>The time stamp of the first projected metrics data point to return.</p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>The time stamp of the first projected metrics data point to return.</p>
     *
     * @param startTime <p>The time stamp of the first projected metrics data point to return.</p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>The time stamp of the first projected metrics data point to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime <p>The time stamp of the first projected metrics data point to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2RecommendationProjectedMetricsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>The time stamp of the last projected metrics data point to return.</p>
     *
     * @return <p>The time stamp of the last projected metrics data point to return.</p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>The time stamp of the last projected metrics data point to return.</p>
     *
     * @param endTime <p>The time stamp of the last projected metrics data point to return.</p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>The time stamp of the last projected metrics data point to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime <p>The time stamp of the last projected metrics data point to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEC2RecommendationProjectedMetricsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceArn() != null) sb.append("instanceArn: " + getInstanceArn() + ",");
        if (getStat() != null) sb.append("stat: " + getStat() + ",");
        if (getPeriod() != null) sb.append("period: " + getPeriod() + ",");
        if (getStartTime() != null) sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("endTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getStat() == null) ? 0 : getStat().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEC2RecommendationProjectedMetricsRequest == false) return false;
        GetEC2RecommendationProjectedMetricsRequest other = (GetEC2RecommendationProjectedMetricsRequest)obj;

        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null) return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false) return false;
        if (other.getStat() == null ^ this.getStat() == null) return false;
        if (other.getStat() != null && other.getStat().equals(this.getStat()) == false) return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null) return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false) return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false;
        return true;
    }
}
