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
 * Specifies the hyperparameters and their default ranges. Hyperparameters can
 * be categorical, continuous, or integer-valued.
 * </p>
 */
public class DefaultHyperParameterRanges implements Serializable {
    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     */
    private java.util.List<DefaultIntegerHyperParameterRange> integerHyperParameterRanges;

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     */
    private java.util.List<DefaultContinuousHyperParameterRange> continuousHyperParameterRanges;

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     */
    private java.util.List<DefaultCategoricalHyperParameterRange> categoricalHyperParameterRanges;

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     *
     * @return <p>
     *         The integer-valued hyperparameters and their default ranges.
     *         </p>
     */
    public java.util.List<DefaultIntegerHyperParameterRange> getIntegerHyperParameterRanges() {
        return integerHyperParameterRanges;
    }

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     *
     * @param integerHyperParameterRanges <p>
     *            The integer-valued hyperparameters and their default ranges.
     *            </p>
     */
    public void setIntegerHyperParameterRanges(
            java.util.Collection<DefaultIntegerHyperParameterRange> integerHyperParameterRanges) {
        if (integerHyperParameterRanges == null) {
            this.integerHyperParameterRanges = null;
            return;
        }

        this.integerHyperParameterRanges = new java.util.ArrayList<DefaultIntegerHyperParameterRange>(
                integerHyperParameterRanges);
    }

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerHyperParameterRanges <p>
     *            The integer-valued hyperparameters and their default ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultHyperParameterRanges withIntegerHyperParameterRanges(
            DefaultIntegerHyperParameterRange... integerHyperParameterRanges) {
        if (getIntegerHyperParameterRanges() == null) {
            this.integerHyperParameterRanges = new java.util.ArrayList<DefaultIntegerHyperParameterRange>(
                    integerHyperParameterRanges.length);
        }
        for (DefaultIntegerHyperParameterRange value : integerHyperParameterRanges) {
            this.integerHyperParameterRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The integer-valued hyperparameters and their default ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerHyperParameterRanges <p>
     *            The integer-valued hyperparameters and their default ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultHyperParameterRanges withIntegerHyperParameterRanges(
            java.util.Collection<DefaultIntegerHyperParameterRange> integerHyperParameterRanges) {
        setIntegerHyperParameterRanges(integerHyperParameterRanges);
        return this;
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     *
     * @return <p>
     *         The continuous hyperparameters and their default ranges.
     *         </p>
     */
    public java.util.List<DefaultContinuousHyperParameterRange> getContinuousHyperParameterRanges() {
        return continuousHyperParameterRanges;
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     *
     * @param continuousHyperParameterRanges <p>
     *            The continuous hyperparameters and their default ranges.
     *            </p>
     */
    public void setContinuousHyperParameterRanges(
            java.util.Collection<DefaultContinuousHyperParameterRange> continuousHyperParameterRanges) {
        if (continuousHyperParameterRanges == null) {
            this.continuousHyperParameterRanges = null;
            return;
        }

        this.continuousHyperParameterRanges = new java.util.ArrayList<DefaultContinuousHyperParameterRange>(
                continuousHyperParameterRanges);
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuousHyperParameterRanges <p>
     *            The continuous hyperparameters and their default ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultHyperParameterRanges withContinuousHyperParameterRanges(
            DefaultContinuousHyperParameterRange... continuousHyperParameterRanges) {
        if (getContinuousHyperParameterRanges() == null) {
            this.continuousHyperParameterRanges = new java.util.ArrayList<DefaultContinuousHyperParameterRange>(
                    continuousHyperParameterRanges.length);
        }
        for (DefaultContinuousHyperParameterRange value : continuousHyperParameterRanges) {
            this.continuousHyperParameterRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The continuous hyperparameters and their default ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuousHyperParameterRanges <p>
     *            The continuous hyperparameters and their default ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultHyperParameterRanges withContinuousHyperParameterRanges(
            java.util.Collection<DefaultContinuousHyperParameterRange> continuousHyperParameterRanges) {
        setContinuousHyperParameterRanges(continuousHyperParameterRanges);
        return this;
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     *
     * @return <p>
     *         The categorical hyperparameters and their default ranges.
     *         </p>
     */
    public java.util.List<DefaultCategoricalHyperParameterRange> getCategoricalHyperParameterRanges() {
        return categoricalHyperParameterRanges;
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     *
     * @param categoricalHyperParameterRanges <p>
     *            The categorical hyperparameters and their default ranges.
     *            </p>
     */
    public void setCategoricalHyperParameterRanges(
            java.util.Collection<DefaultCategoricalHyperParameterRange> categoricalHyperParameterRanges) {
        if (categoricalHyperParameterRanges == null) {
            this.categoricalHyperParameterRanges = null;
            return;
        }

        this.categoricalHyperParameterRanges = new java.util.ArrayList<DefaultCategoricalHyperParameterRange>(
                categoricalHyperParameterRanges);
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoricalHyperParameterRanges <p>
     *            The categorical hyperparameters and their default ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultHyperParameterRanges withCategoricalHyperParameterRanges(
            DefaultCategoricalHyperParameterRange... categoricalHyperParameterRanges) {
        if (getCategoricalHyperParameterRanges() == null) {
            this.categoricalHyperParameterRanges = new java.util.ArrayList<DefaultCategoricalHyperParameterRange>(
                    categoricalHyperParameterRanges.length);
        }
        for (DefaultCategoricalHyperParameterRange value : categoricalHyperParameterRanges) {
            this.categoricalHyperParameterRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The categorical hyperparameters and their default ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoricalHyperParameterRanges <p>
     *            The categorical hyperparameters and their default ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultHyperParameterRanges withCategoricalHyperParameterRanges(
            java.util.Collection<DefaultCategoricalHyperParameterRange> categoricalHyperParameterRanges) {
        setCategoricalHyperParameterRanges(categoricalHyperParameterRanges);
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
        if (getIntegerHyperParameterRanges() != null)
            sb.append("integerHyperParameterRanges: " + getIntegerHyperParameterRanges() + ",");
        if (getContinuousHyperParameterRanges() != null)
            sb.append("continuousHyperParameterRanges: " + getContinuousHyperParameterRanges()
                    + ",");
        if (getCategoricalHyperParameterRanges() != null)
            sb.append("categoricalHyperParameterRanges: " + getCategoricalHyperParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIntegerHyperParameterRanges() == null) ? 0
                        : getIntegerHyperParameterRanges().hashCode());
        hashCode = prime
                * hashCode
                + ((getContinuousHyperParameterRanges() == null) ? 0
                        : getContinuousHyperParameterRanges().hashCode());
        hashCode = prime
                * hashCode
                + ((getCategoricalHyperParameterRanges() == null) ? 0
                        : getCategoricalHyperParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultHyperParameterRanges == false)
            return false;
        DefaultHyperParameterRanges other = (DefaultHyperParameterRanges) obj;

        if (other.getIntegerHyperParameterRanges() == null
                ^ this.getIntegerHyperParameterRanges() == null)
            return false;
        if (other.getIntegerHyperParameterRanges() != null
                && other.getIntegerHyperParameterRanges().equals(
                        this.getIntegerHyperParameterRanges()) == false)
            return false;
        if (other.getContinuousHyperParameterRanges() == null
                ^ this.getContinuousHyperParameterRanges() == null)
            return false;
        if (other.getContinuousHyperParameterRanges() != null
                && other.getContinuousHyperParameterRanges().equals(
                        this.getContinuousHyperParameterRanges()) == false)
            return false;
        if (other.getCategoricalHyperParameterRanges() == null
                ^ this.getCategoricalHyperParameterRanges() == null)
            return false;
        if (other.getCategoricalHyperParameterRanges() != null
                && other.getCategoricalHyperParameterRanges().equals(
                        this.getCategoricalHyperParameterRanges()) == false)
            return false;
        return true;
    }
}
