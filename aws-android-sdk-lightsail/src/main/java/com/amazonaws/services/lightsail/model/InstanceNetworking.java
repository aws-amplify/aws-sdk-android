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

/**
 * <p>
 * Describes monthly data transfer rates and port information for an instance.
 * </p>
 */
public class InstanceNetworking implements Serializable {
    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     */
    private MonthlyTransfer monthlyTransfer;

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the
     * instance.
     * </p>
     */
    private java.util.List<InstancePortInfo> ports;

    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     *
     * @return <p>
     *         The amount of data in GB allocated for monthly data transfers.
     *         </p>
     */
    public MonthlyTransfer getMonthlyTransfer() {
        return monthlyTransfer;
    }

    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     *
     * @param monthlyTransfer <p>
     *            The amount of data in GB allocated for monthly data transfers.
     *            </p>
     */
    public void setMonthlyTransfer(MonthlyTransfer monthlyTransfer) {
        this.monthlyTransfer = monthlyTransfer;
    }

    /**
     * <p>
     * The amount of data in GB allocated for monthly data transfers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monthlyTransfer <p>
     *            The amount of data in GB allocated for monthly data transfers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworking withMonthlyTransfer(MonthlyTransfer monthlyTransfer) {
        this.monthlyTransfer = monthlyTransfer;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the
     * instance.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about the
     *         ports on the instance.
     *         </p>
     */
    public java.util.List<InstancePortInfo> getPorts() {
        return ports;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the
     * instance.
     * </p>
     *
     * @param ports <p>
     *            An array of key-value pairs containing information about the
     *            ports on the instance.
     *            </p>
     */
    public void setPorts(java.util.Collection<InstancePortInfo> ports) {
        if (ports == null) {
            this.ports = null;
            return;
        }

        this.ports = new java.util.ArrayList<InstancePortInfo>(ports);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ports <p>
     *            An array of key-value pairs containing information about the
     *            ports on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworking withPorts(InstancePortInfo... ports) {
        if (getPorts() == null) {
            this.ports = new java.util.ArrayList<InstancePortInfo>(ports.length);
        }
        for (InstancePortInfo value : ports) {
            this.ports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the ports on the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ports <p>
     *            An array of key-value pairs containing information about the
     *            ports on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworking withPorts(java.util.Collection<InstancePortInfo> ports) {
        setPorts(ports);
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
        if (getMonthlyTransfer() != null)
            sb.append("monthlyTransfer: " + getMonthlyTransfer() + ",");
        if (getPorts() != null)
            sb.append("ports: " + getPorts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMonthlyTransfer() == null) ? 0 : getMonthlyTransfer().hashCode());
        hashCode = prime * hashCode + ((getPorts() == null) ? 0 : getPorts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceNetworking == false)
            return false;
        InstanceNetworking other = (InstanceNetworking) obj;

        if (other.getMonthlyTransfer() == null ^ this.getMonthlyTransfer() == null)
            return false;
        if (other.getMonthlyTransfer() != null
                && other.getMonthlyTransfer().equals(this.getMonthlyTransfer()) == false)
            return false;
        if (other.getPorts() == null ^ this.getPorts() == null)
            return false;
        if (other.getPorts() != null && other.getPorts().equals(this.getPorts()) == false)
            return false;
        return true;
    }
}
