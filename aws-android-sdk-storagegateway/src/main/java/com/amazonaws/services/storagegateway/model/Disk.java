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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a gateway's local disk.
 * </p>
 */
public class Disk implements Serializable {
    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local
     * disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String diskId;

    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     */
    private String diskPath;

    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization
     * environment.
     * </p>
     */
    private String diskNode;

    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     */
    private String diskStatus;

    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     */
    private Long diskSizeInBytes;

    /**
     * <p>
     * One of the <code>DiskAllocationType</code> enumeration values that
     * identifies how a local disk is used.
     * </p>
     * <p>
     * Valid Values: <code>UPLOAD_BUFFER</code> | <code>CACHE_STORAGE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     */
    private String diskAllocationType;

    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is
     * not included in the response if the local disk is not defined as an iSCSI
     * target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     */
    private String diskAllocationResource;

    /**
     * <p>
     * A list of values that represents attributes of a local disk.
     * </p>
     */
    private java.util.List<String> diskAttributeList;

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local
     * disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique device ID or other distinguishing data that identifies
     *         a local disk.
     *         </p>
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local
     * disk.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId <p>
     *            The unique device ID or other distinguishing data that
     *            identifies a local disk.
     *            </p>
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * <p>
     * The unique device ID or other distinguishing data that identifies a local
     * disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId <p>
     *            The unique device ID or other distinguishing data that
     *            identifies a local disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     *
     * @return <p>
     *         The path of a local disk in the gateway virtual machine (VM).
     *         </p>
     */
    public String getDiskPath() {
        return diskPath;
    }

    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     *
     * @param diskPath <p>
     *            The path of a local disk in the gateway virtual machine (VM).
     *            </p>
     */
    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }

    /**
     * <p>
     * The path of a local disk in the gateway virtual machine (VM).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskPath <p>
     *            The path of a local disk in the gateway virtual machine (VM).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskPath(String diskPath) {
        this.diskPath = diskPath;
        return this;
    }

    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization
     * environment.
     * </p>
     *
     * @return <p>
     *         The device node of a local disk as assigned by the virtualization
     *         environment.
     *         </p>
     */
    public String getDiskNode() {
        return diskNode;
    }

    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization
     * environment.
     * </p>
     *
     * @param diskNode <p>
     *            The device node of a local disk as assigned by the
     *            virtualization environment.
     *            </p>
     */
    public void setDiskNode(String diskNode) {
        this.diskNode = diskNode;
    }

    /**
     * <p>
     * The device node of a local disk as assigned by the virtualization
     * environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskNode <p>
     *            The device node of a local disk as assigned by the
     *            virtualization environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskNode(String diskNode) {
        this.diskNode = diskNode;
        return this;
    }

    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     *
     * @return <p>
     *         A value that represents the status of a local disk.
     *         </p>
     */
    public String getDiskStatus() {
        return diskStatus;
    }

    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     *
     * @param diskStatus <p>
     *            A value that represents the status of a local disk.
     *            </p>
     */
    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    /**
     * <p>
     * A value that represents the status of a local disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskStatus <p>
     *            A value that represents the status of a local disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
        return this;
    }

    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     *
     * @return <p>
     *         The local disk size in bytes.
     *         </p>
     */
    public Long getDiskSizeInBytes() {
        return diskSizeInBytes;
    }

    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     *
     * @param diskSizeInBytes <p>
     *            The local disk size in bytes.
     *            </p>
     */
    public void setDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
    }

    /**
     * <p>
     * The local disk size in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskSizeInBytes <p>
     *            The local disk size in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskSizeInBytes(Long diskSizeInBytes) {
        this.diskSizeInBytes = diskSizeInBytes;
        return this;
    }

    /**
     * <p>
     * One of the <code>DiskAllocationType</code> enumeration values that
     * identifies how a local disk is used.
     * </p>
     * <p>
     * Valid Values: <code>UPLOAD_BUFFER</code> | <code>CACHE_STORAGE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @return <p>
     *         One of the <code>DiskAllocationType</code> enumeration values
     *         that identifies how a local disk is used.
     *         </p>
     *         <p>
     *         Valid Values: <code>UPLOAD_BUFFER</code> |
     *         <code>CACHE_STORAGE</code>
     *         </p>
     */
    public String getDiskAllocationType() {
        return diskAllocationType;
    }

    /**
     * <p>
     * One of the <code>DiskAllocationType</code> enumeration values that
     * identifies how a local disk is used.
     * </p>
     * <p>
     * Valid Values: <code>UPLOAD_BUFFER</code> | <code>CACHE_STORAGE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param diskAllocationType <p>
     *            One of the <code>DiskAllocationType</code> enumeration values
     *            that identifies how a local disk is used.
     *            </p>
     *            <p>
     *            Valid Values: <code>UPLOAD_BUFFER</code> |
     *            <code>CACHE_STORAGE</code>
     *            </p>
     */
    public void setDiskAllocationType(String diskAllocationType) {
        this.diskAllocationType = diskAllocationType;
    }

    /**
     * <p>
     * One of the <code>DiskAllocationType</code> enumeration values that
     * identifies how a local disk is used.
     * </p>
     * <p>
     * Valid Values: <code>UPLOAD_BUFFER</code> | <code>CACHE_STORAGE</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param diskAllocationType <p>
     *            One of the <code>DiskAllocationType</code> enumeration values
     *            that identifies how a local disk is used.
     *            </p>
     *            <p>
     *            Valid Values: <code>UPLOAD_BUFFER</code> |
     *            <code>CACHE_STORAGE</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskAllocationType(String diskAllocationType) {
        this.diskAllocationType = diskAllocationType;
        return this;
    }

    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is
     * not included in the response if the local disk is not defined as an iSCSI
     * target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     *
     * @return <p>
     *         The iSCSI qualified name (IQN) that is defined for a disk. This
     *         field is not included in the response if the local disk is not
     *         defined as an iSCSI target. The format of this field is
     *         <i>targetIqn::LUNNumber::region-volumeId</i>.
     *         </p>
     */
    public String getDiskAllocationResource() {
        return diskAllocationResource;
    }

    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is
     * not included in the response if the local disk is not defined as an iSCSI
     * target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     *
     * @param diskAllocationResource <p>
     *            The iSCSI qualified name (IQN) that is defined for a disk.
     *            This field is not included in the response if the local disk
     *            is not defined as an iSCSI target. The format of this field is
     *            <i>targetIqn::LUNNumber::region-volumeId</i>.
     *            </p>
     */
    public void setDiskAllocationResource(String diskAllocationResource) {
        this.diskAllocationResource = diskAllocationResource;
    }

    /**
     * <p>
     * The iSCSI qualified name (IQN) that is defined for a disk. This field is
     * not included in the response if the local disk is not defined as an iSCSI
     * target. The format of this field is
     * <i>targetIqn::LUNNumber::region-volumeId</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskAllocationResource <p>
     *            The iSCSI qualified name (IQN) that is defined for a disk.
     *            This field is not included in the response if the local disk
     *            is not defined as an iSCSI target. The format of this field is
     *            <i>targetIqn::LUNNumber::region-volumeId</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskAllocationResource(String diskAllocationResource) {
        this.diskAllocationResource = diskAllocationResource;
        return this;
    }

    /**
     * <p>
     * A list of values that represents attributes of a local disk.
     * </p>
     *
     * @return <p>
     *         A list of values that represents attributes of a local disk.
     *         </p>
     */
    public java.util.List<String> getDiskAttributeList() {
        return diskAttributeList;
    }

    /**
     * <p>
     * A list of values that represents attributes of a local disk.
     * </p>
     *
     * @param diskAttributeList <p>
     *            A list of values that represents attributes of a local disk.
     *            </p>
     */
    public void setDiskAttributeList(java.util.Collection<String> diskAttributeList) {
        if (diskAttributeList == null) {
            this.diskAttributeList = null;
            return;
        }

        this.diskAttributeList = new java.util.ArrayList<String>(diskAttributeList);
    }

    /**
     * <p>
     * A list of values that represents attributes of a local disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskAttributeList <p>
     *            A list of values that represents attributes of a local disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskAttributeList(String... diskAttributeList) {
        if (getDiskAttributeList() == null) {
            this.diskAttributeList = new java.util.ArrayList<String>(diskAttributeList.length);
        }
        for (String value : diskAttributeList) {
            this.diskAttributeList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of values that represents attributes of a local disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskAttributeList <p>
     *            A list of values that represents attributes of a local disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Disk withDiskAttributeList(java.util.Collection<String> diskAttributeList) {
        setDiskAttributeList(diskAttributeList);
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
        if (getDiskId() != null)
            sb.append("DiskId: " + getDiskId() + ",");
        if (getDiskPath() != null)
            sb.append("DiskPath: " + getDiskPath() + ",");
        if (getDiskNode() != null)
            sb.append("DiskNode: " + getDiskNode() + ",");
        if (getDiskStatus() != null)
            sb.append("DiskStatus: " + getDiskStatus() + ",");
        if (getDiskSizeInBytes() != null)
            sb.append("DiskSizeInBytes: " + getDiskSizeInBytes() + ",");
        if (getDiskAllocationType() != null)
            sb.append("DiskAllocationType: " + getDiskAllocationType() + ",");
        if (getDiskAllocationResource() != null)
            sb.append("DiskAllocationResource: " + getDiskAllocationResource() + ",");
        if (getDiskAttributeList() != null)
            sb.append("DiskAttributeList: " + getDiskAttributeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskId() == null) ? 0 : getDiskId().hashCode());
        hashCode = prime * hashCode + ((getDiskPath() == null) ? 0 : getDiskPath().hashCode());
        hashCode = prime * hashCode + ((getDiskNode() == null) ? 0 : getDiskNode().hashCode());
        hashCode = prime * hashCode + ((getDiskStatus() == null) ? 0 : getDiskStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDiskSizeInBytes() == null) ? 0 : getDiskSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getDiskAllocationType() == null) ? 0 : getDiskAllocationType().hashCode());
        hashCode = prime
                * hashCode
                + ((getDiskAllocationResource() == null) ? 0 : getDiskAllocationResource()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDiskAttributeList() == null) ? 0 : getDiskAttributeList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Disk == false)
            return false;
        Disk other = (Disk) obj;

        if (other.getDiskId() == null ^ this.getDiskId() == null)
            return false;
        if (other.getDiskId() != null && other.getDiskId().equals(this.getDiskId()) == false)
            return false;
        if (other.getDiskPath() == null ^ this.getDiskPath() == null)
            return false;
        if (other.getDiskPath() != null && other.getDiskPath().equals(this.getDiskPath()) == false)
            return false;
        if (other.getDiskNode() == null ^ this.getDiskNode() == null)
            return false;
        if (other.getDiskNode() != null && other.getDiskNode().equals(this.getDiskNode()) == false)
            return false;
        if (other.getDiskStatus() == null ^ this.getDiskStatus() == null)
            return false;
        if (other.getDiskStatus() != null
                && other.getDiskStatus().equals(this.getDiskStatus()) == false)
            return false;
        if (other.getDiskSizeInBytes() == null ^ this.getDiskSizeInBytes() == null)
            return false;
        if (other.getDiskSizeInBytes() != null
                && other.getDiskSizeInBytes().equals(this.getDiskSizeInBytes()) == false)
            return false;
        if (other.getDiskAllocationType() == null ^ this.getDiskAllocationType() == null)
            return false;
        if (other.getDiskAllocationType() != null
                && other.getDiskAllocationType().equals(this.getDiskAllocationType()) == false)
            return false;
        if (other.getDiskAllocationResource() == null ^ this.getDiskAllocationResource() == null)
            return false;
        if (other.getDiskAllocationResource() != null
                && other.getDiskAllocationResource().equals(this.getDiskAllocationResource()) == false)
            return false;
        if (other.getDiskAttributeList() == null ^ this.getDiskAttributeList() == null)
            return false;
        if (other.getDiskAttributeList() != null
                && other.getDiskAttributeList().equals(this.getDiskAttributeList()) == false)
            return false;
        return true;
    }
}
