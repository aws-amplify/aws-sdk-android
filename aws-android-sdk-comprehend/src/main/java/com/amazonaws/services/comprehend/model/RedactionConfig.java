/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides configuration parameters for PII entity redaction.
 * </p>
 */
public class RedactionConfig implements Serializable {
    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in
     * the input text for your request.
     * </p>
     */
    private java.util.List<String> piiEntityTypes;

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or
     * the entity type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK, REPLACE_WITH_PII_ENTITY_TYPE
     */
    private String maskMode;

    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[!@#$%&*]<br/>
     */
    private String maskCharacter;

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in
     * the input text for your request.
     * </p>
     *
     * @return <p>
     *         An array of the types of PII entities that Amazon Comprehend
     *         detects in the input text for your request.
     *         </p>
     */
    public java.util.List<String> getPiiEntityTypes() {
        return piiEntityTypes;
    }

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in
     * the input text for your request.
     * </p>
     *
     * @param piiEntityTypes <p>
     *            An array of the types of PII entities that Amazon Comprehend
     *            detects in the input text for your request.
     *            </p>
     */
    public void setPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        if (piiEntityTypes == null) {
            this.piiEntityTypes = null;
            return;
        }

        this.piiEntityTypes = new java.util.ArrayList<String>(piiEntityTypes);
    }

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in
     * the input text for your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param piiEntityTypes <p>
     *            An array of the types of PII entities that Amazon Comprehend
     *            detects in the input text for your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedactionConfig withPiiEntityTypes(String... piiEntityTypes) {
        if (getPiiEntityTypes() == null) {
            this.piiEntityTypes = new java.util.ArrayList<String>(piiEntityTypes.length);
        }
        for (String value : piiEntityTypes) {
            this.piiEntityTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of the types of PII entities that Amazon Comprehend detects in
     * the input text for your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param piiEntityTypes <p>
     *            An array of the types of PII entities that Amazon Comprehend
     *            detects in the input text for your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedactionConfig withPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
        return this;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or
     * the entity type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK, REPLACE_WITH_PII_ENTITY_TYPE
     *
     * @return <p>
     *         Specifies whether the PII entity is redacted with the mask
     *         character or the entity type.
     *         </p>
     * @see PiiEntitiesDetectionMaskMode
     */
    public String getMaskMode() {
        return maskMode;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or
     * the entity type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK, REPLACE_WITH_PII_ENTITY_TYPE
     *
     * @param maskMode <p>
     *            Specifies whether the PII entity is redacted with the mask
     *            character or the entity type.
     *            </p>
     * @see PiiEntitiesDetectionMaskMode
     */
    public void setMaskMode(String maskMode) {
        this.maskMode = maskMode;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or
     * the entity type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK, REPLACE_WITH_PII_ENTITY_TYPE
     *
     * @param maskMode <p>
     *            Specifies whether the PII entity is redacted with the mask
     *            character or the entity type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntitiesDetectionMaskMode
     */
    public RedactionConfig withMaskMode(String maskMode) {
        this.maskMode = maskMode;
        return this;
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or
     * the entity type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK, REPLACE_WITH_PII_ENTITY_TYPE
     *
     * @param maskMode <p>
     *            Specifies whether the PII entity is redacted with the mask
     *            character or the entity type.
     *            </p>
     * @see PiiEntitiesDetectionMaskMode
     */
    public void setMaskMode(PiiEntitiesDetectionMaskMode maskMode) {
        this.maskMode = maskMode.toString();
    }

    /**
     * <p>
     * Specifies whether the PII entity is redacted with the mask character or
     * the entity type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK, REPLACE_WITH_PII_ENTITY_TYPE
     *
     * @param maskMode <p>
     *            Specifies whether the PII entity is redacted with the mask
     *            character or the entity type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntitiesDetectionMaskMode
     */
    public RedactionConfig withMaskMode(PiiEntitiesDetectionMaskMode maskMode) {
        this.maskMode = maskMode.toString();
        return this;
    }

    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[!@#$%&*]<br/>
     *
     * @return <p>
     *         A character that replaces each character in the redacted PII
     *         entity.
     *         </p>
     */
    public String getMaskCharacter() {
        return maskCharacter;
    }

    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[!@#$%&*]<br/>
     *
     * @param maskCharacter <p>
     *            A character that replaces each character in the redacted PII
     *            entity.
     *            </p>
     */
    public void setMaskCharacter(String maskCharacter) {
        this.maskCharacter = maskCharacter;
    }

    /**
     * <p>
     * A character that replaces each character in the redacted PII entity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>[!@#$%&*]<br/>
     *
     * @param maskCharacter <p>
     *            A character that replaces each character in the redacted PII
     *            entity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedactionConfig withMaskCharacter(String maskCharacter) {
        this.maskCharacter = maskCharacter;
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
        if (getPiiEntityTypes() != null)
            sb.append("PiiEntityTypes: " + getPiiEntityTypes() + ",");
        if (getMaskMode() != null)
            sb.append("MaskMode: " + getMaskMode() + ",");
        if (getMaskCharacter() != null)
            sb.append("MaskCharacter: " + getMaskCharacter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getMaskMode() == null) ? 0 : getMaskMode().hashCode());
        hashCode = prime * hashCode
                + ((getMaskCharacter() == null) ? 0 : getMaskCharacter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedactionConfig == false)
            return false;
        RedactionConfig other = (RedactionConfig) obj;

        if (other.getPiiEntityTypes() == null ^ this.getPiiEntityTypes() == null)
            return false;
        if (other.getPiiEntityTypes() != null
                && other.getPiiEntityTypes().equals(this.getPiiEntityTypes()) == false)
            return false;
        if (other.getMaskMode() == null ^ this.getMaskMode() == null)
            return false;
        if (other.getMaskMode() != null && other.getMaskMode().equals(this.getMaskMode()) == false)
            return false;
        if (other.getMaskCharacter() == null ^ this.getMaskCharacter() == null)
            return false;
        if (other.getMaskCharacter() != null
                && other.getMaskCharacter().equals(this.getMaskCharacter()) == false)
            return false;
        return true;
    }
}
