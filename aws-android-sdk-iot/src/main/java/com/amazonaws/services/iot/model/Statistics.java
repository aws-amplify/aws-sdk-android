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
 * A map of key-value pairs for all supported statistics. Currently, only count
 * is supported.
 * </p>
 */
public class Statistics implements Serializable {
    /**
     * <p>
     * The count of things that match the query.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     */
    private Double average;

    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     */
    private Double minimum;

    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     */
    private Double maximum;

    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     */
    private Double sumOfSquares;

    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     */
    private Double variance;

    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     */
    private Double stdDeviation;

    /**
     * <p>
     * The count of things that match the query.
     * </p>
     *
     * @return <p>
     *         The count of things that match the query.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The count of things that match the query.
     * </p>
     *
     * @param count <p>
     *            The count of things that match the query.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The count of things that match the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The count of things that match the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     *
     * @return <p>
     *         The average of the aggregated field values.
     *         </p>
     */
    public Double getAverage() {
        return average;
    }

    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     *
     * @param average <p>
     *            The average of the aggregated field values.
     *            </p>
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param average <p>
     *            The average of the aggregated field values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     *
     * @return <p>
     *         The sum of the aggregated field values.
     *         </p>
     */
    public Double getSum() {
        return sum;
    }

    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     *
     * @param sum <p>
     *            The sum of the aggregated field values.
     *            </p>
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sum <p>
     *            The sum of the aggregated field values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     *
     * @return <p>
     *         The minimum aggregated field value.
     *         </p>
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     *
     * @param minimum <p>
     *            The minimum aggregated field value.
     *            </p>
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimum <p>
     *            The minimum aggregated field value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     *
     * @return <p>
     *         The maximum aggregated field value.
     *         </p>
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     *
     * @param maximum <p>
     *            The maximum aggregated field value.
     *            </p>
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximum <p>
     *            The maximum aggregated field value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     *
     * @return <p>
     *         The sum of the squares of the aggregated field values.
     *         </p>
     */
    public Double getSumOfSquares() {
        return sumOfSquares;
    }

    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     *
     * @param sumOfSquares <p>
     *            The sum of the squares of the aggregated field values.
     *            </p>
     */
    public void setSumOfSquares(Double sumOfSquares) {
        this.sumOfSquares = sumOfSquares;
    }

    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sumOfSquares <p>
     *            The sum of the squares of the aggregated field values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withSumOfSquares(Double sumOfSquares) {
        this.sumOfSquares = sumOfSquares;
        return this;
    }

    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     *
     * @return <p>
     *         The variance of the aggregated field values.
     *         </p>
     */
    public Double getVariance() {
        return variance;
    }

    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     *
     * @param variance <p>
     *            The variance of the aggregated field values.
     *            </p>
     */
    public void setVariance(Double variance) {
        this.variance = variance;
    }

    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variance <p>
     *            The variance of the aggregated field values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withVariance(Double variance) {
        this.variance = variance;
        return this;
    }

    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     *
     * @return <p>
     *         The standard deviation of the aggregated field values.
     *         </p>
     */
    public Double getStdDeviation() {
        return stdDeviation;
    }

    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     *
     * @param stdDeviation <p>
     *            The standard deviation of the aggregated field values.
     *            </p>
     */
    public void setStdDeviation(Double stdDeviation) {
        this.stdDeviation = stdDeviation;
    }

    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stdDeviation <p>
     *            The standard deviation of the aggregated field values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statistics withStdDeviation(Double stdDeviation) {
        this.stdDeviation = stdDeviation;
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
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getAverage() != null)
            sb.append("average: " + getAverage() + ",");
        if (getSum() != null)
            sb.append("sum: " + getSum() + ",");
        if (getMinimum() != null)
            sb.append("minimum: " + getMinimum() + ",");
        if (getMaximum() != null)
            sb.append("maximum: " + getMaximum() + ",");
        if (getSumOfSquares() != null)
            sb.append("sumOfSquares: " + getSumOfSquares() + ",");
        if (getVariance() != null)
            sb.append("variance: " + getVariance() + ",");
        if (getStdDeviation() != null)
            sb.append("stdDeviation: " + getStdDeviation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode
                + ((getSumOfSquares() == null) ? 0 : getSumOfSquares().hashCode());
        hashCode = prime * hashCode + ((getVariance() == null) ? 0 : getVariance().hashCode());
        hashCode = prime * hashCode
                + ((getStdDeviation() == null) ? 0 : getStdDeviation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statistics == false)
            return false;
        Statistics other = (Statistics) obj;

        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
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
        if (other.getSumOfSquares() == null ^ this.getSumOfSquares() == null)
            return false;
        if (other.getSumOfSquares() != null
                && other.getSumOfSquares().equals(this.getSumOfSquares()) == false)
            return false;
        if (other.getVariance() == null ^ this.getVariance() == null)
            return false;
        if (other.getVariance() != null && other.getVariance().equals(this.getVariance()) == false)
            return false;
        if (other.getStdDeviation() == null ^ this.getStdDeviation() == null)
            return false;
        if (other.getStdDeviation() != null
                && other.getStdDeviation().equals(this.getStdDeviation()) == false)
            return false;
        return true;
    }
}
