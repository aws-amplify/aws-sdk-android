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

public class PutBotResult implements Serializable {
    /**
     * <p>
     * The name of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see
     * <a>PutBot</a>.
     * </p>
     */
    private java.util.List<Intent> intents;

    /**
     * <p>
     * The prompts that Amazon Lex uses when it doesn't understand the user's
     * intent. For more information, see <a>PutBot</a>.
     * </p>
     */
    private Prompt clarificationPrompt;

    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more
     * information, see <a>PutBot</a>.
     * </p>
     */
    private Statement abortStatement;

    /**
     * <p>
     * When you send a request to create a bot with <code>processBehavior</code>
     * set to <code>BUILD</code>, Amazon Lex sets the <code>status</code>
     * response element to <code>BUILDING</code>.
     * </p>
     * <p>
     * In the <code>READY_BASIC_TESTING</code> state you can test the bot with
     * user inputs that exactly match the utterances configured for the bot's
     * intents and values in the slot types.
     * </p>
     * <p>
     * If Amazon Lex can't build the bot, Amazon Lex sets <code>status</code> to
     * <code>FAILED</code>. Amazon Lex returns the reason for the failure in the
     * <code>failureReason</code> response element.
     * </p>
     * <p>
     * When you set <code>processBehavior</code> to <code>SAVE</code>, Amazon
     * Lex sets the status code to <code>NOT BUILT</code>.
     * </p>
     * <p>
     * When the bot is in the <code>READY</code> state you can test and publish
     * the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILDING, READY, READY_BASIC_TESTING, FAILED,
     * NOT_BUILT
     */
    private String status;

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to build the bot.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The date that the bot was updated. When you create a resource, the
     * creation date and last updated date are the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The date that the bot was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The maximum length of time that Amazon Lex retains the data gathered in a
     * conversation. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     */
    private Integer idleSessionTTLInSeconds;

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with
     * the user. For more information, see <a>PutBot</a>.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * Checksum of the bot that you created.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The version of the bot. For a new bot, the version is always
     * <code>$LATEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String version;

    /**
     * <p>
     * The target locale for the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     */
    private String locale;

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     */
    private Boolean childDirected;

    /**
     * <p>
     * <code>True</code> if a new version of the bot was created. If the
     * <code>createVersion</code> field was not specified in the request, the
     * <code>createVersion</code> field is set to false in the response.
     * </p>
     */
    private Boolean createVersion;

    /**
     * <p>
     * <code>true</code> if the bot is configured to send user utterances to
     * Amazon Comprehend for sentiment analysis. If the
     * <code>detectSentiment</code> field was not specified in the request, the
     * <code>detectSentiment</code> field is <code>false</code> in the response.
     * </p>
     */
    private Boolean detectSentiment;

