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
 * <important>
 * <p>
 * For an updated version of this API, see
 * <a>PutBucketLifecycleConfiguration</a>. This version has been deprecated.
 * Existing lifecycle configurations will work. For new lifecycle
 * configurations, use the updated API.
 * </p>
 * </important>
 * <p>
 * Creates a new lifecycle configuration for the bucket or replaces an existing
 * lifecycle configuration. For information about lifecycle configuration, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"
 * >Object Lifecycle Management</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * By default, all Amazon S3 resources, including buckets, objects, and related
 * subresources (for example, lifecycle configuration and website configuration)
 * are private. Only the resource owner, the AWS account that created the
 * resource, can access it. The resource owner can optionally grant access
 * permissions to others by writing an access policy. For this operation, users
 * must get the <code>s3:PutLifecycleConfiguration</code> permission.
 * </p>
 * <p>
 * You can also explicitly deny permissions. Explicit denial also supersedes any
 * other permissions. If you want to prevent users or accounts from removing or
 * deleting objects from your bucket, you must deny them permissions for the
 * following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>s3:DeleteObject</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>s3:DeleteObjectVersion</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>s3:PutLifecycleConfiguration</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to your Amazon S3 Resources</a> in the <i>Amazon
 * Simple Storage Service Developer Guide</i>.
 * </p>
 * <p>
 * For more examples of transitioning objects to storage classes such as
 * STANDARD_IA or ONEZONE_IA, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#lifecycle-configuration-examples"
 * >Examples of Lifecycle Configuration</a>.
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketLifecycle</a>(Deprecated)
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * By default, a resource owner—in this case, a bucket owner, which is the AWS
 * account that created the bucket—can perform any of the operations. A resource
 * owner can also grant others permission to perform the operation. For more
 * information, see the following topics in the Amazon Simple Storage Service
 * Developer Guide:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html"
 * >Specifying Permissions in a Policy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to your Amazon S3 Resources</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
public class PutBucketLifecycleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p/>
     */
    private String bucket;

    /**
     * <p/>
     */
    private String contentMD5;

    /**
     * <p/>
     */
    private LifecycleConfiguration lifecycleConfiguration;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p/>
     *
     * @param bucket <p/>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLifecycleRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p/>
     *
     * @param contentMD5 <p/>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLifecycleRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public LifecycleConfiguration getLifecycleConfiguration() {
        return lifecycleConfiguration;
    }

    /**
     * <p/>
     *
     * @param lifecycleConfiguration <p/>
     */
    public void setLifecycleConfiguration(LifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleConfiguration <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLifecycleRequest withLifecycleConfiguration(
            LifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
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
        if (getLifecycleConfiguration() != null)
            sb.append("LifecycleConfiguration: " + getLifecycleConfiguration());
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
                + ((getLifecycleConfiguration() == null) ? 0 : getLifecycleConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketLifecycleRequest == false)
            return false;
        PutBucketLifecycleRequest other = (PutBucketLifecycleRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        if (other.getLifecycleConfiguration() == null ^ this.getLifecycleConfiguration() == null)
            return false;
        if (other.getLifecycleConfiguration() != null
                && other.getLifecycleConfiguration().equals(this.getLifecycleConfiguration()) == false)
            return false;
        return true;
    }
}
