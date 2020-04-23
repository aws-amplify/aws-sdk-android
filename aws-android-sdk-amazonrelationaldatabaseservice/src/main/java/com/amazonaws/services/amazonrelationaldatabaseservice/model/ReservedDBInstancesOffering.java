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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeReservedDBInstancesOfferings</code> action.
 * </p>
 */
public class ReservedDBInstancesOffering implements Serializable {
    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedDBInstancesOfferingId;

    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     */
    private Double fixedPrice;

    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     */
    private Double usagePrice;

    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     */
    private String productDescription;

    /**
     * <p>
     * The offering type.
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The offering identifier.
     * </p>
     *
     * @return <p>
     *         The offering identifier.
     *         </p>
     */
    public String getReservedDBInstancesOfferingId() {
        return reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     *
     * @param reservedDBInstancesOfferingId <p>
     *            The offering identifier.
     *            </p>
     */
    public void setReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstancesOfferingId <p>
     *            The offering identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withReservedDBInstancesOfferingId(
            String reservedDBInstancesOfferingId) {
        this.reservedDBInstancesOfferingId = reservedDBInstancesOfferingId;
        return this;
    }

    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The DB instance class for the reserved DB instance.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            The DB instance class for the reserved DB instance.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for the reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            The DB instance class for the reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     *
     * @return <p>
     *         The duration of the offering in seconds.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     *
     * @param duration <p>
     *            The duration of the offering in seconds.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the offering in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the offering in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     *
     * @return <p>
     *         The fixed price charged for this offering.
     *         </p>
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     *
     * @param fixedPrice <p>
     *            The fixed price charged for this offering.
     *            </p>
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice <p>
     *            The fixed price charged for this offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     *
     * @return <p>
     *         The hourly price charged for this offering.
     *         </p>
     */
    public Double getUsagePrice() {
        return usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     *
     * @param usagePrice <p>
     *            The hourly price charged for this offering.
     *            </p>
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice <p>
     *            The hourly price charged for this offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     *
     * @return <p>
     *         The currency code for the reserved DB instance offering.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     *
     * @param currencyCode <p>
     *            The currency code for the reserved DB instance offering.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currencyCode <p>
     *            The currency code for the reserved DB instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     *
     * @return <p>
     *         The database engine used by the offering.
     *         </p>
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     *
     * @param productDescription <p>
     *            The database engine used by the offering.
     *            </p>
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The database engine used by the offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescription <p>
     *            The database engine used by the offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The offering type.
     * </p>
     *
     * @return <p>
     *         The offering type.
     *         </p>
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The offering type.
     * </p>
     *
     * @param offeringType <p>
     *            The offering type.
     *            </p>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringType <p>
     *            The offering type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     *
     * @return <p>
     *         Indicates if the offering applies to Multi-AZ deployments.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     *
     * @return <p>
     *         Indicates if the offering applies to Multi-AZ deployments.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     *
     * @param multiAZ <p>
     *            Indicates if the offering applies to Multi-AZ deployments.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates if the offering applies to Multi-AZ deployments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            Indicates if the offering applies to Multi-AZ deployments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The recurring price charged to run this reserved DB instance.
     *         </p>
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     *
     * @param recurringCharges <p>
     *            The recurring price charged to run this reserved DB instance.
     *            </p>
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring price charged to run this reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) {
            this.recurringCharges = new java.util.ArrayList<RecurringCharge>(
                    recurringCharges.length);
        }
        for (RecurringCharge value : recurringCharges) {
            this.recurringCharges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring price charged to run this reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstancesOffering withRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: " + getReservedDBInstancesOfferingId() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedDBInstancesOfferingId() == null) ? 0
                        : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedDBInstancesOffering == false)
            return false;
        ReservedDBInstancesOffering other = (ReservedDBInstancesOffering) obj;

        if (other.getReservedDBInstancesOfferingId() == null
                ^ this.getReservedDBInstancesOfferingId() == null)
            return false;
        if (other.getReservedDBInstancesOfferingId() != null
                && other.getReservedDBInstancesOfferingId().equals(
                        this.getReservedDBInstancesOfferingId()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null
                && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null
                && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null
                && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        return true;
    }
}
