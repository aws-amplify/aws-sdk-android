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
 * Describes information used to set up an EBS volume specified in a block
 * device mapping.
 * </p>
 */
public class EbsInstanceBlockDeviceSpecification implements Serializable {
    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is deleted on instance termination.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is deleted on instance termination.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the volume is deleted on instance
     *            termination.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the volume is deleted on instance
     *            termination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     *
     * @return <p>
     *         The ID of the EBS volume.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     *
     * @param volumeId <p>
     *            The ID of the EBS volume.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The ID of the EBS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withVolumeId(String volumeId) {
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsInstanceBlockDeviceSpecification == false)
            return false;
        EbsInstanceBlockDeviceSpecification other = (EbsInstanceBlockDeviceSpecification) obj;

        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }
}
