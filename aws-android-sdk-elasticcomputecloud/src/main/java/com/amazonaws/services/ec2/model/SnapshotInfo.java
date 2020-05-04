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
 * Information about a snapshot.
 * </p>
 */
public class SnapshotInfo implements Serializable {
    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied
     * to all snapshots.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     */
    private String state;

    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     */
    private Integer volumeSize;

    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots
     * initiated by the same request.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     */
    private String progress;

    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied
     * to all snapshots.
     * </p>
     *
     * @return <p>
     *         Description specified by the CreateSnapshotRequest that has been
     *         applied to all snapshots.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied
     * to all snapshots.
     * </p>
     *
     * @param description <p>
     *            Description specified by the CreateSnapshotRequest that has
     *            been applied to all snapshots.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description specified by the CreateSnapshotRequest that has been applied
     * to all snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            Description specified by the CreateSnapshotRequest that has
     *            been applied to all snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     *
     * @return <p>
     *         Tags associated with this snapshot.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     *
     * @param tags <p>
     *            Tags associated with this snapshot.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with this snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tags associated with this snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with this snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the snapshot is encrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the snapshot is encrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the snapshot is encrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the snapshot is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the snapshot is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     *
     * @return <p>
     *         Source volume from which this snapshot was created.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     *
     * @param volumeId <p>
     *            Source volume from which this snapshot was created.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * Source volume from which this snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            Source volume from which this snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @return <p>
     *         Current state of the snapshot.
     *         </p>
     * @see SnapshotState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            Current state of the snapshot.
     *            </p>
     * @see SnapshotState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            Current state of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotState
     */
    public SnapshotInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            Current state of the snapshot.
     *            </p>
     * @see SnapshotState
     */
    public void setState(SnapshotState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * Current state of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, completed, error
     *
     * @param state <p>
     *            Current state of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SnapshotState
     */
    public SnapshotInfo withState(SnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     *
     * @return <p>
     *         Size of the volume from which this snapshot was created.
     *         </p>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     *
     * @param volumeSize <p>
     *            Size of the volume from which this snapshot was created.
     *            </p>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * Size of the volume from which this snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSize <p>
     *            Size of the volume from which this snapshot was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots
     * initiated by the same request.
     * </p>
     *
     * @return <p>
     *         Time this snapshot was started. This is the same for all
     *         snapshots initiated by the same request.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots
     * initiated by the same request.
     * </p>
     *
     * @param startTime <p>
     *            Time this snapshot was started. This is the same for all
     *            snapshots initiated by the same request.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Time this snapshot was started. This is the same for all snapshots
     * initiated by the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            Time this snapshot was started. This is the same for all
     *            snapshots initiated by the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     *
     * @return <p>
     *         Progress this snapshot has made towards completing.
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     *
     * @param progress <p>
     *            Progress this snapshot has made towards completing.
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * Progress this snapshot has made towards completing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            Progress this snapshot has made towards completing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     *
     * @return <p>
     *         Account id used when creating this snapshot.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     *
     * @param ownerId <p>
     *            Account id used when creating this snapshot.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Account id used when creating this snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            Account id used when creating this snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     *
     * @return <p>
     *         Snapshot id that can be used to describe this snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     *
     * @param snapshotId <p>
     *            Snapshot id that can be used to describe this snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * Snapshot id that can be used to describe this snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            Snapshot id that can be used to describe this snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotInfo withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotInfo == false)
            return false;
        SnapshotInfo other = (SnapshotInfo) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null
                && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }
}
