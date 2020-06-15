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
 * Creates meeting room settings of a room profile.
 * </p>
 */
public class CreateMeetingRoomConfiguration implements Serializable {
    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     */
    private Boolean roomUtilizationMetricsEnabled;

    /**
     * <p>
     * Creates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     */
    private CreateEndOfMeetingReminder endOfMeetingReminder;

    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's
     * free when joining a meeting with Alexa.
     * </p>
     */
    private CreateInstantBooking instantBooking;

    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can
     * cancel a room reservation if it's not checked into to make the room
     * available for others. Users can check in by joining the meeting with
     * Alexa or an AVS device, or by saying “Alexa, check in.”
     * </p>
     */
    private CreateRequireCheckIn requireCheckIn;

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether room utilization metrics are enabled or not.
     *         </p>
     */
    public Boolean isRoomUtilizationMetricsEnabled() {
        return roomUtilizationMetricsEnabled;
    }

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether room utilization metrics are enabled or not.
     *         </p>
     */
    public Boolean getRoomUtilizationMetricsEnabled() {
        return roomUtilizationMetricsEnabled;
    }

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     *
     * @param roomUtilizationMetricsEnabled <p>
     *            Whether room utilization metrics are enabled or not.
     *            </p>
     */
    public void setRoomUtilizationMetricsEnabled(Boolean roomUtilizationMetricsEnabled) {
        this.roomUtilizationMetricsEnabled = roomUtilizationMetricsEnabled;
    }

    /**
     * <p>
     * Whether room utilization metrics are enabled or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomUtilizationMetricsEnabled <p>
     *            Whether room utilization metrics are enabled or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingRoomConfiguration withRoomUtilizationMetricsEnabled(
            Boolean roomUtilizationMetricsEnabled) {
        this.roomUtilizationMetricsEnabled = roomUtilizationMetricsEnabled;
        return this;
    }

    /**
     * <p>
     * Creates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     *
     * @return <p>
     *         Creates settings for the end of meeting reminder feature that are
     *         applied to a room profile. The end of meeting reminder enables
     *         Alexa to remind users when a meeting is ending.
     *         </p>
     */
    public CreateEndOfMeetingReminder getEndOfMeetingReminder() {
        return endOfMeetingReminder;
    }

    /**
     * <p>
     * Creates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     *
     * @param endOfMeetingReminder <p>
     *            Creates settings for the end of meeting reminder feature that
     *            are applied to a room profile. The end of meeting reminder
     *            enables Alexa to remind users when a meeting is ending.
     *            </p>
     */
    public void setEndOfMeetingReminder(CreateEndOfMeetingReminder endOfMeetingReminder) {
        this.endOfMeetingReminder = endOfMeetingReminder;
    }

    /**
     * <p>
     * Creates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOfMeetingReminder <p>
     *            Creates settings for the end of meeting reminder feature that
     *            are applied to a room profile. The end of meeting reminder
     *            enables Alexa to remind users when a meeting is ending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingRoomConfiguration withEndOfMeetingReminder(
            CreateEndOfMeetingReminder endOfMeetingReminder) {
        this.endOfMeetingReminder = endOfMeetingReminder;
        return this;
    }

    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's
     * free when joining a meeting with Alexa.
     * </p>
     *
     * @return <p>
     *         Settings to automatically book a room for a configured duration
     *         if it's free when joining a meeting with Alexa.
     *         </p>
     */
    public CreateInstantBooking getInstantBooking() {
        return instantBooking;
    }

    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's
     * free when joining a meeting with Alexa.
     * </p>
     *
     * @param instantBooking <p>
     *            Settings to automatically book a room for a configured
     *            duration if it's free when joining a meeting with Alexa.
     *            </p>
     */
    public void setInstantBooking(CreateInstantBooking instantBooking) {
        this.instantBooking = instantBooking;
    }

