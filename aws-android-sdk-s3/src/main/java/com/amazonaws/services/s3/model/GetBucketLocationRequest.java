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
 * Returns the Region the bucket resides in. You set the bucket's Region using
 * the <code>LocationConstraint</code> request parameter in a
 * <code>CreateBucket</code> request. For more information, see
 * <a>CreateBucket</a>.
 * </p>
 * <p>
 * To use this implementation of the operation, you must be the bucket owner.
 * </p>
 * <p>
 * The following operations are related to <code>GetBucketLocation</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateBucket</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketLocationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket for which to get the location.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the bucket for which to get the location.
     * </p>
     *
     * @return <p>
     *         The name of the bucket for which to get the location.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to get the location.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket for which to get the location.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket for which to get the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket for which to get the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketLocationRequest withBucket(String bucket) {
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

        if (obj instanceof GetBucketLocationRequest == false)
            return false;
        GetBucketLocationRequest other = (GetBucketLocationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
