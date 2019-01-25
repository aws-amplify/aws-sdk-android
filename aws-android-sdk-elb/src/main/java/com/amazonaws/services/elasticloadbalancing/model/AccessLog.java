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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the <code>AccessLog</code> attribute.
 * </p>
 */
public class AccessLog implements Serializable {
    /**
     * <p>
     * Specifies whether access logs are enabled for the load balancer.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the access logs are stored.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * The interval for publishing the access logs. You can specify an interval
     * of either 5 minutes or 60 minutes.
     * </p>
     * <p>
     * Default: 60 minutes
     * </p>
     */
    private Integer emitInterval;

    /**
     * <p>
     * The logical hierarchy you created for your Amazon S3 bucket, for example
     * <code>my-bucket-prefix/prod</code>. If the prefix is not provided, the
     * log is placed at the root level of the bucket.
     * </p>
     */
    private String s3BucketPrefix;

    /**
     * <p>
     * Specifies whether access logs are enabled for the load balancer.
     * </p>
     *
     * @return <p>
     *         Specifies whether access logs are enabled for the load balancer.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether access logs are enabled for the load balancer.
     * </p>
     *
     * @return <p>
     *         Specifies whether access logs are enabled for the load balancer.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether access logs are enabled for the load balancer.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether access logs are enabled for the load
     *            balancer.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether access logs are enabled for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether access logs are enabled for the load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLog withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the access logs are stored.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket where the access logs are
     *         stored.
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the access logs are stored.
     * </p>
     *
     * @param s3BucketName <p>
     *            The name of the Amazon S3 bucket where the access logs are
     *            stored.
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the access logs are stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3BucketName <p>
     *            The name of the Amazon S3 bucket where the access logs are
     *            stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLog withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * The interval for publishing the access logs. You can specify an interval
     * of either 5 minutes or 60 minutes.
     * </p>
     * <p>
     * Default: 60 minutes
     * </p>
     *
     * @return <p>
     *         The interval for publishing the access logs. You can specify an
     *         interval of either 5 minutes or 60 minutes.
     *         </p>
     *         <p>
     *         Default: 60 minutes
     *         </p>
     */
    public Integer getEmitInterval() {
        return emitInterval;
    }

    /**
     * <p>
     * The interval for publishing the access logs. You can specify an interval
     * of either 5 minutes or 60 minutes.
     * </p>
     * <p>
     * Default: 60 minutes
     * </p>
     *
     * @param emitInterval <p>
     *            The interval for publishing the access logs. You can specify
     *            an interval of either 5 minutes or 60 minutes.
     *            </p>
     *            <p>
     *            Default: 60 minutes
     *            </p>
     */
    public void setEmitInterval(Integer emitInterval) {
        this.emitInterval = emitInterval;
    }

    /**
     * <p>
     * The interval for publishing the access logs. You can specify an interval
     * of either 5 minutes or 60 minutes.
     * </p>
     * <p>
     * Default: 60 minutes
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emitInterval <p>
     *            The interval for publishing the access logs. You can specify
     *            an interval of either 5 minutes or 60 minutes.
     *            </p>
     *            <p>
     *            Default: 60 minutes
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLog withEmitInterval(Integer emitInterval) {
        this.emitInterval = emitInterval;
        return this;
    }

    /**
     * <p>
     * The logical hierarchy you created for your Amazon S3 bucket, for example
     * <code>my-bucket-prefix/prod</code>. If the prefix is not provided, the
     * log is placed at the root level of the bucket.
     * </p>
     *
     * @return <p>
     *         The logical hierarchy you created for your Amazon S3 bucket, for
     *         example <code>my-bucket-prefix/prod</code>. If the prefix is not
     *         provided, the log is placed at the root level of the bucket.
     *         </p>
     */
    public String getS3BucketPrefix() {
        return s3BucketPrefix;
    }

    /**
     * <p>
     * The logical hierarchy you created for your Amazon S3 bucket, for example
     * <code>my-bucket-prefix/prod</code>. If the prefix is not provided, the
     * log is placed at the root level of the bucket.
     * </p>
     *
     * @param s3BucketPrefix <p>
     *            The logical hierarchy you created for your Amazon S3 bucket,
     *            for example <code>my-bucket-prefix/prod</code>. If the prefix
     *            is not provided, the log is placed at the root level of the
     *            bucket.
     *            </p>
     */
    public void setS3BucketPrefix(String s3BucketPrefix) {
        this.s3BucketPrefix = s3BucketPrefix;
    }

    /**
     * <p>
     * The logical hierarchy you created for your Amazon S3 bucket, for example
     * <code>my-bucket-prefix/prod</code>. If the prefix is not provided, the
     * log is placed at the root level of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3BucketPrefix <p>
     *            The logical hierarchy you created for your Amazon S3 bucket,
     *            for example <code>my-bucket-prefix/prod</code>. If the prefix
     *            is not provided, the log is placed at the root level of the
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLog withS3BucketPrefix(String s3BucketPrefix) {
        this.s3BucketPrefix = s3BucketPrefix;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getEmitInterval() != null)
            sb.append("EmitInterval: " + getEmitInterval() + ",");
        if (getS3BucketPrefix() != null)
            sb.append("S3BucketPrefix: " + getS3BucketPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getEmitInterval() == null) ? 0 : getEmitInterval().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketPrefix() == null) ? 0 : getS3BucketPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessLog == false)
            return false;
        AccessLog other = (AccessLog) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getEmitInterval() == null ^ this.getEmitInterval() == null)
            return false;
        if (other.getEmitInterval() != null
                && other.getEmitInterval().equals(this.getEmitInterval()) == false)
            return false;
        if (other.getS3BucketPrefix() == null ^ this.getS3BucketPrefix() == null)
            return false;
        if (other.getS3BucketPrefix() != null
                && other.getS3BucketPrefix().equals(this.getS3BucketPrefix()) == false)
            return false;
        return true;
    }
}
