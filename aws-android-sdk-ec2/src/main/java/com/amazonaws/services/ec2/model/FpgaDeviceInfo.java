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
 * Describes the FPGA accelerator for the instance type.
 * </p>
 */
public class FpgaDeviceInfo implements Serializable {
    /**
     * <p>
     * The name of the FPGA accelerator.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The manufacturer of the FPGA accelerator.
     * </p>
     */
    private String manufacturer;

    /**
     * <p>
     * The count of FPGA accelerators for the instance type.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Describes the memory for the FPGA accelerator for the instance type.
     * </p>
     */
    private FpgaDeviceMemoryInfo memoryInfo;

    /**
     * <p>
     * The name of the FPGA accelerator.
     * </p>
     *
     * @return <p>
     *         The name of the FPGA accelerator.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the FPGA accelerator.
     * </p>
     *
     * @param name <p>
     *            The name of the FPGA accelerator.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the FPGA accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the FPGA accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaDeviceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The manufacturer of the FPGA accelerator.
     * </p>
     *
     * @return <p>
     *         The manufacturer of the FPGA accelerator.
     *         </p>
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the FPGA accelerator.
     * </p>
     *
     * @param manufacturer <p>
     *            The manufacturer of the FPGA accelerator.
     *            </p>
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the FPGA accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manufacturer <p>
     *            The manufacturer of the FPGA accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaDeviceInfo withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * <p>
     * The count of FPGA accelerators for the instance type.
     * </p>
     *
     * @return <p>
     *         The count of FPGA accelerators for the instance type.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The count of FPGA accelerators for the instance type.
     * </p>
     *
     * @param count <p>
     *            The count of FPGA accelerators for the instance type.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The count of FPGA accelerators for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The count of FPGA accelerators for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaDeviceInfo withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * Describes the memory for the FPGA accelerator for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the memory for the FPGA accelerator for the instance
     *         type.
     *         </p>
     */
    public FpgaDeviceMemoryInfo getMemoryInfo() {
        return memoryInfo;
    }

    /**
     * <p>
     * Describes the memory for the FPGA accelerator for the instance type.
     * </p>
     *
     * @param memoryInfo <p>
     *            Describes the memory for the FPGA accelerator for the instance
     *            type.
     *            </p>
     */
    public void setMemoryInfo(FpgaDeviceMemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    /**
     * <p>
     * Describes the memory for the FPGA accelerator for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memoryInfo <p>
     *            Describes the memory for the FPGA accelerator for the instance
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaDeviceInfo withMemoryInfo(FpgaDeviceMemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getManufacturer() != null)
            sb.append("Manufacturer: " + getManufacturer() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getMemoryInfo() != null)
            sb.append("MemoryInfo: " + getMemoryInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getMemoryInfo() == null) ? 0 : getMemoryInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaDeviceInfo == false)
            return false;
        FpgaDeviceInfo other = (FpgaDeviceInfo) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getManufacturer() == null ^ this.getManufacturer() == null)
            return false;
        if (other.getManufacturer() != null
                && other.getManufacturer().equals(this.getManufacturer()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getMemoryInfo() == null ^ this.getMemoryInfo() == null)
            return false;
        if (other.getMemoryInfo() != null
                && other.getMemoryInfo().equals(this.getMemoryInfo()) == false)
            return false;
        return true;
    }
}
