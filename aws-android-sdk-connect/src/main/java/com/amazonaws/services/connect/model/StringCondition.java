/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A leaf node condition which can be used to specify a string condition.
 * </p>
 */
public class StringCondition implements Serializable {
    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     */
    private String fieldName;

    /**
     * <p>
     * The value of the string.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     */
    private String comparisonType;

    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     *
     * @return <p>
     *         The name of the field in the string condition.
     *         </p>
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     *
     * @param fieldName <p>
     *            The name of the field in the string condition.
     *            </p>
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the field in the string condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldName <p>
     *            The name of the field in the string condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StringCondition withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * <p>
     * The value of the string.
     * </p>
     *
     * @return <p>
     *         The value of the string.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the string.
     * </p>
     *
     * @param value <p>
     *            The value of the string.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StringCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @return <p>
     *         The type of comparison to be made when evaluating the string
     *         condition.
     *         </p>
     * @see StringComparisonType
     */
    public String getComparisonType() {
        return comparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param comparisonType <p>
     *            The type of comparison to be made when evaluating the string
     *            condition.
     *            </p>
     * @see StringComparisonType
     */
    public void setComparisonType(String comparisonType) {
        this.comparisonType = comparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param comparisonType <p>
     *            The type of comparison to be made when evaluating the string
     *            condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringComparisonType
     */
    public StringCondition withComparisonType(String comparisonType) {
        this.comparisonType = comparisonType;
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param comparisonType <p>
     *            The type of comparison to be made when evaluating the string
     *            condition.
     *            </p>
     * @see StringComparisonType
     */
    public void setComparisonType(StringComparisonType comparisonType) {
        this.comparisonType = comparisonType.toString();
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the string condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTS_WITH, CONTAINS, EXACT
     *
     * @param comparisonType <p>
     *            The type of comparison to be made when evaluating the string
     *            condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StringComparisonType
     */
    public StringCondition withComparisonType(StringComparisonType comparisonType) {
        this.comparisonType = comparisonType.toString();
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
        if (getFieldName() != null)
            sb.append("FieldName: " + getFieldName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getComparisonType() != null)
            sb.append("ComparisonType: " + getComparisonType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getComparisonType() == null) ? 0 : getComparisonType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringCondition == false)
            return false;
        StringCondition other = (StringCondition) obj;

        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null
                && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparisonType() == null ^ this.getComparisonType() == null)
            return false;
        if (other.getComparisonType() != null
                && other.getComparisonType().equals(this.getComparisonType()) == false)
            return false;
        return true;
    }
}
