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

package com.amazonaws.services.amazondatalifecyclemanager.model;

import java.io.Serializable;

public class GetLifecyclePoliciesResult implements Serializable {
    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     */
    private java.util.List<LifecyclePolicySummary> policies;

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     *
     * @return <p>
     *         Summary information about the lifecycle policies.
     *         </p>
     */
    public java.util.List<LifecyclePolicySummary> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     *
     * @param policies <p>
     *            Summary information about the lifecycle policies.
     *            </p>
     */
    public void setPolicies(java.util.Collection<LifecyclePolicySummary> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<LifecyclePolicySummary>(policies);
    }

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            Summary information about the lifecycle policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesResult withPolicies(LifecyclePolicySummary... policies) {
        if (getPolicies() == null) {
            this.policies = new java.util.ArrayList<LifecyclePolicySummary>(policies.length);
        }
        for (LifecyclePolicySummary value : policies) {
            this.policies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the lifecycle policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            Summary information about the lifecycle policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesResult withPolicies(
            java.util.Collection<LifecyclePolicySummary> policies) {
        setPolicies(policies);
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
            sb.append("Policies: " + getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecyclePoliciesResult == false)
            return false;
        GetLifecyclePoliciesResult other = (GetLifecyclePoliciesResult) obj;

        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }
}
