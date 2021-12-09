/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information relating to dates in a document, including the type of
 * value, and the value.
 * </p>
 */
public class NormalizedValue implements Serializable {
    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATE
     */
    private String valueType;

    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     *
     * @return <p>
     *         The value of the date, written as
     *         Year-Month-DayTHour:Minute:Second.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     *
     * @param value <p>
     *            The value of the date, written as
     *            Year-Month-DayTHour:Minute:Second.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the date, written as
     *            Year-Month-DayTHour:Minute:Second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NormalizedValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATE
     *
     * @return <p>
     *         The normalized type of the value detected. In this case, DATE.
     *         </p>
     * @see ValueType
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATE
     *
     * @param valueType <p>
     *            The normalized type of the value detected. In this case, DATE.
     *            </p>
     * @see ValueType
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATE
     *
     * @param valueType <p>
     *            The normalized type of the value detected. In this case, DATE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ValueType
     */
    public NormalizedValue withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATE
     *
     * @param valueType <p>
     *            The normalized type of the value detected. In this case, DATE.
     *            </p>
     * @see ValueType
     */
    public void setValueType(ValueType valueType) {
        this.valueType = valueType.toString();
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DATE
     *
     * @param valueType <p>
     *            The normalized type of the value detected. In this case, DATE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ValueType
     */
    public NormalizedValue withValueType(ValueType valueType) {
        this.valueType = valueType.toString();
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getValueType() != null)
            sb.append("ValueType: " + getValueType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NormalizedValue == false)
            return false;
        NormalizedValue other = (NormalizedValue) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null
                && other.getValueType().equals(this.getValueType()) == false)
            return false;
        return true;
    }
}
