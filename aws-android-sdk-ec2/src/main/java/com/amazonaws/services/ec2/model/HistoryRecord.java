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

/**
 * <p>
 * Describes an event in the history of the Spot Fleet request.
 * </p>
 */
public class HistoryRecord implements Serializable {
    /**
     * <p>
     * Information about the event.
     * </p>
     */
    private EventInformation eventInformation;

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - An error with the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - A change in the status or configuration
     * of the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - An instance was launched or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Information</code> - An informational event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error,
     * information
     */
    private String eventType;

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * Information about the event.
     * </p>
     *
     * @return <p>
     *         Information about the event.
     *         </p>
     */
    public EventInformation getEventInformation() {
        return eventInformation;
    }

    /**
     * <p>
     * Information about the event.
     * </p>
     *
     * @param eventInformation <p>
     *            Information about the event.
     *            </p>
     */
    public void setEventInformation(EventInformation eventInformation) {
        this.eventInformation = eventInformation;
    }

    /**
     * <p>
     * Information about the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventInformation <p>
     *            Information about the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoryRecord withEventInformation(EventInformation eventInformation) {
        this.eventInformation = eventInformation;
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - An error with the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - A change in the status or configuration
     * of the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - An instance was launched or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Information</code> - An informational event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error,
     * information
     *
     * @return <p>
     *         The event type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>error</code> - An error with the Spot Fleet request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fleetRequestChange</code> - A change in the status or
     *         configuration of the Spot Fleet request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instanceChange</code> - An instance was launched or
     *         terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Information</code> - An informational event.
     *         </p>
     *         </li>
     *         </ul>
     * @see EventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - An error with the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - A change in the status or configuration
     * of the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - An instance was launched or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Information</code> - An informational event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error,
     * information
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>error</code> - An error with the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fleetRequestChange</code> - A change in the status or
     *            configuration of the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instanceChange</code> - An instance was launched or
     *            terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Information</code> - An informational event.
     *            </p>
     *            </li>
     *            </ul>
     * @see EventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - An error with the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - A change in the status or configuration
     * of the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - An instance was launched or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Information</code> - An informational event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error,
     * information
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>error</code> - An error with the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fleetRequestChange</code> - A change in the status or
     *            configuration of the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instanceChange</code> - An instance was launched or
     *            terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Information</code> - An informational event.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventType
     */
    public HistoryRecord withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - An error with the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - A change in the status or configuration
     * of the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - An instance was launched or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Information</code> - An informational event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error,
     * information
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>error</code> - An error with the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fleetRequestChange</code> - A change in the status or
     *            configuration of the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instanceChange</code> - An instance was launched or
     *            terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Information</code> - An informational event.
     *            </p>
     *            </li>
     *            </ul>
     * @see EventType
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code> - An error with the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetRequestChange</code> - A change in the status or configuration
     * of the Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instanceChange</code> - An instance was launched or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Information</code> - An informational event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error,
     * information
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>error</code> - An error with the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fleetRequestChange</code> - A change in the status or
     *            configuration of the Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instanceChange</code> - An instance was launched or
     *            terminated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Information</code> - An informational event.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventType
     */
    public HistoryRecord withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @return <p>
     *         The date and time of the event, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     *
     * @param timestamp <p>
     *            The date and time of the event, in UTC format (for example,
     *            <i>
     *            YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time of the event, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The date and time of the event, in UTC format (for example,
     *            <i>
     *            YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HistoryRecord withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getEventInformation() != null)
            sb.append("EventInformation: " + getEventInformation() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventInformation() == null) ? 0 : getEventInformation().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoryRecord == false)
            return false;
        HistoryRecord other = (HistoryRecord) obj;

        if (other.getEventInformation() == null ^ this.getEventInformation() == null)
            return false;
        if (other.getEventInformation() != null
                && other.getEventInformation().equals(this.getEventInformation()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
