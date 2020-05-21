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
 * Returns the cors configuration information set for the bucket.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * s3:GetBucketCORS action. By default, the bucket owner has this permission and
 * can grant it to others.
 * </p>
 * <p>
 * For more information about cors, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html"> Enabling
 * Cross-Origin Resource Sharing</a>.
 * </p>
 * <p>
 * The following operations are related to <code>GetBucketCors</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutBucketCors</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketCors</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetBucketCorsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name for which to get the cors configuration.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The bucket name for which to get the cors configuration.
     * </p>
     *
     * @return <p>
     *         The bucket name for which to get the cors configuration.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name for which to get the cors configuration.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name for which to get the cors configuration.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name for which to get the cors configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name for which to get the cors configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketCorsRequest withBucket(String bucket) {
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

        if (obj instanceof GetBucketCorsRequest == false)
            return false;
        GetBucketCorsRequest other = (GetBucketCorsRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
