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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the name and default range of a continuous hyperparameter and
 * whether the hyperparameter is tunable. A tunable hyperparameter can have its
 * value determined during hyperparameter optimization (HPO).
 * </p>
 */
public class DefaultContinuousHyperParameterRange implements Serializable {
    /**
     * <p>
     * The name of the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String name;

    /**
     * <p>
     * The minimum allowable value for the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     */
    private Double minValue;

    /**
     * <p>
     * The maximum allowable value for the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     */
    private Double maxValue;

    /**
     * <p>
     * Whether the hyperparameter is tunable.
     * </p>
     */
    private Boolean isTunable;

    /**
     * <p>
     * The name of the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The name of the hyperparameter.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param name <p>
     *            The name of the hyperparameter.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param name <p>
     *            The name of the hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultContinuousHyperParameterRange withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The minimum allowable value for the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     *
     * @return <p>
     *         The minimum allowable value for the hyperparameter.
     *         </p>
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * <p>
     * The minimum allowable value for the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     *
     * @param minValue <p>
     *            The minimum allowable value for the hyperparameter.
     *            </p>
     */
    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum allowable value for the hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     *
     * @param minValue <p>
     *            The minimum allowable value for the hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultContinuousHyperParameterRange withMinValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * <p>
     * The maximum allowable value for the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     *
     * @return <p>
     *         The maximum allowable value for the hyperparameter.
     *         </p>
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * <p>
     * The maximum allowable value for the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     *
     * @param maxValue <p>
     *            The maximum allowable value for the hyperparameter.
     *            </p>
     */
    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum allowable value for the hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000000 - <br/>
     *
     * @param maxValue <p>
     *            The maximum allowable value for the hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultContinuousHyperParameterRange withMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * <p>
     * Whether the hyperparameter is tunable.
     * </p>
     *
     * @return <p>
     *         Whether the hyperparameter is tunable.
     *         </p>
     */
    public Boolean isIsTunable() {
        return isTunable;
    }

    /**
     * <p>
     * Whether the hyperparameter is tunable.
     * </p>
     *
     * @return <p>
     *         Whether the hyperparameter is tunable.
     *         </p>
     */
    public Boolean getIsTunable() {
        return isTunable;
    }

    /**
     * <p>
     * Whether the hyperparameter is tunable.
     * </p>
     *
     * @param isTunable <p>
     *            Whether the hyperparameter is tunable.
     *            </p>
     */
    public void setIsTunable(Boolean isTunable) {
        this.isTunable = isTunable;
    }

    /**
     * <p>
     * Whether the hyperparameter is tunable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTunable <p>
     *            Whether the hyperparameter is tunable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultContinuousHyperParameterRange withIsTunable(Boolean isTunable) {
        this.isTunable = isTunable;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getMinValue() != null)
            sb.append("minValue: " + getMinValue() + ",");
        if (getMaxValue() != null)
            sb.append("maxValue: " + getMaxValue() + ",");
        if (getIsTunable() != null)
            sb.append("isTunable: " + getIsTunable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getIsTunable() == null) ? 0 : getIsTunable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultContinuousHyperParameterRange == false)
            return false;
        DefaultContinuousHyperParameterRange other = (DefaultContinuousHyperParameterRange) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getIsTunable() == null ^ this.getIsTunable() == null)
            return false;
        if (other.getIsTunable() != null
                && other.getIsTunable().equals(this.getIsTunable()) == false)
            return false;
        return true;
    }
}
