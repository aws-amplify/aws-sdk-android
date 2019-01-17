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
 * Deletes the specified listeners from the specified load balancer.
 * </p>
 */
public class DeleteLoadBalancerListenersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     */
    private java.util.List<Integer> loadBalancerPorts = new java.util.ArrayList<Integer>();

    /**
     * Default constructor for DeleteLoadBalancerListenersRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     */
    public DeleteLoadBalancerListenersRequest() {
    }

    /**
     * Constructs a new DeleteLoadBalancerListenersRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param loadBalancerPorts <p>
     *            The client port numbers of the listeners.
     *            </p>
     */
    public DeleteLoadBalancerListenersRequest(String loadBalancerName,
            java.util.List<Integer> loadBalancerPorts) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPorts(loadBalancerPorts);
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
    public DeleteLoadBalancerListenersRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     *
     * @return <p>
     *         The client port numbers of the listeners.
     *         </p>
     */
    public java.util.List<Integer> getLoadBalancerPorts() {
        return loadBalancerPorts;
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     *
     * @param loadBalancerPorts <p>
     *            The client port numbers of the listeners.
     *            </p>
     */
    public void setLoadBalancerPorts(java.util.Collection<Integer> loadBalancerPorts) {
        if (loadBalancerPorts == null) {
            this.loadBalancerPorts = null;
            return;
        }

        this.loadBalancerPorts = new java.util.ArrayList<Integer>(loadBalancerPorts);
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerPorts <p>
     *            The client port numbers of the listeners.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(Integer... loadBalancerPorts) {
        if (getLoadBalancerPorts() == null) {
            this.loadBalancerPorts = new java.util.ArrayList<Integer>(loadBalancerPorts.length);
        }
        for (Integer value : loadBalancerPorts) {
            this.loadBalancerPorts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The client port numbers of the listeners.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerPorts <p>
     *            The client port numbers of the listeners.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(
            java.util.Collection<Integer> loadBalancerPorts) {
        setLoadBalancerPorts(loadBalancerPorts);
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
        if (getLoadBalancerPorts() != null)
            sb.append("LoadBalancerPorts: " + getLoadBalancerPorts());
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
                + ((getLoadBalancerPorts() == null) ? 0 : getLoadBalancerPorts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLoadBalancerListenersRequest == false)
            return false;
        DeleteLoadBalancerListenersRequest other = (DeleteLoadBalancerListenersRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerPorts() == null ^ this.getLoadBalancerPorts() == null)
            return false;
        if (other.getLoadBalancerPorts() != null
                && other.getLoadBalancerPorts().equals(this.getLoadBalancerPorts()) == false)
            return false;
        return true;
    }
}
