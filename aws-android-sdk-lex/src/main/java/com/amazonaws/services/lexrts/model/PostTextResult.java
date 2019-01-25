/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class PostTextResult implements Serializable {
    /**
     * <p>
     * The current user intent that Amazon Lex is aware of.
     * </p>
     */
    private String intentName;

    /**
     * <p>
     * The intent slots that Amazon Lex detected from the user input in the
     * conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot.
     * The value that it returns is determined by the
     * <code>valueSelectionStrategy</code> selected when the slot type was
     * created or updated. If <code>valueSelectionStrategy</code> is set to
     * <code>ORIGINAL_VALUE</code>, the value provided by the user is returned,
     * if the user value is similar to the slot values. If
     * <code>valueSelectionStrategy</code> is set to <code>TOP_RESOLUTION</code>
     * Amazon Lex returns the first value in the resolution list or, if there is
     * no resolution list, null. If you don't specify a
     * <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     */
    private java.util.Map<String, String> slots;

    /**
     * <p>
     * A map of key-value pairs representing the session-specific context
     * information.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;

    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's
     * configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda
     * function returned <code>Delegate</code> as the
     * <code>dialogAction.type</code> its response, Amazon Lex decides on the
     * next course of action and selects an appropriate message from the bot's
     * configuration based on the current interaction context. For example, if
     * Amazon Lex isn't able to understand user input, it uses a clarification
     * prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When
     * messages are assigned to groups Amazon Lex returns one message from each
     * group in the response. The message field is an escaped JSON string
     * containing the messages. For more information about the structure of the
     * JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the
     * client in its response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String message;

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format defined by
     * the Lambda function.
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
     * containing one or more messages from the groups that messages were
     * assigned to when the intent was created.
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
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit user intent.
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialogState.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent.
     * </p>
     * <p>
     * Instead of a simple "yes" or "no," a user might respond with additional
     * information. For example, "yes, but make it thick crust pizza" or
     * "no, I want to order a drink". Amazon Lex can process such additional
     * information (in these examples, update the crust type slot value, or
     * change intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting a slot value for the
     * current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message:
     * "What size pizza would you like?". A user might reply with the slot value
     * (e.g., "medium"). The user might also provide additional information in
     * the response (e.g., "medium thick crust pizza"). Amazon Lex can process
     * such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function configured for
     * the intent has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons including that the user did not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or the Lambda function failed to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     */
    private String dialogState;

    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns
     * the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     */
    private String slotToElicit;

    /**
     * <p>
     * Represents the options that the user has to respond to the current
     * prompt. Response Card can come from the bot configuration (in the Amazon
     * Lex console, choose the settings button next to a slot) or from a code
     * hook (Lambda function).
     * </p>
     */
    private ResponseCard responseCard;

    /**
     * <p>
     * The current user intent that Amazon Lex is aware of.
     * </p>
     *
     * @return <p>
     *         The current user intent that Amazon Lex is aware of.
     *         </p>
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * <p>
     * The current user intent that Amazon Lex is aware of.
     * </p>
     *
     * @param intentName <p>
     *            The current user intent that Amazon Lex is aware of.
     *            </p>
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The current user intent that Amazon Lex is aware of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intentName <p>
     *            The current user intent that Amazon Lex is aware of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextResult withIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }

    /**
     * <p>
     * The intent slots that Amazon Lex detected from the user input in the
     * conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot.
     * The value that it returns is determined by the
     * <code>valueSelectionStrategy</code> selected when the slot type was
     * created or updated. If <code>valueSelectionStrategy</code> is set to
     * <code>ORIGINAL_VALUE</code>, the value provided by the user is returned,
     * if the user value is similar to the slot values. If
     * <code>valueSelectionStrategy</code> is set to <code>TOP_RESOLUTION</code>
     * Amazon Lex returns the first value in the resolution list or, if there is
     * no resolution list, null. If you don't specify a
     * <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     *
     * @return <p>
     *         The intent slots that Amazon Lex detected from the user input in
     *         the conversation.
     *         </p>
     *         <p>
     *         Amazon Lex creates a resolution list containing likely values for
     *         a slot. The value that it returns is determined by the
     *         <code>valueSelectionStrategy</code> selected when the slot type
     *         was created or updated. If <code>valueSelectionStrategy</code> is
     *         set to <code>ORIGINAL_VALUE</code>, the value provided by the
     *         user is returned, if the user value is similar to the slot
     *         values. If <code>valueSelectionStrategy</code> is set to
     *         <code>TOP_RESOLUTION</code> Amazon Lex returns the first value in
     *         the resolution list or, if there is no resolution list, null. If
     *         you don't specify a <code>valueSelectionStrategy</code>, the
     *         default is <code>ORIGINAL_VALUE</code>.
     *         </p>
     */
    public java.util.Map<String, String> getSlots() {
        return slots;
    }

    /**
     * <p>
     * The intent slots that Amazon Lex detected from the user input in the
     * conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot.
     * The value that it returns is determined by the
     * <code>valueSelectionStrategy</code> selected when the slot type was
     * created or updated. If <code>valueSelectionStrategy</code> is set to
     * <code>ORIGINAL_VALUE</code>, the value provided by the user is returned,
     * if the user value is similar to the slot values. If
     * <code>valueSelectionStrategy</code> is set to <code>TOP_RESOLUTION</code>
     * Amazon Lex returns the first value in the resolution list or, if there is
     * no resolution list, null. If you don't specify a
     * <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     *
     * @param slots <p>
     *            The intent slots that Amazon Lex detected from the user input
     *            in the conversation.
     *            </p>
     *            <p>
     *            Amazon Lex creates a resolution list containing likely values
     *            for a slot. The value that it returns is determined by the
     *            <code>valueSelectionStrategy</code> selected when the slot
     *            type was created or updated. If
     *            <code>valueSelectionStrategy</code> is set to
     *            <code>ORIGINAL_VALUE</code>, the value provided by the user is
     *            returned, if the user value is similar to the slot values. If
     *            <code>valueSelectionStrategy</code> is set to
     *            <code>TOP_RESOLUTION</code> Amazon Lex returns the first value
     *            in the resolution list or, if there is no resolution list,
     *            null. If you don't specify a
     *            <code>valueSelectionStrategy</code>, the default is
     *            <code>ORIGINAL_VALUE</code>.
     *            </p>
     */
    public void setSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The intent slots that Amazon Lex detected from the user input in the
     * conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot.
     * The value that it returns is determined by the
     * <code>valueSelectionStrategy</code> selected when the slot type was
     * created or updated. If <code>valueSelectionStrategy</code> is set to
     * <code>ORIGINAL_VALUE</code>, the value provided by the user is returned,
     * if the user value is similar to the slot values. If
     * <code>valueSelectionStrategy</code> is set to <code>TOP_RESOLUTION</code>
     * Amazon Lex returns the first value in the resolution list or, if there is
     * no resolution list, null. If you don't specify a
     * <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            The intent slots that Amazon Lex detected from the user input
     *            in the conversation.
     *            </p>
     *            <p>
     *            Amazon Lex creates a resolution list containing likely values
     *            for a slot. The value that it returns is determined by the
     *            <code>valueSelectionStrategy</code> selected when the slot
     *            type was created or updated. If
     *            <code>valueSelectionStrategy</code> is set to
     *            <code>ORIGINAL_VALUE</code>, the value provided by the user is
     *            returned, if the user value is similar to the slot values. If
     *            <code>valueSelectionStrategy</code> is set to
     *            <code>TOP_RESOLUTION</code> Amazon Lex returns the first value
     *            in the resolution list or, if there is no resolution list,
     *            null. If you don't specify a
     *            <code>valueSelectionStrategy</code>, the default is
     *            <code>ORIGINAL_VALUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextResult withSlots(java.util.Map<String, String> slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * The intent slots that Amazon Lex detected from the user input in the
     * conversation.
     * </p>
     * <p>
     * Amazon Lex creates a resolution list containing likely values for a slot.
     * The value that it returns is determined by the
     * <code>valueSelectionStrategy</code> selected when the slot type was
     * created or updated. If <code>valueSelectionStrategy</code> is set to
     * <code>ORIGINAL_VALUE</code>, the value provided by the user is returned,
     * if the user value is similar to the slot values. If
     * <code>valueSelectionStrategy</code> is set to <code>TOP_RESOLUTION</code>
     * Amazon Lex returns the first value in the resolution list or, if there is
     * no resolution list, null. If you don't specify a
     * <code>valueSelectionStrategy</code>, the default is
     * <code>ORIGINAL_VALUE</code>.
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
    public PostTextResult addslotsEntry(String key, String value) {
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
    public PostTextResult clearslotsEntries() {
        this.slots = null;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs representing the session-specific context
     * information.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs representing the session-specific
     *         context information.
     *         </p>
     */
    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * A map of key-value pairs representing the session-specific context
     * information.
     * </p>
     *
     * @param sessionAttributes <p>
     *            A map of key-value pairs representing the session-specific
     *            context information.
     *            </p>
     */
    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * A map of key-value pairs representing the session-specific context
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            A map of key-value pairs representing the session-specific
     *            context information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextResult withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs representing the session-specific context
     * information.
     * </p>
     * <p>
     * The method adds a new key-value pair into sessionAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into sessionAttributes.
     * @param value The corresponding value of the entry to be added into
     *            sessionAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextResult addsessionAttributesEntry(String key, String value) {
        if (null == this.sessionAttributes) {
            this.sessionAttributes = new java.util.HashMap<String, String>();
        }
        if (this.sessionAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.sessionAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into sessionAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PostTextResult clearsessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's
     * configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda
     * function returned <code>Delegate</code> as the
     * <code>dialogAction.type</code> its response, Amazon Lex decides on the
     * next course of action and selects an appropriate message from the bot's
     * configuration based on the current interaction context. For example, if
     * Amazon Lex isn't able to understand user input, it uses a clarification
     * prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When
     * messages are assigned to groups Amazon Lex returns one message from each
     * group in the response. The message field is an escaped JSON string
     * containing the messages. For more information about the structure of the
     * JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the
     * client in its response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The message to convey to the user. The message can come from the
     *         bot's configuration or from a Lambda function.
     *         </p>
     *         <p>
     *         If the intent is not configured with a Lambda function, or if the
     *         Lambda function returned <code>Delegate</code> as the
     *         <code>dialogAction.type</code> its response, Amazon Lex decides
     *         on the next course of action and selects an appropriate message
     *         from the bot's configuration based on the current interaction
     *         context. For example, if Amazon Lex isn't able to understand user
     *         input, it uses a clarification prompt message.
     *         </p>
     *         <p>
     *         When you create an intent you can assign messages to groups. When
     *         messages are assigned to groups Amazon Lex returns one message
     *         from each group in the response. The message field is an escaped
     *         JSON string containing the messages. For more information about
     *         the structure of the JSON string returned, see
     *         <a>msg-prompts-formats</a>.
     *         </p>
     *         <p>
     *         If the Lambda function returns a message, Amazon Lex passes it to
     *         the client in its response.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's
     * configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda
     * function returned <code>Delegate</code> as the
     * <code>dialogAction.type</code> its response, Amazon Lex decides on the
     * next course of action and selects an appropriate message from the bot's
     * configuration based on the current interaction context. For example, if
     * Amazon Lex isn't able to understand user input, it uses a clarification
     * prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When
     * messages are assigned to groups Amazon Lex returns one message from each
     * group in the response. The message field is an escaped JSON string
     * containing the messages. For more information about the structure of the
     * JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the
     * client in its response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            The message to convey to the user. The message can come from
     *            the bot's configuration or from a Lambda function.
     *            </p>
     *            <p>
     *            If the intent is not configured with a Lambda function, or if
     *            the Lambda function returned <code>Delegate</code> as the
     *            <code>dialogAction.type</code> its response, Amazon Lex
     *            decides on the next course of action and selects an
     *            appropriate message from the bot's configuration based on the
     *            current interaction context. For example, if Amazon Lex isn't
     *            able to understand user input, it uses a clarification prompt
     *            message.
     *            </p>
     *            <p>
     *            When you create an intent you can assign messages to groups.
     *            When messages are assigned to groups Amazon Lex returns one
     *            message from each group in the response. The message field is
     *            an escaped JSON string containing the messages. For more
     *            information about the structure of the JSON string returned,
     *            see <a>msg-prompts-formats</a>.
     *            </p>
     *            <p>
     *            If the Lambda function returns a message, Amazon Lex passes it
     *            to the client in its response.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message to convey to the user. The message can come from the bot's
     * configuration or from a Lambda function.
     * </p>
     * <p>
     * If the intent is not configured with a Lambda function, or if the Lambda
     * function returned <code>Delegate</code> as the
     * <code>dialogAction.type</code> its response, Amazon Lex decides on the
     * next course of action and selects an appropriate message from the bot's
     * configuration based on the current interaction context. For example, if
     * Amazon Lex isn't able to understand user input, it uses a clarification
     * prompt message.
     * </p>
     * <p>
     * When you create an intent you can assign messages to groups. When
     * messages are assigned to groups Amazon Lex returns one message from each
     * group in the response. The message field is an escaped JSON string
     * containing the messages. For more information about the structure of the
     * JSON string returned, see <a>msg-prompts-formats</a>.
     * </p>
     * <p>
     * If the Lambda function returns a message, Amazon Lex passes it to the
     * client in its response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            The message to convey to the user. The message can come from
     *            the bot's configuration or from a Lambda function.
     *            </p>
     *            <p>
     *            If the intent is not configured with a Lambda function, or if
     *            the Lambda function returned <code>Delegate</code> as the
     *            <code>dialogAction.type</code> its response, Amazon Lex
     *            decides on the next course of action and selects an
     *            appropriate message from the bot's configuration based on the
     *            current interaction context. For example, if Amazon Lex isn't
     *            able to understand user input, it uses a clarification prompt
     *            message.
     *            </p>
     *            <p>
     *            When you create an intent you can assign messages to groups.
     *            When messages are assigned to groups Amazon Lex returns one
     *            message from each group in the response. The message field is
     *            an escaped JSON string containing the messages. For more
     *            information about the structure of the JSON string returned,
     *            see <a>msg-prompts-formats</a>.
     *            </p>
     *            <p>
     *            If the Lambda function returns a message, Amazon Lex passes it
     *            to the client in its response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format defined by
     * the Lambda function.
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
     * containing one or more messages from the groups that messages were
     * assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @return <p>
     *         The format of the response message. One of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PlainText</code> - The message contains plain UTF-8 text.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CustomPayload</code> - The message is a custom format
     *         defined by the Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSML</code> - The message contains text formatted for voice
     *         output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Composite</code> - The message contains an escaped JSON
     *         object containing one or more messages from the groups that
     *         messages were assigned to when the intent was created.
     *         </p>
     *         </li>
     *         </ul>
     * @see MessageFormatType
     */
    public String getMessageFormat() {
        return messageFormat;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format defined by
     * the Lambda function.
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
     * containing one or more messages from the groups that messages were
     * assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @param messageFormat <p>
     *            The format of the response message. One of the following
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            defined by the Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages from the groups that
     *            messages were assigned to when the intent was created.
     *            </p>
     *            </li>
     *            </ul>
     * @see MessageFormatType
     */
    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format defined by
     * the Lambda function.
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
     * containing one or more messages from the groups that messages were
     * assigned to when the intent was created.
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
     * @param messageFormat <p>
     *            The format of the response message. One of the following
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            defined by the Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages from the groups that
     *            messages were assigned to when the intent was created.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormatType
     */
    public PostTextResult withMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
        return this;
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format defined by
     * the Lambda function.
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
     * containing one or more messages from the groups that messages were
     * assigned to when the intent was created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PlainText, CustomPayload, SSML, Composite
     *
     * @param messageFormat <p>
     *            The format of the response message. One of the following
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            defined by the Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages from the groups that
     *            messages were assigned to when the intent was created.
     *            </p>
     *            </li>
     *            </ul>
     * @see MessageFormatType
     */
    public void setMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
    }

    /**
     * <p>
     * The format of the response message. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlainText</code> - The message contains plain UTF-8 text.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomPayload</code> - The message is a custom format defined by
     * the Lambda function.
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
     * containing one or more messages from the groups that messages were
     * assigned to when the intent was created.
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
     * @param messageFormat <p>
     *            The format of the response message. One of the following
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlainText</code> - The message contains plain UTF-8
     *            text.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CustomPayload</code> - The message is a custom format
     *            defined by the Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SSML</code> - The message contains text formatted for
     *            voice output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Composite</code> - The message contains an escaped JSON
     *            object containing one or more messages from the groups that
     *            messages were assigned to when the intent was created.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormatType
     */
    public PostTextResult withMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit user intent.
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialogState.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent.
     * </p>
     * <p>
     * Instead of a simple "yes" or "no," a user might respond with additional
     * information. For example, "yes, but make it thick crust pizza" or
     * "no, I want to order a drink". Amazon Lex can process such additional
     * information (in these examples, update the crust type slot value, or
     * change intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting a slot value for the
     * current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message:
     * "What size pizza would you like?". A user might reply with the slot value
     * (e.g., "medium"). The user might also provide additional information in
     * the response (e.g., "medium thick crust pizza"). Amazon Lex can process
     * such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function configured for
     * the intent has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons including that the user did not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or the Lambda function failed to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @return <p>
     *         Identifies the current state of the user interaction. Amazon Lex
     *         returns one of the following values as <code>dialogState</code>.
     *         The client can optionally use this information to customize the
     *         user interface.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> - Amazon Lex wants to elicit user
     *         intent.
     *         </p>
     *         <p>
     *         For example, a user might utter an intent
     *         ("I want to order a pizza"). If Amazon Lex cannot infer the user
     *         intent from this utterance, it will return this dialogState.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or
     *         "no" response.
     *         </p>
     *         <p>
     *         For example, Amazon Lex wants user confirmation before fulfilling
     *         an intent.
     *         </p>
     *         <p>
     *         Instead of a simple "yes" or "no," a user might respond with
     *         additional information. For example,
     *         "yes, but make it thick crust pizza" or
     *         "no, I want to order a drink". Amazon Lex can process such
     *         additional information (in these examples, update the crust type
     *         slot value, or change intent from OrderPizza to OrderDrink).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> - Amazon Lex is expecting a slot value
     *         for the current intent.
     *         </p>
     *         <p>
     *         For example, suppose that in the response Amazon Lex sends this
     *         message: "What size pizza would you like?". A user might reply
     *         with the slot value (e.g., "medium"). The user might also provide
     *         additional information in the response (e.g.,
     *         "medium thick crust pizza"). Amazon Lex can process such
     *         additional information appropriately.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fulfilled</code> - Conveys that the Lambda function
     *         configured for the intent has successfully fulfilled the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> - Conveys that the client has to
     *         fulfill the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - Conveys that the conversation with the user
     *         failed.
     *         </p>
     *         <p>
     *         This can happen for various reasons including that the user did
     *         not provide an appropriate response to prompts from the service
     *         (you can configure how many times Amazon Lex can prompt a user
     *         for specific information), or the Lambda function failed to
     *         fulfill the intent.
     *         </p>
     *         </li>
     *         </ul>
     * @see DialogState
     */
    public String getDialogState() {
        return dialogState;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit user intent.
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialogState.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent.
     * </p>
     * <p>
     * Instead of a simple "yes" or "no," a user might respond with additional
     * information. For example, "yes, but make it thick crust pizza" or
     * "no, I want to order a drink". Amazon Lex can process such additional
     * information (in these examples, update the crust type slot value, or
     * change intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting a slot value for the
     * current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message:
     * "What size pizza would you like?". A user might reply with the slot value
     * (e.g., "medium"). The user might also provide additional information in
     * the response (e.g., "medium thick crust pizza"). Amazon Lex can process
     * such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function configured for
     * the intent has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons including that the user did not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or the Lambda function failed to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit user
     *            intent.
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this
     *            dialogState.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent.
     *            </p>
     *            <p>
     *            Instead of a simple "yes" or "no," a user might respond with
     *            additional information. For example,
     *            "yes, but make it thick crust pizza" or
     *            "no, I want to order a drink". Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot value, or change intent from OrderPizza to
     *            OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting a slot value
     *            for the current intent.
     *            </p>
     *            <p>
     *            For example, suppose that in the response Amazon Lex sends
     *            this message: "What size pizza would you like?". A user might
     *            reply with the slot value (e.g., "medium"). The user might
     *            also provide additional information in the response (e.g.,
     *            "medium thick crust pizza"). Amazon Lex can process such
     *            additional information appropriately.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function
     *            configured for the intent has successfully fulfilled the
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons including that the user
     *            did not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or the Lambda
     *            function failed to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @see DialogState
     */
    public void setDialogState(String dialogState) {
        this.dialogState = dialogState;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit user intent.
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialogState.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent.
     * </p>
     * <p>
     * Instead of a simple "yes" or "no," a user might respond with additional
     * information. For example, "yes, but make it thick crust pizza" or
     * "no, I want to order a drink". Amazon Lex can process such additional
     * information (in these examples, update the crust type slot value, or
     * change intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting a slot value for the
     * current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message:
     * "What size pizza would you like?". A user might reply with the slot value
     * (e.g., "medium"). The user might also provide additional information in
     * the response (e.g., "medium thick crust pizza"). Amazon Lex can process
     * such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function configured for
     * the intent has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons including that the user did not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or the Lambda function failed to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit user
     *            intent.
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this
     *            dialogState.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent.
     *            </p>
     *            <p>
     *            Instead of a simple "yes" or "no," a user might respond with
     *            additional information. For example,
     *            "yes, but make it thick crust pizza" or
     *            "no, I want to order a drink". Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot value, or change intent from OrderPizza to
     *            OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting a slot value
     *            for the current intent.
     *            </p>
     *            <p>
     *            For example, suppose that in the response Amazon Lex sends
     *            this message: "What size pizza would you like?". A user might
     *            reply with the slot value (e.g., "medium"). The user might
     *            also provide additional information in the response (e.g.,
     *            "medium thick crust pizza"). Amazon Lex can process such
     *            additional information appropriately.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function
     *            configured for the intent has successfully fulfilled the
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons including that the user
     *            did not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or the Lambda
     *            function failed to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogState
     */
    public PostTextResult withDialogState(String dialogState) {
        this.dialogState = dialogState;
        return this;
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit user intent.
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialogState.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent.
     * </p>
     * <p>
     * Instead of a simple "yes" or "no," a user might respond with additional
     * information. For example, "yes, but make it thick crust pizza" or
     * "no, I want to order a drink". Amazon Lex can process such additional
     * information (in these examples, update the crust type slot value, or
     * change intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting a slot value for the
     * current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message:
     * "What size pizza would you like?". A user might reply with the slot value
     * (e.g., "medium"). The user might also provide additional information in
     * the response (e.g., "medium thick crust pizza"). Amazon Lex can process
     * such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function configured for
     * the intent has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons including that the user did not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or the Lambda function failed to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit user
     *            intent.
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this
     *            dialogState.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent.
     *            </p>
     *            <p>
     *            Instead of a simple "yes" or "no," a user might respond with
     *            additional information. For example,
     *            "yes, but make it thick crust pizza" or
     *            "no, I want to order a drink". Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot value, or change intent from OrderPizza to
     *            OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting a slot value
     *            for the current intent.
     *            </p>
     *            <p>
     *            For example, suppose that in the response Amazon Lex sends
     *            this message: "What size pizza would you like?". A user might
     *            reply with the slot value (e.g., "medium"). The user might
     *            also provide additional information in the response (e.g.,
     *            "medium thick crust pizza"). Amazon Lex can process such
     *            additional information appropriately.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function
     *            configured for the intent has successfully fulfilled the
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons including that the user
     *            did not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or the Lambda
     *            function failed to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @see DialogState
     */
    public void setDialogState(DialogState dialogState) {
        this.dialogState = dialogState.toString();
    }

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit user intent.
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialogState.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent.
     * </p>
     * <p>
     * Instead of a simple "yes" or "no," a user might respond with additional
     * information. For example, "yes, but make it thick crust pizza" or
     * "no, I want to order a drink". Amazon Lex can process such additional
     * information (in these examples, update the crust type slot value, or
     * change intent from OrderPizza to OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting a slot value for the
     * current intent.
     * </p>
     * <p>
     * For example, suppose that in the response Amazon Lex sends this message:
     * "What size pizza would you like?". A user might reply with the slot value
     * (e.g., "medium"). The user might also provide additional information in
     * the response (e.g., "medium thick crust pizza"). Amazon Lex can process
     * such additional information appropriately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function configured for
     * the intent has successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons including that the user did not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or the Lambda function failed to fulfill the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit user
     *            intent.
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this
     *            dialogState.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent.
     *            </p>
     *            <p>
     *            Instead of a simple "yes" or "no," a user might respond with
     *            additional information. For example,
     *            "yes, but make it thick crust pizza" or
     *            "no, I want to order a drink". Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot value, or change intent from OrderPizza to
     *            OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting a slot value
     *            for the current intent.
     *            </p>
     *            <p>
     *            For example, suppose that in the response Amazon Lex sends
     *            this message: "What size pizza would you like?". A user might
     *            reply with the slot value (e.g., "medium"). The user might
     *            also provide additional information in the response (e.g.,
     *            "medium thick crust pizza"). Amazon Lex can process such
     *            additional information appropriately.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function
     *            configured for the intent has successfully fulfilled the
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons including that the user
     *            did not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or the Lambda
     *            function failed to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogState
     */
    public PostTextResult withDialogState(DialogState dialogState) {
        this.dialogState = dialogState.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns
     * the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     *
     * @return <p>
     *         If the <code>dialogState</code> value is <code>ElicitSlot</code>,
     *         returns the name of the slot for which Amazon Lex is eliciting a
     *         value.
     *         </p>
     */
    public String getSlotToElicit() {
        return slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns
     * the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     *
     * @param slotToElicit <p>
     *            If the <code>dialogState</code> value is
     *            <code>ElicitSlot</code>, returns the name of the slot for
     *            which Amazon Lex is eliciting a value.
     *            </p>
     */
    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> value is <code>ElicitSlot</code>, returns
     * the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotToElicit <p>
     *            If the <code>dialogState</code> value is
     *            <code>ElicitSlot</code>, returns the name of the slot for
     *            which Amazon Lex is eliciting a value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextResult withSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
        return this;
    }

    /**
     * <p>
     * Represents the options that the user has to respond to the current
     * prompt. Response Card can come from the bot configuration (in the Amazon
     * Lex console, choose the settings button next to a slot) or from a code
     * hook (Lambda function).
     * </p>
     *
     * @return <p>
     *         Represents the options that the user has to respond to the
     *         current prompt. Response Card can come from the bot configuration
     *         (in the Amazon Lex console, choose the settings button next to a
     *         slot) or from a code hook (Lambda function).
     *         </p>
     */
    public ResponseCard getResponseCard() {
        return responseCard;
    }

    /**
     * <p>
     * Represents the options that the user has to respond to the current
     * prompt. Response Card can come from the bot configuration (in the Amazon
     * Lex console, choose the settings button next to a slot) or from a code
     * hook (Lambda function).
     * </p>
     *
     * @param responseCard <p>
     *            Represents the options that the user has to respond to the
     *            current prompt. Response Card can come from the bot
     *            configuration (in the Amazon Lex console, choose the settings
     *            button next to a slot) or from a code hook (Lambda function).
     *            </p>
     */
    public void setResponseCard(ResponseCard responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * Represents the options that the user has to respond to the current
     * prompt. Response Card can come from the bot configuration (in the Amazon
     * Lex console, choose the settings button next to a slot) or from a code
     * hook (Lambda function).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseCard <p>
     *            Represents the options that the user has to respond to the
     *            current prompt. Response Card can come from the bot
     *            configuration (in the Amazon Lex console, choose the settings
     *            button next to a slot) or from a code hook (Lambda function).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextResult withResponseCard(ResponseCard responseCard) {
        this.responseCard = responseCard;
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
        if (getSlots() != null)
            sb.append("slots: " + getSlots() + ",");
        if (getSessionAttributes() != null)
            sb.append("sessionAttributes: " + getSessionAttributes() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage() + ",");
        if (getMessageFormat() != null)
            sb.append("messageFormat: " + getMessageFormat() + ",");
        if (getDialogState() != null)
            sb.append("dialogState: " + getDialogState() + ",");
        if (getSlotToElicit() != null)
            sb.append("slotToElicit: " + getSlotToElicit() + ",");
        if (getResponseCard() != null)
            sb.append("responseCard: " + getResponseCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode
                + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode
                + ((getDialogState() == null) ? 0 : getDialogState().hashCode());
        hashCode = prime * hashCode
                + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostTextResult == false)
            return false;
        PostTextResult other = (PostTextResult) obj;

        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null
                && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null
                && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
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
        if (other.getDialogState() == null ^ this.getDialogState() == null)
            return false;
        if (other.getDialogState() != null
                && other.getDialogState().equals(this.getDialogState()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null
                && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null
                && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        return true;
    }
}
