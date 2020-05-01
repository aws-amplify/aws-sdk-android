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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a description of a mount target.
 * </p>
 */
public class MountTargetDescription implements Serializable {
    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     */
    private String mountTargetId;

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     */
    private String lifeCycleState;

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount
     * target.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone (AZ) that
     * the mount target resides in. For example, <code>use1-az1</code> is an AZ
     * ID for the us-east-1 Region and it has the same location in every AWS
     * account.
     * </p>
     */
    private String availabilityZoneId;

    /**
     * <p>
     * The name of the Availability Zone (AZ) that the mount target resides in.
     * AZs are independently mapped to names for each AWS account. For example,
     * the Availability Zone <code>us-east-1a</code> for your AWS account might
     * not be the same location as <code>us-east-1a</code> for another AWS
     * account.
     * </p>
     */
    private String availabilityZoneName;

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     *
     * @return <p>
     *         AWS account ID that owns the resource.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     *
     * @param ownerId <p>
     *            AWS account ID that owns the resource.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * AWS account ID that owns the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            AWS account ID that owns the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     *
     * @return <p>
     *         System-assigned mount target ID.
     *         </p>
     */
    public String getMountTargetId() {
        return mountTargetId;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     *
     * @param mountTargetId <p>
     *            System-assigned mount target ID.
     *            </p>
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * System-assigned mount target ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountTargetId <p>
     *            System-assigned mount target ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     *
     * @return <p>
     *         The ID of the file system for which the mount target is intended.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system for which the mount target is
     *            intended.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which the mount target is intended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system for which the mount target is
     *            intended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the mount target's subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the mount target's subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the mount target's subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the mount target's subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @return <p>
     *         Lifecycle state of the mount target.
     *         </p>
     * @see LifeCycleState
     */
    public String getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Lifecycle state of the mount target.
     *            </p>
     * @see LifeCycleState
     */
    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Lifecycle state of the mount target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public MountTargetDescription withLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
        return this;
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Lifecycle state of the mount target.
     *            </p>
     * @see LifeCycleState
     */
    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
    }

    /**
     * <p>
     * Lifecycle state of the mount target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Lifecycle state of the mount target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public MountTargetDescription withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
        return this;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount
     * target.
     * </p>
     *
     * @return <p>
     *         Address at which the file system can be mounted by using the
     *         mount target.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount
     * target.
     * </p>
     *
     * @param ipAddress <p>
     *            Address at which the file system can be mounted by using the
     *            mount target.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Address at which the file system can be mounted by using the mount
     * target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddress <p>
     *            Address at which the file system can be mounted by using the
     *            mount target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface that Amazon EFS created when it
     *         created the mount target.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface that Amazon EFS created when
     *            it created the mount target.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface that Amazon EFS created when it created
     * the mount target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface that Amazon EFS created when
     *            it created the mount target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone (AZ) that
     * the mount target resides in. For example, <code>use1-az1</code> is an AZ
     * ID for the us-east-1 Region and it has the same location in every AWS
     * account.
     * </p>
     *
     * @return <p>
     *         The unique and consistent identifier of the Availability Zone
     *         (AZ) that the mount target resides in. For example,
     *         <code>use1-az1</code> is an AZ ID for the us-east-1 Region and it
     *         has the same location in every AWS account.
     *         </p>
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone (AZ) that
     * the mount target resides in. For example, <code>use1-az1</code> is an AZ
     * ID for the us-east-1 Region and it has the same location in every AWS
     * account.
     * </p>
     *
     * @param availabilityZoneId <p>
     *            The unique and consistent identifier of the Availability Zone
     *            (AZ) that the mount target resides in. For example,
     *            <code>use1-az1</code> is an AZ ID for the us-east-1 Region and
     *            it has the same location in every AWS account.
     *            </p>
     */
    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The unique and consistent identifier of the Availability Zone (AZ) that
     * the mount target resides in. For example, <code>use1-az1</code> is an AZ
     * ID for the us-east-1 Region and it has the same location in every AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneId <p>
     *            The unique and consistent identifier of the Availability Zone
     *            (AZ) that the mount target resides in. For example,
     *            <code>use1-az1</code> is an AZ ID for the us-east-1 Region and
     *            it has the same location in every AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone (AZ) that the mount target resides in.
     * AZs are independently mapped to names for each AWS account. For example,
     * the Availability Zone <code>us-east-1a</code> for your AWS account might
     * not be the same location as <code>us-east-1a</code> for another AWS
     * account.
     * </p>
     *
     * @return <p>
     *         The name of the Availability Zone (AZ) that the mount target
     *         resides in. AZs are independently mapped to names for each AWS
     *         account. For example, the Availability Zone
     *         <code>us-east-1a</code> for your AWS account might not be the
     *         same location as <code>us-east-1a</code> for another AWS account.
     *         </p>
     */
    public String getAvailabilityZoneName() {
        return availabilityZoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone (AZ) that the mount target resides in.
     * AZs are independently mapped to names for each AWS account. For example,
     * the Availability Zone <code>us-east-1a</code> for your AWS account might
     * not be the same location as <code>us-east-1a</code> for another AWS
     * account.
     * </p>
     *
     * @param availabilityZoneName <p>
     *            The name of the Availability Zone (AZ) that the mount target
     *            resides in. AZs are independently mapped to names for each AWS
     *            account. For example, the Availability Zone
     *            <code>us-east-1a</code> for your AWS account might not be the
     *            same location as <code>us-east-1a</code> for another AWS
     *            account.
     *            </p>
     */
    public void setAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone (AZ) that the mount target resides in.
     * AZs are independently mapped to names for each AWS account. For example,
     * the Availability Zone <code>us-east-1a</code> for your AWS account might
     * not be the same location as <code>us-east-1a</code> for another AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZoneName <p>
     *            The name of the Availability Zone (AZ) that the mount target
     *            resides in. AZs are independently mapped to names for each AWS
     *            account. For example, the Availability Zone
     *            <code>us-east-1a</code> for your AWS account might not be the
     *            same location as <code>us-east-1a</code> for another AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MountTargetDescription withAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
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
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getMountTargetId() != null)
            sb.append("MountTargetId: " + getMountTargetId() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: " + getLifeCycleState() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: " + getAvailabilityZoneId() + ",");
        if (getAvailabilityZoneName() != null)
            sb.append("AvailabilityZoneName: " + getAvailabilityZoneName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getLifeCycleState() == null) ? 0 : getLifeCycleState().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZoneName() == null) ? 0 : getAvailabilityZoneName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MountTargetDescription == false)
            return false;
        MountTargetDescription other = (MountTargetDescription) obj;

        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null
                && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null
                && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null
                && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getAvailabilityZoneName() == null ^ this.getAvailabilityZoneName() == null)
            return false;
        if (other.getAvailabilityZoneName() != null
                && other.getAvailabilityZoneName().equals(this.getAvailabilityZoneName()) == false)
            return false;
        return true;
    }
}
