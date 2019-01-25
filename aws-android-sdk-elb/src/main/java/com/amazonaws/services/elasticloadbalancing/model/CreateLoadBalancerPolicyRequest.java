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
 * Creates a policy with the specified attributes for the specified load
 * balancer.
 * </p>
 * <p>
 * Policies are settings that are saved for your load balancer and that can be
 * applied to the listener or the application server, depending on the policy
 * type.
 * </p>
 */
public class CreateLoadBalancerPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     */
    private String policyTypeName;

    /**
     * <p>
     * The policy attributes.
     * </p>
     */
    private java.util.List<PolicyAttribute> policyAttributes = new java.util.ArrayList<PolicyAttribute>();

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer policy to be created. This name
     *         must be unique within the set of policies for this load balancer.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     * </p>
     *
     * @param policyName <p>
     *            The name of the load balancer policy to be created. This name
     *            must be unique within the set of policies for this load
     *            balancer.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the load balancer policy to be created. This name must be
     * unique within the set of policies for this load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyName <p>
     *            The name of the load balancer policy to be created. This name
     *            must be unique within the set of policies for this load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     *
     * @return <p>
     *         The name of the base policy type. To get the list of policy
     *         types, use <a>DescribeLoadBalancerPolicyTypes</a>.
     *         </p>
     */
    public String getPolicyTypeName() {
        return policyTypeName;
    }

    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     *
     * @param policyTypeName <p>
     *            The name of the base policy type. To get the list of policy
     *            types, use <a>DescribeLoadBalancerPolicyTypes</a>.
     *            </p>
     */
    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

    /**
     * <p>
     * The name of the base policy type. To get the list of policy types, use
     * <a>DescribeLoadBalancerPolicyTypes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypeName <p>
     *            The name of the base policy type. To get the list of policy
     *            types, use <a>DescribeLoadBalancerPolicyTypes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
        return this;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     *
     * @return <p>
     *         The policy attributes.
     *         </p>
     */
    public java.util.List<PolicyAttribute> getPolicyAttributes() {
        return policyAttributes;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     *
     * @param policyAttributes <p>
     *            The policy attributes.
     *            </p>
     */
    public void setPolicyAttributes(java.util.Collection<PolicyAttribute> policyAttributes) {
        if (policyAttributes == null) {
            this.policyAttributes = null;
            return;
        }

        this.policyAttributes = new java.util.ArrayList<PolicyAttribute>(policyAttributes);
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyAttributes <p>
     *            The policy attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyAttributes(PolicyAttribute... policyAttributes) {
        if (getPolicyAttributes() == null) {
            this.policyAttributes = new java.util.ArrayList<PolicyAttribute>(
                    policyAttributes.length);
        }
        for (PolicyAttribute value : policyAttributes) {
            this.policyAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The policy attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyAttributes <p>
     *            The policy attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLoadBalancerPolicyRequest withPolicyAttributes(
            java.util.Collection<PolicyAttribute> policyAttributes) {
        setPolicyAttributes(policyAttributes);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyTypeName() != null)
            sb.append("PolicyTypeName: " + getPolicyTypeName() + ",");
        if (getPolicyAttributes() != null)
            sb.append("PolicyAttributes: " + getPolicyAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyTypeName() == null) ? 0 : getPolicyTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyAttributes() == null) ? 0 : getPolicyAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoadBalancerPolicyRequest == false)
            return false;
        CreateLoadBalancerPolicyRequest other = (CreateLoadBalancerPolicyRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyTypeName() == null ^ this.getPolicyTypeName() == null)
            return false;
        if (other.getPolicyTypeName() != null
                && other.getPolicyTypeName().equals(this.getPolicyTypeName()) == false)
            return false;
        if (other.getPolicyAttributes() == null ^ this.getPolicyAttributes() == null)
            return false;
        if (other.getPolicyAttributes() != null
                && other.getPolicyAttributes().equals(this.getPolicyAttributes()) == false)
            return false;
        return true;
    }
}
