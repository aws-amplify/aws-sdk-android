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
 * Describes the memory for the FPGA accelerator for the instance type.
 * </p>
 */
public class FpgaDeviceMemoryInfo implements Serializable {
    /**
     * <p>
     * The size (in MiB) for the memory available to the FPGA accelerator.
     * </p>
     */
    private Integer sizeInMiB;

    /**
     * <p>
     * The size (in MiB) for the memory available to the FPGA accelerator.
     * </p>
     *
     * @return <p>
     *         The size (in MiB) for the memory available to the FPGA
     *         accelerator.
     *         </p>
     */
    public Integer getSizeInMiB() {
        return sizeInMiB;
    }

    /**
     * <p>
     * The size (in MiB) for the memory available to the FPGA accelerator.
     * </p>
     *
     * @param sizeInMiB <p>
     *            The size (in MiB) for the memory available to the FPGA
     *            accelerator.
     *            </p>
     */
    public void setSizeInMiB(Integer sizeInMiB) {
        this.sizeInMiB = sizeInMiB;
    }

    /**
     * <p>
     * The size (in MiB) for the memory available to the FPGA accelerator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInMiB <p>
     *            The size (in MiB) for the memory available to the FPGA
     *            accelerator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaDeviceMemoryInfo withSizeInMiB(Integer sizeInMiB) {
        this.sizeInMiB = sizeInMiB;
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
        if (getSizeInMiB() != null)
            sb.append("SizeInMiB: " + getSizeInMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInMiB() == null) ? 0 : getSizeInMiB().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaDeviceMemoryInfo == false)
            return false;
        FpgaDeviceMemoryInfo other = (FpgaDeviceMemoryInfo) obj;

        if (other.getSizeInMiB() == null ^ this.getSizeInMiB() == null)
            return false;
        if (other.getSizeInMiB() != null
                && other.getSizeInMiB().equals(this.getSizeInMiB()) == false)
            return false;
        return true;
    }
}
