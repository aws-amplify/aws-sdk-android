/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Object to store union of Field values.
 * </p>
 */
public class FieldValueUnion implements Serializable {
    /**
     * <p>
     * A Boolean number value type.
     * </p>
     */
    private Boolean booleanValue;

    /**
     * <p>
     * a Double number value type.
     * </p>
     */
    private Double doubleValue;

    /**
     * <p>
     * An empty value.
     * </p>
     */
    private EmptyFieldValue emptyValue;

    /**
     * <p>
     * String value type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     */
    private String stringValue;

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     *
     * @return <p>
     *         A Boolean number value type.
     *         </p>
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     *
     * @return <p>
     *         A Boolean number value type.
     *         </p>
     */
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     *
     * @param booleanValue <p>
     *            A Boolean number value type.
     *            </p>
     */
    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param booleanValue <p>
     *            A Boolean number value type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldValueUnion withBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }

    /**
     * <p>
     * a Double number value type.
     * </p>
     *
     * @return <p>
     *         a Double number value type.
     *         </p>
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * <p>
     * a Double number value type.
     * </p>
     *
     * @param doubleValue <p>
     *            a Double number value type.
     *            </p>
     */
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * a Double number value type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param doubleValue <p>
     *            a Double number value type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldValueUnion withDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * <p>
     * An empty value.
     * </p>
     *
     * @return <p>
     *         An empty value.
     *         </p>
     */
    public EmptyFieldValue getEmptyValue() {
        return emptyValue;
    }

    /**
     * <p>
     * An empty value.
     * </p>
     *
     * @param emptyValue <p>
     *            An empty value.
     *            </p>
     */
    public void setEmptyValue(EmptyFieldValue emptyValue) {
        this.emptyValue = emptyValue;
    }

    /**
     * <p>
     * An empty value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emptyValue <p>
     *            An empty value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldValueUnion withEmptyValue(EmptyFieldValue emptyValue) {
        this.emptyValue = emptyValue;
        return this;
    }

    /**
     * <p>
     * String value type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     *
     * @return <p>
     *         String value type.
     *         </p>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * String value type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     *
     * @param stringValue <p>
     *            String value type.
     *            </p>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * String value type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     *
     * @param stringValue <p>
     *            String value type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FieldValueUnion withStringValue(String stringValue) {
        this.stringValue = stringValue;
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
        if (getBooleanValue() != null)
            sb.append("BooleanValue: " + getBooleanValue() + ",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: " + getDoubleValue() + ",");
        if (getEmptyValue() != null)
            sb.append("EmptyValue: " + getEmptyValue() + ",");
        if (getStringValue() != null)
            sb.append("StringValue: " + getStringValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        hashCode = prime * hashCode
                + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getEmptyValue() == null) ? 0 : getEmptyValue().hashCode());
        hashCode = prime * hashCode
                + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldValueUnion == false)
            return false;
        FieldValueUnion other = (FieldValueUnion) obj;

        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null
                && other.getBooleanValue().equals(this.getBooleanValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null
                && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getEmptyValue() == null ^ this.getEmptyValue() == null)
            return false;
        if (other.getEmptyValue() != null
                && other.getEmptyValue().equals(this.getEmptyValue()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null
                && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        return true;
    }
}
