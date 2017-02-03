/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides face metadata (bounding box and confidence that the bounding box
 * actually contains a face).
 * </p>
 */
public class ComparedFace implements Serializable {
    /**
     * <p>
     * Identifies the bounding box around the object or face. The
     * <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are
     * coordinates representing the top and left sides of the bounding box. Note
     * that the upper-left corner of the image is the origin (0,0).
     * </p>
     * <p>
     * The <code>top</code> and <code>left</code> values returned are ratios of
     * the overall image size. For example, if the input image is 700x200
     * pixels, and the top-left coordinate of the bounding box is 350x50 pixels,
     * the API returns a <code>left</code> value of 0.5 (350/700) and a
     * <code>top</code> value of 0.25 (50/200).
     * </p>
     * <p>
     * The <code>width</code> and <code>height</code> values represent the
     * dimensions of the bounding box as a ratio of the overall image dimension.
     * For example, if the input image is 700x200 pixels, and the bounding box
     * width is 70 pixels, the width returned is 0.1.
     * </p>
     * <note>
     * <p>
     * The bounding box coordinates can have negative values. For example, if
     * Amazon Rekognition is able to detect a face that is at the image edge and
     * is only partially visible, the service can return coordinates that are
     * outside the image bounds and, depending on the image edge, you might get
     * negative values or values greater than 1 for the <code>left</code> or
     * <code>top</code> values.
     * </p>
     * </note>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Identifies the bounding box around the object or face. The
     * <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are
     * coordinates representing the top and left sides of the bounding box. Note
     * that the upper-left corner of the image is the origin (0,0).
     * </p>
     * <p>
     * The <code>top</code> and <code>left</code> values returned are ratios of
     * the overall image size. For example, if the input image is 700x200
     * pixels, and the top-left coordinate of the bounding box is 350x50 pixels,
     * the API returns a <code>left</code> value of 0.5 (350/700) and a
     * <code>top</code> value of 0.25 (50/200).
     * </p>
     * <p>
     * The <code>width</code> and <code>height</code> values represent the
     * dimensions of the bounding box as a ratio of the overall image dimension.
     * For example, if the input image is 700x200 pixels, and the bounding box
     * width is 70 pixels, the width returned is 0.1.
     * </p>
     * <note>
     * <p>
     * The bounding box coordinates can have negative values. For example, if
     * Amazon Rekognition is able to detect a face that is at the image edge and
     * is only partially visible, the service can return coordinates that are
     * outside the image bounds and, depending on the image edge, you might get
     * negative values or values greater than 1 for the <code>left</code> or
     * <code>top</code> values.
     * </p>
     * </note>
     *
     * @return <p>
     *         Identifies the bounding box around the object or face. The
     *         <code>left</code> (x-coordinate) and <code>top</code>
     *         (y-coordinate) are coordinates representing the top and left
     *         sides of the bounding box. Note that the upper-left corner of the
     *         image is the origin (0,0).
     *         </p>
     *         <p>
     *         The <code>top</code> and <code>left</code> values returned are
     *         ratios of the overall image size. For example, if the input image
     *         is 700x200 pixels, and the top-left coordinate of the bounding
     *         box is 350x50 pixels, the API returns a <code>left</code> value
     *         of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200).
     *         </p>
     *         <p>
     *         The <code>width</code> and <code>height</code> values represent
     *         the dimensions of the bounding box as a ratio of the overall
     *         image dimension. For example, if the input image is 700x200
     *         pixels, and the bounding box width is 70 pixels, the width
     *         returned is 0.1.
     *         </p>
     *         <note>
     *         <p>
     *         The bounding box coordinates can have negative values. For
     *         example, if Amazon Rekognition is able to detect a face that is
     *         at the image edge and is only partially visible, the service can
     *         return coordinates that are outside the image bounds and,
     *         depending on the image edge, you might get negative values or
     *         values greater than 1 for the <code>left</code> or
     *         <code>top</code> values.
     *         </p>
     *         </note>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * Identifies the bounding box around the object or face. The
     * <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are
     * coordinates representing the top and left sides of the bounding box. Note
     * that the upper-left corner of the image is the origin (0,0).
     * </p>
     * <p>
     * The <code>top</code> and <code>left</code> values returned are ratios of
     * the overall image size. For example, if the input image is 700x200
     * pixels, and the top-left coordinate of the bounding box is 350x50 pixels,
     * the API returns a <code>left</code> value of 0.5 (350/700) and a
     * <code>top</code> value of 0.25 (50/200).
     * </p>
     * <p>
     * The <code>width</code> and <code>height</code> values represent the
     * dimensions of the bounding box as a ratio of the overall image dimension.
     * For example, if the input image is 700x200 pixels, and the bounding box
     * width is 70 pixels, the width returned is 0.1.
     * </p>
     * <note>
     * <p>
     * The bounding box coordinates can have negative values. For example, if
     * Amazon Rekognition is able to detect a face that is at the image edge and
     * is only partially visible, the service can return coordinates that are
     * outside the image bounds and, depending on the image edge, you might get
     * negative values or values greater than 1 for the <code>left</code> or
     * <code>top</code> values.
     * </p>
     * </note>
     *
     * @param boundingBox <p>
     *            Identifies the bounding box around the object or face. The
     *            <code>left</code> (x-coordinate) and <code>top</code>
     *            (y-coordinate) are coordinates representing the top and left
     *            sides of the bounding box. Note that the upper-left corner of
     *            the image is the origin (0,0).
     *            </p>
     *            <p>
     *            The <code>top</code> and <code>left</code> values returned are
     *            ratios of the overall image size. For example, if the input
     *            image is 700x200 pixels, and the top-left coordinate of the
     *            bounding box is 350x50 pixels, the API returns a
     *            <code>left</code> value of 0.5 (350/700) and a
     *            <code>top</code> value of 0.25 (50/200).
     *            </p>
     *            <p>
     *            The <code>width</code> and <code>height</code> values
     *            represent the dimensions of the bounding box as a ratio of the
     *            overall image dimension. For example, if the input image is
     *            700x200 pixels, and the bounding box width is 70 pixels, the
     *            width returned is 0.1.
     *            </p>
     *            <note>
     *            <p>
     *            The bounding box coordinates can have negative values. For
     *            example, if Amazon Rekognition is able to detect a face that
     *            is at the image edge and is only partially visible, the
     *            service can return coordinates that are outside the image
     *            bounds and, depending on the image edge, you might get
     *            negative values or values greater than 1 for the
     *            <code>left</code> or <code>top</code> values.
     *            </p>
     *            </note>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Identifies the bounding box around the object or face. The
     * <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are
     * coordinates representing the top and left sides of the bounding box. Note
     * that the upper-left corner of the image is the origin (0,0).
     * </p>
     * <p>
     * The <code>top</code> and <code>left</code> values returned are ratios of
     * the overall image size. For example, if the input image is 700x200
     * pixels, and the top-left coordinate of the bounding box is 350x50 pixels,
     * the API returns a <code>left</code> value of 0.5 (350/700) and a
     * <code>top</code> value of 0.25 (50/200).
     * </p>
     * <p>
     * The <code>width</code> and <code>height</code> values represent the
     * dimensions of the bounding box as a ratio of the overall image dimension.
     * For example, if the input image is 700x200 pixels, and the bounding box
     * width is 70 pixels, the width returned is 0.1.
     * </p>
     * <note>
     * <p>
     * The bounding box coordinates can have negative values. For example, if
     * Amazon Rekognition is able to detect a face that is at the image edge and
     * is only partially visible, the service can return coordinates that are
     * outside the image bounds and, depending on the image edge, you might get
     * negative values or values greater than 1 for the <code>left</code> or
     * <code>top</code> values.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            Identifies the bounding box around the object or face. The
     *            <code>left</code> (x-coordinate) and <code>top</code>
     *            (y-coordinate) are coordinates representing the top and left
     *            sides of the bounding box. Note that the upper-left corner of
     *            the image is the origin (0,0).
     *            </p>
     *            <p>
     *            The <code>top</code> and <code>left</code> values returned are
     *            ratios of the overall image size. For example, if the input
     *            image is 700x200 pixels, and the top-left coordinate of the
     *            bounding box is 350x50 pixels, the API returns a
     *            <code>left</code> value of 0.5 (350/700) and a
     *            <code>top</code> value of 0.25 (50/200).
     *            </p>
     *            <p>
     *            The <code>width</code> and <code>height</code> values
     *            represent the dimensions of the bounding box as a ratio of the
     *            overall image dimension. For example, if the input image is
     *            700x200 pixels, and the bounding box width is 70 pixels, the
     *            width returned is 0.1.
     *            </p>
     *            <note>
     *            <p>
     *            The bounding box coordinates can have negative values. For
     *            example, if Amazon Rekognition is able to detect a face that
     *            is at the image edge and is only partially visible, the
     *            service can return coordinates that are outside the image
     *            bounds and, depending on the image edge, you might get
     *            negative values or values greater than 1 for the
     *            <code>left</code> or <code>top</code> values.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Level of confidence that what the bounding box contains is a
     *         face.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence that what the bounding box contains is a
     *            face.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence that what the bounding box contains is a
     *            face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withConfidence(Float confidence) {
        this.confidence = confidence;
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
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComparedFace == false)
            return false;
        ComparedFace other = (ComparedFace) obj;

        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
