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
 * Specific coverage percentage, On-Demand costs, and spend covered by Savings
 * Plans, and total Savings Plans costs for an account.
 * </p>
 */
public class SavingsPlansCoverageData implements Serializable {
    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String spendCoveredBySavingsPlans;

    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String onDemandCost;

    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your
     * purchase option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalCost;

    /**
     * <p>
     * The percentage of your existing Savings Plans covered usage, divided by
     * all of your eligible Savings Plans usage in an account(or set of
     * accounts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String coveragePercentage;

    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The amount of your Amazon Web Services usage that is covered by a
     *         Savings Plans.
     *         </p>
     */
    public String getSpendCoveredBySavingsPlans() {
        return spendCoveredBySavingsPlans;
    }

    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param spendCoveredBySavingsPlans <p>
     *            The amount of your Amazon Web Services usage that is covered
     *            by a Savings Plans.
     *            </p>
     */
    public void setSpendCoveredBySavingsPlans(String spendCoveredBySavingsPlans) {
        this.spendCoveredBySavingsPlans = spendCoveredBySavingsPlans;
    }

    /**
     * <p>
     * The amount of your Amazon Web Services usage that is covered by a Savings
     * Plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param spendCoveredBySavingsPlans <p>
     *            The amount of your Amazon Web Services usage that is covered
     *            by a Savings Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverageData withSpendCoveredBySavingsPlans(String spendCoveredBySavingsPlans) {
        this.spendCoveredBySavingsPlans = spendCoveredBySavingsPlans;
        return this;
    }

    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The cost of your Amazon Web Services usage at the public
     *         On-Demand rate.
     *         </p>
     */
    public String getOnDemandCost() {
        return onDemandCost;
    }

    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param onDemandCost <p>
     *            The cost of your Amazon Web Services usage at the public
     *            On-Demand rate.
     *            </p>
     */
    public void setOnDemandCost(String onDemandCost) {
        this.onDemandCost = onDemandCost;
    }

    /**
     * <p>
     * The cost of your Amazon Web Services usage at the public On-Demand rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param onDemandCost <p>
     *            The cost of your Amazon Web Services usage at the public
     *            On-Demand rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverageData withOnDemandCost(String onDemandCost) {
        this.onDemandCost = onDemandCost;
        return this;
    }

    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your
     * purchase option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The total cost of your Amazon Web Services usage, regardless of
     *         your purchase option.
     *         </p>
     */
    public String getTotalCost() {
        return totalCost;
    }

    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your
     * purchase option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalCost <p>
     *            The total cost of your Amazon Web Services usage, regardless
     *            of your purchase option.
     *            </p>
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * <p>
     * The total cost of your Amazon Web Services usage, regardless of your
     * purchase option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalCost <p>
     *            The total cost of your Amazon Web Services usage, regardless
     *            of your purchase option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverageData withTotalCost(String totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    /**
     * <p>
     * The percentage of your existing Savings Plans covered usage, divided by
     * all of your eligible Savings Plans usage in an account(or set of
     * accounts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The percentage of your existing Savings Plans covered usage,
     *         divided by all of your eligible Savings Plans usage in an
     *         account(or set of accounts).
     *         </p>
     */
    public String getCoveragePercentage() {
        return coveragePercentage;
    }

    /**
     * <p>
     * The percentage of your existing Savings Plans covered usage, divided by
     * all of your eligible Savings Plans usage in an account(or set of
     * accounts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param coveragePercentage <p>
     *            The percentage of your existing Savings Plans covered usage,
     *            divided by all of your eligible Savings Plans usage in an
     *            account(or set of accounts).
     *            </p>
     */
    public void setCoveragePercentage(String coveragePercentage) {
        this.coveragePercentage = coveragePercentage;
    }

    /**
     * <p>
     * The percentage of your existing Savings Plans covered usage, divided by
     * all of your eligible Savings Plans usage in an account(or set of
     * accounts).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param coveragePercentage <p>
     *            The percentage of your existing Savings Plans covered usage,
     *            divided by all of your eligible Savings Plans usage in an
     *            account(or set of accounts).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverageData withCoveragePercentage(String coveragePercentage) {
        this.coveragePercentage = coveragePercentage;
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
        if (getSpendCoveredBySavingsPlans() != null)
            sb.append("SpendCoveredBySavingsPlans: " + getSpendCoveredBySavingsPlans() + ",");
        if (getOnDemandCost() != null)
            sb.append("OnDemandCost: " + getOnDemandCost() + ",");
        if (getTotalCost() != null)
            sb.append("TotalCost: " + getTotalCost() + ",");
        if (getCoveragePercentage() != null)
            sb.append("CoveragePercentage: " + getCoveragePercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSpendCoveredBySavingsPlans() == null) ? 0 : getSpendCoveredBySavingsPlans()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOnDemandCost() == null) ? 0 : getOnDemandCost().hashCode());
        hashCode = prime * hashCode + ((getTotalCost() == null) ? 0 : getTotalCost().hashCode());
        hashCode = prime * hashCode
                + ((getCoveragePercentage() == null) ? 0 : getCoveragePercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansCoverageData == false)
            return false;
        SavingsPlansCoverageData other = (SavingsPlansCoverageData) obj;

        if (other.getSpendCoveredBySavingsPlans() == null
                ^ this.getSpendCoveredBySavingsPlans() == null)
            return false;
        if (other.getSpendCoveredBySavingsPlans() != null
                && other.getSpendCoveredBySavingsPlans().equals(
                        this.getSpendCoveredBySavingsPlans()) == false)
            return false;
        if (other.getOnDemandCost() == null ^ this.getOnDemandCost() == null)
            return false;
        if (other.getOnDemandCost() != null
                && other.getOnDemandCost().equals(this.getOnDemandCost()) == false)
            return false;
        if (other.getTotalCost() == null ^ this.getTotalCost() == null)
            return false;
        if (other.getTotalCost() != null
                && other.getTotalCost().equals(this.getTotalCost()) == false)
            return false;
        if (other.getCoveragePercentage() == null ^ this.getCoveragePercentage() == null)
            return false;
        if (other.getCoveragePercentage() != null
                && other.getCoveragePercentage().equals(this.getCoveragePercentage()) == false)
            return false;
        return true;
    }
}
