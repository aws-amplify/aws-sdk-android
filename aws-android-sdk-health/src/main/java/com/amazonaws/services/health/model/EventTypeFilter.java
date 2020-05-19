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

package com.amazonaws.services.health.model;

import java.io.Serializable;

/**
 * <p>
 * The values to use to filter results from the <a>DescribeEventTypes</a>
 * operation.
 * </p>
 */
public class EventTypeFilter implements Serializable {
    /**
     * <p>
     * A list of event type codes.
     * </p>
     */
    private java.util.List<String> eventTypeCodes;

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     */
    private java.util.List<String> services;

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     */
    private java.util.List<String> eventTypeCategories;

    /**
     * <p>
     * A list of event type codes.
     * </p>
     *
     * @return <p>
     *         A list of event type codes.
     *         </p>
     */
    public java.util.List<String> getEventTypeCodes() {
        return eventTypeCodes;
    }

    /**
     * <p>
     * A list of event type codes.
     * </p>
     *
     * @param eventTypeCodes <p>
     *            A list of event type codes.
     *            </p>
     */
    public void setEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        if (eventTypeCodes == null) {
            this.eventTypeCodes = null;
            return;
        }

        this.eventTypeCodes = new java.util.ArrayList<String>(eventTypeCodes);
    }

    /**
     * <p>
     * A list of event type codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCodes <p>
     *            A list of event type codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventTypeFilter withEventTypeCodes(String... eventTypeCodes) {
        if (getEventTypeCodes() == null) {
            this.eventTypeCodes = new java.util.ArrayList<String>(eventTypeCodes.length);
        }
        for (String value : eventTypeCodes) {
            this.eventTypeCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event type codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCodes <p>
     *            A list of event type codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventTypeFilter withEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        setEventTypeCodes(eventTypeCodes);
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     *
     * @return <p>
     *         The AWS services associated with the event. For example,
     *         <code>EC2</code>, <code>RDS</code>.
     *         </p>
     */
    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     *
     * @param services <p>
     *            The AWS services associated with the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     */
    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<String>(services);
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            The AWS services associated with the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventTypeFilter withServices(String... services) {
        if (getServices() == null) {
            this.services = new java.util.ArrayList<String>(services.length);
        }
        for (String value : services) {
            this.services.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            The AWS services associated with the event. For example,
     *            <code>EC2</code>, <code>RDS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventTypeFilter withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     *
     * @return <p>
     *         A list of event type category codes (<code>issue</code>,
     *         <code>scheduledChange</code>, or <code>accountNotification</code>
     *         ).
     *         </p>
     */
    public java.util.List<String> getEventTypeCategories() {
        return eventTypeCategories;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     *
     * @param eventTypeCategories <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     */
    public void setEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        if (eventTypeCategories == null) {
            this.eventTypeCategories = null;
            return;
        }

        this.eventTypeCategories = new java.util.ArrayList<String>(eventTypeCategories);
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCategories <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventTypeFilter withEventTypeCategories(String... eventTypeCategories) {
        if (getEventTypeCategories() == null) {
            this.eventTypeCategories = new java.util.ArrayList<String>(eventTypeCategories.length);
        }
        for (String value : eventTypeCategories) {
            this.eventTypeCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>,
     * <code>scheduledChange</code>, or <code>accountNotification</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypeCategories <p>
     *            A list of event type category codes (<code>issue</code>,
     *            <code>scheduledChange</code>, or
     *            <code>accountNotification</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventTypeFilter withEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        setEventTypeCategories(eventTypeCategories);
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
        if (getEventTypeCodes() != null)
            sb.append("eventTypeCodes: " + getEventTypeCodes() + ",");
        if (getServices() != null)
            sb.append("services: " + getServices() + ",");
        if (getEventTypeCategories() != null)
            sb.append("eventTypeCategories: " + getEventTypeCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventTypeCodes() == null) ? 0 : getEventTypeCodes().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode
                + ((getEventTypeCategories() == null) ? 0 : getEventTypeCategories().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventTypeFilter == false)
            return false;
        EventTypeFilter other = (EventTypeFilter) obj;

        if (other.getEventTypeCodes() == null ^ this.getEventTypeCodes() == null)
            return false;
        if (other.getEventTypeCodes() != null
                && other.getEventTypeCodes().equals(this.getEventTypeCodes()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getEventTypeCategories() == null ^ this.getEventTypeCategories() == null)
            return false;
        if (other.getEventTypeCategories() != null
                && other.getEventTypeCategories().equals(this.getEventTypeCategories()) == false)
            return false;
        return true;
    }
}
