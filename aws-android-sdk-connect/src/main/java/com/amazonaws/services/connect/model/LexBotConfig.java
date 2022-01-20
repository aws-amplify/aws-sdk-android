/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information of an Amazon Lex or Amazon Lex V2 bot.
 * </p>
 */
public class LexBotConfig implements Serializable {
    /**
     * <p>
     * Configuration information of an Amazon Lex bot.
     * </p>
     */
    private LexBot lexBot;

    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     */
    private LexV2Bot lexV2Bot;

    /**
     * <p>
     * Configuration information of an Amazon Lex bot.
     * </p>
     *
     * @return <p>
     *         Configuration information of an Amazon Lex bot.
     *         </p>
     */
    public LexBot getLexBot() {
        return lexBot;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex bot.
     * </p>
     *
     * @param lexBot <p>
     *            Configuration information of an Amazon Lex bot.
     *            </p>
     */
    public void setLexBot(LexBot lexBot) {
        this.lexBot = lexBot;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexBot <p>
     *            Configuration information of an Amazon Lex bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexBotConfig withLexBot(LexBot lexBot) {
        this.lexBot = lexBot;
        return this;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     *
     * @return <p>
     *         Configuration information of an Amazon Lex V2 bot.
     *         </p>
     */
    public LexV2Bot getLexV2Bot() {
        return lexV2Bot;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     *
     * @param lexV2Bot <p>
     *            Configuration information of an Amazon Lex V2 bot.
     *            </p>
     */
    public void setLexV2Bot(LexV2Bot lexV2Bot) {
        this.lexV2Bot = lexV2Bot;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexV2Bot <p>
     *            Configuration information of an Amazon Lex V2 bot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexBotConfig withLexV2Bot(LexV2Bot lexV2Bot) {
        this.lexV2Bot = lexV2Bot;
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
        if (getLexBot() != null)
            sb.append("LexBot: " + getLexBot() + ",");
        if (getLexV2Bot() != null)
            sb.append("LexV2Bot: " + getLexV2Bot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexBot() == null) ? 0 : getLexBot().hashCode());
        hashCode = prime * hashCode + ((getLexV2Bot() == null) ? 0 : getLexV2Bot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexBotConfig == false)
            return false;
        LexBotConfig other = (LexBotConfig) obj;

        if (other.getLexBot() == null ^ this.getLexBot() == null)
            return false;
        if (other.getLexBot() != null && other.getLexBot().equals(this.getLexBot()) == false)
            return false;
        if (other.getLexV2Bot() == null ^ this.getLexV2Bot() == null)
            return false;
        if (other.getLexV2Bot() != null && other.getLexV2Bot().equals(this.getLexV2Bot()) == false)
            return false;
        return true;
    }
}
