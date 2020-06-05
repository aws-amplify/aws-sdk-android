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
 * Describes the properties for hyperparameter optimization (HPO). For use with
 * the bring-your-own-recipe feature. Do not use for Amazon Personalize native
 * recipes.
 * </p>
 */
public class HPOConfig implements Serializable {
    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     */
    private HPOObjective hpoObjective;

    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     */
    private HPOResourceConfig hpoResourceConfig;

    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     */
    private HyperParameterRanges algorithmHyperParameterRanges;

    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     *
     * @return <p>
     *         The metric to optimize during HPO.
     *         </p>
     */
    public HPOObjective getHpoObjective() {
        return hpoObjective;
    }

    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     *
     * @param hpoObjective <p>
     *            The metric to optimize during HPO.
     *            </p>
     */
    public void setHpoObjective(HPOObjective hpoObjective) {
        this.hpoObjective = hpoObjective;
    }

    /**
     * <p>
     * The metric to optimize during HPO.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hpoObjective <p>
     *            The metric to optimize during HPO.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOConfig withHpoObjective(HPOObjective hpoObjective) {
        this.hpoObjective = hpoObjective;
        return this;
    }

    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     *
     * @return <p>
     *         Describes the resource configuration for HPO.
     *         </p>
     */
    public HPOResourceConfig getHpoResourceConfig() {
        return hpoResourceConfig;
    }

    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     *
     * @param hpoResourceConfig <p>
     *            Describes the resource configuration for HPO.
     *            </p>
     */
    public void setHpoResourceConfig(HPOResourceConfig hpoResourceConfig) {
        this.hpoResourceConfig = hpoResourceConfig;
    }

    /**
     * <p>
     * Describes the resource configuration for HPO.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hpoResourceConfig <p>
     *            Describes the resource configuration for HPO.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOConfig withHpoResourceConfig(HPOResourceConfig hpoResourceConfig) {
        this.hpoResourceConfig = hpoResourceConfig;
        return this;
    }

    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     *
     * @return <p>
     *         The hyperparameters and their allowable ranges.
     *         </p>
     */
    public HyperParameterRanges getAlgorithmHyperParameterRanges() {
        return algorithmHyperParameterRanges;
    }

    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     *
     * @param algorithmHyperParameterRanges <p>
     *            The hyperparameters and their allowable ranges.
     *            </p>
     */
    public void setAlgorithmHyperParameterRanges(HyperParameterRanges algorithmHyperParameterRanges) {
        this.algorithmHyperParameterRanges = algorithmHyperParameterRanges;
    }

    /**
     * <p>
     * The hyperparameters and their allowable ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmHyperParameterRanges <p>
     *            The hyperparameters and their allowable ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HPOConfig withAlgorithmHyperParameterRanges(
            HyperParameterRanges algorithmHyperParameterRanges) {
        this.algorithmHyperParameterRanges = algorithmHyperParameterRanges;
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
        if (getHpoObjective() != null)
            sb.append("hpoObjective: " + getHpoObjective() + ",");
        if (getHpoResourceConfig() != null)
            sb.append("hpoResourceConfig: " + getHpoResourceConfig() + ",");
        if (getAlgorithmHyperParameterRanges() != null)
            sb.append("algorithmHyperParameterRanges: " + getAlgorithmHyperParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHpoObjective() == null) ? 0 : getHpoObjective().hashCode());
        hashCode = prime * hashCode
                + ((getHpoResourceConfig() == null) ? 0 : getHpoResourceConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlgorithmHyperParameterRanges() == null) ? 0
                        : getAlgorithmHyperParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HPOConfig == false)
            return false;
        HPOConfig other = (HPOConfig) obj;

        if (other.getHpoObjective() == null ^ this.getHpoObjective() == null)
            return false;
        if (other.getHpoObjective() != null
                && other.getHpoObjective().equals(this.getHpoObjective()) == false)
            return false;
        if (other.getHpoResourceConfig() == null ^ this.getHpoResourceConfig() == null)
            return false;
        if (other.getHpoResourceConfig() != null
                && other.getHpoResourceConfig().equals(this.getHpoResourceConfig()) == false)
            return false;
        if (other.getAlgorithmHyperParameterRanges() == null
                ^ this.getAlgorithmHyperParameterRanges() == null)
            return false;
        if (other.getAlgorithmHyperParameterRanges() != null
                && other.getAlgorithmHyperParameterRanges().equals(
                        this.getAlgorithmHyperParameterRanges()) == false)
            return false;
        return true;
    }
}
