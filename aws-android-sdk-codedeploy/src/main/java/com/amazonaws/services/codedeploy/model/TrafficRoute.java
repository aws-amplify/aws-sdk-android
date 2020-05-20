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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a listener. The listener contains the path used to route
 * traffic that is received from the load balancer to a target group.
 * </p>
 */
public class TrafficRoute implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of one listener. The listener identifies
     * the route between a target group and a load balancer. This is an array of
     * strings with a maximum size of one.
     * </p>
     */
    private java.util.List<String> listenerArns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of one listener. The listener identifies
     * the route between a target group and a load balancer. This is an array of
     * strings with a maximum size of one.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of one listener. The listener
     *         identifies the route between a target group and a load balancer.
     *         This is an array of strings with a maximum size of one.
     *         </p>
     */
    public java.util.List<String> getListenerArns() {
        return listenerArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of one listener. The listener identifies
     * the route between a target group and a load balancer. This is an array of
     * strings with a maximum size of one.
     * </p>
     *
     * @param listenerArns <p>
     *            The Amazon Resource Name (ARN) of one listener. The listener
     *            identifies the route between a target group and a load
     *            balancer. This is an array of strings with a maximum size of
     *            one.
     *            </p>
     */
    public void setListenerArns(java.util.Collection<String> listenerArns) {
        if (listenerArns == null) {
            this.listenerArns = null;
            return;
        }

        this.listenerArns = new java.util.ArrayList<String>(listenerArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of one listener. The listener identifies
     * the route between a target group and a load balancer. This is an array of
     * strings with a maximum size of one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listenerArns <p>
     *            The Amazon Resource Name (ARN) of one listener. The listener
     *            identifies the route between a target group and a load
     *            balancer. This is an array of strings with a maximum size of
     *            one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficRoute withListenerArns(String... listenerArns) {
        if (getListenerArns() == null) {
            this.listenerArns = new java.util.ArrayList<String>(listenerArns.length);
        }
        for (String value : listenerArns) {
            this.listenerArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of one listener. The listener identifies
     * the route between a target group and a load balancer. This is an array of
     * strings with a maximum size of one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listenerArns <p>
     *            The Amazon Resource Name (ARN) of one listener. The listener
     *            identifies the route between a target group and a load
     *            balancer. This is an array of strings with a maximum size of
     *            one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficRoute withListenerArns(java.util.Collection<String> listenerArns) {
        setListenerArns(listenerArns);
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
        if (getListenerArns() != null)
            sb.append("listenerArns: " + getListenerArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getListenerArns() == null) ? 0 : getListenerArns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficRoute == false)
            return false;
        TrafficRoute other = (TrafficRoute) obj;

        if (other.getListenerArns() == null ^ this.getListenerArns() == null)
            return false;
        if (other.getListenerArns() != null
                && other.getListenerArns().equals(this.getListenerArns()) == false)
            return false;
        return true;
    }
}
