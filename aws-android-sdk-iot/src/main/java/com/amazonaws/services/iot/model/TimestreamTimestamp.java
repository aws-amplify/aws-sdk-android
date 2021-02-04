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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes how to interpret an application-defined timestamp value from an
 * MQTT message payload and the precision of that value.
 * </p>
 */
public class TimestreamTimestamp implements Serializable {
    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The precision of the timestamp value that results from the expression
     * described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> |
     * <code>MICROSECONDS</code> | <code>NANOSECONDS</code>. The default is
     * <code>MILLISECONDS</code>.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     *
     * @return <p>
     *         An expression that returns a long epoch time value.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     *
     * @param value <p>
     *            An expression that returns a long epoch time value.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * An expression that returns a long epoch time value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            An expression that returns a long epoch time value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamTimestamp withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The precision of the timestamp value that results from the expression
     * described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> |
     * <code>MICROSECONDS</code> | <code>NANOSECONDS</code>. The default is
     * <code>MILLISECONDS</code>.
     * </p>
     *
     * @return <p>
     *         The precision of the timestamp value that results from the
     *         expression described in <code>value</code>.
     *         </p>
     *         <p>
     *         Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> |
     *         <code>MICROSECONDS</code> | <code>NANOSECONDS</code>. The default
     *         is <code>MILLISECONDS</code>.
     *         </p>
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The precision of the timestamp value that results from the expression
     * described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> |
     * <code>MICROSECONDS</code> | <code>NANOSECONDS</code>. The default is
     * <code>MILLISECONDS</code>.
     * </p>
     *
     * @param unit <p>
     *            The precision of the timestamp value that results from the
     *            expression described in <code>value</code>.
     *            </p>
     *            <p>
     *            Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code>
     *            | <code>MICROSECONDS</code> | <code>NANOSECONDS</code>. The
     *            default is <code>MILLISECONDS</code>.
     *            </p>
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The precision of the timestamp value that results from the expression
     * described in <code>value</code>.
     * </p>
     * <p>
     * Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code> |
     * <code>MICROSECONDS</code> | <code>NANOSECONDS</code>. The default is
     * <code>MILLISECONDS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unit <p>
     *            The precision of the timestamp value that results from the
     *            expression described in <code>value</code>.
     *            </p>
     *            <p>
     *            Valid values: <code>SECONDS</code> | <code>MILLISECONDS</code>
     *            | <code>MICROSECONDS</code> | <code>NANOSECONDS</code>. The
     *            default is <code>MILLISECONDS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamTimestamp withUnit(String unit) {
        this.unit = unit;
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

        if (obj instanceof TimestreamTimestamp == false)
            return false;
        TimestreamTimestamp other = (TimestreamTimestamp) obj;

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
