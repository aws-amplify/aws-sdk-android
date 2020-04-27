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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * The settings in JSON format for the DMS Transfer type source endpoint.
 * </p>
 */
public class DmsTransferSettings implements Serializable {
    /**
     * <p>
     * The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * The name of the S3 bucket to use.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         The IAM role that has permission to access the Amazon S3 bucket.
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The IAM role that has permission to access the Amazon S3
     *            bucket.
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The IAM role that has permission to access the Amazon S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DmsTransferSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket to use.
     * </p>
     *
     * @return <p>
     *         The name of the S3 bucket to use.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket to use.
     * </p>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket to use.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            The name of the S3 bucket to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DmsTransferSettings withBucketName(String bucketName) {
        this.bucketName = bucketName;
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
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: " + getServiceAccessRoleArn() + ",");
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DmsTransferSettings == false)
            return false;
        DmsTransferSettings other = (DmsTransferSettings) obj;

        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null
                && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        return true;
    }
}
