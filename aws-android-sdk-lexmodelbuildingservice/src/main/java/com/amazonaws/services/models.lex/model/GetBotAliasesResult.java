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

public class GetBotAliasesResult implements Serializable {
    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot
     * alias.
     * </p>
     */
    private java.util.List<BotAliasMetadata> botAliases;

    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to
     * this call is truncated, Amazon Lex returns a pagination token in the
     * response. To fetch the next page of aliases, specify the pagination token
     * in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot
     * alias.
     * </p>
     *
     * @return <p>
     *         An array of <code>BotAliasMetadata</code> objects, each
     *         describing a bot alias.
     *         </p>
     */
    public java.util.List<BotAliasMetadata> getBotAliases() {
        return botAliases;
    }

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot
     * alias.
     * </p>
     *
     * @param botAliases <p>
     *            An array of <code>BotAliasMetadata</code> objects, each
     *            describing a bot alias.
     *            </p>
     */
    public void setBotAliases(java.util.Collection<BotAliasMetadata> botAliases) {
        if (botAliases == null) {
            this.botAliases = null;
            return;
        }

        this.botAliases = new java.util.ArrayList<BotAliasMetadata>(botAliases);
    }

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot
     * alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botAliases <p>
     *            An array of <code>BotAliasMetadata</code> objects, each
     *            describing a bot alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasesResult withBotAliases(BotAliasMetadata... botAliases) {
        if (getBotAliases() == null) {
            this.botAliases = new java.util.ArrayList<BotAliasMetadata>(botAliases.length);
        }
        for (BotAliasMetadata value : botAliases) {
            this.botAliases.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BotAliasMetadata</code> objects, each describing a bot
     * alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botAliases <p>
     *            An array of <code>BotAliasMetadata</code> objects, each
     *            describing a bot alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasesResult withBotAliases(java.util.Collection<BotAliasMetadata> botAliases) {
        setBotAliases(botAliases);
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to
     * this call is truncated, Amazon Lex returns a pagination token in the
     * response. To fetch the next page of aliases, specify the pagination token
     * in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token for fetching next page of aliases. If the
     *         response to this call is truncated, Amazon Lex returns a
     *         pagination token in the response. To fetch the next page of
     *         aliases, specify the pagination token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to
     * this call is truncated, Amazon Lex returns a pagination token in the
     * response. To fetch the next page of aliases, specify the pagination token
     * in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token for fetching next page of aliases. If the
     *            response to this call is truncated, Amazon Lex returns a
     *            pagination token in the response. To fetch the next page of
     *            aliases, specify the pagination token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching next page of aliases. If the response to
     * this call is truncated, Amazon Lex returns a pagination token in the
     * response. To fetch the next page of aliases, specify the pagination token
     * in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token for fetching next page of aliases. If the
     *            response to this call is truncated, Amazon Lex returns a
     *            pagination token in the response. To fetch the next page of
     *            aliases, specify the pagination token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBotAliasesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getBotAliases() != null)
            sb.append("BotAliases: " + getBotAliases() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotAliases() == null) ? 0 : getBotAliases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotAliasesResult == false)
            return false;
        GetBotAliasesResult other = (GetBotAliasesResult) obj;

        if (other.getBotAliases() == null ^ this.getBotAliases() == null)
            return false;
        if (other.getBotAliases() != null
                && other.getBotAliases().equals(this.getBotAliases()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
