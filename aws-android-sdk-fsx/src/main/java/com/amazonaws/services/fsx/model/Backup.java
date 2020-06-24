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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * A backup of an Amazon FSx for file system.
 * </p>
 */
public class Backup implements Serializable {
    /**
     * <p>
     * The ID of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     */
    private String backupId;

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     */
    private String lifecycle;

    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     */
    private BackupFailureDetails failureDetails;

    /**
     * <p>
     * The type of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, USER_INITIATED
     */
    private String type;

    /**
     * <p>
     * The current percent of progress of an asynchronous task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer progressPercent;

    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * this backup of the Amazon FSx for Windows file system's data at rest.
     * Amazon FSx for Lustre does not support KMS encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is
     * persisted even if the file system is deleted.
     * </p>
     */
    private FileSystem fileSystem;

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD) to
     * which the Windows File Server instance is joined.
     * </p>
     */
    private ActiveDirectoryBackupAttributes directoryInformation;

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the backup.
     *         </p>
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param backupId <p>
     *            The ID of the backup.
     *            </p>
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 128<br/>
     * <b>Pattern: </b>^(backup-[0-9a-f]{8,})$<br/>
     *
     * @param backupId <p>
     *            The ID of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @return <p>
     *         The lifecycle status of the backup.
     *         </p>
     * @see BackupLifecycle
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle status of the backup.
     *            </p>
     * @see BackupLifecycle
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle status of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupLifecycle
     */
    public Backup withLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle status of the backup.
     *            </p>
     * @see BackupLifecycle
     */
    public void setLifecycle(BackupLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, DELETED, FAILED
     *
     * @param lifecycle <p>
     *            The lifecycle status of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupLifecycle
     */
    public Backup withLifecycle(BackupLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     *
     * @return <p>
     *         Details explaining any failures that occur when creating a
     *         backup.
     *         </p>
     */
    public BackupFailureDetails getFailureDetails() {
        return failureDetails;
    }

    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     *
     * @param failureDetails <p>
     *            Details explaining any failures that occur when creating a
     *            backup.
     *            </p>
     */
    public void setFailureDetails(BackupFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDetails <p>
     *            Details explaining any failures that occur when creating a
     *            backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withFailureDetails(BackupFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, USER_INITIATED
     *
     * @return <p>
     *         The type of the backup.
     *         </p>
     * @see BackupType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, USER_INITIATED
     *
     * @param type <p>
     *            The type of the backup.
     *            </p>
     * @see BackupType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, USER_INITIATED
     *
     * @param type <p>
     *            The type of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupType
     */
    public Backup withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, USER_INITIATED
     *
     * @param type <p>
     *            The type of the backup.
     *            </p>
     * @see BackupType
     */
    public void setType(BackupType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, USER_INITIATED
     *
     * @param type <p>
     *            The type of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupType
     */
    public Backup withType(BackupType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current percent of progress of an asynchronous task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The current percent of progress of an asynchronous task.
     *         </p>
     */
    public Integer getProgressPercent() {
        return progressPercent;
    }

    /**
     * <p>
     * The current percent of progress of an asynchronous task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param progressPercent <p>
     *            The current percent of progress of an asynchronous task.
     *            </p>
     */
    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * The current percent of progress of an asynchronous task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param progressPercent <p>
     *            The current percent of progress of an asynchronous task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
        return this;
    }

    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     *
     * @return <p>
     *         The time when a particular backup was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time when a particular backup was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when a particular backup was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * this backup of the Amazon FSx for Windows file system's data at rest.
     * Amazon FSx for Lustre does not support KMS encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     *
     * @return <p>
     *         The ID of the AWS Key Management Service (AWS KMS) key used to
     *         encrypt this backup of the Amazon FSx for Windows file system's
     *         data at rest. Amazon FSx for Lustre does not support KMS
     *         encryption.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * this backup of the Amazon FSx for Windows file system's data at rest.
     * Amazon FSx for Lustre does not support KMS encryption.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key used to
     *            encrypt this backup of the Amazon FSx for Windows file
     *            system's data at rest. Amazon FSx for Lustre does not support
     *            KMS encryption.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt
     * this backup of the Amazon FSx for Windows file system's data at rest.
     * Amazon FSx for Lustre does not support KMS encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^.{1,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS Key Management Service (AWS KMS) key used to
     *            encrypt this backup of the Amazon FSx for Windows file
     *            system's data at rest. Amazon FSx for Lustre does not support
     *            KMS encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the backup resource.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) for the backup resource.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 512<br/>
     * <b>Pattern:
     * </b>^arn:(?=[^:]+:fsx:[^:]+:\d{12}:)((|(?=[a-z0-9-.]{1,63})(?!
     * \d{1,3}(\.\d
     * {1,3}){3})(?![^:]*-{2})(?![^:]*-\.)(?![^:]*\.-)[a-z0-9].*(?<!-
     * )):){4}(?!/).{0,1024}$<br/>
     *
     * @param resourceARN <p>
     *            The Amazon Resource Name (ARN) for the backup resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     *
     * @return <p>
     *         Tags associated with a particular file system.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     *
     * @param tags <p>
     *            Tags associated with a particular file system.
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
     * Tags associated with a particular file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with a particular file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withTags(Tag... tags) {
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
     * Tags associated with a particular file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with a particular file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is
     * persisted even if the file system is deleted.
     * </p>
     *
     * @return <p>
     *         Metadata of the file system associated with the backup. This
     *         metadata is persisted even if the file system is deleted.
     *         </p>
     */
    public FileSystem getFileSystem() {
        return fileSystem;
    }

    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is
     * persisted even if the file system is deleted.
     * </p>
     *
     * @param fileSystem <p>
     *            Metadata of the file system associated with the backup. This
     *            metadata is persisted even if the file system is deleted.
     *            </p>
     */
    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is
     * persisted even if the file system is deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystem <p>
     *            Metadata of the file system associated with the backup. This
     *            metadata is persisted even if the file system is deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD) to
     * which the Windows File Server instance is joined.
     * </p>
     *
     * @return <p>
     *         The configuration of the self-managed Microsoft Active Directory
     *         (AD) to which the Windows File Server instance is joined.
     *         </p>
     */
    public ActiveDirectoryBackupAttributes getDirectoryInformation() {
        return directoryInformation;
    }

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD) to
     * which the Windows File Server instance is joined.
     * </p>
     *
     * @param directoryInformation <p>
     *            The configuration of the self-managed Microsoft Active
     *            Directory (AD) to which the Windows File Server instance is
     *            joined.
     *            </p>
     */
    public void setDirectoryInformation(ActiveDirectoryBackupAttributes directoryInformation) {
        this.directoryInformation = directoryInformation;
    }

    /**
     * <p>
     * The configuration of the self-managed Microsoft Active Directory (AD) to
     * which the Windows File Server instance is joined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directoryInformation <p>
     *            The configuration of the self-managed Microsoft Active
     *            Directory (AD) to which the Windows File Server instance is
     *            joined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withDirectoryInformation(ActiveDirectoryBackupAttributes directoryInformation) {
        this.directoryInformation = directoryInformation;
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
        if (getBackupId() != null)
            sb.append("BackupId: " + getBackupId() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: " + getProgressPercent() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getFileSystem() != null)
            sb.append("FileSystem: " + getFileSystem() + ",");
        if (getDirectoryInformation() != null)
            sb.append("DirectoryInformation: " + getDirectoryInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode
                + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFileSystem() == null) ? 0 : getFileSystem().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryInformation() == null) ? 0 : getDirectoryInformation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backup == false)
            return false;
        Backup other = (Backup) obj;

        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null
                && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null
                && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFileSystem() == null ^ this.getFileSystem() == null)
            return false;
        if (other.getFileSystem() != null
                && other.getFileSystem().equals(this.getFileSystem()) == false)
            return false;
        if (other.getDirectoryInformation() == null ^ this.getDirectoryInformation() == null)
            return false;
        if (other.getDirectoryInformation() != null
                && other.getDirectoryInformation().equals(this.getDirectoryInformation()) == false)
            return false;
        return true;
    }
}
