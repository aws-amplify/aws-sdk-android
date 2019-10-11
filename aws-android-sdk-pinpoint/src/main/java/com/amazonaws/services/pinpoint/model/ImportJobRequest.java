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
 * Specifies the settings for a job that imports endpoint definitions from an
 * Amazon Simple Storage Service (Amazon S3) bucket.
 * </p>
 */
public class ImportJobRequest implements Serializable {
    /**
     * <p>
     * Specifies whether to create a segment that contains the endpoints, when
     * the endpoint definitions are imported.
     * </p>
     */
    private Boolean defineSegment;

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
     * The format of the files that contain the endpoint definitions to import.
     * Valid values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format. If the Amazon S3 location stores multiple
     * files that use different formats, Amazon Pinpoint imports data only from
     * the files that use the specified format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     */
    private String format;

    /**
     * <p>
     * Specifies whether to register the endpoints with Amazon Pinpoint, when
     * the endpoint definitions are imported.
     * </p>
     */
    private Boolean registerEndpoints;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that
     * contains the endpoint definitions to import. This location can be a
     * folder or a single file. If the location is a folder, Amazon Pinpoint
     * imports endpoint definitions from the files in this location, including
     * any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</
     * replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key
     * for an individual object or a prefix that qualifies multiple objects.
     * </p>
     */
    private String s3Url;

    /**
     * <p>
     * The identifier for the segment to update or add the imported endpoint
     * definitions to, if the import job is meant to update an existing segment.
     * </p>
     */
    private String segmentId;

    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the
     * value of the DefineSegment property is true.
     * </p>
     */
    private String segmentName;

    /**
     * <p>
     * Specifies whether to create a segment that contains the endpoints, when
     * the endpoint definitions are imported.
     * </p>
     *
     * @return <p>
     *         Specifies whether to create a segment that contains the
     *         endpoints, when the endpoint definitions are imported.
     *         </p>
     */
    public Boolean isDefineSegment() {
        return defineSegment;
    }

    /**
     * <p>
     * Specifies whether to create a segment that contains the endpoints, when
     * the endpoint definitions are imported.
     * </p>
     *
     * @return <p>
     *         Specifies whether to create a segment that contains the
     *         endpoints, when the endpoint definitions are imported.
     *         </p>
     */
    public Boolean getDefineSegment() {
        return defineSegment;
    }

    /**
     * <p>
     * Specifies whether to create a segment that contains the endpoints, when
     * the endpoint definitions are imported.
     * </p>
     *
     * @param defineSegment <p>
     *            Specifies whether to create a segment that contains the
     *            endpoints, when the endpoint definitions are imported.
     *            </p>
     */
    public void setDefineSegment(Boolean defineSegment) {
        this.defineSegment = defineSegment;
    }

