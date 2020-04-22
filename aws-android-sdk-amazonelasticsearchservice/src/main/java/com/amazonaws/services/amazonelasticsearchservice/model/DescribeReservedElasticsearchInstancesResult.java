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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Container for results from
 * <code>DescribeReservedElasticsearchInstances</code>
 * </p>
 */
public class DescribeReservedElasticsearchInstancesResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of reserved Elasticsearch instances.
     * </p>
     */
    private java.util.List<ReservedElasticsearchInstance> reservedElasticsearchInstances;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @return <p>
     *         Provides an identifier to allow retrieval of paginated results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @param nextToken <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstancesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * List of reserved Elasticsearch instances.
     * </p>
     *
     * @return <p>
     *         List of reserved Elasticsearch instances.
     *         </p>
     */
    public java.util.List<ReservedElasticsearchInstance> getReservedElasticsearchInstances() {
        return reservedElasticsearchInstances;
    }

    /**
     * <p>
     * List of reserved Elasticsearch instances.
     * </p>
     *
     * @param reservedElasticsearchInstances <p>
     *            List of reserved Elasticsearch instances.
     *            </p>
     */
    public void setReservedElasticsearchInstances(
            java.util.Collection<ReservedElasticsearchInstance> reservedElasticsearchInstances) {
        if (reservedElasticsearchInstances == null) {
            this.reservedElasticsearchInstances = null;
            return;
        }

        this.reservedElasticsearchInstances = new java.util.ArrayList<ReservedElasticsearchInstance>(
                reservedElasticsearchInstances);
    }

    /**
     * <p>
     * List of reserved Elasticsearch instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedElasticsearchInstances <p>
     *            List of reserved Elasticsearch instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstancesResult withReservedElasticsearchInstances(
            ReservedElasticsearchInstance... reservedElasticsearchInstances) {
        if (getReservedElasticsearchInstances() == null) {
            this.reservedElasticsearchInstances = new java.util.ArrayList<ReservedElasticsearchInstance>(
                    reservedElasticsearchInstances.length);
        }
        for (ReservedElasticsearchInstance value : reservedElasticsearchInstances) {
            this.reservedElasticsearchInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of reserved Elasticsearch instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedElasticsearchInstances <p>
     *            List of reserved Elasticsearch instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstancesResult withReservedElasticsearchInstances(
            java.util.Collection<ReservedElasticsearchInstance> reservedElasticsearchInstances) {
        setReservedElasticsearchInstances(reservedElasticsearchInstances);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getReservedElasticsearchInstances() != null)
            sb.append("ReservedElasticsearchInstances: " + getReservedElasticsearchInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedElasticsearchInstances() == null) ? 0
                        : getReservedElasticsearchInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedElasticsearchInstancesResult == false)
            return false;
        DescribeReservedElasticsearchInstancesResult other = (DescribeReservedElasticsearchInstancesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservedElasticsearchInstances() == null
                ^ this.getReservedElasticsearchInstances() == null)
            return false;
        if (other.getReservedElasticsearchInstances() != null
                && other.getReservedElasticsearchInstances().equals(
                        this.getReservedElasticsearchInstances()) == false)
            return false;
        return true;
    }
}
