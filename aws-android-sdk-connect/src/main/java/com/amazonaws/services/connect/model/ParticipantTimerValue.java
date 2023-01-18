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
 * The value of the timer. Either the timer action (<code>Unset</code> to delete
 * the timer), or the duration of the timer in minutes. Only one value can be
 * set.
 * </p>
 * <p>
 * For more information about how chat timeouts work, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html"
 * >Set up chat timeouts for human participants</a>.
 * </p>
 */
public class ParticipantTimerValue implements Serializable {
    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>
     * . It deletes a timer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unset
     */
    private String participantTimerAction;

    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 480<br/>
     */
    private Integer participantTimerDurationInMinutes;

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>
     * . It deletes a timer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unset
     *
     * @return <p>
     *         The timer action. Currently only one value is allowed:
     *         <code>Unset</code>. It deletes a timer.
     *         </p>
     * @see ParticipantTimerAction
     */
    public String getParticipantTimerAction() {
        return participantTimerAction;
    }

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>
     * . It deletes a timer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unset
     *
     * @param participantTimerAction <p>
     *            The timer action. Currently only one value is allowed:
     *            <code>Unset</code>. It deletes a timer.
     *            </p>
     * @see ParticipantTimerAction
     */
    public void setParticipantTimerAction(String participantTimerAction) {
        this.participantTimerAction = participantTimerAction;
    }

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>
     * . It deletes a timer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unset
     *
     * @param participantTimerAction <p>
     *            The timer action. Currently only one value is allowed:
     *            <code>Unset</code>. It deletes a timer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantTimerAction
     */
    public ParticipantTimerValue withParticipantTimerAction(String participantTimerAction) {
        this.participantTimerAction = participantTimerAction;
        return this;
    }

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>
     * . It deletes a timer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unset
     *
     * @param participantTimerAction <p>
     *            The timer action. Currently only one value is allowed:
     *            <code>Unset</code>. It deletes a timer.
     *            </p>
     * @see ParticipantTimerAction
     */
    public void setParticipantTimerAction(ParticipantTimerAction participantTimerAction) {
        this.participantTimerAction = participantTimerAction.toString();
    }

    /**
     * <p>
     * The timer action. Currently only one value is allowed: <code>Unset</code>
     * . It deletes a timer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Unset
     *
     * @param participantTimerAction <p>
     *            The timer action. Currently only one value is allowed:
     *            <code>Unset</code>. It deletes a timer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantTimerAction
     */
    public ParticipantTimerValue withParticipantTimerAction(
            ParticipantTimerAction participantTimerAction) {
        this.participantTimerAction = participantTimerAction.toString();
        return this;
    }

    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 480<br/>
     *
     * @return <p>
     *         The duration of a timer, in minutes.
     *         </p>
     */
    public Integer getParticipantTimerDurationInMinutes() {
        return participantTimerDurationInMinutes;
    }

    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 480<br/>
     *
     * @param participantTimerDurationInMinutes <p>
     *            The duration of a timer, in minutes.
     *            </p>
     */
    public void setParticipantTimerDurationInMinutes(Integer participantTimerDurationInMinutes) {
        this.participantTimerDurationInMinutes = participantTimerDurationInMinutes;
    }

    /**
     * <p>
     * The duration of a timer, in minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 480<br/>
     *
     * @param participantTimerDurationInMinutes <p>
     *            The duration of a timer, in minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParticipantTimerValue withParticipantTimerDurationInMinutes(
            Integer participantTimerDurationInMinutes) {
        this.participantTimerDurationInMinutes = participantTimerDurationInMinutes;
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
        if (getParticipantTimerAction() != null)
            sb.append("ParticipantTimerAction: " + getParticipantTimerAction() + ",");
        if (getParticipantTimerDurationInMinutes() != null)
            sb.append("ParticipantTimerDurationInMinutes: "
                    + getParticipantTimerDurationInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getParticipantTimerAction() == null) ? 0 : getParticipantTimerAction()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getParticipantTimerDurationInMinutes() == null) ? 0
                        : getParticipantTimerDurationInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantTimerValue == false)
            return false;
        ParticipantTimerValue other = (ParticipantTimerValue) obj;

        if (other.getParticipantTimerAction() == null ^ this.getParticipantTimerAction() == null)
            return false;
        if (other.getParticipantTimerAction() != null
                && other.getParticipantTimerAction().equals(this.getParticipantTimerAction()) == false)
            return false;
        if (other.getParticipantTimerDurationInMinutes() == null
                ^ this.getParticipantTimerDurationInMinutes() == null)
            return false;
        if (other.getParticipantTimerDurationInMinutes() != null
                && other.getParticipantTimerDurationInMinutes().equals(
                        this.getParticipantTimerDurationInMinutes()) == false)
            return false;
        return true;
    }
}
