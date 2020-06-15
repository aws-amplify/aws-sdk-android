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
 * Settings for the end of meeting reminder feature that are applied to a room
 * profile. The end of meeting reminder enables Alexa to remind users when a
 * meeting is ending.
 * </p>
 */
public class UpdateEndOfMeetingReminder implements Serializable {
    /**
     * <p>
     * Updates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     */
    private java.util.List<Integer> reminderAtMinutes;

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANNOUNCEMENT_TIME_CHECK,
     * ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK
     */
    private String reminderType;

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Updates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     *
     * @return <p>
     *         Updates settings for the end of meeting reminder feature that are
     *         applied to a room profile. The end of meeting reminder enables
     *         Alexa to remind users when a meeting is ending.
     *         </p>
     */
    public java.util.List<Integer> getReminderAtMinutes() {
        return reminderAtMinutes;
    }

    /**
     * <p>
     * Updates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     *
     * @param reminderAtMinutes <p>
     *            Updates settings for the end of meeting reminder feature that
     *            are applied to a room profile. The end of meeting reminder
     *            enables Alexa to remind users when a meeting is ending.
     *            </p>
     */
    public void setReminderAtMinutes(java.util.Collection<Integer> reminderAtMinutes) {
        if (reminderAtMinutes == null) {
            this.reminderAtMinutes = null;
            return;
        }

        this.reminderAtMinutes = new java.util.ArrayList<Integer>(reminderAtMinutes);
    }

    /**
     * <p>
     * Updates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reminderAtMinutes <p>
     *            Updates settings for the end of meeting reminder feature that
     *            are applied to a room profile. The end of meeting reminder
     *            enables Alexa to remind users when a meeting is ending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndOfMeetingReminder withReminderAtMinutes(Integer... reminderAtMinutes) {
        if (getReminderAtMinutes() == null) {
            this.reminderAtMinutes = new java.util.ArrayList<Integer>(reminderAtMinutes.length);
        }
        for (Integer value : reminderAtMinutes) {
            this.reminderAtMinutes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Updates settings for the end of meeting reminder feature that are applied
     * to a room profile. The end of meeting reminder enables Alexa to remind
     * users when a meeting is ending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reminderAtMinutes <p>
     *            Updates settings for the end of meeting reminder feature that
     *            are applied to a room profile. The end of meeting reminder
     *            enables Alexa to remind users when a meeting is ending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndOfMeetingReminder withReminderAtMinutes(
            java.util.Collection<Integer> reminderAtMinutes) {
        setReminderAtMinutes(reminderAtMinutes);
        return this;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANNOUNCEMENT_TIME_CHECK,
     * ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK
     *
     * @return <p>
     *         The type of sound that users hear during the end of meeting
     *         reminder.
     *         </p>
     * @see EndOfMeetingReminderType
     */
    public String getReminderType() {
        return reminderType;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANNOUNCEMENT_TIME_CHECK,
     * ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK
     *
     * @param reminderType <p>
     *            The type of sound that users hear during the end of meeting
     *            reminder.
     *            </p>
     * @see EndOfMeetingReminderType
     */
    public void setReminderType(String reminderType) {
        this.reminderType = reminderType;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANNOUNCEMENT_TIME_CHECK,
     * ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK
     *
     * @param reminderType <p>
     *            The type of sound that users hear during the end of meeting
     *            reminder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndOfMeetingReminderType
     */
    public UpdateEndOfMeetingReminder withReminderType(String reminderType) {
        this.reminderType = reminderType;
        return this;
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANNOUNCEMENT_TIME_CHECK,
     * ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK
     *
     * @param reminderType <p>
     *            The type of sound that users hear during the end of meeting
     *            reminder.
     *            </p>
     * @see EndOfMeetingReminderType
     */
    public void setReminderType(EndOfMeetingReminderType reminderType) {
        this.reminderType = reminderType.toString();
    }

    /**
     * <p>
     * The type of sound that users hear during the end of meeting reminder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ANNOUNCEMENT_TIME_CHECK,
     * ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK
     *
     * @param reminderType <p>
     *            The type of sound that users hear during the end of meeting
     *            reminder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndOfMeetingReminderType
     */
    public UpdateEndOfMeetingReminder withReminderType(EndOfMeetingReminderType reminderType) {
        this.reminderType = reminderType.toString();
        return this;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether an end of meeting reminder is enabled or not.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether an end of meeting reminder is enabled or not.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     *
     * @param enabled <p>
     *            Whether an end of meeting reminder is enabled or not.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether an end of meeting reminder is enabled or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Whether an end of meeting reminder is enabled or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndOfMeetingReminder withEnabled(Boolean enabled) {
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
        if (getReminderAtMinutes() != null)
            sb.append("ReminderAtMinutes: " + getReminderAtMinutes() + ",");
        if (getReminderType() != null)
            sb.append("ReminderType: " + getReminderType() + ",");
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
                + ((getReminderAtMinutes() == null) ? 0 : getReminderAtMinutes().hashCode());
        hashCode = prime * hashCode
                + ((getReminderType() == null) ? 0 : getReminderType().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndOfMeetingReminder == false)
            return false;
        UpdateEndOfMeetingReminder other = (UpdateEndOfMeetingReminder) obj;

        if (other.getReminderAtMinutes() == null ^ this.getReminderAtMinutes() == null)
            return false;
        if (other.getReminderAtMinutes() != null
                && other.getReminderAtMinutes().equals(this.getReminderAtMinutes()) == false)
            return false;
        if (other.getReminderType() == null ^ this.getReminderType() == null)
            return false;
        if (other.getReminderType() != null
                && other.getReminderType().equals(this.getReminderType()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
