/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A schema attribute of the name type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String name;

    /**
     * The attribute data type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     */
    private String attributeDataType;

    /**
     * Specifies whether the attribute type is developer only.
     */
    private Boolean developerOnlyAttribute;

    /**
     * Specifies whether the attribute can be changed once it has been
     * created.
     */
    private Boolean mutable;

    /**
     * Specifies whether a user pool attribute is required. If the attribute
     * is required and the user does not provide a value, registration or
     * sign-in will fail.
     */
    private Boolean required;

    /**
     * Specifies the constraints for an attribute of the number type.
     */
    private NumberAttributeConstraintsType numberAttributeConstraints;

    /**
     * Specifies the constraints for an attribute of the string type.
     */
    private StringAttributeConstraintsType stringAttributeConstraints;

    /**
     * A schema attribute of the name type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return A schema attribute of the name type.
     */
    public String getName() {
        return name;
    }
    
    /**
     * A schema attribute of the name type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param name A schema attribute of the name type.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A schema attribute of the name type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param name A schema attribute of the name type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SchemaAttributeType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The attribute data type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @return The attribute data type.
     *
     * @see AttributeDataType
     */
    public String getAttributeDataType() {
        return attributeDataType;
    }
    
    /**
     * The attribute data type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType The attribute data type.
     *
     * @see AttributeDataType
     */
    public void setAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
    }
    
    /**
     * The attribute data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType The attribute data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AttributeDataType
     */
    public SchemaAttributeType withAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
        return this;
    }

    /**
     * The attribute data type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType The attribute data type.
     *
     * @see AttributeDataType
     */
    public void setAttributeDataType(AttributeDataType attributeDataType) {
        this.attributeDataType = attributeDataType.toString();
    }
    
    /**
     * The attribute data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, Number, DateTime, Boolean
     *
     * @param attributeDataType The attribute data type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AttributeDataType
     */
    public SchemaAttributeType withAttributeDataType(AttributeDataType attributeDataType) {
        this.attributeDataType = attributeDataType.toString();
        return this;
    }

    /**
     * Specifies whether the attribute type is developer only.
     *
     * @return Specifies whether the attribute type is developer only.
     */
    public Boolean isDeveloperOnlyAttribute() {
        return developerOnlyAttribute;
    }
    
    /**
     * Specifies whether the attribute type is developer only.
     *
     * @param developerOnlyAttribute Specifies whether the attribute type is developer only.
     */
    public void setDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
    }
    
    /**
     * Specifies whether the attribute type is developer only.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param developerOnlyAttribute Specifies whether the attribute type is developer only.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SchemaAttributeType withDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
        return this;
    }

    /**
     * Specifies whether the attribute type is developer only.
     *
     * @return Specifies whether the attribute type is developer only.
     */
    public Boolean getDeveloperOnlyAttribute() {
        return developerOnlyAttribute;
    }

    /**
     * Specifies whether the attribute can be changed once it has been
     * created.
     *
     * @return Specifies whether the attribute can be changed once it has been
     *         created.
     */
    public Boolean isMutable() {
        return mutable;
    }
    
    /**
     * Specifies whether the attribute can be changed once it has been
     * created.
     *
     * @param mutable Specifies whether the attribute can be changed once it has been
     *         created.
     */
    public void setMutable(Boolean mutable) {
        this.mutable = mutable;
    }
    
    /**
     * Specifies whether the attribute can be changed once it has been
     * created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mutable Specifies whether the attribute can be changed once it has been
     *         created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SchemaAttributeType withMutable(Boolean mutable) {
        this.mutable = mutable;
        return this;
    }

    /**
     * Specifies whether the attribute can be changed once it has been
     * created.
     *
     * @return Specifies whether the attribute can be changed once it has been
     *         created.
     */
    public Boolean getMutable() {
        return mutable;
    }

    /**
     * Specifies whether a user pool attribute is required. If the attribute
     * is required and the user does not provide a value, registration or
     * sign-in will fail.
     *
     * @return Specifies whether a user pool attribute is required. If the attribute
     *         is required and the user does not provide a value, registration or
     *         sign-in will fail.
     */
    public Boolean isRequired() {
        return required;
    }
    
    /**
     * Specifies whether a user pool attribute is required. If the attribute
     * is required and the user does not provide a value, registration or
     * sign-in will fail.
     *
     * @param required Specifies whether a user pool attribute is required. If the attribute
     *         is required and the user does not provide a value, registration or
     *         sign-in will fail.
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }
    
    /**
     * Specifies whether a user pool attribute is required. If the attribute
     * is required and the user does not provide a value, registration or
     * sign-in will fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param required Specifies whether a user pool attribute is required. If the attribute
     *         is required and the user does not provide a value, registration or
     *         sign-in will fail.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SchemaAttributeType withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Specifies whether a user pool attribute is required. If the attribute
     * is required and the user does not provide a value, registration or
     * sign-in will fail.
     *
     * @return Specifies whether a user pool attribute is required. If the attribute
     *         is required and the user does not provide a value, registration or
     *         sign-in will fail.
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * Specifies the constraints for an attribute of the number type.
     *
     * @return Specifies the constraints for an attribute of the number type.
     */
    public NumberAttributeConstraintsType getNumberAttributeConstraints() {
        return numberAttributeConstraints;
    }
    
    /**
     * Specifies the constraints for an attribute of the number type.
     *
     * @param numberAttributeConstraints Specifies the constraints for an attribute of the number type.
     */
    public void setNumberAttributeConstraints(NumberAttributeConstraintsType numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
    }
    
    /**
     * Specifies the constraints for an attribute of the number type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberAttributeConstraints Specifies the constraints for an attribute of the number type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SchemaAttributeType withNumberAttributeConstraints(NumberAttributeConstraintsType numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
        return this;
    }

    /**
     * Specifies the constraints for an attribute of the string type.
     *
     * @return Specifies the constraints for an attribute of the string type.
     */
    public StringAttributeConstraintsType getStringAttributeConstraints() {
        return stringAttributeConstraints;
    }
    
    /**
     * Specifies the constraints for an attribute of the string type.
     *
     * @param stringAttributeConstraints Specifies the constraints for an attribute of the string type.
     */
    public void setStringAttributeConstraints(StringAttributeConstraintsType stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
    }
    
    /**
     * Specifies the constraints for an attribute of the string type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stringAttributeConstraints Specifies the constraints for an attribute of the string type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SchemaAttributeType withStringAttributeConstraints(StringAttributeConstraintsType stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getAttributeDataType() != null) sb.append("AttributeDataType: " + getAttributeDataType() + ",");
        if (isDeveloperOnlyAttribute() != null) sb.append("DeveloperOnlyAttribute: " + isDeveloperOnlyAttribute() + ",");
        if (isMutable() != null) sb.append("Mutable: " + isMutable() + ",");
        if (isRequired() != null) sb.append("Required: " + isRequired() + ",");
        if (getNumberAttributeConstraints() != null) sb.append("NumberAttributeConstraints: " + getNumberAttributeConstraints() + ",");
        if (getStringAttributeConstraints() != null) sb.append("StringAttributeConstraints: " + getStringAttributeConstraints() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeDataType() == null) ? 0 : getAttributeDataType().hashCode()); 
        hashCode = prime * hashCode + ((isDeveloperOnlyAttribute() == null) ? 0 : isDeveloperOnlyAttribute().hashCode()); 
        hashCode = prime * hashCode + ((isMutable() == null) ? 0 : isMutable().hashCode()); 
        hashCode = prime * hashCode + ((isRequired() == null) ? 0 : isRequired().hashCode()); 
        hashCode = prime * hashCode + ((getNumberAttributeConstraints() == null) ? 0 : getNumberAttributeConstraints().hashCode()); 
        hashCode = prime * hashCode + ((getStringAttributeConstraints() == null) ? 0 : getStringAttributeConstraints().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SchemaAttributeType == false) return false;
        SchemaAttributeType other = (SchemaAttributeType)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getAttributeDataType() == null ^ this.getAttributeDataType() == null) return false;
        if (other.getAttributeDataType() != null && other.getAttributeDataType().equals(this.getAttributeDataType()) == false) return false; 
        if (other.isDeveloperOnlyAttribute() == null ^ this.isDeveloperOnlyAttribute() == null) return false;
        if (other.isDeveloperOnlyAttribute() != null && other.isDeveloperOnlyAttribute().equals(this.isDeveloperOnlyAttribute()) == false) return false; 
        if (other.isMutable() == null ^ this.isMutable() == null) return false;
        if (other.isMutable() != null && other.isMutable().equals(this.isMutable()) == false) return false; 
        if (other.isRequired() == null ^ this.isRequired() == null) return false;
        if (other.isRequired() != null && other.isRequired().equals(this.isRequired()) == false) return false; 
        if (other.getNumberAttributeConstraints() == null ^ this.getNumberAttributeConstraints() == null) return false;
        if (other.getNumberAttributeConstraints() != null && other.getNumberAttributeConstraints().equals(this.getNumberAttributeConstraints()) == false) return false; 
        if (other.getStringAttributeConstraints() == null ^ this.getStringAttributeConstraints() == null) return false;
        if (other.getStringAttributeConstraints() != null && other.getStringAttributeConstraints().equals(this.getStringAttributeConstraints()) == false) return false; 
        return true;
    }
    
}
    