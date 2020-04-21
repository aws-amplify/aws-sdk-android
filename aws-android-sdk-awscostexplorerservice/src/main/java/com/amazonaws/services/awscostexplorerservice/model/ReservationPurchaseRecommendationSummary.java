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
 * A summary about this recommendation, such as the currency code, the amount
 * that AWS estimates that you could save, and the total amount of reservation
 * to purchase.
 * </p>
 */
public class ReservationPurchaseRecommendationSummary implements Serializable {
    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalEstimatedMonthlySavingsAmount;

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month, as a percentage of your costs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalEstimatedMonthlySavingsPercentage;

    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currencyCode;

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The total amount that AWS estimates that this recommendation
     *         could save you in a month.
     *         </p>
     */
    public String getTotalEstimatedMonthlySavingsAmount() {
        return totalEstimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalEstimatedMonthlySavingsAmount <p>
     *            The total amount that AWS estimates that this recommendation
     *            could save you in a month.
     *            </p>
     */
    public void setTotalEstimatedMonthlySavingsAmount(String totalEstimatedMonthlySavingsAmount) {
        this.totalEstimatedMonthlySavingsAmount = totalEstimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalEstimatedMonthlySavingsAmount <p>
     *            The total amount that AWS estimates that this recommendation
     *            could save you in a month.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationSummary withTotalEstimatedMonthlySavingsAmount(
            String totalEstimatedMonthlySavingsAmount) {
        this.totalEstimatedMonthlySavingsAmount = totalEstimatedMonthlySavingsAmount;
        return this;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month, as a percentage of your costs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The total amount that AWS estimates that this recommendation
     *         could save you in a month, as a percentage of your costs.
     *         </p>
     */
    public String getTotalEstimatedMonthlySavingsPercentage() {
        return totalEstimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month, as a percentage of your costs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalEstimatedMonthlySavingsPercentage <p>
     *            The total amount that AWS estimates that this recommendation
     *            could save you in a month, as a percentage of your costs.
     *            </p>
     */
    public void setTotalEstimatedMonthlySavingsPercentage(
            String totalEstimatedMonthlySavingsPercentage) {
        this.totalEstimatedMonthlySavingsPercentage = totalEstimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * The total amount that AWS estimates that this recommendation could save
     * you in a month, as a percentage of your costs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalEstimatedMonthlySavingsPercentage <p>
     *            The total amount that AWS estimates that this recommendation
     *            could save you in a month, as a percentage of your costs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationSummary withTotalEstimatedMonthlySavingsPercentage(
            String totalEstimatedMonthlySavingsPercentage) {
        this.totalEstimatedMonthlySavingsPercentage = totalEstimatedMonthlySavingsPercentage;
        return this;
    }

    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The currency code used for this recommendation.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code used for this recommendation.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code used for this recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code used for this recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationSummary withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
        if (getTotalEstimatedMonthlySavingsAmount() != null)
            sb.append("TotalEstimatedMonthlySavingsAmount: "
                    + getTotalEstimatedMonthlySavingsAmount() + ",");
        if (getTotalEstimatedMonthlySavingsPercentage() != null)
            sb.append("TotalEstimatedMonthlySavingsPercentage: "
                    + getTotalEstimatedMonthlySavingsPercentage() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTotalEstimatedMonthlySavingsAmount() == null) ? 0
                        : getTotalEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalEstimatedMonthlySavingsPercentage() == null) ? 0
                        : getTotalEstimatedMonthlySavingsPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPurchaseRecommendationSummary == false)
            return false;
        ReservationPurchaseRecommendationSummary other = (ReservationPurchaseRecommendationSummary) obj;

        if (other.getTotalEstimatedMonthlySavingsAmount() == null
                ^ this.getTotalEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getTotalEstimatedMonthlySavingsAmount() != null
                && other.getTotalEstimatedMonthlySavingsAmount().equals(
                        this.getTotalEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getTotalEstimatedMonthlySavingsPercentage() == null
                ^ this.getTotalEstimatedMonthlySavingsPercentage() == null)
            return false;
        if (other.getTotalEstimatedMonthlySavingsPercentage() != null
                && other.getTotalEstimatedMonthlySavingsPercentage().equals(
                        this.getTotalEstimatedMonthlySavingsPercentage()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        return true;
    }
}
