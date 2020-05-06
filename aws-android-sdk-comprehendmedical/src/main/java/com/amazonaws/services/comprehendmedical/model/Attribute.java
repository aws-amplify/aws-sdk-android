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
 * An extracted segment of the text that is an attribute of an entity, or
 * otherwise related to an entity, such as the dosage of a medication taken. It
 * contains information about the attribute such as id, begin and end offset
 * within the input text, and the segment of the input text.
 * </p>
 */
public class Attribute implements Serializable {
    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY,
     * DURATION, GENERIC_NAME, BRAND_NAME, STRENGTH, RATE, ACUITY, TEST_NAME,
     * TEST_VALUE, TEST_UNITS, PROCEDURE_NAME, TREATMENT_NAME, DATE, AGE,
     * CONTACT_POINT, EMAIL, IDENTIFIER, URL, ADDRESS, PROFESSION,
     * SYSTEM_ORGAN_SITE, DIRECTION, QUALITY, QUANTITY, TIME_EXPRESSION,
     * TIME_TO_MEDICATION_NAME, TIME_TO_DX_NAME, TIME_TO_TEST_NAME,
     * TIME_TO_PROCEDURE_NAME, TIME_TO_TREATMENT_NAME
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
     * The type of relationship between the entity and attribute. Type for the
     * relationship is <code>OVERLAP</code>, indicating that the entity occurred
     * at the same time as the <code>Date_Expression</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVERY, WITH_DOSAGE, ADMINISTERED_VIA, FOR,
     * NEGATIVE, OVERLAP, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY, DURATION,
     * STRENGTH, RATE, ACUITY, TEST_VALUE, TEST_UNITS, DIRECTION
     */
    private String relationshipType;

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
     * The segment of input text extracted as this attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The category of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     */
    private String category;

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     */
    private java.util.List<Trait> traits;

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY,
     * DURATION, GENERIC_NAME, BRAND_NAME, STRENGTH, RATE, ACUITY, TEST_NAME,
     * TEST_VALUE, TEST_UNITS, PROCEDURE_NAME, TREATMENT_NAME, DATE, AGE,
     * CONTACT_POINT, EMAIL, IDENTIFIER, URL, ADDRESS, PROFESSION,
     * SYSTEM_ORGAN_SITE, DIRECTION, QUALITY, QUANTITY, TIME_EXPRESSION,
     * TIME_TO_MEDICATION_NAME, TIME_TO_DX_NAME, TIME_TO_TEST_NAME,
     * TIME_TO_PROCEDURE_NAME, TIME_TO_TREATMENT_NAME
     *
     * @return <p>
     *         The type of attribute.
     *         </p>
     * @see EntitySubType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY,
     * DURATION, GENERIC_NAME, BRAND_NAME, STRENGTH, RATE, ACUITY, TEST_NAME,
     * TEST_VALUE, TEST_UNITS, PROCEDURE_NAME, TREATMENT_NAME, DATE, AGE,
     * CONTACT_POINT, EMAIL, IDENTIFIER, URL, ADDRESS, PROFESSION,
     * SYSTEM_ORGAN_SITE, DIRECTION, QUALITY, QUANTITY, TIME_EXPRESSION,
     * TIME_TO_MEDICATION_NAME, TIME_TO_DX_NAME, TIME_TO_TEST_NAME,
     * TIME_TO_PROCEDURE_NAME, TIME_TO_TREATMENT_NAME
     *
     * @param type <p>
     *            The type of attribute.
     *            </p>
     * @see EntitySubType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY,
     * DURATION, GENERIC_NAME, BRAND_NAME, STRENGTH, RATE, ACUITY, TEST_NAME,
     * TEST_VALUE, TEST_UNITS, PROCEDURE_NAME, TREATMENT_NAME, DATE, AGE,
     * CONTACT_POINT, EMAIL, IDENTIFIER, URL, ADDRESS, PROFESSION,
     * SYSTEM_ORGAN_SITE, DIRECTION, QUALITY, QUANTITY, TIME_EXPRESSION,
     * TIME_TO_MEDICATION_NAME, TIME_TO_DX_NAME, TIME_TO_TEST_NAME,
     * TIME_TO_PROCEDURE_NAME, TIME_TO_TREATMENT_NAME
     *
     * @param type <p>
     *            The type of attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntitySubType
     */
    public Attribute withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY,
     * DURATION, GENERIC_NAME, BRAND_NAME, STRENGTH, RATE, ACUITY, TEST_NAME,
     * TEST_VALUE, TEST_UNITS, PROCEDURE_NAME, TREATMENT_NAME, DATE, AGE,
     * CONTACT_POINT, EMAIL, IDENTIFIER, URL, ADDRESS, PROFESSION,
     * SYSTEM_ORGAN_SITE, DIRECTION, QUALITY, QUANTITY, TIME_EXPRESSION,
     * TIME_TO_MEDICATION_NAME, TIME_TO_DX_NAME, TIME_TO_TEST_NAME,
     * TIME_TO_PROCEDURE_NAME, TIME_TO_TREATMENT_NAME
     *
     * @param type <p>
     *            The type of attribute.
     *            </p>
     * @see EntitySubType
     */
    public void setType(EntitySubType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY,
     * DURATION, GENERIC_NAME, BRAND_NAME, STRENGTH, RATE, ACUITY, TEST_NAME,
     * TEST_VALUE, TEST_UNITS, PROCEDURE_NAME, TREATMENT_NAME, DATE, AGE,
     * CONTACT_POINT, EMAIL, IDENTIFIER, URL, ADDRESS, PROFESSION,
     * SYSTEM_ORGAN_SITE, DIRECTION, QUALITY, QUANTITY, TIME_EXPRESSION,
     * TIME_TO_MEDICATION_NAME, TIME_TO_DX_NAME, TIME_TO_TEST_NAME,
     * TIME_TO_PROCEDURE_NAME, TIME_TO_TREATMENT_NAME
     *
     * @param type <p>
     *            The type of attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntitySubType
     */
    public Attribute withType(EntitySubType type) {
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
    public Attribute withScore(Float score) {
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
    public Attribute withRelationshipScore(Float relationshipScore) {
        this.relationshipScore = relationshipScore;
        return this;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the
     * relationship is <code>OVERLAP</code>, indicating that the entity occurred
     * at the same time as the <code>Date_Expression</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVERY, WITH_DOSAGE, ADMINISTERED_VIA, FOR,
     * NEGATIVE, OVERLAP, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY, DURATION,
     * STRENGTH, RATE, ACUITY, TEST_VALUE, TEST_UNITS, DIRECTION
     *
     * @return <p>
     *         The type of relationship between the entity and attribute. Type
     *         for the relationship is <code>OVERLAP</code>, indicating that the
     *         entity occurred at the same time as the
     *         <code>Date_Expression</code>.
     *         </p>
     * @see RelationshipType
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the
     * relationship is <code>OVERLAP</code>, indicating that the entity occurred
     * at the same time as the <code>Date_Expression</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVERY, WITH_DOSAGE, ADMINISTERED_VIA, FOR,
     * NEGATIVE, OVERLAP, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY, DURATION,
     * STRENGTH, RATE, ACUITY, TEST_VALUE, TEST_UNITS, DIRECTION
     *
     * @param relationshipType <p>
     *            The type of relationship between the entity and attribute.
     *            Type for the relationship is <code>OVERLAP</code>, indicating
     *            that the entity occurred at the same time as the
     *            <code>Date_Expression</code>.
     *            </p>
     * @see RelationshipType
     */
    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the
     * relationship is <code>OVERLAP</code>, indicating that the entity occurred
     * at the same time as the <code>Date_Expression</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVERY, WITH_DOSAGE, ADMINISTERED_VIA, FOR,
     * NEGATIVE, OVERLAP, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY, DURATION,
     * STRENGTH, RATE, ACUITY, TEST_VALUE, TEST_UNITS, DIRECTION
     *
     * @param relationshipType <p>
     *            The type of relationship between the entity and attribute.
     *            Type for the relationship is <code>OVERLAP</code>, indicating
     *            that the entity occurred at the same time as the
     *            <code>Date_Expression</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipType
     */
    public Attribute withRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the
     * relationship is <code>OVERLAP</code>, indicating that the entity occurred
     * at the same time as the <code>Date_Expression</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVERY, WITH_DOSAGE, ADMINISTERED_VIA, FOR,
     * NEGATIVE, OVERLAP, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY, DURATION,
     * STRENGTH, RATE, ACUITY, TEST_VALUE, TEST_UNITS, DIRECTION
     *
     * @param relationshipType <p>
     *            The type of relationship between the entity and attribute.
     *            Type for the relationship is <code>OVERLAP</code>, indicating
     *            that the entity occurred at the same time as the
     *            <code>Date_Expression</code>.
     *            </p>
     * @see RelationshipType
     */
    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType.toString();
    }

    /**
     * <p>
     * The type of relationship between the entity and attribute. Type for the
     * relationship is <code>OVERLAP</code>, indicating that the entity occurred
     * at the same time as the <code>Date_Expression</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVERY, WITH_DOSAGE, ADMINISTERED_VIA, FOR,
     * NEGATIVE, OVERLAP, DOSAGE, ROUTE_OR_MODE, FORM, FREQUENCY, DURATION,
     * STRENGTH, RATE, ACUITY, TEST_VALUE, TEST_UNITS, DIRECTION
     *
     * @param relationshipType <p>
     *            The type of relationship between the entity and attribute.
     *            Type for the relationship is <code>OVERLAP</code>, indicating
     *            that the entity occurred at the same time as the
     *            <code>Date_Expression</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationshipType
     */
    public Attribute withRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType.toString();
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
    public Attribute withId(Integer id) {
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
    public Attribute withBeginOffset(Integer beginOffset) {
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
    public Attribute withEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * <p>
     * The segment of input text extracted as this attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The segment of input text extracted as this attribute.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The segment of input text extracted as this attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The segment of input text extracted as this attribute.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The segment of input text extracted as this attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            The segment of input text extracted as this attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The category of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @return <p>
     *         The category of attribute.
     *         </p>
     * @see EntityType
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param category <p>
     *            The category of attribute.
     *            </p>
     * @see EntityType
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param category <p>
     *            The category of attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityType
     */
    public Attribute withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The category of attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param category <p>
     *            The category of attribute.
     *            </p>
     * @see EntityType
     */
    public void setCategory(EntityType category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * The category of attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEDICATION, MEDICAL_CONDITION,
     * PROTECTED_HEALTH_INFORMATION, TEST_TREATMENT_PROCEDURE, ANATOMY,
     * TIME_EXPRESSION
     *
     * @param category <p>
     *            The category of attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityType
     */
    public Attribute withCategory(EntityType category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     *
     * @return <p>
     *         Contextual information for this attribute.
     *         </p>
     */
    public java.util.List<Trait> getTraits() {
        return traits;
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     *
     * @param traits <p>
     *            Contextual information for this attribute.
     *            </p>
     */
    public void setTraits(java.util.Collection<Trait> traits) {
        if (traits == null) {
            this.traits = null;
            return;
        }

        this.traits = new java.util.ArrayList<Trait>(traits);
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traits <p>
     *            Contextual information for this attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withTraits(Trait... traits) {
        if (getTraits() == null) {
            this.traits = new java.util.ArrayList<Trait>(traits.length);
        }
        for (Trait value : traits) {
            this.traits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contextual information for this attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param traits <p>
     *            Contextual information for this attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withTraits(java.util.Collection<Trait> traits) {
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
        if (getRelationshipType() != null)
            sb.append("RelationshipType: " + getRelationshipType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: " + getBeginOffset() + ",");
        if (getEndOffset() != null)
            sb.append("EndOffset: " + getEndOffset() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
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
        hashCode = prime * hashCode
                + ((getRelationshipType() == null) ? 0 : getRelationshipType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getTraits() == null) ? 0 : getTraits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;

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
        if (other.getRelationshipType() == null ^ this.getRelationshipType() == null)
            return false;
        if (other.getRelationshipType() != null
                && other.getRelationshipType().equals(this.getRelationshipType()) == false)
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
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getTraits() == null ^ this.getTraits() == null)
            return false;
        if (other.getTraits() != null && other.getTraits().equals(this.getTraits()) == false)
            return false;
        return true;
    }
}
