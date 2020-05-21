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
 * Specifies the inventory configuration for an Amazon S3 bucket.
 * </p>
 */
public class InventoryDestination implements Serializable {
    /**
     * <p>
     * Contains the bucket name, file format, bucket owner (optional), and
     * prefix (optional) where inventory results are published.
     * </p>
     */
    private InventoryS3BucketDestination s3BucketDestination;

    /**
     * <p>
     * Contains the bucket name, file format, bucket owner (optional), and
     * prefix (optional) where inventory results are published.
     * </p>
     *
     * @return <p>
     *         Contains the bucket name, file format, bucket owner (optional),
     *         and prefix (optional) where inventory results are published.
     *         </p>
     */
    public InventoryS3BucketDestination getS3BucketDestination() {
        return s3BucketDestination;
    }

    /**
     * <p>
     * Contains the bucket name, file format, bucket owner (optional), and
     * prefix (optional) where inventory results are published.
     * </p>
     *
     * @param s3BucketDestination <p>
     *            Contains the bucket name, file format, bucket owner
     *            (optional), and prefix (optional) where inventory results are
     *            published.
     *            </p>
     */
    public void setS3BucketDestination(InventoryS3BucketDestination s3BucketDestination) {
        this.s3BucketDestination = s3BucketDestination;
    }

    /**
     * <p>
     * Contains the bucket name, file format, bucket owner (optional), and
     * prefix (optional) where inventory results are published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3BucketDestination <p>
     *            Contains the bucket name, file format, bucket owner
     *            (optional), and prefix (optional) where inventory results are
     *            published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryDestination withS3BucketDestination(
            InventoryS3BucketDestination s3BucketDestination) {
        this.s3BucketDestination = s3BucketDestination;
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
        if (getS3BucketDestination() != null)
            sb.append("S3BucketDestination: " + getS3BucketDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3BucketDestination() == null) ? 0 : getS3BucketDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryDestination == false)
            return false;
        InventoryDestination other = (InventoryDestination) obj;

        if (other.getS3BucketDestination() == null ^ this.getS3BucketDestination() == null)
            return false;
        if (other.getS3BucketDestination() != null
                && other.getS3BucketDestination().equals(this.getS3BucketDestination()) == false)
            return false;
        return true;
    }
}
