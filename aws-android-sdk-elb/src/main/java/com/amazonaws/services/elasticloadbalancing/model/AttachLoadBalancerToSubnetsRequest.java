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
 * Adds one or more subnets to the set of configured subnets for the specified
 * load balancer.
 * </p>
 * <p>
 * The load balancer evenly distributes requests across all registered subnets.
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-manage-subnets.html"
 * >Add or Remove Subnets for Your Load Balancer in a VPC</a> in the <i>Classic
 * Load Balancers Guide</i>.
 * </p>
 */
public class AttachLoadBalancerToSubnetsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The IDs of the subnets to add. You can add only one subnet per
     * Availability Zone.
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
    public AttachLoadBalancerToSubnetsRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets to add. You can add only one subnet per
     * Availability Zone.
     * </p>
     *
     * @return <p>
     *         The IDs of the subnets to add. You can add only one subnet per
     *         Availability Zone.
     *         </p>
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets to add. You can add only one subnet per
     * Availability Zone.
     * </p>
     *
     * @param subnets <p>
     *            The IDs of the subnets to add. You can add only one subnet per
     *            Availability Zone.
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
     * The IDs of the subnets to add. You can add only one subnet per
     * Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets to add. You can add only one subnet per
     *            Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachLoadBalancerToSubnetsRequest withSubnets(String... subnets) {
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
     * The IDs of the subnets to add. You can add only one subnet per
     * Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            The IDs of the subnets to add. You can add only one subnet per
     *            Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachLoadBalancerToSubnetsRequest withSubnets(java.util.Collection<String> subnets) {
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

        if (obj instanceof AttachLoadBalancerToSubnetsRequest == false)
            return false;
        AttachLoadBalancerToSubnetsRequest other = (AttachLoadBalancerToSubnetsRequest) obj;

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
