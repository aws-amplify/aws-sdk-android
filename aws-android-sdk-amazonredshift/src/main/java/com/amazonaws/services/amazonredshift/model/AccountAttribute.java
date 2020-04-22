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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * A name value pair that describes an aspect of an account.
 * </p>
 */
public class AccountAttribute implements Serializable {
    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * A list of attribute values.
     * </p>
     */
    private java.util.List<AttributeValueTarget> attributeValues;

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
    public AccountAttribute withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     *
     * @return <p>
     *         A list of attribute values.
     *         </p>
     */
    public java.util.List<AttributeValueTarget> getAttributeValues() {
        return attributeValues;
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     *
     * @param attributeValues <p>
     *            A list of attribute values.
     *            </p>
     */
    public void setAttributeValues(java.util.Collection<AttributeValueTarget> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
            return;
        }

        this.attributeValues = new java.util.ArrayList<AttributeValueTarget>(attributeValues);
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValues <p>
     *            A list of attribute values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountAttribute withAttributeValues(AttributeValueTarget... attributeValues) {
        if (getAttributeValues() == null) {
            this.attributeValues = new java.util.ArrayList<AttributeValueTarget>(
                    attributeValues.length);
        }
        for (AttributeValueTarget value : attributeValues) {
            this.attributeValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValues <p>
     *            A list of attribute values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountAttribute withAttributeValues(
            java.util.Collection<AttributeValueTarget> attributeValues) {
        setAttributeValues(attributeValues);
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
        if (getAttributeValues() != null)
            sb.append("AttributeValues: " + getAttributeValues());
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
                + ((getAttributeValues() == null) ? 0 : getAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAttribute == false)
            return false;
        AccountAttribute other = (AccountAttribute) obj;

        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValues() == null ^ this.getAttributeValues() == null)
            return false;
        if (other.getAttributeValues() != null
                && other.getAttributeValues().equals(this.getAttributeValues()) == false)
            return false;
        return true;
    }
}
