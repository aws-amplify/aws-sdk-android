/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about a label detected in a video analysis request and the time
 * the label was detected in the video.
 * </p>
 */
public class LabelDetection implements Serializable {
    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was
     * detected.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * Details about the detected label.
     * </p>
     */
    private Label label;

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was
     * detected.
     * </p>
     *
     * @return <p>
     *         Time, in milliseconds from the start of the video, that the label
     *         was detected.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was
     * detected.
     * </p>
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the start of the video, that the
     *            label was detected.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was
     * detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the start of the video, that the
     *            label was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelDetection withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     *
     * @return <p>
     *         Details about the detected label.
     *         </p>
     */
    public Label getLabel() {
        return label;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     *
     * @param label <p>
     *            Details about the detected label.
     *            </p>
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param label <p>
     *            Details about the detected label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelDetection withLabel(Label label) {
        this.label = label;
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getLabel() != null)
            sb.append("Label: " + getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelDetection == false)
            return false;
        LabelDetection other = (LabelDetection) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }
}
