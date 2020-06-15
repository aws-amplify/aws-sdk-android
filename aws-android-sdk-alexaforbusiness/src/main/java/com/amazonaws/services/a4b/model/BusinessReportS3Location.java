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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The S3 location of the output reports.
 * </p>
 */
public class BusinessReportS3Location implements Serializable {
    /**
     * <p>
     * The path of the business report.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     */
    private String bucketName;

    /**
     * <p>
     * The path of the business report.
     * </p>
     *
     * @return <p>
     *         The path of the business report.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path of the business report.
     * </p>
     *
     * @param path <p>
     *            The path of the business report.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the business report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The path of the business report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportS3Location withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @return <p>
     *         The S3 bucket name of the output reports.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @param bucketName <p>
     *            The S3 bucket name of the output reports.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @param bucketName <p>
     *            The S3 bucket name of the output reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportS3Location withBucketName(String bucketName) {
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReportS3Location == false)
            return false;
        BusinessReportS3Location other = (BusinessReportS3Location) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        return true;
    }
}
