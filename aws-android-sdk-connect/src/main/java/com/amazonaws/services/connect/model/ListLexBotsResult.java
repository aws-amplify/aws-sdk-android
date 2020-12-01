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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListLexBotsResult implements Serializable {
    /**
     * <p>
     * The the names and regions of the Amazon Lex bots associated with the
     * specified instance.
     * </p>
     */
    private java.util.List<LexBot> lexBots;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The the names and regions of the Amazon Lex bots associated with the
     * specified instance.
     * </p>
     *
     * @return <p>
     *         The the names and regions of the Amazon Lex bots associated with
     *         the specified instance.
     *         </p>
     */
    public java.util.List<LexBot> getLexBots() {
        return lexBots;
    }

    /**
     * <p>
     * The the names and regions of the Amazon Lex bots associated with the
     * specified instance.
     * </p>
     *
     * @param lexBots <p>
     *            The the names and regions of the Amazon Lex bots associated
     *            with the specified instance.
     *            </p>
     */
    public void setLexBots(java.util.Collection<LexBot> lexBots) {
        if (lexBots == null) {
            this.lexBots = null;
            return;
        }

        this.lexBots = new java.util.ArrayList<LexBot>(lexBots);
    }

    /**
     * <p>
     * The the names and regions of the Amazon Lex bots associated with the
     * specified instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexBots <p>
     *            The the names and regions of the Amazon Lex bots associated
     *            with the specified instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLexBotsResult withLexBots(LexBot... lexBots) {
        if (getLexBots() == null) {
            this.lexBots = new java.util.ArrayList<LexBot>(lexBots.length);
        }
        for (LexBot value : lexBots) {
            this.lexBots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The the names and regions of the Amazon Lex bots associated with the
     * specified instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexBots <p>
     *            The the names and regions of the Amazon Lex bots associated
     *            with the specified instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLexBotsResult withLexBots(java.util.Collection<LexBot> lexBots) {
        setLexBots(lexBots);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLexBotsResult withNextToken(String nextToken) {
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
        if (getLexBots() != null)
            sb.append("LexBots: " + getLexBots() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexBots() == null) ? 0 : getLexBots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLexBotsResult == false)
            return false;
        ListLexBotsResult other = (ListLexBotsResult) obj;

        if (other.getLexBots() == null ^ this.getLexBots() == null)
            return false;
        if (other.getLexBots() != null && other.getLexBots().equals(this.getLexBots()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
