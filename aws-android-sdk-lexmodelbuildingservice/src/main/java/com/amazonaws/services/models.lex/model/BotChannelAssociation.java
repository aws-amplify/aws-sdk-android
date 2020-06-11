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

/**
 * <p>
 * Represents an association between an Amazon Lex bot and an external messaging
 * platform.
 * </p>
 */
public class BotChannelAssociation implements Serializable {
    /**
     * <p>
     * The name of the association between the bot and the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botAlias;

    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and
     * Twilio.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String botName;

    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel
     * was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being
     * established between the Amazon Lex bot and the external messaging
     * platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Facebook, Slack, Twilio-Sms, Kik
     */
    private String type;

    /**
     * <p>
     * Provides information necessary to communicate with the messaging
     * platform.
     * </p>
     */
    private java.util.Map<String, String> botConfiguration;

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For
     * information about the reason for the failure, see the
     * <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CREATED, FAILED
     */
    private String status;

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to create the association.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the association between the bot and the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the association between the bot and the channel.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the association between the bot and the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the association between the bot and the channel.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the association between the bot and the channel.
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
     *            The name of the association between the bot and the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A text description of the association you are creating.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A text description of the association you are creating.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A text description of the association you are creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         An alias pointing to the specific version of the Amazon Lex bot
     *         to which this association is being made.
     *         </p>
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botAlias <p>
     *            An alias pointing to the specific version of the Amazon Lex
     *            bot to which this association is being made.
     *            </p>
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which
     * this association is being made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botAlias <p>
     *            An alias pointing to the specific version of the Amazon Lex
     *            bot to which this association is being made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation withBotAlias(String botAlias) {
        this.botAlias = botAlias;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and
     * Twilio.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the Amazon Lex bot to which this association is being
     *         made.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, Amazon Lex supports associations with Facebook and
     *         Slack, and Twilio.
     *         </p>
     *         </note>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and
     * Twilio.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot to which this association is
     *            being made.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, Amazon Lex supports associations with Facebook and
     *            Slack, and Twilio.
     *            </p>
     *            </note>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and
     * Twilio.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot to which this association is
     *            being made.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, Amazon Lex supports associations with Facebook and
     *            Slack, and Twilio.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel
     * was created.
     * </p>
     *
     * @return <p>
     *         The date that the association between the Amazon Lex bot and the
     *         channel was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel
     * was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date that the association between the Amazon Lex bot and
     *            the channel was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel
     * was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date that the association between the Amazon Lex bot and
     *            the channel was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being
     * established between the Amazon Lex bot and the external messaging
     * platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Facebook, Slack, Twilio-Sms, Kik
     *
     * @return <p>
     *         Specifies the type of association by indicating the type of
     *         channel being established between the Amazon Lex bot and the
     *         external messaging platform.
     *         </p>
     * @see ChannelType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being
     * established between the Amazon Lex bot and the external messaging
     * platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Facebook, Slack, Twilio-Sms, Kik
     *
     * @param type <p>
     *            Specifies the type of association by indicating the type of
     *            channel being established between the Amazon Lex bot and the
     *            external messaging platform.
     *            </p>
     * @see ChannelType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being
     * established between the Amazon Lex bot and the external messaging
     * platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Facebook, Slack, Twilio-Sms, Kik
     *
     * @param type <p>
     *            Specifies the type of association by indicating the type of
     *            channel being established between the Amazon Lex bot and the
     *            external messaging platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public BotChannelAssociation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being
     * established between the Amazon Lex bot and the external messaging
     * platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Facebook, Slack, Twilio-Sms, Kik
     *
     * @param type <p>
     *            Specifies the type of association by indicating the type of
     *            channel being established between the Amazon Lex bot and the
     *            external messaging platform.
     *            </p>
     * @see ChannelType
     */
    public void setType(ChannelType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being
     * established between the Amazon Lex bot and the external messaging
     * platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Facebook, Slack, Twilio-Sms, Kik
     *
     * @param type <p>
     *            Specifies the type of association by indicating the type of
     *            channel being established between the Amazon Lex bot and the
     *            external messaging platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public BotChannelAssociation withType(ChannelType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Provides information necessary to communicate with the messaging
     * platform.
     * </p>
     *
     * @return <p>
     *         Provides information necessary to communicate with the messaging
     *         platform.
     *         </p>
     */
    public java.util.Map<String, String> getBotConfiguration() {
        return botConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to communicate with the messaging
     * platform.
     * </p>
     *
     * @param botConfiguration <p>
     *            Provides information necessary to communicate with the
     *            messaging platform.
     *            </p>
     */
    public void setBotConfiguration(java.util.Map<String, String> botConfiguration) {
        this.botConfiguration = botConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to communicate with the messaging
     * platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botConfiguration <p>
     *            Provides information necessary to communicate with the
     *            messaging platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation withBotConfiguration(java.util.Map<String, String> botConfiguration) {
        this.botConfiguration = botConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides information necessary to communicate with the messaging
     * platform.
     * </p>
     * <p>
     * The method adds a new key-value pair into botConfiguration parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into botConfiguration.
     * @param value The corresponding value of the entry to be added into
     *            botConfiguration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation addbotConfigurationEntry(String key, String value) {
        if (null == this.botConfiguration) {
            this.botConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.botConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.botConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into botConfiguration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public BotChannelAssociation clearbotConfigurationEntries() {
        this.botConfiguration = null;
        return this;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For
     * information about the reason for the failure, see the
     * <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CREATED, FAILED
     *
     * @return <p>
     *         The status of the bot channel.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - The channel has been created and is ready
     *         for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - Channel creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - There was an error creating the channel.
     *         For information about the reason for the failure, see the
     *         <code>failureReason</code> field.
     *         </p>
     *         </li>
     *         </ul>
     * @see ChannelStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For
     * information about the reason for the failure, see the
     * <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CREATED, FAILED
     *
     * @param status <p>
     *            The status of the bot channel.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The channel has been created and is
     *            ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Channel creation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - There was an error creating the channel.
     *            For information about the reason for the failure, see the
     *            <code>failureReason</code> field.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChannelStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For
     * information about the reason for the failure, see the
     * <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CREATED, FAILED
     *
     * @param status <p>
     *            The status of the bot channel.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The channel has been created and is
     *            ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Channel creation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - There was an error creating the channel.
     *            For information about the reason for the failure, see the
     *            <code>failureReason</code> field.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelStatus
     */
    public BotChannelAssociation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For
     * information about the reason for the failure, see the
     * <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CREATED, FAILED
     *
     * @param status <p>
     *            The status of the bot channel.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The channel has been created and is
     *            ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Channel creation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - There was an error creating the channel.
     *            For information about the reason for the failure, see the
     *            <code>failureReason</code> field.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChannelStatus
     */
    public void setStatus(ChannelStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For
     * information about the reason for the failure, see the
     * <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, CREATED, FAILED
     *
     * @param status <p>
     *            The status of the bot channel.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The channel has been created and is
     *            ready for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Channel creation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - There was an error creating the channel.
     *            For information about the reason for the failure, see the
     *            <code>failureReason</code> field.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelStatus
     */
    public BotChannelAssociation withStatus(ChannelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to create the association.
     * </p>
     *
     * @return <p>
     *         If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *         provides the reason that it failed to create the association.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to create the association.
     * </p>
     *
     * @param failureReason <p>
     *            If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *            provides the reason that it failed to create the association.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to create the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *            provides the reason that it failed to create the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BotChannelAssociation withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getBotAlias() != null)
            sb.append("botAlias: " + getBotAlias() + ",");
        if (getBotName() != null)
            sb.append("botName: " + getBotName() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getBotConfiguration() != null)
            sb.append("botConfiguration: " + getBotConfiguration() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason());
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
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getBotConfiguration() == null) ? 0 : getBotConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotChannelAssociation == false)
            return false;
        BotChannelAssociation other = (BotChannelAssociation) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBotConfiguration() == null ^ this.getBotConfiguration() == null)
            return false;
        if (other.getBotConfiguration() != null
                && other.getBotConfiguration().equals(this.getBotConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
