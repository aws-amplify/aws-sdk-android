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
 * Replaces the current set of policies for the specified load balancer port
 * with the specified set of policies.
 * </p>
 * <p>
 * To enable back-end server authentication, use
 * <a>SetLoadBalancerPoliciesForBackendServer</a>.
 * </p>
 * <p>
 * For more information about setting policies, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/ssl-config-update.html"
 * >Update the SSL Negotiation Configuration</a>, <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration"
 * >Duration-Based Session Stickiness</a>, and <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application"
 * >Application-Controlled Session Stickiness</a> in the <i>Classic Load
 * Balancers Guide</i>.
 * </p>
 */
public class SetLoadBalancerPoliciesOfListenerRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     */
    private Integer loadBalancerPort;

    /**
     * <p>
     * The names of the policies. This list must include all policies to be
     * enabled. If you omit a policy that is currently enabled, it is disabled.
     * If the list is empty, all current policies are disabled.
     * </p>
     */
    private java.util.List<String> policyNames = new java.util.ArrayList<String>();

    /**
     * Default constructor for SetLoadBalancerPoliciesOfListenerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     */
    public SetLoadBalancerPoliciesOfListenerRequest() {
    }

    /**
     * Constructs a new SetLoadBalancerPoliciesOfListenerRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param loadBalancerPort <p>
     *            The external port of the load balancer.
     *            </p>
     * @param policyNames <p>
     *            The names of the policies. This list must include all policies
     *            to be enabled. If you omit a policy that is currently enabled,
     *            it is disabled. If the list is empty, all current policies are
     *            disabled.
     *            </p>
     */
    public SetLoadBalancerPoliciesOfListenerRequest(String loadBalancerName,
            Integer loadBalancerPort, java.util.List<String> policyNames) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPort(loadBalancerPort);
        setPolicyNames(policyNames);
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
    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     *
     * @return <p>
     *         The external port of the load balancer.
     *         </p>
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }

    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     *
     * @param loadBalancerPort <p>
     *            The external port of the load balancer.
     *            </p>
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    /**
     * <p>
     * The external port of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerPort <p>
     *            The external port of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerPoliciesOfListenerRequest withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be
     * enabled. If you omit a policy that is currently enabled, it is disabled.
     * If the list is empty, all current policies are disabled.
     * </p>
     *
     * @return <p>
     *         The names of the policies. This list must include all policies to
     *         be enabled. If you omit a policy that is currently enabled, it is
     *         disabled. If the list is empty, all current policies are
     *         disabled.
     *         </p>
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be
     * enabled. If you omit a policy that is currently enabled, it is disabled.
     * If the list is empty, all current policies are disabled.
     * </p>
     *
     * @param policyNames <p>
     *            The names of the policies. This list must include all policies
     *            to be enabled. If you omit a policy that is currently enabled,
     *            it is disabled. If the list is empty, all current policies are
     *            disabled.
     *            </p>
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be
     * enabled. If you omit a policy that is currently enabled, it is disabled.
     * If the list is empty, all current policies are disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of the policies. This list must include all policies
     *            to be enabled. If you omit a policy that is currently enabled,
     *            it is disabled. If the list is empty, all current policies are
     *            disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) {
            this.policyNames = new java.util.ArrayList<String>(policyNames.length);
        }
        for (String value : policyNames) {
            this.policyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the policies. This list must include all policies to be
     * enabled. If you omit a policy that is currently enabled, it is disabled.
     * If the list is empty, all current policies are disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of the policies. This list must include all policies
     *            to be enabled. If you omit a policy that is currently enabled,
     *            it is disabled. If the list is empty, all current policies are
     *            disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerPoliciesOfListenerRequest withPolicyNames(
            java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getLoadBalancerPort() != null)
            sb.append("LoadBalancerPort: " + getLoadBalancerPort() + ",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancerPort() == null) ? 0 : getLoadBalancerPort().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoadBalancerPoliciesOfListenerRequest == false)
            return false;
        SetLoadBalancerPoliciesOfListenerRequest other = (SetLoadBalancerPoliciesOfListenerRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerPort() == null ^ this.getLoadBalancerPort() == null)
            return false;
        if (other.getLoadBalancerPort() != null
                && other.getLoadBalancerPort().equals(this.getLoadBalancerPort()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }
}
