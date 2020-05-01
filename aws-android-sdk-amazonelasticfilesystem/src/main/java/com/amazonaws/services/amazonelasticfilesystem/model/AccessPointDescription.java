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
 * Provides a description of an EFS file system access point.
 * </p>
 */
public class AccessPointDescription implements Serializable {
    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code>
     * tag.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The tags associated with the access point, presented as an array of Tag
     * objects.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     */
    private String accessPointId;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     */
    private String accessPointArn;

    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS
     * clients using the access point.
     * </p>
     */
    private PosixUser posixUser;

    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes
     * as the root directory to NFS clients using the access point.
     * </p>
     */
    private RootDirectory rootDirectory;

    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     */
    private String lifeCycleState;

    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The opaque string specified in the request to ensure idempotent
     *         creation.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            The opaque string specified in the request to ensure
     *            idempotent creation.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            The opaque string specified in the request to ensure
     *            idempotent creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code>
     * tag.
     * </p>
     *
     * @return <p>
     *         The name of the access point. This is the value of the
     *         <code>Name</code> tag.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code>
     * tag.
     * </p>
     *
     * @param name <p>
     *            The name of the access point. This is the value of the
     *            <code>Name</code> tag.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code>
     * tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the access point. This is the value of the
     *            <code>Name</code> tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The tags associated with the access point, presented as an array of Tag
     * objects.
     * </p>
     *
     * @return <p>
     *         The tags associated with the access point, presented as an array
     *         of Tag objects.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the access point, presented as an array of Tag
     * objects.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the access point, presented as an
     *            array of Tag objects.
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
     * The tags associated with the access point, presented as an array of Tag
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the access point, presented as an
     *            array of Tag objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withTags(Tag... tags) {
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
     * The tags associated with the access point, presented as an array of Tag
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the access point, presented as an
     *            array of Tag objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     *
     * @return <p>
     *         The ID of the access point, assigned by Amazon EFS.
     *         </p>
     */
    public String getAccessPointId() {
        return accessPointId;
    }

    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     *
     * @param accessPointId <p>
     *            The ID of the access point, assigned by Amazon EFS.
     *            </p>
     */
    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPointId <p>
     *            The ID of the access point, assigned by Amazon EFS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     *
     * @return <p>
     *         The unique Amazon Resource Name (ARN) associated with the access
     *         point.
     *         </p>
     */
    public String getAccessPointArn() {
        return accessPointArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     *
     * @param accessPointArn <p>
     *            The unique Amazon Resource Name (ARN) associated with the
     *            access point.
     *            </p>
     */
    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPointArn <p>
     *            The unique Amazon Resource Name (ARN) associated with the
     *            access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
        return this;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     *
     * @return <p>
     *         The ID of the EFS file system that the access point applies to.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the EFS file system that the access point applies
     *            to.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the EFS file system that the access point applies
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS
     * clients using the access point.
     * </p>
     *
     * @return <p>
     *         The full POSIX identity, including the user ID, group ID, and
     *         secondary group IDs on the access point that is used for all file
     *         operations by NFS clients using the access point.
     *         </p>
     */
    public PosixUser getPosixUser() {
        return posixUser;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS
     * clients using the access point.
     * </p>
     *
     * @param posixUser <p>
     *            The full POSIX identity, including the user ID, group ID, and
     *            secondary group IDs on the access point that is used for all
     *            file operations by NFS clients using the access point.
     *            </p>
     */
    public void setPosixUser(PosixUser posixUser) {
        this.posixUser = posixUser;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary
     * group IDs on the access point that is used for all file operations by NFS
     * clients using the access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param posixUser <p>
     *            The full POSIX identity, including the user ID, group ID, and
     *            secondary group IDs on the access point that is used for all
     *            file operations by NFS clients using the access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withPosixUser(PosixUser posixUser) {
        this.posixUser = posixUser;
        return this;
    }

    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes
     * as the root directory to NFS clients using the access point.
     * </p>
     *
     * @return <p>
     *         The directory on the Amazon EFS file system that the access point
     *         exposes as the root directory to NFS clients using the access
     *         point.
     *         </p>
     */
    public RootDirectory getRootDirectory() {
        return rootDirectory;
    }

    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes
     * as the root directory to NFS clients using the access point.
     * </p>
     *
     * @param rootDirectory <p>
     *            The directory on the Amazon EFS file system that the access
     *            point exposes as the root directory to NFS clients using the
     *            access point.
     *            </p>
     */
    public void setRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes
     * as the root directory to NFS clients using the access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootDirectory <p>
     *            The directory on the Amazon EFS file system that the access
     *            point exposes as the root directory to NFS clients using the
     *            access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }

    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     *
     * @return <p>
     *         Identified the AWS account that owns the access point resource.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     *
     * @param ownerId <p>
     *            Identified the AWS account that owns the access point
     *            resource.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            Identified the AWS account that owns the access point
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPointDescription withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @return <p>
     *         Identifies the lifecycle phase of the access point.
     *         </p>
     * @see LifeCycleState
     */
    public String getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Identifies the lifecycle phase of the access point.
     *            </p>
     * @see LifeCycleState
     */
    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Identifies the lifecycle phase of the access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public AccessPointDescription withLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
        return this;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Identifies the lifecycle phase of the access point.
     *            </p>
     * @see LifeCycleState
     */
    public void setLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>creating, available, updating, deleting, deleted
     *
     * @param lifeCycleState <p>
     *            Identifies the lifecycle phase of the access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifeCycleState
     */
    public AccessPointDescription withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getAccessPointId() != null)
            sb.append("AccessPointId: " + getAccessPointId() + ",");
        if (getAccessPointArn() != null)
            sb.append("AccessPointArn: " + getAccessPointArn() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getPosixUser() != null)
            sb.append("PosixUser: " + getPosixUser() + ",");
        if (getRootDirectory() != null)
            sb.append("RootDirectory: " + getRootDirectory() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: " + getLifeCycleState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        hashCode = prime * hashCode
                + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPosixUser() == null) ? 0 : getPosixUser().hashCode());
        hashCode = prime * hashCode
                + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getLifeCycleState() == null) ? 0 : getLifeCycleState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPointDescription == false)
            return false;
        AccessPointDescription other = (AccessPointDescription) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null
                && other.getAccessPointId().equals(this.getAccessPointId()) == false)
            return false;
        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null
                && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPosixUser() == null ^ this.getPosixUser() == null)
            return false;
        if (other.getPosixUser() != null
                && other.getPosixUser().equals(this.getPosixUser()) == false)
            return false;
        if (other.getRootDirectory() == null ^ this.getRootDirectory() == null)
            return false;
        if (other.getRootDirectory() != null
                && other.getRootDirectory().equals(this.getRootDirectory()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null
                && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        return true;
    }
}
