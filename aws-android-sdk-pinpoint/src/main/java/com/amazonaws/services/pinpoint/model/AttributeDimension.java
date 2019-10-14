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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies attribute-based criteria for including or excluding endpoints from
 * a segment.
 * </p>
 */
public class AttributeDimension implements Serializable {
    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE,
     * endpoints that match the criteria are included in the segment; and,
     * EXCLUSIVE, endpoints that match the criteria are excluded from the
     * segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     */
    private String attributeType;

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the
     * value of the AttributeType property, endpoints are included or excluded
     * from the segment if their attribute values match the criteria values.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE,
     * endpoints that match the criteria are included in the segment; and,
     * EXCLUSIVE, endpoints that match the criteria are excluded from the
     * segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @return <p>
     *         The type of segment dimension to use. Valid values are:
     *         INCLUSIVE, endpoints that match the criteria are included in the
     *         segment; and, EXCLUSIVE, endpoints that match the criteria are
     *         excluded from the segment.
     *         </p>
     * @see AttributeType
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE,
     * endpoints that match the criteria are included in the segment; and,
     * EXCLUSIVE, endpoints that match the criteria are excluded from the
     * segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType <p>
     *            The type of segment dimension to use. Valid values are:
     *            INCLUSIVE, endpoints that match the criteria are included in
     *            the segment; and, EXCLUSIVE, endpoints that match the criteria
     *            are excluded from the segment.
     *            </p>
     * @see AttributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE,
     * endpoints that match the criteria are included in the segment; and,
     * EXCLUSIVE, endpoints that match the criteria are excluded from the
     * segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType <p>
     *            The type of segment dimension to use. Valid values are:
     *            INCLUSIVE, endpoints that match the criteria are included in
     *            the segment; and, EXCLUSIVE, endpoints that match the criteria
     *            are excluded from the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeType
     */
    public AttributeDimension withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE,
     * endpoints that match the criteria are included in the segment; and,
     * EXCLUSIVE, endpoints that match the criteria are excluded from the
     * segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType <p>
     *            The type of segment dimension to use. Valid values are:
     *            INCLUSIVE, endpoints that match the criteria are included in
     *            the segment; and, EXCLUSIVE, endpoints that match the criteria
     *            are excluded from the segment.
     *            </p>
     * @see AttributeType
     */
    public void setAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType.toString();
    }

    /**
     * <p>
     * The type of segment dimension to use. Valid values are: INCLUSIVE,
     * endpoints that match the criteria are included in the segment; and,
     * EXCLUSIVE, endpoints that match the criteria are excluded from the
     * segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUSIVE, EXCLUSIVE
     *
     * @param attributeType <p>
     *            The type of segment dimension to use. Valid values are:
     *            INCLUSIVE, endpoints that match the criteria are included in
     *            the segment; and, EXCLUSIVE, endpoints that match the criteria
     *            are excluded from the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeType
     */
    public AttributeDimension withAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType.toString();
        return this;
    }

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the
     * value of the AttributeType property, endpoints are included or excluded
     * from the segment if their attribute values match the criteria values.
     * </p>
     *
     * @return <p>
     *         The criteria values to use for the segment dimension. Depending
     *         on the value of the AttributeType property, endpoints are
     *         included or excluded from the segment if their attribute values
     *         match the criteria values.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the
     * value of the AttributeType property, endpoints are included or excluded
     * from the segment if their attribute values match the criteria values.
     * </p>
     *
     * @param values <p>
     *            The criteria values to use for the segment dimension.
     *            Depending on the value of the AttributeType property,
     *            endpoints are included or excluded from the segment if their
     *            attribute values match the criteria values.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The criteria values to use for the segment dimension. Depending on the
     * value of the AttributeType property, endpoints are included or excluded
     * from the segment if their attribute values match the criteria values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The criteria values to use for the segment dimension.
     *            Depending on the value of the AttributeType property,
     *            endpoints are included or excluded from the segment if their
     *            attribute values match the criteria values.
     *            </p>
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
     * <p>
     * The criteria values to use for the segment dimension. Depending on the
     * value of the AttributeType property, endpoints are included or excluded
     * from the segment if their attribute values match the criteria values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The criteria values to use for the segment dimension.
     *            Depending on the value of the AttributeType property,
     *            endpoints are included or excluded from the segment if their
     *            attribute values match the criteria values.
     *            </p>
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
