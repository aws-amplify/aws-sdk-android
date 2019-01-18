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
 * Provides the input image either as bytes or an S3 object.
 * </p>
 * <p>
 * You pass image bytes to a Rekognition API operation by using the
 * <code>Bytes</code> property. For example, you would use the
 * <code>Bytes</code> property to pass an image loaded from a local file system.
 * Image bytes passed by using the <code>Bytes</code> property must be
 * base64-encoded. Your code may not need to encode image bytes if you are using
 * an AWS SDK to call Rekognition API operations.
 * </p>
 * <p>
 * For more information, see Analyzing an Image Loaded from a Local File System
 * in the Amazon Rekognition Developer Guide.
 * </p>
 * <p>
 * You pass images stored in an S3 bucket to a Rekognition API operation by
 * using the <code>S3Object</code> property. Images stored in an S3 bucket do
 * not need to be base64-encoded.
 * </p>
 * <p>
 * The region for the S3 bucket containing the S3 object must match the region
 * you use for Amazon Rekognition operations.
 * </p>
 * <p>
 * If you use the Amazon CLI to call Amazon Rekognition operations, passing
 * image bytes using the Bytes property is not supported. You must first upload
 * the image to an Amazon S3 bucket and then call the operation using the
 * S3Object property.
 * </p>
 * <p>
 * For Amazon Rekognition to process an S3 object, the user must have permission
 * to access the S3 object. For more information, see Resource Based Policies in
 * the Amazon Rekognition Developer Guide.
 * </p>
 */
public class Image implements Serializable {
    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     */
    private java.nio.ByteBuffer bytes;

    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     *
     * @return <p>
     *         Blob of image bytes up to 5 MBs.
     *         </p>
     */
    public java.nio.ByteBuffer getBytes() {
        return bytes;
    }

    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     *
     * @param bytes <p>
     *            Blob of image bytes up to 5 MBs.
     *            </p>
     */
    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     *
     * @param bytes <p>
     *            Blob of image bytes up to 5 MBs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     *
     * @return <p>
     *         Identifies an S3 object as the image source.
     *         </p>
     */
    public S3Object getS3Object() {
        return s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     *
     * @param s3Object <p>
     *            Identifies an S3 object as the image source.
     *            </p>
     */
    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Object <p>
     *            Identifies an S3 object as the image source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
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
            sb.append("S3Object: " + getS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;

        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        return true;
    }
}
