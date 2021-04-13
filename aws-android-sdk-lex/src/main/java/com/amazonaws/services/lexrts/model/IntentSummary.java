/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the state of an intent. You can use this
 * information to get the current state of an intent so that you can process the
 * intent, or so that you can return the intent to its previous state.
 * </p>
 */
public class IntentSummary implements Serializable {
    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String intentName;

    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use
     * this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the
     * <code>GetSessionRequest</code> operation to filter the intents returned
     * by the operation to those with only the specified label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     */
    private String checkpointLabel;

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     */
    private java.util.Map<String, String> slots;

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation
     * prompt. If the user confirms the intent, Amazon Lex sets this field to
     * <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets
     * this value to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation
     * prompt, confirming that the intent is complete and that it is ready to be
     * fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation
     * prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation;
     * or, the user was prompted but did not confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Confirmed, Denied
     */
    private String confirmationStatus;

    /**
     * <p>
     * The next action that the bot should take in its interaction with the
     * user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the
     * intent is complete and ready to be fulfilled. This is a yes/no question
     * such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from
     * the user. For example, the statement "Your order has been placed" does
     * not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent
     * that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from
     * the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot, Close,
     * Delegate
     */
    private String dialogActionType;

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent
     * failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function
     * associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for
     * the intent is present and the intent ready to be fulfilled by the client
     * application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Fulfilled, Failed, ReadyForFulfillment
     */
    private String fulfillmentState;

    /**
     * <p>
     * The next slot to elicit from the user. If there is not slot to elicit,
     * the field is blank.
     * </p>
     */
    private String slotToElicit;

    /**
     * <p>
     * The name of the intent.
     * </p>
     *
     * @return <p>
     *         The name of the intent.
     *         </p>
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     *
     * @param intentName <p>
     *            The name of the intent.
     *            </p>
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intentName <p>
     *            The name of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntentSummary withIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }

    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use
     * this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the
     * <code>GetSessionRequest</code> operation to filter the intents returned
     * by the operation to those with only the specified label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @return <p>
     *         A user-defined label that identifies a particular intent. You can
     *         use this label to return to a previous intent.
     *         </p>
     *         <p>
     *         Use the <code>checkpointLabelFilter</code> parameter of the
     *         <code>GetSessionRequest</code> operation to filter the intents
     *         returned by the operation to those with only the specified label.
     *         </p>
     */
    public String getCheckpointLabel() {
        return checkpointLabel;
    }

    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use
     * this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the
     * <code>GetSessionRequest</code> operation to filter the intents returned
     * by the operation to those with only the specified label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param checkpointLabel <p>
     *            A user-defined label that identifies a particular intent. You
     *            can use this label to return to a previous intent.
     *            </p>
     *            <p>
     *            Use the <code>checkpointLabelFilter</code> parameter of the
     *            <code>GetSessionRequest</code> operation to filter the intents
     *            returned by the operation to those with only the specified
     *            label.
     *            </p>
     */
    public void setCheckpointLabel(String checkpointLabel) {
        this.checkpointLabel = checkpointLabel;
    }

