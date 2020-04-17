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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a single backup.
 * </p>
 */
public class Backup implements Serializable {
    /**
     * <p>
     * The ARN of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String backupArn;

    /**
     * <p>
     * The generated ID of the backup. Example:
     * <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     */
    private String backupId;

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or
     * <code>manual</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATED, MANUAL
     */
    private String backupType;

    /**
     * <p>
     * The time stamp when the backup was created in the database. Example:
     * <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for
     * automated backups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String description;

    /**
     * <p>
     * The engine type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String engine;

    /**
     * <p>
     * The engine model that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String engineModel;

    /**
     * <p>
     * The engine version that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String engineVersion;

    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the
     * backup is created. Because this value is stored, you are not required to
     * provide the InstanceProfileArn again if you restore a backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String instanceProfileArn;

    /**
     * <p>
     * The instance type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String instanceType;

    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String keyPair;

    /**
     * <p>
     * The preferred backup period that is obtained from the server when the
     * backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     */
    private String preferredBackupWindow;

    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when
     * the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     */
    private Integer s3DataSize;

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String s3DataUrl;

    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String s3LogUrl;

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup
     * is created.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, OK, FAILED, DELETING
     */
    private String status;

    /**
     * <p>
     * An informational message about backup status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String statusDescription;

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is
     * created.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the
     * server when the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String toolsVersion;

    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty
     * for automated backups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String userArn;

    /**
     * <p>
     * The ARN of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The ARN of the backup.
     *         </p>
     */
    public String getBackupArn() {
        return backupArn;
    }

    /**
     * <p>
     * The ARN of the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param backupArn <p>
     *            The ARN of the backup.
     *            </p>
     */
    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * The ARN of the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param backupArn <p>
     *            The ARN of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withBackupArn(String backupArn) {
        this.backupArn = backupArn;
        return this;
    }

    /**
     * <p>
     * The generated ID of the backup. Example:
     * <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @return <p>
     *         The generated ID of the backup. Example:
     *         <code>myServerName-yyyyMMddHHmmssSSS</code>
     *         </p>
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * <p>
     * The generated ID of the backup. Example:
     * <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @param backupId <p>
     *            The generated ID of the backup. Example:
     *            <code>myServerName-yyyyMMddHHmmssSSS</code>
     *            </p>
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The generated ID of the backup. Example:
     * <code>myServerName-yyyyMMddHHmmssSSS</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 79<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-\.\:]*<br/>
     *
     * @param backupId <p>
     *            The generated ID of the backup. Example:
     *            <code>myServerName-yyyyMMddHHmmssSSS</code>
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
     * The backup type. Valid values are <code>automated</code> or
     * <code>manual</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATED, MANUAL
     *
     * @return <p>
     *         The backup type. Valid values are <code>automated</code> or
     *         <code>manual</code>.
     *         </p>
     * @see BackupType
     */
    public String getBackupType() {
        return backupType;
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or
     * <code>manual</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATED, MANUAL
     *
     * @param backupType <p>
     *            The backup type. Valid values are <code>automated</code> or
     *            <code>manual</code>.
     *            </p>
     * @see BackupType
     */
    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or
     * <code>manual</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATED, MANUAL
     *
     * @param backupType <p>
     *            The backup type. Valid values are <code>automated</code> or
     *            <code>manual</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupType
     */
    public Backup withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or
     * <code>manual</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATED, MANUAL
     *
     * @param backupType <p>
     *            The backup type. Valid values are <code>automated</code> or
     *            <code>manual</code>.
     *            </p>
     * @see BackupType
     */
    public void setBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
    }

