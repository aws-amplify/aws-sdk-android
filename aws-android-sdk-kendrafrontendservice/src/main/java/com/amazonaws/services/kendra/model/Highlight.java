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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information that you can use to highlight a search result so that
 * your users can quickly identify terms in the response.
 * </p>
 */
public class Highlight implements Serializable {
    /**
     * <p>
     * The zero-based location in the response string where the highlight
     * starts.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * Indicates whether the response is the best response. True if this is the
     * best response; otherwise, false.
     * </p>
     */
    private Boolean topAnswer;

    /**
     * <p>
     * The zero-based location in the response string where the highlight
     * starts.
     * </p>
     *
     * @return <p>
     *         The zero-based location in the response string where the
     *         highlight starts.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight
     * starts.
     * </p>
     *
     * @param beginOffset <p>
     *            The zero-based location in the response string where the
     *            highlight starts.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight
     * starts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            The zero-based location in the response string where the
     *            highlight starts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Highlight withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     *
     * @return <p>
     *         The zero-based location in the response string where the
     *         highlight ends.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     *
     * @param endOffset <p>
     *            The zero-based location in the response string where the
     *            highlight ends.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based location in the response string where the highlight ends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            The zero-based location in the response string where the
     *            highlight ends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Highlight withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * <p>
     * Indicates whether the response is the best response. True if this is the
     * best response; otherwise, false.
     * </p>
     *
     * @return <p>
     *         Indicates whether the response is the best response. True if this
     *         is the best response; otherwise, false.
     *         </p>
     */
    public Boolean isTopAnswer() {
        return topAnswer;
    }

    /**
     * <p>
     * Indicates whether the response is the best response. True if this is the
     * best response; otherwise, false.
     * </p>
     *
     * @return <p>
     *         Indicates whether the response is the best response. True if this
     *         is the best response; otherwise, false.
     *         </p>
     */
    public Boolean getTopAnswer() {
        return topAnswer;
    }

    /**
     * <p>
     * Indicates whether the response is the best response. True if this is the
     * best response; otherwise, false.
     * </p>
     *
     * @param topAnswer <p>
     *            Indicates whether the response is the best response. True if
     *            this is the best response; otherwise, false.
     *            </p>
     */
    public void setTopAnswer(Boolean topAnswer) {
        this.topAnswer = topAnswer;
    }

    /**
     * <p>
     * Indicates whether the response is the best response. True if this is the
     * best response; otherwise, false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topAnswer <p>
     *            Indicates whether the response is the best response. True if
     *            this is the best response; otherwise, false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Highlight withTopAnswer(Boolean topAnswer) {
        this.topAnswer = topAnswer;
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
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset() + ",");
        if (getTopAnswer() != null)
            sb.append("TopAnswer: " + getTopAnswer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getTopAnswer() == null) ? 0 : getTopAnswer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Highlight == false)
            return false;
        Highlight other = (Highlight) obj;

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
        if (other.getTopAnswer() == null ^ this.getTopAnswer() == null)
            return false;
        if (other.getTopAnswer() != null
                && other.getTopAnswer().equals(this.getTopAnswer()) == false)
            return false;
        return true;
    }
}
