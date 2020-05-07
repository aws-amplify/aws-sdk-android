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
 * Describes the hardware for the instance.
 * </p>
 */
public class InstanceHardware implements Serializable {
    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     */
    private Integer cpuCount;

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     */
    private java.util.List<Disk> disks;

    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     */
    private Float ramSizeInGb;

    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     *
     * @return <p>
     *         The number of vCPUs the instance has.
     *         </p>
     */
    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     *
     * @param cpuCount <p>
     *            The number of vCPUs the instance has.
     *            </p>
     */
    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs the instance has.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuCount <p>
     *            The number of vCPUs the instance has.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceHardware withCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     *
     * @return <p>
     *         The disks attached to the instance.
     *         </p>
     */
    public java.util.List<Disk> getDisks() {
        return disks;
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     *
     * @param disks <p>
     *            The disks attached to the instance.
     *            </p>
     */
    public void setDisks(java.util.Collection<Disk> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new java.util.ArrayList<Disk>(disks);
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disks <p>
     *            The disks attached to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceHardware withDisks(Disk... disks) {
        if (getDisks() == null) {
            this.disks = new java.util.ArrayList<Disk>(disks.length);
        }
        for (Disk value : disks) {
            this.disks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The disks attached to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disks <p>
     *            The disks attached to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceHardware withDisks(java.util.Collection<Disk> disks) {
        setDisks(disks);
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     *
     * @return <p>
     *         The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     *         </p>
     */
    public Float getRamSizeInGb() {
        return ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB on the instance (e.g.,
     *            <code>1.0</code>).
     *            </p>
     */
    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB on the instance (e.g., <code>1.0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB on the instance (e.g.,
     *            <code>1.0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceHardware withRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
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
        if (getCpuCount() != null)
            sb.append("cpuCount: " + getCpuCount() + ",");
        if (getDisks() != null)
            sb.append("disks: " + getDisks() + ",");
        if (getRamSizeInGb() != null)
            sb.append("ramSizeInGb: " + getRamSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuCount() == null) ? 0 : getCpuCount().hashCode());
        hashCode = prime * hashCode + ((getDisks() == null) ? 0 : getDisks().hashCode());
        hashCode = prime * hashCode
                + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceHardware == false)
            return false;
        InstanceHardware other = (InstanceHardware) obj;

        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getDisks() == null ^ this.getDisks() == null)
            return false;
        if (other.getDisks() != null && other.getDisks().equals(this.getDisks()) == false)
            return false;
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null
                && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        return true;
    }
}
