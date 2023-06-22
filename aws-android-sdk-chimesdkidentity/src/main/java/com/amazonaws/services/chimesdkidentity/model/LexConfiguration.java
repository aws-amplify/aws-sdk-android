/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for an Amazon Lex V2 bot.
 * </p>
 */
public class LexConfiguration implements Serializable {
    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard
     * messages. Control messages are not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD_MESSAGES
     */
    private String respondsTo;

    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     */
    private InvokedBy invokedBy;

    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lex:[a-z]{2}-[a-z]+-\d{1}:\d{12}:bot-alias/[A-Z0-9
     * ]{10}/[A-Z0-9]{10}<br/>
     */
    private String lexBotAliasArn;

    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must
     * match one of the supported locales in Amazon Lex V2. All of the intents,
     * slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"
     * >Supported languages</a> in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String welcomeIntent;

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard
     * messages. Control messages are not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD_MESSAGES
     *
     * @return <important>
     *         <p>
     *         <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *         </p>
     *         </important>
     *         <p>
     *         Determines whether the Amazon Lex V2 bot responds to all standard
     *         messages. Control messages are not supported.
     *         </p>
     * @see RespondsTo
     */
    public String getRespondsTo() {
        return respondsTo;
    }

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard
     * messages. Control messages are not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD_MESSAGES
     *
     * @param respondsTo <important>
     *            <p>
     *            <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *            </p>
     *            </important>
     *            <p>
     *            Determines whether the Amazon Lex V2 bot responds to all
     *            standard messages. Control messages are not supported.
     *            </p>
     * @see RespondsTo
     */
    public void setRespondsTo(String respondsTo) {
        this.respondsTo = respondsTo;
    }

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard
     * messages. Control messages are not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD_MESSAGES
     *
     * @param respondsTo <important>
     *            <p>
     *            <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *            </p>
     *            </important>
     *            <p>
     *            Determines whether the Amazon Lex V2 bot responds to all
     *            standard messages. Control messages are not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RespondsTo
     */
    public LexConfiguration withRespondsTo(String respondsTo) {
        this.respondsTo = respondsTo;
        return this;
    }

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard
     * messages. Control messages are not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD_MESSAGES
     *
     * @param respondsTo <important>
     *            <p>
     *            <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *            </p>
     *            </important>
     *            <p>
     *            Determines whether the Amazon Lex V2 bot responds to all
     *            standard messages. Control messages are not supported.
     *            </p>
     * @see RespondsTo
     */
    public void setRespondsTo(RespondsTo respondsTo) {
        this.respondsTo = respondsTo.toString();
    }

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard
     * messages. Control messages are not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD_MESSAGES
     *
     * @param respondsTo <important>
     *            <p>
     *            <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *            </p>
     *            </important>
     *            <p>
     *            Determines whether the Amazon Lex V2 bot responds to all
     *            standard messages. Control messages are not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RespondsTo
     */
    public LexConfiguration withRespondsTo(RespondsTo respondsTo) {
        this.respondsTo = respondsTo.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     *
     * @return <p>
     *         Specifies the type of message that triggers a bot.
     *         </p>
     */
    public InvokedBy getInvokedBy() {
        return invokedBy;
    }

    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     *
     * @param invokedBy <p>
     *            Specifies the type of message that triggers a bot.
     *            </p>
     */
    public void setInvokedBy(InvokedBy invokedBy) {
        this.invokedBy = invokedBy;
    }

    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invokedBy <p>
     *            Specifies the type of message that triggers a bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexConfiguration withInvokedBy(InvokedBy invokedBy) {
        this.invokedBy = invokedBy;
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lex:[a-z]{2}-[a-z]+-\d{1}:\d{12}:bot-alias/[A-Z0-9
     * ]{10}/[A-Z0-9]{10}<br/>
     *
     * @return <p>
     *         The ARN of the Amazon Lex V2 bot's alias. The ARN uses this
     *         format:
     *         <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     *         </p>
     */
    public String getLexBotAliasArn() {
        return lexBotAliasArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lex:[a-z]{2}-[a-z]+-\d{1}:\d{12}:bot-alias/[A-Z0-9
     * ]{10}/[A-Z0-9]{10}<br/>
     *
     * @param lexBotAliasArn <p>
     *            The ARN of the Amazon Lex V2 bot's alias. The ARN uses this
     *            format:
     *            <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     *            </p>
     */
    public void setLexBotAliasArn(String lexBotAliasArn) {
        this.lexBotAliasArn = lexBotAliasArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lex:[a-z]{2}-[a-z]+-\d{1}:\d{12}:bot-alias/[A-Z0-9
     * ]{10}/[A-Z0-9]{10}<br/>
     *
     * @param lexBotAliasArn <p>
     *            The ARN of the Amazon Lex V2 bot's alias. The ARN uses this
     *            format:
     *            <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexConfiguration withLexBotAliasArn(String lexBotAliasArn) {
        this.lexBotAliasArn = lexBotAliasArn;
        return this;
    }

    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must
     * match one of the supported locales in Amazon Lex V2. All of the intents,
     * slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"
     * >Supported languages</a> in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Identifies the Amazon Lex V2 bot's language and locale. The
     *         string must match one of the supported locales in Amazon Lex V2.
     *         All of the intents, slot types, and slots used in the bot must
     *         have the same locale. For more information, see <a href=
     *         "https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"
     *         >Supported languages</a> in the <i>Amazon Lex V2 Developer
     *         Guide</i>.
     *         </p>
     */
    public String getLocaleId() {
        return localeId;
    }

    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must
     * match one of the supported locales in Amazon Lex V2. All of the intents,
     * slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"
     * >Supported languages</a> in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     *
     * @param localeId <p>
     *            Identifies the Amazon Lex V2 bot's language and locale. The
     *            string must match one of the supported locales in Amazon Lex
     *            V2. All of the intents, slot types, and slots used in the bot
     *            must have the same locale. For more information, see <a href=
     *            "https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"
     *            >Supported languages</a> in the <i>Amazon Lex V2 Developer
     *            Guide</i>.
     *            </p>
     */
    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must
     * match one of the supported locales in Amazon Lex V2. All of the intents,
     * slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"
     * >Supported languages</a> in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localeId <p>
     *            Identifies the Amazon Lex V2 bot's language and locale. The
     *            string must match one of the supported locales in Amazon Lex
     *            V2. All of the intents, slot types, and slots used in the bot
     *            must have the same locale. For more information, see <a href=
     *            "https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"
     *            >Supported languages</a> in the <i>Amazon Lex V2 Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexConfiguration withLocaleId(String localeId) {
        this.localeId = localeId;
        return this;
    }

    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the welcome intent configured in the Amazon Lex V2
     *         bot.
     *         </p>
     */
    public String getWelcomeIntent() {
        return welcomeIntent;
    }

    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param welcomeIntent <p>
     *            The name of the welcome intent configured in the Amazon Lex V2
     *            bot.
     *            </p>
     */
    public void setWelcomeIntent(String welcomeIntent) {
        this.welcomeIntent = welcomeIntent;
    }

    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param welcomeIntent <p>
     *            The name of the welcome intent configured in the Amazon Lex V2
     *            bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexConfiguration withWelcomeIntent(String welcomeIntent) {
        this.welcomeIntent = welcomeIntent;
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
        if (getRespondsTo() != null)
            sb.append("RespondsTo: " + getRespondsTo() + ",");
        if (getInvokedBy() != null)
            sb.append("InvokedBy: " + getInvokedBy() + ",");
        if (getLexBotAliasArn() != null)
            sb.append("LexBotAliasArn: " + getLexBotAliasArn() + ",");
        if (getLocaleId() != null)
            sb.append("LocaleId: " + getLocaleId() + ",");
        if (getWelcomeIntent() != null)
            sb.append("WelcomeIntent: " + getWelcomeIntent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRespondsTo() == null) ? 0 : getRespondsTo().hashCode());
        hashCode = prime * hashCode + ((getInvokedBy() == null) ? 0 : getInvokedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLexBotAliasArn() == null) ? 0 : getLexBotAliasArn().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode
                + ((getWelcomeIntent() == null) ? 0 : getWelcomeIntent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexConfiguration == false)
            return false;
        LexConfiguration other = (LexConfiguration) obj;

        if (other.getRespondsTo() == null ^ this.getRespondsTo() == null)
            return false;
        if (other.getRespondsTo() != null
                && other.getRespondsTo().equals(this.getRespondsTo()) == false)
            return false;
        if (other.getInvokedBy() == null ^ this.getInvokedBy() == null)
            return false;
        if (other.getInvokedBy() != null
                && other.getInvokedBy().equals(this.getInvokedBy()) == false)
            return false;
        if (other.getLexBotAliasArn() == null ^ this.getLexBotAliasArn() == null)
            return false;
        if (other.getLexBotAliasArn() != null
                && other.getLexBotAliasArn().equals(this.getLexBotAliasArn()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getWelcomeIntent() == null ^ this.getWelcomeIntent() == null)
            return false;
        if (other.getWelcomeIntent() != null
                && other.getWelcomeIntent().equals(this.getWelcomeIntent()) == false)
            return false;
        return true;
    }
}
