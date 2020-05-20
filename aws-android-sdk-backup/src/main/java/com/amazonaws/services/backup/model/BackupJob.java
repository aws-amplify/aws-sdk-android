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
 * Contains detailed information about a backup job.
 * </p>
 */
public class BackupJob implements Serializable {
    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     */
    private String backupJobId;

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
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
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
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The date and time a backup job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, PENDING, RUNNING, ABORTING, ABORTED,
     * COMPLETED, FAILED, EXPIRED
     */
    private String state;

    /**
     * <p>
     * A detailed message explaining the status of the job to back up a
     * resource.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job
     * status was queried.
     * </p>
     */
    private String percentDone;

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     */
    private Long backupSizeInBytes;

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * Contains identifying information about the creation of a backup job,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan used to create it.
     * </p>
     */
    private RecoveryPointCreator createdBy;

    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed,
     * in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>ExpectedCompletionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date expectedCompletionDate;

    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC)
     * when a backup job must be started before it is canceled. The value is
     * calculated by adding the start window to the scheduled time. So if the
     * scheduled time were 6:00 PM and the start window is 2 hours, the
     * <code>StartBy</code> time would be 8:00 PM on the date specified. The
     * value of <code>StartBy</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     */
    private java.util.Date startBy;

    /**
     * <p>
     * The type of AWS resource to be backed up; for example, an Amazon Elastic
     * Block Store (Amazon EBS) volume or an Amazon Relational Database Service
     * (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String resourceType;

    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job
     * status was queried.
     * </p>
     */
    private Long bytesTransferred;

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a request to AWS Backup to back up a
     *         resource.
     *         </p>
     */
    public String getBackupJobId() {
        return backupJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     *
     * @param backupJobId <p>
     *            Uniquely identifies a request to AWS Backup to back up a
     *            resource.
     *            </p>
     */
    public void setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupJobId <p>
     *            Uniquely identifies a request to AWS Backup to back up a
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
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
    public BackupJob withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a backup
     *         vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getBackupVaultArn() {
        return backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param backupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault;
     * for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withBackupVaultArn(String backupVaultArn) {
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
    public BackupJob withRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a resource. The format of the ARN
     *         depends on the resource type.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     *
     * @param resourceArn <p>
     *            An ARN that uniquely identifies a resource. The format of the
     *            ARN depends on the resource type.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            An ARN that uniquely identifies a resource. The format of the
     *            ARN depends on the resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The date and time a backup job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a backup job is created, in Unix format and
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
     * The date and time a backup job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time a backup job is created, in Unix format and
     *            Coordinated Universal Time (UTC). The value of
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
     * The date and time a backup job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time a backup job is created, in Unix format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>CreationDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a job to create a backup job is completed, in
     *         Unix format and Coordinated Universal Time (UTC). The value of
     *         <code>CompletionDate</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26,
     *         2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getCompletionDate() {
        return completionDate;
    }

    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param completionDate <p>
     *            The date and time a job to create a backup job is completed,
     *            in Unix format and Coordinated Universal Time (UTC). The value
     *            of <code>CompletionDate</code> is accurate to milliseconds.
     *            For example, the value 1516925490.087 represents Friday,
     *            January 26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate <p>
     *            The date and time a job to create a backup job is completed,
     *            in Unix format and Coordinated Universal Time (UTC). The value
     *            of <code>CompletionDate</code> is accurate to milliseconds.
     *            For example, the value 1516925490.087 represents Friday,
     *            January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, PENDING, RUNNING, ABORTING, ABORTED,
     * COMPLETED, FAILED, EXPIRED
     *
     * @return <p>
     *         The current state of a resource recovery point.
     *         </p>
     * @see BackupJobState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, PENDING, RUNNING, ABORTING, ABORTED,
     * COMPLETED, FAILED, EXPIRED
     *
     * @param state <p>
     *            The current state of a resource recovery point.
     *            </p>
     * @see BackupJobState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, PENDING, RUNNING, ABORTING, ABORTED,
     * COMPLETED, FAILED, EXPIRED
     *
     * @param state <p>
     *            The current state of a resource recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupJobState
     */
    public BackupJob withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, PENDING, RUNNING, ABORTING, ABORTED,
     * COMPLETED, FAILED, EXPIRED
     *
     * @param state <p>
     *            The current state of a resource recovery point.
     *            </p>
     * @see BackupJobState
     */
    public void setState(BackupJobState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, PENDING, RUNNING, ABORTING, ABORTED,
     * COMPLETED, FAILED, EXPIRED
     *
     * @param state <p>
     *            The current state of a resource recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupJobState
     */
    public BackupJob withState(BackupJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to back up a
     * resource.
     * </p>
     *
     * @return <p>
     *         A detailed message explaining the status of the job to back up a
     *         resource.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to back up a
     * resource.
     * </p>
     *
     * @param statusMessage <p>
     *            A detailed message explaining the status of the job to back up
     *            a resource.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to back up a
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A detailed message explaining the status of the job to back up
     *            a resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job
     * status was queried.
     * </p>
     *
     * @return <p>
     *         Contains an estimated percentage complete of a job at the time
     *         the job status was queried.
     *         </p>
     */
    public String getPercentDone() {
        return percentDone;
    }

    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job
     * status was queried.
     * </p>
     *
     * @param percentDone <p>
     *            Contains an estimated percentage complete of a job at the time
     *            the job status was queried.
     *            </p>
     */
    public void setPercentDone(String percentDone) {
        this.percentDone = percentDone;
    }

    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job
     * status was queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentDone <p>
     *            Contains an estimated percentage complete of a job at the time
     *            the job status was queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withPercentDone(String percentDone) {
        this.percentDone = percentDone;
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
    public Long getBackupSizeInBytes() {
        return backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     *
     * @param backupSizeInBytes <p>
     *            The size, in bytes, of a backup.
     *            </p>
     */
    public void setBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupSizeInBytes <p>
     *            The size, in bytes, of a backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
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
    public BackupJob withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a backup job,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan used to create it.
     * </p>
     *
     * @return <p>
     *         Contains identifying information about the creation of a backup
     *         job, including the <code>BackupPlanArn</code>,
     *         <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *         <code>BackupRuleId</code> of the backup plan used to create it.
     *         </p>
     */
    public RecoveryPointCreator getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a backup job,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan used to create it.
     * </p>
     *
     * @param createdBy <p>
     *            Contains identifying information about the creation of a
     *            backup job, including the <code>BackupPlanArn</code>,
     *            <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *            <code>BackupRuleId</code> of the backup plan used to create
     *            it.
     *            </p>
     */
    public void setCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a backup job,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan used to create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Contains identifying information about the creation of a
     *            backup job, including the <code>BackupPlanArn</code>,
     *            <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *            <code>BackupRuleId</code> of the backup plan used to create
     *            it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed,
     * in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>ExpectedCompletionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a job to back up resources is expected to be
     *         completed, in Unix format and Coordinated Universal Time (UTC).
     *         The value of <code>ExpectedCompletionDate</code> is accurate to
     *         milliseconds. For example, the value 1516925490.087 represents
     *         Friday, January 26, 2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getExpectedCompletionDate() {
        return expectedCompletionDate;
    }

    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed,
     * in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>ExpectedCompletionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @param expectedCompletionDate <p>
     *            The date and time a job to back up resources is expected to be
     *            completed, in Unix format and Coordinated Universal Time
     *            (UTC). The value of <code>ExpectedCompletionDate</code> is
     *            accurate to milliseconds. For example, the value
     *            1516925490.087 represents Friday, January 26, 2018
     *            12:11:30.087 AM.
     *            </p>
     */
    public void setExpectedCompletionDate(java.util.Date expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
    }

    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed,
     * in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>ExpectedCompletionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedCompletionDate <p>
     *            The date and time a job to back up resources is expected to be
     *            completed, in Unix format and Coordinated Universal Time
     *            (UTC). The value of <code>ExpectedCompletionDate</code> is
     *            accurate to milliseconds. For example, the value
     *            1516925490.087 represents Friday, January 26, 2018
     *            12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withExpectedCompletionDate(java.util.Date expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
        return this;
    }

    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC)
     * when a backup job must be started before it is canceled. The value is
     * calculated by adding the start window to the scheduled time. So if the
     * scheduled time were 6:00 PM and the start window is 2 hours, the
     * <code>StartBy</code> time would be 8:00 PM on the date specified. The
     * value of <code>StartBy</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     *
     * @return <p>
     *         Specifies the time in Unix format and Coordinated Universal Time
     *         (UTC) when a backup job must be started before it is canceled.
     *         The value is calculated by adding the start window to the
     *         scheduled time. So if the scheduled time were 6:00 PM and the
     *         start window is 2 hours, the <code>StartBy</code> time would be
     *         8:00 PM on the date specified. The value of <code>StartBy</code>
     *         is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     *         AM.
     *         </p>
     */
    public java.util.Date getStartBy() {
        return startBy;
    }

    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC)
     * when a backup job must be started before it is canceled. The value is
     * calculated by adding the start window to the scheduled time. So if the
     * scheduled time were 6:00 PM and the start window is 2 hours, the
     * <code>StartBy</code> time would be 8:00 PM on the date specified. The
     * value of <code>StartBy</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     *
     * @param startBy <p>
     *            Specifies the time in Unix format and Coordinated Universal
     *            Time (UTC) when a backup job must be started before it is
     *            canceled. The value is calculated by adding the start window
     *            to the scheduled time. So if the scheduled time were 6:00 PM
     *            and the start window is 2 hours, the <code>StartBy</code> time
     *            would be 8:00 PM on the date specified. The value of
     *            <code>StartBy</code> is accurate to milliseconds. For example,
     *            the value 1516925490.087 represents Friday, January 26, 2018
     *            12:11:30.087 AM.
     *            </p>
     */
    public void setStartBy(java.util.Date startBy) {
        this.startBy = startBy;
    }

    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC)
     * when a backup job must be started before it is canceled. The value is
     * calculated by adding the start window to the scheduled time. So if the
     * scheduled time were 6:00 PM and the start window is 2 hours, the
     * <code>StartBy</code> time would be 8:00 PM on the date specified. The
     * value of <code>StartBy</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startBy <p>
     *            Specifies the time in Unix format and Coordinated Universal
     *            Time (UTC) when a backup job must be started before it is
     *            canceled. The value is calculated by adding the start window
     *            to the scheduled time. So if the scheduled time were 6:00 PM
     *            and the start window is 2 hours, the <code>StartBy</code> time
     *            would be 8:00 PM on the date specified. The value of
     *            <code>StartBy</code> is accurate to milliseconds. For example,
     *            the value 1516925490.087 represents Friday, January 26, 2018
     *            12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withStartBy(java.util.Date startBy) {
        this.startBy = startBy;
        return this;
    }

    /**
     * <p>
     * The type of AWS resource to be backed up; for example, an Amazon Elastic
     * Block Store (Amazon EBS) volume or an Amazon Relational Database Service
     * (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The type of AWS resource to be backed up; for example, an Amazon
     *         Elastic Block Store (Amazon EBS) volume or an Amazon Relational
     *         Database Service (Amazon RDS) database.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be backed up; for example, an Amazon Elastic
     * Block Store (Amazon EBS) volume or an Amazon Relational Database Service
     * (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            The type of AWS resource to be backed up; for example, an
     *            Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     *            Relational Database Service (Amazon RDS) database.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be backed up; for example, an Amazon Elastic
     * Block Store (Amazon EBS) volume or an Amazon Relational Database Service
     * (Amazon RDS) database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            The type of AWS resource to be backed up; for example, an
     *            Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     *            Relational Database Service (Amazon RDS) database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job
     * status was queried.
     * </p>
     *
     * @return <p>
     *         The size in bytes transferred to a backup vault at the time that
     *         the job status was queried.
     *         </p>
     */
    public Long getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job
     * status was queried.
     * </p>
     *
     * @param bytesTransferred <p>
     *            The size in bytes transferred to a backup vault at the time
     *            that the job status was queried.
     *            </p>
     */
    public void setBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job
     * status was queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bytesTransferred <p>
     *            The size in bytes transferred to a backup vault at the time
     *            that the job status was queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupJob withBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
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
        if (getBackupJobId() != null)
            sb.append("BackupJobId: " + getBackupJobId() + ",");
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: " + getBackupVaultName() + ",");
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: " + getBackupVaultArn() + ",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: " + getRecoveryPointArn() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: " + getCompletionDate() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getPercentDone() != null)
            sb.append("PercentDone: " + getPercentDone() + ",");
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: " + getBackupSizeInBytes() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getExpectedCompletionDate() != null)
            sb.append("ExpectedCompletionDate: " + getExpectedCompletionDate() + ",");
        if (getStartBy() != null)
            sb.append("StartBy: " + getStartBy() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getBytesTransferred() != null)
            sb.append("BytesTransferred: " + getBytesTransferred());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupJobId() == null) ? 0 : getBackupJobId().hashCode());
        hashCode = prime * hashCode
                + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode
                + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode
                + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getPercentDone() == null) ? 0 : getPercentDone().hashCode());
        hashCode = prime * hashCode
                + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpectedCompletionDate() == null) ? 0 : getExpectedCompletionDate()
                        .hashCode());
        hashCode = prime * hashCode + ((getStartBy() == null) ? 0 : getStartBy().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getBytesTransferred() == null) ? 0 : getBytesTransferred().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupJob == false)
            return false;
        BackupJob other = (BackupJob) obj;

        if (other.getBackupJobId() == null ^ this.getBackupJobId() == null)
            return false;
        if (other.getBackupJobId() != null
                && other.getBackupJobId().equals(this.getBackupJobId()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null
                && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
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
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null
                && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getPercentDone() == null ^ this.getPercentDone() == null)
            return false;
        if (other.getPercentDone() != null
                && other.getPercentDone().equals(this.getPercentDone()) == false)
            return false;
        if (other.getBackupSizeInBytes() == null ^ this.getBackupSizeInBytes() == null)
            return false;
        if (other.getBackupSizeInBytes() != null
                && other.getBackupSizeInBytes().equals(this.getBackupSizeInBytes()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null
                && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getExpectedCompletionDate() == null ^ this.getExpectedCompletionDate() == null)
            return false;
        if (other.getExpectedCompletionDate() != null
                && other.getExpectedCompletionDate().equals(this.getExpectedCompletionDate()) == false)
            return false;
        if (other.getStartBy() == null ^ this.getStartBy() == null)
            return false;
        if (other.getStartBy() != null && other.getStartBy().equals(this.getStartBy()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getBytesTransferred() == null ^ this.getBytesTransferred() == null)
            return false;
        if (other.getBytesTransferred() != null
                && other.getBytesTransferred().equals(this.getBytesTransferred()) == false)
            return false;
        return true;
    }
}
