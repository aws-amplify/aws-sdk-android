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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * Defines block device mappings for the instance used to configure your image.
 * </p>
 */
public class InstanceBlockDeviceMapping implements Serializable {
    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String deviceName;

    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     */
    private EbsInstanceBlockDeviceSpecification ebs;

    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String virtualName;

    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 0<br/>
     */
    private String noDevice;

    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The device to which these mappings apply.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param deviceName <p>
     *            The device to which these mappings apply.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device to which these mappings apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param deviceName <p>
     *            The device to which these mappings apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceBlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     *
     * @return <p>
     *         Use to manage Amazon EBS-specific configuration for this mapping.
     *         </p>
     */
    public EbsInstanceBlockDeviceSpecification getEbs() {
        return ebs;
    }

    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     *
     * @param ebs <p>
     *            Use to manage Amazon EBS-specific configuration for this
     *            mapping.
     *            </p>
     */
    public void setEbs(EbsInstanceBlockDeviceSpecification ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Use to manage Amazon EBS-specific configuration for this mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebs <p>
     *            Use to manage Amazon EBS-specific configuration for this
     *            mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceBlockDeviceMapping withEbs(EbsInstanceBlockDeviceSpecification ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Use to manage instance ephemeral devices.
     *         </p>
     */
    public String getVirtualName() {
        return virtualName;
    }

    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param virtualName <p>
     *            Use to manage instance ephemeral devices.
     *            </p>
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * Use to manage instance ephemeral devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param virtualName <p>
     *            Use to manage instance ephemeral devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceBlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 0<br/>
     *
     * @return <p>
     *         Use to remove a mapping from the parent image.
     *         </p>
     */
    public String getNoDevice() {
        return noDevice;
    }

    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 0<br/>
     *
     * @param noDevice <p>
     *            Use to remove a mapping from the parent image.
     *            </p>
     */
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Use to remove a mapping from the parent image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 0<br/>
     *
     * @param noDevice <p>
     *            Use to remove a mapping from the parent image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceBlockDeviceMapping withNoDevice(String noDevice) {
        this.noDevice = noDevice;
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
        if (getDeviceName() != null)
            sb.append("deviceName: " + getDeviceName() + ",");
        if (getEbs() != null)
            sb.append("ebs: " + getEbs() + ",");
        if (getVirtualName() != null)
            sb.append("virtualName: " + getVirtualName() + ",");
        if (getNoDevice() != null)
            sb.append("noDevice: " + getNoDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceBlockDeviceMapping == false)
            return false;
        InstanceBlockDeviceMapping other = (InstanceBlockDeviceMapping) obj;

        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false)
            return false;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null
                && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
        if (other.getNoDevice() == null ^ this.getNoDevice() == null)
            return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false)
            return false;
        return true;
    }
}
