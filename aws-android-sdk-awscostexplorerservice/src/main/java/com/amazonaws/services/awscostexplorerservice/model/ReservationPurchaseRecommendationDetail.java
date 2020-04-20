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
 * Details about your recommended reservation purchase.
 * </p>
 */
public class ReservationPurchaseRecommendationDetail implements Serializable {
    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String accountId;

    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     */
    private InstanceDetails instanceDetails;

    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String recommendedNumberOfInstancesToPurchase;

    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String recommendedNormalizedUnitsToPurchase;

    /**
     * <p>
     * The minimum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String minimumNumberOfInstancesUsedPerHour;

    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String minimumNormalizedUnitsUsedPerHour;

    /**
     * <p>
     * The maximum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String maximumNumberOfInstancesUsedPerHour;

    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String maximumNormalizedUnitsUsedPerHour;

    /**
     * <p>
     * The average number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String averageNumberOfInstancesUsedPerHour;

    /**
     * <p>
     * The average number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String averageNormalizedUnitsUsedPerHour;

    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String averageUtilization;

    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving
     * you money, in months.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedBreakEvenInMonths;

    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currencyCode;

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedMonthlySavingsAmount;

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month, as a percentage of your overall costs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedMonthlySavingsPercentage;

    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedMonthlyOnDemandCost;

    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the
     * specified historical period if you had a reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedReservationCostForLookbackPeriod;

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String upfrontCost;

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String recurringStandardMonthlyCost;

    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The account that this RI recommendation is for.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param accountId <p>
     *            The account that this RI recommendation is for.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account that this RI recommendation is for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param accountId <p>
     *            The account that this RI recommendation is for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     *
     * @return <p>
     *         Details about the instances that AWS recommends that you
     *         purchase.
     *         </p>
     */
    public InstanceDetails getInstanceDetails() {
        return instanceDetails;
    }

    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     *
     * @param instanceDetails <p>
     *            Details about the instances that AWS recommends that you
     *            purchase.
     *            </p>
     */
    public void setInstanceDetails(InstanceDetails instanceDetails) {
        this.instanceDetails = instanceDetails;
    }

    /**
     * <p>
     * Details about the instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceDetails <p>
     *            Details about the instances that AWS recommends that you
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withInstanceDetails(
            InstanceDetails instanceDetails) {
        this.instanceDetails = instanceDetails;
        return this;
    }

    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The number of instances that AWS recommends that you purchase.
     *         </p>
     */
    public String getRecommendedNumberOfInstancesToPurchase() {
        return recommendedNumberOfInstancesToPurchase;
    }

    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recommendedNumberOfInstancesToPurchase <p>
     *            The number of instances that AWS recommends that you purchase.
     *            </p>
     */
    public void setRecommendedNumberOfInstancesToPurchase(
            String recommendedNumberOfInstancesToPurchase) {
        this.recommendedNumberOfInstancesToPurchase = recommendedNumberOfInstancesToPurchase;
    }

    /**
     * <p>
     * The number of instances that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recommendedNumberOfInstancesToPurchase <p>
     *            The number of instances that AWS recommends that you purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withRecommendedNumberOfInstancesToPurchase(
            String recommendedNumberOfInstancesToPurchase) {
        this.recommendedNumberOfInstancesToPurchase = recommendedNumberOfInstancesToPurchase;
        return this;
    }

    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The number of normalized units that AWS recommends that you
     *         purchase.
     *         </p>
     */
    public String getRecommendedNormalizedUnitsToPurchase() {
        return recommendedNormalizedUnitsToPurchase;
    }

    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recommendedNormalizedUnitsToPurchase <p>
     *            The number of normalized units that AWS recommends that you
     *            purchase.
     *            </p>
     */
    public void setRecommendedNormalizedUnitsToPurchase(String recommendedNormalizedUnitsToPurchase) {
        this.recommendedNormalizedUnitsToPurchase = recommendedNormalizedUnitsToPurchase;
    }

