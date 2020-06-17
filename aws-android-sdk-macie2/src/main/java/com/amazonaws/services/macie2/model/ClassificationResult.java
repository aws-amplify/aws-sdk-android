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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides detailed information about a sensitive data finding, including the
 * types and number of occurrences of the data that was found.
 * </p>
 */
public class ClassificationResult implements Serializable {
    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the
     * custom data identifiers that detected the data.
     * </p>
     */
    private CustomDataIdentifiers customDataIdentifiers;

    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies
     * to. For example, application/gzip, for a GNU Gzip compressed archive
     * file, or application/pdf, for an Adobe PDF file.
     * </p>
     */
    private String mimeType;

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that
     * produced the finding.
     * </p>
     */
    private java.util.List<SensitiveDataItem> sensitiveData;

    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     */
    private Long sizeClassified;

    /**
     * <p>
     * The status of the finding.
     * </p>
     */
    private ClassificationResultStatus status;

    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the
     * custom data identifiers that detected the data.
     * </p>
     *
     * @return <p>
     *         The number of occurrences of the data that produced the finding,
     *         and the custom data identifiers that detected the data.
     *         </p>
     */
    public CustomDataIdentifiers getCustomDataIdentifiers() {
        return customDataIdentifiers;
    }

    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the
     * custom data identifiers that detected the data.
     * </p>
     *
     * @param customDataIdentifiers <p>
     *            The number of occurrences of the data that produced the
     *            finding, and the custom data identifiers that detected the
     *            data.
     *            </p>
     */
    public void setCustomDataIdentifiers(CustomDataIdentifiers customDataIdentifiers) {
        this.customDataIdentifiers = customDataIdentifiers;
    }

    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the
     * custom data identifiers that detected the data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDataIdentifiers <p>
     *            The number of occurrences of the data that produced the
     *            finding, and the custom data identifiers that detected the
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResult withCustomDataIdentifiers(
            CustomDataIdentifiers customDataIdentifiers) {
        this.customDataIdentifiers = customDataIdentifiers;
        return this;
    }

    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies
     * to. For example, application/gzip, for a GNU Gzip compressed archive
     * file, or application/pdf, for an Adobe PDF file.
     * </p>
     *
     * @return <p>
     *         The type of content, expressed as a MIME type, that the finding
     *         applies to. For example, application/gzip, for a GNU Gzip
     *         compressed archive file, or application/pdf, for an Adobe PDF
     *         file.
     *         </p>
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies
     * to. For example, application/gzip, for a GNU Gzip compressed archive
     * file, or application/pdf, for an Adobe PDF file.
     * </p>
     *
     * @param mimeType <p>
     *            The type of content, expressed as a MIME type, that the
     *            finding applies to. For example, application/gzip, for a GNU
     *            Gzip compressed archive file, or application/pdf, for an Adobe
     *            PDF file.
     *            </p>
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies
     * to. For example, application/gzip, for a GNU Gzip compressed archive
     * file, or application/pdf, for an Adobe PDF file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mimeType <p>
     *            The type of content, expressed as a MIME type, that the
     *            finding applies to. For example, application/gzip, for a GNU
     *            Gzip compressed archive file, or application/pdf, for an Adobe
     *            PDF file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResult withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that
     * produced the finding.
     * </p>
     *
     * @return <p>
     *         The category and number of occurrences of the sensitive data that
     *         produced the finding.
     *         </p>
     */
    public java.util.List<SensitiveDataItem> getSensitiveData() {
        return sensitiveData;
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that
     * produced the finding.
     * </p>
     *
     * @param sensitiveData <p>
     *            The category and number of occurrences of the sensitive data
     *            that produced the finding.
     *            </p>
     */
    public void setSensitiveData(java.util.Collection<SensitiveDataItem> sensitiveData) {
        if (sensitiveData == null) {
            this.sensitiveData = null;
            return;
        }

        this.sensitiveData = new java.util.ArrayList<SensitiveDataItem>(sensitiveData);
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that
     * produced the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sensitiveData <p>
     *            The category and number of occurrences of the sensitive data
     *            that produced the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResult withSensitiveData(SensitiveDataItem... sensitiveData) {
        if (getSensitiveData() == null) {
            this.sensitiveData = new java.util.ArrayList<SensitiveDataItem>(sensitiveData.length);
        }
        for (SensitiveDataItem value : sensitiveData) {
            this.sensitiveData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that
     * produced the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sensitiveData <p>
     *            The category and number of occurrences of the sensitive data
     *            that produced the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResult withSensitiveData(
            java.util.Collection<SensitiveDataItem> sensitiveData) {
        setSensitiveData(sensitiveData);
        return this;
    }

    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     *
     * @return <p>
     *         The total size, in bytes, of the data that the finding applies
     *         to.
     *         </p>
     */
    public Long getSizeClassified() {
        return sizeClassified;
    }

    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     *
     * @param sizeClassified <p>
     *            The total size, in bytes, of the data that the finding applies
     *            to.
     *            </p>
     */
    public void setSizeClassified(Long sizeClassified) {
        this.sizeClassified = sizeClassified;
    }

    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeClassified <p>
     *            The total size, in bytes, of the data that the finding applies
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResult withSizeClassified(Long sizeClassified) {
        this.sizeClassified = sizeClassified;
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     *
     * @return <p>
     *         The status of the finding.
     *         </p>
     */
    public ClassificationResultStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     *
     * @param status <p>
     *            The status of the finding.
     *            </p>
     */
    public void setStatus(ClassificationResultStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResult withStatus(ClassificationResultStatus status) {
        this.status = status;
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
        if (getCustomDataIdentifiers() != null)
            sb.append("customDataIdentifiers: " + getCustomDataIdentifiers() + ",");
        if (getMimeType() != null)
            sb.append("mimeType: " + getMimeType() + ",");
        if (getSensitiveData() != null)
            sb.append("sensitiveData: " + getSensitiveData() + ",");
        if (getSizeClassified() != null)
            sb.append("sizeClassified: " + getSizeClassified() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomDataIdentifiers() == null) ? 0 : getCustomDataIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getMimeType() == null) ? 0 : getMimeType().hashCode());
        hashCode = prime * hashCode
                + ((getSensitiveData() == null) ? 0 : getSensitiveData().hashCode());
        hashCode = prime * hashCode
                + ((getSizeClassified() == null) ? 0 : getSizeClassified().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationResult == false)
            return false;
        ClassificationResult other = (ClassificationResult) obj;

        if (other.getCustomDataIdentifiers() == null ^ this.getCustomDataIdentifiers() == null)
            return false;
        if (other.getCustomDataIdentifiers() != null
                && other.getCustomDataIdentifiers().equals(this.getCustomDataIdentifiers()) == false)
            return false;
        if (other.getMimeType() == null ^ this.getMimeType() == null)
            return false;
        if (other.getMimeType() != null && other.getMimeType().equals(this.getMimeType()) == false)
            return false;
        if (other.getSensitiveData() == null ^ this.getSensitiveData() == null)
            return false;
        if (other.getSensitiveData() != null
                && other.getSensitiveData().equals(this.getSensitiveData()) == false)
            return false;
        if (other.getSizeClassified() == null ^ this.getSizeClassified() == null)
            return false;
        if (other.getSizeClassified() != null
                && other.getSizeClassified().equals(this.getSizeClassified()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
