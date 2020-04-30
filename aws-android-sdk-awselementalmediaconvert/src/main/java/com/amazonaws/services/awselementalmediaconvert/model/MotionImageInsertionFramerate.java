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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * For motion overlays that don't have a built-in frame rate, specify the frame
 * rate of the overlay in frames per second, as a fraction. For example, specify
 * 24 fps as 24/1. The overlay frame rate doesn't need to match the frame rate
 * of the underlying video.
 */
public class MotionImageInsertionFramerate implements Serializable {
    /**
     * The bottom of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 17895697<br/>
     */
    private Integer framerateDenominator;

    /**
     * The top of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 24.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483640<br/>
     */
    private Integer framerateNumerator;

    /**
     * The bottom of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 17895697<br/>
     *
     * @return The bottom of the fraction that expresses your overlay frame
     *         rate. For example, if your frame rate is 24 fps, set this value
     *         to 1.
     */
    public Integer getFramerateDenominator() {
        return framerateDenominator;
    }

    /**
     * The bottom of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 17895697<br/>
     *
     * @param framerateDenominator The bottom of the fraction that expresses
     *            your overlay frame rate. For example, if your frame rate is 24
     *            fps, set this value to 1.
     */
    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * The bottom of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 17895697<br/>
     *
     * @param framerateDenominator The bottom of the fraction that expresses
     *            your overlay frame rate. For example, if your frame rate is 24
     *            fps, set this value to 1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInsertionFramerate withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * The top of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 24.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483640<br/>
     *
     * @return The top of the fraction that expresses your overlay frame rate.
     *         For example, if your frame rate is 24 fps, set this value to 24.
     */
    public Integer getFramerateNumerator() {
        return framerateNumerator;
    }

    /**
     * The top of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 24.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483640<br/>
     *
     * @param framerateNumerator The top of the fraction that expresses your
     *            overlay frame rate. For example, if your frame rate is 24 fps,
     *            set this value to 24.
     */
    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * The top of the fraction that expresses your overlay frame rate. For
     * example, if your frame rate is 24 fps, set this value to 24.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483640<br/>
     *
     * @param framerateNumerator The top of the fraction that expresses your
     *            overlay frame rate. For example, if your frame rate is 24 fps,
     *            set this value to 24.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInsertionFramerate withFramerateNumerator(Integer framerateNumerator) {
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

        if (obj instanceof MotionImageInsertionFramerate == false)
            return false;
        MotionImageInsertionFramerate other = (MotionImageInsertionFramerate) obj;

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
