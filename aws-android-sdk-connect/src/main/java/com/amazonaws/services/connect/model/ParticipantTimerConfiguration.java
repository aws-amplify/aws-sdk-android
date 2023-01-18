/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information for the timer. After the timer configuration is
 * set, it persists for the duration of the chat. It persists across new
 * contacts in the chain, for example, transfer contacts.
 * </p>
 * <p>
 * For more information about how chat timeouts work, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html"
 * >Set up chat timeouts for human participants</a>.
 * </p>
 */
public class ParticipantTimerConfiguration implements Serializable {
    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER, AGENT
     */
    private String participantRole;

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for
     * considering a human chat participant as idle.
     * <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to
     * automatically disconnecting a chat participant due to idleness.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, DISCONNECT_NONCUSTOMER
     */
    private String timerType;

    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the
     * timer), or the duration of the timer in minutes. Only one value can be
     * set.
     * </p>
     */
    private ParticipantTimerValue timerValue;

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER, AGENT
     *
     * @return <p>
     *         The role of the participant in the chat conversation.
     *         </p>
     * @see TimerEligibleParticipantRoles
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER, AGENT
     *
     * @param participantRole <p>
     *            The role of the participant in the chat conversation.
     *            </p>
     * @see TimerEligibleParticipantRoles
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER, AGENT
     *
     * @param participantRole <p>
     *            The role of the participant in the chat conversation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimerEligibleParticipantRoles
     */
    public ParticipantTimerConfiguration withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER, AGENT
     *
     * @param participantRole <p>
     *            The role of the participant in the chat conversation.
     *            </p>
     * @see TimerEligibleParticipantRoles
     */
    public void setParticipantRole(TimerEligibleParticipantRoles participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * The role of the participant in the chat conversation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER, AGENT
     *
     * @param participantRole <p>
     *            The role of the participant in the chat conversation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimerEligibleParticipantRoles
     */
    public ParticipantTimerConfiguration withParticipantRole(
            TimerEligibleParticipantRoles participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for
     * considering a human chat participant as idle.
     * <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to
     * automatically disconnecting a chat participant due to idleness.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, DISCONNECT_NONCUSTOMER
     *
     * @return <p>
     *         The type of timer. <code>IDLE</code> indicates the timer applies
     *         for considering a human chat participant as idle.
     *         <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies
     *         to automatically disconnecting a chat participant due to
     *         idleness.
     *         </p>
     * @see ParticipantTimerType
     */
    public String getTimerType() {
        return timerType;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for
     * considering a human chat participant as idle.
     * <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to
     * automatically disconnecting a chat participant due to idleness.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, DISCONNECT_NONCUSTOMER
     *
     * @param timerType <p>
     *            The type of timer. <code>IDLE</code> indicates the timer
     *            applies for considering a human chat participant as idle.
     *            <code>DISCONNECT_NONCUSTOMER</code> indicates the timer
     *            applies to automatically disconnecting a chat participant due
     *            to idleness.
     *            </p>
     * @see ParticipantTimerType
     */
    public void setTimerType(String timerType) {
        this.timerType = timerType;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for
     * considering a human chat participant as idle.
     * <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to
     * automatically disconnecting a chat participant due to idleness.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, DISCONNECT_NONCUSTOMER
     *
     * @param timerType <p>
     *            The type of timer. <code>IDLE</code> indicates the timer
     *            applies for considering a human chat participant as idle.
     *            <code>DISCONNECT_NONCUSTOMER</code> indicates the timer
     *            applies to automatically disconnecting a chat participant due
     *            to idleness.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantTimerType
     */
    public ParticipantTimerConfiguration withTimerType(String timerType) {
        this.timerType = timerType;
        return this;
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for
     * considering a human chat participant as idle.
     * <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to
     * automatically disconnecting a chat participant due to idleness.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, DISCONNECT_NONCUSTOMER
     *
     * @param timerType <p>
     *            The type of timer. <code>IDLE</code> indicates the timer
     *            applies for considering a human chat participant as idle.
     *            <code>DISCONNECT_NONCUSTOMER</code> indicates the timer
     *            applies to automatically disconnecting a chat participant due
     *            to idleness.
     *            </p>
     * @see ParticipantTimerType
     */
    public void setTimerType(ParticipantTimerType timerType) {
        this.timerType = timerType.toString();
    }

    /**
     * <p>
     * The type of timer. <code>IDLE</code> indicates the timer applies for
     * considering a human chat participant as idle.
     * <code>DISCONNECT_NONCUSTOMER</code> indicates the timer applies to
     * automatically disconnecting a chat participant due to idleness.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, DISCONNECT_NONCUSTOMER
     *
     * @param timerType <p>
     *            The type of timer. <code>IDLE</code> indicates the timer
     *            applies for considering a human chat participant as idle.
     *            <code>DISCONNECT_NONCUSTOMER</code> indicates the timer
     *            applies to automatically disconnecting a chat participant due
     *            to idleness.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantTimerType
     */
    public ParticipantTimerConfiguration withTimerType(ParticipantTimerType timerType) {
        this.timerType = timerType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the
     * timer), or the duration of the timer in minutes. Only one value can be
     * set.
     * </p>
     *
     * @return <p>
     *         The value of the timer. Either the timer action (Unset to delete
     *         the timer), or the duration of the timer in minutes. Only one
     *         value can be set.
     *         </p>
     */
    public ParticipantTimerValue getTimerValue() {
        return timerValue;
    }

    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the
     * timer), or the duration of the timer in minutes. Only one value can be
     * set.
     * </p>
     *
     * @param timerValue <p>
     *            The value of the timer. Either the timer action (Unset to
     *            delete the timer), or the duration of the timer in minutes.
     *            Only one value can be set.
     *            </p>
     */
    public void setTimerValue(ParticipantTimerValue timerValue) {
        this.timerValue = timerValue;
    }

    /**
     * <p>
     * The value of the timer. Either the timer action (Unset to delete the
     * timer), or the duration of the timer in minutes. Only one value can be
     * set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timerValue <p>
     *            The value of the timer. Either the timer action (Unset to
     *            delete the timer), or the duration of the timer in minutes.
     *            Only one value can be set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParticipantTimerConfiguration withTimerValue(ParticipantTimerValue timerValue) {
        this.timerValue = timerValue;
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
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole() + ",");
        if (getTimerType() != null)
            sb.append("TimerType: " + getTimerType() + ",");
        if (getTimerValue() != null)
            sb.append("TimerValue: " + getTimerValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getTimerType() == null) ? 0 : getTimerType().hashCode());
        hashCode = prime * hashCode + ((getTimerValue() == null) ? 0 : getTimerValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantTimerConfiguration == false)
            return false;
        ParticipantTimerConfiguration other = (ParticipantTimerConfiguration) obj;

        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getTimerType() == null ^ this.getTimerType() == null)
            return false;
        if (other.getTimerType() != null
                && other.getTimerType().equals(this.getTimerType()) == false)
            return false;
        if (other.getTimerValue() == null ^ this.getTimerValue() == null)
            return false;
        if (other.getTimerValue() != null
                && other.getTimerValue().equals(this.getTimerValue()) == false)
            return false;
        return true;
    }
}
