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
 * Describes the next action that the bot should take in its interaction with
 * the user and provides information about the context in which the action takes
 * place. Use the <code>DialogAction</code> data type to set the interaction to
 * a specific state, or to return the interaction to a previous state.
 * </p>
 */
public class DialogAction implements Serializable {
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
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
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
    private String type;

    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String intentName;

    /**
     * <p>
     * Map of the slots that have been gathered and their values.
     * </p>
     */
    private java.util.Map<String, String> slots;

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     */
    private String slotToElicit;

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
     * The message that should be shown to the user. If you don't specify a
     * message, Amazon Lex will use the message configured for the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String message;

    /**
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the
     * client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object
     * containing one or more messages. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     * >Message Groups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     */
    private String messageFormat;

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
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
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
     *         <code>Delegate</code> - The next action is determined by Amazon
     *         Lex.
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
    public String getType() {
        return type;
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
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
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
     * @param type <p>
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
     *            <code>Delegate</code> - The next action is determined by
     *            Amazon Lex.
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
    public void setType(String type) {
        this.type = type;
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
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
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
     * @param type <p>
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
     *            <code>Delegate</code> - The next action is determined by
     *            Amazon Lex.
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
    public DialogAction withType(String type) {
        this.type = type;
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
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
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
     * @param type <p>
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
     *            <code>Delegate</code> - The next action is determined by
     *            Amazon Lex.
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
    public void setType(DialogActionType type) {
        this.type = type.toString();
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
     * <code>Delegate</code> - The next action is determined by Amazon Lex.
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
     * @param type <p>
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
     *            <code>Delegate</code> - The next action is determined by
     *            Amazon Lex.
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
    public DialogAction withType(DialogActionType type) {
        this.type = type.toString();
        return this;
    }

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
    public DialogAction withIntentName(String intentName) {
        this.intentName = intentName;
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
    public DialogAction withSlots(java.util.Map<String, String> slots) {
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
    public DialogAction addslotsEntry(String key, String value) {
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
    public DialogAction clearslotsEntries() {
        this.slots = null;
        return this;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     *
     * @return <p>
     *         The name of the slot that should be elicited from the user.
     *         </p>
     */
    public String getSlotToElicit() {
        return slotToElicit;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     *
     * @param slotToElicit <p>
     *            The name of the slot that should be elicited from the user.
     *            </p>
     */
    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotToElicit <p>
     *            The name of the slot that should be elicited from the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DialogAction withSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
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
    public DialogAction withFulfillmentState(String fulfillmentState) {
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
    public DialogAction withFulfillmentState(FulfillmentState fulfillmentState) {
        this.fulfillmentState = fulfillmentState.toString();
        return this;
    }

    /**
     * <p>
     * The message that should be shown to the user. If you don't specify a
     * message, Amazon Lex will use the message configured for the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The message that should be shown to the user. If you don't
     *         specify a message, Amazon Lex will use the message configured for
     *         the intent.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message that should be shown to the user. If you don't specify a
     * message, Amazon Lex will use the message configured for the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            The message that should be shown to the user. If you don't
     *            specify a message, Amazon Lex will use the message configured
     *            for the intent.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message that should be shown to the user. If you don't specify a
     * message, Amazon Lex will use the message configured for the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            The message that should be shown to the user. If you don't
     *            specify a message, Amazon Lex will use the message configured
     *            for the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DialogAction withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the
     * client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object
     * containing one or more messages. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     * >Message Groups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @return <ul>
     *         <li>
     *         <p>
     *         <code>PlainText</code> - The message contains plain UTF-8 text.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>CustomPayload</code> - The message is a custom format for
     *         the client.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>SSML</code> - The message contains text formatted for voice
     *         output.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>Composite</code> - The message contains an escaped JSON
     *         object containing one or more messages. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     *         >Message Groups</a>.
     *         </p>
     *         </li>
     *         </ul>
     * @see MessageFormatType
     */
    public String getMessageFormat() {
        return messageFormat;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the
     * client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object
     * containing one or more messages. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     * >Message Groups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @param messageFormat <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            for the client.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     *            >Message Groups</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MessageFormatType
     */
    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the
     * client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object
     * containing one or more messages. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     * >Message Groups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @param messageFormat <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            for the client.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     *            >Message Groups</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormatType
     */
    public DialogAction withMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
        return this;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the
     * client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object
     * containing one or more messages. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     * >Message Groups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @param messageFormat <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            for the client.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     *            >Message Groups</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see MessageFormatType
     */
    public void setMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format for the
     * client.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSML</code> - The message contains text formatted for voice output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Composite</code> - The message contains an escaped JSON object
     * containing one or more messages. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     * >Message Groups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @param messageFormat <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            for the client.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/howitworks-manage-prompts.html"
     *            >Message Groups</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormatType
     */
    public DialogAction withMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getIntentName() != null)
            sb.append("intentName: " + getIntentName() + ",");
        if (getSlots() != null)
            sb.append("slots: " + getSlots() + ",");
        if (getSlotToElicit() != null)
            sb.append("slotToElicit: " + getSlotToElicit() + ",");
        if (getFulfillmentState() != null)
            sb.append("fulfillmentState: " + getFulfillmentState() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage() + ",");
        if (getMessageFormat() != null)
            sb.append("messageFormat: " + getMessageFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode
                + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode
                + ((getFulfillmentState() == null) ? 0 : getFulfillmentState().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DialogAction == false)
            return false;
        DialogAction other = (DialogAction) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null
                && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null
                && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        if (other.getFulfillmentState() == null ^ this.getFulfillmentState() == null)
            return false;
        if (other.getFulfillmentState() != null
                && other.getFulfillmentState().equals(this.getFulfillmentState()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null
                && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        return true;
    }
}
