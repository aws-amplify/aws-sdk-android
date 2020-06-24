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

public class DescribeRestoreJobResult implements Serializable {
    /**
     * <p>
     * Returns the account ID that owns the restore job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     */
    private String restoreJobId;

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
     * The date and time that a restore job is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time that a job to restore a recovery point is completed, in
     * Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;

    /**
     * <p>
     * Status code specifying the state of the job that is initiated by AWS
     * Backup to restore a recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     */
    private String status;

    /**
     * <p>
     * A message showing the status of a job to restore a recovery point.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Contains an estimated percentage that is complete of a job at the time
     * the job status was queried.
     * </p>
     */
    private String percentDone;

    /**
     * <p>
     * The size, in bytes, of the restored resource.
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
     * The amount of time in minutes that a job restoring a recovery point is
     * expected to take.
     * </p>
     */
    private Long expectedCompletionTimeMinutes;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource whose
     * recovery point is being restored. The format of the ARN depends on the
     * resource type of the backed-up resource.
     * </p>
     */
    private String createdResourceArn;

    /**
     * <p>
     * Returns metadata associated with a restore job listed by resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String resourceType;

    /**
     * <p>
     * Returns the account ID that owns the restore job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         Returns the account ID that owns the restore job.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * Returns the account ID that owns the restore job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param accountId <p>
     *            Returns the account ID that owns the restore job.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Returns the account ID that owns the restore job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param accountId <p>
     *            Returns the account ID that owns the restore job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies the job that restores a recovery point.
     *         </p>
     */
    public String getRestoreJobId() {
        return restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     *
     * @param restoreJobId <p>
     *            Uniquely identifies the job that restores a recovery point.
     *            </p>
     */
    public void setRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreJobId <p>
     *            Uniquely identifies the job that restores a recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
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
    public DescribeRestoreJobResult withRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
        return this;
    }

