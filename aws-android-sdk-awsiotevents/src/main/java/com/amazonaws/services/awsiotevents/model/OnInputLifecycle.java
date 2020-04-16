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
 * Specifies the actions performed when the <code>condition</code> evaluates to
 * TRUE.
 * </p>
 */
public class OnInputLifecycle implements Serializable {
    /**
     * <p>
     * Specifies the actions performed when the <code>condition</code> evaluates
     * to TRUE.
     * </p>
     */
    private java.util.List<Event> events;

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a
     * <code>condition</code> evaluates to TRUE.
     * </p>
     */
    private java.util.List<TransitionEvent> transitionEvents;

    /**
     * <p>
     * Specifies the actions performed when the <code>condition</code> evaluates
     * to TRUE.
     * </p>
     *
     * @return <p>
     *         Specifies the actions performed when the <code>condition</code>
     *         evaluates to TRUE.
     *         </p>
     */
    public java.util.List<Event> getEvents() {
        return events;
    }

    /**
     * <p>
     * Specifies the actions performed when the <code>condition</code> evaluates
     * to TRUE.
     * </p>
     *
     * @param events <p>
     *            Specifies the actions performed when the
     *            <code>condition</code> evaluates to TRUE.
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
     * Specifies the actions performed when the <code>condition</code> evaluates
     * to TRUE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Specifies the actions performed when the
     *            <code>condition</code> evaluates to TRUE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnInputLifecycle withEvents(Event... events) {
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
     * Specifies the actions performed when the <code>condition</code> evaluates
     * to TRUE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Specifies the actions performed when the
     *            <code>condition</code> evaluates to TRUE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnInputLifecycle withEvents(java.util.Collection<Event> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a
     * <code>condition</code> evaluates to TRUE.
     * </p>
     *
     * @return <p>
     *         Specifies the actions performed, and the next state entered, when
     *         a <code>condition</code> evaluates to TRUE.
     *         </p>
     */
    public java.util.List<TransitionEvent> getTransitionEvents() {
        return transitionEvents;
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a
     * <code>condition</code> evaluates to TRUE.
     * </p>
     *
     * @param transitionEvents <p>
     *            Specifies the actions performed, and the next state entered,
     *            when a <code>condition</code> evaluates to TRUE.
     *            </p>
     */
    public void setTransitionEvents(java.util.Collection<TransitionEvent> transitionEvents) {
        if (transitionEvents == null) {
            this.transitionEvents = null;
            return;
        }

        this.transitionEvents = new java.util.ArrayList<TransitionEvent>(transitionEvents);
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a
     * <code>condition</code> evaluates to TRUE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitionEvents <p>
     *            Specifies the actions performed, and the next state entered,
     *            when a <code>condition</code> evaluates to TRUE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnInputLifecycle withTransitionEvents(TransitionEvent... transitionEvents) {
        if (getTransitionEvents() == null) {
            this.transitionEvents = new java.util.ArrayList<TransitionEvent>(
                    transitionEvents.length);
        }
        for (TransitionEvent value : transitionEvents) {
            this.transitionEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the actions performed, and the next state entered, when a
     * <code>condition</code> evaluates to TRUE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitionEvents <p>
     *            Specifies the actions performed, and the next state entered,
     *            when a <code>condition</code> evaluates to TRUE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnInputLifecycle withTransitionEvents(
            java.util.Collection<TransitionEvent> transitionEvents) {
        setTransitionEvents(transitionEvents);
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
        if (getTransitionEvents() != null)
            sb.append("transitionEvents: " + getTransitionEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode
                + ((getTransitionEvents() == null) ? 0 : getTransitionEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnInputLifecycle == false)
            return false;
        OnInputLifecycle other = (OnInputLifecycle) obj;

        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getTransitionEvents() == null ^ this.getTransitionEvents() == null)
            return false;
        if (other.getTransitionEvents() != null
                && other.getTransitionEvents().equals(this.getTransitionEvents()) == false)
            return false;
        return true;
    }
}
