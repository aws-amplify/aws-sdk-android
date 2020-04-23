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
 * Specifies the settings for a wait activity in a journey. This type of
 * activity waits for a certain amount of time or until a specific date and time
 * before moving participants to the next activity in a journey.
 * </p>
 */
public class WaitActivity implements Serializable {
    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing
     * the wait activity.
     * </p>
     */
    private String nextActivity;

    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves
     * participants to the next activity in the journey.
     * </p>
     */
    private WaitTime waitTime;

    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing
     * the wait activity.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the next activity to perform, after
     *         performing the wait activity.
     *         </p>
     */
    public String getNextActivity() {
        return nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing
     * the wait activity.
     * </p>
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            performing the wait activity.
     *            </p>
     */
    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after performing
     * the wait activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            performing the wait activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WaitActivity withNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
        return this;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves
     * participants to the next activity in the journey.
     * </p>
     *
     * @return <p>
     *         The amount of time to wait or the date and time when the activity
     *         moves participants to the next activity in the journey.
     *         </p>
     */
    public WaitTime getWaitTime() {
        return waitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves
     * participants to the next activity in the journey.
     * </p>
     *
     * @param waitTime <p>
     *            The amount of time to wait or the date and time when the
     *            activity moves participants to the next activity in the
     *            journey.
     *            </p>
     */
    public void setWaitTime(WaitTime waitTime) {
        this.waitTime = waitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when the activity moves
     * participants to the next activity in the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitTime <p>
     *            The amount of time to wait or the date and time when the
     *            activity moves participants to the next activity in the
     *            journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WaitActivity withWaitTime(WaitTime waitTime) {
        this.waitTime = waitTime;
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
        if (getNextActivity() != null)
            sb.append("NextActivity: " + getNextActivity() + ",");
        if (getWaitTime() != null)
            sb.append("WaitTime: " + getWaitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        hashCode = prime * hashCode + ((getWaitTime() == null) ? 0 : getWaitTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaitActivity == false)
            return false;
        WaitActivity other = (WaitActivity) obj;

        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null
                && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        if (other.getWaitTime() == null ^ this.getWaitTime() == null)
            return false;
        if (other.getWaitTime() != null && other.getWaitTime().equals(this.getWaitTime()) == false)
            return false;
        return true;
    }
}
