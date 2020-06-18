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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The list of AWS services returned by the <a>DescribeServices</a> operation.
 * </p>
 */
public class DescribeServicesResult implements Serializable {
    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     */
    private java.util.List<Service> services;

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     *
     * @return <p>
     *         A JSON-formatted list of AWS services.
     *         </p>
     */
    public java.util.List<Service> getServices() {
        return services;
    }

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     *
     * @param services <p>
     *            A JSON-formatted list of AWS services.
     *            </p>
     */
    public void setServices(java.util.Collection<Service> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<Service>(services);
    }

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            A JSON-formatted list of AWS services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServicesResult withServices(Service... services) {
        if (getServices() == null) {
            this.services = new java.util.ArrayList<Service>(services.length);
        }
        for (Service value : services) {
            this.services.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            A JSON-formatted list of AWS services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServicesResult withServices(java.util.Collection<Service> services) {
        setServices(services);
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
        if (getServices() != null)
            sb.append("services: " + getServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServicesResult == false)
            return false;
        DescribeServicesResult other = (DescribeServicesResult) obj;

        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        return true;
    }
}
