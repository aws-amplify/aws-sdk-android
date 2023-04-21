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
 * The quality of an image provided for label detection, with regard to
 * brightness, sharpness, and contrast.
 * </p>
 */
public class DetectLabelsImageQuality implements Serializable {
    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     */
    private Float brightness;

    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     */
    private Float sharpness;

    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     */
    private Float contrast;

    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     *
     * @return <p>
     *         The brightness of an image provided for label detection.
     *         </p>
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     *
     * @param brightness <p>
     *            The brightness of an image provided for label detection.
     *            </p>
     */
    public void setBrightness(Float brightness) {
        this.brightness = brightness;
    }

    /**
     * <p>
     * The brightness of an image provided for label detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brightness <p>
     *            The brightness of an image provided for label detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageQuality withBrightness(Float brightness) {
        this.brightness = brightness;
        return this;
    }

    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     *
     * @return <p>
     *         The sharpness of an image provided for label detection.
     *         </p>
     */
    public Float getSharpness() {
        return sharpness;
    }

    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     *
     * @param sharpness <p>
     *            The sharpness of an image provided for label detection.
     *            </p>
     */
    public void setSharpness(Float sharpness) {
        this.sharpness = sharpness;
    }

    /**
     * <p>
     * The sharpness of an image provided for label detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sharpness <p>
     *            The sharpness of an image provided for label detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageQuality withSharpness(Float sharpness) {
        this.sharpness = sharpness;
        return this;
    }

    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     *
     * @return <p>
     *         The contrast of an image provided for label detection.
     *         </p>
     */
    public Float getContrast() {
        return contrast;
    }

    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     *
     * @param contrast <p>
     *            The contrast of an image provided for label detection.
     *            </p>
     */
    public void setContrast(Float contrast) {
        this.contrast = contrast;
    }

    /**
     * <p>
     * The contrast of an image provided for label detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contrast <p>
     *            The contrast of an image provided for label detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageQuality withContrast(Float contrast) {
        this.contrast = contrast;
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
        if (getBrightness() != null)
            sb.append("Brightness: " + getBrightness() + ",");
        if (getSharpness() != null)
            sb.append("Sharpness: " + getSharpness() + ",");
        if (getContrast() != null)
            sb.append("Contrast: " + getContrast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrightness() == null) ? 0 : getBrightness().hashCode());
        hashCode = prime * hashCode + ((getSharpness() == null) ? 0 : getSharpness().hashCode());
        hashCode = prime * hashCode + ((getContrast() == null) ? 0 : getContrast().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsImageQuality == false)
            return false;
        DetectLabelsImageQuality other = (DetectLabelsImageQuality) obj;

        if (other.getBrightness() == null ^ this.getBrightness() == null)
            return false;
        if (other.getBrightness() != null
                && other.getBrightness().equals(this.getBrightness()) == false)
            return false;
        if (other.getSharpness() == null ^ this.getSharpness() == null)
            return false;
        if (other.getSharpness() != null
                && other.getSharpness().equals(this.getSharpness()) == false)
            return false;
        if (other.getContrast() == null ^ this.getContrast() == null)
            return false;
        if (other.getContrast() != null && other.getContrast().equals(this.getContrast()) == false)
            return false;
        return true;
    }
}
