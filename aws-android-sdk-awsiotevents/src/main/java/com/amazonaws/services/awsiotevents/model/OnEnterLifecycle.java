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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * When entering this state, perform these <code>actions</code> if the
 * <code>condition</code> is TRUE.
 * </p>
 */
public class OnEnterLifecycle implements Serializable {
    /**
     * <p>
     * Specifies the actions that are performed when the state is entered and
     * the <code>condition</code> is <code>TRUE</code>.
     * </p>
     */
    private java.util.List<Event> events;

    /**
     * <p>
     * Specifies the actions that are performed when the state is entered and
     * the <code>condition</code> is <code>TRUE</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the actions that are performed when the state is
     *         entered and the <code>condition</code> is <code>TRUE</code>.
     *         </p>
     */
    public java.util.List<Event> getEvents() {
        return events;
    }

    /**
     * <p>
     * Specifies the actions that are performed when the state is entered and
     * the <code>condition</code> is <code>TRUE</code>.
     * </p>
     *
     * @param events <p>
     *            Specifies the actions that are performed when the state is
     *            entered and the <code>condition</code> is <code>TRUE</code>.
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
     * Specifies the actions that are performed when the state is entered and
     * the <code>condition</code> is <code>TRUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Specifies the actions that are performed when the state is
     *            entered and the <code>condition</code> is <code>TRUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnEnterLifecycle withEvents(Event... events) {
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
     * Specifies the actions that are performed when the state is entered and
     * the <code>condition</code> is <code>TRUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Specifies the actions that are performed when the state is
     *            entered and the <code>condition</code> is <code>TRUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnEnterLifecycle withEvents(java.util.Collection<Event> events) {
        setEvents(events);
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
            sb.append("events: " + getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnEnterLifecycle == false)
            return false;
        OnEnterLifecycle other = (OnEnterLifecycle) obj;

        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }
}
