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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * EBS block device that's attached to an EC2 instance.
 * </p>
 */
public class EbsVolume implements Serializable {
    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     */
    private String device;

    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     *
     * @return <p>
     *         The device name that is exposed to the instance, such as
     *         /dev/sdh.
     *         </p>
     */
    public String getDevice() {
        return device;
    }

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     *
     * @param device <p>
     *            The device name that is exposed to the instance, such as
     *            /dev/sdh.
     *            </p>
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param device <p>
     *            The device name that is exposed to the instance, such as
     *            /dev/sdh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsVolume withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     *
     * @return <p>
     *         The volume identifier of the EBS volume.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     *
     * @param volumeId <p>
     *            The volume identifier of the EBS volume.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The volume identifier of the EBS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The volume identifier of the EBS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsVolume withVolumeId(String volumeId) {
        this.volumeId = volumeId;
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
        if (getDevice() != null)
            sb.append("Device: " + getDevice() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsVolume == false)
            return false;
        EbsVolume other = (EbsVolume) obj;

        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }
}
