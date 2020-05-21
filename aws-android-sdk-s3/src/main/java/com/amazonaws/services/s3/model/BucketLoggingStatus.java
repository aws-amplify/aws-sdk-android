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
 * Container for logging status information.
 * </p>
 */
public class BucketLoggingStatus implements Serializable {
    /**
     * <p>
     * Describes where logs are stored and the prefix that Amazon S3 assigns to
     * all log object keys for a bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
     * >PUT Bucket logging</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     */
    private LoggingEnabled loggingEnabled;

    /**
     * <p>
     * Describes where logs are stored and the prefix that Amazon S3 assigns to
     * all log object keys for a bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
     * >PUT Bucket logging</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     *
     * @return <p>
     *         Describes where logs are stored and the prefix that Amazon S3
     *         assigns to all log object keys for a bucket. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
     *         >PUT Bucket logging</a> in the <i>Amazon Simple Storage Service
     *         API Reference</i>.
     *         </p>
     */
    public LoggingEnabled getLoggingEnabled() {
        return loggingEnabled;
    }

    /**
     * <p>
     * Describes where logs are stored and the prefix that Amazon S3 assigns to
     * all log object keys for a bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
     * >PUT Bucket logging</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     *
     * @param loggingEnabled <p>
     *            Describes where logs are stored and the prefix that Amazon S3
     *            assigns to all log object keys for a bucket. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
     *            >PUT Bucket logging</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>.
     *            </p>
     */
    public void setLoggingEnabled(LoggingEnabled loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }

    /**
     * <p>
     * Describes where logs are stored and the prefix that Amazon S3 assigns to
     * all log object keys for a bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
     * >PUT Bucket logging</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingEnabled <p>
     *            Describes where logs are stored and the prefix that Amazon S3
     *            assigns to all log object keys for a bucket. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html"
     *            >PUT Bucket logging</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketLoggingStatus withLoggingEnabled(LoggingEnabled loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
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
        if (getLoggingEnabled() != null)
            sb.append("LoggingEnabled: " + getLoggingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoggingEnabled() == null) ? 0 : getLoggingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketLoggingStatus == false)
            return false;
        BucketLoggingStatus other = (BucketLoggingStatus) obj;

        if (other.getLoggingEnabled() == null ^ this.getLoggingEnabled() == null)
            return false;
        if (other.getLoggingEnabled() != null
                && other.getLoggingEnabled().equals(this.getLoggingEnabled()) == false)
            return false;
        return true;
    }
}
