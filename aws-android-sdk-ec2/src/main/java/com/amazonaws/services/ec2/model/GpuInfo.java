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
 * Describes the GPU accelerators for the instance type.
 * </p>
 */
public class GpuInfo implements Serializable {
    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     */
    private java.util.List<GpuDeviceInfo> gpus;

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance
     * type.
     * </p>
     */
    private Integer totalGpuMemoryInMiB;

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the GPU accelerators for the instance type.
     *         </p>
     */
    public java.util.List<GpuDeviceInfo> getGpus() {
        return gpus;
    }

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     *
     * @param gpus <p>
     *            Describes the GPU accelerators for the instance type.
     *            </p>
     */
    public void setGpus(java.util.Collection<GpuDeviceInfo> gpus) {
        if (gpus == null) {
            this.gpus = null;
            return;
        }

        this.gpus = new java.util.ArrayList<GpuDeviceInfo>(gpus);
    }

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gpus <p>
     *            Describes the GPU accelerators for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GpuInfo withGpus(GpuDeviceInfo... gpus) {
        if (getGpus() == null) {
            this.gpus = new java.util.ArrayList<GpuDeviceInfo>(gpus.length);
        }
        for (GpuDeviceInfo value : gpus) {
            this.gpus.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the GPU accelerators for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gpus <p>
     *            Describes the GPU accelerators for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GpuInfo withGpus(java.util.Collection<GpuDeviceInfo> gpus) {
        setGpus(gpus);
        return this;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance
     * type.
     * </p>
     *
     * @return <p>
     *         The total size of the memory for the GPU accelerators for the
     *         instance type.
     *         </p>
     */
    public Integer getTotalGpuMemoryInMiB() {
        return totalGpuMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance
     * type.
     * </p>
     *
     * @param totalGpuMemoryInMiB <p>
     *            The total size of the memory for the GPU accelerators for the
     *            instance type.
     *            </p>
     */
    public void setTotalGpuMemoryInMiB(Integer totalGpuMemoryInMiB) {
        this.totalGpuMemoryInMiB = totalGpuMemoryInMiB;
    }

    /**
     * <p>
     * The total size of the memory for the GPU accelerators for the instance
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalGpuMemoryInMiB <p>
     *            The total size of the memory for the GPU accelerators for the
     *            instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GpuInfo withTotalGpuMemoryInMiB(Integer totalGpuMemoryInMiB) {
        this.totalGpuMemoryInMiB = totalGpuMemoryInMiB;
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
        if (getGpus() != null)
            sb.append("Gpus: " + getGpus() + ",");
        if (getTotalGpuMemoryInMiB() != null)
            sb.append("TotalGpuMemoryInMiB: " + getTotalGpuMemoryInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGpus() == null) ? 0 : getGpus().hashCode());
        hashCode = prime * hashCode
                + ((getTotalGpuMemoryInMiB() == null) ? 0 : getTotalGpuMemoryInMiB().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GpuInfo == false)
            return false;
        GpuInfo other = (GpuInfo) obj;

        if (other.getGpus() == null ^ this.getGpus() == null)
            return false;
        if (other.getGpus() != null && other.getGpus().equals(this.getGpus()) == false)
            return false;
        if (other.getTotalGpuMemoryInMiB() == null ^ this.getTotalGpuMemoryInMiB() == null)
            return false;
        if (other.getTotalGpuMemoryInMiB() != null
                && other.getTotalGpuMemoryInMiB().equals(this.getTotalGpuMemoryInMiB()) == false)
            return false;
        return true;
    }
}
