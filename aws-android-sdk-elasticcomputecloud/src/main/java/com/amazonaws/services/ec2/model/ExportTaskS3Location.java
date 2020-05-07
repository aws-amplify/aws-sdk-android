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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the destination for an export image task.
 * </p>
 */
public class ExportTaskS3Location implements Serializable {
    /**
     * <p>
     * The destination S3 bucket.
     * </p>
     */
    private String s3Bucket;

    /**
     * <p>
     * The prefix (logical hierarchy) in the bucket.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * The destination S3 bucket.
     * </p>
     *
     * @return <p>
     *         The destination S3 bucket.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * The destination S3 bucket.
     * </p>
     *
     * @param s3Bucket <p>
     *            The destination S3 bucket.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The destination S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Bucket <p>
     *            The destination S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTaskS3Location withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * The prefix (logical hierarchy) in the bucket.
     * </p>
     *
     * @return <p>
     *         The prefix (logical hierarchy) in the bucket.
     *         </p>
     */
    public String getS3Prefix() {
        return s3Prefix;
    }

    /**
     * <p>
     * The prefix (logical hierarchy) in the bucket.
     * </p>
     *
     * @param s3Prefix <p>
     *            The prefix (logical hierarchy) in the bucket.
     *            </p>
     */
    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The prefix (logical hierarchy) in the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Prefix <p>
     *            The prefix (logical hierarchy) in the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportTaskS3Location withS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: " + getS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTaskS3Location == false)
            return false;
        ExportTaskS3Location other = (ExportTaskS3Location) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        return true;
    }
}
