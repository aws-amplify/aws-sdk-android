/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Describe Load Balancer Target Groups Result
 */
public class DescribeLoadBalancerTargetGroupsResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerTargetGroupState> loadBalancerTargetGroups;

    private String nextToken;

    /**
     * Returns the value of the LoadBalancerTargetGroups property for this
     * object.
     *
     * @return The value of the LoadBalancerTargetGroups property for this object.
     */
    public java.util.List<LoadBalancerTargetGroupState> getLoadBalancerTargetGroups() {
        if (loadBalancerTargetGroups == null) {
              loadBalancerTargetGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerTargetGroupState>();
              loadBalancerTargetGroups.setAutoConstruct(true);
        }
        return loadBalancerTargetGroups;
    }
    
    /**
     * Sets the value of the LoadBalancerTargetGroups property for this
     * object.
     *
     * @param loadBalancerTargetGroups The new value for the LoadBalancerTargetGroups property for this
     *         object.
     */
    public void setLoadBalancerTargetGroups(java.util.Collection<LoadBalancerTargetGroupState> loadBalancerTargetGroups) {
        if (loadBalancerTargetGroups == null) {
            this.loadBalancerTargetGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerTargetGroupState> loadBalancerTargetGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerTargetGroupState>(loadBalancerTargetGroups.size());
        loadBalancerTargetGroupsCopy.addAll(loadBalancerTargetGroups);
        this.loadBalancerTargetGroups = loadBalancerTargetGroupsCopy;
    }
    
    /**
     * Sets the value of the LoadBalancerTargetGroups property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerTargetGroups The new value for the LoadBalancerTargetGroups property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerTargetGroupsResult withLoadBalancerTargetGroups(LoadBalancerTargetGroupState... loadBalancerTargetGroups) {
        if (getLoadBalancerTargetGroups() == null) setLoadBalancerTargetGroups(new java.util.ArrayList<LoadBalancerTargetGroupState>(loadBalancerTargetGroups.length));
        for (LoadBalancerTargetGroupState value : loadBalancerTargetGroups) {
            getLoadBalancerTargetGroups().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the LoadBalancerTargetGroups property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerTargetGroups The new value for the LoadBalancerTargetGroups property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancerTargetGroupsResult withLoadBalancerTargetGroups(java.util.Collection<LoadBalancerTargetGroupState> loadBalancerTargetGroups) {
        if (loadBalancerTargetGroups == null) {
            this.loadBalancerTargetGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerTargetGroupState> loadBalancerTargetGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerTargetGroupState>(loadBalancerTargetGroups.size());
            loadBalancerTargetGroupsCopy.addAll(loadBalancerTargetGroups);
            this.loadBalancerTargetGroups = loadBalancerTargetGroupsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerTargetGroups() != null) sb.append("LoadBalancerTargetGroups: " + getLoadBalancerTargetGroups() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerTargetGroups() == null) ? 0 : getLoadBalancerTargetGroups().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancerTargetGroupsResult == false) return false;
        DescribeLoadBalancerTargetGroupsResult other = (DescribeLoadBalancerTargetGroupsResult)obj;
        
        if (other.getLoadBalancerTargetGroups() == null ^ this.getLoadBalancerTargetGroups() == null) return false;
        if (other.getLoadBalancerTargetGroups() != null && other.getLoadBalancerTargetGroups().equals(this.getLoadBalancerTargetGroups()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    