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
 * Lists the analytics configurations for the bucket. You can have up to 1,000
 * analytics configurations per bucket.
 * </p>
 * <p>
 * This operation supports list pagination and does not return more than 100
 * configurations at a time. You should always check the
 * <code>IsTruncated</code> element in the response. If there are no more
 * configurations to list, <code>IsTruncated</code> is set to false. If there
 * are more configurations to list, <code>IsTruncated</code> is set to true, and
 * there will be a value in <code>NextContinuationToken</code>. You use the
 * <code>NextContinuationToken</code> value to continue the pagination of the
 * list by passing the value in continuation-token in the request to
 * <code>GET</code> the next page.
 * </p>
 * <p>
 * To use this operation, you must have permissions to perform the
 * <code>s3:GetAnalyticsConfiguration</code> action. The bucket owner has this
 * permission by default. The bucket owner can grant this permission to others.
 * For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <p>
 * For information about Amazon S3 analytics feature, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html"
 * >Amazon S3 Analytics – Storage Class Analysis</a>.
 * </p>
 * <p>
 * The following operations are related to
 * <code>ListBucketAnalyticsConfigurations</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketAnalyticsConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketAnalyticsConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutBucketAnalyticsConfiguration</a>
 * </p>
 * </li>
 * </ul>
 */
public class ListBucketAnalyticsConfigurationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the bucket from which analytics configurations are retrieved.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The ContinuationToken that represents a placeholder from where this
     * request should begin.
     * </p>
     */
    private String continuationToken;

    /**
     * <p>
     * The name of the bucket from which analytics configurations are retrieved.
     * </p>
     *
     * @return <p>
     *         The name of the bucket from which analytics configurations are
     *         retrieved.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket from which analytics configurations are retrieved.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket from which analytics configurations are
     *            retrieved.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket from which analytics configurations are retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket from which analytics configurations are
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketAnalyticsConfigurationsRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The ContinuationToken that represents a placeholder from where this
     * request should begin.
     * </p>
     *
     * @return <p>
     *         The ContinuationToken that represents a placeholder from where
     *         this request should begin.
     *         </p>
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * The ContinuationToken that represents a placeholder from where this
     * request should begin.
     * </p>
     *
     * @param continuationToken <p>
     *            The ContinuationToken that represents a placeholder from where
     *            this request should begin.
     *            </p>
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * The ContinuationToken that represents a placeholder from where this
     * request should begin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuationToken <p>
     *            The ContinuationToken that represents a placeholder from where
     *            this request should begin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketAnalyticsConfigurationsRequest withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
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
            sb.append("Bucket: " + getBucket() + ",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: " + getContinuationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode
                + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBucketAnalyticsConfigurationsRequest == false)
            return false;
        ListBucketAnalyticsConfigurationsRequest other = (ListBucketAnalyticsConfigurationsRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null
                && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        return true;
    }
}
