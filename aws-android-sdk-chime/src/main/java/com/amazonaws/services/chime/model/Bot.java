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
 * A resource that allows Enterprise account administrators to configure an
 * interface to receive events from Amazon Chime.
 * </p>
 */
public class Bot implements Serializable {
    /**
     * <p>
     * The bot ID.
     * </p>
     */
    private String botId;

    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The bot display name.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The bot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChatBot
     */
    private String botType;

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The bot email address.
     * </p>
     */
    private String botEmail;

    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing
     * event endpoint.
     * </p>
     */
    private String securityToken;

    /**
     * <p>
     * The bot ID.
     * </p>
     *
     * @return <p>
     *         The bot ID.
     *         </p>
     */
    public String getBotId() {
        return botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     *
     * @param botId <p>
     *            The bot ID.
     *            </p>
     */
    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botId <p>
     *            The bot ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withBotId(String botId) {
        this.botId = botId;
        return this;
    }

    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     *
     * @return <p>
     *         The unique ID for the bot user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     *
     * @param userId <p>
     *            The unique ID for the bot user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The unique ID for the bot user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The bot display name.
     * </p>
     *
     * @return <p>
     *         The bot display name.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The bot display name.
     * </p>
     *
     * @param displayName <p>
     *            The bot display name.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The bot display name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            The bot display name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChatBot
     *
     * @return <p>
     *         The bot type.
     *         </p>
     * @see BotType
     */
    public String getBotType() {
        return botType;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChatBot
     *
     * @param botType <p>
     *            The bot type.
     *            </p>
     * @see BotType
     */
    public void setBotType(String botType) {
        this.botType = botType;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChatBot
     *
     * @param botType <p>
     *            The bot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BotType
     */
    public Bot withBotType(String botType) {
        this.botType = botType;
        return this;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChatBot
     *
     * @param botType <p>
     *            The bot type.
     *            </p>
     * @see BotType
     */
    public void setBotType(BotType botType) {
        this.botType = botType.toString();
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChatBot
     *
     * @param botType <p>
     *            The bot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BotType
     */
    public Bot withBotType(BotType botType) {
        this.botType = botType.toString();
        return this;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     *
     * @return <p>
     *         When true, the bot is stopped from running in your account.
     *         </p>
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     *
     * @return <p>
     *         When true, the bot is stopped from running in your account.
     *         </p>
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     *
     * @param disabled <p>
     *            When true, the bot is stopped from running in your account.
     *            </p>
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabled <p>
     *            When true, the bot is stopped from running in your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The bot creation timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The bot creation timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The bot creation timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The updated bot timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     *
     * @param updatedTimestamp <p>
     *            The updated bot timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTimestamp <p>
     *            The updated bot timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    /**
     * <p>
     * The bot email address.
     * </p>
     *
     * @return <p>
     *         The bot email address.
     *         </p>
     */
    public String getBotEmail() {
        return botEmail;
    }

    /**
     * <p>
     * The bot email address.
     * </p>
     *
     * @param botEmail <p>
     *            The bot email address.
     *            </p>
     */
    public void setBotEmail(String botEmail) {
        this.botEmail = botEmail;
    }

    /**
     * <p>
     * The bot email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botEmail <p>
     *            The bot email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withBotEmail(String botEmail) {
        this.botEmail = botEmail;
        return this;
    }

    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing
     * event endpoint.
     * </p>
     *
     * @return <p>
     *         The security token used to authenticate Amazon Chime with the
     *         outgoing event endpoint.
     *         </p>
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing
     * event endpoint.
     * </p>
     *
     * @param securityToken <p>
     *            The security token used to authenticate Amazon Chime with the
     *            outgoing event endpoint.
     *            </p>
     */
    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing
     * event endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityToken <p>
     *            The security token used to authenticate Amazon Chime with the
     *            outgoing event endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bot withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
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
        if (getBotId() != null)
            sb.append("BotId: " + getBotId() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getBotType() != null)
            sb.append("BotType: " + getBotType() + ",");
        if (getDisabled() != null)
            sb.append("Disabled: " + getDisabled() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: " + getUpdatedTimestamp() + ",");
        if (getBotEmail() != null)
            sb.append("BotEmail: " + getBotEmail() + ",");
        if (getSecurityToken() != null)
            sb.append("SecurityToken: " + getSecurityToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getBotType() == null) ? 0 : getBotType().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getBotEmail() == null) ? 0 : getBotEmail().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityToken() == null) ? 0 : getSecurityToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bot == false)
            return false;
        Bot other = (Bot) obj;

        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getBotType() == null ^ this.getBotType() == null)
            return false;
        if (other.getBotType() != null && other.getBotType().equals(this.getBotType()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null
                && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getBotEmail() == null ^ this.getBotEmail() == null)
            return false;
        if (other.getBotEmail() != null && other.getBotEmail().equals(this.getBotEmail()) == false)
            return false;
        if (other.getSecurityToken() == null ^ this.getSecurityToken() == null)
            return false;
        if (other.getSecurityToken() != null
                && other.getSecurityToken().equals(this.getSecurityToken()) == false)
            return false;
        return true;
    }
}
