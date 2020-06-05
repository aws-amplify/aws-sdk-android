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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the details of a LoadBalancer.
 * </p>
 */
public class LoadBalancerDescription implements Serializable {
    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     */
    private java.util.List<Listener> listeners;

    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     *
     * @return <p>
     *         The name of the LoadBalancer.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     *
     * @param loadBalancerName <p>
     *            The name of the LoadBalancer.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the LoadBalancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerName <p>
     *            The name of the LoadBalancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     *
     * @return <p>
     *         The domain name of the LoadBalancer.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     *
     * @param domain <p>
     *            The domain name of the LoadBalancer.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain name of the LoadBalancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            The domain name of the LoadBalancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     *
     * @return <p>
     *         A list of Listeners used by the LoadBalancer.
     *         </p>
     */
    public java.util.List<Listener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     *
     * @param listeners <p>
     *            A list of Listeners used by the LoadBalancer.
     *            </p>
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<Listener>(listeners);
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            A list of Listeners used by the LoadBalancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withListeners(Listener... listeners) {
        if (getListeners() == null) {
            this.listeners = new java.util.ArrayList<Listener>(listeners.length);
        }
        for (Listener value : listeners) {
            this.listeners.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Listeners used by the LoadBalancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listeners <p>
     *            A list of Listeners used by the LoadBalancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerDescription withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getListeners() != null)
            sb.append("Listeners: " + getListeners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerDescription == false)
            return false;
        LoadBalancerDescription other = (LoadBalancerDescription) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null
                && other.getListeners().equals(this.getListeners()) == false)
            return false;
        return true;
    }
}
