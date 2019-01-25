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
 * Replaces the set of policies associated with the specified port on which the
 * EC2 instance is listening with a new set of policies. At this time, only the
 * back-end server authentication policy type can be applied to the instance
 * ports; this policy type is composed of multiple public key policies.
 * </p>
 * <p>
 * Each time you use <code>SetLoadBalancerPoliciesForBackendServer</code> to
 * enable the policies, use the <code>PolicyNames</code> parameter to list the
 * policies that you want to enable.
 * </p>
 * <p>
 * You can use <a>DescribeLoadBalancers</a> or
 * <a>DescribeLoadBalancerPolicies</a> to verify that the policy is associated
 * with the EC2 instance.
 * </p>
 * <p>
 * For more information about enabling back-end instance authentication, see <a
 * href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-create-https-ssl-load-balancer.html#configure_backendauth_clt"
 * >Configure Back-end Instance Authentication</a> in the <i>Classic Load
 * Balancers Guide</i>. For more information about Proxy Protocol, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-proxy-protocol.html"
 * >Configure Proxy Protocol Support</a> in the <i>Classic Load Balancers
 * Guide</i>.
 * </p>
 */
public class SetLoadBalancerPoliciesForBackendServerRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The port number associated with the EC2 instance.
     * </p>
     */
    private Integer instancePort;

    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the EC2 instance.
     * </p>
     */
    private java.util.List<String> policyNames = new java.util.ArrayList<String>();

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
    public SetLoadBalancerPoliciesForBackendServerRequest withLoadBalancerName(
            String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The port number associated with the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The port number associated with the EC2 instance.
     *         </p>
     */
    public Integer getInstancePort() {
        return instancePort;
    }

    /**
     * <p>
     * The port number associated with the EC2 instance.
     * </p>
     *
     * @param instancePort <p>
     *            The port number associated with the EC2 instance.
     *            </p>
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port number associated with the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancePort <p>
     *            The port number associated with the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The names of the policies. If the list is empty, then all current
     *         polices are removed from the EC2 instance.
     *         </p>
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the EC2 instance.
     * </p>
     *
     * @param policyNames <p>
     *            The names of the policies. If the list is empty, then all
     *            current polices are removed from the EC2 instance.
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
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of the policies. If the list is empty, then all
     *            current polices are removed from the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(String... policyNames) {
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
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of the policies. If the list is empty, then all
     *            current polices are removed from the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(
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
        if (getInstancePort() != null)
            sb.append("InstancePort: " + getInstancePort() + ",");
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
                + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode());
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

        if (obj instanceof SetLoadBalancerPoliciesForBackendServerRequest == false)
            return false;
        SetLoadBalancerPoliciesForBackendServerRequest other = (SetLoadBalancerPoliciesForBackendServerRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null
                && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }
}
