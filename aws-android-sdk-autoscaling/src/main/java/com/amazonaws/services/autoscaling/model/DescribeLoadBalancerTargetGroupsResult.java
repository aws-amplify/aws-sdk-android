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

public class DescribeLoadBalancerTargetGroupsResult implements Serializable {
    /**
     * <p>
     * Information about the target groups.
     * </p>
     */
    private java.util.List<LoadBalancerTargetGroupState> loadBalancerTargetGroups = new java.util.ArrayList<LoadBalancerTargetGroupState>();

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the target groups.
     * </p>
     *
     * @return <p>
     *         Information about the target groups.
     *         </p>
     */
    public java.util.List<LoadBalancerTargetGroupState> getLoadBalancerTargetGroups() {
        return loadBalancerTargetGroups;
    }

    /**
     * <p>
     * Information about the target groups.
     * </p>
     *
     * @param loadBalancerTargetGroups <p>
     *            Information about the target groups.
     *            </p>
     */
    public void setLoadBalancerTargetGroups(
            java.util.Collection<LoadBalancerTargetGroupState> loadBalancerTargetGroups) {
        if (loadBalancerTargetGroups == null) {
            this.loadBalancerTargetGroups = null;
            return;
        }

        this.loadBalancerTargetGroups = new java.util.ArrayList<LoadBalancerTargetGroupState>(
                loadBalancerTargetGroups);
    }

    /**
     * <p>
     * Information about the target groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerTargetGroups <p>
     *            Information about the target groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerTargetGroupsResult withLoadBalancerTargetGroups(
            LoadBalancerTargetGroupState... loadBalancerTargetGroups) {
        if (getLoadBalancerTargetGroups() == null) {
            this.loadBalancerTargetGroups = new java.util.ArrayList<LoadBalancerTargetGroupState>(
                    loadBalancerTargetGroups.length);
        }
        for (LoadBalancerTargetGroupState value : loadBalancerTargetGroups) {
            this.loadBalancerTargetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the target groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerTargetGroups <p>
     *            Information about the target groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerTargetGroupsResult withLoadBalancerTargetGroups(
            java.util.Collection<LoadBalancerTargetGroupState> loadBalancerTargetGroups) {
        setLoadBalancerTargetGroups(loadBalancerTargetGroups);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
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
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerTargetGroupsResult withNextToken(String nextToken) {
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
        if (getLoadBalancerTargetGroups() != null)
            sb.append("LoadBalancerTargetGroups: " + getLoadBalancerTargetGroups() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLoadBalancerTargetGroups() == null) ? 0 : getLoadBalancerTargetGroups()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancerTargetGroupsResult == false)
            return false;
        DescribeLoadBalancerTargetGroupsResult other = (DescribeLoadBalancerTargetGroupsResult) obj;

        if (other.getLoadBalancerTargetGroups() == null
                ^ this.getLoadBalancerTargetGroups() == null)
            return false;
        if (other.getLoadBalancerTargetGroups() != null
                && other.getLoadBalancerTargetGroups().equals(this.getLoadBalancerTargetGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
