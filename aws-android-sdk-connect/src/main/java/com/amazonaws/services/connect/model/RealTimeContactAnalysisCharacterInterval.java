/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Begin and end offsets for a part of text.
 * </p>
 */
public class RealTimeContactAnalysisCharacterInterval implements Serializable {
    /**
     * <p>
     * The beginning of the character interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer beginOffsetChar;

    /**
     * <p>
     * The end of the character interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer endOffsetChar;

    /**
     * <p>
     * The beginning of the character interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The beginning of the character interval.
     *         </p>
     */
    public Integer getBeginOffsetChar() {
        return beginOffsetChar;
    }

    /**
     * <p>
     * The beginning of the character interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param beginOffsetChar <p>
     *            The beginning of the character interval.
     *            </p>
     */
    public void setBeginOffsetChar(Integer beginOffsetChar) {
        this.beginOffsetChar = beginOffsetChar;
    }

    /**
     * <p>
     * The beginning of the character interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param beginOffsetChar <p>
     *            The beginning of the character interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisCharacterInterval withBeginOffsetChar(Integer beginOffsetChar) {
        this.beginOffsetChar = beginOffsetChar;
        return this;
    }

    /**
     * <p>
     * The end of the character interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The end of the character interval.
     *         </p>
     */
    public Integer getEndOffsetChar() {
        return endOffsetChar;
    }

    /**
     * <p>
     * The end of the character interval.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endOffsetChar <p>
     *            The end of the character interval.
     *            </p>
     */
    public void setEndOffsetChar(Integer endOffsetChar) {
        this.endOffsetChar = endOffsetChar;
    }

    /**
     * <p>
     * The end of the character interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endOffsetChar <p>
     *            The end of the character interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisCharacterInterval withEndOffsetChar(Integer endOffsetChar) {
        this.endOffsetChar = endOffsetChar;
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
        if (getBeginOffsetChar() != null)
            sb.append("BeginOffsetChar: " + getBeginOffsetChar() + ",");
        if (getEndOffsetChar() != null)
            sb.append("EndOffsetChar: " + getEndOffsetChar());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBeginOffsetChar() == null) ? 0 : getBeginOffsetChar().hashCode());
        hashCode = prime * hashCode
                + ((getEndOffsetChar() == null) ? 0 : getEndOffsetChar().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisCharacterInterval == false)
            return false;
        RealTimeContactAnalysisCharacterInterval other = (RealTimeContactAnalysisCharacterInterval) obj;

        if (other.getBeginOffsetChar() == null ^ this.getBeginOffsetChar() == null)
            return false;
        if (other.getBeginOffsetChar() != null
                && other.getBeginOffsetChar().equals(this.getBeginOffsetChar()) == false)
            return false;
        if (other.getEndOffsetChar() == null ^ this.getEndOffsetChar() == null)
            return false;
        if (other.getEndOffsetChar() != null
                && other.getEndOffsetChar().equals(this.getEndOffsetChar()) == false)
            return false;
        return true;
    }
}
