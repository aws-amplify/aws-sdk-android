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
 * Describes a block device mapping.
 * </p>
 */
public class InstanceBlockDeviceMapping implements Serializable {
    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     */
    private EbsInstanceBlockDevice ebs;

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     *
     * @return <p>
     *         The device name (for example, <code>/dev/sdh</code> or
     *         <code>xvdh</code>).
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     *
     * @param deviceName <p>
     *            The device name (for example, <code>/dev/sdh</code> or
     *            <code>xvdh</code>).
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            The device name (for example, <code>/dev/sdh</code> or
     *            <code>xvdh</code>).
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
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     *
     * @return <p>
     *         Parameters used to automatically set up EBS volumes when the
     *         instance is launched.
     *         </p>
     */
    public EbsInstanceBlockDevice getEbs() {
        return ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     *
     * @param ebs <p>
     *            Parameters used to automatically set up EBS volumes when the
     *            instance is launched.
     *            </p>
     */
    public void setEbs(EbsInstanceBlockDevice ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebs <p>
     *            Parameters used to automatically set up EBS volumes when the
     *            instance is launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceBlockDeviceMapping withEbs(EbsInstanceBlockDevice ebs) {
        this.ebs = ebs;
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
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getEbs() != null)
            sb.append("Ebs: " + getEbs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
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
        return true;
    }
}
