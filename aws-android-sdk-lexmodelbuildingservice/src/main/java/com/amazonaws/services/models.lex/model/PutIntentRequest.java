/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an intent or replaces an existing intent.
 * </p>
 * <p>
 * To define the interaction between the user and your bot, you use one or more
 * intents. For a pizza ordering bot, for example, you would create an
 * <code>OrderPizza</code> intent.
 * </p>
 * <p>
 * To create an intent or replace an existing intent, you must provide the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Intent name. For example, <code>OrderPizza</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Sample utterances. For example, "Can I order a pizza, please." and
 * "I want to order a pizza."
 * </p>
 * </li>
 * <li>
 * <p>
 * Information to be gathered. You specify slot types for the information that
 * your bot will request from the user. You can specify standard slot types,
 * such as a date or a time, or custom slot types such as the size and crust of
 * a pizza.
 * </p>
 * </li>
 * <li>
 * <p>
 * How the intent will be fulfilled. You can provide a Lambda function or
 * configure the intent to return the intent information to the client
 * application. If you use a Lambda function, when all of the intent information
 * is available, Amazon Lex invokes your Lambda function. If you configure your
 * intent to return the intent information to the client application.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can specify other optional information in the request, such as:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A confirmation prompt to ask the user to confirm an intent. For example,
 * "Shall I order your pizza?"
 * </p>
 * </li>
 * <li>
 * <p>
 * A conclusion statement to send to the user after the intent has been
 * fulfilled. For example, "I placed your pizza order."
 * </p>
 * </li>
 * <li>
 * <p>
 * A follow-up prompt that asks the user for additional activity. For example,
 * asking "Do you want to order a drink with your pizza?"
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify an existing intent name to update the intent, Amazon Lex
 * replaces the values in the <code>$LATEST</code> version of the intent with
 * the values in the request. Amazon Lex removes fields that you don't provide
 * in the request. If you don't specify the required fields, Amazon Lex throws
 * an exception. When you update the <code>$LATEST</code> version of an intent,
 * the <code>status</code> field of any bot that uses the <code>$LATEST</code>
 * version of the intent is set to <code>NOT_BUILT</code>.
 * </p>
 * <p>
 * For more information, see <a>how-it-works</a>.
 * </p>
 * <p>
 * This operation requires permissions for the <code>lex:PutIntent</code>
 * action.
 * </p>
 */
