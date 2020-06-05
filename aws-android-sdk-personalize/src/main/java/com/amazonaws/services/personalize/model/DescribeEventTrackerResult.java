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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeEventTrackerResult implements Serializable {
    /**
     * <p>
     * An object that describes the event tracker.
     * </p>
     */
    private EventTracker eventTracker;

    /**
     * <p>
     * An object that describes the event tracker.
     * </p>
     *
     * @return <p>
     *         An object that describes the event tracker.
     *         </p>
     */
    public EventTracker getEventTracker() {
        return eventTracker;
    }

    /**
     * <p>
     * An object that describes the event tracker.
     * </p>
     *
     * @param eventTracker <p>
     *            An object that describes the event tracker.
     *            </p>
     */
    public void setEventTracker(EventTracker eventTracker) {
        this.eventTracker = eventTracker;
    }

    /**
     * <p>
     * An object that describes the event tracker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTracker <p>
     *            An object that describes the event tracker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventTrackerResult withEventTracker(EventTracker eventTracker) {
        this.eventTracker = eventTracker;
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
        if (getEventTracker() != null)
            sb.append("eventTracker: " + getEventTracker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventTracker() == null) ? 0 : getEventTracker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventTrackerResult == false)
            return false;
        DescribeEventTrackerResult other = (DescribeEventTrackerResult) obj;

        if (other.getEventTracker() == null ^ this.getEventTracker() == null)
            return false;
        if (other.getEventTracker() != null
                && other.getEventTracker().equals(this.getEventTracker()) == false)
            return false;
        return true;
    }
}
