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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the schema attribute.
 * </p>
 */
public class SchemaAttributeType implements Serializable {
    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String name;

    /**
     * <p>
     * The attribute data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     */
    private String attributeDataType;

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     */
    private Boolean developerOnlyAttribute;

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     */
    private Boolean mutable;

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is
     * required and the user does not provide a value, registration or sign-in
     * will fail.
     * </p>
     */
    private Boolean required;

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     */
    private NumberAttributeConstraintsType numberAttributeConstraints;

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     */
    private StringAttributeConstraintsType stringAttributeConstraints;

    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         A schema attribute of the name type.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param name <p>
     *            A schema attribute of the name type.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param name <p>
     *            A schema attribute of the name type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchemaAttributeType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @return <p>
     *         The attribute data type.
     *         </p>
     * @see AttributeDataType
     */
    public String getAttributeDataType() {
        return attributeDataType;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType <p>
     *            The attribute data type.
     *            </p>
     * @see AttributeDataType
     */
    public void setAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType <p>
     *            The attribute data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeDataType
     */
    public SchemaAttributeType withAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
        return this;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType <p>
     *            The attribute data type.
     *            </p>
     * @see AttributeDataType
     */
    public void setAttributeDataType(AttributeDataType attributeDataType) {
        this.attributeDataType = attributeDataType.toString();
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType <p>
     *            The attribute data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeDataType
     */
    public SchemaAttributeType withAttributeDataType(AttributeDataType attributeDataType) {
        this.attributeDataType = attributeDataType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     *
     * @return <p>
     *         Specifies whether the attribute type is developer only.
     *         </p>
     */
    public Boolean isDeveloperOnlyAttribute() {
        return developerOnlyAttribute;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     *
     * @return <p>
     *         Specifies whether the attribute type is developer only.
     *         </p>
     */
    public Boolean getDeveloperOnlyAttribute() {
        return developerOnlyAttribute;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     *
     * @param developerOnlyAttribute <p>
     *            Specifies whether the attribute type is developer only.
     *            </p>
     */
    public void setDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param developerOnlyAttribute <p>
     *            Specifies whether the attribute type is developer only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchemaAttributeType withDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
        return this;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     *
     * @return <p>
     *         Specifies whether the value of the attribute can be changed.
     *         </p>
     */
    public Boolean isMutable() {
        return mutable;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     *
     * @return <p>
     *         Specifies whether the value of the attribute can be changed.
     *         </p>
     */
    public Boolean getMutable() {
        return mutable;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     *
     * @param mutable <p>
     *            Specifies whether the value of the attribute can be changed.
     *            </p>
     */
    public void setMutable(Boolean mutable) {
        this.mutable = mutable;
    }

    /**
     * <p>
     * Specifies whether the value of the attribute can be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mutable <p>
     *            Specifies whether the value of the attribute can be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchemaAttributeType withMutable(Boolean mutable) {
        this.mutable = mutable;
        return this;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is
     * required and the user does not provide a value, registration or sign-in
     * will fail.
     * </p>
     *
     * @return <p>
     *         Specifies whether a user pool attribute is required. If the
     *         attribute is required and the user does not provide a value,
     *         registration or sign-in will fail.
     *         </p>
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is
     * required and the user does not provide a value, registration or sign-in
     * will fail.
     * </p>
     *
     * @return <p>
     *         Specifies whether a user pool attribute is required. If the
     *         attribute is required and the user does not provide a value,
     *         registration or sign-in will fail.
     *         </p>
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is
     * required and the user does not provide a value, registration or sign-in
     * will fail.
     * </p>
     *
     * @param required <p>
     *            Specifies whether a user pool attribute is required. If the
     *            attribute is required and the user does not provide a value,
     *            registration or sign-in will fail.
     *            </p>
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is
     * required and the user does not provide a value, registration or sign-in
     * will fail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param required <p>
     *            Specifies whether a user pool attribute is required. If the
     *            attribute is required and the user does not provide a value,
     *            registration or sign-in will fail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchemaAttributeType withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     *
     * @return <p>
     *         Specifies the constraints for an attribute of the number type.
     *         </p>
     */
    public NumberAttributeConstraintsType getNumberAttributeConstraints() {
        return numberAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     *
     * @param numberAttributeConstraints <p>
     *            Specifies the constraints for an attribute of the number type.
     *            </p>
     */
    public void setNumberAttributeConstraints(
            NumberAttributeConstraintsType numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberAttributeConstraints <p>
     *            Specifies the constraints for an attribute of the number type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchemaAttributeType withNumberAttributeConstraints(
            NumberAttributeConstraintsType numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
        return this;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     *
     * @return <p>
     *         Specifies the constraints for an attribute of the string type.
     *         </p>
     */
    public StringAttributeConstraintsType getStringAttributeConstraints() {
        return stringAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     *
     * @param stringAttributeConstraints <p>
     *            Specifies the constraints for an attribute of the string type.
     *            </p>
     */
    public void setStringAttributeConstraints(
            StringAttributeConstraintsType stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringAttributeConstraints <p>
     *            Specifies the constraints for an attribute of the string type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchemaAttributeType withStringAttributeConstraints(
            StringAttributeConstraintsType stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAttributeDataType() != null)
            sb.append("AttributeDataType: " + getAttributeDataType() + ",");
        if (getDeveloperOnlyAttribute() != null)
            sb.append("DeveloperOnlyAttribute: " + getDeveloperOnlyAttribute() + ",");
        if (getMutable() != null)
            sb.append("Mutable: " + getMutable() + ",");
        if (getRequired() != null)
            sb.append("Required: " + getRequired() + ",");
        if (getNumberAttributeConstraints() != null)
            sb.append("NumberAttributeConstraints: " + getNumberAttributeConstraints() + ",");
        if (getStringAttributeConstraints() != null)
            sb.append("StringAttributeConstraints: " + getStringAttributeConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeDataType() == null) ? 0 : getAttributeDataType().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperOnlyAttribute() == null) ? 0 : getDeveloperOnlyAttribute()
                        .hashCode());
        hashCode = prime * hashCode + ((getMutable() == null) ? 0 : getMutable().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberAttributeConstraints() == null) ? 0 : getNumberAttributeConstraints()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStringAttributeConstraints() == null) ? 0 : getStringAttributeConstraints()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaAttributeType == false)
            return false;
        SchemaAttributeType other = (SchemaAttributeType) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributeDataType() == null ^ this.getAttributeDataType() == null)
            return false;
        if (other.getAttributeDataType() != null
                && other.getAttributeDataType().equals(this.getAttributeDataType()) == false)
            return false;
        if (other.getDeveloperOnlyAttribute() == null ^ this.getDeveloperOnlyAttribute() == null)
            return false;
        if (other.getDeveloperOnlyAttribute() != null
                && other.getDeveloperOnlyAttribute().equals(this.getDeveloperOnlyAttribute()) == false)
            return false;
        if (other.getMutable() == null ^ this.getMutable() == null)
            return false;
        if (other.getMutable() != null && other.getMutable().equals(this.getMutable()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getNumberAttributeConstraints() == null
                ^ this.getNumberAttributeConstraints() == null)
            return false;
        if (other.getNumberAttributeConstraints() != null
                && other.getNumberAttributeConstraints().equals(
                        this.getNumberAttributeConstraints()) == false)
            return false;
        if (other.getStringAttributeConstraints() == null
                ^ this.getStringAttributeConstraints() == null)
            return false;
        if (other.getStringAttributeConstraints() != null
                && other.getStringAttributeConstraints().equals(
                        this.getStringAttributeConstraints()) == false)
            return false;
        return true;
    }
}
