/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class VolumeAttachment implements Serializable {

    /**
     * The ID of the volume.
     */
    private String volumeId;

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The device name.
     */
    private String device;

    /**
     * The attachment state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     */
    private String state;

    /**
     * The time stamp when the attachment initiated.
     */
    private java.util.Date attachTime;

    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     */
    private Boolean deleteOnTermination;

    /**
     * The ID of the volume.
     *
     * @return The ID of the volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the volume.
     *
     * @param volumeId The ID of the volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeAttachment withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeAttachment withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The device name.
     *
     * @return The device name.
     */
    public String getDevice() {
        return device;
    }
    
    /**
     * The device name.
     *
     * @param device The device name.
     */
    public void setDevice(String device) {
        this.device = device;
    }
    
    /**
     * The device name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param device The device name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeAttachment withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * The attachment state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @return The attachment state of the volume.
     *
     * @see VolumeAttachmentState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The attachment state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param state The attachment state of the volume.
     *
     * @see VolumeAttachmentState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The attachment state of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param state The attachment state of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeAttachmentState
     */
    public VolumeAttachment withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The attachment state of the volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param state The attachment state of the volume.
     *
     * @see VolumeAttachmentState
     */
    public void setState(VolumeAttachmentState state) {
        this.state = state.toString();
    }
    
    /**
     * The attachment state of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param state The attachment state of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VolumeAttachmentState
     */
    public VolumeAttachment withState(VolumeAttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The time stamp when the attachment initiated.
     *
     * @return The time stamp when the attachment initiated.
     */
    public java.util.Date getAttachTime() {
        return attachTime;
    }
    
    /**
     * The time stamp when the attachment initiated.
     *
     * @param attachTime The time stamp when the attachment initiated.
     */
    public void setAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
    }
    
    /**
     * The time stamp when the attachment initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachTime The time stamp when the attachment initiated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeAttachment withAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     *
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     *
     * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance termination.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance termination.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     *
     * @return Indicates whether the EBS volume is deleted on instance termination.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDevice() != null) sb.append("Device: " + getDevice() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getAttachTime() != null) sb.append("AttachTime: " + getAttachTime() + ",");
        if (isDeleteOnTermination() != null) sb.append("DeleteOnTermination: " + isDeleteOnTermination() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode()); 
        hashCode = prime * hashCode + ((isDeleteOnTermination() == null) ? 0 : isDeleteOnTermination().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VolumeAttachment == false) return false;
        VolumeAttachment other = (VolumeAttachment)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getDevice() == null ^ this.getDevice() == null) return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getAttachTime() == null ^ this.getAttachTime() == null) return false;
        if (other.getAttachTime() != null && other.getAttachTime().equals(this.getAttachTime()) == false) return false; 
        if (other.isDeleteOnTermination() == null ^ this.isDeleteOnTermination() == null) return false;
        if (other.isDeleteOnTermination() != null && other.isDeleteOnTermination().equals(this.isDeleteOnTermination()) == false) return false; 
        return true;
    }
    
}
    