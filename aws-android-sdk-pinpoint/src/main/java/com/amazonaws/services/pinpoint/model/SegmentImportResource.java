/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Segment import definition.
 */
public class SegmentImportResource implements Serializable {
    /**
     * Channel type counts
     */
    private java.util.Map<String, Integer> channelCounts;

    /**
     * A unique, custom ID assigned to the IAM role that restricts who can
     * assume the role.
     */
    private String externalId;

    /**
     * The format of the endpoint files that were imported to create this
     * segment. Valid values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     */
    private String format;

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the endpoints in Amazon S3.
     */
    private String roleArn;

    /**
     * A URL that points to the Amazon S3 location from which the endpoints for
     * this segment were imported.
     */
    private String s3Url;

    /**
     * The number of endpoints that were successfully imported to create this
     * segment.
     */
    private Integer size;

    /**
     * Channel type counts
     *
     * @return Channel type counts
     */
    public java.util.Map<String, Integer> getChannelCounts() {
        return channelCounts;
    }

    /**
     * Channel type counts
     *
     * @param channelCounts Channel type counts
     */
    public void setChannelCounts(java.util.Map<String, Integer> channelCounts) {
        this.channelCounts = channelCounts;
    }

    /**
     * Channel type counts
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelCounts Channel type counts
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withChannelCounts(java.util.Map<String, Integer> channelCounts) {
        this.channelCounts = channelCounts;
        return this;
    }

    /**
     * Channel type counts
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
     * A unique, custom ID assigned to the IAM role that restricts who can
     * assume the role.
     *
     * @return A unique, custom ID assigned to the IAM role that restricts who
     *         can assume the role.
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * A unique, custom ID assigned to the IAM role that restricts who can
     * assume the role.
     *
     * @param externalId A unique, custom ID assigned to the IAM role that
     *            restricts who can assume the role.
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * A unique, custom ID assigned to the IAM role that restricts who can
     * assume the role.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId A unique, custom ID assigned to the IAM role that
     *            restricts who can assume the role.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The format of the endpoint files that were imported to create this
     * segment. Valid values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @return The format of the endpoint files that were imported to create
     *         this segment. Valid values: CSV, JSON
     * @see Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * The format of the endpoint files that were imported to create this
     * segment. Valid values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the endpoint files that were imported to
     *            create this segment. Valid values: CSV, JSON
     * @see Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * The format of the endpoint files that were imported to create this
     * segment. Valid values: CSV, JSON
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the endpoint files that were imported to
     *            create this segment. Valid values: CSV, JSON
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public SegmentImportResource withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The format of the endpoint files that were imported to create this
     * segment. Valid values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the endpoint files that were imported to
     *            create this segment. Valid values: CSV, JSON
     * @see Format
     */
    public void setFormat(Format format) {
        this.format = format.toString();
    }

    /**
     * The format of the endpoint files that were imported to create this
     * segment. Valid values: CSV, JSON
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the endpoint files that were imported to
     *            create this segment. Valid values: CSV, JSON
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public SegmentImportResource withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the endpoints in Amazon S3.
     *
     * @return The Amazon Resource Name (ARN) of an IAM role that grants Amazon
     *         Pinpoint access to the endpoints in Amazon S3.
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the endpoints in Amazon S3.
     *
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that grants
     *            Amazon Pinpoint access to the endpoints in Amazon S3.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the endpoints in Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that grants
     *            Amazon Pinpoint access to the endpoints in Amazon S3.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * A URL that points to the Amazon S3 location from which the endpoints for
     * this segment were imported.
     *
     * @return A URL that points to the Amazon S3 location from which the
     *         endpoints for this segment were imported.
     */
    public String getS3Url() {
        return s3Url;
    }

    /**
     * A URL that points to the Amazon S3 location from which the endpoints for
     * this segment were imported.
     *
     * @param s3Url A URL that points to the Amazon S3 location from which the
     *            endpoints for this segment were imported.
     */
    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * A URL that points to the Amazon S3 location from which the endpoints for
     * this segment were imported.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Url A URL that points to the Amazon S3 location from which the
     *            endpoints for this segment were imported.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentImportResource withS3Url(String s3Url) {
        this.s3Url = s3Url;
        return this;
    }

    /**
     * The number of endpoints that were successfully imported to create this
     * segment.
     *
     * @return The number of endpoints that were successfully imported to create
     *         this segment.
     */
    public Integer getSize() {
        return size;
    }

    /**
     * The number of endpoints that were successfully imported to create this
     * segment.
     *
     * @param size The number of endpoints that were successfully imported to
     *            create this segment.
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * The number of endpoints that were successfully imported to create this
     * segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size The number of endpoints that were successfully imported to
     *            create this segment.
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
