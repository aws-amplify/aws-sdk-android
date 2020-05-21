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
 * Sets an analytics configuration for the bucket (specified by the analytics
 * configuration ID). You can have up to 1,000 analytics configurations per
 * bucket.
 * </p>
 * <p>
 * You can choose to have storage class analysis export analysis reports sent to
 * a comma-separated values (CSV) flat file. See the <code>DataExport</code>
 * request element. Reports are updated daily and are based on the object
 * filters that you configure. When selecting data export, you specify a
 * destination bucket and an optional destination prefix where the file is
 * written. You can export the data to a destination bucket in a different
 * account. However, the destination bucket must be in the same Region as the
 * bucket that you are making the PUT analytics configuration to. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html"
 * >Amazon S3 Analytics – Storage Class Analysis</a>.
 * </p>
 * <important>
 * <p>
 * You must create a bucket policy on the destination bucket where the exported
 * file is written to grant permissions to Amazon S3 to write objects to the
 * bucket. For an example policy, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html#example-bucket-policies-use-case-9"
 * >Granting Permissions for Amazon S3 Inventory and Storage Class Analysis</a>.
 * </p>
 * </important>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:PutAnalyticsConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p class="title">
 * <b>Special Errors</b>
 * </p>
 * <ul>
 * <li>
 * <ul>
 * <li>
 * <p>
 * <i>HTTP Error: HTTP 400 Bad Request</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Code: InvalidArgument</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: Invalid argument.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <ul>
 * <li>
 * <p>
 * <i>HTTP Error: HTTP 400 Bad Request</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Code: TooManyConfigurations</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: You are attempting to create a new configuration but have already
 * reached the 1,000-configuration limit.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <ul>
 * <li>
 * <p>
 * <i>HTTP Error: HTTP 403 Forbidden</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Code: AccessDenied</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Cause: You are not the owner of the specified bucket, or you do not have
 * the s3:PutAnalyticsConfiguration bucket permission to set the configuration
 * on the bucket.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * </p></li>
 * </ul>
 */
public class PutBucketAnalyticsConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket to which an analytics configuration is stored.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     */
    private AnalyticsConfiguration analyticsConfiguration;

    /**
     * <p>
     * The name of the bucket to which an analytics configuration is stored.
     * </p>
     *
     * @return <p>
     *         The name of the bucket to which an analytics configuration is
     *         stored.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket to which an analytics configuration is stored.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket to which an analytics configuration is
     *            stored.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket to which an analytics configuration is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket to which an analytics configuration is
     *            stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketAnalyticsConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     *
     * @return <p>
     *         The ID that identifies the analytics configuration.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     *
     * @param id <p>
     *            The ID that identifies the analytics configuration.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID that identifies the analytics configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketAnalyticsConfigurationRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     *
     * @return <p>
     *         The configuration and any analyses for the analytics filter.
     *         </p>
     */
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return analyticsConfiguration;
    }

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     *
     * @param analyticsConfiguration <p>
     *            The configuration and any analyses for the analytics filter.
     *            </p>
     */
    public void setAnalyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsConfiguration <p>
     *            The configuration and any analyses for the analytics filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketAnalyticsConfigurationRequest withAnalyticsConfiguration(
            AnalyticsConfiguration analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getAnalyticsConfiguration() != null)
            sb.append("AnalyticsConfiguration: " + getAnalyticsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnalyticsConfiguration() == null) ? 0 : getAnalyticsConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketAnalyticsConfigurationRequest == false)
            return false;
        PutBucketAnalyticsConfigurationRequest other = (PutBucketAnalyticsConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAnalyticsConfiguration() == null ^ this.getAnalyticsConfiguration() == null)
            return false;
        if (other.getAnalyticsConfiguration() != null
                && other.getAnalyticsConfiguration().equals(this.getAnalyticsConfiguration()) == false)
            return false;
        return true;
    }
}
