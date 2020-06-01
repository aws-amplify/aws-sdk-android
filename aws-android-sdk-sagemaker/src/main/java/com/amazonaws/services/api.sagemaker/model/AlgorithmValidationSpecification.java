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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies configurations for one or more training jobs that Amazon SageMaker
 * runs to test the algorithm.
 * </p>
 */
public class AlgorithmValidationSpecification implements Serializable {
    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String validationRole;

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of
     * which specifies a training job and batch transform job that Amazon
     * SageMaker runs to validate your algorithm.
     * </p>
     */
    private java.util.List<AlgorithmValidationProfile> validationProfiles;

    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The IAM roles that Amazon SageMaker uses to run the training
     *         jobs.
     *         </p>
     */
    public String getValidationRole() {
        return validationRole;
    }

    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param validationRole <p>
     *            The IAM roles that Amazon SageMaker uses to run the training
     *            jobs.
     *            </p>
     */
    public void setValidationRole(String validationRole) {
        this.validationRole = validationRole;
    }

    /**
     * <p>
     * The IAM roles that Amazon SageMaker uses to run the training jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param validationRole <p>
     *            The IAM roles that Amazon SageMaker uses to run the training
     *            jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmValidationSpecification withValidationRole(String validationRole) {
        this.validationRole = validationRole;
        return this;
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of
     * which specifies a training job and batch transform job that Amazon
     * SageMaker runs to validate your algorithm.
     * </p>
     *
     * @return <p>
     *         An array of <code>AlgorithmValidationProfile</code> objects, each
     *         of which specifies a training job and batch transform job that
     *         Amazon SageMaker runs to validate your algorithm.
     *         </p>
     */
    public java.util.List<AlgorithmValidationProfile> getValidationProfiles() {
        return validationProfiles;
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of
     * which specifies a training job and batch transform job that Amazon
     * SageMaker runs to validate your algorithm.
     * </p>
     *
     * @param validationProfiles <p>
     *            An array of <code>AlgorithmValidationProfile</code> objects,
     *            each of which specifies a training job and batch transform job
     *            that Amazon SageMaker runs to validate your algorithm.
     *            </p>
     */
    public void setValidationProfiles(
            java.util.Collection<AlgorithmValidationProfile> validationProfiles) {
        if (validationProfiles == null) {
            this.validationProfiles = null;
            return;
        }

        this.validationProfiles = new java.util.ArrayList<AlgorithmValidationProfile>(
                validationProfiles);
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of
     * which specifies a training job and batch transform job that Amazon
     * SageMaker runs to validate your algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationProfiles <p>
     *            An array of <code>AlgorithmValidationProfile</code> objects,
     *            each of which specifies a training job and batch transform job
     *            that Amazon SageMaker runs to validate your algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmValidationSpecification withValidationProfiles(
            AlgorithmValidationProfile... validationProfiles) {
        if (getValidationProfiles() == null) {
            this.validationProfiles = new java.util.ArrayList<AlgorithmValidationProfile>(
                    validationProfiles.length);
        }
        for (AlgorithmValidationProfile value : validationProfiles) {
            this.validationProfiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>AlgorithmValidationProfile</code> objects, each of
     * which specifies a training job and batch transform job that Amazon
     * SageMaker runs to validate your algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationProfiles <p>
     *            An array of <code>AlgorithmValidationProfile</code> objects,
     *            each of which specifies a training job and batch transform job
     *            that Amazon SageMaker runs to validate your algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmValidationSpecification withValidationProfiles(
            java.util.Collection<AlgorithmValidationProfile> validationProfiles) {
        setValidationProfiles(validationProfiles);
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
        if (getValidationRole() != null)
            sb.append("ValidationRole: " + getValidationRole() + ",");
        if (getValidationProfiles() != null)
            sb.append("ValidationProfiles: " + getValidationProfiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getValidationRole() == null) ? 0 : getValidationRole().hashCode());
        hashCode = prime * hashCode
                + ((getValidationProfiles() == null) ? 0 : getValidationProfiles().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmValidationSpecification == false)
            return false;
        AlgorithmValidationSpecification other = (AlgorithmValidationSpecification) obj;

        if (other.getValidationRole() == null ^ this.getValidationRole() == null)
            return false;
        if (other.getValidationRole() != null
                && other.getValidationRole().equals(this.getValidationRole()) == false)
            return false;
        if (other.getValidationProfiles() == null ^ this.getValidationProfiles() == null)
            return false;
        if (other.getValidationProfiles() != null
                && other.getValidationProfiles().equals(this.getValidationProfiles()) == false)
            return false;
        return true;
    }
}
