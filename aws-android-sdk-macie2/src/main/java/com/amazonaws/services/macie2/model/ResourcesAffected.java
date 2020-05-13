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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the resources that a finding applies to.
 * </p>
 */
public class ResourcesAffected implements Serializable {
    /**
     * <p>
     * An array of objects, one for each S3 bucket that the finding applies to.
     * Each object provides a set of metadata about an affected S3 bucket.
     * </p>
     */
    private S3Bucket s3Bucket;

    /**
     * <p>
     * An array of objects, one for each S3 object that the finding applies to.
     * Each object provides a set of metadata about an affected S3 object.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * An array of objects, one for each S3 bucket that the finding applies to.
     * Each object provides a set of metadata about an affected S3 bucket.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each S3 bucket that the finding
     *         applies to. Each object provides a set of metadata about an
     *         affected S3 bucket.
     *         </p>
     */
    public S3Bucket getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * An array of objects, one for each S3 bucket that the finding applies to.
     * Each object provides a set of metadata about an affected S3 bucket.
     * </p>
     *
     * @param s3Bucket <p>
     *            An array of objects, one for each S3 bucket that the finding
     *            applies to. Each object provides a set of metadata about an
     *            affected S3 bucket.
     *            </p>
     */
    public void setS3Bucket(S3Bucket s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * An array of objects, one for each S3 bucket that the finding applies to.
     * Each object provides a set of metadata about an affected S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Bucket <p>
     *            An array of objects, one for each S3 bucket that the finding
     *            applies to. Each object provides a set of metadata about an
     *            affected S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcesAffected withS3Bucket(S3Bucket s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each S3 object that the finding applies to.
     * Each object provides a set of metadata about an affected S3 object.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each S3 object that the finding
     *         applies to. Each object provides a set of metadata about an
     *         affected S3 object.
     *         </p>
     */
    public S3Object getS3Object() {
        return s3Object;
    }

    /**
     * <p>
     * An array of objects, one for each S3 object that the finding applies to.
     * Each object provides a set of metadata about an affected S3 object.
     * </p>
     *
     * @param s3Object <p>
     *            An array of objects, one for each S3 object that the finding
     *            applies to. Each object provides a set of metadata about an
     *            affected S3 object.
     *            </p>
     */
    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * An array of objects, one for each S3 object that the finding applies to.
     * Each object provides a set of metadata about an affected S3 object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Object <p>
     *            An array of objects, one for each S3 object that the finding
     *            applies to. Each object provides a set of metadata about an
     *            affected S3 object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourcesAffected withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
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
        if (getS3Bucket() != null)
            sb.append("s3Bucket: " + getS3Bucket() + ",");
        if (getS3Object() != null)
            sb.append("s3Object: " + getS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcesAffected == false)
            return false;
        ResourcesAffected other = (ResourcesAffected) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        return true;
    }
}
