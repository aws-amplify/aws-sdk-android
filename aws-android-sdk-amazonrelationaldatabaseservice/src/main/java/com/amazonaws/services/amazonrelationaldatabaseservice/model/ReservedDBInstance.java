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
 * <code>DescribeReservedDBInstances</code> and
 * <code>PurchaseReservedDBInstancesOffering</code> actions.
 * </p>
 */
public class ReservedDBInstance implements Serializable {
    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     */
    private String reservedDBInstanceId;

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
     * The time the reservation started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     */
    private Double fixedPrice;

    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     */
    private Double usagePrice;

    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     */
    private Integer dBInstanceCount;

    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     */
    private String productDescription;

    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The recurring price charged to run this reserved DB instance.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     */
    private String reservedDBInstanceArn;

    /**
     * <p>
     * The unique identifier for the lease associated with the reserved DB
     * instance.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     */
    private String leaseId;

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the reservation.
     *         </p>
     */
    public String getReservedDBInstanceId() {
        return reservedDBInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     *
     * @param reservedDBInstanceId <p>
     *            The unique identifier for the reservation.
     *            </p>
     */
    public void setReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstanceId <p>
     *            The unique identifier for the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withReservedDBInstanceId(String reservedDBInstanceId) {
        this.reservedDBInstanceId = reservedDBInstanceId;
        return this;
    }

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
    public ReservedDBInstance withReservedDBInstancesOfferingId(String reservedDBInstancesOfferingId) {
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
    public ReservedDBInstance withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     *
     * @return <p>
     *         The time the reservation started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     *
     * @param startTime <p>
     *            The time the reservation started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time the reservation started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     *
     * @return <p>
     *         The duration of the reservation in seconds.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     *
     * @param duration <p>
     *            The duration of the reservation in seconds.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the reservation in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The fixed price charged for this reserved DB instance.
     *         </p>
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     *
     * @param fixedPrice <p>
     *            The fixed price charged for this reserved DB instance.
     *            </p>
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice <p>
     *            The fixed price charged for this reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The hourly price charged for this reserved DB instance.
     *         </p>
     */
    public Double getUsagePrice() {
        return usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     *
     * @param usagePrice <p>
     *            The hourly price charged for this reserved DB instance.
     *            </p>
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice <p>
     *            The hourly price charged for this reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The currency code for the reserved DB instance.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     *
     * @param currencyCode <p>
     *            The currency code for the reserved DB instance.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currencyCode <p>
     *            The currency code for the reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     *
     * @return <p>
     *         The number of reserved DB instances.
     *         </p>
     */
    public Integer getDBInstanceCount() {
        return dBInstanceCount;
    }

    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     *
     * @param dBInstanceCount <p>
     *            The number of reserved DB instances.
     *            </p>
     */
    public void setDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
    }

    /**
     * <p>
     * The number of reserved DB instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceCount <p>
     *            The number of reserved DB instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withDBInstanceCount(Integer dBInstanceCount) {
        this.dBInstanceCount = dBInstanceCount;
        return this;
    }

    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The description of the reserved DB instance.
     *         </p>
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     *
     * @param productDescription <p>
     *            The description of the reserved DB instance.
     *            </p>
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The description of the reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productDescription <p>
     *            The description of the reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The offering type of this reserved DB instance.
     *         </p>
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     *
     * @param offeringType <p>
     *            The offering type of this reserved DB instance.
     *            </p>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringType <p>
     *            The offering type of this reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     *
     * @return <p>
     *         Indicates if the reservation applies to Multi-AZ deployments.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     *
     * @return <p>
     *         Indicates if the reservation applies to Multi-AZ deployments.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     *
     * @param multiAZ <p>
     *            Indicates if the reservation applies to Multi-AZ deployments.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates if the reservation applies to Multi-AZ deployments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            Indicates if the reservation applies to Multi-AZ deployments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The state of the reserved DB instance.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     *
     * @param state <p>
     *            The state of the reserved DB instance.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withState(String state) {
        this.state = state;
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
    public ReservedDBInstance withRecurringCharges(RecurringCharge... recurringCharges) {
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
    public ReservedDBInstance withRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the reserved DB instance.
     *         </p>
     */
    public String getReservedDBInstanceArn() {
        return reservedDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     *
     * @param reservedDBInstanceArn <p>
     *            The Amazon Resource Name (ARN) for the reserved DB instance.
     *            </p>
     */
    public void setReservedDBInstanceArn(String reservedDBInstanceArn) {
        this.reservedDBInstanceArn = reservedDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the reserved DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedDBInstanceArn <p>
     *            The Amazon Resource Name (ARN) for the reserved DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withReservedDBInstanceArn(String reservedDBInstanceArn) {
        this.reservedDBInstanceArn = reservedDBInstanceArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the lease associated with the reserved DB
     * instance.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     *
     * @return <p>
     *         The unique identifier for the lease associated with the reserved
     *         DB instance.
     *         </p>
     *         <note>
     *         <p>
     *         AWS Support might request the lease ID for an issue related to a
     *         reserved DB instance.
     *         </p>
     *         </note>
     */
    public String getLeaseId() {
        return leaseId;
    }

    /**
     * <p>
     * The unique identifier for the lease associated with the reserved DB
     * instance.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     *
     * @param leaseId <p>
     *            The unique identifier for the lease associated with the
     *            reserved DB instance.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Support might request the lease ID for an issue related to
     *            a reserved DB instance.
     *            </p>
     *            </note>
     */
    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    /**
     * <p>
     * The unique identifier for the lease associated with the reserved DB
     * instance.
     * </p>
     * <note>
     * <p>
     * AWS Support might request the lease ID for an issue related to a reserved
     * DB instance.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param leaseId <p>
     *            The unique identifier for the lease associated with the
     *            reserved DB instance.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Support might request the lease ID for an issue related to
     *            a reserved DB instance.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedDBInstance withLeaseId(String leaseId) {
        this.leaseId = leaseId;
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
        if (getReservedDBInstanceId() != null)
            sb.append("ReservedDBInstanceId: " + getReservedDBInstanceId() + ",");
        if (getReservedDBInstancesOfferingId() != null)
            sb.append("ReservedDBInstancesOfferingId: " + getReservedDBInstancesOfferingId() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getDBInstanceCount() != null)
            sb.append("DBInstanceCount: " + getDBInstanceCount() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges() + ",");
        if (getReservedDBInstanceArn() != null)
            sb.append("ReservedDBInstanceArn: " + getReservedDBInstanceArn() + ",");
        if (getLeaseId() != null)
            sb.append("LeaseId: " + getLeaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservedDBInstanceId() == null) ? 0 : getReservedDBInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedDBInstancesOfferingId() == null) ? 0
                        : getReservedDBInstancesOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceCount() == null) ? 0 : getDBInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedDBInstanceArn() == null) ? 0 : getReservedDBInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getLeaseId() == null) ? 0 : getLeaseId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedDBInstance == false)
            return false;
        ReservedDBInstance other = (ReservedDBInstance) obj;

        if (other.getReservedDBInstanceId() == null ^ this.getReservedDBInstanceId() == null)
            return false;
        if (other.getReservedDBInstanceId() != null
                && other.getReservedDBInstanceId().equals(this.getReservedDBInstanceId()) == false)
            return false;
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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
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
        if (other.getDBInstanceCount() == null ^ this.getDBInstanceCount() == null)
            return false;
        if (other.getDBInstanceCount() != null
                && other.getDBInstanceCount().equals(this.getDBInstanceCount()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null
                && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getReservedDBInstanceArn() == null ^ this.getReservedDBInstanceArn() == null)
            return false;
        if (other.getReservedDBInstanceArn() != null
                && other.getReservedDBInstanceArn().equals(this.getReservedDBInstanceArn()) == false)
            return false;
        if (other.getLeaseId() == null ^ this.getLeaseId() == null)
            return false;
        if (other.getLeaseId() != null && other.getLeaseId().equals(this.getLeaseId()) == false)
            return false;
        return true;
    }
}
