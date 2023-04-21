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
 * The foreground of the image with regard to image quality and dominant colors.
 * </p>
 */
public class DetectLabelsImageForeground implements Serializable {
    /**
     * <p>
     * The quality of the image foreground as defined by brightness and
     * sharpness.
     * </p>
     */
    private DetectLabelsImageQuality quality;

    /**
     * <p>
     * The dominant colors found in the foreground of an image, defined with RGB
     * values, CSS color name, simplified color name, and PixelPercentage (the
     * percentage of image pixels that have a particular color).
     * </p>
     */
    private java.util.List<DominantColor> dominantColors;

    /**
     * <p>
     * The quality of the image foreground as defined by brightness and
     * sharpness.
     * </p>
     *
     * @return <p>
     *         The quality of the image foreground as defined by brightness and
     *         sharpness.
     *         </p>
     */
    public DetectLabelsImageQuality getQuality() {
        return quality;
    }

    /**
     * <p>
     * The quality of the image foreground as defined by brightness and
     * sharpness.
     * </p>
     *
     * @param quality <p>
     *            The quality of the image foreground as defined by brightness
     *            and sharpness.
     *            </p>
     */
    public void setQuality(DetectLabelsImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * The quality of the image foreground as defined by brightness and
     * sharpness.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quality <p>
     *            The quality of the image foreground as defined by brightness
     *            and sharpness.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageForeground withQuality(DetectLabelsImageQuality quality) {
        this.quality = quality;
        return this;
    }

    /**
     * <p>
     * The dominant colors found in the foreground of an image, defined with RGB
     * values, CSS color name, simplified color name, and PixelPercentage (the
     * percentage of image pixels that have a particular color).
     * </p>
     *
     * @return <p>
     *         The dominant colors found in the foreground of an image, defined
     *         with RGB values, CSS color name, simplified color name, and
     *         PixelPercentage (the percentage of image pixels that have a
     *         particular color).
     *         </p>
     */
    public java.util.List<DominantColor> getDominantColors() {
        return dominantColors;
    }

    /**
     * <p>
     * The dominant colors found in the foreground of an image, defined with RGB
     * values, CSS color name, simplified color name, and PixelPercentage (the
     * percentage of image pixels that have a particular color).
     * </p>
     *
     * @param dominantColors <p>
     *            The dominant colors found in the foreground of an image,
     *            defined with RGB values, CSS color name, simplified color
     *            name, and PixelPercentage (the percentage of image pixels that
     *            have a particular color).
     *            </p>
     */
    public void setDominantColors(java.util.Collection<DominantColor> dominantColors) {
        if (dominantColors == null) {
            this.dominantColors = null;
            return;
        }

        this.dominantColors = new java.util.ArrayList<DominantColor>(dominantColors);
    }

    /**
     * <p>
     * The dominant colors found in the foreground of an image, defined with RGB
     * values, CSS color name, simplified color name, and PixelPercentage (the
     * percentage of image pixels that have a particular color).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantColors <p>
     *            The dominant colors found in the foreground of an image,
     *            defined with RGB values, CSS color name, simplified color
     *            name, and PixelPercentage (the percentage of image pixels that
     *            have a particular color).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageForeground withDominantColors(DominantColor... dominantColors) {
        if (getDominantColors() == null) {
            this.dominantColors = new java.util.ArrayList<DominantColor>(dominantColors.length);
        }
        for (DominantColor value : dominantColors) {
            this.dominantColors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The dominant colors found in the foreground of an image, defined with RGB
     * values, CSS color name, simplified color name, and PixelPercentage (the
     * percentage of image pixels that have a particular color).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantColors <p>
     *            The dominant colors found in the foreground of an image,
     *            defined with RGB values, CSS color name, simplified color
     *            name, and PixelPercentage (the percentage of image pixels that
     *            have a particular color).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageForeground withDominantColors(
            java.util.Collection<DominantColor> dominantColors) {
        setDominantColors(dominantColors);
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
        if (getQuality() != null)
            sb.append("Quality: " + getQuality() + ",");
        if (getDominantColors() != null)
            sb.append("DominantColors: " + getDominantColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        hashCode = prime * hashCode
                + ((getDominantColors() == null) ? 0 : getDominantColors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsImageForeground == false)
            return false;
        DetectLabelsImageForeground other = (DetectLabelsImageForeground) obj;

        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getDominantColors() == null ^ this.getDominantColors() == null)
            return false;
        if (other.getDominantColors() != null
                && other.getDominantColors().equals(this.getDominantColors()) == false)
            return false;
        return true;
    }
}
