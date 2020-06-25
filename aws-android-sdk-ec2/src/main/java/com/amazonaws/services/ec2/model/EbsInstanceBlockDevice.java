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
 * Describes a parameter used to set up an EBS volume in a block device mapping.
 * </p>
 */
public class EbsInstanceBlockDevice implements Serializable {
    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     */
    private java.util.Date attachTime;

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     */
    private String status;

    /**
     * <p>
     * The ID of the EBS volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     *
     * @return <p>
     *         The time stamp when the attachment initiated.
     *         </p>
     */
    public java.util.Date getAttachTime() {
        return attachTime;
    }

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     *
     * @param attachTime <p>
     *            The time stamp when the attachment initiated.
     *            </p>
     */
    public void setAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
    }

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachTime <p>
     *            The time stamp when the attachment initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDevice withAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
        return this;
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
    public EbsInstanceBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @return <p>
     *         The attachment state.
     *         </p>
     * @see AttachmentStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status <p>
     *            The attachment state.
     *            </p>
     * @see AttachmentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status <p>
     *            The attachment state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttachmentStatus
     */
    public EbsInstanceBlockDevice withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status <p>
     *            The attachment state.
     *            </p>
     * @see AttachmentStatus
     */
    public void setStatus(AttachmentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param status <p>
     *            The attachment state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttachmentStatus
     */
    public EbsInstanceBlockDevice withStatus(AttachmentStatus status) {
        this.status = status.toString();
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
    public EbsInstanceBlockDevice withVolumeId(String volumeId) {
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
        if (getAttachTime() != null)
            sb.append("AttachTime: " + getAttachTime() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsInstanceBlockDevice == false)
            return false;
        EbsInstanceBlockDevice other = (EbsInstanceBlockDevice) obj;

        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null
                && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }
}
