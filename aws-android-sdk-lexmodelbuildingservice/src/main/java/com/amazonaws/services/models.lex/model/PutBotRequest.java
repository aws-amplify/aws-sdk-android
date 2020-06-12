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
 * Creates an Amazon Lex conversational bot or replaces an existing bot. When
 * you create or update a bot you are only required to specify a name, a locale,
 * and whether the bot is directed toward children under age 13. You can use
 * this to add intents later, or to remove intents from an existing bot. When
 * you create a bot with the minimum information, the bot is created or updated
 * but Amazon Lex returns the <code/> response <code>FAILED</code>. You can
 * build the bot after you add one or more intents. For more information about
 * Amazon Lex bots, see <a>how-it-works</a>.
 * </p>
 * <p>
 * If you specify the name of an existing bot, the fields in the request replace
 * the existing values in the <code>$LATEST</code> version of the bot. Amazon
 * Lex removes any fields that you don't provide values for in the request,
 * except for the <code>idleTTLInSeconds</code> and <code>privacySettings</code>
 * fields, which are set to their default values. If you don't specify values
 * for required fields, Amazon Lex throws an exception.
 * </p>
 * <p>
 * This operation requires permissions for the <code>lex:PutBot</code> action.
 * For more information, see <a>security-iam</a>.
 * </p>
 */
