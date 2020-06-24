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
 * Starts a job to create a one-time backup of the specified resource.
 * </p>
 */
public class StartBackupJobRequest extends AmazonWebServiceRequest implements Serializable {
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
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The
     * format of the ARN depends on the resource type.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartBackupJob</code>.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     */
    private Long startWindowMinutes;

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     */
    private Long completeWindowMinutes;

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup will transition and expire
     * backups automatically according to the lifecycle that you define.
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
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> recoveryPointTags;

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
    public StartBackupJobRequest withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The
     * format of the ARN depends on the resource type.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a
     *         resource. The format of the ARN depends on the resource type.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The
     * format of the ARN depends on the resource type.
     * </p>
     *
     * @param resourceArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            resource. The format of the ARN depends on the resource type.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The
     * format of the ARN depends on the resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            resource. The format of the ARN depends on the resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBackupJobRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the IAM role ARN used to create the target recovery
     *         point; for example,
     *         <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     *
     * @param iamRoleArn <p>
     *            Specifies the IAM role ARN used to create the target recovery
     *            point; for example,
     *            <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoleArn <p>
     *            Specifies the IAM role ARN used to create the target recovery
     *            point; for example,
     *            <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBackupJobRequest withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartBackupJob</code>.
     * </p>
     *
     * @return <p>
     *         A customer chosen string that can be used to distinguish between
     *         calls to <code>StartBackupJob</code>.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartBackupJob</code>.
     * </p>
     *
     * @param idempotencyToken <p>
     *            A customer chosen string that can be used to distinguish
     *            between calls to <code>StartBackupJob</code>.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to
     * <code>StartBackupJob</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idempotencyToken <p>
     *            A customer chosen string that can be used to distinguish
     *            between calls to <code>StartBackupJob</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBackupJobRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
        return this;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     *
     * @return <p>
     *         A value in minutes after a backup is scheduled before a job will
     *         be canceled if it doesn't start successfully. This value is
     *         optional.
     *         </p>
     */
    public Long getStartWindowMinutes() {
        return startWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     *
     * @param startWindowMinutes <p>
     *            A value in minutes after a backup is scheduled before a job
     *            will be canceled if it doesn't start successfully. This value
     *            is optional.
     *            </p>
     */
    public void setStartWindowMinutes(Long startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be
     * canceled if it doesn't start successfully. This value is optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startWindowMinutes <p>
     *            A value in minutes after a backup is scheduled before a job
     *            will be canceled if it doesn't start successfully. This value
     *            is optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBackupJobRequest withStartWindowMinutes(Long startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
        return this;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     *
     * @return <p>
     *         A value in minutes after a backup job is successfully started
     *         before it must be completed or it will be canceled by AWS Backup.
     *         This value is optional.
     *         </p>
     */
    public Long getCompleteWindowMinutes() {
        return completeWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     *
     * @param completeWindowMinutes <p>
     *            A value in minutes after a backup job is successfully started
     *            before it must be completed or it will be canceled by AWS
     *            Backup. This value is optional.
     *            </p>
     */
    public void setCompleteWindowMinutes(Long completeWindowMinutes) {
        this.completeWindowMinutes = completeWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it
     * must be completed or it will be canceled by AWS Backup. This value is
     * optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completeWindowMinutes <p>
     *            A value in minutes after a backup job is successfully started
     *            before it must be completed or it will be canceled by AWS
     *            Backup. This value is optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBackupJobRequest withCompleteWindowMinutes(Long completeWindowMinutes) {
        this.completeWindowMinutes = completeWindowMinutes;
        return this;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold
     * storage and when it expires. AWS Backup will transition and expire
     * backups automatically according to the lifecycle that you define.
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
     *         to cold storage and when it expires. AWS Backup will transition
     *         and expire backups automatically according to the lifecycle that
     *         you define.
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
     * storage and when it expires. AWS Backup will transition and expire
     * backups automatically according to the lifecycle that you define.
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
     *            will transition and expire backups automatically according to
     *            the lifecycle that you define.
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
     * storage and when it expires. AWS Backup will transition and expire
     * backups automatically according to the lifecycle that you define.
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
     *            will transition and expire backups automatically according to
     *            the lifecycle that you define.
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
    public StartBackupJobRequest withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair.
     * </p>
     *
     * @return <p>
     *         To help organize your resources, you can assign your own metadata
     *         to the resources that you create. Each tag is a key-value pair.
     *         </p>
     */
    public java.util.Map<String, String> getRecoveryPointTags() {
        return recoveryPointTags;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair.
     * </p>
     *
     * @param recoveryPointTags <p>
     *            To help organize your resources, you can assign your own
     *            metadata to the resources that you create. Each tag is a
     *            key-value pair.
     *            </p>
     */
    public void setRecoveryPointTags(java.util.Map<String, String> recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryPointTags <p>
     *            To help organize your resources, you can assign your own
     *            metadata to the resources that you create. Each tag is a
     *            key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBackupJobRequest withRecoveryPointTags(
            java.util.Map<String, String> recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
        return this;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair.
     * </p>
     * <p>
     * The method adds a new key-value pair into RecoveryPointTags parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into RecoveryPointTags.
     * @param value The corresponding value of the entry to be added into
     *            RecoveryPointTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartBackupJobRequest addRecoveryPointTagsEntry(String key, String value) {
        if (null == this.recoveryPointTags) {
            this.recoveryPointTags = new java.util.HashMap<String, String>();
        }
        if (this.recoveryPointTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.recoveryPointTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RecoveryPointTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StartBackupJobRequest clearRecoveryPointTagsEntries() {
        this.recoveryPointTags = null;
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: " + getBackupVaultName() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken() + ",");
        if (getStartWindowMinutes() != null)
            sb.append("StartWindowMinutes: " + getStartWindowMinutes() + ",");
        if (getCompleteWindowMinutes() != null)
            sb.append("CompleteWindowMinutes: " + getCompleteWindowMinutes() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getRecoveryPointTags() != null)
            sb.append("RecoveryPointTags: " + getRecoveryPointTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode
                + ((getStartWindowMinutes() == null) ? 0 : getStartWindowMinutes().hashCode());
        hashCode = prime
                * hashCode
                + ((getCompleteWindowMinutes() == null) ? 0 : getCompleteWindowMinutes().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode
                + ((getRecoveryPointTags() == null) ? 0 : getRecoveryPointTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBackupJobRequest == false)
            return false;
        StartBackupJobRequest other = (StartBackupJobRequest) obj;

        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null
                && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
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
        if (other.getStartWindowMinutes() == null ^ this.getStartWindowMinutes() == null)
            return false;
        if (other.getStartWindowMinutes() != null
                && other.getStartWindowMinutes().equals(this.getStartWindowMinutes()) == false)
            return false;
        if (other.getCompleteWindowMinutes() == null ^ this.getCompleteWindowMinutes() == null)
            return false;
        if (other.getCompleteWindowMinutes() != null
                && other.getCompleteWindowMinutes().equals(this.getCompleteWindowMinutes()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getRecoveryPointTags() == null ^ this.getRecoveryPointTags() == null)
            return false;
        if (other.getRecoveryPointTags() != null
                && other.getRecoveryPointTags().equals(this.getRecoveryPointTags()) == false)
            return false;
        return true;
    }
}
