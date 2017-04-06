/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the state of a load balancer.
 * </p>
 */
public class LoadBalancerState implements Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String loadBalancerName;

    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered
     * with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the
     * load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB
     * health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances are being deregistered from the
     * load balancer. If connection draining is enabled, Elastic Load Balancing
     * waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String state;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerState withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered
     * with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the
     * load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB
     * health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances are being deregistered from the
     * load balancer. If connection draining is enabled, Elastic Load Balancing
     * waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         One of the following load balancer states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Adding</code> - The instances in the group are being
     *         registered with the load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Added</code> - All instances in the group are registered
     *         with the load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InService</code> - At least one instance in the group
     *         passed an ELB health check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removing</code> - The instances are being deregistered from
     *         the load balancer. If connection draining is enabled, Elastic
     *         Load Balancing waits for in-flight requests to complete before
     *         deregistering the instances.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered
     * with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the
     * load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB
     * health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances are being deregistered from the
     * load balancer. If connection draining is enabled, Elastic Load Balancing
     * waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param state <p>
     *            One of the following load balancer states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Adding</code> - The instances in the group are being
     *            registered with the load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Added</code> - All instances in the group are registered
     *            with the load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InService</code> - At least one instance in the group
     *            passed an ELB health check.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Removing</code> - The instances are being deregistered
     *            from the load balancer. If connection draining is enabled,
     *            Elastic Load Balancing waits for in-flight requests to
     *            complete before deregistering the instances.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered
     * with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the
     * load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB
     * health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances are being deregistered from the
     * load balancer. If connection draining is enabled, Elastic Load Balancing
     * waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param state <p>
     *            One of the following load balancer states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Adding</code> - The instances in the group are being
     *            registered with the load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Added</code> - All instances in the group are registered
     *            with the load balancer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InService</code> - At least one instance in the group
     *            passed an ELB health check.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Removing</code> - The instances are being deregistered
     *            from the load balancer. If connection draining is enabled,
     *            Elastic Load Balancing waits for in-flight requests to
     *            complete before deregistering the instances.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerState withState(String state) {
        this.state = state;
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
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerState == false)
            return false;
        LoadBalancerState other = (LoadBalancerState) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
