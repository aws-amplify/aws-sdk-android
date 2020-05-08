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
 * Contains data, such as the inputs and targeted instance types that are used
 * in the process of validating the model package.
 * </p>
 * <p>
 * The data provided in the validation profile is made available to your buyers
 * on AWS Marketplace.
 * </p>
 */
public class ModelPackageValidationProfile implements Serializable {
    /**
     * <p>
     * The name of the profile for the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String profileName;

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job used for the validation of the model package.
     * </p>
     */
    private TransformJobDefinition transformJobDefinition;

    /**
     * <p>
     * The name of the profile for the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the profile for the model package.
     *         </p>
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * <p>
     * The name of the profile for the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param profileName <p>
     *            The name of the profile for the model package.
     *            </p>
     */
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the profile for the model package.
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
     *            The name of the profile for the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageValidationProfile withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job used for the validation of the model package.
     * </p>
     *
     * @return <p>
     *         The <code>TransformJobDefinition</code> object that describes the
     *         transform job used for the validation of the model package.
     *         </p>
     */
    public TransformJobDefinition getTransformJobDefinition() {
        return transformJobDefinition;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job used for the validation of the model package.
     * </p>
     *
     * @param transformJobDefinition <p>
     *            The <code>TransformJobDefinition</code> object that describes
     *            the transform job used for the validation of the model
     *            package.
     *            </p>
     */
    public void setTransformJobDefinition(TransformJobDefinition transformJobDefinition) {
        this.transformJobDefinition = transformJobDefinition;
    }

    /**
     * <p>
     * The <code>TransformJobDefinition</code> object that describes the
     * transform job used for the validation of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformJobDefinition <p>
     *            The <code>TransformJobDefinition</code> object that describes
     *            the transform job used for the validation of the model
     *            package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageValidationProfile withTransformJobDefinition(
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

        if (obj instanceof ModelPackageValidationProfile == false)
            return false;
        ModelPackageValidationProfile other = (ModelPackageValidationProfile) obj;

        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null
                && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getTransformJobDefinition() == null ^ this.getTransformJobDefinition() == null)
            return false;
        if (other.getTransformJobDefinition() != null
                && other.getTransformJobDefinition().equals(this.getTransformJobDefinition()) == false)
            return false;
        return true;
    }
}
