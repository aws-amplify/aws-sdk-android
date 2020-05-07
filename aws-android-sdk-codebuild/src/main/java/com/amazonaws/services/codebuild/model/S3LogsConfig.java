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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about S3 logs for a build project.
 * </p>
 */
public class S3LogsConfig implements Serializable {
    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build
     * project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String status;

    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon
     * S3 bucket name is <code>my-bucket</code>, and your path prefix is
     * <code>build-log</code>, then acceptable formats are
     * <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By
     * default S3 build logs are encrypted.
     * </p>
     */
    private Boolean encryptionDisabled;

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build
     * project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The current status of the S3 build logs. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code>: S3 build logs are enabled for this build
     *         project.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code>: S3 build logs are not enabled for this
     *         build project.
     *         </p>
     *         </li>
     *         </ul>
     * @see LogsConfigStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build
     * project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the S3 build logs. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: S3 build logs are enabled for this build
     *            project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: S3 build logs are not enabled for this
     *            build project.
     *            </p>
     *            </li>
     *            </ul>
     * @see LogsConfigStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build
     * project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the S3 build logs. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: S3 build logs are enabled for this build
     *            project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: S3 build logs are not enabled for this
     *            build project.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogsConfigStatusType
     */
    public S3LogsConfig withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build
     * project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the S3 build logs. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: S3 build logs are enabled for this build
     *            project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: S3 build logs are not enabled for this
     *            build project.
     *            </p>
     *            </li>
     *            </ul>
     * @see LogsConfigStatusType
     */
    public void setStatus(LogsConfigStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build
     * project.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            The current status of the S3 build logs. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code>: S3 build logs are enabled for this build
     *            project.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code>: S3 build logs are not enabled for this
     *            build project.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogsConfigStatusType
     */
    public S3LogsConfig withStatus(LogsConfigStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon
     * S3 bucket name is <code>my-bucket</code>, and your path prefix is
     * <code>build-log</code>, then acceptable formats are
     * <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     *
     * @return <p>
     *         The ARN of an S3 bucket and the path prefix for S3 logs. If your
     *         Amazon S3 bucket name is <code>my-bucket</code>, and your path
     *         prefix is <code>build-log</code>, then acceptable formats are
     *         <code>my-bucket/build-log</code> or
     *         <code>arn:aws:s3:::my-bucket/build-log</code>.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon
     * S3 bucket name is <code>my-bucket</code>, and your path prefix is
     * <code>build-log</code>, then acceptable formats are
     * <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     *
     * @param location <p>
     *            The ARN of an S3 bucket and the path prefix for S3 logs. If
     *            your Amazon S3 bucket name is <code>my-bucket</code>, and your
     *            path prefix is <code>build-log</code>, then acceptable formats
     *            are <code>my-bucket/build-log</code> or
     *            <code>arn:aws:s3:::my-bucket/build-log</code>.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon
     * S3 bucket name is <code>my-bucket</code>, and your path prefix is
     * <code>build-log</code>, then acceptable formats are
     * <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The ARN of an S3 bucket and the path prefix for S3 logs. If
     *            your Amazon S3 bucket name is <code>my-bucket</code>, and your
     *            path prefix is <code>build-log</code>, then acceptable formats
     *            are <code>my-bucket/build-log</code> or
     *            <code>arn:aws:s3:::my-bucket/build-log</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3LogsConfig withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By
     * default S3 build logs are encrypted.
     * </p>
     *
     * @return <p>
     *         Set to true if you do not want your S3 build log output
     *         encrypted. By default S3 build logs are encrypted.
     *         </p>
     */
    public Boolean isEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By
     * default S3 build logs are encrypted.
     * </p>
     *
     * @return <p>
     *         Set to true if you do not want your S3 build log output
     *         encrypted. By default S3 build logs are encrypted.
     *         </p>
     */
    public Boolean getEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By
     * default S3 build logs are encrypted.
     * </p>
     *
     * @param encryptionDisabled <p>
     *            Set to true if you do not want your S3 build log output
     *            encrypted. By default S3 build logs are encrypted.
     *            </p>
     */
    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By
     * default S3 build logs are encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionDisabled <p>
     *            Set to true if you do not want your S3 build log output
     *            encrypted. By default S3 build logs are encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3LogsConfig withEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getEncryptionDisabled() != null)
            sb.append("encryptionDisabled: " + getEncryptionDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3LogsConfig == false)
            return false;
        S3LogsConfig other = (S3LogsConfig) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null
                && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        return true;
    }
}
