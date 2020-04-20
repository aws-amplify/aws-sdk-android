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
 * Summary of rightsizing recommendations
 * </p>
 */
public class RightsizingRecommendationSummary implements Serializable {
    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalRecommendationCount;

    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedTotalMonthlySavingsAmount;

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String savingsCurrencyCode;

    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to
     * the total On Demand costs associated with these instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String savingsPercentage;

    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Total number of instance recommendations.
     *         </p>
     */
    public String getTotalRecommendationCount() {
        return totalRecommendationCount;
    }

    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalRecommendationCount <p>
     *            Total number of instance recommendations.
     *            </p>
     */
    public void setTotalRecommendationCount(String totalRecommendationCount) {
        this.totalRecommendationCount = totalRecommendationCount;
    }

    /**
     * <p>
     * Total number of instance recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalRecommendationCount <p>
     *            Total number of instance recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendationSummary withTotalRecommendationCount(
            String totalRecommendationCount) {
        this.totalRecommendationCount = totalRecommendationCount;
        return this;
    }

    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Estimated total savings resulting from modifications, on a
     *         monthly basis.
     *         </p>
     */
    public String getEstimatedTotalMonthlySavingsAmount() {
        return estimatedTotalMonthlySavingsAmount;
    }

    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedTotalMonthlySavingsAmount <p>
     *            Estimated total savings resulting from modifications, on a
     *            monthly basis.
     *            </p>
     */
    public void setEstimatedTotalMonthlySavingsAmount(String estimatedTotalMonthlySavingsAmount) {
        this.estimatedTotalMonthlySavingsAmount = estimatedTotalMonthlySavingsAmount;
    }

    /**
     * <p>
     * Estimated total savings resulting from modifications, on a monthly basis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedTotalMonthlySavingsAmount <p>
     *            Estimated total savings resulting from modifications, on a
     *            monthly basis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendationSummary withEstimatedTotalMonthlySavingsAmount(
            String estimatedTotalMonthlySavingsAmount) {
        this.estimatedTotalMonthlySavingsAmount = estimatedTotalMonthlySavingsAmount;
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The currency code that Amazon Web Services used to calculate the
     *         savings.
     *         </p>
     */
    public String getSavingsCurrencyCode() {
        return savingsCurrencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param savingsCurrencyCode <p>
     *            The currency code that Amazon Web Services used to calculate
     *            the savings.
     *            </p>
     */
    public void setSavingsCurrencyCode(String savingsCurrencyCode) {
        this.savingsCurrencyCode = savingsCurrencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the savings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param savingsCurrencyCode <p>
     *            The currency code that Amazon Web Services used to calculate
     *            the savings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendationSummary withSavingsCurrencyCode(String savingsCurrencyCode) {
        this.savingsCurrencyCode = savingsCurrencyCode;
        return this;
    }

    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to
     * the total On Demand costs associated with these instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Savings percentage based on the recommended modifications,
     *         relative to the total On Demand costs associated with these
     *         instances.
     *         </p>
     */
    public String getSavingsPercentage() {
        return savingsPercentage;
    }

    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to
     * the total On Demand costs associated with these instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param savingsPercentage <p>
     *            Savings percentage based on the recommended modifications,
     *            relative to the total On Demand costs associated with these
     *            instances.
     *            </p>
     */
    public void setSavingsPercentage(String savingsPercentage) {
        this.savingsPercentage = savingsPercentage;
    }

    /**
     * <p>
     * Savings percentage based on the recommended modifications, relative to
     * the total On Demand costs associated with these instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param savingsPercentage <p>
     *            Savings percentage based on the recommended modifications,
     *            relative to the total On Demand costs associated with these
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendationSummary withSavingsPercentage(String savingsPercentage) {
        this.savingsPercentage = savingsPercentage;
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
        if (getTotalRecommendationCount() != null)
            sb.append("TotalRecommendationCount: " + getTotalRecommendationCount() + ",");
        if (getEstimatedTotalMonthlySavingsAmount() != null)
            sb.append("EstimatedTotalMonthlySavingsAmount: "
                    + getEstimatedTotalMonthlySavingsAmount() + ",");
        if (getSavingsCurrencyCode() != null)
            sb.append("SavingsCurrencyCode: " + getSavingsCurrencyCode() + ",");
        if (getSavingsPercentage() != null)
            sb.append("SavingsPercentage: " + getSavingsPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTotalRecommendationCount() == null) ? 0 : getTotalRecommendationCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedTotalMonthlySavingsAmount() == null) ? 0
                        : getEstimatedTotalMonthlySavingsAmount().hashCode());
        hashCode = prime * hashCode
                + ((getSavingsCurrencyCode() == null) ? 0 : getSavingsCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getSavingsPercentage() == null) ? 0 : getSavingsPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendationSummary == false)
            return false;
        RightsizingRecommendationSummary other = (RightsizingRecommendationSummary) obj;

        if (other.getTotalRecommendationCount() == null
                ^ this.getTotalRecommendationCount() == null)
            return false;
        if (other.getTotalRecommendationCount() != null
                && other.getTotalRecommendationCount().equals(this.getTotalRecommendationCount()) == false)
            return false;
        if (other.getEstimatedTotalMonthlySavingsAmount() == null
                ^ this.getEstimatedTotalMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedTotalMonthlySavingsAmount() != null
                && other.getEstimatedTotalMonthlySavingsAmount().equals(
                        this.getEstimatedTotalMonthlySavingsAmount()) == false)
            return false;
        if (other.getSavingsCurrencyCode() == null ^ this.getSavingsCurrencyCode() == null)
            return false;
        if (other.getSavingsCurrencyCode() != null
                && other.getSavingsCurrencyCode().equals(this.getSavingsCurrencyCode()) == false)
            return false;
        if (other.getSavingsPercentage() == null ^ this.getSavingsPercentage() == null)
            return false;
        if (other.getSavingsPercentage() != null
                && other.getSavingsPercentage().equals(this.getSavingsPercentage()) == false)
            return false;
        return true;
    }
}