    /**
     * <p>
     * A list of tags associated with the bot.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public String getName() {
        return name;
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
     * @param name <p>
     *            The name of the bot.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
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
     * @param name <p>
     *            The name of the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the bot.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the bot.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see
     * <a>PutBot</a>.
     * </p>
     *
     * @return <p>
     *         An array of <code>Intent</code> objects. For more information,
     *         see <a>PutBot</a>.
     *         </p>
     */
    public java.util.List<Intent> getIntents() {
        return intents;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see
     * <a>PutBot</a>.
     * </p>
     *
     * @param intents <p>
     *            An array of <code>Intent</code> objects. For more information,
     *            see <a>PutBot</a>.
     *            </p>
     */
    public void setIntents(java.util.Collection<Intent> intents) {
        if (intents == null) {
            this.intents = null;
            return;
        }

        this.intents = new java.util.ArrayList<Intent>(intents);
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see
     * <a>PutBot</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intents <p>
     *            An array of <code>Intent</code> objects. For more information,
     *            see <a>PutBot</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withIntents(Intent... intents) {
        if (getIntents() == null) {
            this.intents = new java.util.ArrayList<Intent>(intents.length);
        }
        for (Intent value : intents) {
            this.intents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see
     * <a>PutBot</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intents <p>
     *            An array of <code>Intent</code> objects. For more information,
     *            see <a>PutBot</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withIntents(java.util.Collection<Intent> intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * The prompts that Amazon Lex uses when it doesn't understand the user's
     * intent. For more information, see <a>PutBot</a>.
     * </p>
     *
     * @return <p>
     *         The prompts that Amazon Lex uses when it doesn't understand the
     *         user's intent. For more information, see <a>PutBot</a>.
     *         </p>
     */
    public Prompt getClarificationPrompt() {
        return clarificationPrompt;
    }

    /**
     * <p>
     * The prompts that Amazon Lex uses when it doesn't understand the user's
     * intent. For more information, see <a>PutBot</a>.
     * </p>
     *
     * @param clarificationPrompt <p>
     *            The prompts that Amazon Lex uses when it doesn't understand
     *            the user's intent. For more information, see <a>PutBot</a>.
     *            </p>
     */
    public void setClarificationPrompt(Prompt clarificationPrompt) {
        this.clarificationPrompt = clarificationPrompt;
    }

    /**
     * <p>
     * The prompts that Amazon Lex uses when it doesn't understand the user's
     * intent. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clarificationPrompt <p>
     *            The prompts that Amazon Lex uses when it doesn't understand
     *            the user's intent. For more information, see <a>PutBot</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withClarificationPrompt(Prompt clarificationPrompt) {
        this.clarificationPrompt = clarificationPrompt;
        return this;
    }

    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more
     * information, see <a>PutBot</a>.
     * </p>
     *
     * @return <p>
     *         The message that Amazon Lex uses to abort a conversation. For
     *         more information, see <a>PutBot</a>.
     *         </p>
     */
    public Statement getAbortStatement() {
        return abortStatement;
    }

    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more
     * information, see <a>PutBot</a>.
     * </p>
     *
     * @param abortStatement <p>
     *            The message that Amazon Lex uses to abort a conversation. For
     *            more information, see <a>PutBot</a>.
     *            </p>
     */
    public void setAbortStatement(Statement abortStatement) {
        this.abortStatement = abortStatement;
    }

    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more
     * information, see <a>PutBot</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortStatement <p>
     *            The message that Amazon Lex uses to abort a conversation. For
     *            more information, see <a>PutBot</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withAbortStatement(Statement abortStatement) {
        this.abortStatement = abortStatement;
        return this;
    }

    /**
     * <p>
     * When you send a request to create a bot with <code>processBehavior</code>
     * set to <code>BUILD</code>, Amazon Lex sets the <code>status</code>
     * response element to <code>BUILDING</code>.
     * </p>
     * <p>
     * In the <code>READY_BASIC_TESTING</code> state you can test the bot with
     * user inputs that exactly match the utterances configured for the bot's
     * intents and values in the slot types.
     * </p>
     * <p>
     * If Amazon Lex can't build the bot, Amazon Lex sets <code>status</code> to
     * <code>FAILED</code>. Amazon Lex returns the reason for the failure in the
     * <code>failureReason</code> response element.
     * </p>
     * <p>
     * When you set <code>processBehavior</code> to <code>SAVE</code>, Amazon
     * Lex sets the status code to <code>NOT BUILT</code>.
     * </p>
     * <p>
     * When the bot is in the <code>READY</code> state you can test and publish
     * the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILDING, READY, READY_BASIC_TESTING, FAILED,
     * NOT_BUILT
     *
     * @return <p>
     *         When you send a request to create a bot with
     *         <code>processBehavior</code> set to <code>BUILD</code>, Amazon
     *         Lex sets the <code>status</code> response element to
     *         <code>BUILDING</code>.
     *         </p>
     *         <p>
     *         In the <code>READY_BASIC_TESTING</code> state you can test the
     *         bot with user inputs that exactly match the utterances configured
     *         for the bot's intents and values in the slot types.
     *         </p>
     *         <p>
     *         If Amazon Lex can't build the bot, Amazon Lex sets
     *         <code>status</code> to <code>FAILED</code>. Amazon Lex returns
     *         the reason for the failure in the <code>failureReason</code>
     *         response element.
     *         </p>
     *         <p>
     *         When you set <code>processBehavior</code> to <code>SAVE</code>,
     *         Amazon Lex sets the status code to <code>NOT BUILT</code>.
     *         </p>
     *         <p>
     *         When the bot is in the <code>READY</code> state you can test and
     *         publish the bot.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * When you send a request to create a bot with <code>processBehavior</code>
     * set to <code>BUILD</code>, Amazon Lex sets the <code>status</code>
     * response element to <code>BUILDING</code>.
     * </p>
     * <p>
     * In the <code>READY_BASIC_TESTING</code> state you can test the bot with
     * user inputs that exactly match the utterances configured for the bot's
     * intents and values in the slot types.
     * </p>
     * <p>
     * If Amazon Lex can't build the bot, Amazon Lex sets <code>status</code> to
     * <code>FAILED</code>. Amazon Lex returns the reason for the failure in the
     * <code>failureReason</code> response element.
     * </p>
     * <p>
     * When you set <code>processBehavior</code> to <code>SAVE</code>, Amazon
     * Lex sets the status code to <code>NOT BUILT</code>.
     * </p>
     * <p>
     * When the bot is in the <code>READY</code> state you can test and publish
     * the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILDING, READY, READY_BASIC_TESTING, FAILED,
     * NOT_BUILT
     *
     * @param status <p>
     *            When you send a request to create a bot with
     *            <code>processBehavior</code> set to <code>BUILD</code>, Amazon
     *            Lex sets the <code>status</code> response element to
     *            <code>BUILDING</code>.
     *            </p>
     *            <p>
     *            In the <code>READY_BASIC_TESTING</code> state you can test the
     *            bot with user inputs that exactly match the utterances
     *            configured for the bot's intents and values in the slot types.
     *            </p>
     *            <p>
     *            If Amazon Lex can't build the bot, Amazon Lex sets
     *            <code>status</code> to <code>FAILED</code>. Amazon Lex returns
     *            the reason for the failure in the <code>failureReason</code>
     *            response element.
     *            </p>
     *            <p>
     *            When you set <code>processBehavior</code> to <code>SAVE</code>
     *            , Amazon Lex sets the status code to <code>NOT BUILT</code>.
     *            </p>
     *            <p>
     *            When the bot is in the <code>READY</code> state you can test
     *            and publish the bot.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * When you send a request to create a bot with <code>processBehavior</code>
     * set to <code>BUILD</code>, Amazon Lex sets the <code>status</code>
     * response element to <code>BUILDING</code>.
     * </p>
     * <p>
     * In the <code>READY_BASIC_TESTING</code> state you can test the bot with
     * user inputs that exactly match the utterances configured for the bot's
     * intents and values in the slot types.
     * </p>
     * <p>
     * If Amazon Lex can't build the bot, Amazon Lex sets <code>status</code> to
     * <code>FAILED</code>. Amazon Lex returns the reason for the failure in the
     * <code>failureReason</code> response element.
     * </p>
     * <p>
     * When you set <code>processBehavior</code> to <code>SAVE</code>, Amazon
     * Lex sets the status code to <code>NOT BUILT</code>.
     * </p>
     * <p>
     * When the bot is in the <code>READY</code> state you can test and publish
     * the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILDING, READY, READY_BASIC_TESTING, FAILED,
     * NOT_BUILT
     *
     * @param status <p>
     *            When you send a request to create a bot with
     *            <code>processBehavior</code> set to <code>BUILD</code>, Amazon
     *            Lex sets the <code>status</code> response element to
     *            <code>BUILDING</code>.
     *            </p>
     *            <p>
     *            In the <code>READY_BASIC_TESTING</code> state you can test the
     *            bot with user inputs that exactly match the utterances
     *            configured for the bot's intents and values in the slot types.
     *            </p>
     *            <p>
     *            If Amazon Lex can't build the bot, Amazon Lex sets
     *            <code>status</code> to <code>FAILED</code>. Amazon Lex returns
     *            the reason for the failure in the <code>failureReason</code>
     *            response element.
     *            </p>
     *            <p>
     *            When you set <code>processBehavior</code> to <code>SAVE</code>
     *            , Amazon Lex sets the status code to <code>NOT BUILT</code>.
     *            </p>
     *            <p>
     *            When the bot is in the <code>READY</code> state you can test
     *            and publish the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public PutBotResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * When you send a request to create a bot with <code>processBehavior</code>
     * set to <code>BUILD</code>, Amazon Lex sets the <code>status</code>
     * response element to <code>BUILDING</code>.
     * </p>
     * <p>
     * In the <code>READY_BASIC_TESTING</code> state you can test the bot with
     * user inputs that exactly match the utterances configured for the bot's
     * intents and values in the slot types.
     * </p>
     * <p>
     * If Amazon Lex can't build the bot, Amazon Lex sets <code>status</code> to
     * <code>FAILED</code>. Amazon Lex returns the reason for the failure in the
     * <code>failureReason</code> response element.
     * </p>
     * <p>
     * When you set <code>processBehavior</code> to <code>SAVE</code>, Amazon
     * Lex sets the status code to <code>NOT BUILT</code>.
     * </p>
     * <p>
     * When the bot is in the <code>READY</code> state you can test and publish
     * the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILDING, READY, READY_BASIC_TESTING, FAILED,
     * NOT_BUILT
     *
     * @param status <p>
     *            When you send a request to create a bot with
     *            <code>processBehavior</code> set to <code>BUILD</code>, Amazon
     *            Lex sets the <code>status</code> response element to
     *            <code>BUILDING</code>.
     *            </p>
     *            <p>
     *            In the <code>READY_BASIC_TESTING</code> state you can test the
     *            bot with user inputs that exactly match the utterances
     *            configured for the bot's intents and values in the slot types.
     *            </p>
     *            <p>
     *            If Amazon Lex can't build the bot, Amazon Lex sets
     *            <code>status</code> to <code>FAILED</code>. Amazon Lex returns
     *            the reason for the failure in the <code>failureReason</code>
     *            response element.
     *            </p>
     *            <p>
     *            When you set <code>processBehavior</code> to <code>SAVE</code>
     *            , Amazon Lex sets the status code to <code>NOT BUILT</code>.
     *            </p>
     *            <p>
     *            When the bot is in the <code>READY</code> state you can test
     *            and publish the bot.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * When you send a request to create a bot with <code>processBehavior</code>
     * set to <code>BUILD</code>, Amazon Lex sets the <code>status</code>
     * response element to <code>BUILDING</code>.
     * </p>
     * <p>
     * In the <code>READY_BASIC_TESTING</code> state you can test the bot with
     * user inputs that exactly match the utterances configured for the bot's
     * intents and values in the slot types.
     * </p>
     * <p>
     * If Amazon Lex can't build the bot, Amazon Lex sets <code>status</code> to
     * <code>FAILED</code>. Amazon Lex returns the reason for the failure in the
     * <code>failureReason</code> response element.
     * </p>
     * <p>
     * When you set <code>processBehavior</code> to <code>SAVE</code>, Amazon
     * Lex sets the status code to <code>NOT BUILT</code>.
     * </p>
     * <p>
     * When the bot is in the <code>READY</code> state you can test and publish
     * the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILDING, READY, READY_BASIC_TESTING, FAILED,
     * NOT_BUILT
     *
     * @param status <p>
     *            When you send a request to create a bot with
     *            <code>processBehavior</code> set to <code>BUILD</code>, Amazon
     *            Lex sets the <code>status</code> response element to
     *            <code>BUILDING</code>.
     *            </p>
     *            <p>
     *            In the <code>READY_BASIC_TESTING</code> state you can test the
     *            bot with user inputs that exactly match the utterances
     *            configured for the bot's intents and values in the slot types.
     *            </p>
     *            <p>
     *            If Amazon Lex can't build the bot, Amazon Lex sets
     *            <code>status</code> to <code>FAILED</code>. Amazon Lex returns
     *            the reason for the failure in the <code>failureReason</code>
     *            response element.
     *            </p>
     *            <p>
     *            When you set <code>processBehavior</code> to <code>SAVE</code>
     *            , Amazon Lex sets the status code to <code>NOT BUILT</code>.
     *            </p>
     *            <p>
     *            When the bot is in the <code>READY</code> state you can test
     *            and publish the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public PutBotResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to build the bot.
     * </p>
     *
     * @return <p>
     *         If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *         provides the reason that it failed to build the bot.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to build the bot.
     * </p>
     *
     * @param failureReason <p>
     *            If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *            provides the reason that it failed to build the bot.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the
     * reason that it failed to build the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If <code>status</code> is <code>FAILED</code>, Amazon Lex
     *            provides the reason that it failed to build the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The date that the bot was updated. When you create a resource, the
     * creation date and last updated date are the same.
     * </p>
     *
     * @return <p>
     *         The date that the bot was updated. When you create a resource,
     *         the creation date and last updated date are the same.
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot was updated. When you create a resource, the
     * creation date and last updated date are the same.
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            The date that the bot was updated. When you create a resource,
     *            the creation date and last updated date are the same.
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot was updated. When you create a resource, the
     * creation date and last updated date are the same.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            The date that the bot was updated. When you create a resource,
     *            the creation date and last updated date are the same.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * <p>
     * The date that the bot was created.
     * </p>
     *
     * @return <p>
     *         The date that the bot was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date that the bot was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date that the bot was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the bot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date that the bot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The maximum length of time that Amazon Lex retains the data gathered in a
     * conversation. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @return <p>
     *         The maximum length of time that Amazon Lex retains the data
     *         gathered in a conversation. For more information, see
     *         <a>PutBot</a>.
     *         </p>
     */
    public Integer getIdleSessionTTLInSeconds() {
        return idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum length of time that Amazon Lex retains the data gathered in a
     * conversation. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param idleSessionTTLInSeconds <p>
     *            The maximum length of time that Amazon Lex retains the data
     *            gathered in a conversation. For more information, see
     *            <a>PutBot</a>.
     *            </p>
     */
    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum length of time that Amazon Lex retains the data gathered in a
     * conversation. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param idleSessionTTLInSeconds <p>
     *            The maximum length of time that Amazon Lex retains the data
     *            gathered in a conversation. For more information, see
     *            <a>PutBot</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
        return this;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with
     * the user. For more information, see <a>PutBot</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Polly voice ID that Amazon Lex uses for voice
     *         interaction with the user. For more information, see
     *         <a>PutBot</a>.
     *         </p>
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with
     * the user. For more information, see <a>PutBot</a>.
     * </p>
     *
     * @param voiceId <p>
     *            The Amazon Polly voice ID that Amazon Lex uses for voice
     *            interaction with the user. For more information, see
     *            <a>PutBot</a>.
     *            </p>
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with
     * the user. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceId <p>
     *            The Amazon Polly voice ID that Amazon Lex uses for voice
     *            interaction with the user. For more information, see
     *            <a>PutBot</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }

    /**
     * <p>
     * Checksum of the bot that you created.
     * </p>
     *
     * @return <p>
     *         Checksum of the bot that you created.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Checksum of the bot that you created.
     * </p>
     *
     * @param checksum <p>
     *            Checksum of the bot that you created.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum of the bot that you created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Checksum of the bot that you created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * The version of the bot. For a new bot, the version is always
     * <code>$LATEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version of the bot. For a new bot, the version is always
     *         <code>$LATEST</code>.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the bot. For a new bot, the version is always
     * <code>$LATEST</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param version <p>
     *            The version of the bot. For a new bot, the version is always
     *            <code>$LATEST</code>.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the bot. For a new bot, the version is always
     * <code>$LATEST</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param version <p>
     *            The version of the bot. For a new bot, the version is always
     *            <code>$LATEST</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The target locale for the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @return <p>
     *         The target locale for the bot.
     *         </p>
     * @see Locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The target locale for the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            The target locale for the bot.
     *            </p>
     * @see Locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The target locale for the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            The target locale for the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public PutBotResult withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * The target locale for the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            The target locale for the bot.
     *            </p>
     * @see Locale
     */
    public void setLocale(Locale locale) {
        this.locale = locale.toString();
    }

    /**
     * <p>
     * The target locale for the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            The target locale for the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public PutBotResult withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     *
     * @return <p>
     *         For each Amazon Lex bot created with the Amazon Lex Model
     *         Building Service, you must specify whether your use of Amazon Lex
     *         is related to a website, program, or other application that is
     *         directed or targeted, in whole or in part, to children under age
     *         13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in
     *         the <code>childDirected</code> field. By specifying
     *         <code>true</code> in the <code>childDirected</code> field, you
     *         confirm that your use of Amazon Lex <b>is</b> related to a
     *         website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of
     *         Amazon Lex <b>is not</b> related to a website, program, or other
     *         application that is directed or targeted, in whole or in part, to
     *         children under age 13 and subject to COPPA. You may not specify a
     *         default value for the <code>childDirected</code> field that does
     *         not accurately reflect whether your use of Amazon Lex is related
     *         to a website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.
     *         </p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other
     *         application that is directed in whole or in part, to children
     *         under age 13, you must obtain any required verifiable parental
     *         consent under COPPA. For information regarding the use of Amazon
     *         Lex in connection with websites, programs, or other applications
     *         that are directed or targeted, in whole or in part, to children
     *         under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex
     *         FAQ.</a>
     *         </p>
     */
    public Boolean isChildDirected() {
        return childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     *
     * @return <p>
     *         For each Amazon Lex bot created with the Amazon Lex Model
     *         Building Service, you must specify whether your use of Amazon Lex
     *         is related to a website, program, or other application that is
     *         directed or targeted, in whole or in part, to children under age
     *         13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in
     *         the <code>childDirected</code> field. By specifying
     *         <code>true</code> in the <code>childDirected</code> field, you
     *         confirm that your use of Amazon Lex <b>is</b> related to a
     *         website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of
     *         Amazon Lex <b>is not</b> related to a website, program, or other
     *         application that is directed or targeted, in whole or in part, to
     *         children under age 13 and subject to COPPA. You may not specify a
     *         default value for the <code>childDirected</code> field that does
     *         not accurately reflect whether your use of Amazon Lex is related
     *         to a website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.
     *         </p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other
     *         application that is directed in whole or in part, to children
     *         under age 13, you must obtain any required verifiable parental
     *         consent under COPPA. For information regarding the use of Amazon
     *         Lex in connection with websites, programs, or other applications
     *         that are directed or targeted, in whole or in part, to children
     *         under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex
     *         FAQ.</a>
     *         </p>
     */
    public Boolean getChildDirected() {
        return childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     *
     * @param childDirected <p>
     *            For each Amazon Lex bot created with the Amazon Lex Model
     *            Building Service, you must specify whether your use of Amazon
     *            Lex is related to a website, program, or other application
     *            that is directed or targeted, in whole or in part, to children
     *            under age 13 and subject to the Children's Online Privacy
     *            Protection Act (COPPA) by specifying <code>true</code> or
     *            <code>false</code> in the <code>childDirected</code> field. By
     *            specifying <code>true</code> in the <code>childDirected</code>
     *            field, you confirm that your use of Amazon Lex <b>is</b>
     *            related to a website, program, or other application that is
     *            directed or targeted, in whole or in part, to children under
     *            age 13 and subject to COPPA. By specifying <code>false</code>
     *            in the <code>childDirected</code> field, you confirm that your
     *            use of Amazon Lex <b>is not</b> related to a website, program,
     *            or other application that is directed or targeted, in whole or
     *            in part, to children under age 13 and subject to COPPA. You
     *            may not specify a default value for the
     *            <code>childDirected</code> field that does not accurately
     *            reflect whether your use of Amazon Lex is related to a
     *            website, program, or other application that is directed or
     *            targeted, in whole or in part, to children under age 13 and
     *            subject to COPPA.
     *            </p>
     *            <p>
     *            If your use of Amazon Lex relates to a website, program, or
     *            other application that is directed in whole or in part, to
     *            children under age 13, you must obtain any required verifiable
     *            parental consent under COPPA. For information regarding the
     *            use of Amazon Lex in connection with websites, programs, or
     *            other applications that are directed or targeted, in whole or
     *            in part, to children under age 13, see the <a
     *            href="https://aws.amazon.com/lex/faqs#data-security">Amazon
     *            Lex FAQ.</a>
     *            </p>
     */
    public void setChildDirected(Boolean childDirected) {
        this.childDirected = childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param childDirected <p>
     *            For each Amazon Lex bot created with the Amazon Lex Model
     *            Building Service, you must specify whether your use of Amazon
     *            Lex is related to a website, program, or other application
     *            that is directed or targeted, in whole or in part, to children
     *            under age 13 and subject to the Children's Online Privacy
     *            Protection Act (COPPA) by specifying <code>true</code> or
     *            <code>false</code> in the <code>childDirected</code> field. By
     *            specifying <code>true</code> in the <code>childDirected</code>
     *            field, you confirm that your use of Amazon Lex <b>is</b>
     *            related to a website, program, or other application that is
     *            directed or targeted, in whole or in part, to children under
     *            age 13 and subject to COPPA. By specifying <code>false</code>
     *            in the <code>childDirected</code> field, you confirm that your
     *            use of Amazon Lex <b>is not</b> related to a website, program,
     *            or other application that is directed or targeted, in whole or
     *            in part, to children under age 13 and subject to COPPA. You
     *            may not specify a default value for the
     *            <code>childDirected</code> field that does not accurately
     *            reflect whether your use of Amazon Lex is related to a
     *            website, program, or other application that is directed or
     *            targeted, in whole or in part, to children under age 13 and
     *            subject to COPPA.
     *            </p>
     *            <p>
     *            If your use of Amazon Lex relates to a website, program, or
     *            other application that is directed in whole or in part, to
     *            children under age 13, you must obtain any required verifiable
     *            parental consent under COPPA. For information regarding the
     *            use of Amazon Lex in connection with websites, programs, or
     *            other applications that are directed or targeted, in whole or
     *            in part, to children under age 13, see the <a
     *            href="https://aws.amazon.com/lex/faqs#data-security">Amazon
     *            Lex FAQ.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withChildDirected(Boolean childDirected) {
        this.childDirected = childDirected;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if a new version of the bot was created. If the
     * <code>createVersion</code> field was not specified in the request, the
     * <code>createVersion</code> field is set to false in the response.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if a new version of the bot was created. If the
     *         <code>createVersion</code> field was not specified in the
     *         request, the <code>createVersion</code> field is set to false in
     *         the response.
     *         </p>
     */
    public Boolean isCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * <code>True</code> if a new version of the bot was created. If the
     * <code>createVersion</code> field was not specified in the request, the
     * <code>createVersion</code> field is set to false in the response.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if a new version of the bot was created. If the
     *         <code>createVersion</code> field was not specified in the
     *         request, the <code>createVersion</code> field is set to false in
     *         the response.
     *         </p>
     */
    public Boolean getCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * <code>True</code> if a new version of the bot was created. If the
     * <code>createVersion</code> field was not specified in the request, the
     * <code>createVersion</code> field is set to false in the response.
     * </p>
     *
     * @param createVersion <p>
     *            <code>True</code> if a new version of the bot was created. If
     *            the <code>createVersion</code> field was not specified in the
     *            request, the <code>createVersion</code> field is set to false
     *            in the response.
     *            </p>
     */
    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * <p>
     * <code>True</code> if a new version of the bot was created. If the
     * <code>createVersion</code> field was not specified in the request, the
     * <code>createVersion</code> field is set to false in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createVersion <p>
     *            <code>True</code> if a new version of the bot was created. If
     *            the <code>createVersion</code> field was not specified in the
     *            request, the <code>createVersion</code> field is set to false
     *            in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
        return this;
    }

    /**
     * <p>
     * <code>true</code> if the bot is configured to send user utterances to
     * Amazon Comprehend for sentiment analysis. If the
     * <code>detectSentiment</code> field was not specified in the request, the
     * <code>detectSentiment</code> field is <code>false</code> in the response.
     * </p>
     *
     * @return <p>
     *         <code>true</code> if the bot is configured to send user
     *         utterances to Amazon Comprehend for sentiment analysis. If the
     *         <code>detectSentiment</code> field was not specified in the
     *         request, the <code>detectSentiment</code> field is
     *         <code>false</code> in the response.
     *         </p>
     */
    public Boolean isDetectSentiment() {
        return detectSentiment;
    }

    /**
     * <p>
     * <code>true</code> if the bot is configured to send user utterances to
     * Amazon Comprehend for sentiment analysis. If the
     * <code>detectSentiment</code> field was not specified in the request, the
     * <code>detectSentiment</code> field is <code>false</code> in the response.
     * </p>
     *
     * @return <p>
     *         <code>true</code> if the bot is configured to send user
     *         utterances to Amazon Comprehend for sentiment analysis. If the
     *         <code>detectSentiment</code> field was not specified in the
     *         request, the <code>detectSentiment</code> field is
     *         <code>false</code> in the response.
     *         </p>
     */
    public Boolean getDetectSentiment() {
        return detectSentiment;
    }

    /**
     * <p>
     * <code>true</code> if the bot is configured to send user utterances to
     * Amazon Comprehend for sentiment analysis. If the
     * <code>detectSentiment</code> field was not specified in the request, the
     * <code>detectSentiment</code> field is <code>false</code> in the response.
     * </p>
     *
     * @param detectSentiment <p>
     *            <code>true</code> if the bot is configured to send user
     *            utterances to Amazon Comprehend for sentiment analysis. If the
     *            <code>detectSentiment</code> field was not specified in the
     *            request, the <code>detectSentiment</code> field is
     *            <code>false</code> in the response.
     *            </p>
     */
    public void setDetectSentiment(Boolean detectSentiment) {
        this.detectSentiment = detectSentiment;
    }

    /**
     * <p>
     * <code>true</code> if the bot is configured to send user utterances to
     * Amazon Comprehend for sentiment analysis. If the
     * <code>detectSentiment</code> field was not specified in the request, the
     * <code>detectSentiment</code> field is <code>false</code> in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectSentiment <p>
     *            <code>true</code> if the bot is configured to send user
     *            utterances to Amazon Comprehend for sentiment analysis. If the
     *            <code>detectSentiment</code> field was not specified in the
     *            request, the <code>detectSentiment</code> field is
     *            <code>false</code> in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withDetectSentiment(Boolean detectSentiment) {
        this.detectSentiment = detectSentiment;
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the bot.
     * </p>
     *
     * @return <p>
     *         A list of tags associated with the bot.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the bot.
     * </p>
     *
     * @param tags <p>
     *            A list of tags associated with the bot.
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
     * A list of tags associated with the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags associated with the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withTags(Tag... tags) {
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
     * A list of tags associated with the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags associated with the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotResult withTags(java.util.Collection<Tag> tags) {
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
        if (getIntents() != null)
            sb.append("intents: " + getIntents() + ",");
        if (getClarificationPrompt() != null)
            sb.append("clarificationPrompt: " + getClarificationPrompt() + ",");
        if (getAbortStatement() != null)
            sb.append("abortStatement: " + getAbortStatement() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("lastUpdatedDate: " + getLastUpdatedDate() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("idleSessionTTLInSeconds: " + getIdleSessionTTLInSeconds() + ",");
        if (getVoiceId() != null)
            sb.append("voiceId: " + getVoiceId() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getLocale() != null)
            sb.append("locale: " + getLocale() + ",");
        if (getChildDirected() != null)
            sb.append("childDirected: " + getChildDirected() + ",");
        if (getCreateVersion() != null)
            sb.append("createVersion: " + getCreateVersion() + ",");
        if (getDetectSentiment() != null)
            sb.append("detectSentiment: " + getDetectSentiment() + ",");
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
        hashCode = prime * hashCode + ((getIntents() == null) ? 0 : getIntents().hashCode());
        hashCode = prime * hashCode
                + ((getClarificationPrompt() == null) ? 0 : getClarificationPrompt().hashCode());
        hashCode = prime * hashCode
                + ((getAbortStatement() == null) ? 0 : getAbortStatement().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds()
                        .hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode
                + ((getChildDirected() == null) ? 0 : getChildDirected().hashCode());
        hashCode = prime * hashCode
                + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDetectSentiment() == null) ? 0 : getDetectSentiment().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBotResult == false)
            return false;
        PutBotResult other = (PutBotResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntents() == null ^ this.getIntents() == null)
            return false;
        if (other.getIntents() != null && other.getIntents().equals(this.getIntents()) == false)
            return false;
        if (other.getClarificationPrompt() == null ^ this.getClarificationPrompt() == null)
            return false;
        if (other.getClarificationPrompt() != null
                && other.getClarificationPrompt().equals(this.getClarificationPrompt()) == false)
            return false;
        if (other.getAbortStatement() == null ^ this.getAbortStatement() == null)
            return false;
        if (other.getAbortStatement() != null
                && other.getAbortStatement().equals(this.getAbortStatement()) == false)
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
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null
                && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getChildDirected() == null ^ this.getChildDirected() == null)
            return false;
        if (other.getChildDirected() != null
                && other.getChildDirected().equals(this.getChildDirected()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null
                && other.getCreateVersion().equals(this.getCreateVersion()) == false)
            return false;
        if (other.getDetectSentiment() == null ^ this.getDetectSentiment() == null)
            return false;
        if (other.getDetectSentiment() != null
                && other.getDetectSentiment().equals(this.getDetectSentiment()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
