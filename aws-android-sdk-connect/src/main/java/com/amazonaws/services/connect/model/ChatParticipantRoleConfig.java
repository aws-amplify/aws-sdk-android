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
 * Configuration information for the chat participant role.
 * </p>
 */
public class ChatParticipantRoleConfig implements Serializable {
    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of
     * role and timer type. Duplicate entries error out the request with a 400.
     * </p>
     */
    private java.util.List<ParticipantTimerConfiguration> participantTimerConfigList;

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of
     * role and timer type. Duplicate entries error out the request with a 400.
     * </p>
     *
     * @return <p>
     *         A list of participant timers. You can specify any unique
     *         combination of role and timer type. Duplicate entries error out
     *         the request with a 400.
     *         </p>
     */
    public java.util.List<ParticipantTimerConfiguration> getParticipantTimerConfigList() {
        return participantTimerConfigList;
    }

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of
     * role and timer type. Duplicate entries error out the request with a 400.
     * </p>
     *
     * @param participantTimerConfigList <p>
     *            A list of participant timers. You can specify any unique
     *            combination of role and timer type. Duplicate entries error
     *            out the request with a 400.
     *            </p>
     */
    public void setParticipantTimerConfigList(
            java.util.Collection<ParticipantTimerConfiguration> participantTimerConfigList) {
        if (participantTimerConfigList == null) {
            this.participantTimerConfigList = null;
            return;
        }

        this.participantTimerConfigList = new java.util.ArrayList<ParticipantTimerConfiguration>(
                participantTimerConfigList);
    }

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of
     * role and timer type. Duplicate entries error out the request with a 400.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantTimerConfigList <p>
     *            A list of participant timers. You can specify any unique
     *            combination of role and timer type. Duplicate entries error
     *            out the request with a 400.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChatParticipantRoleConfig withParticipantTimerConfigList(
            ParticipantTimerConfiguration... participantTimerConfigList) {
        if (getParticipantTimerConfigList() == null) {
            this.participantTimerConfigList = new java.util.ArrayList<ParticipantTimerConfiguration>(
                    participantTimerConfigList.length);
        }
        for (ParticipantTimerConfiguration value : participantTimerConfigList) {
            this.participantTimerConfigList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of participant timers. You can specify any unique combination of
     * role and timer type. Duplicate entries error out the request with a 400.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param participantTimerConfigList <p>
     *            A list of participant timers. You can specify any unique
     *            combination of role and timer type. Duplicate entries error
     *            out the request with a 400.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChatParticipantRoleConfig withParticipantTimerConfigList(
            java.util.Collection<ParticipantTimerConfiguration> participantTimerConfigList) {
        setParticipantTimerConfigList(participantTimerConfigList);
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
        if (getParticipantTimerConfigList() != null)
            sb.append("ParticipantTimerConfigList: " + getParticipantTimerConfigList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getParticipantTimerConfigList() == null) ? 0 : getParticipantTimerConfigList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatParticipantRoleConfig == false)
            return false;
        ChatParticipantRoleConfig other = (ChatParticipantRoleConfig) obj;

        if (other.getParticipantTimerConfigList() == null
                ^ this.getParticipantTimerConfigList() == null)
            return false;
        if (other.getParticipantTimerConfigList() != null
                && other.getParticipantTimerConfigList().equals(
                        this.getParticipantTimerConfigList()) == false)
            return false;
        return true;
    }
}
