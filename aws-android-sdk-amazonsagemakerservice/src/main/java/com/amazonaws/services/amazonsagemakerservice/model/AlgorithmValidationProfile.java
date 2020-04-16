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
 * Defines a training job and a batch transform job that Amazon SageMaker runs
 * to validate your algorithm.
 * </p>
 * <p>
 * The data provided in the validation profile is made available to your buyers
 * on AWS Marketplace.
 * </p>
 */
public class AlgorithmValidationProfile implements Serializable {
    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63
     * characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String profileName;

    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training
     * job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     */
    private TrainingJobDefinition trainingJobDefinition;

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     */
    private TransformJobDefinition transformJobDefinition;

    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63
     * characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the profile for the algorithm. The name must have 1
     *         to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     *         (hyphen).
     *         </p>
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63
     * characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param profileName <p>
     *            The name of the profile for the algorithm. The name must have
     *            1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     *            (hyphen).
     *            </p>
     */
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the profile for the algorithm. The name must have 1 to 63
     * characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param profileName <p>
     *            The name of the profile for the algorithm. The name must have
     *            1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     *            (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmValidationProfile withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training
     * job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     *
     * @return <p>
     *         The <code>TrainingJobDefinition</code> object that describes the
     *         training job that Amazon SageMaker runs to validate your
     *         algorithm.
     *         </p>
     */
    public TrainingJobDefinition getTrainingJobDefinition() {
        return trainingJobDefinition;
    }

    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training
     * job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     *
     * @param trainingJobDefinition <p>
     *            The <code>TrainingJobDefinition</code> object that describes
     *            the training job that Amazon SageMaker runs to validate your
     *            algorithm.
     *            </p>
     */
    public void setTrainingJobDefinition(TrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
    }

    /**
     * <p>
     * The <code>TrainingJobDefinition</code> object that describes the training
     * job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingJobDefinition <p>
     *            The <code>TrainingJobDefinition</code> object that describes
     *            the training job that Amazon SageMaker runs to validate your
     *            algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmValidationProfile withTrainingJobDefinition(
            TrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
        return this;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     *
     * @return <p>
     *         The <code>TransformJobDefinition</code> object that describes the
     *         transform job that Amazon SageMaker runs to validate your
     *         algorithm.
     *         </p>
     */
    public TransformJobDefinition getTransformJobDefinition() {
        return transformJobDefinition;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     *
     * @param transformJobDefinition <p>
     *            The <code>TransformJobDefinition</code> object that describes
     *            the transform job that Amazon SageMaker runs to validate your
     *            algorithm.
     *            </p>
     */
    public void setTransformJobDefinition(TransformJobDefinition transformJobDefinition) {
        this.transformJobDefinition = transformJobDefinition;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job that Amazon SageMaker runs to validate your algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformJobDefinition <p>
     *            The <code>TransformJobDefinition</code> object that describes
     *            the transform job that Amazon SageMaker runs to validate your
     *            algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmValidationProfile withTransformJobDefinition(
            TransformJobDefinition transformJobDefinition) {
        this.transformJobDefinition = transformJobDefinition;
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
        if (getProfileName() != null)
            sb.append("ProfileName: " + getProfileName() + ",");
        if (getTrainingJobDefinition() != null)
            sb.append("TrainingJobDefinition: " + getTrainingJobDefinition() + ",");
        if (getTransformJobDefinition() != null)
            sb.append("TransformJobDefinition: " + getTransformJobDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrainingJobDefinition() == null) ? 0 : getTrainingJobDefinition().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransformJobDefinition() == null) ? 0 : getTransformJobDefinition()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmValidationProfile == false)
            return false;
        AlgorithmValidationProfile other = (AlgorithmValidationProfile) obj;

        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null
                && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getTrainingJobDefinition() == null ^ this.getTrainingJobDefinition() == null)
            return false;
        if (other.getTrainingJobDefinition() != null
                && other.getTrainingJobDefinition().equals(this.getTrainingJobDefinition()) == false)
            return false;
        if (other.getTransformJobDefinition() == null ^ this.getTransformJobDefinition() == null)
            return false;
        if (other.getTransformJobDefinition() != null
                && other.getTransformJobDefinition().equals(this.getTransformJobDefinition()) == false)
            return false;
        return true;
    }
}
