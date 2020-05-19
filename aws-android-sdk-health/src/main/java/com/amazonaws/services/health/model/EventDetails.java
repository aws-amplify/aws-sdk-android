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
 * Detailed information about an event. A combination of an <a>Event</a> object,
 * an <a>EventDescription</a> object, and additional metadata about the event.
 * Returned by the <a>DescribeEventDetails</a> operation.
 * </p>
 */
public class EventDetails implements Serializable {
    /**
     * <p>
     * Summary information about the event.
     * </p>
     */
    private Event event;

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     */
    private EventDescription eventDescription;

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     */
    private java.util.Map<String, String> eventMetadata;

    /**
     * <p>
     * Summary information about the event.
     * </p>
     *
     * @return <p>
     *         Summary information about the event.
     *         </p>
     */
    public Event getEvent() {
        return event;
    }

    /**
     * <p>
     * Summary information about the event.
     * </p>
     *
     * @param event <p>
     *            Summary information about the event.
     *            </p>
     */
    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * <p>
     * Summary information about the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param event <p>
     *            Summary information about the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDetails withEvent(Event event) {
        this.event = event;
        return this;
    }

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     *
     * @return <p>
     *         The most recent description of the event.
     *         </p>
     */
    public EventDescription getEventDescription() {
        return eventDescription;
    }

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     *
     * @param eventDescription <p>
     *            The most recent description of the event.
     *            </p>
     */
    public void setEventDescription(EventDescription eventDescription) {
        this.eventDescription = eventDescription;
    }

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventDescription <p>
     *            The most recent description of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDetails withEventDescription(EventDescription eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     *
     * @return <p>
     *         Additional metadata about the event.
     *         </p>
     */
    public java.util.Map<String, String> getEventMetadata() {
        return eventMetadata;
    }

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     *
     * @param eventMetadata <p>
     *            Additional metadata about the event.
     *            </p>
     */
    public void setEventMetadata(java.util.Map<String, String> eventMetadata) {
        this.eventMetadata = eventMetadata;
    }

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventMetadata <p>
     *            Additional metadata about the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDetails withEventMetadata(java.util.Map<String, String> eventMetadata) {
        this.eventMetadata = eventMetadata;
        return this;
    }

    /**
     * <p>
     * Additional metadata about the event.
     * </p>
     * <p>
     * The method adds a new key-value pair into eventMetadata parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into eventMetadata.
     * @param value The corresponding value of the entry to be added into
     *            eventMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDetails addeventMetadataEntry(String key, String value) {
        if (null == this.eventMetadata) {
            this.eventMetadata = new java.util.HashMap<String, String>();
        }
        if (this.eventMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.eventMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into eventMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EventDetails cleareventMetadataEntries() {
        this.eventMetadata = null;
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
        if (getEvent() != null)
            sb.append("event: " + getEvent() + ",");
        if (getEventDescription() != null)
            sb.append("eventDescription: " + getEventDescription() + ",");
        if (getEventMetadata() != null)
            sb.append("eventMetadata: " + getEventMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode
                + ((getEventDescription() == null) ? 0 : getEventDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEventMetadata() == null) ? 0 : getEventMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDetails == false)
            return false;
        EventDetails other = (EventDetails) obj;

        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getEventDescription() == null ^ this.getEventDescription() == null)
            return false;
        if (other.getEventDescription() != null
                && other.getEventDescription().equals(this.getEventDescription()) == false)
            return false;
        if (other.getEventMetadata() == null ^ this.getEventMetadata() == null)
            return false;
        if (other.getEventMetadata() != null
                && other.getEventMetadata().equals(this.getEventMetadata()) == false)
            return false;
        return true;
    }
}
