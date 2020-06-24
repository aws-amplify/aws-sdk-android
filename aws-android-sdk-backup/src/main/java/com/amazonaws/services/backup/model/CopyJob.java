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
 * Contains detailed information about a copy job.
 * </p>
 */
public class CopyJob implements Serializable {
    /**
     * <p>
     * The account ID that owns the copy job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     */
    private String copyJobId;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String sourceBackupVaultArn;

    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     */
    private String sourceRecoveryPointArn;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String destinationBackupVaultArn;

    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     */
    private String destinationRecoveryPointArn;

    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store
     * (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS)
     * database.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The date and time a copy job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time a copy job is completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CompletionDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     */
    private String state;

    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     */
    private Long backupSizeInBytes;

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * Contains information about the backup plan and rule that AWS Backup used
     * to initiate the recovery point backup.
     * </p>
     */
    private RecoveryPointCreator createdBy;

    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic
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
     * The account ID that owns the copy job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The account ID that owns the copy job.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account ID that owns the copy job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param accountId <p>
     *            The account ID that owns the copy job.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID that owns the copy job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param accountId <p>
     *            The account ID that owns the copy job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a copy job.
     *         </p>
     */
    public String getCopyJobId() {
        return copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     *
     * @param copyJobId <p>
     *            Uniquely identifies a copy job.
     *            </p>
     */
    public void setCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a copy job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyJobId <p>
     *            Uniquely identifies a copy job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a source
     *         copy vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getSourceBackupVaultArn() {
        return sourceBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param sourceBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            source copy vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setSourceBackupVaultArn(String sourceBackupVaultArn) {
        this.sourceBackupVaultArn = sourceBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            source copy vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withSourceBackupVaultArn(String sourceBackupVaultArn) {
        this.sourceBackupVaultArn = sourceBackupVaultArn;
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a source recovery point; for
     *         example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *         .
     *         </p>
     */
    public String getSourceRecoveryPointArn() {
        return sourceRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @param sourceRecoveryPointArn <p>
     *            An ARN that uniquely identifies a source recovery point; for
     *            example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     */
    public void setSourceRecoveryPointArn(String sourceRecoveryPointArn) {
        this.sourceRecoveryPointArn = sourceRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a source recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRecoveryPointArn <p>
     *            An ARN that uniquely identifies a source recovery point; for
     *            example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withSourceRecoveryPointArn(String sourceRecoveryPointArn) {
        this.sourceRecoveryPointArn = sourceRecoveryPointArn;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a
     *         destination copy vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getDestinationBackupVaultArn() {
        return destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param destinationBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            destination copy vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination copy
     * vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            destination copy vault; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @return <p>
     *         An ARN that uniquely identifies a destination recovery point; for
     *         example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *         .
     *         </p>
     */
    public String getDestinationRecoveryPointArn() {
        return destinationRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     *
     * @param destinationRecoveryPointArn <p>
     *            An ARN that uniquely identifies a destination recovery point;
     *            for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     */
    public void setDestinationRecoveryPointArn(String destinationRecoveryPointArn) {
        this.destinationRecoveryPointArn = destinationRecoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a destination recovery point; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationRecoveryPointArn <p>
     *            An ARN that uniquely identifies a destination recovery point;
     *            for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withDestinationRecoveryPointArn(String destinationRecoveryPointArn) {
        this.destinationRecoveryPointArn = destinationRecoveryPointArn;
        return this;
    }

    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store
     * (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS)
     * database.
     * </p>
     *
     * @return <p>
     *         The AWS resource to be copied; for example, an Amazon Elastic
     *         Block Store (Amazon EBS) volume or an Amazon Relational Database
     *         Service (Amazon RDS) database.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store
     * (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS)
     * database.
     * </p>
     *
     * @param resourceArn <p>
     *            The AWS resource to be copied; for example, an Amazon Elastic
     *            Block Store (Amazon EBS) volume or an Amazon Relational
     *            Database Service (Amazon RDS) database.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The AWS resource to be copied; for example, an Amazon Elastic Block Store
     * (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS)
     * database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The AWS resource to be copied; for example, an Amazon Elastic
     *            Block Store (Amazon EBS) volume or an Amazon Relational
     *            Database Service (Amazon RDS) database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The date and time a copy job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a copy job is created, in Unix format and
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
     * The date and time a copy job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time a copy job is created, in Unix format and
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
     * The date and time a copy job is created, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CreationDate</code> is accurate
     * to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time a copy job is created, in Unix format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>CreationDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time a copy job is completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CompletionDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a copy job is completed, in Unix format and
     *         Coordinated Universal Time (UTC). The value of
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
     * The date and time a copy job is completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CompletionDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param completionDate <p>
     *            The date and time a copy job is completed, in Unix format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>CompletionDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time a copy job is completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>CompletionDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate <p>
     *            The date and time a copy job is completed, in Unix format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>CompletionDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @return <p>
     *         The current state of a copy job.
     *         </p>
     * @see CopyJobState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param state <p>
     *            The current state of a copy job.
     *            </p>
     * @see CopyJobState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param state <p>
     *            The current state of a copy job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyJobState
     */
    public CopyJob withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param state <p>
     *            The current state of a copy job.
     *            </p>
     * @see CopyJobState
     */
    public void setState(CopyJobState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of a copy job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param state <p>
     *            The current state of a copy job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyJobState
     */
    public CopyJob withState(CopyJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     *
     * @return <p>
     *         A detailed message explaining the status of the job to copy a
     *         resource.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     *
     * @param statusMessage <p>
     *            A detailed message explaining the status of the job to copy a
     *            resource.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to copy a resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A detailed message explaining the status of the job to copy a
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     *
     * @return <p>
     *         The size, in bytes, of a copy job.
     *         </p>
     */
    public Long getBackupSizeInBytes() {
        return backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     *
     * @param backupSizeInBytes <p>
     *            The size, in bytes, of a copy job.
     *            </p>
     */
    public void setBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a copy job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupSizeInBytes <p>
     *            The size, in bytes, of a copy job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
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
    public CopyJob withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * Contains information about the backup plan and rule that AWS Backup used
     * to initiate the recovery point backup.
     * </p>
     *
     * @return <p>
     *         Contains information about the backup plan and rule that AWS
     *         Backup used to initiate the recovery point backup.
     *         </p>
     */
    public RecoveryPointCreator getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Contains information about the backup plan and rule that AWS Backup used
     * to initiate the recovery point backup.
     * </p>
     *
     * @param createdBy <p>
     *            Contains information about the backup plan and rule that AWS
     *            Backup used to initiate the recovery point backup.
     *            </p>
     */
    public void setCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Contains information about the backup plan and rule that AWS Backup used
     * to initiate the recovery point backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Contains information about the backup plan and rule that AWS
     *            Backup used to initiate the recovery point backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic
     * Block Store (Amazon EBS) volume or an Amazon Relational Database Service
     * (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The type of AWS resource to be copied; for example, an Amazon
     *         Elastic Block Store (Amazon EBS) volume or an Amazon Relational
     *         Database Service (Amazon RDS) database.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic
     * Block Store (Amazon EBS) volume or an Amazon Relational Database Service
     * (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            The type of AWS resource to be copied; for example, an Amazon
     *            Elastic Block Store (Amazon EBS) volume or an Amazon
     *            Relational Database Service (Amazon RDS) database.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be copied; for example, an Amazon Elastic
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
     *            The type of AWS resource to be copied; for example, an Amazon
     *            Elastic Block Store (Amazon EBS) volume or an Amazon
     *            Relational Database Service (Amazon RDS) database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyJob withResourceType(String resourceType) {
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
        if (getCopyJobId() != null)
            sb.append("CopyJobId: " + getCopyJobId() + ",");
        if (getSourceBackupVaultArn() != null)
            sb.append("SourceBackupVaultArn: " + getSourceBackupVaultArn() + ",");
        if (getSourceRecoveryPointArn() != null)
            sb.append("SourceRecoveryPointArn: " + getSourceRecoveryPointArn() + ",");
        if (getDestinationBackupVaultArn() != null)
            sb.append("DestinationBackupVaultArn: " + getDestinationBackupVaultArn() + ",");
        if (getDestinationRecoveryPointArn() != null)
            sb.append("DestinationRecoveryPointArn: " + getDestinationRecoveryPointArn() + ",");
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
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: " + getBackupSizeInBytes() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
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
        hashCode = prime * hashCode + ((getCopyJobId() == null) ? 0 : getCopyJobId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceBackupVaultArn() == null) ? 0 : getSourceBackupVaultArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceRecoveryPointArn() == null) ? 0 : getSourceRecoveryPointArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationBackupVaultArn() == null) ? 0 : getDestinationBackupVaultArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationRecoveryPointArn() == null) ? 0
                        : getDestinationRecoveryPointArn().hashCode());
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
                + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
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

        if (obj instanceof CopyJob == false)
            return false;
        CopyJob other = (CopyJob) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCopyJobId() == null ^ this.getCopyJobId() == null)
            return false;
        if (other.getCopyJobId() != null
                && other.getCopyJobId().equals(this.getCopyJobId()) == false)
            return false;
        if (other.getSourceBackupVaultArn() == null ^ this.getSourceBackupVaultArn() == null)
            return false;
        if (other.getSourceBackupVaultArn() != null
                && other.getSourceBackupVaultArn().equals(this.getSourceBackupVaultArn()) == false)
            return false;
        if (other.getSourceRecoveryPointArn() == null ^ this.getSourceRecoveryPointArn() == null)
            return false;
        if (other.getSourceRecoveryPointArn() != null
                && other.getSourceRecoveryPointArn().equals(this.getSourceRecoveryPointArn()) == false)
            return false;
        if (other.getDestinationBackupVaultArn() == null
                ^ this.getDestinationBackupVaultArn() == null)
            return false;
        if (other.getDestinationBackupVaultArn() != null
                && other.getDestinationBackupVaultArn().equals(this.getDestinationBackupVaultArn()) == false)
            return false;
        if (other.getDestinationRecoveryPointArn() == null
                ^ this.getDestinationRecoveryPointArn() == null)
            return false;
        if (other.getDestinationRecoveryPointArn() != null
                && other.getDestinationRecoveryPointArn().equals(
                        this.getDestinationRecoveryPointArn()) == false)
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
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
