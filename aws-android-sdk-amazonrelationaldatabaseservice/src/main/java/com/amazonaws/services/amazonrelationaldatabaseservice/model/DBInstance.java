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

/**
 * <p>
 * Contains the details of an Amazon RDS DB instance.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBInstances</code> action.
 * </p>
 */
public class DBInstance implements Serializable {
    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html"
     * >DB Instance Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private String dBInstanceStatus;

    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     */
    private String masterUsername;

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     */
    private String dBName;

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     */
    private Endpoint endpoint;

    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     */
    private java.util.Date instanceCreateTime;

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     */
    private String preferredBackupWindow;

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     */
    private Integer backupRetentionPeriod;

    /**
     * <p>
     * A list of DB security group elements containing
     * <code>DBSecurityGroup.Name</code> and <code>DBSecurityGroup.Status</code>
     * subelements.
     * </p>
     */
    private java.util.List<DBSecurityGroupMembership> dBSecurityGroups;

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance
     * belongs to.
     * </p>
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups;

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     */
    private java.util.List<DBParameterGroupStatus> dBParameterGroups;

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     * </p>
     */
    private DBSubnetGroup dBSubnetGroup;

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are identified
     * by subelements.
     * </p>
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     */
    private java.util.Date latestRestorableTime;

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is
     * a read replica.
     * </p>
     */
    private String readReplicaSourceDBInstanceIdentifier;

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     * </p>
     */
    private java.util.List<String> readReplicaDBInstanceIdentifiers;

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS
     * DB instance is replicated as a read replica. For example, when you create
     * an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not
     * contain information about cross region Aurora read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     */
    private java.util.List<String> readReplicaDBClusterIdentifiers;

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     */
    private java.util.List<OptionGroupMembership> optionGroupMemberships;

    /**
     * <p>
     * If present, specifies the name of the character set that this instance is
     * associated with.
     * </p>
     */
    private String characterSetName;

    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a
     * DB instance with multi-AZ support.
     * </p>
     */
    private String secondaryAvailabilityZone;

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true
     * specifies an Internet-facing instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. A value of false specifies
     * an internal instance with a DNS name that resolves to a private IP
     * address.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this
     * is blank.
     * </p>
     */
    private java.util.List<DBInstanceStatusInfo> statusInfos;

    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     */
    private String tdeCredentialArn;

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     */
    private Integer dbInstancePort;

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     */
    private String cACertificateIdentifier;

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * instance.
     * </p>
     */
    private java.util.List<DomainMembership> domainMemberships;

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of
     * the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance.
     * </p>
     */
    private Integer monitoringInterval;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream
     * that receives the Enhanced Monitoring metrics data for the DB instance.
     * </p>
     */
    private String enhancedMonitoringResourceArn;

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring
     * metrics to Amazon CloudWatch Logs.
     * </p>
     */
    private String monitoringRoleArn;

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted
     * to the primary instance after a failure of the existing primary instance.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     */
    private Integer promotionTier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     */
    private String dBInstanceArn;

