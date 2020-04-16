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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Amazon Relational Database Service (Amazon RDS) supports importing MySQL
 * databases by using backup files. You can create a backup of your on-premises
 * database, store it on Amazon Simple Storage Service (Amazon S3), and then
 * restore the backup file onto a new Amazon RDS DB instance running MySQL. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html"
 * >Importing Data into an Amazon RDS MySQL DB Instance</a> in the <i>Amazon RDS
 * User Guide.</i>
 * </p>
 */
public class RestoreDBInstanceFromS3Request extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the database to create when the DB instance is created.
     * Follow the naming rules specified in <code>CreateDBInstance</code>.
     * </p>
     */
    private String dBName;

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * The amount of storage (in gigabytes) to allocate initially for the DB
     * instance. Follow the allocation rules specified in
     * <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough memory for your new DB instance so that the
     * restore operation can succeed. You can also allocate additional memory
     * for future growth.
     * </p>
     * </note>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example,
     * <code>db.m4.large</code>. Not all DB instance classes are available in
     * all AWS Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Importing from Amazon S3 isn't supported on the db.t2.micro DB instance
     * class.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;

    /**
     * <p>
     * The password for the master user. The password can include any printable
     * ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     */
    private java.util.List<String> dBSecurityGroups;

    /**
     * <p>
     * A list of VPC security groups to associate with this DB instance.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The Availability Zone that the DB instance is created in. For information
     * about AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS
     * Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be
     * specified if the DB instance is a Multi-AZ deployment. The specified
     * Availability Zone must be in the same AWS Region as the current endpoint.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. For more information, see
     * <code>CreateDBInstance</code>.
     * </p>
     */
    private Integer backupRetentionPeriod;

    /**
     * <p>
     * The time range each day during which automated backups are created if
     * automated backups are enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid Values: <code>1150</code>-<code>65535</code>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * If the DB instance is a Multi-AZ deployment, you can't set the
     * <code>AvailabilityZone</code> parameter.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * The version number of the database engine to use. Choose the latest minor
     * version of your database engine. For information about engine versions,
     * see <code>CreateDBInstance</code>, or call
     * <code>DescribeDBEngineVersions</code>.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are not applied automatically.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * The license model for this DB instance. Use
     * <code>general-public-license</code>.
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to
     * allocate initially for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The name of the option group to associate with this DB instance. If this
     * argument is omitted, the default option group for the specified engine is
     * used.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * When the DB instance is publicly accessible, it is an Internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public
     * IP address. When the DB instance isn't publicly accessible, it is an
     * internal instance with a DNS name that resolves to a private IP address.
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * A list of tags to associate with this DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>gp2</code> | <code>io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified; otherwise <code>gp2</code>
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * A value that indicates whether the new DB instance is encrypted or not.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB instance with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * instance, then you can use the KMS key alias instead of the ARN for the
     * KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: 0, 1, 5, 10, 15, 30, 60
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     */
    private Integer monitoringInterval;

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to Amazon CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on
     * creating a monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     * </p>
     */
    private String monitoringRoleArn;

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;

    /**
     * <p>
     * The name of the engine of your source database.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     */
    private String sourceEngine;

    /**
     * <p>
     * The engine version of your source database.
     * </p>
     * <p>
     * Valid Values: <code>5.6</code>
     * </p>
     */
    private String sourceEngineVersion;

    /**
     * <p>
     * The name of your Amazon S3 bucket that contains your database backup
     * file.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * The prefix of your Amazon S3 bucket.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role to allow Amazon RDS to
     * access your Amazon S3 bucket.
     * </p>
     */
    private String s3IngestionRoleArn;

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     * >Using Amazon Performance Insights</a> in the <i>Amazon Relational
     * Database Service User Guide</i>.
     * </p>
     */
    private Boolean enablePerformanceInsights;

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for
     * <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     * default encryption key. AWS KMS creates the default encryption key for
     * your AWS account. Your AWS account has a different default encryption key
     * for each AWS Region.
     * </p>
     */
    private String performanceInsightsKMSKeyId;

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid
     * values are 7 or 731 (2 years).
     * </p>
     */
    private Integer performanceInsightsRetentionPeriod;

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     */
    private java.util.List<String> enableCloudwatchLogsExports;

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     */
    private java.util.List<ProcessorFeature> processorFeatures;

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     */
    private Boolean useDefaultProcessorFeatures;

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The name of the database to create when the DB instance is created.
     * Follow the naming rules specified in <code>CreateDBInstance</code>.
     * </p>
     *
     * @return <p>
     *         The name of the database to create when the DB instance is
     *         created. Follow the naming rules specified in
     *         <code>CreateDBInstance</code>.
     *         </p>
     */
    public String getDBName() {
        return dBName;
    }

    /**
     * <p>
     * The name of the database to create when the DB instance is created.
     * Follow the naming rules specified in <code>CreateDBInstance</code>.
     * </p>
     *
     * @param dBName <p>
     *            The name of the database to create when the DB instance is
     *            created. Follow the naming rules specified in
     *            <code>CreateDBInstance</code>.
     *            </p>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The name of the database to create when the DB instance is created.
     * Follow the naming rules specified in <code>CreateDBInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBName <p>
     *            The name of the database to create when the DB instance is
     *            created. Follow the naming rules specified in
     *            <code>CreateDBInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     *
     * @return <p>
     *         The DB instance identifier. This parameter is stored as a
     *         lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mydbinstance</code>
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier. This parameter is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>mydbinstance</code>
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The DB instance identifier. This parameter is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>mydbinstance</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to allocate initially for the DB
     * instance. Follow the allocation rules specified in
     * <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough memory for your new DB instance so that the
     * restore operation can succeed. You can also allocate additional memory
     * for future growth.
     * </p>
     * </note>
     *
     * @return <p>
     *         The amount of storage (in gigabytes) to allocate initially for
     *         the DB instance. Follow the allocation rules specified in
     *         <code>CreateDBInstance</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Be sure to allocate enough memory for your new DB instance so
     *         that the restore operation can succeed. You can also allocate
     *         additional memory for future growth.
     *         </p>
     *         </note>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to allocate initially for the DB
     * instance. Follow the allocation rules specified in
     * <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough memory for your new DB instance so that the
     * restore operation can succeed. You can also allocate additional memory
     * for future growth.
     * </p>
     * </note>
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) to allocate initially for
     *            the DB instance. Follow the allocation rules specified in
     *            <code>CreateDBInstance</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Be sure to allocate enough memory for your new DB instance so
     *            that the restore operation can succeed. You can also allocate
     *            additional memory for future growth.
     *            </p>
     *            </note>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to allocate initially for the DB
     * instance. Follow the allocation rules specified in
     * <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough memory for your new DB instance so that the
     * restore operation can succeed. You can also allocate additional memory
     * for future growth.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) to allocate initially for
     *            the DB instance. Follow the allocation rules specified in
     *            <code>CreateDBInstance</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Be sure to allocate enough memory for your new DB instance so
     *            that the restore operation can succeed. You can also allocate
     *            additional memory for future growth.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example,
     * <code>db.m4.large</code>. Not all DB instance classes are available in
     * all AWS Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Importing from Amazon S3 isn't supported on the db.t2.micro DB instance
     * class.
     * </p>
     *
     * @return <p>
     *         The compute and memory capacity of the DB instance, for example,
     *         <code>db.m4.large</code>. Not all DB instance classes are
     *         available in all AWS Regions, or for all database engines. For
     *         the full list of DB instance classes, and availability for your
     *         engine, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     *         >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Importing from Amazon S3 isn't supported on the db.t2.micro DB
     *         instance class.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example,
     * <code>db.m4.large</code>. Not all DB instance classes are available in
     * all AWS Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Importing from Amazon S3 isn't supported on the db.t2.micro DB instance
     * class.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            The compute and memory capacity of the DB instance, for
     *            example, <code>db.m4.large</code>. Not all DB instance classes
     *            are available in all AWS Regions, or for all database engines.
     *            For the full list of DB instance classes, and availability for
     *            your engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     *            >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Importing from Amazon S3 isn't supported on the db.t2.micro DB
     *            instance class.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example,
     * <code>db.m4.large</code>. Not all DB instance classes are available in
     * all AWS Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Importing from Amazon S3 isn't supported on the db.t2.micro DB instance
     * class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            The compute and memory capacity of the DB instance, for
     *            example, <code>db.m4.large</code>. Not all DB instance classes
     *            are available in all AWS Regions, or for all database engines.
     *            For the full list of DB instance classes, and availability for
     *            your engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     *            >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Importing from Amazon S3 isn't supported on the db.t2.micro DB
     *            instance class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     *
     * @return <p>
     *         The name of the database engine to be used for this instance.
     *         </p>
     *         <p>
     *         Valid Values: <code>mysql</code>
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     *
     * @param engine <p>
     *            The name of the database engine to be used for this instance.
     *            </p>
     *            <p>
     *            Valid Values: <code>mysql</code>
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the database engine to be used for this instance.
     *            </p>
     *            <p>
     *            Valid Values: <code>mysql</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name for the master user.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 16 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     *
     * @param masterUsername <p>
     *            The name for the master user.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 16 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a reserved word for the chosen database engine.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            The name for the master user.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 16 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a reserved word for the chosen database engine.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable
     * ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     *
     * @return <p>
     *         The password for the master user. The password can include any
     *         printable ASCII character except "/", """, or "@".
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable
     * ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     *
     * @param masterUserPassword <p>
     *            The password for the master user. The password can include any
     *            printable ASCII character except "/", """, or "@".
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable
     * ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            The password for the master user. The password can include any
     *            printable ASCII character except "/", """, or "@".
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     *
     * @return <p>
     *         A list of DB security groups to associate with this DB instance.
     *         </p>
     *         <p>
     *         Default: The default DB security group for the database engine.
     *         </p>
     */
    public java.util.List<String> getDBSecurityGroups() {
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     *
     * @param dBSecurityGroups <p>
     *            A list of DB security groups to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            Default: The default DB security group for the database
     *            engine.
     *            </p>
     */
    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new java.util.ArrayList<String>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroups <p>
     *            A list of DB security groups to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            Default: The default DB security group for the database
     *            engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDBSecurityGroups(String... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) {
            this.dBSecurityGroups = new java.util.ArrayList<String>(dBSecurityGroups.length);
        }
        for (String value : dBSecurityGroups) {
            this.dBSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroups <p>
     *            A list of DB security groups to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            Default: The default DB security group for the database
     *            engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDBSecurityGroups(
            java.util.Collection<String> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups to associate with this DB instance.
     * </p>
     *
     * @return <p>
     *         A list of VPC security groups to associate with this DB instance.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups to associate with this DB instance.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups to associate with this DB
     *            instance.
     *            </p>
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups to associate with this DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) {
            this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds.length);
        }
        for (String value : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups to associate with this DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The Availability Zone that the DB instance is created in. For information
     * about AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS
     * Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be
     * specified if the DB instance is a Multi-AZ deployment. The specified
     * Availability Zone must be in the same AWS Region as the current endpoint.
     * </p>
     *
     * @return <p>
     *         The Availability Zone that the DB instance is created in. For
     *         information about AWS Regions and Availability Zones, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the
     *         endpoint's AWS Region.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     *         </p>
     *         <p>
     *         Constraint: The <code>AvailabilityZone</code> parameter can't be
     *         specified if the DB instance is a Multi-AZ deployment. The
     *         specified Availability Zone must be in the same AWS Region as the
     *         current endpoint.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the DB instance is created in. For information
     * about AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS
     * Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be
     * specified if the DB instance is a Multi-AZ deployment. The specified
     * Availability Zone must be in the same AWS Region as the current endpoint.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone that the DB instance is created in. For
     *            information about AWS Regions and Availability Zones, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Regions and Availability Zones</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            Default: A random, system-chosen Availability Zone in the
     *            endpoint's AWS Region.
     *            </p>
     *            <p>
     *            Example: <code>us-east-1d</code>
     *            </p>
     *            <p>
     *            Constraint: The <code>AvailabilityZone</code> parameter can't
     *            be specified if the DB instance is a Multi-AZ deployment. The
     *            specified Availability Zone must be in the same AWS Region as
     *            the current endpoint.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the DB instance is created in. For information
     * about AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS
     * Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be
     * specified if the DB instance is a Multi-AZ deployment. The specified
     * Availability Zone must be in the same AWS Region as the current endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone that the DB instance is created in. For
     *            information about AWS Regions and Availability Zones, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Regions and Availability Zones</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            Default: A random, system-chosen Availability Zone in the
     *            endpoint's AWS Region.
     *            </p>
     *            <p>
     *            Example: <code>us-east-1d</code>
     *            </p>
     *            <p>
     *            Constraint: The <code>AvailabilityZone</code> parameter can't
     *            be specified if the DB instance is a Multi-AZ deployment. The
     *            specified Availability Zone must be in the same AWS Region as
     *            the current endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     *
     * @return <p>
     *         A DB subnet group to associate with this DB instance.
     *         </p>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            A DB subnet group to associate with this DB instance.
     *            </p>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            A DB subnet group to associate with this DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The time range each week during which system maintenance can
     *         occur, in Universal Coordinated Time (UTC). For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *         >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred backup window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @param preferredMaintenanceWindow <p>
     *            The time range each week during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC). For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *            >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be in Universal Coordinated Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred backup window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The time range each week during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC). For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *            >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be in Universal Coordinated Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred backup window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     *
     * @return <p>
     *         The name of the DB parameter group to associate with this DB
     *         instance.
     *         </p>
     *         <p>
     *         If you do not specify a value for
     *         <code>DBParameterGroupName</code>, then the default
     *         <code>DBParameterGroup</code> for the specified DB engine is
     *         used.
     *         </p>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            If you do not specify a value for
     *            <code>DBParameterGroupName</code>, then the default
     *            <code>DBParameterGroup</code> for the specified DB engine is
     *            used.
     *            </p>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            If you do not specify a value for
     *            <code>DBParameterGroupName</code>, then the default
     *            <code>DBParameterGroup</code> for the specified DB engine is
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. For more information, see
     * <code>CreateDBInstance</code>.
     * </p>
     *
     * @return <p>
     *         The number of days for which automated backups are retained.
     *         Setting this parameter to a positive number enables backups. For
     *         more information, see <code>CreateDBInstance</code>.
     *         </p>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. For more information, see
     * <code>CreateDBInstance</code>.
     * </p>
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            Setting this parameter to a positive number enables backups.
     *            For more information, see <code>CreateDBInstance</code>.
     *            </p>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. For more information, see
     * <code>CreateDBInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            Setting this parameter to a positive number enables backups.
     *            For more information, see <code>CreateDBInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The time range each day during which automated backups are created if
     * automated backups are enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The time range each day during which automated backups are
     *         created if automated backups are enabled. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *         >The Backup Window</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>hh24:mi-hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * <p>
     * The time range each day during which automated backups are created if
     * automated backups are enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     *
     * @param preferredBackupWindow <p>
     *            The time range each day during which automated backups are
     *            created if automated backups are enabled. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *            >The Backup Window</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the format <code>hh24:mi-hh24:mi</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be in Universal Coordinated Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The time range each day during which automated backups are created if
     * automated backups are enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredBackupWindow <p>
     *            The time range each day during which automated backups are
     *            created if automated backups are enabled. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *            >The Backup Window</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be in the format <code>hh24:mi-hh24:mi</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be in Universal Coordinated Time (UTC).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must not conflict with the preferred maintenance window.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be at least 30 minutes.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid Values: <code>1150</code>-<code>65535</code>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     *
     * @return <p>
     *         The port number on which the database accepts connections.
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         Valid Values: <code>1150</code>-<code>65535</code>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid Values: <code>1150</code>-<code>65535</code>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     *
     * @param port <p>
     *            The port number on which the database accepts connections.
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            Valid Values: <code>1150</code>-<code>65535</code>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Valid Values: <code>1150</code>-<code>65535</code>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which the database accepts connections.
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            Valid Values: <code>1150</code>-<code>65535</code>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * If the DB instance is a Multi-AZ deployment, you can't set the
     * <code>AvailabilityZone</code> parameter.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is a Multi-AZ
     *         deployment. If the DB instance is a Multi-AZ deployment, you
     *         can't set the <code>AvailabilityZone</code> parameter.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * If the DB instance is a Multi-AZ deployment, you can't set the
     * <code>AvailabilityZone</code> parameter.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is a Multi-AZ
     *         deployment. If the DB instance is a Multi-AZ deployment, you
     *         can't set the <code>AvailabilityZone</code> parameter.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * If the DB instance is a Multi-AZ deployment, you can't set the
     * <code>AvailabilityZone</code> parameter.
     * </p>
     *
     * @param multiAZ <p>
     *            A value that indicates whether the DB instance is a Multi-AZ
     *            deployment. If the DB instance is a Multi-AZ deployment, you
     *            can't set the <code>AvailabilityZone</code> parameter.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * If the DB instance is a Multi-AZ deployment, you can't set the
     * <code>AvailabilityZone</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            A value that indicates whether the DB instance is a Multi-AZ
     *            deployment. If the DB instance is a Multi-AZ deployment, you
     *            can't set the <code>AvailabilityZone</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use. Choose the latest minor
     * version of your database engine. For information about engine versions,
     * see <code>CreateDBInstance</code>, or call
     * <code>DescribeDBEngineVersions</code>.
     * </p>
     *
     * @return <p>
     *         The version number of the database engine to use. Choose the
     *         latest minor version of your database engine. For information
     *         about engine versions, see <code>CreateDBInstance</code>, or call
     *         <code>DescribeDBEngineVersions</code>.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use. Choose the latest minor
     * version of your database engine. For information about engine versions,
     * see <code>CreateDBInstance</code>, or call
     * <code>DescribeDBEngineVersions</code>.
     * </p>
     *
     * @param engineVersion <p>
     *            The version number of the database engine to use. Choose the
     *            latest minor version of your database engine. For information
     *            about engine versions, see <code>CreateDBInstance</code>, or
     *            call <code>DescribeDBEngineVersions</code>.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use. Choose the latest minor
     * version of your database engine. For information about engine versions,
     * see <code>CreateDBInstance</code>, or call
     * <code>DescribeDBEngineVersions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version number of the database engine to use. Choose the
     *            latest minor version of your database engine. For information
     *            about engine versions, see <code>CreateDBInstance</code>, or
     *            call <code>DescribeDBEngineVersions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are not applied automatically.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor engine upgrades are applied
     *         automatically to the DB instance during the maintenance window.
     *         By default, minor engine upgrades are not applied automatically.
     *         </p>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are not applied automatically.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor engine upgrades are applied
     *         automatically to the DB instance during the maintenance window.
     *         By default, minor engine upgrades are not applied automatically.
     *         </p>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are not applied automatically.
     * </p>
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor engine upgrades are
     *            applied automatically to the DB instance during the
     *            maintenance window. By default, minor engine upgrades are not
     *            applied automatically.
     *            </p>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are not applied automatically.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor engine upgrades are
     *            applied automatically to the DB instance during the
     *            maintenance window. By default, minor engine upgrades are not
     *            applied automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The license model for this DB instance. Use
     * <code>general-public-license</code>.
     * </p>
     *
     * @return <p>
     *         The license model for this DB instance. Use
     *         <code>general-public-license</code>.
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * The license model for this DB instance. Use
     * <code>general-public-license</code>.
     * </p>
     *
     * @param licenseModel <p>
     *            The license model for this DB instance. Use
     *            <code>general-public-license</code>.
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for this DB instance. Use
     * <code>general-public-license</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            The license model for this DB instance. Use
     *            <code>general-public-license</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to
     * allocate initially for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         The amount of Provisioned IOPS (input/output operations per
     *         second) to allocate initially for the DB instance. For
     *         information about valid Iops values, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     *         >Amazon RDS Provisioned IOPS Storage to Improve Performance</a>
     *         in the <i>Amazon RDS User Guide.</i>
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to
     * allocate initially for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param iops <p>
     *            The amount of Provisioned IOPS (input/output operations per
     *            second) to allocate initially for the DB instance. For
     *            information about valid Iops values, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     *            >Amazon RDS Provisioned IOPS Storage to Improve
     *            Performance</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to
     * allocate initially for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The amount of Provisioned IOPS (input/output operations per
     *            second) to allocate initially for the DB instance. For
     *            information about valid Iops values, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     *            >Amazon RDS Provisioned IOPS Storage to Improve
     *            Performance</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The name of the option group to associate with this DB instance. If this
     * argument is omitted, the default option group for the specified engine is
     * used.
     * </p>
     *
     * @return <p>
     *         The name of the option group to associate with this DB instance.
     *         If this argument is omitted, the default option group for the
     *         specified engine is used.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to associate with this DB instance. If this
     * argument is omitted, the default option group for the specified engine is
     * used.
     * </p>
     *
     * @param optionGroupName <p>
     *            The name of the option group to associate with this DB
     *            instance. If this argument is omitted, the default option
     *            group for the specified engine is used.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to associate with this DB instance. If this
     * argument is omitted, the default option group for the specified engine is
     * used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The name of the option group to associate with this DB
     *            instance. If this argument is omitted, the default option
     *            group for the specified engine is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * When the DB instance is publicly accessible, it is an Internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public
     * IP address. When the DB instance isn't publicly accessible, it is an
     * internal instance with a DNS name that resolves to a private IP address.
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is publicly
     *         accessible. When the DB instance is publicly accessible, it is an
     *         Internet-facing instance with a publicly resolvable DNS name,
     *         which resolves to a public IP address. When the DB instance isn't
     *         publicly accessible, it is an internal instance with a DNS name
     *         that resolves to a private IP address. For more information, see
     *         <a>CreateDBInstance</a>.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * When the DB instance is publicly accessible, it is an Internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public
     * IP address. When the DB instance isn't publicly accessible, it is an
     * internal instance with a DNS name that resolves to a private IP address.
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is publicly
     *         accessible. When the DB instance is publicly accessible, it is an
     *         Internet-facing instance with a publicly resolvable DNS name,
     *         which resolves to a public IP address. When the DB instance isn't
     *         publicly accessible, it is an internal instance with a DNS name
     *         that resolves to a private IP address. For more information, see
     *         <a>CreateDBInstance</a>.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * When the DB instance is publicly accessible, it is an Internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public
     * IP address. When the DB instance isn't publicly accessible, it is an
     * internal instance with a DNS name that resolves to a private IP address.
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            A value that indicates whether the DB instance is publicly
     *            accessible. When the DB instance is publicly accessible, it is
     *            an Internet-facing instance with a publicly resolvable DNS
     *            name, which resolves to a public IP address. When the DB
     *            instance isn't publicly accessible, it is an internal instance
     *            with a DNS name that resolves to a private IP address. For
     *            more information, see <a>CreateDBInstance</a>.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * When the DB instance is publicly accessible, it is an Internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public
     * IP address. When the DB instance isn't publicly accessible, it is an
     * internal instance with a DNS name that resolves to a private IP address.
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            A value that indicates whether the DB instance is publicly
     *            accessible. When the DB instance is publicly accessible, it is
     *            an Internet-facing instance with a publicly resolvable DNS
     *            name, which resolves to a public IP address. When the DB
     *            instance isn't publicly accessible, it is an internal instance
     *            with a DNS name that resolves to a private IP address. For
     *            more information, see <a>CreateDBInstance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with this DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of tags to associate with this DB instance. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *         >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with this DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param tags <p>
     *            A list of tags to associate with this DB instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with this DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with this DB instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with this DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with this DB instance. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>gp2</code> | <code>io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified; otherwise <code>gp2</code>
     * </p>
     *
     * @return <p>
     *         Specifies the storage type to be associated with the DB instance.
     *         </p>
     *         <p>
     *         Valid values: <code>standard</code> | <code>gp2</code> |
     *         <code>io1</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code>, you must also include a value
     *         for the <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is
     *         specified; otherwise <code>gp2</code>
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>gp2</code> | <code>io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified; otherwise <code>gp2</code>
     * </p>
     *
     * @param storageType <p>
     *            Specifies the storage type to be associated with the DB
     *            instance.
     *            </p>
     *            <p>
     *            Valid values: <code>standard</code> | <code>gp2</code> |
     *            <code>io1</code>
     *            </p>
     *            <p>
     *            If you specify <code>io1</code>, you must also include a value
     *            for the <code>Iops</code> parameter.
     *            </p>
     *            <p>
     *            Default: <code>io1</code> if the <code>Iops</code> parameter
     *            is specified; otherwise <code>gp2</code>
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard</code> | <code>gp2</code> | <code>io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified; otherwise <code>gp2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            Specifies the storage type to be associated with the DB
     *            instance.
     *            </p>
     *            <p>
     *            Valid values: <code>standard</code> | <code>gp2</code> |
     *            <code>io1</code>
     *            </p>
     *            <p>
     *            If you specify <code>io1</code>, you must also include a value
     *            for the <code>Iops</code> parameter.
     *            </p>
     *            <p>
     *            Default: <code>io1</code> if the <code>Iops</code> parameter
     *            is specified; otherwise <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the new DB instance is encrypted or not.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the new DB instance is encrypted
     *         or not.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the new DB instance is encrypted or not.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the new DB instance is encrypted
     *         or not.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the new DB instance is encrypted or not.
     * </p>
     *
     * @param storageEncrypted <p>
     *            A value that indicates whether the new DB instance is
     *            encrypted or not.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the new DB instance is encrypted or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            A value that indicates whether the new DB instance is
     *            encrypted or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB instance with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * instance, then you can use the KMS key alias instead of the ARN for the
     * KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS Region.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier for an encrypted DB instance.
     *         </p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the
     *         KMS encryption key. If you are creating a DB instance with the
     *         same AWS account that owns the KMS encryption key used to encrypt
     *         the new DB instance, then you can use the KMS key alias instead
     *         of the ARN for the KM encryption key.
     *         </p>
     *         <p>
     *         If the <code>StorageEncrypted</code> parameter is enabled, and
     *         you do not specify a value for the <code>KmsKeyId</code>
     *         parameter, then Amazon RDS will use your default encryption key.
     *         AWS KMS creates the default encryption key for your AWS account.
     *         Your AWS account has a different default encryption key for each
     *         AWS Region.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB instance with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * instance, then you can use the KMS key alias instead of the ARN for the
     * KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS Region.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for an encrypted DB instance.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are creating a DB instance with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB instance, then you can use the KMS key
     *            alias instead of the ARN for the KM encryption key.
     *            </p>
     *            <p>
     *            If the <code>StorageEncrypted</code> parameter is enabled, and
     *            you do not specify a value for the <code>KmsKeyId</code>
     *            parameter, then Amazon RDS will use your default encryption
     *            key. AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB instance with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * instance, then you can use the KMS key alias instead of the ARN for the
     * KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled, and you do not
     * specify a value for the <code>KmsKeyId</code> parameter, then Amazon RDS
     * will use your default encryption key. AWS KMS creates the default
     * encryption key for your AWS account. Your AWS account has a different
     * default encryption key for each AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for an encrypted DB instance.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are creating a DB instance with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB instance, then you can use the KMS key
     *            alias instead of the ARN for the KM encryption key.
     *            </p>
     *            <p>
     *            If the <code>StorageEncrypted</code> parameter is enabled, and
     *            you do not specify a value for the <code>KmsKeyId</code>
     *            parameter, then Amazon RDS will use your default encryption
     *            key. AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the DB
     *         instance to snapshots of the DB instance. By default, tags are
     *         not copied.
     *         </p>
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the DB
     *         instance to snapshots of the DB instance. By default, tags are
     *         not copied.
     *         </p>
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the DB
     *            instance to snapshots of the DB instance. By default, tags are
     *            not copied.
     *            </p>
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the DB
     *            instance to snapshots of the DB instance. By default, tags are
     *            not copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: 0, 1, 5, 10, 15, 30, 60
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     *
     * @return <p>
     *         The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
     *         Enhanced Monitoring metrics, specify 0.
     *         </p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, then you must
     *         also set <code>MonitoringInterval</code> to a value other than 0.
     *         </p>
     *         <p>
     *         Valid Values: 0, 1, 5, 10, 15, 30, 60
     *         </p>
     *         <p>
     *         Default: <code>0</code>
     *         </p>
     */
    public Integer getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: 0, 1, 5, 10, 15, 30, 60
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     *
     * @param monitoringInterval <p>
     *            The interval, in seconds, between points when Enhanced
     *            Monitoring metrics are collected for the DB instance. To
     *            disable collecting Enhanced Monitoring metrics, specify 0.
     *            </p>
     *            <p>
     *            If <code>MonitoringRoleArn</code> is specified, then you must
     *            also set <code>MonitoringInterval</code> to a value other than
     *            0.
     *            </p>
     *            <p>
     *            Valid Values: 0, 1, 5, 10, 15, 30, 60
     *            </p>
     *            <p>
     *            Default: <code>0</code>
     *            </p>
     */
    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: 0, 1, 5, 10, 15, 30, 60
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringInterval <p>
     *            The interval, in seconds, between points when Enhanced
     *            Monitoring metrics are collected for the DB instance. To
     *            disable collecting Enhanced Monitoring metrics, specify 0.
     *            </p>
     *            <p>
     *            If <code>MonitoringRoleArn</code> is specified, then you must
     *            also set <code>MonitoringInterval</code> to a value other than
     *            0.
     *            </p>
     *            <p>
     *            Valid Values: 0, 1, 5, 10, 15, 30, 60
     *            </p>
     *            <p>
     *            Default: <code>0</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to Amazon CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on
     * creating a monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     * </p>
     *
     * @return <p>
     *         The ARN for the IAM role that permits RDS to send enhanced
     *         monitoring metrics to Amazon CloudWatch Logs. For example,
     *         <code>arn:aws:iam:123456789012:role/emaccess</code>. For
     *         information on creating a monitoring role, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *         >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon
     *         RDS User Guide.</i>
     *         </p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than
     *         0, then you must supply a <code>MonitoringRoleArn</code> value.
     *         </p>
     */
    public String getMonitoringRoleArn() {
        return monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to Amazon CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on
     * creating a monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     * </p>
     *
     * @param monitoringRoleArn <p>
     *            The ARN for the IAM role that permits RDS to send enhanced
     *            monitoring metrics to Amazon CloudWatch Logs. For example,
     *            <code>arn:aws:iam:123456789012:role/emaccess</code>. For
     *            information on creating a monitoring role, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *            >Setting Up and Enabling Enhanced Monitoring</a> in the
     *            <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            If <code>MonitoringInterval</code> is set to a value other
     *            than 0, then you must supply a <code>MonitoringRoleArn</code>
     *            value.
     *            </p>
     */
    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to Amazon CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on
     * creating a monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringRoleArn <p>
     *            The ARN for the IAM role that permits RDS to send enhanced
     *            monitoring metrics to Amazon CloudWatch Logs. For example,
     *            <code>arn:aws:iam:123456789012:role/emaccess</code>. For
     *            information on creating a monitoring role, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *            >Setting Up and Enabling Enhanced Monitoring</a> in the
     *            <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            If <code>MonitoringInterval</code> is set to a value other
     *            than 0, then you must supply a <code>MonitoringRoleArn</code>
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled. For information about the supported
     *         DB engines, see <a>CreateDBInstance</a>.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *         > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     *         <i>Amazon RDS User Guide.</i>
     *         </p>
     */
    public Boolean isEnableIAMDatabaseAuthentication() {
        return enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled. For information about the supported
     *         DB engines, see <a>CreateDBInstance</a>.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *         > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     *         <i>Amazon RDS User Guide.</i>
     *         </p>
     */
    public Boolean getEnableIAMDatabaseAuthentication() {
        return enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param enableIAMDatabaseAuthentication <p>
     *            A value that indicates whether to enable mapping of AWS
     *            Identity and Access Management (IAM) accounts to database
     *            accounts. By default, mapping is disabled. For information
     *            about the supported DB engines, see <a>CreateDBInstance</a>.
     *            </p>
     *            <p>
     *            For more information about IAM database authentication, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *            > IAM Database Authentication for MySQL and PostgreSQL</a> in
     *            the <i>Amazon RDS User Guide.</i>
     *            </p>
     */
    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableIAMDatabaseAuthentication <p>
     *            A value that indicates whether to enable mapping of AWS
     *            Identity and Access Management (IAM) accounts to database
     *            accounts. By default, mapping is disabled. For information
     *            about the supported DB engines, see <a>CreateDBInstance</a>.
     *            </p>
     *            <p>
     *            For more information about IAM database authentication, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *            > IAM Database Authentication for MySQL and PostgreSQL</a> in
     *            the <i>Amazon RDS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withEnableIAMDatabaseAuthentication(
            Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
        return this;
    }

    /**
     * <p>
     * The name of the engine of your source database.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     *
     * @return <p>
     *         The name of the engine of your source database.
     *         </p>
     *         <p>
     *         Valid Values: <code>mysql</code>
     *         </p>
     */
    public String getSourceEngine() {
        return sourceEngine;
    }

    /**
     * <p>
     * The name of the engine of your source database.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     *
     * @param sourceEngine <p>
     *            The name of the engine of your source database.
     *            </p>
     *            <p>
     *            Valid Values: <code>mysql</code>
     *            </p>
     */
    public void setSourceEngine(String sourceEngine) {
        this.sourceEngine = sourceEngine;
    }

    /**
     * <p>
     * The name of the engine of your source database.
     * </p>
     * <p>
     * Valid Values: <code>mysql</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEngine <p>
     *            The name of the engine of your source database.
     *            </p>
     *            <p>
     *            Valid Values: <code>mysql</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withSourceEngine(String sourceEngine) {
        this.sourceEngine = sourceEngine;
        return this;
    }

    /**
     * <p>
     * The engine version of your source database.
     * </p>
     * <p>
     * Valid Values: <code>5.6</code>
     * </p>
     *
     * @return <p>
     *         The engine version of your source database.
     *         </p>
     *         <p>
     *         Valid Values: <code>5.6</code>
     *         </p>
     */
    public String getSourceEngineVersion() {
        return sourceEngineVersion;
    }

    /**
     * <p>
     * The engine version of your source database.
     * </p>
     * <p>
     * Valid Values: <code>5.6</code>
     * </p>
     *
     * @param sourceEngineVersion <p>
     *            The engine version of your source database.
     *            </p>
     *            <p>
     *            Valid Values: <code>5.6</code>
     *            </p>
     */
    public void setSourceEngineVersion(String sourceEngineVersion) {
        this.sourceEngineVersion = sourceEngineVersion;
    }

    /**
     * <p>
     * The engine version of your source database.
     * </p>
     * <p>
     * Valid Values: <code>5.6</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEngineVersion <p>
     *            The engine version of your source database.
     *            </p>
     *            <p>
     *            Valid Values: <code>5.6</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withSourceEngineVersion(String sourceEngineVersion) {
        this.sourceEngineVersion = sourceEngineVersion;
        return this;
    }

    /**
     * <p>
     * The name of your Amazon S3 bucket that contains your database backup
     * file.
     * </p>
     *
     * @return <p>
     *         The name of your Amazon S3 bucket that contains your database
     *         backup file.
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The name of your Amazon S3 bucket that contains your database backup
     * file.
     * </p>
     *
     * @param s3BucketName <p>
     *            The name of your Amazon S3 bucket that contains your database
     *            backup file.
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of your Amazon S3 bucket that contains your database backup
     * file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3BucketName <p>
     *            The name of your Amazon S3 bucket that contains your database
     *            backup file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * The prefix of your Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         The prefix of your Amazon S3 bucket.
     *         </p>
     */
    public String getS3Prefix() {
        return s3Prefix;
    }

    /**
     * <p>
     * The prefix of your Amazon S3 bucket.
     * </p>
     *
     * @param s3Prefix <p>
     *            The prefix of your Amazon S3 bucket.
     *            </p>
     */
    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The prefix of your Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Prefix <p>
     *            The prefix of your Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
        return this;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role to allow Amazon RDS to
     * access your Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         An AWS Identity and Access Management (IAM) role to allow Amazon
     *         RDS to access your Amazon S3 bucket.
     *         </p>
     */
    public String getS3IngestionRoleArn() {
        return s3IngestionRoleArn;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role to allow Amazon RDS to
     * access your Amazon S3 bucket.
     * </p>
     *
     * @param s3IngestionRoleArn <p>
     *            An AWS Identity and Access Management (IAM) role to allow
     *            Amazon RDS to access your Amazon S3 bucket.
     *            </p>
     */
    public void setS3IngestionRoleArn(String s3IngestionRoleArn) {
        this.s3IngestionRoleArn = s3IngestionRoleArn;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role to allow Amazon RDS to
     * access your Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3IngestionRoleArn <p>
     *            An AWS Identity and Access Management (IAM) role to allow
     *            Amazon RDS to access your Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withS3IngestionRoleArn(String s3IngestionRoleArn) {
        this.s3IngestionRoleArn = s3IngestionRoleArn;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     * >Using Amazon Performance Insights</a> in the <i>Amazon Relational
     * Database Service User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable Performance Insights for
     *         the DB instance.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     *         >Using Amazon Performance Insights</a> in the <i>Amazon
     *         Relational Database Service User Guide</i>.
     *         </p>
     */
    public Boolean isEnablePerformanceInsights() {
        return enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     * >Using Amazon Performance Insights</a> in the <i>Amazon Relational
     * Database Service User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable Performance Insights for
     *         the DB instance.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     *         >Using Amazon Performance Insights</a> in the <i>Amazon
     *         Relational Database Service User Guide</i>.
     *         </p>
     */
    public Boolean getEnablePerformanceInsights() {
        return enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     * >Using Amazon Performance Insights</a> in the <i>Amazon Relational
     * Database Service User Guide</i>.
     * </p>
     *
     * @param enablePerformanceInsights <p>
     *            A value that indicates whether to enable Performance Insights
     *            for the DB instance.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     *            >Using Amazon Performance Insights</a> in the <i>Amazon
     *            Relational Database Service User Guide</i>.
     *            </p>
     */
    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     * >Using Amazon Performance Insights</a> in the <i>Amazon Relational
     * Database Service User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enablePerformanceInsights <p>
     *            A value that indicates whether to enable Performance Insights
     *            for the DB instance.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"
     *            >Using Amazon Performance Insights</a> in the <i>Amazon
     *            Relational Database Service User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withEnablePerformanceInsights(
            Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for
     * <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     * default encryption key. AWS KMS creates the default encryption key for
     * your AWS account. Your AWS account has a different default encryption key
     * for each AWS Region.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier for encryption of Performance Insights
     *         data. The KMS key ID is the Amazon Resource Name (ARN), the KMS
     *         key identifier, or the KMS key alias for the KMS encryption key.
     *         </p>
     *         <p>
     *         If you do not specify a value for
     *         <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses
     *         your default encryption key. AWS KMS creates the default
     *         encryption key for your AWS account. Your AWS account has a
     *         different default encryption key for each AWS Region.
     *         </p>
     */
    public String getPerformanceInsightsKMSKeyId() {
        return performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for
     * <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     * default encryption key. AWS KMS creates the default encryption key for
     * your AWS account. Your AWS account has a different default encryption key
     * for each AWS Region.
     * </p>
     *
     * @param performanceInsightsKMSKeyId <p>
     *            The AWS KMS key identifier for encryption of Performance
     *            Insights data. The KMS key ID is the Amazon Resource Name
     *            (ARN), the KMS key identifier, or the KMS key alias for the
     *            KMS encryption key.
     *            </p>
     *            <p>
     *            If you do not specify a value for
     *            <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses
     *            your default encryption key. AWS KMS creates the default
     *            encryption key for your AWS account. Your AWS account has a
     *            different default encryption key for each AWS Region.
     *            </p>
     */
    public void setPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for
     * <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     * default encryption key. AWS KMS creates the default encryption key for
     * your AWS account. Your AWS account has a different default encryption key
     * for each AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performanceInsightsKMSKeyId <p>
     *            The AWS KMS key identifier for encryption of Performance
     *            Insights data. The KMS key ID is the Amazon Resource Name
     *            (ARN), the KMS key identifier, or the KMS key alias for the
     *            KMS encryption key.
     *            </p>
     *            <p>
     *            If you do not specify a value for
     *            <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses
     *            your default encryption key. AWS KMS creates the default
     *            encryption key for your AWS account. Your AWS account has a
     *            different default encryption key for each AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withPerformanceInsightsKMSKeyId(
            String performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
        return this;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid
     * values are 7 or 731 (2 years).
     * </p>
     *
     * @return <p>
     *         The amount of time, in days, to retain Performance Insights data.
     *         Valid values are 7 or 731 (2 years).
     *         </p>
     */
    public Integer getPerformanceInsightsRetentionPeriod() {
        return performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid
     * values are 7 or 731 (2 years).
     * </p>
     *
     * @param performanceInsightsRetentionPeriod <p>
     *            The amount of time, in days, to retain Performance Insights
     *            data. Valid values are 7 or 731 (2 years).
     *            </p>
     */
    public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid
     * values are 7 or 731 (2 years).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performanceInsightsRetentionPeriod <p>
     *            The amount of time, in days, to retain Performance Insights
     *            data. Valid values are 7 or 731 (2 years).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withPerformanceInsightsRetentionPeriod(
            Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of logs that the restored DB instance is to export to
     *         CloudWatch Logs. The values in the list depend on the DB engine
     *         being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *         <i>Amazon RDS User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getEnableCloudwatchLogsExports() {
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB instance is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon RDS User Guide</i>.
     *            </p>
     */
    public void setEnableCloudwatchLogsExports(
            java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new java.util.ArrayList<String>(
                enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB instance is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon RDS User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withEnableCloudwatchLogsExports(
            String... enableCloudwatchLogsExports) {
        if (getEnableCloudwatchLogsExports() == null) {
            this.enableCloudwatchLogsExports = new java.util.ArrayList<String>(
                    enableCloudwatchLogsExports.length);
        }
        for (String value : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB instance is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon RDS User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withEnableCloudwatchLogsExports(
            java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     *
     * @return <p>
     *         The number of CPU cores and the number of threads per core for
     *         the DB instance class of the DB instance.
     *         </p>
     */
    public java.util.List<ProcessorFeature> getProcessorFeatures() {
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance.
     *            </p>
     */
    public void setProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new java.util.ArrayList<ProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withProcessorFeatures(
            ProcessorFeature... processorFeatures) {
        if (getProcessorFeatures() == null) {
            this.processorFeatures = new java.util.ArrayList<ProcessorFeature>(
                    processorFeatures.length);
        }
        for (ProcessorFeature value : processorFeatures) {
            this.processorFeatures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withProcessorFeatures(
            java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance class of the DB
     *         instance uses its default processor features.
     *         </p>
     */
    public Boolean isUseDefaultProcessorFeatures() {
        return useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance class of the DB
     *         instance uses its default processor features.
     *         </p>
     */
    public Boolean getUseDefaultProcessorFeatures() {
        return useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     *
     * @param useDefaultProcessorFeatures <p>
     *            A value that indicates whether the DB instance class of the DB
     *            instance uses its default processor features.
     *            </p>
     */
    public void setUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useDefaultProcessorFeatures <p>
     *            A value that indicates whether the DB instance class of the DB
     *            instance uses its default processor features.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withUseDefaultProcessorFeatures(
            Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance has deletion
     *         protection enabled. The database can't be deleted when deletion
     *         protection is enabled. By default, deletion protection is
     *         disabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *         > Deleting a DB Instance</a>.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance has deletion
     *         protection enabled. The database can't be deleted when deletion
     *         protection is enabled. By default, deletion protection is
     *         disabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *         > Deleting a DB Instance</a>.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @param deletionProtection <p>
     *            A value that indicates whether the DB instance has deletion
     *            protection enabled. The database can't be deleted when
     *            deletion protection is enabled. By default, deletion
     *            protection is disabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *            > Deleting a DB Instance</a>.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            A value that indicates whether the DB instance has deletion
     *            protection enabled. The database can't be deleted when
     *            deletion protection is enabled. By default, deletion
     *            protection is disabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *            > Deleting a DB Instance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromS3Request withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
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
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: " + getDBSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: " + getMonitoringInterval() + ",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: " + getMonitoringRoleArn() + ",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: " + getEnableIAMDatabaseAuthentication()
                    + ",");
        if (getSourceEngine() != null)
            sb.append("SourceEngine: " + getSourceEngine() + ",");
        if (getSourceEngineVersion() != null)
            sb.append("SourceEngineVersion: " + getSourceEngineVersion() + ",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: " + getS3Prefix() + ",");
        if (getS3IngestionRoleArn() != null)
            sb.append("S3IngestionRoleArn: " + getS3IngestionRoleArn() + ",");
        if (getEnablePerformanceInsights() != null)
            sb.append("EnablePerformanceInsights: " + getEnablePerformanceInsights() + ",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: " + getPerformanceInsightsKMSKeyId() + ",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: "
                    + getPerformanceInsightsRetentionPeriod() + ",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: " + getEnableCloudwatchLogsExports() + ",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: " + getProcessorFeatures() + ",");
        if (getUseDefaultProcessorFeatures() != null)
            sb.append("UseDefaultProcessorFeatures: " + getUseDefaultProcessorFeatures() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode
                + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableIAMDatabaseAuthentication() == null) ? 0
                        : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode
                + ((getSourceEngine() == null) ? 0 : getSourceEngine().hashCode());
        hashCode = prime * hashCode
                + ((getSourceEngineVersion() == null) ? 0 : getSourceEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode
                + ((getS3IngestionRoleArn() == null) ? 0 : getS3IngestionRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPerformanceInsightsKMSKeyId() == null) ? 0
                        : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPerformanceInsightsRetentionPeriod() == null) ? 0
                        : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableCloudwatchLogsExports() == null) ? 0
                        : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode
                + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseDefaultProcessorFeatures() == null) ? 0
                        : getUseDefaultProcessorFeatures().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBInstanceFromS3Request == false)
            return false;
        RestoreDBInstanceFromS3Request other = (RestoreDBInstanceFromS3Request) obj;

        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null)
            return false;
        if (other.getDBSecurityGroups() != null
                && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null
                && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null
                && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null
                && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null)
            return false;
        if (other.getMonitoringInterval() != null
                && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null
                && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null
                ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(
                        this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getSourceEngine() == null ^ this.getSourceEngine() == null)
            return false;
        if (other.getSourceEngine() != null
                && other.getSourceEngine().equals(this.getSourceEngine()) == false)
            return false;
        if (other.getSourceEngineVersion() == null ^ this.getSourceEngineVersion() == null)
            return false;
        if (other.getSourceEngineVersion() != null
                && other.getSourceEngineVersion().equals(this.getSourceEngineVersion()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getS3IngestionRoleArn() == null ^ this.getS3IngestionRoleArn() == null)
            return false;
        if (other.getS3IngestionRoleArn() != null
                && other.getS3IngestionRoleArn().equals(this.getS3IngestionRoleArn()) == false)
            return false;
        if (other.getEnablePerformanceInsights() == null
                ^ this.getEnablePerformanceInsights() == null)
            return false;
        if (other.getEnablePerformanceInsights() != null
                && other.getEnablePerformanceInsights().equals(this.getEnablePerformanceInsights()) == false)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() == null
                ^ this.getPerformanceInsightsKMSKeyId() == null)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() != null
                && other.getPerformanceInsightsKMSKeyId().equals(
                        this.getPerformanceInsightsKMSKeyId()) == false)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() == null
                ^ this.getPerformanceInsightsRetentionPeriod() == null)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() != null
                && other.getPerformanceInsightsRetentionPeriod().equals(
                        this.getPerformanceInsightsRetentionPeriod()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null
                ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null
                && other.getEnableCloudwatchLogsExports().equals(
                        this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null
                && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getUseDefaultProcessorFeatures() == null
                ^ this.getUseDefaultProcessorFeatures() == null)
            return false;
        if (other.getUseDefaultProcessorFeatures() != null
                && other.getUseDefaultProcessorFeatures().equals(
                        this.getUseDefaultProcessorFeatures()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        return true;
    }
}
