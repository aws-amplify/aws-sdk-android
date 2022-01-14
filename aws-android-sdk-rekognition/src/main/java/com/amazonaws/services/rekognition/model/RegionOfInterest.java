/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a location within the frame that Rekognition checks for text. Uses
 * a <code>BoundingBox</code> object to set a region of the screen.
 * </p>
 * <p>
 * A word is included in the region if the word is more than half in that
 * region. If there is more than one region, the word will be compared with all
 * regions of the screen. Any word more than half in a region is kept in the
 * results.
 * </p>
 */
public class RegionOfInterest implements Serializable {
    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     *
     * @return <p>
     *         The box representing a region of interest on screen.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     *
     * @param boundingBox <p>
     *            The box representing a region of interest on screen.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            The box representing a region of interest on screen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegionOfInterest withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionOfInterest == false)
            return false;
        RegionOfInterest other = (RegionOfInterest) obj;

        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        return true;
    }
}
