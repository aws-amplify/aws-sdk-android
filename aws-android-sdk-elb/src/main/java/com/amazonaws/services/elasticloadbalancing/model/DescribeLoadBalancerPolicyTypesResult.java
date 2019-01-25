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
 * Contains the output of DescribeLoadBalancerPolicyTypes.
 * </p>
 */
public class DescribeLoadBalancerPolicyTypesResult implements Serializable {
    /**
     * <p>
     * Information about the policy types.
     * </p>
     */
    private java.util.List<PolicyTypeDescription> policyTypeDescriptions = new java.util.ArrayList<PolicyTypeDescription>();

    /**
     * <p>
     * Information about the policy types.
     * </p>
     *
     * @return <p>
     *         Information about the policy types.
     *         </p>
     */
    public java.util.List<PolicyTypeDescription> getPolicyTypeDescriptions() {
        return policyTypeDescriptions;
    }

    /**
     * <p>
     * Information about the policy types.
     * </p>
     *
     * @param policyTypeDescriptions <p>
     *            Information about the policy types.
     *            </p>
     */
    public void setPolicyTypeDescriptions(
            java.util.Collection<PolicyTypeDescription> policyTypeDescriptions) {
        if (policyTypeDescriptions == null) {
            this.policyTypeDescriptions = null;
            return;
        }

        this.policyTypeDescriptions = new java.util.ArrayList<PolicyTypeDescription>(
                policyTypeDescriptions);
    }

    /**
     * <p>
     * Information about the policy types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypeDescriptions <p>
     *            Information about the policy types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerPolicyTypesResult withPolicyTypeDescriptions(
            PolicyTypeDescription... policyTypeDescriptions) {
        if (getPolicyTypeDescriptions() == null) {
            this.policyTypeDescriptions = new java.util.ArrayList<PolicyTypeDescription>(
                    policyTypeDescriptions.length);
        }
        for (PolicyTypeDescription value : policyTypeDescriptions) {
            this.policyTypeDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the policy types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypeDescriptions <p>
     *            Information about the policy types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerPolicyTypesResult withPolicyTypeDescriptions(
            java.util.Collection<PolicyTypeDescription> policyTypeDescriptions) {
        setPolicyTypeDescriptions(policyTypeDescriptions);
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
        if (getPolicyTypeDescriptions() != null)
            sb.append("PolicyTypeDescriptions: " + getPolicyTypeDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPolicyTypeDescriptions() == null) ? 0 : getPolicyTypeDescriptions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancerPolicyTypesResult == false)
            return false;
        DescribeLoadBalancerPolicyTypesResult other = (DescribeLoadBalancerPolicyTypesResult) obj;

        if (other.getPolicyTypeDescriptions() == null ^ this.getPolicyTypeDescriptions() == null)
            return false;
        if (other.getPolicyTypeDescriptions() != null
                && other.getPolicyTypeDescriptions().equals(this.getPolicyTypeDescriptions()) == false)
            return false;
        return true;
    }
}
