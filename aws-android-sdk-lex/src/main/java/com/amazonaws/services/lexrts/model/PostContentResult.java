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

public class PostContentResult implements Serializable {
    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the
     * request.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     */
    private String intentName;

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected
     * from the user input during the conversation.
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
    private String slots;

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information.
     * </p>
     */
    private String sessionAttributes;

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
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent. Instead of a simple "yes" or "no" response, a user might respond
     * with additional information. For example,
     * "yes, but make it a thick crust pizza" or "no, I want to order a drink."
     * Amazon Lex can process such additional information (in these examples,
     * update the crust type slot or change the intent from OrderPizza to
     * OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
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
     * <code>Fulfilled</code> - Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or if the Lambda function fails to fulfill the intent.
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
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field
     * contains the text extracted from the audio stream. This is the text that
     * is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the
     * audio that you send.
     * </p>
     */
    private String inputTranscript;

    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot
     * configuration and context. For example, if Amazon Lex did not understand
     * the user intent, it sends the <code>clarificationPrompt</code> configured
     * for the bot. If the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Another
     * example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends
     * that message in the response.
     * </p>
     */
    private java.io.InputStream audioStream;

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the
     * request.
     * </p>
     *
     * @return <p>
     *         Content type as specified in the <code>Accept</code> HTTP header
     *         in the request.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the
     * request.
     * </p>
     *
     * @param contentType <p>
     *            Content type as specified in the <code>Accept</code> HTTP
     *            header in the request.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            Content type as specified in the <code>Accept</code> HTTP
     *            header in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     *
     * @return <p>
     *         Current user intent that Amazon Lex is aware of.
     *         </p>
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     *
     * @param intentName <p>
     *            Current user intent that Amazon Lex is aware of.
     *            </p>
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * Current user intent that Amazon Lex is aware of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intentName <p>
     *            Current user intent that Amazon Lex is aware of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentResult withIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected
     * from the user input during the conversation.
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
     *         Map of zero or more intent slots (name/value pairs) Amazon Lex
     *         detected from the user input during the conversation.
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
    public String getSlots() {
        return slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected
     * from the user input during the conversation.
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
     *            Map of zero or more intent slots (name/value pairs) Amazon Lex
     *            detected from the user input during the conversation.
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
    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected
     * from the user input during the conversation.
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
     *            Map of zero or more intent slots (name/value pairs) Amazon Lex
     *            detected from the user input during the conversation.
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
    public PostContentResult withSlots(String slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information.
     * </p>
     *
     * @return <p>
     *         Map of key/value pairs representing the session-specific context
     *         information.
     *         </p>
     */
    public String getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information.
     * </p>
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing the session-specific
     *            context information.
     *            </p>
     */
    public void setSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing the session-specific
     *            context information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentResult withSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
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
    public PostContentResult withMessage(String message) {
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
     *         <code>CustomPayload</code> - The message is a custom format for
     *         the client.
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
     *            for the client.
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
     *            for the client.
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
    public PostContentResult withMessageFormat(String messageFormat) {
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
     *            for the client.
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
     *            for the client.
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
    public PostContentResult withMessageFormat(MessageFormatType messageFormat) {
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
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent. Instead of a simple "yes" or "no" response, a user might respond
     * with additional information. For example,
     * "yes, but make it a thick crust pizza" or "no, I want to order a drink."
     * Amazon Lex can process such additional information (in these examples,
     * update the crust type slot or change the intent from OrderPizza to
     * OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
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
     * <code>Fulfilled</code> - Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or if the Lambda function fails to fulfill the intent.
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
     *         <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's
     *         intent. Consider the following examples:
     *         </p>
     *         <p>
     *         For example, a user might utter an intent
     *         ("I want to order a pizza"). If Amazon Lex cannot infer the user
     *         intent from this utterance, it will return this dialog state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or
     *         "no" response.
     *         </p>
     *         <p>
     *         For example, Amazon Lex wants user confirmation before fulfilling
     *         an intent. Instead of a simple "yes" or "no" response, a user
     *         might respond with additional information. For example,
     *         "yes, but make it a thick crust pizza" or
     *         "no, I want to order a drink." Amazon Lex can process such
     *         additional information (in these examples, update the crust type
     *         slot or change the intent from OrderPizza to OrderDrink).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> - Amazon Lex is expecting the value of a
     *         slot for the current intent.
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
     *         <code>Fulfilled</code> - Conveys that the Lambda function has
     *         successfully fulfilled the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> - Conveys that the client has to
     *         fulfill the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - Conveys that the conversation with the user
     *         failed.
     *         </p>
     *         <p>
     *         This can happen for various reasons, including that the user does
     *         not provide an appropriate response to prompts from the service
     *         (you can configure how many times Amazon Lex can prompt a user
     *         for specific information), or if the Lambda function fails to
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
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent. Instead of a simple "yes" or "no" response, a user might respond
     * with additional information. For example,
     * "yes, but make it a thick crust pizza" or "no, I want to order a drink."
     * Amazon Lex can process such additional information (in these examples,
     * update the crust type slot or change the intent from OrderPizza to
     * OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
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
     * <code>Fulfilled</code> - Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or if the Lambda function fails to fulfill the intent.
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
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent. Instead of a simple "yes" or "no"
     *            response, a user might respond with additional information.
     *            For example, "yes, but make it a thick crust pizza" or
     *            "no, I want to order a drink." Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot or change the intent from OrderPizza to OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
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
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons, including that the user
     *            does not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or if the Lambda
     *            function fails to fulfill the intent.
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
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent. Instead of a simple "yes" or "no" response, a user might respond
     * with additional information. For example,
     * "yes, but make it a thick crust pizza" or "no, I want to order a drink."
     * Amazon Lex can process such additional information (in these examples,
     * update the crust type slot or change the intent from OrderPizza to
     * OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
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
     * <code>Fulfilled</code> - Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or if the Lambda function fails to fulfill the intent.
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
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent. Instead of a simple "yes" or "no"
     *            response, a user might respond with additional information.
     *            For example, "yes, but make it a thick crust pizza" or
     *            "no, I want to order a drink." Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot or change the intent from OrderPizza to OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
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
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons, including that the user
     *            does not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or if the Lambda
     *            function fails to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogState
     */
    public PostContentResult withDialogState(String dialogState) {
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
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent. Instead of a simple "yes" or "no" response, a user might respond
     * with additional information. For example,
     * "yes, but make it a thick crust pizza" or "no, I want to order a drink."
     * Amazon Lex can process such additional information (in these examples,
     * update the crust type slot or change the intent from OrderPizza to
     * OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
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
     * <code>Fulfilled</code> - Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or if the Lambda function fails to fulfill the intent.
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
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent. Instead of a simple "yes" or "no"
     *            response, a user might respond with additional information.
     *            For example, "yes, but make it a thick crust pizza" or
     *            "no, I want to order a drink." Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot or change the intent from OrderPizza to OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
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
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons, including that the user
     *            does not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or if the Lambda
     *            function fails to fulfill the intent.
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
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <p>
     * For example, a user might utter an intent ("I want to order a pizza"). If
     * Amazon Lex cannot infer the user intent from this utterance, it will
     * return this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response.
     * </p>
     * <p>
     * For example, Amazon Lex wants user confirmation before fulfilling an
     * intent. Instead of a simple "yes" or "no" response, a user might respond
     * with additional information. For example,
     * "yes, but make it a thick crust pizza" or "no, I want to order a drink."
     * Amazon Lex can process such additional information (in these examples,
     * update the crust type slot or change the intent from OrderPizza to
     * OrderDrink).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
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
     * <code>Fulfilled</code> - Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user failed.
     * </p>
     * <p>
     * This can happen for various reasons, including that the user does not
     * provide an appropriate response to prompts from the service (you can
     * configure how many times Amazon Lex can prompt a user for specific
     * information), or if the Lambda function fails to fulfill the intent.
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
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent
     *            ("I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response.
     *            </p>
     *            <p>
     *            For example, Amazon Lex wants user confirmation before
     *            fulfilling an intent. Instead of a simple "yes" or "no"
     *            response, a user might respond with additional information.
     *            For example, "yes, but make it a thick crust pizza" or
     *            "no, I want to order a drink." Amazon Lex can process such
     *            additional information (in these examples, update the crust
     *            type slot or change the intent from OrderPizza to OrderDrink).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
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
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user failed.
     *            </p>
     *            <p>
     *            This can happen for various reasons, including that the user
     *            does not provide an appropriate response to prompts from the
     *            service (you can configure how many times Amazon Lex can
     *            prompt a user for specific information), or if the Lambda
     *            function fails to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogState
     */
    public PostContentResult withDialogState(DialogState dialogState) {
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
    public PostContentResult withSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
        return this;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field
     * contains the text extracted from the audio stream. This is the text that
     * is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the
     * audio that you send.
     * </p>
     *
     * @return <p>
     *         The text used to process the request.
     *         </p>
     *         <p>
     *         If the input was an audio stream, the
     *         <code>inputTranscript</code> field contains the text extracted
     *         from the audio stream. This is the text that is actually
     *         processed to recognize intents and slot values. You can use this
     *         information to determine if Amazon Lex is correctly processing
     *         the audio that you send.
     *         </p>
     */
    public String getInputTranscript() {
        return inputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field
     * contains the text extracted from the audio stream. This is the text that
     * is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the
     * audio that you send.
     * </p>
     *
     * @param inputTranscript <p>
     *            The text used to process the request.
     *            </p>
     *            <p>
     *            If the input was an audio stream, the
     *            <code>inputTranscript</code> field contains the text extracted
     *            from the audio stream. This is the text that is actually
     *            processed to recognize intents and slot values. You can use
     *            this information to determine if Amazon Lex is correctly
     *            processing the audio that you send.
     *            </p>
     */
    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    /**
     * <p>
     * The text used to process the request.
     * </p>
     * <p>
     * If the input was an audio stream, the <code>inputTranscript</code> field
     * contains the text extracted from the audio stream. This is the text that
     * is actually processed to recognize intents and slot values. You can use
     * this information to determine if Amazon Lex is correctly processing the
     * audio that you send.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputTranscript <p>
     *            The text used to process the request.
     *            </p>
     *            <p>
     *            If the input was an audio stream, the
     *            <code>inputTranscript</code> field contains the text extracted
     *            from the audio stream. This is the text that is actually
     *            processed to recognize intents and slot values. You can use
     *            this information to determine if Amazon Lex is correctly
     *            processing the audio that you send.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentResult withInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
        return this;
    }

    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot
     * configuration and context. For example, if Amazon Lex did not understand
     * the user intent, it sends the <code>clarificationPrompt</code> configured
     * for the bot. If the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Another
     * example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends
     * that message in the response.
     * </p>
     *
     * @return <p>
     *         The prompt (or statement) to convey to the user. This is based on
     *         the bot configuration and context. For example, if Amazon Lex did
     *         not understand the user intent, it sends the
     *         <code>clarificationPrompt</code> configured for the bot. If the
     *         intent requires confirmation before taking the fulfillment
     *         action, it sends the <code>confirmationPrompt</code>. Another
     *         example: Suppose that the Lambda function successfully fulfilled
     *         the intent, and sent a message to convey to the user. Then Amazon
     *         Lex sends that message in the response.
     *         </p>
     */
    public java.io.InputStream getAudioStream() {
        return audioStream;
    }

    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot
     * configuration and context. For example, if Amazon Lex did not understand
     * the user intent, it sends the <code>clarificationPrompt</code> configured
     * for the bot. If the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Another
     * example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends
     * that message in the response.
     * </p>
     *
     * @param audioStream <p>
     *            The prompt (or statement) to convey to the user. This is based
     *            on the bot configuration and context. For example, if Amazon
     *            Lex did not understand the user intent, it sends the
     *            <code>clarificationPrompt</code> configured for the bot. If
     *            the intent requires confirmation before taking the fulfillment
     *            action, it sends the <code>confirmationPrompt</code>. Another
     *            example: Suppose that the Lambda function successfully
     *            fulfilled the intent, and sent a message to convey to the
     *            user. Then Amazon Lex sends that message in the response.
     *            </p>
     */
    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * The prompt (or statement) to convey to the user. This is based on the bot
     * configuration and context. For example, if Amazon Lex did not understand
     * the user intent, it sends the <code>clarificationPrompt</code> configured
     * for the bot. If the intent requires confirmation before taking the
     * fulfillment action, it sends the <code>confirmationPrompt</code>. Another
     * example: Suppose that the Lambda function successfully fulfilled the
     * intent, and sent a message to convey to the user. Then Amazon Lex sends
     * that message in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioStream <p>
     *            The prompt (or statement) to convey to the user. This is based
     *            on the bot configuration and context. For example, if Amazon
     *            Lex did not understand the user intent, it sends the
     *            <code>clarificationPrompt</code> configured for the bot. If
     *            the intent requires confirmation before taking the fulfillment
     *            action, it sends the <code>confirmationPrompt</code>. Another
     *            example: Suppose that the Lambda function successfully
     *            fulfilled the intent, and sent a message to convey to the
     *            user. Then Amazon Lex sends that message in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentResult withAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
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
        if (getContentType() != null)
            sb.append("contentType: " + getContentType() + ",");
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
        if (getInputTranscript() != null)
            sb.append("inputTranscript: " + getInputTranscript() + ",");
        if (getAudioStream() != null)
            sb.append("audioStream: " + getAudioStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
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
                + ((getInputTranscript() == null) ? 0 : getInputTranscript().hashCode());
        hashCode = prime * hashCode
                + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostContentResult == false)
            return false;
        PostContentResult other = (PostContentResult) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
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
        if (other.getInputTranscript() == null ^ this.getInputTranscript() == null)
            return false;
        if (other.getInputTranscript() != null
                && other.getInputTranscript().equals(this.getInputTranscript()) == false)
            return false;
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null
                && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        return true;
    }
}
