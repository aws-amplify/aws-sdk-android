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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the default encryption configuration for an Amazon S3 bucket. For
 * information about the Amazon S3 default encryption feature, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
 * >Amazon S3 Default Bucket Encryption</a>.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * <code>s3:GetEncryptionConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * The following operations are related to <code>GetBucketEncryption</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutBucketEncryption</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketEncryption</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketEncryptionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket from which the server-side encryption
     * configuration is retrieved.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the bucket from which the server-side encryption
     * configuration is retrieved.
     * </p>
     *
     * @return <p>
     *         The name of the bucket from which the server-side encryption
     *         configuration is retrieved.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket from which the server-side encryption
     * configuration is retrieved.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket from which the server-side encryption
     *            configuration is retrieved.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket from which the server-side encryption
     * configuration is retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket from which the server-side encryption
     *            configuration is retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketEncryptionRequest withBucket(String bucket) {
        this.bucket = bucket;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketEncryptionRequest == false)
            return false;
        GetBucketEncryptionRequest other = (GetBucketEncryptionRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