    /**
     * <p>
     * A user-defined label that identifies a particular intent. You can use
     * this label to return to a previous intent.
     * </p>
     * <p>
     * Use the <code>checkpointLabelFilter</code> parameter of the
     * <code>GetSessionRequest</code> operation to filter the intents returned
     * by the operation to those with only the specified label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param checkpointLabel <p>
     *            A user-defined label that identifies a particular intent. You
     *            can use this label to return to a previous intent.
     *            </p>
     *            <p>
     *            Use the <code>checkpointLabelFilter</code> parameter of the
     *            <code>GetSessionRequest</code> operation to filter the intents
     *            returned by the operation to those with only the specified
     *            label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntentSummary withCheckpointLabel(String checkpointLabel) {
        this.checkpointLabel = checkpointLabel;
        return this;
    }

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     *
     * @return <p>
     *         Map of the slots that have been gathered and their values.
     *         </p>
     */
    public java.util.Map<String, String> getSlots() {
        return slots;
    }

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     *
     * @param slots <p>
     *            Map of the slots that have been gathered and their values.
     *            </p>
     */
    public void setSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            Map of the slots that have been gathered and their values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntentSummary withSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     * <p>
     * The method adds a new key-value pair into slots parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into slots.
     * @param value The corresponding value of the entry to be added into slots.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntentSummary addslotsEntry(String key, String value) {
        if (null == this.slots) {
            this.slots = new java.util.HashMap<String, String>();
        }
        if (this.slots.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.slots.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into slots.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public IntentSummary clearslotsEntries() {
        this.slots = null;
        return this;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation
     * prompt. If the user confirms the intent, Amazon Lex sets this field to
     * <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets
     * this value to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation
     * prompt, confirming that the intent is complete and that it is ready to be
     * fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation
     * prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation;
     * or, the user was prompted but did not confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Confirmed, Denied
     *
     * @return <p>
     *         The status of the intent after the user responds to the
     *         confirmation prompt. If the user confirms the intent, Amazon Lex
     *         sets this field to <code>Confirmed</code>. If the user denies the
     *         intent, Amazon Lex sets this value to <code>Denied</code>. The
     *         possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Confirmed</code> - The user has responded "Yes" to the
     *         confirmation prompt, confirming that the intent is complete and
     *         that it is ready to be fulfilled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Denied</code> - The user has responded "No" to the
     *         confirmation prompt.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>None</code> - The user has never been prompted for
     *         confirmation; or, the user was prompted but did not confirm or
     *         deny the prompt.
     *         </p>
     *         </li>
     *         </ul>
     * @see ConfirmationStatus
     */
    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation
     * prompt. If the user confirms the intent, Amazon Lex sets this field to
     * <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets
     * this value to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation
     * prompt, confirming that the intent is complete and that it is ready to be
     * fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation
     * prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation;
     * or, the user was prompted but did not confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Confirmed, Denied
     *
     * @param confirmationStatus <p>
     *            The status of the intent after the user responds to the
     *            confirmation prompt. If the user confirms the intent, Amazon
     *            Lex sets this field to <code>Confirmed</code>. If the user
     *            denies the intent, Amazon Lex sets this value to
     *            <code>Denied</code>. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Confirmed</code> - The user has responded "Yes" to the
     *            confirmation prompt, confirming that the intent is complete
     *            and that it is ready to be fulfilled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Denied</code> - The user has responded "No" to the
     *            confirmation prompt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>None</code> - The user has never been prompted for
     *            confirmation; or, the user was prompted but did not confirm or
     *            deny the prompt.
     *            </p>
     *            </li>
     *            </ul>
     * @see ConfirmationStatus
     */
    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation
     * prompt. If the user confirms the intent, Amazon Lex sets this field to
     * <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets
     * this value to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation
     * prompt, confirming that the intent is complete and that it is ready to be
     * fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation
     * prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation;
     * or, the user was prompted but did not confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Confirmed, Denied
     *
     * @param confirmationStatus <p>
     *            The status of the intent after the user responds to the
     *            confirmation prompt. If the user confirms the intent, Amazon
     *            Lex sets this field to <code>Confirmed</code>. If the user
     *            denies the intent, Amazon Lex sets this value to
     *            <code>Denied</code>. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Confirmed</code> - The user has responded "Yes" to the
     *            confirmation prompt, confirming that the intent is complete
     *            and that it is ready to be fulfilled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Denied</code> - The user has responded "No" to the
     *            confirmation prompt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>None</code> - The user has never been prompted for
     *            confirmation; or, the user was prompted but did not confirm or
     *            deny the prompt.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfirmationStatus
     */
    public IntentSummary withConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
        return this;
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation
     * prompt. If the user confirms the intent, Amazon Lex sets this field to
     * <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets
     * this value to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation
     * prompt, confirming that the intent is complete and that it is ready to be
     * fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation
     * prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation;
     * or, the user was prompted but did not confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Confirmed, Denied
     *
     * @param confirmationStatus <p>
     *            The status of the intent after the user responds to the
     *            confirmation prompt. If the user confirms the intent, Amazon
     *            Lex sets this field to <code>Confirmed</code>. If the user
     *            denies the intent, Amazon Lex sets this value to
     *            <code>Denied</code>. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Confirmed</code> - The user has responded "Yes" to the
     *            confirmation prompt, confirming that the intent is complete
     *            and that it is ready to be fulfilled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Denied</code> - The user has responded "No" to the
     *            confirmation prompt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>None</code> - The user has never been prompted for
     *            confirmation; or, the user was prompted but did not confirm or
     *            deny the prompt.
     *            </p>
     *            </li>
     *            </ul>
     * @see ConfirmationStatus
     */
    public void setConfirmationStatus(ConfirmationStatus confirmationStatus) {
        this.confirmationStatus = confirmationStatus.toString();
    }

    /**
     * <p>
     * The status of the intent after the user responds to the confirmation
     * prompt. If the user confirms the intent, Amazon Lex sets this field to
     * <code>Confirmed</code>. If the user denies the intent, Amazon Lex sets
     * this value to <code>Denied</code>. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confirmed</code> - The user has responded "Yes" to the confirmation
     * prompt, confirming that the intent is complete and that it is ready to be
     * fulfilled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Denied</code> - The user has responded "No" to the confirmation
     * prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>None</code> - The user has never been prompted for confirmation;
     * or, the user was prompted but did not confirm or deny the prompt.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Confirmed, Denied
     *
     * @param confirmationStatus <p>
     *            The status of the intent after the user responds to the
     *            confirmation prompt. If the user confirms the intent, Amazon
     *            Lex sets this field to <code>Confirmed</code>. If the user
     *            denies the intent, Amazon Lex sets this value to
     *            <code>Denied</code>. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Confirmed</code> - The user has responded "Yes" to the
     *            confirmation prompt, confirming that the intent is complete
     *            and that it is ready to be fulfilled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Denied</code> - The user has responded "No" to the
     *            confirmation prompt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>None</code> - The user has never been prompted for
     *            confirmation; or, the user was prompted but did not confirm or
     *            deny the prompt.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfirmationStatus
     */
    public IntentSummary withConfirmationStatus(ConfirmationStatus confirmationStatus) {
        this.confirmationStatus = confirmationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the
     * user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the
     * intent is complete and ready to be fulfilled. This is a yes/no question
     * such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from
     * the user. For example, the statement "Your order has been placed" does
     * not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent
     * that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from
     * the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot, Close,
     * Delegate
     *
     * @return <p>
     *         The next action that the bot should take in its interaction with
     *         the user. The possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - The next action is asking the user
     *         if the intent is complete and ready to be fulfilled. This is a
     *         yes/no question such as "Place the order?"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Close</code> - Indicates that the there will not be a
     *         response from the user. For example, the statement
     *         "Your order has been placed" does not require a response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> - The next action is to determine the
     *         intent that the user wants to fulfill.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> - The next action is to elicit a slot
     *         value from the user.
     *         </p>
     *         </li>
     *         </ul>
     * @see DialogActionType
     */
    public String getDialogActionType() {
        return dialogActionType;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the
     * user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the
     * intent is complete and ready to be fulfilled. This is a yes/no question
     * such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from
     * the user. For example, the statement "Your order has been placed" does
     * not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent
     * that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from
     * the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot, Close,
     * Delegate
     *
     * @param dialogActionType <p>
     *            The next action that the bot should take in its interaction
     *            with the user. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - The next action is asking the
     *            user if the intent is complete and ready to be fulfilled. This
     *            is a yes/no question such as "Place the order?"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Close</code> - Indicates that the there will not be a
     *            response from the user. For example, the statement
     *            "Your order has been placed" does not require a response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - The next action is to determine
     *            the intent that the user wants to fulfill.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - The next action is to elicit a slot
     *            value from the user.
     *            </p>
     *            </li>
     *            </ul>
     * @see DialogActionType
     */
    public void setDialogActionType(String dialogActionType) {
        this.dialogActionType = dialogActionType;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the
     * user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the
     * intent is complete and ready to be fulfilled. This is a yes/no question
     * such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from
     * the user. For example, the statement "Your order has been placed" does
     * not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent
     * that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from
     * the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot, Close,
     * Delegate
     *
     * @param dialogActionType <p>
     *            The next action that the bot should take in its interaction
     *            with the user. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - The next action is asking the
     *            user if the intent is complete and ready to be fulfilled. This
     *            is a yes/no question such as "Place the order?"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Close</code> - Indicates that the there will not be a
     *            response from the user. For example, the statement
     *            "Your order has been placed" does not require a response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - The next action is to determine
     *            the intent that the user wants to fulfill.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - The next action is to elicit a slot
     *            value from the user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogActionType
     */
    public IntentSummary withDialogActionType(String dialogActionType) {
        this.dialogActionType = dialogActionType;
        return this;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the
     * user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the
     * intent is complete and ready to be fulfilled. This is a yes/no question
     * such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from
     * the user. For example, the statement "Your order has been placed" does
     * not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent
     * that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from
     * the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot, Close,
     * Delegate
     *
     * @param dialogActionType <p>
     *            The next action that the bot should take in its interaction
     *            with the user. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - The next action is asking the
     *            user if the intent is complete and ready to be fulfilled. This
     *            is a yes/no question such as "Place the order?"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Close</code> - Indicates that the there will not be a
     *            response from the user. For example, the statement
     *            "Your order has been placed" does not require a response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - The next action is to determine
     *            the intent that the user wants to fulfill.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - The next action is to elicit a slot
     *            value from the user.
     *            </p>
     *            </li>
     *            </ul>
     * @see DialogActionType
     */
    public void setDialogActionType(DialogActionType dialogActionType) {
        this.dialogActionType = dialogActionType.toString();
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the
     * user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the
     * intent is complete and ready to be fulfilled. This is a yes/no question
     * such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that the there will not be a response from
     * the user. For example, the statement "Your order has been placed" does
     * not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to determine the intent
     * that the user wants to fulfill.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from
     * the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot, Close,
     * Delegate
     *
     * @param dialogActionType <p>
     *            The next action that the bot should take in its interaction
     *            with the user. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - The next action is asking the
     *            user if the intent is complete and ready to be fulfilled. This
     *            is a yes/no question such as "Place the order?"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Close</code> - Indicates that the there will not be a
     *            response from the user. For example, the statement
     *            "Your order has been placed" does not require a response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - The next action is to determine
     *            the intent that the user wants to fulfill.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - The next action is to elicit a slot
     *            value from the user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogActionType
     */
    public IntentSummary withDialogActionType(DialogActionType dialogActionType) {
        this.dialogActionType = dialogActionType.toString();
        return this;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent
     * failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function
     * associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for
     * the intent is present and the intent ready to be fulfilled by the client
     * application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Fulfilled, Failed, ReadyForFulfillment
     *
     * @return <p>
     *         The fulfillment state of the intent. The possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The Lambda function associated with the
     *         intent failed to fulfill the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fulfilled</code> - The intent has fulfilled by the Lambda
     *         function associated with the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> - All of the information
     *         necessary for the intent is present and the intent ready to be
     *         fulfilled by the client application.
     *         </p>
     *         </li>
     *         </ul>
     * @see FulfillmentState
     */
    public String getFulfillmentState() {
        return fulfillmentState;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent
     * failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function
     * associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for
     * the intent is present and the intent ready to be fulfilled by the client
     * application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Fulfilled, Failed, ReadyForFulfillment
     *
     * @param fulfillmentState <p>
     *            The fulfillment state of the intent. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The Lambda function associated with the
     *            intent failed to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - The intent has fulfilled by the
     *            Lambda function associated with the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - All of the information
     *            necessary for the intent is present and the intent ready to be
     *            fulfilled by the client application.
     *            </p>
     *            </li>
     *            </ul>
     * @see FulfillmentState
     */
    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent
     * failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function
     * associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for
     * the intent is present and the intent ready to be fulfilled by the client
     * application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Fulfilled, Failed, ReadyForFulfillment
     *
     * @param fulfillmentState <p>
     *            The fulfillment state of the intent. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The Lambda function associated with the
     *            intent failed to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - The intent has fulfilled by the
     *            Lambda function associated with the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - All of the information
     *            necessary for the intent is present and the intent ready to be
     *            fulfilled by the client application.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FulfillmentState
     */
    public IntentSummary withFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
        return this;
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent
     * failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function
     * associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for
     * the intent is present and the intent ready to be fulfilled by the client
     * application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Fulfilled, Failed, ReadyForFulfillment
     *
     * @param fulfillmentState <p>
     *            The fulfillment state of the intent. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The Lambda function associated with the
     *            intent failed to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - The intent has fulfilled by the
     *            Lambda function associated with the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - All of the information
     *            necessary for the intent is present and the intent ready to be
     *            fulfilled by the client application.
     *            </p>
     *            </li>
     *            </ul>
     * @see FulfillmentState
     */
    public void setFulfillmentState(FulfillmentState fulfillmentState) {
        this.fulfillmentState = fulfillmentState.toString();
    }

    /**
     * <p>
     * The fulfillment state of the intent. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code> - The Lambda function associated with the intent
     * failed to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - The intent has fulfilled by the Lambda function
     * associated with the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - All of the information necessary for
     * the intent is present and the intent ready to be fulfilled by the client
     * application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Fulfilled, Failed, ReadyForFulfillment
     *
     * @param fulfillmentState <p>
     *            The fulfillment state of the intent. The possible values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The Lambda function associated with the
     *            intent failed to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - The intent has fulfilled by the
     *            Lambda function associated with the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - All of the information
     *            necessary for the intent is present and the intent ready to be
     *            fulfilled by the client application.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FulfillmentState
     */
    public IntentSummary withFulfillmentState(FulfillmentState fulfillmentState) {
        this.fulfillmentState = fulfillmentState.toString();
        return this;
    }

    /**
     * <p>
     * The next slot to elicit from the user. If there is not slot to elicit,
     * the field is blank.
     * </p>
     *
     * @return <p>
     *         The next slot to elicit from the user. If there is not slot to
     *         elicit, the field is blank.
     *         </p>
     */
    public String getSlotToElicit() {
        return slotToElicit;
    }

    /**
     * <p>
     * The next slot to elicit from the user. If there is not slot to elicit,
     * the field is blank.
     * </p>
     *
     * @param slotToElicit <p>
     *            The next slot to elicit from the user. If there is not slot to
     *            elicit, the field is blank.
     *            </p>
     */
    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * The next slot to elicit from the user. If there is not slot to elicit,
     * the field is blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotToElicit <p>
     *            The next slot to elicit from the user. If there is not slot to
     *            elicit, the field is blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntentSummary withSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
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
        if (getIntentName() != null)
            sb.append("intentName: " + getIntentName() + ",");
        if (getCheckpointLabel() != null)
            sb.append("checkpointLabel: " + getCheckpointLabel() + ",");
        if (getSlots() != null)
            sb.append("slots: " + getSlots() + ",");
        if (getConfirmationStatus() != null)
            sb.append("confirmationStatus: " + getConfirmationStatus() + ",");
        if (getDialogActionType() != null)
            sb.append("dialogActionType: " + getDialogActionType() + ",");
        if (getFulfillmentState() != null)
            sb.append("fulfillmentState: " + getFulfillmentState() + ",");
        if (getSlotToElicit() != null)
            sb.append("slotToElicit: " + getSlotToElicit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode
                + ((getCheckpointLabel() == null) ? 0 : getCheckpointLabel().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode
                + ((getConfirmationStatus() == null) ? 0 : getConfirmationStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDialogActionType() == null) ? 0 : getDialogActionType().hashCode());
        hashCode = prime * hashCode
                + ((getFulfillmentState() == null) ? 0 : getFulfillmentState().hashCode());
        hashCode = prime * hashCode
                + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentSummary == false)
            return false;
        IntentSummary other = (IntentSummary) obj;

        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null
                && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getCheckpointLabel() == null ^ this.getCheckpointLabel() == null)
            return false;
        if (other.getCheckpointLabel() != null
                && other.getCheckpointLabel().equals(this.getCheckpointLabel()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getConfirmationStatus() == null ^ this.getConfirmationStatus() == null)
            return false;
        if (other.getConfirmationStatus() != null
                && other.getConfirmationStatus().equals(this.getConfirmationStatus()) == false)
            return false;
        if (other.getDialogActionType() == null ^ this.getDialogActionType() == null)
            return false;
        if (other.getDialogActionType() != null
                && other.getDialogActionType().equals(this.getDialogActionType()) == false)
            return false;
        if (other.getFulfillmentState() == null ^ this.getFulfillmentState() == null)
            return false;
        if (other.getFulfillmentState() != null
                && other.getFulfillmentState().equals(this.getFulfillmentState()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null
                && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        return true;
    }
}
