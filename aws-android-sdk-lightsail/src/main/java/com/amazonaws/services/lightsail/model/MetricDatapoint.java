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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the metric data point.
 * </p>
 */
public class MetricDatapoint implements Serializable {
    /**
     * <p>
     * The average.
     * </p>
     */
    private Double average;

    /**
     * <p>
     * The maximum.
     * </p>
     */
    private Double maximum;

    /**
     * <p>
     * The minimum.
     * </p>
     */
    private Double minimum;

    /**
     * <p>
     * The sample count.
     * </p>
     */
    private Double sampleCount;

    /**
     * <p>
     * The sum.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     */
    private String unit;

    /**
     * <p>
     * The average.
     * </p>
     *
     * @return <p>
     *         The average.
     *         </p>
     */
    public Double getAverage() {
        return average;
    }

    /**
     * <p>
     * The average.
     * </p>
     *
     * @param average <p>
     *            The average.
     *            </p>
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param average <p>
     *            The average.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDatapoint withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * <p>
     * The maximum.
     * </p>
     *
     * @return <p>
     *         The maximum.
     *         </p>
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * <p>
     * The maximum.
     * </p>
     *
     * @param maximum <p>
     *            The maximum.
     *            </p>
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximum <p>
     *            The maximum.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDatapoint withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * <p>
     * The minimum.
     * </p>
     *
     * @return <p>
     *         The minimum.
     *         </p>
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * <p>
     * The minimum.
     * </p>
     *
     * @param minimum <p>
     *            The minimum.
     *            </p>
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimum <p>
     *            The minimum.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDatapoint withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * <p>
     * The sample count.
     * </p>
     *
     * @return <p>
     *         The sample count.
     *         </p>
     */
    public Double getSampleCount() {
        return sampleCount;
    }

    /**
     * <p>
     * The sample count.
     * </p>
     *
     * @param sampleCount <p>
     *            The sample count.
     *            </p>
     */
    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * <p>
     * The sample count.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleCount <p>
     *            The sample count.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDatapoint withSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }

    /**
     * <p>
     * The sum.
     * </p>
     *
     * @return <p>
     *         The sum.
     *         </p>
     */
    public Double getSum() {
        return sum;
    }

    /**
     * <p>
     * The sum.
     * </p>
     *
     * @param sum <p>
     *            The sum.
     *            </p>
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sum <p>
     *            The sum.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDatapoint withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     *
     * @return <p>
     *         The timestamp (e.g., <code>1479816991.349</code>).
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     *
     * @param timestamp <p>
     *            The timestamp (e.g., <code>1479816991.349</code>).
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp (e.g., <code>1479816991.349</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The timestamp (e.g., <code>1479816991.349</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricDatapoint withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @return <p>
     *         The unit.
     *         </p>
     * @see MetricUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit.
     *            </p>
     * @see MetricUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricUnit
     */
    public MetricDatapoint withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit.
     *            </p>
     * @see MetricUnit
     */
    public void setUnit(MetricUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricUnit
     */
    public MetricDatapoint withUnit(MetricUnit unit) {
        this.unit = unit.toString();
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
        if (getAverage() != null)
            sb.append("average: " + getAverage() + ",");
        if (getMaximum() != null)
            sb.append("maximum: " + getMaximum() + ",");
        if (getMinimum() != null)
            sb.append("minimum: " + getMinimum() + ",");
        if (getSampleCount() != null)
            sb.append("sampleCount: " + getSampleCount() + ",");
        if (getSum() != null)
            sb.append("sum: " + getSum() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode
                + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDatapoint == false)
            return false;
        MetricDatapoint other = (MetricDatapoint) obj;

        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getSampleCount() == null ^ this.getSampleCount() == null)
            return false;
        if (other.getSampleCount() != null
                && other.getSampleCount().equals(this.getSampleCount()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
