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

/**
 * <p>
 * Describes the source of an export snapshot record.
 * </p>
 */
public class ExportSnapshotRecordSourceInfo implements Serializable {
    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or
     * <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceSnapshot, DiskSnapshot
     */
    private String resourceType;

    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromResourceName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromResourceArn;

    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     */
    private InstanceSnapshotInfo instanceSnapshotInfo;

    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     */
    private DiskSnapshotInfo diskSnapshotInfo;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or
     * <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceSnapshot, DiskSnapshot
     *
     * @return <p>
     *         The Lightsail resource type (e.g., <code>InstanceSnapshot</code>
     *         or <code>DiskSnapshot</code>).
     *         </p>
     * @see ExportSnapshotRecordSourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or
     * <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceSnapshot, DiskSnapshot
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g.,
     *            <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     *            </p>
     * @see ExportSnapshotRecordSourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or
     * <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceSnapshot, DiskSnapshot
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g.,
     *            <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportSnapshotRecordSourceType
     */
    public ExportSnapshotRecordSourceInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or
     * <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceSnapshot, DiskSnapshot
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g.,
     *            <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     *            </p>
     * @see ExportSnapshotRecordSourceType
     */
    public void setResourceType(ExportSnapshotRecordSourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>InstanceSnapshot</code> or
     * <code>DiskSnapshot</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceSnapshot, DiskSnapshot
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g.,
     *            <code>InstanceSnapshot</code> or <code>DiskSnapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportSnapshotRecordSourceType
     */
    public ExportSnapshotRecordSourceInfo withResourceType(
            ExportSnapshotRecordSourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     *
     * @return <p>
     *         The date when the source instance or disk snapshot was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date when the source instance or disk snapshot was
     *            created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the source instance or disk snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date when the source instance or disk snapshot was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecordSourceInfo withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the source instance or disk snapshot.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the source instance or disk snapshot.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the source instance or disk snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the source instance or disk snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecordSourceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source instance or disk
     *         snapshot.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the source instance or disk
     *            snapshot.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the source instance or disk
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecordSourceInfo withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the snapshot's source instance or disk.
     *         </p>
     */
    public String getFromResourceName() {
        return fromResourceName;
    }

    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromResourceName <p>
     *            The name of the snapshot's source instance or disk.
     *            </p>
     */
    public void setFromResourceName(String fromResourceName) {
        this.fromResourceName = fromResourceName;
    }

    /**
     * <p>
     * The name of the snapshot's source instance or disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromResourceName <p>
     *            The name of the snapshot's source instance or disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecordSourceInfo withFromResourceName(String fromResourceName) {
        this.fromResourceName = fromResourceName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the snapshot's source instance
     *         or disk.
     *         </p>
     */
    public String getFromResourceArn() {
        return fromResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromResourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot's source
     *            instance or disk.
     *            </p>
     */
    public void setFromResourceArn(String fromResourceArn) {
        this.fromResourceArn = fromResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromResourceArn <p>
     *            The Amazon Resource Name (ARN) of the snapshot's source
     *            instance or disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecordSourceInfo withFromResourceArn(String fromResourceArn) {
        this.fromResourceArn = fromResourceArn;
        return this;
    }

    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     *
     * @return <p>
     *         A list of objects describing an instance snapshot.
     *         </p>
     */
    public InstanceSnapshotInfo getInstanceSnapshotInfo() {
        return instanceSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     *
     * @param instanceSnapshotInfo <p>
     *            A list of objects describing an instance snapshot.
     *            </p>
     */
    public void setInstanceSnapshotInfo(InstanceSnapshotInfo instanceSnapshotInfo) {
        this.instanceSnapshotInfo = instanceSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing an instance snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceSnapshotInfo <p>
     *            A list of objects describing an instance snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecordSourceInfo withInstanceSnapshotInfo(
            InstanceSnapshotInfo instanceSnapshotInfo) {
        this.instanceSnapshotInfo = instanceSnapshotInfo;
        return this;
    }

    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     *
     * @return <p>
     *         A list of objects describing a disk snapshot.
     *         </p>
     */
    public DiskSnapshotInfo getDiskSnapshotInfo() {
        return diskSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     *
     * @param diskSnapshotInfo <p>
     *            A list of objects describing a disk snapshot.
     *            </p>
     */
    public void setDiskSnapshotInfo(DiskSnapshotInfo diskSnapshotInfo) {
        this.diskSnapshotInfo = diskSnapshotInfo;
    }

    /**
     * <p>
     * A list of objects describing a disk snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSnapshotInfo <p>
     *            A list of objects describing a disk snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecordSourceInfo withDiskSnapshotInfo(DiskSnapshotInfo diskSnapshotInfo) {
        this.diskSnapshotInfo = diskSnapshotInfo;
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
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getFromResourceName() != null)
            sb.append("fromResourceName: " + getFromResourceName() + ",");
        if (getFromResourceArn() != null)
            sb.append("fromResourceArn: " + getFromResourceArn() + ",");
        if (getInstanceSnapshotInfo() != null)
            sb.append("instanceSnapshotInfo: " + getInstanceSnapshotInfo() + ",");
        if (getDiskSnapshotInfo() != null)
            sb.append("diskSnapshotInfo: " + getDiskSnapshotInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getFromResourceName() == null) ? 0 : getFromResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getFromResourceArn() == null) ? 0 : getFromResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceSnapshotInfo() == null) ? 0 : getInstanceSnapshotInfo().hashCode());
        hashCode = prime * hashCode
                + ((getDiskSnapshotInfo() == null) ? 0 : getDiskSnapshotInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSnapshotRecordSourceInfo == false)
            return false;
        ExportSnapshotRecordSourceInfo other = (ExportSnapshotRecordSourceInfo) obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFromResourceName() == null ^ this.getFromResourceName() == null)
            return false;
        if (other.getFromResourceName() != null
                && other.getFromResourceName().equals(this.getFromResourceName()) == false)
            return false;
        if (other.getFromResourceArn() == null ^ this.getFromResourceArn() == null)
            return false;
        if (other.getFromResourceArn() != null
                && other.getFromResourceArn().equals(this.getFromResourceArn()) == false)
            return false;
        if (other.getInstanceSnapshotInfo() == null ^ this.getInstanceSnapshotInfo() == null)
            return false;
        if (other.getInstanceSnapshotInfo() != null
                && other.getInstanceSnapshotInfo().equals(this.getInstanceSnapshotInfo()) == false)
            return false;
        if (other.getDiskSnapshotInfo() == null ^ this.getDiskSnapshotInfo() == null)
            return false;
        if (other.getDiskSnapshotInfo() != null
                && other.getDiskSnapshotInfo().equals(this.getDiskSnapshotInfo()) == false)
            return false;
        return true;
    }
}
