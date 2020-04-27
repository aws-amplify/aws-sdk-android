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
 * Specifies the validation and image scan statuses of the model package.
 * </p>
 */
public class ModelPackageStatusDetails implements Serializable {
    /**
     * <p>
     * The validation status of the model package.
     * </p>
     */
    private java.util.List<ModelPackageStatusItem> validationStatuses;

    /**
     * <p>
     * The status of the scan of the Docker image container for the model
     * package.
     * </p>
     */
    private java.util.List<ModelPackageStatusItem> imageScanStatuses;

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     *
     * @return <p>
     *         The validation status of the model package.
     *         </p>
     */
    public java.util.List<ModelPackageStatusItem> getValidationStatuses() {
        return validationStatuses;
    }

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     *
     * @param validationStatuses <p>
     *            The validation status of the model package.
     *            </p>
     */
    public void setValidationStatuses(
            java.util.Collection<ModelPackageStatusItem> validationStatuses) {
        if (validationStatuses == null) {
            this.validationStatuses = null;
            return;
        }

        this.validationStatuses = new java.util.ArrayList<ModelPackageStatusItem>(
                validationStatuses);
    }

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationStatuses <p>
     *            The validation status of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageStatusDetails withValidationStatuses(
            ModelPackageStatusItem... validationStatuses) {
        if (getValidationStatuses() == null) {
            this.validationStatuses = new java.util.ArrayList<ModelPackageStatusItem>(
                    validationStatuses.length);
        }
        for (ModelPackageStatusItem value : validationStatuses) {
            this.validationStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The validation status of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationStatuses <p>
     *            The validation status of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageStatusDetails withValidationStatuses(
            java.util.Collection<ModelPackageStatusItem> validationStatuses) {
        setValidationStatuses(validationStatuses);
        return this;
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model
     * package.
     * </p>
     *
     * @return <p>
     *         The status of the scan of the Docker image container for the
     *         model package.
     *         </p>
     */
    public java.util.List<ModelPackageStatusItem> getImageScanStatuses() {
        return imageScanStatuses;
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model
     * package.
     * </p>
     *
     * @param imageScanStatuses <p>
     *            The status of the scan of the Docker image container for the
     *            model package.
     *            </p>
     */
    public void setImageScanStatuses(java.util.Collection<ModelPackageStatusItem> imageScanStatuses) {
        if (imageScanStatuses == null) {
            this.imageScanStatuses = null;
            return;
        }

        this.imageScanStatuses = new java.util.ArrayList<ModelPackageStatusItem>(imageScanStatuses);
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model
     * package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageScanStatuses <p>
     *            The status of the scan of the Docker image container for the
     *            model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageStatusDetails withImageScanStatuses(
            ModelPackageStatusItem... imageScanStatuses) {
        if (getImageScanStatuses() == null) {
            this.imageScanStatuses = new java.util.ArrayList<ModelPackageStatusItem>(
                    imageScanStatuses.length);
        }
        for (ModelPackageStatusItem value : imageScanStatuses) {
            this.imageScanStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the scan of the Docker image container for the model
     * package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageScanStatuses <p>
     *            The status of the scan of the Docker image container for the
     *            model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageStatusDetails withImageScanStatuses(
            java.util.Collection<ModelPackageStatusItem> imageScanStatuses) {
        setImageScanStatuses(imageScanStatuses);
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
        if (getValidationStatuses() != null)
            sb.append("ValidationStatuses: " + getValidationStatuses() + ",");
        if (getImageScanStatuses() != null)
            sb.append("ImageScanStatuses: " + getImageScanStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getValidationStatuses() == null) ? 0 : getValidationStatuses().hashCode());
        hashCode = prime * hashCode
                + ((getImageScanStatuses() == null) ? 0 : getImageScanStatuses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackageStatusDetails == false)
            return false;
        ModelPackageStatusDetails other = (ModelPackageStatusDetails) obj;

        if (other.getValidationStatuses() == null ^ this.getValidationStatuses() == null)
            return false;
        if (other.getValidationStatuses() != null
                && other.getValidationStatuses().equals(this.getValidationStatuses()) == false)
            return false;
        if (other.getImageScanStatuses() == null ^ this.getImageScanStatuses() == null)
            return false;
        if (other.getImageScanStatuses() != null
                && other.getImageScanStatuses().equals(this.getImageScanStatuses()) == false)
            return false;
        return true;
    }
}
