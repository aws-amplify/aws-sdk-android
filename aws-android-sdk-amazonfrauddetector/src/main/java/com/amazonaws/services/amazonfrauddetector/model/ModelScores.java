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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * The fraud prediction scores.
 * </p>
 */
public class ModelScores implements Serializable {
    /**
     * <p>
     * The model version.
     * </p>
     */
    private ModelVersion modelVersion;

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     */
    private java.util.Map<String, Float> scores;

    /**
     * <p>
     * The model version.
     * </p>
     *
     * @return <p>
     *         The model version.
     *         </p>
     */
    public ModelVersion getModelVersion() {
        return modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     *
     * @param modelVersion <p>
     *            The model version.
     *            </p>
     */
    public void setModelVersion(ModelVersion modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersion <p>
     *            The model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelScores withModelVersion(ModelVersion modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     *
     * @return <p>
     *         The model's fraud prediction scores.
     *         </p>
     */
    public java.util.Map<String, Float> getScores() {
        return scores;
    }

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     *
     * @param scores <p>
     *            The model's fraud prediction scores.
     *            </p>
     */
    public void setScores(java.util.Map<String, Float> scores) {
        this.scores = scores;
    }

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scores <p>
     *            The model's fraud prediction scores.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelScores withScores(java.util.Map<String, Float> scores) {
        this.scores = scores;
        return this;
    }

    /**
     * <p>
     * The model's fraud prediction scores.
     * </p>
     * <p>
     * The method adds a new key-value pair into scores parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into scores.
     * @param value The corresponding value of the entry to be added into
     *            scores.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelScores addscoresEntry(String key, Float value) {
        if (null == this.scores) {
            this.scores = new java.util.HashMap<String, Float>();
        }
        if (this.scores.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.scores.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into scores.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ModelScores clearscoresEntries() {
        this.scores = null;
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
        if (getModelVersion() != null)
            sb.append("modelVersion: " + getModelVersion() + ",");
        if (getScores() != null)
            sb.append("scores: " + getScores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getScores() == null) ? 0 : getScores().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelScores == false)
            return false;
        ModelScores other = (ModelScores) obj;

        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null
                && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getScores() == null ^ this.getScores() == null)
            return false;
        if (other.getScores() != null && other.getScores().equals(this.getScores()) == false)
            return false;
        return true;
    }
}
