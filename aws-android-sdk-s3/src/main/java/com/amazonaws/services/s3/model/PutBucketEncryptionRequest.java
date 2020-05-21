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
 * This implementation of the <code>PUT</code> operation uses the
 * <code>encryption</code> subresource to set the default encryption state of an
 * existing bucket.
 * </p>
 * <p>
 * This implementation of the <code>PUT</code> operation sets default encryption
 * for a bucket using server-side encryption with Amazon S3-managed keys SSE-S3
 * or AWS KMS customer master keys (CMKs) (SSE-KMS). For information about the
 * Amazon S3 default encryption feature, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
 * >Amazon S3 Default Bucket Encryption</a>.
 * </p>
 * <important>
 * <p>
 * This operation requires AWS Signature Version 4. For more information, see <a
 * href="sig-v4-authenticating-requests.html"> Authenticating Requests (AWS
 * Signature Version 4)</a>.
 * </p>
 * </important>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:PutEncryptionConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a> in the Amazon
 * Simple Storage Service Developer Guide.
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketEncryption</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketEncryption</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketEncryptionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies default encryption for a bucket using server-side encryption
     * with Amazon S3-managed keys (SSE-S3) or customer master keys stored in
     * AWS KMS (SSE-KMS). For information about the Amazon S3 default encryption
     * feature, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
     * >Amazon S3 Default Bucket Encryption</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the server-side encryption
     * configuration. This parameter is auto-populated when using the command
     * from the CLI.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * <p>
     * Specifies default encryption for a bucket using server-side encryption
     * with Amazon S3-managed keys (SSE-S3) or customer master keys stored in
     * AWS KMS (SSE-KMS). For information about the Amazon S3 default encryption
     * feature, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
     * >Amazon S3 Default Bucket Encryption</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies default encryption for a bucket using server-side
     *         encryption with Amazon S3-managed keys (SSE-S3) or customer
     *         master keys stored in AWS KMS (SSE-KMS). For information about
     *         the Amazon S3 default encryption feature, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
     *         >Amazon S3 Default Bucket Encryption</a> in the <i>Amazon Simple
     *         Storage Service Developer Guide</i>.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Specifies default encryption for a bucket using server-side encryption
     * with Amazon S3-managed keys (SSE-S3) or customer master keys stored in
     * AWS KMS (SSE-KMS). For information about the Amazon S3 default encryption
     * feature, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
     * >Amazon S3 Default Bucket Encryption</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     *
     * @param bucket <p>
     *            Specifies default encryption for a bucket using server-side
     *            encryption with Amazon S3-managed keys (SSE-S3) or customer
     *            master keys stored in AWS KMS (SSE-KMS). For information about
     *            the Amazon S3 default encryption feature, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
     *            >Amazon S3 Default Bucket Encryption</a> in the <i>Amazon
     *            Simple Storage Service Developer Guide</i>.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Specifies default encryption for a bucket using server-side encryption
     * with Amazon S3-managed keys (SSE-S3) or customer master keys stored in
     * AWS KMS (SSE-KMS). For information about the Amazon S3 default encryption
     * feature, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
     * >Amazon S3 Default Bucket Encryption</a> in the <i>Amazon Simple Storage
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Specifies default encryption for a bucket using server-side
     *            encryption with Amazon S3-managed keys (SSE-S3) or customer
     *            master keys stored in AWS KMS (SSE-KMS). For information about
     *            the Amazon S3 default encryption feature, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html"
     *            >Amazon S3 Default Bucket Encryption</a> in the <i>Amazon
     *            Simple Storage Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketEncryptionRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the server-side encryption
     * configuration. This parameter is auto-populated when using the command
     * from the CLI.
     * </p>
     *
     * @return <p>
     *         The base64-encoded 128-bit MD5 digest of the server-side
     *         encryption configuration. This parameter is auto-populated when
     *         using the command from the CLI.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the server-side encryption
     * configuration. This parameter is auto-populated when using the command
     * from the CLI.
     * </p>
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the server-side
     *            encryption configuration. This parameter is auto-populated
     *            when using the command from the CLI.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the server-side encryption
     * configuration. This parameter is auto-populated when using the command
     * from the CLI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the server-side
     *            encryption configuration. This parameter is auto-populated
     *            when using the command from the CLI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketEncryptionRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     *
     * @return <p>
     *         Specifies the default server-side-encryption configuration.
     *         </p>
     */
    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     *
     * @param serverSideEncryptionConfiguration <p>
     *            Specifies the default server-side-encryption configuration.
     *            </p>
     */
    public void setServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryptionConfiguration <p>
     *            Specifies the default server-side-encryption configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketEncryptionRequest withServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
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
            sb.append("Bucket: " + getBucket() + ",");
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5() + ",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: "
                    + getServerSideEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerSideEncryptionConfiguration() == null) ? 0
                        : getServerSideEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketEncryptionRequest == false)
            return false;
        PutBucketEncryptionRequest other = (PutBucketEncryptionRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null
                ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(
                        this.getServerSideEncryptionConfiguration()) == false)
            return false;
        return true;
    }
}
