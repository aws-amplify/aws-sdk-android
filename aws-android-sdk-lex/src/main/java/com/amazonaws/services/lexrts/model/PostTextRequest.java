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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends user input text to Amazon Lex at runtime. Amazon Lex uses the machine
 * learning model that the service built for the application to interpret user
 * input.
 * </p>
 * <p>
 * In response, Amazon Lex returns the next message to convey to the user (based
 * on the context of the user interaction) and whether to expect a user response
 * to the message (<code>dialogState</code>). For example, consider the
 * following response messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * "What pizza toppings would you like?" – In this case, the
 * <code>dialogState</code> would be <code>ElicitSlot</code> (that is, a user
 * response is expected).
 * </p>
 * </li>
 * <li>
 * <p>
 * "Your order has been placed." – In this case, Amazon Lex returns one of the
 * following <code>dialogState</code> values depending on how the intent
 * fulfillment is configured (see <code>fulfillmentActivity</code> in
 * <code>CreateIntent</code>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>FulFilled</code> – The intent fulfillment is configured through a
 * Lambda function.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ReadyForFulfilment</code> – The intent's
 * <code>fulfillmentActivity</code> is to simply return the intent data back to
 * the client application.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
public class PostTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     */
    private String botName;

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     */
    private String botAlias;

    /**
     * <p>
     * User ID of your client application. Typically, each of your application
     * users should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one mobile device and
     * continue the conversation on another device, you might choose a
     * user-specific identifier, such as a login or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose a
     * device-specific identifier, such as device ID, or some globally unique
     * identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     */
    private String userId;

    /**
     * <p>
     * A session represents the dialog between a user and Amazon Lex. At
     * runtime, a client application can pass contextual information (session
     * attributes) in the request. For example, <code>"FirstName" : "Joe"</code>
     * . Amazon Lex passes these session attributes to the AWS Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * </p>
     * <p>
     * In your Lambda function, you can use the session attributes for
     * customization. Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you can pass user location as a
     * session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), your Lambda function might
     * use this information to determine the closest pizzeria to place the
     * order.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use session attributes to personalize prompts. For example, you pass in
     * user name as a session attribute (<code>"FirstName" : "Joe"</code>), you
     * might configure subsequent prompts to refer to this attribute, as
     * <code>$session.FirstName"</code>. At runtime, Amazon Lex substitutes a
     * real value when it generates a prompt, such as
     * "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If the intent is configured without a Lambda function to process the
     * intent (that is, the client application to process the intent), Amazon
     * Lex simply returns the session attributes back to the client application.
     * </p>
     * <p>
     * If the intent is configured with a Lambda function to process the intent,
     * Amazon Lex passes the incoming session attributes to the Lambda function.
     * The Lambda function must return these session attributes if you want
     * Amazon Lex to return them back to the client.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> sessionAttributes;

    /**
     * <p>
     * Text user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String inputText;

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     *
     * @return <p>
     *         Name of the Amazon Lex bot.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     *
     * @param botName <p>
     *            Name of the Amazon Lex bot.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botName <p>
     *            Name of the Amazon Lex bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     *
     * @return <p>
     *         Alias of the Amazon Lex bot.
     *         </p>
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     *
     * @param botAlias <p>
     *            Alias of the Amazon Lex bot.
     *            </p>
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botAlias <p>
     *            Alias of the Amazon Lex bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextRequest withBotAlias(String botAlias) {
        this.botAlias = botAlias;
        return this;
    }

    /**
     * <p>
     * User ID of your client application. Typically, each of your application
     * users should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one mobile device and
     * continue the conversation on another device, you might choose a
     * user-specific identifier, such as a login or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose a
     * device-specific identifier, such as device ID, or some globally unique
     * identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @return <p>
     *         User ID of your client application. Typically, each of your
     *         application users should have a unique ID. Note the following
     *         considerations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you want a user to start a conversation on one mobile device
     *         and continue the conversation on another device, you might choose
     *         a user-specific identifier, such as a login or Amazon Cognito
     *         user ID (assuming your application is using Amazon Cognito).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want the same user to be able to have two independent
     *         conversations on two different devices, you might choose a
     *         device-specific identifier, such as device ID, or some globally
     *         unique identifier.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * User ID of your client application. Typically, each of your application
     * users should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one mobile device and
     * continue the conversation on another device, you might choose a
     * user-specific identifier, such as a login or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose a
     * device-specific identifier, such as device ID, or some globally unique
     * identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            User ID of your client application. Typically, each of your
     *            application users should have a unique ID. Note the following
     *            considerations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you want a user to start a conversation on one mobile
     *            device and continue the conversation on another device, you
     *            might choose a user-specific identifier, such as a login or
     *            Amazon Cognito user ID (assuming your application is using
     *            Amazon Cognito).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want the same user to be able to have two independent
     *            conversations on two different devices, you might choose a
     *            device-specific identifier, such as device ID, or some
     *            globally unique identifier.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * User ID of your client application. Typically, each of your application
     * users should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one mobile device and
     * continue the conversation on another device, you might choose a
     * user-specific identifier, such as a login or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose a
     * device-specific identifier, such as device ID, or some globally unique
     * identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            User ID of your client application. Typically, each of your
     *            application users should have a unique ID. Note the following
     *            considerations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you want a user to start a conversation on one mobile
     *            device and continue the conversation on another device, you
     *            might choose a user-specific identifier, such as a login or
     *            Amazon Cognito user ID (assuming your application is using
     *            Amazon Cognito).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want the same user to be able to have two independent
     *            conversations on two different devices, you might choose a
     *            device-specific identifier, such as device ID, or some
     *            globally unique identifier.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * A session represents the dialog between a user and Amazon Lex. At
     * runtime, a client application can pass contextual information (session
     * attributes) in the request. For example, <code>"FirstName" : "Joe"</code>
     * . Amazon Lex passes these session attributes to the AWS Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * </p>
     * <p>
     * In your Lambda function, you can use the session attributes for
     * customization. Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you can pass user location as a
     * session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), your Lambda function might
     * use this information to determine the closest pizzeria to place the
     * order.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use session attributes to personalize prompts. For example, you pass in
     * user name as a session attribute (<code>"FirstName" : "Joe"</code>), you
     * might configure subsequent prompts to refer to this attribute, as
     * <code>$session.FirstName"</code>. At runtime, Amazon Lex substitutes a
     * real value when it generates a prompt, such as
     * "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If the intent is configured without a Lambda function to process the
     * intent (that is, the client application to process the intent), Amazon
     * Lex simply returns the session attributes back to the client application.
     * </p>
     * <p>
     * If the intent is configured with a Lambda function to process the intent,
     * Amazon Lex passes the incoming session attributes to the Lambda function.
     * The Lambda function must return these session attributes if you want
     * Amazon Lex to return them back to the client.
     * </p>
     * </note>
     *
     * @return <p>
     *         A session represents the dialog between a user and Amazon Lex. At
     *         runtime, a client application can pass contextual information
     *         (session attributes) in the request. For example,
     *         <code>"FirstName" : "Joe"</code>. Amazon Lex passes these session
     *         attributes to the AWS Lambda functions configured for the intent
     *         (see <code>dialogCodeHook</code> and
     *         <code>fulfillmentActivity.codeHook</code> in
     *         <code>CreateIntent</code>).
     *         </p>
     *         <p>
     *         In your Lambda function, you can use the session attributes for
     *         customization. Some examples are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In a pizza ordering application, if you can pass user location as
     *         a session attribute (for example,
     *         <code>"Location" : "111 Maple street"</code>), your Lambda
     *         function might use this information to determine the closest
     *         pizzeria to place the order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use session attributes to personalize prompts. For example, you
     *         pass in user name as a session attribute (
     *         <code>"FirstName" : "Joe"</code>), you might configure subsequent
     *         prompts to refer to this attribute, as
     *         <code>$session.FirstName"</code>. At runtime, Amazon Lex
     *         substitutes a real value when it generates a prompt, such as
     *         "Hello Joe, what would you like to order?"
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Amazon Lex does not persist session attributes.
     *         </p>
     *         <p>
     *         If the intent is configured without a Lambda function to process
     *         the intent (that is, the client application to process the
     *         intent), Amazon Lex simply returns the session attributes back to
     *         the client application.
     *         </p>
     *         <p>
     *         If the intent is configured with a Lambda function to process the
     *         intent, Amazon Lex passes the incoming session attributes to the
     *         Lambda function. The Lambda function must return these session
     *         attributes if you want Amazon Lex to return them back to the
     *         client.
     *         </p>
     *         </note>
     */
    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * A session represents the dialog between a user and Amazon Lex. At
     * runtime, a client application can pass contextual information (session
     * attributes) in the request. For example, <code>"FirstName" : "Joe"</code>
     * . Amazon Lex passes these session attributes to the AWS Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * </p>
     * <p>
     * In your Lambda function, you can use the session attributes for
     * customization. Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you can pass user location as a
     * session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), your Lambda function might
     * use this information to determine the closest pizzeria to place the
     * order.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use session attributes to personalize prompts. For example, you pass in
     * user name as a session attribute (<code>"FirstName" : "Joe"</code>), you
     * might configure subsequent prompts to refer to this attribute, as
     * <code>$session.FirstName"</code>. At runtime, Amazon Lex substitutes a
     * real value when it generates a prompt, such as
     * "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If the intent is configured without a Lambda function to process the
     * intent (that is, the client application to process the intent), Amazon
     * Lex simply returns the session attributes back to the client application.
     * </p>
     * <p>
     * If the intent is configured with a Lambda function to process the intent,
     * Amazon Lex passes the incoming session attributes to the Lambda function.
     * The Lambda function must return these session attributes if you want
     * Amazon Lex to return them back to the client.
     * </p>
     * </note>
     *
     * @param sessionAttributes <p>
     *            A session represents the dialog between a user and Amazon Lex.
     *            At runtime, a client application can pass contextual
     *            information (session attributes) in the request. For example,
     *            <code>"FirstName" : "Joe"</code>. Amazon Lex passes these
     *            session attributes to the AWS Lambda functions configured for
     *            the intent (see <code>dialogCodeHook</code> and
     *            <code>fulfillmentActivity.codeHook</code> in
     *            <code>CreateIntent</code>).
     *            </p>
     *            <p>
     *            In your Lambda function, you can use the session attributes
     *            for customization. Some examples are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In a pizza ordering application, if you can pass user location
     *            as a session attribute (for example,
     *            <code>"Location" : "111 Maple street"</code>), your Lambda
     *            function might use this information to determine the closest
     *            pizzeria to place the order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use session attributes to personalize prompts. For example,
     *            you pass in user name as a session attribute (
     *            <code>"FirstName" : "Joe"</code>), you might configure
     *            subsequent prompts to refer to this attribute, as
     *            <code>$session.FirstName"</code>. At runtime, Amazon Lex
     *            substitutes a real value when it generates a prompt, such as
     *            "Hello Joe, what would you like to order?"
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Amazon Lex does not persist session attributes.
     *            </p>
     *            <p>
     *            If the intent is configured without a Lambda function to
     *            process the intent (that is, the client application to process
     *            the intent), Amazon Lex simply returns the session attributes
     *            back to the client application.
     *            </p>
     *            <p>
     *            If the intent is configured with a Lambda function to process
     *            the intent, Amazon Lex passes the incoming session attributes
     *            to the Lambda function. The Lambda function must return these
     *            session attributes if you want Amazon Lex to return them back
     *            to the client.
     *            </p>
     *            </note>
     */
    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * A session represents the dialog between a user and Amazon Lex. At
     * runtime, a client application can pass contextual information (session
     * attributes) in the request. For example, <code>"FirstName" : "Joe"</code>
     * . Amazon Lex passes these session attributes to the AWS Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * </p>
     * <p>
     * In your Lambda function, you can use the session attributes for
     * customization. Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you can pass user location as a
     * session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), your Lambda function might
     * use this information to determine the closest pizzeria to place the
     * order.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use session attributes to personalize prompts. For example, you pass in
     * user name as a session attribute (<code>"FirstName" : "Joe"</code>), you
     * might configure subsequent prompts to refer to this attribute, as
     * <code>$session.FirstName"</code>. At runtime, Amazon Lex substitutes a
     * real value when it generates a prompt, such as
     * "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If the intent is configured without a Lambda function to process the
     * intent (that is, the client application to process the intent), Amazon
     * Lex simply returns the session attributes back to the client application.
     * </p>
     * <p>
     * If the intent is configured with a Lambda function to process the intent,
     * Amazon Lex passes the incoming session attributes to the Lambda function.
     * The Lambda function must return these session attributes if you want
     * Amazon Lex to return them back to the client.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            A session represents the dialog between a user and Amazon Lex.
     *            At runtime, a client application can pass contextual
     *            information (session attributes) in the request. For example,
     *            <code>"FirstName" : "Joe"</code>. Amazon Lex passes these
     *            session attributes to the AWS Lambda functions configured for
     *            the intent (see <code>dialogCodeHook</code> and
     *            <code>fulfillmentActivity.codeHook</code> in
     *            <code>CreateIntent</code>).
     *            </p>
     *            <p>
     *            In your Lambda function, you can use the session attributes
     *            for customization. Some examples are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In a pizza ordering application, if you can pass user location
     *            as a session attribute (for example,
     *            <code>"Location" : "111 Maple street"</code>), your Lambda
     *            function might use this information to determine the closest
     *            pizzeria to place the order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use session attributes to personalize prompts. For example,
     *            you pass in user name as a session attribute (
     *            <code>"FirstName" : "Joe"</code>), you might configure
     *            subsequent prompts to refer to this attribute, as
     *            <code>$session.FirstName"</code>. At runtime, Amazon Lex
     *            substitutes a real value when it generates a prompt, such as
     *            "Hello Joe, what would you like to order?"
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Amazon Lex does not persist session attributes.
     *            </p>
     *            <p>
     *            If the intent is configured without a Lambda function to
     *            process the intent (that is, the client application to process
     *            the intent), Amazon Lex simply returns the session attributes
     *            back to the client application.
     *            </p>
     *            <p>
     *            If the intent is configured with a Lambda function to process
     *            the intent, Amazon Lex passes the incoming session attributes
     *            to the Lambda function. The Lambda function must return these
     *            session attributes if you want Amazon Lex to return them back
     *            to the client.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextRequest withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * A session represents the dialog between a user and Amazon Lex. At
     * runtime, a client application can pass contextual information (session
     * attributes) in the request. For example, <code>"FirstName" : "Joe"</code>
     * . Amazon Lex passes these session attributes to the AWS Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * </p>
     * <p>
     * In your Lambda function, you can use the session attributes for
     * customization. Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you can pass user location as a
     * session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), your Lambda function might
     * use this information to determine the closest pizzeria to place the
     * order.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use session attributes to personalize prompts. For example, you pass in
     * user name as a session attribute (<code>"FirstName" : "Joe"</code>), you
     * might configure subsequent prompts to refer to this attribute, as
     * <code>$session.FirstName"</code>. At runtime, Amazon Lex substitutes a
     * real value when it generates a prompt, such as
     * "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If the intent is configured without a Lambda function to process the
     * intent (that is, the client application to process the intent), Amazon
     * Lex simply returns the session attributes back to the client application.
     * </p>
     * <p>
     * If the intent is configured with a Lambda function to process the intent,
     * Amazon Lex passes the incoming session attributes to the Lambda function.
     * The Lambda function must return these session attributes if you want
     * Amazon Lex to return them back to the client.
     * </p>
     * </note>
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
    public PostTextRequest addsessionAttributesEntry(String key, String value) {
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
    public PostTextRequest clearsessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * Text user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Text user entered (Amazon Lex interprets this text).
     *         </p>
     */
    public String getInputText() {
        return inputText;
    }

    /**
     * <p>
     * Text user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param inputText <p>
     *            Text user entered (Amazon Lex interprets this text).
     *            </p>
     */
    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    /**
     * <p>
     * Text user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param inputText <p>
     *            Text user entered (Amazon Lex interprets this text).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostTextRequest withInputText(String inputText) {
        this.inputText = inputText;
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
        if (getBotName() != null)
            sb.append("botName: " + getBotName() + ",");
        if (getBotAlias() != null)
            sb.append("botAlias: " + getBotAlias() + ",");
        if (getUserId() != null)
            sb.append("userId: " + getUserId() + ",");
        if (getSessionAttributes() != null)
            sb.append("sessionAttributes: " + getSessionAttributes() + ",");
        if (getInputText() != null)
            sb.append("inputText: " + getInputText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode
                + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getInputText() == null) ? 0 : getInputText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostTextRequest == false)
            return false;
        PostTextRequest other = (PostTextRequest) obj;

        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null
                && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getInputText() == null ^ this.getInputText() == null)
            return false;
        if (other.getInputText() != null
                && other.getInputText().equals(this.getInputText()) == false)
            return false;
        return true;
    }
}