public class PutBotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command
     * that a user can express. For example, a pizza ordering bot might support
     * an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     */
    private java.util.List<Intent> intents;

    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this
     * message to get clarification. To specify how many times Amazon Lex should
     * repeat the clarification prompt, use the <code>maxAttempts</code> field.
     * If Amazon Lex still doesn't understand, it sends the message in the
     * <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the
     * correct response from the user. for example, for a bot that orders pizza
     * and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the
     * clarification prompt is repeated the number of times defined in the
     * <code>maxAttempts</code> field. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will
     * return a 400 Bad Request exception in three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does
     * not provide an intent. For example, in response to a follow-up prompt
     * that says "Would you like anything else today?" the user says "Yes."
     * Amazon Lex will return a 400 Bad Request exception because it does not
     * have a clarification prompt to send to the user to get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an
     * <code>ElicitIntent</code> dialog type. Since Amazon Lex does not have a
     * clarification prompt to get an intent from the user, it returns a 400 Bad
     * Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation,
     * you send an <code>ElicitIntent</code> dialog type. Since Amazon Lex does
     * not have a clarification prompt to get an intent from the user, it
     * returns a 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     */
    private Prompt clarificationPrompt;

    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to
     * elicit the information a few times. After that, Amazon Lex sends the
     * message defined in <code>abortStatement</code> to the user, and then
     * aborts the conversation. To set the number of retries, use the
     * <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user
     * "What type of crust would you like?" If the user's response is not one of
     * the expected responses (for example, "thin crust, "deep dish," etc.),
     * Amazon Lex tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code>
     * might be one of the intents. This intent might require the
     * <code>CrustType</code> slot. You specify the
     * <code>valueElicitationPrompt</code> field when you create the
     * <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the abort statement will not be
     * sent to the user, the fallback intent is used instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     */
    private Statement abortStatement;

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in
     * a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time
     * specified. If no conversation occurs during this time, the session
     * expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets
     * sidetracked halfway through placing an order. If the user doesn't
     * complete the order within the specified time, Amazon Lex discards the
     * slot information that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in
     * a <code>PutBot</code> operation request, Amazon Lex uses the default
     * value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     */
    private Integer idleSessionTTLInSeconds;

    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice
     * interactions with the user. The locale configured for the voice must
     * match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices
     * in Amazon Polly</a> in the <i>Amazon Polly Developer Guide</i>.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot, leave the <code>checksum</code> field blank.
     * If you specify a checksum you get a <code>BadRequestException</code>
     * exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the
     * checksum of the most recent revision of the <code>$LATEST</code> version.
     * If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>
     * , Amazon Lex builds the bot so that it can be run. If you set the element
     * to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAVE, BUILD
     */
    private String processBehavior;

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must
     * be compatible with the locale of the bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     */
    private String locale;

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     */
    private Boolean childDirected;

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon
     * Comprehend for sentiment analysis. If you don't specify
     * <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     */
    private Boolean detectSentiment;

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is
     * created. This is the same as calling the <code>CreateBotVersion</code>
     * operation. If you don't specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     */
    private Boolean createVersion;

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a
     * bot, you can't use the <code>PutBot</code> operation to update the tags
     * on a bot. To update tags, use the <code>TagResource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the bot. The name is <i>not</i> case sensitive.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the bot. The name is <i>not</i> case sensitive.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the bot. The name is <i>not</i> case sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the bot.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the bot.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command
     * that a user can express. For example, a pizza ordering bot might support
     * an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     *
     * @return <p>
     *         An array of <code>Intent</code> objects. Each intent represents a
     *         command that a user can express. For example, a pizza ordering
     *         bot might support an OrderPizza intent. For more information, see
     *         <a>how-it-works</a>.
     *         </p>
     */
    public java.util.List<Intent> getIntents() {
        return intents;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command
     * that a user can express. For example, a pizza ordering bot might support
     * an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     *
     * @param intents <p>
     *            An array of <code>Intent</code> objects. Each intent
     *            represents a command that a user can express. For example, a
     *            pizza ordering bot might support an OrderPizza intent. For
     *            more information, see <a>how-it-works</a>.
     *            </p>
     */
    public void setIntents(java.util.Collection<Intent> intents) {
        if (intents == null) {
            this.intents = null;
            return;
        }

        this.intents = new java.util.ArrayList<Intent>(intents);
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command
     * that a user can express. For example, a pizza ordering bot might support
     * an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intents <p>
     *            An array of <code>Intent</code> objects. Each intent
     *            represents a command that a user can express. For example, a
     *            pizza ordering bot might support an OrderPizza intent. For
     *            more information, see <a>how-it-works</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withIntents(Intent... intents) {
        if (getIntents() == null) {
            this.intents = new java.util.ArrayList<Intent>(intents.length);
        }
        for (Intent value : intents) {
            this.intents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. Each intent represents a command
     * that a user can express. For example, a pizza ordering bot might support
     * an OrderPizza intent. For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intents <p>
     *            An array of <code>Intent</code> objects. Each intent
     *            represents a command that a user can express. For example, a
     *            pizza ordering bot might support an OrderPizza intent. For
     *            more information, see <a>how-it-works</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withIntents(java.util.Collection<Intent> intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this
     * message to get clarification. To specify how many times Amazon Lex should
     * repeat the clarification prompt, use the <code>maxAttempts</code> field.
     * If Amazon Lex still doesn't understand, it sends the message in the
     * <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the
     * correct response from the user. for example, for a bot that orders pizza
     * and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the
     * clarification prompt is repeated the number of times defined in the
     * <code>maxAttempts</code> field. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will
     * return a 400 Bad Request exception in three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does
     * not provide an intent. For example, in response to a follow-up prompt
     * that says "Would you like anything else today?" the user says "Yes."
     * Amazon Lex will return a 400 Bad Request exception because it does not
     * have a clarification prompt to send to the user to get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an
     * <code>ElicitIntent</code> dialog type. Since Amazon Lex does not have a
     * clarification prompt to get an intent from the user, it returns a 400 Bad
     * Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation,
     * you send an <code>ElicitIntent</code> dialog type. Since Amazon Lex does
     * not have a clarification prompt to get an intent from the user, it
     * returns a 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         When Amazon Lex doesn't understand the user's intent, it uses
     *         this message to get clarification. To specify how many times
     *         Amazon Lex should repeat the clarification prompt, use the
     *         <code>maxAttempts</code> field. If Amazon Lex still doesn't
     *         understand, it sends the message in the
     *         <code>abortStatement</code> field.
     *         </p>
     *         <p>
     *         When you create a clarification prompt, make sure that it
     *         suggests the correct response from the user. for example, for a
     *         bot that orders pizza and drinks, you might create this
     *         clarification prompt:
     *         "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     *         </p>
     *         <p>
     *         If you have defined a fallback intent, it will be invoked if the
     *         clarification prompt is repeated the number of times defined in
     *         the <code>maxAttempts</code> field. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     *         > AMAZON.FallbackIntent</a>.
     *         </p>
     *         <p>
     *         If you don't define a clarification prompt, at runtime Amazon Lex
     *         will return a 400 Bad Request exception in three cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Follow-up prompt - When the user responds to a follow-up prompt
     *         but does not provide an intent. For example, in response to a
     *         follow-up prompt that says "Would you like anything else today?"
     *         the user says "Yes." Amazon Lex will return a 400 Bad Request
     *         exception because it does not have a clarification prompt to send
     *         to the user to get an intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Lambda function - When using a Lambda function, you return an
     *         <code>ElicitIntent</code> dialog type. Since Amazon Lex does not
     *         have a clarification prompt to get an intent from the user, it
     *         returns a 400 Bad Request exception.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PutSession operation - When using the <code>PutSession</code>
     *         operation, you send an <code>ElicitIntent</code> dialog type.
     *         Since Amazon Lex does not have a clarification prompt to get an
     *         intent from the user, it returns a 400 Bad Request exception.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Prompt getClarificationPrompt() {
        return clarificationPrompt;
    }

    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this
     * message to get clarification. To specify how many times Amazon Lex should
     * repeat the clarification prompt, use the <code>maxAttempts</code> field.
     * If Amazon Lex still doesn't understand, it sends the message in the
     * <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the
     * correct response from the user. for example, for a bot that orders pizza
     * and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the
     * clarification prompt is repeated the number of times defined in the
     * <code>maxAttempts</code> field. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will
     * return a 400 Bad Request exception in three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does
     * not provide an intent. For example, in response to a follow-up prompt
     * that says "Would you like anything else today?" the user says "Yes."
     * Amazon Lex will return a 400 Bad Request exception because it does not
     * have a clarification prompt to send to the user to get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an
     * <code>ElicitIntent</code> dialog type. Since Amazon Lex does not have a
     * clarification prompt to get an intent from the user, it returns a 400 Bad
     * Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation,
     * you send an <code>ElicitIntent</code> dialog type. Since Amazon Lex does
     * not have a clarification prompt to get an intent from the user, it
     * returns a 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     *
     * @param clarificationPrompt <p>
     *            When Amazon Lex doesn't understand the user's intent, it uses
     *            this message to get clarification. To specify how many times
     *            Amazon Lex should repeat the clarification prompt, use the
     *            <code>maxAttempts</code> field. If Amazon Lex still doesn't
     *            understand, it sends the message in the
     *            <code>abortStatement</code> field.
     *            </p>
     *            <p>
     *            When you create a clarification prompt, make sure that it
     *            suggests the correct response from the user. for example, for
     *            a bot that orders pizza and drinks, you might create this
     *            clarification prompt:
     *            "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     *            </p>
     *            <p>
     *            If you have defined a fallback intent, it will be invoked if
     *            the clarification prompt is repeated the number of times
     *            defined in the <code>maxAttempts</code> field. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     *            > AMAZON.FallbackIntent</a>.
     *            </p>
     *            <p>
     *            If you don't define a clarification prompt, at runtime Amazon
     *            Lex will return a 400 Bad Request exception in three cases:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Follow-up prompt - When the user responds to a follow-up
     *            prompt but does not provide an intent. For example, in
     *            response to a follow-up prompt that says
     *            "Would you like anything else today?" the user says "Yes."
     *            Amazon Lex will return a 400 Bad Request exception because it
     *            does not have a clarification prompt to send to the user to
     *            get an intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda function - When using a Lambda function, you return an
     *            <code>ElicitIntent</code> dialog type. Since Amazon Lex does
     *            not have a clarification prompt to get an intent from the
     *            user, it returns a 400 Bad Request exception.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PutSession operation - When using the <code>PutSession</code>
     *            operation, you send an <code>ElicitIntent</code> dialog type.
     *            Since Amazon Lex does not have a clarification prompt to get
     *            an intent from the user, it returns a 400 Bad Request
     *            exception.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setClarificationPrompt(Prompt clarificationPrompt) {
        this.clarificationPrompt = clarificationPrompt;
    }

    /**
     * <p>
     * When Amazon Lex doesn't understand the user's intent, it uses this
     * message to get clarification. To specify how many times Amazon Lex should
     * repeat the clarification prompt, use the <code>maxAttempts</code> field.
     * If Amazon Lex still doesn't understand, it sends the message in the
     * <code>abortStatement</code> field.
     * </p>
     * <p>
     * When you create a clarification prompt, make sure that it suggests the
     * correct response from the user. for example, for a bot that orders pizza
     * and drinks, you might create this clarification prompt:
     * "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     * </p>
     * <p>
     * If you have defined a fallback intent, it will be invoked if the
     * clarification prompt is repeated the number of times defined in the
     * <code>maxAttempts</code> field. For more information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * If you don't define a clarification prompt, at runtime Amazon Lex will
     * return a 400 Bad Request exception in three cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Follow-up prompt - When the user responds to a follow-up prompt but does
     * not provide an intent. For example, in response to a follow-up prompt
     * that says "Would you like anything else today?" the user says "Yes."
     * Amazon Lex will return a 400 Bad Request exception because it does not
     * have a clarification prompt to send to the user to get an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda function - When using a Lambda function, you return an
     * <code>ElicitIntent</code> dialog type. Since Amazon Lex does not have a
     * clarification prompt to get an intent from the user, it returns a 400 Bad
     * Request exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * PutSession operation - When using the <code>PutSession</code> operation,
     * you send an <code>ElicitIntent</code> dialog type. Since Amazon Lex does
     * not have a clarification prompt to get an intent from the user, it
     * returns a 400 Bad Request exception.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clarificationPrompt <p>
     *            When Amazon Lex doesn't understand the user's intent, it uses
     *            this message to get clarification. To specify how many times
     *            Amazon Lex should repeat the clarification prompt, use the
     *            <code>maxAttempts</code> field. If Amazon Lex still doesn't
     *            understand, it sends the message in the
     *            <code>abortStatement</code> field.
     *            </p>
     *            <p>
     *            When you create a clarification prompt, make sure that it
     *            suggests the correct response from the user. for example, for
     *            a bot that orders pizza and drinks, you might create this
     *            clarification prompt:
     *            "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
     *            </p>
     *            <p>
     *            If you have defined a fallback intent, it will be invoked if
     *            the clarification prompt is repeated the number of times
     *            defined in the <code>maxAttempts</code> field. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     *            > AMAZON.FallbackIntent</a>.
     *            </p>
     *            <p>
     *            If you don't define a clarification prompt, at runtime Amazon
     *            Lex will return a 400 Bad Request exception in three cases:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Follow-up prompt - When the user responds to a follow-up
     *            prompt but does not provide an intent. For example, in
     *            response to a follow-up prompt that says
     *            "Would you like anything else today?" the user says "Yes."
     *            Amazon Lex will return a 400 Bad Request exception because it
     *            does not have a clarification prompt to send to the user to
     *            get an intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda function - When using a Lambda function, you return an
     *            <code>ElicitIntent</code> dialog type. Since Amazon Lex does
     *            not have a clarification prompt to get an intent from the
     *            user, it returns a 400 Bad Request exception.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PutSession operation - When using the <code>PutSession</code>
     *            operation, you send an <code>ElicitIntent</code> dialog type.
     *            Since Amazon Lex does not have a clarification prompt to get
     *            an intent from the user, it returns a 400 Bad Request
     *            exception.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withClarificationPrompt(Prompt clarificationPrompt) {
        this.clarificationPrompt = clarificationPrompt;
        return this;
    }

    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to
     * elicit the information a few times. After that, Amazon Lex sends the
     * message defined in <code>abortStatement</code> to the user, and then
     * aborts the conversation. To set the number of retries, use the
     * <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user
     * "What type of crust would you like?" If the user's response is not one of
     * the expected responses (for example, "thin crust, "deep dish," etc.),
     * Amazon Lex tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code>
     * might be one of the intents. This intent might require the
     * <code>CrustType</code> slot. You specify the
     * <code>valueElicitationPrompt</code> field when you create the
     * <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the abort statement will not be
     * sent to the user, the fallback intent is used instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     *
     * @return <p>
     *         When Amazon Lex can't understand the user's input in context, it
     *         tries to elicit the information a few times. After that, Amazon
     *         Lex sends the message defined in <code>abortStatement</code> to
     *         the user, and then aborts the conversation. To set the number of
     *         retries, use the <code>valueElicitationPrompt</code> field for
     *         the slot type.
     *         </p>
     *         <p>
     *         For example, in a pizza ordering bot, Amazon Lex might ask a user
     *         "What type of crust would you like?" If the user's response is
     *         not one of the expected responses (for example,
     *         "thin crust, "deep dish," etc.), Amazon Lex tries to elicit a
     *         correct response a few more times.
     *         </p>
     *         <p>
     *         For example, in a pizza ordering application,
     *         <code>OrderPizza</code> might be one of the intents. This intent
     *         might require the <code>CrustType</code> slot. You specify the
     *         <code>valueElicitationPrompt</code> field when you create the
     *         <code>CrustType</code> slot.
     *         </p>
     *         <p>
     *         If you have defined a fallback intent the abort statement will
     *         not be sent to the user, the fallback intent is used instead. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     *         > AMAZON.FallbackIntent</a>.
     *         </p>
     */
    public Statement getAbortStatement() {
        return abortStatement;
    }

    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to
     * elicit the information a few times. After that, Amazon Lex sends the
     * message defined in <code>abortStatement</code> to the user, and then
     * aborts the conversation. To set the number of retries, use the
     * <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user
     * "What type of crust would you like?" If the user's response is not one of
     * the expected responses (for example, "thin crust, "deep dish," etc.),
     * Amazon Lex tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code>
     * might be one of the intents. This intent might require the
     * <code>CrustType</code> slot. You specify the
     * <code>valueElicitationPrompt</code> field when you create the
     * <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the abort statement will not be
     * sent to the user, the fallback intent is used instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     *
     * @param abortStatement <p>
     *            When Amazon Lex can't understand the user's input in context,
     *            it tries to elicit the information a few times. After that,
     *            Amazon Lex sends the message defined in
     *            <code>abortStatement</code> to the user, and then aborts the
     *            conversation. To set the number of retries, use the
     *            <code>valueElicitationPrompt</code> field for the slot type.
     *            </p>
     *            <p>
     *            For example, in a pizza ordering bot, Amazon Lex might ask a
     *            user "What type of crust would you like?" If the user's
     *            response is not one of the expected responses (for example,
     *            "thin crust, "deep dish," etc.), Amazon Lex tries to elicit a
     *            correct response a few more times.
     *            </p>
     *            <p>
     *            For example, in a pizza ordering application,
     *            <code>OrderPizza</code> might be one of the intents. This
     *            intent might require the <code>CrustType</code> slot. You
     *            specify the <code>valueElicitationPrompt</code> field when you
     *            create the <code>CrustType</code> slot.
     *            </p>
     *            <p>
     *            If you have defined a fallback intent the abort statement will
     *            not be sent to the user, the fallback intent is used instead.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     *            > AMAZON.FallbackIntent</a>.
     *            </p>
     */
    public void setAbortStatement(Statement abortStatement) {
        this.abortStatement = abortStatement;
    }

    /**
     * <p>
     * When Amazon Lex can't understand the user's input in context, it tries to
     * elicit the information a few times. After that, Amazon Lex sends the
     * message defined in <code>abortStatement</code> to the user, and then
     * aborts the conversation. To set the number of retries, use the
     * <code>valueElicitationPrompt</code> field for the slot type.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, Amazon Lex might ask a user
     * "What type of crust would you like?" If the user's response is not one of
     * the expected responses (for example, "thin crust, "deep dish," etc.),
     * Amazon Lex tries to elicit a correct response a few more times.
     * </p>
     * <p>
     * For example, in a pizza ordering application, <code>OrderPizza</code>
     * might be one of the intents. This intent might require the
     * <code>CrustType</code> slot. You specify the
     * <code>valueElicitationPrompt</code> field when you create the
     * <code>CrustType</code> slot.
     * </p>
     * <p>
     * If you have defined a fallback intent the abort statement will not be
     * sent to the user, the fallback intent is used instead. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     * > AMAZON.FallbackIntent</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortStatement <p>
     *            When Amazon Lex can't understand the user's input in context,
     *            it tries to elicit the information a few times. After that,
     *            Amazon Lex sends the message defined in
     *            <code>abortStatement</code> to the user, and then aborts the
     *            conversation. To set the number of retries, use the
     *            <code>valueElicitationPrompt</code> field for the slot type.
     *            </p>
     *            <p>
     *            For example, in a pizza ordering bot, Amazon Lex might ask a
     *            user "What type of crust would you like?" If the user's
     *            response is not one of the expected responses (for example,
     *            "thin crust, "deep dish," etc.), Amazon Lex tries to elicit a
     *            correct response a few more times.
     *            </p>
     *            <p>
     *            For example, in a pizza ordering application,
     *            <code>OrderPizza</code> might be one of the intents. This
     *            intent might require the <code>CrustType</code> slot. You
     *            specify the <code>valueElicitationPrompt</code> field when you
     *            create the <code>CrustType</code> slot.
     *            </p>
     *            <p>
     *            If you have defined a fallback intent the abort statement will
     *            not be sent to the user, the fallback intent is used instead.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/built-in-intent-fallback.html"
     *            > AMAZON.FallbackIntent</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withAbortStatement(Statement abortStatement) {
        this.abortStatement = abortStatement;
        return this;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in
     * a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time
     * specified. If no conversation occurs during this time, the session
     * expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets
     * sidetracked halfway through placing an order. If the user doesn't
     * complete the order within the specified time, Amazon Lex discards the
     * slot information that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in
     * a <code>PutBot</code> operation request, Amazon Lex uses the default
     * value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @return <p>
     *         The maximum time in seconds that Amazon Lex retains the data
     *         gathered in a conversation.
     *         </p>
     *         <p>
     *         A user interaction session remains active for the amount of time
     *         specified. If no conversation occurs during this time, the
     *         session expires and Amazon Lex deletes any data provided before
     *         the timeout.
     *         </p>
     *         <p>
     *         For example, suppose that a user chooses the OrderPizza intent,
     *         but gets sidetracked halfway through placing an order. If the
     *         user doesn't complete the order within the specified time, Amazon
     *         Lex discards the slot information that it gathered, and the user
     *         must start over.
     *         </p>
     *         <p>
     *         If you don't include the <code>idleSessionTTLInSeconds</code>
     *         element in a <code>PutBot</code> operation request, Amazon Lex
     *         uses the default value. This is also true if the request replaces
     *         an existing bot.
     *         </p>
     *         <p>
     *         The default is 300 seconds (5 minutes).
     *         </p>
     */
    public Integer getIdleSessionTTLInSeconds() {
        return idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in
     * a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time
     * specified. If no conversation occurs during this time, the session
     * expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets
     * sidetracked halfway through placing an order. If the user doesn't
     * complete the order within the specified time, Amazon Lex discards the
     * slot information that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in
     * a <code>PutBot</code> operation request, Amazon Lex uses the default
     * value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param idleSessionTTLInSeconds <p>
     *            The maximum time in seconds that Amazon Lex retains the data
     *            gathered in a conversation.
     *            </p>
     *            <p>
     *            A user interaction session remains active for the amount of
     *            time specified. If no conversation occurs during this time,
     *            the session expires and Amazon Lex deletes any data provided
     *            before the timeout.
     *            </p>
     *            <p>
     *            For example, suppose that a user chooses the OrderPizza
     *            intent, but gets sidetracked halfway through placing an order.
     *            If the user doesn't complete the order within the specified
     *            time, Amazon Lex discards the slot information that it
     *            gathered, and the user must start over.
     *            </p>
     *            <p>
     *            If you don't include the <code>idleSessionTTLInSeconds</code>
     *            element in a <code>PutBot</code> operation request, Amazon Lex
     *            uses the default value. This is also true if the request
     *            replaces an existing bot.
     *            </p>
     *            <p>
     *            The default is 300 seconds (5 minutes).
     *            </p>
     */
    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in
     * a conversation.
     * </p>
     * <p>
     * A user interaction session remains active for the amount of time
     * specified. If no conversation occurs during this time, the session
     * expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * For example, suppose that a user chooses the OrderPizza intent, but gets
     * sidetracked halfway through placing an order. If the user doesn't
     * complete the order within the specified time, Amazon Lex discards the
     * slot information that it gathered, and the user must start over.
     * </p>
     * <p>
     * If you don't include the <code>idleSessionTTLInSeconds</code> element in
     * a <code>PutBot</code> operation request, Amazon Lex uses the default
     * value. This is also true if the request replaces an existing bot.
     * </p>
     * <p>
     * The default is 300 seconds (5 minutes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param idleSessionTTLInSeconds <p>
     *            The maximum time in seconds that Amazon Lex retains the data
     *            gathered in a conversation.
     *            </p>
     *            <p>
     *            A user interaction session remains active for the amount of
     *            time specified. If no conversation occurs during this time,
     *            the session expires and Amazon Lex deletes any data provided
     *            before the timeout.
     *            </p>
     *            <p>
     *            For example, suppose that a user chooses the OrderPizza
     *            intent, but gets sidetracked halfway through placing an order.
     *            If the user doesn't complete the order within the specified
     *            time, Amazon Lex discards the slot information that it
     *            gathered, and the user must start over.
     *            </p>
     *            <p>
     *            If you don't include the <code>idleSessionTTLInSeconds</code>
     *            element in a <code>PutBot</code> operation request, Amazon Lex
     *            uses the default value. This is also true if the request
     *            replaces an existing bot.
     *            </p>
     *            <p>
     *            The default is 300 seconds (5 minutes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
        return this;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice
     * interactions with the user. The locale configured for the voice must
     * match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices
     * in Amazon Polly</a> in the <i>Amazon Polly Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon Polly voice ID that you want Amazon Lex to use for
     *         voice interactions with the user. The locale configured for the
     *         voice must match the locale of the bot. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/polly/latest/dg/voicelist.html"
     *         >Voices in Amazon Polly</a> in the <i>Amazon Polly Developer
     *         Guide</i>.
     *         </p>
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice
     * interactions with the user. The locale configured for the voice must
     * match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices
     * in Amazon Polly</a> in the <i>Amazon Polly Developer Guide</i>.
     * </p>
     *
     * @param voiceId <p>
     *            The Amazon Polly voice ID that you want Amazon Lex to use for
     *            voice interactions with the user. The locale configured for
     *            the voice must match the locale of the bot. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/voicelist.html"
     *            >Voices in Amazon Polly</a> in the <i>Amazon Polly Developer
     *            Guide</i>.
     *            </p>
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice
     * interactions with the user. The locale configured for the voice must
     * match the locale of the bot. For more information, see <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/voicelist.html">Voices
     * in Amazon Polly</a> in the <i>Amazon Polly Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param voiceId <p>
     *            The Amazon Polly voice ID that you want Amazon Lex to use for
     *            voice interactions with the user. The locale configured for
     *            the voice must match the locale of the bot. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/voicelist.html"
     *            >Voices in Amazon Polly</a> in the <i>Amazon Polly Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot, leave the <code>checksum</code> field blank.
     * If you specify a checksum you get a <code>BadRequestException</code>
     * exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the
     * checksum of the most recent revision of the <code>$LATEST</code> version.
     * If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @return <p>
     *         Identifies a specific revision of the <code>$LATEST</code>
     *         version.
     *         </p>
     *         <p>
     *         When you create a new bot, leave the <code>checksum</code> field
     *         blank. If you specify a checksum you get a
     *         <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a bot, set the <code>checksum</code>
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
     * When you create a new bot, leave the <code>checksum</code> field blank.
     * If you specify a checksum you get a <code>BadRequestException</code>
     * exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the
     * checksum of the most recent revision of the <code>$LATEST</code> version.
     * If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a
     * <code>PreconditionFailedException</code> exception.
     * </p>
     *
     * @param checksum <p>
     *            Identifies a specific revision of the <code>$LATEST</code>
     *            version.
     *            </p>
     *            <p>
     *            When you create a new bot, leave the <code>checksum</code>
     *            field blank. If you specify a checksum you get a
     *            <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a bot, set the <code>checksum</code>
     *            field to the checksum of the most recent revision of the
     *            <code>$LATEST</code> version. If you don't specify the
     *            <code> checksum</code> field, or if the checksum does not
     *            match the <code>$LATEST</code> version, you get a
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
     * When you create a new bot, leave the <code>checksum</code> field blank.
     * If you specify a checksum you get a <code>BadRequestException</code>
     * exception.
     * </p>
     * <p>
     * When you want to update a bot, set the <code>checksum</code> field to the
     * checksum of the most recent revision of the <code>$LATEST</code> version.
     * If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a
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
     *            When you create a new bot, leave the <code>checksum</code>
     *            field blank. If you specify a checksum you get a
     *            <code>BadRequestException</code> exception.
     *            </p>
     *            <p>
     *            When you want to update a bot, set the <code>checksum</code>
     *            field to the checksum of the most recent revision of the
     *            <code>$LATEST</code> version. If you don't specify the
     *            <code> checksum</code> field, or if the checksum does not
     *            match the <code>$LATEST</code> version, you get a
     *            <code>PreconditionFailedException</code> exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>
     * , Amazon Lex builds the bot so that it can be run. If you set the element
     * to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAVE, BUILD
     *
     * @return <p>
     *         If you set the <code>processBehavior</code> element to
     *         <code>BUILD</code>, Amazon Lex builds the bot so that it can be
     *         run. If you set the element to <code>SAVE</code> Amazon Lex saves
     *         the bot, but doesn't build it.
     *         </p>
     *         <p>
     *         If you don't specify this value, the default value is
     *         <code>BUILD</code>.
     *         </p>
     * @see ProcessBehavior
     */
    public String getProcessBehavior() {
        return processBehavior;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>
     * , Amazon Lex builds the bot so that it can be run. If you set the element
     * to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAVE, BUILD
     *
     * @param processBehavior <p>
     *            If you set the <code>processBehavior</code> element to
     *            <code>BUILD</code>, Amazon Lex builds the bot so that it can
     *            be run. If you set the element to <code>SAVE</code> Amazon Lex
     *            saves the bot, but doesn't build it.
     *            </p>
     *            <p>
     *            If you don't specify this value, the default value is
     *            <code>BUILD</code>.
     *            </p>
     * @see ProcessBehavior
     */
    public void setProcessBehavior(String processBehavior) {
        this.processBehavior = processBehavior;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>
     * , Amazon Lex builds the bot so that it can be run. If you set the element
     * to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAVE, BUILD
     *
     * @param processBehavior <p>
     *            If you set the <code>processBehavior</code> element to
     *            <code>BUILD</code>, Amazon Lex builds the bot so that it can
     *            be run. If you set the element to <code>SAVE</code> Amazon Lex
     *            saves the bot, but doesn't build it.
     *            </p>
     *            <p>
     *            If you don't specify this value, the default value is
     *            <code>BUILD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessBehavior
     */
    public PutBotRequest withProcessBehavior(String processBehavior) {
        this.processBehavior = processBehavior;
        return this;
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>
     * , Amazon Lex builds the bot so that it can be run. If you set the element
     * to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAVE, BUILD
     *
     * @param processBehavior <p>
     *            If you set the <code>processBehavior</code> element to
     *            <code>BUILD</code>, Amazon Lex builds the bot so that it can
     *            be run. If you set the element to <code>SAVE</code> Amazon Lex
     *            saves the bot, but doesn't build it.
     *            </p>
     *            <p>
     *            If you don't specify this value, the default value is
     *            <code>BUILD</code>.
     *            </p>
     * @see ProcessBehavior
     */
    public void setProcessBehavior(ProcessBehavior processBehavior) {
        this.processBehavior = processBehavior.toString();
    }

    /**
     * <p>
     * If you set the <code>processBehavior</code> element to <code>BUILD</code>
     * , Amazon Lex builds the bot so that it can be run. If you set the element
     * to <code>SAVE</code> Amazon Lex saves the bot, but doesn't build it.
     * </p>
     * <p>
     * If you don't specify this value, the default value is <code>BUILD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAVE, BUILD
     *
     * @param processBehavior <p>
     *            If you set the <code>processBehavior</code> element to
     *            <code>BUILD</code>, Amazon Lex builds the bot so that it can
     *            be run. If you set the element to <code>SAVE</code> Amazon Lex
     *            saves the bot, but doesn't build it.
     *            </p>
     *            <p>
     *            If you don't specify this value, the default value is
     *            <code>BUILD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessBehavior
     */
    public PutBotRequest withProcessBehavior(ProcessBehavior processBehavior) {
        this.processBehavior = processBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must
     * be compatible with the locale of the bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @return <p>
     *         Specifies the target locale for the bot. Any intent used in the
     *         bot must be compatible with the locale of the bot.
     *         </p>
     *         <p>
     *         The default is <code>en-US</code>.
     *         </p>
     * @see Locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must
     * be compatible with the locale of the bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            Specifies the target locale for the bot. Any intent used in
     *            the bot must be compatible with the locale of the bot.
     *            </p>
     *            <p>
     *            The default is <code>en-US</code>.
     *            </p>
     * @see Locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must
     * be compatible with the locale of the bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            Specifies the target locale for the bot. Any intent used in
     *            the bot must be compatible with the locale of the bot.
     *            </p>
     *            <p>
     *            The default is <code>en-US</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public PutBotRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must
     * be compatible with the locale of the bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            Specifies the target locale for the bot. Any intent used in
     *            the bot must be compatible with the locale of the bot.
     *            </p>
     *            <p>
     *            The default is <code>en-US</code>.
     *            </p>
     * @see Locale
     */
    public void setLocale(Locale locale) {
        this.locale = locale.toString();
    }

    /**
     * <p>
     * Specifies the target locale for the bot. Any intent used in the bot must
     * be compatible with the locale of the bot.
     * </p>
     * <p>
     * The default is <code>en-US</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, de-DE
     *
     * @param locale <p>
     *            Specifies the target locale for the bot. Any intent used in
     *            the bot must be compatible with the locale of the bot.
     *            </p>
     *            <p>
     *            The default is <code>en-US</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public PutBotRequest withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     *
     * @return <p>
     *         For each Amazon Lex bot created with the Amazon Lex Model
     *         Building Service, you must specify whether your use of Amazon Lex
     *         is related to a website, program, or other application that is
     *         directed or targeted, in whole or in part, to children under age
     *         13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in
     *         the <code>childDirected</code> field. By specifying
     *         <code>true</code> in the <code>childDirected</code> field, you
     *         confirm that your use of Amazon Lex <b>is</b> related to a
     *         website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of
     *         Amazon Lex <b>is not</b> related to a website, program, or other
     *         application that is directed or targeted, in whole or in part, to
     *         children under age 13 and subject to COPPA. You may not specify a
     *         default value for the <code>childDirected</code> field that does
     *         not accurately reflect whether your use of Amazon Lex is related
     *         to a website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.
     *         </p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other
     *         application that is directed in whole or in part, to children
     *         under age 13, you must obtain any required verifiable parental
     *         consent under COPPA. For information regarding the use of Amazon
     *         Lex in connection with websites, programs, or other applications
     *         that are directed or targeted, in whole or in part, to children
     *         under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex
     *         FAQ.</a>
     *         </p>
     */
    public Boolean isChildDirected() {
        return childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     *
     * @return <p>
     *         For each Amazon Lex bot created with the Amazon Lex Model
     *         Building Service, you must specify whether your use of Amazon Lex
     *         is related to a website, program, or other application that is
     *         directed or targeted, in whole or in part, to children under age
     *         13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in
     *         the <code>childDirected</code> field. By specifying
     *         <code>true</code> in the <code>childDirected</code> field, you
     *         confirm that your use of Amazon Lex <b>is</b> related to a
     *         website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of
     *         Amazon Lex <b>is not</b> related to a website, program, or other
     *         application that is directed or targeted, in whole or in part, to
     *         children under age 13 and subject to COPPA. You may not specify a
     *         default value for the <code>childDirected</code> field that does
     *         not accurately reflect whether your use of Amazon Lex is related
     *         to a website, program, or other application that is directed or
     *         targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.
     *         </p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other
     *         application that is directed in whole or in part, to children
     *         under age 13, you must obtain any required verifiable parental
     *         consent under COPPA. For information regarding the use of Amazon
     *         Lex in connection with websites, programs, or other applications
     *         that are directed or targeted, in whole or in part, to children
     *         under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex
     *         FAQ.</a>
     *         </p>
     */
    public Boolean getChildDirected() {
        return childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     *
     * @param childDirected <p>
     *            For each Amazon Lex bot created with the Amazon Lex Model
     *            Building Service, you must specify whether your use of Amazon
     *            Lex is related to a website, program, or other application
     *            that is directed or targeted, in whole or in part, to children
     *            under age 13 and subject to the Children's Online Privacy
     *            Protection Act (COPPA) by specifying <code>true</code> or
     *            <code>false</code> in the <code>childDirected</code> field. By
     *            specifying <code>true</code> in the <code>childDirected</code>
     *            field, you confirm that your use of Amazon Lex <b>is</b>
     *            related to a website, program, or other application that is
     *            directed or targeted, in whole or in part, to children under
     *            age 13 and subject to COPPA. By specifying <code>false</code>
     *            in the <code>childDirected</code> field, you confirm that your
     *            use of Amazon Lex <b>is not</b> related to a website, program,
     *            or other application that is directed or targeted, in whole or
     *            in part, to children under age 13 and subject to COPPA. You
     *            may not specify a default value for the
     *            <code>childDirected</code> field that does not accurately
     *            reflect whether your use of Amazon Lex is related to a
     *            website, program, or other application that is directed or
     *            targeted, in whole or in part, to children under age 13 and
     *            subject to COPPA.
     *            </p>
     *            <p>
     *            If your use of Amazon Lex relates to a website, program, or
     *            other application that is directed in whole or in part, to
     *            children under age 13, you must obtain any required verifiable
     *            parental consent under COPPA. For information regarding the
     *            use of Amazon Lex in connection with websites, programs, or
     *            other applications that are directed or targeted, in whole or
     *            in part, to children under age 13, see the <a
     *            href="https://aws.amazon.com/lex/faqs#data-security">Amazon
     *            Lex FAQ.</a>
     *            </p>
     */
    public void setChildDirected(Boolean childDirected) {
        this.childDirected = childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building
     * Service, you must specify whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to the Children's
     * Online Privacy Protection Act (COPPA) by specifying <code>true</code> or
     * <code>false</code> in the <code>childDirected</code> field. By specifying
     * <code>true</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is</b> related to a website, program, or
     * other application that is directed or targeted, in whole or in part, to
     * children under age 13 and subject to COPPA. By specifying
     * <code>false</code> in the <code>childDirected</code> field, you confirm
     * that your use of Amazon Lex <b>is not</b> related to a website, program,
     * or other application that is directed or targeted, in whole or in part,
     * to children under age 13 and subject to COPPA. You may not specify a
     * default value for the <code>childDirected</code> field that does not
     * accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in
     * whole or in part, to children under age 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other
     * application that is directed in whole or in part, to children under age
     * 13, you must obtain any required verifiable parental consent under COPPA.
     * For information regarding the use of Amazon Lex in connection with
     * websites, programs, or other applications that are directed or targeted,
     * in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param childDirected <p>
     *            For each Amazon Lex bot created with the Amazon Lex Model
     *            Building Service, you must specify whether your use of Amazon
     *            Lex is related to a website, program, or other application
     *            that is directed or targeted, in whole or in part, to children
     *            under age 13 and subject to the Children's Online Privacy
     *            Protection Act (COPPA) by specifying <code>true</code> or
     *            <code>false</code> in the <code>childDirected</code> field. By
     *            specifying <code>true</code> in the <code>childDirected</code>
     *            field, you confirm that your use of Amazon Lex <b>is</b>
     *            related to a website, program, or other application that is
     *            directed or targeted, in whole or in part, to children under
     *            age 13 and subject to COPPA. By specifying <code>false</code>
     *            in the <code>childDirected</code> field, you confirm that your
     *            use of Amazon Lex <b>is not</b> related to a website, program,
     *            or other application that is directed or targeted, in whole or
     *            in part, to children under age 13 and subject to COPPA. You
     *            may not specify a default value for the
     *            <code>childDirected</code> field that does not accurately
     *            reflect whether your use of Amazon Lex is related to a
     *            website, program, or other application that is directed or
     *            targeted, in whole or in part, to children under age 13 and
     *            subject to COPPA.
     *            </p>
     *            <p>
     *            If your use of Amazon Lex relates to a website, program, or
     *            other application that is directed in whole or in part, to
     *            children under age 13, you must obtain any required verifiable
     *            parental consent under COPPA. For information regarding the
     *            use of Amazon Lex in connection with websites, programs, or
     *            other applications that are directed or targeted, in whole or
     *            in part, to children under age 13, see the <a
     *            href="https://aws.amazon.com/lex/faqs#data-security">Amazon
     *            Lex FAQ.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withChildDirected(Boolean childDirected) {
        this.childDirected = childDirected;
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon
     * Comprehend for sentiment analysis. If you don't specify
     * <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> user utterances are sent to Amazon
     *         Comprehend for sentiment analysis. If you don't specify
     *         <code>detectSentiment</code>, the default is <code>false</code>.
     *         </p>
     */
    public Boolean isDetectSentiment() {
        return detectSentiment;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon
     * Comprehend for sentiment analysis. If you don't specify
     * <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> user utterances are sent to Amazon
     *         Comprehend for sentiment analysis. If you don't specify
     *         <code>detectSentiment</code>, the default is <code>false</code>.
     *         </p>
     */
    public Boolean getDetectSentiment() {
        return detectSentiment;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon
     * Comprehend for sentiment analysis. If you don't specify
     * <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     *
     * @param detectSentiment <p>
     *            When set to <code>true</code> user utterances are sent to
     *            Amazon Comprehend for sentiment analysis. If you don't specify
     *            <code>detectSentiment</code>, the default is
     *            <code>false</code>.
     *            </p>
     */
    public void setDetectSentiment(Boolean detectSentiment) {
        this.detectSentiment = detectSentiment;
    }

    /**
     * <p>
     * When set to <code>true</code> user utterances are sent to Amazon
     * Comprehend for sentiment analysis. If you don't specify
     * <code>detectSentiment</code>, the default is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectSentiment <p>
     *            When set to <code>true</code> user utterances are sent to
     *            Amazon Comprehend for sentiment analysis. If you don't specify
     *            <code>detectSentiment</code>, the default is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withDetectSentiment(Boolean detectSentiment) {
        this.detectSentiment = detectSentiment;
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is
     * created. This is the same as calling the <code>CreateBotVersion</code>
     * operation. If you don't specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> a new numbered version of the bot
     *         is created. This is the same as calling the
     *         <code>CreateBotVersion</code> operation. If you don't specify
     *         <code>createVersion</code>, the default is <code>false</code>.
     *         </p>
     */
    public Boolean isCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is
     * created. This is the same as calling the <code>CreateBotVersion</code>
     * operation. If you don't specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         When set to <code>true</code> a new numbered version of the bot
     *         is created. This is the same as calling the
     *         <code>CreateBotVersion</code> operation. If you don't specify
     *         <code>createVersion</code>, the default is <code>false</code>.
     *         </p>
     */
    public Boolean getCreateVersion() {
        return createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is
     * created. This is the same as calling the <code>CreateBotVersion</code>
     * operation. If you don't specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     *
     * @param createVersion <p>
     *            When set to <code>true</code> a new numbered version of the
     *            bot is created. This is the same as calling the
     *            <code>CreateBotVersion</code> operation. If you don't specify
     *            <code>createVersion</code>, the default is <code>false</code>.
     *            </p>
     */
    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * <p>
     * When set to <code>true</code> a new numbered version of the bot is
     * created. This is the same as calling the <code>CreateBotVersion</code>
     * operation. If you don't specify <code>createVersion</code>, the default
     * is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createVersion <p>
     *            When set to <code>true</code> a new numbered version of the
     *            bot is created. This is the same as calling the
     *            <code>CreateBotVersion</code> operation. If you don't specify
     *            <code>createVersion</code>, the default is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a
     * bot, you can't use the <code>PutBot</code> operation to update the tags
     * on a bot. To update tags, use the <code>TagResource</code> operation.
     * </p>
     *
     * @return <p>
     *         A list of tags to add to the bot. You can only add tags when you
     *         create a bot, you can't use the <code>PutBot</code> operation to
     *         update the tags on a bot. To update tags, use the
     *         <code>TagResource</code> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a
     * bot, you can't use the <code>PutBot</code> operation to update the tags
     * on a bot. To update tags, use the <code>TagResource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to add to the bot. You can only add tags when
     *            you create a bot, you can't use the <code>PutBot</code>
     *            operation to update the tags on a bot. To update tags, use the
     *            <code>TagResource</code> operation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a
     * bot, you can't use the <code>PutBot</code> operation to update the tags
     * on a bot. To update tags, use the <code>TagResource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to add to the bot. You can only add tags when
     *            you create a bot, you can't use the <code>PutBot</code>
     *            operation to update the tags on a bot. To update tags, use the
     *            <code>TagResource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you create a
     * bot, you can't use the <code>PutBot</code> operation to update the tags
     * on a bot. To update tags, use the <code>TagResource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to add to the bot. You can only add tags when
     *            you create a bot, you can't use the <code>PutBot</code>
     *            operation to update the tags on a bot. To update tags, use the
     *            <code>TagResource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getIntents() != null)
            sb.append("intents: " + getIntents() + ",");
        if (getClarificationPrompt() != null)
            sb.append("clarificationPrompt: " + getClarificationPrompt() + ",");
        if (getAbortStatement() != null)
            sb.append("abortStatement: " + getAbortStatement() + ",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("idleSessionTTLInSeconds: " + getIdleSessionTTLInSeconds() + ",");
        if (getVoiceId() != null)
            sb.append("voiceId: " + getVoiceId() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getProcessBehavior() != null)
            sb.append("processBehavior: " + getProcessBehavior() + ",");
        if (getLocale() != null)
            sb.append("locale: " + getLocale() + ",");
        if (getChildDirected() != null)
            sb.append("childDirected: " + getChildDirected() + ",");
        if (getDetectSentiment() != null)
            sb.append("detectSentiment: " + getDetectSentiment() + ",");
        if (getCreateVersion() != null)
            sb.append("createVersion: " + getCreateVersion() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
        hashCode = prime * hashCode + ((getIntents() == null) ? 0 : getIntents().hashCode());
        hashCode = prime * hashCode
                + ((getClarificationPrompt() == null) ? 0 : getClarificationPrompt().hashCode());
        hashCode = prime * hashCode
                + ((getAbortStatement() == null) ? 0 : getAbortStatement().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds()
                        .hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode
                + ((getProcessBehavior() == null) ? 0 : getProcessBehavior().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode
                + ((getChildDirected() == null) ? 0 : getChildDirected().hashCode());
        hashCode = prime * hashCode
                + ((getDetectSentiment() == null) ? 0 : getDetectSentiment().hashCode());
        hashCode = prime * hashCode
                + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBotRequest == false)
            return false;
        PutBotRequest other = (PutBotRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntents() == null ^ this.getIntents() == null)
            return false;
        if (other.getIntents() != null && other.getIntents().equals(this.getIntents()) == false)
            return false;
        if (other.getClarificationPrompt() == null ^ this.getClarificationPrompt() == null)
            return false;
        if (other.getClarificationPrompt() != null
                && other.getClarificationPrompt().equals(this.getClarificationPrompt()) == false)
            return false;
        if (other.getAbortStatement() == null ^ this.getAbortStatement() == null)
            return false;
        if (other.getAbortStatement() != null
                && other.getAbortStatement().equals(this.getAbortStatement()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null
                && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getProcessBehavior() == null ^ this.getProcessBehavior() == null)
            return false;
        if (other.getProcessBehavior() != null
                && other.getProcessBehavior().equals(this.getProcessBehavior()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getChildDirected() == null ^ this.getChildDirected() == null)
            return false;
        if (other.getChildDirected() != null
                && other.getChildDirected().equals(this.getChildDirected()) == false)
            return false;
        if (other.getDetectSentiment() == null ^ this.getDetectSentiment() == null)
            return false;
        if (other.getDetectSentiment() != null
                && other.getDetectSentiment().equals(this.getDetectSentiment()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null
                && other.getCreateVersion().equals(this.getCreateVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