    /**
     * <p>
     * The time zone of the DB instance. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for Microsoft SQL Server DB instances that were created with
     * a time zone specified.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora,
     * see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and
     * otherwise false.
     * </p>
     */
    private Boolean performanceInsightsEnabled;

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
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
     * A list of log types that this DB instance is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private java.util.List<String> enabledCloudwatchLogsExports;

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     */
    private java.util.List<ProcessorFeature> processorFeatures;

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The
     * database can't be deleted when deletion protection is enabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     */
    private java.util.List<DBInstanceRole> associatedRoles;

    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     */
    private Endpoint listenerEndpoint;

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage
     * of the DB instance.
     * </p>
     */
    private Integer maxAllocatedStorage;

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     *
     * @return <p>
     *         Contains a user-supplied database identifier. This identifier is
     *         the unique key that identifies a DB instance.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            Contains a user-supplied database identifier. This identifier
     *            is the unique key that identifies a DB instance.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the
     * unique key that identifies a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            Contains a user-supplied database identifier. This identifier
     *            is the unique key that identifies a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     *
     * @return <p>
     *         Contains the name of the compute and memory capacity class of the
     *         DB instance.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            Contains the name of the compute and memory capacity class of
     *            the DB instance.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            Contains the name of the compute and memory capacity class of
     *            the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     *
     * @return <p>
     *         Provides the name of the database engine to be used for this DB
     *         instance.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     *
     * @param engine <p>
     *            Provides the name of the database engine to be used for this
     *            DB instance.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            Provides the name of the database engine to be used for this
     *            DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html"
     * >DB Instance Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Specifies the current state of this database.
     *         </p>
     *         <p>
     *         For information about DB instance statuses, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html"
     *         >DB Instance Status</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     */
    public String getDBInstanceStatus() {
        return dBInstanceStatus;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html"
     * >DB Instance Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param dBInstanceStatus <p>
     *            Specifies the current state of this database.
     *            </p>
     *            <p>
     *            For information about DB instance statuses, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html"
     *            >DB Instance Status</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     */
    public void setDBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * <p>
     * For information about DB instance statuses, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html"
     * >DB Instance Status</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceStatus <p>
     *            Specifies the current state of this database.
     *            </p>
     *            <p>
     *            For information about DB instance statuses, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Status.html"
     *            >DB Instance Status</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
        return this;
    }

    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     *
     * @return <p>
     *         Contains the master username for the DB instance.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     *
     * @param masterUsername <p>
     *            Contains the master username for the DB instance.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            Contains the master username for the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     *
     * @return <p>
     *         The meaning of this parameter differs according to the database
     *         engine you use.
     *         </p>
     *         <p>
     *         <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *         </p>
     *         <p>
     *         Contains the name of the initial database of this instance that
     *         was provided at create time, if one was specified when the DB
     *         instance was created. This same name is returned for the life of
     *         the DB instance.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Contains the Oracle System ID (SID) of the created DB instance.
     *         Not shown when the returned parameters do not apply to an Oracle
     *         DB instance.
     *         </p>
     */
    public String getDBName() {
        return dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     *
     * @param dBName <p>
     *            The meaning of this parameter differs according to the
     *            database engine you use.
     *            </p>
     *            <p>
     *            <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *            </p>
     *            <p>
     *            Contains the name of the initial database of this instance
     *            that was provided at create time, if one was specified when
     *            the DB instance was created. This same name is returned for
     *            the life of the DB instance.
     *            </p>
     *            <p>
     *            Type: String
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Contains the Oracle System ID (SID) of the created DB
     *            instance. Not shown when the returned parameters do not apply
     *            to an Oracle DB instance.
     *            </p>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB instance was
     * created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown
     * when the returned parameters do not apply to an Oracle DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBName <p>
     *            The meaning of this parameter differs according to the
     *            database engine you use.
     *            </p>
     *            <p>
     *            <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *            </p>
     *            <p>
     *            Contains the name of the initial database of this instance
     *            that was provided at create time, if one was specified when
     *            the DB instance was created. This same name is returned for
     *            the life of the DB instance.
     *            </p>
     *            <p>
     *            Type: String
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Contains the Oracle System ID (SID) of the created DB
     *            instance. Not shown when the returned parameters do not apply
     *            to an Oracle DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     *
     * @return <p>
     *         Specifies the connection endpoint.
     *         </p>
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     *
     * @param endpoint <p>
     *            Specifies the connection endpoint.
     *            </p>
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            Specifies the connection endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     *
     * @return <p>
     *         Specifies the allocated storage size specified in gibibytes.
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     *
     * @param allocatedStorage <p>
     *            Specifies the allocated storage size specified in gibibytes.
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size specified in gibibytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            Specifies the allocated storage size specified in gibibytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     *
     * @return <p>
     *         Provides the date and time the DB instance was created.
     *         </p>
     */
    public java.util.Date getInstanceCreateTime() {
        return instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     *
     * @param instanceCreateTime <p>
     *            Provides the date and time the DB instance was created.
     *            </p>
     */
    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCreateTime <p>
     *            Provides the date and time the DB instance was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>.
     *         </p>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     *
     * @param preferredBackupWindow <p>
     *            Specifies the daily time range during which automated backups
     *            are created if automated backups are enabled, as determined by
     *            the <code>BackupRetentionPeriod</code>.
     *            </p>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredBackupWindow <p>
     *            Specifies the daily time range during which automated backups
     *            are created if automated backups are enabled, as determined by
     *            the <code>BackupRetentionPeriod</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     *
     * @return <p>
     *         Specifies the number of days for which automatic DB snapshots are
     *         retained.
     *         </p>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     *
     * @param backupRetentionPeriod <p>
     *            Specifies the number of days for which automatic DB snapshots
     *            are retained.
     *            </p>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionPeriod <p>
     *            Specifies the number of days for which automatic DB snapshots
     *            are retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * A list of DB security group elements containing
     * <code>DBSecurityGroup.Name</code> and <code>DBSecurityGroup.Status</code>
     * subelements.
     * </p>
     *
     * @return <p>
     *         A list of DB security group elements containing
     *         <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     *         </p>
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroups() {
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security group elements containing
     * <code>DBSecurityGroup.Name</code> and <code>DBSecurityGroup.Status</code>
     * subelements.
     * </p>
     *
     * @param dBSecurityGroups <p>
     *            A list of DB security group elements containing
     *            <code>DBSecurityGroup.Name</code> and
     *            <code>DBSecurityGroup.Status</code> subelements.
     *            </p>
     */
    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security group elements containing
     * <code>DBSecurityGroup.Name</code> and <code>DBSecurityGroup.Status</code>
     * subelements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroups <p>
     *            A list of DB security group elements containing
     *            <code>DBSecurityGroup.Name</code> and
     *            <code>DBSecurityGroup.Status</code> subelements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBSecurityGroups(DBSecurityGroupMembership... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) {
            this.dBSecurityGroups = new java.util.ArrayList<DBSecurityGroupMembership>(
                    dBSecurityGroups.length);
        }
        for (DBSecurityGroupMembership value : dBSecurityGroups) {
            this.dBSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB security group elements containing
     * <code>DBSecurityGroup.Name</code> and <code>DBSecurityGroup.Status</code>
     * subelements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroups <p>
     *            A list of DB security group elements containing
     *            <code>DBSecurityGroup.Name</code> and
     *            <code>DBSecurityGroup.Status</code> subelements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBSecurityGroups(
            java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance
     * belongs to.
     * </p>
     *
     * @return <p>
     *         Provides a list of VPC security group elements that the DB
     *         instance belongs to.
     *         </p>
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance
     * belongs to.
     * </p>
     *
     * @param vpcSecurityGroups <p>
     *            Provides a list of VPC security group elements that the DB
     *            instance belongs to.
     *            </p>
     */
    public void setVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(
                vpcSecurityGroups);
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance
     * belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            Provides a list of VPC security group elements that the DB
     *            instance belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (getVpcSecurityGroups() == null) {
            this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(
                    vpcSecurityGroups.length);
        }
        for (VpcSecurityGroupMembership value : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance
     * belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            Provides a list of VPC security group elements that the DB
     *            instance belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     *
     * @return <p>
     *         Provides the list of DB parameter groups applied to this DB
     *         instance.
     *         </p>
     */
    public java.util.List<DBParameterGroupStatus> getDBParameterGroups() {
        return dBParameterGroups;
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     *
     * @param dBParameterGroups <p>
     *            Provides the list of DB parameter groups applied to this DB
     *            instance.
     *            </p>
     */
    public void setDBParameterGroups(java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
            return;
        }

        this.dBParameterGroups = new java.util.ArrayList<DBParameterGroupStatus>(dBParameterGroups);
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroups <p>
     *            Provides the list of DB parameter groups applied to this DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBParameterGroups(DBParameterGroupStatus... dBParameterGroups) {
        if (getDBParameterGroups() == null) {
            this.dBParameterGroups = new java.util.ArrayList<DBParameterGroupStatus>(
                    dBParameterGroups.length);
        }
        for (DBParameterGroupStatus value : dBParameterGroups) {
            this.dBParameterGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of DB parameter groups applied to this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroups <p>
     *            Provides the list of DB parameter groups applied to this DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBParameterGroups(
            java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        setDBParameterGroups(dBParameterGroups);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the Availability Zone the DB instance is
     *         located in.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     * </p>
     *
     * @param availabilityZone <p>
     *            Specifies the name of the Availability Zone the DB instance is
     *            located in.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            Specifies the name of the Availability Zone the DB instance is
     *            located in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     * </p>
     *
     * @return <p>
     *         Specifies information on the subnet group associated with the DB
     *         instance, including the name, description, and subnets in the
     *         subnet group.
     *         </p>
     */
    public DBSubnetGroup getDBSubnetGroup() {
        return dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     * </p>
     *
     * @param dBSubnetGroup <p>
     *            Specifies information on the subnet group associated with the
     *            DB instance, including the name, description, and subnets in
     *            the subnet group.
     *            </p>
     */
    public void setDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroup <p>
     *            Specifies information on the subnet group associated with the
     *            DB instance, including the name, description, and subnets in
     *            the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     *
     * @return <p>
     *         Specifies the weekly time range during which system maintenance
     *         can occur, in Universal Coordinated Time (UTC).
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            Specifies the weekly time range during which system
     *            maintenance can occur, in Universal Coordinated Time (UTC).
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            Specifies the weekly time range during which system
     *            maintenance can occur, in Universal Coordinated Time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are identified
     * by subelements.
     * </p>
     *
     * @return <p>
     *         Specifies that changes to the DB instance are pending. This
     *         element is only included when changes are pending. Specific
     *         changes are identified by subelements.
     *         </p>
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }

    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are identified
     * by subelements.
     * </p>
     *
     * @param pendingModifiedValues <p>
     *            Specifies that changes to the DB instance are pending. This
     *            element is only included when changes are pending. Specific
     *            changes are identified by subelements.
     *            </p>
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are identified
     * by subelements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingModifiedValues <p>
     *            Specifies that changes to the DB instance are pending. This
     *            element is only included when changes are pending. Specific
     *            changes are identified by subelements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     *
     * @return <p>
     *         Specifies the latest time to which a database can be restored
     *         with point-in-time restore.
     *         </p>
     */
    public java.util.Date getLatestRestorableTime() {
        return latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     *
     * @param latestRestorableTime <p>
     *            Specifies the latest time to which a database can be restored
     *            with point-in-time restore.
     *            </p>
     */
    public void setLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestRestorableTime <p>
     *            Specifies the latest time to which a database can be restored
     *            with point-in-time restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     *
     * @return <p>
     *         Specifies if the DB instance is a Multi-AZ deployment.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     *
     * @return <p>
     *         Specifies if the DB instance is a Multi-AZ deployment.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     *
     * @param multiAZ <p>
     *            Specifies if the DB instance is a Multi-AZ deployment.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            Specifies if the DB instance is a Multi-AZ deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     *
     * @return <p>
     *         Indicates the database engine version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     *
     * @param engineVersion <p>
     *            Indicates the database engine version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            Indicates the database engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     *
     * @return <p>
     *         Indicates that minor version patches are applied automatically.
     *         </p>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     *
     * @return <p>
     *         Indicates that minor version patches are applied automatically.
     *         </p>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     *
     * @param autoMinorVersionUpgrade <p>
     *            Indicates that minor version patches are applied
     *            automatically.
     *            </p>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            Indicates that minor version patches are applied
     *            automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is
     * a read replica.
     * </p>
     *
     * @return <p>
     *         Contains the identifier of the source DB instance if this DB
     *         instance is a read replica.
     *         </p>
     */
    public String getReadReplicaSourceDBInstanceIdentifier() {
        return readReplicaSourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is
     * a read replica.
     * </p>
     *
     * @param readReplicaSourceDBInstanceIdentifier <p>
     *            Contains the identifier of the source DB instance if this DB
     *            instance is a read replica.
     *            </p>
     */
    public void setReadReplicaSourceDBInstanceIdentifier(
            String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB instance if this DB instance is
     * a read replica.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaSourceDBInstanceIdentifier <p>
     *            Contains the identifier of the source DB instance if this DB
     *            instance is a read replica.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withReadReplicaSourceDBInstanceIdentifier(
            String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     * </p>
     *
     * @return <p>
     *         Contains one or more identifiers of the read replicas associated
     *         with this DB instance.
     *         </p>
     */
    public java.util.List<String> getReadReplicaDBInstanceIdentifiers() {
        return readReplicaDBInstanceIdentifiers;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     * </p>
     *
     * @param readReplicaDBInstanceIdentifiers <p>
     *            Contains one or more identifiers of the read replicas
     *            associated with this DB instance.
     *            </p>
     */
    public void setReadReplicaDBInstanceIdentifiers(
            java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        if (readReplicaDBInstanceIdentifiers == null) {
            this.readReplicaDBInstanceIdentifiers = null;
            return;
        }

        this.readReplicaDBInstanceIdentifiers = new java.util.ArrayList<String>(
                readReplicaDBInstanceIdentifiers);
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaDBInstanceIdentifiers <p>
     *            Contains one or more identifiers of the read replicas
     *            associated with this DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withReadReplicaDBInstanceIdentifiers(
            String... readReplicaDBInstanceIdentifiers) {
        if (getReadReplicaDBInstanceIdentifiers() == null) {
            this.readReplicaDBInstanceIdentifiers = new java.util.ArrayList<String>(
                    readReplicaDBInstanceIdentifiers.length);
        }
        for (String value : readReplicaDBInstanceIdentifiers) {
            this.readReplicaDBInstanceIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaDBInstanceIdentifiers <p>
     *            Contains one or more identifiers of the read replicas
     *            associated with this DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withReadReplicaDBInstanceIdentifiers(
            java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        setReadReplicaDBInstanceIdentifiers(readReplicaDBInstanceIdentifiers);
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS
     * DB instance is replicated as a read replica. For example, when you create
     * an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not
     * contain information about cross region Aurora read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     *
     * @return <p>
     *         Contains one or more identifiers of Aurora DB clusters to which
     *         the RDS DB instance is replicated as a read replica. For example,
     *         when you create an Aurora read replica of an RDS MySQL DB
     *         instance, the Aurora MySQL DB cluster for the Aurora read replica
     *         is shown. This output does not contain information about cross
     *         region Aurora read replicas.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, each RDS DB instance can have only one Aurora read
     *         replica.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getReadReplicaDBClusterIdentifiers() {
        return readReplicaDBClusterIdentifiers;
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS
     * DB instance is replicated as a read replica. For example, when you create
     * an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not
     * contain information about cross region Aurora read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     *
     * @param readReplicaDBClusterIdentifiers <p>
     *            Contains one or more identifiers of Aurora DB clusters to
     *            which the RDS DB instance is replicated as a read replica. For
     *            example, when you create an Aurora read replica of an RDS
     *            MySQL DB instance, the Aurora MySQL DB cluster for the Aurora
     *            read replica is shown. This output does not contain
     *            information about cross region Aurora read replicas.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, each RDS DB instance can have only one Aurora read
     *            replica.
     *            </p>
     *            </note>
     */
    public void setReadReplicaDBClusterIdentifiers(
            java.util.Collection<String> readReplicaDBClusterIdentifiers) {
        if (readReplicaDBClusterIdentifiers == null) {
            this.readReplicaDBClusterIdentifiers = null;
            return;
        }

        this.readReplicaDBClusterIdentifiers = new java.util.ArrayList<String>(
                readReplicaDBClusterIdentifiers);
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS
     * DB instance is replicated as a read replica. For example, when you create
     * an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not
     * contain information about cross region Aurora read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaDBClusterIdentifiers <p>
     *            Contains one or more identifiers of Aurora DB clusters to
     *            which the RDS DB instance is replicated as a read replica. For
     *            example, when you create an Aurora read replica of an RDS
     *            MySQL DB instance, the Aurora MySQL DB cluster for the Aurora
     *            read replica is shown. This output does not contain
     *            information about cross region Aurora read replicas.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, each RDS DB instance can have only one Aurora read
     *            replica.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withReadReplicaDBClusterIdentifiers(String... readReplicaDBClusterIdentifiers) {
        if (getReadReplicaDBClusterIdentifiers() == null) {
            this.readReplicaDBClusterIdentifiers = new java.util.ArrayList<String>(
                    readReplicaDBClusterIdentifiers.length);
        }
        for (String value : readReplicaDBClusterIdentifiers) {
            this.readReplicaDBClusterIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of Aurora DB clusters to which the RDS
     * DB instance is replicated as a read replica. For example, when you create
     * an Aurora read replica of an RDS MySQL DB instance, the Aurora MySQL DB
     * cluster for the Aurora read replica is shown. This output does not
     * contain information about cross region Aurora read replicas.
     * </p>
     * <note>
     * <p>
     * Currently, each RDS DB instance can have only one Aurora read replica.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaDBClusterIdentifiers <p>
     *            Contains one or more identifiers of Aurora DB clusters to
     *            which the RDS DB instance is replicated as a read replica. For
     *            example, when you create an Aurora read replica of an RDS
     *            MySQL DB instance, the Aurora MySQL DB cluster for the Aurora
     *            read replica is shown. This output does not contain
     *            information about cross region Aurora read replicas.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, each RDS DB instance can have only one Aurora read
     *            replica.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withReadReplicaDBClusterIdentifiers(
            java.util.Collection<String> readReplicaDBClusterIdentifiers) {
        setReadReplicaDBClusterIdentifiers(readReplicaDBClusterIdentifiers);
        return this;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     *
     * @return <p>
     *         License model information for this DB instance.
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     *
     * @param licenseModel <p>
     *            License model information for this DB instance.
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            License model information for this DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     *
     * @return <p>
     *         Specifies the Provisioned IOPS (I/O operations per second) value.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     *
     * @param iops <p>
     *            Specifies the Provisioned IOPS (I/O operations per second)
     *            value.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            Specifies the Provisioned IOPS (I/O operations per second)
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     *
     * @return <p>
     *         Provides the list of option group memberships for this DB
     *         instance.
     *         </p>
     */
    public java.util.List<OptionGroupMembership> getOptionGroupMemberships() {
        return optionGroupMemberships;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     *
     * @param optionGroupMemberships <p>
     *            Provides the list of option group memberships for this DB
     *            instance.
     *            </p>
     */
    public void setOptionGroupMemberships(
            java.util.Collection<OptionGroupMembership> optionGroupMemberships) {
        if (optionGroupMemberships == null) {
            this.optionGroupMemberships = null;
            return;
        }

        this.optionGroupMemberships = new java.util.ArrayList<OptionGroupMembership>(
                optionGroupMemberships);
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupMemberships <p>
     *            Provides the list of option group memberships for this DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withOptionGroupMemberships(OptionGroupMembership... optionGroupMemberships) {
        if (getOptionGroupMemberships() == null) {
            this.optionGroupMemberships = new java.util.ArrayList<OptionGroupMembership>(
                    optionGroupMemberships.length);
        }
        for (OptionGroupMembership value : optionGroupMemberships) {
            this.optionGroupMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupMemberships <p>
     *            Provides the list of option group memberships for this DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withOptionGroupMemberships(
            java.util.Collection<OptionGroupMembership> optionGroupMemberships) {
        setOptionGroupMemberships(optionGroupMemberships);
        return this;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this instance is
     * associated with.
     * </p>
     *
     * @return <p>
     *         If present, specifies the name of the character set that this
     *         instance is associated with.
     *         </p>
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this instance is
     * associated with.
     * </p>
     *
     * @param characterSetName <p>
     *            If present, specifies the name of the character set that this
     *            instance is associated with.
     *            </p>
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this instance is
     * associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterSetName <p>
     *            If present, specifies the name of the character set that this
     *            instance is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a
     * DB instance with multi-AZ support.
     * </p>
     *
     * @return <p>
     *         If present, specifies the name of the secondary Availability Zone
     *         for a DB instance with multi-AZ support.
     *         </p>
     */
    public String getSecondaryAvailabilityZone() {
        return secondaryAvailabilityZone;
    }

    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a
     * DB instance with multi-AZ support.
     * </p>
     *
     * @param secondaryAvailabilityZone <p>
     *            If present, specifies the name of the secondary Availability
     *            Zone for a DB instance with multi-AZ support.
     *            </p>
     */
    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    /**
     * <p>
     * If present, specifies the name of the secondary Availability Zone for a
     * DB instance with multi-AZ support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondaryAvailabilityZone <p>
     *            If present, specifies the name of the secondary Availability
     *            Zone for a DB instance with multi-AZ support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true
     * specifies an Internet-facing instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. A value of false specifies
     * an internal instance with a DNS name that resolves to a private IP
     * address.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for the DB instance. A value
     *         of true specifies an Internet-facing instance with a publicly
     *         resolvable DNS name, which resolves to a public IP address. A
     *         value of false specifies an internal instance with a DNS name
     *         that resolves to a private IP address.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true
     * specifies an Internet-facing instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. A value of false specifies
     * an internal instance with a DNS name that resolves to a private IP
     * address.
     * </p>
     *
     * @return <p>
     *         Specifies the accessibility options for the DB instance. A value
     *         of true specifies an Internet-facing instance with a publicly
     *         resolvable DNS name, which resolves to a public IP address. A
     *         value of false specifies an internal instance with a DNS name
     *         that resolves to a private IP address.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true
     * specifies an Internet-facing instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. A value of false specifies
     * an internal instance with a DNS name that resolves to a private IP
     * address.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for the DB instance. A
     *            value of true specifies an Internet-facing instance with a
     *            publicly resolvable DNS name, which resolves to a public IP
     *            address. A value of false specifies an internal instance with
     *            a DNS name that resolves to a private IP address.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true
     * specifies an Internet-facing instance with a publicly resolvable DNS
     * name, which resolves to a public IP address. A value of false specifies
     * an internal instance with a DNS name that resolves to a private IP
     * address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            Specifies the accessibility options for the DB instance. A
     *            value of true specifies an Internet-facing instance with a
     *            publicly resolvable DNS name, which resolves to a public IP
     *            address. A value of false specifies an internal instance with
     *            a DNS name that resolves to a private IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this
     * is blank.
     * </p>
     *
     * @return <p>
     *         The status of a read replica. If the instance isn't a read
     *         replica, this is blank.
     *         </p>
     */
    public java.util.List<DBInstanceStatusInfo> getStatusInfos() {
        return statusInfos;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this
     * is blank.
     * </p>
     *
     * @param statusInfos <p>
     *            The status of a read replica. If the instance isn't a read
     *            replica, this is blank.
     *            </p>
     */
    public void setStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        if (statusInfos == null) {
            this.statusInfos = null;
            return;
        }

        this.statusInfos = new java.util.ArrayList<DBInstanceStatusInfo>(statusInfos);
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this
     * is blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusInfos <p>
     *            The status of a read replica. If the instance isn't a read
     *            replica, this is blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withStatusInfos(DBInstanceStatusInfo... statusInfos) {
        if (getStatusInfos() == null) {
            this.statusInfos = new java.util.ArrayList<DBInstanceStatusInfo>(statusInfos.length);
        }
        for (DBInstanceStatusInfo value : statusInfos) {
            this.statusInfos.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this
     * is blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusInfos <p>
     *            The status of a read replica. If the instance isn't a read
     *            replica, this is blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        setStatusInfos(statusInfos);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     *
     * @return <p>
     *         Specifies the storage type associated with DB instance.
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     *
     * @param storageType <p>
     *            Specifies the storage type associated with DB instance.
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            Specifies the storage type associated with DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     *
     * @return <p>
     *         The ARN from the key store with which the instance is associated
     *         for TDE encryption.
     *         </p>
     */
    public String getTdeCredentialArn() {
        return tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which the instance is
     *            associated for TDE encryption.
     *            </p>
     */
    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which the instance is
     *            associated for TDE encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     *
     * @return <p>
     *         Specifies the port that the DB instance listens on. If the DB
     *         instance is part of a DB cluster, this can be a different port
     *         than the DB cluster port.
     *         </p>
     */
    public Integer getDbInstancePort() {
        return dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     *
     * @param dbInstancePort <p>
     *            Specifies the port that the DB instance listens on. If the DB
     *            instance is part of a DB cluster, this can be a different port
     *            than the DB cluster port.
     *            </p>
     */
    public void setDbInstancePort(Integer dbInstancePort) {
        this.dbInstancePort = dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is
     * part of a DB cluster, this can be a different port than the DB cluster
     * port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbInstancePort <p>
     *            Specifies the port that the DB instance listens on. If the DB
     *            instance is part of a DB cluster, this can be a different port
     *            than the DB cluster port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDbInstancePort(Integer dbInstancePort) {
        this.dbInstancePort = dbInstancePort;
        return this;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     *
     * @return <p>
     *         If the DB instance is a member of a DB cluster, contains the name
     *         of the DB cluster that the DB instance is a member of.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            If the DB instance is a member of a DB cluster, contains the
     *            name of the DB cluster that the DB instance is a member of.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the
     * DB cluster that the DB instance is a member of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            If the DB instance is a member of a DB cluster, contains the
     *            name of the DB cluster that the DB instance is a member of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB instance is encrypted.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB instance is encrypted.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB instance is encrypted.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB instance is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     *
     * @return <p>
     *         If <code>StorageEncrypted</code> is true, the AWS KMS key
     *         identifier for the encrypted DB instance.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is true, the AWS KMS key
     *            identifier for the encrypted DB instance.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is true, the AWS KMS key
     *            identifier for the encrypted DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     *
     * @return <p>
     *         The AWS Region-unique, immutable identifier for the DB instance.
     *         This identifier is found in AWS CloudTrail log entries whenever
     *         the AWS KMS key for the DB instance is accessed.
     *         </p>
     */
    public String getDbiResourceId() {
        return dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     *
     * @param dbiResourceId <p>
     *            The AWS Region-unique, immutable identifier for the DB
     *            instance. This identifier is found in AWS CloudTrail log
     *            entries whenever the AWS KMS key for the DB instance is
     *            accessed.
     *            </p>
     */
    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB instance is accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbiResourceId <p>
     *            The AWS Region-unique, immutable identifier for the DB
     *            instance. This identifier is found in AWS CloudTrail log
     *            entries whenever the AWS KMS key for the DB instance is
     *            accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     *
     * @return <p>
     *         The identifier of the CA certificate for this DB instance.
     *         </p>
     */
    public String getCACertificateIdentifier() {
        return cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     *
     * @param cACertificateIdentifier <p>
     *            The identifier of the CA certificate for this DB instance.
     *            </p>
     */
    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cACertificateIdentifier <p>
     *            The identifier of the CA certificate for this DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
        return this;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * instance.
     * </p>
     *
     * @return <p>
     *         The Active Directory Domain membership records associated with
     *         the DB instance.
     *         </p>
     */
    public java.util.List<DomainMembership> getDomainMemberships() {
        return domainMemberships;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * instance.
     * </p>
     *
     * @param domainMemberships <p>
     *            The Active Directory Domain membership records associated with
     *            the DB instance.
     *            </p>
     */
    public void setDomainMemberships(java.util.Collection<DomainMembership> domainMemberships) {
        if (domainMemberships == null) {
            this.domainMemberships = null;
            return;
        }

        this.domainMemberships = new java.util.ArrayList<DomainMembership>(domainMemberships);
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainMemberships <p>
     *            The Active Directory Domain membership records associated with
     *            the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDomainMemberships(DomainMembership... domainMemberships) {
        if (getDomainMemberships() == null) {
            this.domainMemberships = new java.util.ArrayList<DomainMembership>(
                    domainMemberships.length);
        }
        for (DomainMembership value : domainMemberships) {
            this.domainMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainMemberships <p>
     *            The Active Directory Domain membership records associated with
     *            the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDomainMemberships(java.util.Collection<DomainMembership> domainMemberships) {
        setDomainMemberships(domainMemberships);
        return this;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of
     * the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether tags are copied from the DB instance to
     *         snapshots of the DB instance.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB
     *         cluster. Setting this value for an Aurora DB instance has no
     *         effect on the DB cluster setting. For more information, see
     *         <code>DBCluster</code>.
     *         </p>
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of
     * the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether tags are copied from the DB instance to
     *         snapshots of the DB instance.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB
     *         cluster. Setting this value for an Aurora DB instance has no
     *         effect on the DB cluster setting. For more information, see
     *         <code>DBCluster</code>.
     *         </p>
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of
     * the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     *
     * @param copyTagsToSnapshot <p>
     *            Specifies whether tags are copied from the DB instance to
     *            snapshots of the DB instance.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Copying tags to snapshots is managed by the DB
     *            cluster. Setting this value for an Aurora DB instance has no
     *            effect on the DB cluster setting. For more information, see
     *            <code>DBCluster</code>.
     *            </p>
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB instance to snapshots of
     * the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting. For more information, see <code>DBCluster</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToSnapshot <p>
     *            Specifies whether tags are copied from the DB instance to
     *            snapshots of the DB instance.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Copying tags to snapshots is managed by the DB
     *            cluster. Setting this value for an Aurora DB instance has no
     *            effect on the DB cluster setting. For more information, see
     *            <code>DBCluster</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance.
     * </p>
     *
     * @return <p>
     *         The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance.
     *         </p>
     */
    public Integer getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance.
     * </p>
     *
     * @param monitoringInterval <p>
     *            The interval, in seconds, between points when Enhanced
     *            Monitoring metrics are collected for the DB instance.
     *            </p>
     */
    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringInterval <p>
     *            The interval, in seconds, between points when Enhanced
     *            Monitoring metrics are collected for the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream
     * that receives the Enhanced Monitoring metrics data for the DB instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log
     *         stream that receives the Enhanced Monitoring metrics data for the
     *         DB instance.
     *         </p>
     */
    public String getEnhancedMonitoringResourceArn() {
        return enhancedMonitoringResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream
     * that receives the Enhanced Monitoring metrics data for the DB instance.
     * </p>
     *
     * @param enhancedMonitoringResourceArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs
     *            log stream that receives the Enhanced Monitoring metrics data
     *            for the DB instance.
     *            </p>
     */
    public void setEnhancedMonitoringResourceArn(String enhancedMonitoringResourceArn) {
        this.enhancedMonitoringResourceArn = enhancedMonitoringResourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream
     * that receives the Enhanced Monitoring metrics data for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enhancedMonitoringResourceArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs
     *            log stream that receives the Enhanced Monitoring metrics data
     *            for the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withEnhancedMonitoringResourceArn(String enhancedMonitoringResourceArn) {
        this.enhancedMonitoringResourceArn = enhancedMonitoringResourceArn;
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring
     * metrics to Amazon CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         The ARN for the IAM role that permits RDS to send Enhanced
     *         Monitoring metrics to Amazon CloudWatch Logs.
     *         </p>
     */
    public String getMonitoringRoleArn() {
        return monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring
     * metrics to Amazon CloudWatch Logs.
     * </p>
     *
     * @param monitoringRoleArn <p>
     *            The ARN for the IAM role that permits RDS to send Enhanced
     *            Monitoring metrics to Amazon CloudWatch Logs.
     *            </p>
     */
    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send Enhanced Monitoring
     * metrics to Amazon CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringRoleArn <p>
     *            The ARN for the IAM role that permits RDS to send Enhanced
     *            Monitoring metrics to Amazon CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted
     * to the primary instance after a failure of the existing primary instance.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A value that specifies the order in which an Aurora Replica is
     *         promoted to the primary instance after a failure of the existing
     *         primary instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *         > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon
     *         Aurora User Guide</i>.
     *         </p>
     */
    public Integer getPromotionTier() {
        return promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted
     * to the primary instance after a failure of the existing primary instance.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     *
     * @param promotionTier <p>
     *            A value that specifies the order in which an Aurora Replica is
     *            promoted to the primary instance after a failure of the
     *            existing primary instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *            > Fault Tolerance for an Aurora DB Cluster</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     */
    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted
     * to the primary instance after a failure of the existing primary instance.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param promotionTier <p>
     *            A value that specifies the order in which an Aurora Replica is
     *            promoted to the primary instance after a failure of the
     *            existing primary instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *            > Fault Tolerance for an Aurora DB Cluster</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the DB instance.
     *         </p>
     */
    public String getDBInstanceArn() {
        return dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     *
     * @param dBInstanceArn <p>
     *            The Amazon Resource Name (ARN) for the DB instance.
     *            </p>
     */
    public void setDBInstanceArn(String dBInstanceArn) {
        this.dBInstanceArn = dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceArn <p>
     *            The Amazon Resource Name (ARN) for the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDBInstanceArn(String dBInstanceArn) {
        this.dBInstanceArn = dBInstanceArn;
        return this;
    }

    /**
     * <p>
     * The time zone of the DB instance. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for Microsoft SQL Server DB instances that were created with
     * a time zone specified.
     * </p>
     *
     * @return <p>
     *         The time zone of the DB instance. In most cases, the
     *         <code>Timezone</code> element is empty. <code>Timezone</code>
     *         content appears only for Microsoft SQL Server DB instances that
     *         were created with a time zone specified.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for Microsoft SQL Server DB instances that were created with
     * a time zone specified.
     * </p>
     *
     * @param timezone <p>
     *            The time zone of the DB instance. In most cases, the
     *            <code>Timezone</code> element is empty. <code>Timezone</code>
     *            content appears only for Microsoft SQL Server DB instances
     *            that were created with a time zone specified.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for Microsoft SQL Server DB instances that were created with
     * a time zone specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The time zone of the DB instance. In most cases, the
     *            <code>Timezone</code> element is empty. <code>Timezone</code>
     *            content appears only for Microsoft SQL Server DB instances
     *            that were created with a time zone specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora,
     * see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         True if mapping of AWS Identity and Access Management (IAM)
     *         accounts to database accounts is enabled, and otherwise false.
     *         </p>
     *         <p>
     *         IAM database authentication can be enabled for the following
     *         database engines
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher. To enable IAM database authentication for
     *         Aurora, see DBCluster Type.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora,
     * see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         True if mapping of AWS Identity and Access Management (IAM)
     *         accounts to database accounts is enabled, and otherwise false.
     *         </p>
     *         <p>
     *         IAM database authentication can be enabled for the following
     *         database engines
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher. To enable IAM database authentication for
     *         Aurora, see DBCluster Type.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora,
     * see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            True if mapping of AWS Identity and Access Management (IAM)
     *            accounts to database accounts is enabled, and otherwise false.
     *            </p>
     *            <p>
     *            IAM database authentication can be enabled for the following
     *            database engines
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For MySQL 5.6, minor version 5.6.34 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For MySQL 5.7, minor version 5.7.16 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora 5.6 or higher. To enable IAM database authentication
     *            for Aurora, see DBCluster Type.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database
     * engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher. To enable IAM database authentication for Aurora,
     * see DBCluster Type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            True if mapping of AWS Identity and Access Management (IAM)
     *            accounts to database accounts is enabled, and otherwise false.
     *            </p>
     *            <p>
     *            IAM database authentication can be enabled for the following
     *            database engines
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For MySQL 5.6, minor version 5.6.34 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For MySQL 5.7, minor version 5.7.16 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora 5.6 or higher. To enable IAM database authentication
     *            for Aurora, see DBCluster Type.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
        return this;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and
     * otherwise false.
     * </p>
     *
     * @return <p>
     *         True if Performance Insights is enabled for the DB instance, and
     *         otherwise false.
     *         </p>
     */
    public Boolean isPerformanceInsightsEnabled() {
        return performanceInsightsEnabled;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and
     * otherwise false.
     * </p>
     *
     * @return <p>
     *         True if Performance Insights is enabled for the DB instance, and
     *         otherwise false.
     *         </p>
     */
    public Boolean getPerformanceInsightsEnabled() {
        return performanceInsightsEnabled;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and
     * otherwise false.
     * </p>
     *
     * @param performanceInsightsEnabled <p>
     *            True if Performance Insights is enabled for the DB instance,
     *            and otherwise false.
     *            </p>
     */
    public void setPerformanceInsightsEnabled(Boolean performanceInsightsEnabled) {
        this.performanceInsightsEnabled = performanceInsightsEnabled;
    }

    /**
     * <p>
     * True if Performance Insights is enabled for the DB instance, and
     * otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performanceInsightsEnabled <p>
     *            True if Performance Insights is enabled for the DB instance,
     *            and otherwise false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withPerformanceInsightsEnabled(Boolean performanceInsightsEnabled) {
        this.performanceInsightsEnabled = performanceInsightsEnabled;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier for encryption of Performance Insights
     *         data. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     *         identifier, or the KMS key alias for the KMS encryption key.
     *         </p>
     */
    public String getPerformanceInsightsKMSKeyId() {
        return performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
     * </p>
     *
     * @param performanceInsightsKMSKeyId <p>
     *            The AWS KMS key identifier for encryption of Performance
     *            Insights data. The KMS key ID is the Amazon Resource Name
     *            (ARN), KMS key identifier, or the KMS key alias for the KMS
     *            encryption key.
     *            </p>
     */
    public void setPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param performanceInsightsKMSKeyId <p>
     *            The AWS KMS key identifier for encryption of Performance
     *            Insights data. The KMS key ID is the Amazon Resource Name
     *            (ARN), KMS key identifier, or the KMS key alias for the KMS
     *            encryption key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
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
    public DBInstance withPerformanceInsightsRetentionPeriod(
            Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of log types that this DB instance is configured to export
     *         to CloudWatch Logs.
     *         </p>
     *         <p>
     *         Log types vary by DB engine. For information about the log types
     *         for each DB engine, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     *         >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public java.util.List<String> getEnabledCloudwatchLogsExports() {
        return enabledCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param enabledCloudwatchLogsExports <p>
     *            A list of log types that this DB instance is configured to
     *            export to CloudWatch Logs.
     *            </p>
     *            <p>
     *            Log types vary by DB engine. For information about the log
     *            types for each DB engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     *            >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     */
    public void setEnabledCloudwatchLogsExports(
            java.util.Collection<String> enabledCloudwatchLogsExports) {
        if (enabledCloudwatchLogsExports == null) {
            this.enabledCloudwatchLogsExports = null;
            return;
        }

        this.enabledCloudwatchLogsExports = new java.util.ArrayList<String>(
                enabledCloudwatchLogsExports);
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledCloudwatchLogsExports <p>
     *            A list of log types that this DB instance is configured to
     *            export to CloudWatch Logs.
     *            </p>
     *            <p>
     *            Log types vary by DB engine. For information about the log
     *            types for each DB engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     *            >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withEnabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
        if (getEnabledCloudwatchLogsExports() == null) {
            this.enabledCloudwatchLogsExports = new java.util.ArrayList<String>(
                    enabledCloudwatchLogsExports.length);
        }
        for (String value : enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledCloudwatchLogsExports <p>
     *            A list of log types that this DB instance is configured to
     *            export to CloudWatch Logs.
     *            </p>
     *            <p>
     *            Log types vary by DB engine. For information about the log
     *            types for each DB engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html"
     *            >Amazon RDS Database Log Files</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withEnabledCloudwatchLogsExports(
            java.util.Collection<String> enabledCloudwatchLogsExports) {
        setEnabledCloudwatchLogsExports(enabledCloudwatchLogsExports);
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
    public DBInstance withProcessorFeatures(ProcessorFeature... processorFeatures) {
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
    public DBInstance withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The
     * database can't be deleted when deletion protection is enabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @return <p>
     *         Indicates if the DB instance has deletion protection enabled. The
     *         database can't be deleted when deletion protection is enabled.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *         > Deleting a DB Instance</a>.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The
     * database can't be deleted when deletion protection is enabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @return <p>
     *         Indicates if the DB instance has deletion protection enabled. The
     *         database can't be deleted when deletion protection is enabled.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *         > Deleting a DB Instance</a>.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The
     * database can't be deleted when deletion protection is enabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @param deletionProtection <p>
     *            Indicates if the DB instance has deletion protection enabled.
     *            The database can't be deleted when deletion protection is
     *            enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *            > Deleting a DB Instance</a>.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB instance has deletion protection enabled. The
     * database can't be deleted when deletion protection is enabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            Indicates if the DB instance has deletion protection enabled.
     *            The database can't be deleted when deletion protection is
     *            enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *            > Deleting a DB Instance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     *
     * @return <p>
     *         The AWS Identity and Access Management (IAM) roles associated
     *         with the DB instance.
     *         </p>
     */
    public java.util.List<DBInstanceRole> getAssociatedRoles() {
        return associatedRoles;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     *
     * @param associatedRoles <p>
     *            The AWS Identity and Access Management (IAM) roles associated
     *            with the DB instance.
     *            </p>
     */
    public void setAssociatedRoles(java.util.Collection<DBInstanceRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new java.util.ArrayList<DBInstanceRole>(associatedRoles);
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRoles <p>
     *            The AWS Identity and Access Management (IAM) roles associated
     *            with the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withAssociatedRoles(DBInstanceRole... associatedRoles) {
        if (getAssociatedRoles() == null) {
            this.associatedRoles = new java.util.ArrayList<DBInstanceRole>(associatedRoles.length);
        }
        for (DBInstanceRole value : associatedRoles) {
            this.associatedRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRoles <p>
     *            The AWS Identity and Access Management (IAM) roles associated
     *            with the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withAssociatedRoles(java.util.Collection<DBInstanceRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     *
     * @return <p>
     *         Specifies the listener connection endpoint for SQL Server Always
     *         On.
     *         </p>
     */
    public Endpoint getListenerEndpoint() {
        return listenerEndpoint;
    }

    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     *
     * @param listenerEndpoint <p>
     *            Specifies the listener connection endpoint for SQL Server
     *            Always On.
     *            </p>
     */
    public void setListenerEndpoint(Endpoint listenerEndpoint) {
        this.listenerEndpoint = listenerEndpoint;
    }

    /**
     * <p>
     * Specifies the listener connection endpoint for SQL Server Always On.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listenerEndpoint <p>
     *            Specifies the listener connection endpoint for SQL Server
     *            Always On.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withListenerEndpoint(Endpoint listenerEndpoint) {
        this.listenerEndpoint = listenerEndpoint;
        return this;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage
     * of the DB instance.
     * </p>
     *
     * @return <p>
     *         The upper limit to which Amazon RDS can automatically scale the
     *         storage of the DB instance.
     *         </p>
     */
    public Integer getMaxAllocatedStorage() {
        return maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage
     * of the DB instance.
     * </p>
     *
     * @param maxAllocatedStorage <p>
     *            The upper limit to which Amazon RDS can automatically scale
     *            the storage of the DB instance.
     *            </p>
     */
    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage
     * of the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAllocatedStorage <p>
     *            The upper limit to which Amazon RDS can automatically scale
     *            the storage of the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstance withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getDBInstanceStatus() != null)
            sb.append("DBInstanceStatus: " + getDBInstanceStatus() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: " + getInstanceCreateTime() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: " + getDBSecurityGroups() + ",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getDBParameterGroups() != null)
            sb.append("DBParameterGroups: " + getDBParameterGroups() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroup() != null)
            sb.append("DBSubnetGroup: " + getDBSubnetGroup() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: " + getLatestRestorableTime() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getReadReplicaSourceDBInstanceIdentifier() != null)
            sb.append("ReadReplicaSourceDBInstanceIdentifier: "
                    + getReadReplicaSourceDBInstanceIdentifier() + ",");
        if (getReadReplicaDBInstanceIdentifiers() != null)
            sb.append("ReadReplicaDBInstanceIdentifiers: " + getReadReplicaDBInstanceIdentifiers()
                    + ",");
        if (getReadReplicaDBClusterIdentifiers() != null)
            sb.append("ReadReplicaDBClusterIdentifiers: " + getReadReplicaDBClusterIdentifiers()
                    + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupMemberships() != null)
            sb.append("OptionGroupMemberships: " + getOptionGroupMemberships() + ",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getSecondaryAvailabilityZone() != null)
            sb.append("SecondaryAvailabilityZone: " + getSecondaryAvailabilityZone() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getStatusInfos() != null)
            sb.append("StatusInfos: " + getStatusInfos() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getDbInstancePort() != null)
            sb.append("DbInstancePort: " + getDbInstancePort() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: " + getDbiResourceId() + ",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: " + getCACertificateIdentifier() + ",");
        if (getDomainMemberships() != null)
            sb.append("DomainMemberships: " + getDomainMemberships() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: " + getMonitoringInterval() + ",");
        if (getEnhancedMonitoringResourceArn() != null)
            sb.append("EnhancedMonitoringResourceArn: " + getEnhancedMonitoringResourceArn() + ",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: " + getMonitoringRoleArn() + ",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: " + getPromotionTier() + ",");
        if (getDBInstanceArn() != null)
            sb.append("DBInstanceArn: " + getDBInstanceArn() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: " + getIAMDatabaseAuthenticationEnabled()
                    + ",");
        if (getPerformanceInsightsEnabled() != null)
            sb.append("PerformanceInsightsEnabled: " + getPerformanceInsightsEnabled() + ",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: " + getPerformanceInsightsKMSKeyId() + ",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: "
                    + getPerformanceInsightsRetentionPeriod() + ",");
        if (getEnabledCloudwatchLogsExports() != null)
            sb.append("EnabledCloudwatchLogsExports: " + getEnabledCloudwatchLogsExports() + ",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: " + getProcessorFeatures() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: " + getAssociatedRoles() + ",");
        if (getListenerEndpoint() != null)
            sb.append("ListenerEndpoint: " + getListenerEndpoint() + ",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: " + getMaxAllocatedStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceStatus() == null) ? 0 : getDBInstanceStatus().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getDBParameterGroups() == null) ? 0 : getDBParameterGroups().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode
                + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReadReplicaSourceDBInstanceIdentifier() == null) ? 0
                        : getReadReplicaSourceDBInstanceIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getReadReplicaDBInstanceIdentifiers() == null) ? 0
                        : getReadReplicaDBInstanceIdentifiers().hashCode());
        hashCode = prime
                * hashCode
                + ((getReadReplicaDBClusterIdentifiers() == null) ? 0
                        : getReadReplicaDBClusterIdentifiers().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptionGroupMemberships() == null) ? 0 : getOptionGroupMemberships()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode
                + ((getStatusInfos() == null) ? 0 : getStatusInfos().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode
                + ((getDbInstancePort() == null) ? 0 : getDbInstancePort().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDomainMemberships() == null) ? 0 : getDomainMemberships().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnhancedMonitoringResourceArn() == null) ? 0
                        : getEnhancedMonitoringResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceArn() == null) ? 0 : getDBInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime
                * hashCode
                + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0
                        : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getPerformanceInsightsEnabled() == null) ? 0 : getPerformanceInsightsEnabled()
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
                + ((getEnabledCloudwatchLogsExports() == null) ? 0
                        : getEnabledCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode
                + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime * hashCode
                + ((getListenerEndpoint() == null) ? 0 : getListenerEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBInstance == false)
            return false;
        DBInstance other = (DBInstance) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
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
        if (other.getDBInstanceStatus() == null ^ this.getDBInstanceStatus() == null)
            return false;
        if (other.getDBInstanceStatus() != null
                && other.getDBInstanceStatus().equals(this.getDBInstanceStatus()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null
                && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null)
            return false;
        if (other.getDBSecurityGroups() != null
                && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null
                && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getDBParameterGroups() == null ^ this.getDBParameterGroups() == null)
            return false;
        if (other.getDBParameterGroups() != null
                && other.getDBParameterGroups().equals(this.getDBParameterGroups()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null)
            return false;
        if (other.getDBSubnetGroup() != null
                && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null
                && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
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
        if (other.getReadReplicaSourceDBInstanceIdentifier() == null
                ^ this.getReadReplicaSourceDBInstanceIdentifier() == null)
            return false;
        if (other.getReadReplicaSourceDBInstanceIdentifier() != null
                && other.getReadReplicaSourceDBInstanceIdentifier().equals(
                        this.getReadReplicaSourceDBInstanceIdentifier()) == false)
            return false;
        if (other.getReadReplicaDBInstanceIdentifiers() == null
                ^ this.getReadReplicaDBInstanceIdentifiers() == null)
            return false;
        if (other.getReadReplicaDBInstanceIdentifiers() != null
                && other.getReadReplicaDBInstanceIdentifiers().equals(
                        this.getReadReplicaDBInstanceIdentifiers()) == false)
            return false;
        if (other.getReadReplicaDBClusterIdentifiers() == null
                ^ this.getReadReplicaDBClusterIdentifiers() == null)
            return false;
        if (other.getReadReplicaDBClusterIdentifiers() != null
                && other.getReadReplicaDBClusterIdentifiers().equals(
                        this.getReadReplicaDBClusterIdentifiers()) == false)
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
        if (other.getOptionGroupMemberships() == null ^ this.getOptionGroupMemberships() == null)
            return false;
        if (other.getOptionGroupMemberships() != null
                && other.getOptionGroupMemberships().equals(this.getOptionGroupMemberships()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null
                && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getSecondaryAvailabilityZone() == null
                ^ this.getSecondaryAvailabilityZone() == null)
            return false;
        if (other.getSecondaryAvailabilityZone() != null
                && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getStatusInfos() == null ^ this.getStatusInfos() == null)
            return false;
        if (other.getStatusInfos() != null
                && other.getStatusInfos().equals(this.getStatusInfos()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null
                && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getDbInstancePort() == null ^ this.getDbInstancePort() == null)
            return false;
        if (other.getDbInstancePort() != null
                && other.getDbInstancePort().equals(this.getDbInstancePort()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
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
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null
                && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null
                && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDomainMemberships() == null ^ this.getDomainMemberships() == null)
            return false;
        if (other.getDomainMemberships() != null
                && other.getDomainMemberships().equals(this.getDomainMemberships()) == false)
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
        if (other.getEnhancedMonitoringResourceArn() == null
                ^ this.getEnhancedMonitoringResourceArn() == null)
            return false;
        if (other.getEnhancedMonitoringResourceArn() != null
                && other.getEnhancedMonitoringResourceArn().equals(
                        this.getEnhancedMonitoringResourceArn()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null
                && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null
                && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getDBInstanceArn() == null ^ this.getDBInstanceArn() == null)
            return false;
        if (other.getDBInstanceArn() != null
                && other.getDBInstanceArn().equals(this.getDBInstanceArn()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null
                ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(
                        this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getPerformanceInsightsEnabled() == null
                ^ this.getPerformanceInsightsEnabled() == null)
            return false;
        if (other.getPerformanceInsightsEnabled() != null
                && other.getPerformanceInsightsEnabled().equals(
                        this.getPerformanceInsightsEnabled()) == false)
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
        if (other.getEnabledCloudwatchLogsExports() == null
                ^ this.getEnabledCloudwatchLogsExports() == null)
            return false;
        if (other.getEnabledCloudwatchLogsExports() != null
                && other.getEnabledCloudwatchLogsExports().equals(
                        this.getEnabledCloudwatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null
                && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null
                && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getListenerEndpoint() == null ^ this.getListenerEndpoint() == null)
            return false;
        if (other.getListenerEndpoint() != null
                && other.getListenerEndpoint().equals(this.getListenerEndpoint()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null
                && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        return true;
    }
}
