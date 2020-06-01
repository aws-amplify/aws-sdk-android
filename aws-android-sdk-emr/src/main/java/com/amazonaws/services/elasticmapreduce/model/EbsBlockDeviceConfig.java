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
 * group with count of volumes that will be associated to every instance.
 * </p>
 */
public class EbsBlockDeviceConfig implements Serializable {
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
     * Number of EBS volumes with a specific volume configuration that will be
     * associated with every instance in the instance group
     * </p>
     */
    private Integer volumesPerInstance;

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
    public EbsBlockDeviceConfig withVolumeSpecification(VolumeSpecification volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
        return this;
    }

    /**
     * <p>
     * Number of EBS volumes with a specific volume configuration that will be
     * associated with every instance in the instance group
     * </p>
     *
     * @return <p>
     *         Number of EBS volumes with a specific volume configuration that
     *         will be associated with every instance in the instance group
     *         </p>
     */
    public Integer getVolumesPerInstance() {
        return volumesPerInstance;
    }

    /**
     * <p>
     * Number of EBS volumes with a specific volume configuration that will be
     * associated with every instance in the instance group
     * </p>
     *
     * @param volumesPerInstance <p>
     *            Number of EBS volumes with a specific volume configuration
     *            that will be associated with every instance in the instance
     *            group
     *            </p>
     */
    public void setVolumesPerInstance(Integer volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
    }

    /**
     * <p>
     * Number of EBS volumes with a specific volume configuration that will be
     * associated with every instance in the instance group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumesPerInstance <p>
     *            Number of EBS volumes with a specific volume configuration
     *            that will be associated with every instance in the instance
     *            group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsBlockDeviceConfig withVolumesPerInstance(Integer volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
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
        if (getVolumesPerInstance() != null)
            sb.append("VolumesPerInstance: " + getVolumesPerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeSpecification() == null) ? 0 : getVolumeSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getVolumesPerInstance() == null) ? 0 : getVolumesPerInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsBlockDeviceConfig == false)
            return false;
        EbsBlockDeviceConfig other = (EbsBlockDeviceConfig) obj;

        if (other.getVolumeSpecification() == null ^ this.getVolumeSpecification() == null)
            return false;
        if (other.getVolumeSpecification() != null
                && other.getVolumeSpecification().equals(this.getVolumeSpecification()) == false)
            return false;
        if (other.getVolumesPerInstance() == null ^ this.getVolumesPerInstance() == null)
            return false;
        if (other.getVolumesPerInstance() != null
                && other.getVolumesPerInstance().equals(this.getVolumesPerInstance()) == false)
            return false;
        return true;
    }
}
