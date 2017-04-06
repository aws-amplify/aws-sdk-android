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
 * Contains the output of DescribeScheduledInstanceAvailability.
 * </p>
 */
public class DescribeScheduledInstanceAvailabilityResult implements Serializable {

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * Information about the available Scheduled Instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet;

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstanceAvailabilityResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Information about the available Scheduled Instances.
     *
     * @return Information about the available Scheduled Instances.
     */
    public java.util.List<ScheduledInstanceAvailability> getScheduledInstanceAvailabilitySet() {
        if (scheduledInstanceAvailabilitySet == null) {
              scheduledInstanceAvailabilitySet = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstanceAvailability>();
              scheduledInstanceAvailabilitySet.setAutoConstruct(true);
        }
        return scheduledInstanceAvailabilitySet;
    }
    
    /**
     * Information about the available Scheduled Instances.
     *
     * @param scheduledInstanceAvailabilitySet Information about the available Scheduled Instances.
     */
    public void setScheduledInstanceAvailabilitySet(java.util.Collection<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet) {
        if (scheduledInstanceAvailabilitySet == null) {
            this.scheduledInstanceAvailabilitySet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstanceAvailability>(scheduledInstanceAvailabilitySet.size());
        scheduledInstanceAvailabilitySetCopy.addAll(scheduledInstanceAvailabilitySet);
        this.scheduledInstanceAvailabilitySet = scheduledInstanceAvailabilitySetCopy;
    }
    
    /**
     * Information about the available Scheduled Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceAvailabilitySet Information about the available Scheduled Instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstanceAvailabilityResult withScheduledInstanceAvailabilitySet(ScheduledInstanceAvailability... scheduledInstanceAvailabilitySet) {
        if (getScheduledInstanceAvailabilitySet() == null) setScheduledInstanceAvailabilitySet(new java.util.ArrayList<ScheduledInstanceAvailability>(scheduledInstanceAvailabilitySet.length));
        for (ScheduledInstanceAvailability value : scheduledInstanceAvailabilitySet) {
            getScheduledInstanceAvailabilitySet().add(value);
        }
        return this;
    }
    
    /**
     * Information about the available Scheduled Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledInstanceAvailabilitySet Information about the available Scheduled Instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledInstanceAvailabilityResult withScheduledInstanceAvailabilitySet(java.util.Collection<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySet) {
        if (scheduledInstanceAvailabilitySet == null) {
            this.scheduledInstanceAvailabilitySet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstanceAvailability> scheduledInstanceAvailabilitySetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledInstanceAvailability>(scheduledInstanceAvailabilitySet.size());
            scheduledInstanceAvailabilitySetCopy.addAll(scheduledInstanceAvailabilitySet);
            this.scheduledInstanceAvailabilitySet = scheduledInstanceAvailabilitySetCopy;
        }

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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getScheduledInstanceAvailabilitySet() != null) sb.append("ScheduledInstanceAvailabilitySet: " + getScheduledInstanceAvailabilitySet() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getScheduledInstanceAvailabilitySet() == null) ? 0 : getScheduledInstanceAvailabilitySet().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScheduledInstanceAvailabilityResult == false) return false;
        DescribeScheduledInstanceAvailabilityResult other = (DescribeScheduledInstanceAvailabilityResult)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getScheduledInstanceAvailabilitySet() == null ^ this.getScheduledInstanceAvailabilitySet() == null) return false;
        if (other.getScheduledInstanceAvailabilitySet() != null && other.getScheduledInstanceAvailabilitySet().equals(this.getScheduledInstanceAvailabilitySet()) == false) return false; 
        return true;
    }
    
}
    