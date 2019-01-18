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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detaches one or more Classic Load Balancers from the specified Auto Scaling
 * group.
 * </p>
 * <p>
 * This operation detaches only Classic Load Balancers. If you have Application
 * Load Balancers, use <a>DetachLoadBalancerTargetGroups</a> instead.
 * </p>
 * <p>
 * When you detach a load balancer, it enters the <code>Removing</code> state
 * while deregistering the instances in the group. When all instances are
 * deregistered, then you can no longer describe the load balancer using
 * <a>DescribeLoadBalancers</a>. The instances remain running.
 * </p>
 */
public class DetachLoadBalancersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The names of the load balancers. You can specify up to 10 load balancers.
     * </p>
     */
    private java.util.List<String> loadBalancerNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachLoadBalancersRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The names of the load balancers. You can specify up to 10 load balancers.
     * </p>
     *
     * @return <p>
     *         The names of the load balancers. You can specify up to 10 load
     *         balancers.
     *         </p>
     */
    public java.util.List<String> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * <p>
     * The names of the load balancers. You can specify up to 10 load balancers.
     * </p>
     *
     * @param loadBalancerNames <p>
     *            The names of the load balancers. You can specify up to 10 load
     *            balancers.
     *            </p>
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames);
    }

    /**
     * <p>
     * The names of the load balancers. You can specify up to 10 load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            The names of the load balancers. You can specify up to 10 load
     *            balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachLoadBalancersRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) {
            this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames.length);
        }
        for (String value : loadBalancerNames) {
            this.loadBalancerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the load balancers. You can specify up to 10 load balancers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            The names of the load balancers. You can specify up to 10 load
     *            balancers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachLoadBalancersRequest withLoadBalancerNames(
            java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: " + getLoadBalancerNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachLoadBalancersRequest == false)
            return false;
        DetachLoadBalancersRequest other = (DetachLoadBalancersRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null
                && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false)
            return false;
        return true;
    }
}
