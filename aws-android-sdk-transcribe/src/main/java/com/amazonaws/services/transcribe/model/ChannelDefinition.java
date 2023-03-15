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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Makes it possible to specify which speaker is on which channel. For example,
 * if your agent is the first participant to speak, you would set
 * <code>ChannelId</code> to <code>0</code> (to indicate the first channel) and
 * <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that it's the
 * agent speaking).
 * </p>
 */
public class ChannelDefinition implements Serializable {
    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Integer channelId;

    /**
     * <p>
     * Specify the speaker you want to define. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     */
    private String participantRole;

    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         Specify the audio channel you want to define.
     *         </p>
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param channelId <p>
     *            Specify the audio channel you want to define.
     *            </p>
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param channelId <p>
     *            Specify the audio channel you want to define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelDefinition withChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * <p>
     * Specify the speaker you want to define. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @return <p>
     *         Specify the speaker you want to define. Omitting this parameter
     *         is equivalent to specifying both participants.
     *         </p>
     * @see ParticipantRole
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * <p>
     * Specify the speaker you want to define. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the speaker you want to define. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Specify the speaker you want to define. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the speaker you want to define. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public ChannelDefinition withParticipantRole(String participantRole) {
        this.participantRole = participantRole;
        return this;
    }

    /**
     * <p>
     * Specify the speaker you want to define. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the speaker you want to define. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @see ParticipantRole
     */
    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
    }

    /**
     * <p>
     * Specify the speaker you want to define. Omitting this parameter is
     * equivalent to specifying both participants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AGENT, CUSTOMER
     *
     * @param participantRole <p>
     *            Specify the speaker you want to define. Omitting this
     *            parameter is equivalent to specifying both participants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParticipantRole
     */
    public ChannelDefinition withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
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
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId() + ",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: " + getParticipantRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelDefinition == false)
            return false;
        ChannelDefinition other = (ChannelDefinition) obj;

        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null
                && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        return true;
    }
}
