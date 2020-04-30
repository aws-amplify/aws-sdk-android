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
 * Enable the image inserter feature to include a graphic overlay on your video.
 * Enable or disable this feature for each input or output individually. This
 * setting is disabled by default.
 */
public class ImageInserter implements Serializable {
    /**
     * Specify the images that you want to overlay on your video. The images
     * must be PNG or TGA files.
     */
    private java.util.List<InsertableImage> insertableImages;

    /**
     * Specify the images that you want to overlay on your video. The images
     * must be PNG or TGA files.
     *
     * @return Specify the images that you want to overlay on your video. The
     *         images must be PNG or TGA files.
     */
    public java.util.List<InsertableImage> getInsertableImages() {
        return insertableImages;
    }

    /**
     * Specify the images that you want to overlay on your video. The images
     * must be PNG or TGA files.
     *
     * @param insertableImages Specify the images that you want to overlay on
     *            your video. The images must be PNG or TGA files.
     */
    public void setInsertableImages(java.util.Collection<InsertableImage> insertableImages) {
        if (insertableImages == null) {
            this.insertableImages = null;
            return;
        }

        this.insertableImages = new java.util.ArrayList<InsertableImage>(insertableImages);
    }

    /**
     * Specify the images that you want to overlay on your video. The images
     * must be PNG or TGA files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insertableImages Specify the images that you want to overlay on
     *            your video. The images must be PNG or TGA files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageInserter withInsertableImages(InsertableImage... insertableImages) {
        if (getInsertableImages() == null) {
            this.insertableImages = new java.util.ArrayList<InsertableImage>(
                    insertableImages.length);
        }
        for (InsertableImage value : insertableImages) {
            this.insertableImages.add(value);
        }
        return this;
    }

    /**
     * Specify the images that you want to overlay on your video. The images
     * must be PNG or TGA files.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insertableImages Specify the images that you want to overlay on
     *            your video. The images must be PNG or TGA files.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageInserter withInsertableImages(java.util.Collection<InsertableImage> insertableImages) {
        setInsertableImages(insertableImages);
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
        if (getInsertableImages() != null)
            sb.append("InsertableImages: " + getInsertableImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInsertableImages() == null) ? 0 : getInsertableImages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageInserter == false)
            return false;
        ImageInserter other = (ImageInserter) obj;

        if (other.getInsertableImages() == null ^ this.getInsertableImages() == null)
            return false;
        if (other.getInsertableImages() != null
                && other.getInsertableImages().equals(this.getInsertableImages()) == false)
            return false;
        return true;
    }
}
