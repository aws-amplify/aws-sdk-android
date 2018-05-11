/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Sends user input (text-only) to Amazon Lex. Client applications can use this
 * API to send requests to Amazon Lex at runtime. Amazon Lex then interprets the
 * user input using the machine learning model it built for the bot.
 * </p>
 * <p>
 * In response, Amazon Lex returns the next <code>message</code> to convey to
 * the user an optional <code>responseCard</code> to display. Consider the
 * following example messages:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a user input "I would like a pizza", Amazon Lex might return a response
 * with a message eliciting slot data (for example, PizzaSize):
 * "What size pizza would you like?"
 * </p>
 * </li>
 * <li>
 * <p>
 * After the user provides all of the pizza order information, Amazon Lex might
 * return a response with a message to obtain user confirmation
 * "Proceed with the pizza order?".
 * </p>
 * </li>
 * <li>
 * <p>
 * After the user replies to a confirmation prompt with a "yes", Amazon Lex
 * might return a conclusion statement:
 * "Thank you, your cheese pizza has been ordered.".
 * </p>
 * </li>
 * </ul>
 * <p>
 * Not all Amazon Lex messages require a user response. For example, a
 * conclusion statement does not require a response. Some messages require only
 * a "yes" or "no" user response. In addition to the <code>message</code>,
 * Amazon Lex provides additional context about the message in the response that
 * you might use to enhance client behavior, for example, to display the
 * appropriate client user interface. These are the <code>slotToElicit</code>,
 * <code>dialogState</code>, <code>intentName</code>, and <code>slots</code>
 * fields in the response. Consider the following examples:
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
 * <code>dialogState</code> set to ElicitSlot
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>intentName</code> set to the intent name in the current context
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>slotToElicit</code> set to the slot name for which the
 * <code>message</code> is eliciting information
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>slots</code> set to a map of slots, configured for the intent, with
 * currently known values
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * If the message is a confirmation prompt, the <code>dialogState</code> is set
 * to ConfirmIntent and <code>SlotToElicit</code> is set to null.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the message is a clarification prompt (configured for the intent) that
 * indicates that user intent is not understood, the <code>dialogState</code> is
 * set to ElicitIntent and <code>slotToElicit</code> is set to null.
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
public class PostTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     */
    private String botName;

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     */
    private String botAlias;

    /**
     * <p>
     * The ID of the client application user. The application developer decides
     * the user IDs. At runtime, each request must include the user ID.
     * Typically, each of your application users should have a unique ID. Note
     * the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the
     * conversation on another device, you might choose a user-specific
     * identifier, such as a login or Amazon Cognito user ID (assuming your
     * application is using Amazon Cognito).
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
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     */
    private String userId;

    /**
     * <p>
     * By using session attributes, a client application can pass contextual
     * information in the request to Amazon Lex For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the
     * <code>price</code> session attribute to maintain the price of the flowers
     * ordered (for example, "Price":25). The code hook (the Lambda function)
     * sets this attribute based on the type of flowers ordered. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     * >Review the Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the
     * <code>currentReservation</code> session attribute to maintain slot data
     * during the in-progress conversation to book a hotel or book a car. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     * >Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the
     * requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions
     * configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for
     * initialization and customization (prompts and response cards). Some
     * examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user
     * location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function
     * might use this information to determine the closest pizzeria to place the
     * order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to
     * the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user
     * name as a session attribute (<code>"FirstName" : "Joe"</code>) so that
     * Amazon Lex can substitute the placeholder to provide a personalize prompt
     * to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the
     * incoming session attributes to the Lambda function. If you want Amazon
     * Lex to return these session attributes back to the client, the Lambda
     * function must return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply
     * returns the session attributes back to the client application.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> sessionAttributes;

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String inputText;

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon Lex bot.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botName <p>
     *            The name of the Amazon Lex bot.
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
     * The alias of the Amazon Lex bot.
     * </p>
     *
     * @return <p>
     *         The alias of the Amazon Lex bot.
     *         </p>
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     *
     * @param botAlias <p>
     *            The alias of the Amazon Lex bot.
     *            </p>
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botAlias <p>
     *            The alias of the Amazon Lex bot.
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
     * The ID of the client application user. The application developer decides
     * the user IDs. At runtime, each request must include the user ID.
     * Typically, each of your application users should have a unique ID. Note
     * the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the
     * conversation on another device, you might choose a user-specific
     * identifier, such as a login or Amazon Cognito user ID (assuming your
     * application is using Amazon Cognito).
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
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @return <p>
     *         The ID of the client application user. The application developer
     *         decides the user IDs. At runtime, each request must include the
     *         user ID. Typically, each of your application users should have a
     *         unique ID. Note the following considerations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you want a user to start a conversation on one device and
     *         continue the conversation on another device, you might choose a
     *         user-specific identifier, such as a login or Amazon Cognito user
     *         ID (assuming your application is using Amazon Cognito).
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
     * The ID of the client application user. The application developer decides
     * the user IDs. At runtime, each request must include the user ID.
     * Typically, each of your application users should have a unique ID. Note
     * the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the
     * conversation on another device, you might choose a user-specific
     * identifier, such as a login or Amazon Cognito user ID (assuming your
     * application is using Amazon Cognito).
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
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user. The application
     *            developer decides the user IDs. At runtime, each request must
     *            include the user ID. Typically, each of your application users
     *            should have a unique ID. Note the following considerations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you want a user to start a conversation on one device and
     *            continue the conversation on another device, you might choose
     *            a user-specific identifier, such as a login or Amazon Cognito
     *            user ID (assuming your application is using Amazon Cognito).
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
     * The ID of the client application user. The application developer decides
     * the user IDs. At runtime, each request must include the user ID.
     * Typically, each of your application users should have a unique ID. Note
     * the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the
     * conversation on another device, you might choose a user-specific
     * identifier, such as a login or Amazon Cognito user ID (assuming your
     * application is using Amazon Cognito).
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
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user. The application
     *            developer decides the user IDs. At runtime, each request must
     *            include the user ID. Typically, each of your application users
     *            should have a unique ID. Note the following considerations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you want a user to start a conversation on one device and
     *            continue the conversation on another device, you might choose
     *            a user-specific identifier, such as a login or Amazon Cognito
     *            user ID (assuming your application is using Amazon Cognito).
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
     * By using session attributes, a client application can pass contextual
     * information in the request to Amazon Lex For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the
     * <code>price</code> session attribute to maintain the price of the flowers
     * ordered (for example, "Price":25). The code hook (the Lambda function)
     * sets this attribute based on the type of flowers ordered. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     * >Review the Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the
     * <code>currentReservation</code> session attribute to maintain slot data
     * during the in-progress conversation to book a hotel or book a car. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     * >Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the
     * requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions
     * configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for
     * initialization and customization (prompts and response cards). Some
     * examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user
     * location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function
     * might use this information to determine the closest pizzeria to place the
     * order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to
     * the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user
     * name as a session attribute (<code>"FirstName" : "Joe"</code>) so that
     * Amazon Lex can substitute the placeholder to provide a personalize prompt
     * to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the
     * incoming session attributes to the Lambda function. If you want Amazon
     * Lex to return these session attributes back to the client, the Lambda
     * function must return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply
     * returns the session attributes back to the client application.
     * </p>
     * </note>
     *
     * @return <p>
     *         By using session attributes, a client application can pass
     *         contextual information in the request to Amazon Lex For example,
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Getting Started Exercise 1, the example bot uses the
     *         <code>price</code> session attribute to maintain the price of the
     *         flowers ordered (for example, "Price":25). The code hook (the
     *         Lambda function) sets this attribute based on the type of flowers
     *         ordered. For more information, see <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     *         >Review the Details of Information Flow</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the BookTrip bot exercise, the bot uses the
     *         <code>currentReservation</code> session attribute to maintain
     *         slot data during the in-progress conversation to book a hotel or
     *         book a car. For more information, see <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     *         >Details of Information Flow</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You might use the session attributes (key, value pairs) to track
     *         the requestID of user requests.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Amazon Lex simply passes these session attributes to the Lambda
     *         functions configured for the intent.
     *         </p>
     *         <p>
     *         In your Lambda function, you can also use the session attributes
     *         for initialization and customization (prompts and response
     *         cards). Some examples are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Initialization - In a pizza ordering bot, if you can pass the
     *         user location as a session attribute (for example,
     *         <code>"Location" : "111 Maple street"</code>), then your Lambda
     *         function might use this information to determine the closest
     *         pizzeria to place the order (perhaps to set the storeAddress slot
     *         value).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Personalize prompts - For example, you can configure prompts to
     *         refer to the user name. (For example,
     *         "Hey [FirstName], what toppings would you like?"). You can pass
     *         the user name as a session attribute (
     *         <code>"FirstName" : "Joe"</code>) so that Amazon Lex can
     *         substitute the placeholder to provide a personalize prompt to the
     *         user ("Hey Joe, what toppings would you like?").
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Amazon Lex does not persist session attributes.
     *         </p>
     *         <p>
     *         If you configure a code hook for the intent, Amazon Lex passes
     *         the incoming session attributes to the Lambda function. If you
     *         want Amazon Lex to return these session attributes back to the
     *         client, the Lambda function must return them.
     *         </p>
     *         <p>
     *         If there is no code hook configured for the intent, Amazon Lex
     *         simply returns the session attributes back to the client
     *         application.
     *         </p>
     *         </note>
     */
    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * By using session attributes, a client application can pass contextual
     * information in the request to Amazon Lex For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the
     * <code>price</code> session attribute to maintain the price of the flowers
     * ordered (for example, "Price":25). The code hook (the Lambda function)
     * sets this attribute based on the type of flowers ordered. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     * >Review the Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the
     * <code>currentReservation</code> session attribute to maintain slot data
     * during the in-progress conversation to book a hotel or book a car. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     * >Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the
     * requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions
     * configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for
     * initialization and customization (prompts and response cards). Some
     * examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user
     * location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function
     * might use this information to determine the closest pizzeria to place the
     * order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to
     * the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user
     * name as a session attribute (<code>"FirstName" : "Joe"</code>) so that
     * Amazon Lex can substitute the placeholder to provide a personalize prompt
     * to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the
     * incoming session attributes to the Lambda function. If you want Amazon
     * Lex to return these session attributes back to the client, the Lambda
     * function must return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply
     * returns the session attributes back to the client application.
     * </p>
     * </note>
     *
     * @param sessionAttributes <p>
     *            By using session attributes, a client application can pass
     *            contextual information in the request to Amazon Lex For
     *            example,
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Getting Started Exercise 1, the example bot uses the
     *            <code>price</code> session attribute to maintain the price of
     *            the flowers ordered (for example, "Price":25). The code hook
     *            (the Lambda function) sets this attribute based on the type of
     *            flowers ordered. For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     *            >Review the Details of Information Flow</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the BookTrip bot exercise, the bot uses the
     *            <code>currentReservation</code> session attribute to maintain
     *            slot data during the in-progress conversation to book a hotel
     *            or book a car. For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     *            >Details of Information Flow</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You might use the session attributes (key, value pairs) to
     *            track the requestID of user requests.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Amazon Lex simply passes these session attributes to the
     *            Lambda functions configured for the intent.
     *            </p>
     *            <p>
     *            In your Lambda function, you can also use the session
     *            attributes for initialization and customization (prompts and
     *            response cards). Some examples are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Initialization - In a pizza ordering bot, if you can pass the
     *            user location as a session attribute (for example,
     *            <code>"Location" : "111 Maple street"</code>), then your
     *            Lambda function might use this information to determine the
     *            closest pizzeria to place the order (perhaps to set the
     *            storeAddress slot value).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Personalize prompts - For example, you can configure prompts
     *            to refer to the user name. (For example,
     *            "Hey [FirstName], what toppings would you like?"). You can
     *            pass the user name as a session attribute (
     *            <code>"FirstName" : "Joe"</code>) so that Amazon Lex can
     *            substitute the placeholder to provide a personalize prompt to
     *            the user ("Hey Joe, what toppings would you like?").
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Amazon Lex does not persist session attributes.
     *            </p>
     *            <p>
     *            If you configure a code hook for the intent, Amazon Lex passes
     *            the incoming session attributes to the Lambda function. If you
     *            want Amazon Lex to return these session attributes back to the
     *            client, the Lambda function must return them.
     *            </p>
     *            <p>
     *            If there is no code hook configured for the intent, Amazon Lex
     *            simply returns the session attributes back to the client
     *            application.
     *            </p>
     *            </note>
     */
    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * By using session attributes, a client application can pass contextual
     * information in the request to Amazon Lex For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the
     * <code>price</code> session attribute to maintain the price of the flowers
     * ordered (for example, "Price":25). The code hook (the Lambda function)
     * sets this attribute based on the type of flowers ordered. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     * >Review the Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the
     * <code>currentReservation</code> session attribute to maintain slot data
     * during the in-progress conversation to book a hotel or book a car. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     * >Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the
     * requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions
     * configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for
     * initialization and customization (prompts and response cards). Some
     * examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user
     * location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function
     * might use this information to determine the closest pizzeria to place the
     * order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to
     * the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user
     * name as a session attribute (<code>"FirstName" : "Joe"</code>) so that
     * Amazon Lex can substitute the placeholder to provide a personalize prompt
     * to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the
     * incoming session attributes to the Lambda function. If you want Amazon
     * Lex to return these session attributes back to the client, the Lambda
     * function must return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply
     * returns the session attributes back to the client application.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            By using session attributes, a client application can pass
     *            contextual information in the request to Amazon Lex For
     *            example,
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            In Getting Started Exercise 1, the example bot uses the
     *            <code>price</code> session attribute to maintain the price of
     *            the flowers ordered (for example, "Price":25). The code hook
     *            (the Lambda function) sets this attribute based on the type of
     *            flowers ordered. For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     *            >Review the Details of Information Flow</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the BookTrip bot exercise, the bot uses the
     *            <code>currentReservation</code> session attribute to maintain
     *            slot data during the in-progress conversation to book a hotel
     *            or book a car. For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     *            >Details of Information Flow</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You might use the session attributes (key, value pairs) to
     *            track the requestID of user requests.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Amazon Lex simply passes these session attributes to the
     *            Lambda functions configured for the intent.
     *            </p>
     *            <p>
     *            In your Lambda function, you can also use the session
     *            attributes for initialization and customization (prompts and
     *            response cards). Some examples are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Initialization - In a pizza ordering bot, if you can pass the
     *            user location as a session attribute (for example,
     *            <code>"Location" : "111 Maple street"</code>), then your
     *            Lambda function might use this information to determine the
     *            closest pizzeria to place the order (perhaps to set the
     *            storeAddress slot value).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Personalize prompts - For example, you can configure prompts
     *            to refer to the user name. (For example,
     *            "Hey [FirstName], what toppings would you like?"). You can
     *            pass the user name as a session attribute (
     *            <code>"FirstName" : "Joe"</code>) so that Amazon Lex can
     *            substitute the placeholder to provide a personalize prompt to
     *            the user ("Hey Joe, what toppings would you like?").
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Amazon Lex does not persist session attributes.
     *            </p>
     *            <p>
     *            If you configure a code hook for the intent, Amazon Lex passes
     *            the incoming session attributes to the Lambda function. If you
     *            want Amazon Lex to return these session attributes back to the
     *            client, the Lambda function must return them.
     *            </p>
     *            <p>
     *            If there is no code hook configured for the intent, Amazon Lex
     *            simply returns the session attributes back to the client
     *            application.
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
     * By using session attributes, a client application can pass contextual
     * information in the request to Amazon Lex For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the
     * <code>price</code> session attribute to maintain the price of the flowers
     * ordered (for example, "Price":25). The code hook (the Lambda function)
     * sets this attribute based on the type of flowers ordered. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html"
     * >Review the Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the
     * <code>currentReservation</code> session attribute to maintain slot data
     * during the in-progress conversation to book a hotel or book a car. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html"
     * >Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the
     * requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions
     * configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for
     * initialization and customization (prompts and response cards). Some
     * examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user
     * location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function
     * might use this information to determine the closest pizzeria to place the
     * order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to
     * the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user
     * name as a session attribute (<code>"FirstName" : "Joe"</code>) so that
     * Amazon Lex can substitute the placeholder to provide a personalize prompt
     * to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the
     * incoming session attributes to the Lambda function. If you want Amazon
     * Lex to return these session attributes back to the client, the Lambda
     * function must return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply
     * returns the session attributes back to the client application.
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
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The text that the user entered (Amazon Lex interprets this text).
     *         </p>
     */
    public String getInputText() {
        return inputText;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param inputText <p>
     *            The text that the user entered (Amazon Lex interprets this
     *            text).
     *            </p>
     */
    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param inputText <p>
     *            The text that the user entered (Amazon Lex interprets this
     *            text).
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
