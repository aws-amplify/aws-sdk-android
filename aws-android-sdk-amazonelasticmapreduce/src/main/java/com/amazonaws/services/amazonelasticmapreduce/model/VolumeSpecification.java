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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * EBS volume specifications such as volume type, IOPS, and size (GiB) that will
 * be requested for the EBS volume attached to an EC2 instance in the cluster.
 * </p>
 */
public class VolumeSpecification implements Serializable {
    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     */
    private String volumeType;

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024.
     * If the volume type is EBS-optimized, the minimum value is 10.
     * </p>
     */
    private Integer sizeInGB;

    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     *
     * @return <p>
     *         The volume type. Volume types supported are gp2, io1, standard.
     *         </p>
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     *
     * @param volumeType <p>
     *            The volume type. Volume types supported are gp2, io1,
     *            standard.
     *            </p>
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. Volume types supported are gp2, io1, standard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeType <p>
     *            The volume type. Volume types supported are gp2, io1,
     *            standard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeSpecification withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     *
     * @return <p>
     *         The number of I/O operations per second (IOPS) that the volume
     *         supports.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeSpecification withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024.
     * If the volume type is EBS-optimized, the minimum value is 10.
     * </p>
     *
     * @return <p>
     *         The volume size, in gibibytes (GiB). This can be a number from 1
     *         - 1024. If the volume type is EBS-optimized, the minimum value is
     *         10.
     *         </p>
     */
    public Integer getSizeInGB() {
        return sizeInGB;
    }

    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024.
     * If the volume type is EBS-optimized, the minimum value is 10.
     * </p>
     *
     * @param sizeInGB <p>
     *            The volume size, in gibibytes (GiB). This can be a number from
     *            1 - 1024. If the volume type is EBS-optimized, the minimum
     *            value is 10.
     *            </p>
     */
    public void setSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    /**
     * <p>
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024.
     * If the volume type is EBS-optimized, the minimum value is 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGB <p>
     *            The volume size, in gibibytes (GiB). This can be a number from
     *            1 - 1024. If the volume type is EBS-optimized, the minimum
     *            value is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeSpecification withSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
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
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getSizeInGB() != null)
            sb.append("SizeInGB: " + getSizeInGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSizeInGB() == null) ? 0 : getSizeInGB().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeSpecification == false)
            return false;
        VolumeSpecification other = (VolumeSpecification) obj;

        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSizeInGB() == null ^ this.getSizeInGB() == null)
            return false;
        if (other.getSizeInGB() != null && other.getSizeInGB().equals(this.getSizeInGB()) == false)
            return false;
        return true;
    }
}
