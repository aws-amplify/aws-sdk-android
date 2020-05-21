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
 * Configures the transfer acceleration state for an Amazon S3 bucket. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html"
 * >Amazon S3 Transfer Acceleration</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 */
public class AccelerateConfiguration implements Serializable {
    /**
     * <p>
     * Specifies the transfer acceleration status of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     */
    private String status;

    /**
     * <p>
     * Specifies the transfer acceleration status of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @return <p>
     *         Specifies the transfer acceleration status of the bucket.
     *         </p>
     * @see BucketAccelerateStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the transfer acceleration status of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            Specifies the transfer acceleration status of the bucket.
     *            </p>
     * @see BucketAccelerateStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the transfer acceleration status of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            Specifies the transfer acceleration status of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketAccelerateStatus
     */
    public AccelerateConfiguration withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the transfer acceleration status of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            Specifies the transfer acceleration status of the bucket.
     *            </p>
     * @see BucketAccelerateStatus
     */
    public void setStatus(BucketAccelerateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies the transfer acceleration status of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            Specifies the transfer acceleration status of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketAccelerateStatus
     */
    public AccelerateConfiguration withStatus(BucketAccelerateStatus status) {
        this.status = status.toString();
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
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccelerateConfiguration == false)
            return false;
        AccelerateConfiguration other = (AccelerateConfiguration) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
