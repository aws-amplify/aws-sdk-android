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
 * The amount of Savings Plans utilization, in hours.
 * </p>
 */
public class SavingsPlansUtilizationByTime implements Serializable {
    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to
     * workloads that are Savings Plans eligible.
     * </p>
     */
    private SavingsPlansUtilization utilization;

    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both
     * net savings from Savings Plans as well as the
     * <code>onDemandCostEquivalent</code> of the Savings Plans when considering
     * the utilization rate.
     * </p>
     */
    private SavingsPlansSavings savings;

    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum
     * of the upfront and recurring Savings Plans fees.
     * </p>
     */
    private SavingsPlansAmortizedCommitment amortizedCommitment;

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     *
     * @return <p>
     *         The time period that you want the usage and costs for.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilizationByTime withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to
     * workloads that are Savings Plans eligible.
     * </p>
     *
     * @return <p>
     *         A ratio of your effectiveness of using existing Savings Plans to
     *         apply to workloads that are Savings Plans eligible.
     *         </p>
     */
    public SavingsPlansUtilization getUtilization() {
        return utilization;
    }

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to
     * workloads that are Savings Plans eligible.
     * </p>
     *
     * @param utilization <p>
     *            A ratio of your effectiveness of using existing Savings Plans
     *            to apply to workloads that are Savings Plans eligible.
     *            </p>
     */
    public void setUtilization(SavingsPlansUtilization utilization) {
        this.utilization = utilization;
    }

    /**
     * <p>
     * A ratio of your effectiveness of using existing Savings Plans to apply to
     * workloads that are Savings Plans eligible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utilization <p>
     *            A ratio of your effectiveness of using existing Savings Plans
     *            to apply to workloads that are Savings Plans eligible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilizationByTime withUtilization(SavingsPlansUtilization utilization) {
        this.utilization = utilization;
        return this;
    }

    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both
     * net savings from Savings Plans as well as the
     * <code>onDemandCostEquivalent</code> of the Savings Plans when considering
     * the utilization rate.
     * </p>
     *
     * @return <p>
     *         The amount saved by using existing Savings Plans. Savings returns
     *         both net savings from Savings Plans as well as the
     *         <code>onDemandCostEquivalent</code> of the Savings Plans when
     *         considering the utilization rate.
     *         </p>
     */
    public SavingsPlansSavings getSavings() {
        return savings;
    }

    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both
     * net savings from Savings Plans as well as the
     * <code>onDemandCostEquivalent</code> of the Savings Plans when considering
     * the utilization rate.
     * </p>
     *
     * @param savings <p>
     *            The amount saved by using existing Savings Plans. Savings
     *            returns both net savings from Savings Plans as well as the
     *            <code>onDemandCostEquivalent</code> of the Savings Plans when
     *            considering the utilization rate.
     *            </p>
     */
    public void setSavings(SavingsPlansSavings savings) {
        this.savings = savings;
    }

    /**
     * <p>
     * The amount saved by using existing Savings Plans. Savings returns both
     * net savings from Savings Plans as well as the
     * <code>onDemandCostEquivalent</code> of the Savings Plans when considering
     * the utilization rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savings <p>
     *            The amount saved by using existing Savings Plans. Savings
     *            returns both net savings from Savings Plans as well as the
     *            <code>onDemandCostEquivalent</code> of the Savings Plans when
     *            considering the utilization rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilizationByTime withSavings(SavingsPlansSavings savings) {
        this.savings = savings;
        return this;
    }

    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum
     * of the upfront and recurring Savings Plans fees.
     * </p>
     *
     * @return <p>
     *         The total amortized commitment for a Savings Plans. This includes
     *         the sum of the upfront and recurring Savings Plans fees.
     *         </p>
     */
    public SavingsPlansAmortizedCommitment getAmortizedCommitment() {
        return amortizedCommitment;
    }

    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum
     * of the upfront and recurring Savings Plans fees.
     * </p>
     *
     * @param amortizedCommitment <p>
     *            The total amortized commitment for a Savings Plans. This
     *            includes the sum of the upfront and recurring Savings Plans
     *            fees.
     *            </p>
     */
    public void setAmortizedCommitment(SavingsPlansAmortizedCommitment amortizedCommitment) {
        this.amortizedCommitment = amortizedCommitment;
    }

    /**
     * <p>
     * The total amortized commitment for a Savings Plans. This includes the sum
     * of the upfront and recurring Savings Plans fees.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amortizedCommitment <p>
     *            The total amortized commitment for a Savings Plans. This
     *            includes the sum of the upfront and recurring Savings Plans
     *            fees.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilizationByTime withAmortizedCommitment(
            SavingsPlansAmortizedCommitment amortizedCommitment) {
        this.amortizedCommitment = amortizedCommitment;
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getUtilization() != null)
            sb.append("Utilization: " + getUtilization() + ",");
        if (getSavings() != null)
            sb.append("Savings: " + getSavings() + ",");
        if (getAmortizedCommitment() != null)
            sb.append("AmortizedCommitment: " + getAmortizedCommitment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode
                + ((getUtilization() == null) ? 0 : getUtilization().hashCode());
        hashCode = prime * hashCode + ((getSavings() == null) ? 0 : getSavings().hashCode());
        hashCode = prime * hashCode
                + ((getAmortizedCommitment() == null) ? 0 : getAmortizedCommitment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansUtilizationByTime == false)
            return false;
        SavingsPlansUtilizationByTime other = (SavingsPlansUtilizationByTime) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getUtilization() == null ^ this.getUtilization() == null)
            return false;
        if (other.getUtilization() != null
                && other.getUtilization().equals(this.getUtilization()) == false)
            return false;
        if (other.getSavings() == null ^ this.getSavings() == null)
            return false;
        if (other.getSavings() != null && other.getSavings().equals(this.getSavings()) == false)
            return false;
        if (other.getAmortizedCommitment() == null ^ this.getAmortizedCommitment() == null)
            return false;
        if (other.getAmortizedCommitment() != null
                && other.getAmortizedCommitment().equals(this.getAmortizedCommitment()) == false)
            return false;
        return true;
    }
}
