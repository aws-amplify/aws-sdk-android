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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends user input (text or speech) to Amazon Lex. Clients use this API to send
 * text and audio requests to Amazon Lex at runtime. Amazon Lex interprets the
 * user input using the machine learning model that it built for the bot.
 * </p>
 * <p>
 * The <code>PostContent</code> operation supports audio input at 8kHz and
 * 16kHz. You can use 8kHz audio to achieve higher speech recognition accuracy
 * in telephone audio applications.
 * </p>
 * <p>
 * In response, Amazon Lex returns the next message to convey to the user.
 * Consider the following example messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a user input "I would like a pizza," Amazon Lex might return a response
 * with a message eliciting slot data (for example, <code>PizzaSize</code>):
 * "What size pizza would you like?".
 * </p>
 * </li>
 * <li>
 * <p>
 * After the user provides all of the pizza order information, Amazon Lex might
 * return a response with a message to get user confirmation:
 * "Order the pizza?".
 * </p>
 * </li>
 * <li>
 * <p>
 * After the user replies "Yes" to the confirmation prompt, Amazon Lex might
 * return a conclusion statement:
 * "Thank you, your cheese pizza has been ordered.".
 * </p>
 * </li>
 * </ul>
 * <p>
 * Not all Amazon Lex messages require a response from the user. For example,
 * conclusion statements do not require a response. Some messages require only a
 * yes or no response. In addition to the <code>message</code>, Amazon Lex
 * provides additional context about the message in the response that you can
 * use to enhance client behavior, such as displaying the appropriate client
 * user interface. Consider the following examples:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the message is to elicit slot data, Amazon Lex returns the following
 * context information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>x-amz-lex-dialog-state</code> header set to <code>ElicitSlot</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-lex-intent-name</code> header set to the intent name in the
 * current context
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-lex-slot-to-elicit</code> header set to the slot name for which
 * the <code>message</code> is eliciting information
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-lex-slots</code> header set to a map of slots configured for the
 * intent with their current values
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * If the message is a confirmation prompt, the
 * <code>x-amz-lex-dialog-state</code> header is set to
 * <code>Confirmation</code> and the <code>x-amz-lex-slot-to-elicit</code>
 * header is omitted.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the message is a clarification prompt configured for the intent,
 * indicating that the user intent is not understood, the
 * <code>x-amz-dialog-state</code> header is set to <code>ElicitIntent</code>
 * and the <code>x-amz-slot-to-elicit</code> header is omitted.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In addition, Amazon Lex also returns your application-specific
 * <code>sessionAttributes</code>. For more information, see <a
 * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html">Managing
 * Conversation Context</a>.
 * </p>
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
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot. At runtime, each request must contain
     * the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following
     * factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally
     * identifiable information of the user, for example, name, personal
     * identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on
     * another device, use a user-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, choose a device-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different
     * versions of the same bot. For example, a user can't have a conversation
     * with the PROD and BETA versions of the same bot. If you anticipate that a
     * user will need to have conversation with two different versions, for
     * example, while testing, include the bot alias in the user ID to separate
     * the two conversations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     */
    private String userId;

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs"
     * >Setting Session Attributes</a>.
     * </p>
     */
    private String sessionAttributes;

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes.
     * Don't create any request attributes with the prefix
     * <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs"
     * >Setting Request Attributes</a>.
     * </p>
     */
    private String requestAttributes;

    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
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
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1;
     * is-big-endian=false
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000;
     * frame-size-milliseconds=4
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
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
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech
     * in the response. Amazon Lex uses Amazon Polly to generate the speech
     * (using the configuration you specified in the <code>Accept</code>
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
     * User input in PCM or Opus audio format or text format as described in the
     * <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer
     * that captures all of the audio data before sending. In general, you get
     * better performance if you stream audio data rather than buffering the
     * data locally.
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
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot. At runtime, each request must contain
     * the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following
     * factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally
     * identifiable information of the user, for example, name, personal
     * identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on
     * another device, use a user-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, choose a device-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different
     * versions of the same bot. For example, a user can't have a conversation
     * with the PROD and BETA versions of the same bot. If you anticipate that a
     * user will need to have conversation with two different versions, for
     * example, while testing, include the bot alias in the user ID to separate
     * the two conversations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @return <p>
     *         The ID of the client application user. Amazon Lex uses this to
     *         identify a user's conversation with your bot. At runtime, each
     *         request must contain the <code>userID</code> field.
     *         </p>
     *         <p>
     *         To decide the user ID to use for your application, consider the
     *         following factors.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>userID</code> field must not contain any personally
     *         identifiable information of the user, for example, name, personal
     *         identification numbers, or other end user personal information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want a user to start a conversation on one device and
     *         continue on another device, use a user-specific identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want the same user to be able to have two independent
     *         conversations on two different devices, choose a device-specific
     *         identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A user can't have two independent conversations with two
     *         different versions of the same bot. For example, a user can't
     *         have a conversation with the PROD and BETA versions of the same
     *         bot. If you anticipate that a user will need to have conversation
     *         with two different versions, for example, while testing, include
     *         the bot alias in the user ID to separate the two conversations.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot. At runtime, each request must contain
     * the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following
     * factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally
     * identifiable information of the user, for example, name, personal
     * identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on
     * another device, use a user-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, choose a device-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different
     * versions of the same bot. For example, a user can't have a conversation
     * with the PROD and BETA versions of the same bot. If you anticipate that a
     * user will need to have conversation with two different versions, for
     * example, while testing, include the bot alias in the user ID to separate
     * the two conversations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user. Amazon Lex uses this to
     *            identify a user's conversation with your bot. At runtime, each
     *            request must contain the <code>userID</code> field.
     *            </p>
     *            <p>
     *            To decide the user ID to use for your application, consider
     *            the following factors.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>userID</code> field must not contain any personally
     *            identifiable information of the user, for example, name,
     *            personal identification numbers, or other end user personal
     *            information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want a user to start a conversation on one device and
     *            continue on another device, use a user-specific identifier.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want the same user to be able to have two independent
     *            conversations on two different devices, choose a
     *            device-specific identifier.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A user can't have two independent conversations with two
     *            different versions of the same bot. For example, a user can't
     *            have a conversation with the PROD and BETA versions of the
     *            same bot. If you anticipate that a user will need to have
     *            conversation with two different versions, for example, while
     *            testing, include the bot alias in the user ID to separate the
     *            two conversations.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot. At runtime, each request must contain
     * the <code>userID</code> field.
     * </p>
     * <p>
     * To decide the user ID to use for your application, consider the following
     * factors.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>userID</code> field must not contain any personally
     * identifiable information of the user, for example, name, personal
     * identification numbers, or other end user personal information.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue on
     * another device, use a user-specific identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent
     * conversations on two different devices, choose a device-specific
     * identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * A user can't have two independent conversations with two different
     * versions of the same bot. For example, a user can't have a conversation
     * with the PROD and BETA versions of the same bot. If you anticipate that a
     * user will need to have conversation with two different versions, for
     * example, while testing, include the bot alias in the user ID to separate
     * the two conversations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user. Amazon Lex uses this to
     *            identify a user's conversation with your bot. At runtime, each
     *            request must contain the <code>userID</code> field.
     *            </p>
     *            <p>
     *            To decide the user ID to use for your application, consider
     *            the following factors.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>userID</code> field must not contain any personally
     *            identifiable information of the user, for example, name,
     *            personal identification numbers, or other end user personal
     *            information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want a user to start a conversation on one device and
     *            continue on another device, use a user-specific identifier.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you want the same user to be able to have two independent
     *            conversations on two different devices, choose a
     *            device-specific identifier.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A user can't have two independent conversations with two
     *            different versions of the same bot. For example, a user can't
     *            have a conversation with the PROD and BETA versions of the
     *            same bot. If you anticipate that a user will need to have
     *            conversation with two different versions, for example, while
     *            testing, include the bot alias in the user ID to separate the
     *            two conversations.
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
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs"
     * >Setting Session Attributes</a>.
     * </p>
     *
     * @return <p>
     *         You pass this value as the
     *         <code>x-amz-lex-session-attributes</code> HTTP header.
     *         </p>
     *         <p>
     *         Application-specific information passed between Amazon Lex and a
     *         client application. The value must be a JSON serialized and
     *         base64 encoded map with string keys and values. The total size of
     *         the <code>sessionAttributes</code> and
     *         <code>requestAttributes</code> headers is limited to 12 KB.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs"
     *         >Setting Session Attributes</a>.
     *         </p>
     */
    public String getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs"
     * >Setting Session Attributes</a>.
     * </p>
     *
     * @param sessionAttributes <p>
     *            You pass this value as the
     *            <code>x-amz-lex-session-attributes</code> HTTP header.
     *            </p>
     *            <p>
     *            Application-specific information passed between Amazon Lex and
     *            a client application. The value must be a JSON serialized and
     *            base64 encoded map with string keys and values. The total size
     *            of the <code>sessionAttributes</code> and
     *            <code>requestAttributes</code> headers is limited to 12 KB.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs"
     *            >Setting Session Attributes</a>.
     *            </p>
     */
    public void setSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-session-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Application-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>sessionAttributes</code> and <code>requestAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs"
     * >Setting Session Attributes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            You pass this value as the
     *            <code>x-amz-lex-session-attributes</code> HTTP header.
     *            </p>
     *            <p>
     *            Application-specific information passed between Amazon Lex and
     *            a client application. The value must be a JSON serialized and
     *            base64 encoded map with string keys and values. The total size
     *            of the <code>sessionAttributes</code> and
     *            <code>requestAttributes</code> headers is limited to 12 KB.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-session-attribs"
     *            >Setting Session Attributes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentRequest withSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes.
     * Don't create any request attributes with the prefix
     * <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs"
     * >Setting Request Attributes</a>.
     * </p>
     *
     * @return <p>
     *         You pass this value as the
     *         <code>x-amz-lex-request-attributes</code> HTTP header.
     *         </p>
     *         <p>
     *         Request-specific information passed between Amazon Lex and a
     *         client application. The value must be a JSON serialized and
     *         base64 encoded map with string keys and values. The total size of
     *         the <code>requestAttributes</code> and
     *         <code>sessionAttributes</code> headers is limited to 12 KB.
     *         </p>
     *         <p>
     *         The namespace <code>x-amz-lex:</code> is reserved for special
     *         attributes. Don't create any request attributes with the prefix
     *         <code>x-amz-lex:</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs"
     *         >Setting Request Attributes</a>.
     *         </p>
     */
    public String getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes.
     * Don't create any request attributes with the prefix
     * <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs"
     * >Setting Request Attributes</a>.
     * </p>
     *
     * @param requestAttributes <p>
     *            You pass this value as the
     *            <code>x-amz-lex-request-attributes</code> HTTP header.
     *            </p>
     *            <p>
     *            Request-specific information passed between Amazon Lex and a
     *            client application. The value must be a JSON serialized and
     *            base64 encoded map with string keys and values. The total size
     *            of the <code>requestAttributes</code> and
     *            <code>sessionAttributes</code> headers is limited to 12 KB.
     *            </p>
     *            <p>
     *            The namespace <code>x-amz-lex:</code> is reserved for special
     *            attributes. Don't create any request attributes with the
     *            prefix <code>x-amz-lex:</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs"
     *            >Setting Request Attributes</a>.
     *            </p>
     */
    public void setRequestAttributes(String requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * You pass this value as the <code>x-amz-lex-request-attributes</code> HTTP
     * header.
     * </p>
     * <p>
     * Request-specific information passed between Amazon Lex and a client
     * application. The value must be a JSON serialized and base64 encoded map
     * with string keys and values. The total size of the
     * <code>requestAttributes</code> and <code>sessionAttributes</code> headers
     * is limited to 12 KB.
     * </p>
     * <p>
     * The namespace <code>x-amz-lex:</code> is reserved for special attributes.
     * Don't create any request attributes with the prefix
     * <code>x-amz-lex:</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs"
     * >Setting Request Attributes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestAttributes <p>
     *            You pass this value as the
     *            <code>x-amz-lex-request-attributes</code> HTTP header.
     *            </p>
     *            <p>
     *            Request-specific information passed between Amazon Lex and a
     *            client application. The value must be a JSON serialized and
     *            base64 encoded map with string keys and values. The total size
     *            of the <code>requestAttributes</code> and
     *            <code>sessionAttributes</code> headers is limited to 12 KB.
     *            </p>
     *            <p>
     *            The namespace <code>x-amz-lex:</code> is reserved for special
     *            attributes. Don't create any request attributes with the
     *            prefix <code>x-amz-lex:</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html#context-mgmt-request-attribs"
     *            >Setting Request Attributes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PostContentRequest withRequestAttributes(String requestAttributes) {
        this.requestAttributes = requestAttributes;
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
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
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1;
     * is-big-endian=false
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000;
     * frame-size-milliseconds=4
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         You pass this value as the <code>Content-Type</code> HTTP header.
     *         </p>
     *         <p>
     *         Indicates the audio format or text. The header value must start
     *         with one of the following prefixes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PCM format, audio data must be in little-endian byte order.
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
     *         audio/lpcm; sample-rate=8000; sample-size-bits=16;
     *         channel-count=1; is-big-endian=false
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Opus format
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000;
     *         frame-size-milliseconds=4
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Text format
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
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
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1;
     * is-big-endian=false
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000;
     * frame-size-milliseconds=4
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param contentType <p>
     *            You pass this value as the <code>Content-Type</code> HTTP
     *            header.
     *            </p>
     *            <p>
     *            Indicates the audio format or text. The header value must
     *            start with one of the following prefixes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PCM format, audio data must be in little-endian byte order.
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
     *            audio/lpcm; sample-rate=8000; sample-size-bits=16;
     *            channel-count=1; is-big-endian=false
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Opus format
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            audio/x-cbr-opus-with-preamble; preamble-size=0;
     *            bit-rate=256000; frame-size-milliseconds=4
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Text format
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            text/plain; charset=utf-8
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * You pass this value as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one
     * of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format, audio data must be in little-endian byte order.
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
     * audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1;
     * is-big-endian=false
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=256000;
     * frame-size-milliseconds=4
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            You pass this value as the <code>Content-Type</code> HTTP
     *            header.
     *            </p>
     *            <p>
     *            Indicates the audio format or text. The header value must
     *            start with one of the following prefixes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PCM format, audio data must be in little-endian byte order.
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
     *            audio/lpcm; sample-rate=8000; sample-size-bits=16;
     *            channel-count=1; is-big-endian=false
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Opus format
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            audio/x-cbr-opus-with-preamble; preamble-size=0;
     *            bit-rate=256000; frame-size-milliseconds=4
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Text format
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            text/plain; charset=utf-8
     *            </p>
     *            </li>
     *            </ul>
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
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech
     * in the response. Amazon Lex uses Amazon Polly to generate the speech
     * (using the configuration you specified in the <code>Accept</code>
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
     *         If the value begins with <code>audio/</code>, Amazon Lex returns
     *         speech in the response. Amazon Lex uses Amazon Polly to generate
     *         the speech (using the configuration you specified in the
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
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech
     * in the response. Amazon Lex uses Amazon Polly to generate the speech
     * (using the configuration you specified in the <code>Accept</code>
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
     *            If the value begins with <code>audio/</code>, Amazon Lex
     *            returns speech in the response. Amazon Lex uses Amazon Polly
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
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech
     * in the response. Amazon Lex uses Amazon Polly to generate the speech
     * (using the configuration you specified in the <code>Accept</code>
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
     *            If the value begins with <code>audio/</code>, Amazon Lex
     *            returns speech in the response. Amazon Lex uses Amazon Polly
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
     * User input in PCM or Opus audio format or text format as described in the
     * <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer
     * that captures all of the audio data before sending. In general, you get
     * better performance if you stream audio data rather than buffering the
     * data locally.
     * </p>
     *
     * @return <p>
     *         User input in PCM or Opus audio format or text format as
     *         described in the <code>Content-Type</code> HTTP header.
     *         </p>
     *         <p>
     *         You can stream audio data to Amazon Lex or you can create a local
     *         buffer that captures all of the audio data before sending. In
     *         general, you get better performance if you stream audio data
     *         rather than buffering the data locally.
     *         </p>
     */
    public java.io.InputStream getInputStream() {
        return inputStreamValue;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the
     * <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer
     * that captures all of the audio data before sending. In general, you get
     * better performance if you stream audio data rather than buffering the
     * data locally.
     * </p>
     *
     * @param inputStreamValue <p>
     *            User input in PCM or Opus audio format or text format as
     *            described in the <code>Content-Type</code> HTTP header.
     *            </p>
     *            <p>
     *            You can stream audio data to Amazon Lex or you can create a
     *            local buffer that captures all of the audio data before
     *            sending. In general, you get better performance if you stream
     *            audio data rather than buffering the data locally.
     *            </p>
     */
    public void setInputStream(java.io.InputStream inputStreamValue) {
        this.inputStreamValue = inputStreamValue;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the
     * <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * You can stream audio data to Amazon Lex or you can create a local buffer
     * that captures all of the audio data before sending. In general, you get
     * better performance if you stream audio data rather than buffering the
     * data locally.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputStreamValue <p>
     *            User input in PCM or Opus audio format or text format as
     *            described in the <code>Content-Type</code> HTTP header.
     *            </p>
     *            <p>
     *            You can stream audio data to Amazon Lex or you can create a
     *            local buffer that captures all of the audio data before
     *            sending. In general, you get better performance if you stream
     *            audio data rather than buffering the data locally.
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
        if (getRequestAttributes() != null)
            sb.append("requestAttributes: " + getRequestAttributes() + ",");
        if (getContentType() != null)
            sb.append("contentType: " + getContentType() + ",");
        if (getAccept() != null)
            sb.append("accept: " + getAccept() + ",");
        if (getInputStream() != null)
            sb.append("inputStream: " + getInputStream());
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
                + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode
                + ((getInputStream() == null) ? 0 : getInputStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostContentRequest == false)
            return false;
        PostContentRequest other = (PostContentRequest) obj;

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
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null
                && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getInputStream() == null ^ this.getInputStream() == null)
            return false;
        if (other.getInputStream() != null
                && other.getInputStream().equals(this.getInputStream()) == false)
            return false;
        return true;
    }
}
