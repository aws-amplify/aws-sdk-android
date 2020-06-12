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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a device object associated with a tape gateway.
 * </p>
 */
public class VTLDevice implements Serializable {
    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String vTLDeviceARN;

    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     */
    private String vTLDeviceType;

    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     */
    private String vTLDeviceVendor;

    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     */
    private String vTLDeviceProductIdentifier;

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     */
    private DeviceiSCSIAttributes deviceiSCSIAttributes;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         Specifies the unique Amazon Resource Name (ARN) of the device
     *         (tape drive or media changer).
     *         </p>
     */
    public String getVTLDeviceARN() {
        return vTLDeviceARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN <p>
     *            Specifies the unique Amazon Resource Name (ARN) of the device
     *            (tape drive or media changer).
     *            </p>
     */
    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN <p>
     *            Specifies the unique Amazon Resource Name (ARN) of the device
     *            (tape drive or media changer).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VTLDevice withVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
        return this;
    }

    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     *
     * @return <p>
     *         Specifies the type of device that the VTL device emulates.
     *         </p>
     */
    public String getVTLDeviceType() {
        return vTLDeviceType;
    }

    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     *
     * @param vTLDeviceType <p>
     *            Specifies the type of device that the VTL device emulates.
     *            </p>
     */
    public void setVTLDeviceType(String vTLDeviceType) {
        this.vTLDeviceType = vTLDeviceType;
    }

    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vTLDeviceType <p>
     *            Specifies the type of device that the VTL device emulates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VTLDevice withVTLDeviceType(String vTLDeviceType) {
        this.vTLDeviceType = vTLDeviceType;
        return this;
    }

    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     *
     * @return <p>
     *         Specifies the vendor of the device that the VTL device object
     *         emulates.
     *         </p>
     */
    public String getVTLDeviceVendor() {
        return vTLDeviceVendor;
    }

    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     *
     * @param vTLDeviceVendor <p>
     *            Specifies the vendor of the device that the VTL device object
     *            emulates.
     *            </p>
     */
    public void setVTLDeviceVendor(String vTLDeviceVendor) {
        this.vTLDeviceVendor = vTLDeviceVendor;
    }

    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vTLDeviceVendor <p>
     *            Specifies the vendor of the device that the VTL device object
     *            emulates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VTLDevice withVTLDeviceVendor(String vTLDeviceVendor) {
        this.vTLDeviceVendor = vTLDeviceVendor;
        return this;
    }

    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     *
     * @return <p>
     *         Specifies the model number of device that the VTL device
     *         emulates.
     *         </p>
     */
    public String getVTLDeviceProductIdentifier() {
        return vTLDeviceProductIdentifier;
    }

    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     *
     * @param vTLDeviceProductIdentifier <p>
     *            Specifies the model number of device that the VTL device
     *            emulates.
     *            </p>
     */
    public void setVTLDeviceProductIdentifier(String vTLDeviceProductIdentifier) {
        this.vTLDeviceProductIdentifier = vTLDeviceProductIdentifier;
    }

    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vTLDeviceProductIdentifier <p>
     *            Specifies the model number of device that the VTL device
     *            emulates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VTLDevice withVTLDeviceProductIdentifier(String vTLDeviceProductIdentifier) {
        this.vTLDeviceProductIdentifier = vTLDeviceProductIdentifier;
        return this;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     *
     * @return <p>
     *         A list of iSCSI information about a VTL device.
     *         </p>
     */
    public DeviceiSCSIAttributes getDeviceiSCSIAttributes() {
        return deviceiSCSIAttributes;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     *
     * @param deviceiSCSIAttributes <p>
     *            A list of iSCSI information about a VTL device.
     *            </p>
     */
    public void setDeviceiSCSIAttributes(DeviceiSCSIAttributes deviceiSCSIAttributes) {
        this.deviceiSCSIAttributes = deviceiSCSIAttributes;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceiSCSIAttributes <p>
     *            A list of iSCSI information about a VTL device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VTLDevice withDeviceiSCSIAttributes(DeviceiSCSIAttributes deviceiSCSIAttributes) {
        this.deviceiSCSIAttributes = deviceiSCSIAttributes;
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
        if (getVTLDeviceARN() != null)
            sb.append("VTLDeviceARN: " + getVTLDeviceARN() + ",");
        if (getVTLDeviceType() != null)
            sb.append("VTLDeviceType: " + getVTLDeviceType() + ",");
        if (getVTLDeviceVendor() != null)
            sb.append("VTLDeviceVendor: " + getVTLDeviceVendor() + ",");
        if (getVTLDeviceProductIdentifier() != null)
            sb.append("VTLDeviceProductIdentifier: " + getVTLDeviceProductIdentifier() + ",");
        if (getDeviceiSCSIAttributes() != null)
            sb.append("DeviceiSCSIAttributes: " + getDeviceiSCSIAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode());
        hashCode = prime * hashCode
                + ((getVTLDeviceType() == null) ? 0 : getVTLDeviceType().hashCode());
        hashCode = prime * hashCode
                + ((getVTLDeviceVendor() == null) ? 0 : getVTLDeviceVendor().hashCode());
        hashCode = prime
                * hashCode
                + ((getVTLDeviceProductIdentifier() == null) ? 0 : getVTLDeviceProductIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceiSCSIAttributes() == null) ? 0 : getDeviceiSCSIAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VTLDevice == false)
            return false;
        VTLDevice other = (VTLDevice) obj;

        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null)
            return false;
        if (other.getVTLDeviceARN() != null
                && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false)
            return false;
        if (other.getVTLDeviceType() == null ^ this.getVTLDeviceType() == null)
            return false;
        if (other.getVTLDeviceType() != null
                && other.getVTLDeviceType().equals(this.getVTLDeviceType()) == false)
            return false;
        if (other.getVTLDeviceVendor() == null ^ this.getVTLDeviceVendor() == null)
            return false;
        if (other.getVTLDeviceVendor() != null
                && other.getVTLDeviceVendor().equals(this.getVTLDeviceVendor()) == false)
            return false;
        if (other.getVTLDeviceProductIdentifier() == null
                ^ this.getVTLDeviceProductIdentifier() == null)
            return false;
        if (other.getVTLDeviceProductIdentifier() != null
                && other.getVTLDeviceProductIdentifier().equals(
                        this.getVTLDeviceProductIdentifier()) == false)
            return false;
        if (other.getDeviceiSCSIAttributes() == null ^ this.getDeviceiSCSIAttributes() == null)
            return false;
        if (other.getDeviceiSCSIAttributes() != null
                && other.getDeviceiSCSIAttributes().equals(this.getDeviceiSCSIAttributes()) == false)
            return false;
        return true;
    }
}
