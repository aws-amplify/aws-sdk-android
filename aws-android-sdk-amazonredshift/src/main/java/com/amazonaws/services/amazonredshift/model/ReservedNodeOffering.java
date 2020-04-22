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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a reserved node offering.
 * </p>
 */
public class ReservedNodeOffering implements Serializable {
    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedNodeOfferingId;

    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * node offering.
     * </p>
     */
    private Double fixedPrice;

    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     * </p>
     */
    private Double usagePrice;

    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Regular, Upgradable
     */
    private String reservedNodeOfferingType;

    /**
     * <p>
     * The offering identifier.
     * </p>
     *
     * @return <p>
     *         The offering identifier.
     *         </p>
     */
    public String getReservedNodeOfferingId() {
        return reservedNodeOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     *
     * @param reservedNodeOfferingId <p>
     *            The offering identifier.
     *            </p>
     */
    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeOfferingId <p>
     *            The offering identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
        return this;
    }

    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     *
     * @return <p>
     *         The node type offered by the reserved node offering.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     *
     * @param nodeType <p>
     *            The node type offered by the reserved node offering.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type offered by the reserved node offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type offered by the reserved node offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     *
     * @return <p>
     *         The duration, in seconds, for which the offering will reserve the
     *         node.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     *
     * @param duration <p>
     *            The duration, in seconds, for which the offering will reserve
     *            the node.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration, in seconds, for which the offering will reserve
     *            the node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * node offering.
     * </p>
     *
     * @return <p>
     *         The upfront fixed charge you will pay to purchase the specific
     *         reserved node offering.
     *         </p>
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * node offering.
     * </p>
     *
     * @param fixedPrice <p>
     *            The upfront fixed charge you will pay to purchase the specific
     *            reserved node offering.
     *            </p>
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * node offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice <p>
     *            The upfront fixed charge you will pay to purchase the specific
     *            reserved node offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     * </p>
     *
     * @return <p>
     *         The rate you are charged for each hour the cluster that is using
     *         the offering is running.
     *         </p>
     */
    public Double getUsagePrice() {
        return usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     * </p>
     *
     * @param usagePrice <p>
     *            The rate you are charged for each hour the cluster that is
     *            using the offering is running.
     *            </p>
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour the cluster that is using the
     * offering is running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice <p>
     *            The rate you are charged for each hour the cluster that is
     *            using the offering is running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     *
     * @return <p>
     *         The currency code for the compute nodes offering.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     *
     * @param currencyCode <p>
     *            The currency code for the compute nodes offering.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the compute nodes offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currencyCode <p>
     *            The currency code for the compute nodes offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     * </p>
     *
     * @return <p>
     *         The anticipated utilization of the reserved node, as defined in
     *         the reserved node offering.
     *         </p>
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     * </p>
     *
     * @param offeringType <p>
     *            The anticipated utilization of the reserved node, as defined
     *            in the reserved node offering.
     *            </p>
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringType <p>
     *            The anticipated utilization of the reserved node, as defined
     *            in the reserved node offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     * </p>
     *
     * @return <p>
     *         The charge to your account regardless of whether you are creating
     *         any clusters using the node offering. Recurring charges are only
     *         in effect for heavy-utilization reserved nodes.
     *         </p>
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     * </p>
     *
     * @param recurringCharges <p>
     *            The charge to your account regardless of whether you are
     *            creating any clusters using the node offering. Recurring
     *            charges are only in effect for heavy-utilization reserved
     *            nodes.
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
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The charge to your account regardless of whether you are
     *            creating any clusters using the node offering. Recurring
     *            charges are only in effect for heavy-utilization reserved
     *            nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withRecurringCharges(RecurringCharge... recurringCharges) {
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
     * The charge to your account regardless of whether you are creating any
     * clusters using the node offering. Recurring charges are only in effect
     * for heavy-utilization reserved nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The charge to your account regardless of whether you are
     *            creating any clusters using the node offering. Recurring
     *            charges are only in effect for heavy-utilization reserved
     *            nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNodeOffering withRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Regular, Upgradable
     *
     * @return <p/>
     * @see ReservedNodeOfferingType
     */
    public String getReservedNodeOfferingType() {
        return reservedNodeOfferingType;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Regular, Upgradable
     *
     * @param reservedNodeOfferingType <p/>
     * @see ReservedNodeOfferingType
     */
    public void setReservedNodeOfferingType(String reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Regular, Upgradable
     *
     * @param reservedNodeOfferingType <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservedNodeOfferingType
     */
    public ReservedNodeOffering withReservedNodeOfferingType(String reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Regular, Upgradable
     *
     * @param reservedNodeOfferingType <p/>
     * @see ReservedNodeOfferingType
     */
    public void setReservedNodeOfferingType(ReservedNodeOfferingType reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Regular, Upgradable
     *
     * @param reservedNodeOfferingType <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservedNodeOfferingType
     */
    public ReservedNodeOffering withReservedNodeOfferingType(
            ReservedNodeOfferingType reservedNodeOfferingType) {
        this.reservedNodeOfferingType = reservedNodeOfferingType.toString();
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
        if (getReservedNodeOfferingId() != null)
            sb.append("ReservedNodeOfferingId: " + getReservedNodeOfferingId() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges() + ",");
        if (getReservedNodeOfferingType() != null)
            sb.append("ReservedNodeOfferingType: " + getReservedNodeOfferingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId()
                        .hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode
                + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedNodeOfferingType() == null) ? 0 : getReservedNodeOfferingType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedNodeOffering == false)
            return false;
        ReservedNodeOffering other = (ReservedNodeOffering) obj;

        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null)
            return false;
        if (other.getReservedNodeOfferingId() != null
                && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
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
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null
                && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getReservedNodeOfferingType() == null
                ^ this.getReservedNodeOfferingType() == null)
            return false;
        if (other.getReservedNodeOfferingType() != null
                && other.getReservedNodeOfferingType().equals(this.getReservedNodeOfferingType()) == false)
            return false;
        return true;
    }
}
