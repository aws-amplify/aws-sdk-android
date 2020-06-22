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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies a Capacity Reservation's capacity and the conditions under which it
 * is to be released. You cannot change a Capacity Reservation's instance type,
 * EBS optimization, instance store settings, platform, Availability Zone, or
 * instance eligibility. If you need to modify any of these attributes, we
 * recommend that you cancel the Capacity Reservation, and then create a new one
 * with the required attributes.
 * </p>
 */
public class ModifyCapacityReservationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified
     * time. For example, if you specify 5/31/2019, 13:30:55, the Capacity
     * Reservation is guaranteed to end between 13:30:55 and 14:30:55 on
     * 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it. Do not provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     */
    private String endDateType;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the Capacity Reservation.
     *         </p>
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     *
     * @param capacityReservationId <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     */
    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationId <p>
     *            The ID of the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCapacityReservationRequest withCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     *
     * @return <p>
     *         The number of instances for which to reserve capacity.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances for which to reserve capacity.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances for which to reserve capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCapacityReservationRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified
     * time. For example, if you specify 5/31/2019, 13:30:55, the Capacity
     * Reservation is guaranteed to end between 13:30:55 and 14:30:55 on
     * 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     *
     * @return <p>
     *         The date and time at which the Capacity Reservation expires. When
     *         a Capacity Reservation expires, the reserved capacity is released
     *         and you can no longer launch instances into it. The Capacity
     *         Reservation's state changes to <code>expired</code> when it
     *         reaches its end date and time.
     *         </p>
     *         <p>
     *         The Capacity Reservation is cancelled within an hour from the
     *         specified time. For example, if you specify 5/31/2019, 13:30:55,
     *         the Capacity Reservation is guaranteed to end between 13:30:55
     *         and 14:30:55 on 5/31/2019.
     *         </p>
     *         <p>
     *         You must provide an <code>EndDate</code> value if
     *         <code>EndDateType</code> is <code>limited</code>. Omit
     *         <code>EndDate</code> if <code>EndDateType</code> is
     *         <code>unlimited</code>.
     *         </p>
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified
     * time. For example, if you specify 5/31/2019, 13:30:55, the Capacity
     * Reservation is guaranteed to end between 13:30:55 and 14:30:55 on
     * 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     *
     * @param endDate <p>
     *            The date and time at which the Capacity Reservation expires.
     *            When a Capacity Reservation expires, the reserved capacity is
     *            released and you can no longer launch instances into it. The
     *            Capacity Reservation's state changes to <code>expired</code>
     *            when it reaches its end date and time.
     *            </p>
     *            <p>
     *            The Capacity Reservation is cancelled within an hour from the
     *            specified time. For example, if you specify 5/31/2019,
     *            13:30:55, the Capacity Reservation is guaranteed to end
     *            between 13:30:55 and 14:30:55 on 5/31/2019.
     *            </p>
     *            <p>
     *            You must provide an <code>EndDate</code> value if
     *            <code>EndDateType</code> is <code>limited</code>. Omit
     *            <code>EndDate</code> if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time at which the Capacity Reservation expires. When a
     * Capacity Reservation expires, the reserved capacity is released and you
     * can no longer launch instances into it. The Capacity Reservation's state
     * changes to <code>expired</code> when it reaches its end date and time.
     * </p>
     * <p>
     * The Capacity Reservation is cancelled within an hour from the specified
     * time. For example, if you specify 5/31/2019, 13:30:55, the Capacity
     * Reservation is guaranteed to end between 13:30:55 and 14:30:55 on
     * 5/31/2019.
     * </p>
     * <p>
     * You must provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>limited</code>. Omit
     * <code>EndDate</code> if <code>EndDateType</code> is
     * <code>unlimited</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The date and time at which the Capacity Reservation expires.
     *            When a Capacity Reservation expires, the reserved capacity is
     *            released and you can no longer launch instances into it. The
     *            Capacity Reservation's state changes to <code>expired</code>
     *            when it reaches its end date and time.
     *            </p>
     *            <p>
     *            The Capacity Reservation is cancelled within an hour from the
     *            specified time. For example, if you specify 5/31/2019,
     *            13:30:55, the Capacity Reservation is guaranteed to end
     *            between 13:30:55 and 14:30:55 on 5/31/2019.
     *            </p>
     *            <p>
     *            You must provide an <code>EndDate</code> value if
     *            <code>EndDateType</code> is <code>limited</code>. Omit
     *            <code>EndDate</code> if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCapacityReservationRequest withEndDate(java.util.Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it. Do not provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @return <p>
     *         Indicates the way in which the Capacity Reservation ends. A
     *         Capacity Reservation can have one of the following end types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>unlimited</code> - The Capacity Reservation remains active
     *         until you explicitly cancel it. Do not provide an
     *         <code>EndDate</code> value if <code>EndDateType</code> is
     *         <code>unlimited</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>limited</code> - The Capacity Reservation expires
     *         automatically at a specified date and time. You must provide an
     *         <code>EndDate</code> value if <code>EndDateType</code> is
     *         <code>limited</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see EndDateType
     */
    public String getEndDateType() {
        return endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it. Do not provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>unlimited</code> - The Capacity Reservation remains
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>limited</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see EndDateType
     */
    public void setEndDateType(String endDateType) {
        this.endDateType = endDateType;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it. Do not provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>unlimited</code> - The Capacity Reservation remains
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>limited</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndDateType
     */
    public ModifyCapacityReservationRequest withEndDateType(String endDateType) {
        this.endDateType = endDateType;
        return this;
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it. Do not provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>unlimited</code> - The Capacity Reservation remains
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>limited</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see EndDateType
     */
    public void setEndDateType(EndDateType endDateType) {
        this.endDateType = endDateType.toString();
    }

    /**
     * <p>
     * Indicates the way in which the Capacity Reservation ends. A Capacity
     * Reservation can have one of the following end types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>unlimited</code> - The Capacity Reservation remains active until
     * you explicitly cancel it. Do not provide an <code>EndDate</code> value if
     * <code>EndDateType</code> is <code>unlimited</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>limited</code> - The Capacity Reservation expires automatically at
     * a specified date and time. You must provide an <code>EndDate</code> value
     * if <code>EndDateType</code> is <code>limited</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unlimited, limited
     *
     * @param endDateType <p>
     *            Indicates the way in which the Capacity Reservation ends. A
     *            Capacity Reservation can have one of the following end types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>unlimited</code> - The Capacity Reservation remains
     *            active until you explicitly cancel it. Do not provide an
     *            <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>unlimited</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>limited</code> - The Capacity Reservation expires
     *            automatically at a specified date and time. You must provide
     *            an <code>EndDate</code> value if <code>EndDateType</code> is
     *            <code>limited</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndDateType
     */
    public ModifyCapacityReservationRequest withEndDateType(EndDateType endDateType) {
        this.endDateType = endDateType.toString();
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCapacityReservationRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: " + getCapacityReservationId() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getEndDateType() != null)
            sb.append("EndDateType: " + getEndDateType() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode
                + ((getEndDateType() == null) ? 0 : getEndDateType().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCapacityReservationRequest == false)
            return false;
        ModifyCapacityReservationRequest other = (ModifyCapacityReservationRequest) obj;

        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null
                && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getEndDateType() == null ^ this.getEndDateType() == null)
            return false;
        if (other.getEndDateType() != null
                && other.getEndDateType().equals(this.getEndDateType()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
