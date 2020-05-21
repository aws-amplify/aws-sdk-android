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

/**
 * <p>
 * Describes where logs are stored and the prefix that Amazon S3 assigns to all
 * log object keys for a bucket. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
 * >PUT Bucket logging</a> in the <i>Amazon Simple Storage Service API
 * Reference</i>.
 * </p>
 */
public class LoggingEnabled implements Serializable {
    /**
     * <p>
     * Specifies the bucket where you want Amazon S3 to store server access
     * logs. You can have your logs delivered to any bucket that you own,
     * including the same bucket that is being logged. You can also configure
     * multiple buckets to deliver their logs to the same target bucket. In this
     * case, you should choose a different <code>TargetPrefix</code> for each
     * source bucket so that the delivered log files can be distinguished by
     * key.
     * </p>
     */
    private String targetBucket;

    /**
     * <p>
     * Container for granting information.
     * </p>
     */
    private java.util.List<TargetGrant> targetGrants;

    /**
     * <p>
     * A prefix for all log object keys. If you store log files from multiple
     * Amazon S3 buckets in a single bucket, you can use a prefix to distinguish
     * which log files came from which bucket.
     * </p>
     */
    private String targetPrefix;

    /**
     * <p>
     * Specifies the bucket where you want Amazon S3 to store server access
     * logs. You can have your logs delivered to any bucket that you own,
     * including the same bucket that is being logged. You can also configure
     * multiple buckets to deliver their logs to the same target bucket. In this
     * case, you should choose a different <code>TargetPrefix</code> for each
     * source bucket so that the delivered log files can be distinguished by
     * key.
     * </p>
     *
     * @return <p>
     *         Specifies the bucket where you want Amazon S3 to store server
     *         access logs. You can have your logs delivered to any bucket that
     *         you own, including the same bucket that is being logged. You can
     *         also configure multiple buckets to deliver their logs to the same
     *         target bucket. In this case, you should choose a different
     *         <code>TargetPrefix</code> for each source bucket so that the
     *         delivered log files can be distinguished by key.
     *         </p>
     */
    public String getTargetBucket() {
        return targetBucket;
    }

