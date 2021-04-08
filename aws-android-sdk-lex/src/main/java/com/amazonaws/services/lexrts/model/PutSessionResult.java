/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class PutSessionResult implements Serializable {
    /**
     * <p>
     * Content type as specified in the <code>Accept</code> HTTP header in the
     * request.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The name of the current intent.
     * </p>
     */
    private String intentName;

    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input
     * during the conversation.
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
     * <code>valueSelectionStrategy</code> the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     */
    private String slots;

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
     * </p>
     */
    private String sessionAttributes;

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419,
     * es-ES, es-US, fr-CA, fr-FR, and it-IT locales. In all other locales, the
     * <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String message;

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode
     * the field before you can use the value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1366<br/>
     */
    private String encodedMessage;

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
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response to confirm the intent before fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has
     * failed. This can happen for various reasons, including the user does not
     * provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully
     * fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
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
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the
     * name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     */
    private String slotToElicit;

    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     */
    private java.io.InputStream audioStream;

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * A list of active contexts for the session.
     * </p>
     */
    private String activeContexts;

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
    public PutSessionResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The name of the current intent.
     * </p>
     *
     * @return <p>
     *         The name of the current intent.
     *         </p>
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * <p>
     * The name of the current intent.
     * </p>
     *
     * @param intentName <p>
     *            The name of the current intent.
     *            </p>
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the current intent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intentName <p>
     *            The name of the current intent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }

    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input
     * during the conversation.
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
     * <code>valueSelectionStrategy</code> the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     *
     * @return <p>
     *         Map of zero or more intent slots Amazon Lex detected from the
     *         user input during the conversation.
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
     *         you don't specify a <code>valueSelectionStrategy</code> the
     *         default is <code>ORIGINAL_VALUE</code>.
     *         </p>
     */
    public String getSlots() {
        return slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input
     * during the conversation.
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
     * <code>valueSelectionStrategy</code> the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     *
     * @param slots <p>
     *            Map of zero or more intent slots Amazon Lex detected from the
     *            user input during the conversation.
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
     *            <code>valueSelectionStrategy</code> the default is
     *            <code>ORIGINAL_VALUE</code>.
     *            </p>
     */
    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * Map of zero or more intent slots Amazon Lex detected from the user input
     * during the conversation.
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
     * <code>valueSelectionStrategy</code> the default is
     * <code>ORIGINAL_VALUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slots <p>
     *            Map of zero or more intent slots Amazon Lex detected from the
     *            user input during the conversation.
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
     *            <code>valueSelectionStrategy</code> the default is
     *            <code>ORIGINAL_VALUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withSlots(String slots) {
        this.slots = slots;
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
     * </p>
     *
     * @return <p>
     *         Map of key/value pairs representing session-specific context
     *         information.
     *         </p>
     */
    public String getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
     * </p>
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing session-specific context
     *            information.
     *            </p>
     */
    public void setSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing session-specific context information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing session-specific context
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419,
     * es-ES, es-US, fr-CA, fr-FR, and it-IT locales. In all other locales, the
     * <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The next message that should be presented to the user.
     *         </p>
     *         <p>
     *         You can only use this field in the de-DE, en-AU, en-GB, en-US,
     *         es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT locales. In all
     *         other locales, the <code>message</code> field is null. You should
     *         use the <code>encodedMessage</code> field instead.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419,
     * es-ES, es-US, fr-CA, fr-FR, and it-IT locales. In all other locales, the
     * <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            The next message that should be presented to the user.
     *            </p>
     *            <p>
     *            You can only use this field in the de-DE, en-AU, en-GB, en-US,
     *            es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT locales. In all
     *            other locales, the <code>message</code> field is null. You
     *            should use the <code>encodedMessage</code> field instead.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * You can only use this field in the de-DE, en-AU, en-GB, en-US, es-419,
     * es-ES, es-US, fr-CA, fr-FR, and it-IT locales. In all other locales, the
     * <code>message</code> field is null. You should use the
     * <code>encodedMessage</code> field instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param message <p>
     *            The next message that should be presented to the user.
     *            </p>
     *            <p>
     *            You can only use this field in the de-DE, en-AU, en-GB, en-US,
     *            es-419, es-ES, es-US, fr-CA, fr-FR, and it-IT locales. In all
     *            other locales, the <code>message</code> field is null. You
     *            should use the <code>encodedMessage</code> field instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode
     * the field before you can use the value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1366<br/>
     *
     * @return <p>
     *         The next message that should be presented to the user.
     *         </p>
     *         <p>
     *         The <code>encodedMessage</code> field is base-64 encoded. You
     *         must decode the field before you can use the value.
     *         </p>
     */
    public String getEncodedMessage() {
        return encodedMessage;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode
     * the field before you can use the value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1366<br/>
     *
     * @param encodedMessage <p>
     *            The next message that should be presented to the user.
     *            </p>
     *            <p>
     *            The <code>encodedMessage</code> field is base-64 encoded. You
     *            must decode the field before you can use the value.
     *            </p>
     */
    public void setEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }

    /**
     * <p>
     * The next message that should be presented to the user.
     * </p>
     * <p>
     * The <code>encodedMessage</code> field is base-64 encoded. You must decode
     * the field before you can use the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1366<br/>
     *
     * @param encodedMessage <p>
     *            The next message that should be presented to the user.
     *            </p>
     *            <p>
     *            The <code>encodedMessage</code> field is base-64 encoded. You
     *            must decode the field before you can use the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
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
    public PutSessionResult withMessageFormat(String messageFormat) {
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
    public PutSessionResult withMessageFormat(MessageFormatType messageFormat) {
        this.messageFormat = messageFormat.toString();
        return this;
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response to confirm the intent before fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has
     * failed. This can happen for various reasons, including the user does not
     * provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully
     * fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @return <p/>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or
     *         "no" response to confirm the intent before fulfilling an intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's
     *         intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> - Amazon Lex is expecting the value of a
     *         slot for the current intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - Conveys that the conversation with the user
     *         has failed. This can happen for various reasons, including the
     *         user does not provide an appropriate response to prompts from the
     *         service, or if the Lambda function fails to fulfill the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fulfilled</code> - Conveys that the Lambda function has
     *         sucessfully fulfilled the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadyForFulfillment</code> - Conveys that the client has to
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
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response to confirm the intent before fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has
     * failed. This can happen for various reasons, including the user does not
     * provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully
     * fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p/>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response to confirm the intent before fulfilling an
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user has failed. This can happen for various reasons,
     *            including the user does not provide an appropriate response to
     *            prompts from the service, or if the Lambda function fails to
     *            fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            sucessfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @see DialogState
     */
    public void setDialogState(String dialogState) {
        this.dialogState = dialogState;
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response to confirm the intent before fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has
     * failed. This can happen for various reasons, including the user does not
     * provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully
     * fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
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
     * @param dialogState <p/>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response to confirm the intent before fulfilling an
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user has failed. This can happen for various reasons,
     *            including the user does not provide an appropriate response to
     *            prompts from the service, or if the Lambda function fails to
     *            fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            sucessfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogState
     */
    public PutSessionResult withDialogState(String dialogState) {
        this.dialogState = dialogState;
        return this;
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response to confirm the intent before fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has
     * failed. This can happen for various reasons, including the user does not
     * provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully
     * fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ElicitIntent, ConfirmIntent, ElicitSlot,
     * Fulfilled, ReadyForFulfillment, Failed
     *
     * @param dialogState <p/>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response to confirm the intent before fulfilling an
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user has failed. This can happen for various reasons,
     *            including the user does not provide an appropriate response to
     *            prompts from the service, or if the Lambda function fails to
     *            fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            sucessfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @see DialogState
     */
    public void setDialogState(DialogState dialogState) {
        this.dialogState = dialogState.toString();
    }

    /**
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes" or "no"
     * response to confirm the intent before fulfilling an intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - Amazon Lex wants to elicit the user's intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - Amazon Lex is expecting the value of a slot for
     * the current intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - Conveys that the conversation with the user has
     * failed. This can happen for various reasons, including the user does not
     * provide an appropriate response to prompts from the service, or if the
     * Lambda function fails to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fulfilled</code> - Conveys that the Lambda function has sucessfully
     * fulfilled the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfillment</code> - Conveys that the client has to fulfill
     * the intent.
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
     * @param dialogState <p/>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ConfirmIntent</code> - Amazon Lex is expecting a "yes"
     *            or "no" response to confirm the intent before fulfilling an
     *            intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitIntent</code> - Amazon Lex wants to elicit the
     *            user's intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ElicitSlot</code> - Amazon Lex is expecting the value of
     *            a slot for the current intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - Conveys that the conversation with the
     *            user has failed. This can happen for various reasons,
     *            including the user does not provide an appropriate response to
     *            prompts from the service, or if the Lambda function fails to
     *            fulfill the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Fulfilled</code> - Conveys that the Lambda function has
     *            sucessfully fulfilled the intent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadyForFulfillment</code> - Conveys that the client has
     *            to fulfill the intent.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DialogState
     */
    public PutSessionResult withDialogState(DialogState dialogState) {
        this.dialogState = dialogState.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the
     * name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     *
     * @return <p>
     *         If the <code>dialogState</code> is <code>ElicitSlot</code>,
     *         returns the name of the slot for which Amazon Lex is eliciting a
     *         value.
     *         </p>
     */
    public String getSlotToElicit() {
        return slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the
     * name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     *
     * @param slotToElicit <p>
     *            If the <code>dialogState</code> is <code>ElicitSlot</code>,
     *            returns the name of the slot for which Amazon Lex is eliciting
     *            a value.
     *            </p>
     */
    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * If the <code>dialogState</code> is <code>ElicitSlot</code>, returns the
     * name of the slot for which Amazon Lex is eliciting a value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotToElicit <p>
     *            If the <code>dialogState</code> is <code>ElicitSlot</code>,
     *            returns the name of the slot for which Amazon Lex is eliciting
     *            a value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
        return this;
    }

    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     *
     * @return <p>
     *         The audio version of the message to convey to the user.
     *         </p>
     */
    public java.io.InputStream getAudioStream() {
        return audioStream;
    }

    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     *
     * @param audioStream <p>
     *            The audio version of the message to convey to the user.
     *            </p>
     */
    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * The audio version of the message to convey to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioStream <p>
     *            The audio version of the message to convey to the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the session.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     *
     * @param sessionId <p>
     *            A unique identifier for the session.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique identifier for the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionId <p>
     *            A unique identifier for the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * <p>
     * A list of active contexts for the session.
     * </p>
     *
     * @return <p>
     *         A list of active contexts for the session.
     *         </p>
     */
    public String getActiveContexts() {
        return activeContexts;
    }

    /**
     * <p>
     * A list of active contexts for the session.
     * </p>
     *
     * @param activeContexts <p>
     *            A list of active contexts for the session.
     *            </p>
     */
    public void setActiveContexts(String activeContexts) {
        this.activeContexts = activeContexts;
    }

    /**
     * <p>
     * A list of active contexts for the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeContexts <p>
     *            A list of active contexts for the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionResult withActiveContexts(String activeContexts) {
        this.activeContexts = activeContexts;
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
        if (getEncodedMessage() != null)
            sb.append("encodedMessage: " + getEncodedMessage() + ",");
        if (getMessageFormat() != null)
            sb.append("messageFormat: " + getMessageFormat() + ",");
        if (getDialogState() != null)
            sb.append("dialogState: " + getDialogState() + ",");
        if (getSlotToElicit() != null)
            sb.append("slotToElicit: " + getSlotToElicit() + ",");
        if (getAudioStream() != null)
            sb.append("audioStream: " + getAudioStream() + ",");
        if (getSessionId() != null)
            sb.append("sessionId: " + getSessionId() + ",");
        if (getActiveContexts() != null)
            sb.append("activeContexts: " + getActiveContexts());
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
                + ((getEncodedMessage() == null) ? 0 : getEncodedMessage().hashCode());
        hashCode = prime * hashCode
                + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        hashCode = prime * hashCode
                + ((getDialogState() == null) ? 0 : getDialogState().hashCode());
        hashCode = prime * hashCode
                + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode
                + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode
                + ((getActiveContexts() == null) ? 0 : getActiveContexts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSessionResult == false)
            return false;
        PutSessionResult other = (PutSessionResult) obj;

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
        if (other.getEncodedMessage() == null ^ this.getEncodedMessage() == null)
            return false;
        if (other.getEncodedMessage() != null
                && other.getEncodedMessage().equals(this.getEncodedMessage()) == false)
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
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null
                && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getActiveContexts() == null ^ this.getActiveContexts() == null)
            return false;
        if (other.getActiveContexts() != null
                && other.getActiveContexts().equals(this.getActiveContexts()) == false)
            return false;
        return true;
    }
}
