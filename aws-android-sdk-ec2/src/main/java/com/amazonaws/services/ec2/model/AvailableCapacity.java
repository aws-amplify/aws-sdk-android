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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The capacity information for instances that can be launched onto the
 * Dedicated Host.
 * </p>
 */
public class AvailableCapacity implements Serializable {
    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * depending on the host's available capacity. For Dedicated Hosts that
     * support multiple instance types, this parameter represents the number of
     * instances for each instance size that is supported on the host.
     * </p>
     */
    private java.util.List<InstanceCapacity> availableInstanceCapacity;

    /**
     * <p>
     * The number of vCPUs available for launching instances onto the Dedicated
     * Host.
     * </p>
     */
    private Integer availableVCpus;

    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * depending on the host's available capacity. For Dedicated Hosts that
     * support multiple instance types, this parameter represents the number of
     * instances for each instance size that is supported on the host.
     * </p>
     *
     * @return <p>
     *         The number of instances that can be launched onto the Dedicated
     *         Host depending on the host's available capacity. For Dedicated
     *         Hosts that support multiple instance types, this parameter
     *         represents the number of instances for each instance size that is
     *         supported on the host.
     *         </p>
     */
    public java.util.List<InstanceCapacity> getAvailableInstanceCapacity() {
        return availableInstanceCapacity;
    }

    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * depending on the host's available capacity. For Dedicated Hosts that
     * support multiple instance types, this parameter represents the number of
     * instances for each instance size that is supported on the host.
     * </p>
     *
     * @param availableInstanceCapacity <p>
     *            The number of instances that can be launched onto the
     *            Dedicated Host depending on the host's available capacity. For
     *            Dedicated Hosts that support multiple instance types, this
     *            parameter represents the number of instances for each instance
     *            size that is supported on the host.
     *            </p>
     */
    public void setAvailableInstanceCapacity(
            java.util.Collection<InstanceCapacity> availableInstanceCapacity) {
        if (availableInstanceCapacity == null) {
            this.availableInstanceCapacity = null;
            return;
        }

        this.availableInstanceCapacity = new java.util.ArrayList<InstanceCapacity>(
                availableInstanceCapacity);
    }

    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * depending on the host's available capacity. For Dedicated Hosts that
     * support multiple instance types, this parameter represents the number of
     * instances for each instance size that is supported on the host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableInstanceCapacity <p>
     *            The number of instances that can be launched onto the
     *            Dedicated Host depending on the host's available capacity. For
     *            Dedicated Hosts that support multiple instance types, this
     *            parameter represents the number of instances for each instance
     *            size that is supported on the host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailableCapacity withAvailableInstanceCapacity(
            InstanceCapacity... availableInstanceCapacity) {
        if (getAvailableInstanceCapacity() == null) {
            this.availableInstanceCapacity = new java.util.ArrayList<InstanceCapacity>(
                    availableInstanceCapacity.length);
        }
        for (InstanceCapacity value : availableInstanceCapacity) {
            this.availableInstanceCapacity.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * depending on the host's available capacity. For Dedicated Hosts that
     * support multiple instance types, this parameter represents the number of
     * instances for each instance size that is supported on the host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableInstanceCapacity <p>
     *            The number of instances that can be launched onto the
     *            Dedicated Host depending on the host's available capacity. For
     *            Dedicated Hosts that support multiple instance types, this
     *            parameter represents the number of instances for each instance
     *            size that is supported on the host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailableCapacity withAvailableInstanceCapacity(
            java.util.Collection<InstanceCapacity> availableInstanceCapacity) {
        setAvailableInstanceCapacity(availableInstanceCapacity);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs available for launching instances onto the Dedicated
     * Host.
     * </p>
     *
     * @return <p>
     *         The number of vCPUs available for launching instances onto the
     *         Dedicated Host.
     *         </p>
     */
    public Integer getAvailableVCpus() {
        return availableVCpus;
    }

    /**
     * <p>
     * The number of vCPUs available for launching instances onto the Dedicated
     * Host.
     * </p>
     *
     * @param availableVCpus <p>
     *            The number of vCPUs available for launching instances onto the
     *            Dedicated Host.
     *            </p>
     */
    public void setAvailableVCpus(Integer availableVCpus) {
        this.availableVCpus = availableVCpus;
    }

    /**
     * <p>
     * The number of vCPUs available for launching instances onto the Dedicated
     * Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableVCpus <p>
     *            The number of vCPUs available for launching instances onto the
     *            Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailableCapacity withAvailableVCpus(Integer availableVCpus) {
        this.availableVCpus = availableVCpus;
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
        if (getAvailableInstanceCapacity() != null)
            sb.append("AvailableInstanceCapacity: " + getAvailableInstanceCapacity() + ",");
        if (getAvailableVCpus() != null)
            sb.append("AvailableVCpus: " + getAvailableVCpus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAvailableInstanceCapacity() == null) ? 0 : getAvailableInstanceCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAvailableVCpus() == null) ? 0 : getAvailableVCpus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailableCapacity == false)
            return false;
        AvailableCapacity other = (AvailableCapacity) obj;

        if (other.getAvailableInstanceCapacity() == null
                ^ this.getAvailableInstanceCapacity() == null)
            return false;
        if (other.getAvailableInstanceCapacity() != null
                && other.getAvailableInstanceCapacity().equals(this.getAvailableInstanceCapacity()) == false)
            return false;
        if (other.getAvailableVCpus() == null ^ this.getAvailableVCpus() == null)
            return false;
        if (other.getAvailableVCpus() != null
                && other.getAvailableVCpus().equals(this.getAvailableVCpus()) == false)
            return false;
        return true;
    }
}
