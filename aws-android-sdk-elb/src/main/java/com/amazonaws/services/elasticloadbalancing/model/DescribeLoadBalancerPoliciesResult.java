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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeLoadBalancerPolicies.
 * </p>
 */
public class DescribeLoadBalancerPoliciesResult implements Serializable {
    /**
     * <p>
     * Information about the policies.
     * </p>
     */
    private java.util.List<PolicyDescription> policyDescriptions = new java.util.ArrayList<PolicyDescription>();

    /**
     * <p>
     * Information about the policies.
     * </p>
     *
     * @return <p>
     *         Information about the policies.
     *         </p>
     */
    public java.util.List<PolicyDescription> getPolicyDescriptions() {
        return policyDescriptions;
    }

    /**
     * <p>
     * Information about the policies.
     * </p>
     *
     * @param policyDescriptions <p>
     *            Information about the policies.
     *            </p>
     */
    public void setPolicyDescriptions(java.util.Collection<PolicyDescription> policyDescriptions) {
        if (policyDescriptions == null) {
            this.policyDescriptions = null;
            return;
        }

        this.policyDescriptions = new java.util.ArrayList<PolicyDescription>(policyDescriptions);
    }

    /**
     * <p>
     * Information about the policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDescriptions <p>
     *            Information about the policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(
            PolicyDescription... policyDescriptions) {
        if (getPolicyDescriptions() == null) {
            this.policyDescriptions = new java.util.ArrayList<PolicyDescription>(
                    policyDescriptions.length);
        }
        for (PolicyDescription value : policyDescriptions) {
            this.policyDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDescriptions <p>
     *            Information about the policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerPoliciesResult withPolicyDescriptions(
            java.util.Collection<PolicyDescription> policyDescriptions) {
        setPolicyDescriptions(policyDescriptions);
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
        if (getPolicyDescriptions() != null)
            sb.append("PolicyDescriptions: " + getPolicyDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyDescriptions() == null) ? 0 : getPolicyDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancerPoliciesResult == false)
            return false;
        DescribeLoadBalancerPoliciesResult other = (DescribeLoadBalancerPoliciesResult) obj;

        if (other.getPolicyDescriptions() == null ^ this.getPolicyDescriptions() == null)
            return false;
        if (other.getPolicyDescriptions() != null
                && other.getPolicyDescriptions().equals(this.getPolicyDescriptions()) == false)
            return false;
        return true;
    }
}
