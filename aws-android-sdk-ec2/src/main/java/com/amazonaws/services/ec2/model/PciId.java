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
 * Describes the data that identifies an Amazon FPGA image (AFI) on the PCI bus.
 * </p>
 */
public class PciId implements Serializable {
    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String deviceId;

    /**
     * <p>
     * The ID of the vendor.
     * </p>
     */
    private String vendorId;

    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     */
    private String subsystemId;

    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     */
    private String subsystemVendorId;

    /**
     * <p>
     * The ID of the device.
     * </p>
     *
     * @return <p>
     *         The ID of the device.
     *         </p>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     *
     * @param deviceId <p>
     *            The ID of the device.
     *            </p>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceId <p>
     *            The ID of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PciId withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * <p>
     * The ID of the vendor.
     * </p>
     *
     * @return <p>
     *         The ID of the vendor.
     *         </p>
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * <p>
     * The ID of the vendor.
     * </p>
     *
     * @param vendorId <p>
     *            The ID of the vendor.
     *            </p>
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * <p>
     * The ID of the vendor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vendorId <p>
     *            The ID of the vendor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PciId withVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     *
     * @return <p>
     *         The ID of the subsystem.
     *         </p>
     */
    public String getSubsystemId() {
        return subsystemId;
    }

    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     *
     * @param subsystemId <p>
     *            The ID of the subsystem.
     *            </p>
     */
    public void setSubsystemId(String subsystemId) {
        this.subsystemId = subsystemId;
    }

    /**
     * <p>
     * The ID of the subsystem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subsystemId <p>
     *            The ID of the subsystem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PciId withSubsystemId(String subsystemId) {
        this.subsystemId = subsystemId;
        return this;
    }

    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     *
     * @return <p>
     *         The ID of the vendor for the subsystem.
     *         </p>
     */
    public String getSubsystemVendorId() {
        return subsystemVendorId;
    }

    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     *
     * @param subsystemVendorId <p>
     *            The ID of the vendor for the subsystem.
     *            </p>
     */
    public void setSubsystemVendorId(String subsystemVendorId) {
        this.subsystemVendorId = subsystemVendorId;
    }

    /**
     * <p>
     * The ID of the vendor for the subsystem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subsystemVendorId <p>
     *            The ID of the vendor for the subsystem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PciId withSubsystemVendorId(String subsystemVendorId) {
        this.subsystemVendorId = subsystemVendorId;
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
        if (getDeviceId() != null)
            sb.append("DeviceId: " + getDeviceId() + ",");
        if (getVendorId() != null)
            sb.append("VendorId: " + getVendorId() + ",");
        if (getSubsystemId() != null)
            sb.append("SubsystemId: " + getSubsystemId() + ",");
        if (getSubsystemVendorId() != null)
            sb.append("SubsystemVendorId: " + getSubsystemVendorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getVendorId() == null) ? 0 : getVendorId().hashCode());
        hashCode = prime * hashCode
                + ((getSubsystemId() == null) ? 0 : getSubsystemId().hashCode());
        hashCode = prime * hashCode
                + ((getSubsystemVendorId() == null) ? 0 : getSubsystemVendorId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PciId == false)
            return false;
        PciId other = (PciId) obj;

        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getVendorId() == null ^ this.getVendorId() == null)
            return false;
        if (other.getVendorId() != null && other.getVendorId().equals(this.getVendorId()) == false)
            return false;
        if (other.getSubsystemId() == null ^ this.getSubsystemId() == null)
            return false;
        if (other.getSubsystemId() != null
                && other.getSubsystemId().equals(this.getSubsystemId()) == false)
            return false;
        if (other.getSubsystemVendorId() == null ^ this.getSubsystemVendorId() == null)
            return false;
        if (other.getSubsystemVendorId() != null
                && other.getSubsystemVendorId().equals(this.getSubsystemVendorId()) == false)
            return false;
        return true;
    }
}
