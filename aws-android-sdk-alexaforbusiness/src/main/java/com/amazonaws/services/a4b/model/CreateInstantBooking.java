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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * Creates settings for the instant booking feature that are applied to a room
 * profile. When users start their meeting with Alexa, Alexa automatically books
 * the room for the configured duration if the room is available.
 * </p>
 */
public class CreateInstantBooking implements Serializable {
    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines
     * how long to book an available room when a meeting is started with Alexa.
     * </p>
     */
    private Integer durationInMinutes;

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines
     * how long to book an available room when a meeting is started with Alexa.
     * </p>
     *
     * @return <p>
     *         Duration between 15 and 240 minutes at increments of 15 that
     *         determines how long to book an available room when a meeting is
     *         started with Alexa.
     *         </p>
     */
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines
     * how long to book an available room when a meeting is started with Alexa.
     * </p>
     *
     * @param durationInMinutes <p>
     *            Duration between 15 and 240 minutes at increments of 15 that
     *            determines how long to book an available room when a meeting
     *            is started with Alexa.
     *            </p>
     */
    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * <p>
     * Duration between 15 and 240 minutes at increments of 15 that determines
     * how long to book an available room when a meeting is started with Alexa.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationInMinutes <p>
     *            Duration between 15 and 240 minutes at increments of 15 that
     *            determines how long to book an available room when a meeting
     *            is started with Alexa.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstantBooking withDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        return this;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether instant booking is enabled or not.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether instant booking is enabled or not.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     *
     * @param enabled <p>
     *            Whether instant booking is enabled or not.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether instant booking is enabled or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Whether instant booking is enabled or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstantBooking withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getDurationInMinutes() != null)
            sb.append("DurationInMinutes: " + getDurationInMinutes() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDurationInMinutes() == null) ? 0 : getDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstantBooking == false)
            return false;
        CreateInstantBooking other = (CreateInstantBooking) obj;

        if (other.getDurationInMinutes() == null ^ this.getDurationInMinutes() == null)
            return false;
        if (other.getDurationInMinutes() != null
                && other.getDurationInMinutes().equals(this.getDurationInMinutes()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
