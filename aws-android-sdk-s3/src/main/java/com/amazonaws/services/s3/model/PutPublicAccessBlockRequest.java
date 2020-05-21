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
 * Creates or modifies the <code>PublicAccessBlock</code> configuration for an
 * Amazon S3 bucket. To use this operation, you must have the
 * <code>s3:PutBucketPublicAccessBlock</code> permission. For more information
 * about Amazon S3 permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html"
 * >Specifying Permissions in a Policy</a>.
 * </p>
 * <important>
 * <p>
 * When Amazon S3 evaluates the <code>PublicAccessBlock</code> configuration for
 * a bucket or an object, it checks the <code>PublicAccessBlock</code>
 * configuration for both the bucket (or the bucket that contains the object)
 * and the bucket owner's account. If the <code>PublicAccessBlock</code>
 * configurations are different between the bucket and the account, Amazon S3
 * uses the most restrictive combination of the bucket-level and account-level
 * settings.
 * </p>
 * </important>
 * <p>
 * For more information about when Amazon S3 considers a bucket or an object
 * public, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
 * >The Meaning of "Public"</a>.
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetPublicAccessBlock</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePublicAccessBlock</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketPolicyStatus</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"
 * >Using Amazon S3 Block Public Access</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutPublicAccessBlockRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon S3 bucket whose <code>PublicAccessBlock</code>
     * configuration you want to set.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * The <code>PublicAccessBlock</code> configuration that you want to apply
     * to this Amazon S3 bucket. You can enable the configuration options in any
     * combination. For more information about when Amazon S3 considers a bucket
     * or object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    /**
     * <p>
     * The name of the Amazon S3 bucket whose <code>PublicAccessBlock</code>
     * configuration you want to set.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket whose
     *         <code>PublicAccessBlock</code> configuration you want to set.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket whose <code>PublicAccessBlock</code>
     * configuration you want to set.
     * </p>
     *
     * @param bucket <p>
     *            The name of the Amazon S3 bucket whose
     *            <code>PublicAccessBlock</code> configuration you want to set.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket whose <code>PublicAccessBlock</code>
     * configuration you want to set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the Amazon S3 bucket whose
     *            <code>PublicAccessBlock</code> configuration you want to set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPublicAccessBlockRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     *
     * @return <p>
     *         The MD5 hash of the <code>PutPublicAccessBlock</code> request
     *         body.
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the <code>PutPublicAccessBlock</code> request
     *            body.
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The MD5 hash of the <code>PutPublicAccessBlock</code> request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The MD5 hash of the <code>PutPublicAccessBlock</code> request
     *            body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPublicAccessBlockRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p>
     * The <code>PublicAccessBlock</code> configuration that you want to apply
     * to this Amazon S3 bucket. You can enable the configuration options in any
     * combination. For more information about when Amazon S3 considers a bucket
     * or object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The <code>PublicAccessBlock</code> configuration that you want to
     *         apply to this Amazon S3 bucket. You can enable the configuration
     *         options in any combination. For more information about when
     *         Amazon S3 considers a bucket or object public, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     *         >The Meaning of "Public"</a> in the <i>Amazon Simple Storage
     *         Service Developer Guide</i>.
     *         </p>
     */
    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * The <code>PublicAccessBlock</code> configuration that you want to apply
     * to this Amazon S3 bucket. You can enable the configuration options in any
     * combination. For more information about when Amazon S3 considers a bucket
     * or object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param publicAccessBlockConfiguration <p>
     *            The <code>PublicAccessBlock</code> configuration that you want
     *            to apply to this Amazon S3 bucket. You can enable the
     *            configuration options in any combination. For more information
     *            about when Amazon S3 considers a bucket or object public, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     *            >The Meaning of "Public"</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setPublicAccessBlockConfiguration(
            PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * The <code>PublicAccessBlock</code> configuration that you want to apply
     * to this Amazon S3 bucket. You can enable the configuration options in any
     * combination. For more information about when Amazon S3 considers a bucket
     * or object public, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     * >The Meaning of "Public"</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicAccessBlockConfiguration <p>
     *            The <code>PublicAccessBlock</code> configuration that you want
     *            to apply to this Amazon S3 bucket. You can enable the
     *            configuration options in any combination. For more information
     *            about when Amazon S3 considers a bucket or object public, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status"
     *            >The Meaning of "Public"</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPublicAccessBlockRequest withPublicAccessBlockConfiguration(
            PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
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
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: " + getPublicAccessBlockConfiguration());
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
                + ((getPublicAccessBlockConfiguration() == null) ? 0
                        : getPublicAccessBlockConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPublicAccessBlockRequest == false)
            return false;
        PutPublicAccessBlockRequest other = (PutPublicAccessBlockRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getPublicAccessBlockConfiguration() == null
                ^ this.getPublicAccessBlockConfiguration() == null)
            return false;
        if (other.getPublicAccessBlockConfiguration() != null
                && other.getPublicAccessBlockConfiguration().equals(
                        this.getPublicAccessBlockConfiguration()) == false)
            return false;
        return true;
    }
}
