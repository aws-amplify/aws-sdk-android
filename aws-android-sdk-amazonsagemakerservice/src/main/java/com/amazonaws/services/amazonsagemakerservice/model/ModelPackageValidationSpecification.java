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
 * Specifies batch transform jobs that Amazon SageMaker runs to validate your
 * model package.
 * </p>
 */
public class ModelPackageValidationSpecification implements Serializable {
    /**
     * <p>
     * The IAM roles to be used for the validation of the model package.
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
     * An array of <code>ModelPackageValidationProfile</code> objects, each of
     * which specifies a batch transform job that Amazon SageMaker runs to
     * validate your model package.
     * </p>
     */
    private java.util.List<ModelPackageValidationProfile> validationProfiles;

    /**
     * <p>
     * The IAM roles to be used for the validation of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The IAM roles to be used for the validation of the model package.
     *         </p>
     */
    public String getValidationRole() {
        return validationRole;
    }

    /**
     * <p>
     * The IAM roles to be used for the validation of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param validationRole <p>
     *            The IAM roles to be used for the validation of the model
     *            package.
     *            </p>
     */
    public void setValidationRole(String validationRole) {
        this.validationRole = validationRole;
    }

    /**
     * <p>
     * The IAM roles to be used for the validation of the model package.
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
     *            The IAM roles to be used for the validation of the model
     *            package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageValidationSpecification withValidationRole(String validationRole) {
        this.validationRole = validationRole;
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelPackageValidationProfile</code> objects, each of
     * which specifies a batch transform job that Amazon SageMaker runs to
     * validate your model package.
     * </p>
     *
     * @return <p>
     *         An array of <code>ModelPackageValidationProfile</code> objects,
     *         each of which specifies a batch transform job that Amazon
     *         SageMaker runs to validate your model package.
     *         </p>
     */
    public java.util.List<ModelPackageValidationProfile> getValidationProfiles() {
        return validationProfiles;
    }

    /**
     * <p>
     * An array of <code>ModelPackageValidationProfile</code> objects, each of
     * which specifies a batch transform job that Amazon SageMaker runs to
     * validate your model package.
     * </p>
     *
     * @param validationProfiles <p>
     *            An array of <code>ModelPackageValidationProfile</code>
     *            objects, each of which specifies a batch transform job that
     *            Amazon SageMaker runs to validate your model package.
     *            </p>
     */
    public void setValidationProfiles(
            java.util.Collection<ModelPackageValidationProfile> validationProfiles) {
        if (validationProfiles == null) {
            this.validationProfiles = null;
            return;
        }

        this.validationProfiles = new java.util.ArrayList<ModelPackageValidationProfile>(
                validationProfiles);
    }

    /**
     * <p>
     * An array of <code>ModelPackageValidationProfile</code> objects, each of
     * which specifies a batch transform job that Amazon SageMaker runs to
     * validate your model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationProfiles <p>
     *            An array of <code>ModelPackageValidationProfile</code>
     *            objects, each of which specifies a batch transform job that
     *            Amazon SageMaker runs to validate your model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageValidationSpecification withValidationProfiles(
            ModelPackageValidationProfile... validationProfiles) {
        if (getValidationProfiles() == null) {
            this.validationProfiles = new java.util.ArrayList<ModelPackageValidationProfile>(
                    validationProfiles.length);
        }
        for (ModelPackageValidationProfile value : validationProfiles) {
            this.validationProfiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelPackageValidationProfile</code> objects, each of
     * which specifies a batch transform job that Amazon SageMaker runs to
     * validate your model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationProfiles <p>
     *            An array of <code>ModelPackageValidationProfile</code>
     *            objects, each of which specifies a batch transform job that
     *            Amazon SageMaker runs to validate your model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageValidationSpecification withValidationProfiles(
            java.util.Collection<ModelPackageValidationProfile> validationProfiles) {
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

        if (obj instanceof ModelPackageValidationSpecification == false)
            return false;
        ModelPackageValidationSpecification other = (ModelPackageValidationSpecification) obj;

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
