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

public class GetIntentResult implements Serializable {
    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     */
    private java.util.List<Slot> slots;

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     */
    private java.util.List<String> sampleUtterances;

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent
     * before fulfilling the user's request. For more information, see
     * <a>PutIntent</a>.
     * </p>
     */
    private Prompt confirmationPrompt;

    /**
     * <p>
     * If the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     */
    private Statement rejectionStatement;

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional
     * user activity after the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     */
    private FollowUpPrompt followUpPrompt;

    /**
     * <p>
     * After the Lambda function specified in the
     * <code>fulfillmentActivity</code> element fulfills the intent, Amazon Lex
     * conveys this statement to the user.
     * </p>
     */
    private Statement conclusionStatement;

    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for
     * each user input. For more information, see <a>PutIntent</a>.
     * </p>
     */
    private CodeHook dialogCodeHook;

    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     */
    private FulfillmentActivity fulfillmentActivity;

    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     */
    private String parentIntentSignature;

    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The date that the intent was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The version of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String version;

    /**
     * <p>
     * Checksum of the intent.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * Configuration information, if any, to connect to an Amazon Kendra index
     * with the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     */
    private KendraConfiguration kendraConfiguration;

    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the intent.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the intent.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the intent.
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
     *            The name of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the intent.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the intent.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     *
     * @return <p>
     *         An array of intent slots configured for the intent.
     *         </p>
     */
    public java.util.List<Slot> getSlots() {
        return slots;
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     *
     * @param slots <p>
     *            An array of intent slots configured for the intent.
     *            </p>
     */
    public void setSlots(java.util.Collection<Slot> slots) {
        if (slots == null) {
            this.slots = null;
            return;
        }

        this.slots = new java.util.ArrayList<Slot>(slots);
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            An array of intent slots configured for the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withSlots(Slot... slots) {
        if (getSlots() == null) {
            this.slots = new java.util.ArrayList<Slot>(slots.length);
        }
        for (Slot value : slots) {
            this.slots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            An array of intent slots configured for the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withSlots(java.util.Collection<Slot> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     *
     * @return <p>
     *         An array of sample utterances configured for the intent.
     *         </p>
     */
    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     *
     * @param sampleUtterances <p>
     *            An array of sample utterances configured for the intent.
     *            </p>
     */
    public void setSampleUtterances(java.util.Collection<String> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances);
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            An array of sample utterances configured for the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withSampleUtterances(String... sampleUtterances) {
        if (getSampleUtterances() == null) {
            this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances.length);
        }
        for (String value : sampleUtterances) {
            this.sampleUtterances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            An array of sample utterances configured for the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent
     * before fulfilling the user's request. For more information, see
     * <a>PutIntent</a>.
     * </p>
     *
     * @return <p>
     *         If defined in the bot, Amazon Lex uses prompt to confirm the
     *         intent before fulfilling the user's request. For more
     *         information, see <a>PutIntent</a>.
     *         </p>
     */
    public Prompt getConfirmationPrompt() {
        return confirmationPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent
     * before fulfilling the user's request. For more information, see
     * <a>PutIntent</a>.
     * </p>
     *
     * @param confirmationPrompt <p>
     *            If defined in the bot, Amazon Lex uses prompt to confirm the
     *            intent before fulfilling the user's request. For more
     *            information, see <a>PutIntent</a>.
     *            </p>
     */
    public void setConfirmationPrompt(Prompt confirmationPrompt) {
        this.confirmationPrompt = confirmationPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent
     * before fulfilling the user's request. For more information, see
     * <a>PutIntent</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param confirmationPrompt <p>
     *            If defined in the bot, Amazon Lex uses prompt to confirm the
     *            intent before fulfilling the user's request. For more
     *            information, see <a>PutIntent</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withConfirmationPrompt(Prompt confirmationPrompt) {
        this.confirmationPrompt = confirmationPrompt;
        return this;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     *
     * @return <p>
     *         If the user answers "no" to the question defined in
     *         <code>confirmationPrompt</code>, Amazon Lex responds with this
     *         statement to acknowledge that the intent was canceled.
     *         </p>
     */
    public Statement getRejectionStatement() {
        return rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     *
     * @param rejectionStatement <p>
     *            If the user answers "no" to the question defined in
     *            <code>confirmationPrompt</code>, Amazon Lex responds with this
     *            statement to acknowledge that the intent was canceled.
     *            </p>
     */
    public void setRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectionStatement <p>
     *            If the user answers "no" to the question defined in
     *            <code>confirmationPrompt</code>, Amazon Lex responds with this
     *            statement to acknowledge that the intent was canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
        return this;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional
     * user activity after the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     *
     * @return <p>
     *         If defined in the bot, Amazon Lex uses this prompt to solicit
     *         additional user activity after the intent is fulfilled. For more
     *         information, see <a>PutIntent</a>.
     *         </p>
     */
    public FollowUpPrompt getFollowUpPrompt() {
        return followUpPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional
     * user activity after the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     *
     * @param followUpPrompt <p>
     *            If defined in the bot, Amazon Lex uses this prompt to solicit
     *            additional user activity after the intent is fulfilled. For
     *            more information, see <a>PutIntent</a>.
     *            </p>
     */
    public void setFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        this.followUpPrompt = followUpPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional
     * user activity after the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param followUpPrompt <p>
     *            If defined in the bot, Amazon Lex uses this prompt to solicit
     *            additional user activity after the intent is fulfilled. For
     *            more information, see <a>PutIntent</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        this.followUpPrompt = followUpPrompt;
        return this;
    }

    /**
     * <p>
     * After the Lambda function specified in the
     * <code>fulfillmentActivity</code> element fulfills the intent, Amazon Lex
     * conveys this statement to the user.
     * </p>
     *
     * @return <p>
     *         After the Lambda function specified in the
     *         <code>fulfillmentActivity</code> element fulfills the intent,
     *         Amazon Lex conveys this statement to the user.
     *         </p>
     */
    public Statement getConclusionStatement() {
        return conclusionStatement;
    }

    /**
     * <p>
     * After the Lambda function specified in the
     * <code>fulfillmentActivity</code> element fulfills the intent, Amazon Lex
     * conveys this statement to the user.
     * </p>
     *
     * @param conclusionStatement <p>
     *            After the Lambda function specified in the
     *            <code>fulfillmentActivity</code> element fulfills the intent,
     *            Amazon Lex conveys this statement to the user.
     *            </p>
     */
    public void setConclusionStatement(Statement conclusionStatement) {
        this.conclusionStatement = conclusionStatement;
    }

    /**
     * <p>
     * After the Lambda function specified in the
     * <code>fulfillmentActivity</code> element fulfills the intent, Amazon Lex
     * conveys this statement to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conclusionStatement <p>
     *            After the Lambda function specified in the
     *            <code>fulfillmentActivity</code> element fulfills the intent,
     *            Amazon Lex conveys this statement to the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withConclusionStatement(Statement conclusionStatement) {
        this.conclusionStatement = conclusionStatement;
        return this;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for
     * each user input. For more information, see <a>PutIntent</a>.
     * </p>
     *
     * @return <p>
     *         If defined in the bot, Amazon Amazon Lex invokes this Lambda
     *         function for each user input. For more information, see
     *         <a>PutIntent</a>.
     *         </p>
     */
    public CodeHook getDialogCodeHook() {
        return dialogCodeHook;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for
     * each user input. For more information, see <a>PutIntent</a>.
     * </p>
     *
     * @param dialogCodeHook <p>
     *            If defined in the bot, Amazon Amazon Lex invokes this Lambda
     *            function for each user input. For more information, see
     *            <a>PutIntent</a>.
     *            </p>
     */
    public void setDialogCodeHook(CodeHook dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for
     * each user input. For more information, see <a>PutIntent</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dialogCodeHook <p>
     *            If defined in the bot, Amazon Amazon Lex invokes this Lambda
     *            function for each user input. For more information, see
     *            <a>PutIntent</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withDialogCodeHook(CodeHook dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
        return this;
    }

    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     *
     * @return <p>
     *         Describes how the intent is fulfilled. For more information, see
     *         <a>PutIntent</a>.
     *         </p>
     */
    public FulfillmentActivity getFulfillmentActivity() {
        return fulfillmentActivity;
    }

    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     *
     * @param fulfillmentActivity <p>
     *            Describes how the intent is fulfilled. For more information,
     *            see <a>PutIntent</a>.
     *            </p>
     */
    public void setFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        this.fulfillmentActivity = fulfillmentActivity;
    }

    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see
     * <a>PutIntent</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fulfillmentActivity <p>
     *            Describes how the intent is fulfilled. For more information,
     *            see <a>PutIntent</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        this.fulfillmentActivity = fulfillmentActivity;
        return this;
    }

    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     *
     * @return <p>
     *         A unique identifier for a built-in intent.
     *         </p>
     */
    public String getParentIntentSignature() {
        return parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     *
     * @param parentIntentSignature <p>
     *            A unique identifier for a built-in intent.
     *            </p>
     */
    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentIntentSignature <p>
     *            A unique identifier for a built-in intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
        return this;
    }

    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     *
     * @return <p>
     *         The date that the intent was updated. When you create a resource,
     *         the creation date and the last updated date are the same.
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            The date that the intent was updated. When you create a
     *            resource, the creation date and the last updated date are the
     *            same.
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the
     * creation date and the last updated date are the same.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            The date that the intent was updated. When you create a
     *            resource, the creation date and the last updated date are the
     *            same.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * <p>
     * The date that the intent was created.
     * </p>
     *
     * @return <p>
     *         The date that the intent was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date that the intent was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date that the intent was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the intent was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date that the intent was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version of the intent.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param version <p>
     *            The version of the intent.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the intent.
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
     *            The version of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * Checksum of the intent.
     * </p>
     *
     * @return <p>
     *         Checksum of the intent.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Checksum of the intent.
     * </p>
     *
     * @param checksum <p>
     *            Checksum of the intent.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum of the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Checksum of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * Configuration information, if any, to connect to an Amazon Kendra index
     * with the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     *
     * @return <p>
     *         Configuration information, if any, to connect to an Amazon Kendra
     *         index with the <code>AMAZON.KendraSearchIntent</code> intent.
     *         </p>
     */
    public KendraConfiguration getKendraConfiguration() {
        return kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information, if any, to connect to an Amazon Kendra index
     * with the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     *
     * @param kendraConfiguration <p>
     *            Configuration information, if any, to connect to an Amazon
     *            Kendra index with the <code>AMAZON.KendraSearchIntent</code>
     *            intent.
     *            </p>
     */
    public void setKendraConfiguration(KendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information, if any, to connect to an Amazon Kendra index
     * with the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kendraConfiguration <p>
     *            Configuration information, if any, to connect to an Amazon
     *            Kendra index with the <code>AMAZON.KendraSearchIntent</code>
     *            intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentResult withKendraConfiguration(KendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
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
        if (getSlots() != null)
            sb.append("slots: " + getSlots() + ",");
        if (getSampleUtterances() != null)
            sb.append("sampleUtterances: " + getSampleUtterances() + ",");
        if (getConfirmationPrompt() != null)
            sb.append("confirmationPrompt: " + getConfirmationPrompt() + ",");
        if (getRejectionStatement() != null)
            sb.append("rejectionStatement: " + getRejectionStatement() + ",");
        if (getFollowUpPrompt() != null)
            sb.append("followUpPrompt: " + getFollowUpPrompt() + ",");
        if (getConclusionStatement() != null)
            sb.append("conclusionStatement: " + getConclusionStatement() + ",");
        if (getDialogCodeHook() != null)
            sb.append("dialogCodeHook: " + getDialogCodeHook() + ",");
        if (getFulfillmentActivity() != null)
            sb.append("fulfillmentActivity: " + getFulfillmentActivity() + ",");
        if (getParentIntentSignature() != null)
            sb.append("parentIntentSignature: " + getParentIntentSignature() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("lastUpdatedDate: " + getLastUpdatedDate() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getKendraConfiguration() != null)
            sb.append("kendraConfiguration: " + getKendraConfiguration());
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
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode
                + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode
                + ((getConfirmationPrompt() == null) ? 0 : getConfirmationPrompt().hashCode());
        hashCode = prime * hashCode
                + ((getRejectionStatement() == null) ? 0 : getRejectionStatement().hashCode());
        hashCode = prime * hashCode
                + ((getFollowUpPrompt() == null) ? 0 : getFollowUpPrompt().hashCode());
        hashCode = prime * hashCode
                + ((getConclusionStatement() == null) ? 0 : getConclusionStatement().hashCode());
        hashCode = prime * hashCode
                + ((getDialogCodeHook() == null) ? 0 : getDialogCodeHook().hashCode());
        hashCode = prime * hashCode
                + ((getFulfillmentActivity() == null) ? 0 : getFulfillmentActivity().hashCode());
        hashCode = prime
                * hashCode
                + ((getParentIntentSignature() == null) ? 0 : getParentIntentSignature().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode
                + ((getKendraConfiguration() == null) ? 0 : getKendraConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntentResult == false)
            return false;
        GetIntentResult other = (GetIntentResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null
                && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getConfirmationPrompt() == null ^ this.getConfirmationPrompt() == null)
            return false;
        if (other.getConfirmationPrompt() != null
                && other.getConfirmationPrompt().equals(this.getConfirmationPrompt()) == false)
            return false;
        if (other.getRejectionStatement() == null ^ this.getRejectionStatement() == null)
            return false;
        if (other.getRejectionStatement() != null
                && other.getRejectionStatement().equals(this.getRejectionStatement()) == false)
            return false;
        if (other.getFollowUpPrompt() == null ^ this.getFollowUpPrompt() == null)
            return false;
        if (other.getFollowUpPrompt() != null
                && other.getFollowUpPrompt().equals(this.getFollowUpPrompt()) == false)
            return false;
        if (other.getConclusionStatement() == null ^ this.getConclusionStatement() == null)
            return false;
        if (other.getConclusionStatement() != null
                && other.getConclusionStatement().equals(this.getConclusionStatement()) == false)
            return false;
        if (other.getDialogCodeHook() == null ^ this.getDialogCodeHook() == null)
            return false;
        if (other.getDialogCodeHook() != null
                && other.getDialogCodeHook().equals(this.getDialogCodeHook()) == false)
            return false;
        if (other.getFulfillmentActivity() == null ^ this.getFulfillmentActivity() == null)
            return false;
        if (other.getFulfillmentActivity() != null
                && other.getFulfillmentActivity().equals(this.getFulfillmentActivity()) == false)
            return false;
        if (other.getParentIntentSignature() == null ^ this.getParentIntentSignature() == null)
            return false;
        if (other.getParentIntentSignature() != null
                && other.getParentIntentSignature().equals(this.getParentIntentSignature()) == false)
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getKendraConfiguration() == null ^ this.getKendraConfiguration() == null)
            return false;
        if (other.getKendraConfiguration() != null
                && other.getKendraConfiguration().equals(this.getKendraConfiguration()) == false)
            return false;
        return true;
    }
}
