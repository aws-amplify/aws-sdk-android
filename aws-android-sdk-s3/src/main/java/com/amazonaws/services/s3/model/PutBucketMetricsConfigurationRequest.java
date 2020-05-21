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
 * Sets a metrics configuration (specified by the metrics configuration ID) for
 * the bucket. You can have up to 1,000 metrics configurations per bucket. If
 * you're updating an existing metrics configuration, note that this is a full
 * replacement of the existing metrics configuration. If you don't include the
 * elements you want to keep, they are erased.
 * </p>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:PutMetricsConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * For information about CloudWatch request metrics for Amazon S3, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/cloudwatch-monitoring.html"
 * >Monitoring Metrics with Amazon CloudWatch</a>.
 * </p>
 * <p>
 * The following operations are related to
 * <code>PutBucketMetricsConfiguration</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteBucketMetricsConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutBucketMetricsConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBucketMetricsConfigurations</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <code>GetBucketLifecycle</code> has the following special error:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Error code: <code>TooManyConfigurations</code>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description: You are attempting to create a new configuration but have
 * already reached the 1,000-configuration limit.
 * </p>
 * </li>
 * <li>
 * <p>
 * HTTP Status Code: HTTP 400 Bad Request
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
public class PutBucketMetricsConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket for which the metrics configuration is set.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     */
    private MetricsConfiguration metricsConfiguration;

    /**
     * <p>
     * The name of the bucket for which the metrics configuration is set.
     * </p>
     *
     * @return <p>
     *         The name of the bucket for which the metrics configuration is
     *         set.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket for which the metrics configuration is set.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket for which the metrics configuration is
     *            set.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket for which the metrics configuration is set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket for which the metrics configuration is
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketMetricsConfigurationRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     *
     * @return <p>
     *         The ID used to identify the metrics configuration.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     *
     * @param id <p>
     *            The ID used to identify the metrics configuration.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID used to identify the metrics configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketMetricsConfigurationRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     *
     * @return <p>
     *         Specifies the metrics configuration.
     *         </p>
     */
    public MetricsConfiguration getMetricsConfiguration() {
        return metricsConfiguration;
    }

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     *
     * @param metricsConfiguration <p>
     *            Specifies the metrics configuration.
     *            </p>
     */
    public void setMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
    }

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricsConfiguration <p>
     *            Specifies the metrics configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketMetricsConfigurationRequest withMetricsConfiguration(
            MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
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
        if (getMetricsConfiguration() != null)
            sb.append("MetricsConfiguration: " + getMetricsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getMetricsConfiguration() == null) ? 0 : getMetricsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketMetricsConfigurationRequest == false)
            return false;
        PutBucketMetricsConfigurationRequest other = (PutBucketMetricsConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetricsConfiguration() == null ^ this.getMetricsConfiguration() == null)
            return false;
        if (other.getMetricsConfiguration() != null
                && other.getMetricsConfiguration().equals(this.getMetricsConfiguration()) == false)
            return false;
        return true;
    }
}
