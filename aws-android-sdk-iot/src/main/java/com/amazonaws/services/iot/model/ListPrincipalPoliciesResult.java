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
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the ListPrincipalPolicies operation.
 * </p>
 */
public class ListPrincipalPoliciesResult implements Serializable {

    /**
     * The policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Policy> policies;

    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     */
    private String nextMarker;

    /**
     * The policies.
     *
     * @return The policies.
     */
    public java.util.List<Policy> getPolicies() {
        if (policies == null) {
              policies = new com.amazonaws.internal.ListWithAutoConstructFlag<Policy>();
              policies.setAutoConstruct(true);
        }
        return policies;
    }
    
    /**
     * The policies.
     *
     * @param policies The policies.
     */
    public void setPolicies(java.util.Collection<Policy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Policy> policiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Policy>(policies.size());
        policiesCopy.addAll(policies);
        this.policies = policiesCopy;
    }
    
    /**
     * The policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies The policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPrincipalPoliciesResult withPolicies(Policy... policies) {
        if (getPolicies() == null) setPolicies(new java.util.ArrayList<Policy>(policies.length));
        for (Policy value : policies) {
            getPolicies().add(value);
        }
        return this;
    }
    
    /**
     * The policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies The policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPrincipalPoliciesResult withPolicies(java.util.Collection<Policy> policies) {
        if (policies == null) {
            this.policies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Policy> policiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Policy>(policies.size());
            policiesCopy.addAll(policies);
            this.policies = policiesCopy;
        }

        return this;
    }

    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     *
     * @return The marker for the next set of results, or null if there are no
     *         additional results.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     *
     * @param nextMarker The marker for the next set of results, or null if there are no
     *         additional results.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * The marker for the next set of results, or null if there are no
     * additional results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker The marker for the next set of results, or null if there are no
     *         additional results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPrincipalPoliciesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getPolicies() != null) sb.append("Policies: " + getPolicies() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPrincipalPoliciesResult == false) return false;
        ListPrincipalPoliciesResult other = (ListPrincipalPoliciesResult)obj;
        
        if (other.getPolicies() == null ^ this.getPolicies() == null) return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        return true;
    }
    
}
    