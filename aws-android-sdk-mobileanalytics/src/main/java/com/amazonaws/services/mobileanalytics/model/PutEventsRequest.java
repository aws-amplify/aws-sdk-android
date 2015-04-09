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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.mobileanalytics.AmazonMobileAnalytics#putEvents(PutEventsRequest) PutEvents operation}.
 * <p>
 * Record a batch of events
 * </p>
 *
 * @see com.amazonaws.services.mobileanalytics.AmazonMobileAnalytics#putEvents(PutEventsRequest)
 */
public class PutEventsRequest extends AmazonWebServiceRequest implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<Event> events;

    private String clientContext;

    private String clientContextEncoding;

    /**
     * Returns the value of the Events property for this object.
     *
     * @return The value of the Events property for this object.
     */
    public java.util.List<Event> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * Sets the value of the Events property for this object.
     *
     * @param events The new value for the Events property for this object.
     */
    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * Sets the value of the Events property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The new value for the Events property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutEventsRequest withEvents(Event... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<Event>(events.length));
        for (Event value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Events property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The new value for the Events property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutEventsRequest withEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Event>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the ClientContext property for this object.
     *
     * @return The value of the ClientContext property for this object.
     */
    public String getClientContext() {
        return clientContext;
    }
    
    /**
     * Sets the value of the ClientContext property for this object.
     *
     * @param clientContext The new value for the ClientContext property for this object.
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }
    
    /**
     * Sets the value of the ClientContext property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientContext The new value for the ClientContext property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutEventsRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * Returns the value of the ClientContextEncoding property for this
     * object.
     *
     * @return The value of the ClientContextEncoding property for this object.
     */
    public String getClientContextEncoding() {
        return clientContextEncoding;
    }
    
    /**
     * Sets the value of the ClientContextEncoding property for this object.
     *
     * @param clientContextEncoding The new value for the ClientContextEncoding property for this object.
     */
    public void setClientContextEncoding(String clientContextEncoding) {
        this.clientContextEncoding = clientContextEncoding;
    }
    
    /**
     * Sets the value of the ClientContextEncoding property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientContextEncoding The new value for the ClientContextEncoding property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutEventsRequest withClientContextEncoding(String clientContextEncoding) {
        this.clientContextEncoding = clientContextEncoding;
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
        if (getEvents() != null) sb.append("Events: " + getEvents() + ",");
        if (getClientContext() != null) sb.append("ClientContext: " + getClientContext() + ",");
        if (getClientContextEncoding() != null) sb.append("ClientContextEncoding: " + getClientContextEncoding() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getClientContext() == null) ? 0 : getClientContext().hashCode()); 
        hashCode = prime * hashCode + ((getClientContextEncoding() == null) ? 0 : getClientContextEncoding().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutEventsRequest == false) return false;
        PutEventsRequest other = (PutEventsRequest)obj;
        
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getClientContext() == null ^ this.getClientContext() == null) return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false) return false; 
        if (other.getClientContextEncoding() == null ^ this.getClientContextEncoding() == null) return false;
        if (other.getClientContextEncoding() != null && other.getClientContextEncoding().equals(this.getClientContextEncoding()) == false) return false; 
        return true;
    }
    
}
    