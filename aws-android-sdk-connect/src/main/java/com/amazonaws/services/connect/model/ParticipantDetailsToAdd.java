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
 * The details to add for the participant.
 * </p>
 */
public class ParticipantDetailsToAdd implements Serializable {
    /**
     * <p>
     * The role of the participant being added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT
     */
    private String participantRole;

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String displayName;

    /**
     * <p>
     * The role of the participant being added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT
     *
     * @return <p>
     *         The role of the participant being added.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * The role of the participant being added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT
     *
     * @param participantRole <p>
     *            The role of the participant being added.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * The role of the participant being added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT
     *
     * @param participantRole <p>
     *            The role of the participant being added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public ParticipantDetailsToAdd withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * The role of the participant being added.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT
     *
     * @param participantRole <p>
     *            The role of the participant being added.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * The role of the participant being added.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER, SYSTEM, CUSTOM_BOT
     *
     * @param participantRole <p>
     *            The role of the participant being added.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public ParticipantDetailsToAdd withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The display name of the participant.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the participant.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the participant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param displayName <p>
     *            The display name of the participant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParticipantDetailsToAdd withDisplayName(String displayName) {
        this.displayName = displayName;
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
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantDetailsToAdd == false)
            return false;
        ParticipantDetailsToAdd other = (ParticipantDetailsToAdd) obj;

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
        return true;
    }
}
