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
 * Provides information about the category, type, and number of occurrences of
 * sensitive data that produced a finding.
 * </p>
 */
public class SensitiveDataItem implements Serializable {
    /**
     * <p>
     * The category of sensitive data that was detected. For example,
     * FINANCIAL_INFORMATION, for financial information such as credit card
     * numbers, or PERSONAL_INFORMATION, for personally identifiable information
     * such as names and addresses.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINANCIAL_INFORMATION, PERSONAL_INFORMATION,
     * CREDENTIALS, CUSTOM_IDENTIFIER
     */
    private String category;

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was
     * detected. Each object reports the number of occurrences of a specific
     * type of sensitive data that was detected.
     * </p>
     */
    private java.util.List<DefaultDetection> detections;

    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * The category of sensitive data that was detected. For example,
     * FINANCIAL_INFORMATION, for financial information such as credit card
     * numbers, or PERSONAL_INFORMATION, for personally identifiable information
     * such as names and addresses.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINANCIAL_INFORMATION, PERSONAL_INFORMATION,
     * CREDENTIALS, CUSTOM_IDENTIFIER
     *
     * @return <p>
     *         The category of sensitive data that was detected. For example,
     *         FINANCIAL_INFORMATION, for financial information such as credit
     *         card numbers, or PERSONAL_INFORMATION, for personally
     *         identifiable information such as names and addresses.
     *         </p>
     * @see SensitiveDataItemCategory
     */
    public String getCategory() {
        return category;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example,
     * FINANCIAL_INFORMATION, for financial information such as credit card
     * numbers, or PERSONAL_INFORMATION, for personally identifiable information
     * such as names and addresses.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINANCIAL_INFORMATION, PERSONAL_INFORMATION,
     * CREDENTIALS, CUSTOM_IDENTIFIER
     *
     * @param category <p>
     *            The category of sensitive data that was detected. For example,
     *            FINANCIAL_INFORMATION, for financial information such as
     *            credit card numbers, or PERSONAL_INFORMATION, for personally
     *            identifiable information such as names and addresses.
     *            </p>
     * @see SensitiveDataItemCategory
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example,
     * FINANCIAL_INFORMATION, for financial information such as credit card
     * numbers, or PERSONAL_INFORMATION, for personally identifiable information
     * such as names and addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINANCIAL_INFORMATION, PERSONAL_INFORMATION,
     * CREDENTIALS, CUSTOM_IDENTIFIER
     *
     * @param category <p>
     *            The category of sensitive data that was detected. For example,
     *            FINANCIAL_INFORMATION, for financial information such as
     *            credit card numbers, or PERSONAL_INFORMATION, for personally
     *            identifiable information such as names and addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SensitiveDataItemCategory
     */
    public SensitiveDataItem withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example,
     * FINANCIAL_INFORMATION, for financial information such as credit card
     * numbers, or PERSONAL_INFORMATION, for personally identifiable information
     * such as names and addresses.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINANCIAL_INFORMATION, PERSONAL_INFORMATION,
     * CREDENTIALS, CUSTOM_IDENTIFIER
     *
     * @param category <p>
     *            The category of sensitive data that was detected. For example,
     *            FINANCIAL_INFORMATION, for financial information such as
     *            credit card numbers, or PERSONAL_INFORMATION, for personally
     *            identifiable information such as names and addresses.
     *            </p>
     * @see SensitiveDataItemCategory
     */
    public void setCategory(SensitiveDataItemCategory category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * The category of sensitive data that was detected. For example,
     * FINANCIAL_INFORMATION, for financial information such as credit card
     * numbers, or PERSONAL_INFORMATION, for personally identifiable information
     * such as names and addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINANCIAL_INFORMATION, PERSONAL_INFORMATION,
     * CREDENTIALS, CUSTOM_IDENTIFIER
     *
     * @param category <p>
     *            The category of sensitive data that was detected. For example,
     *            FINANCIAL_INFORMATION, for financial information such as
     *            credit card numbers, or PERSONAL_INFORMATION, for personally
     *            identifiable information such as names and addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SensitiveDataItemCategory
     */
    public SensitiveDataItem withCategory(SensitiveDataItemCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was
     * detected. Each object reports the number of occurrences of a specific
     * type of sensitive data that was detected.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each type of sensitive data that was
     *         detected. Each object reports the number of occurrences of a
     *         specific type of sensitive data that was detected.
     *         </p>
     */
    public java.util.List<DefaultDetection> getDetections() {
        return detections;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was
     * detected. Each object reports the number of occurrences of a specific
     * type of sensitive data that was detected.
     * </p>
     *
     * @param detections <p>
     *            An array of objects, one for each type of sensitive data that
     *            was detected. Each object reports the number of occurrences of
     *            a specific type of sensitive data that was detected.
     *            </p>
     */
    public void setDetections(java.util.Collection<DefaultDetection> detections) {
        if (detections == null) {
            this.detections = null;
            return;
        }

        this.detections = new java.util.ArrayList<DefaultDetection>(detections);
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was
     * detected. Each object reports the number of occurrences of a specific
     * type of sensitive data that was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detections <p>
     *            An array of objects, one for each type of sensitive data that
     *            was detected. Each object reports the number of occurrences of
     *            a specific type of sensitive data that was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SensitiveDataItem withDetections(DefaultDetection... detections) {
        if (getDetections() == null) {
            this.detections = new java.util.ArrayList<DefaultDetection>(detections.length);
        }
        for (DefaultDetection value : detections) {
            this.detections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each type of sensitive data that was
     * detected. Each object reports the number of occurrences of a specific
     * type of sensitive data that was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detections <p>
     *            An array of objects, one for each type of sensitive data that
     *            was detected. Each object reports the number of occurrences of
     *            a specific type of sensitive data that was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SensitiveDataItem withDetections(java.util.Collection<DefaultDetection> detections) {
        setDetections(detections);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     *
     * @return <p>
     *         The total number of occurrences of the sensitive data that was
     *         detected.
     *         </p>
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of occurrences of the sensitive data that was
     *            detected.
     *            </p>
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of the sensitive data that was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of occurrences of the sensitive data that was
     *            detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SensitiveDataItem withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
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
        if (getCategory() != null)
            sb.append("category: " + getCategory() + ",");
        if (getDetections() != null)
            sb.append("detections: " + getDetections() + ",");
        if (getTotalCount() != null)
            sb.append("totalCount: " + getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getDetections() == null) ? 0 : getDetections().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SensitiveDataItem == false)
            return false;
        SensitiveDataItem other = (SensitiveDataItem) obj;

        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getDetections() == null ^ this.getDetections() == null)
            return false;
        if (other.getDetections() != null
                && other.getDetections().equals(this.getDetections()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }
}
