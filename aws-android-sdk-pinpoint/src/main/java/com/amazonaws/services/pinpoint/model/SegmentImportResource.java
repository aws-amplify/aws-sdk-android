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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the import job that created a segment. An import
 * job is a job that creates a user segment by importing endpoint definitions.
 * </p>
 */
public class SegmentImportResource implements Serializable {
    /**
     * <p>
     * The number of channel types in the endpoint definitions that were
     * imported to create the segment.
     * </p>
     */
    private java.util.Map<String, Integer> channelCounts;

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID
     * key in an IAM trust policy. Amazon Pinpoint previously used this value to
     * assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles
     * that are assumed by Amazon Pinpoint.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The format of the files that were imported to create the segment. Valid
     * values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     */
    private String format;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that the
     * endpoint definitions were imported from to create the segment.
     * </p>
     */
    private String s3Url;

    /**
     * <p>
     * The number of endpoint definitions that were imported successfully to
     * create the segment.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The number of channel types in the endpoint definitions that were
     * imported to create the segment.
     * </p>
     *
     * @return <p>
     *         The number of channel types in the endpoint definitions that were
     *         imported to create the segment.
     *         </p>
     */
    public java.util.Map<String, Integer> getChannelCounts() {
        return channelCounts;
    }

    /**
     * <p>
     * The number of channel types in the endpoint definitions that were
     * imported to create the segment.
     * </p>
     *
     * @param channelCounts <p>
     *            The number of channel types in the endpoint definitions that
     *            were imported to create the segment.
     *            </p>
     */
    public void setChannelCounts(java.util.Map<String, Integer> channelCounts) {
        this.channelCounts = channelCounts;
    }

    /**
     * <p>
     * The number of channel types in the endpoint definitions that were
     * imported to create the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelCounts <p>
     *            The number of channel types in the endpoint definitions that
     *            were imported to create the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withChannelCounts(java.util.Map<String, Integer> channelCounts) {
        this.channelCounts = channelCounts;
        return this;
    }

    /**
     * <p>
     * The number of channel types in the endpoint definitions that were
     * imported to create the segment.
     * </p>
     * <p>
     * The method adds a new key-value pair into ChannelCounts parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ChannelCounts.
     * @param value The corresponding value of the entry to be added into
     *            ChannelCounts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource addChannelCountsEntry(String key, Integer value) {
        if (null == this.channelCounts) {
            this.channelCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.channelCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.channelCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChannelCounts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SegmentImportResource clearChannelCountsEntries() {
        this.channelCounts = null;
        return this;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID
     * key in an IAM trust policy. Amazon Pinpoint previously used this value to
     * assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles
     * that are assumed by Amazon Pinpoint.
     * </p>
     *
     * @return <p>
     *         (Deprecated) Your AWS account ID, which you assigned to an
     *         external ID key in an IAM trust policy. Amazon Pinpoint
     *         previously used this value to assume an IAM role when importing
     *         endpoint definitions, but we removed this requirement. We don't
     *         recommend use of external IDs for IAM roles that are assumed by
     *         Amazon Pinpoint.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID
     * key in an IAM trust policy. Amazon Pinpoint previously used this value to
     * assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles
     * that are assumed by Amazon Pinpoint.
     * </p>
     *
     * @param externalId <p>
     *            (Deprecated) Your AWS account ID, which you assigned to an
     *            external ID key in an IAM trust policy. Amazon Pinpoint
     *            previously used this value to assume an IAM role when
     *            importing endpoint definitions, but we removed this
     *            requirement. We don't recommend use of external IDs for IAM
     *            roles that are assumed by Amazon Pinpoint.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * (Deprecated) Your AWS account ID, which you assigned to an external ID
     * key in an IAM trust policy. Amazon Pinpoint previously used this value to
     * assume an IAM role when importing endpoint definitions, but we removed
     * this requirement. We don't recommend use of external IDs for IAM roles
     * that are assumed by Amazon Pinpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            (Deprecated) Your AWS account ID, which you assigned to an
     *            external ID key in an IAM trust policy. Amazon Pinpoint
     *            previously used this value to assume an IAM role when
     *            importing endpoint definitions, but we removed this
     *            requirement. We don't recommend use of external IDs for IAM
     *            roles that are assumed by Amazon Pinpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * The format of the files that were imported to create the segment. Valid
     * values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @return <p>
     *         The format of the files that were imported to create the segment.
     *         Valid values are: CSV, for comma-separated values format; and,
     *         JSON, for newline-delimited JSON format.
     *         </p>
     * @see Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the files that were imported to create the segment. Valid
     * values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that were imported to create the
     *            segment. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format.
     *            </p>
     * @see Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the files that were imported to create the segment. Valid
     * values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that were imported to create the
     *            segment. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public SegmentImportResource withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the files that were imported to create the segment. Valid
     * values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that were imported to create the
     *            segment. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format.
     *            </p>
     * @see Format
     */
    public void setFormat(Format format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the files that were imported to create the segment. Valid
     * values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that were imported to create the
     *            segment. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public SegmentImportResource withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that authorized Amazon Pinpoint to access
     *         the Amazon S3 location to import endpoint definitions from.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorized Amazon Pinpoint to
     *            access the Amazon S3 location to import endpoint definitions
     *            from.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorized Amazon Pinpoint to
     *            access the Amazon S3 location to import endpoint definitions
     *            from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that the
     * endpoint definitions were imported from to create the segment.
     * </p>
     *
     * @return <p>
     *         The URL of the Amazon Simple Storage Service (Amazon S3) bucket
     *         that the endpoint definitions were imported from to create the
     *         segment.
     *         </p>
     */
    public String getS3Url() {
        return s3Url;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that the
     * endpoint definitions were imported from to create the segment.
     * </p>
     *
     * @param s3Url <p>
     *            The URL of the Amazon Simple Storage Service (Amazon S3)
     *            bucket that the endpoint definitions were imported from to
     *            create the segment.
     *            </p>
     */
    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that the
     * endpoint definitions were imported from to create the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Url <p>
     *            The URL of the Amazon Simple Storage Service (Amazon S3)
     *            bucket that the endpoint definitions were imported from to
     *            create the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withS3Url(String s3Url) {
        this.s3Url = s3Url;
        return this;
    }

    /**
     * <p>
     * The number of endpoint definitions that were imported successfully to
     * create the segment.
     * </p>
     *
     * @return <p>
     *         The number of endpoint definitions that were imported
     *         successfully to create the segment.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * The number of endpoint definitions that were imported successfully to
     * create the segment.
     * </p>
     *
     * @param size <p>
     *            The number of endpoint definitions that were imported
     *            successfully to create the segment.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The number of endpoint definitions that were imported successfully to
     * create the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The number of endpoint definitions that were imported
     *            successfully to create the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withSize(Integer size) {
        this.size = size;
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
        if (getChannelCounts() != null)
            sb.append("ChannelCounts: " + getChannelCounts() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getS3Url() != null)
            sb.append("S3Url: " + getS3Url() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelCounts() == null) ? 0 : getChannelCounts().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentImportResource == false)
            return false;
        SegmentImportResource other = (SegmentImportResource) obj;

        if (other.getChannelCounts() == null ^ this.getChannelCounts() == null)
            return false;
        if (other.getChannelCounts() != null
                && other.getChannelCounts().equals(this.getChannelCounts()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }
}
