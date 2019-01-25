/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about where text detected by is located on an image.
 * </p>
 */
public class Geometry implements Serializable {
    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on
     * the image.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     */
    private java.util.List<Point> polygon;

    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on
     * the image.
     * </p>
     *
     * @return <p>
     *         An axis-aligned coarse representation of the detected text's
     *         location on the image.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on
     * the image.
     * </p>
     *
     * @param boundingBox <p>
     *            An axis-aligned coarse representation of the detected text's
     *            location on the image.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on
     * the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            An axis-aligned coarse representation of the detected text's
     *            location on the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Geometry withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     *
     * @return <p>
     *         Within the bounding box, a fine-grained polygon around the
     *         detected text.
     *         </p>
     */
    public java.util.List<Point> getPolygon() {
        return polygon;
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     *
     * @param polygon <p>
     *            Within the bounding box, a fine-grained polygon around the
     *            detected text.
     *            </p>
     */
    public void setPolygon(java.util.Collection<Point> polygon) {
        if (polygon == null) {
            this.polygon = null;
            return;
        }

        this.polygon = new java.util.ArrayList<Point>(polygon);
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param polygon <p>
     *            Within the bounding box, a fine-grained polygon around the
     *            detected text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Geometry withPolygon(Point... polygon) {
        if (getPolygon() == null) {
            this.polygon = new java.util.ArrayList<Point>(polygon.length);
        }
        for (Point value : polygon) {
            this.polygon.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param polygon <p>
     *            Within the bounding box, a fine-grained polygon around the
     *            detected text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Geometry withPolygon(java.util.Collection<Point> polygon) {
        setPolygon(polygon);
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
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getPolygon() != null)
            sb.append("Polygon: " + getPolygon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getPolygon() == null) ? 0 : getPolygon().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Geometry == false)
            return false;
        Geometry other = (Geometry) obj;

        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getPolygon() == null ^ this.getPolygon() == null)
            return false;
        if (other.getPolygon() != null && other.getPolygon().equals(this.getPolygon()) == false)
            return false;
        return true;
    }
}
