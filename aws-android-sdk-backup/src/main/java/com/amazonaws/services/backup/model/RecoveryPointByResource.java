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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

/**
 * <p>
 * Contains detailed information about a saved recovery point.
 * </p>
 */
public class RecoveryPointByResource implements Serializable {
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     */
    private String recoveryPointArn;

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, PARTIAL, DELETING, EXPIRED
     */
    private String status;

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     */
    private String encryptionKeyArn;

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     */
    private Long backupSizeBytes;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String backupVaultName;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a recovery
     *         point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *         .
     *         </p>
     */
    public String getRecoveryPointArn() {
        return recoveryPointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @param recoveryPointArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            recovery point; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     */
    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryPointArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            recovery point; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByResource withRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
        return this;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a recovery point is created, in Unix format and
     *         Coordinated Universal Time (UTC). The value of
     *         <code>CreationDate</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26,
     *         2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time a recovery point is created, in Unix format
     *            and Coordinated Universal Time (UTC). The value of
     *            <code>CreationDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time a recovery point is created, in Unix format
     *            and Coordinated Universal Time (UTC). The value of
     *            <code>CreationDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByResource withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, PARTIAL, DELETING, EXPIRED
     *
     * @return <p>
     *         A status code specifying the state of the recovery point.
     *         </p>
     * @see RecoveryPointStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, PARTIAL, DELETING, EXPIRED
     *
     * @param status <p>
     *            A status code specifying the state of the recovery point.
     *            </p>
     * @see RecoveryPointStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, PARTIAL, DELETING, EXPIRED
     *
     * @param status <p>
     *            A status code specifying the state of the recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecoveryPointStatus
     */
    public RecoveryPointByResource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, PARTIAL, DELETING, EXPIRED
     *
     * @param status <p>
     *            A status code specifying the state of the recovery point.
     *            </p>
     * @see RecoveryPointStatus
     */
    public void setStatus(RecoveryPointStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, PARTIAL, DELETING, EXPIRED
     *
     * @param status <p>
     *            A status code specifying the state of the recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecoveryPointStatus
     */
    public RecoveryPointByResource withStatus(RecoveryPointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     *
     * @return <p>
     *         The server-side encryption key that is used to protect your
     *         backups; for example,
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         .
     *         </p>
     */
    public String getEncryptionKeyArn() {
        return encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     *
     * @param encryptionKeyArn <p>
     *            The server-side encryption key that is used to protect your
     *            backups; for example,
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     */
    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionKeyArn <p>
     *            The server-side encryption key that is used to protect your
     *            backups; for example,
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByResource withEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     *
     * @return <p>
     *         The size, in bytes, of a backup.
     *         </p>
     */
    public Long getBackupSizeBytes() {
        return backupSizeBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     *
     * @param backupSizeBytes <p>
     *            The size, in bytes, of a backup.
     *            </p>
     */
    public void setBackupSizeBytes(Long backupSizeBytes) {
        this.backupSizeBytes = backupSizeBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupSizeBytes <p>
     *            The size, in bytes, of a backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByResource withBackupSizeBytes(Long backupSizeBytes) {
        this.backupSizeBytes = backupSizeBytes;
        return this;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The name of a logical container where backups are stored. Backup
     *         vaults are identified by names that are unique to the account
     *         used to create them and the AWS Region where they are created.
     *         They consist of lowercase letters, numbers, and hyphens.
     *         </p>
     */
    public String getBackupVaultName() {
        return backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param backupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     */
    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param backupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByResource withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
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
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: " + getRecoveryPointArn() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: " + getEncryptionKeyArn() + ",");
        if (getBackupSizeBytes() != null)
            sb.append("BackupSizeBytes: " + getBackupSizeBytes() + ",");
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: " + getBackupVaultName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode
                + ((getBackupSizeBytes() == null) ? 0 : getBackupSizeBytes().hashCode());
        hashCode = prime * hashCode
                + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPointByResource == false)
            return false;
        RecoveryPointByResource other = (RecoveryPointByResource) obj;

        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null
                && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null
                && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getBackupSizeBytes() == null ^ this.getBackupSizeBytes() == null)
            return false;
        if (other.getBackupSizeBytes() != null
                && other.getBackupSizeBytes().equals(this.getBackupSizeBytes()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null
                && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        return true;
    }
}