    /**
     * <p>
     * The backup type. Valid values are <code>automated</code> or
     * <code>manual</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATED, MANUAL
     *
     * @param backupType <p>
     *            The backup type. Valid values are <code>automated</code> or
     *            <code>manual</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupType
     */
    public Backup withBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
        return this;
    }

    /**
     * <p>
     * The time stamp when the backup was created in the database. Example:
     * <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     *
     * @return <p>
     *         The time stamp when the backup was created in the database.
     *         Example: <code>2016-07-29T13:38:47.520Z</code>
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time stamp when the backup was created in the database. Example:
     * <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     *
     * @param createdAt <p>
     *            The time stamp when the backup was created in the database.
     *            Example: <code>2016-07-29T13:38:47.520Z</code>
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time stamp when the backup was created in the database. Example:
     * <code>2016-07-29T13:38:47.520Z</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time stamp when the backup was created in the database.
     *            Example: <code>2016-07-29T13:38:47.520Z</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for
     * automated backups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         A user-provided description for a manual backup. This field is
     *         empty for automated backups.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for
     * automated backups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param description <p>
     *            A user-provided description for a manual backup. This field is
     *            empty for automated backups.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-provided description for a manual backup. This field is empty for
     * automated backups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param description <p>
     *            A user-provided description for a manual backup. This field is
     *            empty for automated backups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The engine type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The engine type that is obtained from the server when the backup
     *         is created.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The engine type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param engine <p>
     *            The engine type that is obtained from the server when the
     *            backup is created.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param engine <p>
     *            The engine type that is obtained from the server when the
     *            backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The engine model that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The engine model that is obtained from the server when the backup
     *         is created.
     *         </p>
     */
    public String getEngineModel() {
        return engineModel;
    }

    /**
     * <p>
     * The engine model that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param engineModel <p>
     *            The engine model that is obtained from the server when the
     *            backup is created.
     *            </p>
     */
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /**
     * <p>
     * The engine model that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param engineModel <p>
     *            The engine model that is obtained from the server when the
     *            backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withEngineModel(String engineModel) {
        this.engineModel = engineModel;
        return this;
    }

    /**
     * <p>
     * The engine version that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The engine version that is obtained from the server when the
     *         backup is created.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param engineVersion <p>
     *            The engine version that is obtained from the server when the
     *            backup is created.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param engineVersion <p>
     *            The engine version that is obtained from the server when the
     *            backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the
     * backup is created. Because this value is stored, you are not required to
     * provide the InstanceProfileArn again if you restore a backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The EC2 instance profile ARN that is obtained from the server
     *         when the backup is created. Because this value is stored, you are
     *         not required to provide the InstanceProfileArn again if you
     *         restore a backup.
     *         </p>
     */
    public String getInstanceProfileArn() {
        return instanceProfileArn;
    }

    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the
     * backup is created. Because this value is stored, you are not required to
     * provide the InstanceProfileArn again if you restore a backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param instanceProfileArn <p>
     *            The EC2 instance profile ARN that is obtained from the server
     *            when the backup is created. Because this value is stored, you
     *            are not required to provide the InstanceProfileArn again if
     *            you restore a backup.
     *            </p>
     */
    public void setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }

    /**
     * <p>
     * The EC2 instance profile ARN that is obtained from the server when the
     * backup is created. Because this value is stored, you are not required to
     * provide the InstanceProfileArn again if you restore a backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param instanceProfileArn <p>
     *            The EC2 instance profile ARN that is obtained from the server
     *            when the backup is created. Because this value is stored, you
     *            are not required to provide the InstanceProfileArn again if
     *            you restore a backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
        return this;
    }

    /**
     * <p>
     * The instance type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The instance type that is obtained from the server when the
     *         backup is created.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param instanceType <p>
     *            The instance type that is obtained from the server when the
     *            backup is created.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param instanceType <p>
     *            The instance type that is obtained from the server when the
     *            backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The key pair that is obtained from the server when the backup is
     *         created.
     *         </p>
     */
    public String getKeyPair() {
        return keyPair;
    }

    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param keyPair <p>
     *            The key pair that is obtained from the server when the backup
     *            is created.
     *            </p>
     */
    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The key pair that is obtained from the server when the backup is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param keyPair <p>
     *            The key pair that is obtained from the server when the backup
     *            is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }

    /**
     * <p>
     * The preferred backup period that is obtained from the server when the
     * backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @return <p>
     *         The preferred backup period that is obtained from the server when
     *         the backup is created.
     *         </p>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * <p>
     * The preferred backup period that is obtained from the server when the
     * backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredBackupWindow <p>
     *            The preferred backup period that is obtained from the server
     *            when the backup is created.
     *            </p>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The preferred backup period that is obtained from the server when the
     * backup is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredBackupWindow <p>
     *            The preferred backup period that is obtained from the server
     *            when the backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when
     * the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @return <p>
     *         The preferred maintenance period that is obtained from the server
     *         when the backup is created.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when
     * the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredMaintenanceWindow <p>
     *            The preferred maintenance period that is obtained from the
     *            server when the backup is created.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The preferred maintenance period that is obtained from the server when
     * the backup is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern:
     * </b>^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$
     * <br/>
     *
     * @param preferredMaintenanceWindow <p>
     *            The preferred maintenance period that is obtained from the
     *            server when the backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     *
     * @return <p>
     *         This field is deprecated and is no longer used.
     *         </p>
     */
    public Integer getS3DataSize() {
        return s3DataSize;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     *
     * @param s3DataSize <p>
     *            This field is deprecated and is no longer used.
     *            </p>
     */
    public void setS3DataSize(Integer s3DataSize) {
        this.s3DataSize = s3DataSize;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3DataSize <p>
     *            This field is deprecated and is no longer used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withS3DataSize(Integer s3DataSize) {
        this.s3DataSize = s3DataSize;
        return this;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         This field is deprecated and is no longer used.
     *         </p>
     */
    public String getS3DataUrl() {
        return s3DataUrl;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param s3DataUrl <p>
     *            This field is deprecated and is no longer used.
     *            </p>
     */
    public void setS3DataUrl(String s3DataUrl) {
        this.s3DataUrl = s3DataUrl;
    }

    /**
     * <p>
     * This field is deprecated and is no longer used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param s3DataUrl <p>
     *            This field is deprecated and is no longer used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withS3DataUrl(String s3DataUrl) {
        this.s3DataUrl = s3DataUrl;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The Amazon S3 URL of the backup's log file.
     *         </p>
     */
    public String getS3LogUrl() {
        return s3LogUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param s3LogUrl <p>
     *            The Amazon S3 URL of the backup's log file.
     *            </p>
     */
    public void setS3LogUrl(String s3LogUrl) {
        this.s3LogUrl = s3LogUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the backup's log file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param s3LogUrl <p>
     *            The Amazon S3 URL of the backup's log file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withS3LogUrl(String s3LogUrl) {
        this.s3LogUrl = s3LogUrl;
        return this;
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup
     * is created.
     * </p>
     *
     * @return <p>
     *         The security group IDs that are obtained from the server when the
     *         backup is created.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup
     * is created.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The security group IDs that are obtained from the server when
     *            the backup is created.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The security group IDs that are obtained from the server when
     *            the backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs that are obtained from the server when the backup
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The security group IDs that are obtained from the server when
     *            the backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>
     *         The name of the server from which the backup was made.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server from which the backup was made.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server from which the backup was made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server from which the backup was made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The service role ARN that is obtained from the server when the
     *         backup is created.
     *         </p>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param serviceRoleArn <p>
     *            The service role ARN that is obtained from the server when the
     *            backup is created.
     *            </p>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The service role ARN that is obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param serviceRoleArn <p>
     *            The service role ARN that is obtained from the server when the
     *            backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, OK, FAILED, DELETING
     *
     * @return <p>
     *         The status of a backup while in progress.
     *         </p>
     * @see BackupStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, OK, FAILED, DELETING
     *
     * @param status <p>
     *            The status of a backup while in progress.
     *            </p>
     * @see BackupStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, OK, FAILED, DELETING
     *
     * @param status <p>
     *            The status of a backup while in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupStatus
     */
    public Backup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, OK, FAILED, DELETING
     *
     * @param status <p>
     *            The status of a backup while in progress.
     *            </p>
     * @see BackupStatus
     */
    public void setStatus(BackupStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of a backup while in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, OK, FAILED, DELETING
     *
     * @param status <p>
     *            The status of a backup while in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupStatus
     */
    public Backup withStatus(BackupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An informational message about backup status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         An informational message about backup status.
     *         </p>
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * <p>
     * An informational message about backup status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param statusDescription <p>
     *            An informational message about backup status.
     *            </p>
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * <p>
     * An informational message about backup status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param statusDescription <p>
     *            An informational message about backup status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is
     * created.
     * </p>
     *
     * @return <p>
     *         The subnet IDs that are obtained from the server when the backup
     *         is created.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is
     * created.
     * </p>
     *
     * @param subnetIds <p>
     *            The subnet IDs that are obtained from the server when the
     *            backup is created.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            The subnet IDs that are obtained from the server when the
     *            backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The subnet IDs that are obtained from the server when the backup is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            The subnet IDs that are obtained from the server when the
     *            backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the
     * server when the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The version of AWS OpsWorks CM-specific tools that is obtained
     *         from the server when the backup is created.
     *         </p>
     */
    public String getToolsVersion() {
        return toolsVersion;
    }

    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the
     * server when the backup is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param toolsVersion <p>
     *            The version of AWS OpsWorks CM-specific tools that is obtained
     *            from the server when the backup is created.
     *            </p>
     */
    public void setToolsVersion(String toolsVersion) {
        this.toolsVersion = toolsVersion;
    }

    /**
     * <p>
     * The version of AWS OpsWorks CM-specific tools that is obtained from the
     * server when the backup is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param toolsVersion <p>
     *            The version of AWS OpsWorks CM-specific tools that is obtained
     *            from the server when the backup is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withToolsVersion(String toolsVersion) {
        this.toolsVersion = toolsVersion;
        return this;
    }

    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty
     * for automated backups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The IAM user ARN of the requester for manual backups. This field
     *         is empty for automated backups.
     *         </p>
     */
    public String getUserArn() {
        return userArn;
    }

    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty
     * for automated backups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param userArn <p>
     *            The IAM user ARN of the requester for manual backups. This
     *            field is empty for automated backups.
     *            </p>
     */
    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The IAM user ARN of the requester for manual backups. This field is empty
     * for automated backups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param userArn <p>
     *            The IAM user ARN of the requester for manual backups. This
     *            field is empty for automated backups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Backup withUserArn(String userArn) {
        this.userArn = userArn;
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
        if (getBackupArn() != null)
            sb.append("BackupArn: " + getBackupArn() + ",");
        if (getBackupId() != null)
            sb.append("BackupId: " + getBackupId() + ",");
        if (getBackupType() != null)
            sb.append("BackupType: " + getBackupType() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineModel() != null)
            sb.append("EngineModel: " + getEngineModel() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getInstanceProfileArn() != null)
            sb.append("InstanceProfileArn: " + getInstanceProfileArn() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKeyPair() != null)
            sb.append("KeyPair: " + getKeyPair() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getS3DataSize() != null)
            sb.append("S3DataSize: " + getS3DataSize() + ",");
        if (getS3DataUrl() != null)
            sb.append("S3DataUrl: " + getS3DataUrl() + ",");
        if (getS3LogUrl() != null)
            sb.append("S3LogUrl: " + getS3LogUrl() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusDescription() != null)
            sb.append("StatusDescription: " + getStatusDescription() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getToolsVersion() != null)
            sb.append("ToolsVersion: " + getToolsVersion() + ",");
        if (getUserArn() != null)
            sb.append("UserArn: " + getUserArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getBackupType() == null) ? 0 : getBackupType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineModel() == null) ? 0 : getEngineModel().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceProfileArn() == null) ? 0 : getInstanceProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode + ((getS3DataSize() == null) ? 0 : getS3DataSize().hashCode());
        hashCode = prime * hashCode + ((getS3DataUrl() == null) ? 0 : getS3DataUrl().hashCode());
        hashCode = prime * hashCode + ((getS3LogUrl() == null) ? 0 : getS3LogUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDescription() == null) ? 0 : getStatusDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getToolsVersion() == null) ? 0 : getToolsVersion().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
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

        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null
                && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getBackupType() == null ^ this.getBackupType() == null)
            return false;
        if (other.getBackupType() != null
                && other.getBackupType().equals(this.getBackupType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineModel() == null ^ this.getEngineModel() == null)
            return false;
        if (other.getEngineModel() != null
                && other.getEngineModel().equals(this.getEngineModel()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null)
            return false;
        if (other.getInstanceProfileArn() != null
                && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getS3DataSize() == null ^ this.getS3DataSize() == null)
            return false;
        if (other.getS3DataSize() != null
                && other.getS3DataSize().equals(this.getS3DataSize()) == false)
            return false;
        if (other.getS3DataUrl() == null ^ this.getS3DataUrl() == null)
            return false;
        if (other.getS3DataUrl() != null
                && other.getS3DataUrl().equals(this.getS3DataUrl()) == false)
            return false;
        if (other.getS3LogUrl() == null ^ this.getS3LogUrl() == null)
            return false;
        if (other.getS3LogUrl() != null && other.getS3LogUrl().equals(this.getS3LogUrl()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null
                && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDescription() == null ^ this.getStatusDescription() == null)
            return false;
        if (other.getStatusDescription() != null
                && other.getStatusDescription().equals(this.getStatusDescription()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getToolsVersion() == null ^ this.getToolsVersion() == null)
            return false;
        if (other.getToolsVersion() != null
                && other.getToolsVersion().equals(this.getToolsVersion()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        return true;
    }
}
