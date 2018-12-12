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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The PutEvents operation records one or more events. You can have up to 1,500
 * unique custom events per app, any combination of up to 40 attributes and
 * metrics per custom event, and any number of attribute or metric values.
 * </p>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class PutEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of Event JSON objects
     * </p>
     */
    private java.util.List<Event> events;

    /**
     * <p>
     * The client context including the client ID, app title, app version and
     * package name.
     * </p>
     */
    private String clientContext;

    /**
     * <p>
     * The encoding used for the client context.
     * </p>
     */
    private String clientContextEncoding;

    /**
     * <p>
     * An array of Event JSON objects
     * </p>
     *
     * @return <p>
     *         An array of Event JSON objects
     *         </p>
     */
    public java.util.List<Event> getEvents() {
        return events;
    }

    /**
     * <p>
     * An array of Event JSON objects
     * </p>
     *
     * @param events <p>
     *            An array of Event JSON objects
     *            </p>
     */
    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<Event>(events);
    }

    /**
     * <p>
     * An array of Event JSON objects
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            An array of Event JSON objects
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventsRequest withEvents(Event... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<Event>(events.length);
        }
        for (Event value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of Event JSON objects
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            An array of Event JSON objects
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventsRequest withEvents(java.util.Collection<Event> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The client context including the client ID, app title, app version and
     * package name.
     * </p>
     *
     * @return <p>
     *         The client context including the client ID, app title, app
     *         version and package name.
     *         </p>
     */
    public String getClientContext() {
        return clientContext;
    }

    /**
     * <p>
     * The client context including the client ID, app title, app version and
     * package name.
     * </p>
     *
     * @param clientContext <p>
     *            The client context including the client ID, app title, app
     *            version and package name.
     *            </p>
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * <p>
     * The client context including the client ID, app title, app version and
     * package name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientContext <p>
     *            The client context including the client ID, app title, app
     *            version and package name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventsRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * <p>
     * The encoding used for the client context.
     * </p>
     *
     * @return <p>
     *         The encoding used for the client context.
     *         </p>
     */
    public String getClientContextEncoding() {
        return clientContextEncoding;
    }

    /**
     * <p>
     * The encoding used for the client context.
     * </p>
     *
     * @param clientContextEncoding <p>
     *            The encoding used for the client context.
     *            </p>
     */
    public void setClientContextEncoding(String clientContextEncoding) {
        this.clientContextEncoding = clientContextEncoding;
    }

    /**
     * <p>
     * The encoding used for the client context.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientContextEncoding <p>
     *            The encoding used for the client context.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
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
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvents() != null)
            sb.append("events: " + getEvents() + ",");
        if (getClientContext() != null)
            sb.append("clientContext: " + getClientContext() + ",");
        if (getClientContextEncoding() != null)
            sb.append("clientContextEncoding: " + getClientContextEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode
                + ((getClientContext() == null) ? 0 : getClientContext().hashCode());
        hashCode = prime
                * hashCode
                + ((getClientContextEncoding() == null) ? 0 : getClientContextEncoding().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventsRequest == false)
            return false;
        PutEventsRequest other = (PutEventsRequest) obj;

        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getClientContext() == null ^ this.getClientContext() == null)
            return false;
        if (other.getClientContext() != null
                && other.getClientContext().equals(this.getClientContext()) == false)
            return false;
        if (other.getClientContextEncoding() == null ^ this.getClientContextEncoding() == null)
            return false;
        if (other.getClientContextEncoding() != null
                && other.getClientContextEncoding().equals(this.getClientContextEncoding()) == false)
            return false;
        return true;
    }
}
