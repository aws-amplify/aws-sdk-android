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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeIpv6PoolsResult implements Serializable {
    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     */
    private java.util.List<Ipv6Pool> ipv6Pools;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     *
     * @return <p>
     *         Information about the IPv6 address pools.
     *         </p>
     */
    public java.util.List<Ipv6Pool> getIpv6Pools() {
        return ipv6Pools;
    }

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     *
     * @param ipv6Pools <p>
     *            Information about the IPv6 address pools.
     *            </p>
     */
    public void setIpv6Pools(java.util.Collection<Ipv6Pool> ipv6Pools) {
        if (ipv6Pools == null) {
            this.ipv6Pools = null;
            return;
        }

        this.ipv6Pools = new java.util.ArrayList<Ipv6Pool>(ipv6Pools);
    }

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Pools <p>
     *            Information about the IPv6 address pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIpv6PoolsResult withIpv6Pools(Ipv6Pool... ipv6Pools) {
        if (getIpv6Pools() == null) {
            this.ipv6Pools = new java.util.ArrayList<Ipv6Pool>(ipv6Pools.length);
        }
        for (Ipv6Pool value : ipv6Pools) {
            this.ipv6Pools.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Pools <p>
     *            Information about the IPv6 address pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIpv6PoolsResult withIpv6Pools(java.util.Collection<Ipv6Pool> ipv6Pools) {
        setIpv6Pools(ipv6Pools);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIpv6PoolsResult withNextToken(String nextToken) {
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
        if (getIpv6Pools() != null)
            sb.append("Ipv6Pools: " + getIpv6Pools() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6Pools() == null) ? 0 : getIpv6Pools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIpv6PoolsResult == false)
            return false;
        DescribeIpv6PoolsResult other = (DescribeIpv6PoolsResult) obj;

        if (other.getIpv6Pools() == null ^ this.getIpv6Pools() == null)
            return false;
        if (other.getIpv6Pools() != null
                && other.getIpv6Pools().equals(this.getIpv6Pools()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
