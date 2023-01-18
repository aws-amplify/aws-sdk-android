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
public class UpdateParticipantRoleConfigChannelInfo implements Serializable {
    /**
     * <p>
     * Configuration information for the chat participant role.
     * </p>
     */
    private ChatParticipantRoleConfig chat;

    /**
     * <p>
     * Configuration information for the chat participant role.
     * </p>
     *
     * @return <p>
     *         Configuration information for the chat participant role.
     *         </p>
     */
    public ChatParticipantRoleConfig getChat() {
        return chat;
    }

    /**
     * <p>
     * Configuration information for the chat participant role.
     * </p>
     *
     * @param chat <p>
     *            Configuration information for the chat participant role.
     *            </p>
     */
    public void setChat(ChatParticipantRoleConfig chat) {
        this.chat = chat;
    }

    /**
     * <p>
     * Configuration information for the chat participant role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param chat <p>
     *            Configuration information for the chat participant role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateParticipantRoleConfigChannelInfo withChat(ChatParticipantRoleConfig chat) {
        this.chat = chat;
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
        if (getChat() != null)
            sb.append("Chat: " + getChat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChat() == null) ? 0 : getChat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParticipantRoleConfigChannelInfo == false)
            return false;
        UpdateParticipantRoleConfigChannelInfo other = (UpdateParticipantRoleConfigChannelInfo) obj;

        if (other.getChat() == null ^ this.getChat() == null)
            return false;
        if (other.getChat() != null && other.getChat().equals(this.getChat()) == false)
            return false;
        return true;
    }
}
