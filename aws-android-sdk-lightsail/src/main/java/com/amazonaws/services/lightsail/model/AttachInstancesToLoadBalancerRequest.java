/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches one or more Lightsail instances to a load balancer.
 * </p>
 * <p>
 * After some time, the instances are attached to the load balancer and the
 * health check status is available.
 * </p>
 * <p>
 * The <code>attach instances to load balancer</code> operation supports
 * tag-based access control via resource tags applied to the resource identified
 * by <code>load balancer name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class AttachInstancesToLoadBalancerRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String loadBalancerName;

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach
     * to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your
     * load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach
     * to your load balancer, aside from the limit of Lightsail instances you
     * can create in your account (20).
     * </p>
     */
    private java.util.List<String> instanceNames;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
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
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
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
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachInstancesToLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach
     * to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your
     * load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach
     * to your load balancer, aside from the limit of Lightsail instances you
     * can create in your account (20).
     * </p>
     *
     * @return <p>
     *         An array of strings representing the instance name(s) you want to
     *         attach to your load balancer.
     *         </p>
     *         <p>
     *         An instance must be <code>running</code> before you can attach it
     *         to your load balancer.
     *         </p>
     *         <p>
     *         There are no additional limits on the number of instances you can
     *         attach to your load balancer, aside from the limit of Lightsail
     *         instances you can create in your account (20).
     *         </p>
     */
    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach
     * to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your
     * load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach
     * to your load balancer, aside from the limit of Lightsail instances you
     * can create in your account (20).
     * </p>
     *
     * @param instanceNames <p>
     *            An array of strings representing the instance name(s) you want
     *            to attach to your load balancer.
     *            </p>
     *            <p>
     *            An instance must be <code>running</code> before you can attach
     *            it to your load balancer.
     *            </p>
     *            <p>
     *            There are no additional limits on the number of instances you
     *            can attach to your load balancer, aside from the limit of
     *            Lightsail instances you can create in your account (20).
     *            </p>
     */
    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new java.util.ArrayList<String>(instanceNames);
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach
     * to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your
     * load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach
     * to your load balancer, aside from the limit of Lightsail instances you
     * can create in your account (20).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            An array of strings representing the instance name(s) you want
     *            to attach to your load balancer.
     *            </p>
     *            <p>
     *            An instance must be <code>running</code> before you can attach
     *            it to your load balancer.
     *            </p>
     *            <p>
     *            There are no additional limits on the number of instances you
     *            can attach to your load balancer, aside from the limit of
     *            Lightsail instances you can create in your account (20).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachInstancesToLoadBalancerRequest withInstanceNames(String... instanceNames) {
        if (getInstanceNames() == null) {
            this.instanceNames = new java.util.ArrayList<String>(instanceNames.length);
        }
        for (String value : instanceNames) {
            this.instanceNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings representing the instance name(s) you want to attach
     * to your load balancer.
     * </p>
     * <p>
     * An instance must be <code>running</code> before you can attach it to your
     * load balancer.
     * </p>
     * <p>
     * There are no additional limits on the number of instances you can attach
     * to your load balancer, aside from the limit of Lightsail instances you
     * can create in your account (20).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            An array of strings representing the instance name(s) you want
     *            to attach to your load balancer.
     *            </p>
     *            <p>
     *            An instance must be <code>running</code> before you can attach
     *            it to your load balancer.
     *            </p>
     *            <p>
     *            There are no additional limits on the number of instances you
     *            can attach to your load balancer, aside from the limit of
     *            Lightsail instances you can create in your account (20).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachInstancesToLoadBalancerRequest withInstanceNames(
            java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
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
            sb.append("loadBalancerName: " + getLoadBalancerName() + ",");
        if (getInstanceNames() != null)
            sb.append("instanceNames: " + getInstanceNames());
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
                + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachInstancesToLoadBalancerRequest == false)
            return false;
        AttachInstancesToLoadBalancerRequest other = (AttachInstancesToLoadBalancerRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null
                && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        return true;
    }
}
