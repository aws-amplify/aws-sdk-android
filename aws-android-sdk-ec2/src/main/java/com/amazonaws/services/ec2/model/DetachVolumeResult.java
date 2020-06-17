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
 * Describes volume attachment details.
 * </p>
 */
public class DetachVolumeResult implements Serializable {
    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     */
    private java.util.Date attachTime;

    /**
     * <p>
     * The device name.
     * </p>
     */
    private String device;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached, busy
     */
    private String state;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;

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
    public DetachVolumeResult withAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    /**
     * <p>
     * The device name.
     * </p>
     *
     * @return <p>
     *         The device name.
     *         </p>
     */
    public String getDevice() {
        return device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     *
     * @param device <p>
     *            The device name.
     *            </p>
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param device <p>
     *            The device name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeResult withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached, busy
     *
     * @return <p>
     *         The attachment state of the volume.
     *         </p>
     * @see VolumeAttachmentState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached, busy
     *
     * @param state <p>
     *            The attachment state of the volume.
     *            </p>
     * @see VolumeAttachmentState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached, busy
     *
     * @param state <p>
     *            The attachment state of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeAttachmentState
     */
    public DetachVolumeResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached, busy
     *
     * @param state <p>
     *            The attachment state of the volume.
     *            </p>
     * @see VolumeAttachmentState
     */
    public void setState(VolumeAttachmentState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached, busy
     *
     * @param state <p>
     *            The attachment state of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeAttachmentState
     */
    public DetachVolumeResult withState(VolumeAttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @return <p>
     *         The ID of the volume.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeResult withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is deleted on instance
     *         termination.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is deleted on instance
     *         termination.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the EBS volume is deleted on instance
     *            termination.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the EBS volume is deleted on instance
     *            termination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeResult withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
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
        if (getDevice() != null)
            sb.append("Device: " + getDevice() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachVolumeResult == false)
            return false;
        DetachVolumeResult other = (DetachVolumeResult) obj;

        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null
                && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        return true;
    }
}
