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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the (pre-calculated) aggregate values for an asset property.
 * </p>
 */
public class Aggregates implements Serializable {
    /**
     * <p>
     * The average (mean) value of the time series for the last time interval
     * window.
     * </p>
     */
    private Double average;

    /**
     * <p>
     * The count of data points in the time series for the last time interval
     * window.
     * </p>
     */
    private Double count;

    /**
     * <p>
     * The maximum value of the time series for the last time interval window.
     * </p>
     */
    private Double maximum;

    /**
     * <p>
     * The minimum value of the time series for the last time interval window.
     * </p>
     */
    private Double minimum;

    /**
     * <p>
     * The sum of the time series for the last time interval window.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * The average (mean) value of the time series for the last time interval
     * window.
     * </p>
     *
     * @return <p>
     *         The average (mean) value of the time series for the last time
     *         interval window.
     *         </p>
     */
    public Double getAverage() {
        return average;
    }

    /**
     * <p>
     * The average (mean) value of the time series for the last time interval
     * window.
     * </p>
     *
     * @param average <p>
     *            The average (mean) value of the time series for the last time
     *            interval window.
     *            </p>
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average (mean) value of the time series for the last time interval
     * window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param average <p>
     *            The average (mean) value of the time series for the last time
     *            interval window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Aggregates withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * <p>
     * The count of data points in the time series for the last time interval
     * window.
     * </p>
     *
     * @return <p>
     *         The count of data points in the time series for the last time
     *         interval window.
     *         </p>
     */
    public Double getCount() {
        return count;
    }

    /**
     * <p>
     * The count of data points in the time series for the last time interval
     * window.
     * </p>
     *
     * @param count <p>
     *            The count of data points in the time series for the last time
     *            interval window.
     *            </p>
     */
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * <p>
     * The count of data points in the time series for the last time interval
     * window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The count of data points in the time series for the last time
     *            interval window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Aggregates withCount(Double count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The maximum value of the time series for the last time interval window.
     * </p>
     *
     * @return <p>
     *         The maximum value of the time series for the last time interval
     *         window.
     *         </p>
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * <p>
     * The maximum value of the time series for the last time interval window.
     * </p>
     *
     * @param maximum <p>
     *            The maximum value of the time series for the last time
     *            interval window.
     *            </p>
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value of the time series for the last time interval window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximum <p>
     *            The maximum value of the time series for the last time
     *            interval window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Aggregates withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * <p>
     * The minimum value of the time series for the last time interval window.
     * </p>
     *
     * @return <p>
     *         The minimum value of the time series for the last time interval
     *         window.
     *         </p>
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * <p>
     * The minimum value of the time series for the last time interval window.
     * </p>
     *
     * @param minimum <p>
     *            The minimum value of the time series for the last time
     *            interval window.
     *            </p>
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value of the time series for the last time interval window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimum <p>
     *            The minimum value of the time series for the last time
     *            interval window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Aggregates withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * <p>
     * The sum of the time series for the last time interval window.
     * </p>
     *
     * @return <p>
     *         The sum of the time series for the last time interval window.
     *         </p>
     */
    public Double getSum() {
        return sum;
    }

    /**
     * <p>
     * The sum of the time series for the last time interval window.
     * </p>
     *
     * @param sum <p>
     *            The sum of the time series for the last time interval window.
     *            </p>
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the time series for the last time interval window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sum <p>
     *            The sum of the time series for the last time interval window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Aggregates withSum(Double sum) {
        this.sum = sum;
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
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getMaximum() != null)
            sb.append("maximum: " + getMaximum() + ",");
        if (getMinimum() != null)
            sb.append("minimum: " + getMinimum() + ",");
        if (getSum() != null)
            sb.append("sum: " + getSum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Aggregates == false)
            return false;
        Aggregates other = (Aggregates) obj;

        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        return true;
    }
}
