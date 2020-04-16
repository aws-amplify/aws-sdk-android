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
 * Specify the offset between the upper-left corner of the video frame and the
 * top left corner of the overlay.
 */
public class MotionImageInsertionOffset implements Serializable {
    /**
     * Set the distance, in pixels, between the overlay and the left edge of the
     * video frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer imageX;

    /**
     * Set the distance, in pixels, between the overlay and the top edge of the
     * video frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer imageY;

    /**
     * Set the distance, in pixels, between the overlay and the left edge of the
     * video frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Set the distance, in pixels, between the overlay and the left
     *         edge of the video frame.
     */
    public Integer getImageX() {
        return imageX;
    }

    /**
     * Set the distance, in pixels, between the overlay and the left edge of the
     * video frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageX Set the distance, in pixels, between the overlay and the
     *            left edge of the video frame.
     */
    public void setImageX(Integer imageX) {
        this.imageX = imageX;
    }

    /**
     * Set the distance, in pixels, between the overlay and the left edge of the
     * video frame.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageX Set the distance, in pixels, between the overlay and the
     *            left edge of the video frame.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInsertionOffset withImageX(Integer imageX) {
        this.imageX = imageX;
        return this;
    }

    /**
     * Set the distance, in pixels, between the overlay and the top edge of the
     * video frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Set the distance, in pixels, between the overlay and the top edge
     *         of the video frame.
     */
    public Integer getImageY() {
        return imageY;
    }

    /**
     * Set the distance, in pixels, between the overlay and the top edge of the
     * video frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageY Set the distance, in pixels, between the overlay and the
     *            top edge of the video frame.
     */
    public void setImageY(Integer imageY) {
        this.imageY = imageY;
    }

    /**
     * Set the distance, in pixels, between the overlay and the top edge of the
     * video frame.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageY Set the distance, in pixels, between the overlay and the
     *            top edge of the video frame.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MotionImageInsertionOffset withImageY(Integer imageY) {
        this.imageY = imageY;
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
        if (getImageX() != null)
            sb.append("ImageX: " + getImageX() + ",");
        if (getImageY() != null)
            sb.append("ImageY: " + getImageY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageX() == null) ? 0 : getImageX().hashCode());
        hashCode = prime * hashCode + ((getImageY() == null) ? 0 : getImageY().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MotionImageInsertionOffset == false)
            return false;
        MotionImageInsertionOffset other = (MotionImageInsertionOffset) obj;

        if (other.getImageX() == null ^ this.getImageX() == null)
            return false;
        if (other.getImageX() != null && other.getImageX().equals(this.getImageX()) == false)
            return false;
        if (other.getImageY() == null ^ this.getImageY() == null)
            return false;
        if (other.getImageY() != null && other.getImageY().equals(this.getImageY()) == false)
            return false;
        return true;
    }
}
