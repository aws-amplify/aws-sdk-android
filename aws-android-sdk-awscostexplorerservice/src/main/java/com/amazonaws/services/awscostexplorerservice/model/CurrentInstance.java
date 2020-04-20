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
 * Context about the current instance.
 * </p>
 */
public class CurrentInstance implements Serializable {
    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String resourceId;

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     */
    private java.util.List<TagValues> tags;

    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     */
    private ResourceDetails resourceDetails;

    /**
     * <p>
     * Utilization information of the current instance during the lookback
     * period.
     * </p>
     */
    private ResourceUtilization resourceUtilization;

    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String reservationCoveredHoursInLookbackPeriod;

    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String savingsPlansCoveredHoursInLookbackPeriod;

    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String onDemandHoursInLookbackPeriod;

    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalRunningHoursInLookbackPeriod;

    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String monthlyCost;

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currencyCode;

    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Resource ID of the current instance.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param resourceId <p>
     *            Resource ID of the current instance.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Resource ID of the current instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param resourceId <p>
     *            Resource ID of the current instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     *
     * @return <p>
     *         Cost allocation resource tags applied to the instance.
     *         </p>
     */
    public java.util.List<TagValues> getTags() {
        return tags;
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     *
     * @param tags <p>
     *            Cost allocation resource tags applied to the instance.
     *            </p>
     */
    public void setTags(java.util.Collection<TagValues> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagValues>(tags);
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Cost allocation resource tags applied to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withTags(TagValues... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<TagValues>(tags.length);
        }
        for (TagValues value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Cost allocation resource tags applied to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Cost allocation resource tags applied to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withTags(java.util.Collection<TagValues> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     *
     * @return <p>
     *         Details about the resource and utilization.
     *         </p>
     */
    public ResourceDetails getResourceDetails() {
        return resourceDetails;
    }

    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     *
     * @param resourceDetails <p>
     *            Details about the resource and utilization.
     *            </p>
     */
    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Details about the resource and utilization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceDetails <p>
     *            Details about the resource and utilization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * <p>
     * Utilization information of the current instance during the lookback
     * period.
     * </p>
     *
     * @return <p>
     *         Utilization information of the current instance during the
     *         lookback period.
     *         </p>
     */
    public ResourceUtilization getResourceUtilization() {
        return resourceUtilization;
    }

    /**
     * <p>
     * Utilization information of the current instance during the lookback
     * period.
     * </p>
     *
     * @param resourceUtilization <p>
     *            Utilization information of the current instance during the
     *            lookback period.
     *            </p>
     */
    public void setResourceUtilization(ResourceUtilization resourceUtilization) {
        this.resourceUtilization = resourceUtilization;
    }

    /**
     * <p>
     * Utilization information of the current instance during the lookback
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceUtilization <p>
     *            Utilization information of the current instance during the
     *            lookback period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withResourceUtilization(ResourceUtilization resourceUtilization) {
        this.resourceUtilization = resourceUtilization;
        return this;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Number of hours during the lookback period covered by
     *         reservations.
     *         </p>
     */
    public String getReservationCoveredHoursInLookbackPeriod() {
        return reservationCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param reservationCoveredHoursInLookbackPeriod <p>
     *            Number of hours during the lookback period covered by
     *            reservations.
     *            </p>
     */
    public void setReservationCoveredHoursInLookbackPeriod(
            String reservationCoveredHoursInLookbackPeriod) {
        this.reservationCoveredHoursInLookbackPeriod = reservationCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by reservations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param reservationCoveredHoursInLookbackPeriod <p>
     *            Number of hours during the lookback period covered by
     *            reservations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withReservationCoveredHoursInLookbackPeriod(
            String reservationCoveredHoursInLookbackPeriod) {
        this.reservationCoveredHoursInLookbackPeriod = reservationCoveredHoursInLookbackPeriod;
        return this;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Number of hours during the lookback period covered by Savings
     *         Plans.
     *         </p>
     */
    public String getSavingsPlansCoveredHoursInLookbackPeriod() {
        return savingsPlansCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param savingsPlansCoveredHoursInLookbackPeriod <p>
     *            Number of hours during the lookback period covered by Savings
     *            Plans.
     *            </p>
     */
    public void setSavingsPlansCoveredHoursInLookbackPeriod(
            String savingsPlansCoveredHoursInLookbackPeriod) {
        this.savingsPlansCoveredHoursInLookbackPeriod = savingsPlansCoveredHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period covered by Savings Plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param savingsPlansCoveredHoursInLookbackPeriod <p>
     *            Number of hours during the lookback period covered by Savings
     *            Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withSavingsPlansCoveredHoursInLookbackPeriod(
            String savingsPlansCoveredHoursInLookbackPeriod) {
        this.savingsPlansCoveredHoursInLookbackPeriod = savingsPlansCoveredHoursInLookbackPeriod;
        return this;
    }

    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Number of hours during the lookback period billed at On Demand
     *         rates.
     *         </p>
     */
    public String getOnDemandHoursInLookbackPeriod() {
        return onDemandHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param onDemandHoursInLookbackPeriod <p>
     *            Number of hours during the lookback period billed at On Demand
     *            rates.
     *            </p>
     */
    public void setOnDemandHoursInLookbackPeriod(String onDemandHoursInLookbackPeriod) {
        this.onDemandHoursInLookbackPeriod = onDemandHoursInLookbackPeriod;
    }

    /**
     * <p>
     * Number of hours during the lookback period billed at On Demand rates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param onDemandHoursInLookbackPeriod <p>
     *            Number of hours during the lookback period billed at On Demand
     *            rates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withOnDemandHoursInLookbackPeriod(String onDemandHoursInLookbackPeriod) {
        this.onDemandHoursInLookbackPeriod = onDemandHoursInLookbackPeriod;
        return this;
    }

    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The total number of hours the instance ran during the lookback
     *         period.
     *         </p>
     */
    public String getTotalRunningHoursInLookbackPeriod() {
        return totalRunningHoursInLookbackPeriod;
    }

    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalRunningHoursInLookbackPeriod <p>
     *            The total number of hours the instance ran during the lookback
     *            period.
     *            </p>
     */
    public void setTotalRunningHoursInLookbackPeriod(String totalRunningHoursInLookbackPeriod) {
        this.totalRunningHoursInLookbackPeriod = totalRunningHoursInLookbackPeriod;
    }

    /**
     * <p>
     * The total number of hours the instance ran during the lookback period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalRunningHoursInLookbackPeriod <p>
     *            The total number of hours the instance ran during the lookback
     *            period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withTotalRunningHoursInLookbackPeriod(
            String totalRunningHoursInLookbackPeriod) {
        this.totalRunningHoursInLookbackPeriod = totalRunningHoursInLookbackPeriod;
        return this;
    }

    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Current On Demand cost of operating this instance on a monthly
     *         basis.
     *         </p>
     */
    public String getMonthlyCost() {
        return monthlyCost;
    }

    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param monthlyCost <p>
     *            Current On Demand cost of operating this instance on a monthly
     *            basis.
     *            </p>
     */
    public void setMonthlyCost(String monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    /**
     * <p>
     * Current On Demand cost of operating this instance on a monthly basis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param monthlyCost <p>
     *            Current On Demand cost of operating this instance on a monthly
     *            basis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withMonthlyCost(String monthlyCost) {
        this.monthlyCost = monthlyCost;
        return this;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The currency code that Amazon Web Services used to calculate the
     *         costs for this instance.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code that Amazon Web Services used to calculate
     *            the costs for this instance.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code that Amazon Web Services used to calculate the costs
     * for this instance.
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
     *            The currency code that Amazon Web Services used to calculate
     *            the costs for this instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CurrentInstance withCurrencyCode(String currencyCode) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: " + getResourceDetails() + ",");
        if (getResourceUtilization() != null)
            sb.append("ResourceUtilization: " + getResourceUtilization() + ",");
        if (getReservationCoveredHoursInLookbackPeriod() != null)
            sb.append("ReservationCoveredHoursInLookbackPeriod: "
                    + getReservationCoveredHoursInLookbackPeriod() + ",");
        if (getSavingsPlansCoveredHoursInLookbackPeriod() != null)
            sb.append("SavingsPlansCoveredHoursInLookbackPeriod: "
                    + getSavingsPlansCoveredHoursInLookbackPeriod() + ",");
        if (getOnDemandHoursInLookbackPeriod() != null)
            sb.append("OnDemandHoursInLookbackPeriod: " + getOnDemandHoursInLookbackPeriod() + ",");
        if (getTotalRunningHoursInLookbackPeriod() != null)
            sb.append("TotalRunningHoursInLookbackPeriod: "
                    + getTotalRunningHoursInLookbackPeriod() + ",");
        if (getMonthlyCost() != null)
            sb.append("MonthlyCost: " + getMonthlyCost() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode
                + ((getResourceUtilization() == null) ? 0 : getResourceUtilization().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservationCoveredHoursInLookbackPeriod() == null) ? 0
                        : getReservationCoveredHoursInLookbackPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getSavingsPlansCoveredHoursInLookbackPeriod() == null) ? 0
                        : getSavingsPlansCoveredHoursInLookbackPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandHoursInLookbackPeriod() == null) ? 0
                        : getOnDemandHoursInLookbackPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalRunningHoursInLookbackPeriod() == null) ? 0
                        : getTotalRunningHoursInLookbackPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getMonthlyCost() == null) ? 0 : getMonthlyCost().hashCode());
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

        if (obj instanceof CurrentInstance == false)
            return false;
        CurrentInstance other = (CurrentInstance) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null
                && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getResourceUtilization() == null ^ this.getResourceUtilization() == null)
            return false;
        if (other.getResourceUtilization() != null
                && other.getResourceUtilization().equals(this.getResourceUtilization()) == false)
            return false;
        if (other.getReservationCoveredHoursInLookbackPeriod() == null
                ^ this.getReservationCoveredHoursInLookbackPeriod() == null)
            return false;
        if (other.getReservationCoveredHoursInLookbackPeriod() != null
                && other.getReservationCoveredHoursInLookbackPeriod().equals(
                        this.getReservationCoveredHoursInLookbackPeriod()) == false)
            return false;
        if (other.getSavingsPlansCoveredHoursInLookbackPeriod() == null
                ^ this.getSavingsPlansCoveredHoursInLookbackPeriod() == null)
            return false;
        if (other.getSavingsPlansCoveredHoursInLookbackPeriod() != null
                && other.getSavingsPlansCoveredHoursInLookbackPeriod().equals(
                        this.getSavingsPlansCoveredHoursInLookbackPeriod()) == false)
            return false;
        if (other.getOnDemandHoursInLookbackPeriod() == null
                ^ this.getOnDemandHoursInLookbackPeriod() == null)
            return false;
        if (other.getOnDemandHoursInLookbackPeriod() != null
                && other.getOnDemandHoursInLookbackPeriod().equals(
                        this.getOnDemandHoursInLookbackPeriod()) == false)
            return false;
        if (other.getTotalRunningHoursInLookbackPeriod() == null
                ^ this.getTotalRunningHoursInLookbackPeriod() == null)
            return false;
        if (other.getTotalRunningHoursInLookbackPeriod() != null
                && other.getTotalRunningHoursInLookbackPeriod().equals(
                        this.getTotalRunningHoursInLookbackPeriod()) == false)
            return false;
        if (other.getMonthlyCost() == null ^ this.getMonthlyCost() == null)
            return false;
        if (other.getMonthlyCost() != null
                && other.getMonthlyCost().equals(this.getMonthlyCost()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        return true;
    }
}
