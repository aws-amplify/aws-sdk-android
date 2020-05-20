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
 * Contains detailed information about the recovery points stored in a backup
 * vault.
 * </p>
 */
public class RecoveryPointByBackupVault implements Serializable {
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
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends
     * on the resource type.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an
     * Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational
     * Database Service (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String resourceType;

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan that is used to create it.
     * </p>
     */
    private RecoveryPointCreator createdBy;

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for
     * example, <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;

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
     * The date and time a recovery point is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time a job to restore a recovery point is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     */
    private Long backupSizeInBytes;

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing
     * <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps.
     * </p>
     */
    private CalculatedLifecycle calculatedLifecycle;

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
     * The server-side encryption key that is used to protect your backups; for
     * example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     */
    private String encryptionKeyArn;

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified
     * recovery point is encrypted, or <code>FALSE</code> if the recovery point
     * is not encrypted.
     * </p>
     */
    private Boolean isEncrypted;

    /**
     * <p>
     * The date and time a recovery point was last restored, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     */
    private java.util.Date lastRestoreTime;

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
    public RecoveryPointByBackupVault withRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
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
    public RecoveryPointByBackupVault withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

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
    public RecoveryPointByBackupVault withBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
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
    public RecoveryPointByBackupVault withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an
     * Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational
     * Database Service (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The type of AWS resource saved as a recovery point; for example,
     *         an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon
     *         Relational Database Service (Amazon RDS) database.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an
     * Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational
     * Database Service (Amazon RDS) database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            The type of AWS resource saved as a recovery point; for
     *            example, an Amazon Elastic Block Store (Amazon EBS) volume or
     *            an Amazon Relational Database Service (Amazon RDS) database.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an
     * Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational
     * Database Service (Amazon RDS) database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param resourceType <p>
     *            The type of AWS resource saved as a recovery point; for
     *            example, an Amazon Elastic Block Store (Amazon EBS) volume or
     *            an Amazon Relational Database Service (Amazon RDS) database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByBackupVault withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan that is used to create it.
     * </p>
     *
     * @return <p>
     *         Contains identifying information about the creation of a recovery
     *         point, including the <code>BackupPlanArn</code>,
     *         <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *         <code>BackupRuleId</code> of the backup plan that is used to
     *         create it.
     *         </p>
     */
    public RecoveryPointCreator getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan that is used to create it.
     * </p>
     *
     * @param createdBy <p>
     *            Contains identifying information about the creation of a
     *            recovery point, including the <code>BackupPlanArn</code>,
     *            <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *            <code>BackupRuleId</code> of the backup plan that is used to
     *            create it.
     *            </p>
     */
    public void setCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point,
     * including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>,
     * <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the
     * backup plan that is used to create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Contains identifying information about the creation of a
     *            recovery point, including the <code>BackupPlanArn</code>,
     *            <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *            <code>BackupRuleId</code> of the backup plan that is used to
     *            create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByBackupVault withCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
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
    public RecoveryPointByBackupVault withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
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
    public RecoveryPointByBackupVault withStatus(String status) {
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
    public RecoveryPointByBackupVault withStatus(RecoveryPointStatus status) {
        this.status = status.toString();
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
    public RecoveryPointByBackupVault withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time a job to restore a recovery point is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a job to restore a recovery point is completed,
     *         in Unix format and Coordinated Universal Time (UTC). The value of
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
     * The date and time a job to restore a recovery point is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param completionDate <p>
     *            The date and time a job to restore a recovery point is
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
     * The date and time a job to restore a recovery point is completed, in Unix
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate <p>
     *            The date and time a job to restore a recovery point is
     *            completed, in Unix format and Coordinated Universal Time
     *            (UTC). The value of <code>CompletionDate</code> is accurate to
     *            milliseconds. For example, the value 1516925490.087 represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByBackupVault withCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
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
    public RecoveryPointByBackupVault withBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
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
    public RecoveryPointByBackupVault withCalculatedLifecycle(
            CalculatedLifecycle calculatedLifecycle) {
        this.calculatedLifecycle = calculatedLifecycle;
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
    public RecoveryPointByBackupVault withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
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
    public RecoveryPointByBackupVault withEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
        return this;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified
     * recovery point is encrypted, or <code>FALSE</code> if the recovery point
     * is not encrypted.
     * </p>
     *
     * @return <p>
     *         A Boolean value that is returned as <code>TRUE</code> if the
     *         specified recovery point is encrypted, or <code>FALSE</code> if
     *         the recovery point is not encrypted.
     *         </p>
     */
    public Boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified
     * recovery point is encrypted, or <code>FALSE</code> if the recovery point
     * is not encrypted.
     * </p>
     *
     * @return <p>
     *         A Boolean value that is returned as <code>TRUE</code> if the
     *         specified recovery point is encrypted, or <code>FALSE</code> if
     *         the recovery point is not encrypted.
     *         </p>
     */
    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified
     * recovery point is encrypted, or <code>FALSE</code> if the recovery point
     * is not encrypted.
     * </p>
     *
     * @param isEncrypted <p>
     *            A Boolean value that is returned as <code>TRUE</code> if the
     *            specified recovery point is encrypted, or <code>FALSE</code>
     *            if the recovery point is not encrypted.
     *            </p>
     */
    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified
     * recovery point is encrypted, or <code>FALSE</code> if the recovery point
     * is not encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isEncrypted <p>
     *            A Boolean value that is returned as <code>TRUE</code> if the
     *            specified recovery point is encrypted, or <code>FALSE</code>
     *            if the recovery point is not encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByBackupVault withIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
        return this;
    }

    /**
     * <p>
     * The date and time a recovery point was last restored, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     *
     * @return <p>
     *         The date and time a recovery point was last restored, in Unix
     *         format and Coordinated Universal Time (UTC). The value of
     *         <code>LastRestoreTime</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26,
     *         2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getLastRestoreTime() {
        return lastRestoreTime;
    }

    /**
     * <p>
     * The date and time a recovery point was last restored, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     *
     * @param lastRestoreTime <p>
     *            The date and time a recovery point was last restored, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>LastRestoreTime</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setLastRestoreTime(java.util.Date lastRestoreTime) {
        this.lastRestoreTime = lastRestoreTime;
    }

    /**
     * <p>
     * The date and time a recovery point was last restored, in Unix format and
     * Coordinated Universal Time (UTC). The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastRestoreTime <p>
     *            The date and time a recovery point was last restored, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>LastRestoreTime</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecoveryPointByBackupVault withLastRestoreTime(java.util.Date lastRestoreTime) {
        this.lastRestoreTime = lastRestoreTime;
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: " + getBackupVaultName() + ",");
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: " + getBackupVaultArn() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: " + getCompletionDate() + ",");
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: " + getBackupSizeInBytes() + ",");
        if (getCalculatedLifecycle() != null)
            sb.append("CalculatedLifecycle: " + getCalculatedLifecycle() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: " + getEncryptionKeyArn() + ",");
        if (getIsEncrypted() != null)
            sb.append("IsEncrypted: " + getIsEncrypted() + ",");
        if (getLastRestoreTime() != null)
            sb.append("LastRestoreTime: " + getLastRestoreTime());
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
                + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode
                + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode
                + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getCalculatedLifecycle() == null) ? 0 : getCalculatedLifecycle().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode
                + ((getIsEncrypted() == null) ? 0 : getIsEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getLastRestoreTime() == null) ? 0 : getLastRestoreTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPointByBackupVault == false)
            return false;
        RecoveryPointByBackupVault other = (RecoveryPointByBackupVault) obj;

        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null
                && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
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
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null
                && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getBackupSizeInBytes() == null ^ this.getBackupSizeInBytes() == null)
            return false;
        if (other.getBackupSizeInBytes() != null
                && other.getBackupSizeInBytes().equals(this.getBackupSizeInBytes()) == false)
            return false;
        if (other.getCalculatedLifecycle() == null ^ this.getCalculatedLifecycle() == null)
            return false;
        if (other.getCalculatedLifecycle() != null
                && other.getCalculatedLifecycle().equals(this.getCalculatedLifecycle()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null
                && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getIsEncrypted() == null ^ this.getIsEncrypted() == null)
            return false;
        if (other.getIsEncrypted() != null
                && other.getIsEncrypted().equals(this.getIsEncrypted()) == false)
            return false;
        if (other.getLastRestoreTime() == null ^ this.getLastRestoreTime() == null)
            return false;
        if (other.getLastRestoreTime() != null
                && other.getLastRestoreTime().equals(this.getLastRestoreTime()) == false)
            return false;
        return true;
    }
}
