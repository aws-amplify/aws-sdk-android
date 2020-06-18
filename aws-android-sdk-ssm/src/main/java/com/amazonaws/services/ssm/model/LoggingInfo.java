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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an S3 bucket to write instance-level logs to.
 * </p>
 * <note>
 * <p>
 * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to
 * contain logs, instead use the <code>OutputS3BucketName</code> and
 * <code>OutputS3KeyPrefix</code> options in the
 * <code>TaskInvocationParameters</code> structure. For information about how
 * Systems Manager handles these options for the supported maintenance window
 * task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * </note>
 */
public class LoggingInfo implements Serializable {
    /**
     * <p>
     * The name of an S3 bucket where execution logs are stored .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     */
    private String s3BucketName;

    /**
     * <p>
     * (Optional) The S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * The Region where the S3 bucket is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     */
    private String s3Region;

    /**
     * <p>
     * The name of an S3 bucket where execution logs are stored .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @return <p>
     *         The name of an S3 bucket where execution logs are stored .
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The name of an S3 bucket where execution logs are stored .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param s3BucketName <p>
     *            The name of an S3 bucket where execution logs are stored .
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of an S3 bucket where execution logs are stored .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param s3BucketName <p>
     *            The name of an S3 bucket where execution logs are stored .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingInfo withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * (Optional) The S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         (Optional) The S3 bucket subfolder.
     *         </p>
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * <p>
     * (Optional) The S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param s3KeyPrefix <p>
     *            (Optional) The S3 bucket subfolder.
     *            </p>
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * (Optional) The S3 bucket subfolder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param s3KeyPrefix <p>
     *            (Optional) The S3 bucket subfolder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingInfo withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * <p>
     * The Region where the S3 bucket is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @return <p>
     *         The Region where the S3 bucket is located.
     *         </p>
     */
    public String getS3Region() {
        return s3Region;
    }

    /**
     * <p>
     * The Region where the S3 bucket is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param s3Region <p>
     *            The Region where the S3 bucket is located.
     *            </p>
     */
    public void setS3Region(String s3Region) {
        this.s3Region = s3Region;
    }

    /**
     * <p>
     * The Region where the S3 bucket is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param s3Region <p>
     *            The Region where the S3 bucket is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoggingInfo withS3Region(String s3Region) {
        this.s3Region = s3Region;
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
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getS3Region() != null)
            sb.append("S3Region: " + getS3Region());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getS3Region() == null) ? 0 : getS3Region().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingInfo == false)
            return false;
        LoggingInfo other = (LoggingInfo) obj;

        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null
                && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getS3Region() == null ^ this.getS3Region() == null)
            return false;
        if (other.getS3Region() != null && other.getS3Region().equals(this.getS3Region()) == false)
            return false;
        return true;
    }
}
