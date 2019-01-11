/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class PredictResult implements Serializable {
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
    private Prediction prediction;

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
     *
     * @return <p>
     *         The output from a <code>Predict</code> operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Details</code> - Contains the following attributes:
     *         <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code>
     *         <code>DetailsAttributes.ALGORITHM - SGD</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PredictedLabel</code> - Present for either a
     *         <code>BINARY</code> or <code>MULTICLASS</code>
     *         <code>MLModel</code> request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PredictedScores</code> - Contains the raw classification
     *         score corresponding to each label.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PredictedValue</code> - Present for a
     *         <code>REGRESSION</code> <code>MLModel</code> request.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Prediction getPrediction() {
        return prediction;
    }

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
     *
     * @param prediction <p>
     *            The output from a <code>Predict</code> operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Details</code> - Contains the following attributes:
     *            <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code>
     *            <code>DetailsAttributes.ALGORITHM - SGD</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PredictedLabel</code> - Present for either a
     *            <code>BINARY</code> or <code>MULTICLASS</code>
     *            <code>MLModel</code> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PredictedScores</code> - Contains the raw classification
     *            score corresponding to each label.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PredictedValue</code> - Present for a
     *            <code>REGRESSION</code> <code>MLModel</code> request.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPrediction(Prediction prediction) {
        this.prediction = prediction;
    }

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
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prediction <p>
     *            The output from a <code>Predict</code> operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Details</code> - Contains the following attributes:
     *            <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code>
     *            <code>DetailsAttributes.ALGORITHM - SGD</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PredictedLabel</code> - Present for either a
     *            <code>BINARY</code> or <code>MULTICLASS</code>
     *            <code>MLModel</code> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PredictedScores</code> - Contains the raw classification
     *            score corresponding to each label.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PredictedValue</code> - Present for a
     *            <code>REGRESSION</code> <code>MLModel</code> request.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredictResult withPrediction(Prediction prediction) {
        this.prediction = prediction;
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
        if (getPrediction() != null)
            sb.append("Prediction: " + getPrediction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrediction() == null) ? 0 : getPrediction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictResult == false)
            return false;
        PredictResult other = (PredictResult) obj;

        if (other.getPrediction() == null ^ this.getPrediction() == null)
            return false;
        if (other.getPrediction() != null
                && other.getPrediction().equals(this.getPrediction()) == false)
            return false;
        return true;
    }
}
