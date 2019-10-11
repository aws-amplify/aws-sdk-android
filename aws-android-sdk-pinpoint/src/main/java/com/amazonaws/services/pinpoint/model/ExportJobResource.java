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
 * Provides information about the resource settings for a job that exports
 * endpoint definitions to a file. The file can be added directly to an Amazon
 * Simple Storage Service (Amazon S3) bucket by using the Amazon Pinpoint API or
 * downloaded directly to a computer by using the Amazon Pinpoint console.
 * </p>
 */
public class ExportJobResource implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location where the endpoint definitions were exported to.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3)
     * bucket where the endpoint definitions were exported to. This location is
     * typically a folder that contains multiple files. The URL should be in the
     * following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable
     * >folder-name</replaceable>/.
     * </p>
     */
    private String s3UrlPrefix;

    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were
     * exported from. If this value isn't present, Amazon Pinpoint exported
     * definitions for all the endpoints that are associated with the
     * application.
     * </p>
     */
    private String segmentId;

    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported
     * from.
     * </p>
     */
    private Integer segmentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location where the endpoint definitions were exported to.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Access
     *         Management (IAM) role that authorized Amazon Pinpoint to access
     *         the Amazon S3 location where the endpoint definitions were
     *         exported to.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location where the endpoint definitions were exported to.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorized Amazon Pinpoint to
     *            access the Amazon S3 location where the endpoint definitions
     *            were exported to.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * (IAM) role that authorized Amazon Pinpoint to access the Amazon S3
     * location where the endpoint definitions were exported to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and Access
     *            Management (IAM) role that authorized Amazon Pinpoint to
     *            access the Amazon S3 location where the endpoint definitions
     *            were exported to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJobResource withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3)
     * bucket where the endpoint definitions were exported to. This location is
     * typically a folder that contains multiple files. The URL should be in the
     * following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable
     * >folder-name</replaceable>/.
     * </p>
     *
     * @return <p>
     *         The URL of the location in an Amazon Simple Storage Service
     *         (Amazon S3) bucket where the endpoint definitions were exported
     *         to. This location is typically a folder that contains multiple
     *         files. The URL should be in the following format:
     *         s3://<replaceable
     *         >bucket-name</replaceable>/<replaceable>folder-name
     *         </replaceable>/.
     *         </p>
     */
    public String getS3UrlPrefix() {
        return s3UrlPrefix;
    }

    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3)
     * bucket where the endpoint definitions were exported to. This location is
     * typically a folder that contains multiple files. The URL should be in the
     * following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable
     * >folder-name</replaceable>/.
     * </p>
     *
     * @param s3UrlPrefix <p>
     *            The URL of the location in an Amazon Simple Storage Service
     *            (Amazon S3) bucket where the endpoint definitions were
     *            exported to. This location is typically a folder that contains
     *            multiple files. The URL should be in the following format:
     *            s3:/
     *            /<replaceable>bucket-name</replaceable>/<replaceable>folder
     *            -name</replaceable>/.
     *            </p>
     */
    public void setS3UrlPrefix(String s3UrlPrefix) {
        this.s3UrlPrefix = s3UrlPrefix;
    }

    /**
     * <p>
     * The URL of the location in an Amazon Simple Storage Service (Amazon S3)
     * bucket where the endpoint definitions were exported to. This location is
     * typically a folder that contains multiple files. The URL should be in the
     * following format:
     * s3://<replaceable>bucket-name</replaceable>/<replaceable
     * >folder-name</replaceable>/.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3UrlPrefix <p>
     *            The URL of the location in an Amazon Simple Storage Service
     *            (Amazon S3) bucket where the endpoint definitions were
     *            exported to. This location is typically a folder that contains
     *            multiple files. The URL should be in the following format:
     *            s3:/
     *            /<replaceable>bucket-name</replaceable>/<replaceable>folder
     *            -name</replaceable>/.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJobResource withS3UrlPrefix(String s3UrlPrefix) {
        this.s3UrlPrefix = s3UrlPrefix;
        return this;
    }

    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were
     * exported from. If this value isn't present, Amazon Pinpoint exported
     * definitions for all the endpoints that are associated with the
     * application.
     * </p>
     *
     * @return <p>
     *         The identifier for the segment that the endpoint definitions were
     *         exported from. If this value isn't present, Amazon Pinpoint
     *         exported definitions for all the endpoints that are associated
     *         with the application.
     *         </p>
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were
     * exported from. If this value isn't present, Amazon Pinpoint exported
     * definitions for all the endpoints that are associated with the
     * application.
     * </p>
     *
     * @param segmentId <p>
     *            The identifier for the segment that the endpoint definitions
     *            were exported from. If this value isn't present, Amazon
     *            Pinpoint exported definitions for all the endpoints that are
     *            associated with the application.
     *            </p>
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The identifier for the segment that the endpoint definitions were
     * exported from. If this value isn't present, Amazon Pinpoint exported
     * definitions for all the endpoints that are associated with the
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId <p>
     *            The identifier for the segment that the endpoint definitions
     *            were exported from. If this value isn't present, Amazon
     *            Pinpoint exported definitions for all the endpoints that are
     *            associated with the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJobResource withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported
     * from.
     * </p>
     *
     * @return <p>
     *         The version of the segment that the endpoint definitions were
     *         exported from.
     *         </p>
     */
    public Integer getSegmentVersion() {
        return segmentVersion;
    }

    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported
     * from.
     * </p>
     *
     * @param segmentVersion <p>
     *            The version of the segment that the endpoint definitions were
     *            exported from.
     *            </p>
     */
    public void setSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
    }

    /**
     * <p>
     * The version of the segment that the endpoint definitions were exported
     * from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentVersion <p>
     *            The version of the segment that the endpoint definitions were
     *            exported from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportJobResource withSegmentVersion(Integer segmentVersion) {
        this.segmentVersion = segmentVersion;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getS3UrlPrefix() != null)
            sb.append("S3UrlPrefix: " + getS3UrlPrefix() + ",");
        if (getSegmentId() != null)
            sb.append("SegmentId: " + getSegmentId() + ",");
        if (getSegmentVersion() != null)
            sb.append("SegmentVersion: " + getSegmentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getS3UrlPrefix() == null) ? 0 : getS3UrlPrefix().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentVersion() == null) ? 0 : getSegmentVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportJobResource == false)
            return false;
        ExportJobResource other = (ExportJobResource) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3UrlPrefix() == null ^ this.getS3UrlPrefix() == null)
            return false;
        if (other.getS3UrlPrefix() != null
                && other.getS3UrlPrefix().equals(this.getS3UrlPrefix()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null
                && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getSegmentVersion() == null ^ this.getSegmentVersion() == null)
            return false;
        if (other.getSegmentVersion() != null
                && other.getSegmentVersion().equals(this.getSegmentVersion()) == false)
            return false;
        return true;
    }
}
