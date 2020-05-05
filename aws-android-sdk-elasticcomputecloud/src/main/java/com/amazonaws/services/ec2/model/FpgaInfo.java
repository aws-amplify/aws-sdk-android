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
 * Describes the FPGAs for the instance type.
 * </p>
 */
public class FpgaInfo implements Serializable {
    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     */
    private java.util.List<FpgaDeviceInfo> fpgas;

    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     */
    private Integer totalFpgaMemoryInMiB;

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the FPGAs for the instance type.
     *         </p>
     */
    public java.util.List<FpgaDeviceInfo> getFpgas() {
        return fpgas;
    }

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     *
     * @param fpgas <p>
     *            Describes the FPGAs for the instance type.
     *            </p>
     */
    public void setFpgas(java.util.Collection<FpgaDeviceInfo> fpgas) {
        if (fpgas == null) {
            this.fpgas = null;
            return;
        }

        this.fpgas = new java.util.ArrayList<FpgaDeviceInfo>(fpgas);
    }

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgas <p>
     *            Describes the FPGAs for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaInfo withFpgas(FpgaDeviceInfo... fpgas) {
        if (getFpgas() == null) {
            this.fpgas = new java.util.ArrayList<FpgaDeviceInfo>(fpgas.length);
        }
        for (FpgaDeviceInfo value : fpgas) {
            this.fpgas.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the FPGAs for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgas <p>
     *            Describes the FPGAs for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaInfo withFpgas(java.util.Collection<FpgaDeviceInfo> fpgas) {
        setFpgas(fpgas);
        return this;
    }

    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     *
     * @return <p>
     *         The total memory of all FPGA accelerators for the instance type.
     *         </p>
     */
    public Integer getTotalFpgaMemoryInMiB() {
        return totalFpgaMemoryInMiB;
    }

    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     *
     * @param totalFpgaMemoryInMiB <p>
     *            The total memory of all FPGA accelerators for the instance
     *            type.
     *            </p>
     */
    public void setTotalFpgaMemoryInMiB(Integer totalFpgaMemoryInMiB) {
        this.totalFpgaMemoryInMiB = totalFpgaMemoryInMiB;
    }

    /**
     * <p>
     * The total memory of all FPGA accelerators for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalFpgaMemoryInMiB <p>
     *            The total memory of all FPGA accelerators for the instance
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaInfo withTotalFpgaMemoryInMiB(Integer totalFpgaMemoryInMiB) {
        this.totalFpgaMemoryInMiB = totalFpgaMemoryInMiB;
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
        if (getFpgas() != null)
            sb.append("Fpgas: " + getFpgas() + ",");
        if (getTotalFpgaMemoryInMiB() != null)
            sb.append("TotalFpgaMemoryInMiB: " + getTotalFpgaMemoryInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgas() == null) ? 0 : getFpgas().hashCode());
        hashCode = prime * hashCode
                + ((getTotalFpgaMemoryInMiB() == null) ? 0 : getTotalFpgaMemoryInMiB().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaInfo == false)
            return false;
        FpgaInfo other = (FpgaInfo) obj;

        if (other.getFpgas() == null ^ this.getFpgas() == null)
            return false;
        if (other.getFpgas() != null && other.getFpgas().equals(this.getFpgas()) == false)
            return false;
        if (other.getTotalFpgaMemoryInMiB() == null ^ this.getTotalFpgaMemoryInMiB() == null)
            return false;
        if (other.getTotalFpgaMemoryInMiB() != null
                && other.getTotalFpgaMemoryInMiB().equals(this.getTotalFpgaMemoryInMiB()) == false)
            return false;
        return true;
    }
}
