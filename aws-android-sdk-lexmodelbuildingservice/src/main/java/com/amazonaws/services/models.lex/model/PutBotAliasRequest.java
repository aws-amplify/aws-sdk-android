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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an alias for the specified version of the bot or replaces an alias
 * for the specified bot. To change the version of the bot that the alias points
 * to, replace the alias. For more information about aliases, see
 * <a>versioning-aliases</a>.
 * </p>
 * <p>
 * This operation requires permissions for the <code>lex:PutBotAlias</code>
 * action.
 * </p>
 */
public class PutBotAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * The version of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String botVersion;

    /**
     * <p>
     * The name of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botName;

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * Settings for conversation logs for the alias.
     * </p>
     */
    private ConversationLogsRequest conversationLogs;

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you
     * create an alias, you can't use the <code>PutBotAlias</code> operation to
     * update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the alias. The name is <i>not</i> case sensitive.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the alias. The name is <i>not</i> case sensitive.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
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
     *            The name of the alias. The name is <i>not</i> case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the alias.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the alias.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version of the bot.
     *         </p>
     */
    public String getBotVersion() {
        return botVersion;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param botVersion <p>
     *            The version of the bot.
     *            </p>
     */
    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot.
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
     *            The version of the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withBotVersion(String botVersion) {
        this.botVersion = botVersion;
        return this;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the bot.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot.
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
     *            The name of the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @return <p>
     *         Identifies a specific revision of the <code>$LATEST</code>
     *         version.
     *         </p>
     *         <p>
     *         When you create a new bot alias, leave the <code>checksum</code>
     *         field blank. If you specify a checksum you get a
     *         <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a bot alias, set the
     *         <code>checksum</code> field to the checksum of the most recent
     *         revision of the <code>$LATEST</code> version. If you don't
     *         specify the <code> checksum</code> field, or if the checksum does
     *         not match the <code>$LATEST</code> version, you get a
     *         <code>PreconditionFailedException</code> exception.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version.
     *            </p>
     *            <p>
     *            When you create a new bot alias, leave the
     *            <code>checksum</code> field blank. If you specify a checksum
     *            you get a <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a bot alias, set the
     *            <code>checksum</code> field to the checksum of the most recent
     *            revision of the <code>$LATEST</code> version. If you don't
     *            specify the <code> checksum</code> field, or if the checksum
     *            does not match the <code>$LATEST</code> version, you get a
     *            <code>PreconditionFailedException</code> exception.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field
     * to the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version.
     *            </p>
     *            <p>
     *            When you create a new bot alias, leave the
     *            <code>checksum</code> field blank. If you specify a checksum
     *            you get a <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a bot alias, set the
     *            <code>checksum</code> field to the checksum of the most recent
     *            revision of the <code>$LATEST</code> version. If you don't
     *            specify the <code> checksum</code> field, or if the checksum
     *            does not match the <code>$LATEST</code> version, you get a
     *            <code>PreconditionFailedException</code> exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * Settings for conversation logs for the alias.
     * </p>
     *
     * @return <p>
     *         Settings for conversation logs for the alias.
     *         </p>
     */
    public ConversationLogsRequest getConversationLogs() {
        return conversationLogs;
    }

    /**
     * <p>
     * Settings for conversation logs for the alias.
     * </p>
     *
     * @param conversationLogs <p>
     *            Settings for conversation logs for the alias.
     *            </p>
     */
    public void setConversationLogs(ConversationLogsRequest conversationLogs) {
        this.conversationLogs = conversationLogs;
    }

    /**
     * <p>
     * Settings for conversation logs for the alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversationLogs <p>
     *            Settings for conversation logs for the alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withConversationLogs(ConversationLogsRequest conversationLogs) {
        this.conversationLogs = conversationLogs;
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you
     * create an alias, you can't use the <code>PutBotAlias</code> operation to
     * update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     *
     * @return <p>
     *         A list of tags to add to the bot alias. You can only add tags
     *         when you create an alias, you can't use the
     *         <code>PutBotAlias</code> operation to update the tags on a bot
     *         alias. To update tags, use the <code>TagResource</code>
     *         operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you
     * create an alias, you can't use the <code>PutBotAlias</code> operation to
     * update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to add to the bot alias. You can only add tags
     *            when you create an alias, you can't use the
     *            <code>PutBotAlias</code> operation to update the tags on a bot
     *            alias. To update tags, use the <code>TagResource</code>
     *            operation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you
     * create an alias, you can't use the <code>PutBotAlias</code> operation to
     * update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to add to the bot alias. You can only add tags
     *            when you create an alias, you can't use the
     *            <code>PutBotAlias</code> operation to update the tags on a bot
     *            alias. To update tags, use the <code>TagResource</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the bot alias. You can only add tags when you
     * create an alias, you can't use the <code>PutBotAlias</code> operation to
     * update the tags on a bot alias. To update tags, use the
     * <code>TagResource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to add to the bot alias. You can only add tags
     *            when you create an alias, you can't use the
     *            <code>PutBotAlias</code> operation to update the tags on a bot
     *            alias. To update tags, use the <code>TagResource</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotAliasRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getConversationLogs() != null)
            sb.append("conversationLogs: " + getConversationLogs() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode
                + ((getConversationLogs() == null) ? 0 : getConversationLogs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBotAliasRequest == false)
            return false;
        PutBotAliasRequest other = (PutBotAliasRequest) obj;

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
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getConversationLogs() == null ^ this.getConversationLogs() == null)
            return false;
        if (other.getConversationLogs() != null
                && other.getConversationLogs().equals(this.getConversationLogs()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
