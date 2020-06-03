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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * The S3 location for importing the package specified as
 * <code>S3BucketName</code> and <code>S3Key</code>
 * </p>
 */
public class PackageSource implements Serializable {
    /**
     * <p>
     * Name of the bucket containing the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     */
    private String s3BucketName;

    /**
     * <p>
     * Key (file name) of the package.
     * </p>
     */
    private String s3Key;

    /**
     * <p>
     * Name of the bucket containing the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @return <p>
     *         Name of the bucket containing the package.
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * Name of the bucket containing the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param s3BucketName <p>
     *            Name of the bucket containing the package.
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Name of the bucket containing the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param s3BucketName <p>
     *            Name of the bucket containing the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageSource withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * Key (file name) of the package.
     * </p>
     *
     * @return <p>
     *         Key (file name) of the package.
     *         </p>
     */
    public String getS3Key() {
        return s3Key;
    }

    /**
     * <p>
     * Key (file name) of the package.
     * </p>
     *
     * @param s3Key <p>
     *            Key (file name) of the package.
     *            </p>
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * Key (file name) of the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Key <p>
     *            Key (file name) of the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageSource withS3Key(String s3Key) {
        this.s3Key = s3Key;
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
        if (getS3Key() != null)
            sb.append("S3Key: " + getS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageSource == false)
            return false;
        PackageSource other = (PackageSource) obj;

        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        return true;
    }
}
