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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the conditions to evaluate for an event that applies to an activity
 * in a journey.
 * </p>
 */
public class EventCondition implements Serializable {
    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     */
    private EventDimensions dimensions;

    /**
     * <p>
     * The message identifier (message_id) for the message to use when
     * determining whether message events meet the condition.
     * </p>
     */
    private String messageActivity;

    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     *
     * @return <p>
     *         The dimensions for the event filter to use for the activity.
     *         </p>
     */
    public EventDimensions getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     *
     * @param dimensions <p>
     *            The dimensions for the event filter to use for the activity.
     *            </p>
     */
    public void setDimensions(EventDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimensions for the event filter to use for the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimensions for the event filter to use for the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventCondition withDimensions(EventDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * The message identifier (message_id) for the message to use when
     * determining whether message events meet the condition.
     * </p>
     *
     * @return <p>
     *         The message identifier (message_id) for the message to use when
     *         determining whether message events meet the condition.
     *         </p>
     */
    public String getMessageActivity() {
        return messageActivity;
    }

    /**
     * <p>
     * The message identifier (message_id) for the message to use when
     * determining whether message events meet the condition.
     * </p>
     *
     * @param messageActivity <p>
     *            The message identifier (message_id) for the message to use
     *            when determining whether message events meet the condition.
     *            </p>
     */
    public void setMessageActivity(String messageActivity) {
        this.messageActivity = messageActivity;
    }

    /**
     * <p>
     * The message identifier (message_id) for the message to use when
     * determining whether message events meet the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageActivity <p>
     *            The message identifier (message_id) for the message to use
     *            when determining whether message events meet the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventCondition withMessageActivity(String messageActivity) {
        this.messageActivity = messageActivity;
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
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getMessageActivity() != null)
            sb.append("MessageActivity: " + getMessageActivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode
                + ((getMessageActivity() == null) ? 0 : getMessageActivity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventCondition == false)
            return false;
        EventCondition other = (EventCondition) obj;

        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getMessageActivity() == null ^ this.getMessageActivity() == null)
            return false;
        if (other.getMessageActivity() != null
                && other.getMessageActivity().equals(this.getMessageActivity()) == false)
            return false;
        return true;
    }
}
