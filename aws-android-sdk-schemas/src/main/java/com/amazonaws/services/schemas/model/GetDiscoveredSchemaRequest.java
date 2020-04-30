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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Get the discovered schema that was generated based on sampled events.
 * </p>
 */
public class GetDiscoveredSchemaRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of strings where each string is a JSON event. These are the
     * events that were used to generate the schema. The array includes a single
     * type of event and has a maximum size of 10 events.
     * </p>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * The type of event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OpenApi3
     */
    private String type;

    /**
     * <p>
     * An array of strings where each string is a JSON event. These are the
     * events that were used to generate the schema. The array includes a single
     * type of event and has a maximum size of 10 events.
     * </p>
     *
     * @return <p>
     *         An array of strings where each string is a JSON event. These are
     *         the events that were used to generate the schema. The array
     *         includes a single type of event and has a maximum size of 10
     *         events.
     *         </p>
     */
    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * An array of strings where each string is a JSON event. These are the
     * events that were used to generate the schema. The array includes a single
     * type of event and has a maximum size of 10 events.
     * </p>
     *
     * @param events <p>
     *            An array of strings where each string is a JSON event. These
     *            are the events that were used to generate the schema. The
     *            array includes a single type of event and has a maximum size
     *            of 10 events.
     *            </p>
     */
    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * An array of strings where each string is a JSON event. These are the
     * events that were used to generate the schema. The array includes a single
     * type of event and has a maximum size of 10 events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            An array of strings where each string is a JSON event. These
     *            are the events that were used to generate the schema. The
     *            array includes a single type of event and has a maximum size
     *            of 10 events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDiscoveredSchemaRequest withEvents(String... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<String>(events.length);
        }
        for (String value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings where each string is a JSON event. These are the
     * events that were used to generate the schema. The array includes a single
     * type of event and has a maximum size of 10 events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            An array of strings where each string is a JSON event. These
     *            are the events that were used to generate the schema. The
     *            array includes a single type of event and has a maximum size
     *            of 10 events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDiscoveredSchemaRequest withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OpenApi3
     *
     * @return <p>
     *         The type of event.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OpenApi3
     *
     * @param type <p>
     *            The type of event.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OpenApi3
     *
     * @param type <p>
     *            The type of event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public GetDiscoveredSchemaRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OpenApi3
     *
     * @param type <p>
     *            The type of event.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OpenApi3
     *
     * @param type <p>
     *            The type of event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public GetDiscoveredSchemaRequest withType(Type type) {
        this.type = type.toString();
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
            sb.append("Events: " + getEvents() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiscoveredSchemaRequest == false)
            return false;
        GetDiscoveredSchemaRequest other = (GetDiscoveredSchemaRequest) obj;

        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
