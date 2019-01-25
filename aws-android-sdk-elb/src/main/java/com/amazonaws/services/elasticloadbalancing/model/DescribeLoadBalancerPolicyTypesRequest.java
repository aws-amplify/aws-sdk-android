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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the specified load balancer policy types or all load balancer
 * policy types.
 * </p>
 * <p>
 * The description of each type indicates how it can be used. For example, some
 * policies can be used only with layer 7 listeners, some policies can be used
 * only with layer 4 listeners, and some policies can be used only with your EC2
 * instances.
 * </p>
 * <p>
 * You can use <a>CreateLoadBalancerPolicy</a> to create a policy configuration
 * for any of these policy types. Then, depending on the policy type, use either
 * <a>SetLoadBalancerPoliciesOfListener</a> or
 * <a>SetLoadBalancerPoliciesForBackendServer</a> to set the policy.
 * </p>
 */
public class DescribeLoadBalancerPolicyTypesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all
     * policy types defined by Elastic Load Balancing.
     * </p>
     */
    private java.util.List<String> policyTypeNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all
     * policy types defined by Elastic Load Balancing.
     * </p>
     *
     * @return <p>
     *         The names of the policy types. If no names are specified,
     *         describes all policy types defined by Elastic Load Balancing.
     *         </p>
     */
    public java.util.List<String> getPolicyTypeNames() {
        return policyTypeNames;
    }

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all
     * policy types defined by Elastic Load Balancing.
     * </p>
     *
     * @param policyTypeNames <p>
     *            The names of the policy types. If no names are specified,
     *            describes all policy types defined by Elastic Load Balancing.
     *            </p>
     */
    public void setPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        if (policyTypeNames == null) {
            this.policyTypeNames = null;
            return;
        }

        this.policyTypeNames = new java.util.ArrayList<String>(policyTypeNames);
    }

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all
     * policy types defined by Elastic Load Balancing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypeNames <p>
     *            The names of the policy types. If no names are specified,
     *            describes all policy types defined by Elastic Load Balancing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(String... policyTypeNames) {
        if (getPolicyTypeNames() == null) {
            this.policyTypeNames = new java.util.ArrayList<String>(policyTypeNames.length);
        }
        for (String value : policyTypeNames) {
            this.policyTypeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the policy types. If no names are specified, describes all
     * policy types defined by Elastic Load Balancing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypeNames <p>
     *            The names of the policy types. If no names are specified,
     *            describes all policy types defined by Elastic Load Balancing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(
            java.util.Collection<String> policyTypeNames) {
        setPolicyTypeNames(policyTypeNames);
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
        if (getPolicyTypeNames() != null)
            sb.append("PolicyTypeNames: " + getPolicyTypeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyTypeNames() == null) ? 0 : getPolicyTypeNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancerPolicyTypesRequest == false)
            return false;
        DescribeLoadBalancerPolicyTypesRequest other = (DescribeLoadBalancerPolicyTypesRequest) obj;

        if (other.getPolicyTypeNames() == null ^ this.getPolicyTypeNames() == null)
            return false;
        if (other.getPolicyTypeNames() != null
                && other.getPolicyTypeNames().equals(this.getPolicyTypeNames()) == false)
            return false;
        return true;
    }
}
