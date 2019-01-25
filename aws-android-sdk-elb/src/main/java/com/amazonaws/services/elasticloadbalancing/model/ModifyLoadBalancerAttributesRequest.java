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
 * Modifies the attributes of the specified load balancer.
 * </p>
 * <p>
 * You can modify the load balancer attributes, such as <code>AccessLogs</code>,
 * <code>ConnectionDraining</code>, and <code>CrossZoneLoadBalancing</code> by
 * either enabling or disabling them. Or, you can modify the load balancer
 * attribute <code>ConnectionSettings</code> by specifying an idle connection
 * timeout value for your load balancer.
 * </p>
 * <p>
 * For more information, see the following in the <i>Classic Load Balancers
 * Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html"
 * >Cross-Zone Load Balancing</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html"
 * >Connection Draining</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/access-log-collection.html"
 * >Access Logs</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html"
 * >Idle Connection Timeout</a>
 * </p>
 * </li>
 * </ul>
 */
public class ModifyLoadBalancerAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The attributes for the load balancer.
     * </p>
     */
    private LoadBalancerAttributes loadBalancerAttributes;

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
    public ModifyLoadBalancerAttributesRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The attributes for the load balancer.
     * </p>
     *
     * @return <p>
     *         The attributes for the load balancer.
     *         </p>
     */
    public LoadBalancerAttributes getLoadBalancerAttributes() {
        return loadBalancerAttributes;
    }

    /**
     * <p>
     * The attributes for the load balancer.
     * </p>
     *
     * @param loadBalancerAttributes <p>
     *            The attributes for the load balancer.
     *            </p>
     */
    public void setLoadBalancerAttributes(LoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
    }

    /**
     * <p>
     * The attributes for the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerAttributes <p>
     *            The attributes for the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyLoadBalancerAttributesRequest withLoadBalancerAttributes(
            LoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
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
        if (getLoadBalancerAttributes() != null)
            sb.append("LoadBalancerAttributes: " + getLoadBalancerAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime
                * hashCode
                + ((getLoadBalancerAttributes() == null) ? 0 : getLoadBalancerAttributes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyLoadBalancerAttributesRequest == false)
            return false;
        ModifyLoadBalancerAttributesRequest other = (ModifyLoadBalancerAttributesRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerAttributes() == null ^ this.getLoadBalancerAttributes() == null)
            return false;
        if (other.getLoadBalancerAttributes() != null
                && other.getLoadBalancerAttributes().equals(this.getLoadBalancerAttributes()) == false)
            return false;
        return true;
    }
}
