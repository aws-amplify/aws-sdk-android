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
 * Deletes the specified policy from the specified load balancer. This policy
 * must not be enabled for any listeners.
 * </p>
 */
public class DeleteLoadBalancerPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;

    /**
     * Default constructor for DeleteLoadBalancerPolicyRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public DeleteLoadBalancerPolicyRequest() {
    }

    /**
     * Constructs a new DeleteLoadBalancerPolicyRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param policyName <p>
     *            The name of the policy.
     *            </p>
     */
    public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) {
        setLoadBalancerName(loadBalancerName);
        setPolicyName(policyName);
    }

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
    public DeleteLoadBalancerPolicyRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     *
     * @return <p>
     *         The name of the policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     *
     * @param policyName <p>
     *            The name of the policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyName <p>
     *            The name of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLoadBalancerPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
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
            sb.append("PolicyName: " + getPolicyName());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLoadBalancerPolicyRequest == false)
            return false;
        DeleteLoadBalancerPolicyRequest other = (DeleteLoadBalancerPolicyRequest) obj;

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
        return true;
    }
}
