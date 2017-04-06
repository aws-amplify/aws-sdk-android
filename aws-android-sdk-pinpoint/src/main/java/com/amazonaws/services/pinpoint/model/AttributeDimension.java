/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class AttributeDimension implements Serializable {
    /**
     * The type of dimension: INCLUSIVE â€“ Endpoints that match the criteria
     * are included in the segment. EXCLUSIVE â€“ Endpoints that match the
     * criteria are excluded from the segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     */
    private String attributeType;

    /**
     * The criteria values for the segment dimension. Endpoints with matching
     * attribute values are included or excluded from the segment, depending on
     * the setting for Type.
     */
    private java.util.List<String> values;

    /**
     * The type of dimension: INCLUSIVE â€“ Endpoints that match the criteria
     * are included in the segment. EXCLUSIVE â€“ Endpoints that match the
     * criteria are excluded from the segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @return The type of dimension: INCLUSIVE â€“ Endpoints that match the
     *         criteria are included in the segment. EXCLUSIVE â€“ Endpoints
     *         that match the criteria are excluded from the segment.
     * @see AttributeType
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * The type of dimension: INCLUSIVE â€“ Endpoints that match the criteria
     * are included in the segment. EXCLUSIVE â€“ Endpoints that match the
     * criteria are excluded from the segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType The type of dimension: INCLUSIVE â€“ Endpoints that
     *            match the criteria are included in the segment. EXCLUSIVE â€“
     *            Endpoints that match the criteria are excluded from the
     *            segment.
     * @see AttributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * The type of dimension: INCLUSIVE â€“ Endpoints that match the criteria
     * are included in the segment. EXCLUSIVE â€“ Endpoints that match the
     * criteria are excluded from the segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType The type of dimension: INCLUSIVE â€“ Endpoints that
     *            match the criteria are included in the segment. EXCLUSIVE â€“
     *            Endpoints that match the criteria are excluded from the
     *            segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeType
     */
    public AttributeDimension withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * The type of dimension: INCLUSIVE â€“ Endpoints that match the criteria
     * are included in the segment. EXCLUSIVE â€“ Endpoints that match the
     * criteria are excluded from the segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType The type of dimension: INCLUSIVE â€“ Endpoints that
     *            match the criteria are included in the segment. EXCLUSIVE â€“
     *            Endpoints that match the criteria are excluded from the
     *            segment.
     * @see AttributeType
     */
    public void setAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType.toString();
    }

    /**
     * The type of dimension: INCLUSIVE â€“ Endpoints that match the criteria
     * are included in the segment. EXCLUSIVE â€“ Endpoints that match the
     * criteria are excluded from the segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType The type of dimension: INCLUSIVE â€“ Endpoints that
     *            match the criteria are included in the segment. EXCLUSIVE â€“
     *            Endpoints that match the criteria are excluded from the
     *            segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeType
     */
    public AttributeDimension withAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType.toString();
        return this;
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching
     * attribute values are included or excluded from the segment, depending on
     * the setting for Type.
     *
     * @return The criteria values for the segment dimension. Endpoints with
     *         matching attribute values are included or excluded from the
     *         segment, depending on the setting for Type.
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching
     * attribute values are included or excluded from the segment, depending on
     * the setting for Type.
     *
     * @param values The criteria values for the segment dimension. Endpoints
     *            with matching attribute values are included or excluded from
     *            the segment, depending on the setting for Type.
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching
     * attribute values are included or excluded from the segment, depending on
     * the setting for Type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values The criteria values for the segment dimension. Endpoints
     *            with matching attribute values are included or excluded from
     *            the segment, depending on the setting for Type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeDimension withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * The criteria values for the segment dimension. Endpoints with matching
     * attribute values are included or excluded from the segment, depending on
     * the setting for Type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values The criteria values for the segment dimension. Endpoints
     *            with matching attribute values are included or excluded from
     *            the segment, depending on the setting for Type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeDimension withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getAttributeType() != null)
            sb.append("AttributeType: " + getAttributeType() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeDimension == false)
            return false;
        AttributeDimension other = (AttributeDimension) obj;

        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null
                && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
