/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Filters applied to the technical cue or shot detection segments. For more
 * information, see <a>StartSegmentDetection</a>.
 * </p>
 */
public class StartSegmentDetectionFilters implements Serializable {
    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     */
    private StartTechnicalCueDetectionFilter technicalCueFilter;

    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     */
    private StartShotDetectionFilter shotFilter;

    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     *
     * @return <p>
     *         Filters that are specific to technical cues.
     *         </p>
     */
    public StartTechnicalCueDetectionFilter getTechnicalCueFilter() {
        return technicalCueFilter;
    }

    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     *
     * @param technicalCueFilter <p>
     *            Filters that are specific to technical cues.
     *            </p>
     */
    public void setTechnicalCueFilter(StartTechnicalCueDetectionFilter technicalCueFilter) {
        this.technicalCueFilter = technicalCueFilter;
    }

    /**
     * <p>
     * Filters that are specific to technical cues.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param technicalCueFilter <p>
     *            Filters that are specific to technical cues.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSegmentDetectionFilters withTechnicalCueFilter(
            StartTechnicalCueDetectionFilter technicalCueFilter) {
        this.technicalCueFilter = technicalCueFilter;
        return this;
    }

    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     *
     * @return <p>
     *         Filters that are specific to shot detections.
     *         </p>
     */
    public StartShotDetectionFilter getShotFilter() {
        return shotFilter;
    }

    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     *
     * @param shotFilter <p>
     *            Filters that are specific to shot detections.
     *            </p>
     */
    public void setShotFilter(StartShotDetectionFilter shotFilter) {
        this.shotFilter = shotFilter;
    }

    /**
     * <p>
     * Filters that are specific to shot detections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shotFilter <p>
     *            Filters that are specific to shot detections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSegmentDetectionFilters withShotFilter(StartShotDetectionFilter shotFilter) {
        this.shotFilter = shotFilter;
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
        if (getTechnicalCueFilter() != null)
            sb.append("TechnicalCueFilter: " + getTechnicalCueFilter() + ",");
        if (getShotFilter() != null)
            sb.append("ShotFilter: " + getShotFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTechnicalCueFilter() == null) ? 0 : getTechnicalCueFilter().hashCode());
        hashCode = prime * hashCode + ((getShotFilter() == null) ? 0 : getShotFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSegmentDetectionFilters == false)
            return false;
        StartSegmentDetectionFilters other = (StartSegmentDetectionFilters) obj;

        if (other.getTechnicalCueFilter() == null ^ this.getTechnicalCueFilter() == null)
            return false;
        if (other.getTechnicalCueFilter() != null
                && other.getTechnicalCueFilter().equals(this.getTechnicalCueFilter()) == false)
            return false;
        if (other.getShotFilter() == null ^ this.getShotFilter() == null)
            return false;
        if (other.getShotFilter() != null
                && other.getShotFilter().equals(this.getShotFilter()) == false)
            return false;
        return true;
    }
}
