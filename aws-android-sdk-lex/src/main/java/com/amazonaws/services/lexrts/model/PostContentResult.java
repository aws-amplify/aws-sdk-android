/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map;

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
     */
    private Map<String, String> slots;

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information.
     * </p>
     */
    private Map<String, String> sessionAttributes;

    /**
     * <p>
     * Message to convey to the user. It can come from the bot's configuration
     * or a code hook (Lambda function). If the current intent is not configured
     * with a code hook or if the code hook returned <code>Delegate</code> as
     * the <code>dialogAction.type</code> in its response, then Amazon Lex
     * decides the next course of action and selects an appropriate message from
     * the bot configuration based on the current user interaction context. For
     * example, if Amazon Lex is not able to understand the user input, it uses
     * a clarification prompt message (For more information, see the Error
     * Handling section in the Amazon Lex console). Another example: if the
     * intent requires confirmation before fulfillment, then Amazon Lex uses the
     * confirmation prompt message in the intent configuration. If the code hook
     * returns a message, Amazon Lex passes it as-is in its response to the
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String message;

    /**
     * <p>
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
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
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes" or "no"
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
     * <code>ElicitSlot</code> – Amazon Lex is expecting the value of a slot for
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
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to
     * fullfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conveys that the conversation with the user failed.
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
     * Transcript of the voice input to the operation.
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
     * @return
     *         <p>
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
     * @param intentName
     *            <p>
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
     * @param intentName
     *            <p>
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
     *
     * @return <p>
     *         Map of zero or more intent slots (name/value pairs) Amazon Lex
     *         detected from the user input during the conversation.
     *         </p>
     */
    public Map<String, String> getSlots() {
        return slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected
     * from the user input during the conversation.
     * </p>
     *
     * @param slots <p>
     *            Map of zero or more intent slots (name/value pairs) Amazon Lex
     *            detected from the user input during the conversation.
     *            </p>
     */
    public void setSlots(Map<String, String> slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots (name/value pairs) Amazon Lex detected
     * from the user input during the conversation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            Map of zero or more intent slots (name/value pairs) Amazon Lex
     *            detected from the user input during the conversation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentResult withSlots(Map<String, String> slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information.
     * </p>
     *
     * @return
     *         <p>
     *         Map of key/value pairs representing the session-specific context
     *         information.
     *         </p>
     */
    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information.
     * </p>
     *
     * @param sessionAttributes
     *            <p>
     *            Map of key/value pairs representing the session-specific
     *            context information.
     *            </p>
     */
    public void setSessionAttributes(Map<String, String> sessionAttributes) {
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
     * @param sessionAttributes
     *            <p>
     *            Map of key/value pairs representing the session-specific
     *            context information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentResult withSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * Message to convey to the user. It can come from the bot's configuration
     * or a code hook (Lambda function). If the current intent is not configured
     * with a code hook or if the code hook returned <code>Delegate</code> as
     * the <code>dialogAction.type</code> in its response, then Amazon Lex
     * decides the next course of action and selects an appropriate message from
     * the bot configuration based on the current user interaction context. For
     * example, if Amazon Lex is not able to understand the user input, it uses
     * a clarification prompt message (For more information, see the Error
     * Handling section in the Amazon Lex console). Another example: if the
     * intent requires confirmation before fulfillment, then Amazon Lex uses the
     * confirmation prompt message in the intent configuration. If the code hook
     * returns a message, Amazon Lex passes it as-is in its response to the
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return
     *         <p>
     *         Message to convey to the user. It can come from the bot's
     *         configuration or a code hook (Lambda function). If the current
     *         intent is not configured with a code hook or if the code hook
     *         returned <code>Delegate</code> as the
     *         <code>dialogAction.type</code> in its response, then Amazon Lex
     *         decides the next course of action and selects an appropriate
     *         message from the bot configuration based on the current user
     *         interaction context. For example, if Amazon Lex is not able to
     *         understand the user input, it uses a clarification prompt message
     *         (For more information, see the Error Handling section in the
     *         Amazon Lex console). Another example: if the intent requires
     *         confirmation before fulfillment, then Amazon Lex uses the
     *         confirmation prompt message in the intent configuration. If the
     *         code hook returns a message, Amazon Lex passes it as-is in its
     *         response to the client.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Message to convey to the user. It can come from the bot's configuration
     * or a code hook (Lambda function). If the current intent is not configured
     * with a code hook or if the code hook returned <code>Delegate</code> as
     * the <code>dialogAction.type</code> in its response, then Amazon Lex
     * decides the next course of action and selects an appropriate message from
     * the bot configuration based on the current user interaction context. For
     * example, if Amazon Lex is not able to understand the user input, it uses
     * a clarification prompt message (For more information, see the Error
     * Handling section in the Amazon Lex console). Another example: if the
     * intent requires confirmation before fulfillment, then Amazon Lex uses the
     * confirmation prompt message in the intent configuration. If the code hook
     * returns a message, Amazon Lex passes it as-is in its response to the
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message
     *            <p>
     *            Message to convey to the user. It can come from the bot's
     *            configuration or a code hook (Lambda function). If the current
     *            intent is not configured with a code hook or if the code hook
     *            returned <code>Delegate</code> as the
     *            <code>dialogAction.type</code> in its response, then Amazon
     *            Lex decides the next course of action and selects an
     *            appropriate message from the bot configuration based on the
     *            current user interaction context. For example, if Amazon Lex
     *            is not able to understand the user input, it uses a
     *            clarification prompt message (For more information, see the
     *            Error Handling section in the Amazon Lex console). Another
     *            example: if the intent requires confirmation before
     *            fulfillment, then Amazon Lex uses the confirmation prompt
     *            message in the intent configuration. If the code hook returns
     *            a message, Amazon Lex passes it as-is in its response to the
     *            client.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Message to convey to the user. It can come from the bot's configuration
     * or a code hook (Lambda function). If the current intent is not configured
     * with a code hook or if the code hook returned <code>Delegate</code> as
     * the <code>dialogAction.type</code> in its response, then Amazon Lex
     * decides the next course of action and selects an appropriate message from
     * the bot configuration based on the current user interaction context. For
     * example, if Amazon Lex is not able to understand the user input, it uses
     * a clarification prompt message (For more information, see the Error
     * Handling section in the Amazon Lex console). Another example: if the
     * intent requires confirmation before fulfillment, then Amazon Lex uses the
     * confirmation prompt message in the intent configuration. If the code hook
     * returns a message, Amazon Lex passes it as-is in its response to the
     * client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message
     *            <p>
     *            Message to convey to the user. It can come from the bot's
     *            configuration or a code hook (Lambda function). If the current
     *            intent is not configured with a code hook or if the code hook
     *            returned <code>Delegate</code> as the
     *            <code>dialogAction.type</code> in its response, then Amazon
     *            Lex decides the next course of action and selects an
     *            appropriate message from the bot configuration based on the
     *            current user interaction context. For example, if Amazon Lex
     *            is not able to understand the user input, it uses a
     *            clarification prompt message (For more information, see the
     *            Error Handling section in the Amazon Lex console). Another
     *            example: if the intent requires confirmation before
     *            fulfillment, then Amazon Lex uses the confirmation prompt
     *            message in the intent configuration. If the code hook returns
     *            a message, Amazon Lex passes it as-is in its response to the
     *            client.
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
     * Identifies the current state of the user interaction. Amazon Lex returns
     * one of the following values as <code>dialogState</code>. The client can
     * optionally use this information to customize the user interface.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
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
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes" or "no"
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
     * <code>ElicitSlot</code> – Amazon Lex is expecting the value of a slot for
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
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to
     * fullfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conveys that the conversation with the user failed.
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
     * @return
     *         <p>
     *         Identifies the current state of the user interaction. Amazon Lex
     *         returns one of the following values as <code>dialogState</code>.
     *         The client can optionally use this information to customize the
     *         user interface.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's
     *         intent. Consider the following examples:
     *         </p>
     *         <p>
     *         For example, a user might utter an intent (
     *         "I want to order a pizza"). If Amazon Lex cannot infer the user
     *         intent from this utterance, it will return this dialog state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes" or
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
     *         <code>ElicitSlot</code> – Amazon Lex is expecting the value of a
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
     *         <code>Fulfilled</code> – Conveys that the Lambda function has
     *         successfully fulfilled the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> – Conveys that the client has to
     *         fullfill the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> – Conveys that the conversation with the user
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
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
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
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes" or "no"
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
     * <code>ElicitSlot</code> – Amazon Lex is expecting the value of a slot for
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
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to
     * fullfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conveys that the conversation with the user failed.
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
     * @param dialogState
     *            <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent (
     *            "I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes"
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
     *            <code>ElicitSlot</code> – Amazon Lex is expecting the value of
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
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to fullfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conveys that the conversation with the
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
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
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
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes" or "no"
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
     * <code>ElicitSlot</code> – Amazon Lex is expecting the value of a slot for
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
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to
     * fullfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conveys that the conversation with the user failed.
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
     * @param dialogState
     *            <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent (
     *            "I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes"
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
     *            <code>ElicitSlot</code> – Amazon Lex is expecting the value of
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
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to fullfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conveys that the conversation with the
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
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
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
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes" or "no"
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
     * <code>ElicitSlot</code> – Amazon Lex is expecting the value of a slot for
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
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to
     * fullfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conveys that the conversation with the user failed.
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
     * @param dialogState
     *            <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent (
     *            "I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes"
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
     *            <code>ElicitSlot</code> – Amazon Lex is expecting the value of
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
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to fullfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conveys that the conversation with the
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
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
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
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes" or "no"
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
     * <code>ElicitSlot</code> – Amazon Lex is expecting the value of a slot for
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
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to
     * fullfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conveys that the conversation with the user failed.
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
     * @param dialogState
     *            <p>
     *            Identifies the current state of the user interaction. Amazon
     *            Lex returns one of the following values as
     *            <code>dialogState</code>. The client can optionally use this
     *            information to customize the user interface.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <p>
     *            For example, a user might utter an intent (
     *            "I want to order a pizza"). If Amazon Lex cannot infer the
     *            user intent from this utterance, it will return this dialog
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a "yes"
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
     *            <code>ElicitSlot</code> – Amazon Lex is expecting the value of
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
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to fullfill the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conveys that the conversation with the
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
     * @return
     *         <p>
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
     * @param slotToElicit
     *            <p>
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
     * @param slotToElicit
     *            <p>
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
     * Transcript of the voice input to the operation.
     * </p>
     *
     * @return
     *         <p>
     *         Transcript of the voice input to the operation.
     *         </p>
     */
    public String getInputTranscript() {
        return inputTranscript;
    }

    /**
     * <p>
     * Transcript of the voice input to the operation.
     * </p>
     *
     * @param inputTranscript
     *            <p>
     *            Transcript of the voice input to the operation.
     *            </p>
     */
    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    /**
     * <p>
     * Transcript of the voice input to the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputTranscript
     *            <p>
     *            Transcript of the voice input to the operation.
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
     * @return
     *         <p>
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
     * @param audioStream
     *            <p>
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
     * @param audioStream
     *            <p>
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
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContentType() != null) {
            sb.append("contentType: " + getContentType() + ",");
        }
        if (getIntentName() != null) {
            sb.append("intentName: " + getIntentName() + ",");
        }
        if (getSlots() != null) {
            sb.append("slots: " + getSlots() + ",");
        }
        if (getSessionAttributes() != null) {
            sb.append("sessionAttributes: " + getSessionAttributes() + ",");
        }
        if (getMessage() != null) {
            sb.append("message: " + getMessage() + ",");
        }
        if (getDialogState() != null) {
            sb.append("dialogState: " + getDialogState() + ",");
        }
        if (getSlotToElicit() != null) {
            sb.append("slotToElicit: " + getSlotToElicit() + ",");
        }
        if (getInputTranscript() != null) {
            sb.append("inputTranscript: " + getInputTranscript() + ",");
        }
        if (getAudioStream() != null) {
            sb.append("audioStream: " + getAudioStream());
        }
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
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof PostContentResult == false) {
            return false;
        }
        final PostContentResult other = (PostContentResult) obj;

        if (other.getContentType() == null ^ this.getContentType() == null) {
            return false;
        }
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false) {
            return false;
        }
        if (other.getIntentName() == null ^ this.getIntentName() == null) {
            return false;
        }
        if (other.getIntentName() != null
                && other.getIntentName().equals(this.getIntentName()) == false) {
            return false;
        }
        if (other.getSlots() == null ^ this.getSlots() == null) {
            return false;
        }
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false) {
            return false;
        }
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null) {
            return false;
        }
        if (other.getSessionAttributes() != null
                && other.getSessionAttributes().equals(this.getSessionAttributes()) == false) {
            return false;
        }
        if (other.getMessage() == null ^ this.getMessage() == null) {
            return false;
        }
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) {
            return false;
        }
        if (other.getDialogState() == null ^ this.getDialogState() == null) {
            return false;
        }
        if (other.getDialogState() != null
                && other.getDialogState().equals(this.getDialogState()) == false) {
            return false;
        }
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null) {
            return false;
        }
        if (other.getSlotToElicit() != null
                && other.getSlotToElicit().equals(this.getSlotToElicit()) == false) {
            return false;
        }
        if (other.getInputTranscript() == null ^ this.getInputTranscript() == null) {
            return false;
        }
        if (other.getInputTranscript() != null
                && other.getInputTranscript().equals(this.getInputTranscript()) == false) {
            return false;
        }
        if (other.getAudioStream() == null ^ this.getAudioStream() == null) {
            return false;
        }
        if (other.getAudioStream() != null
                && other.getAudioStream().equals(this.getAudioStream()) == false) {
            return false;
        }
        return true;
    }
}
