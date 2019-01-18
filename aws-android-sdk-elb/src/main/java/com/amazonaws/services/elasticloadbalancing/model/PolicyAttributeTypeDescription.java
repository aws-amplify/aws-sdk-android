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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a policy attribute type.
 * </p>
 */
public class PolicyAttributeTypeDescription implements Serializable {
    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or
     * <code>Integer</code>.
     * </p>
     */
    private String attributeType;

    /**
     * <p>
     * A description of the attribute.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     */
    private String cardinality;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     *
     * @return <p>
     *         The name of the attribute.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     *
     * @param attributeName <p>
     *            The name of the attribute.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeName <p>
     *            The name of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyAttributeTypeDescription withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or
     * <code>Integer</code>.
     * </p>
     *
     * @return <p>
     *         The type of the attribute. For example, <code>Boolean</code> or
     *         <code>Integer</code>.
     *         </p>
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or
     * <code>Integer</code>.
     * </p>
     *
     * @param attributeType <p>
     *            The type of the attribute. For example, <code>Boolean</code>
     *            or <code>Integer</code>.
     *            </p>
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or
     * <code>Integer</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeType <p>
     *            The type of the attribute. For example, <code>Boolean</code>
     *            or <code>Integer</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyAttributeTypeDescription withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * <p>
     * A description of the attribute.
     * </p>
     *
     * @return <p>
     *         A description of the attribute.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the attribute.
     * </p>
     *
     * @param description <p>
     *            A description of the attribute.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyAttributeTypeDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     *
     * @return <p>
     *         The default value of the attribute, if applicable.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value of the attribute, if applicable.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value of the attribute, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyAttributeTypeDescription withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The cardinality of the attribute.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE(1) : Single value required
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ZERO_OR_ONE(0..1) : Up to one value is allowed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCardinality() {
        return cardinality;
    }

    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     *
     * @param cardinality <p>
     *            The cardinality of the attribute.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE(1) : Single value required
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ZERO_OR_ONE(0..1) : Up to one value is allowed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCardinality(String cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cardinality <p>
     *            The cardinality of the attribute.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ONE(1) : Single value required
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ZERO_OR_ONE(0..1) : Up to one value is allowed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyAttributeTypeDescription withCardinality(String cardinality) {
        this.cardinality = cardinality;
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
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeType() != null)
            sb.append("AttributeType: " + getAttributeType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getCardinality() != null)
            sb.append("Cardinality: " + getCardinality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode
                + ((getCardinality() == null) ? 0 : getCardinality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyAttributeTypeDescription == false)
            return false;
        PolicyAttributeTypeDescription other = (PolicyAttributeTypeDescription) obj;

        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null
                && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getCardinality() == null ^ this.getCardinality() == null)
            return false;
        if (other.getCardinality() != null
                && other.getCardinality().equals(this.getCardinality()) == false)
            return false;
        return true;
    }
}
