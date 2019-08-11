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
 * Creates a new session or modifies an existing session with an Amazon Lex bot.
 * Use this operation to enable your application to set the state of the bot.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/lex/latest/dg/how-session-api.html"
 * >Managing Sessions</a>.
 * </p>
 */
public class PutSessionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     */
    private String botName;

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     */
    private String botAlias;

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     */
    private String userId;

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     */
    private java.util.Map<String, String> sessionAttributes;

    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the
     * conversation.
     * </p>
     */
    private DialogAction dialogAction;

    /**
     * <p>
     * The message that Amazon Lex returns in the response can be either text or
     * speech based depending on the value of this field.
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
     * in the response. Amazon Lex uses Amazon Polly to generate the speech in
     * the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the
     * MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as
     * <code>audio/pcm</code> in 16-bit, little endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String accept;

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     *
     * @return <p>
     *         The name of the bot that contains the session data.
     *         </p>
     */
    public String getBotName() {
        return botName;
    }

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     *
     * @param botName <p>
     *            The name of the bot that contains the session data.
     *            </p>
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that contains the session data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botName <p>
     *            The name of the bot that contains the session data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionRequest withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     *
     * @return <p>
     *         The alias in use for the bot that contains the session data.
     *         </p>
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     *
     * @param botAlias <p>
     *            The alias in use for the bot that contains the session data.
     *            </p>
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot that contains the session data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botAlias <p>
     *            The alias in use for the bot that contains the session data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionRequest withBotAlias(String botAlias) {
        this.botAlias = botAlias;
        return this;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @return <p>
     *         The ID of the client application user. Amazon Lex uses this to
     *         identify a user's conversation with your bot.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[0-9a-zA-Z._:-]+<br/>
     *
     * @param userId <p>
     *            The ID of the client application user. Amazon Lex uses this to
     *            identify a user's conversation with your bot.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user. Amazon Lex uses this to identify a
     * user's conversation with your bot.
     * </p>
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
     *            identify a user's conversation with your bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     *
     * @return <p>
     *         Map of key/value pairs representing the session-specific context
     *         information. It contains application information passed between
     *         Amazon Lex and a client application.
     *         </p>
     */
    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing the session-specific
     *            context information. It contains application information
     *            passed between Amazon Lex and a client application.
     *            </p>
     */
    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionAttributes <p>
     *            Map of key/value pairs representing the session-specific
     *            context information. It contains application information
     *            passed between Amazon Lex and a client application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionRequest withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
        return this;
    }

    /**
     * <p>
     * Map of key/value pairs representing the session-specific context
     * information. It contains application information passed between Amazon
     * Lex and a client application.
     * </p>
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
    public PutSessionRequest addsessionAttributesEntry(String key, String value) {
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
    public PutSessionRequest clearsessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the
     * conversation.
     * </p>
     *
     * @return <p>
     *         Sets the next action that the bot should take to fulfill the
     *         conversation.
     *         </p>
     */
    public DialogAction getDialogAction() {
        return dialogAction;
    }

    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the
     * conversation.
     * </p>
     *
     * @param dialogAction <p>
     *            Sets the next action that the bot should take to fulfill the
     *            conversation.
     *            </p>
     */
    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    /**
     * <p>
     * Sets the next action that the bot should take to fulfill the
     * conversation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dialogAction <p>
     *            Sets the next action that the bot should take to fulfill the
     *            conversation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionRequest withDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
        return this;
    }

    /**
     * <p>
     * The message that Amazon Lex returns in the response can be either text or
     * speech based depending on the value of this field.
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
     * in the response. Amazon Lex uses Amazon Polly to generate the speech in
     * the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the
     * MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as
     * <code>audio/pcm</code> in 16-bit, little endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The message that Amazon Lex returns in the response can be either
     *         text or speech based depending on the value of this field.
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
     *         the speech in the configuration that you specify. For example, if
     *         you specify <code>audio/mpeg</code> as the value, Amazon Lex
     *         returns speech in the MPEG format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value is <code>audio/pcm</code>, the speech is returned as
     *         <code>audio/pcm</code> in 16-bit, little endian format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The following are the accepted values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>audio/mpeg</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/ogg</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/pcm</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>audio/*</code> (defaults to mpeg)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>text/plain; charset=utf-8</code>
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
     * The message that Amazon Lex returns in the response can be either text or
     * speech based depending on the value of this field.
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
     * in the response. Amazon Lex uses Amazon Polly to generate the speech in
     * the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the
     * MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as
     * <code>audio/pcm</code> in 16-bit, little endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param accept <p>
     *            The message that Amazon Lex returns in the response can be
     *            either text or speech based depending on the value of this
     *            field.
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
     *            to generate the speech in the configuration that you specify.
     *            For example, if you specify <code>audio/mpeg</code> as the
     *            value, Amazon Lex returns speech in the MPEG format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the value is <code>audio/pcm</code>, the speech is returned
     *            as <code>audio/pcm</code> in 16-bit, little endian format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following are the accepted values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>audio/mpeg</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>audio/ogg</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>audio/pcm</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>audio/*</code> (defaults to mpeg)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>text/plain; charset=utf-8</code>
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
     * The message that Amazon Lex returns in the response can be either text or
     * speech based depending on the value of this field.
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
     * in the response. Amazon Lex uses Amazon Polly to generate the speech in
     * the configuration that you specify. For example, if you specify
     * <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the
     * MPEG format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>audio/pcm</code>, the speech is returned as
     * <code>audio/pcm</code> in 16-bit, little endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>audio/mpeg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/ogg</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/pcm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>audio/*</code> (defaults to mpeg)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain; charset=utf-8</code>
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
     *            The message that Amazon Lex returns in the response can be
     *            either text or speech based depending on the value of this
     *            field.
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
     *            to generate the speech in the configuration that you specify.
     *            For example, if you specify <code>audio/mpeg</code> as the
     *            value, Amazon Lex returns speech in the MPEG format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the value is <code>audio/pcm</code>, the speech is returned
     *            as <code>audio/pcm</code> in 16-bit, little endian format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following are the accepted values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>audio/mpeg</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>audio/ogg</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>audio/pcm</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>audio/*</code> (defaults to mpeg)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>text/plain; charset=utf-8</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSessionRequest withAccept(String accept) {
        this.accept = accept;
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
        if (getDialogAction() != null)
            sb.append("dialogAction: " + getDialogAction() + ",");
        if (getAccept() != null)
            sb.append("accept: " + getAccept());
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
                + ((getDialogAction() == null) ? 0 : getDialogAction().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSessionRequest == false)
            return false;
        PutSessionRequest other = (PutSessionRequest) obj;

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
        if (other.getDialogAction() == null ^ this.getDialogAction() == null)
            return false;
        if (other.getDialogAction() != null
                && other.getDialogAction().equals(this.getDialogAction()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        return true;
    }
}
