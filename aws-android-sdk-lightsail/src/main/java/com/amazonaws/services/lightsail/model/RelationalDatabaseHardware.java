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
 * Describes the hardware of a database.
 * </p>
 */
public class RelationalDatabaseHardware implements Serializable {
    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     */
    private Integer cpuCount;

    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     */
    private Integer diskSizeInGb;

    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     */
    private Float ramSizeInGb;

    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     *
     * @return <p>
     *         The number of vCPUs for the database.
     *         </p>
     */
    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     *
     * @param cpuCount <p>
     *            The number of vCPUs for the database.
     *            </p>
     */
    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuCount <p>
     *            The number of vCPUs for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseHardware withCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     *
     * @return <p>
     *         The size of the disk for the database.
     *         </p>
     */
    public Integer getDiskSizeInGb() {
        return diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     *
     * @param diskSizeInGb <p>
     *            The size of the disk for the database.
     *            </p>
     */
    public void setDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
    }

    /**
     * <p>
     * The size of the disk for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSizeInGb <p>
     *            The size of the disk for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseHardware withDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     *
     * @return <p>
     *         The amount of RAM in GB for the database.
     *         </p>
     */
    public Float getRamSizeInGb() {
        return ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB for the database.
     *            </p>
     */
    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramSizeInGb <p>
     *            The amount of RAM in GB for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseHardware withRamSizeInGb(Float ramSizeInGb) {
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
        if (getDiskSizeInGb() != null)
            sb.append("diskSizeInGb: " + getDiskSizeInGb() + ",");
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
        hashCode = prime * hashCode
                + ((getDiskSizeInGb() == null) ? 0 : getDiskSizeInGb().hashCode());
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

        if (obj instanceof RelationalDatabaseHardware == false)
            return false;
        RelationalDatabaseHardware other = (RelationalDatabaseHardware) obj;

        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getDiskSizeInGb() == null ^ this.getDiskSizeInGb() == null)
            return false;
        if (other.getDiskSizeInGb() != null
                && other.getDiskSizeInGb().equals(this.getDiskSizeInGb()) == false)
            return false;
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null
                && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        return true;
    }
}
