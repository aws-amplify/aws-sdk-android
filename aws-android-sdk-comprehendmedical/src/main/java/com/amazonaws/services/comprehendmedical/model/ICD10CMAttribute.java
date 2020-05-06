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

package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;

/**
 * <p>
 * The detected attributes that relate to an entity. This includes an extracted
 * segment of the text that is an attribute of an entity, or otherwise related
 * to an entity. InferICD10CM detects the following attributes:
 * <code>Direction</code>, <code>System, Organ or Site</code>, and
 * <code>Acuity</code>.
 * </p>
 */
public class ICD10CMAttribute implements Serializable {
    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type
     * <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY,
     * QUANTITY
     */
    private String type;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * segment of text is correctly recognized as an attribute.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this
     * attribute is correctly related to this entity.
     * </p>
     */
    private Float relationshipScore;

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically
     * increasing id unique within this response rather than a global unique
     * identifier.
     * </p>
     */
    private Integer id;

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute begins. The offset returns the UTF-8 code point in the string.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute ends. The offset returns the UTF-8 code point in the string.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     */
    private java.util.List<ICD10CMTrait> traits;

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type
     * <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY,
     * QUANTITY
     *
     * @return <p>
     *         The type of attribute. InferICD10CM detects entities of the type
     *         <code>DX_NAME</code>.
     *         </p>
     * @see ICD10CMAttributeType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type
     * <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY,
     * QUANTITY
     *
     * @param type <p>
     *            The type of attribute. InferICD10CM detects entities of the
     *            type <code>DX_NAME</code>.
     *            </p>
     * @see ICD10CMAttributeType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type
     * <code>DX_NAME</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY,
     * QUANTITY
     *
     * @param type <p>
     *            The type of attribute. InferICD10CM detects entities of the
     *            type <code>DX_NAME</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ICD10CMAttributeType
     */
    public ICD10CMAttribute withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type
     * <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY,
     * QUANTITY
     *
     * @param type <p>
     *            The type of attribute. InferICD10CM detects entities of the
     *            type <code>DX_NAME</code>.
     *            </p>
     * @see ICD10CMAttributeType
     */
    public void setType(ICD10CMAttributeType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of attribute. InferICD10CM detects entities of the type
     * <code>DX_NAME</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACUITY, DIRECTION, SYSTEM_ORGAN_SITE, QUALITY,
     * QUANTITY
     *
     * @param type <p>
     *            The type of attribute. InferICD10CM detects entities of the
     *            type <code>DX_NAME</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ICD10CMAttributeType
     */
    public ICD10CMAttribute withType(ICD10CMAttributeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * segment of text is correctly recognized as an attribute.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend Medical has that
     *         the segment of text is correctly recognized as an attribute.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * segment of text is correctly recognized as an attribute.
     * </p>
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has
     *            that the segment of text is correctly recognized as an
     *            attribute.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * segment of text is correctly recognized as an attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has
     *            that the segment of text is correctly recognized as an
     *            attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this
     * attribute is correctly related to this entity.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend Medical has that
     *         this attribute is correctly related to this entity.
     *         </p>
     */
    public Float getRelationshipScore() {
        return relationshipScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this
     * attribute is correctly related to this entity.
     * </p>
     *
     * @param relationshipScore <p>
     *            The level of confidence that Amazon Comprehend Medical has
     *            that this attribute is correctly related to this entity.
     *            </p>
     */
    public void setRelationshipScore(Float relationshipScore) {
        this.relationshipScore = relationshipScore;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that this
     * attribute is correctly related to this entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationshipScore <p>
     *            The level of confidence that Amazon Comprehend Medical has
     *            that this attribute is correctly related to this entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withRelationshipScore(Float relationshipScore) {
        this.relationshipScore = relationshipScore;
        return this;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically
     * increasing id unique within this response rather than a global unique
     * identifier.
     * </p>
     *
     * @return <p>
     *         The numeric identifier for this attribute. This is a
     *         monotonically increasing id unique within this response rather
     *         than a global unique identifier.
     *         </p>
     */
    public Integer getId() {
        return id;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically
     * increasing id unique within this response rather than a global unique
     * identifier.
     * </p>
     *
     * @param id <p>
     *            The numeric identifier for this attribute. This is a
     *            monotonically increasing id unique within this response rather
     *            than a global unique identifier.
     *            </p>
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The numeric identifier for this attribute. This is a monotonically
     * increasing id unique within this response rather than a global unique
     * identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The numeric identifier for this attribute. This is a
     *            monotonically increasing id unique within this response rather
     *            than a global unique identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute begins. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @return <p>
     *         The 0-based character offset in the input text that shows where
     *         the attribute begins. The offset returns the UTF-8 code point in
     *         the string.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute begins. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @param beginOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the attribute begins. The offset returns the UTF-8 code
     *            point in the string.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute begins. The offset returns the UTF-8 code point in the string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the attribute begins. The offset returns the UTF-8 code
     *            point in the string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute ends. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @return <p>
     *         The 0-based character offset in the input text that shows where
     *         the attribute ends. The offset returns the UTF-8 code point in
     *         the string.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute ends. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @param endOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the attribute ends. The offset returns the UTF-8 code
     *            point in the string.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * attribute ends. The offset returns the UTF-8 code point in the string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the attribute ends. The offset returns the UTF-8 code
     *            point in the string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The segment of input text which contains the detected attribute.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The segment of input text which contains the detected
     *            attribute.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The segment of input text which contains the detected attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The segment of input text which contains the detected
     *            attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     *
     * @return <p>
     *         The contextual information for the attribute. The traits
     *         recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *         <code>SIGN</code>, <code>SYMPTOM</code>, and
     *         <code>NEGATION</code>.
     *         </p>
     */
    public java.util.List<ICD10CMTrait> getTraits() {
        return traits;
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     *
     * @param traits <p>
     *            The contextual information for the attribute. The traits
     *            recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *            <code>SIGN</code>, <code>SYMPTOM</code>, and
     *            <code>NEGATION</code>.
     *            </p>
     */
    public void setTraits(java.util.Collection<ICD10CMTrait> traits) {
        if (traits == null) {
            this.traits = null;
            return;
        }

        this.traits = new java.util.ArrayList<ICD10CMTrait>(traits);
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traits <p>
     *            The contextual information for the attribute. The traits
     *            recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *            <code>SIGN</code>, <code>SYMPTOM</code>, and
     *            <code>NEGATION</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withTraits(ICD10CMTrait... traits) {
        if (getTraits() == null) {
            this.traits = new java.util.ArrayList<ICD10CMTrait>(traits.length);
        }
        for (ICD10CMTrait value : traits) {
            this.traits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The contextual information for the attribute. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traits <p>
     *            The contextual information for the attribute. The traits
     *            recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *            <code>SIGN</code>, <code>SYMPTOM</code>, and
     *            <code>NEGATION</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMAttribute withTraits(java.util.Collection<ICD10CMTrait> traits) {
        setTraits(traits);
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getRelationshipScore() != null)
            sb.append("RelationshipScore: " + getRelationshipScore() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getTraits() != null)
            sb.append("Traits: " + getTraits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode
                + ((getRelationshipScore() == null) ? 0 : getRelationshipScore().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTraits() == null) ? 0 : getTraits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ICD10CMAttribute == false)
            return false;
        ICD10CMAttribute other = (ICD10CMAttribute) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getRelationshipScore() == null ^ this.getRelationshipScore() == null)
            return false;
        if (other.getRelationshipScore() != null
                && other.getRelationshipScore().equals(this.getRelationshipScore()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTraits() == null ^ this.getTraits() == null)
            return false;
        if (other.getTraits() != null && other.getTraits().equals(this.getTraits()) == false)
            return false;
        return true;
    }
}
