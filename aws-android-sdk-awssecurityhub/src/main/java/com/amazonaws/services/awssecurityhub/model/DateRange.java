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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A date range for the date filter.
 * </p>
 */
public class DateRange implements Serializable {
    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS
     */
    private String unit;

    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     *
     * @return <p>
     *         A date range value for the date filter.
     *         </p>
     */
    public Integer getValue() {
        return value;
    }

    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     *
     * @param value <p>
     *            A date range value for the date filter.
     *            </p>
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * A date range value for the date filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            A date range value for the date filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateRange withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS
     *
     * @return <p>
     *         A date range unit for the date filter.
     *         </p>
     * @see DateRangeUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS
     *
     * @param unit <p>
     *            A date range unit for the date filter.
     *            </p>
     * @see DateRangeUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS
     *
     * @param unit <p>
     *            A date range unit for the date filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DateRangeUnit
     */
    public DateRange withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS
     *
     * @param unit <p>
     *            A date range unit for the date filter.
     *            </p>
     * @see DateRangeUnit
     */
    public void setUnit(DateRangeUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * A date range unit for the date filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS
     *
     * @param unit <p>
     *            A date range unit for the date filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DateRangeUnit
     */
    public DateRange withUnit(DateRangeUnit unit) {
        this.unit = unit.toString();
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
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateRange == false)
            return false;
        DateRange other = (DateRange) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
