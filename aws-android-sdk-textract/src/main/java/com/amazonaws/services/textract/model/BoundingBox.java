/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The bounding box around the detected page, text, key-value pair, table, table
 * cell, or selection element on a document page. The <code>left</code>
 * (x-coordinate) and <code>top</code> (y-coordinate) are coordinates that
 * represent the top and left sides of the bounding box. Note that the
 * upper-left corner of the image is the origin (0,0).
 * </p>
 * <p>
 * The <code>top</code> and <code>left</code> values returned are ratios of the
 * overall document page size. For example, if the input image is 700 x 200
 * pixels, and the top-left coordinate of the bounding box is 350 x 50 pixels,
 * the API returns a <code>left</code> value of 0.5 (350/700) and a
 * <code>top</code> value of 0.25 (50/200).
 * </p>
 * <p>
 * The <code>width</code> and <code>height</code> values represent the
 * dimensions of the bounding box as a ratio of the overall document page
 * dimension. For example, if the document page size is 700 x 200 pixels, and
 * the bounding box width is 70 pixels, the width returned is 0.1.
 * </p>
 */
public class BoundingBox implements Serializable {
    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page
     * width.
     * </p>
     */
    private Float width;

    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page
     * height.
     * </p>
     */
    private Float height;

    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document
     * page width.
     * </p>
     */
    private Float left;

    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document
     * page height.
     * </p>
     */
    private Float top;

    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page
     * width.
     * </p>
     *
     * @return <p>
     *         The width of the bounding box as a ratio of the overall document
     *         page width.
     *         </p>
     */
    public Float getWidth() {
        return width;
    }

    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page
     * width.
     * </p>
     *
     * @param width <p>
     *            The width of the bounding box as a ratio of the overall
     *            document page width.
     *            </p>
     */
    public void setWidth(Float width) {
        this.width = width;
    }

    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page
     * width.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param width <p>
     *            The width of the bounding box as a ratio of the overall
     *            document page width.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BoundingBox withWidth(Float width) {
        this.width = width;
        return this;
    }

    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page
     * height.
     * </p>
     *
     * @return <p>
     *         The height of the bounding box as a ratio of the overall document
     *         page height.
     *         </p>
     */
    public Float getHeight() {
        return height;
    }

    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page
     * height.
     * </p>
     *
     * @param height <p>
     *            The height of the bounding box as a ratio of the overall
     *            document page height.
     *            </p>
     */
    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page
     * height.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param height <p>
     *            The height of the bounding box as a ratio of the overall
     *            document page height.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BoundingBox withHeight(Float height) {
        this.height = height;
        return this;
    }

    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document
     * page width.
     * </p>
     *
     * @return <p>
     *         The left coordinate of the bounding box as a ratio of overall
     *         document page width.
     *         </p>
     */
    public Float getLeft() {
        return left;
    }

    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document
     * page width.
     * </p>
     *
     * @param left <p>
     *            The left coordinate of the bounding box as a ratio of overall
     *            document page width.
     *            </p>
     */
    public void setLeft(Float left) {
        this.left = left;
    }

    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document
     * page width.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param left <p>
     *            The left coordinate of the bounding box as a ratio of overall
     *            document page width.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BoundingBox withLeft(Float left) {
        this.left = left;
        return this;
    }

    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document
     * page height.
     * </p>
     *
     * @return <p>
     *         The top coordinate of the bounding box as a ratio of overall
     *         document page height.
     *         </p>
     */
    public Float getTop() {
        return top;
    }

    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document
     * page height.
     * </p>
     *
     * @param top <p>
     *            The top coordinate of the bounding box as a ratio of overall
     *            document page height.
     *            </p>
     */
    public void setTop(Float top) {
        this.top = top;
    }

    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document
     * page height.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param top <p>
     *            The top coordinate of the bounding box as a ratio of overall
     *            document page height.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BoundingBox withTop(Float top) {
        this.top = top;
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
        if (getWidth() != null)
            sb.append("Width: " + getWidth() + ",");
        if (getHeight() != null)
            sb.append("Height: " + getHeight() + ",");
        if (getLeft() != null)
            sb.append("Left: " + getLeft() + ",");
        if (getTop() != null)
            sb.append("Top: " + getTop());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getLeft() == null) ? 0 : getLeft().hashCode());
        hashCode = prime * hashCode + ((getTop() == null) ? 0 : getTop().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BoundingBox == false)
            return false;
        BoundingBox other = (BoundingBox) obj;

        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getLeft() == null ^ this.getLeft() == null)
            return false;
        if (other.getLeft() != null && other.getLeft().equals(this.getLeft()) == false)
            return false;
        if (other.getTop() == null ^ this.getTop() == null)
            return false;
        if (other.getTop() != null && other.getTop().equals(this.getTop()) == false)
            return false;
        return true;
    }
}
