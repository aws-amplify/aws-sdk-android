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
 * Contains the parameters for DescribeLoadBalancers.
 * </p>
 */
public class DescribeLoadBalancersResult implements Serializable {
    /**
     * <p>
     * Information about the load balancers.
     * </p>
     */
    private java.util.List<LoadBalancerDescription> loadBalancerDescriptions = new java.util.ArrayList<LoadBalancerDescription>();

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     *
     * @return <p>
     *         Information about the load balancers.
     *         </p>
     */
    public java.util.List<LoadBalancerDescription> getLoadBalancerDescriptions() {
        return loadBalancerDescriptions;
    }

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     *
     * @param loadBalancerDescriptions <p>
     *            Information about the load balancers.
     *            </p>
     */
    public void setLoadBalancerDescriptions(
            java.util.Collection<LoadBalancerDescription> loadBalancerDescriptions) {
        if (loadBalancerDescriptions == null) {
            this.loadBalancerDescriptions = null;
            return;
        }

        this.loadBalancerDescriptions = new java.util.ArrayList<LoadBalancerDescription>(
                loadBalancerDescriptions);
    }

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerDescriptions <p>
     *            Information about the load balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersResult withLoadBalancerDescriptions(
            LoadBalancerDescription... loadBalancerDescriptions) {
        if (getLoadBalancerDescriptions() == null) {
            this.loadBalancerDescriptions = new java.util.ArrayList<LoadBalancerDescription>(
                    loadBalancerDescriptions.length);
        }
        for (LoadBalancerDescription value : loadBalancerDescriptions) {
            this.loadBalancerDescriptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerDescriptions <p>
     *            Information about the load balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersResult withLoadBalancerDescriptions(
            java.util.Collection<LoadBalancerDescription> loadBalancerDescriptions) {
        setLoadBalancerDescriptions(loadBalancerDescriptions);
        return this;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     *
     * @return <p>
     *         The marker to use when requesting the next set of results. If
     *         there are no additional results, the string is empty.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     *
     * @param nextMarker <p>
     *            The marker to use when requesting the next set of results. If
     *            there are no additional results, the string is empty.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are
     * no additional results, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            The marker to use when requesting the next set of results. If
     *            there are no additional results, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoadBalancersResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getLoadBalancerDescriptions() != null)
            sb.append("LoadBalancerDescriptions: " + getLoadBalancerDescriptions() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLoadBalancerDescriptions() == null) ? 0 : getLoadBalancerDescriptions()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBalancersResult == false)
            return false;
        DescribeLoadBalancersResult other = (DescribeLoadBalancersResult) obj;

        if (other.getLoadBalancerDescriptions() == null
                ^ this.getLoadBalancerDescriptions() == null)
            return false;
        if (other.getLoadBalancerDescriptions() != null
                && other.getLoadBalancerDescriptions().equals(this.getLoadBalancerDescriptions()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
