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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

public class DescribeDeviceResult implements Serializable {
    /**
     * <p>
     * The current state of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SIGNED_OUT
     */
    private String status;

    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String model;

    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String manufacturer;

    /**
     * <p>
     * The operating system of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String operatingSystem;

    /**
     * <p>
     * The operating system version of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String operatingSystemVersion;

    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String patchLevel;

    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     */
    private java.util.Date firstAccessedTime;

    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     */
    private java.util.Date lastAccessedTime;

    /**
     * <p>
     * The user name associated with the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String username;

    /**
     * <p>
     * The current state of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SIGNED_OUT
     *
     * @return <p>
     *         The current state of the device.
     *         </p>
     * @see DeviceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SIGNED_OUT
     *
     * @param status <p>
     *            The current state of the device.
     *            </p>
     * @see DeviceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SIGNED_OUT
     *
     * @param status <p>
     *            The current state of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatus
     */
    public DescribeDeviceResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SIGNED_OUT
     *
     * @param status <p>
     *            The current state of the device.
     *            </p>
     * @see DeviceStatus
     */
    public void setStatus(DeviceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, SIGNED_OUT
     *
     * @param status <p>
     *            The current state of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatus
     */
    public DescribeDeviceResult withStatus(DeviceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The model of the device.
     *         </p>
     */
    public String getModel() {
        return model;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param model <p>
     *            The model of the device.
     *            </p>
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param model <p>
     *            The model of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The manufacturer of the device.
     *         </p>
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param manufacturer <p>
     *            The manufacturer of the device.
     *            </p>
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param manufacturer <p>
     *            The manufacturer of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * <p>
     * The operating system of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The operating system of the device.
     *         </p>
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * <p>
     * The operating system of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operatingSystem <p>
     *            The operating system of the device.
     *            </p>
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operatingSystem <p>
     *            The operating system of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * <p>
     * The operating system version of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The operating system version of the device.
     *         </p>
     */
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    /**
     * <p>
     * The operating system version of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operatingSystemVersion <p>
     *            The operating system version of the device.
     *            </p>
     */
    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * <p>
     * The operating system version of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operatingSystemVersion <p>
     *            The operating system version of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
        return this;
    }

    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The operating system patch level of the device.
     *         </p>
     */
    public String getPatchLevel() {
        return patchLevel;
    }

    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param patchLevel <p>
     *            The operating system patch level of the device.
     *            </p>
     */
    public void setPatchLevel(String patchLevel) {
        this.patchLevel = patchLevel;
    }

    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param patchLevel <p>
     *            The operating system patch level of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withPatchLevel(String patchLevel) {
        this.patchLevel = patchLevel;
        return this;
    }

    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     *
     * @return <p>
     *         The date that the device first signed in to Amazon WorkLink.
     *         </p>
     */
    public java.util.Date getFirstAccessedTime() {
        return firstAccessedTime;
    }

    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     *
     * @param firstAccessedTime <p>
     *            The date that the device first signed in to Amazon WorkLink.
     *            </p>
     */
    public void setFirstAccessedTime(java.util.Date firstAccessedTime) {
        this.firstAccessedTime = firstAccessedTime;
    }

    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firstAccessedTime <p>
     *            The date that the device first signed in to Amazon WorkLink.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withFirstAccessedTime(java.util.Date firstAccessedTime) {
        this.firstAccessedTime = firstAccessedTime;
        return this;
    }

    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     *
     * @return <p>
     *         The date that the device last accessed Amazon WorkLink.
     *         </p>
     */
    public java.util.Date getLastAccessedTime() {
        return lastAccessedTime;
    }

    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     *
     * @param lastAccessedTime <p>
     *            The date that the device last accessed Amazon WorkLink.
     *            </p>
     */
    public void setLastAccessedTime(java.util.Date lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
    }

    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAccessedTime <p>
     *            The date that the device last accessed Amazon WorkLink.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withLastAccessedTime(java.util.Date lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
        return this;
    }

    /**
     * <p>
     * The user name associated with the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The user name associated with the device.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name associated with the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param username <p>
     *            The user name associated with the device.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name associated with the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param username <p>
     *            The user name associated with the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDeviceResult withUsername(String username) {
        this.username = username;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getModel() != null)
            sb.append("Model: " + getModel() + ",");
        if (getManufacturer() != null)
            sb.append("Manufacturer: " + getManufacturer() + ",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: " + getOperatingSystem() + ",");
        if (getOperatingSystemVersion() != null)
            sb.append("OperatingSystemVersion: " + getOperatingSystemVersion() + ",");
        if (getPatchLevel() != null)
            sb.append("PatchLevel: " + getPatchLevel() + ",");
        if (getFirstAccessedTime() != null)
            sb.append("FirstAccessedTime: " + getFirstAccessedTime() + ",");
        if (getLastAccessedTime() != null)
            sb.append("LastAccessedTime: " + getLastAccessedTime() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode
                + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        hashCode = prime * hashCode
                + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime
                * hashCode
                + ((getOperatingSystemVersion() == null) ? 0 : getOperatingSystemVersion()
                        .hashCode());
        hashCode = prime * hashCode + ((getPatchLevel() == null) ? 0 : getPatchLevel().hashCode());
        hashCode = prime * hashCode
                + ((getFirstAccessedTime() == null) ? 0 : getFirstAccessedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastAccessedTime() == null) ? 0 : getLastAccessedTime().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceResult == false)
            return false;
        DescribeDeviceResult other = (DescribeDeviceResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getManufacturer() == null ^ this.getManufacturer() == null)
            return false;
        if (other.getManufacturer() != null
                && other.getManufacturer().equals(this.getManufacturer()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null
                && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getOperatingSystemVersion() == null ^ this.getOperatingSystemVersion() == null)
            return false;
        if (other.getOperatingSystemVersion() != null
                && other.getOperatingSystemVersion().equals(this.getOperatingSystemVersion()) == false)
            return false;
        if (other.getPatchLevel() == null ^ this.getPatchLevel() == null)
            return false;
        if (other.getPatchLevel() != null
                && other.getPatchLevel().equals(this.getPatchLevel()) == false)
            return false;
        if (other.getFirstAccessedTime() == null ^ this.getFirstAccessedTime() == null)
            return false;
        if (other.getFirstAccessedTime() != null
                && other.getFirstAccessedTime().equals(this.getFirstAccessedTime()) == false)
            return false;
        if (other.getLastAccessedTime() == null ^ this.getLastAccessedTime() == null)
            return false;
        if (other.getLastAccessedTime() != null
                && other.getLastAccessedTime().equals(this.getLastAccessedTime()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }
}
