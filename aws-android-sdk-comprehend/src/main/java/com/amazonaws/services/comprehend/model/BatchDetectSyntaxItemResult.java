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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * The result of calling the operation. The operation returns one object that is
 * successfully processed by the operation.
 * </p>
 */
public class BatchDetectSyntaxItemResult implements Serializable {
    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     */
    private java.util.List<SyntaxToken> syntaxTokens;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @return <p>
     *         The zero-based index of the document in the input list.
     *         </p>
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSyntaxItemResult withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     *
     * @return <p>
     *         The syntax tokens for the words in the document, one token for
     *         each word.
     *         </p>
     */
    public java.util.List<SyntaxToken> getSyntaxTokens() {
        return syntaxTokens;
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     *
     * @param syntaxTokens <p>
     *            The syntax tokens for the words in the document, one token for
     *            each word.
     *            </p>
     */
    public void setSyntaxTokens(java.util.Collection<SyntaxToken> syntaxTokens) {
        if (syntaxTokens == null) {
            this.syntaxTokens = null;
            return;
        }

        this.syntaxTokens = new java.util.ArrayList<SyntaxToken>(syntaxTokens);
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param syntaxTokens <p>
     *            The syntax tokens for the words in the document, one token for
     *            each word.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSyntaxItemResult withSyntaxTokens(SyntaxToken... syntaxTokens) {
        if (getSyntaxTokens() == null) {
            this.syntaxTokens = new java.util.ArrayList<SyntaxToken>(syntaxTokens.length);
        }
        for (SyntaxToken value : syntaxTokens) {
            this.syntaxTokens.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param syntaxTokens <p>
     *            The syntax tokens for the words in the document, one token for
     *            each word.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSyntaxItemResult withSyntaxTokens(
            java.util.Collection<SyntaxToken> syntaxTokens) {
        setSyntaxTokens(syntaxTokens);
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
        if (getSyntaxTokens() != null)
            sb.append("SyntaxTokens: " + getSyntaxTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode
                + ((getSyntaxTokens() == null) ? 0 : getSyntaxTokens().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectSyntaxItemResult == false)
            return false;
        BatchDetectSyntaxItemResult other = (BatchDetectSyntaxItemResult) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getSyntaxTokens() == null ^ this.getSyntaxTokens() == null)
            return false;
        if (other.getSyntaxTokens() != null
                && other.getSyntaxTokens().equals(this.getSyntaxTokens()) == false)
            return false;
        return true;
    }
}
