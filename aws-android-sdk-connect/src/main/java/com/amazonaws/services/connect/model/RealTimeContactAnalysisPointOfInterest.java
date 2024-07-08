/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The section of the contact transcript segment that category rule was
 * detected.
 * </p>
 */
public class RealTimeContactAnalysisPointOfInterest implements Serializable {
    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given
     * point of interest.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> transcriptItems;

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given
     * point of interest.
     * </p>
     *
     * @return <p>
     *         List of the transcript items (segments) that are associated with
     *         a given point of interest.
     *         </p>
     */
    public java.util.List<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> getTranscriptItems() {
        return transcriptItems;
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given
     * point of interest.
     * </p>
     *
     * @param transcriptItems <p>
     *            List of the transcript items (segments) that are associated
     *            with a given point of interest.
     *            </p>
     */
    public void setTranscriptItems(
            java.util.Collection<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> transcriptItems) {
        if (transcriptItems == null) {
            this.transcriptItems = null;
            return;
        }

        this.transcriptItems = new java.util.ArrayList<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets>(
                transcriptItems);
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given
     * point of interest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptItems <p>
     *            List of the transcript items (segments) that are associated
     *            with a given point of interest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisPointOfInterest withTranscriptItems(
            RealTimeContactAnalysisTranscriptItemWithCharacterOffsets... transcriptItems) {
        if (getTranscriptItems() == null) {
            this.transcriptItems = new java.util.ArrayList<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets>(
                    transcriptItems.length);
        }
        for (RealTimeContactAnalysisTranscriptItemWithCharacterOffsets value : transcriptItems) {
            this.transcriptItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given
     * point of interest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptItems <p>
     *            List of the transcript items (segments) that are associated
     *            with a given point of interest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisPointOfInterest withTranscriptItems(
            java.util.Collection<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> transcriptItems) {
        setTranscriptItems(transcriptItems);
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
        if (getTranscriptItems() != null)
            sb.append("TranscriptItems: " + getTranscriptItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptItems() == null) ? 0 : getTranscriptItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisPointOfInterest == false)
            return false;
        RealTimeContactAnalysisPointOfInterest other = (RealTimeContactAnalysisPointOfInterest) obj;

        if (other.getTranscriptItems() == null ^ this.getTranscriptItems() == null)
            return false;
        if (other.getTranscriptItems() != null
                && other.getTranscriptItems().equals(this.getTranscriptItems()) == false)
            return false;
        return true;
    }
}
