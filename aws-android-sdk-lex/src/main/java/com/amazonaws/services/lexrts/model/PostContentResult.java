/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Name of the intent.
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
     * JSON serialized and then base64-encoded map of key value pairs
     * representing the session specific context information.
     * </p>
     */
    private Map<String, String> sessionAttributes;

    /**
     * <p>
     * Based on the build-time application configuration, Amazon Lex determines
     * the prompt (or statement) to convey to the user. If your application uses
     * a Lambda function, then it can determine what prompt (or statement) to
     * convey to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String message;

    /**
     * <p>
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Suppose Amazon Lex did not understand the first utterances. For example,
     * "I want to order pizza" (indicating OrderPizza intent). If Amazon Lex
     * doesn't understand the user's input to determine the intent, the service
     * returns this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose the intent is configured with a follow up prompt. For example,
     * after the OrderPizza intent is fulfilled, the intent might have a follow
     * up prompt such as "Do you want to order a drink or desert?" In this case,
     * Amazon Lex returns this dialog state.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response
     * from the user indicating whether to go ahead and fulfill the intent (for
     * example, OK to go ahead and order the pizza).
     * </p>
     * <note>
     * <p>
     * In addition to yes/no reply, user might provide respond with additional
     * slot information. It can be a new slot information or change in existing
     * slot value. For example, the user might reply with
     * "Yes, but change the crust to thick crust." Amazon Lex can understand the
     * additional information and update the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application
     * might prompt for confirmation such as "OK to place this pizza order?" A
     * user might reply with "No, I want to order a drink." In this case, Amazon
     * Lex recognizes the new OrderDrink intent.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for
     * the current intent. Suppose Amazon Lex asks
     * "What size pizza would you like?" A user might reply with "Medium" or
     * "Medium pepperoni pizza". Amazon Lex recognizes the size and the topping
     * as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent. If Lambda function returns a
     * statement/message to convey the fulfillment result, Amazon Lex passes
     * this string to the client. If not, Amazon Lex looks for
     * <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the
     * <code>conclusionStatement</code> are missing, Amazon Lex throws a bad
     * request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to do the
     * fulfillment work for the intent (this is the case when the current intent
     * has the <code>fulfillmentActivity </code> configured as
     * <code>ReturnIntent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the
     * reasons for this dialog state are: the user did not provide appropriate
     * response after the preconfigured number of attempts, or the Lambda
     * function failed to fulfill an intent.
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
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, this
     * returns the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     */
    private String slotToElicit;

    /**
     * <p>
     * Prompt (or statement) to convey to the user. This is based on the
     * application configuration and context. For example, if Amazon Lex did not
     * understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. If the intent requires confirmation
     * before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Here is another example, suppose the
     * Lambda function successfully fulfilled the intent, and sent a message to
     * convey to the user. Then Amazon Lex sends that message in the response.
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
     * Name of the intent.
     * </p>
     *
     * @return <p>
     *         Name of the intent.
     *         </p>
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * <p>
     * Name of the intent.
     * </p>
     *
     * @param intentName <p>
     *            Name of the intent.
     *            </p>
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * Name of the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intentName <p>
     *            Name of the intent.
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
     * JSON serialized and then base64-encoded map of key value pairs
     * representing the session specific context information.
     * </p>
     *
     * @return <p>
     *         JSON serialized and then base64-encoded map of key value pairs
     *         representing the session specific context information.
     *         </p>
     */
    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * JSON serialized and then base64-encoded map of key value pairs
     * representing the session specific context information.
     * </p>
     *
     * @param sessionAttributes <p>
     *            JSON serialized and then base64-encoded map of key value pairs
     *            representing the session specific context information.
     *            </p>
     */
    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * JSON serialized and then base64-encoded map of key value pairs
     * representing the session specific context information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            JSON serialized and then base64-encoded map of key value pairs
     *            representing the session specific context information.
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
     * Based on the build-time application configuration, Amazon Lex determines
     * the prompt (or statement) to convey to the user. If your application uses
     * a Lambda function, then it can determine what prompt (or statement) to
     * convey to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Based on the build-time application configuration, Amazon Lex
     *         determines the prompt (or statement) to convey to the user. If
     *         your application uses a Lambda function, then it can determine
     *         what prompt (or statement) to convey to the user.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Based on the build-time application configuration, Amazon Lex determines
     * the prompt (or statement) to convey to the user. If your application uses
     * a Lambda function, then it can determine what prompt (or statement) to
     * convey to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            Based on the build-time application configuration, Amazon Lex
     *            determines the prompt (or statement) to convey to the user. If
     *            your application uses a Lambda function, then it can determine
     *            what prompt (or statement) to convey to the user.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Based on the build-time application configuration, Amazon Lex determines
     * the prompt (or statement) to convey to the user. If your application uses
     * a Lambda function, then it can determine what prompt (or statement) to
     * convey to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            Based on the build-time application configuration, Amazon Lex
     *            determines the prompt (or statement) to convey to the user. If
     *            your application uses a Lambda function, then it can determine
     *            what prompt (or statement) to convey to the user.
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
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Suppose Amazon Lex did not understand the first utterances. For example,
     * "I want to order pizza" (indicating OrderPizza intent). If Amazon Lex
     * doesn't understand the user's input to determine the intent, the service
     * returns this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose the intent is configured with a follow up prompt. For example,
     * after the OrderPizza intent is fulfilled, the intent might have a follow
     * up prompt such as "Do you want to order a drink or desert?" In this case,
     * Amazon Lex returns this dialog state.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response
     * from the user indicating whether to go ahead and fulfill the intent (for
     * example, OK to go ahead and order the pizza).
     * </p>
     * <note>
     * <p>
     * In addition to yes/no reply, user might provide respond with additional
     * slot information. It can be a new slot information or change in existing
     * slot value. For example, the user might reply with
     * "Yes, but change the crust to thick crust." Amazon Lex can understand the
     * additional information and update the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application
     * might prompt for confirmation such as "OK to place this pizza order?" A
     * user might reply with "No, I want to order a drink." In this case, Amazon
     * Lex recognizes the new OrderDrink intent.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for
     * the current intent. Suppose Amazon Lex asks
     * "What size pizza would you like?" A user might reply with "Medium" or
     * "Medium pepperoni pizza". Amazon Lex recognizes the size and the topping
     * as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent. If Lambda function returns a
     * statement/message to convey the fulfillment result, Amazon Lex passes
     * this string to the client. If not, Amazon Lex looks for
     * <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the
     * <code>conclusionStatement</code> are missing, Amazon Lex throws a bad
     * request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to do the
     * fulfillment work for the intent (this is the case when the current intent
     * has the <code>fulfillmentActivity </code> configured as
     * <code>ReturnIntent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the
     * reasons for this dialog state are: the user did not provide appropriate
     * response after the preconfigured number of attempts, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @return <p>
     *         Represents the message type to be conveyed to the user. For
     *         example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's
     *         intent. Consider the following examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Suppose Amazon Lex did not understand the first utterances. For
     *         example, "I want to order pizza" (indicating OrderPizza intent).
     *         If Amazon Lex doesn't understand the user's input to determine
     *         the intent, the service returns this dialog state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Suppose the intent is configured with a follow up prompt. For
     *         example, after the OrderPizza intent is fulfilled, the intent
     *         might have a follow up prompt such as
     *         "Do you want to order a drink or desert?" In this case, Amazon
     *         Lex returns this dialog state.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no
     *         response from the user indicating whether to go ahead and fulfill
     *         the intent (for example, OK to go ahead and order the pizza).
     *         </p>
     *         <note>
     *         <p>
     *         In addition to yes/no reply, user might provide respond with
     *         additional slot information. It can be a new slot information or
     *         change in existing slot value. For example, the user might reply
     *         with "Yes, but change the crust to thick crust." Amazon Lex can
     *         understand the additional information and update the intent slots
     *         accordingly.
     *         </p>
     *         <p>
     *         Consider another example. Before fulfilling an order, your
     *         application might prompt for confirmation such as
     *         "OK to place this pizza order?" A user might reply with
     *         "No, I want to order a drink." In this case, Amazon Lex
     *         recognizes the new OrderDrink intent.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> – Amazon Lex is expecting a value of a
     *         slot for the current intent. Suppose Amazon Lex asks
     *         "What size pizza would you like?" A user might reply with
     *         "Medium" or "Medium pepperoni pizza". Amazon Lex recognizes the
     *         size and the topping as the two separate slot values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fulfilled</code> – Conveys that the Lambda function has
     *         successfully fulfilled the intent. If Lambda function returns a
     *         statement/message to convey the fulfillment result, Amazon Lex
     *         passes this string to the client. If not, Amazon Lex looks for
     *         <code>conclusionStatement</code> that you configured for the
     *         intent.
     *         </p>
     *         <p>
     *         If both the Lambda function statement and the
     *         <code>conclusionStatement</code> are missing, Amazon Lex throws a
     *         bad request exception.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> – Conveys that the client has to
     *         do the fulfillment work for the intent (this is the case when the
     *         current intent has the <code>fulfillmentActivity </code>
     *         configured as <code>ReturnIntent</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> – Conversation with the user failed. Some of
     *         the reasons for this dialog state are: the user did not provide
     *         appropriate response after the preconfigured number of attempts,
     *         or the Lambda function failed to fulfill an intent.
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
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Suppose Amazon Lex did not understand the first utterances. For example,
     * "I want to order pizza" (indicating OrderPizza intent). If Amazon Lex
     * doesn't understand the user's input to determine the intent, the service
     * returns this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose the intent is configured with a follow up prompt. For example,
     * after the OrderPizza intent is fulfilled, the intent might have a follow
     * up prompt such as "Do you want to order a drink or desert?" In this case,
     * Amazon Lex returns this dialog state.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response
     * from the user indicating whether to go ahead and fulfill the intent (for
     * example, OK to go ahead and order the pizza).
     * </p>
     * <note>
     * <p>
     * In addition to yes/no reply, user might provide respond with additional
     * slot information. It can be a new slot information or change in existing
     * slot value. For example, the user might reply with
     * "Yes, but change the crust to thick crust." Amazon Lex can understand the
     * additional information and update the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application
     * might prompt for confirmation such as "OK to place this pizza order?" A
     * user might reply with "No, I want to order a drink." In this case, Amazon
     * Lex recognizes the new OrderDrink intent.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for
     * the current intent. Suppose Amazon Lex asks
     * "What size pizza would you like?" A user might reply with "Medium" or
     * "Medium pepperoni pizza". Amazon Lex recognizes the size and the topping
     * as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent. If Lambda function returns a
     * statement/message to convey the fulfillment result, Amazon Lex passes
     * this string to the client. If not, Amazon Lex looks for
     * <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the
     * <code>conclusionStatement</code> are missing, Amazon Lex throws a bad
     * request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to do the
     * fulfillment work for the intent (this is the case when the current intent
     * has the <code>fulfillmentActivity </code> configured as
     * <code>ReturnIntent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the
     * reasons for this dialog state are: the user did not provide appropriate
     * response after the preconfigured number of attempts, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p>
     *            Represents the message type to be conveyed to the user. For
     *            example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Suppose Amazon Lex did not understand the first utterances.
     *            For example, "I want to order pizza" (indicating OrderPizza
     *            intent). If Amazon Lex doesn't understand the user's input to
     *            determine the intent, the service returns this dialog state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Suppose the intent is configured with a follow up prompt. For
     *            example, after the OrderPizza intent is fulfilled, the intent
     *            might have a follow up prompt such as
     *            "Do you want to order a drink or desert?" In this case, Amazon
     *            Lex returns this dialog state.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no
     *            response from the user indicating whether to go ahead and
     *            fulfill the intent (for example, OK to go ahead and order the
     *            pizza).
     *            </p>
     *            <note>
     *            <p>
     *            In addition to yes/no reply, user might provide respond with
     *            additional slot information. It can be a new slot information
     *            or change in existing slot value. For example, the user might
     *            reply with "Yes, but change the crust to thick crust." Amazon
     *            Lex can understand the additional information and update the
     *            intent slots accordingly.
     *            </p>
     *            <p>
     *            Consider another example. Before fulfilling an order, your
     *            application might prompt for confirmation such as
     *            "OK to place this pizza order?" A user might reply with
     *            "No, I want to order a drink." In this case, Amazon Lex
     *            recognizes the new OrderDrink intent.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> – Amazon Lex is expecting a value of a
     *            slot for the current intent. Suppose Amazon Lex asks
     *            "What size pizza would you like?" A user might reply with
     *            "Medium" or "Medium pepperoni pizza". Amazon Lex recognizes
     *            the size and the topping as the two separate slot values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent. If Lambda function returns
     *            a statement/message to convey the fulfillment result, Amazon
     *            Lex passes this string to the client. If not, Amazon Lex looks
     *            for <code>conclusionStatement</code> that you configured for
     *            the intent.
     *            </p>
     *            <p>
     *            If both the Lambda function statement and the
     *            <code>conclusionStatement</code> are missing, Amazon Lex
     *            throws a bad request exception.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to do the fulfillment work for the intent (this is the case
     *            when the current intent has the
     *            <code>fulfillmentActivity </code> configured as
     *            <code>ReturnIntent</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conversation with the user failed. Some
     *            of the reasons for this dialog state are: the user did not
     *            provide appropriate response after the preconfigured number of
     *            attempts, or the Lambda function failed to fulfill an intent.
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
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Suppose Amazon Lex did not understand the first utterances. For example,
     * "I want to order pizza" (indicating OrderPizza intent). If Amazon Lex
     * doesn't understand the user's input to determine the intent, the service
     * returns this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose the intent is configured with a follow up prompt. For example,
     * after the OrderPizza intent is fulfilled, the intent might have a follow
     * up prompt such as "Do you want to order a drink or desert?" In this case,
     * Amazon Lex returns this dialog state.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response
     * from the user indicating whether to go ahead and fulfill the intent (for
     * example, OK to go ahead and order the pizza).
     * </p>
     * <note>
     * <p>
     * In addition to yes/no reply, user might provide respond with additional
     * slot information. It can be a new slot information or change in existing
     * slot value. For example, the user might reply with
     * "Yes, but change the crust to thick crust." Amazon Lex can understand the
     * additional information and update the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application
     * might prompt for confirmation such as "OK to place this pizza order?" A
     * user might reply with "No, I want to order a drink." In this case, Amazon
     * Lex recognizes the new OrderDrink intent.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for
     * the current intent. Suppose Amazon Lex asks
     * "What size pizza would you like?" A user might reply with "Medium" or
     * "Medium pepperoni pizza". Amazon Lex recognizes the size and the topping
     * as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent. If Lambda function returns a
     * statement/message to convey the fulfillment result, Amazon Lex passes
     * this string to the client. If not, Amazon Lex looks for
     * <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the
     * <code>conclusionStatement</code> are missing, Amazon Lex throws a bad
     * request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to do the
     * fulfillment work for the intent (this is the case when the current intent
     * has the <code>fulfillmentActivity </code> configured as
     * <code>ReturnIntent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the
     * reasons for this dialog state are: the user did not provide appropriate
     * response after the preconfigured number of attempts, or the Lambda
     * function failed to fulfill an intent.
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
     *            Represents the message type to be conveyed to the user. For
     *            example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Suppose Amazon Lex did not understand the first utterances.
     *            For example, "I want to order pizza" (indicating OrderPizza
     *            intent). If Amazon Lex doesn't understand the user's input to
     *            determine the intent, the service returns this dialog state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Suppose the intent is configured with a follow up prompt. For
     *            example, after the OrderPizza intent is fulfilled, the intent
     *            might have a follow up prompt such as
     *            "Do you want to order a drink or desert?" In this case, Amazon
     *            Lex returns this dialog state.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no
     *            response from the user indicating whether to go ahead and
     *            fulfill the intent (for example, OK to go ahead and order the
     *            pizza).
     *            </p>
     *            <note>
     *            <p>
     *            In addition to yes/no reply, user might provide respond with
     *            additional slot information. It can be a new slot information
     *            or change in existing slot value. For example, the user might
     *            reply with "Yes, but change the crust to thick crust." Amazon
     *            Lex can understand the additional information and update the
     *            intent slots accordingly.
     *            </p>
     *            <p>
     *            Consider another example. Before fulfilling an order, your
     *            application might prompt for confirmation such as
     *            "OK to place this pizza order?" A user might reply with
     *            "No, I want to order a drink." In this case, Amazon Lex
     *            recognizes the new OrderDrink intent.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> – Amazon Lex is expecting a value of a
     *            slot for the current intent. Suppose Amazon Lex asks
     *            "What size pizza would you like?" A user might reply with
     *            "Medium" or "Medium pepperoni pizza". Amazon Lex recognizes
     *            the size and the topping as the two separate slot values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent. If Lambda function returns
     *            a statement/message to convey the fulfillment result, Amazon
     *            Lex passes this string to the client. If not, Amazon Lex looks
     *            for <code>conclusionStatement</code> that you configured for
     *            the intent.
     *            </p>
     *            <p>
     *            If both the Lambda function statement and the
     *            <code>conclusionStatement</code> are missing, Amazon Lex
     *            throws a bad request exception.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to do the fulfillment work for the intent (this is the case
     *            when the current intent has the
     *            <code>fulfillmentActivity </code> configured as
     *            <code>ReturnIntent</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conversation with the user failed. Some
     *            of the reasons for this dialog state are: the user did not
     *            provide appropriate response after the preconfigured number of
     *            attempts, or the Lambda function failed to fulfill an intent.
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
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Suppose Amazon Lex did not understand the first utterances. For example,
     * "I want to order pizza" (indicating OrderPizza intent). If Amazon Lex
     * doesn't understand the user's input to determine the intent, the service
     * returns this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose the intent is configured with a follow up prompt. For example,
     * after the OrderPizza intent is fulfilled, the intent might have a follow
     * up prompt such as "Do you want to order a drink or desert?" In this case,
     * Amazon Lex returns this dialog state.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response
     * from the user indicating whether to go ahead and fulfill the intent (for
     * example, OK to go ahead and order the pizza).
     * </p>
     * <note>
     * <p>
     * In addition to yes/no reply, user might provide respond with additional
     * slot information. It can be a new slot information or change in existing
     * slot value. For example, the user might reply with
     * "Yes, but change the crust to thick crust." Amazon Lex can understand the
     * additional information and update the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application
     * might prompt for confirmation such as "OK to place this pizza order?" A
     * user might reply with "No, I want to order a drink." In this case, Amazon
     * Lex recognizes the new OrderDrink intent.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for
     * the current intent. Suppose Amazon Lex asks
     * "What size pizza would you like?" A user might reply with "Medium" or
     * "Medium pepperoni pizza". Amazon Lex recognizes the size and the topping
     * as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent. If Lambda function returns a
     * statement/message to convey the fulfillment result, Amazon Lex passes
     * this string to the client. If not, Amazon Lex looks for
     * <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the
     * <code>conclusionStatement</code> are missing, Amazon Lex throws a bad
     * request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to do the
     * fulfillment work for the intent (this is the case when the current intent
     * has the <code>fulfillmentActivity </code> configured as
     * <code>ReturnIntent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the
     * reasons for this dialog state are: the user did not provide appropriate
     * response after the preconfigured number of attempts, or the Lambda
     * function failed to fulfill an intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p>
     *            Represents the message type to be conveyed to the user. For
     *            example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Suppose Amazon Lex did not understand the first utterances.
     *            For example, "I want to order pizza" (indicating OrderPizza
     *            intent). If Amazon Lex doesn't understand the user's input to
     *            determine the intent, the service returns this dialog state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Suppose the intent is configured with a follow up prompt. For
     *            example, after the OrderPizza intent is fulfilled, the intent
     *            might have a follow up prompt such as
     *            "Do you want to order a drink or desert?" In this case, Amazon
     *            Lex returns this dialog state.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no
     *            response from the user indicating whether to go ahead and
     *            fulfill the intent (for example, OK to go ahead and order the
     *            pizza).
     *            </p>
     *            <note>
     *            <p>
     *            In addition to yes/no reply, user might provide respond with
     *            additional slot information. It can be a new slot information
     *            or change in existing slot value. For example, the user might
     *            reply with "Yes, but change the crust to thick crust." Amazon
     *            Lex can understand the additional information and update the
     *            intent slots accordingly.
     *            </p>
     *            <p>
     *            Consider another example. Before fulfilling an order, your
     *            application might prompt for confirmation such as
     *            "OK to place this pizza order?" A user might reply with
     *            "No, I want to order a drink." In this case, Amazon Lex
     *            recognizes the new OrderDrink intent.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> – Amazon Lex is expecting a value of a
     *            slot for the current intent. Suppose Amazon Lex asks
     *            "What size pizza would you like?" A user might reply with
     *            "Medium" or "Medium pepperoni pizza". Amazon Lex recognizes
     *            the size and the topping as the two separate slot values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent. If Lambda function returns
     *            a statement/message to convey the fulfillment result, Amazon
     *            Lex passes this string to the client. If not, Amazon Lex looks
     *            for <code>conclusionStatement</code> that you configured for
     *            the intent.
     *            </p>
     *            <p>
     *            If both the Lambda function statement and the
     *            <code>conclusionStatement</code> are missing, Amazon Lex
     *            throws a bad request exception.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to do the fulfillment work for the intent (this is the case
     *            when the current intent has the
     *            <code>fulfillmentActivity </code> configured as
     *            <code>ReturnIntent</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conversation with the user failed. Some
     *            of the reasons for this dialog state are: the user did not
     *            provide appropriate response after the preconfigured number of
     *            attempts, or the Lambda function failed to fulfill an intent.
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
     * Represents the message type to be conveyed to the user. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ElicitIntent</code> – Amazon Lex wants to elicit the user's intent.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Suppose Amazon Lex did not understand the first utterances. For example,
     * "I want to order pizza" (indicating OrderPizza intent). If Amazon Lex
     * doesn't understand the user's input to determine the intent, the service
     * returns this dialog state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose the intent is configured with a follow up prompt. For example,
     * after the OrderPizza intent is fulfilled, the intent might have a follow
     * up prompt such as "Do you want to order a drink or desert?" In this case,
     * Amazon Lex returns this dialog state.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no response
     * from the user indicating whether to go ahead and fulfill the intent (for
     * example, OK to go ahead and order the pizza).
     * </p>
     * <note>
     * <p>
     * In addition to yes/no reply, user might provide respond with additional
     * slot information. It can be a new slot information or change in existing
     * slot value. For example, the user might reply with
     * "Yes, but change the crust to thick crust." Amazon Lex can understand the
     * additional information and update the intent slots accordingly.
     * </p>
     * <p>
     * Consider another example. Before fulfilling an order, your application
     * might prompt for confirmation such as "OK to place this pizza order?" A
     * user might reply with "No, I want to order a drink." In this case, Amazon
     * Lex recognizes the new OrderDrink intent.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> – Amazon Lex is expecting a value of a slot for
     * the current intent. Suppose Amazon Lex asks
     * "What size pizza would you like?" A user might reply with "Medium" or
     * "Medium pepperoni pizza". Amazon Lex recognizes the size and the topping
     * as the two separate slot values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> – Conveys that the Lambda function has
     * successfully fulfilled the intent. If Lambda function returns a
     * statement/message to convey the fulfillment result, Amazon Lex passes
     * this string to the client. If not, Amazon Lex looks for
     * <code>conclusionStatement</code> that you configured for the intent.
     * </p>
     * <p>
     * If both the Lambda function statement and the
     * <code>conclusionStatement</code> are missing, Amazon Lex throws a bad
     * request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> – Conveys that the client has to do the
     * fulfillment work for the intent (this is the case when the current intent
     * has the <code>fulfillmentActivity </code> configured as
     * <code>ReturnIntent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Conversation with the user failed. Some of the
     * reasons for this dialog state are: the user did not provide appropriate
     * response after the preconfigured number of attempts, or the Lambda
     * function failed to fulfill an intent.
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
     *            Represents the message type to be conveyed to the user. For
     *            example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> – Amazon Lex wants to elicit the
     *            user's intent. Consider the following examples:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Suppose Amazon Lex did not understand the first utterances.
     *            For example, "I want to order pizza" (indicating OrderPizza
     *            intent). If Amazon Lex doesn't understand the user's input to
     *            determine the intent, the service returns this dialog state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Suppose the intent is configured with a follow up prompt. For
     *            example, after the OrderPizza intent is fulfilled, the intent
     *            might have a follow up prompt such as
     *            "Do you want to order a drink or desert?" In this case, Amazon
     *            Lex returns this dialog state.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> – Amazon Lex is expecting a yes/no
     *            response from the user indicating whether to go ahead and
     *            fulfill the intent (for example, OK to go ahead and order the
     *            pizza).
     *            </p>
     *            <note>
     *            <p>
     *            In addition to yes/no reply, user might provide respond with
     *            additional slot information. It can be a new slot information
     *            or change in existing slot value. For example, the user might
     *            reply with "Yes, but change the crust to thick crust." Amazon
     *            Lex can understand the additional information and update the
     *            intent slots accordingly.
     *            </p>
     *            <p>
     *            Consider another example. Before fulfilling an order, your
     *            application might prompt for confirmation such as
     *            "OK to place this pizza order?" A user might reply with
     *            "No, I want to order a drink." In this case, Amazon Lex
     *            recognizes the new OrderDrink intent.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> – Amazon Lex is expecting a value of a
     *            slot for the current intent. Suppose Amazon Lex asks
     *            "What size pizza would you like?" A user might reply with
     *            "Medium" or "Medium pepperoni pizza". Amazon Lex recognizes
     *            the size and the topping as the two separate slot values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> – Conveys that the Lambda function has
     *            successfully fulfilled the intent. If Lambda function returns
     *            a statement/message to convey the fulfillment result, Amazon
     *            Lex passes this string to the client. If not, Amazon Lex looks
     *            for <code>conclusionStatement</code> that you configured for
     *            the intent.
     *            </p>
     *            <p>
     *            If both the Lambda function statement and the
     *            <code>conclusionStatement</code> are missing, Amazon Lex
     *            throws a bad request exception.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> – Conveys that the client has
     *            to do the fulfillment work for the intent (this is the case
     *            when the current intent has the
     *            <code>fulfillmentActivity </code> configured as
     *            <code>ReturnIntent</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> – Conversation with the user failed. Some
     *            of the reasons for this dialog state are: the user did not
     *            provide appropriate response after the preconfigured number of
     *            attempts, or the Lambda function failed to fulfill an intent.
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
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, this
     * returns the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     *
     * @return <p>
     *         If <code>dialogState</code> value is <code>ElicitSlot</code>,
     *         this returns the name of the slot for which Amazon Lex is
     *         eliciting a value.
     *         </p>
     */
    public String getSlotToElicit() {
        return slotToElicit;
    }

    /**
     * <p>
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, this
     * returns the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     *
     * @param slotToElicit <p>
     *            If <code>dialogState</code> value is <code>ElicitSlot</code>,
     *            this returns the name of the slot for which Amazon Lex is
     *            eliciting a value.
     *            </p>
     */
    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * If <code>dialogState</code> value is <code>ElicitSlot</code>, this
     * returns the name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotToElicit <p>
     *            If <code>dialogState</code> value is <code>ElicitSlot</code>,
     *            this returns the name of the slot for which Amazon Lex is
     *            eliciting a value.
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
     * Prompt (or statement) to convey to the user. This is based on the
     * application configuration and context. For example, if Amazon Lex did not
     * understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. If the intent requires confirmation
     * before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Here is another example, suppose the
     * Lambda function successfully fulfilled the intent, and sent a message to
     * convey to the user. Then Amazon Lex sends that message in the response.
     * </p>
     *
     * @return <p>
     *         Prompt (or statement) to convey to the user. This is based on the
     *         application configuration and context. For example, if Amazon Lex
     *         did not understand the user intent, it sends the
     *         <code>clarificationPrompt</code> configured for the application.
     *         If the intent requires confirmation before taking the fulfillment
     *         action, it sends the <code>confirmationPrompt</code>. Here is
     *         another example, suppose the Lambda function successfully
     *         fulfilled the intent, and sent a message to convey to the user.
     *         Then Amazon Lex sends that message in the response.
     *         </p>
     */
    public java.io.InputStream getAudioStream() {
        return audioStream;
    }

    /**
     * <p>
     * Prompt (or statement) to convey to the user. This is based on the
     * application configuration and context. For example, if Amazon Lex did not
     * understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. If the intent requires confirmation
     * before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Here is another example, suppose the
     * Lambda function successfully fulfilled the intent, and sent a message to
     * convey to the user. Then Amazon Lex sends that message in the response.
     * </p>
     *
     * @param audioStream <p>
     *            Prompt (or statement) to convey to the user. This is based on
     *            the application configuration and context. For example, if
     *            Amazon Lex did not understand the user intent, it sends the
     *            <code>clarificationPrompt</code> configured for the
     *            application. If the intent requires confirmation before taking
     *            the fulfillment action, it sends the
     *            <code>confirmationPrompt</code>. Here is another example,
     *            suppose the Lambda function successfully fulfilled the intent,
     *            and sent a message to convey to the user. Then Amazon Lex
     *            sends that message in the response.
     *            </p>
     */
    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * Prompt (or statement) to convey to the user. This is based on the
     * application configuration and context. For example, if Amazon Lex did not
     * understand the user intent, it sends the <code>clarificationPrompt</code>
     * configured for the application. If the intent requires confirmation
     * before taking the fulfillment action, it sends the
     * <code>confirmationPrompt</code>. Here is another example, suppose the
     * Lambda function successfully fulfilled the intent, and sent a message to
     * convey to the user. Then Amazon Lex sends that message in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioStream <p>
     *            Prompt (or statement) to convey to the user. This is based on
     *            the application configuration and context. For example, if
     *            Amazon Lex did not understand the user intent, it sends the
     *            <code>clarificationPrompt</code> configured for the
     *            application. If the intent requires confirmation before taking
     *            the fulfillment action, it sends the
     *            <code>confirmationPrompt</code>. Here is another example,
     *            suppose the Lambda function successfully fulfilled the intent,
     *            and sent a message to convey to the user. Then Amazon Lex
     *            sends that message in the response.
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
