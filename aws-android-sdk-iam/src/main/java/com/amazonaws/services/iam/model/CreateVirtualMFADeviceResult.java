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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>CreateVirtualMFADevice</a> request.
 * </p>
 */
public class CreateVirtualMFADeviceResult implements Serializable {
    /**
     * <p>
     * A structure containing details about the new virtual MFA device.
     * </p>
     */
    private VirtualMFADevice virtualMFADevice;

    /**
     * <p>
     * A structure containing details about the new virtual MFA device.
     * </p>
     *
     * @return <p>
     *         A structure containing details about the new virtual MFA device.
     *         </p>
     */
    public VirtualMFADevice getVirtualMFADevice() {
        return virtualMFADevice;
    }

    /**
     * <p>
     * A structure containing details about the new virtual MFA device.
     * </p>
     *
     * @param virtualMFADevice <p>
     *            A structure containing details about the new virtual MFA
     *            device.
     *            </p>
     */
    public void setVirtualMFADevice(VirtualMFADevice virtualMFADevice) {
        this.virtualMFADevice = virtualMFADevice;
    }

    /**
     * <p>
     * A structure containing details about the new virtual MFA device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualMFADevice <p>
     *            A structure containing details about the new virtual MFA
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVirtualMFADeviceResult withVirtualMFADevice(VirtualMFADevice virtualMFADevice) {
        this.virtualMFADevice = virtualMFADevice;
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
        if (getVirtualMFADevice() != null)
            sb.append("VirtualMFADevice: " + getVirtualMFADevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualMFADevice() == null) ? 0 : getVirtualMFADevice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVirtualMFADeviceResult == false)
            return false;
        CreateVirtualMFADeviceResult other = (CreateVirtualMFADeviceResult) obj;

        if (other.getVirtualMFADevice() == null ^ this.getVirtualMFADevice() == null)
            return false;
        if (other.getVirtualMFADevice() != null
                && other.getVirtualMFADevice().equals(this.getVirtualMFADevice()) == false)
            return false;
        return true;
    }
}
