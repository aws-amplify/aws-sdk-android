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

package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of the last completed image scan.
 * </p>
 */
public class ImageScanFindingsSummary implements Serializable {
    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     */
    private java.util.Date imageScanCompletedAt;

    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     */
    private java.util.Date vulnerabilitySourceUpdatedAt;

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     */
    private java.util.Map<String, Integer> findingSeverityCounts;

    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     *
     * @return <p>
     *         The time of the last completed image scan.
     *         </p>
     */
    public java.util.Date getImageScanCompletedAt() {
        return imageScanCompletedAt;
    }

    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     *
     * @param imageScanCompletedAt <p>
     *            The time of the last completed image scan.
     *            </p>
     */
    public void setImageScanCompletedAt(java.util.Date imageScanCompletedAt) {
        this.imageScanCompletedAt = imageScanCompletedAt;
    }

    /**
     * <p>
     * The time of the last completed image scan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageScanCompletedAt <p>
     *            The time of the last completed image scan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFindingsSummary withImageScanCompletedAt(java.util.Date imageScanCompletedAt) {
        this.imageScanCompletedAt = imageScanCompletedAt;
        return this;
    }

    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     *
     * @return <p>
     *         The time when the vulnerability data was last scanned.
     *         </p>
     */
    public java.util.Date getVulnerabilitySourceUpdatedAt() {
        return vulnerabilitySourceUpdatedAt;
    }

    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     *
     * @param vulnerabilitySourceUpdatedAt <p>
     *            The time when the vulnerability data was last scanned.
     *            </p>
     */
    public void setVulnerabilitySourceUpdatedAt(java.util.Date vulnerabilitySourceUpdatedAt) {
        this.vulnerabilitySourceUpdatedAt = vulnerabilitySourceUpdatedAt;
    }

    /**
     * <p>
     * The time when the vulnerability data was last scanned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vulnerabilitySourceUpdatedAt <p>
     *            The time when the vulnerability data was last scanned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFindingsSummary withVulnerabilitySourceUpdatedAt(
            java.util.Date vulnerabilitySourceUpdatedAt) {
        this.vulnerabilitySourceUpdatedAt = vulnerabilitySourceUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     *
     * @return <p>
     *         The image vulnerability counts, sorted by severity.
     *         </p>
     */
    public java.util.Map<String, Integer> getFindingSeverityCounts() {
        return findingSeverityCounts;
    }

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     *
     * @param findingSeverityCounts <p>
     *            The image vulnerability counts, sorted by severity.
     *            </p>
     */
    public void setFindingSeverityCounts(java.util.Map<String, Integer> findingSeverityCounts) {
        this.findingSeverityCounts = findingSeverityCounts;
    }

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingSeverityCounts <p>
     *            The image vulnerability counts, sorted by severity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFindingsSummary withFindingSeverityCounts(
            java.util.Map<String, Integer> findingSeverityCounts) {
        this.findingSeverityCounts = findingSeverityCounts;
        return this;
    }

    /**
     * <p>
     * The image vulnerability counts, sorted by severity.
     * </p>
     * <p>
     * The method adds a new key-value pair into findingSeverityCounts
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into findingSeverityCounts.
     * @param value The corresponding value of the entry to be added into
     *            findingSeverityCounts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanFindingsSummary addfindingSeverityCountsEntry(String key, Integer value) {
        if (null == this.findingSeverityCounts) {
            this.findingSeverityCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.findingSeverityCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.findingSeverityCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into findingSeverityCounts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ImageScanFindingsSummary clearfindingSeverityCountsEntries() {
        this.findingSeverityCounts = null;
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
        if (getImageScanCompletedAt() != null)
            sb.append("imageScanCompletedAt: " + getImageScanCompletedAt() + ",");
        if (getVulnerabilitySourceUpdatedAt() != null)
            sb.append("vulnerabilitySourceUpdatedAt: " + getVulnerabilitySourceUpdatedAt() + ",");
        if (getFindingSeverityCounts() != null)
            sb.append("findingSeverityCounts: " + getFindingSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageScanCompletedAt() == null) ? 0 : getImageScanCompletedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getVulnerabilitySourceUpdatedAt() == null) ? 0
                        : getVulnerabilitySourceUpdatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindingSeverityCounts() == null) ? 0 : getFindingSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanFindingsSummary == false)
            return false;
        ImageScanFindingsSummary other = (ImageScanFindingsSummary) obj;

        if (other.getImageScanCompletedAt() == null ^ this.getImageScanCompletedAt() == null)
            return false;
        if (other.getImageScanCompletedAt() != null
                && other.getImageScanCompletedAt().equals(this.getImageScanCompletedAt()) == false)
            return false;
        if (other.getVulnerabilitySourceUpdatedAt() == null
                ^ this.getVulnerabilitySourceUpdatedAt() == null)
            return false;
        if (other.getVulnerabilitySourceUpdatedAt() != null
                && other.getVulnerabilitySourceUpdatedAt().equals(
                        this.getVulnerabilitySourceUpdatedAt()) == false)
            return false;
        if (other.getFindingSeverityCounts() == null ^ this.getFindingSeverityCounts() == null)
            return false;
        if (other.getFindingSeverityCounts() != null
                && other.getFindingSeverityCounts().equals(this.getFindingSeverityCounts()) == false)
            return false;
        return true;
    }
}
