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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a duration of time.
 * </p>
 */
public class Duration implements Serializable {
    /**
     * <p>
     * A unit of time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ms, s
     */
    private String unit;

    /**
     * <p>
     * A number of time units.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long value;

    /**
     * <p>
     * A unit of time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ms, s
     *
     * @return <p>
     *         A unit of time.
     *         </p>
     * @see DurationUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * A unit of time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ms, s
     *
     * @param unit <p>
     *            A unit of time.
     *            </p>
     * @see DurationUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * A unit of time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ms, s
     *
     * @param unit <p>
     *            A unit of time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DurationUnit
     */
    public Duration withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * A unit of time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ms, s
     *
     * @param unit <p>
     *            A unit of time.
     *            </p>
     * @see DurationUnit
     */
    public void setUnit(DurationUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * A unit of time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ms, s
     *
     * @param unit <p>
     *            A unit of time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DurationUnit
     */
    public Duration withUnit(DurationUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * A number of time units.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         A number of time units.
     *         </p>
     */
    public Long getValue() {
        return value;
    }

    /**
     * <p>
     * A number of time units.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param value <p>
     *            A number of time units.
     *            </p>
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * A number of time units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param value <p>
     *            A number of time units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Duration withValue(Long value) {
        this.value = value;
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
        if (getUnit() != null)
            sb.append("unit: " + getUnit() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Duration == false)
            return false;
        Duration other = (Duration) obj;

        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
