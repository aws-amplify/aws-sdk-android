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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the possible values for an integer hyperparameter.
 * </p>
 */
public class IntegerParameterRangeSpecification implements Serializable {
    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String minValue;

    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String maxValue;

    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The minimum integer value allowed.
     *         </p>
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param minValue <p>
     *            The minimum integer value allowed.
     *            </p>
     */
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum integer value allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param minValue <p>
     *            The minimum integer value allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntegerParameterRangeSpecification withMinValue(String minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The maximum integer value allowed.
     *         </p>
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param maxValue <p>
     *            The maximum integer value allowed.
     *            </p>
     */
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum integer value allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param maxValue <p>
     *            The maximum integer value allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntegerParameterRangeSpecification withMaxValue(String maxValue) {
        this.maxValue = maxValue;
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
        if (getMinValue() != null)
            sb.append("MinValue: " + getMinValue() + ",");
        if (getMaxValue() != null)
            sb.append("MaxValue: " + getMaxValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegerParameterRangeSpecification == false)
            return false;
        IntegerParameterRangeSpecification other = (IntegerParameterRangeSpecification) obj;

        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        return true;
    }
}
