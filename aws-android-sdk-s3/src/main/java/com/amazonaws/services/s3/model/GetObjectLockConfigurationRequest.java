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
 * Gets the Object Lock configuration for a bucket. The rule specified in the
 * Object Lock configuration will be applied by default to every new object
 * placed in the specified bucket. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html"
 * >Locking Objects</a>.
 * </p>
 */
public class GetObjectLockConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The bucket whose Object Lock configuration you want to retrieve.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The bucket whose Object Lock configuration you want to retrieve.
     * </p>
     *
     * @return <p>
     *         The bucket whose Object Lock configuration you want to retrieve.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket whose Object Lock configuration you want to retrieve.
     * </p>
     *
     * @param bucket <p>
     *            The bucket whose Object Lock configuration you want to
     *            retrieve.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket whose Object Lock configuration you want to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket whose Object Lock configuration you want to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectLockConfigurationRequest withBucket(String bucket) {
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

        if (obj instanceof GetObjectLockConfigurationRequest == false)
            return false;
        GetObjectLockConfigurationRequest other = (GetObjectLockConfigurationRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
