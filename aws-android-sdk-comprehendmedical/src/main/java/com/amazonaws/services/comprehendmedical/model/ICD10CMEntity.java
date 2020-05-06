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
 * The collection of medical entities extracted from the input text and their
 * associated information. For each entity, the response provides the entity
 * text, the entity category, where the entity text begins and ends, and the
 * level of confidence that Amazon Comprehend Medical has in the detection and
 * analysis. Attributes and traits of the entity are also returned.
 * </p>
 */
public class ICD10CMEntity implements Serializable {
    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing
     * id unique within this response rather than a global unique identifier.
     * </p>
     */
    private Integer id;

    /**
     * <p>
     * The segment of input text that is matched to the detected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     */
    private String text;

    /**
     * <p>
     * The category of the entity. InferICD10CM detects entities in the
     * <code>MEDICAL_CONDITION</code> category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICAL_CONDITION
     */
    private String category;

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DX_NAME
     */
    private String type;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of the detection.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity begins. The offset returns the UTF-8 code point in the string.
     * </p>
     */
    private Integer beginOffset;

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity ends. The offset returns the UTF-8 code point in the string.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * The detected attributes that relate to the entity. An extracted segment
     * of the text that is an attribute of an entity, or otherwise related to an
     * entity, such as the nature of a medical condition.
     * </p>
     */
    private java.util.List<ICD10CMAttribute> attributes;

    /**
     * <p>
     * Provides Contextual information for the entity. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION.</code>
     * </p>
     */
    private java.util.List<ICD10CMTrait> traits;

