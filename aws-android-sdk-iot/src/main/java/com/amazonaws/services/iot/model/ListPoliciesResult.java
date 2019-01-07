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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the ListPolicies operation.
 * </p>
 */
public class ListPoliciesResult implements Serializable {
    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     */
    private java.util.List<Policy> policies;

    /**
     * <p>
     * The marker for the next set of results, or null if there are no
     * additional results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     *
     * @return <p>
     *         The descriptions of the policies.
     *         </p>
     */
    public java.util.List<Policy> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     *
     * @param policies <p>
     *            The descriptions of the policies.
     *            </p>
     */
    public void setPolicies(java.util.Collection<Policy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<Policy>(policies);
    }

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            The descriptions of the policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesResult withPolicies(Policy... policies) {
        if (getPolicies() == null) {
            this.policies = new java.util.ArrayList<Policy>(policies.length);
        }
        for (Policy value : policies) {
            this.policies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The descriptions of the policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            The descriptions of the policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesResult withPolicies(java.util.Collection<Policy> policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results, or null if there are no
     * additional results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The marker for the next set of results, or null if there are no
     *         additional results.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results, or null if there are no
     * additional results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The marker for the next set of results, or null if there are
     *            no additional results.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results, or null if there are no
     * additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9+/]+={0,2}<br/>
     *
     * @param nextMarker <p>
     *            The marker for the next set of results, or null if there are
     *            no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPoliciesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getPolicies() != null)
            sb.append("policies: " + getPolicies() + ",");
        if (getNextMarker() != null)
            sb.append("nextMarker: " + getNextMarker());
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
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPoliciesResult == false)
            return false;
        ListPoliciesResult other = (ListPoliciesResult) obj;

        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
