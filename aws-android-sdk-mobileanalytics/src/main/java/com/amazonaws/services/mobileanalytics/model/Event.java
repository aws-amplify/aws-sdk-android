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

package com.amazonaws.services.mobileanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON object representing a batch of unique event occurrences in your app.
 * </p>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class Event implements Serializable {
    /**
     * <p>
     * A name signifying an event that occurred in your app. This is used for
     * grouping and aggregating like events together for reporting purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String eventType;

    /**
     * <p>
     * The time the event occurred in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     */
    private String timestamp;

    /**
     * <p>
     * The session the event occured within.
     * </p>
     */
    private Session session;

    /**
     * <p>
     * The version of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private String version;

    /**
     * <p>
     * A collection of key-value pairs that give additional context to the
     * event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * A collection of key-value pairs that gives additional, measurable context
     * to the event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     */
    private java.util.Map<String, Double> metrics;

    /**
     * <p>
     * A name signifying an event that occurred in your app. This is used for
     * grouping and aggregating like events together for reporting purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         A name signifying an event that occurred in your app. This is
     *         used for grouping and aggregating like events together for
     *         reporting purposes.
     *         </p>
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * A name signifying an event that occurred in your app. This is used for
     * grouping and aggregating like events together for reporting purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param eventType <p>
     *            A name signifying an event that occurred in your app. This is
     *            used for grouping and aggregating like events together for
     *            reporting purposes.
     *            </p>
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * A name signifying an event that occurred in your app. This is used for
     * grouping and aggregating like events together for reporting purposes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param eventType <p>
     *            A name signifying an event that occurred in your app. This is
     *            used for grouping and aggregating like events together for
     *            reporting purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The time the event occurred in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     *
     * @return <p>
     *         The time the event occurred in ISO 8601 standard date time
     *         format. For example, 2014-06-30T19:07:47.885Z
     *         </p>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time the event occurred in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     *
     * @param timestamp <p>
     *            The time the event occurred in ISO 8601 standard date time
     *            format. For example, 2014-06-30T19:07:47.885Z
     *            </p>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the event occurred in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time the event occurred in ISO 8601 standard date time
     *            format. For example, 2014-06-30T19:07:47.885Z
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The session the event occured within.
     * </p>
     *
     * @return <p>
     *         The session the event occured within.
     *         </p>
     */
    public Session getSession() {
        return session;
    }

    /**
     * <p>
     * The session the event occured within.
     * </p>
     *
     * @param session <p>
     *            The session the event occured within.
     *            </p>
     */
    public void setSession(Session session) {
        this.session = session;
    }

    /**
     * <p>
     * The session the event occured within.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param session <p>
     *            The session the event occured within.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withSession(Session session) {
        this.session = session;
        return this;
    }

    /**
     * <p>
     * The version of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return <p>
     *         The version of the event.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param version <p>
     *            The version of the event.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param version <p>
     *            The version of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * A collection of key-value pairs that give additional context to the
     * event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     *
     * @return <p>
     *         A collection of key-value pairs that give additional context to
     *         the event. The key-value pairs are specified by the developer.
     *         </p>
     *         <p>
     *         This collection can be empty or the attribute object can be
     *         omitted.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A collection of key-value pairs that give additional context to the
     * event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     *
     * @param attributes <p>
     *            A collection of key-value pairs that give additional context
     *            to the event. The key-value pairs are specified by the
     *            developer.
     *            </p>
     *            <p>
     *            This collection can be empty or the attribute object can be
     *            omitted.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A collection of key-value pairs that give additional context to the
     * event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A collection of key-value pairs that give additional context
     *            to the event. The key-value pairs are specified by the
     *            developer.
     *            </p>
     *            <p>
     *            This collection can be empty or the attribute object can be
     *            omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A collection of key-value pairs that give additional context to the
     * event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     * <p>
     * The method adds a new key-value pair into attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into attributes.
     * @param value The corresponding value of the entry to be added into
     *            attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event addattributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Event clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * A collection of key-value pairs that gives additional, measurable context
     * to the event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     *
     * @return <p>
     *         A collection of key-value pairs that gives additional, measurable
     *         context to the event. The key-value pairs are specified by the
     *         developer.
     *         </p>
     *         <p>
     *         This collection can be empty or the attribute object can be
     *         omitted.
     *         </p>
     */
    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * A collection of key-value pairs that gives additional, measurable context
     * to the event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     *
     * @param metrics <p>
     *            A collection of key-value pairs that gives additional,
     *            measurable context to the event. The key-value pairs are
     *            specified by the developer.
     *            </p>
     *            <p>
     *            This collection can be empty or the attribute object can be
     *            omitted.
     *            </p>
     */
    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * A collection of key-value pairs that gives additional, measurable context
     * to the event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            A collection of key-value pairs that gives additional,
     *            measurable context to the event. The key-value pairs are
     *            specified by the developer.
     *            </p>
     *            <p>
     *            This collection can be empty or the attribute object can be
     *            omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * <p>
     * A collection of key-value pairs that gives additional, measurable context
     * to the event. The key-value pairs are specified by the developer.
     * </p>
     * <p>
     * This collection can be empty or the attribute object can be omitted.
     * </p>
     * <p>
     * The method adds a new key-value pair into metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into metrics.
     * @param value The corresponding value of the entry to be added into
     *            metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event addmetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Event clearmetricsEntries() {
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
        if (getEventType() != null)
            sb.append("eventType: " + getEventType() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp() + ",");
        if (getSession() != null)
            sb.append("session: " + getSession() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getMetrics() != null)
            sb.append("metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;

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
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
