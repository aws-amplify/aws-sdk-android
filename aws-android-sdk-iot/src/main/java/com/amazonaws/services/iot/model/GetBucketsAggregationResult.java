/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class GetBucketsAggregationResult implements Serializable {
    /**
     * <p>
     * The total number of documents that fit the query string criteria and
     * contain a value for the Aggregation field targeted in the request.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket
     * contains a <code>keyValue</code> and a <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the
     * particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     */
    private java.util.List<Bucket> buckets;

    /**
     * <p>
     * The total number of documents that fit the query string criteria and
     * contain a value for the Aggregation field targeted in the request.
     * </p>
     *
     * @return <p>
     *         The total number of documents that fit the query string criteria
     *         and contain a value for the Aggregation field targeted in the
     *         request.
     *         </p>
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of documents that fit the query string criteria and
     * contain a value for the Aggregation field targeted in the request.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of documents that fit the query string
     *            criteria and contain a value for the Aggregation field
     *            targeted in the request.
     *            </p>
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of documents that fit the query string criteria and
     * contain a value for the Aggregation field targeted in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of documents that fit the query string
     *            criteria and contain a value for the Aggregation field
     *            targeted in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket
     * contains a <code>keyValue</code> and a <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the
     * particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     *
     * @return <p>
     *         The main part of the response with a list of buckets. Each bucket
     *         contains a <code>keyValue</code> and a <code>count</code>.
     *         </p>
     *         <p>
     *         <code>keyValue</code>: The aggregation field value counted for
     *         the particular bucket.
     *         </p>
     *         <p>
     *         <code>count</code>: The number of documents that have that value.
     *         </p>
     */
    public java.util.List<Bucket> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket
     * contains a <code>keyValue</code> and a <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the
     * particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     *
     * @param buckets <p>
     *            The main part of the response with a list of buckets. Each
     *            bucket contains a <code>keyValue</code> and a
     *            <code>count</code>.
     *            </p>
     *            <p>
     *            <code>keyValue</code>: The aggregation field value counted for
     *            the particular bucket.
     *            </p>
     *            <p>
     *            <code>count</code>: The number of documents that have that
     *            value.
     *            </p>
     */
    public void setBuckets(java.util.Collection<Bucket> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<Bucket>(buckets);
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket
     * contains a <code>keyValue</code> and a <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the
     * particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            The main part of the response with a list of buckets. Each
     *            bucket contains a <code>keyValue</code> and a
     *            <code>count</code>.
     *            </p>
     *            <p>
     *            <code>keyValue</code>: The aggregation field value counted for
     *            the particular bucket.
     *            </p>
     *            <p>
     *            <code>count</code>: The number of documents that have that
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationResult withBuckets(Bucket... buckets) {
        if (getBuckets() == null) {
            this.buckets = new java.util.ArrayList<Bucket>(buckets.length);
        }
        for (Bucket value : buckets) {
            this.buckets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The main part of the response with a list of buckets. Each bucket
     * contains a <code>keyValue</code> and a <code>count</code>.
     * </p>
     * <p>
     * <code>keyValue</code>: The aggregation field value counted for the
     * particular bucket.
     * </p>
     * <p>
     * <code>count</code>: The number of documents that have that value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            The main part of the response with a list of buckets. Each
     *            bucket contains a <code>keyValue</code> and a
     *            <code>count</code>.
     *            </p>
     *            <p>
     *            <code>keyValue</code>: The aggregation field value counted for
     *            the particular bucket.
     *            </p>
     *            <p>
     *            <code>count</code>: The number of documents that have that
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationResult withBuckets(java.util.Collection<Bucket> buckets) {
        setBuckets(buckets);
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
        if (getTotalCount() != null)
            sb.append("totalCount: " + getTotalCount() + ",");
        if (getBuckets() != null)
            sb.append("buckets: " + getBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketsAggregationResult == false)
            return false;
        GetBucketsAggregationResult other = (GetBucketsAggregationResult) obj;

        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        return true;
    }
}
