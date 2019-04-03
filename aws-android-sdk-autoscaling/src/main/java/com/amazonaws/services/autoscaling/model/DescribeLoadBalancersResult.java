/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class DescribeLoadBalancersResult implements Serializable {
    /**
     * <p>
     * The load balancers.
     * </p>
     */
    private java.util.List<LoadBalancerState> loadBalancers = new java.util.ArrayList<LoadBalancerState>();

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The load balancers.
     * </p>
     *
     * @return <p>
     *         The load balancers.
     *         </p>
     */
    public java.util.List<LoadBalancerState> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * The load balancers.
     * </p>
     *
     * @param loadBalancers <p>
     *            The load balancers.
     *            </p>
     */
    public void setLoadBalancers(java.util.Collection<LoadBalancerState> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new java.util.ArrayList<LoadBalancerState>(loadBalancers);
    }

    /**
     * <p>
     * The load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            The load balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersResult withLoadBalancers(LoadBalancerState... loadBalancers) {
        if (getLoadBalancers() == null) {
            this.loadBalancers = new java.util.ArrayList<LoadBalancerState>(loadBalancers.length);
        }
        for (LoadBalancerState value : loadBalancers) {
            this.loadBalancers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            The load balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersResult withLoadBalancers(
            java.util.Collection<LoadBalancerState> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A string that indicates that the response contains more items
     *         than can be returned in a single response. To receive additional
     *         items, specify this string for the <code>NextToken</code> value
     *         when requesting the next set of items. This value is null when
     *         there are no more items to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            A string that indicates that the response contains more items
     *            than can be returned in a single response. To receive
     *            additional items, specify this string for the
     *            <code>NextToken</code> value when requesting the next set of
     *            items. This value is null when there are no more items to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            A string that indicates that the response contains more items
     *            than can be returned in a single response. To receive
     *            additional items, specify this string for the
     *            <code>NextToken</code> value when requesting the next set of
     *            items. This value is null when there are no more items to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersResult withNextToken(String nextToken) {
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
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: " + getLoadBalancers() + ",");
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
                + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancersResult == false)
            return false;
        DescribeLoadBalancersResult other = (DescribeLoadBalancersResult) obj;

        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null
                && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
