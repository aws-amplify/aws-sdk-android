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
 * A reference to a block.
 * </p>
 */
public class BlockReference implements Serializable {
    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String blockId;

    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     */
    private java.util.List<ChildBlock> childBlocks;

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Unique identifier for the block.
     *         </p>
     */
    public String getBlockId() {
        return blockId;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param blockId <p>
     *            Unique identifier for the block.
     *            </p>
     */
    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    /**
     * <p>
     * Unique identifier for the block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param blockId <p>
     *            Unique identifier for the block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockReference withBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }

    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     *
     * @return <p>
     *         Offset of the start of the block within its parent block.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     *
     * @param beginOffset <p>
     *            Offset of the start of the block within its parent block.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * Offset of the start of the block within its parent block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            Offset of the start of the block within its parent block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockReference withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     *
     * @return <p>
     *         Offset of the end of the block within its parent block.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     *
     * @param endOffset <p>
     *            Offset of the end of the block within its parent block.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * Offset of the end of the block within its parent block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            Offset of the end of the block within its parent block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockReference withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     *
     * @return <p>
     *         List of child blocks within this block.
     *         </p>
     */
    public java.util.List<ChildBlock> getChildBlocks() {
        return childBlocks;
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     *
     * @param childBlocks <p>
     *            List of child blocks within this block.
     *            </p>
     */
    public void setChildBlocks(java.util.Collection<ChildBlock> childBlocks) {
        if (childBlocks == null) {
            this.childBlocks = null;
            return;
        }

        this.childBlocks = new java.util.ArrayList<ChildBlock>(childBlocks);
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param childBlocks <p>
     *            List of child blocks within this block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockReference withChildBlocks(ChildBlock... childBlocks) {
        if (getChildBlocks() == null) {
            this.childBlocks = new java.util.ArrayList<ChildBlock>(childBlocks.length);
        }
        for (ChildBlock value : childBlocks) {
            this.childBlocks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of child blocks within this block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param childBlocks <p>
     *            List of child blocks within this block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockReference withChildBlocks(java.util.Collection<ChildBlock> childBlocks) {
        setChildBlocks(childBlocks);
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
        if (getBlockId() != null)
            sb.append("BlockId: " + getBlockId() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset() + ",");
        if (getChildBlocks() != null)
            sb.append("ChildBlocks: " + getChildBlocks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockId() == null) ? 0 : getBlockId().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode
                + ((getChildBlocks() == null) ? 0 : getChildBlocks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockReference == false)
            return false;
        BlockReference other = (BlockReference) obj;

        if (other.getBlockId() == null ^ this.getBlockId() == null)
            return false;
        if (other.getBlockId() != null && other.getBlockId().equals(this.getBlockId()) == false)
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
        if (other.getChildBlocks() == null ^ this.getChildBlocks() == null)
            return false;
        if (other.getChildBlocks() != null
                && other.getChildBlocks().equals(this.getChildBlocks()) == false)
            return false;
        return true;
    }
}
