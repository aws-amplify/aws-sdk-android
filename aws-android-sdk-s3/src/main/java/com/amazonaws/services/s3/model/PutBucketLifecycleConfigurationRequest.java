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
 * Creates a new lifecycle configuration for the bucket or replaces an existing
 * lifecycle configuration. For information about lifecycle configuration, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <note>
 * <p>
 * Bucket lifecycle configuration now supports specifying a lifecycle rule using
 * an object key name prefix, one or more object tags, or a combination of both.
 * Accordingly, this section describes the latest API. The previous version of
 * the API supported filtering based only on an object key name prefix, which is
 * supported for backward compatibility. For the related API description, see
 * <a>PutBucketLifecycle</a>.
 * </p>
 * </note>
 * <p>
 * <b>Rules</b>
 * </p>
 * <p>
 * You specify the lifecycle configuration in your request body. The lifecycle
 * configuration is specified as XML consisting of one or more rules. Each rule
 * consists of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Filter identifying a subset of objects to which the rule applies. The filter
 * can be based on a key name prefix, object tags, or a combination of both.
 * </p>
 * </li>
 * <li>
 * <p>
 * Status whether the rule is in effect.
 * </p>
 * </li>
 * <li>
 * <p>
 * One or more lifecycle transition and expiration actions that you want Amazon
 * S3 to perform on the objects identified by the filter. If the state of your
 * bucket is versioning-enabled or versioning-suspended, you can have many
 * versions of the same object (one current version and zero or more noncurrent
 * versions). Amazon S3 provides predefined actions that you can specify for
 * current and noncurrent object versions.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"
 * >Object Lifecycle Management</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html"
 * >Lifecycle Configuration Elements</a>.
 * </p>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * By default, all Amazon S3 resources are private, including buckets, objects,
 * and related subresources (for example, lifecycle configuration and website
 * configuration). Only the resource owner (that is, the AWS account that
 * created it) can access the resource. The resource owner can optionally grant
 * access permissions to others by writing an access policy. For this operation,
 * a user must get the s3:PutLifecycleConfiguration permission.
 * </p>
 * <p>
 * You can also explicitly deny permissions. Explicit deny also supersedes any
 * other permissions. If you want to block users or accounts from removing or
 * deleting objects from your bucket, you must deny them permissions for the
 * following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * s3:DeleteObject
 * </p>
 * </li>
 * <li>
 * <p>
 * s3:DeleteObjectVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * s3:PutLifecycleConfiguration
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * The following are related to <code>PutBucketLifecycleConfiguration</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-configuration-examples.html"
 * >Examples of Lifecycle Configuration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetBucketLifecycleConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketLifecycle</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketLifecycleConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     */
    private BucketLifecycleConfiguration lifecycleConfiguration;

    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     *
     * @return <p>
     *         The name of the bucket for which to set the configuration.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket for which to set the configuration.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to set the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket for which to set the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLifecycleConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     *
     * @return <p>
     *         Container for lifecycle rules. You can add as many as 1,000
     *         rules.
     *         </p>
     */
    public BucketLifecycleConfiguration getLifecycleConfiguration() {
        return lifecycleConfiguration;
    }

    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     *
     * @param lifecycleConfiguration <p>
     *            Container for lifecycle rules. You can add as many as 1,000
     *            rules.
     *            </p>
     */
    public void setLifecycleConfiguration(BucketLifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    /**
     * <p>
     * Container for lifecycle rules. You can add as many as 1,000 rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleConfiguration <p>
     *            Container for lifecycle rules. You can add as many as 1,000
     *            rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketLifecycleConfigurationRequest withLifecycleConfiguration(
            BucketLifecycleConfiguration lifecycleConfiguration) {
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

        if (obj instanceof PutBucketLifecycleConfigurationRequest == false)
            return false;
        PutBucketLifecycleConfigurationRequest other = (PutBucketLifecycleConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getLifecycleConfiguration() == null ^ this.getLifecycleConfiguration() == null)
            return false;
        if (other.getLifecycleConfiguration() != null
                && other.getLifecycleConfiguration().equals(this.getLifecycleConfiguration()) == false)
            return false;
        return true;
    }
}
