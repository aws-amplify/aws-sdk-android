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
 * Information about the quality and dominant colors of an input image. Quality
 * and color information is returned for the entire image, foreground, and
 * background.
 * </p>
 */
public class DetectLabelsImageProperties implements Serializable {
    /**
     * <p>
     * Information about the quality of the image foreground as defined by
     * brightness, sharpness, and contrast. The higher the value the greater the
     * brightness, sharpness, and contrast respectively.
     * </p>
     */
    private DetectLabelsImageQuality quality;

    /**
     * <p>
     * Information about the dominant colors found in an image, described with
     * RGB values, CSS color name, simplified color name, and PixelPercentage
     * (the percentage of image pixels that have a particular color).
     * </p>
     */
    private java.util.List<DominantColor> dominantColors;

    /**
     * <p>
     * Information about the properties of an image’s foreground, including the
     * foreground’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     */
    private DetectLabelsImageForeground foreground;

    /**
     * <p>
     * Information about the properties of an image’s background, including the
     * background’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     */
    private DetectLabelsImageBackground background;

    /**
     * <p>
     * Information about the quality of the image foreground as defined by
     * brightness, sharpness, and contrast. The higher the value the greater the
     * brightness, sharpness, and contrast respectively.
     * </p>
     *
     * @return <p>
     *         Information about the quality of the image foreground as defined
     *         by brightness, sharpness, and contrast. The higher the value the
     *         greater the brightness, sharpness, and contrast respectively.
     *         </p>
     */
    public DetectLabelsImageQuality getQuality() {
        return quality;
    }

    /**
     * <p>
     * Information about the quality of the image foreground as defined by
     * brightness, sharpness, and contrast. The higher the value the greater the
     * brightness, sharpness, and contrast respectively.
     * </p>
     *
     * @param quality <p>
     *            Information about the quality of the image foreground as
     *            defined by brightness, sharpness, and contrast. The higher the
     *            value the greater the brightness, sharpness, and contrast
     *            respectively.
     *            </p>
     */
    public void setQuality(DetectLabelsImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Information about the quality of the image foreground as defined by
     * brightness, sharpness, and contrast. The higher the value the greater the
     * brightness, sharpness, and contrast respectively.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quality <p>
     *            Information about the quality of the image foreground as
     *            defined by brightness, sharpness, and contrast. The higher the
     *            value the greater the brightness, sharpness, and contrast
     *            respectively.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageProperties withQuality(DetectLabelsImageQuality quality) {
        this.quality = quality;
        return this;
    }

    /**
     * <p>
     * Information about the dominant colors found in an image, described with
     * RGB values, CSS color name, simplified color name, and PixelPercentage
     * (the percentage of image pixels that have a particular color).
     * </p>
     *
     * @return <p>
     *         Information about the dominant colors found in an image,
     *         described with RGB values, CSS color name, simplified color name,
     *         and PixelPercentage (the percentage of image pixels that have a
     *         particular color).
     *         </p>
     */
    public java.util.List<DominantColor> getDominantColors() {
        return dominantColors;
    }

    /**
     * <p>
     * Information about the dominant colors found in an image, described with
     * RGB values, CSS color name, simplified color name, and PixelPercentage
     * (the percentage of image pixels that have a particular color).
     * </p>
     *
     * @param dominantColors <p>
     *            Information about the dominant colors found in an image,
     *            described with RGB values, CSS color name, simplified color
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
     * Information about the dominant colors found in an image, described with
     * RGB values, CSS color name, simplified color name, and PixelPercentage
     * (the percentage of image pixels that have a particular color).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantColors <p>
     *            Information about the dominant colors found in an image,
     *            described with RGB values, CSS color name, simplified color
     *            name, and PixelPercentage (the percentage of image pixels that
     *            have a particular color).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageProperties withDominantColors(DominantColor... dominantColors) {
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
     * Information about the dominant colors found in an image, described with
     * RGB values, CSS color name, simplified color name, and PixelPercentage
     * (the percentage of image pixels that have a particular color).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantColors <p>
     *            Information about the dominant colors found in an image,
     *            described with RGB values, CSS color name, simplified color
     *            name, and PixelPercentage (the percentage of image pixels that
     *            have a particular color).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageProperties withDominantColors(
            java.util.Collection<DominantColor> dominantColors) {
        setDominantColors(dominantColors);
        return this;
    }

    /**
     * <p>
     * Information about the properties of an image’s foreground, including the
     * foreground’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     *
     * @return <p>
     *         Information about the properties of an image’s foreground,
     *         including the foreground’s quality and dominant colors, including
     *         the quality and dominant colors of the image.
     *         </p>
     */
    public DetectLabelsImageForeground getForeground() {
        return foreground;
    }

    /**
     * <p>
     * Information about the properties of an image’s foreground, including the
     * foreground’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     *
     * @param foreground <p>
     *            Information about the properties of an image’s foreground,
     *            including the foreground’s quality and dominant colors,
     *            including the quality and dominant colors of the image.
     *            </p>
     */
    public void setForeground(DetectLabelsImageForeground foreground) {
        this.foreground = foreground;
    }

    /**
     * <p>
     * Information about the properties of an image’s foreground, including the
     * foreground’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param foreground <p>
     *            Information about the properties of an image’s foreground,
     *            including the foreground’s quality and dominant colors,
     *            including the quality and dominant colors of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageProperties withForeground(DetectLabelsImageForeground foreground) {
        this.foreground = foreground;
        return this;
    }

    /**
     * <p>
     * Information about the properties of an image’s background, including the
     * background’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     *
     * @return <p>
     *         Information about the properties of an image’s background,
     *         including the background’s quality and dominant colors, including
     *         the quality and dominant colors of the image.
     *         </p>
     */
    public DetectLabelsImageBackground getBackground() {
        return background;
    }

    /**
     * <p>
     * Information about the properties of an image’s background, including the
     * background’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     *
     * @param background <p>
     *            Information about the properties of an image’s background,
     *            including the background’s quality and dominant colors,
     *            including the quality and dominant colors of the image.
     *            </p>
     */
    public void setBackground(DetectLabelsImageBackground background) {
        this.background = background;
    }

    /**
     * <p>
     * Information about the properties of an image’s background, including the
     * background’s quality and dominant colors, including the quality and
     * dominant colors of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param background <p>
     *            Information about the properties of an image’s background,
     *            including the background’s quality and dominant colors,
     *            including the quality and dominant colors of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImageProperties withBackground(DetectLabelsImageBackground background) {
        this.background = background;
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
            sb.append("DominantColors: " + getDominantColors() + ",");
        if (getForeground() != null)
            sb.append("Foreground: " + getForeground() + ",");
        if (getBackground() != null)
            sb.append("Background: " + getBackground());
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
        hashCode = prime * hashCode + ((getForeground() == null) ? 0 : getForeground().hashCode());
        hashCode = prime * hashCode + ((getBackground() == null) ? 0 : getBackground().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsImageProperties == false)
            return false;
        DetectLabelsImageProperties other = (DetectLabelsImageProperties) obj;

        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        if (other.getDominantColors() == null ^ this.getDominantColors() == null)
            return false;
        if (other.getDominantColors() != null
                && other.getDominantColors().equals(this.getDominantColors()) == false)
            return false;
        if (other.getForeground() == null ^ this.getForeground() == null)
            return false;
        if (other.getForeground() != null
                && other.getForeground().equals(this.getForeground()) == false)
            return false;
        if (other.getBackground() == null ^ this.getBackground() == null)
            return false;
        if (other.getBackground() != null
                && other.getBackground().equals(this.getBackground()) == false)
            return false;
        return true;
    }
}