    /**
     * <p>
     * Settings to automatically book a room for a configured duration if it's
     * free when joining a meeting with Alexa.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instantBooking <p>
     *            Settings to automatically book a room for a configured
     *            duration if it's free when joining a meeting with Alexa.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingRoomConfiguration withInstantBooking(CreateInstantBooking instantBooking) {
        this.instantBooking = instantBooking;
        return this;
    }

    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can
     * cancel a room reservation if it's not checked into to make the room
     * available for others. Users can check in by joining the meeting with
     * Alexa or an AVS device, or by saying “Alexa, check in.”
     * </p>
     *
     * @return <p>
     *         Settings for requiring a check in when a room is reserved. Alexa
     *         can cancel a room reservation if it's not checked into to make
     *         the room available for others. Users can check in by joining the
     *         meeting with Alexa or an AVS device, or by saying “Alexa, check
     *         in.”
     *         </p>
     */
    public CreateRequireCheckIn getRequireCheckIn() {
        return requireCheckIn;
    }

    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can
     * cancel a room reservation if it's not checked into to make the room
     * available for others. Users can check in by joining the meeting with
     * Alexa or an AVS device, or by saying “Alexa, check in.”
     * </p>
     *
     * @param requireCheckIn <p>
     *            Settings for requiring a check in when a room is reserved.
     *            Alexa can cancel a room reservation if it's not checked into
     *            to make the room available for others. Users can check in by
     *            joining the meeting with Alexa or an AVS device, or by saying
     *            “Alexa, check in.”
     *            </p>
     */
    public void setRequireCheckIn(CreateRequireCheckIn requireCheckIn) {
        this.requireCheckIn = requireCheckIn;
    }

    /**
     * <p>
     * Settings for requiring a check in when a room is reserved. Alexa can
     * cancel a room reservation if it's not checked into to make the room
     * available for others. Users can check in by joining the meeting with
     * Alexa or an AVS device, or by saying “Alexa, check in.”
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireCheckIn <p>
     *            Settings for requiring a check in when a room is reserved.
     *            Alexa can cancel a room reservation if it's not checked into
     *            to make the room available for others. Users can check in by
     *            joining the meeting with Alexa or an AVS device, or by saying
     *            “Alexa, check in.”
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingRoomConfiguration withRequireCheckIn(CreateRequireCheckIn requireCheckIn) {
        this.requireCheckIn = requireCheckIn;
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
        if (getRoomUtilizationMetricsEnabled() != null)
            sb.append("RoomUtilizationMetricsEnabled: " + getRoomUtilizationMetricsEnabled() + ",");
        if (getEndOfMeetingReminder() != null)
            sb.append("EndOfMeetingReminder: " + getEndOfMeetingReminder() + ",");
        if (getInstantBooking() != null)
            sb.append("InstantBooking: " + getInstantBooking() + ",");
        if (getRequireCheckIn() != null)
            sb.append("RequireCheckIn: " + getRequireCheckIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRoomUtilizationMetricsEnabled() == null) ? 0
                        : getRoomUtilizationMetricsEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getEndOfMeetingReminder() == null) ? 0 : getEndOfMeetingReminder().hashCode());
        hashCode = prime * hashCode
                + ((getInstantBooking() == null) ? 0 : getInstantBooking().hashCode());
        hashCode = prime * hashCode
                + ((getRequireCheckIn() == null) ? 0 : getRequireCheckIn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeetingRoomConfiguration == false)
            return false;
        CreateMeetingRoomConfiguration other = (CreateMeetingRoomConfiguration) obj;

        if (other.getRoomUtilizationMetricsEnabled() == null
                ^ this.getRoomUtilizationMetricsEnabled() == null)
            return false;
        if (other.getRoomUtilizationMetricsEnabled() != null
                && other.getRoomUtilizationMetricsEnabled().equals(
                        this.getRoomUtilizationMetricsEnabled()) == false)
            return false;
        if (other.getEndOfMeetingReminder() == null ^ this.getEndOfMeetingReminder() == null)
            return false;
        if (other.getEndOfMeetingReminder() != null
                && other.getEndOfMeetingReminder().equals(this.getEndOfMeetingReminder()) == false)
            return false;
        if (other.getInstantBooking() == null ^ this.getInstantBooking() == null)
            return false;
        if (other.getInstantBooking() != null
                && other.getInstantBooking().equals(this.getInstantBooking()) == false)
            return false;
        if (other.getRequireCheckIn() == null ^ this.getRequireCheckIn() == null)
            return false;
        if (other.getRequireCheckIn() != null
                && other.getRequireCheckIn().equals(this.getRequireCheckIn()) == false)
            return false;
        return true;
    }
}
