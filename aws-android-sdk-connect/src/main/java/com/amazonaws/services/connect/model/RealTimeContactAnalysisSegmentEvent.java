/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Segment type describing a contact event.
 * </p>
 */
public class RealTimeContactAnalysisSegmentEvent implements Serializable {
    /**
     * <p>
     * The identifier of the contact event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String participantId;

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     */
    private String participantRole;

    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String displayName;

    /**
     * <p>
     * Type of the event. For example,
     * <code>application/vnd.amazonaws.connect.event.participant.left</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String eventType;

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     */
    private RealTimeContactAnalysisTimeData time;

    /**
     * <p>
     * The identifier of the contact event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact event.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the contact event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the contact event.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the contact event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            The identifier of the contact event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentEvent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the participant.
     *         </p>
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier of the participant.
     *            </p>
     */
    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * The identifier of the participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param participantId <p>
     *            The identifier of the participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentEvent withParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @return <p>
     *         The role of the participant. For example, is it a customer,
     *         agent, or system.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public RealTimeContactAnalysisSegmentEvent withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * The role of the participant. For example, is it a customer, agent, or
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT, SUPERVISOR
     *
     * @param participantRole <p>
     *            The role of the participant. For example, is it a customer,
     *            agent, or system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public RealTimeContactAnalysisSegmentEvent withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The display name of the participant. Can be redacted.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the participant. Can be redacted.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the participant. Can be redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the participant. Can be redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentEvent withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * Type of the event. For example,
     * <code>application/vnd.amazonaws.connect.event.participant.left</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         Type of the event. For example,
     *         <code>application/vnd.amazonaws.connect.event.participant.left</code>
     *         .
     *         </p>
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * Type of the event. For example,
     * <code>application/vnd.amazonaws.connect.event.participant.left</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param eventType <p>
     *            Type of the event. For example,
     *            <code>application/vnd.amazonaws.connect.event.participant.left</code>
     *            .
     *            </p>
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * Type of the event. For example,
     * <code>application/vnd.amazonaws.connect.event.participant.left</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param eventType <p>
     *            Type of the event. For example,
     *            <code>application/vnd.amazonaws.connect.event.participant.left</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     *
     * @return <p>
     *         Field describing the time of the event. It can have different
     *         representations of time.
     *         </p>
     */
    public RealTimeContactAnalysisTimeData getTime() {
        return time;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     *
     * @param time <p>
     *            Field describing the time of the event. It can have different
     *            representations of time.
     *            </p>
     */
    public void setTime(RealTimeContactAnalysisTimeData time) {
        this.time = time;
    }

    /**
     * <p>
     * Field describing the time of the event. It can have different
     * representations of time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param time <p>
     *            Field describing the time of the event. It can have different
     *            representations of time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisSegmentEvent withTime(RealTimeContactAnalysisTimeData time) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getParticipantId() != null)
            sb.append("ParticipantId: " + getParticipantId() + ",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getTime() != null)
            sb.append("Time: " + getTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentEvent == false)
            return false;
        RealTimeContactAnalysisSegmentEvent other = (RealTimeContactAnalysisSegmentEvent) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null
                && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        return true;
    }
}
