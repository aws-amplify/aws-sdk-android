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
 * Adds the specified Availability Zones to the set of Availability Zones for
 * the specified load balancer in EC2-Classic or a default VPC.
 * </p>
 * <p>
 * For load balancers in a non-default VPC, use
 * <a>AttachLoadBalancerToSubnets</a>.
 * </p>
 * <p>
 * The load balancer evenly distributes requests across all its registered
 * Availability Zones that contain instances. For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html"
 * >Add or Remove Availability Zones</a> in the <i>Classic Load Balancers
 * Guide</i>.
 * </p>
 */
public class EnableAvailabilityZonesForLoadBalancerRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load
     * balancer.
     * </p>
     */
    private java.util.List<String> availabilityZones = new java.util.ArrayList<String>();

    /**
     * Default constructor for EnableAvailabilityZonesForLoadBalancerRequest
     * object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest() {
    }

    /**
     * Constructs a new EnableAvailabilityZonesForLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param availabilityZones <p>
     *            The Availability Zones. These must be in the same region as
     *            the load balancer.
     *            </p>
     */
    public EnableAvailabilityZonesForLoadBalancerRequest(String loadBalancerName,
            java.util.List<String> availabilityZones) {
        setLoadBalancerName(loadBalancerName);
        setAvailabilityZones(availabilityZones);
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
    public EnableAvailabilityZonesForLoadBalancerRequest withLoadBalancerName(
            String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load
     * balancer.
     * </p>
     *
     * @return <p>
     *         The Availability Zones. These must be in the same region as the
     *         load balancer.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load
     * balancer.
     * </p>
     *
     * @param availabilityZones <p>
     *            The Availability Zones. These must be in the same region as
     *            the load balancer.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load
     * balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones. These must be in the same region as
     *            the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(
            String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones. These must be in the same region as the load
     * balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            The Availability Zones. These must be in the same region as
     *            the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones());
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
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableAvailabilityZonesForLoadBalancerRequest == false)
            return false;
        EnableAvailabilityZonesForLoadBalancerRequest other = (EnableAvailabilityZonesForLoadBalancerRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }
}
