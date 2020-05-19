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

/**
 * <p>
 * Contains the output of DescribeRouteTables.
 * </p>
 */
public class DescribeRouteTablesResult implements Serializable {
    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     */
    private java.util.List<RouteTable> routeTables;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     *
     * @return <p>
     *         Information about one or more route tables.
     *         </p>
     */
    public java.util.List<RouteTable> getRouteTables() {
        return routeTables;
    }

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     *
     * @param routeTables <p>
     *            Information about one or more route tables.
     *            </p>
     */
    public void setRouteTables(java.util.Collection<RouteTable> routeTables) {
        if (routeTables == null) {
            this.routeTables = null;
            return;
        }

        this.routeTables = new java.util.ArrayList<RouteTable>(routeTables);
    }

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTables <p>
     *            Information about one or more route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRouteTablesResult withRouteTables(RouteTable... routeTables) {
        if (getRouteTables() == null) {
            this.routeTables = new java.util.ArrayList<RouteTable>(routeTables.length);
        }
        for (RouteTable value : routeTables) {
            this.routeTables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTables <p>
     *            Information about one or more route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRouteTablesResult withRouteTables(java.util.Collection<RouteTable> routeTables) {
        setRouteTables(routeTables);
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
    public DescribeRouteTablesResult withNextToken(String nextToken) {
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
        if (getRouteTables() != null)
            sb.append("RouteTables: " + getRouteTables() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRouteTables() == null) ? 0 : getRouteTables().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRouteTablesResult == false)
            return false;
        DescribeRouteTablesResult other = (DescribeRouteTablesResult) obj;

        if (other.getRouteTables() == null ^ this.getRouteTables() == null)
            return false;
        if (other.getRouteTables() != null
                && other.getRouteTables().equals(this.getRouteTables()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
