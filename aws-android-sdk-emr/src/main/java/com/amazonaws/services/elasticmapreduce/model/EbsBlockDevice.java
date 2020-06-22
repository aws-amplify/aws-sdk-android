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
 * Configuration of requested EBS block device associated with the instance
 * group.
 * </p>
 */
public class EbsBlockDevice implements Serializable {
    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that
     * will be requested for the EBS volume attached to an EC2 instance in the
     * cluster.
     * </p>
     */
    private VolumeSpecification volumeSpecification;

    /**
     * <p>
     * The device name that is exposed to the instance, such as /dev/sdh.
     * </p>
     */
    private String device;

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that
     * will be requested for the EBS volume attached to an EC2 instance in the
     * cluster.
     * </p>
     *
     * @return <p>
     *         EBS volume specifications such as volume type, IOPS, and size
     *         (GiB) that will be requested for the EBS volume attached to an
     *         EC2 instance in the cluster.
     *         </p>
     */
    public VolumeSpecification getVolumeSpecification() {
        return volumeSpecification;
    }

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that
     * will be requested for the EBS volume attached to an EC2 instance in the
     * cluster.
     * </p>
     *
     * @param volumeSpecification <p>
     *            EBS volume specifications such as volume type, IOPS, and size
     *            (GiB) that will be requested for the EBS volume attached to an
     *            EC2 instance in the cluster.
     *            </p>
     */
    public void setVolumeSpecification(VolumeSpecification volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
    }

    /**
     * <p>
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that
     * will be requested for the EBS volume attached to an EC2 instance in the
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSpecification <p>
     *            EBS volume specifications such as volume type, IOPS, and size
     *            (GiB) that will be requested for the EBS volume attached to an
     *            EC2 instance in the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsBlockDevice withVolumeSpecification(VolumeSpecification volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
        return this;
    }

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
    public EbsBlockDevice withDevice(String device) {
        this.device = device;
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
        if (getVolumeSpecification() != null)
            sb.append("VolumeSpecification: " + getVolumeSpecification() + ",");
        if (getDevice() != null)
            sb.append("Device: " + getDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeSpecification() == null) ? 0 : getVolumeSpecification().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDevice == false)
            return false;
        EbsBlockDevice other = (EbsBlockDevice) obj;

        if (other.getVolumeSpecification() == null ^ this.getVolumeSpecification() == null)
            return false;
        if (other.getVolumeSpecification() != null
                && other.getVolumeSpecification().equals(this.getVolumeSpecification()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        return true;
    }
}