    /**
     * <p>
     * Specifies the bucket where you want Amazon S3 to store server access
     * logs. You can have your logs delivered to any bucket that you own,
     * including the same bucket that is being logged. You can also configure
     * multiple buckets to deliver their logs to the same target bucket. In this
     * case, you should choose a different <code>TargetPrefix</code> for each
     * source bucket so that the delivered log files can be distinguished by
     * key.
     * </p>
     *
     * @param targetBucket <p>
     *            Specifies the bucket where you want Amazon S3 to store server
     *            access logs. You can have your logs delivered to any bucket
     *            that you own, including the same bucket that is being logged.
     *            You can also configure multiple buckets to deliver their logs
     *            to the same target bucket. In this case, you should choose a
     *            different <code>TargetPrefix</code> for each source bucket so
     *            that the delivered log files can be distinguished by key.
     *            </p>
     */
    public void setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
    }

    /**
     * <p>
     * Specifies the bucket where you want Amazon S3 to store server access
     * logs. You can have your logs delivered to any bucket that you own,
     * including the same bucket that is being logged. You can also configure
     * multiple buckets to deliver their logs to the same target bucket. In this
     * case, you should choose a different <code>TargetPrefix</code> for each
     * source bucket so that the delivered log files can be distinguished by
     * key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetBucket <p>
     *            Specifies the bucket where you want Amazon S3 to store server
     *            access logs. You can have your logs delivered to any bucket
     *            that you own, including the same bucket that is being logged.
     *            You can also configure multiple buckets to deliver their logs
     *            to the same target bucket. In this case, you should choose a
     *            different <code>TargetPrefix</code> for each source bucket so
     *            that the delivered log files can be distinguished by key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingEnabled withTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
        return this;
    }

    /**
     * <p>
     * Container for granting information.
     * </p>
     *
     * @return <p>
     *         Container for granting information.
     *         </p>
     */
    public java.util.List<TargetGrant> getTargetGrants() {
        return targetGrants;
    }

    /**
     * <p>
     * Container for granting information.
     * </p>
     *
     * @param targetGrants <p>
     *            Container for granting information.
     *            </p>
     */
    public void setTargetGrants(java.util.Collection<TargetGrant> targetGrants) {
        if (targetGrants == null) {
            this.targetGrants = null;
            return;
        }

        this.targetGrants = new java.util.ArrayList<TargetGrant>(targetGrants);
    }

    /**
     * <p>
     * Container for granting information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGrants <p>
     *            Container for granting information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingEnabled withTargetGrants(TargetGrant... targetGrants) {
        if (getTargetGrants() == null) {
            this.targetGrants = new java.util.ArrayList<TargetGrant>(targetGrants.length);
        }
        for (TargetGrant value : targetGrants) {
            this.targetGrants.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container for granting information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGrants <p>
     *            Container for granting information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingEnabled withTargetGrants(java.util.Collection<TargetGrant> targetGrants) {
        setTargetGrants(targetGrants);
        return this;
    }

    /**
     * <p>
     * A prefix for all log object keys. If you store log files from multiple
     * Amazon S3 buckets in a single bucket, you can use a prefix to distinguish
     * which log files came from which bucket.
     * </p>
     *
     * @return <p>
     *         A prefix for all log object keys. If you store log files from
     *         multiple Amazon S3 buckets in a single bucket, you can use a
     *         prefix to distinguish which log files came from which bucket.
     *         </p>
     */
    public String getTargetPrefix() {
        return targetPrefix;
    }

    /**
     * <p>
     * A prefix for all log object keys. If you store log files from multiple
     * Amazon S3 buckets in a single bucket, you can use a prefix to distinguish
     * which log files came from which bucket.
     * </p>
     *
     * @param targetPrefix <p>
     *            A prefix for all log object keys. If you store log files from
     *            multiple Amazon S3 buckets in a single bucket, you can use a
     *            prefix to distinguish which log files came from which bucket.
     *            </p>
     */
    public void setTargetPrefix(String targetPrefix) {
        this.targetPrefix = targetPrefix;
    }

    /**
     * <p>
     * A prefix for all log object keys. If you store log files from multiple
     * Amazon S3 buckets in a single bucket, you can use a prefix to distinguish
     * which log files came from which bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetPrefix <p>
     *            A prefix for all log object keys. If you store log files from
     *            multiple Amazon S3 buckets in a single bucket, you can use a
     *            prefix to distinguish which log files came from which bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingEnabled withTargetPrefix(String targetPrefix) {
        this.targetPrefix = targetPrefix;
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
        if (getTargetBucket() != null)
            sb.append("TargetBucket: " + getTargetBucket() + ",");
        if (getTargetGrants() != null)
            sb.append("TargetGrants: " + getTargetGrants() + ",");
        if (getTargetPrefix() != null)
            sb.append("TargetPrefix: " + getTargetPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetBucket() == null) ? 0 : getTargetBucket().hashCode());
        hashCode = prime * hashCode
                + ((getTargetGrants() == null) ? 0 : getTargetGrants().hashCode());
        hashCode = prime * hashCode
                + ((getTargetPrefix() == null) ? 0 : getTargetPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingEnabled == false)
            return false;
        LoggingEnabled other = (LoggingEnabled) obj;

        if (other.getTargetBucket() == null ^ this.getTargetBucket() == null)
            return false;
        if (other.getTargetBucket() != null
                && other.getTargetBucket().equals(this.getTargetBucket()) == false)
            return false;
        if (other.getTargetGrants() == null ^ this.getTargetGrants() == null)
            return false;
        if (other.getTargetGrants() != null
                && other.getTargetGrants().equals(this.getTargetGrants()) == false)
            return false;
        if (other.getTargetPrefix() == null ^ this.getTargetPrefix() == null)
            return false;
        if (other.getTargetPrefix() != null
                && other.getTargetPrefix().equals(this.getTargetPrefix()) == false)
            return false;
        return true;
    }
}
