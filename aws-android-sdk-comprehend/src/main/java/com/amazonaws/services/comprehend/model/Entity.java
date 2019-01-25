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
     * The entity's type.
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
     * A character offset in the input text that shows where the entity begins
     * (the first character is at position 0). The offset returns the position
     * of each UTF-8 code point in the string. A <i>code point</i> is the
     * abstract character from a particular graphical representation. For
     * example, a multi-byte UTF-8 character maps to a single code point.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * A character offset in the input text that shows where the entity ends.
     * The offset returns the position of each UTF-8 code point in the string. A
     * <i>code point</i> is the abstract character from a particular graphical
     * representation. For example, a multi-byte UTF-8 character maps to a
     * single code point.
     * </p>
     */
    private Integer endOffset;

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
     * The entity's type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @return <p>
     *         The entity's type.
     *         </p>
     * @see EntityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The entity's type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @param type <p>
     *            The entity's type.
     *            </p>
     * @see EntityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The entity's type.
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
     *            The entity's type.
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
     * The entity's type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERSON, LOCATION, ORGANIZATION, COMMERCIAL_ITEM,
     * EVENT, DATE, QUANTITY, TITLE, OTHER
     *
     * @param type <p>
     *            The entity's type.
     *            </p>
     * @see EntityType
     */
    public void setType(EntityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The entity's type.
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
     *            The entity's type.
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
     * A character offset in the input text that shows where the entity begins
     * (the first character is at position 0). The offset returns the position
     * of each UTF-8 code point in the string. A <i>code point</i> is the
     * abstract character from a particular graphical representation. For
     * example, a multi-byte UTF-8 character maps to a single code point.
     * </p>
     *
     * @return <p>
     *         A character offset in the input text that shows where the entity
     *         begins (the first character is at position 0). The offset returns
     *         the position of each UTF-8 code point in the string. A <i>code
     *         point</i> is the abstract character from a particular graphical
     *         representation. For example, a multi-byte UTF-8 character maps to
     *         a single code point.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * A character offset in the input text that shows where the entity begins
     * (the first character is at position 0). The offset returns the position
     * of each UTF-8 code point in the string. A <i>code point</i> is the
     * abstract character from a particular graphical representation. For
     * example, a multi-byte UTF-8 character maps to a single code point.
     * </p>
     *
     * @param beginOffset <p>
     *            A character offset in the input text that shows where the
     *            entity begins (the first character is at position 0). The
     *            offset returns the position of each UTF-8 code point in the
     *            string. A <i>code point</i> is the abstract character from a
     *            particular graphical representation. For example, a multi-byte
     *            UTF-8 character maps to a single code point.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * A character offset in the input text that shows where the entity begins
     * (the first character is at position 0). The offset returns the position
     * of each UTF-8 code point in the string. A <i>code point</i> is the
     * abstract character from a particular graphical representation. For
     * example, a multi-byte UTF-8 character maps to a single code point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            A character offset in the input text that shows where the
     *            entity begins (the first character is at position 0). The
     *            offset returns the position of each UTF-8 code point in the
     *            string. A <i>code point</i> is the abstract character from a
     *            particular graphical representation. For example, a multi-byte
     *            UTF-8 character maps to a single code point.
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
     * A character offset in the input text that shows where the entity ends.
     * The offset returns the position of each UTF-8 code point in the string. A
     * <i>code point</i> is the abstract character from a particular graphical
     * representation. For example, a multi-byte UTF-8 character maps to a
     * single code point.
     * </p>
     *
     * @return <p>
     *         A character offset in the input text that shows where the entity
     *         ends. The offset returns the position of each UTF-8 code point in
     *         the string. A <i>code point</i> is the abstract character from a
     *         particular graphical representation. For example, a multi-byte
     *         UTF-8 character maps to a single code point.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * A character offset in the input text that shows where the entity ends.
     * The offset returns the position of each UTF-8 code point in the string. A
     * <i>code point</i> is the abstract character from a particular graphical
     * representation. For example, a multi-byte UTF-8 character maps to a
     * single code point.
     * </p>
     *
     * @param endOffset <p>
     *            A character offset in the input text that shows where the
     *            entity ends. The offset returns the position of each UTF-8
     *            code point in the string. A <i>code point</i> is the abstract
     *            character from a particular graphical representation. For
     *            example, a multi-byte UTF-8 character maps to a single code
     *            point.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * A character offset in the input text that shows where the entity ends.
     * The offset returns the position of each UTF-8 code point in the string. A
     * <i>code point</i> is the abstract character from a particular graphical
     * representation. For example, a multi-byte UTF-8 character maps to a
     * single code point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            A character offset in the input text that shows where the
     *            entity ends. The offset returns the position of each UTF-8
     *            code point in the string. A <i>code point</i> is the abstract
     *            character from a particular graphical representation. For
     *            example, a multi-byte UTF-8 character maps to a single code
     *            point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Entity withEndOffset(Integer endOffset) {
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
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
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

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
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
        return true;
    }
}