    /**
     * <p>
     * The ICD-10-CM concepts that the entity could refer to, along with a score
     * indicating the likelihood of the match.
     * </p>
     */
    private java.util.List<ICD10CMConcept> iCD10CMConcepts;

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing
     * id unique within this response rather than a global unique identifier.
     * </p>
     *
     * @return <p>
     *         The numeric identifier for the entity. This is a monotonically
     *         increasing id unique within this response rather than a global
     *         unique identifier.
     *         </p>
     */
    public Integer getId() {
        return id;
    }

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing
     * id unique within this response rather than a global unique identifier.
     * </p>
     *
     * @param id <p>
     *            The numeric identifier for the entity. This is a monotonically
     *            increasing id unique within this response rather than a global
     *            unique identifier.
     *            </p>
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The numeric identifier for the entity. This is a monotonically increasing
     * id unique within this response rather than a global unique identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The numeric identifier for the entity. This is a monotonically
     *            increasing id unique within this response rather than a global
     *            unique identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The segment of input text that is matched to the detected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The segment of input text that is matched to the detected entity.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The segment of input text that is matched to the detected entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param text <p>
     *            The segment of input text that is matched to the detected
     *            entity.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The segment of input text that is matched to the detected entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param text <p>
     *            The segment of input text that is matched to the detected
     *            entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The category of the entity. InferICD10CM detects entities in the
     * <code>MEDICAL_CONDITION</code> category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICAL_CONDITION
     *
     * @return <p>
     *         The category of the entity. InferICD10CM detects entities in the
     *         <code>MEDICAL_CONDITION</code> category.
     *         </p>
     * @see ICD10CMEntityCategory
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category of the entity. InferICD10CM detects entities in the
     * <code>MEDICAL_CONDITION</code> category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICAL_CONDITION
     *
     * @param category <p>
     *            The category of the entity. InferICD10CM detects entities in
     *            the <code>MEDICAL_CONDITION</code> category.
     *            </p>
     * @see ICD10CMEntityCategory
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the entity. InferICD10CM detects entities in the
     * <code>MEDICAL_CONDITION</code> category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICAL_CONDITION
     *
     * @param category <p>
     *            The category of the entity. InferICD10CM detects entities in
     *            the <code>MEDICAL_CONDITION</code> category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ICD10CMEntityCategory
     */
    public ICD10CMEntity withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The category of the entity. InferICD10CM detects entities in the
     * <code>MEDICAL_CONDITION</code> category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICAL_CONDITION
     *
     * @param category <p>
     *            The category of the entity. InferICD10CM detects entities in
     *            the <code>MEDICAL_CONDITION</code> category.
     *            </p>
     * @see ICD10CMEntityCategory
     */
    public void setCategory(ICD10CMEntityCategory category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * The category of the entity. InferICD10CM detects entities in the
     * <code>MEDICAL_CONDITION</code> category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICAL_CONDITION
     *
     * @param category <p>
     *            The category of the entity. InferICD10CM detects entities in
     *            the <code>MEDICAL_CONDITION</code> category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ICD10CMEntityCategory
     */
    public ICD10CMEntity withCategory(ICD10CMEntityCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DX_NAME
     *
     * @return <p>
     *         Describes the specific type of entity with category of entities.
     *         InferICD10CM detects entities of the type <code>DX_NAME</code>.
     *         </p>
     * @see ICD10CMEntityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DX_NAME
     *
     * @param type <p>
     *            Describes the specific type of entity with category of
     *            entities. InferICD10CM detects entities of the type
     *            <code>DX_NAME</code>.
     *            </p>
     * @see ICD10CMEntityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DX_NAME
     *
     * @param type <p>
     *            Describes the specific type of entity with category of
     *            entities. InferICD10CM detects entities of the type
     *            <code>DX_NAME</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ICD10CMEntityType
     */
    public ICD10CMEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DX_NAME
     *
     * @param type <p>
     *            Describes the specific type of entity with category of
     *            entities. InferICD10CM detects entities of the type
     *            <code>DX_NAME</code>.
     *            </p>
     * @see ICD10CMEntityType
     */
    public void setType(ICD10CMEntityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Describes the specific type of entity with category of entities.
     * InferICD10CM detects entities of the type <code>DX_NAME</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DX_NAME
     *
     * @param type <p>
     *            Describes the specific type of entity with category of
     *            entities. InferICD10CM detects entities of the type
     *            <code>DX_NAME</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ICD10CMEntityType
     */
    public ICD10CMEntity withType(ICD10CMEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of the detection.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend Medical has in the
     *         accuracy of the detection.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of the detection.
     * </p>
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has in
     *            the accuracy of the detection.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of the detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has in
     *            the accuracy of the detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity begins. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @return <p>
     *         The 0-based character offset in the input text that shows where
     *         the entity begins. The offset returns the UTF-8 code point in the
     *         string.
     *         </p>
     */
    public Integer getBeginOffset() {
        return beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity begins. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @param beginOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the entity begins. The offset returns the UTF-8 code
     *            point in the string.
     *            </p>
     */
    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity begins. The offset returns the UTF-8 code point in the string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beginOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the entity begins. The offset returns the UTF-8 code
     *            point in the string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity ends. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @return <p>
     *         The 0-based character offset in the input text that shows where
     *         the entity ends. The offset returns the UTF-8 code point in the
     *         string.
     *         </p>
     */
    public Integer getEndOffset() {
        return endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity ends. The offset returns the UTF-8 code point in the string.
     * </p>
     *
     * @param endOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the entity ends. The offset returns the UTF-8 code point
     *            in the string.
     *            </p>
     */
    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The 0-based character offset in the input text that shows where the
     * entity ends. The offset returns the UTF-8 code point in the string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endOffset <p>
     *            The 0-based character offset in the input text that shows
     *            where the entity ends. The offset returns the UTF-8 code point
     *            in the string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * <p>
     * The detected attributes that relate to the entity. An extracted segment
     * of the text that is an attribute of an entity, or otherwise related to an
     * entity, such as the nature of a medical condition.
     * </p>
     *
     * @return <p>
     *         The detected attributes that relate to the entity. An extracted
     *         segment of the text that is an attribute of an entity, or
     *         otherwise related to an entity, such as the nature of a medical
     *         condition.
     *         </p>
     */
    public java.util.List<ICD10CMAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The detected attributes that relate to the entity. An extracted segment
     * of the text that is an attribute of an entity, or otherwise related to an
     * entity, such as the nature of a medical condition.
     * </p>
     *
     * @param attributes <p>
     *            The detected attributes that relate to the entity. An
     *            extracted segment of the text that is an attribute of an
     *            entity, or otherwise related to an entity, such as the nature
     *            of a medical condition.
     *            </p>
     */
    public void setAttributes(java.util.Collection<ICD10CMAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<ICD10CMAttribute>(attributes);
    }

    /**
     * <p>
     * The detected attributes that relate to the entity. An extracted segment
     * of the text that is an attribute of an entity, or otherwise related to an
     * entity, such as the nature of a medical condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The detected attributes that relate to the entity. An
     *            extracted segment of the text that is an attribute of an
     *            entity, or otherwise related to an entity, such as the nature
     *            of a medical condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withAttributes(ICD10CMAttribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<ICD10CMAttribute>(attributes.length);
        }
        for (ICD10CMAttribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The detected attributes that relate to the entity. An extracted segment
     * of the text that is an attribute of an entity, or otherwise related to an
     * entity, such as the nature of a medical condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The detected attributes that relate to the entity. An
     *            extracted segment of the text that is an attribute of an
     *            entity, or otherwise related to an entity, such as the nature
     *            of a medical condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withAttributes(java.util.Collection<ICD10CMAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Provides Contextual information for the entity. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION.</code>
     * </p>
     *
     * @return <p>
     *         Provides Contextual information for the entity. The traits
     *         recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *         <code>SIGN</code>, <code>SYMPTOM</code>, and
     *         <code>NEGATION.</code>
     *         </p>
     */
    public java.util.List<ICD10CMTrait> getTraits() {
        return traits;
    }

    /**
     * <p>
     * Provides Contextual information for the entity. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION.</code>
     * </p>
     *
     * @param traits <p>
     *            Provides Contextual information for the entity. The traits
     *            recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *            <code>SIGN</code>, <code>SYMPTOM</code>, and
     *            <code>NEGATION.</code>
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
     * Provides Contextual information for the entity. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION.</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traits <p>
     *            Provides Contextual information for the entity. The traits
     *            recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *            <code>SIGN</code>, <code>SYMPTOM</code>, and
     *            <code>NEGATION.</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withTraits(ICD10CMTrait... traits) {
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
     * Provides Contextual information for the entity. The traits recognized by
     * InferICD10CM are <code>DIAGNOSIS</code>, <code>SIGN</code>,
     * <code>SYMPTOM</code>, and <code>NEGATION.</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traits <p>
     *            Provides Contextual information for the entity. The traits
     *            recognized by InferICD10CM are <code>DIAGNOSIS</code>,
     *            <code>SIGN</code>, <code>SYMPTOM</code>, and
     *            <code>NEGATION.</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withTraits(java.util.Collection<ICD10CMTrait> traits) {
        setTraits(traits);
        return this;
    }

    /**
     * <p>
     * The ICD-10-CM concepts that the entity could refer to, along with a score
     * indicating the likelihood of the match.
     * </p>
     *
     * @return <p>
     *         The ICD-10-CM concepts that the entity could refer to, along with
     *         a score indicating the likelihood of the match.
     *         </p>
     */
    public java.util.List<ICD10CMConcept> getICD10CMConcepts() {
        return iCD10CMConcepts;
    }

    /**
     * <p>
     * The ICD-10-CM concepts that the entity could refer to, along with a score
     * indicating the likelihood of the match.
     * </p>
     *
     * @param iCD10CMConcepts <p>
     *            The ICD-10-CM concepts that the entity could refer to, along
     *            with a score indicating the likelihood of the match.
     *            </p>
     */
    public void setICD10CMConcepts(java.util.Collection<ICD10CMConcept> iCD10CMConcepts) {
        if (iCD10CMConcepts == null) {
            this.iCD10CMConcepts = null;
            return;
        }

        this.iCD10CMConcepts = new java.util.ArrayList<ICD10CMConcept>(iCD10CMConcepts);
    }

    /**
     * <p>
     * The ICD-10-CM concepts that the entity could refer to, along with a score
     * indicating the likelihood of the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iCD10CMConcepts <p>
     *            The ICD-10-CM concepts that the entity could refer to, along
     *            with a score indicating the likelihood of the match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withICD10CMConcepts(ICD10CMConcept... iCD10CMConcepts) {
        if (getICD10CMConcepts() == null) {
            this.iCD10CMConcepts = new java.util.ArrayList<ICD10CMConcept>(iCD10CMConcepts.length);
        }
        for (ICD10CMConcept value : iCD10CMConcepts) {
            this.iCD10CMConcepts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ICD-10-CM concepts that the entity could refer to, along with a score
     * indicating the likelihood of the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iCD10CMConcepts <p>
     *            The ICD-10-CM concepts that the entity could refer to, along
     *            with a score indicating the likelihood of the match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMEntity withICD10CMConcepts(java.util.Collection<ICD10CMConcept> iCD10CMConcepts) {
        setICD10CMConcepts(iCD10CMConcepts);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getTraits() != null)
            sb.append("Traits: " + getTraits() + ",");
        if (getICD10CMConcepts() != null)
            sb.append("ICD10CMConcepts: " + getICD10CMConcepts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getTraits() == null) ? 0 : getTraits().hashCode());
        hashCode = prime * hashCode
                + ((getICD10CMConcepts() == null) ? 0 : getICD10CMConcepts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ICD10CMEntity == false)
            return false;
        ICD10CMEntity other = (ICD10CMEntity) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
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
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getTraits() == null ^ this.getTraits() == null)
            return false;
        if (other.getTraits() != null && other.getTraits().equals(this.getTraits()) == false)
            return false;
        if (other.getICD10CMConcepts() == null ^ this.getICD10CMConcepts() == null)
            return false;
        if (other.getICD10CMConcepts() != null
                && other.getICD10CMConcepts().equals(this.getICD10CMConcepts()) == false)
            return false;
        return true;
    }
}
