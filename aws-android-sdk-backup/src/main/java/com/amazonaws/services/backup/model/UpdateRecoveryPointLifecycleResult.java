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

public class UpdateRecoveryPointLifecycleResult implements Serializable {
    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;

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
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     */
    private Lifecycle lifecycle;

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing
     * <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps.
     * </p>
     */
    private CalculatedLifecycle calculatedLifecycle;

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
    public UpdateRecoveryPointLifecycleResult withBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
        return this;
    }

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
    public UpdateRecoveryPointLifecycleResult withRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
        return this;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     *
     * @return <p>
     *         The lifecycle defines when a protected resource is transitioned
     *         to cold storage and when it expires. AWS Backup transitions and
     *         expires backups automatically according to the lifecycle that you
     *         define.
     *         </p>
     *         <p>
     *         Backups transitioned to cold storage must be stored in cold
     *         storage for a minimum of 90 days. Therefore, the “expire after
     *         days” setting must be 90 days greater than the “transition to
     *         cold after days” setting. The “transition to cold after days”
     *         setting cannot be changed after a backup has been transitioned to
     *         cold.
     *         </p>
     */
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     *
     * @param lifecycle <p>
     *            The lifecycle defines when a protected resource is
     *            transitioned to cold storage and when it expires. AWS Backup
     *            transitions and expires backups automatically according to the
     *            lifecycle that you define.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, the “expire after
     *            days” setting must be 90 days greater than the “transition to
     *            cold after days” setting. The “transition to cold after days”
     *            setting cannot be changed after a backup has been transitioned
     *            to cold.
     *            </p>
     */
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup transitions and expires backups
     * automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, the “expire after days” setting must be 90
     * days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup
     * has been transitioned to cold.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycle <p>
     *            The lifecycle defines when a protected resource is
     *            transitioned to cold storage and when it expires. AWS Backup
     *            transitions and expires backups automatically according to the
     *            lifecycle that you define.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, the “expire after
     *            days” setting must be 90 days greater than the “transition to
     *            cold after days” setting. The “transition to cold after days”
     *            setting cannot be changed after a backup has been transitioned
     *            to cold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRecoveryPointLifecycleResult withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing
     * <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps.
     * </p>
     *
     * @return <p>
     *         A <code>CalculatedLifecycle</code> object containing
     *         <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     *         timestamps.
     *         </p>
     */
    public CalculatedLifecycle getCalculatedLifecycle() {
        return calculatedLifecycle;
    }

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing
     * <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps.
     * </p>
     *
     * @param calculatedLifecycle <p>
     *            A <code>CalculatedLifecycle</code> object containing
     *            <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     *            timestamps.
     *            </p>
     */
    public void setCalculatedLifecycle(CalculatedLifecycle calculatedLifecycle) {
        this.calculatedLifecycle = calculatedLifecycle;
    }

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing
     * <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param calculatedLifecycle <p>
     *            A <code>CalculatedLifecycle</code> object containing
     *            <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     *            timestamps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRecoveryPointLifecycleResult withCalculatedLifecycle(
            CalculatedLifecycle calculatedLifecycle) {
        this.calculatedLifecycle = calculatedLifecycle;
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getCalculatedLifecycle() != null)
            sb.append("CalculatedLifecycle: " + getCalculatedLifecycle());
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
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode
                + ((getCalculatedLifecycle() == null) ? 0 : getCalculatedLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecoveryPointLifecycleResult == false)
            return false;
        UpdateRecoveryPointLifecycleResult other = (UpdateRecoveryPointLifecycleResult) obj;

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
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getCalculatedLifecycle() == null ^ this.getCalculatedLifecycle() == null)
            return false;
        if (other.getCalculatedLifecycle() != null
                && other.getCalculatedLifecycle().equals(this.getCalculatedLifecycle()) == false)
            return false;
        return true;
    }
}
