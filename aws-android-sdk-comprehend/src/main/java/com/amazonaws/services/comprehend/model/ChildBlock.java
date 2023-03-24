/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Nested block contained within a block.
 * </p>
 */
public class ChildBlock implements Serializable {
    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String childBlockId;

    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Unique identifier for the child block.
     *         </p>
     */
    public String getChildBlockId() {
        return childBlockId;
    }

    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param childBlockId <p>
     *            Unique identifier for the child block.
     *            </p>
     */
    public void setChildBlockId(String childBlockId) {
        this.childBlockId = childBlockId;
    }

    /**
     * <p>
     * Unique identifier for the child block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param childBlockId <p>
     *            Unique identifier for the child block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChildBlock withChildBlockId(String childBlockId) {
        this.childBlockId = childBlockId;
        return this;
    }

    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     *
     * @return <p>
     *         Offset of the start of the child block within its parent block.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     *
     * @param beginOffset <p>
     *            Offset of the start of the child block within its parent
     *            block.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the child block within its parent block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            Offset of the start of the child block within its parent
     *            block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChildBlock withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     *
     * @return <p>
     *         Offset of the end of the child block within its parent block.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     *
     * @param endOffset <p>
     *            Offset of the end of the child block within its parent block.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * Offset of the end of the child block within its parent block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            Offset of the end of the child block within its parent block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChildBlock withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
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
        if (getChildBlockId() != null)
            sb.append("ChildBlockId: " + getChildBlockId() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChildBlockId() == null) ? 0 : getChildBlockId().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChildBlock == false)
            return false;
        ChildBlock other = (ChildBlock) obj;

        if (other.getChildBlockId() == null ^ this.getChildBlockId() == null)
            return false;
        if (other.getChildBlockId() != null
                && other.getChildBlockId().equals(this.getChildBlockId()) == false)
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
        return true;
    }
}
