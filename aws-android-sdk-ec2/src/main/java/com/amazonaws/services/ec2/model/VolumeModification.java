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
 * Describes the modification status of an EBS volume.
 * </p>
 * <p>
 * If the volume has never been modified, some element values will be null.
 * </p>
 */
public class VolumeModification implements Serializable {
    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The current modification state. The modification state is null for
     * unmodified volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>modifying, optimizing, completed, failed
     */
    private String modificationState;

    /**
     * <p>
     * A status message about the modification progress or failure.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The target size of the volume, in GiB.
     * </p>
     */
    private Integer targetSize;

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     */
    private Integer targetIops;

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     */
    private String targetVolumeType;

    /**
     * <p>
     * The original size of the volume.
     * </p>
     */
    private Integer originalSize;

    /**
     * <p>
     * The original IOPS rate of the volume.
     * </p>
     */
    private Integer originalIops;

    /**
     * <p>
     * The original EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     */
    private String originalVolumeType;

    /**
     * <p>
     * The modification progress, from 0 to 100 percent complete.
     * </p>
     */
    private Long progress;

    /**
     * <p>
     * The modification start time.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The modification completion or failure time.
     * </p>
     */
    private java.util.Date endTime;

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
    public VolumeModification withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * The current modification state. The modification state is null for
     * unmodified volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>modifying, optimizing, completed, failed
     *
     * @return <p>
     *         The current modification state. The modification state is null
     *         for unmodified volumes.
     *         </p>
     * @see VolumeModificationState
     */
    public String getModificationState() {
        return modificationState;
    }

    /**
     * <p>
     * The current modification state. The modification state is null for
     * unmodified volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>modifying, optimizing, completed, failed
     *
     * @param modificationState <p>
     *            The current modification state. The modification state is null
     *            for unmodified volumes.
     *            </p>
     * @see VolumeModificationState
     */
    public void setModificationState(String modificationState) {
        this.modificationState = modificationState;
    }

    /**
     * <p>
     * The current modification state. The modification state is null for
     * unmodified volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>modifying, optimizing, completed, failed
     *
     * @param modificationState <p>
     *            The current modification state. The modification state is null
     *            for unmodified volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeModificationState
     */
    public VolumeModification withModificationState(String modificationState) {
        this.modificationState = modificationState;
        return this;
    }

    /**
     * <p>
     * The current modification state. The modification state is null for
     * unmodified volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>modifying, optimizing, completed, failed
     *
     * @param modificationState <p>
     *            The current modification state. The modification state is null
     *            for unmodified volumes.
     *            </p>
     * @see VolumeModificationState
     */
    public void setModificationState(VolumeModificationState modificationState) {
        this.modificationState = modificationState.toString();
    }

    /**
     * <p>
     * The current modification state. The modification state is null for
     * unmodified volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>modifying, optimizing, completed, failed
     *
     * @param modificationState <p>
     *            The current modification state. The modification state is null
     *            for unmodified volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeModificationState
     */
    public VolumeModification withModificationState(VolumeModificationState modificationState) {
        this.modificationState = modificationState.toString();
        return this;
    }

    /**
     * <p>
     * A status message about the modification progress or failure.
     * </p>
     *
     * @return <p>
     *         A status message about the modification progress or failure.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A status message about the modification progress or failure.
     * </p>
     *
     * @param statusMessage <p>
     *            A status message about the modification progress or failure.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A status message about the modification progress or failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A status message about the modification progress or failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The target size of the volume, in GiB.
     * </p>
     *
     * @return <p>
     *         The target size of the volume, in GiB.
     *         </p>
     */
    public Integer getTargetSize() {
        return targetSize;
    }

    /**
     * <p>
     * The target size of the volume, in GiB.
     * </p>
     *
     * @param targetSize <p>
     *            The target size of the volume, in GiB.
     *            </p>
     */
    public void setTargetSize(Integer targetSize) {
        this.targetSize = targetSize;
    }

