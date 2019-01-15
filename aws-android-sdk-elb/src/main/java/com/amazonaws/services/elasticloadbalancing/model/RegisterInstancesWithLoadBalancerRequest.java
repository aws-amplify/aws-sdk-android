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
 * Adds the specified instances to the specified load balancer.
 * </p>
 * <p>
 * The instance must be a running instance in the same network as the load
 * balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances and
 * a load balancer in a VPC with ClassicLink enabled, you can link the
 * EC2-Classic instances to that VPC and then register the linked EC2-Classic
 * instances with the load balancer in the VPC.
 * </p>
 * <p>
 * Note that <code>RegisterInstanceWithLoadBalancer</code> completes when the
 * request has been registered. Instance registration takes a little time to
 * complete. To check the state of the registered instances, use
 * <a>DescribeLoadBalancers</a> or <a>DescribeInstanceHealth</a>.
 * </p>
 * <p>
 * After the instance is registered, it starts receiving traffic and requests
 * from the load balancer. Any instance that is not in one of the Availability
 * Zones registered for the load balancer is moved to the
 * <code>OutOfService</code> state. If an Availability Zone is added to the load
 * balancer later, any instances registered with the load balancer move to the
 * <code>InService</code> state.
 * </p>
 * <p>
 * To deregister instances from a load balancer, use
 * <a>DeregisterInstancesFromLoadBalancer</a>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html"
 * >Register or De-Register EC2 Instances</a> in the <i>Classic Load Balancers
 * Guide</i>.
 * </p>
 */
public class RegisterInstancesWithLoadBalancerRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     */
    private java.util.List<Instance> instances = new java.util.ArrayList<Instance>();

    /**
     * Default constructor for RegisterInstancesWithLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     */
    public RegisterInstancesWithLoadBalancerRequest() {
    }

    /**
     * Constructs a new RegisterInstancesWithLoadBalancerRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param instances <p>
     *            The IDs of the instances.
     *            </p>
     */
    public RegisterInstancesWithLoadBalancerRequest(String loadBalancerName,
            java.util.List<Instance> instances) {
        setLoadBalancerName(loadBalancerName);
        setInstances(instances);
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
    public RegisterInstancesWithLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     *
     * @return <p>
     *         The IDs of the instances.
     *         </p>
     */
    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     *
     * @param instances <p>
     *            The IDs of the instances.
     *            </p>
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The IDs of the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterInstancesWithLoadBalancerRequest withInstances(Instance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<Instance>(instances.length);
        }
        for (Instance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The IDs of the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterInstancesWithLoadBalancerRequest withInstances(
            java.util.Collection<Instance> instances) {
        setInstances(instances);
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
        if (getInstances() != null)
            sb.append("Instances: " + getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterInstancesWithLoadBalancerRequest == false)
            return false;
        RegisterInstancesWithLoadBalancerRequest other = (RegisterInstancesWithLoadBalancerRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }
}
