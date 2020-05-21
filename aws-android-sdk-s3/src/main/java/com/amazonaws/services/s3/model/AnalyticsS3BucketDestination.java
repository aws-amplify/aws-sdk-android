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
 * Contains information about where to publish the analytics results.
 * </p>
 */
public class AnalyticsS3BucketDestination implements Serializable {
    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV
     */
    private String format;

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     */
    private String bucketAccountId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The prefix to use when exporting data. The prefix is prepended to all
     * results.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV
     *
     * @return <p>
     *         Specifies the file format used when exporting data to Amazon S3.
     *         </p>
     * @see AnalyticsS3ExportFileFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV
     *
     * @param format <p>
     *            Specifies the file format used when exporting data to Amazon
     *            S3.
     *            </p>
     * @see AnalyticsS3ExportFileFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV
     *
     * @param format <p>
     *            Specifies the file format used when exporting data to Amazon
     *            S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AnalyticsS3ExportFileFormat
     */
    public AnalyticsS3BucketDestination withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV
     *
     * @param format <p>
     *            Specifies the file format used when exporting data to Amazon
     *            S3.
     *            </p>
     * @see AnalyticsS3ExportFileFormat
     */
    public void setFormat(AnalyticsS3ExportFileFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * Specifies the file format used when exporting data to Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV
     *
     * @param format <p>
     *            Specifies the file format used when exporting data to Amazon
     *            S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AnalyticsS3ExportFileFormat
     */
    public AnalyticsS3BucketDestination withFormat(AnalyticsS3ExportFileFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The account ID that owns the destination S3 bucket. If no account
     *         ID is provided, the owner is not validated before exporting data.
     *         </p>
     *         <note>
     *         <p>
     *         Although this value is optional, we strongly recommend that you
     *         set it to help prevent problems if the destination bucket
     *         ownership changes.
     *         </p>
     *         </note>
     */
    public String getBucketAccountId() {
        return bucketAccountId;
    }

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     *
     * @param bucketAccountId <p>
     *            The account ID that owns the destination S3 bucket. If no
     *            account ID is provided, the owner is not validated before
     *            exporting data.
     *            </p>
     *            <note>
     *            <p>
     *            Although this value is optional, we strongly recommend that
     *            you set it to help prevent problems if the destination bucket
     *            ownership changes.
     *            </p>
     *            </note>
     */
    public void setBucketAccountId(String bucketAccountId) {
        this.bucketAccountId = bucketAccountId;
    }

    /**
     * <p>
     * The account ID that owns the destination S3 bucket. If no account ID is
     * provided, the owner is not validated before exporting data.
     * </p>
     * <note>
     * <p>
     * Although this value is optional, we strongly recommend that you set it to
     * help prevent problems if the destination bucket ownership changes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketAccountId <p>
     *            The account ID that owns the destination S3 bucket. If no
     *            account ID is provided, the owner is not validated before
     *            exporting data.
     *            </p>
     *            <note>
     *            <p>
     *            Although this value is optional, we strongly recommend that
     *            you set it to help prevent problems if the destination bucket
     *            ownership changes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsS3BucketDestination withBucketAccountId(String bucketAccountId) {
        this.bucketAccountId = bucketAccountId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the bucket to which data is
     *         exported.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * </p>
     *
     * @param bucket <p>
     *            The Amazon Resource Name (ARN) of the bucket to which data is
     *            exported.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The Amazon Resource Name (ARN) of the bucket to which data is
     *            exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsS3BucketDestination withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The prefix to use when exporting data. The prefix is prepended to all
     * results.
     * </p>
     *
     * @return <p>
     *         The prefix to use when exporting data. The prefix is prepended to
     *         all results.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix to use when exporting data. The prefix is prepended to all
     * results.
     * </p>
     *
     * @param prefix <p>
     *            The prefix to use when exporting data. The prefix is prepended
     *            to all results.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix to use when exporting data. The prefix is prepended to all
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix to use when exporting data. The prefix is prepended
     *            to all results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsS3BucketDestination withPrefix(String prefix) {
        this.prefix = prefix;
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
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getBucketAccountId() != null)
            sb.append("BucketAccountId: " + getBucketAccountId() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getBucketAccountId() == null) ? 0 : getBucketAccountId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsS3BucketDestination == false)
            return false;
        AnalyticsS3BucketDestination other = (AnalyticsS3BucketDestination) obj;

        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getBucketAccountId() == null ^ this.getBucketAccountId() == null)
            return false;
        if (other.getBucketAccountId() != null
                && other.getBucketAccountId().equals(this.getBucketAccountId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }
}
