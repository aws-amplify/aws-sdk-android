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

public class GetSavingsPlansUtilizationResult implements Serializable {
    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows
     * you to specify date ranges.
     * </p>
     */
    private java.util.List<SavingsPlansUtilizationByTime> savingsPlansUtilizationsByTime;

    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans,
     * regardless of date ranges.
     * </p>
     */
    private SavingsPlansUtilizationAggregates total;

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows
     * you to specify date ranges.
     * </p>
     *
     * @return <p>
     *         The amount of cost/commitment you used your Savings Plans. This
     *         allows you to specify date ranges.
     *         </p>
     */
    public java.util.List<SavingsPlansUtilizationByTime> getSavingsPlansUtilizationsByTime() {
        return savingsPlansUtilizationsByTime;
    }

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows
     * you to specify date ranges.
     * </p>
     *
     * @param savingsPlansUtilizationsByTime <p>
     *            The amount of cost/commitment you used your Savings Plans.
     *            This allows you to specify date ranges.
     *            </p>
     */
    public void setSavingsPlansUtilizationsByTime(
            java.util.Collection<SavingsPlansUtilizationByTime> savingsPlansUtilizationsByTime) {
        if (savingsPlansUtilizationsByTime == null) {
            this.savingsPlansUtilizationsByTime = null;
            return;
        }

        this.savingsPlansUtilizationsByTime = new java.util.ArrayList<SavingsPlansUtilizationByTime>(
                savingsPlansUtilizationsByTime);
    }

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows
     * you to specify date ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansUtilizationsByTime <p>
     *            The amount of cost/commitment you used your Savings Plans.
     *            This allows you to specify date ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationResult withSavingsPlansUtilizationsByTime(
            SavingsPlansUtilizationByTime... savingsPlansUtilizationsByTime) {
        if (getSavingsPlansUtilizationsByTime() == null) {
            this.savingsPlansUtilizationsByTime = new java.util.ArrayList<SavingsPlansUtilizationByTime>(
                    savingsPlansUtilizationsByTime.length);
        }
        for (SavingsPlansUtilizationByTime value : savingsPlansUtilizationsByTime) {
            this.savingsPlansUtilizationsByTime.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The amount of cost/commitment you used your Savings Plans. This allows
     * you to specify date ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansUtilizationsByTime <p>
     *            The amount of cost/commitment you used your Savings Plans.
     *            This allows you to specify date ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationResult withSavingsPlansUtilizationsByTime(
            java.util.Collection<SavingsPlansUtilizationByTime> savingsPlansUtilizationsByTime) {
        setSavingsPlansUtilizationsByTime(savingsPlansUtilizationsByTime);
        return this;
    }

    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans,
     * regardless of date ranges.
     * </p>
     *
     * @return <p>
     *         The total amount of cost/commitment that you used your Savings
     *         Plans, regardless of date ranges.
     *         </p>
     */
    public SavingsPlansUtilizationAggregates getTotal() {
        return total;
    }

    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans,
     * regardless of date ranges.
     * </p>
     *
     * @param total <p>
     *            The total amount of cost/commitment that you used your Savings
     *            Plans, regardless of date ranges.
     *            </p>
     */
    public void setTotal(SavingsPlansUtilizationAggregates total) {
        this.total = total;
    }

    /**
     * <p>
     * The total amount of cost/commitment that you used your Savings Plans,
     * regardless of date ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The total amount of cost/commitment that you used your Savings
     *            Plans, regardless of date ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansUtilizationResult withTotal(SavingsPlansUtilizationAggregates total) {
        this.total = total;
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
        if (getSavingsPlansUtilizationsByTime() != null)
            sb.append("SavingsPlansUtilizationsByTime: " + getSavingsPlansUtilizationsByTime()
                    + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSavingsPlansUtilizationsByTime() == null) ? 0
                        : getSavingsPlansUtilizationsByTime().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansUtilizationResult == false)
            return false;
        GetSavingsPlansUtilizationResult other = (GetSavingsPlansUtilizationResult) obj;

        if (other.getSavingsPlansUtilizationsByTime() == null
                ^ this.getSavingsPlansUtilizationsByTime() == null)
            return false;
        if (other.getSavingsPlansUtilizationsByTime() != null
                && other.getSavingsPlansUtilizationsByTime().equals(
                        this.getSavingsPlansUtilizationsByTime()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }
}
