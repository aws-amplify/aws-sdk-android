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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The aggregated value for a metric.
 * </p>
 */
public class MetricValue implements Serializable {
    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     */
    private String amount;

    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     *
     * @return <p>
     *         The actual number that represents the metric.
     *         </p>
     */
    public String getAmount() {
        return amount;
    }

    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     *
     * @param amount <p>
     *            The actual number that represents the metric.
     *            </p>
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The actual number that represents the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amount <p>
     *            The actual number that represents the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricValue withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     *
     * @return <p>
     *         The unit that the metric is given in.
     *         </p>
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     *
     * @param unit <p>
     *            The unit that the metric is given in.
     *            </p>
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit that the metric is given in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unit <p>
     *            The unit that the metric is given in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricValue withUnit(String unit) {
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
        if (getAmount() != null)
            sb.append("Amount: " + getAmount() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricValue == false)
            return false;
        MetricValue other = (MetricValue) obj;

        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
