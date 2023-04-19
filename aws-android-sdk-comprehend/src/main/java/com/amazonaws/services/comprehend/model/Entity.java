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
 * Provides information about an entity.
 * </p>
 * <p>
 * </p>
 */
public class Entity implements Serializable {
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this
     * field contains one of the standard entity types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types
     * that you specified when you trained your custom model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     */
    private String type;

    /**
     * <p>
     * The text of the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for
     * plain-text input.
     * </p>
     */
    private java.util.List<BlockReference> blockReferences;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of the detection.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of the detection.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of the detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this
     * field contains one of the standard entity types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types
     * that you specified when you trained your custom model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @return <p>
     *         The entity type. For entity detection using the built-in model,
     *         this field contains one of the standard entity types listed
     *         below.
     *         </p>
     *         <p>
     *         For custom entity detection, this field contains one of the
     *         entity types that you specified when you trained your custom
     *         model.
     *         </p>
     * @see EntityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this
     * field contains one of the standard entity types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types
     * that you specified when you trained your custom model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @param type <p>
     *            The entity type. For entity detection using the built-in
     *            model, this field contains one of the standard entity types
     *            listed below.
     *            </p>
     *            <p>
     *            For custom entity detection, this field contains one of the
     *            entity types that you specified when you trained your custom
     *            model.
     *            </p>
     * @see EntityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this
     * field contains one of the standard entity types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types
     * that you specified when you trained your custom model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @param type <p>
     *            The entity type. For entity detection using the built-in
     *            model, this field contains one of the standard entity types
     *            listed below.
     *            </p>
     *            <p>
     *            For custom entity detection, this field contains one of the
     *            entity types that you specified when you trained your custom
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityType
     */
    public Entity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this
     * field contains one of the standard entity types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types
     * that you specified when you trained your custom model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @param type <p>
     *            The entity type. For entity detection using the built-in
     *            model, this field contains one of the standard entity types
     *            listed below.
     *            </p>
     *            <p>
     *            For custom entity detection, this field contains one of the
     *            entity types that you specified when you trained your custom
     *            model.
     *            </p>
     * @see EntityType
     */
    public void setType(EntityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The entity type. For entity detection using the built-in model, this
     * field contains one of the standard entity types listed below.
     * </p>
     * <p>
     * For custom entity detection, this field contains one of the entity types
     * that you specified when you trained your custom model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @param type <p>
     *            The entity type. For entity detection using the built-in
     *            model, this field contains one of the standard entity types
     *            listed below.
     *            </p>
     *            <p>
     *            For custom entity detection, this field contains one of the
     *            entity types that you specified when you trained your custom
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityType
     */
    public Entity withType(EntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The text of the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The text of the entity.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The text of the entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The text of the entity.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text of the entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The text of the entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     *
     * @return <p>
     *         The zero-based offset from the beginning of the source text to
     *         the first character in the entity.
     *         </p>
     *         <p>
     *         This field is empty for non-text input.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     *
     * @param beginOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the first character in the entity.
     *            </p>
     *            <p>
     *            This field is empty for non-text input.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the first
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the first character in the entity.
     *            </p>
     *            <p>
     *            This field is empty for non-text input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     *
     * @return <p>
     *         The zero-based offset from the beginning of the source text to
     *         the last character in the entity.
     *         </p>
     *         <p>
     *         This field is empty for non-text input.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     *
     * @param endOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the last character in the entity.
     *            </p>
     *            <p>
     *            This field is empty for non-text input.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The zero-based offset from the beginning of the source text to the last
     * character in the entity.
     * </p>
     * <p>
     * This field is empty for non-text input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            The zero-based offset from the beginning of the source text to
     *            the last character in the entity.
     *            </p>
     *            <p>
     *            This field is empty for non-text input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for
     * plain-text input.
     * </p>
     *
     * @return <p>
     *         A reference to each block for this entity. This field is empty
     *         for plain-text input.
     *         </p>
     */
    public java.util.List<BlockReference> getBlockReferences() {
        return blockReferences;
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for
     * plain-text input.
     * </p>
     *
     * @param blockReferences <p>
     *            A reference to each block for this entity. This field is empty
     *            for plain-text input.
     *            </p>
     */
    public void setBlockReferences(java.util.Collection<BlockReference> blockReferences) {
        if (blockReferences == null) {
            this.blockReferences = null;
            return;
        }

        this.blockReferences = new java.util.ArrayList<BlockReference>(blockReferences);
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for
     * plain-text input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockReferences <p>
     *            A reference to each block for this entity. This field is empty
     *            for plain-text input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withBlockReferences(BlockReference... blockReferences) {
        if (getBlockReferences() == null) {
            this.blockReferences = new java.util.ArrayList<BlockReference>(blockReferences.length);
        }
        for (BlockReference value : blockReferences) {
            this.blockReferences.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A reference to each block for this entity. This field is empty for
     * plain-text input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockReferences <p>
     *            A reference to each block for this entity. This field is empty
     *            for plain-text input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withBlockReferences(java.util.Collection<BlockReference> blockReferences) {
        setBlockReferences(blockReferences);
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
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset() + ",");
        if (getBlockReferences() != null)
            sb.append("BlockReferences: " + getBlockReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode
                + ((getBlockReferences() == null) ? 0 : getBlockReferences().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Entity == false)
            return false;
        Entity other = (Entity) obj;

        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        if (other.getBlockReferences() == null ^ this.getBlockReferences() == null)
            return false;
        if (other.getBlockReferences() != null
                && other.getBlockReferences().equals(this.getBlockReferences()) == false)
            return false;
        return true;
    }
}
