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
 * Specifies the validation and image scan statuses of the algorithm.
 * </p>
 */
public class AlgorithmStatusDetails implements Serializable {
    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     */
    private java.util.List<AlgorithmStatusItem> validationStatuses;

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     */
    private java.util.List<AlgorithmStatusItem> imageScanStatuses;

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     *
     * @return <p>
     *         The status of algorithm validation.
     *         </p>
     */
    public java.util.List<AlgorithmStatusItem> getValidationStatuses() {
        return validationStatuses;
    }

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     *
     * @param validationStatuses <p>
     *            The status of algorithm validation.
     *            </p>
     */
    public void setValidationStatuses(java.util.Collection<AlgorithmStatusItem> validationStatuses) {
        if (validationStatuses == null) {
            this.validationStatuses = null;
            return;
        }

        this.validationStatuses = new java.util.ArrayList<AlgorithmStatusItem>(validationStatuses);
    }

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationStatuses <p>
     *            The status of algorithm validation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmStatusDetails withValidationStatuses(AlgorithmStatusItem... validationStatuses) {
        if (getValidationStatuses() == null) {
            this.validationStatuses = new java.util.ArrayList<AlgorithmStatusItem>(
                    validationStatuses.length);
        }
        for (AlgorithmStatusItem value : validationStatuses) {
            this.validationStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of algorithm validation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationStatuses <p>
     *            The status of algorithm validation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmStatusDetails withValidationStatuses(
            java.util.Collection<AlgorithmStatusItem> validationStatuses) {
        setValidationStatuses(validationStatuses);
        return this;
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     *
     * @return <p>
     *         The status of the scan of the algorithm's Docker image container.
     *         </p>
     */
    public java.util.List<AlgorithmStatusItem> getImageScanStatuses() {
        return imageScanStatuses;
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     *
     * @param imageScanStatuses <p>
     *            The status of the scan of the algorithm's Docker image
     *            container.
     *            </p>
     */
    public void setImageScanStatuses(java.util.Collection<AlgorithmStatusItem> imageScanStatuses) {
        if (imageScanStatuses == null) {
            this.imageScanStatuses = null;
            return;
        }

        this.imageScanStatuses = new java.util.ArrayList<AlgorithmStatusItem>(imageScanStatuses);
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageScanStatuses <p>
     *            The status of the scan of the algorithm's Docker image
     *            container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmStatusDetails withImageScanStatuses(AlgorithmStatusItem... imageScanStatuses) {
        if (getImageScanStatuses() == null) {
            this.imageScanStatuses = new java.util.ArrayList<AlgorithmStatusItem>(
                    imageScanStatuses.length);
        }
        for (AlgorithmStatusItem value : imageScanStatuses) {
            this.imageScanStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the scan of the algorithm's Docker image container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageScanStatuses <p>
     *            The status of the scan of the algorithm's Docker image
     *            container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmStatusDetails withImageScanStatuses(
            java.util.Collection<AlgorithmStatusItem> imageScanStatuses) {
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

        if (obj instanceof AlgorithmStatusDetails == false)
            return false;
        AlgorithmStatusDetails other = (AlgorithmStatusDetails) obj;

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
