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
 * Information about a shot detection segment detected in a video. For more
 * information, see <a>SegmentDetection</a>.
 * </p>
 */
public class ShotSegment implements Serializable {
    /**
     * <p>
     * An Identifier for a shot detection segment detected in a video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long index;

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * An Identifier for a shot detection segment detected in a video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         An Identifier for a shot detection segment detected in a video.
     *         </p>
     */
    public Long getIndex() {
        return index;
    }

    /**
     * <p>
     * An Identifier for a shot detection segment detected in a video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param index <p>
     *            An Identifier for a shot detection segment detected in a
     *            video.
     *            </p>
     */
    public void setIndex(Long index) {
        this.index = index;
    }

    /**
     * <p>
     * An Identifier for a shot detection segment detected in a video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param index <p>
     *            An Identifier for a shot detection segment detected in a
     *            video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShotSegment withIndex(Long index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition Video has in the accuracy
     *         of the detected segment.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition Video has in the
     *            accuracy of the detected segment.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition Video has in the
     *            accuracy of the detected segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShotSegment withConfidence(Float confidence) {
        this.confidence = confidence;
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShotSegment == false)
            return false;
        ShotSegment other = (ShotSegment) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
