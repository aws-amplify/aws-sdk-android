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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the possible values for categorical, continuous, and integer
 * hyperparameters to be used by an algorithm.
 * </p>
 */
public class ParameterRange implements Serializable {
    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the
     * possible values for an integer hyperparameter.
     * </p>
     */
    private IntegerParameterRangeSpecification integerParameterRangeSpecification;

    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines
     * the possible values for a continuous hyperparameter.
     * </p>
     */
    private ContinuousParameterRangeSpecification continuousParameterRangeSpecification;

    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines
     * the possible values for a categorical hyperparameter.
     * </p>
     */
    private CategoricalParameterRangeSpecification categoricalParameterRangeSpecification;

    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the
     * possible values for an integer hyperparameter.
     * </p>
     *
     * @return <p>
     *         A <code>IntegerParameterRangeSpecification</code> object that
     *         defines the possible values for an integer hyperparameter.
     *         </p>
     */
    public IntegerParameterRangeSpecification getIntegerParameterRangeSpecification() {
        return integerParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the
     * possible values for an integer hyperparameter.
     * </p>
     *
     * @param integerParameterRangeSpecification <p>
     *            A <code>IntegerParameterRangeSpecification</code> object that
     *            defines the possible values for an integer hyperparameter.
     *            </p>
     */
    public void setIntegerParameterRangeSpecification(
            IntegerParameterRangeSpecification integerParameterRangeSpecification) {
        this.integerParameterRangeSpecification = integerParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>IntegerParameterRangeSpecification</code> object that defines the
     * possible values for an integer hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerParameterRangeSpecification <p>
     *            A <code>IntegerParameterRangeSpecification</code> object that
     *            defines the possible values for an integer hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterRange withIntegerParameterRangeSpecification(
            IntegerParameterRangeSpecification integerParameterRangeSpecification) {
        this.integerParameterRangeSpecification = integerParameterRangeSpecification;
        return this;
    }

    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines
     * the possible values for a continuous hyperparameter.
     * </p>
     *
     * @return <p>
     *         A <code>ContinuousParameterRangeSpecification</code> object that
     *         defines the possible values for a continuous hyperparameter.
     *         </p>
     */
    public ContinuousParameterRangeSpecification getContinuousParameterRangeSpecification() {
        return continuousParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines
     * the possible values for a continuous hyperparameter.
     * </p>
     *
     * @param continuousParameterRangeSpecification <p>
     *            A <code>ContinuousParameterRangeSpecification</code> object
     *            that defines the possible values for a continuous
     *            hyperparameter.
     *            </p>
     */
    public void setContinuousParameterRangeSpecification(
            ContinuousParameterRangeSpecification continuousParameterRangeSpecification) {
        this.continuousParameterRangeSpecification = continuousParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>ContinuousParameterRangeSpecification</code> object that defines
     * the possible values for a continuous hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuousParameterRangeSpecification <p>
     *            A <code>ContinuousParameterRangeSpecification</code> object
     *            that defines the possible values for a continuous
     *            hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterRange withContinuousParameterRangeSpecification(
            ContinuousParameterRangeSpecification continuousParameterRangeSpecification) {
        this.continuousParameterRangeSpecification = continuousParameterRangeSpecification;
        return this;
    }

    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines
     * the possible values for a categorical hyperparameter.
     * </p>
     *
     * @return <p>
     *         A <code>CategoricalParameterRangeSpecification</code> object that
     *         defines the possible values for a categorical hyperparameter.
     *         </p>
     */
    public CategoricalParameterRangeSpecification getCategoricalParameterRangeSpecification() {
        return categoricalParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines
     * the possible values for a categorical hyperparameter.
     * </p>
     *
     * @param categoricalParameterRangeSpecification <p>
     *            A <code>CategoricalParameterRangeSpecification</code> object
     *            that defines the possible values for a categorical
     *            hyperparameter.
     *            </p>
     */
    public void setCategoricalParameterRangeSpecification(
            CategoricalParameterRangeSpecification categoricalParameterRangeSpecification) {
        this.categoricalParameterRangeSpecification = categoricalParameterRangeSpecification;
    }

    /**
     * <p>
     * A <code>CategoricalParameterRangeSpecification</code> object that defines
     * the possible values for a categorical hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoricalParameterRangeSpecification <p>
     *            A <code>CategoricalParameterRangeSpecification</code> object
     *            that defines the possible values for a categorical
     *            hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterRange withCategoricalParameterRangeSpecification(
            CategoricalParameterRangeSpecification categoricalParameterRangeSpecification) {
        this.categoricalParameterRangeSpecification = categoricalParameterRangeSpecification;
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
        if (getIntegerParameterRangeSpecification() != null)
            sb.append("IntegerParameterRangeSpecification: "
                    + getIntegerParameterRangeSpecification() + ",");
        if (getContinuousParameterRangeSpecification() != null)
            sb.append("ContinuousParameterRangeSpecification: "
                    + getContinuousParameterRangeSpecification() + ",");
        if (getCategoricalParameterRangeSpecification() != null)
            sb.append("CategoricalParameterRangeSpecification: "
                    + getCategoricalParameterRangeSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIntegerParameterRangeSpecification() == null) ? 0
                        : getIntegerParameterRangeSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getContinuousParameterRangeSpecification() == null) ? 0
                        : getContinuousParameterRangeSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getCategoricalParameterRangeSpecification() == null) ? 0
                        : getCategoricalParameterRangeSpecification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterRange == false)
            return false;
        ParameterRange other = (ParameterRange) obj;

        if (other.getIntegerParameterRangeSpecification() == null
                ^ this.getIntegerParameterRangeSpecification() == null)
            return false;
        if (other.getIntegerParameterRangeSpecification() != null
                && other.getIntegerParameterRangeSpecification().equals(
                        this.getIntegerParameterRangeSpecification()) == false)
            return false;
        if (other.getContinuousParameterRangeSpecification() == null
                ^ this.getContinuousParameterRangeSpecification() == null)
            return false;
        if (other.getContinuousParameterRangeSpecification() != null
                && other.getContinuousParameterRangeSpecification().equals(
                        this.getContinuousParameterRangeSpecification()) == false)
            return false;
        if (other.getCategoricalParameterRangeSpecification() == null
                ^ this.getCategoricalParameterRangeSpecification() == null)
            return false;
        if (other.getCategoricalParameterRangeSpecification() != null
                && other.getCategoricalParameterRangeSpecification().equals(
                        this.getCategoricalParameterRangeSpecification()) == false)
            return false;
        return true;
    }
}
