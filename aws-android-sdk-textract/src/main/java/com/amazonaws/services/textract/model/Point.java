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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * The X and Y coordinates of a point on a document page. The X and Y values
 * returned are ratios of the overall document page size. For example, if the
 * input document is 700 x 200 and the operation returns X=0.5 and Y=0.25, then
 * the point is at the (350,50) pixel coordinate on the document page.
 * </p>
 * <p>
 * An array of <code>Point</code> objects, <code>Polygon</code>, is returned by
 * <a>DetectDocumentText</a>. <code>Polygon</code> represents a fine-grained
 * polygon around detected text. For more information, see Geometry in the
 * Amazon Textract Developer Guide.
 * </p>
 */
public class Point implements Serializable {
    /**
     * <p>
     * The value of the X coordinate for a point on a <code>Polygon</code>.
     * </p>
     */
    private Float x;

    /**
     * <p>
     * The value of the Y coordinate for a point on a <code>Polygon</code>.
     * </p>
     */
    private Float y;

    /**
     * <p>
     * The value of the X coordinate for a point on a <code>Polygon</code>.
     * </p>
     *
     * @return <p>
     *         The value of the X coordinate for a point on a
     *         <code>Polygon</code>.
     *         </p>
     */
    public Float getX() {
        return x;
    }

    /**
     * <p>
     * The value of the X coordinate for a point on a <code>Polygon</code>.
     * </p>
     *
     * @param x <p>
     *            The value of the X coordinate for a point on a
     *            <code>Polygon</code>.
     *            </p>
     */
    public void setX(Float x) {
        this.x = x;
    }

    /**
     * <p>
     * The value of the X coordinate for a point on a <code>Polygon</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param x <p>
     *            The value of the X coordinate for a point on a
     *            <code>Polygon</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Point withX(Float x) {
        this.x = x;
        return this;
    }

    /**
     * <p>
     * The value of the Y coordinate for a point on a <code>Polygon</code>.
     * </p>
     *
     * @return <p>
     *         The value of the Y coordinate for a point on a
     *         <code>Polygon</code>.
     *         </p>
     */
    public Float getY() {
        return y;
    }

    /**
     * <p>
     * The value of the Y coordinate for a point on a <code>Polygon</code>.
     * </p>
     *
     * @param y <p>
     *            The value of the Y coordinate for a point on a
     *            <code>Polygon</code>.
     *            </p>
     */
    public void setY(Float y) {
        this.y = y;
    }

    /**
     * <p>
     * The value of the Y coordinate for a point on a <code>Polygon</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param y <p>
     *            The value of the Y coordinate for a point on a
     *            <code>Polygon</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Point withY(Float y) {
        this.y = y;
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
        if (getX() != null)
            sb.append("X: " + getX() + ",");
        if (getY() != null)
            sb.append("Y: " + getY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Point == false)
            return false;
        Point other = (Point) obj;

        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        return true;
    }
}
