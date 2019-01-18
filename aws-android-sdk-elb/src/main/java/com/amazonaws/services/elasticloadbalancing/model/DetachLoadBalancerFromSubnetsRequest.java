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
 * Removes the specified subnets from the set of configured subnets for the load
 * balancer.
 * </p>
 * <p>
 * After a subnet is removed, all EC2 instances registered with the load
 * balancer in the removed subnet go into the <code>OutOfService</code> state.
 * Then, the load balancer balances the traffic among the remaining routable
 * subnets.
 * </p>
 */
public class DetachLoadBalancerFromSubnetsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     */
    private java.util.List<String> subnets = new java.util.ArrayList<String>();

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
    public DetachLoadBalancerFromSubnetsRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     *
     * @return <p>
     *         The IDs of the subnets.
     *         </p>
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     *
     * @param subnets <p>
     *            The IDs of the subnets.
     *            </p>
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachLoadBalancerFromSubnetsRequest withSubnets(String... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<String>(subnets.length);
        }
        for (String value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachLoadBalancerFromSubnetsRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
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
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachLoadBalancerFromSubnetsRequest == false)
            return false;
        DetachLoadBalancerFromSubnetsRequest other = (DetachLoadBalancerFromSubnetsRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }
}
