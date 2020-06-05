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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a duration or a date and time that indicates when Amazon Pinpoint
 * determines whether an activity's conditions have been met or an activity
 * moves participants to the next activity in a journey.
 * </p>
 */
public class WaitTime implements Serializable {
    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before
     * determining whether the activity's conditions have been met or moving
     * participants to the next activity in the journey.
     * </p>
     */
    private String waitFor;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines
     * whether the activity's conditions have been met or the activity moves
     * participants to the next activity in the journey.
     * </p>
     */
    private String waitUntil;

    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before
     * determining whether the activity's conditions have been met or moving
     * participants to the next activity in the journey.
     * </p>
     *
     * @return <p>
     *         The amount of time to wait, as a duration in ISO 8601 format,
     *         before determining whether the activity's conditions have been
     *         met or moving participants to the next activity in the journey.
     *         </p>
     */
    public String getWaitFor() {
        return waitFor;
    }

    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before
     * determining whether the activity's conditions have been met or moving
     * participants to the next activity in the journey.
     * </p>
     *
     * @param waitFor <p>
     *            The amount of time to wait, as a duration in ISO 8601 format,
     *            before determining whether the activity's conditions have been
     *            met or moving participants to the next activity in the
     *            journey.
     *            </p>
     */
    public void setWaitFor(String waitFor) {
        this.waitFor = waitFor;
    }

    /**
     * <p>
     * The amount of time to wait, as a duration in ISO 8601 format, before
     * determining whether the activity's conditions have been met or moving
     * participants to the next activity in the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitFor <p>
     *            The amount of time to wait, as a duration in ISO 8601 format,
     *            before determining whether the activity's conditions have been
     *            met or moving participants to the next activity in the
     *            journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WaitTime withWaitFor(String waitFor) {
        this.waitFor = waitFor;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines
     * whether the activity's conditions have been met or the activity moves
     * participants to the next activity in the journey.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when Amazon Pinpoint
     *         determines whether the activity's conditions have been met or the
     *         activity moves participants to the next activity in the journey.
     *         </p>
     */
    public String getWaitUntil() {
        return waitUntil;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines
     * whether the activity's conditions have been met or the activity moves
     * participants to the next activity in the journey.
     * </p>
     *
     * @param waitUntil <p>
     *            The date and time, in ISO 8601 format, when Amazon Pinpoint
     *            determines whether the activity's conditions have been met or
     *            the activity moves participants to the next activity in the
     *            journey.
     *            </p>
     */
    public void setWaitUntil(String waitUntil) {
        this.waitUntil = waitUntil;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when Amazon Pinpoint determines
     * whether the activity's conditions have been met or the activity moves
     * participants to the next activity in the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitUntil <p>
     *            The date and time, in ISO 8601 format, when Amazon Pinpoint
     *            determines whether the activity's conditions have been met or
     *            the activity moves participants to the next activity in the
     *            journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WaitTime withWaitUntil(String waitUntil) {
        this.waitUntil = waitUntil;
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
        if (getWaitFor() != null)
            sb.append("WaitFor: " + getWaitFor() + ",");
        if (getWaitUntil() != null)
            sb.append("WaitUntil: " + getWaitUntil());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWaitFor() == null) ? 0 : getWaitFor().hashCode());
        hashCode = prime * hashCode + ((getWaitUntil() == null) ? 0 : getWaitUntil().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaitTime == false)
            return false;
        WaitTime other = (WaitTime) obj;

        if (other.getWaitFor() == null ^ this.getWaitFor() == null)
            return false;
        if (other.getWaitFor() != null && other.getWaitFor().equals(this.getWaitFor()) == false)
            return false;
        if (other.getWaitUntil() == null ^ this.getWaitUntil() == null)
            return false;
        if (other.getWaitUntil() != null
                && other.getWaitUntil().equals(this.getWaitUntil()) == false)
            return false;
        return true;
    }
}
