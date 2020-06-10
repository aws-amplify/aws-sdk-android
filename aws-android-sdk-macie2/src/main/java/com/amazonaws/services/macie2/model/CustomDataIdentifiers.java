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
 * Provides information about the number of occurrences of the data that
 * produced a sensitive data finding, and the custom data identifiers that
 * detected the data for the finding.
 * </p>
 */
public class CustomDataIdentifiers implements Serializable {
    /**
     * <p>
     * The names of the custom data identifiers that detected the data, and the
     * number of occurrences of the data that each identifier detected.
     * </p>
     */
    private java.util.List<CustomDetection> detections;

    /**
     * <p>
     * The total number of occurrences of the data that was detected by the
     * custom data identifiers and produced the finding.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * The names of the custom data identifiers that detected the data, and the
     * number of occurrences of the data that each identifier detected.
     * </p>
     *
     * @return <p>
     *         The names of the custom data identifiers that detected the data,
     *         and the number of occurrences of the data that each identifier
     *         detected.
     *         </p>
     */
    public java.util.List<CustomDetection> getDetections() {
        return detections;
    }

    /**
     * <p>
     * The names of the custom data identifiers that detected the data, and the
     * number of occurrences of the data that each identifier detected.
     * </p>
     *
     * @param detections <p>
     *            The names of the custom data identifiers that detected the
     *            data, and the number of occurrences of the data that each
     *            identifier detected.
     *            </p>
     */
    public void setDetections(java.util.Collection<CustomDetection> detections) {
        if (detections == null) {
            this.detections = null;
            return;
        }

        this.detections = new java.util.ArrayList<CustomDetection>(detections);
    }

    /**
     * <p>
     * The names of the custom data identifiers that detected the data, and the
     * number of occurrences of the data that each identifier detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detections <p>
     *            The names of the custom data identifiers that detected the
     *            data, and the number of occurrences of the data that each
     *            identifier detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifiers withDetections(CustomDetection... detections) {
        if (getDetections() == null) {
            this.detections = new java.util.ArrayList<CustomDetection>(detections.length);
        }
        for (CustomDetection value : detections) {
            this.detections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the custom data identifiers that detected the data, and the
     * number of occurrences of the data that each identifier detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detections <p>
     *            The names of the custom data identifiers that detected the
     *            data, and the number of occurrences of the data that each
     *            identifier detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifiers withDetections(java.util.Collection<CustomDetection> detections) {
        setDetections(detections);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of the data that was detected by the
     * custom data identifiers and produced the finding.
     * </p>
     *
     * @return <p>
     *         The total number of occurrences of the data that was detected by
     *         the custom data identifiers and produced the finding.
     *         </p>
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of the data that was detected by the
     * custom data identifiers and produced the finding.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of occurrences of the data that was detected
     *            by the custom data identifiers and produced the finding.
     *            </p>
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of occurrences of the data that was detected by the
     * custom data identifiers and produced the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of occurrences of the data that was detected
     *            by the custom data identifiers and produced the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomDataIdentifiers withTotalCount(Long totalCount) {
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

        if (obj instanceof CustomDataIdentifiers == false)
            return false;
        CustomDataIdentifiers other = (CustomDataIdentifiers) obj;

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
