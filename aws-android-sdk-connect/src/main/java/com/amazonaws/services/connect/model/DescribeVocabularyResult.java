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

public class DescribeVocabularyResult implements Serializable {
    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to
     * recognize in your audio input. They are generally domain-specific words
     * and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     */
    private Vocabulary vocabulary;

    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to
     * recognize in your audio input. They are generally domain-specific words
     * and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     *
     * @return <p>
     *         A list of specific words that you want Contact Lens for Amazon
     *         Connect to recognize in your audio input. They are generally
     *         domain-specific words and phrases, words that Contact Lens is not
     *         recognizing, or proper nouns.
     *         </p>
     */
    public Vocabulary getVocabulary() {
        return vocabulary;
    }

    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to
     * recognize in your audio input. They are generally domain-specific words
     * and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     *
     * @param vocabulary <p>
     *            A list of specific words that you want Contact Lens for Amazon
     *            Connect to recognize in your audio input. They are generally
     *            domain-specific words and phrases, words that Contact Lens is
     *            not recognizing, or proper nouns.
     *            </p>
     */
    public void setVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    /**
     * <p>
     * A list of specific words that you want Contact Lens for Amazon Connect to
     * recognize in your audio input. They are generally domain-specific words
     * and phrases, words that Contact Lens is not recognizing, or proper nouns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabulary <p>
     *            A list of specific words that you want Contact Lens for Amazon
     *            Connect to recognize in your audio input. They are generally
     *            domain-specific words and phrases, words that Contact Lens is
     *            not recognizing, or proper nouns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVocabularyResult withVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
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
        if (getVocabulary() != null)
            sb.append("Vocabulary: " + getVocabulary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabulary() == null) ? 0 : getVocabulary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVocabularyResult == false)
            return false;
        DescribeVocabularyResult other = (DescribeVocabularyResult) obj;

        if (other.getVocabulary() == null ^ this.getVocabulary() == null)
            return false;
        if (other.getVocabulary() != null
                && other.getVocabulary().equals(this.getVocabulary()) == false)
            return false;
        return true;
    }
}
