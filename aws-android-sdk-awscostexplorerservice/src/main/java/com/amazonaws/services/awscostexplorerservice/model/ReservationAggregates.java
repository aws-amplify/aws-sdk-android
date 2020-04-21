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
 * The aggregated numbers for your reservation usage.
 * </p>
 */
public class ReservationAggregates implements Serializable {
    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     */
    private String utilizationPercentage;

    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     */
    private String utilizationPercentageInUnits;

    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     */
    private String purchasedHours;

    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     */
    private String purchasedUnits;

    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     */
    private String totalActualHours;

    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     */
    private String totalActualUnits;

    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     */
    private String unusedHours;

    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     */
    private String unusedUnits;

    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     */
    private String onDemandCostOfRIHoursUsed;

    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS
     * calculates this by subtracting <code>TotalAmortizedFee</code> from
     * <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     */
    private String netRISavings;

    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     */
    private String totalPotentialRISavings;

    /**
     * <p>
     * The upfront cost of your reservation, amortized over the reservation
     * period.
     * </p>
     */
    private String amortizedUpfrontFee;

    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation
     * period.
     * </p>
     */
    private String amortizedRecurringFee;

    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation
     * period.
     * </p>
     */
    private String totalAmortizedFee;

    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     *
     * @return <p>
     *         The percentage of reservation time that you used.
     *         </p>
     */
    public String getUtilizationPercentage() {
        return utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     *
     * @param utilizationPercentage <p>
     *            The percentage of reservation time that you used.
     *            </p>
     */
    public void setUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
    }

    /**
     * <p>
     * The percentage of reservation time that you used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utilizationPercentage <p>
     *            The percentage of reservation time that you used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
        return this;
    }

    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @return <p>
     *         The percentage of Amazon EC2 reservation time that you used,
     *         converted to normalized units. Normalized units are available
     *         only for Amazon EC2 usage after November 11, 2017.
     *         </p>
     */
    public String getUtilizationPercentageInUnits() {
        return utilizationPercentageInUnits;
    }

    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @param utilizationPercentageInUnits <p>
     *            The percentage of Amazon EC2 reservation time that you used,
     *            converted to normalized units. Normalized units are available
     *            only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     */
    public void setUtilizationPercentageInUnits(String utilizationPercentageInUnits) {
        this.utilizationPercentageInUnits = utilizationPercentageInUnits;
    }

    /**
     * <p>
     * The percentage of Amazon EC2 reservation time that you used, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utilizationPercentageInUnits <p>
     *            The percentage of Amazon EC2 reservation time that you used,
     *            converted to normalized units. Normalized units are available
     *            only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withUtilizationPercentageInUnits(
            String utilizationPercentageInUnits) {
        this.utilizationPercentageInUnits = utilizationPercentageInUnits;
        return this;
    }

    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     *
     * @return <p>
     *         How many reservation hours that you purchased.
     *         </p>
     */
    public String getPurchasedHours() {
        return purchasedHours;
    }

    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     *
     * @param purchasedHours <p>
     *            How many reservation hours that you purchased.
     *            </p>
     */
    public void setPurchasedHours(String purchasedHours) {
        this.purchasedHours = purchasedHours;
    }

    /**
     * <p>
     * How many reservation hours that you purchased.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchasedHours <p>
     *            How many reservation hours that you purchased.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withPurchasedHours(String purchasedHours) {
        this.purchasedHours = purchasedHours;
        return this;
    }

    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @return <p>
     *         How many Amazon EC2 reservation hours that you purchased,
     *         converted to normalized units. Normalized units are available
     *         only for Amazon EC2 usage after November 11, 2017.
     *         </p>
     */
    public String getPurchasedUnits() {
        return purchasedUnits;
    }

    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @param purchasedUnits <p>
     *            How many Amazon EC2 reservation hours that you purchased,
     *            converted to normalized units. Normalized units are available
     *            only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     */
    public void setPurchasedUnits(String purchasedUnits) {
        this.purchasedUnits = purchasedUnits;
    }

