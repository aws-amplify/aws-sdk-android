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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a snapshot of a block storage disk. You can use snapshots for
 * backups, to make copies of disks, and to save data before shutting down a
 * Lightsail instance.
 * </p>
 * <p>
 * You can take a snapshot of an attached disk that is in use; however,
 * snapshots only capture data that has been written to your disk at the time
 * the snapshot command is issued. This may exclude any data that has been
 * cached by any applications or the operating system. If you can pause any file
 * systems on the disk long enough to take a snapshot, your snapshot should be
 * complete. Nevertheless, if you cannot pause all file writes to the disk, you
 * should unmount the disk from within the Lightsail instance, issue the create
 * disk snapshot command, and then remount the disk to ensure a consistent and
 * complete snapshot. You may remount and use your disk while the snapshot
 * status is pending.
 * </p>
 * <p>
 * You can also use this operation to create a snapshot of an instance's system
 * volume. You might want to do this, for example, to recover data from the
 * system volume of a botched instance or to create a backup of the system
 * volume like you would for a block storage disk. To create a snapshot of a
 * system volume, just define the <code>instance name</code> parameter when
 * issuing the snapshot command, and a snapshot of the defined instance's system
 * volume will be created. After the snapshot is available, you can create a
 * block storage disk from the snapshot and attach it to a running instance to
 * access the data on the disk.
 * </p>
 * <p>
 * The <code>create disk snapshot</code> operation supports tag-based access
 * control via request tags. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateDiskSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance name</code> parameter. The <code>disk name</code> and
     * <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String diskName;

    /**
     * <p>
     * The name of the destination disk snapshot (e.g.,
     * <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String diskSnapshotName;

    /**
     * <p>
     * The unique name of the source instance (e.g.,
     * <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined, a
     * snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code>
     * parameter. The <code>instance name</code> and <code>disk name</code>
     * parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance name</code> parameter. The <code>disk name</code> and
     * <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique name of the source disk (e.g.,
     *         <code>Disk-Virginia-1</code>).
     *         </p>
     *         <note>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>instance name</code> parameter. The <code>disk name</code>
     *         and <code>instance name</code> parameters are mutually exclusive.
     *         </p>
     *         </note>
     */
    public String getDiskName() {
        return diskName;
    }

    /**
     * <p>
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance name</code> parameter. The <code>disk name</code> and
     * <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique name of the source disk (e.g.,
     *            <code>Disk-Virginia-1</code>).
     *            </p>
     *            <note>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>instance name</code> parameter. The
     *            <code>disk name</code> and <code>instance name</code>
     *            parameters are mutually exclusive.
     *            </p>
     *            </note>
     */
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique name of the source disk (e.g., <code>Disk-Virginia-1</code>).
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance name</code> parameter. The <code>disk name</code> and
     * <code>instance name</code> parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique name of the source disk (e.g.,
     *            <code>Disk-Virginia-1</code>).
     *            </p>
     *            <note>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>instance name</code> parameter. The
     *            <code>disk name</code> and <code>instance name</code>
     *            parameters are mutually exclusive.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskSnapshotRequest withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * <p>
     * The name of the destination disk snapshot (e.g.,
     * <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the destination disk snapshot (e.g.,
     *         <code>my-disk-snapshot</code>) based on the source disk.
     *         </p>
     */
    public String getDiskSnapshotName() {
        return diskSnapshotName;
    }

    /**
     * <p>
     * The name of the destination disk snapshot (e.g.,
     * <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskSnapshotName <p>
     *            The name of the destination disk snapshot (e.g.,
     *            <code>my-disk-snapshot</code>) based on the source disk.
     *            </p>
     */
    public void setDiskSnapshotName(String diskSnapshotName) {
        this.diskSnapshotName = diskSnapshotName;
    }

    /**
     * <p>
     * The name of the destination disk snapshot (e.g.,
     * <code>my-disk-snapshot</code>) based on the source disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskSnapshotName <p>
     *            The name of the destination disk snapshot (e.g.,
     *            <code>my-disk-snapshot</code>) based on the source disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskSnapshotRequest withDiskSnapshotName(String diskSnapshotName) {
        this.diskSnapshotName = diskSnapshotName;
        return this;
    }

    /**
     * <p>
     * The unique name of the source instance (e.g.,
     * <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined, a
     * snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code>
     * parameter. The <code>instance name</code> and <code>disk name</code>
     * parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique name of the source instance (e.g.,
     *         <code>Amazon_Linux-512MB-Virginia-1</code>). When this is
     *         defined, a snapshot of the instance's system volume is created.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>disk name</code> parameter. The <code>instance name</code>
     *         and <code>disk name</code> parameters are mutually exclusive.
     *         </p>
     *         </note>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The unique name of the source instance (e.g.,
     * <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined, a
     * snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code>
     * parameter. The <code>instance name</code> and <code>disk name</code>
     * parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The unique name of the source instance (e.g.,
     *            <code>Amazon_Linux-512MB-Virginia-1</code>). When this is
     *            defined, a snapshot of the instance's system volume is
     *            created.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>disk name</code> parameter. The
     *            <code>instance name</code> and <code>disk name</code>
     *            parameters are mutually exclusive.
     *            </p>
     *            </note>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The unique name of the source instance (e.g.,
     * <code>Amazon_Linux-512MB-Virginia-1</code>). When this is defined, a
     * snapshot of the instance's system volume is created.
     * </p>
     * <note>
     * <p>
     * This parameter cannot be defined together with the <code>disk name</code>
     * parameter. The <code>instance name</code> and <code>disk name</code>
     * parameters are mutually exclusive.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The unique name of the source instance (e.g.,
     *            <code>Amazon_Linux-512MB-Virginia-1</code>). When this is
     *            defined, a snapshot of the instance's system volume is
     *            created.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>disk name</code> parameter. The
     *            <code>instance name</code> and <code>disk name</code>
     *            parameters are mutually exclusive.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskSnapshotRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values to add to the resource during
     *         create.
     *         </p>
     *         <p>
     *         To tag a resource after it has been created, see the
     *         <code>tag resource</code> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskSnapshotRequest withTags(Tag... tags) {
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDiskName() != null)
            sb.append("diskName: " + getDiskName() + ",");
        if (getDiskSnapshotName() != null)
            sb.append("diskSnapshotName: " + getDiskSnapshotName() + ",");
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        hashCode = prime * hashCode
                + ((getDiskSnapshotName() == null) ? 0 : getDiskSnapshotName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDiskSnapshotRequest == false)
            return false;
        CreateDiskSnapshotRequest other = (CreateDiskSnapshotRequest) obj;

        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getDiskSnapshotName() == null ^ this.getDiskSnapshotName() == null)
            return false;
        if (other.getDiskSnapshotName() != null
                && other.getDiskSnapshotName().equals(this.getDiskSnapshotName()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
