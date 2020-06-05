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
 * If hyperparameter optimization (HPO) was performed, contains the
 * hyperparameter values of the best performing model.
 * </p>
 */
public class TunedHPOParams implements Serializable {
    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     */
    private java.util.Map<String, String> algorithmHyperParameters;

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     *
     * @return <p>
     *         A list of the hyperparameter values of the best performing model.
     *         </p>
     */
    public java.util.Map<String, String> getAlgorithmHyperParameters() {
        return algorithmHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     *
     * @param algorithmHyperParameters <p>
     *            A list of the hyperparameter values of the best performing
     *            model.
     *            </p>
     */
    public void setAlgorithmHyperParameters(java.util.Map<String, String> algorithmHyperParameters) {
        this.algorithmHyperParameters = algorithmHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmHyperParameters <p>
     *            A list of the hyperparameter values of the best performing
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunedHPOParams withAlgorithmHyperParameters(
            java.util.Map<String, String> algorithmHyperParameters) {
        this.algorithmHyperParameters = algorithmHyperParameters;
        return this;
    }

    /**
     * <p>
     * A list of the hyperparameter values of the best performing model.
     * </p>
     * <p>
     * The method adds a new key-value pair into algorithmHyperParameters
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            algorithmHyperParameters.
     * @param value The corresponding value of the entry to be added into
     *            algorithmHyperParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TunedHPOParams addalgorithmHyperParametersEntry(String key, String value) {
        if (null == this.algorithmHyperParameters) {
            this.algorithmHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.algorithmHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.algorithmHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into algorithmHyperParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TunedHPOParams clearalgorithmHyperParametersEntries() {
        this.algorithmHyperParameters = null;
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
        if (getAlgorithmHyperParameters() != null)
            sb.append("algorithmHyperParameters: " + getAlgorithmHyperParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAlgorithmHyperParameters() == null) ? 0 : getAlgorithmHyperParameters()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TunedHPOParams == false)
            return false;
        TunedHPOParams other = (TunedHPOParams) obj;

        if (other.getAlgorithmHyperParameters() == null
                ^ this.getAlgorithmHyperParameters() == null)
            return false;
        if (other.getAlgorithmHyperParameters() != null
                && other.getAlgorithmHyperParameters().equals(this.getAlgorithmHyperParameters()) == false)
            return false;
        return true;
    }
}
