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
 * Deletes the <code>cors</code> configuration information set for the bucket.
 * </p>
 * <p>
 * To use this operation, you must have permission to perform the
 * <code>s3:PutBucketCORS</code> action. The bucket owner has this permission by
 * default and can grant this permission to others.
 * </p>
 * <p>
 * For information about <code>cors</code>, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling
 * Cross-Origin Resource Sharing</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p class="title">
 * <b>Related Resources:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * <a>RESTOPTIONSobject</a>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteBucketCorsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the bucket whose <code>cors</code> configuration is being
     * deleted.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Specifies the bucket whose <code>cors</code> configuration is being
     * deleted.
     * </p>
     *
     * @return <p>
     *         Specifies the bucket whose <code>cors</code> configuration is
     *         being deleted.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Specifies the bucket whose <code>cors</code> configuration is being
     * deleted.
     * </p>
     *
     * @param bucket <p>
     *            Specifies the bucket whose <code>cors</code> configuration is
     *            being deleted.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Specifies the bucket whose <code>cors</code> configuration is being
     * deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Specifies the bucket whose <code>cors</code> configuration is
     *            being deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBucketCorsRequest withBucket(String bucket) {
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

        if (obj instanceof DeleteBucketCorsRequest == false)
            return false;
        DeleteBucketCorsRequest other = (DeleteBucketCorsRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
