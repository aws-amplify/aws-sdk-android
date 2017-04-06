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
 * Describes the face properties such as the bounding box, face ID, image ID of
 * the source image, and external image ID that you assigned.
 * </p>
 */
public class Face implements Serializable {
    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String faceId;

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
     * Unique identifier that Amazon Rekognition assigns to the source image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String imageId;

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String externalImageId;

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         Unique identifier that Amazon Rekognition assigns to the face.
     *         </p>
     */
    public String getFaceId() {
        return faceId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            Unique identifier that Amazon Rekognition assigns to the face.
     *            </p>
     */
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            Unique identifier that Amazon Rekognition assigns to the face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
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
    public Face withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the source image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         Unique identifier that Amazon Rekognition assigns to the source
     *         image.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the source image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param imageId <p>
     *            Unique identifier that Amazon Rekognition assigns to the
     *            source image.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the source image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param imageId <p>
     *            Unique identifier that Amazon Rekognition assigns to the
     *            source image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         Identifier that you assign to all the faces in the input image.
     *         </p>
     */
    public String getExternalImageId() {
        return externalImageId;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param externalImageId <p>
     *            Identifier that you assign to all the faces in the input
     *            image.
     *            </p>
     */
    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param externalImageId <p>
     *            Identifier that you assign to all the faces in the input
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
        return this;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Confidence level that the bounding box contains a face (and not a
     *         different object such as a tree).
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Confidence level that the bounding box contains a face (and
     *            not a different object such as a tree).
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Confidence level that the bounding box contains a face (and
     *            not a different object such as a tree).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withConfidence(Float confidence) {
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
        if (getFaceId() != null)
            sb.append("FaceId: " + getFaceId() + ",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getExternalImageId() != null)
            sb.append("ExternalImageId: " + getExternalImageId() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getExternalImageId() == null) ? 0 : getExternalImageId().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Face == false)
            return false;
        Face other = (Face) obj;

        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getExternalImageId() == null ^ this.getExternalImageId() == null)
            return false;
        if (other.getExternalImageId() != null
                && other.getExternalImageId().equals(this.getExternalImageId()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
