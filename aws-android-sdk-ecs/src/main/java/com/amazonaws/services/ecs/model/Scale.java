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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * A floating-point percentage of the desired number of tasks to place and keep
 * running in the task set.
 * </p>
 */
public class Scale implements Serializable {
    /**
     * <p>
     * The value, specified as a percent total of a service's
     * <code>desiredCount</code>, to scale the task set. Accepted values are
     * numbers between 0 and 100.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENT
     */
    private String unit;

    /**
     * <p>
     * The value, specified as a percent total of a service's
     * <code>desiredCount</code>, to scale the task set. Accepted values are
     * numbers between 0 and 100.
     * </p>
     *
     * @return <p>
     *         The value, specified as a percent total of a service's
     *         <code>desiredCount</code>, to scale the task set. Accepted values
     *         are numbers between 0 and 100.
     *         </p>
     */
    public Double getValue() {
        return value;
    }

    /**
     * <p>
     * The value, specified as a percent total of a service's
     * <code>desiredCount</code>, to scale the task set. Accepted values are
     * numbers between 0 and 100.
     * </p>
     *
     * @param value <p>
     *            The value, specified as a percent total of a service's
     *            <code>desiredCount</code>, to scale the task set. Accepted
     *            values are numbers between 0 and 100.
     *            </p>
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value, specified as a percent total of a service's
     * <code>desiredCount</code>, to scale the task set. Accepted values are
     * numbers between 0 and 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value, specified as a percent total of a service's
     *            <code>desiredCount</code>, to scale the task set. Accepted
     *            values are numbers between 0 and 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scale withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENT
     *
     * @return <p>
     *         The unit of measure for the scale value.
     *         </p>
     * @see ScaleUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENT
     *
     * @param unit <p>
     *            The unit of measure for the scale value.
     *            </p>
     * @see ScaleUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENT
     *
     * @param unit <p>
     *            The unit of measure for the scale value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleUnit
     */
    public Scale withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENT
     *
     * @param unit <p>
     *            The unit of measure for the scale value.
     *            </p>
     * @see ScaleUnit
     */
    public void setUnit(ScaleUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit of measure for the scale value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PERCENT
     *
     * @param unit <p>
     *            The unit of measure for the scale value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScaleUnit
     */
    public Scale withUnit(ScaleUnit unit) {
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
            sb.append("value: " + getValue() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit());
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

        if (obj instanceof Scale == false)
            return false;
        Scale other = (Scale) obj;

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
