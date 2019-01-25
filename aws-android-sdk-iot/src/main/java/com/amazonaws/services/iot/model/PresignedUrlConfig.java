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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration for pre-signed S3 URLs.
 * </p>
 */
public class PresignedUrlConfig implements Serializable {
    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files
     * from the S3 bucket where the job data/updates are stored. The role must
     * also grant permission for IoT to download the files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 3600 seconds. Pre-signed URLs are generated
     * when Jobs receives an MQTT request for the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     */
    private Long expiresInSec;

    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files
     * from the S3 bucket where the job data/updates are stored. The role must
     * also grant permission for IoT to download the files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of an IAM role that grants grants permission to download
     *         files from the S3 bucket where the job data/updates are stored.
     *         The role must also grant permission for IoT to download the
     *         files.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files
     * from the S3 bucket where the job data/updates are stored. The role must
     * also grant permission for IoT to download the files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that grants grants permission to
     *            download files from the S3 bucket where the job data/updates
     *            are stored. The role must also grant permission for IoT to
     *            download the files.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants grants permission to download files
     * from the S3 bucket where the job data/updates are stored. The role must
     * also grant permission for IoT to download the files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that grants grants permission to
     *            download files from the S3 bucket where the job data/updates
     *            are stored. The role must also grant permission for IoT to
     *            download the files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresignedUrlConfig withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 3600 seconds. Pre-signed URLs are generated
     * when Jobs receives an MQTT request for the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     *
     * @return <p>
     *         How long (in seconds) pre-signed URLs are valid. Valid values are
     *         60 - 3600, the default value is 3600 seconds. Pre-signed URLs are
     *         generated when Jobs receives an MQTT request for the job
     *         document.
     *         </p>
     */
    public Long getExpiresInSec() {
        return expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 3600 seconds. Pre-signed URLs are generated
     * when Jobs receives an MQTT request for the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     *
     * @param expiresInSec <p>
     *            How long (in seconds) pre-signed URLs are valid. Valid values
     *            are 60 - 3600, the default value is 3600 seconds. Pre-signed
     *            URLs are generated when Jobs receives an MQTT request for the
     *            job document.
     *            </p>
     */
    public void setExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 -
     * 3600, the default value is 3600 seconds. Pre-signed URLs are generated
     * when Jobs receives an MQTT request for the job document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     *
     * @param expiresInSec <p>
     *            How long (in seconds) pre-signed URLs are valid. Valid values
     *            are 60 - 3600, the default value is 3600 seconds. Pre-signed
     *            URLs are generated when Jobs receives an MQTT request for the
     *            job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresignedUrlConfig withExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
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
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getExpiresInSec() != null)
            sb.append("expiresInSec: " + getExpiresInSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getExpiresInSec() == null) ? 0 : getExpiresInSec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PresignedUrlConfig == false)
            return false;
        PresignedUrlConfig other = (PresignedUrlConfig) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getExpiresInSec() == null ^ this.getExpiresInSec() == null)
            return false;
        if (other.getExpiresInSec() != null
                && other.getExpiresInSec().equals(this.getExpiresInSec()) == false)
            return false;
        return true;
    }
}
