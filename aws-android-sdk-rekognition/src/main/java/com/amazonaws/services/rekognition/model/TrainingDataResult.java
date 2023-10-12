/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * The data validation manifest created for the training dataset during model
 * training.
 * </p>
 */
public class TrainingDataResult implements Serializable {
    /**
     * <p>
     * The training data that you supplied.
     * </p>
     */
    private TrainingData input;

    /**
     * <p>
     * Reference to images (assets) that were actually used during training with
     * trained model predictions.
     * </p>
     */
    private TrainingData output;

    /**
     * <p>
     * A manifest that you supplied for training, with validation results for
     * each line.
     * </p>
     */
    private ValidationData validation;

    /**
     * <p>
     * The training data that you supplied.
     * </p>
     *
     * @return <p>
     *         The training data that you supplied.
     *         </p>
     */
    public TrainingData getInput() {
        return input;
    }

    /**
     * <p>
     * The training data that you supplied.
     * </p>
     *
     * @param input <p>
     *            The training data that you supplied.
     *            </p>
     */
    public void setInput(TrainingData input) {
        this.input = input;
    }

    /**
     * <p>
     * The training data that you supplied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input <p>
     *            The training data that you supplied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingDataResult withInput(TrainingData input) {
        this.input = input;
        return this;
    }

    /**
     * <p>
     * Reference to images (assets) that were actually used during training with
     * trained model predictions.
     * </p>
     *
     * @return <p>
     *         Reference to images (assets) that were actually used during
     *         training with trained model predictions.
     *         </p>
     */
    public TrainingData getOutput() {
        return output;
    }

    /**
     * <p>
     * Reference to images (assets) that were actually used during training with
     * trained model predictions.
     * </p>
     *
     * @param output <p>
     *            Reference to images (assets) that were actually used during
     *            training with trained model predictions.
     *            </p>
     */
    public void setOutput(TrainingData output) {
        this.output = output;
    }

    /**
     * <p>
     * Reference to images (assets) that were actually used during training with
     * trained model predictions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param output <p>
     *            Reference to images (assets) that were actually used during
     *            training with trained model predictions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingDataResult withOutput(TrainingData output) {
        this.output = output;
        return this;
    }

    /**
     * <p>
     * A manifest that you supplied for training, with validation results for
     * each line.
     * </p>
     *
     * @return <p>
     *         A manifest that you supplied for training, with validation
     *         results for each line.
     *         </p>
     */
    public ValidationData getValidation() {
        return validation;
    }

    /**
     * <p>
     * A manifest that you supplied for training, with validation results for
     * each line.
     * </p>
     *
     * @param validation <p>
     *            A manifest that you supplied for training, with validation
     *            results for each line.
     *            </p>
     */
    public void setValidation(ValidationData validation) {
        this.validation = validation;
    }

    /**
     * <p>
     * A manifest that you supplied for training, with validation results for
     * each line.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validation <p>
     *            A manifest that you supplied for training, with validation
     *            results for each line.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingDataResult withValidation(ValidationData validation) {
        this.validation = validation;
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
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getOutput() != null)
            sb.append("Output: " + getOutput() + ",");
        if (getValidation() != null)
            sb.append("Validation: " + getValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getValidation() == null) ? 0 : getValidation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingDataResult == false)
            return false;
        TrainingDataResult other = (TrainingDataResult) obj;

        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getValidation() == null ^ this.getValidation() == null)
            return false;
        if (other.getValidation() != null
                && other.getValidation().equals(this.getValidation()) == false)
            return false;
        return true;
    }
}
