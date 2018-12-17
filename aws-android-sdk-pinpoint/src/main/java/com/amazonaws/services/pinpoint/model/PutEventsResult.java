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

public class PutEventsResult implements Serializable {
    /**
     * Custom messages associated with events.
     */
    private EventsResponse eventsResponse;

    /**
     * Custom messages associated with events.
     *
     * @return Custom messages associated with events.
     */
    public EventsResponse getEventsResponse() {
        return eventsResponse;
    }

    /**
     * Custom messages associated with events.
     *
     * @param eventsResponse Custom messages associated with events.
     */
    public void setEventsResponse(EventsResponse eventsResponse) {
        this.eventsResponse = eventsResponse;
    }

    /**
     * Custom messages associated with events.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventsResponse Custom messages associated with events.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventsResult withEventsResponse(EventsResponse eventsResponse) {
        this.eventsResponse = eventsResponse;
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
        if (getEventsResponse() != null)
            sb.append("EventsResponse: " + getEventsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventsResponse() == null) ? 0 : getEventsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventsResult == false)
            return false;
        PutEventsResult other = (PutEventsResult) obj;

        if (other.getEventsResponse() == null ^ this.getEventsResponse() == null)
            return false;
        if (other.getEventsResponse() != null
                && other.getEventsResponse().equals(this.getEventsResponse()) == false)
            return false;
        return true;
    }
}
