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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a job to create a one-time copy of the specified resource.
 * </p>
 */
public class StartCopyJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job;
     * for example, arn:aws:backup:us-east-1:123456789012:recovery-point:
     * 1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     */
    private String recoveryPointArn;

    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup
     * vaults are identified by names that are unique to the account used to
     * create them and the AWS Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String sourceBackupVaultName;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination
     * backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String destinationBackupVaultArn;

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartCopyJob</code>.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     */
    private Lifecycle lifecycle;

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job;
     * for example, arn:aws:backup:us-east-1:123456789012:recovery-point:
     * 1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a recovery point to use for the
     *         copy job; for example,
     *         arn:aws:backup:us-east-1:123456789012:recovery
     *         -point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     *         </p>
     */
    public String getRecoveryPointArn() {
        return recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job;
     * for example, arn:aws:backup:us-east-1:123456789012:recovery-point:
     * 1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     *
     * @param recoveryPointArn <p>
     *            An ARN that uniquely identifies a recovery point to use for
     *            the copy job; for example,
     *            arn:aws:backup:us-east-1:123456789012
     *            :recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     *            </p>
     */
    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job;
     * for example, arn:aws:backup:us-east-1:123456789012:recovery-point:
     * 1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryPointArn <p>
     *            An ARN that uniquely identifies a recovery point to use for
     *            the copy job; for example,
     *            arn:aws:backup:us-east-1:123456789012
     *            :recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCopyJobRequest withRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
        return this;
    }

    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup
     * vaults are identified by names that are unique to the account used to
     * create them and the AWS Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The name of a logical source container where backups are stored.
     *         Backup vaults are identified by names that are unique to the
     *         account used to create them and the AWS Region where they are
     *         created. They consist of lowercase letters, numbers, and hyphens.
     *         </p>
     */
    public String getSourceBackupVaultName() {
        return sourceBackupVaultName;
    }

    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup
     * vaults are identified by names that are unique to the account used to
     * create them and the AWS Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param sourceBackupVaultName <p>
     *            The name of a logical source container where backups are
     *            stored. Backup vaults are identified by names that are unique
     *            to the account used to create them and the AWS Region where
     *            they are created. They consist of lowercase letters, numbers,
     *            and hyphens.
     *            </p>
     */
    public void setSourceBackupVaultName(String sourceBackupVaultName) {
        this.sourceBackupVaultName = sourceBackupVaultName;
    }

    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup
     * vaults are identified by names that are unique to the account used to
     * create them and the AWS Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param sourceBackupVaultName <p>
     *            The name of a logical source container where backups are
     *            stored. Backup vaults are identified by names that are unique
     *            to the account used to create them and the AWS Region where
     *            they are created. They consist of lowercase letters, numbers,
     *            and hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCopyJobRequest withSourceBackupVaultName(String sourceBackupVaultName) {
        this.sourceBackupVaultName = sourceBackupVaultName;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination
     * backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a
     *         destination backup vault to copy to; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getDestinationBackupVaultArn() {
        return destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination
     * backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param destinationBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            destination backup vault to copy to; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination
     * backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            destination backup vault to copy to; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCopyJobRequest withDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the IAM role ARN used to copy the target recovery
     *         point; for example,
     *         <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     *
     * @param iamRoleArn <p>
     *            Specifies the IAM role ARN used to copy the target recovery
     *            point; for example,
     *            <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoleArn <p>
     *            Specifies the IAM role ARN used to copy the target recovery
     *            point; for example,
     *            <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCopyJobRequest withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartCopyJob</code>.
     * </p>
     *
     * @return <p>
     *         A customer chosen string that can be used to distinguish between
     *         calls to <code>StartCopyJob</code>.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartCopyJob</code>.
     * </p>
     *
     * @param idempotencyToken <p>
     *            A customer chosen string that can be used to distinguish
     *            between calls to <code>StartCopyJob</code>.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartCopyJob</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idempotencyToken <p>
     *            A customer chosen string that can be used to distinguish
     *            between calls to <code>StartCopyJob</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCopyJobRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
        return this;
    }

    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     *
     * @return <p>
     *         Contains an array of <code>Transition</code> objects specifying
     *         how long in days before a recovery point transitions to cold
     *         storage or is deleted.
     *         </p>
     *         <p>
     *         Backups transitioned to cold storage must be stored in cold
     *         storage for a minimum of 90 days. Therefore, on the console, the
     *         “expire after days” setting must be 90 days greater than the
     *         “transition to cold after days” setting. The “transition to cold
     *         after days” setting cannot be changed after a backup has been
     *         transitioned to cold.
     *         </p>
     */
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     *
     * @param lifecycle <p>
     *            Contains an array of <code>Transition</code> objects
     *            specifying how long in days before a recovery point
     *            transitions to cold storage or is deleted.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, on the console,
     *            the “expire after days” setting must be 90 days greater than
     *            the “transition to cold after days” setting. The “transition
     *            to cold after days” setting cannot be changed after a backup
     *            has been transitioned to cold.
     *            </p>
     */
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycle <p>
     *            Contains an array of <code>Transition</code> objects
     *            specifying how long in days before a recovery point
     *            transitions to cold storage or is deleted.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, on the console,
     *            the “expire after days” setting must be 90 days greater than
     *            the “transition to cold after days” setting. The “transition
     *            to cold after days” setting cannot be changed after a backup
     *            has been transitioned to cold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCopyJobRequest withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
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
        if (getSourceBackupVaultName() != null)
            sb.append("SourceBackupVaultName: " + getSourceBackupVaultName() + ",");
        if (getDestinationBackupVaultArn() != null)
            sb.append("DestinationBackupVaultArn: " + getDestinationBackupVaultArn() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceBackupVaultName() == null) ? 0 : getSourceBackupVaultName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationBackupVaultArn() == null) ? 0 : getDestinationBackupVaultArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCopyJobRequest == false)
            return false;
        StartCopyJobRequest other = (StartCopyJobRequest) obj;

        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null
                && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getSourceBackupVaultName() == null ^ this.getSourceBackupVaultName() == null)
            return false;
        if (other.getSourceBackupVaultName() != null
                && other.getSourceBackupVaultName().equals(this.getSourceBackupVaultName()) == false)
            return false;
        if (other.getDestinationBackupVaultArn() == null
                ^ this.getDestinationBackupVaultArn() == null)
            return false;
        if (other.getDestinationBackupVaultArn() != null
                && other.getDestinationBackupVaultArn().equals(this.getDestinationBackupVaultArn()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null
                && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }
}
