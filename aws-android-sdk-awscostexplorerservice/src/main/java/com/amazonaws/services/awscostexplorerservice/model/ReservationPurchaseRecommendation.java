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
 * A specific reservation that AWS recommends for purchase.
 * </p>
 */
public class ReservationPurchaseRecommendation implements Serializable {
    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance
     * for. For example, you can purchase this reservation for an entire
     * organization in AWS Organizations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     */
    private String accountScope;

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     */
    private String lookbackPeriodInDays;

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     */
    private String termInYears;

    /**
     * <p>
     * The payment option for the reservation. For example,
     * <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     */
    private String paymentOption;

    /**
     * <p>
     * Hardware specifications for the service that you want recommendations
     * for.
     * </p>
     */
    private ServiceSpecification serviceSpecification;

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     */
    private java.util.List<ReservationPurchaseRecommendationDetail> recommendationDetails;

    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     */
    private ReservationPurchaseRecommendationSummary recommendationSummary;

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance
     * for. For example, you can purchase this reservation for an entire
     * organization in AWS Organizations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @return <p>
     *         The account scope that AWS recommends that you purchase this
     *         instance for. For example, you can purchase this reservation for
     *         an entire organization in AWS Organizations.
     *         </p>
     * @see AccountScope
     */
    public String getAccountScope() {
        return accountScope;
    }

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance
     * for. For example, you can purchase this reservation for an entire
     * organization in AWS Organizations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that AWS recommends that you purchase this
     *            instance for. For example, you can purchase this reservation
     *            for an entire organization in AWS Organizations.
     *            </p>
     * @see AccountScope
     */
    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance
     * for. For example, you can purchase this reservation for an entire
     * organization in AWS Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that AWS recommends that you purchase this
     *            instance for. For example, you can purchase this reservation
     *            for an entire organization in AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountScope
     */
    public ReservationPurchaseRecommendation withAccountScope(String accountScope) {
        this.accountScope = accountScope;
        return this;
    }

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance
     * for. For example, you can purchase this reservation for an entire
     * organization in AWS Organizations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that AWS recommends that you purchase this
     *            instance for. For example, you can purchase this reservation
     *            for an entire organization in AWS Organizations.
     *            </p>
     * @see AccountScope
     */
    public void setAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
    }

    /**
     * <p>
     * The account scope that AWS recommends that you purchase this instance
     * for. For example, you can purchase this reservation for an entire
     * organization in AWS Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that AWS recommends that you purchase this
     *            instance for. For example, you can purchase this reservation
     *            for an entire organization in AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountScope
     */
    public ReservationPurchaseRecommendation withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @return <p>
     *         How many days of previous usage that AWS considers when making
     *         this recommendation.
     *         </p>
     * @see LookbackPeriodInDays
     */
    public String getLookbackPeriodInDays() {
        return lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that AWS considers when making
     *            this recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this
     * recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that AWS considers when making
     *            this recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public ReservationPurchaseRecommendation withLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that AWS considers when making
     *            this recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
    }

    /**
     * <p>
     * How many days of previous usage that AWS considers when making this
     * recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that AWS considers when making
     *            this recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public ReservationPurchaseRecommendation withLookbackPeriodInDays(
            LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @return <p>
     *         The term of the reservation that you want recommendations for, in
     *         years.
     *         </p>
     * @see TermInYears
     */
    public String getTermInYears() {
        return termInYears;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The term of the reservation that you want recommendations for,
     *            in years.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The term of the reservation that you want recommendations for,
     *            in years.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public ReservationPurchaseRecommendation withTermInYears(String termInYears) {
        this.termInYears = termInYears;
        return this;
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The term of the reservation that you want recommendations for,
     *            in years.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
    }

    /**
     * <p>
     * The term of the reservation that you want recommendations for, in years.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The term of the reservation that you want recommendations for,
     *            in years.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public ReservationPurchaseRecommendation withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation. For example,
     * <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @return <p>
     *         The payment option for the reservation. For example,
     *         <code>AllUpfront</code> or <code>NoUpfront</code>.
     *         </p>
     * @see PaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation. For example,
     * <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option for the reservation. For example,
     *            <code>AllUpfront</code> or <code>NoUpfront</code>.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation. For example,
     * <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option for the reservation. For example,
     *            <code>AllUpfront</code> or <code>NoUpfront</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public ReservationPurchaseRecommendation withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation. For example,
     * <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option for the reservation. For example,
     *            <code>AllUpfront</code> or <code>NoUpfront</code>.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The payment option for the reservation. For example,
     * <code>AllUpfront</code> or <code>NoUpfront</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option for the reservation. For example,
     *            <code>AllUpfront</code> or <code>NoUpfront</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public ReservationPurchaseRecommendation withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * Hardware specifications for the service that you want recommendations
     * for.
     * </p>
     *
     * @return <p>
     *         Hardware specifications for the service that you want
     *         recommendations for.
     *         </p>
     */
    public ServiceSpecification getServiceSpecification() {
        return serviceSpecification;
    }

    /**
     * <p>
     * Hardware specifications for the service that you want recommendations
     * for.
     * </p>
     *
     * @param serviceSpecification <p>
     *            Hardware specifications for the service that you want
     *            recommendations for.
     *            </p>
     */
    public void setServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
    }

    /**
     * <p>
     * Hardware specifications for the service that you want recommendations
     * for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceSpecification <p>
     *            Hardware specifications for the service that you want
     *            recommendations for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendation withServiceSpecification(
            ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     *
     * @return <p>
     *         Details about the recommended purchases.
     *         </p>
     */
    public java.util.List<ReservationPurchaseRecommendationDetail> getRecommendationDetails() {
        return recommendationDetails;
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     *
     * @param recommendationDetails <p>
     *            Details about the recommended purchases.
     *            </p>
     */
    public void setRecommendationDetails(
            java.util.Collection<ReservationPurchaseRecommendationDetail> recommendationDetails) {
        if (recommendationDetails == null) {
            this.recommendationDetails = null;
            return;
        }

        this.recommendationDetails = new java.util.ArrayList<ReservationPurchaseRecommendationDetail>(
                recommendationDetails);
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationDetails <p>
     *            Details about the recommended purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendation withRecommendationDetails(
            ReservationPurchaseRecommendationDetail... recommendationDetails) {
        if (getRecommendationDetails() == null) {
            this.recommendationDetails = new java.util.ArrayList<ReservationPurchaseRecommendationDetail>(
                    recommendationDetails.length);
        }
        for (ReservationPurchaseRecommendationDetail value : recommendationDetails) {
            this.recommendationDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details about the recommended purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationDetails <p>
     *            Details about the recommended purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendation withRecommendationDetails(
            java.util.Collection<ReservationPurchaseRecommendationDetail> recommendationDetails) {
        setRecommendationDetails(recommendationDetails);
        return this;
    }

    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     *
     * @return <p>
     *         A summary about the recommended purchase.
     *         </p>
     */
    public ReservationPurchaseRecommendationSummary getRecommendationSummary() {
        return recommendationSummary;
    }

    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     *
     * @param recommendationSummary <p>
     *            A summary about the recommended purchase.
     *            </p>
     */
    public void setRecommendationSummary(
            ReservationPurchaseRecommendationSummary recommendationSummary) {
        this.recommendationSummary = recommendationSummary;
    }

    /**
     * <p>
     * A summary about the recommended purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationSummary <p>
     *            A summary about the recommended purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendation withRecommendationSummary(
            ReservationPurchaseRecommendationSummary recommendationSummary) {
        this.recommendationSummary = recommendationSummary;
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
        if (getAccountScope() != null)
            sb.append("AccountScope: " + getAccountScope() + ",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: " + getLookbackPeriodInDays() + ",");
        if (getTermInYears() != null)
            sb.append("TermInYears: " + getTermInYears() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getServiceSpecification() != null)
            sb.append("ServiceSpecification: " + getServiceSpecification() + ",");
        if (getRecommendationDetails() != null)
            sb.append("RecommendationDetails: " + getRecommendationDetails() + ",");
        if (getRecommendationSummary() != null)
            sb.append("RecommendationSummary: " + getRecommendationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode
                + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode
                + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode
                + ((getServiceSpecification() == null) ? 0 : getServiceSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationDetails() == null) ? 0 : getRecommendationDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendationSummary() == null) ? 0 : getRecommendationSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPurchaseRecommendation == false)
            return false;
        ReservationPurchaseRecommendation other = (ReservationPurchaseRecommendation) obj;

        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null
                && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null
                && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getTermInYears() == null ^ this.getTermInYears() == null)
            return false;
        if (other.getTermInYears() != null
                && other.getTermInYears().equals(this.getTermInYears()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null
                && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getServiceSpecification() == null ^ this.getServiceSpecification() == null)
            return false;
        if (other.getServiceSpecification() != null
                && other.getServiceSpecification().equals(this.getServiceSpecification()) == false)
            return false;
        if (other.getRecommendationDetails() == null ^ this.getRecommendationDetails() == null)
            return false;
        if (other.getRecommendationDetails() != null
                && other.getRecommendationDetails().equals(this.getRecommendationDetails()) == false)
            return false;
        if (other.getRecommendationSummary() == null ^ this.getRecommendationSummary() == null)
            return false;
        if (other.getRecommendationSummary() != null
                && other.getRecommendationSummary().equals(this.getRecommendationSummary()) == false)
            return false;
        return true;
    }
}
