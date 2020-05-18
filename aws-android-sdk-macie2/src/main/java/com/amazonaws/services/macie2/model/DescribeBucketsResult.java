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

public class DescribeBucketsResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each bucket that meets the filter criteria
     * specified in the request.
     * </p>
     */
    private java.util.List<BucketMetadata> buckets;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each bucket that meets the filter criteria
     * specified in the request.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each bucket that meets the filter
     *         criteria specified in the request.
     *         </p>
     */
    public java.util.List<BucketMetadata> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * An array of objects, one for each bucket that meets the filter criteria
     * specified in the request.
     * </p>
     *
     * @param buckets <p>
     *            An array of objects, one for each bucket that meets the filter
     *            criteria specified in the request.
     *            </p>
     */
    public void setBuckets(java.util.Collection<BucketMetadata> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<BucketMetadata>(buckets);
    }

    /**
     * <p>
     * An array of objects, one for each bucket that meets the filter criteria
     * specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            An array of objects, one for each bucket that meets the filter
     *            criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBucketsResult withBuckets(BucketMetadata... buckets) {
        if (getBuckets() == null) {
            this.buckets = new java.util.ArrayList<BucketMetadata>(buckets.length);
        }
        for (BucketMetadata value : buckets) {
            this.buckets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each bucket that meets the filter criteria
     * specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            An array of objects, one for each bucket that meets the filter
     *            criteria specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBucketsResult withBuckets(java.util.Collection<BucketMetadata> buckets) {
        setBuckets(buckets);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @return <p>
     *         The string to use in a subsequent request to get the next page of
     *         results in a paginated response. This value is null if there are
     *         no additional pages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBucketsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getBuckets() != null)
            sb.append("buckets: " + getBuckets() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBucketsResult == false)
            return false;
        DescribeBucketsResult other = (DescribeBucketsResult) obj;

        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
