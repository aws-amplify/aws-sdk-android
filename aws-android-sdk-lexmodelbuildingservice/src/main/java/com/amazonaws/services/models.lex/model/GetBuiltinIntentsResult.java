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

public class GetBuiltinIntentsResult implements Serializable {
    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each
     * intent in the response.
     * </p>
     */
    private java.util.List<BuiltinIntentMetadata> intents;

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each
     * intent in the response.
     * </p>
     *
     * @return <p>
     *         An array of <code>builtinIntentMetadata</code> objects, one for
     *         each intent in the response.
     *         </p>
     */
    public java.util.List<BuiltinIntentMetadata> getIntents() {
        return intents;
    }

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each
     * intent in the response.
     * </p>
     *
     * @param intents <p>
     *            An array of <code>builtinIntentMetadata</code> objects, one
     *            for each intent in the response.
     *            </p>
     */
    public void setIntents(java.util.Collection<BuiltinIntentMetadata> intents) {
        if (intents == null) {
            this.intents = null;
            return;
        }

        this.intents = new java.util.ArrayList<BuiltinIntentMetadata>(intents);
    }

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each
     * intent in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intents <p>
     *            An array of <code>builtinIntentMetadata</code> objects, one
     *            for each intent in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentsResult withIntents(BuiltinIntentMetadata... intents) {
        if (getIntents() == null) {
            this.intents = new java.util.ArrayList<BuiltinIntentMetadata>(intents.length);
        }
        for (BuiltinIntentMetadata value : intents) {
            this.intents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>builtinIntentMetadata</code> objects, one for each
     * intent in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param intents <p>
     *            An array of <code>builtinIntentMetadata</code> objects, one
     *            for each intent in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentsResult withIntents(java.util.Collection<BuiltinIntentMetadata> intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token that fetches the next page of intents. If the
     *         response to this API call is truncated, Amazon Lex returns a
     *         pagination token in the response. To fetch the next page of
     *         intents, specify the pagination token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of intents. If
     *            the response to this API call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            intents, specify the pagination token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of intents. If
     *            the response to this API call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            intents, specify the pagination token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinIntentsResult withNextToken(String nextToken) {
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
        if (getIntents() != null)
            sb.append("intents: " + getIntents() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntents() == null) ? 0 : getIntents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBuiltinIntentsResult == false)
            return false;
        GetBuiltinIntentsResult other = (GetBuiltinIntentsResult) obj;

        if (other.getIntents() == null ^ this.getIntents() == null)
            return false;
        if (other.getIntents() != null && other.getIntents().equals(this.getIntents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
