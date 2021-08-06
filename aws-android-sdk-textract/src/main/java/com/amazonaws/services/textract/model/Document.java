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
 * The input document, either as bytes or as an S3 object.
 * </p>
 * <p>
 * You pass image bytes to an Amazon Textract API operation by using the
 * <code>Bytes</code> property. For example, you would use the
 * <code>Bytes</code> property to pass a document loaded from a local file
 * system. Image bytes passed by using the <code>Bytes</code> property must be
 * base64 encoded. Your code might not need to encode document file bytes if
 * you're using an AWS SDK to call Amazon Textract API operations.
 * </p>
 * <p>
 * You pass images stored in an S3 bucket to an Amazon Textract API operation by
 * using the <code>S3Object</code> property. Documents stored in an S3 bucket
 * don't need to be base64 encoded.
 * </p>
 * <p>
 * The AWS Region for the S3 bucket that contains the S3 object must match the
 * AWS Region that you use for Amazon Textract operations.
 * </p>
 * <p>
 * If you use the AWS CLI to call Amazon Textract operations, passing image
 * bytes using the Bytes property isn't supported. You must first upload the
 * document to an Amazon S3 bucket, and then call the operation using the
 * S3Object property.
 * </p>
 * <p>
 * For Amazon Textract to process an S3 object, the user must have permission to
 * access the S3 object.
 * </p>
 */
public class Document implements Serializable {
    /**
     * <p>
     * A blob of base64-encoded document bytes. The maximum size of a document
     * that's provided in a blob of bytes is 5 MB. The document bytes must be in
     * PNG or JPEG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes passed using the <code>Bytes</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10485760<br/>
     */
    private java.nio.ByteBuffer bytes;

    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a
     * document that's stored in an S3 bucket is 5 MB.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * A blob of base64-encoded document bytes. The maximum size of a document
     * that's provided in a blob of bytes is 5 MB. The document bytes must be in
     * PNG or JPEG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes passed using the <code>Bytes</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10485760<br/>
     *
     * @return <p>
     *         A blob of base64-encoded document bytes. The maximum size of a
     *         document that's provided in a blob of bytes is 5 MB. The document
     *         bytes must be in PNG or JPEG format.
     *         </p>
     *         <p>
     *         If you're using an AWS SDK to call Amazon Textract, you might not
     *         need to base64-encode image bytes passed using the
     *         <code>Bytes</code> field.
     *         </p>
     */
    public java.nio.ByteBuffer getBytes() {
        return bytes;
    }

    /**
     * <p>
     * A blob of base64-encoded document bytes. The maximum size of a document
     * that's provided in a blob of bytes is 5 MB. The document bytes must be in
     * PNG or JPEG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes passed using the <code>Bytes</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10485760<br/>
     *
     * @param bytes <p>
     *            A blob of base64-encoded document bytes. The maximum size of a
     *            document that's provided in a blob of bytes is 5 MB. The
     *            document bytes must be in PNG or JPEG format.
     *            </p>
     *            <p>
     *            If you're using an AWS SDK to call Amazon Textract, you might
     *            not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field.
     *            </p>
     */
    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * A blob of base64-encoded document bytes. The maximum size of a document
     * that's provided in a blob of bytes is 5 MB. The document bytes must be in
     * PNG or JPEG format.
     * </p>
     * <p>
     * If you're using an AWS SDK to call Amazon Textract, you might not need to
     * base64-encode image bytes passed using the <code>Bytes</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10485760<br/>
     *
     * @param bytes <p>
     *            A blob of base64-encoded document bytes. The maximum size of a
     *            document that's provided in a blob of bytes is 5 MB. The
     *            document bytes must be in PNG or JPEG format.
     *            </p>
     *            <p>
     *            If you're using an AWS SDK to call Amazon Textract, you might
     *            not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a
     * document that's stored in an S3 bucket is 5 MB.
     * </p>
     *
     * @return <p>
     *         Identifies an S3 object as the document source. The maximum size
     *         of a document that's stored in an S3 bucket is 5 MB.
     *         </p>
     */
    public S3Object getS3Object() {
        return s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a
     * document that's stored in an S3 bucket is 5 MB.
     * </p>
     *
     * @param s3Object <p>
     *            Identifies an S3 object as the document source. The maximum
     *            size of a document that's stored in an S3 bucket is 5 MB.
     *            </p>
     */
    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a
     * document that's stored in an S3 bucket is 5 MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Object <p>
     *            Identifies an S3 object as the document source. The maximum
     *            size of a document that's stored in an S3 bucket is 5 MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Document withS3Object(S3Object s3Object) {
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

        if (obj instanceof Document == false)
            return false;
        Document other = (Document) obj;

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
