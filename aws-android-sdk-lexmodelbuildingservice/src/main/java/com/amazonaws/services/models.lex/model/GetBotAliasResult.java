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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

public class GetBotAliasResult implements Serializable {
    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the bot alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String botVersion;

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botName;

    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * Checksum of the bot alias.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the
     * alias.
     * </p>
     */
    private ConversationLogsResponse conversationLogs;

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot alias.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the bot alias.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the bot alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the bot alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the bot alias.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the bot alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the bot alias.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the bot alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version of the bot that the alias points to.
     *         </p>
     */
    public String getBotVersion() {
        return botVersion;
    }

    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param botVersion <p>
     *            The version of the bot that the alias points to.
     *            </p>
     */
    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that the alias points to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param botVersion <p>
     *            The version of the bot that the alias points to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withBotVersion(String botVersion) {
        this.botVersion = botVersion;
        return this;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot that the alias points to.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the bot that the alias points to.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the bot that the alias points to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     *
     * @return <p>
     *         The date that the bot alias was updated. When you create a
     *         resource, the creation date and the last updated date are the
     *         same.
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            The date that the bot alias was updated. When you create a
     *            resource, the creation date and the last updated date are the
     *            same.
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot alias was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            The date that the bot alias was updated. When you create a
     *            resource, the creation date and the last updated date are the
     *            same.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     *
     * @return <p>
     *         The date that the bot alias was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date that the bot alias was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the bot alias was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date that the bot alias was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * Checksum of the bot alias.
     * </p>
     *
     * @return <p>
     *         Checksum of the bot alias.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Checksum of the bot alias.
     * </p>
     *
     * @param checksum <p>
     *            Checksum of the bot alias.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum of the bot alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Checksum of the bot alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the
     * alias.
     * </p>
     *
     * @return <p>
     *         The settings that determine how Amazon Lex uses conversation logs
     *         for the alias.
     *         </p>
     */
    public ConversationLogsResponse getConversationLogs() {
        return conversationLogs;
    }

    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the
     * alias.
     * </p>
     *
     * @param conversationLogs <p>
     *            The settings that determine how Amazon Lex uses conversation
     *            logs for the alias.
     *            </p>
     */
    public void setConversationLogs(ConversationLogsResponse conversationLogs) {
        this.conversationLogs = conversationLogs;
    }

    /**
     * <p>
     * The settings that determine how Amazon Lex uses conversation logs for the
     * alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversationLogs <p>
     *            The settings that determine how Amazon Lex uses conversation
     *            logs for the alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasResult withConversationLogs(ConversationLogsResponse conversationLogs) {
        this.conversationLogs = conversationLogs;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getBotVersion() != null)
            sb.append("botVersion: " + getBotVersion() + ",");
        if (getBotName() != null)
            sb.append("botName: " + getBotName() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("lastUpdatedDate: " + getLastUpdatedDate() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getConversationLogs() != null)
            sb.append("conversationLogs: " + getConversationLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode
                + ((getConversationLogs() == null) ? 0 : getConversationLogs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotAliasResult == false)
            return false;
        GetBotAliasResult other = (GetBotAliasResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null
                && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null
                && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getConversationLogs() == null ^ this.getConversationLogs() == null)
            return false;
        if (other.getConversationLogs() != null
                && other.getConversationLogs().equals(this.getConversationLogs()) == false)
            return false;
        return true;
    }
}
