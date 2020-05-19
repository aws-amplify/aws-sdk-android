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
 * The detailed description of the event. Included in the information returned
 * by the <a>DescribeEventDetails</a> operation.
 * </p>
 */
public class EventDescription implements Serializable {
    /**
     * <p>
     * The most recent description of the event.
     * </p>
     */
    private String latestDescription;

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     *
     * @return <p>
     *         The most recent description of the event.
     *         </p>
     */
    public String getLatestDescription() {
        return latestDescription;
    }

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     *
     * @param latestDescription <p>
     *            The most recent description of the event.
     *            </p>
     */
    public void setLatestDescription(String latestDescription) {
        this.latestDescription = latestDescription;
    }

    /**
     * <p>
     * The most recent description of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestDescription <p>
     *            The most recent description of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventDescription withLatestDescription(String latestDescription) {
        this.latestDescription = latestDescription;
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
        if (getLatestDescription() != null)
            sb.append("latestDescription: " + getLatestDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLatestDescription() == null) ? 0 : getLatestDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDescription == false)
            return false;
        EventDescription other = (EventDescription) obj;

        if (other.getLatestDescription() == null ^ this.getLatestDescription() == null)
            return false;
        if (other.getLatestDescription() != null
                && other.getLatestDescription().equals(this.getLatestDescription()) == false)
            return false;
        return true;
    }
}