    /**
     * <p>
     * How many Amazon EC2 reservation hours that you purchased, converted to
     * normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchasedUnits <p>
     *            How many Amazon EC2 reservation hours that you purchased,
     *            converted to normalized units. Normalized units are available
     *            only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withPurchasedUnits(String purchasedUnits) {
        this.purchasedUnits = purchasedUnits;
        return this;
    }

    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     *
     * @return <p>
     *         The total number of reservation hours that you used.
     *         </p>
     */
    public String getTotalActualHours() {
        return totalActualHours;
    }

    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     *
     * @param totalActualHours <p>
     *            The total number of reservation hours that you used.
     *            </p>
     */
    public void setTotalActualHours(String totalActualHours) {
        this.totalActualHours = totalActualHours;
    }

    /**
     * <p>
     * The total number of reservation hours that you used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalActualHours <p>
     *            The total number of reservation hours that you used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withTotalActualHours(String totalActualHours) {
        this.totalActualHours = totalActualHours;
        return this;
    }

    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @return <p>
     *         The total number of Amazon EC2 reservation hours that you used,
     *         converted to normalized units. Normalized units are available
     *         only for Amazon EC2 usage after November 11, 2017.
     *         </p>
     */
    public String getTotalActualUnits() {
        return totalActualUnits;
    }

    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @param totalActualUnits <p>
     *            The total number of Amazon EC2 reservation hours that you
     *            used, converted to normalized units. Normalized units are
     *            available only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     */
    public void setTotalActualUnits(String totalActualUnits) {
        this.totalActualUnits = totalActualUnits;
    }

    /**
     * <p>
     * The total number of Amazon EC2 reservation hours that you used, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalActualUnits <p>
     *            The total number of Amazon EC2 reservation hours that you
     *            used, converted to normalized units. Normalized units are
     *            available only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withTotalActualUnits(String totalActualUnits) {
        this.totalActualUnits = totalActualUnits;
        return this;
    }

    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     *
     * @return <p>
     *         The number of reservation hours that you didn't use.
     *         </p>
     */
    public String getUnusedHours() {
        return unusedHours;
    }

    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     *
     * @param unusedHours <p>
     *            The number of reservation hours that you didn't use.
     *            </p>
     */
    public void setUnusedHours(String unusedHours) {
        this.unusedHours = unusedHours;
    }

    /**
     * <p>
     * The number of reservation hours that you didn't use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unusedHours <p>
     *            The number of reservation hours that you didn't use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withUnusedHours(String unusedHours) {
        this.unusedHours = unusedHours;
        return this;
    }

    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @return <p>
     *         The number of Amazon EC2 reservation hours that you didn't use,
     *         converted to normalized units. Normalized units are available
     *         only for Amazon EC2 usage after November 11, 2017.
     *         </p>
     */
    public String getUnusedUnits() {
        return unusedUnits;
    }

    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     *
     * @param unusedUnits <p>
     *            The number of Amazon EC2 reservation hours that you didn't
     *            use, converted to normalized units. Normalized units are
     *            available only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     */
    public void setUnusedUnits(String unusedUnits) {
        this.unusedUnits = unusedUnits;
    }

    /**
     * <p>
     * The number of Amazon EC2 reservation hours that you didn't use, converted
     * to normalized units. Normalized units are available only for Amazon EC2
     * usage after November 11, 2017.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unusedUnits <p>
     *            The number of Amazon EC2 reservation hours that you didn't
     *            use, converted to normalized units. Normalized units are
     *            available only for Amazon EC2 usage after November 11, 2017.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withUnusedUnits(String unusedUnits) {
        this.unusedUnits = unusedUnits;
        return this;
    }

    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     *
     * @return <p>
     *         How much your reservation would cost if charged On-Demand rates.
     *         </p>
     */
    public String getOnDemandCostOfRIHoursUsed() {
        return onDemandCostOfRIHoursUsed;
    }

    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     *
     * @param onDemandCostOfRIHoursUsed <p>
     *            How much your reservation would cost if charged On-Demand
     *            rates.
     *            </p>
     */
    public void setOnDemandCostOfRIHoursUsed(String onDemandCostOfRIHoursUsed) {
        this.onDemandCostOfRIHoursUsed = onDemandCostOfRIHoursUsed;
    }

