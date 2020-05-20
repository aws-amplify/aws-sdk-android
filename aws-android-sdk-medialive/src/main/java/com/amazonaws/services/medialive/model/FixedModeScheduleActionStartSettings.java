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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Start time for the action.
 */
public class FixedModeScheduleActionStartSettings implements Serializable {
    /**
     * Start time for the action to start in the channel. (Not the time for the
     * action to be added to the schedule: actions are always added to the
     * schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the
     * letters are digits (for example, mm might be 01) except for the two
     * constants "T" for time and "Z" for "UTC format".
     */
    private String time;

    /**
     * Start time for the action to start in the channel. (Not the time for the
     * action to be added to the schedule: actions are always added to the
     * schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the
     * letters are digits (for example, mm might be 01) except for the two
     * constants "T" for time and "Z" for "UTC format".
     *
     * @return Start time for the action to start in the channel. (Not the time
     *         for the action to be added to the schedule: actions are always
     *         added to the schedule immediately.) UTC format:
     *         yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are digits (for
     *         example, mm might be 01) except for the two constants "T" for
     *         time and "Z" for "UTC format".
     */
    public String getTime() {
        return time;
    }

    /**
     * Start time for the action to start in the channel. (Not the time for the
     * action to be added to the schedule: actions are always added to the
     * schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the
     * letters are digits (for example, mm might be 01) except for the two
     * constants "T" for time and "Z" for "UTC format".
     *
     * @param time Start time for the action to start in the channel. (Not the
     *            time for the action to be added to the schedule: actions are
     *            always added to the schedule immediately.) UTC format:
     *            yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are digits (for
     *            example, mm might be 01) except for the two constants "T" for
     *            time and "Z" for "UTC format".
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Start time for the action to start in the channel. (Not the time for the
     * action to be added to the schedule: actions are always added to the
     * schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the
     * letters are digits (for example, mm might be 01) except for the two
     * constants "T" for time and "Z" for "UTC format".
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param time Start time for the action to start in the channel. (Not the
     *            time for the action to be added to the schedule: actions are
     *            always added to the schedule immediately.) UTC format:
     *            yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are digits (for
     *            example, mm might be 01) except for the two constants "T" for
     *            time and "Z" for "UTC format".
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FixedModeScheduleActionStartSettings withTime(String time) {
        this.time = time;
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
        if (getTime() != null)
            sb.append("Time: " + getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FixedModeScheduleActionStartSettings == false)
            return false;
        FixedModeScheduleActionStartSettings other = (FixedModeScheduleActionStartSettings) obj;

        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }
}
