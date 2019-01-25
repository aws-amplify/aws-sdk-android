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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>Datapoint</code> data type encapsulates the statistical data that
 * Amazon CloudWatch computes from metric data.
 * </p>
 */
public class Datapoint implements Serializable {
    /**
     * <p>
     * The time stamp used for the datapoint.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of
     * this datapoint.
     * </p>
     */
    private Double sampleCount;

    /**
     * <p>
     * The average of metric values that correspond to the datapoint.
     * </p>
     */
    private Double average;

    /**
     * <p>
     * The sum of metric values used for the datapoint.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * The minimum metric value used for the datapoint.
     * </p>
     */
    private Double minimum;

    /**
     * <p>
     * The maximum of the metric value used for the datapoint.
     * </p>
     */
    private Double maximum;

    /**
     * <p>
     * The standard unit used for the datapoint.
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
     * The time stamp used for the datapoint.
     * </p>
     *
     * @return <p>
     *         The time stamp used for the datapoint.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time stamp used for the datapoint.
     * </p>
     *
     * @param timestamp <p>
     *            The time stamp used for the datapoint.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp used for the datapoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time stamp used for the datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Datapoint withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of
     * this datapoint.
     * </p>
     *
     * @return <p>
     *         The number of metric values that contributed to the aggregate
     *         value of this datapoint.
     *         </p>
     */
    public Double getSampleCount() {
        return sampleCount;
    }

    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of
     * this datapoint.
     * </p>
     *
     * @param sampleCount <p>
     *            The number of metric values that contributed to the aggregate
     *            value of this datapoint.
     *            </p>
     */
    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of
     * this datapoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleCount <p>
     *            The number of metric values that contributed to the aggregate
     *            value of this datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Datapoint withSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }

    /**
     * <p>
     * The average of metric values that correspond to the datapoint.
     * </p>
     *
     * @return <p>
     *         The average of metric values that correspond to the datapoint.
     *         </p>
     */
    public Double getAverage() {
        return average;
    }

    /**
     * <p>
     * The average of metric values that correspond to the datapoint.
     * </p>
     *
     * @param average <p>
     *            The average of metric values that correspond to the datapoint.
     *            </p>
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average of metric values that correspond to the datapoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param average <p>
     *            The average of metric values that correspond to the datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Datapoint withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * <p>
     * The sum of metric values used for the datapoint.
     * </p>
     *
     * @return <p>
     *         The sum of metric values used for the datapoint.
     *         </p>
     */
    public Double getSum() {
        return sum;
    }

    /**
     * <p>
     * The sum of metric values used for the datapoint.
     * </p>
     *
     * @param sum <p>
     *            The sum of metric values used for the datapoint.
     *            </p>
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of metric values used for the datapoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sum <p>
     *            The sum of metric values used for the datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Datapoint withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * <p>
     * The minimum metric value used for the datapoint.
     * </p>
     *
     * @return <p>
     *         The minimum metric value used for the datapoint.
     *         </p>
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * <p>
     * The minimum metric value used for the datapoint.
     * </p>
     *
     * @param minimum <p>
     *            The minimum metric value used for the datapoint.
     *            </p>
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum metric value used for the datapoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimum <p>
     *            The minimum metric value used for the datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Datapoint withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * <p>
     * The maximum of the metric value used for the datapoint.
     * </p>
     *
     * @return <p>
     *         The maximum of the metric value used for the datapoint.
     *         </p>
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * <p>
     * The maximum of the metric value used for the datapoint.
     * </p>
     *
     * @param maximum <p>
     *            The maximum of the metric value used for the datapoint.
     *            </p>
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum of the metric value used for the datapoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximum <p>
     *            The maximum of the metric value used for the datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Datapoint withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * <p>
     * The standard unit used for the datapoint.
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
     *         The standard unit used for the datapoint.
     *         </p>
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The standard unit used for the datapoint.
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
     *            The standard unit used for the datapoint.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The standard unit used for the datapoint.
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
     *            The standard unit used for the datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public Datapoint withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The standard unit used for the datapoint.
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
     *            The standard unit used for the datapoint.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The standard unit used for the datapoint.
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
     *            The standard unit used for the datapoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public Datapoint withUnit(StandardUnit unit) {
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getSampleCount() != null)
            sb.append("SampleCount: " + getSampleCount() + ",");
        if (getAverage() != null)
            sb.append("Average: " + getAverage() + ",");
        if (getSum() != null)
            sb.append("Sum: " + getSum() + ",");
        if (getMinimum() != null)
            sb.append("Minimum: " + getMinimum() + ",");
        if (getMaximum() != null)
            sb.append("Maximum: " + getMaximum() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode());
        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Datapoint == false)
            return false;
        Datapoint other = (Datapoint) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getSampleCount() == null ^ this.getSampleCount() == null)
            return false;
        if (other.getSampleCount() != null
                && other.getSampleCount().equals(this.getSampleCount()) == false)
            return false;
        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
