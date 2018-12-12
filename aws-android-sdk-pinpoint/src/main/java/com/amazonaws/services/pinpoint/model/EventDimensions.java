/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Event dimensions.
 */
public class EventDimensions implements Serializable {
    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     */
    private java.util.Map<String, AttributeDimension> attributes;

    /**
     * The name of the event that causes the campaign to be sent. This can be a
     * standard event type that Amazon Pinpoint generates, such as
     * _session.start, or a custom event that's specific to your app.
     */
    private SetDimension eventType;

    /**
     * Custom metrics that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     */
    private java.util.Map<String, MetricDimension> metrics;

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     *
     * @return Custom attributes that your app reports to Amazon Pinpoint. You
     *         can use these attributes as selection criteria when you create an
     *         event filter.
     */
    public java.util.Map<String, AttributeDimension> getAttributes() {
        return attributes;
    }

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     *
     * @param attributes Custom attributes that your app reports to Amazon
     *            Pinpoint. You can use these attributes as selection criteria
     *            when you create an event filter.
     */
    public void setAttributes(java.util.Map<String, AttributeDimension> attributes) {
        this.attributes = attributes;
    }

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes Custom attributes that your app reports to Amazon
     *            Pinpoint. You can use these attributes as selection criteria
     *            when you create an event filter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDimensions withAttributes(java.util.Map<String, AttributeDimension> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Custom attributes that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDimensions addAttributesEntry(String key, AttributeDimension value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, AttributeDimension>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EventDimensions clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * The name of the event that causes the campaign to be sent. This can be a
     * standard event type that Amazon Pinpoint generates, such as
     * _session.start, or a custom event that's specific to your app.
     *
     * @return The name of the event that causes the campaign to be sent. This
     *         can be a standard event type that Amazon Pinpoint generates, such
     *         as _session.start, or a custom event that's specific to your app.
     */
    public SetDimension getEventType() {
        return eventType;
    }

    /**
     * The name of the event that causes the campaign to be sent. This can be a
     * standard event type that Amazon Pinpoint generates, such as
     * _session.start, or a custom event that's specific to your app.
     *
     * @param eventType The name of the event that causes the campaign to be
     *            sent. This can be a standard event type that Amazon Pinpoint
     *            generates, such as _session.start, or a custom event that's
     *            specific to your app.
     */
    public void setEventType(SetDimension eventType) {
        this.eventType = eventType;
    }

    /**
     * The name of the event that causes the campaign to be sent. This can be a
     * standard event type that Amazon Pinpoint generates, such as
     * _session.start, or a custom event that's specific to your app.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventType The name of the event that causes the campaign to be
     *            sent. This can be a standard event type that Amazon Pinpoint
     *            generates, such as _session.start, or a custom event that's
     *            specific to your app.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDimensions withEventType(SetDimension eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     *
     * @return Custom metrics that your app reports to Amazon Pinpoint. You can
     *         use these attributes as selection criteria when you create an
     *         event filter.
     */
    public java.util.Map<String, MetricDimension> getMetrics() {
        return metrics;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     *
     * @param metrics Custom metrics that your app reports to Amazon Pinpoint.
     *            You can use these attributes as selection criteria when you
     *            create an event filter.
     */
    public void setMetrics(java.util.Map<String, MetricDimension> metrics) {
        this.metrics = metrics;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics Custom metrics that your app reports to Amazon Pinpoint.
     *            You can use these attributes as selection criteria when you
     *            create an event filter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDimensions withMetrics(java.util.Map<String, MetricDimension> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Custom metrics that your app reports to Amazon Pinpoint. You can use
     * these attributes as selection criteria when you create an event filter.
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDimensions addMetricsEntry(String key, MetricDimension value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, MetricDimension>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EventDimensions clearMetricsEntries() {
        this.metrics = null;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDimensions == false)
            return false;
        EventDimensions other = (EventDimensions) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
