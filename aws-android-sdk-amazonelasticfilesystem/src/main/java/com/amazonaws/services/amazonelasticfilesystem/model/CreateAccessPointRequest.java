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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an EFS access point. An access point is an application-specific view
 * into an EFS file system that applies an operating system user and group, and
 * a file system path, to any file system request made through the access point.
 * The operating system user and group override any identity information
 * provided by the NFS client. The file system path is exposed as the access
 * point's root directory. Applications using the access point can only access
 * data in its own directory and below. To learn more, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html"
 * >Mounting a File System Using EFS Access Points</a>.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:CreateAccessPoint</code> action.
 * </p>
 */
public class CreateAccessPointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure
     * idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value
     * pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The operating system user and group applied to all file system requests
     * made using the access point.
     * </p>
     */
    private PosixUser posixUser;

    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access
     * point exposes as the root directory of your file system to NFS clients
     * using the access point. The clients using the access point can only
     * access the root directory and below. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates it and
     * applies the <code>CreationInfo</code> settings when a client connects to
     * an access point. When specifying a <code>RootDirectory</code>, you need
     * to provide the <code>Path</code>, and the <code>CreationInfo</code> is
     * optional.
     * </p>
     */
    private RootDirectory rootDirectory;

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure
     * idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A string of up to 64 ASCII characters that Amazon EFS uses to
     *         ensure idempotent creation.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure
     * idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            A string of up to 64 ASCII characters that Amazon EFS uses to
     *            ensure idempotent creation.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure
     * idempotent creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            A string of up to 64 ASCII characters that Amazon EFS uses to
     *            ensure idempotent creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccessPointRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value
     * pair.
     * </p>
     *
     * @return <p>
     *         Creates tags associated with the access point. Each tag is a
     *         key-value pair.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value
     * pair.
     * </p>
     *
     * @param tags <p>
     *            Creates tags associated with the access point. Each tag is a
     *            key-value pair.
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
     * Creates tags associated with the access point. Each tag is a key-value
     * pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Creates tags associated with the access point. Each tag is a
     *            key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccessPointRequest withTags(Tag... tags) {
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
     * Creates tags associated with the access point. Each tag is a key-value
     * pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Creates tags associated with the access point. Each tag is a
     *            key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccessPointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     *
     * @return <p>
     *         The ID of the EFS file system that the access point provides
     *         access to.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the EFS file system that the access point provides
     *            access to.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the EFS file system that the access point provides
     *            access to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccessPointRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The operating system user and group applied to all file system requests
     * made using the access point.
     * </p>
     *
     * @return <p>
     *         The operating system user and group applied to all file system
     *         requests made using the access point.
     *         </p>
     */
    public PosixUser getPosixUser() {
        return posixUser;
    }

    /**
     * <p>
     * The operating system user and group applied to all file system requests
     * made using the access point.
     * </p>
     *
     * @param posixUser <p>
     *            The operating system user and group applied to all file system
     *            requests made using the access point.
     *            </p>
     */
    public void setPosixUser(PosixUser posixUser) {
        this.posixUser = posixUser;
    }

    /**
     * <p>
     * The operating system user and group applied to all file system requests
     * made using the access point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param posixUser <p>
     *            The operating system user and group applied to all file system
     *            requests made using the access point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccessPointRequest withPosixUser(PosixUser posixUser) {
        this.posixUser = posixUser;
        return this;
    }

    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access
     * point exposes as the root directory of your file system to NFS clients
     * using the access point. The clients using the access point can only
     * access the root directory and below. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates it and
     * applies the <code>CreationInfo</code> settings when a client connects to
     * an access point. When specifying a <code>RootDirectory</code>, you need
     * to provide the <code>Path</code>, and the <code>CreationInfo</code> is
     * optional.
     * </p>
     *
     * @return <p>
     *         Specifies the directory on the Amazon EFS file system that the
     *         access point exposes as the root directory of your file system to
     *         NFS clients using the access point. The clients using the access
     *         point can only access the root directory and below. If the
     *         <code>RootDirectory</code> &gt; <code>Path</code> specified does
     *         not exist, EFS creates it and applies the
     *         <code>CreationInfo</code> settings when a client connects to an
     *         access point. When specifying a <code>RootDirectory</code>, you
     *         need to provide the <code>Path</code>, and the
     *         <code>CreationInfo</code> is optional.
     *         </p>
     */
    public RootDirectory getRootDirectory() {
        return rootDirectory;
    }

    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access
     * point exposes as the root directory of your file system to NFS clients
     * using the access point. The clients using the access point can only
     * access the root directory and below. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates it and
     * applies the <code>CreationInfo</code> settings when a client connects to
     * an access point. When specifying a <code>RootDirectory</code>, you need
     * to provide the <code>Path</code>, and the <code>CreationInfo</code> is
     * optional.
     * </p>
     *
     * @param rootDirectory <p>
     *            Specifies the directory on the Amazon EFS file system that the
     *            access point exposes as the root directory of your file system
     *            to NFS clients using the access point. The clients using the
     *            access point can only access the root directory and below. If
     *            the <code>RootDirectory</code> &gt; <code>Path</code>
     *            specified does not exist, EFS creates it and applies the
     *            <code>CreationInfo</code> settings when a client connects to
     *            an access point. When specifying a <code>RootDirectory</code>,
     *            you need to provide the <code>Path</code>, and the
     *            <code>CreationInfo</code> is optional.
     *            </p>
     */
    public void setRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access
     * point exposes as the root directory of your file system to NFS clients
     * using the access point. The clients using the access point can only
     * access the root directory and below. If the <code>RootDirectory</code>
     * &gt; <code>Path</code> specified does not exist, EFS creates it and
     * applies the <code>CreationInfo</code> settings when a client connects to
     * an access point. When specifying a <code>RootDirectory</code>, you need
     * to provide the <code>Path</code>, and the <code>CreationInfo</code> is
     * optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootDirectory <p>
     *            Specifies the directory on the Amazon EFS file system that the
     *            access point exposes as the root directory of your file system
     *            to NFS clients using the access point. The clients using the
     *            access point can only access the root directory and below. If
     *            the <code>RootDirectory</code> &gt; <code>Path</code>
     *            specified does not exist, EFS creates it and applies the
     *            <code>CreationInfo</code> settings when a client connects to
     *            an access point. When specifying a <code>RootDirectory</code>,
     *            you need to provide the <code>Path</code>, and the
     *            <code>CreationInfo</code> is optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccessPointRequest withRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getPosixUser() != null)
            sb.append("PosixUser: " + getPosixUser() + ",");
        if (getRootDirectory() != null)
            sb.append("RootDirectory: " + getRootDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPosixUser() == null) ? 0 : getPosixUser().hashCode());
        hashCode = prime * hashCode
                + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessPointRequest == false)
            return false;
        CreateAccessPointRequest other = (CreateAccessPointRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        return true;
    }
}
