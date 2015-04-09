/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents a single event that happened on a client device.
 * Attributes and metrics are optional.
 * </p>
 */
public class Event implements Serializable {

    private String eventType;

    private String timestamp;

    private Session session;

    private String version;

    private java.util.Map<String,String> attributes;

    private java.util.Map<String,Double> metrics;

    /**
     * Returns the value of the EventType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return The value of the EventType property for this object.
     */
    public String getEventType() {
        return eventType;
    }
    
    /**
     * Sets the value of the EventType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param eventType The new value for the EventType property for this object.
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    /**
     * Sets the value of the EventType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param eventType The new value for the EventType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Returns the value of the Timestamp property for this object.
     *
     * @return The value of the Timestamp property for this object.
     */
    public String getTimestamp() {
        return timestamp;
    }
    
    /**
     * Sets the value of the Timestamp property for this object.
     *
     * @param timestamp The new value for the Timestamp property for this object.
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * Sets the value of the Timestamp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The new value for the Timestamp property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Returns the value of the Session property for this object.
     *
     * @return The value of the Session property for this object.
     */
    public Session getSession() {
        return session;
    }
    
    /**
     * Sets the value of the Session property for this object.
     *
     * @param session The new value for the Session property for this object.
     */
    public void setSession(Session session) {
        this.session = session;
    }
    
    /**
     * Sets the value of the Session property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param session The new value for the Session property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withSession(Session session) {
        this.session = session;
        return this;
    }

    /**
     * Returns the value of the Version property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return The value of the Version property for this object.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * Sets the value of the Version property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param version The new value for the Version property for this object.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * Sets the value of the Version property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param version The new value for the Version property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Returns the value of the Attributes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @return The value of the Attributes property for this object.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @param attributes The new value for the Attributes property for this object.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @param attributes The new value for the Attributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Sets the value of the Attributes property for this object.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
    public Event addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String,String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public Event clearAttributesEntries() {
        this.attributes = null;
        return this;
    }
    
    /**
     * Returns the value of the Metrics property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @return The value of the Metrics property for this object.
     */
    public java.util.Map<String,Double> getMetrics() {
        
        if (metrics == null) {
            metrics = new java.util.HashMap<String,Double>();
        }
        return metrics;
    }
    
    /**
     * Sets the value of the Metrics property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @param metrics The new value for the Metrics property for this object.
     */
    public void setMetrics(java.util.Map<String,Double> metrics) {
        this.metrics = metrics;
    }
    
    /**
     * Sets the value of the Metrics property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @param metrics The new value for the Metrics property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Event withMetrics(java.util.Map<String,Double> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * Sets the value of the Metrics property for this object.
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into Metrics.
     */
    public Event addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String,Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public Event clearMetricsEntries() {
        this.metrics = null;
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventType() != null) sb.append("EventType: " + getEventType() + ",");
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() + ",");
        if (getSession() != null) sb.append("Session: " + getSession() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getMetrics() != null) sb.append("Metrics: " + getMetrics() );
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Event == false) return false;
        Event other = (Event)obj;
        
        if (other.getEventType() == null ^ this.getEventType() == null) return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false) return false; 
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        if (other.getSession() == null ^ this.getSession() == null) return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getMetrics() == null ^ this.getMetrics() == null) return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false) return false; 
        return true;
    }
    
}
    