    /**
     * <p>
     * Specifies whether to create a segment that contains the endpoints, when
     * the endpoint definitions are imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defineSegment <p>
     *            Specifies whether to create a segment that contains the
     *            endpoints, when the endpoint definitions are imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobRequest withDefineSegment(Boolean defineSegment) {
        this.defineSegment = defineSegment;
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
    public ImportJobRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import.
     * Valid values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format. If the Amazon S3 location stores multiple
     * files that use different formats, Amazon Pinpoint imports data only from
     * the files that use the specified format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @return <p>
     *         The format of the files that contain the endpoint definitions to
     *         import. Valid values are: CSV, for comma-separated values format;
     *         and, JSON, for newline-delimited JSON format. If the Amazon S3
     *         location stores multiple files that use different formats, Amazon
     *         Pinpoint imports data only from the files that use the specified
     *         format.
     *         </p>
     * @see Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import.
     * Valid values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format. If the Amazon S3 location stores multiple
     * files that use different formats, Amazon Pinpoint imports data only from
     * the files that use the specified format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that contain the endpoint definitions
     *            to import. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format. If the
     *            Amazon S3 location stores multiple files that use different
     *            formats, Amazon Pinpoint imports data only from the files that
     *            use the specified format.
     *            </p>
     * @see Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import.
     * Valid values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format. If the Amazon S3 location stores multiple
     * files that use different formats, Amazon Pinpoint imports data only from
     * the files that use the specified format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that contain the endpoint definitions
     *            to import. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format. If the
     *            Amazon S3 location stores multiple files that use different
     *            formats, Amazon Pinpoint imports data only from the files that
     *            use the specified format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ImportJobRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import.
     * Valid values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format. If the Amazon S3 location stores multiple
     * files that use different formats, Amazon Pinpoint imports data only from
     * the files that use the specified format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that contain the endpoint definitions
     *            to import. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format. If the
     *            Amazon S3 location stores multiple files that use different
     *            formats, Amazon Pinpoint imports data only from the files that
     *            use the specified format.
     *            </p>
     * @see Format
     */
    public void setFormat(Format format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the files that contain the endpoint definitions to import.
     * Valid values are: CSV, for comma-separated values format; and, JSON, for
     * newline-delimited JSON format. If the Amazon S3 location stores multiple
     * files that use different formats, Amazon Pinpoint imports data only from
     * the files that use the specified format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, JSON
     *
     * @param format <p>
     *            The format of the files that contain the endpoint definitions
     *            to import. Valid values are: CSV, for comma-separated values
     *            format; and, JSON, for newline-delimited JSON format. If the
     *            Amazon S3 location stores multiple files that use different
     *            formats, Amazon Pinpoint imports data only from the files that
     *            use the specified format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ImportJobRequest withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to register the endpoints with Amazon Pinpoint, when
     * the endpoint definitions are imported.
     * </p>
     *
     * @return <p>
     *         Specifies whether to register the endpoints with Amazon Pinpoint,
     *         when the endpoint definitions are imported.
     *         </p>
     */
    public Boolean isRegisterEndpoints() {
        return registerEndpoints;
    }

    /**
     * <p>
     * Specifies whether to register the endpoints with Amazon Pinpoint, when
     * the endpoint definitions are imported.
     * </p>
     *
     * @return <p>
     *         Specifies whether to register the endpoints with Amazon Pinpoint,
     *         when the endpoint definitions are imported.
     *         </p>
     */
    public Boolean getRegisterEndpoints() {
        return registerEndpoints;
    }

    /**
     * <p>
     * Specifies whether to register the endpoints with Amazon Pinpoint, when
     * the endpoint definitions are imported.
     * </p>
     *
     * @param registerEndpoints <p>
     *            Specifies whether to register the endpoints with Amazon
     *            Pinpoint, when the endpoint definitions are imported.
     *            </p>
     */
    public void setRegisterEndpoints(Boolean registerEndpoints) {
        this.registerEndpoints = registerEndpoints;
    }

    /**
     * <p>
     * Specifies whether to register the endpoints with Amazon Pinpoint, when
     * the endpoint definitions are imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registerEndpoints <p>
     *            Specifies whether to register the endpoints with Amazon
     *            Pinpoint, when the endpoint definitions are imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobRequest withRegisterEndpoints(Boolean registerEndpoints) {
        this.registerEndpoints = registerEndpoints;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that authorizes Amazon Pinpoint to access
     *         the Amazon S3 location to import endpoint definitions from.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorizes Amazon Pinpoint to
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
     * (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3
     * location to import endpoint definitions from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorizes Amazon Pinpoint to
     *            access the Amazon S3 location to import endpoint definitions
     *            from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that
     * contains the endpoint definitions to import. This location can be a
     * folder or a single file. If the location is a folder, Amazon Pinpoint
     * imports endpoint definitions from the files in this location, including
     * any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</
     * replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key
     * for an individual object or a prefix that qualifies multiple objects.
     * </p>
     *
     * @return <p>
     *         The URL of the Amazon Simple Storage Service (Amazon S3) bucket
     *         that contains the endpoint definitions to import. This location
     *         can be a folder or a single file. If the location is a folder,
     *         Amazon Pinpoint imports endpoint definitions from the files in
     *         this location, including any subfolders that the folder contains.
     *         </p>
     *         <p>
     *         The URL should be in the following format:
     *         s3://<replaceable>bucket
     *         -name</replaceable>/<replaceable>folder-name
     *         </replaceable>/<replaceable>file-name</replaceable>. The location
     *         can end with the key for an individual object or a prefix that
     *         qualifies multiple objects.
     *         </p>
     */
    public String getS3Url() {
        return s3Url;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that
     * contains the endpoint definitions to import. This location can be a
     * folder or a single file. If the location is a folder, Amazon Pinpoint
     * imports endpoint definitions from the files in this location, including
     * any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</
     * replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key
     * for an individual object or a prefix that qualifies multiple objects.
     * </p>
     *
     * @param s3Url <p>
     *            The URL of the Amazon Simple Storage Service (Amazon S3)
     *            bucket that contains the endpoint definitions to import. This
     *            location can be a folder or a single file. If the location is
     *            a folder, Amazon Pinpoint imports endpoint definitions from
     *            the files in this location, including any subfolders that the
     *            folder contains.
     *            </p>
     *            <p>
     *            The URL should be in the following format:
     *            s3://<replaceable>bucket
     *            -name</replaceable>/<replaceable>folder
     *            -name</replaceable>/<replaceable>file-name</replaceable>. The
     *            location can end with the key for an individual object or a
     *            prefix that qualifies multiple objects.
     *            </p>
     */
    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that
     * contains the endpoint definitions to import. This location can be a
     * folder or a single file. If the location is a folder, Amazon Pinpoint
     * imports endpoint definitions from the files in this location, including
     * any subfolders that the folder contains.
     * </p>
     * <p>
     * The URL should be in the following format:
     * s3://<replaceable>bucket-name</
     * replaceable>/<replaceable>folder-name</replaceable
     * >/<replaceable>file-name</replaceable>. The location can end with the key
     * for an individual object or a prefix that qualifies multiple objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Url <p>
     *            The URL of the Amazon Simple Storage Service (Amazon S3)
     *            bucket that contains the endpoint definitions to import. This
     *            location can be a folder or a single file. If the location is
     *            a folder, Amazon Pinpoint imports endpoint definitions from
     *            the files in this location, including any subfolders that the
     *            folder contains.
     *            </p>
     *            <p>
     *            The URL should be in the following format:
     *            s3://<replaceable>bucket
     *            -name</replaceable>/<replaceable>folder
     *            -name</replaceable>/<replaceable>file-name</replaceable>. The
     *            location can end with the key for an individual object or a
     *            prefix that qualifies multiple objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobRequest withS3Url(String s3Url) {
        this.s3Url = s3Url;
        return this;
    }

    /**
     * <p>
     * The identifier for the segment to update or add the imported endpoint
     * definitions to, if the import job is meant to update an existing segment.
     * </p>
     *
     * @return <p>
     *         The identifier for the segment to update or add the imported
     *         endpoint definitions to, if the import job is meant to update an
     *         existing segment.
     *         </p>
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * <p>
     * The identifier for the segment to update or add the imported endpoint
     * definitions to, if the import job is meant to update an existing segment.
     * </p>
     *
     * @param segmentId <p>
     *            The identifier for the segment to update or add the imported
     *            endpoint definitions to, if the import job is meant to update
     *            an existing segment.
     *            </p>
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The identifier for the segment to update or add the imported endpoint
     * definitions to, if the import job is meant to update an existing segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId <p>
     *            The identifier for the segment to update or add the imported
     *            endpoint definitions to, if the import job is meant to update
     *            an existing segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobRequest withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the
     * value of the DefineSegment property is true.
     * </p>
     *
     * @return <p>
     *         The custom name for the segment that's created by the import job,
     *         if the value of the DefineSegment property is true.
     *         </p>
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the
     * value of the DefineSegment property is true.
     * </p>
     *
     * @param segmentName <p>
     *            The custom name for the segment that's created by the import
     *            job, if the value of the DefineSegment property is true.
     *            </p>
     */
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The custom name for the segment that's created by the import job, if the
     * value of the DefineSegment property is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentName <p>
     *            The custom name for the segment that's created by the import
     *            job, if the value of the DefineSegment property is true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportJobRequest withSegmentName(String segmentName) {
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

        if (obj instanceof ImportJobRequest == false)
            return false;
        ImportJobRequest other = (ImportJobRequest) obj;

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
