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
 * An image that is picked from the Face Liveness video and returned for audit
 * trail purposes, returned as Base64-encoded bytes.
 * </p>
 */
public class AuditImage implements Serializable {
    /**
     * <p>
     * The Base64-encoded bytes representing an image selected from the Face
     * Liveness video and returned for audit purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     */
    private java.nio.ByteBuffer bytes;

    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * Identifies the bounding box around the label, face, text, object of
     * interest, or personal protective equipment. The <code>left</code>
     * (x-coordinate) and <code>top</code> (y-coordinate) are coordinates
     * representing the top and left sides of the bounding box. Note that the
     * upper-left corner of the image is the origin (0,0).
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
     * The Base64-encoded bytes representing an image selected from the Face
     * Liveness video and returned for audit purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @return <p>
     *         The Base64-encoded bytes representing an image selected from the
     *         Face Liveness video and returned for audit purposes.
     *         </p>
     */
    public java.nio.ByteBuffer getBytes() {
        return bytes;
    }

    /**
     * <p>
     * The Base64-encoded bytes representing an image selected from the Face
     * Liveness video and returned for audit purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param bytes <p>
     *            The Base64-encoded bytes representing an image selected from
     *            the Face Liveness video and returned for audit purposes.
     *            </p>
     */
    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * The Base64-encoded bytes representing an image selected from the Face
     * Liveness video and returned for audit purposes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 204800<br/>
     *
     * @param bytes <p>
     *            The Base64-encoded bytes representing an image selected from
     *            the Face Liveness video and returned for audit purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditImage withBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     *
     * @return <p>
     *         Provides the S3 bucket name and object name.
     *         </p>
     *         <p>
     *         The region for the S3 bucket containing the S3 object must match
     *         the region you use for Amazon Rekognition operations.
     *         </p>
     *         <p>
     *         For Amazon Rekognition to process an S3 object, the user must
     *         have permission to access the S3 object. For more information,
     *         see How Amazon Rekognition works with IAM in the Amazon
     *         Rekognition Developer Guide.
     *         </p>
     */
    public S3Object getS3Object() {
        return s3Object;
    }

    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     *
     * @param s3Object <p>
     *            Provides the S3 bucket name and object name.
     *            </p>
     *            <p>
     *            The region for the S3 bucket containing the S3 object must
     *            match the region you use for Amazon Rekognition operations.
     *            </p>
     *            <p>
     *            For Amazon Rekognition to process an S3 object, the user must
     *            have permission to access the S3 object. For more information,
     *            see How Amazon Rekognition works with IAM in the Amazon
     *            Rekognition Developer Guide.
     *            </p>
     */
    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Object <p>
     *            Provides the S3 bucket name and object name.
     *            </p>
     *            <p>
     *            The region for the S3 bucket containing the S3 object must
     *            match the region you use for Amazon Rekognition operations.
     *            </p>
     *            <p>
     *            For Amazon Rekognition to process an S3 object, the user must
     *            have permission to access the S3 object. For more information,
     *            see How Amazon Rekognition works with IAM in the Amazon
     *            Rekognition Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditImage withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
        return this;
    }

    /**
     * <p>
     * Identifies the bounding box around the label, face, text, object of
     * interest, or personal protective equipment. The <code>left</code>
     * (x-coordinate) and <code>top</code> (y-coordinate) are coordinates
     * representing the top and left sides of the bounding box. Note that the
     * upper-left corner of the image is the origin (0,0).
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
     *         Identifies the bounding box around the label, face, text, object
     *         of interest, or personal protective equipment. The
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
     * Identifies the bounding box around the label, face, text, object of
     * interest, or personal protective equipment. The <code>left</code>
     * (x-coordinate) and <code>top</code> (y-coordinate) are coordinates
     * representing the top and left sides of the bounding box. Note that the
     * upper-left corner of the image is the origin (0,0).
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
     *            Identifies the bounding box around the label, face, text,
     *            object of interest, or personal protective equipment. The
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
     * Identifies the bounding box around the label, face, text, object of
     * interest, or personal protective equipment. The <code>left</code>
     * (x-coordinate) and <code>top</code> (y-coordinate) are coordinates
     * representing the top and left sides of the bounding box. Note that the
     * upper-left corner of the image is the origin (0,0).
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
     *            Identifies the bounding box around the label, face, text,
     *            object of interest, or personal protective equipment. The
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
    public AuditImage withBoundingBox(BoundingBox boundingBox) {
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
        if (getBytes() != null)
            sb.append("Bytes: " + getBytes() + ",");
        if (getS3Object() != null)
            sb.append("S3Object: " + getS3Object() + ",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
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

        if (obj instanceof AuditImage == false)
            return false;
        AuditImage other = (AuditImage) obj;

        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        return true;
    }
}