    /**
     * <p>
     * The date and time that a restore job is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time that a restore job is created, in Unix format
     *         and Coordinated Universal Time (UTC). The value of
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
     * The date and time that a restore job is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time that a restore job is created, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
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
     * The date and time that a restore job is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time that a restore job is created, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>CreationDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time that a job to restore a recovery point is completed, in
     * Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time that a job to restore a recovery point is
     *         completed, in Unix format and Coordinated Universal Time (UTC).
     *         The value of <code>CompletionDate</code> is accurate to
     *         milliseconds. For example, the value 1516925490.087 represents
     *         Friday, January 26, 2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getCompletionDate() {
        return completionDate;
    }

    /**
     * <p>
     * The date and time that a job to restore a recovery point is completed, in
     * Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param completionDate <p>
     *            The date and time that a job to restore a recovery point is
     *            completed, in Unix format and Coordinated Universal Time
     *            (UTC). The value of <code>CompletionDate</code> is accurate to
     *            milliseconds. For example, the value 1516925490.087 represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time that a job to restore a recovery point is completed, in
     * Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate <p>
     *            The date and time that a job to restore a recovery point is
     *            completed, in Unix format and Coordinated Universal Time
     *            (UTC). The value of <code>CompletionDate</code> is accurate to
     *            milliseconds. For example, the value 1516925490.087 represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * <p>
     * Status code specifying the state of the job that is initiated by AWS
     * Backup to restore a recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @return <p>
     *         Status code specifying the state of the job that is initiated by
     *         AWS Backup to restore a recovery point.
     *         </p>
     * @see RestoreJobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status code specifying the state of the job that is initiated by AWS
     * Backup to restore a recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param status <p>
     *            Status code specifying the state of the job that is initiated
     *            by AWS Backup to restore a recovery point.
     *            </p>
     * @see RestoreJobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status code specifying the state of the job that is initiated by AWS
     * Backup to restore a recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param status <p>
     *            Status code specifying the state of the job that is initiated
     *            by AWS Backup to restore a recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RestoreJobStatus
     */
    public DescribeRestoreJobResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status code specifying the state of the job that is initiated by AWS
     * Backup to restore a recovery point.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param status <p>
     *            Status code specifying the state of the job that is initiated
     *            by AWS Backup to restore a recovery point.
     *            </p>
     * @see RestoreJobStatus
     */
    public void setStatus(RestoreJobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status code specifying the state of the job that is initiated by AWS
     * Backup to restore a recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, ABORTED, FAILED
     *
     * @param status <p>
     *            Status code specifying the state of the job that is initiated
     *            by AWS Backup to restore a recovery point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RestoreJobStatus
     */
    public DescribeRestoreJobResult withStatus(RestoreJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message showing the status of a job to restore a recovery point.
     * </p>
     *
     * @return <p>
     *         A message showing the status of a job to restore a recovery
     *         point.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A message showing the status of a job to restore a recovery point.
     * </p>
     *
     * @param statusMessage <p>
     *            A message showing the status of a job to restore a recovery
     *            point.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message showing the status of a job to restore a recovery point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A message showing the status of a job to restore a recovery
     *            point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Contains an estimated percentage that is complete of a job at the time
     * the job status was queried.
     * </p>
     *
     * @return <p>
     *         Contains an estimated percentage that is complete of a job at the
     *         time the job status was queried.
     *         </p>
     */
    public String getPercentDone() {
        return percentDone;
    }

    /**
     * <p>
     * Contains an estimated percentage that is complete of a job at the time
     * the job status was queried.
     * </p>
     *
     * @param percentDone <p>
     *            Contains an estimated percentage that is complete of a job at
     *            the time the job status was queried.
     *            </p>
     */
    public void setPercentDone(String percentDone) {
        this.percentDone = percentDone;
    }

    /**
     * <p>
     * Contains an estimated percentage that is complete of a job at the time
     * the job status was queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentDone <p>
     *            Contains an estimated percentage that is complete of a job at
     *            the time the job status was queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withPercentDone(String percentDone) {
        this.percentDone = percentDone;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the restored resource.
     * </p>
     *
     * @return <p>
     *         The size, in bytes, of the restored resource.
     *         </p>
     */
    public Long getBackupSizeInBytes() {
        return backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the restored resource.
     * </p>
     *
     * @param backupSizeInBytes <p>
     *            The size, in bytes, of the restored resource.
     *            </p>
     */
    public void setBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the restored resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupSizeInBytes <p>
     *            The size, in bytes, of the restored resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withBackupSizeInBytes(Long backupSizeInBytes) {
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
    public DescribeRestoreJobResult withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * The amount of time in minutes that a job restoring a recovery point is
     * expected to take.
     * </p>
     *
     * @return <p>
     *         The amount of time in minutes that a job restoring a recovery
     *         point is expected to take.
     *         </p>
     */
    public Long getExpectedCompletionTimeMinutes() {
        return expectedCompletionTimeMinutes;
    }

    /**
     * <p>
     * The amount of time in minutes that a job restoring a recovery point is
     * expected to take.
     * </p>
     *
     * @param expectedCompletionTimeMinutes <p>
     *            The amount of time in minutes that a job restoring a recovery
     *            point is expected to take.
     *            </p>
     */
    public void setExpectedCompletionTimeMinutes(Long expectedCompletionTimeMinutes) {
        this.expectedCompletionTimeMinutes = expectedCompletionTimeMinutes;
    }

    /**
     * <p>
     * The amount of time in minutes that a job restoring a recovery point is
     * expected to take.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedCompletionTimeMinutes <p>
     *            The amount of time in minutes that a job restoring a recovery
     *            point is expected to take.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withExpectedCompletionTimeMinutes(
            Long expectedCompletionTimeMinutes) {
        this.expectedCompletionTimeMinutes = expectedCompletionTimeMinutes;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource whose
     * recovery point is being restored. The format of the ARN depends on the
     * resource type of the backed-up resource.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a resource
     *         whose recovery point is being restored. The format of the ARN
     *         depends on the resource type of the backed-up resource.
     *         </p>
     */
    public String getCreatedResourceArn() {
        return createdResourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource whose
     * recovery point is being restored. The format of the ARN depends on the
     * resource type of the backed-up resource.
     * </p>
     *
     * @param createdResourceArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            resource whose recovery point is being restored. The format of
     *            the ARN depends on the resource type of the backed-up
     *            resource.
     *            </p>
     */
    public void setCreatedResourceArn(String createdResourceArn) {
        this.createdResourceArn = createdResourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource whose
     * recovery point is being restored. The format of the ARN depends on the
     * resource type of the backed-up resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdResourceArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            resource whose recovery point is being restored. The format of
     *            the ARN depends on the resource type of the backed-up
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withCreatedResourceArn(String createdResourceArn) {
        this.createdResourceArn = createdResourceArn;
        return this;
    }

    /**
     * <p>
     * Returns metadata associated with a restore job listed by resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         Returns metadata associated with a restore job listed by resource
     *         type.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Returns metadata associated with a restore job listed by resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            Returns metadata associated with a restore job listed by
     *            resource type.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Returns metadata associated with a restore job listed by resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            Returns metadata associated with a restore job listed by
     *            resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRestoreJobResult withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getRestoreJobId() != null)
            sb.append("RestoreJobId: " + getRestoreJobId() + ",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: " + getRecoveryPointArn() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: " + getCompletionDate() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getPercentDone() != null)
            sb.append("PercentDone: " + getPercentDone() + ",");
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: " + getBackupSizeInBytes() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getExpectedCompletionTimeMinutes() != null)
            sb.append("ExpectedCompletionTimeMinutes: " + getExpectedCompletionTimeMinutes() + ",");
        if (getCreatedResourceArn() != null)
            sb.append("CreatedResourceArn: " + getCreatedResourceArn() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreJobId() == null) ? 0 : getRestoreJobId().hashCode());
        hashCode = prime * hashCode
                + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getPercentDone() == null) ? 0 : getPercentDone().hashCode());
        hashCode = prime * hashCode
                + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpectedCompletionTimeMinutes() == null) ? 0
                        : getExpectedCompletionTimeMinutes().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedResourceArn() == null) ? 0 : getCreatedResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRestoreJobResult == false)
            return false;
        DescribeRestoreJobResult other = (DescribeRestoreJobResult) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRestoreJobId() == null ^ this.getRestoreJobId() == null)
            return false;
        if (other.getRestoreJobId() != null
                && other.getRestoreJobId().equals(this.getRestoreJobId()) == false)
            return false;
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
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null
                && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getExpectedCompletionTimeMinutes() == null
                ^ this.getExpectedCompletionTimeMinutes() == null)
            return false;
        if (other.getExpectedCompletionTimeMinutes() != null
                && other.getExpectedCompletionTimeMinutes().equals(
                        this.getExpectedCompletionTimeMinutes()) == false)
            return false;
        if (other.getCreatedResourceArn() == null ^ this.getCreatedResourceArn() == null)
            return false;
        if (other.getCreatedResourceArn() != null
                && other.getCreatedResourceArn().equals(this.getCreatedResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
