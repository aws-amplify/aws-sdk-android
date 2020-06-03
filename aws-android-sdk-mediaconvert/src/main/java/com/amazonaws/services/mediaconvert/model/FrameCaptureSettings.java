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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the
 * value FRAME_CAPTURE.
 */
public class FrameCaptureSettings implements Serializable {
    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.n.jpg where n is the 0-based sequence
     * number of each Capture.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer framerateDenominator;

    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based
     * frame sequence number zero padded to 7 decimal places.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer framerateNumerator;

    /**
     * Maximum number of captures (encoded jpg output files).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000000<br/>
     */
    private Integer maxCaptures;

    /**
     * JPEG Quality - a higher value equals higher quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer quality;

    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.n.jpg where n is the 0-based sequence
     * number of each Capture.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Frame capture will encode the first frame of the output stream,
     *         then one frame every framerateDenominator/framerateNumerator
     *         seconds. For example, settings of framerateNumerator = 1 and
     *         framerateDenominator = 3 (a rate of 1/3 frame per second) will
     *         capture the first frame, then 1 frame every 3s. Files will be
     *         named as filename.n.jpg where n is the 0-based sequence number of
     *         each Capture.
     */
    public Integer getFramerateDenominator() {
        return framerateDenominator;
    }

    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.n.jpg where n is the 0-based sequence
     * number of each Capture.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateDenominator Frame capture will encode the first frame of
     *            the output stream, then one frame every
     *            framerateDenominator/framerateNumerator seconds. For example,
     *            settings of framerateNumerator = 1 and framerateDenominator =
     *            3 (a rate of 1/3 frame per second) will capture the first
     *            frame, then 1 frame every 3s. Files will be named as
     *            filename.n.jpg where n is the 0-based sequence number of each
     *            Capture.
     */
    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.n.jpg where n is the 0-based sequence
     * number of each Capture.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateDenominator Frame capture will encode the first frame of
     *            the output stream, then one frame every
     *            framerateDenominator/framerateNumerator seconds. For example,
     *            settings of framerateNumerator = 1 and framerateDenominator =
     *            3 (a rate of 1/3 frame per second) will capture the first
     *            frame, then 1 frame every 3s. Files will be named as
     *            filename.n.jpg where n is the 0-based sequence number of each
     *            Capture.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FrameCaptureSettings withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based
     * frame sequence number zero padded to 7 decimal places.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Frame capture will encode the first frame of the output stream,
     *         then one frame every framerateDenominator/framerateNumerator
     *         seconds. For example, settings of framerateNumerator = 1 and
     *         framerateDenominator = 3 (a rate of 1/3 frame per second) will
     *         capture the first frame, then 1 frame every 3s. Files will be
     *         named as filename.NNNNNNN.jpg where N is the 0-based frame
     *         sequence number zero padded to 7 decimal places.
     */
    public Integer getFramerateNumerator() {
        return framerateNumerator;
    }

    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based
     * frame sequence number zero padded to 7 decimal places.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateNumerator Frame capture will encode the first frame of
     *            the output stream, then one frame every
     *            framerateDenominator/framerateNumerator seconds. For example,
     *            settings of framerateNumerator = 1 and framerateDenominator =
     *            3 (a rate of 1/3 frame per second) will capture the first
     *            frame, then 1 frame every 3s. Files will be named as
     *            filename.NNNNNNN.jpg where N is the 0-based frame sequence
     *            number zero padded to 7 decimal places.
     */
    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Frame capture will encode the first frame of the output stream, then one
     * frame every framerateDenominator/framerateNumerator seconds. For example,
     * settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate
     * of 1/3 frame per second) will capture the first frame, then 1 frame every
     * 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based
     * frame sequence number zero padded to 7 decimal places.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateNumerator Frame capture will encode the first frame of
     *            the output stream, then one frame every
     *            framerateDenominator/framerateNumerator seconds. For example,
     *            settings of framerateNumerator = 1 and framerateDenominator =
     *            3 (a rate of 1/3 frame per second) will capture the first
     *            frame, then 1 frame every 3s. Files will be named as
     *            filename.NNNNNNN.jpg where N is the 0-based frame sequence
     *            number zero padded to 7 decimal places.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FrameCaptureSettings withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
        return this;
    }

    /**
     * Maximum number of captures (encoded jpg output files).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000000<br/>
     *
     * @return Maximum number of captures (encoded jpg output files).
     */
    public Integer getMaxCaptures() {
        return maxCaptures;
    }

    /**
     * Maximum number of captures (encoded jpg output files).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000000<br/>
     *
     * @param maxCaptures Maximum number of captures (encoded jpg output files).
     */
    public void setMaxCaptures(Integer maxCaptures) {
        this.maxCaptures = maxCaptures;
    }

    /**
     * Maximum number of captures (encoded jpg output files).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000000<br/>
     *
     * @param maxCaptures Maximum number of captures (encoded jpg output files).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FrameCaptureSettings withMaxCaptures(Integer maxCaptures) {
        this.maxCaptures = maxCaptures;
        return this;
    }

    /**
     * JPEG Quality - a higher value equals higher quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return JPEG Quality - a higher value equals higher quality.
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * JPEG Quality - a higher value equals higher quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param quality JPEG Quality - a higher value equals higher quality.
     */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /**
     * JPEG Quality - a higher value equals higher quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param quality JPEG Quality - a higher value equals higher quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FrameCaptureSettings withQuality(Integer quality) {
        this.quality = quality;
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
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: " + getFramerateDenominator() + ",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: " + getFramerateNumerator() + ",");
        if (getMaxCaptures() != null)
            sb.append("MaxCaptures: " + getMaxCaptures() + ",");
        if (getQuality() != null)
            sb.append("Quality: " + getQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCaptures() == null) ? 0 : getMaxCaptures().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureSettings == false)
            return false;
        FrameCaptureSettings other = (FrameCaptureSettings) obj;

        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null
                && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null
                && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        if (other.getMaxCaptures() == null ^ this.getMaxCaptures() == null)
            return false;
        if (other.getMaxCaptures() != null
                && other.getMaxCaptures().equals(this.getMaxCaptures()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        return true;
    }
}
