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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * This parameter is specified when you are using an Amazon Elastic File System
 * file system for task storage. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html"
 * >Amazon EFS Volumes</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 */
public class EFSVolumeConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root
     * directory inside the host. If this parameter is omitted, the root of the
     * Amazon EFS volume will be used. Specifying <code>/</code> will have the
     * same effect as omitting this parameter.
     * </p>
     */
    private String rootDirectory;

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server. Transit encryption
     * must be enabled if Amazon EFS IAM authorization is used. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     * >Encrypting Data in Transit</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String transitEncryption;

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host
     * and the Amazon EFS server. If you do not specify a transit encryption
     * port, it will use the port selection strategy that the Amazon EFS mount
     * helper uses. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html"
     * >EFS Mount Helper</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     */
    private Integer transitEncryptionPort;

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     */
    private EFSAuthorizationConfig authorizationConfig;

    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     *
     * @return <p>
     *         The Amazon EFS file system ID to use.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     *
     * @param fileSystemId <p>
     *            The Amazon EFS file system ID to use.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The Amazon EFS file system ID to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EFSVolumeConfiguration withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root
     * directory inside the host. If this parameter is omitted, the root of the
     * Amazon EFS volume will be used. Specifying <code>/</code> will have the
     * same effect as omitting this parameter.
     * </p>
     *
     * @return <p>
     *         The directory within the Amazon EFS file system to mount as the
     *         root directory inside the host. If this parameter is omitted, the
     *         root of the Amazon EFS volume will be used. Specifying
     *         <code>/</code> will have the same effect as omitting this
     *         parameter.
     *         </p>
     */
    public String getRootDirectory() {
        return rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root
     * directory inside the host. If this parameter is omitted, the root of the
     * Amazon EFS volume will be used. Specifying <code>/</code> will have the
     * same effect as omitting this parameter.
     * </p>
     *
     * @param rootDirectory <p>
     *            The directory within the Amazon EFS file system to mount as
     *            the root directory inside the host. If this parameter is
     *            omitted, the root of the Amazon EFS volume will be used.
     *            Specifying <code>/</code> will have the same effect as
     *            omitting this parameter.
     *            </p>
     */
    public void setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root
     * directory inside the host. If this parameter is omitted, the root of the
     * Amazon EFS volume will be used. Specifying <code>/</code> will have the
     * same effect as omitting this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rootDirectory <p>
     *            The directory within the Amazon EFS file system to mount as
     *            the root directory inside the host. If this parameter is
     *            omitted, the root of the Amazon EFS volume will be used.
     *            Specifying <code>/</code> will have the same effect as
     *            omitting this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EFSVolumeConfiguration withRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server. Transit encryption
     * must be enabled if Amazon EFS IAM authorization is used. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     * >Encrypting Data in Transit</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Whether or not to enable encryption for Amazon EFS data in
     *         transit between the Amazon ECS host and the Amazon EFS server.
     *         Transit encryption must be enabled if Amazon EFS IAM
     *         authorization is used. If this parameter is omitted, the default
     *         value of <code>DISABLED</code> is used. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     *         >Encrypting Data in Transit</a> in the <i>Amazon Elastic File
     *         System User Guide</i>.
     *         </p>
     * @see EFSTransitEncryption
     */
    public String getTransitEncryption() {
        return transitEncryption;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server. Transit encryption
     * must be enabled if Amazon EFS IAM authorization is used. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     * >Encrypting Data in Transit</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param transitEncryption <p>
     *            Whether or not to enable encryption for Amazon EFS data in
     *            transit between the Amazon ECS host and the Amazon EFS server.
     *            Transit encryption must be enabled if Amazon EFS IAM
     *            authorization is used. If this parameter is omitted, the
     *            default value of <code>DISABLED</code> is used. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     *            >Encrypting Data in Transit</a> in the <i>Amazon Elastic File
     *            System User Guide</i>.
     *            </p>
     * @see EFSTransitEncryption
     */
    public void setTransitEncryption(String transitEncryption) {
        this.transitEncryption = transitEncryption;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server. Transit encryption
     * must be enabled if Amazon EFS IAM authorization is used. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     * >Encrypting Data in Transit</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param transitEncryption <p>
     *            Whether or not to enable encryption for Amazon EFS data in
     *            transit between the Amazon ECS host and the Amazon EFS server.
     *            Transit encryption must be enabled if Amazon EFS IAM
     *            authorization is used. If this parameter is omitted, the
     *            default value of <code>DISABLED</code> is used. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     *            >Encrypting Data in Transit</a> in the <i>Amazon Elastic File
     *            System User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EFSTransitEncryption
     */
    public EFSVolumeConfiguration withTransitEncryption(String transitEncryption) {
        this.transitEncryption = transitEncryption;
        return this;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server. Transit encryption
     * must be enabled if Amazon EFS IAM authorization is used. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     * >Encrypting Data in Transit</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param transitEncryption <p>
     *            Whether or not to enable encryption for Amazon EFS data in
     *            transit between the Amazon ECS host and the Amazon EFS server.
     *            Transit encryption must be enabled if Amazon EFS IAM
     *            authorization is used. If this parameter is omitted, the
     *            default value of <code>DISABLED</code> is used. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     *            >Encrypting Data in Transit</a> in the <i>Amazon Elastic File
     *            System User Guide</i>.
     *            </p>
     * @see EFSTransitEncryption
     */
    public void setTransitEncryption(EFSTransitEncryption transitEncryption) {
        this.transitEncryption = transitEncryption.toString();
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server. Transit encryption
     * must be enabled if Amazon EFS IAM authorization is used. If this
     * parameter is omitted, the default value of <code>DISABLED</code> is used.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     * >Encrypting Data in Transit</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param transitEncryption <p>
     *            Whether or not to enable encryption for Amazon EFS data in
     *            transit between the Amazon ECS host and the Amazon EFS server.
     *            Transit encryption must be enabled if Amazon EFS IAM
     *            authorization is used. If this parameter is omitted, the
     *            default value of <code>DISABLED</code> is used. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html"
     *            >Encrypting Data in Transit</a> in the <i>Amazon Elastic File
     *            System User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EFSTransitEncryption
     */
    public EFSVolumeConfiguration withTransitEncryption(EFSTransitEncryption transitEncryption) {
        this.transitEncryption = transitEncryption.toString();
        return this;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host
     * and the Amazon EFS server. If you do not specify a transit encryption
     * port, it will use the port selection strategy that the Amazon EFS mount
     * helper uses. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html"
     * >EFS Mount Helper</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The port to use when sending encrypted data between the Amazon
     *         ECS host and the Amazon EFS server. If you do not specify a
     *         transit encryption port, it will use the port selection strategy
     *         that the Amazon EFS mount helper uses. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html"
     *         >EFS Mount Helper</a> in the <i>Amazon Elastic File System User
     *         Guide</i>.
     *         </p>
     */
    public Integer getTransitEncryptionPort() {
        return transitEncryptionPort;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host
     * and the Amazon EFS server. If you do not specify a transit encryption
     * port, it will use the port selection strategy that the Amazon EFS mount
     * helper uses. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html"
     * >EFS Mount Helper</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     *
     * @param transitEncryptionPort <p>
     *            The port to use when sending encrypted data between the Amazon
     *            ECS host and the Amazon EFS server. If you do not specify a
     *            transit encryption port, it will use the port selection
     *            strategy that the Amazon EFS mount helper uses. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html"
     *            >EFS Mount Helper</a> in the <i>Amazon Elastic File System
     *            User Guide</i>.
     *            </p>
     */
    public void setTransitEncryptionPort(Integer transitEncryptionPort) {
        this.transitEncryptionPort = transitEncryptionPort;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host
     * and the Amazon EFS server. If you do not specify a transit encryption
     * port, it will use the port selection strategy that the Amazon EFS mount
     * helper uses. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html"
     * >EFS Mount Helper</a> in the <i>Amazon Elastic File System User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitEncryptionPort <p>
     *            The port to use when sending encrypted data between the Amazon
     *            ECS host and the Amazon EFS server. If you do not specify a
     *            transit encryption port, it will use the port selection
     *            strategy that the Amazon EFS mount helper uses. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html"
     *            >EFS Mount Helper</a> in the <i>Amazon Elastic File System
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EFSVolumeConfiguration withTransitEncryptionPort(Integer transitEncryptionPort) {
        this.transitEncryptionPort = transitEncryptionPort;
        return this;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     *
     * @return <p>
     *         The authorization configuration details for the Amazon EFS file
     *         system.
     *         </p>
     */
    public EFSAuthorizationConfig getAuthorizationConfig() {
        return authorizationConfig;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     *
     * @param authorizationConfig <p>
     *            The authorization configuration details for the Amazon EFS
     *            file system.
     *            </p>
     */
    public void setAuthorizationConfig(EFSAuthorizationConfig authorizationConfig) {
        this.authorizationConfig = authorizationConfig;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizationConfig <p>
     *            The authorization configuration details for the Amazon EFS
     *            file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EFSVolumeConfiguration withAuthorizationConfig(EFSAuthorizationConfig authorizationConfig) {
        this.authorizationConfig = authorizationConfig;
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
        if (getFileSystemId() != null)
            sb.append("fileSystemId: " + getFileSystemId() + ",");
        if (getRootDirectory() != null)
            sb.append("rootDirectory: " + getRootDirectory() + ",");
        if (getTransitEncryption() != null)
            sb.append("transitEncryption: " + getTransitEncryption() + ",");
        if (getTransitEncryptionPort() != null)
            sb.append("transitEncryptionPort: " + getTransitEncryptionPort() + ",");
        if (getAuthorizationConfig() != null)
            sb.append("authorizationConfig: " + getAuthorizationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        hashCode = prime * hashCode
                + ((getTransitEncryption() == null) ? 0 : getTransitEncryption().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransitEncryptionPort() == null) ? 0 : getTransitEncryptionPort().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizationConfig() == null) ? 0 : getAuthorizationConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EFSVolumeConfiguration == false)
            return false;
        EFSVolumeConfiguration other = (EFSVolumeConfiguration) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getRootDirectory() == null ^ this.getRootDirectory() == null)
            return false;
        if (other.getRootDirectory() != null
                && other.getRootDirectory().equals(this.getRootDirectory()) == false)
            return false;
        if (other.getTransitEncryption() == null ^ this.getTransitEncryption() == null)
            return false;
        if (other.getTransitEncryption() != null
                && other.getTransitEncryption().equals(this.getTransitEncryption()) == false)
            return false;
        if (other.getTransitEncryptionPort() == null ^ this.getTransitEncryptionPort() == null)
            return false;
        if (other.getTransitEncryptionPort() != null
                && other.getTransitEncryptionPort().equals(this.getTransitEncryptionPort()) == false)
            return false;
        if (other.getAuthorizationConfig() == null ^ this.getAuthorizationConfig() == null)
            return false;
        if (other.getAuthorizationConfig() != null
                && other.getAuthorizationConfig().equals(this.getAuthorizationConfig()) == false)
            return false;
        return true;
    }
}
