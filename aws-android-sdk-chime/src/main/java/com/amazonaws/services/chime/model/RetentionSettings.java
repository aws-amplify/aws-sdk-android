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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The retention settings for an Amazon Chime Enterprise account that determine
 * how long to retain items such as chat room messages and chat conversation
 * messages.
 * </p>
 */
public class RetentionSettings implements Serializable {
    /**
     * <p>
     * The chat room retention settings.
     * </p>
     */
    private RoomRetentionSettings roomRetentionSettings;

    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     */
    private ConversationRetentionSettings conversationRetentionSettings;

    /**
     * <p>
     * The chat room retention settings.
     * </p>
     *
     * @return <p>
     *         The chat room retention settings.
     *         </p>
     */
    public RoomRetentionSettings getRoomRetentionSettings() {
        return roomRetentionSettings;
    }

    /**
     * <p>
     * The chat room retention settings.
     * </p>
     *
     * @param roomRetentionSettings <p>
     *            The chat room retention settings.
     *            </p>
     */
    public void setRoomRetentionSettings(RoomRetentionSettings roomRetentionSettings) {
        this.roomRetentionSettings = roomRetentionSettings;
    }

    /**
     * <p>
     * The chat room retention settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomRetentionSettings <p>
     *            The chat room retention settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetentionSettings withRoomRetentionSettings(RoomRetentionSettings roomRetentionSettings) {
        this.roomRetentionSettings = roomRetentionSettings;
        return this;
    }

    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     *
     * @return <p>
     *         The chat conversation retention settings.
     *         </p>
     */
    public ConversationRetentionSettings getConversationRetentionSettings() {
        return conversationRetentionSettings;
    }

    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     *
     * @param conversationRetentionSettings <p>
     *            The chat conversation retention settings.
     *            </p>
     */
    public void setConversationRetentionSettings(
            ConversationRetentionSettings conversationRetentionSettings) {
        this.conversationRetentionSettings = conversationRetentionSettings;
    }

    /**
     * <p>
     * The chat conversation retention settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversationRetentionSettings <p>
     *            The chat conversation retention settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetentionSettings withConversationRetentionSettings(
            ConversationRetentionSettings conversationRetentionSettings) {
        this.conversationRetentionSettings = conversationRetentionSettings;
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
        if (getRoomRetentionSettings() != null)
            sb.append("RoomRetentionSettings: " + getRoomRetentionSettings() + ",");
        if (getConversationRetentionSettings() != null)
            sb.append("ConversationRetentionSettings: " + getConversationRetentionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRoomRetentionSettings() == null) ? 0 : getRoomRetentionSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getConversationRetentionSettings() == null) ? 0
                        : getConversationRetentionSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetentionSettings == false)
            return false;
        RetentionSettings other = (RetentionSettings) obj;

        if (other.getRoomRetentionSettings() == null ^ this.getRoomRetentionSettings() == null)
            return false;
        if (other.getRoomRetentionSettings() != null
                && other.getRoomRetentionSettings().equals(this.getRoomRetentionSettings()) == false)
            return false;
        if (other.getConversationRetentionSettings() == null
                ^ this.getConversationRetentionSettings() == null)
            return false;
        if (other.getConversationRetentionSettings() != null
                && other.getConversationRetentionSettings().equals(
                        this.getConversationRetentionSettings()) == false)
            return false;
        return true;
    }
}
