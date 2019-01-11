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

public class DetectSyntaxResult implements Serializable {
    /**
     * <p>
     * A collection of syntax tokens describing the text. For each token, the
     * response provides the text, the token type, where the text begins and
     * ends, and the level of confidence that Amazon Comprehend has that the
     * token is correct. For a list of token types, see <a>how-syntax</a>.
     * </p>
     */
    private java.util.List<SyntaxToken> syntaxTokens;

    /**
     * <p>
     * A collection of syntax tokens describing the text. For each token, the
     * response provides the text, the token type, where the text begins and
     * ends, and the level of confidence that Amazon Comprehend has that the
     * token is correct. For a list of token types, see <a>how-syntax</a>.
     * </p>
     *
     * @return <p>
     *         A collection of syntax tokens describing the text. For each
     *         token, the response provides the text, the token type, where the
     *         text begins and ends, and the level of confidence that Amazon
     *         Comprehend has that the token is correct. For a list of token
     *         types, see <a>how-syntax</a>.
     *         </p>
     */
    public java.util.List<SyntaxToken> getSyntaxTokens() {
        return syntaxTokens;
    }

    /**
     * <p>
     * A collection of syntax tokens describing the text. For each token, the
     * response provides the text, the token type, where the text begins and
     * ends, and the level of confidence that Amazon Comprehend has that the
     * token is correct. For a list of token types, see <a>how-syntax</a>.
     * </p>
     *
     * @param syntaxTokens <p>
     *            A collection of syntax tokens describing the text. For each
     *            token, the response provides the text, the token type, where
     *            the text begins and ends, and the level of confidence that
     *            Amazon Comprehend has that the token is correct. For a list of
     *            token types, see <a>how-syntax</a>.
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
     * A collection of syntax tokens describing the text. For each token, the
     * response provides the text, the token type, where the text begins and
     * ends, and the level of confidence that Amazon Comprehend has that the
     * token is correct. For a list of token types, see <a>how-syntax</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param syntaxTokens <p>
     *            A collection of syntax tokens describing the text. For each
     *            token, the response provides the text, the token type, where
     *            the text begins and ends, and the level of confidence that
     *            Amazon Comprehend has that the token is correct. For a list of
     *            token types, see <a>how-syntax</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectSyntaxResult withSyntaxTokens(SyntaxToken... syntaxTokens) {
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
     * A collection of syntax tokens describing the text. For each token, the
     * response provides the text, the token type, where the text begins and
     * ends, and the level of confidence that Amazon Comprehend has that the
     * token is correct. For a list of token types, see <a>how-syntax</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param syntaxTokens <p>
     *            A collection of syntax tokens describing the text. For each
     *            token, the response provides the text, the token type, where
     *            the text begins and ends, and the level of confidence that
     *            Amazon Comprehend has that the token is correct. For a list of
     *            token types, see <a>how-syntax</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectSyntaxResult withSyntaxTokens(java.util.Collection<SyntaxToken> syntaxTokens) {
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
        if (getSyntaxTokens() != null)
            sb.append("SyntaxTokens: " + getSyntaxTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof DetectSyntaxResult == false)
            return false;
        DetectSyntaxResult other = (DetectSyntaxResult) obj;

        if (other.getSyntaxTokens() == null ^ this.getSyntaxTokens() == null)
            return false;
        if (other.getSyntaxTokens() != null
                && other.getSyntaxTokens().equals(this.getSyntaxTokens()) == false)
            return false;
        return true;
    }
}
