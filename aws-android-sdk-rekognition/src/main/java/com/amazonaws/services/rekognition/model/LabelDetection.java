/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * detected. Note that <code>Timestamp</code> is not guaranteed to be
     * accurate to the individual frame where the label first appears.
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
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startTimestampMillis;

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endTimestampMillis;

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long durationMillis;

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was
     * detected. Note that <code>Timestamp</code> is not guaranteed to be
     * accurate to the individual frame where the label first appears.
     * </p>
     *
     * @return <p>
     *         Time, in milliseconds from the start of the video, that the label
     *         was detected. Note that <code>Timestamp</code> is not guaranteed
     *         to be accurate to the individual frame where the label first
     *         appears.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was
     * detected. Note that <code>Timestamp</code> is not guaranteed to be
     * accurate to the individual frame where the label first appears.
     * </p>
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the start of the video, that the
     *            label was detected. Note that <code>Timestamp</code> is not
     *            guaranteed to be accurate to the individual frame where the
     *            label first appears.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was
     * detected. Note that <code>Timestamp</code> is not guaranteed to be
     * accurate to the individual frame where the label first appears.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the start of the video, that the
     *            label was detected. Note that <code>Timestamp</code> is not
     *            guaranteed to be accurate to the individual frame where the
     *            label first appears.
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
     * <p>
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time in milliseconds defining the start of the timeline
     *         segment containing a continuously detected label.
     *         </p>
     */
    public Long getStartTimestampMillis() {
        return startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTimestampMillis <p>
     *            The time in milliseconds defining the start of the timeline
     *            segment containing a continuously detected label.
     *            </p>
     */
    public void setStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTimestampMillis <p>
     *            The time in milliseconds defining the start of the timeline
     *            segment containing a continuously detected label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelDetection withStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
        return this;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time in milliseconds defining the end of the timeline segment
     *         containing a continuously detected label.
     *         </p>
     */
    public Long getEndTimestampMillis() {
        return endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTimestampMillis <p>
     *            The time in milliseconds defining the end of the timeline
     *            segment containing a continuously detected label.
     *            </p>
     */
    public void setEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTimestampMillis <p>
     *            The time in milliseconds defining the end of the timeline
     *            segment containing a continuously detected label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelDetection withEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
        return this;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time duration of a segment in milliseconds, I.e. time elapsed
     *         from StartTimestampMillis to EndTimestampMillis.
     *         </p>
     */
    public Long getDurationMillis() {
        return durationMillis;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The time duration of a segment in milliseconds, I.e. time
     *            elapsed from StartTimestampMillis to EndTimestampMillis.
     *            </p>
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The time duration of a segment in milliseconds, I.e. time
     *            elapsed from StartTimestampMillis to EndTimestampMillis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelDetection withDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
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
            sb.append("Label: " + getLabel() + ",");
        if (getStartTimestampMillis() != null)
            sb.append("StartTimestampMillis: " + getStartTimestampMillis() + ",");
        if (getEndTimestampMillis() != null)
            sb.append("EndTimestampMillis: " + getEndTimestampMillis() + ",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: " + getDurationMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimestampMillis() == null) ? 0 : getStartTimestampMillis().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestampMillis() == null) ? 0 : getEndTimestampMillis().hashCode());
        hashCode = prime * hashCode
                + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
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
        if (other.getStartTimestampMillis() == null ^ this.getStartTimestampMillis() == null)
            return false;
        if (other.getStartTimestampMillis() != null
                && other.getStartTimestampMillis().equals(this.getStartTimestampMillis()) == false)
            return false;
        if (other.getEndTimestampMillis() == null ^ this.getEndTimestampMillis() == null)
            return false;
        if (other.getEndTimestampMillis() != null
                && other.getEndTimestampMillis().equals(this.getEndTimestampMillis()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null
                && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        return true;
    }
}
