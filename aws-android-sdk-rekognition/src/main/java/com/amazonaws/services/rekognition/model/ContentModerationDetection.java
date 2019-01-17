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
 * Information about a moderation label detection in a stored video.
 * </p>
 */
public class ContentModerationDetection implements Serializable {
    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the
     * moderation label was detected.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * The moderation label detected by in the stored video.
     * </p>
     */
    private ModerationLabel moderationLabel;

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the
     * moderation label was detected.
     * </p>
     *
     * @return <p>
     *         Time, in milliseconds from the beginning of the video, that the
     *         moderation label was detected.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the
     * moderation label was detected.
     * </p>
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the beginning of the video, that
     *            the moderation label was detected.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the
     * moderation label was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the beginning of the video, that
     *            the moderation label was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The moderation label detected by in the stored video.
     * </p>
     *
     * @return <p>
     *         The moderation label detected by in the stored video.
     *         </p>
     */
    public ModerationLabel getModerationLabel() {
        return moderationLabel;
    }

    /**
     * <p>
     * The moderation label detected by in the stored video.
     * </p>
     *
     * @param moderationLabel <p>
     *            The moderation label detected by in the stored video.
     *            </p>
     */
    public void setModerationLabel(ModerationLabel moderationLabel) {
        this.moderationLabel = moderationLabel;
    }

    /**
     * <p>
     * The moderation label detected by in the stored video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param moderationLabel <p>
     *            The moderation label detected by in the stored video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withModerationLabel(ModerationLabel moderationLabel) {
        this.moderationLabel = moderationLabel;
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
        if (getModerationLabel() != null)
            sb.append("ModerationLabel: " + getModerationLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getModerationLabel() == null) ? 0 : getModerationLabel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentModerationDetection == false)
            return false;
        ContentModerationDetection other = (ContentModerationDetection) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getModerationLabel() == null ^ this.getModerationLabel() == null)
            return false;
        if (other.getModerationLabel() != null
                && other.getModerationLabel().equals(this.getModerationLabel()) == false)
            return false;
        return true;
    }
}
