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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a numeric value in decimal format.
 * </p>
 */
public class DecimalNumber implements Serializable {
    /**
     * <p>
     * The unscaled numeric value.
     * </p>
     */
    private java.nio.ByteBuffer unscaledValue;

    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled
     * value.
     * </p>
     */
    private Integer scale;

    /**
     * <p>
     * The unscaled numeric value.
     * </p>
     *
     * @return <p>
     *         The unscaled numeric value.
     *         </p>
     */
    public java.nio.ByteBuffer getUnscaledValue() {
        return unscaledValue;
    }

    /**
     * <p>
     * The unscaled numeric value.
     * </p>
     *
     * @param unscaledValue <p>
     *            The unscaled numeric value.
     *            </p>
     */
    public void setUnscaledValue(java.nio.ByteBuffer unscaledValue) {
        this.unscaledValue = unscaledValue;
    }

    /**
     * <p>
     * The unscaled numeric value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unscaledValue <p>
     *            The unscaled numeric value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecimalNumber withUnscaledValue(java.nio.ByteBuffer unscaledValue) {
        this.unscaledValue = unscaledValue;
        return this;
    }

    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled
     * value.
     * </p>
     *
     * @return <p>
     *         The scale that determines where the decimal point falls in the
     *         unscaled value.
     *         </p>
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled
     * value.
     * </p>
     *
     * @param scale <p>
     *            The scale that determines where the decimal point falls in the
     *            unscaled value.
     *            </p>
     */
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scale <p>
     *            The scale that determines where the decimal point falls in the
     *            unscaled value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecimalNumber withScale(Integer scale) {
        this.scale = scale;
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
        if (getUnscaledValue() != null)
            sb.append("UnscaledValue: " + getUnscaledValue() + ",");
        if (getScale() != null)
            sb.append("Scale: " + getScale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUnscaledValue() == null) ? 0 : getUnscaledValue().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecimalNumber == false)
            return false;
        DecimalNumber other = (DecimalNumber) obj;

        if (other.getUnscaledValue() == null ^ this.getUnscaledValue() == null)
            return false;
        if (other.getUnscaledValue() != null
                && other.getUnscaledValue().equals(this.getUnscaledValue()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        return true;
    }
}