    /**
     * <p>
     * How much your reservation would cost if charged On-Demand rates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandCostOfRIHoursUsed <p>
     *            How much your reservation would cost if charged On-Demand
     *            rates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withOnDemandCostOfRIHoursUsed(String onDemandCostOfRIHoursUsed) {
        this.onDemandCostOfRIHoursUsed = onDemandCostOfRIHoursUsed;
        return this;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS
     * calculates this by subtracting <code>TotalAmortizedFee</code> from
     * <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     *
     * @return <p>
     *         How much you saved due to purchasing and utilizing reservation.
     *         AWS calculates this by subtracting <code>TotalAmortizedFee</code>
     *         from <code>OnDemandCostOfRIHoursUsed</code>.
     *         </p>
     */
    public String getNetRISavings() {
        return netRISavings;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS
     * calculates this by subtracting <code>TotalAmortizedFee</code> from
     * <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     *
     * @param netRISavings <p>
     *            How much you saved due to purchasing and utilizing
     *            reservation. AWS calculates this by subtracting
     *            <code>TotalAmortizedFee</code> from
     *            <code>OnDemandCostOfRIHoursUsed</code>.
     *            </p>
     */
    public void setNetRISavings(String netRISavings) {
        this.netRISavings = netRISavings;
    }

    /**
     * <p>
     * How much you saved due to purchasing and utilizing reservation. AWS
     * calculates this by subtracting <code>TotalAmortizedFee</code> from
     * <code>OnDemandCostOfRIHoursUsed</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param netRISavings <p>
     *            How much you saved due to purchasing and utilizing
     *            reservation. AWS calculates this by subtracting
     *            <code>TotalAmortizedFee</code> from
     *            <code>OnDemandCostOfRIHoursUsed</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withNetRISavings(String netRISavings) {
        this.netRISavings = netRISavings;
        return this;
    }

    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     *
     * @return <p>
     *         How much you could save if you use your entire reservation.
     *         </p>
     */
    public String getTotalPotentialRISavings() {
        return totalPotentialRISavings;
    }

    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     *
     * @param totalPotentialRISavings <p>
     *            How much you could save if you use your entire reservation.
     *            </p>
     */
    public void setTotalPotentialRISavings(String totalPotentialRISavings) {
        this.totalPotentialRISavings = totalPotentialRISavings;
    }

    /**
     * <p>
     * How much you could save if you use your entire reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalPotentialRISavings <p>
     *            How much you could save if you use your entire reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withTotalPotentialRISavings(String totalPotentialRISavings) {
        this.totalPotentialRISavings = totalPotentialRISavings;
        return this;
    }

    /**
     * <p>
     * The upfront cost of your reservation, amortized over the reservation
     * period.
     * </p>
     *
     * @return <p>
     *         The upfront cost of your reservation, amortized over the
     *         reservation period.
     *         </p>
     */
    public String getAmortizedUpfrontFee() {
        return amortizedUpfrontFee;
    }

    /**
     * <p>
     * The upfront cost of your reservation, amortized over the reservation
     * period.
     * </p>
     *
     * @param amortizedUpfrontFee <p>
     *            The upfront cost of your reservation, amortized over the
     *            reservation period.
     *            </p>
     */
    public void setAmortizedUpfrontFee(String amortizedUpfrontFee) {
        this.amortizedUpfrontFee = amortizedUpfrontFee;
    }

    /**
     * <p>
     * The upfront cost of your reservation, amortized over the reservation
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amortizedUpfrontFee <p>
     *            The upfront cost of your reservation, amortized over the
     *            reservation period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withAmortizedUpfrontFee(String amortizedUpfrontFee) {
        this.amortizedUpfrontFee = amortizedUpfrontFee;
        return this;
    }

    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation
     * period.
     * </p>
     *
     * @return <p>
     *         The monthly cost of your reservation, amortized over the
     *         reservation period.
     *         </p>
     */
    public String getAmortizedRecurringFee() {
        return amortizedRecurringFee;
    }

    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation
     * period.
     * </p>
     *
     * @param amortizedRecurringFee <p>
     *            The monthly cost of your reservation, amortized over the
     *            reservation period.
     *            </p>
     */
    public void setAmortizedRecurringFee(String amortizedRecurringFee) {
        this.amortizedRecurringFee = amortizedRecurringFee;
    }

    /**
     * <p>
     * The monthly cost of your reservation, amortized over the reservation
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amortizedRecurringFee <p>
     *            The monthly cost of your reservation, amortized over the
     *            reservation period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withAmortizedRecurringFee(String amortizedRecurringFee) {
        this.amortizedRecurringFee = amortizedRecurringFee;
        return this;
    }

    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation
     * period.
     * </p>
     *
     * @return <p>
     *         The total cost of your reservation, amortized over the
     *         reservation period.
     *         </p>
     */
    public String getTotalAmortizedFee() {
        return totalAmortizedFee;
    }

    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation
     * period.
     * </p>
     *
     * @param totalAmortizedFee <p>
     *            The total cost of your reservation, amortized over the
     *            reservation period.
     *            </p>
     */
    public void setTotalAmortizedFee(String totalAmortizedFee) {
        this.totalAmortizedFee = totalAmortizedFee;
    }

    /**
     * <p>
     * The total cost of your reservation, amortized over the reservation
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalAmortizedFee <p>
     *            The total cost of your reservation, amortized over the
     *            reservation period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationAggregates withTotalAmortizedFee(String totalAmortizedFee) {
        this.totalAmortizedFee = totalAmortizedFee;
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
        if (getUtilizationPercentage() != null)
            sb.append("UtilizationPercentage: " + getUtilizationPercentage() + ",");
        if (getUtilizationPercentageInUnits() != null)
            sb.append("UtilizationPercentageInUnits: " + getUtilizationPercentageInUnits() + ",");
        if (getPurchasedHours() != null)
            sb.append("PurchasedHours: " + getPurchasedHours() + ",");
        if (getPurchasedUnits() != null)
            sb.append("PurchasedUnits: " + getPurchasedUnits() + ",");
        if (getTotalActualHours() != null)
            sb.append("TotalActualHours: " + getTotalActualHours() + ",");
        if (getTotalActualUnits() != null)
            sb.append("TotalActualUnits: " + getTotalActualUnits() + ",");
        if (getUnusedHours() != null)
            sb.append("UnusedHours: " + getUnusedHours() + ",");
        if (getUnusedUnits() != null)
            sb.append("UnusedUnits: " + getUnusedUnits() + ",");
        if (getOnDemandCostOfRIHoursUsed() != null)
            sb.append("OnDemandCostOfRIHoursUsed: " + getOnDemandCostOfRIHoursUsed() + ",");
        if (getNetRISavings() != null)
            sb.append("NetRISavings: " + getNetRISavings() + ",");
        if (getTotalPotentialRISavings() != null)
            sb.append("TotalPotentialRISavings: " + getTotalPotentialRISavings() + ",");
        if (getAmortizedUpfrontFee() != null)
            sb.append("AmortizedUpfrontFee: " + getAmortizedUpfrontFee() + ",");
        if (getAmortizedRecurringFee() != null)
            sb.append("AmortizedRecurringFee: " + getAmortizedRecurringFee() + ",");
        if (getTotalAmortizedFee() != null)
            sb.append("TotalAmortizedFee: " + getTotalAmortizedFee());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getUtilizationPercentage() == null) ? 0 : getUtilizationPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getUtilizationPercentageInUnits() == null) ? 0
                        : getUtilizationPercentageInUnits().hashCode());
        hashCode = prime * hashCode
                + ((getPurchasedHours() == null) ? 0 : getPurchasedHours().hashCode());
        hashCode = prime * hashCode
                + ((getPurchasedUnits() == null) ? 0 : getPurchasedUnits().hashCode());
        hashCode = prime * hashCode
                + ((getTotalActualHours() == null) ? 0 : getTotalActualHours().hashCode());
        hashCode = prime * hashCode
                + ((getTotalActualUnits() == null) ? 0 : getTotalActualUnits().hashCode());
        hashCode = prime * hashCode
                + ((getUnusedHours() == null) ? 0 : getUnusedHours().hashCode());
        hashCode = prime * hashCode
                + ((getUnusedUnits() == null) ? 0 : getUnusedUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandCostOfRIHoursUsed() == null) ? 0 : getOnDemandCostOfRIHoursUsed()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNetRISavings() == null) ? 0 : getNetRISavings().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalPotentialRISavings() == null) ? 0 : getTotalPotentialRISavings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAmortizedUpfrontFee() == null) ? 0 : getAmortizedUpfrontFee().hashCode());
        hashCode = prime
                * hashCode
                + ((getAmortizedRecurringFee() == null) ? 0 : getAmortizedRecurringFee().hashCode());
        hashCode = prime * hashCode
                + ((getTotalAmortizedFee() == null) ? 0 : getTotalAmortizedFee().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationAggregates == false)
            return false;
        ReservationAggregates other = (ReservationAggregates) obj;

        if (other.getUtilizationPercentage() == null ^ this.getUtilizationPercentage() == null)
            return false;
        if (other.getUtilizationPercentage() != null
                && other.getUtilizationPercentage().equals(this.getUtilizationPercentage()) == false)
            return false;
        if (other.getUtilizationPercentageInUnits() == null
                ^ this.getUtilizationPercentageInUnits() == null)
            return false;
        if (other.getUtilizationPercentageInUnits() != null
                && other.getUtilizationPercentageInUnits().equals(
                        this.getUtilizationPercentageInUnits()) == false)
            return false;
        if (other.getPurchasedHours() == null ^ this.getPurchasedHours() == null)
            return false;
        if (other.getPurchasedHours() != null
                && other.getPurchasedHours().equals(this.getPurchasedHours()) == false)
            return false;
        if (other.getPurchasedUnits() == null ^ this.getPurchasedUnits() == null)
            return false;
        if (other.getPurchasedUnits() != null
                && other.getPurchasedUnits().equals(this.getPurchasedUnits()) == false)
            return false;
        if (other.getTotalActualHours() == null ^ this.getTotalActualHours() == null)
            return false;
        if (other.getTotalActualHours() != null
                && other.getTotalActualHours().equals(this.getTotalActualHours()) == false)
            return false;
        if (other.getTotalActualUnits() == null ^ this.getTotalActualUnits() == null)
            return false;
        if (other.getTotalActualUnits() != null
                && other.getTotalActualUnits().equals(this.getTotalActualUnits()) == false)
            return false;
        if (other.getUnusedHours() == null ^ this.getUnusedHours() == null)
            return false;
        if (other.getUnusedHours() != null
                && other.getUnusedHours().equals(this.getUnusedHours()) == false)
            return false;
        if (other.getUnusedUnits() == null ^ this.getUnusedUnits() == null)
            return false;
        if (other.getUnusedUnits() != null
                && other.getUnusedUnits().equals(this.getUnusedUnits()) == false)
            return false;
        if (other.getOnDemandCostOfRIHoursUsed() == null
                ^ this.getOnDemandCostOfRIHoursUsed() == null)
            return false;
        if (other.getOnDemandCostOfRIHoursUsed() != null
                && other.getOnDemandCostOfRIHoursUsed().equals(this.getOnDemandCostOfRIHoursUsed()) == false)
            return false;
        if (other.getNetRISavings() == null ^ this.getNetRISavings() == null)
            return false;
        if (other.getNetRISavings() != null
                && other.getNetRISavings().equals(this.getNetRISavings()) == false)
            return false;
        if (other.getTotalPotentialRISavings() == null ^ this.getTotalPotentialRISavings() == null)
            return false;
        if (other.getTotalPotentialRISavings() != null
                && other.getTotalPotentialRISavings().equals(this.getTotalPotentialRISavings()) == false)
            return false;
        if (other.getAmortizedUpfrontFee() == null ^ this.getAmortizedUpfrontFee() == null)
            return false;
        if (other.getAmortizedUpfrontFee() != null
                && other.getAmortizedUpfrontFee().equals(this.getAmortizedUpfrontFee()) == false)
            return false;
        if (other.getAmortizedRecurringFee() == null ^ this.getAmortizedRecurringFee() == null)
            return false;
        if (other.getAmortizedRecurringFee() != null
                && other.getAmortizedRecurringFee().equals(this.getAmortizedRecurringFee()) == false)
            return false;
        if (other.getTotalAmortizedFee() == null ^ this.getTotalAmortizedFee() == null)
            return false;
        if (other.getTotalAmortizedFee() != null
                && other.getTotalAmortizedFee().equals(this.getTotalAmortizedFee()) == false)
            return false;
        return true;
    }
}
