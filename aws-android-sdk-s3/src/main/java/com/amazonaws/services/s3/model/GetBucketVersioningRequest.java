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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the versioning state of a bucket.
 * </p>
 * <p>
 * To retrieve the versioning state of a bucket, you must be the bucket owner.
 * </p>
 * <p>
 * This implementation also returns the MFA Delete status of the versioning
 * state. If the MFA Delete status is <code>enabled</code>, the bucket owner
 * must use an authentication device to change the versioning state of the
 * bucket.
 * </p>
 * <p>
 * The following operations are related to <code>GetBucketVersioning</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteObject</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketVersioningRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket for which to get the versioning information.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the bucket for which to get the versioning information.
     * </p>
     *
     * @return <p>
     *         The name of the bucket for which to get the versioning
     *         information.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to get the versioning information.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket for which to get the versioning
     *            information.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to get the versioning information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket for which to get the versioning
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketVersioningRequest withBucket(String bucket) {
        this.bucket = bucket;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketVersioningRequest == false)
            return false;
        GetBucketVersioningRequest other = (GetBucketVersioningRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
