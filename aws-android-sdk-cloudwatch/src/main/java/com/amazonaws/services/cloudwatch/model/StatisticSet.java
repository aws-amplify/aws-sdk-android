/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The <code>StatisticSet</code> data type describes the
 * <code>StatisticValues</code> component of <a>MetricDatum</a>, and represents
 * a set of statistics that describes a specific metric.
 * </p>
 */
public class StatisticSet implements Serializable {
    /**
     * <p>
     * The number of samples used for the statistic set.
     * </p>
     */
    private Double sampleCount;

    /**
     * <p>
     * The sum of values for the sample set.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * The minimum value of the sample set.
     * </p>
     */
    private Double minimum;

    /**
     * <p>
     * The maximum value of the sample set.
     * </p>
     */
    private Double maximum;

    /**
     * <p>
     * The number of samples used for the statistic set.
     * </p>
     *
     * @return <p>
     *         The number of samples used for the statistic set.
     *         </p>
     */
    public Double getSampleCount() {
        return sampleCount;
    }

    /**
     * <p>
     * The number of samples used for the statistic set.
     * </p>
     *
     * @param sampleCount <p>
     *            The number of samples used for the statistic set.
     *            </p>
     */
    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * <p>
     * The number of samples used for the statistic set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleCount <p>
     *            The number of samples used for the statistic set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StatisticSet withSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }

    /**
     * <p>
     * The sum of values for the sample set.
     * </p>
     *
     * @return <p>
     *         The sum of values for the sample set.
     *         </p>
     */
    public Double getSum() {
        return sum;
    }

    /**
     * <p>
     * The sum of values for the sample set.
     * </p>
     *
     * @param sum <p>
     *            The sum of values for the sample set.
     *            </p>
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of values for the sample set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sum <p>
     *            The sum of values for the sample set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StatisticSet withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * <p>
     * The minimum value of the sample set.
     * </p>
     *
     * @return <p>
     *         The minimum value of the sample set.
     *         </p>
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * <p>
     * The minimum value of the sample set.
     * </p>
     *
     * @param minimum <p>
     *            The minimum value of the sample set.
     *            </p>
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value of the sample set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimum <p>
     *            The minimum value of the sample set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StatisticSet withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * <p>
     * The maximum value of the sample set.
     * </p>
     *
     * @return <p>
     *         The maximum value of the sample set.
     *         </p>
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * <p>
     * The maximum value of the sample set.
     * </p>
     *
     * @param maximum <p>
     *            The maximum value of the sample set.
     *            </p>
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value of the sample set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximum <p>
     *            The maximum value of the sample set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StatisticSet withMaximum(Double maximum) {
        this.maximum = maximum;
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
        if (getSampleCount() != null)
            sb.append("SampleCount: " + getSampleCount() + ",");
        if (getSum() != null)
            sb.append("Sum: " + getSum() + ",");
        if (getMinimum() != null)
            sb.append("Minimum: " + getMinimum() + ",");
        if (getMaximum() != null)
            sb.append("Maximum: " + getMaximum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatisticSet == false)
            return false;
        StatisticSet other = (StatisticSet) obj;

        if (other.getSampleCount() == null ^ this.getSampleCount() == null)
            return false;
        if (other.getSampleCount() != null
                && other.getSampleCount().equals(this.getSampleCount()) == false)
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
        return true;
    }
}
