/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
public class DescribeStaleSecurityGroupsResult implements Serializable {

    /**
     * Information about the stale security groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StaleSecurityGroup> staleSecurityGroupSet;

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     */
    private String nextToken;

    /**
     * Information about the stale security groups.
     *
     * @return Information about the stale security groups.
     */
    public java.util.List<StaleSecurityGroup> getStaleSecurityGroupSet() {
        if (staleSecurityGroupSet == null) {
              staleSecurityGroupSet = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleSecurityGroup>();
              staleSecurityGroupSet.setAutoConstruct(true);
        }
        return staleSecurityGroupSet;
    }
    
    /**
     * Information about the stale security groups.
     *
     * @param staleSecurityGroupSet Information about the stale security groups.
     */
    public void setStaleSecurityGroupSet(java.util.Collection<StaleSecurityGroup> staleSecurityGroupSet) {
        if (staleSecurityGroupSet == null) {
            this.staleSecurityGroupSet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StaleSecurityGroup> staleSecurityGroupSetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleSecurityGroup>(staleSecurityGroupSet.size());
        staleSecurityGroupSetCopy.addAll(staleSecurityGroupSet);
        this.staleSecurityGroupSet = staleSecurityGroupSetCopy;
    }
    
    /**
     * Information about the stale security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staleSecurityGroupSet Information about the stale security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStaleSecurityGroupsResult withStaleSecurityGroupSet(StaleSecurityGroup... staleSecurityGroupSet) {
        if (getStaleSecurityGroupSet() == null) setStaleSecurityGroupSet(new java.util.ArrayList<StaleSecurityGroup>(staleSecurityGroupSet.length));
        for (StaleSecurityGroup value : staleSecurityGroupSet) {
            getStaleSecurityGroupSet().add(value);
        }
        return this;
    }
    
    /**
     * Information about the stale security groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param staleSecurityGroupSet Information about the stale security groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStaleSecurityGroupsResult withStaleSecurityGroupSet(java.util.Collection<StaleSecurityGroup> staleSecurityGroupSet) {
        if (staleSecurityGroupSet == null) {
            this.staleSecurityGroupSet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StaleSecurityGroup> staleSecurityGroupSetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StaleSecurityGroup>(staleSecurityGroupSet.size());
            staleSecurityGroupSetCopy.addAll(staleSecurityGroupSet);
            this.staleSecurityGroupSet = staleSecurityGroupSetCopy;
        }

        return this;
    }

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @return The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStaleSecurityGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStaleSecurityGroupSet() != null) sb.append("StaleSecurityGroupSet: " + getStaleSecurityGroupSet() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStaleSecurityGroupSet() == null) ? 0 : getStaleSecurityGroupSet().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStaleSecurityGroupsResult == false) return false;
        DescribeStaleSecurityGroupsResult other = (DescribeStaleSecurityGroupsResult)obj;
        
        if (other.getStaleSecurityGroupSet() == null ^ this.getStaleSecurityGroupSet() == null) return false;
        if (other.getStaleSecurityGroupSet() != null && other.getStaleSecurityGroupSet().equals(this.getStaleSecurityGroupSet()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    