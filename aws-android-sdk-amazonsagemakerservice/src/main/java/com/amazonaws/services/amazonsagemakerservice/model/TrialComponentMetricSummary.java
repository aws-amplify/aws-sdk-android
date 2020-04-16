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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of the metrics of a trial component.
 * </p>
 */
public class TrialComponentMetricSummary implements Serializable {
    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String metricName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     */
    private String sourceArn;

    /**
     * <p>
     * When the metric was last updated.
     * </p>
     */
    private java.util.Date timeStamp;

    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     */
    private Double max;

    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     */
    private Double min;

    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     */
    private Double last;

    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The average value of the metric.
     * </p>
     */
    private Double avg;

    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     */
    private Double stdDev;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The name of the metric.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param metricName <p>
     *            The name of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the source.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:.*<br/>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * When the metric was last updated.
     * </p>
     *
     * @return <p>
     *         When the metric was last updated.
     *         </p>
     */
    public java.util.Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * <p>
     * When the metric was last updated.
     * </p>
     *
     * @param timeStamp <p>
     *            When the metric was last updated.
     *            </p>
     */
    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * <p>
     * When the metric was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeStamp <p>
     *            When the metric was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     *
     * @return <p>
     *         The maximum value of the metric.
     *         </p>
     */
    public Double getMax() {
        return max;
    }

    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     *
     * @param max <p>
     *            The maximum value of the metric.
     *            </p>
     */
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param max <p>
     *            The maximum value of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withMax(Double max) {
        this.max = max;
        return this;
    }

    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     *
     * @return <p>
     *         The minimum value of the metric.
     *         </p>
     */
    public Double getMin() {
        return min;
    }

    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     *
     * @param min <p>
     *            The minimum value of the metric.
     *            </p>
     */
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum value of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param min <p>
     *            The minimum value of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withMin(Double min) {
        this.min = min;
        return this;
    }

    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     *
     * @return <p>
     *         The most recent value of the metric.
     *         </p>
     */
    public Double getLast() {
        return last;
    }

    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     *
     * @param last <p>
     *            The most recent value of the metric.
     *            </p>
     */
    public void setLast(Double last) {
        this.last = last;
    }

    /**
     * <p>
     * The most recent value of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param last <p>
     *            The most recent value of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withLast(Double last) {
        this.last = last;
        return this;
    }

    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     *
     * @return <p>
     *         The number of samples used to generate the metric.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     *
     * @param count <p>
     *            The number of samples used to generate the metric.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of samples used to generate the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of samples used to generate the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The average value of the metric.
     * </p>
     *
     * @return <p>
     *         The average value of the metric.
     *         </p>
     */
    public Double getAvg() {
        return avg;
    }

    /**
     * <p>
     * The average value of the metric.
     * </p>
     *
     * @param avg <p>
     *            The average value of the metric.
     *            </p>
     */
    public void setAvg(Double avg) {
        this.avg = avg;
    }

    /**
     * <p>
     * The average value of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param avg <p>
     *            The average value of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withAvg(Double avg) {
        this.avg = avg;
        return this;
    }

    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     *
     * @return <p>
     *         The standard deviation of the metric.
     *         </p>
     */
    public Double getStdDev() {
        return stdDev;
    }

    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     *
     * @param stdDev <p>
     *            The standard deviation of the metric.
     *            </p>
     */
    public void setStdDev(Double stdDev) {
        this.stdDev = stdDev;
    }

    /**
     * <p>
     * The standard deviation of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stdDev <p>
     *            The standard deviation of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentMetricSummary withStdDev(Double stdDev) {
        this.stdDev = stdDev;
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
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getTimeStamp() != null)
            sb.append("TimeStamp: " + getTimeStamp() + ",");
        if (getMax() != null)
            sb.append("Max: " + getMax() + ",");
        if (getMin() != null)
            sb.append("Min: " + getMin() + ",");
        if (getLast() != null)
            sb.append("Last: " + getLast() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getAvg() != null)
            sb.append("Avg: " + getAvg() + ",");
        if (getStdDev() != null)
            sb.append("StdDev: " + getStdDev());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getTimeStamp() == null) ? 0 : getTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getAvg() == null) ? 0 : getAvg().hashCode());
        hashCode = prime * hashCode + ((getStdDev() == null) ? 0 : getStdDev().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentMetricSummary == false)
            return false;
        TrialComponentMetricSummary other = (TrialComponentMetricSummary) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getTimeStamp() == null ^ this.getTimeStamp() == null)
            return false;
        if (other.getTimeStamp() != null
                && other.getTimeStamp().equals(this.getTimeStamp()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        if (other.getLast() == null ^ this.getLast() == null)
            return false;
        if (other.getLast() != null && other.getLast().equals(this.getLast()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getAvg() == null ^ this.getAvg() == null)
            return false;
        if (other.getAvg() != null && other.getAvg().equals(this.getAvg()) == false)
            return false;
        if (other.getStdDev() == null ^ this.getStdDev() == null)
            return false;
        if (other.getStdDev() != null && other.getStdDev().equals(this.getStdDev()) == false)
            return false;
        return true;
    }
}
