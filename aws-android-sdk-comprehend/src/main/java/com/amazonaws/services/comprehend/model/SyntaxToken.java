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
 * Represents a work in the input text that was recognized and assigned a part
 * of speech. There is one syntax token record for each word in the source text.
 * </p>
 */
public class SyntaxToken implements Serializable {
    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     */
    private Integer tokenId;

    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the word.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the word.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon
     * Comprehend has that the part of speech was correctly identified. For more
     * information, see <a>how-syntax</a>.
     * </p>
     */
    private PartOfSpeechTag partOfSpeech;

    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     *
     * @return <p>
     *         A unique identifier for a token.
     *         </p>
     */
    public Integer getTokenId() {
        return tokenId;
    }

    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     *
     * @param tokenId <p>
     *            A unique identifier for a token.
     *            </p>
     */
    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * <p>
     * A unique identifier for a token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenId <p>
     *            A unique identifier for a token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SyntaxToken withTokenId(Integer tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The word that was recognized in the source text.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The word that was recognized in the source text.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The word that was recognized in the source text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The word that was recognized in the source text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SyntaxToken withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the word.
     * </p>
     *
     * @return <p>
     *         The zero-based offset from the beginning of the source text to
     *         the first character in the word.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the word.
     * </p>
     *
     * @param beginOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the first character in the word.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the word.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the first character in the word.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SyntaxToken withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the word.
     * </p>
     *
     * @return <p>
     *         The zero-based offset from the beginning of the source text to
     *         the last character in the word.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the word.
     * </p>
     *
     * @param endOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the last character in the word.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the word.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the last character in the word.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SyntaxToken withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon
     * Comprehend has that the part of speech was correctly identified. For more
     * information, see <a>how-syntax</a>.
     * </p>
     *
     * @return <p>
     *         Provides the part of speech label and the confidence level that
     *         Amazon Comprehend has that the part of speech was correctly
     *         identified. For more information, see <a>how-syntax</a>.
     *         </p>
     */
    public PartOfSpeechTag getPartOfSpeech() {
        return partOfSpeech;
    }

    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon
     * Comprehend has that the part of speech was correctly identified. For more
     * information, see <a>how-syntax</a>.
     * </p>
     *
     * @param partOfSpeech <p>
     *            Provides the part of speech label and the confidence level
     *            that Amazon Comprehend has that the part of speech was
     *            correctly identified. For more information, see
     *            <a>how-syntax</a>.
     *            </p>
     */
    public void setPartOfSpeech(PartOfSpeechTag partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    /**
     * <p>
     * Provides the part of speech label and the confidence level that Amazon
     * Comprehend has that the part of speech was correctly identified. For more
     * information, see <a>how-syntax</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partOfSpeech <p>
     *            Provides the part of speech label and the confidence level
     *            that Amazon Comprehend has that the part of speech was
     *            correctly identified. For more information, see
     *            <a>how-syntax</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SyntaxToken withPartOfSpeech(PartOfSpeechTag partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
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
        if (getTokenId() != null)
            sb.append("TokenId: " + getTokenId() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset() + ",");
        if (getPartOfSpeech() != null)
            sb.append("PartOfSpeech: " + getPartOfSpeech());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode
                + ((getPartOfSpeech() == null) ? 0 : getPartOfSpeech().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyntaxToken == false)
            return false;
        SyntaxToken other = (SyntaxToken) obj;

        if (other.getTokenId() == null ^ this.getTokenId() == null)
            return false;
        if (other.getTokenId() != null && other.getTokenId().equals(this.getTokenId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null
                && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null
                && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        if (other.getPartOfSpeech() == null ^ this.getPartOfSpeech() == null)
            return false;
        if (other.getPartOfSpeech() != null
                && other.getPartOfSpeech().equals(this.getPartOfSpeech()) == false)
            return false;
        return true;
    }
}
