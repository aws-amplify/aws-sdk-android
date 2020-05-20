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

public class GetRecoveryPointRestoreMetadataResult implements Serializable {
    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     */
    private String recoveryPointArn;

    /**
     * <p>
     * The set of metadata key-value pairs that describes the original
     * configuration of the backed-up resource. These values vary depending on
     * the service that is being restored.
     * </p>
     */
    private java.util.Map<String, String> restoreMetadata;

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a backup vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getBackupVaultArn() {
        return backupVaultArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param backupVaultArn <p>
     *            An ARN that uniquely identifies a backup vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupVaultArn <p>
     *            An ARN that uniquely identifies a backup vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecoveryPointRestoreMetadataResult withBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a recovery point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *         .
     *         </p>
     */
    public String getRecoveryPointArn() {
        return recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @param recoveryPointArn <p>
     *            An ARN that uniquely identifies a recovery point; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     */
    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryPointArn <p>
     *            An ARN that uniquely identifies a recovery point; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecoveryPointRestoreMetadataResult withRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
        return this;
    }

    /**
     * <p>
     * The set of metadata key-value pairs that describes the original
     * configuration of the backed-up resource. These values vary depending on
     * the service that is being restored.
     * </p>
     *
     * @return <p>
     *         The set of metadata key-value pairs that describes the original
     *         configuration of the backed-up resource. These values vary
     *         depending on the service that is being restored.
     *         </p>
     */
    public java.util.Map<String, String> getRestoreMetadata() {
        return restoreMetadata;
    }

    /**
     * <p>
     * The set of metadata key-value pairs that describes the original
     * configuration of the backed-up resource. These values vary depending on
     * the service that is being restored.
     * </p>
     *
     * @param restoreMetadata <p>
     *            The set of metadata key-value pairs that describes the
     *            original configuration of the backed-up resource. These values
     *            vary depending on the service that is being restored.
     *            </p>
     */
    public void setRestoreMetadata(java.util.Map<String, String> restoreMetadata) {
        this.restoreMetadata = restoreMetadata;
    }

    /**
     * <p>
     * The set of metadata key-value pairs that describes the original
     * configuration of the backed-up resource. These values vary depending on
     * the service that is being restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreMetadata <p>
     *            The set of metadata key-value pairs that describes the
     *            original configuration of the backed-up resource. These values
     *            vary depending on the service that is being restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecoveryPointRestoreMetadataResult withRestoreMetadata(
            java.util.Map<String, String> restoreMetadata) {
        this.restoreMetadata = restoreMetadata;
        return this;
    }

    /**
     * <p>
     * The set of metadata key-value pairs that describes the original
     * configuration of the backed-up resource. These values vary depending on
     * the service that is being restored.
     * </p>
     * <p>
     * The method adds a new key-value pair into RestoreMetadata parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into RestoreMetadata.
     * @param value The corresponding value of the entry to be added into
     *            RestoreMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecoveryPointRestoreMetadataResult addRestoreMetadataEntry(String key, String value) {
        if (null == this.restoreMetadata) {
            this.restoreMetadata = new java.util.HashMap<String, String>();
        }
        if (this.restoreMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.restoreMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RestoreMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetRecoveryPointRestoreMetadataResult clearRestoreMetadataEntries() {
        this.restoreMetadata = null;
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
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: " + getBackupVaultArn() + ",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: " + getRecoveryPointArn() + ",");
        if (getRestoreMetadata() != null)
            sb.append("RestoreMetadata: " + getRestoreMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode
                + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreMetadata() == null) ? 0 : getRestoreMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecoveryPointRestoreMetadataResult == false)
            return false;
        GetRecoveryPointRestoreMetadataResult other = (GetRecoveryPointRestoreMetadataResult) obj;

        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null
                && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null
                && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getRestoreMetadata() == null ^ this.getRestoreMetadata() == null)
            return false;
        if (other.getRestoreMetadata() != null
                && other.getRestoreMetadata().equals(this.getRestoreMetadata()) == false)
            return false;
        return true;
    }
}
