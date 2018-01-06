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

public class ImportJobResource implements Serializable {
    /**
     * Sets whether the endpoints create a segment when they are imported.
     */
    private Boolean defineSegment;

    /**
     * A unique, custom ID assigned to the IAM role that restricts who can
     * assume the role.
     */
    private String externalId;

    /**
     * The format of the files that contain the endpoint definitions. Valid
     * values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     */
    private String format;

    /**
     * Sets whether the endpoints are registered with Amazon Pinpoint when they
     * are imported.
     */
    private Boolean registerEndpoints;

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the Amazon S3 location that contains the endpoints to import.
     */
    private String roleArn;

    /**
     * A URL that points to the location within an Amazon S3 bucket that
     * contains the endpoints to import. The location can be a folder or a
     * single file. The URL should follow this format:
     * s3://bucket-name/folder-name/file-name Amazon Pinpoint will import
     * endpoints from this location and any subfolders it contains.
     */
    private String s3Url;

    /**
     * The ID of the segment to update if the import job is meant to update an
     * existing segment.
     */
    private String segmentId;

    /**
     * A custom name for the segment created by the import job. Use if
     * DefineSegment is true.
     */
    private String segmentName;

    /**
     * Sets whether the endpoints create a segment when they are imported.
     *
     * @return Sets whether the endpoints create a segment when they are
     *         imported.
     */
    public Boolean isDefineSegment() {
        return defineSegment;
    }

    /**
     * Sets whether the endpoints create a segment when they are imported.
     *
     * @return Sets whether the endpoints create a segment when they are
     *         imported.
     */
    public Boolean getDefineSegment() {
        return defineSegment;
    }

    /**
     * Sets whether the endpoints create a segment when they are imported.
     *
     * @param defineSegment Sets whether the endpoints create a segment when
     *            they are imported.
     */
    public void setDefineSegment(Boolean defineSegment) {
        this.defineSegment = defineSegment;
    }

    /**
     * Sets whether the endpoints create a segment when they are imported.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defineSegment Sets whether the endpoints create a segment when
     *            they are imported.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResource withDefineSegment(Boolean defineSegment) {
        this.defineSegment = defineSegment;
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
    public ImportJobResource withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * The format of the files that contain the endpoint definitions. Valid
     * values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @return The format of the files that contain the endpoint definitions.
     *         Valid values: CSV, JSON
     * @see Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * The format of the files that contain the endpoint definitions. Valid
     * values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the files that contain the endpoint
     *            definitions. Valid values: CSV, JSON
     * @see Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * The format of the files that contain the endpoint definitions. Valid
     * values: CSV, JSON
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the files that contain the endpoint
     *            definitions. Valid values: CSV, JSON
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ImportJobResource withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The format of the files that contain the endpoint definitions. Valid
     * values: CSV, JSON
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the files that contain the endpoint
     *            definitions. Valid values: CSV, JSON
     * @see Format
     */
    public void setFormat(Format format) {
        this.format = format.toString();
    }

    /**
     * The format of the files that contain the endpoint definitions. Valid
     * values: CSV, JSON
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format The format of the files that contain the endpoint
     *            definitions. Valid values: CSV, JSON
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ImportJobResource withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * Sets whether the endpoints are registered with Amazon Pinpoint when they
     * are imported.
     *
     * @return Sets whether the endpoints are registered with Amazon Pinpoint
     *         when they are imported.
     */
    public Boolean isRegisterEndpoints() {
        return registerEndpoints;
    }

    /**
     * Sets whether the endpoints are registered with Amazon Pinpoint when they
     * are imported.
     *
     * @return Sets whether the endpoints are registered with Amazon Pinpoint
     *         when they are imported.
     */
    public Boolean getRegisterEndpoints() {
        return registerEndpoints;
    }

    /**
     * Sets whether the endpoints are registered with Amazon Pinpoint when they
     * are imported.
     *
     * @param registerEndpoints Sets whether the endpoints are registered with
     *            Amazon Pinpoint when they are imported.
     */
    public void setRegisterEndpoints(Boolean registerEndpoints) {
        this.registerEndpoints = registerEndpoints;
    }