    /**
     * <p>
     * The target size of the volume, in GiB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetSize <p>
     *            The target size of the volume, in GiB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withTargetSize(Integer targetSize) {
        this.targetSize = targetSize;
        return this;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     *
     * @return <p>
     *         The target IOPS rate of the volume.
     *         </p>
     */
    public Integer getTargetIops() {
        return targetIops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     *
     * @param targetIops <p>
     *            The target IOPS rate of the volume.
     *            </p>
     */
    public void setTargetIops(Integer targetIops) {
        this.targetIops = targetIops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetIops <p>
     *            The target IOPS rate of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withTargetIops(Integer targetIops) {
        this.targetIops = targetIops;
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @return <p>
     *         The target EBS volume type of the volume.
     *         </p>
     * @see VolumeType
     */
    public String getTargetVolumeType() {
        return targetVolumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param targetVolumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     * @see VolumeType
     */
    public void setTargetVolumeType(String targetVolumeType) {
        this.targetVolumeType = targetVolumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param targetVolumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public VolumeModification withTargetVolumeType(String targetVolumeType) {
        this.targetVolumeType = targetVolumeType;
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param targetVolumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     * @see VolumeType
     */
    public void setTargetVolumeType(VolumeType targetVolumeType) {
        this.targetVolumeType = targetVolumeType.toString();
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param targetVolumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public VolumeModification withTargetVolumeType(VolumeType targetVolumeType) {
        this.targetVolumeType = targetVolumeType.toString();
        return this;
    }

    /**
     * <p>
     * The original size of the volume.
     * </p>
     *
     * @return <p>
     *         The original size of the volume.
     *         </p>
     */
    public Integer getOriginalSize() {
        return originalSize;
    }

    /**
     * <p>
     * The original size of the volume.
     * </p>
     *
     * @param originalSize <p>
     *            The original size of the volume.
     *            </p>
     */
    public void setOriginalSize(Integer originalSize) {
        this.originalSize = originalSize;
    }

    /**
     * <p>
     * The original size of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originalSize <p>
     *            The original size of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withOriginalSize(Integer originalSize) {
        this.originalSize = originalSize;
        return this;
    }

    /**
     * <p>
     * The original IOPS rate of the volume.
     * </p>
     *
     * @return <p>
     *         The original IOPS rate of the volume.
     *         </p>
     */
    public Integer getOriginalIops() {
        return originalIops;
    }

    /**
     * <p>
     * The original IOPS rate of the volume.
     * </p>
     *
     * @param originalIops <p>
     *            The original IOPS rate of the volume.
     *            </p>
     */
    public void setOriginalIops(Integer originalIops) {
        this.originalIops = originalIops;
    }

    /**
     * <p>
     * The original IOPS rate of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originalIops <p>
     *            The original IOPS rate of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withOriginalIops(Integer originalIops) {
        this.originalIops = originalIops;
        return this;
    }

    /**
     * <p>
     * The original EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @return <p>
     *         The original EBS volume type of the volume.
     *         </p>
     * @see VolumeType
     */
    public String getOriginalVolumeType() {
        return originalVolumeType;
    }

    /**
     * <p>
     * The original EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param originalVolumeType <p>
     *            The original EBS volume type of the volume.
     *            </p>
     * @see VolumeType
     */
    public void setOriginalVolumeType(String originalVolumeType) {
        this.originalVolumeType = originalVolumeType;
    }

    /**
     * <p>
     * The original EBS volume type of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param originalVolumeType <p>
     *            The original EBS volume type of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public VolumeModification withOriginalVolumeType(String originalVolumeType) {
        this.originalVolumeType = originalVolumeType;
        return this;
    }

    /**
     * <p>
     * The original EBS volume type of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param originalVolumeType <p>
     *            The original EBS volume type of the volume.
     *            </p>
     * @see VolumeType
     */
    public void setOriginalVolumeType(VolumeType originalVolumeType) {
        this.originalVolumeType = originalVolumeType.toString();
    }

    /**
     * <p>
     * The original EBS volume type of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param originalVolumeType <p>
     *            The original EBS volume type of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public VolumeModification withOriginalVolumeType(VolumeType originalVolumeType) {
        this.originalVolumeType = originalVolumeType.toString();
        return this;
    }

    /**
     * <p>
     * The modification progress, from 0 to 100 percent complete.
     * </p>
     *
     * @return <p>
     *         The modification progress, from 0 to 100 percent complete.
     *         </p>
     */
    public Long getProgress() {
        return progress;
    }

    /**
     * <p>
     * The modification progress, from 0 to 100 percent complete.
     * </p>
     *
     * @param progress <p>
     *            The modification progress, from 0 to 100 percent complete.
     *            </p>
     */
    public void setProgress(Long progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The modification progress, from 0 to 100 percent complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The modification progress, from 0 to 100 percent complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withProgress(Long progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The modification start time.
     * </p>
     *
     * @return <p>
     *         The modification start time.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The modification start time.
     * </p>
     *
     * @param startTime <p>
     *            The modification start time.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The modification start time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The modification start time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The modification completion or failure time.
     * </p>
     *
     * @return <p>
     *         The modification completion or failure time.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The modification completion or failure time.
     * </p>
     *
     * @param endTime <p>
     *            The modification completion or failure time.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The modification completion or failure time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The modification completion or failure time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeModification withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getModificationState() != null)
            sb.append("ModificationState: " + getModificationState() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getTargetSize() != null)
            sb.append("TargetSize: " + getTargetSize() + ",");
        if (getTargetIops() != null)
            sb.append("TargetIops: " + getTargetIops() + ",");
        if (getTargetVolumeType() != null)
            sb.append("TargetVolumeType: " + getTargetVolumeType() + ",");
        if (getOriginalSize() != null)
            sb.append("OriginalSize: " + getOriginalSize() + ",");
        if (getOriginalIops() != null)
            sb.append("OriginalIops: " + getOriginalIops() + ",");
        if (getOriginalVolumeType() != null)
            sb.append("OriginalVolumeType: " + getOriginalVolumeType() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode
                + ((getModificationState() == null) ? 0 : getModificationState().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTargetSize() == null) ? 0 : getTargetSize().hashCode());
        hashCode = prime * hashCode + ((getTargetIops() == null) ? 0 : getTargetIops().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVolumeType() == null) ? 0 : getTargetVolumeType().hashCode());
        hashCode = prime * hashCode
                + ((getOriginalSize() == null) ? 0 : getOriginalSize().hashCode());
        hashCode = prime * hashCode
                + ((getOriginalIops() == null) ? 0 : getOriginalIops().hashCode());
        hashCode = prime * hashCode
                + ((getOriginalVolumeType() == null) ? 0 : getOriginalVolumeType().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeModification == false)
            return false;
        VolumeModification other = (VolumeModification) obj;

        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getModificationState() == null ^ this.getModificationState() == null)
            return false;
        if (other.getModificationState() != null
                && other.getModificationState().equals(this.getModificationState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTargetSize() == null ^ this.getTargetSize() == null)
            return false;
        if (other.getTargetSize() != null
                && other.getTargetSize().equals(this.getTargetSize()) == false)
            return false;
        if (other.getTargetIops() == null ^ this.getTargetIops() == null)
            return false;
        if (other.getTargetIops() != null
                && other.getTargetIops().equals(this.getTargetIops()) == false)
            return false;
        if (other.getTargetVolumeType() == null ^ this.getTargetVolumeType() == null)
            return false;
        if (other.getTargetVolumeType() != null
                && other.getTargetVolumeType().equals(this.getTargetVolumeType()) == false)
            return false;
        if (other.getOriginalSize() == null ^ this.getOriginalSize() == null)
            return false;
        if (other.getOriginalSize() != null
                && other.getOriginalSize().equals(this.getOriginalSize()) == false)
            return false;
        if (other.getOriginalIops() == null ^ this.getOriginalIops() == null)
            return false;
        if (other.getOriginalIops() != null
                && other.getOriginalIops().equals(this.getOriginalIops()) == false)
            return false;
        if (other.getOriginalVolumeType() == null ^ this.getOriginalVolumeType() == null)
            return false;
        if (other.getOriginalVolumeType() != null
                && other.getOriginalVolumeType().equals(this.getOriginalVolumeType()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }
}
