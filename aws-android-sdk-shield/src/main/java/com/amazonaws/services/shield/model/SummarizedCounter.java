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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * The counter that describes a DDoS attack.
 * </p>
 */
public class SummarizedCounter implements Serializable {
    /**
     * <p>
     * The counter name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     */
    private Double max;

    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     */
    private Double average;

    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     */
    private Double sum;

    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     */
    private Integer n;

    /**
     * <p>
     * The unit of the counters.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The counter name.
     * </p>
     *
     * @return <p>
     *         The counter name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The counter name.
     * </p>
     *
     * @param name <p>
     *            The counter name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The counter name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The counter name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedCounter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     *
     * @return <p>
     *         The maximum value of the counter for a specified time period.
     *         </p>
     */
    public Double getMax() {
        return max;
    }

    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     *
     * @param max <p>
     *            The maximum value of the counter for a specified time period.
     *            </p>
     */
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value of the counter for a specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param max <p>
     *            The maximum value of the counter for a specified time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedCounter withMax(Double max) {
        this.max = max;
        return this;
    }

    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     *
     * @return <p>
     *         The average value of the counter for a specified time period.
     *         </p>
     */
    public Double getAverage() {
        return average;
    }

    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     *
     * @param average <p>
     *            The average value of the counter for a specified time period.
     *            </p>
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average value of the counter for a specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param average <p>
     *            The average value of the counter for a specified time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedCounter withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     *
     * @return <p>
     *         The total of counter values for a specified time period.
     *         </p>
     */
    public Double getSum() {
        return sum;
    }

    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     *
     * @param sum <p>
     *            The total of counter values for a specified time period.
     *            </p>
     */
    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The total of counter values for a specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sum <p>
     *            The total of counter values for a specified time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedCounter withSum(Double sum) {
        this.sum = sum;
        return this;
    }

    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     *
     * @return <p>
     *         The number of counters for a specified time period.
     *         </p>
     */
    public Integer getN() {
        return n;
    }

    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     *
     * @param n <p>
     *            The number of counters for a specified time period.
     *            </p>
     */
    public void setN(Integer n) {
        this.n = n;
    }

    /**
     * <p>
     * The number of counters for a specified time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param n <p>
     *            The number of counters for a specified time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedCounter withN(Integer n) {
        this.n = n;
        return this;
    }

    /**
     * <p>
     * The unit of the counters.
     * </p>
     *
     * @return <p>
     *         The unit of the counters.
     *         </p>
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of the counters.
     * </p>
     *
     * @param unit <p>
     *            The unit of the counters.
     *            </p>
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the counters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unit <p>
     *            The unit of the counters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedCounter withUnit(String unit) {
        this.unit = unit;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMax() != null)
            sb.append("Max: " + getMax() + ",");
        if (getAverage() != null)
            sb.append("Average: " + getAverage() + ",");
        if (getSum() != null)
            sb.append("Sum: " + getSum() + ",");
        if (getN() != null)
            sb.append("N: " + getN() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getN() == null) ? 0 : getN().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SummarizedCounter == false)
            return false;
        SummarizedCounter other = (SummarizedCounter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getN() == null ^ this.getN() == null)
            return false;
        if (other.getN() != null && other.getN().equals(this.getN()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
