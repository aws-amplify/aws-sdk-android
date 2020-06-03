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
 * Ignore this setting unless your input captions format is SCC. To have the
 * service compensate for differing frame rates between your input captions and
 * input video, specify the frame rate of the captions file. Specify this value
 * as a fraction, using the settings Framerate numerator (framerateNumerator)
 * and Framerate denominator (framerateDenominator). For example, you might
 * specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for 23.976 fps, or
 * 30000 / 1001 for 29.97 fps.
 */
public class CaptionSourceFramerate implements Serializable {
    /**
     * Specify the denominator of the fraction that represents the frame rate
     * for the setting Caption source frame rate (CaptionSourceFramerate). Use
     * this setting along with the setting Framerate numerator
     * (framerateNumerator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     */
    private Integer framerateDenominator;

    /**
     * Specify the numerator of the fraction that represents the frame rate for
     * the setting Caption source frame rate (CaptionSourceFramerate). Use this
     * setting along with the setting Framerate denominator
     * (framerateDenominator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60000<br/>
     */
    private Integer framerateNumerator;

    /**
     * Specify the denominator of the fraction that represents the frame rate
     * for the setting Caption source frame rate (CaptionSourceFramerate). Use
     * this setting along with the setting Framerate numerator
     * (framerateNumerator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     *
     * @return Specify the denominator of the fraction that represents the frame
     *         rate for the setting Caption source frame rate
     *         (CaptionSourceFramerate). Use this setting along with the setting
     *         Framerate numerator (framerateNumerator).
     */
    public Integer getFramerateDenominator() {
        return framerateDenominator;
    }

    /**
     * Specify the denominator of the fraction that represents the frame rate
     * for the setting Caption source frame rate (CaptionSourceFramerate). Use
     * this setting along with the setting Framerate numerator
     * (framerateNumerator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     *
     * @param framerateDenominator Specify the denominator of the fraction that
     *            represents the frame rate for the setting Caption source frame
     *            rate (CaptionSourceFramerate). Use this setting along with the
     *            setting Framerate numerator (framerateNumerator).
     */
    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * Specify the denominator of the fraction that represents the frame rate
     * for the setting Caption source frame rate (CaptionSourceFramerate). Use
     * this setting along with the setting Framerate numerator
     * (framerateNumerator).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     *
     * @param framerateDenominator Specify the denominator of the fraction that
     *            represents the frame rate for the setting Caption source frame
     *            rate (CaptionSourceFramerate). Use this setting along with the
     *            setting Framerate numerator (framerateNumerator).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceFramerate withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * Specify the numerator of the fraction that represents the frame rate for
     * the setting Caption source frame rate (CaptionSourceFramerate). Use this
     * setting along with the setting Framerate denominator
     * (framerateDenominator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60000<br/>
     *
     * @return Specify the numerator of the fraction that represents the frame
     *         rate for the setting Caption source frame rate
     *         (CaptionSourceFramerate). Use this setting along with the setting
     *         Framerate denominator (framerateDenominator).
     */
    public Integer getFramerateNumerator() {
        return framerateNumerator;
    }

    /**
     * Specify the numerator of the fraction that represents the frame rate for
     * the setting Caption source frame rate (CaptionSourceFramerate). Use this
     * setting along with the setting Framerate denominator
     * (framerateDenominator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60000<br/>
     *
     * @param framerateNumerator Specify the numerator of the fraction that
     *            represents the frame rate for the setting Caption source frame
     *            rate (CaptionSourceFramerate). Use this setting along with the
     *            setting Framerate denominator (framerateDenominator).
     */
    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Specify the numerator of the fraction that represents the frame rate for
     * the setting Caption source frame rate (CaptionSourceFramerate). Use this
     * setting along with the setting Framerate denominator
     * (framerateDenominator).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60000<br/>
     *
     * @param framerateNumerator Specify the numerator of the fraction that
     *            represents the frame rate for the setting Caption source frame
     *            rate (CaptionSourceFramerate). Use this setting along with the
     *            setting Framerate denominator (framerateDenominator).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSourceFramerate withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
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
            sb.append("FramerateNumerator: " + getFramerateNumerator());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSourceFramerate == false)
            return false;
        CaptionSourceFramerate other = (CaptionSourceFramerate) obj;

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
        return true;
    }
}