    /**
     * Sets whether the endpoints are registered with Amazon Pinpoint when they
     * are imported.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registerEndpoints Sets whether the endpoints are registered with
     *            Amazon Pinpoint when they are imported.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResource withRegisterEndpoints(Boolean registerEndpoints) {
        this.registerEndpoints = registerEndpoints;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the Amazon S3 location that contains the endpoints to import.
     *
     * @return The Amazon Resource Name (ARN) of an IAM role that grants Amazon
     *         Pinpoint access to the Amazon S3 location that contains the
     *         endpoints to import.
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the Amazon S3 location that contains the endpoints to import.
     *
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that grants
     *            Amazon Pinpoint access to the Amazon S3 location that contains
     *            the endpoints to import.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint
     * access to the Amazon S3 location that contains the endpoints to import.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that grants
     *            Amazon Pinpoint access to the Amazon S3 location that contains
     *            the endpoints to import.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResource withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * A URL that points to the location within an Amazon S3 bucket that
     * contains the endpoints to import. The location can be a folder or a
     * single file. The URL should follow this format:
     * s3://bucket-name/folder-name/file-name Amazon Pinpoint will import
     * endpoints from this location and any subfolders it contains.
     *
     * @return A URL that points to the location within an Amazon S3 bucket that
     *         contains the endpoints to import. The location can be a folder or
     *         a single file. The URL should follow this format:
     *         s3://bucket-name/folder-name/file-name Amazon Pinpoint will
     *         import endpoints from this location and any subfolders it
     *         contains.
     */
    public String getS3Url() {
        return s3Url;
    }

    /**
     * A URL that points to the location within an Amazon S3 bucket that
     * contains the endpoints to import. The location can be a folder or a
     * single file. The URL should follow this format:
     * s3://bucket-name/folder-name/file-name Amazon Pinpoint will import
     * endpoints from this location and any subfolders it contains.
     *
     * @param s3Url A URL that points to the location within an Amazon S3 bucket
     *            that contains the endpoints to import. The location can be a
     *            folder or a single file. The URL should follow this format:
     *            s3://bucket-name/folder-name/file-name Amazon Pinpoint will
     *            import endpoints from this location and any subfolders it
     *            contains.
     */
    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * A URL that points to the location within an Amazon S3 bucket that
     * contains the endpoints to import. The location can be a folder or a
     * single file. The URL should follow this format:
     * s3://bucket-name/folder-name/file-name Amazon Pinpoint will import
     * endpoints from this location and any subfolders it contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Url A URL that points to the location within an Amazon S3 bucket
     *            that contains the endpoints to import. The location can be a
     *            folder or a single file. The URL should follow this format:
     *            s3://bucket-name/folder-name/file-name Amazon Pinpoint will
     *            import endpoints from this location and any subfolders it
     *            contains.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResource withS3Url(String s3Url) {
        this.s3Url = s3Url;
        return this;
    }

    /**
     * The ID of the segment to update if the import job is meant to update an
     * existing segment.
     *
     * @return The ID of the segment to update if the import job is meant to
     *         update an existing segment.
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * The ID of the segment to update if the import job is meant to update an
     * existing segment.
     *
     * @param segmentId The ID of the segment to update if the import job is
     *            meant to update an existing segment.
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * The ID of the segment to update if the import job is meant to update an
     * existing segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId The ID of the segment to update if the import job is
     *            meant to update an existing segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResource withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * A custom name for the segment created by the import job. Use if
     * DefineSegment is true.
     *
     * @return A custom name for the segment created by the import job. Use if
     *         DefineSegment is true.
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * A custom name for the segment created by the import job. Use if
     * DefineSegment is true.
     *
     * @param segmentName A custom name for the segment created by the import
     *            job. Use if DefineSegment is true.
     */
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * A custom name for the segment created by the import job. Use if
     * DefineSegment is true.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentName A custom name for the segment created by the import
     *            job. Use if DefineSegment is true.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobResource withSegmentName(String segmentName) {
        this.segmentName = segmentName;
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
        if (getDefineSegment() != null)
            sb.append("DefineSegment: " + getDefineSegment() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getRegisterEndpoints() != null)
            sb.append("RegisterEndpoints: " + getRegisterEndpoints() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getS3Url() != null)
            sb.append("S3Url: " + getS3Url() + ",");
        if (getSegmentId() != null)
            sb.append("SegmentId: " + getSegmentId() + ",");
        if (getSegmentName() != null)
            sb.append("SegmentName: " + getSegmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefineSegment() == null) ? 0 : getDefineSegment().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getRegisterEndpoints() == null) ? 0 : getRegisterEndpoints().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportJobResource == false)
            return false;
        ImportJobResource other = (ImportJobResource) obj;

        if (other.getDefineSegment() == null ^ this.getDefineSegment() == null)
            return false;
        if (other.getDefineSegment() != null
                && other.getDefineSegment().equals(this.getDefineSegment()) == false)
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
        if (other.getRegisterEndpoints() == null ^ this.getRegisterEndpoints() == null)
            return false;
        if (other.getRegisterEndpoints() != null
                && other.getRegisterEndpoints().equals(this.getRegisterEndpoints()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null
                && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null
                && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        return true;
    }
}
