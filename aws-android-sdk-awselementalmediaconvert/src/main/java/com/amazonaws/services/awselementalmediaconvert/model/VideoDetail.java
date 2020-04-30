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
 * Contains details about the output's video stream
 */
public class VideoDetail implements Serializable {
    /**
     * Height in pixels for the output
     */
    private Integer heightInPx;

    /**
     * Width in pixels for the output
     */
    private Integer widthInPx;

    /**
     * Height in pixels for the output
     *
     * @return Height in pixels for the output
     */
    public Integer getHeightInPx() {
        return heightInPx;
    }

    /**
     * Height in pixels for the output
     *
     * @param heightInPx Height in pixels for the output
     */
    public void setHeightInPx(Integer heightInPx) {
        this.heightInPx = heightInPx;
    }

    /**
     * Height in pixels for the output
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param heightInPx Height in pixels for the output
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDetail withHeightInPx(Integer heightInPx) {
        this.heightInPx = heightInPx;
        return this;
    }

    /**
     * Width in pixels for the output
     *
     * @return Width in pixels for the output
     */
    public Integer getWidthInPx() {
        return widthInPx;
    }

    /**
     * Width in pixels for the output
     *
     * @param widthInPx Width in pixels for the output
     */
    public void setWidthInPx(Integer widthInPx) {
        this.widthInPx = widthInPx;
    }

    /**
     * Width in pixels for the output
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param widthInPx Width in pixels for the output
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDetail withWidthInPx(Integer widthInPx) {
        this.widthInPx = widthInPx;
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
        if (getHeightInPx() != null)
            sb.append("HeightInPx: " + getHeightInPx() + ",");
        if (getWidthInPx() != null)
            sb.append("WidthInPx: " + getWidthInPx());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeightInPx() == null) ? 0 : getHeightInPx().hashCode());
        hashCode = prime * hashCode + ((getWidthInPx() == null) ? 0 : getWidthInPx().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoDetail == false)
            return false;
        VideoDetail other = (VideoDetail) obj;

        if (other.getHeightInPx() == null ^ this.getHeightInPx() == null)
            return false;
        if (other.getHeightInPx() != null
                && other.getHeightInPx().equals(this.getHeightInPx()) == false)
            return false;
        if (other.getWidthInPx() == null ^ this.getWidthInPx() == null)
            return false;
        if (other.getWidthInPx() != null
                && other.getWidthInPx().equals(this.getWidthInPx()) == false)
            return false;
        return true;
    }
}