    /**
     * <p>
     * The number of normalized units that AWS recommends that you purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recommendedNormalizedUnitsToPurchase <p>
     *            The number of normalized units that AWS recommends that you
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withRecommendedNormalizedUnitsToPurchase(
            String recommendedNormalizedUnitsToPurchase) {
        this.recommendedNormalizedUnitsToPurchase = recommendedNormalizedUnitsToPurchase;
        return this;
    }

    /**
     * <p>
     * The minimum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The minimum number of instances that you used in an hour during
     *         the historical period. AWS uses this to calculate your
     *         recommended reservation purchases.
     *         </p>
     */
    public String getMinimumNumberOfInstancesUsedPerHour() {
        return minimumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param minimumNumberOfInstancesUsedPerHour <p>
     *            The minimum number of instances that you used in an hour
     *            during the historical period. AWS uses this to calculate your
     *            recommended reservation purchases.
     *            </p>
     */
    public void setMinimumNumberOfInstancesUsedPerHour(String minimumNumberOfInstancesUsedPerHour) {
        this.minimumNumberOfInstancesUsedPerHour = minimumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param minimumNumberOfInstancesUsedPerHour <p>
     *            The minimum number of instances that you used in an hour
     *            during the historical period. AWS uses this to calculate your
     *            recommended reservation purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withMinimumNumberOfInstancesUsedPerHour(
            String minimumNumberOfInstancesUsedPerHour) {
        this.minimumNumberOfInstancesUsedPerHour = minimumNumberOfInstancesUsedPerHour;
        return this;
    }

    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The minimum number of normalized units that you used in an hour
     *         during the historical period. AWS uses this to calculate your
     *         recommended reservation purchases.
     *         </p>
     */
    public String getMinimumNormalizedUnitsUsedPerHour() {
        return minimumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param minimumNormalizedUnitsUsedPerHour <p>
     *            The minimum number of normalized units that you used in an
     *            hour during the historical period. AWS uses this to calculate
     *            your recommended reservation purchases.
     *            </p>
     */
    public void setMinimumNormalizedUnitsUsedPerHour(String minimumNormalizedUnitsUsedPerHour) {
        this.minimumNormalizedUnitsUsedPerHour = minimumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The minimum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param minimumNormalizedUnitsUsedPerHour <p>
     *            The minimum number of normalized units that you used in an
     *            hour during the historical period. AWS uses this to calculate
     *            your recommended reservation purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withMinimumNormalizedUnitsUsedPerHour(
            String minimumNormalizedUnitsUsedPerHour) {
        this.minimumNormalizedUnitsUsedPerHour = minimumNormalizedUnitsUsedPerHour;
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The maximum number of instances that you used in an hour during
     *         the historical period. AWS uses this to calculate your
     *         recommended reservation purchases.
     *         </p>
     */
    public String getMaximumNumberOfInstancesUsedPerHour() {
        return maximumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maximumNumberOfInstancesUsedPerHour <p>
     *            The maximum number of instances that you used in an hour
     *            during the historical period. AWS uses this to calculate your
     *            recommended reservation purchases.
     *            </p>
     */
    public void setMaximumNumberOfInstancesUsedPerHour(String maximumNumberOfInstancesUsedPerHour) {
        this.maximumNumberOfInstancesUsedPerHour = maximumNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maximumNumberOfInstancesUsedPerHour <p>
     *            The maximum number of instances that you used in an hour
     *            during the historical period. AWS uses this to calculate your
     *            recommended reservation purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withMaximumNumberOfInstancesUsedPerHour(
            String maximumNumberOfInstancesUsedPerHour) {
        this.maximumNumberOfInstancesUsedPerHour = maximumNumberOfInstancesUsedPerHour;
        return this;
    }

    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The maximum number of normalized units that you used in an hour
     *         during the historical period. AWS uses this to calculate your
     *         recommended reservation purchases.
     *         </p>
     */
    public String getMaximumNormalizedUnitsUsedPerHour() {
        return maximumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maximumNormalizedUnitsUsedPerHour <p>
     *            The maximum number of normalized units that you used in an
     *            hour during the historical period. AWS uses this to calculate
     *            your recommended reservation purchases.
     *            </p>
     */
    public void setMaximumNormalizedUnitsUsedPerHour(String maximumNormalizedUnitsUsedPerHour) {
        this.maximumNormalizedUnitsUsedPerHour = maximumNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The maximum number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maximumNormalizedUnitsUsedPerHour <p>
     *            The maximum number of normalized units that you used in an
     *            hour during the historical period. AWS uses this to calculate
     *            your recommended reservation purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withMaximumNormalizedUnitsUsedPerHour(
            String maximumNormalizedUnitsUsedPerHour) {
        this.maximumNormalizedUnitsUsedPerHour = maximumNormalizedUnitsUsedPerHour;
        return this;
    }

    /**
     * <p>
     * The average number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The average number of instances that you used in an hour during
     *         the historical period. AWS uses this to calculate your
     *         recommended reservation purchases.
     *         </p>
     */
    public String getAverageNumberOfInstancesUsedPerHour() {
        return averageNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The average number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param averageNumberOfInstancesUsedPerHour <p>
     *            The average number of instances that you used in an hour
     *            during the historical period. AWS uses this to calculate your
     *            recommended reservation purchases.
     *            </p>
     */
    public void setAverageNumberOfInstancesUsedPerHour(String averageNumberOfInstancesUsedPerHour) {
        this.averageNumberOfInstancesUsedPerHour = averageNumberOfInstancesUsedPerHour;
    }

    /**
     * <p>
     * The average number of instances that you used in an hour during the
     * historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param averageNumberOfInstancesUsedPerHour <p>
     *            The average number of instances that you used in an hour
     *            during the historical period. AWS uses this to calculate your
     *            recommended reservation purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withAverageNumberOfInstancesUsedPerHour(
            String averageNumberOfInstancesUsedPerHour) {
        this.averageNumberOfInstancesUsedPerHour = averageNumberOfInstancesUsedPerHour;
        return this;
    }

    /**
     * <p>
     * The average number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The average number of normalized units that you used in an hour
     *         during the historical period. AWS uses this to calculate your
     *         recommended reservation purchases.
     *         </p>
     */
    public String getAverageNormalizedUnitsUsedPerHour() {
        return averageNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The average number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param averageNormalizedUnitsUsedPerHour <p>
     *            The average number of normalized units that you used in an
     *            hour during the historical period. AWS uses this to calculate
     *            your recommended reservation purchases.
     *            </p>
     */
    public void setAverageNormalizedUnitsUsedPerHour(String averageNormalizedUnitsUsedPerHour) {
        this.averageNormalizedUnitsUsedPerHour = averageNormalizedUnitsUsedPerHour;
    }

    /**
     * <p>
     * The average number of normalized units that you used in an hour during
     * the historical period. AWS uses this to calculate your recommended
     * reservation purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param averageNormalizedUnitsUsedPerHour <p>
     *            The average number of normalized units that you used in an
     *            hour during the historical period. AWS uses this to calculate
     *            your recommended reservation purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withAverageNormalizedUnitsUsedPerHour(
            String averageNormalizedUnitsUsedPerHour) {
        this.averageNormalizedUnitsUsedPerHour = averageNormalizedUnitsUsedPerHour;
        return this;
    }

    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The average utilization of your instances. AWS uses this to
     *         calculate your recommended reservation purchases.
     *         </p>
     */
    public String getAverageUtilization() {
        return averageUtilization;
    }

    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param averageUtilization <p>
     *            The average utilization of your instances. AWS uses this to
     *            calculate your recommended reservation purchases.
     *            </p>
     */
    public void setAverageUtilization(String averageUtilization) {
        this.averageUtilization = averageUtilization;
    }

    /**
     * <p>
     * The average utilization of your instances. AWS uses this to calculate
     * your recommended reservation purchases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param averageUtilization <p>
     *            The average utilization of your instances. AWS uses this to
     *            calculate your recommended reservation purchases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withAverageUtilization(String averageUtilization) {
        this.averageUtilization = averageUtilization;
        return this;
    }

    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving
     * you money, in months.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How long AWS estimates that it takes for this instance to start
     *         saving you money, in months.
     *         </p>
     */
    public String getEstimatedBreakEvenInMonths() {
        return estimatedBreakEvenInMonths;
    }

    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving
     * you money, in months.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedBreakEvenInMonths <p>
     *            How long AWS estimates that it takes for this instance to
     *            start saving you money, in months.
     *            </p>
     */
    public void setEstimatedBreakEvenInMonths(String estimatedBreakEvenInMonths) {
        this.estimatedBreakEvenInMonths = estimatedBreakEvenInMonths;
    }

    /**
     * <p>
     * How long AWS estimates that it takes for this instance to start saving
     * you money, in months.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedBreakEvenInMonths <p>
     *            How long AWS estimates that it takes for this instance to
     *            start saving you money, in months.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withEstimatedBreakEvenInMonths(
            String estimatedBreakEvenInMonths) {
        this.estimatedBreakEvenInMonths = estimatedBreakEvenInMonths;
        return this;
    }

    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The currency code that AWS used to calculate the costs for this
     *         instance.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code that AWS used to calculate the costs for
     *            this instance.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that AWS used to calculate the costs for this instance.
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
     *            The currency code that AWS used to calculate the costs for
     *            this instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How much AWS estimates that this specific recommendation could
     *         save you in a month.
     *         </p>
     */
    public String getEstimatedMonthlySavingsAmount() {
        return estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavingsAmount <p>
     *            How much AWS estimates that this specific recommendation could
     *            save you in a month.
     *            </p>
     */
    public void setEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavingsAmount <p>
     *            How much AWS estimates that this specific recommendation could
     *            save you in a month.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withEstimatedMonthlySavingsAmount(
            String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month, as a percentage of your overall costs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How much AWS estimates that this specific recommendation could
     *         save you in a month, as a percentage of your overall costs.
     *         </p>
     */
    public String getEstimatedMonthlySavingsPercentage() {
        return estimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month, as a percentage of your overall costs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavingsPercentage <p>
     *            How much AWS estimates that this specific recommendation could
     *            save you in a month, as a percentage of your overall costs.
     *            </p>
     */
    public void setEstimatedMonthlySavingsPercentage(String estimatedMonthlySavingsPercentage) {
        this.estimatedMonthlySavingsPercentage = estimatedMonthlySavingsPercentage;
    }

    /**
     * <p>
     * How much AWS estimates that this specific recommendation could save you
     * in a month, as a percentage of your overall costs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavingsPercentage <p>
     *            How much AWS estimates that this specific recommendation could
     *            save you in a month, as a percentage of your overall costs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withEstimatedMonthlySavingsPercentage(
            String estimatedMonthlySavingsPercentage) {
        this.estimatedMonthlySavingsPercentage = estimatedMonthlySavingsPercentage;
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How much AWS estimates that you spend on On-Demand Instances in a
     *         month.
     *         </p>
     */
    public String getEstimatedMonthlyOnDemandCost() {
        return estimatedMonthlyOnDemandCost;
    }

    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlyOnDemandCost <p>
     *            How much AWS estimates that you spend on On-Demand Instances
     *            in a month.
     *            </p>
     */
    public void setEstimatedMonthlyOnDemandCost(String estimatedMonthlyOnDemandCost) {
        this.estimatedMonthlyOnDemandCost = estimatedMonthlyOnDemandCost;
    }

    /**
     * <p>
     * How much AWS estimates that you spend on On-Demand Instances in a month.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlyOnDemandCost <p>
     *            How much AWS estimates that you spend on On-Demand Instances
     *            in a month.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withEstimatedMonthlyOnDemandCost(
            String estimatedMonthlyOnDemandCost) {
        this.estimatedMonthlyOnDemandCost = estimatedMonthlyOnDemandCost;
        return this;
    }

    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the
     * specified historical period if you had a reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How much AWS estimates that you would have spent for all usage
     *         during the specified historical period if you had a reservation.
     *         </p>
     */
    public String getEstimatedReservationCostForLookbackPeriod() {
        return estimatedReservationCostForLookbackPeriod;
    }

    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the
     * specified historical period if you had a reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedReservationCostForLookbackPeriod <p>
     *            How much AWS estimates that you would have spent for all usage
     *            during the specified historical period if you had a
     *            reservation.
     *            </p>
     */
    public void setEstimatedReservationCostForLookbackPeriod(
            String estimatedReservationCostForLookbackPeriod) {
        this.estimatedReservationCostForLookbackPeriod = estimatedReservationCostForLookbackPeriod;
    }

    /**
     * <p>
     * How much AWS estimates that you would have spent for all usage during the
     * specified historical period if you had a reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedReservationCostForLookbackPeriod <p>
     *            How much AWS estimates that you would have spent for all usage
     *            during the specified historical period if you had a
     *            reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withEstimatedReservationCostForLookbackPeriod(
            String estimatedReservationCostForLookbackPeriod) {
        this.estimatedReservationCostForLookbackPeriod = estimatedReservationCostForLookbackPeriod;
        return this;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How much purchasing this instance costs you upfront.
     *         </p>
     */
    public String getUpfrontCost() {
        return upfrontCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param upfrontCost <p>
     *            How much purchasing this instance costs you upfront.
     *            </p>
     */
    public void setUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you upfront.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param upfrontCost <p>
     *            How much purchasing this instance costs you upfront.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
        return this;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How much purchasing this instance costs you on a monthly basis.
     *         </p>
     */
    public String getRecurringStandardMonthlyCost() {
        return recurringStandardMonthlyCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recurringStandardMonthlyCost <p>
     *            How much purchasing this instance costs you on a monthly
     *            basis.
     *            </p>
     */
    public void setRecurringStandardMonthlyCost(String recurringStandardMonthlyCost) {
        this.recurringStandardMonthlyCost = recurringStandardMonthlyCost;
    }

    /**
     * <p>
     * How much purchasing this instance costs you on a monthly basis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recurringStandardMonthlyCost <p>
     *            How much purchasing this instance costs you on a monthly
     *            basis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationDetail withRecurringStandardMonthlyCost(
            String recurringStandardMonthlyCost) {
        this.recurringStandardMonthlyCost = recurringStandardMonthlyCost;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getInstanceDetails() != null)
            sb.append("InstanceDetails: " + getInstanceDetails() + ",");
        if (getRecommendedNumberOfInstancesToPurchase() != null)
            sb.append("RecommendedNumberOfInstancesToPurchase: "
                    + getRecommendedNumberOfInstancesToPurchase() + ",");
        if (getRecommendedNormalizedUnitsToPurchase() != null)
            sb.append("RecommendedNormalizedUnitsToPurchase: "
                    + getRecommendedNormalizedUnitsToPurchase() + ",");
        if (getMinimumNumberOfInstancesUsedPerHour() != null)
            sb.append("MinimumNumberOfInstancesUsedPerHour: "
                    + getMinimumNumberOfInstancesUsedPerHour() + ",");
        if (getMinimumNormalizedUnitsUsedPerHour() != null)
            sb.append("MinimumNormalizedUnitsUsedPerHour: "
                    + getMinimumNormalizedUnitsUsedPerHour() + ",");
        if (getMaximumNumberOfInstancesUsedPerHour() != null)
            sb.append("MaximumNumberOfInstancesUsedPerHour: "
                    + getMaximumNumberOfInstancesUsedPerHour() + ",");
        if (getMaximumNormalizedUnitsUsedPerHour() != null)
            sb.append("MaximumNormalizedUnitsUsedPerHour: "
                    + getMaximumNormalizedUnitsUsedPerHour() + ",");
        if (getAverageNumberOfInstancesUsedPerHour() != null)
            sb.append("AverageNumberOfInstancesUsedPerHour: "
                    + getAverageNumberOfInstancesUsedPerHour() + ",");
        if (getAverageNormalizedUnitsUsedPerHour() != null)
            sb.append("AverageNormalizedUnitsUsedPerHour: "
                    + getAverageNormalizedUnitsUsedPerHour() + ",");
        if (getAverageUtilization() != null)
            sb.append("AverageUtilization: " + getAverageUtilization() + ",");
        if (getEstimatedBreakEvenInMonths() != null)
            sb.append("EstimatedBreakEvenInMonths: " + getEstimatedBreakEvenInMonths() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getEstimatedMonthlySavingsAmount() != null)
            sb.append("EstimatedMonthlySavingsAmount: " + getEstimatedMonthlySavingsAmount() + ",");
        if (getEstimatedMonthlySavingsPercentage() != null)
            sb.append("EstimatedMonthlySavingsPercentage: "
                    + getEstimatedMonthlySavingsPercentage() + ",");
        if (getEstimatedMonthlyOnDemandCost() != null)
            sb.append("EstimatedMonthlyOnDemandCost: " + getEstimatedMonthlyOnDemandCost() + ",");
        if (getEstimatedReservationCostForLookbackPeriod() != null)
            sb.append("EstimatedReservationCostForLookbackPeriod: "
                    + getEstimatedReservationCostForLookbackPeriod() + ",");
        if (getUpfrontCost() != null)
            sb.append("UpfrontCost: " + getUpfrontCost() + ",");
        if (getRecurringStandardMonthlyCost() != null)
            sb.append("RecurringStandardMonthlyCost: " + getRecurringStandardMonthlyCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceDetails() == null) ? 0 : getInstanceDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendedNumberOfInstancesToPurchase() == null) ? 0
                        : getRecommendedNumberOfInstancesToPurchase().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecommendedNormalizedUnitsToPurchase() == null) ? 0
                        : getRecommendedNormalizedUnitsToPurchase().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumNumberOfInstancesUsedPerHour() == null) ? 0
                        : getMinimumNumberOfInstancesUsedPerHour().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumNormalizedUnitsUsedPerHour() == null) ? 0
                        : getMinimumNormalizedUnitsUsedPerHour().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumNumberOfInstancesUsedPerHour() == null) ? 0
                        : getMaximumNumberOfInstancesUsedPerHour().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumNormalizedUnitsUsedPerHour() == null) ? 0
                        : getMaximumNormalizedUnitsUsedPerHour().hashCode());
        hashCode = prime
                * hashCode
                + ((getAverageNumberOfInstancesUsedPerHour() == null) ? 0
                        : getAverageNumberOfInstancesUsedPerHour().hashCode());
        hashCode = prime
                * hashCode
                + ((getAverageNormalizedUnitsUsedPerHour() == null) ? 0
                        : getAverageNormalizedUnitsUsedPerHour().hashCode());
        hashCode = prime * hashCode
                + ((getAverageUtilization() == null) ? 0 : getAverageUtilization().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedBreakEvenInMonths() == null) ? 0 : getEstimatedBreakEvenInMonths()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedMonthlySavingsAmount() == null) ? 0
                        : getEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedMonthlySavingsPercentage() == null) ? 0
                        : getEstimatedMonthlySavingsPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedMonthlyOnDemandCost() == null) ? 0
                        : getEstimatedMonthlyOnDemandCost().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedReservationCostForLookbackPeriod() == null) ? 0
                        : getEstimatedReservationCostForLookbackPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getUpfrontCost() == null) ? 0 : getUpfrontCost().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecurringStandardMonthlyCost() == null) ? 0
                        : getRecurringStandardMonthlyCost().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPurchaseRecommendationDetail == false)
            return false;
        ReservationPurchaseRecommendationDetail other = (ReservationPurchaseRecommendationDetail) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getInstanceDetails() == null ^ this.getInstanceDetails() == null)
            return false;
        if (other.getInstanceDetails() != null
                && other.getInstanceDetails().equals(this.getInstanceDetails()) == false)
            return false;
        if (other.getRecommendedNumberOfInstancesToPurchase() == null
                ^ this.getRecommendedNumberOfInstancesToPurchase() == null)
            return false;
        if (other.getRecommendedNumberOfInstancesToPurchase() != null
                && other.getRecommendedNumberOfInstancesToPurchase().equals(
                        this.getRecommendedNumberOfInstancesToPurchase()) == false)
            return false;
        if (other.getRecommendedNormalizedUnitsToPurchase() == null
                ^ this.getRecommendedNormalizedUnitsToPurchase() == null)
            return false;
        if (other.getRecommendedNormalizedUnitsToPurchase() != null
                && other.getRecommendedNormalizedUnitsToPurchase().equals(
                        this.getRecommendedNormalizedUnitsToPurchase()) == false)
            return false;
        if (other.getMinimumNumberOfInstancesUsedPerHour() == null
                ^ this.getMinimumNumberOfInstancesUsedPerHour() == null)
            return false;
        if (other.getMinimumNumberOfInstancesUsedPerHour() != null
                && other.getMinimumNumberOfInstancesUsedPerHour().equals(
                        this.getMinimumNumberOfInstancesUsedPerHour()) == false)
            return false;
        if (other.getMinimumNormalizedUnitsUsedPerHour() == null
                ^ this.getMinimumNormalizedUnitsUsedPerHour() == null)
            return false;
        if (other.getMinimumNormalizedUnitsUsedPerHour() != null
                && other.getMinimumNormalizedUnitsUsedPerHour().equals(
                        this.getMinimumNormalizedUnitsUsedPerHour()) == false)
            return false;
        if (other.getMaximumNumberOfInstancesUsedPerHour() == null
                ^ this.getMaximumNumberOfInstancesUsedPerHour() == null)
            return false;
        if (other.getMaximumNumberOfInstancesUsedPerHour() != null
                && other.getMaximumNumberOfInstancesUsedPerHour().equals(
                        this.getMaximumNumberOfInstancesUsedPerHour()) == false)
            return false;
        if (other.getMaximumNormalizedUnitsUsedPerHour() == null
                ^ this.getMaximumNormalizedUnitsUsedPerHour() == null)
            return false;
        if (other.getMaximumNormalizedUnitsUsedPerHour() != null
                && other.getMaximumNormalizedUnitsUsedPerHour().equals(
                        this.getMaximumNormalizedUnitsUsedPerHour()) == false)
            return false;
        if (other.getAverageNumberOfInstancesUsedPerHour() == null
                ^ this.getAverageNumberOfInstancesUsedPerHour() == null)
            return false;
        if (other.getAverageNumberOfInstancesUsedPerHour() != null
                && other.getAverageNumberOfInstancesUsedPerHour().equals(
                        this.getAverageNumberOfInstancesUsedPerHour()) == false)
            return false;
        if (other.getAverageNormalizedUnitsUsedPerHour() == null
                ^ this.getAverageNormalizedUnitsUsedPerHour() == null)
            return false;
        if (other.getAverageNormalizedUnitsUsedPerHour() != null
                && other.getAverageNormalizedUnitsUsedPerHour().equals(
                        this.getAverageNormalizedUnitsUsedPerHour()) == false)
            return false;
        if (other.getAverageUtilization() == null ^ this.getAverageUtilization() == null)
            return false;
        if (other.getAverageUtilization() != null
                && other.getAverageUtilization().equals(this.getAverageUtilization()) == false)
            return false;
        if (other.getEstimatedBreakEvenInMonths() == null
                ^ this.getEstimatedBreakEvenInMonths() == null)
            return false;
        if (other.getEstimatedBreakEvenInMonths() != null
                && other.getEstimatedBreakEvenInMonths().equals(
                        this.getEstimatedBreakEvenInMonths()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() == null
                ^ this.getEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() != null
                && other.getEstimatedMonthlySavingsAmount().equals(
                        this.getEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsPercentage() == null
                ^ this.getEstimatedMonthlySavingsPercentage() == null)
            return false;
        if (other.getEstimatedMonthlySavingsPercentage() != null
                && other.getEstimatedMonthlySavingsPercentage().equals(
                        this.getEstimatedMonthlySavingsPercentage()) == false)
            return false;
        if (other.getEstimatedMonthlyOnDemandCost() == null
                ^ this.getEstimatedMonthlyOnDemandCost() == null)
            return false;
        if (other.getEstimatedMonthlyOnDemandCost() != null
                && other.getEstimatedMonthlyOnDemandCost().equals(
                        this.getEstimatedMonthlyOnDemandCost()) == false)
            return false;
        if (other.getEstimatedReservationCostForLookbackPeriod() == null
                ^ this.getEstimatedReservationCostForLookbackPeriod() == null)
            return false;
        if (other.getEstimatedReservationCostForLookbackPeriod() != null
                && other.getEstimatedReservationCostForLookbackPeriod().equals(
                        this.getEstimatedReservationCostForLookbackPeriod()) == false)
            return false;
        if (other.getUpfrontCost() == null ^ this.getUpfrontCost() == null)
            return false;
        if (other.getUpfrontCost() != null
                && other.getUpfrontCost().equals(this.getUpfrontCost()) == false)
            return false;
        if (other.getRecurringStandardMonthlyCost() == null
                ^ this.getRecurringStandardMonthlyCost() == null)
            return false;
        if (other.getRecurringStandardMonthlyCost() != null
                && other.getRecurringStandardMonthlyCost().equals(
                        this.getRecurringStandardMonthlyCost()) == false)
            return false;
        return true;
    }
}
