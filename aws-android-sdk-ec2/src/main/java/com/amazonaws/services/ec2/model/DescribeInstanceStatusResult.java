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
 * <p>
 * Contains the output of DescribeInstanceStatus.
 * </p>
 */
public class DescribeInstanceStatusResult implements Serializable {

    /**
     * One or more instance status descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatus> instanceStatuses;

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * One or more instance status descriptions.
     *
     * @return One or more instance status descriptions.
     */
    public java.util.List<InstanceStatus> getInstanceStatuses() {
        if (instanceStatuses == null) {
              instanceStatuses = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatus>();
              instanceStatuses.setAutoConstruct(true);
        }
        return instanceStatuses;
    }
    
    /**
     * One or more instance status descriptions.
     *
     * @param instanceStatuses One or more instance status descriptions.
     */
    public void setInstanceStatuses(java.util.Collection<InstanceStatus> instanceStatuses) {
        if (instanceStatuses == null) {
            this.instanceStatuses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatus> instanceStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatus>(instanceStatuses.size());
        instanceStatusesCopy.addAll(instanceStatuses);
        this.instanceStatuses = instanceStatusesCopy;
    }
    
    /**
     * One or more instance status descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatuses One or more instance status descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstanceStatusResult withInstanceStatuses(InstanceStatus... instanceStatuses) {
        if (getInstanceStatuses() == null) setInstanceStatuses(new java.util.ArrayList<InstanceStatus>(instanceStatuses.length));
        for (InstanceStatus value : instanceStatuses) {
            getInstanceStatuses().add(value);
        }
        return this;
    }
    
    /**
     * One or more instance status descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatuses One or more instance status descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstanceStatusResult withInstanceStatuses(java.util.Collection<InstanceStatus> instanceStatuses) {
        if (instanceStatuses == null) {
            this.instanceStatuses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatus> instanceStatusesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatus>(instanceStatuses.size());
            instanceStatusesCopy.addAll(instanceStatuses);
            this.instanceStatuses = instanceStatusesCopy;
        }

        return this;
    }

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInstanceStatusResult withNextToken(String nextToken) {
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
        if (getInstanceStatuses() != null) sb.append("InstanceStatuses: " + getInstanceStatuses() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceStatuses() == null) ? 0 : getInstanceStatuses().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstanceStatusResult == false) return false;
        DescribeInstanceStatusResult other = (DescribeInstanceStatusResult)obj;
        
        if (other.getInstanceStatuses() == null ^ this.getInstanceStatuses() == null) return false;
        if (other.getInstanceStatuses() != null && other.getInstanceStatuses().equals(this.getInstanceStatuses()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    