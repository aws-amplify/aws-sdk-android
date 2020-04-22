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
 * Describes a reserved node. You can call the
 * <a>DescribeReservedNodeOfferings</a> API to obtain the available reserved
 * node offerings.
 * </p>
 */
public class ReservedNode implements Serializable {
    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     */
    private String reservedNodeId;

    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     */
    private String reservedNodeOfferingId;

    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering
     * for a duration. This is the start time of that duration.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     */
    private Double fixedPrice;

    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     */
    private Double usagePrice;

    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     */
    private Integer nodeCount;

    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the
     * sale has been approved, but payment has not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved
     * node.
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * The anticipated utilization of the reserved node, as defined in the
     * reserved node offering.
     * </p>
     */
    private String offeringType;

    /**
     * <p>
     * The recurring charges for the reserved node.
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
     * The unique identifier for the reservation.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the reservation.
     *         </p>
     */
    public String getReservedNodeId() {
        return reservedNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     *
     * @param reservedNodeId <p>
     *            The unique identifier for the reservation.
     *            </p>
     */
    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeId <p>
     *            The unique identifier for the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
        return this;
    }

    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     *
     * @return <p>
     *         The identifier for the reserved node offering.
     *         </p>
     */
    public String getReservedNodeOfferingId() {
        return reservedNodeOfferingId;
    }

    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     *
     * @param reservedNodeOfferingId <p>
     *            The identifier for the reserved node offering.
     *            </p>
     */
    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }

    /**
     * <p>
     * The identifier for the reserved node offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeOfferingId <p>
     *            The identifier for the reserved node offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
        return this;
    }

    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     *
     * @return <p>
     *         The node type of the reserved node.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     *
     * @param nodeType <p>
     *            The node type of the reserved node.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type of the reserved node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The node type of the reserved node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering
     * for a duration. This is the start time of that duration.
     * </p>
     *
     * @return <p>
     *         The time the reservation started. You purchase a reserved node
     *         offering for a duration. This is the start time of that duration.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering
     * for a duration. This is the start time of that duration.
     * </p>
     *
     * @param startTime <p>
     *            The time the reservation started. You purchase a reserved node
     *            offering for a duration. This is the start time of that
     *            duration.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started. You purchase a reserved node offering
     * for a duration. This is the start time of that duration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time the reservation started. You purchase a reserved node
     *            offering for a duration. This is the start time of that
     *            duration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     *
     * @return <p>
     *         The duration of the node reservation in seconds.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     *
     * @param duration <p>
     *            The duration of the node reservation in seconds.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the node reservation in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the node reservation in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     *
     * @return <p>
     *         The fixed cost Amazon Redshift charges you for this reserved
     *         node.
     *         </p>
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }

    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     *
     * @param fixedPrice <p>
     *            The fixed cost Amazon Redshift charges you for this reserved
     *            node.
     *            </p>
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed cost Amazon Redshift charges you for this reserved node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice <p>
     *            The fixed cost Amazon Redshift charges you for this reserved
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     *
     * @return <p>
     *         The hourly rate Amazon Redshift charges you for this reserved
     *         node.
     *         </p>
     */
    public Double getUsagePrice() {
        return usagePrice;
    }

    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     *
     * @param usagePrice <p>
     *            The hourly rate Amazon Redshift charges you for this reserved
     *            node.
     *            </p>
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly rate Amazon Redshift charges you for this reserved node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice <p>
     *            The hourly rate Amazon Redshift charges you for this reserved
     *            node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     *
     * @return <p>
     *         The currency code for the reserved cluster.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     *
     * @param currencyCode <p>
     *            The currency code for the reserved cluster.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currencyCode <p>
     *            The currency code for the reserved cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     *
     * @return <p>
     *         The number of reserved compute nodes.
     *         </p>
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     *
     * @param nodeCount <p>
     *            The number of reserved compute nodes.
     *            </p>
     */
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of reserved compute nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeCount <p>
     *            The number of reserved compute nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the
     * sale has been approved, but payment has not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved
     * node.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The state of the reserved compute node.
     *         </p>
     *         <p>
     *         Possible Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         pending-payment-This reserved node has recently been purchased,
     *         and the sale has been approved, but payment has not yet been
     *         confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         active-This reserved node is owned by the caller and is available
     *         for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         payment-failed-Payment failed for the purchase attempt.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         retired-The reserved node is no longer available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         exchanging-The owner is exchanging the reserved node for another
     *         reserved node.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the
     * sale has been approved, but payment has not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved
     * node.
     * </p>
     * </li>
     * </ul>
     *
     * @param state <p>
     *            The state of the reserved compute node.
     *            </p>
     *            <p>
     *            Possible Values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            pending-payment-This reserved node has recently been
     *            purchased, and the sale has been approved, but payment has not
     *            yet been confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            active-This reserved node is owned by the caller and is
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            payment-failed-Payment failed for the purchase attempt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            retired-The reserved node is no longer available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            exchanging-The owner is exchanging the reserved node for
     *            another reserved node.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved compute node.
     * </p>
     * <p>
     * Possible Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * pending-payment-This reserved node has recently been purchased, and the
     * sale has been approved, but payment has not yet been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * active-This reserved node is owned by the caller and is available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * payment-failed-Payment failed for the purchase attempt.
     * </p>
     * </li>
     * <li>
     * <p>
     * retired-The reserved node is no longer available.
     * </p>
     * </li>
     * <li>
     * <p>
     * exchanging-The owner is exchanging the reserved node for another reserved
     * node.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the reserved compute node.
     *            </p>
     *            <p>
     *            Possible Values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            pending-payment-This reserved node has recently been
     *            purchased, and the sale has been approved, but payment has not
     *            yet been confirmed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            active-This reserved node is owned by the caller and is
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            payment-failed-Payment failed for the purchase attempt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            retired-The reserved node is no longer available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            exchanging-The owner is exchanging the reserved node for
     *            another reserved node.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withState(String state) {
        this.state = state;
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
    public ReservedNode withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * The recurring charges for the reserved node.
     * </p>
     *
     * @return <p>
     *         The recurring charges for the reserved node.
     *         </p>
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring charges for the reserved node.
     * </p>
     *
     * @param recurringCharges <p>
     *            The recurring charges for the reserved node.
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
     * The recurring charges for the reserved node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring charges for the reserved node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withRecurringCharges(RecurringCharge... recurringCharges) {
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
     * The recurring charges for the reserved node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring charges for the reserved node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedNode withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
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
    public ReservedNode withReservedNodeOfferingType(String reservedNodeOfferingType) {
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
    public ReservedNode withReservedNodeOfferingType(
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
        if (getReservedNodeId() != null)
            sb.append("ReservedNodeId: " + getReservedNodeId() + ",");
        if (getReservedNodeOfferingId() != null)
            sb.append("ReservedNodeOfferingId: " + getReservedNodeOfferingId() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
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
        if (getNodeCount() != null)
            sb.append("NodeCount: " + getNodeCount() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
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

        hashCode = prime * hashCode
                + ((getReservedNodeId() == null) ? 0 : getReservedNodeId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId()
                        .hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
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

        if (obj instanceof ReservedNode == false)
            return false;
        ReservedNode other = (ReservedNode) obj;

        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null)
            return false;
        if (other.getReservedNodeId() != null
                && other.getReservedNodeId().equals(this.getReservedNodeId()) == false)
            return false;
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null)
            return false;
        if (other.getReservedNodeOfferingId() != null
                && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
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
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null
                && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
