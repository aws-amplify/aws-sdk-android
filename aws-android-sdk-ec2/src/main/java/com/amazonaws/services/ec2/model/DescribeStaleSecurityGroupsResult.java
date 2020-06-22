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

public class DescribeStaleSecurityGroupsResult implements Serializable {
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     */
    private java.util.List<StaleSecurityGroup> staleSecurityGroupSet;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
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
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStaleSecurityGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     *
     * @return <p>
     *         Information about the stale security groups.
     *         </p>
     */
    public java.util.List<StaleSecurityGroup> getStaleSecurityGroupSet() {
        return staleSecurityGroupSet;
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     *
     * @param staleSecurityGroupSet <p>
     *            Information about the stale security groups.
     *            </p>
     */
    public void setStaleSecurityGroupSet(
            java.util.Collection<StaleSecurityGroup> staleSecurityGroupSet) {
        if (staleSecurityGroupSet == null) {
            this.staleSecurityGroupSet = null;
            return;
        }

        this.staleSecurityGroupSet = new java.util.ArrayList<StaleSecurityGroup>(
                staleSecurityGroupSet);
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staleSecurityGroupSet <p>
     *            Information about the stale security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStaleSecurityGroupsResult withStaleSecurityGroupSet(
            StaleSecurityGroup... staleSecurityGroupSet) {
        if (getStaleSecurityGroupSet() == null) {
            this.staleSecurityGroupSet = new java.util.ArrayList<StaleSecurityGroup>(
                    staleSecurityGroupSet.length);
        }
        for (StaleSecurityGroup value : staleSecurityGroupSet) {
            this.staleSecurityGroupSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staleSecurityGroupSet <p>
     *            Information about the stale security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStaleSecurityGroupsResult withStaleSecurityGroupSet(
            java.util.Collection<StaleSecurityGroup> staleSecurityGroupSet) {
        setStaleSecurityGroupSet(staleSecurityGroupSet);
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
        if (getStaleSecurityGroupSet() != null)
            sb.append("StaleSecurityGroupSet: " + getStaleSecurityGroupSet());
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
                + ((getStaleSecurityGroupSet() == null) ? 0 : getStaleSecurityGroupSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStaleSecurityGroupsResult == false)
            return false;
        DescribeStaleSecurityGroupsResult other = (DescribeStaleSecurityGroupsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStaleSecurityGroupSet() == null ^ this.getStaleSecurityGroupSet() == null)
            return false;
        if (other.getStaleSecurityGroupSet() != null
                && other.getStaleSecurityGroupSet().equals(this.getStaleSecurityGroupSet()) == false)
            return false;
        return true;
    }
}
