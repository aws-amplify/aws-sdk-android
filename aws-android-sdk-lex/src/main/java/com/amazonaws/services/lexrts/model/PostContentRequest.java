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

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;
import java.util.Map;

/**
 * <p>
 * Sends user input (speech or text), at runtime, to Amazon Lex. Amazon Lex uses
 * the machine learning model (built for the specific bot), in order to
 * interpret the user input specified in the request.
 * </p>
 * <note>
 * <p>
 * When building Amazon Lex text bots, you can use the <code>PostText</code> API
 * operation, which supports response cards. When building Amazon Lex bots that
 * communicate by speech alone or by speech and text, you use the this API.
 * </p>
 * </note>
 * <p>
 * In response, Amazon Lex returns the next <code>message</code> to convey to
 * the user and the message type (<code>dialogState</code>). Based on the user
 * interaction context, Amazon Lex knows the message to return and the message
 * type indicates whether to expect a user response for that message. For
 * example, consider the following response messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * "What pizza toppings would you like?" - For this message, the
 * <code>dialogState</code> would be <code>ElicitSlot</code> (that is, a user
 * response is expected).
 * </p>
 * </li>
 * <li>
 * <p>
 * "Your order has been placed." - For this message, Amazon Lex returns one of
 * the following dialog states depending on how the fulfillment is configured
 * for the intent (see <code>fulfillmentActivity</code> in
 * <code>CreateIntent</code>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>FulFilled</code> – The intent <code>fulfillmentActivity</code> is
 * configured with a Lambda function to fulfill the intent.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ReadyForFulfilment</code> – The intent's
 * <code>fulfillmentActivity</code> is configured to simply return the intent
 * data back to the client application.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
public class PostContentRequest extends AmazonWebServiceRequest implements Serializable {
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
     * User ID of your client application. Typically, your application users
     * should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one mobile device and
     * continue the conversation on another device, you might choose
     * user-specific identifier, such as login, or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose device-specific
     * identifier, such as device ID, or some globally unique identifier.
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
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP
     * header. The value must be map (keys and values must be string) that is
     * JSON serialized and then base64-encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a
     * client application can pass contextual information (session attributes),
     * in the request. For example, <code>"FirstName" : "Joe"</code>.
     * </p>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * In the Lambda function code, you can use the session attributes for
     * customization. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you pass user location (for example,
     * <code>"Location" : "some location"</code>) as a session attribute, your
     * Lambda function might use this information to determine the closest
     * pizzeria to place the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use session attribute information to personalize prompts. For
     * example, suppose you pass in a user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>). You might configure subsequent prompts
     * to refer to this attribute, as <code>$session.FirstName"</code>. At
     * runtime, Amazon Lex substitutes a real value when the prompt is
     * generated, such as "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you have not configured a Lambda function to process an intent (that
     * is, you want processing done on the client), Amazon Lex simply returns
     * the session attributes back to the client application.
     * </p>
     * <p>
     * If you configured a Lambda function to process the intent, Amazon Lex
     * passes the incoming session attributes to the Lambda function. The Lambda
     * function must return these session attributes if you want Amazon Lex to
     * return them back to client.
     * </p>
     * </note>
     */
    private Map<String, String> sessionAttributes;

    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1;
     * frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or
     * speech based on the <code>Accept</code> HTTP header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex
     * returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, the Amazon Lex returns a
     * speech in the response. Amazon Lex uses Amazon Polly to generate the
     * speech (using the configuration you specified in the <code>Accept</code>
     * header). For example, if you specify <code>audio/mpeg</code> as the
     * value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String accept;

    /**
     * <p>
     * User input, in the format as described in the <code>Content-Type</code>
     * HTTP header.
     * </p>
     */
    private java.io.InputStream inputStreamValue;

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
    public PostContentRequest withBotName(String botName) {
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
    public PostContentRequest withBotAlias(String botAlias) {
        this.botAlias = botAlias;
        return this;
    }

    /**
     * <p>
     * User ID of your client application. Typically, your application users
     * should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one mobile device and
     * continue the conversation on another device, you might choose
     * user-specific identifier, such as login, or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose device-specific
     * identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @return <p>
     *         User ID of your client application. Typically, your application
     *         users should have a unique ID. Note the following considerations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you want a user to start conversation on one mobile device and
     *         continue the conversation on another device, you might choose
     *         user-specific identifier, such as login, or Amazon Cognito user
     *         ID (assuming your application is using Amazon Cognito).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want the same user to be able to have two independent
     *         conversations on two different devices, you might choose
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
     * User ID of your client application. Typically, your application users
     * should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one mobile device and
     * continue the conversation on another device, you might choose
     * user-specific identifier, such as login, or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose device-specific
     * identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            User ID of your client application. Typically, your
     *            application users should have a unique ID. Note the following
     *            considerations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you want a user to start conversation on one mobile device
     *            and continue the conversation on another device, you might
     *            choose user-specific identifier, such as login, or Amazon
     *            Cognito user ID (assuming your application is using Amazon
     *            Cognito).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want the same user to be able to have two independent
     *            conversations on two different devices, you might choose
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
     * User ID of your client application. Typically, your application users
     * should have a unique ID. Note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one mobile device and
     * continue the conversation on another device, you might choose
     * user-specific identifier, such as login, or Amazon Cognito user ID
     * (assuming your application is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, you might choose device-specific
     * identifier, such as device ID, or some globally unique identifier.
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
     *            User ID of your client application. Typically, your
     *            application users should have a unique ID. Note the following
     *            considerations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you want a user to start conversation on one mobile device
     *            and continue the conversation on another device, you might
     *            choose user-specific identifier, such as login, or Amazon
     *            Cognito user ID (assuming your application is using Amazon
     *            Cognito).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want the same user to be able to have two independent
     *            conversations on two different devices, you might choose
     *            device-specific identifier, such as device ID, or some
     *            globally unique identifier.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP
     * header. The value must be map (keys and values must be string) that is
     * JSON serialized and then base64-encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a
     * client application can pass contextual information (session attributes),
     * in the request. For example, <code>"FirstName" : "Joe"</code>.
     * </p>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * In the Lambda function code, you can use the session attributes for
     * customization. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you pass user location (for example,
     * <code>"Location" : "some location"</code>) as a session attribute, your
     * Lambda function might use this information to determine the closest
     * pizzeria to place the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use session attribute information to personalize prompts. For
     * example, suppose you pass in a user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>). You might configure subsequent prompts
     * to refer to this attribute, as <code>$session.FirstName"</code>. At
     * runtime, Amazon Lex substitutes a real value when the prompt is
     * generated, such as "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you have not configured a Lambda function to process an intent (that
     * is, you want processing done on the client), Amazon Lex simply returns
     * the session attributes back to the client application.
     * </p>
     * <p>
     * If you configured a Lambda function to process the intent, Amazon Lex
     * passes the incoming session attributes to the Lambda function. The Lambda
     * function must return these session attributes if you want Amazon Lex to
     * return them back to client.
     * </p>
     * </note>
     *
     * @return <p>
     *         You pass this value in the
     *         <code>x-amz-lex-session-attributes</code> HTTP header. The value
     *         must be map (keys and values must be string) that is JSON
     *         serialized and then base64-encoded.
     *         </p>
     *         <p>
     *         A session represents dialog between a user and Amazon Lex. At
     *         runtime, a client application can pass contextual information
     *         (session attributes), in the request. For example,
     *         <code>"FirstName" : "Joe"</code>.
     *         </p>
     *         <p>
     *         Amazon Lex passes these session attributes to the Lambda
     *         functions configured for the intent (see
     *         <code>dialogCodeHook</code> and
     *         <code>fulfillmentActivity.codeHook</code> in
     *         <code>CreateIntent</code>). In the Lambda function code, you can
     *         use the session attributes for customization. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In a pizza ordering application, if you pass user location (for
     *         example, <code>"Location" : "some location"</code>) as a session
     *         attribute, your Lambda function might use this information to
     *         determine the closest pizzeria to place the order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You might use session attribute information to personalize
     *         prompts. For example, suppose you pass in a user name as a
     *         session attribute (<code>"FirstName" : "Joe"</code>). You might
     *         configure subsequent prompts to refer to this attribute, as
     *         <code>$session.FirstName"</code>. At runtime, Amazon Lex
     *         substitutes a real value when the prompt is generated, such as
     *         "Hello Joe, what would you like to order?"
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Amazon Lex does not persist session attributes.
     *         </p>
     *         <p>
     *         If you have not configured a Lambda function to process an intent
     *         (that is, you want processing done on the client), Amazon Lex
     *         simply returns the session attributes back to the client
     *         application.
     *         </p>
     *         <p>
     *         If you configured a Lambda function to process the intent, Amazon
     *         Lex passes the incoming session attributes to the Lambda
     *         function. The Lambda function must return these session
     *         attributes if you want Amazon Lex to return them back to client.
     *         </p>
     *         </note>
     */
    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP
     * header. The value must be map (keys and values must be string) that is
     * JSON serialized and then base64-encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a
     * client application can pass contextual information (session attributes),
     * in the request. For example, <code>"FirstName" : "Joe"</code>.
     * </p>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * In the Lambda function code, you can use the session attributes for
     * customization. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you pass user location (for example,
     * <code>"Location" : "some location"</code>) as a session attribute, your
     * Lambda function might use this information to determine the closest
     * pizzeria to place the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use session attribute information to personalize prompts. For
     * example, suppose you pass in a user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>). You might configure subsequent prompts
     * to refer to this attribute, as <code>$session.FirstName"</code>. At
     * runtime, Amazon Lex substitutes a real value when the prompt is
     * generated, such as "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you have not configured a Lambda function to process an intent (that
     * is, you want processing done on the client), Amazon Lex simply returns
     * the session attributes back to the client application.
     * </p>
     * <p>
     * If you configured a Lambda function to process the intent, Amazon Lex
     * passes the incoming session attributes to the Lambda function. The Lambda
     * function must return these session attributes if you want Amazon Lex to
     * return them back to client.
     * </p>
     * </note>
     *
     * @param sessionAttributes <p>
     *            You pass this value in the
     *            <code>x-amz-lex-session-attributes</code> HTTP header. The
     *            value must be map (keys and values must be string) that is
     *            JSON serialized and then base64-encoded.
     *            </p>
     *            <p>
     *            A session represents dialog between a user and Amazon Lex. At
     *            runtime, a client application can pass contextual information
     *            (session attributes), in the request. For example,
     *            <code>"FirstName" : "Joe"</code>.
     *            </p>
     *            <p>
     *            Amazon Lex passes these session attributes to the Lambda
     *            functions configured for the intent (see
     *            <code>dialogCodeHook</code> and
     *            <code>fulfillmentActivity.codeHook</code> in
     *            <code>CreateIntent</code>). In the Lambda function code, you
     *            can use the session attributes for customization. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In a pizza ordering application, if you pass user location
     *            (for example, <code>"Location" : "some location"</code>) as a
     *            session attribute, your Lambda function might use this
     *            information to determine the closest pizzeria to place the
     *            order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You might use session attribute information to personalize
     *            prompts. For example, suppose you pass in a user name as a
     *            session attribute (<code>"FirstName" : "Joe"</code>). You
     *            might configure subsequent prompts to refer to this attribute,
     *            as <code>$session.FirstName"</code>. At runtime, Amazon Lex
     *            substitutes a real value when the prompt is generated, such as
     *            "Hello Joe, what would you like to order?"
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Amazon Lex does not persist session attributes.
     *            </p>
     *            <p>
     *            If you have not configured a Lambda function to process an
     *            intent (that is, you want processing done on the client),
     *            Amazon Lex simply returns the session attributes back to the
     *            client application.
     *            </p>
     *            <p>
     *            If you configured a Lambda function to process the intent,
     *            Amazon Lex passes the incoming session attributes to the
     *            Lambda function. The Lambda function must return these session
     *            attributes if you want Amazon Lex to return them back to
     *            client.
     *            </p>
     *            </note>
     */
    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP
     * header. The value must be map (keys and values must be string) that is
     * JSON serialized and then base64-encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a
     * client application can pass contextual information (session attributes),
     * in the request. For example, <code>"FirstName" : "Joe"</code>.
     * </p>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions
     * configured for the intent (see <code>dialogCodeHook</code> and
     * <code>fulfillmentActivity.codeHook</code> in <code>CreateIntent</code>).
     * In the Lambda function code, you can use the session attributes for
     * customization. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In a pizza ordering application, if you pass user location (for example,
     * <code>"Location" : "some location"</code>) as a session attribute, your
     * Lambda function might use this information to determine the closest
     * pizzeria to place the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use session attribute information to personalize prompts. For
     * example, suppose you pass in a user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>). You might configure subsequent prompts
     * to refer to this attribute, as <code>$session.FirstName"</code>. At
     * runtime, Amazon Lex substitutes a real value when the prompt is
     * generated, such as "Hello Joe, what would you like to order?"
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you have not configured a Lambda function to process an intent (that
     * is, you want processing done on the client), Amazon Lex simply returns
     * the session attributes back to the client application.
     * </p>
     * <p>
     * If you configured a Lambda function to process the intent, Amazon Lex
     * passes the incoming session attributes to the Lambda function. The Lambda
     * function must return these session attributes if you want Amazon Lex to
     * return them back to client.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            You pass this value in the
     *            <code>x-amz-lex-session-attributes</code> HTTP header. The
     *            value must be map (keys and values must be string) that is
     *            JSON serialized and then base64-encoded.
     *            </p>
     *            <p>
     *            A session represents dialog between a user and Amazon Lex. At
     *            runtime, a client application can pass contextual information
     *            (session attributes), in the request. For example,
     *            <code>"FirstName" : "Joe"</code>.
     *            </p>
     *            <p>
     *            Amazon Lex passes these session attributes to the Lambda
     *            functions configured for the intent (see
     *            <code>dialogCodeHook</code> and
     *            <code>fulfillmentActivity.codeHook</code> in
     *            <code>CreateIntent</code>). In the Lambda function code, you
     *            can use the session attributes for customization. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In a pizza ordering application, if you pass user location
     *            (for example, <code>"Location" : "some location"</code>) as a
     *            session attribute, your Lambda function might use this
     *            information to determine the closest pizzeria to place the
     *            order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You might use session attribute information to personalize
     *            prompts. For example, suppose you pass in a user name as a
     *            session attribute (<code>"FirstName" : "Joe"</code>). You
     *            might configure subsequent prompts to refer to this attribute,
     *            as <code>$session.FirstName"</code>. At runtime, Amazon Lex
     *            substitutes a real value when the prompt is generated, such as
     *            "Hello Joe, what would you like to order?"
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Amazon Lex does not persist session attributes.
     *            </p>
     *            <p>
     *            If you have not configured a Lambda function to process an
     *            intent (that is, you want processing done on the client),
     *            Amazon Lex simply returns the session attributes back to the
     *            client application.
     *            </p>
     *            <p>
     *            If you configured a Lambda function to process the intent,
     *            Amazon Lex passes the incoming session attributes to the
     *            Lambda function. The Lambda function must return these session
     *            attributes if you want Amazon Lex to return them back to
     *            client.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentRequest withSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1;
     * frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         You pass this values as the <code>Content-Type</code> HTTP
     *         header.
     *         </p>
     *         <p>
     *         Indicates the audio format or text. The header value must start
     *         with one of the following prefixes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/l16; rate=16000; channels=1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/x-l16; sample-rate=16000; channel-count=1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1;
     *         frame-size-milliseconds=1.1
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1;
     * frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     *
     * @param contentType <p>
     *            You pass this values as the <code>Content-Type</code> HTTP
     *            header.
     *            </p>
     *            <p>
     *            Indicates the audio format or text. The header value must
     *            start with one of the following prefixes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            audio/l16; rate=16000; channels=1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/x-l16; sample-rate=16000; channel-count=1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            text/plain; charset=utf-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1;
     *            frame-size-milliseconds=1.1
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1;
     * frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            You pass this values as the <code>Content-Type</code> HTTP
     *            header.
     *            </p>
     *            <p>
     *            Indicates the audio format or text. The header value must
     *            start with one of the following prefixes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            audio/l16; rate=16000; channels=1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/x-l16; sample-rate=16000; channel-count=1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            text/plain; charset=utf-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1;
     *            frame-size-milliseconds=1.1
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or
     * speech based on the <code>Accept</code> HTTP header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex
     * returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, the Amazon Lex returns a
     * speech in the response. Amazon Lex uses Amazon Polly to generate the
     * speech (using the configuration you specified in the <code>Accept</code>
     * header). For example, if you specify <code>audio/mpeg</code> as the
     * value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         You pass this value as the <code>Accept</code> HTTP header.
     *         </p>
     *         <p>
     *         The message Amazon Lex returns in the response can be either text
     *         or speech based on the <code>Accept</code> HTTP header value in
     *         the request.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value is <code>text/plain; charset=utf-8</code>, Amazon
     *         Lex returns text in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value begins with <code>audio/</code>, the Amazon Lex
     *         returns a speech in the response. Amazon Lex uses Amazon Polly to
     *         generate the speech (using the configuration you specified in the
     *         <code>Accept</code> header). For example, if you specify
     *         <code>audio/mpeg</code> as the value, Amazon Lex returns speech
     *         in the MPEG format.
     *         </p>
     *         <p>
     *         The following are the accepted values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/mpeg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/ogg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/pcm
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/* (defaults to mpeg)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public String getAccept() {
        return accept;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or
     * speech based on the <code>Accept</code> HTTP header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex
     * returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, the Amazon Lex returns a
     * speech in the response. Amazon Lex uses Amazon Polly to generate the
     * speech (using the configuration you specified in the <code>Accept</code>
     * header). For example, if you specify <code>audio/mpeg</code> as the
     * value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param accept <p>
     *            You pass this value as the <code>Accept</code> HTTP header.
     *            </p>
     *            <p>
     *            The message Amazon Lex returns in the response can be either
     *            text or speech based on the <code>Accept</code> HTTP header
     *            value in the request.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the value is <code>text/plain; charset=utf-8</code>, Amazon
     *            Lex returns text in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the value begins with <code>audio/</code>, the Amazon Lex
     *            returns a speech in the response. Amazon Lex uses Amazon Polly
     *            to generate the speech (using the configuration you specified
     *            in the <code>Accept</code> header). For example, if you
     *            specify <code>audio/mpeg</code> as the value, Amazon Lex
     *            returns speech in the MPEG format.
     *            </p>
     *            <p>
     *            The following are the accepted values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            audio/mpeg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/ogg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/pcm
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            text/plain; charset=utf-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/* (defaults to mpeg)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or
     * speech based on the <code>Accept</code> HTTP header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex
     * returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, the Amazon Lex returns a
     * speech in the response. Amazon Lex uses Amazon Polly to generate the
     * speech (using the configuration you specified in the <code>Accept</code>
     * header). For example, if you specify <code>audio/mpeg</code> as the
     * value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accept <p>
     *            You pass this value as the <code>Accept</code> HTTP header.
     *            </p>
     *            <p>
     *            The message Amazon Lex returns in the response can be either
     *            text or speech based on the <code>Accept</code> HTTP header
     *            value in the request.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the value is <code>text/plain; charset=utf-8</code>, Amazon
     *            Lex returns text in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the value begins with <code>audio/</code>, the Amazon Lex
     *            returns a speech in the response. Amazon Lex uses Amazon Polly
     *            to generate the speech (using the configuration you specified
     *            in the <code>Accept</code> header). For example, if you
     *            specify <code>audio/mpeg</code> as the value, Amazon Lex
     *            returns speech in the MPEG format.
     *            </p>
     *            <p>
     *            The following are the accepted values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            audio/mpeg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/ogg
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/pcm
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            text/plain; charset=utf-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            audio/* (defaults to mpeg)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentRequest withAccept(String accept) {
        this.accept = accept;
        return this;
    }

    /**
     * <p>
     * User input, in the format as described in the <code>Content-Type</code>
     * HTTP header.
     * </p>
     *
     * @return <p>
     *         User input, in the format as described in the
     *         <code>Content-Type</code> HTTP header.
     *         </p>
     */
    public java.io.InputStream getInputStream() {
        return inputStreamValue;
    }

    /**
     * <p>
     * User input, in the format as described in the <code>Content-Type</code>
     * HTTP header.
     * </p>
     *
     * @param inputStreamValue <p>
     *            User input, in the format as described in the
     *            <code>Content-Type</code> HTTP header.
     *            </p>
     */
    public void setInputStream(java.io.InputStream inputStreamValue) {
        this.inputStreamValue = inputStreamValue;
    }

    /**
     * <p>
     * User input, in the format as described in the <code>Content-Type</code>
     * HTTP header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputStreamValue <p>
     *            User input, in the format as described in the
     *            <code>Content-Type</code> HTTP header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentRequest withInputStream(java.io.InputStream inputStreamValue) {
        this.inputStreamValue = inputStreamValue;
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
        if (getBotName() != null) {
            sb.append("botName: " + getBotName() + ",");
        }
        if (getBotAlias() != null) {
            sb.append("botAlias: " + getBotAlias() + ",");
        }
        if (getUserId() != null) {
            sb.append("userId: " + getUserId() + ",");
        }
        if (getSessionAttributes() != null) {
            sb.append("sessionAttributes: " + getSessionAttributes() + ",");
        }
        if (getContentType() != null) {
            sb.append("contentType: " + getContentType() + ",");
        }
        if (getAccept() != null) {
            sb.append("accept: " + getAccept() + ",");
        }
        if (getInputStream() != null) {
            sb.append("inputStream: " + getInputStream());
        }
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
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode
                + ((getInputStream() == null) ? 0 : getInputStream().hashCode());
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

        if (obj instanceof PostContentRequest == false) {
            return false;
        }
        final PostContentRequest other = (PostContentRequest) obj;

        if (other.getBotName() == null ^ this.getBotName() == null) {
            return false;
        }
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false) {
            return false;
        }
        if (other.getBotAlias() == null ^ this.getBotAlias() == null) {
            return false;
        }
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false) {
            return false;
        }
        if (other.getUserId() == null ^ this.getUserId() == null) {
            return false;
        }
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) {
            return false;
        }
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null) {
            return false;
        }
        if (other.getSessionAttributes() != null
                && other.getSessionAttributes().equals(this.getSessionAttributes()) == false) {
            return false;
        }
        if (other.getContentType() == null ^ this.getContentType() == null) {
            return false;
        }
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false) {
            return false;
        }
        if (other.getAccept() == null ^ this.getAccept() == null) {
            return false;
        }
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false) {
            return false;
        }
        if (other.getInputStream() == null ^ this.getInputStream() == null) {
            return false;
        }
        if (other.getInputStream() != null
                && other.getInputStream().equals(this.getInputStream()) == false) {
            return false;
        }
        return true;
    }
}
