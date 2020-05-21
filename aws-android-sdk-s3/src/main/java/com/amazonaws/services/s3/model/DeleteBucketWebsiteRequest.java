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
 * This operation removes the website configuration for a bucket. Amazon S3
 * returns a <code>200 OK</code> response upon successfully deleting a website
 * configuration on the specified bucket. You will get a <code>200 OK</code>
 * response if the website configuration you are trying to delete does not exist
 * on the bucket. Amazon S3 returns a <code>404</code> response if the bucket
 * specified in the request does not exist.
 * </p>
 * <p>
 * This DELETE operation requires the <code>S3:DeleteBucketWebsite</code>
 * permission. By default, only the bucket owner can delete the website
 * configuration attached to a bucket. However, bucket owners can grant other
 * users permission to delete the website configuration by writing a bucket
 * policy granting them the <code>S3:DeleteBucketWebsite</code> permission.
 * </p>
 * <p>
 * For more information about hosting websites, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
 * >Hosting Websites on Amazon S3</a>.
 * </p>
 * <p>
 * The following operations are related to <code>DeleteBucketWebsite</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketWebsite</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutBucketWebsite</a>
 * </p>
 * </li>
 * </ul>
 */
public class DeleteBucketWebsiteRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bucket name for which you want to remove the website configuration.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The bucket name for which you want to remove the website configuration.
     * </p>
     *
     * @return <p>
     *         The bucket name for which you want to remove the website
     *         configuration.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket name for which you want to remove the website configuration.
     * </p>
     *
     * @param bucket <p>
     *            The bucket name for which you want to remove the website
     *            configuration.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket name for which you want to remove the website configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket name for which you want to remove the website
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBucketWebsiteRequest withBucket(String bucket) {
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

        if (obj instanceof DeleteBucketWebsiteRequest == false)
            return false;
        DeleteBucketWebsiteRequest other = (DeleteBucketWebsiteRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        return true;
    }
}
