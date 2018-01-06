/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * The output from a <code>Predict</code> operation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Details</code> - Contains the following attributes:
 * <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code>
 * <code>DetailsAttributes.ALGORITHM - SGD</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PredictedLabel</code> - Present for either a <code>BINARY</code> or
 * <code>MULTICLASS</code> <code>MLModel</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PredictedScores</code> - Contains the raw classification score
 * corresponding to each label.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PredictedValue</code> - Present for a <code>REGRESSION</code>
 * <code>MLModel</code> request.
 * </p>
 * </li>
 * </ul>
 */
public class Prediction implements Serializable {
    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or
     * <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String predictedLabel;

    /**
     * The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     */
    private Float predictedValue;

    /**
     * Provides the raw classification score corresponding to each label.
     */
    private java.util.Map<String, Float> predictedScores = new java.util.HashMap<String, Float>();

    /**
     * Provides any additional details regarding the prediction.
     */
    private java.util.Map<String, String> details = new java.util.HashMap<String, String>();

    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or
     * <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The prediction label for either a <code>BINARY</code> or
     *         <code>MULTICLASS</code> <code>MLModel</code>.
     *         </p>
     */
    public String getPredictedLabel() {
        return predictedLabel;
    }

    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or
     * <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param predictedLabel <p>
     *            The prediction label for either a <code>BINARY</code> or
     *            <code>MULTICLASS</code> <code>MLModel</code>.
     *            </p>
     */
    public void setPredictedLabel(String predictedLabel) {
        this.predictedLabel = predictedLabel;
    }

    /**
     * <p>
     * The prediction label for either a <code>BINARY</code> or
     * <code>MULTICLASS</code> <code>MLModel</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param predictedLabel <p>
     *            The prediction label for either a <code>BINARY</code> or
     *            <code>MULTICLASS</code> <code>MLModel</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prediction withPredictedLabel(String predictedLabel) {
        this.predictedLabel = predictedLabel;
        return this;
    }

    /**
     * The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     *
     * @return The prediction value for <code>REGRESSION</code>
     *         <code>MLModel</code>.
     */
    public Float getPredictedValue() {
        return predictedValue;
    }

    /**
     * The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     *
     * @param predictedValue The prediction value for <code>REGRESSION</code>
     *            <code>MLModel</code>.
     */
    public void setPredictedValue(Float predictedValue) {
        this.predictedValue = predictedValue;
    }

    /**
     * The prediction value for <code>REGRESSION</code> <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predictedValue The prediction value for <code>REGRESSION</code>
     *            <code>MLModel</code>.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prediction withPredictedValue(Float predictedValue) {
        this.predictedValue = predictedValue;
        return this;
    }

    /**
     * Provides the raw classification score corresponding to each label.
     *
     * @return Provides the raw classification score corresponding to each
     *         label.
     */
    public java.util.Map<String, Float> getPredictedScores() {
        return predictedScores;
    }

    /**
     * Provides the raw classification score corresponding to each label.
     *
     * @param predictedScores Provides the raw classification score
     *            corresponding to each label.
     */
    public void setPredictedScores(java.util.Map<String, Float> predictedScores) {
        this.predictedScores = predictedScores;
    }

    /**
     * Provides the raw classification score corresponding to each label.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predictedScores Provides the raw classification score
     *            corresponding to each label.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prediction withPredictedScores(java.util.Map<String, Float> predictedScores) {
        this.predictedScores = predictedScores;
        return this;
    }

    /**
     * Provides the raw classification score corresponding to each label.
     * <p>
     * The method adds a new key-value pair into predictedScores parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into predictedScores.
     * @param value The corresponding value of the entry to be added into
     *            predictedScores.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prediction addpredictedScoresEntry(String key, Float value) {
        if (null == this.predictedScores) {
            this.predictedScores = new java.util.HashMap<String, Float>();
        }
        if (this.predictedScores.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.predictedScores.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into predictedScores.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Prediction clearpredictedScoresEntries() {
        this.predictedScores = null;
        return this;
    }

    /**
     * Provides any additional details regarding the prediction.
     *
     * @return Provides any additional details regarding the prediction.
     */
    public java.util.Map<String, String> getDetails() {
        return details;
    }

    /**
     * Provides any additional details regarding the prediction.
     *
     * @param details Provides any additional details regarding the prediction.
     */
    public void setDetails(java.util.Map<String, String> details) {
        this.details = details;
    }

    /**
     * Provides any additional details regarding the prediction.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details Provides any additional details regarding the prediction.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prediction withDetails(java.util.Map<String, String> details) {
        this.details = details;
        return this;
    }

    /**
     * Provides any additional details regarding the prediction.
     * <p>
     * The method adds a new key-value pair into details parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into details.
     * @param value The corresponding value of the entry to be added into
     *            details.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prediction adddetailsEntry(String key, String value) {
        if (null == this.details) {
            this.details = new java.util.HashMap<String, String>();
        }
        if (this.details.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.details.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into details.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Prediction cleardetailsEntries() {
        this.details = null;
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
        if (getPredictedLabel() != null)
            sb.append("predictedLabel: " + getPredictedLabel() + ",");
        if (getPredictedValue() != null)
            sb.append("predictedValue: " + getPredictedValue() + ",");
        if (getPredictedScores() != null)
            sb.append("predictedScores: " + getPredictedScores() + ",");
        if (getDetails() != null)
            sb.append("details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPredictedLabel() == null) ? 0 : getPredictedLabel().hashCode());
        hashCode = prime * hashCode
                + ((getPredictedValue() == null) ? 0 : getPredictedValue().hashCode());
        hashCode = prime * hashCode
                + ((getPredictedScores() == null) ? 0 : getPredictedScores().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Prediction == false)
            return false;
        Prediction other = (Prediction) obj;

        if (other.getPredictedLabel() == null ^ this.getPredictedLabel() == null)
            return false;
        if (other.getPredictedLabel() != null
                && other.getPredictedLabel().equals(this.getPredictedLabel()) == false)
            return false;
        if (other.getPredictedValue() == null ^ this.getPredictedValue() == null)
            return false;
        if (other.getPredictedValue() != null
                && other.getPredictedValue().equals(this.getPredictedValue()) == false)
            return false;
        if (other.getPredictedScores() == null ^ this.getPredictedScores() == null)
            return false;
        if (other.getPredictedScores() != null
                && other.getPredictedScores().equals(this.getPredictedScores()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