public class PutIntentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name
     * with "AMAZON." removed. For example, because there is a built-in intent
     * called <code>AMAZON.HelpIntent</code>, you can't create a custom intent
     * called <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot
     * values from the user using prompts defined in the slots. For more
     * information, see <a>how-it-works</a>.
     * </p>
     */
    private java.util.List<Slot> slots;

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the
     * intent. For example, "I want {PizzaSize} pizza",
     * "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     */
    private java.util.List<String> sampleUtterances;

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes
     * or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the
     * intent is ready for fulfillment. For example, with the
     * <code>OrderPizza</code> intent, you might want to confirm that the order
     * is correct before placing it. For other intents, such as intents that
     * simply respond to user questions, you might not need to ask the user for
     * confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     */
    private Prompt confirmationPrompt;

    /**
     * <p>
     * When the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     */
    private Statement rejectionStatement;

    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the <code>OrderPizza</code>
     * intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is
     * configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an
     * intent it starts a conversation for the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured
     * for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt
     * again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the
     * <code>conclusionStatement</code> field are mutually exclusive. You can
     * specify only one.
     * </p>
     */
    private FollowUpPrompt followUpPrompt;

    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the
     * intent is successfully fulfilled by the Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the
     * <code>fulfillmentActivity</code>. If you return the intent to the client
     * application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are
     * mutually exclusive. You can specify only one.
     * </p>
     * </note>
     */
    private Statement conclusionStatement;

    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke
     * this Lambda function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your
     * Lambda function might retrieve John's information from a backend database
     * and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot,
     * <code>GlutenIntolerant</code>, to true. You might find John's phone
     * number and set the corresponding session attribute.
     * </p>
     */
    private CodeHook dialogCodeHook;

    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order,
     * <code>fulfillmentActivity</code> defines how the bot places an order with
     * a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to
     * the client application, or direct it to invoke a Lambda function that can
     * process the intent (for example, place an order with a pizzeria).
     * </p>
     */
    private FulfillmentActivity fulfillmentActivity;

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To
     * find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String parentIntentSignature;

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to
     * the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the intent is
     * created. This is the same as calling the <code>CreateIntentVersion</code>
     * operation. If you do not specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     */
    private Boolean createVersion;

    /**
     * <p>
     * Configuration information required to use the
     * <code>AMAZON.KendraSearchIntent</code> intent to connect to an Amazon
     * Kendra index. For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html"
     * > AMAZON.KendraSearchIntent</a>.
     * </p>
     */
    private KendraConfiguration kendraConfiguration;

    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name
     * with "AMAZON." removed. For example, because there is a built-in intent
     * called <code>AMAZON.HelpIntent</code>, you can't create a custom intent
     * called <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the intent. The name is <i>not</i> case sensitive.
     *         </p>
     *         <p>
     *         The name can't match a built-in intent name, or a built-in intent
     *         name with "AMAZON." removed. For example, because there is a
     *         built-in intent called <code>AMAZON.HelpIntent</code>, you can't
     *         create a custom intent called <code>HelpIntent</code>.
     *         </p>
     *         <p>
     *         For a list of built-in intents, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name
     * with "AMAZON." removed. For example, because there is a built-in intent
     * called <code>AMAZON.HelpIntent</code>, you can't create a custom intent
     * called <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the intent. The name is <i>not</i> case sensitive.
     *            </p>
     *            <p>
     *            The name can't match a built-in intent name, or a built-in
     *            intent name with "AMAZON." removed. For example, because there
     *            is a built-in intent called <code>AMAZON.HelpIntent</code>,
     *            you can't create a custom intent called
     *            <code>HelpIntent</code>.
     *            </p>
     *            <p>
     *            For a list of built-in intents, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name
     * with "AMAZON." removed. For example, because there is a built-in intent
     * called <code>AMAZON.HelpIntent</code>, you can't create a custom intent
     * called <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the intent. The name is <i>not</i> case sensitive.
     *            </p>
     *            <p>
     *            The name can't match a built-in intent name, or a built-in
     *            intent name with "AMAZON." removed. For example, because there
     *            is a built-in intent called <code>AMAZON.HelpIntent</code>,
     *            you can't create a custom intent called
     *            <code>HelpIntent</code>.
     *            </p>
     *            <p>
     *            For a list of built-in intents, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the intent.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the intent.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot
     * values from the user using prompts defined in the slots. For more
     * information, see <a>how-it-works</a>.
     * </p>
     *
     * @return <p>
     *         An array of intent slots. At runtime, Amazon Lex elicits required
     *         slot values from the user using prompts defined in the slots. For
     *         more information, see <a>how-it-works</a>.
     *         </p>
     */
    public java.util.List<Slot> getSlots() {
        return slots;
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot
     * values from the user using prompts defined in the slots. For more
     * information, see <a>how-it-works</a>.
     * </p>
     *
     * @param slots <p>
     *            An array of intent slots. At runtime, Amazon Lex elicits
     *            required slot values from the user using prompts defined in
     *            the slots. For more information, see <a>how-it-works</a>.
     *            </p>
     */
    public void setSlots(java.util.Collection<Slot> slots) {
        if (slots == null) {
            this.slots = null;
            return;
        }

        this.slots = new java.util.ArrayList<Slot>(slots);
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot
     * values from the user using prompts defined in the slots. For more
     * information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            An array of intent slots. At runtime, Amazon Lex elicits
     *            required slot values from the user using prompts defined in
     *            the slots. For more information, see <a>how-it-works</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withSlots(Slot... slots) {
        if (getSlots() == null) {
            this.slots = new java.util.ArrayList<Slot>(slots.length);
        }
        for (Slot value : slots) {
            this.slots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot
     * values from the user using prompts defined in the slots. For more
     * information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            An array of intent slots. At runtime, Amazon Lex elicits
     *            required slot values from the user using prompts defined in
     *            the slots. For more information, see <a>how-it-works</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withSlots(java.util.Collection<Slot> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the
     * intent. For example, "I want {PizzaSize} pizza",
     * "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     *
     * @return <p>
     *         An array of utterances (strings) that a user might say to signal
     *         the intent. For example, "I want {PizzaSize} pizza",
     *         "Order {Quantity} {PizzaSize} pizzas".
     *         </p>
     *         <p>
     *         In each utterance, a slot name is enclosed in curly braces.
     *         </p>
     */
    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the
     * intent. For example, "I want {PizzaSize} pizza",
     * "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     *
     * @param sampleUtterances <p>
     *            An array of utterances (strings) that a user might say to
     *            signal the intent. For example, "I want {PizzaSize} pizza",
     *            "Order {Quantity} {PizzaSize} pizzas".
     *            </p>
     *            <p>
     *            In each utterance, a slot name is enclosed in curly braces.
     *            </p>
     */
    public void setSampleUtterances(java.util.Collection<String> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances);
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the
     * intent. For example, "I want {PizzaSize} pizza",
     * "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            An array of utterances (strings) that a user might say to
     *            signal the intent. For example, "I want {PizzaSize} pizza",
     *            "Order {Quantity} {PizzaSize} pizzas".
     *            </p>
     *            <p>
     *            In each utterance, a slot name is enclosed in curly braces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withSampleUtterances(String... sampleUtterances) {
        if (getSampleUtterances() == null) {
            this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances.length);
        }
        for (String value : sampleUtterances) {
            this.sampleUtterances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the
     * intent. For example, "I want {PizzaSize} pizza",
     * "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleUtterances <p>
     *            An array of utterances (strings) that a user might say to
     *            signal the intent. For example, "I want {PizzaSize} pizza",
     *            "Order {Quantity} {PizzaSize} pizzas".
     *            </p>
     *            <p>
     *            In each utterance, a slot name is enclosed in curly braces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes
     * or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the
     * intent is ready for fulfillment. For example, with the
     * <code>OrderPizza</code> intent, you might want to confirm that the order
     * is correct before placing it. For other intents, such as intents that
     * simply respond to user questions, you might not need to ask the user for
     * confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     *
     * @return <p>
     *         Prompts the user to confirm the intent. This question should have
     *         a yes or no answer.
     *         </p>
     *         <p>
     *         Amazon Lex uses this prompt to ensure that the user acknowledges
     *         that the intent is ready for fulfillment. For example, with the
     *         <code>OrderPizza</code> intent, you might want to confirm that
     *         the order is correct before placing it. For other intents, such
     *         as intents that simply respond to user questions, you might not
     *         need to ask the user for confirmation before providing the
     *         information.
     *         </p>
     *         <note>
     *         <p>
     *         You you must provide both the <code>rejectionStatement</code> and
     *         the <code>confirmationPrompt</code>, or neither.
     *         </p>
     *         </note>
     */
    public Prompt getConfirmationPrompt() {
        return confirmationPrompt;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes
     * or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the
     * intent is ready for fulfillment. For example, with the
     * <code>OrderPizza</code> intent, you might want to confirm that the order
     * is correct before placing it. For other intents, such as intents that
     * simply respond to user questions, you might not need to ask the user for
     * confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     *
     * @param confirmationPrompt <p>
     *            Prompts the user to confirm the intent. This question should
     *            have a yes or no answer.
     *            </p>
     *            <p>
     *            Amazon Lex uses this prompt to ensure that the user
     *            acknowledges that the intent is ready for fulfillment. For
     *            example, with the <code>OrderPizza</code> intent, you might
     *            want to confirm that the order is correct before placing it.
     *            For other intents, such as intents that simply respond to user
     *            questions, you might not need to ask the user for confirmation
     *            before providing the information.
     *            </p>
     *            <note>
     *            <p>
     *            You you must provide both the <code>rejectionStatement</code>
     *            and the <code>confirmationPrompt</code>, or neither.
     *            </p>
     *            </note>
     */
    public void setConfirmationPrompt(Prompt confirmationPrompt) {
        this.confirmationPrompt = confirmationPrompt;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes
     * or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the
     * intent is ready for fulfillment. For example, with the
     * <code>OrderPizza</code> intent, you might want to confirm that the order
     * is correct before placing it. For other intents, such as intents that
     * simply respond to user questions, you might not need to ask the user for
     * confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param confirmationPrompt <p>
     *            Prompts the user to confirm the intent. This question should
     *            have a yes or no answer.
     *            </p>
     *            <p>
     *            Amazon Lex uses this prompt to ensure that the user
     *            acknowledges that the intent is ready for fulfillment. For
     *            example, with the <code>OrderPizza</code> intent, you might
     *            want to confirm that the order is correct before placing it.
     *            For other intents, such as intents that simply respond to user
     *            questions, you might not need to ask the user for confirmation
     *            before providing the information.
     *            </p>
     *            <note>
     *            <p>
     *            You you must provide both the <code>rejectionStatement</code>
     *            and the <code>confirmationPrompt</code>, or neither.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withConfirmationPrompt(Prompt confirmationPrompt) {
        this.confirmationPrompt = confirmationPrompt;
        return this;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     *
     * @return <p>
     *         When the user answers "no" to the question defined in
     *         <code>confirmationPrompt</code>, Amazon Lex responds with this
     *         statement to acknowledge that the intent was canceled.
     *         </p>
     *         <note>
     *         <p>
     *         You must provide both the <code>rejectionStatement</code> and the
     *         <code>confirmationPrompt</code>, or neither.
     *         </p>
     *         </note>
     */
    public Statement getRejectionStatement() {
        return rejectionStatement;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     *
     * @param rejectionStatement <p>
     *            When the user answers "no" to the question defined in
     *            <code>confirmationPrompt</code>, Amazon Lex responds with this
     *            statement to acknowledge that the intent was canceled.
     *            </p>
     *            <note>
     *            <p>
     *            You must provide both the <code>rejectionStatement</code> and
     *            the <code>confirmationPrompt</code>, or neither.
     *            </p>
     *            </note>
     */
    public void setRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in
     * <code>confirmationPrompt</code>, Amazon Lex responds with this statement
     * to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the
     * <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectionStatement <p>
     *            When the user answers "no" to the question defined in
     *            <code>confirmationPrompt</code>, Amazon Lex responds with this
     *            statement to acknowledge that the intent was canceled.
     *            </p>
     *            <note>
     *            <p>
     *            You must provide both the <code>rejectionStatement</code> and
     *            the <code>confirmationPrompt</code>, or neither.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
        return this;
    }

    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the <code>OrderPizza</code>
     * intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is
     * configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an
     * intent it starts a conversation for the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured
     * for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt
     * again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the
     * <code>conclusionStatement</code> field are mutually exclusive. You can
     * specify only one.
     * </p>
     *
     * @return <p>
     *         Amazon Lex uses this prompt to solicit additional activity after
     *         fulfilling an intent. For example, after the
     *         <code>OrderPizza</code> intent is fulfilled, you might prompt the
     *         user to order a drink.
     *         </p>
     *         <p>
     *         The action that Amazon Lex takes depends on the user's response,
     *         as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the user says "Yes" it responds with the clarification prompt
     *         that is configured for the bot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         if the user says "Yes" and continues with an utterance that
     *         triggers an intent it starts a conversation for the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the user says "No" it responds with the rejection statement
     *         configured for the the follow-up prompt.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If it doesn't recognize the utterance it repeats the follow-up
     *         prompt again.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The <code>followUpPrompt</code> field and the
     *         <code>conclusionStatement</code> field are mutually exclusive.
     *         You can specify only one.
     *         </p>
     */
    public FollowUpPrompt getFollowUpPrompt() {
        return followUpPrompt;
    }

    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the <code>OrderPizza</code>
     * intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is
     * configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an
     * intent it starts a conversation for the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured
     * for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt
     * again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the
     * <code>conclusionStatement</code> field are mutually exclusive. You can
     * specify only one.
     * </p>
     *
     * @param followUpPrompt <p>
     *            Amazon Lex uses this prompt to solicit additional activity
     *            after fulfilling an intent. For example, after the
     *            <code>OrderPizza</code> intent is fulfilled, you might prompt
     *            the user to order a drink.
     *            </p>
     *            <p>
     *            The action that Amazon Lex takes depends on the user's
     *            response, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the user says "Yes" it responds with the clarification
     *            prompt that is configured for the bot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            if the user says "Yes" and continues with an utterance that
     *            triggers an intent it starts a conversation for the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the user says "No" it responds with the rejection statement
     *            configured for the the follow-up prompt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If it doesn't recognize the utterance it repeats the follow-up
     *            prompt again.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The <code>followUpPrompt</code> field and the
     *            <code>conclusionStatement</code> field are mutually exclusive.
     *            You can specify only one.
     *            </p>
     */
    public void setFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        this.followUpPrompt = followUpPrompt;
    }

    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the <code>OrderPizza</code>
     * intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is
     * configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an
     * intent it starts a conversation for the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured
     * for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt
     * again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the
     * <code>conclusionStatement</code> field are mutually exclusive. You can
     * specify only one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param followUpPrompt <p>
     *            Amazon Lex uses this prompt to solicit additional activity
     *            after fulfilling an intent. For example, after the
     *            <code>OrderPizza</code> intent is fulfilled, you might prompt
     *            the user to order a drink.
     *            </p>
     *            <p>
     *            The action that Amazon Lex takes depends on the user's
     *            response, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the user says "Yes" it responds with the clarification
     *            prompt that is configured for the bot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            if the user says "Yes" and continues with an utterance that
     *            triggers an intent it starts a conversation for the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the user says "No" it responds with the rejection statement
     *            configured for the the follow-up prompt.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If it doesn't recognize the utterance it repeats the follow-up
     *            prompt again.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The <code>followUpPrompt</code> field and the
     *            <code>conclusionStatement</code> field are mutually exclusive.
     *            You can specify only one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        this.followUpPrompt = followUpPrompt;
        return this;
    }

    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the
     * intent is successfully fulfilled by the Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the
     * <code>fulfillmentActivity</code>. If you return the intent to the client
     * application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are
     * mutually exclusive. You can specify only one.
     * </p>
     * </note>
     *
     * @return <p>
     *         The statement that you want Amazon Lex to convey to the user
     *         after the intent is successfully fulfilled by the Lambda
     *         function.
     *         </p>
     *         <p>
     *         This element is relevant only if you provide a Lambda function in
     *         the <code>fulfillmentActivity</code>. If you return the intent to
     *         the client application, you can't specify this element.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>followUpPrompt</code> and
     *         <code>conclusionStatement</code> are mutually exclusive. You can
     *         specify only one.
     *         </p>
     *         </note>
     */
    public Statement getConclusionStatement() {
        return conclusionStatement;
    }

    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the
     * intent is successfully fulfilled by the Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the
     * <code>fulfillmentActivity</code>. If you return the intent to the client
     * application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are
     * mutually exclusive. You can specify only one.
     * </p>
     * </note>
     *
     * @param conclusionStatement <p>
     *            The statement that you want Amazon Lex to convey to the user
     *            after the intent is successfully fulfilled by the Lambda
     *            function.
     *            </p>
     *            <p>
     *            This element is relevant only if you provide a Lambda function
     *            in the <code>fulfillmentActivity</code>. If you return the
     *            intent to the client application, you can't specify this
     *            element.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>followUpPrompt</code> and
     *            <code>conclusionStatement</code> are mutually exclusive. You
     *            can specify only one.
     *            </p>
     *            </note>
     */
    public void setConclusionStatement(Statement conclusionStatement) {
        this.conclusionStatement = conclusionStatement;
    }

    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the
     * intent is successfully fulfilled by the Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the
     * <code>fulfillmentActivity</code>. If you return the intent to the client
     * application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are
     * mutually exclusive. You can specify only one.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conclusionStatement <p>
     *            The statement that you want Amazon Lex to convey to the user
     *            after the intent is successfully fulfilled by the Lambda
     *            function.
     *            </p>
     *            <p>
     *            This element is relevant only if you provide a Lambda function
     *            in the <code>fulfillmentActivity</code>. If you return the
     *            intent to the client application, you can't specify this
     *            element.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>followUpPrompt</code> and
     *            <code>conclusionStatement</code> are mutually exclusive. You
     *            can specify only one.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withConclusionStatement(Statement conclusionStatement) {
        this.conclusionStatement = conclusionStatement;
        return this;
    }

    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke
     * this Lambda function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your
     * Lambda function might retrieve John's information from a backend database
     * and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot,
     * <code>GlutenIntolerant</code>, to true. You might find John's phone
     * number and set the corresponding session attribute.
     * </p>
     *
     * @return <p>
     *         Specifies a Lambda function to invoke for each user input. You
     *         can invoke this Lambda function to personalize user interaction.
     *         </p>
     *         <p>
     *         For example, suppose your bot determines that the user is John.
     *         Your Lambda function might retrieve John's information from a
     *         backend database and prepopulate some of the values. For example,
     *         if you find that John is gluten intolerant, you might set the
     *         corresponding intent slot, <code>GlutenIntolerant</code>, to
     *         true. You might find John's phone number and set the
     *         corresponding session attribute.
     *         </p>
     */
    public CodeHook getDialogCodeHook() {
        return dialogCodeHook;
    }

    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke
     * this Lambda function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your
     * Lambda function might retrieve John's information from a backend database
     * and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot,
     * <code>GlutenIntolerant</code>, to true. You might find John's phone
     * number and set the corresponding session attribute.
     * </p>
     *
     * @param dialogCodeHook <p>
     *            Specifies a Lambda function to invoke for each user input. You
     *            can invoke this Lambda function to personalize user
     *            interaction.
     *            </p>
     *            <p>
     *            For example, suppose your bot determines that the user is
     *            John. Your Lambda function might retrieve John's information
     *            from a backend database and prepopulate some of the values.
     *            For example, if you find that John is gluten intolerant, you
     *            might set the corresponding intent slot,
     *            <code>GlutenIntolerant</code>, to true. You might find John's
     *            phone number and set the corresponding session attribute.
     *            </p>
     */
    public void setDialogCodeHook(CodeHook dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
    }

    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke
     * this Lambda function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your
     * Lambda function might retrieve John's information from a backend database
     * and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot,
     * <code>GlutenIntolerant</code>, to true. You might find John's phone
     * number and set the corresponding session attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dialogCodeHook <p>
     *            Specifies a Lambda function to invoke for each user input. You
     *            can invoke this Lambda function to personalize user
     *            interaction.
     *            </p>
     *            <p>
     *            For example, suppose your bot determines that the user is
     *            John. Your Lambda function might retrieve John's information
     *            from a backend database and prepopulate some of the values.
     *            For example, if you find that John is gluten intolerant, you
     *            might set the corresponding intent slot,
     *            <code>GlutenIntolerant</code>, to true. You might find John's
     *            phone number and set the corresponding session attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withDialogCodeHook(CodeHook dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
        return this;
    }

    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order,
     * <code>fulfillmentActivity</code> defines how the bot places an order with
     * a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to
     * the client application, or direct it to invoke a Lambda function that can
     * process the intent (for example, place an order with a pizzeria).
     * </p>
     *
     * @return <p>
     *         Required. Describes how the intent is fulfilled. For example,
     *         after a user provides all of the information for a pizza order,
     *         <code>fulfillmentActivity</code> defines how the bot places an
     *         order with a local pizza store.
     *         </p>
     *         <p>
     *         You might configure Amazon Lex to return all of the intent
     *         information to the client application, or direct it to invoke a
     *         Lambda function that can process the intent (for example, place
     *         an order with a pizzeria).
     *         </p>
     */
    public FulfillmentActivity getFulfillmentActivity() {
        return fulfillmentActivity;
    }

    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order,
     * <code>fulfillmentActivity</code> defines how the bot places an order with
     * a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to
     * the client application, or direct it to invoke a Lambda function that can
     * process the intent (for example, place an order with a pizzeria).
     * </p>
     *
     * @param fulfillmentActivity <p>
     *            Required. Describes how the intent is fulfilled. For example,
     *            after a user provides all of the information for a pizza
     *            order, <code>fulfillmentActivity</code> defines how the bot
     *            places an order with a local pizza store.
     *            </p>
     *            <p>
     *            You might configure Amazon Lex to return all of the intent
     *            information to the client application, or direct it to invoke
     *            a Lambda function that can process the intent (for example,
     *            place an order with a pizzeria).
     *            </p>
     */
    public void setFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        this.fulfillmentActivity = fulfillmentActivity;
    }

    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order,
     * <code>fulfillmentActivity</code> defines how the bot places an order with
     * a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to
     * the client application, or direct it to invoke a Lambda function that can
     * process the intent (for example, place an order with a pizzeria).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fulfillmentActivity <p>
     *            Required. Describes how the intent is fulfilled. For example,
     *            after a user provides all of the information for a pizza
     *            order, <code>fulfillmentActivity</code> defines how the bot
     *            places an order with a local pizza store.
     *            </p>
     *            <p>
     *            You might configure Amazon Lex to return all of the intent
     *            information to the client application, or direct it to invoke
     *            a Lambda function that can process the intent (for example,
     *            place an order with a pizzeria).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        this.fulfillmentActivity = fulfillmentActivity;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To
     * find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the built-in intent to base this intent
     *         on. To find the signature for an intent, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *         </p>
     */
    public String getParentIntentSignature() {
        return parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To
     * find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     *
     * @param parentIntentSignature <p>
     *            A unique identifier for the built-in intent to base this
     *            intent on. To find the signature for an intent, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     */
    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To
     * find the signature for an intent, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentIntentSignature <p>
     *            A unique identifier for the built-in intent to base this
     *            intent on. To find the signature for an intent, see <a href=
     *            "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *            >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to
     * the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @return <p>
     *         Identifies a specific revision of the <code>$LATEST</code>
     *         version.
     *         </p>
     *         <p>
     *         When you create a new intent, leave the <code>checksum</code>
     *         field blank. If you specify a checksum you get a
     *         <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a intent, set the <code>checksum</code>
     *         field to the checksum of the most recent revision of the
     *         <code>$LATEST</code> version. If you don't specify the
     *         <code> checksum</code> field, or if the checksum does not match
     *         the <code>$LATEST</code> version, you get a
     *         <code>PreconditionFailedException</code> exception.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to
     * the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version.
     *            </p>
     *            <p>
     *            When you create a new intent, leave the <code>checksum</code>
     *            field blank. If you specify a checksum you get a
     *            <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a intent, set the
     *            <code>checksum</code> field to the checksum of the most recent
     *            revision of the <code>$LATEST</code> version. If you don't
     *            specify the <code> checksum</code> field, or if the checksum
     *            does not match the <code>$LATEST</code> version, you get a
     *            <code>PreconditionFailedException</code> exception.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field
     * blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to
     * the checksum of the most recent revision of the <code>$LATEST</code>
     * version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version.
     *            </p>
     *            <p>
     *            When you create a new intent, leave the <code>checksum</code>
     *            field blank. If you specify a checksum you get a
     *            <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a intent, set the
     *            <code>checksum</code> field to the checksum of the most recent
     *            revision of the <code>$LATEST</code> version. If you don't
     *            specify the <code> checksum</code> field, or if the checksum
     *            does not match the <code>$LATEST</code> version, you get a
     *            <code>PreconditionFailedException</code> exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the intent is
     * created. This is the same as calling the <code>CreateIntentVersion</code>
     * operation. If you do not specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> a new numbered version of the
     *         intent is created. This is the same as calling the
     *         <code>CreateIntentVersion</code> operation. If you do not specify
     *         <code>createVersion</code>, the default is <code>false</code>.
     *         </p>
     */
    public Boolean isCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the intent is
     * created. This is the same as calling the <code>CreateIntentVersion</code>
     * operation. If you do not specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> a new numbered version of the
     *         intent is created. This is the same as calling the
     *         <code>CreateIntentVersion</code> operation. If you do not specify
     *         <code>createVersion</code>, the default is <code>false</code>.
     *         </p>
     */
    public Boolean getCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the intent is
     * created. This is the same as calling the <code>CreateIntentVersion</code>
     * operation. If you do not specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     *
     * @param createVersion <p>
     *            When set to <code>true</code> a new numbered version of the
     *            intent is created. This is the same as calling the
     *            <code>CreateIntentVersion</code> operation. If you do not
     *            specify <code>createVersion</code>, the default is
     *            <code>false</code>.
     *            </p>
     */
    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the intent is
     * created. This is the same as calling the <code>CreateIntentVersion</code>
     * operation. If you do not specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createVersion <p>
     *            When set to <code>true</code> a new numbered version of the
     *            intent is created. This is the same as calling the
     *            <code>CreateIntentVersion</code> operation. If you do not
     *            specify <code>createVersion</code>, the default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
        return this;
    }

    /**
     * <p>
     * Configuration information required to use the
     * <code>AMAZON.KendraSearchIntent</code> intent to connect to an Amazon
     * Kendra index. For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html"
     * > AMAZON.KendraSearchIntent</a>.
     * </p>
     *
     * @return <p>
     *         Configuration information required to use the
     *         <code>AMAZON.KendraSearchIntent</code> intent to connect to an
     *         Amazon Kendra index. For more information, see <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html"
     *         > AMAZON.KendraSearchIntent</a>.
     *         </p>
     */
    public KendraConfiguration getKendraConfiguration() {
        return kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information required to use the
     * <code>AMAZON.KendraSearchIntent</code> intent to connect to an Amazon
     * Kendra index. For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html"
     * > AMAZON.KendraSearchIntent</a>.
     * </p>
     *
     * @param kendraConfiguration <p>
     *            Configuration information required to use the
     *            <code>AMAZON.KendraSearchIntent</code> intent to connect to an
     *            Amazon Kendra index. For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html"
     *            > AMAZON.KendraSearchIntent</a>.
     *            </p>
     */
    public void setKendraConfiguration(KendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information required to use the
     * <code>AMAZON.KendraSearchIntent</code> intent to connect to an Amazon
     * Kendra index. For more information, see <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html"
     * > AMAZON.KendraSearchIntent</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kendraConfiguration <p>
     *            Configuration information required to use the
     *            <code>AMAZON.KendraSearchIntent</code> intent to connect to an
     *            Amazon Kendra index. For more information, see <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/built-in-intent-kendra-search.html"
     *            > AMAZON.KendraSearchIntent</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIntentRequest withKendraConfiguration(KendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getSlots() != null)
            sb.append("slots: " + getSlots() + ",");
        if (getSampleUtterances() != null)
            sb.append("sampleUtterances: " + getSampleUtterances() + ",");
        if (getConfirmationPrompt() != null)
            sb.append("confirmationPrompt: " + getConfirmationPrompt() + ",");
        if (getRejectionStatement() != null)
            sb.append("rejectionStatement: " + getRejectionStatement() + ",");
        if (getFollowUpPrompt() != null)
            sb.append("followUpPrompt: " + getFollowUpPrompt() + ",");
        if (getConclusionStatement() != null)
            sb.append("conclusionStatement: " + getConclusionStatement() + ",");
        if (getDialogCodeHook() != null)
            sb.append("dialogCodeHook: " + getDialogCodeHook() + ",");
        if (getFulfillmentActivity() != null)
            sb.append("fulfillmentActivity: " + getFulfillmentActivity() + ",");
        if (getParentIntentSignature() != null)
            sb.append("parentIntentSignature: " + getParentIntentSignature() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getCreateVersion() != null)
            sb.append("createVersion: " + getCreateVersion() + ",");
        if (getKendraConfiguration() != null)
            sb.append("kendraConfiguration: " + getKendraConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode
                + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode
                + ((getConfirmationPrompt() == null) ? 0 : getConfirmationPrompt().hashCode());
        hashCode = prime * hashCode
                + ((getRejectionStatement() == null) ? 0 : getRejectionStatement().hashCode());
        hashCode = prime * hashCode
                + ((getFollowUpPrompt() == null) ? 0 : getFollowUpPrompt().hashCode());
        hashCode = prime * hashCode
                + ((getConclusionStatement() == null) ? 0 : getConclusionStatement().hashCode());
        hashCode = prime * hashCode
                + ((getDialogCodeHook() == null) ? 0 : getDialogCodeHook().hashCode());
        hashCode = prime * hashCode
                + ((getFulfillmentActivity() == null) ? 0 : getFulfillmentActivity().hashCode());
        hashCode = prime
                * hashCode
                + ((getParentIntentSignature() == null) ? 0 : getParentIntentSignature().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode
                + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        hashCode = prime * hashCode
                + ((getKendraConfiguration() == null) ? 0 : getKendraConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIntentRequest == false)
            return false;
        PutIntentRequest other = (PutIntentRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null
                && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getConfirmationPrompt() == null ^ this.getConfirmationPrompt() == null)
            return false;
        if (other.getConfirmationPrompt() != null
                && other.getConfirmationPrompt().equals(this.getConfirmationPrompt()) == false)
            return false;
        if (other.getRejectionStatement() == null ^ this.getRejectionStatement() == null)
            return false;
        if (other.getRejectionStatement() != null
                && other.getRejectionStatement().equals(this.getRejectionStatement()) == false)
            return false;
        if (other.getFollowUpPrompt() == null ^ this.getFollowUpPrompt() == null)
            return false;
        if (other.getFollowUpPrompt() != null
                && other.getFollowUpPrompt().equals(this.getFollowUpPrompt()) == false)
            return false;
        if (other.getConclusionStatement() == null ^ this.getConclusionStatement() == null)
            return false;
        if (other.getConclusionStatement() != null
                && other.getConclusionStatement().equals(this.getConclusionStatement()) == false)
            return false;
        if (other.getDialogCodeHook() == null ^ this.getDialogCodeHook() == null)
            return false;
        if (other.getDialogCodeHook() != null
                && other.getDialogCodeHook().equals(this.getDialogCodeHook()) == false)
            return false;
        if (other.getFulfillmentActivity() == null ^ this.getFulfillmentActivity() == null)
            return false;
        if (other.getFulfillmentActivity() != null
                && other.getFulfillmentActivity().equals(this.getFulfillmentActivity()) == false)
            return false;
        if (other.getParentIntentSignature() == null ^ this.getParentIntentSignature() == null)
            return false;
        if (other.getParentIntentSignature() != null
                && other.getParentIntentSignature().equals(this.getParentIntentSignature()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null
                && other.getCreateVersion().equals(this.getCreateVersion()) == false)
            return false;
        if (other.getKendraConfiguration() == null ^ this.getKendraConfiguration() == null)
            return false;
        if (other.getKendraConfiguration() != null
                && other.getKendraConfiguration().equals(this.getKendraConfiguration()) == false)
            return false;
        return true;
    }
}
