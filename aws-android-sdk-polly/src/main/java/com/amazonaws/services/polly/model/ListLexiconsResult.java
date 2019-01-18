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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

public class ListLexiconsResult implements Serializable {
    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     */
    private java.util.List<LexiconDescription> lexicons;

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of lexicons. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     *
     * @return <p>
     *         A list of lexicon names and attributes.
     *         </p>
     */
    public java.util.List<LexiconDescription> getLexicons() {
        return lexicons;
    }

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     *
     * @param lexicons <p>
     *            A list of lexicon names and attributes.
     *            </p>
     */
    public void setLexicons(java.util.Collection<LexiconDescription> lexicons) {
        if (lexicons == null) {
            this.lexicons = null;
            return;
        }

        this.lexicons = new java.util.ArrayList<LexiconDescription>(lexicons);
    }

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexicons <p>
     *            A list of lexicon names and attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLexiconsResult withLexicons(LexiconDescription... lexicons) {
        if (getLexicons() == null) {
            this.lexicons = new java.util.ArrayList<LexiconDescription>(lexicons.length);
        }
        for (LexiconDescription value : lexicons) {
            this.lexicons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of lexicon names and attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexicons <p>
     *            A list of lexicon names and attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLexiconsResult withLexicons(java.util.Collection<LexiconDescription> lexicons) {
        setLexicons(lexicons);
        return this;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of lexicons. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     *
     * @return <p>
     *         The pagination token to use in the next request to continue the
     *         listing of lexicons. <code>NextToken</code> is returned only if
     *         the response is truncated.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of lexicons. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use in the next request to continue
     *            the listing of lexicons. <code>NextToken</code> is returned
     *            only if the response is truncated.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use in the next request to continue the listing
     * of lexicons. <code>NextToken</code> is returned only if the response is
     * truncated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use in the next request to continue
     *            the listing of lexicons. <code>NextToken</code> is returned
     *            only if the response is truncated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLexiconsResult withNextToken(String nextToken) {
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
        if (getLexicons() != null)
            sb.append("Lexicons: " + getLexicons() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexicons() == null) ? 0 : getLexicons().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLexiconsResult == false)
            return false;
        ListLexiconsResult other = (ListLexiconsResult) obj;

        if (other.getLexicons() == null ^ this.getLexicons() == null)
            return false;
        if (other.getLexicons() != null && other.getLexicons().equals(this.getLexicons()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
