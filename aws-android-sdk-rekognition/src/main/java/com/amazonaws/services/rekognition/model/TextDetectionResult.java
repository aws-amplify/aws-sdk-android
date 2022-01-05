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
 * Information about text detected in a video. Incudes the detected text, the
 * time in milliseconds from the start of the video that the text was detected,
 * and where it was detected on the screen.
 * </p>
 */
public class TextDetectionResult implements Serializable {
    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was
     * detected.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     */
    private TextDetection textDetection;

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was
     * detected.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds from the start of the video, that the
     *         text was detected.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was
     * detected.
     * </p>
     *
     * @param timestamp <p>
     *            The time, in milliseconds from the start of the video, that
     *            the text was detected.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was
     * detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time, in milliseconds from the start of the video, that
     *            the text was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDetectionResult withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     *
     * @return <p>
     *         Details about text detected in a video.
     *         </p>
     */
    public TextDetection getTextDetection() {
        return textDetection;
    }

    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     *
     * @param textDetection <p>
     *            Details about text detected in a video.
     *            </p>
     */
    public void setTextDetection(TextDetection textDetection) {
        this.textDetection = textDetection;
    }

    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textDetection <p>
     *            Details about text detected in a video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDetectionResult withTextDetection(TextDetection textDetection) {
        this.textDetection = textDetection;
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
        if (getTextDetection() != null)
            sb.append("TextDetection: " + getTextDetection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getTextDetection() == null) ? 0 : getTextDetection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextDetectionResult == false)
            return false;
        TextDetectionResult other = (TextDetectionResult) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getTextDetection() == null ^ this.getTextDetection() == null)
            return false;
        if (other.getTextDetection() != null
                && other.getTextDetection().equals(this.getTextDetection()) == false)
            return false;
        return true;
    }
}
