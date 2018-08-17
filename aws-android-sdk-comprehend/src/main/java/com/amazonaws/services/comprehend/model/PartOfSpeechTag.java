/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Identifies the part of speech represented by the token and gives the
 * confidence that Amazon Comprehend has that the part of speech was correctly
 * identified. For more information about the parts of speech that Amazon
 * Comprehend can identify, see <a>how-syntax</a>.
 * </p>
 */
public class PartOfSpeechTag implements Serializable {
    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADJ, ADP, ADV, AUX, CONJ, DET, INTJ, NOUN, NUM, O,
     * PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB
     */
    private String tag;

    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was
     * correctly identified.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADJ, ADP, ADV, AUX, CONJ, DET, INTJ, NOUN, NUM, O,
     * PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB
     *
     * @return <p>
     *         Identifies the part of speech that the token represents.
     *         </p>
     * @see PartOfSpeechTagType
     */
    public String getTag() {
        return tag;
    }

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADJ, ADP, ADV, AUX, CONJ, DET, INTJ, NOUN, NUM, O,
     * PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB
     *
     * @param tag <p>
     *            Identifies the part of speech that the token represents.
     *            </p>
     * @see PartOfSpeechTagType
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADJ, ADP, ADV, AUX, CONJ, DET, INTJ, NOUN, NUM, O,
     * PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB
     *
     * @param tag <p>
     *            Identifies the part of speech that the token represents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PartOfSpeechTagType
     */
    public PartOfSpeechTag withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADJ, ADP, ADV, AUX, CONJ, DET, INTJ, NOUN, NUM, O,
     * PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB
     *
     * @param tag <p>
     *            Identifies the part of speech that the token represents.
     *            </p>
     * @see PartOfSpeechTagType
     */
    public void setTag(PartOfSpeechTagType tag) {
        this.tag = tag.toString();
    }

    /**
     * <p>
     * Identifies the part of speech that the token represents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADJ, ADP, ADV, AUX, CONJ, DET, INTJ, NOUN, NUM, O,
     * PART, PRON, PROPN, PUNCT, SCONJ, SYM, VERB
     *
     * @param tag <p>
     *            Identifies the part of speech that the token represents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PartOfSpeechTagType
     */
    public PartOfSpeechTag withTag(PartOfSpeechTagType tag) {
        this.tag = tag.toString();
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was
     * correctly identified.
     * </p>
     *
     * @return <p>
     *         The confidence that Amazon Comprehend has that the part of speech
     *         was correctly identified.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was
     * correctly identified.
     * </p>
     *
     * @param score <p>
     *            The confidence that Amazon Comprehend has that the part of
     *            speech was correctly identified.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The confidence that Amazon Comprehend has that the part of speech was
     * correctly identified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The confidence that Amazon Comprehend has that the part of
     *            speech was correctly identified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PartOfSpeechTag withScore(Float score) {
        this.score = score;
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
        if (getTag() != null)
            sb.append("Tag: " + getTag() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartOfSpeechTag == false)
            return false;
        PartOfSpeechTag other = (PartOfSpeechTag) obj;

        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
