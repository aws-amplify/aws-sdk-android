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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of an Amazon Aurora DB cluster.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and
 * <code>StartDBCluster</code> actions.
 * </p>
 */
public class DBCluster implements Serializable {
    /**
     * <p>
     * For all database engines except Amazon Aurora,
     * <code>AllocatedStorage</code> specifies the allocated storage size in
     * gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns
     * 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster can be created.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     */
    private Integer backupRetentionPeriod;

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     */
    private String characterSetName;

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     */
    private String dBClusterParameterGroup;

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     */
    private String dBSubnetGroup;

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     */
    private String percentProgress;

    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time
     * restore.
     * </p>
     */
    private java.util.Date earliestRestorableTime;

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB
     * cluster load-balances connections across the Aurora Replicas that are
     * available in a DB cluster. As clients request new connections to the
     * reader endpoint, Aurora distributes the connection requests among the
     * Aurora Replicas in the DB cluster. This functionality can help balance
     * your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is
     * promoted to be the primary instance, your connection is dropped. To
     * continue sending your read workload to other Aurora Replicas in the
     * cluster, you can then reconnect to the reader endpoint.
     * </p>
     */
    private String readerEndpoint;

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     */
    private java.util.List<String> customEndpoints;

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability
     * Zones.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     */
    private java.util.Date latestRestorableTime;

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     */
    private String masterUsername;

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     */
    private java.util.List<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships;

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
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * read replica.
     * </p>
     */
    private String replicationSourceIdentifier;

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB cluster.
     * </p>
     */
    private java.util.List<String> readReplicaIdentifiers;

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     */
    private java.util.List<DBClusterMember> dBClusterMembers;

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups;

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     */
    private String hostedZoneId;

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier
     * for the encrypted DB cluster.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB cluster is accessed.
     * </p>
     */
    private String dbClusterResourceId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     */
    private String dBClusterArn;

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. IAM roles that are associated
     * with a DB cluster grant permission for the DB cluster to access other AWS
     * services on your behalf.
     * </p>
     */
    private java.util.List<DBClusterRole> associatedRoles;

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access
     * Management (IAM) accounts to database accounts is enabled.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     */
    private String cloneGroupId;

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date clusterCreateTime;

    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     */
    private java.util.Date earliestBacktrackTime;

    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0,
     * backtracking is disabled for the DB cluster. Otherwise, backtracking is
     * enabled.
     * </p>
     */
    private Long backtrackWindow;

    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     */
    private Long backtrackConsumedChangeRecords;

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     */
    private java.util.List<String> enabledCloudwatchLogsExports;

    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is
     * 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     */
    private Integer capacity;

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>,
     * <code>serverless</code>, <code>parallelquery</code>, <code>global</code>,
     * or <code>multimaster</code>.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode. To check if a DB cluster is part of a global database, use
     * <code>DescribeGlobalClusters</code> instead of checking the
     * <code>EngineMode</code> return value from <code>DescribeDBClusters</code>
     * .
     * </p>
     * </note>
     */
    private String engineMode;

    /**
     * <p>
     * Shows the scaling configuration for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     */
    private ScalingConfigurationInfo scalingConfigurationInfo;

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database
     * can't be deleted when deletion protection is enabled.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless
     * DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API
     * for running SQL queries on the Aurora Serverless DB cluster. You can also
     * query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     * >Using the Data API for Aurora Serverless</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     */
    private Boolean httpEndpointEnabled;

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a
     * change or access generate an activity stream event. The database session
     * can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     */
    private String activityStreamMode;

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     */
    private String activityStreamStatus;

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database
     * activity stream.
     * </p>
     */
    private String activityStreamKmsKeyId;

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity
     * stream.
     * </p>
     */
    private String activityStreamKinesisStreamName;

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the
     * DB cluster.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a
     * different AWS account.
     * </p>
     */
    private Boolean crossAccountClone;

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * cluster.
     * </p>
     */
    private java.util.List<DomainMembership> domainMemberships;

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     */
    private String globalWriteForwardingStatus;

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a
     * secondary cluster in an Aurora global database. Because write forwarding
     * takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has
     * completed before using the write forwarding feature for this cluster.
     * </p>
     */
    private Boolean globalWriteForwardingRequested;

    /**
     * <p>
     * For all database engines except Amazon Aurora,
     * <code>AllocatedStorage</code> specifies the allocated storage size in
     * gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns
     * 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     *
     * @return <p>
     *         For all database engines except Amazon Aurora,
     *         <code>AllocatedStorage</code> specifies the allocated storage
     *         size in gibibytes (GiB). For Aurora,
     *         <code>AllocatedStorage</code> always returns 1, because Aurora DB
     *         cluster storage size isn't fixed, but instead automatically
     *         adjusts as needed.
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Amazon Aurora,
     * <code>AllocatedStorage</code> specifies the allocated storage size in
     * gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns
     * 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     *
     * @param allocatedStorage <p>
     *            For all database engines except Amazon Aurora,
     *            <code>AllocatedStorage</code> specifies the allocated storage
     *            size in gibibytes (GiB). For Aurora,
     *            <code>AllocatedStorage</code> always returns 1, because Aurora
     *            DB cluster storage size isn't fixed, but instead automatically
     *            adjusts as needed.
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Amazon Aurora,
     * <code>AllocatedStorage</code> specifies the allocated storage size in
     * gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns
     * 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            For all database engines except Amazon Aurora,
     *            <code>AllocatedStorage</code> specifies the allocated storage
     *            size in gibibytes (GiB). For Aurora,
     *            <code>AllocatedStorage</code> always returns 1, because Aurora
     *            DB cluster storage size isn't fixed, but instead automatically
     *            adjusts as needed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster can be created.
     * </p>
     *
     * @return <p>
     *         Provides the list of Availability Zones (AZs) where instances in
     *         the DB cluster can be created.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster can be created.
     * </p>
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the DB cluster can be created.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster can be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the DB cluster can be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster can be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the DB cluster can be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
    public DBCluster withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     *
     * @return <p>
     *         If present, specifies the name of the character set that this
     *         cluster is associated with.
     *         </p>
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     *
     * @param characterSetName <p>
     *            If present, specifies the name of the character set that this
     *            cluster is associated with.
     *            </p>
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterSetName <p>
     *            If present, specifies the name of the character set that this
     *            cluster is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     *
     * @return <p>
     *         Contains the name of the initial database of this DB cluster that
     *         was provided at create time, if one was specified when the DB
     *         cluster was created. This same name is returned for the life of
     *         the DB cluster.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     *
     * @param databaseName <p>
     *            Contains the name of the initial database of this DB cluster
     *            that was provided at create time, if one was specified when
     *            the DB cluster was created. This same name is returned for the
     *            life of the DB cluster.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            Contains the name of the initial database of this DB cluster
     *            that was provided at create time, if one was specified when
     *            the DB cluster was created. This same name is returned for the
     *            life of the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     *
     * @return <p>
     *         Contains a user-supplied DB cluster identifier. This identifier
     *         is the unique key that identifies a DB cluster.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            Contains a user-supplied DB cluster identifier. This
     *            identifier is the unique key that identifies a DB cluster.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            Contains a user-supplied DB cluster identifier. This
     *            identifier is the unique key that identifies a DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the DB cluster parameter group for the DB
     *         cluster.
     *         </p>
     */
    public String getDBClusterParameterGroup() {
        return dBClusterParameterGroup;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     *
     * @param dBClusterParameterGroup <p>
     *            Specifies the name of the DB cluster parameter group for the
     *            DB cluster.
     *            </p>
     */
    public void setDBClusterParameterGroup(String dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterParameterGroup <p>
     *            Specifies the name of the DB cluster parameter group for the
     *            DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBClusterParameterGroup(String dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
        return this;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     *
     * @return <p>
     *         Specifies information on the subnet group associated with the DB
     *         cluster, including the name, description, and subnets in the
     *         subnet group.
     *         </p>
     */
    public String getDBSubnetGroup() {
        return dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     *
     * @param dBSubnetGroup <p>
     *            Specifies information on the subnet group associated with the
     *            DB cluster, including the name, description, and subnets in
     *            the subnet group.
     *            </p>
     */
    public void setDBSubnetGroup(String dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroup <p>
     *            Specifies information on the subnet group associated with the
     *            DB cluster, including the name, description, and subnets in
     *            the subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBSubnetGroup(String dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     *
     * @return <p>
     *         Specifies the current state of this DB cluster.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     *
     * @param status <p>
     *            Specifies the current state of this DB cluster.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Specifies the current state of this DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     *
     * @return <p>
     *         Specifies the progress of the operation as a percentage.
     *         </p>
     */
    public String getPercentProgress() {
        return percentProgress;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     *
     * @param percentProgress <p>
     *            Specifies the progress of the operation as a percentage.
     *            </p>
     */
    public void setPercentProgress(String percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentProgress <p>
     *            Specifies the progress of the operation as a percentage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withPercentProgress(String percentProgress) {
        this.percentProgress = percentProgress;
        return this;
    }

    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time
     * restore.
     * </p>
     *
     * @return <p>
     *         The earliest time to which a database can be restored with
     *         point-in-time restore.
     *         </p>
     */
    public java.util.Date getEarliestRestorableTime() {
        return earliestRestorableTime;
    }

    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time
     * restore.
     * </p>
     *
     * @param earliestRestorableTime <p>
     *            The earliest time to which a database can be restored with
     *            point-in-time restore.
     *            </p>
     */
    public void setEarliestRestorableTime(java.util.Date earliestRestorableTime) {
        this.earliestRestorableTime = earliestRestorableTime;
    }

    /**
     * <p>
     * The earliest time to which a database can be restored with point-in-time
     * restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param earliestRestorableTime <p>
     *            The earliest time to which a database can be restored with
     *            point-in-time restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withEarliestRestorableTime(java.util.Date earliestRestorableTime) {
        this.earliestRestorableTime = earliestRestorableTime;
        return this;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         Specifies the connection endpoint for the primary instance of the
     *         DB cluster.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     *
     * @param endpoint <p>
     *            Specifies the connection endpoint for the primary instance of
     *            the DB cluster.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            Specifies the connection endpoint for the primary instance of
     *            the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB
     * cluster load-balances connections across the Aurora Replicas that are
     * available in a DB cluster. As clients request new connections to the
     * reader endpoint, Aurora distributes the connection requests among the
     * Aurora Replicas in the DB cluster. This functionality can help balance
     * your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is
     * promoted to be the primary instance, your connection is dropped. To
     * continue sending your read workload to other Aurora Replicas in the
     * cluster, you can then reconnect to the reader endpoint.
     * </p>
     *
     * @return <p>
     *         The reader endpoint for the DB cluster. The reader endpoint for a
     *         DB cluster load-balances connections across the Aurora Replicas
     *         that are available in a DB cluster. As clients request new
     *         connections to the reader endpoint, Aurora distributes the
     *         connection requests among the Aurora Replicas in the DB cluster.
     *         This functionality can help balance your read workload across
     *         multiple Aurora Replicas in your DB cluster.
     *         </p>
     *         <p>
     *         If a failover occurs, and the Aurora Replica that you are
     *         connected to is promoted to be the primary instance, your
     *         connection is dropped. To continue sending your read workload to
     *         other Aurora Replicas in the cluster, you can then reconnect to
     *         the reader endpoint.
     *         </p>
     */
    public String getReaderEndpoint() {
        return readerEndpoint;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB
     * cluster load-balances connections across the Aurora Replicas that are
     * available in a DB cluster. As clients request new connections to the
     * reader endpoint, Aurora distributes the connection requests among the
     * Aurora Replicas in the DB cluster. This functionality can help balance
     * your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is
     * promoted to be the primary instance, your connection is dropped. To
     * continue sending your read workload to other Aurora Replicas in the
     * cluster, you can then reconnect to the reader endpoint.
     * </p>
     *
     * @param readerEndpoint <p>
     *            The reader endpoint for the DB cluster. The reader endpoint
     *            for a DB cluster load-balances connections across the Aurora
     *            Replicas that are available in a DB cluster. As clients
     *            request new connections to the reader endpoint, Aurora
     *            distributes the connection requests among the Aurora Replicas
     *            in the DB cluster. This functionality can help balance your
     *            read workload across multiple Aurora Replicas in your DB
     *            cluster.
     *            </p>
     *            <p>
     *            If a failover occurs, and the Aurora Replica that you are
     *            connected to is promoted to be the primary instance, your
     *            connection is dropped. To continue sending your read workload
     *            to other Aurora Replicas in the cluster, you can then
     *            reconnect to the reader endpoint.
     *            </p>
     */
    public void setReaderEndpoint(String readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
    }

    /**
     * <p>
     * The reader endpoint for the DB cluster. The reader endpoint for a DB
     * cluster load-balances connections across the Aurora Replicas that are
     * available in a DB cluster. As clients request new connections to the
     * reader endpoint, Aurora distributes the connection requests among the
     * Aurora Replicas in the DB cluster. This functionality can help balance
     * your read workload across multiple Aurora Replicas in your DB cluster.
     * </p>
     * <p>
     * If a failover occurs, and the Aurora Replica that you are connected to is
     * promoted to be the primary instance, your connection is dropped. To
     * continue sending your read workload to other Aurora Replicas in the
     * cluster, you can then reconnect to the reader endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readerEndpoint <p>
     *            The reader endpoint for the DB cluster. The reader endpoint
     *            for a DB cluster load-balances connections across the Aurora
     *            Replicas that are available in a DB cluster. As clients
     *            request new connections to the reader endpoint, Aurora
     *            distributes the connection requests among the Aurora Replicas
     *            in the DB cluster. This functionality can help balance your
     *            read workload across multiple Aurora Replicas in your DB
     *            cluster.
     *            </p>
     *            <p>
     *            If a failover occurs, and the Aurora Replica that you are
     *            connected to is promoted to be the primary instance, your
     *            connection is dropped. To continue sending your read workload
     *            to other Aurora Replicas in the cluster, you can then
     *            reconnect to the reader endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withReaderEndpoint(String readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
        return this;
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     *
     * @return <p>
     *         Identifies all custom endpoints associated with the cluster.
     *         </p>
     */
    public java.util.List<String> getCustomEndpoints() {
        return customEndpoints;
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     *
     * @param customEndpoints <p>
     *            Identifies all custom endpoints associated with the cluster.
     *            </p>
     */
    public void setCustomEndpoints(java.util.Collection<String> customEndpoints) {
        if (customEndpoints == null) {
            this.customEndpoints = null;
            return;
        }

        this.customEndpoints = new java.util.ArrayList<String>(customEndpoints);
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customEndpoints <p>
     *            Identifies all custom endpoints associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withCustomEndpoints(String... customEndpoints) {
        if (getCustomEndpoints() == null) {
            this.customEndpoints = new java.util.ArrayList<String>(customEndpoints.length);
        }
        for (String value : customEndpoints) {
            this.customEndpoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Identifies all custom endpoints associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customEndpoints <p>
     *            Identifies all custom endpoints associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withCustomEndpoints(java.util.Collection<String> customEndpoints) {
        setCustomEndpoints(customEndpoints);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability
     * Zones.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster has instances in multiple
     *         Availability Zones.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability
     * Zones.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster has instances in multiple
     *         Availability Zones.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability
     * Zones.
     * </p>
     *
     * @param multiAZ <p>
     *            Specifies whether the DB cluster has instances in multiple
     *            Availability Zones.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB cluster has instances in multiple Availability
     * Zones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            Specifies whether the DB cluster has instances in multiple
     *            Availability Zones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     *
     * @return <p>
     *         Provides the name of the database engine to be used for this DB
     *         cluster.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     *
     * @param engine <p>
     *            Provides the name of the database engine to be used for this
     *            DB cluster.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            Provides the name of the database engine to be used for this
     *            DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withEngine(String engine) {
        this.engine = engine;
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
    public DBCluster withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
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
    public DBCluster withLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
        return this;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     *
     * @return <p>
     *         Specifies the port that the database engine is listening on.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     *
     * @param port <p>
     *            Specifies the port that the database engine is listening on.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            Specifies the port that the database engine is listening on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     *
     * @return <p>
     *         Contains the master username for the DB cluster.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     *
     * @param masterUsername <p>
     *            Contains the master username for the DB cluster.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            Contains the master username for the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     *
     * @return <p>
     *         Provides the list of option group memberships for this DB
     *         cluster.
     *         </p>
     */
    public java.util.List<DBClusterOptionGroupStatus> getDBClusterOptionGroupMemberships() {
        return dBClusterOptionGroupMemberships;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     *
     * @param dBClusterOptionGroupMemberships <p>
     *            Provides the list of option group memberships for this DB
     *            cluster.
     *            </p>
     */
    public void setDBClusterOptionGroupMemberships(
            java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        if (dBClusterOptionGroupMemberships == null) {
            this.dBClusterOptionGroupMemberships = null;
            return;
        }

        this.dBClusterOptionGroupMemberships = new java.util.ArrayList<DBClusterOptionGroupStatus>(
                dBClusterOptionGroupMemberships);
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterOptionGroupMemberships <p>
     *            Provides the list of option group memberships for this DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBClusterOptionGroupMemberships(
            DBClusterOptionGroupStatus... dBClusterOptionGroupMemberships) {
        if (getDBClusterOptionGroupMemberships() == null) {
            this.dBClusterOptionGroupMemberships = new java.util.ArrayList<DBClusterOptionGroupStatus>(
                    dBClusterOptionGroupMemberships.length);
        }
        for (DBClusterOptionGroupStatus value : dBClusterOptionGroupMemberships) {
            this.dBClusterOptionGroupMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterOptionGroupMemberships <p>
     *            Provides the list of option group memberships for this DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBClusterOptionGroupMemberships(
            java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        setDBClusterOptionGroupMemberships(dBClusterOptionGroupMemberships);
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
    public DBCluster withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
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
    public DBCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * read replica.
     * </p>
     *
     * @return <p>
     *         Contains the identifier of the source DB cluster if this DB
     *         cluster is a read replica.
     *         </p>
     */
    public String getReplicationSourceIdentifier() {
        return replicationSourceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * read replica.
     * </p>
     *
     * @param replicationSourceIdentifier <p>
     *            Contains the identifier of the source DB cluster if this DB
     *            cluster is a read replica.
     *            </p>
     */
    public void setReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * read replica.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSourceIdentifier <p>
     *            Contains the identifier of the source DB cluster if this DB
     *            cluster is a read replica.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB cluster.
     * </p>
     *
     * @return <p>
     *         Contains one or more identifiers of the read replicas associated
     *         with this DB cluster.
     *         </p>
     */
    public java.util.List<String> getReadReplicaIdentifiers() {
        return readReplicaIdentifiers;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB cluster.
     * </p>
     *
     * @param readReplicaIdentifiers <p>
     *            Contains one or more identifiers of the read replicas
     *            associated with this DB cluster.
     *            </p>
     */
    public void setReadReplicaIdentifiers(java.util.Collection<String> readReplicaIdentifiers) {
        if (readReplicaIdentifiers == null) {
            this.readReplicaIdentifiers = null;
            return;
        }

        this.readReplicaIdentifiers = new java.util.ArrayList<String>(readReplicaIdentifiers);
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaIdentifiers <p>
     *            Contains one or more identifiers of the read replicas
     *            associated with this DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withReadReplicaIdentifiers(String... readReplicaIdentifiers) {
        if (getReadReplicaIdentifiers() == null) {
            this.readReplicaIdentifiers = new java.util.ArrayList<String>(
                    readReplicaIdentifiers.length);
        }
        for (String value : readReplicaIdentifiers) {
            this.readReplicaIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the read replicas associated with
     * this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaIdentifiers <p>
     *            Contains one or more identifiers of the read replicas
     *            associated with this DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withReadReplicaIdentifiers(java.util.Collection<String> readReplicaIdentifiers) {
        setReadReplicaIdentifiers(readReplicaIdentifiers);
        return this;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     *
     * @return <p>
     *         Provides the list of instances that make up the DB cluster.
     *         </p>
     */
    public java.util.List<DBClusterMember> getDBClusterMembers() {
        return dBClusterMembers;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     *
     * @param dBClusterMembers <p>
     *            Provides the list of instances that make up the DB cluster.
     *            </p>
     */
    public void setDBClusterMembers(java.util.Collection<DBClusterMember> dBClusterMembers) {
        if (dBClusterMembers == null) {
            this.dBClusterMembers = null;
            return;
        }

        this.dBClusterMembers = new java.util.ArrayList<DBClusterMember>(dBClusterMembers);
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterMembers <p>
     *            Provides the list of instances that make up the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBClusterMembers(DBClusterMember... dBClusterMembers) {
        if (getDBClusterMembers() == null) {
            this.dBClusterMembers = new java.util.ArrayList<DBClusterMember>(
                    dBClusterMembers.length);
        }
        for (DBClusterMember value : dBClusterMembers) {
            this.dBClusterMembers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterMembers <p>
     *            Provides the list of instances that make up the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBClusterMembers(java.util.Collection<DBClusterMember> dBClusterMembers) {
        setDBClusterMembers(dBClusterMembers);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     *
     * @return <p>
     *         Provides a list of VPC security groups that the DB cluster
     *         belongs to.
     *         </p>
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     *
     * @param vpcSecurityGroups <p>
     *            Provides a list of VPC security groups that the DB cluster
     *            belongs to.
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
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            Provides a list of VPC security groups that the DB cluster
     *            belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
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
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroups <p>
     *            Provides a list of VPC security groups that the DB cluster
     *            belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     *
     * @return <p>
     *         Specifies the ID that Amazon Route 53 assigns when you create a
     *         hosted zone.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     *
     * @param hostedZoneId <p>
     *            Specifies the ID that Amazon Route 53 assigns when you create
     *            a hosted zone.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZoneId <p>
     *            Specifies the ID that Amazon Route 53 assigns when you create
     *            a hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster is encrypted.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster is encrypted.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB cluster is encrypted.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB cluster is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier
     * for the encrypted DB cluster.
     * </p>
     *
     * @return <p>
     *         If <code>StorageEncrypted</code> is enabled, the AWS KMS key
     *         identifier for the encrypted DB cluster.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier
     * for the encrypted DB cluster.
     * </p>
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is enabled, the AWS KMS key
     *            identifier for the encrypted DB cluster.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is enabled, the AWS KMS key identifier
     * for the encrypted DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is enabled, the AWS KMS key
     *            identifier for the encrypted DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB cluster is accessed.
     * </p>
     *
     * @return <p>
     *         The AWS Region-unique, immutable identifier for the DB cluster.
     *         This identifier is found in AWS CloudTrail log entries whenever
     *         the AWS KMS key for the DB cluster is accessed.
     *         </p>
     */
    public String getDbClusterResourceId() {
        return dbClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB cluster is accessed.
     * </p>
     *
     * @param dbClusterResourceId <p>
     *            The AWS Region-unique, immutable identifier for the DB
     *            cluster. This identifier is found in AWS CloudTrail log
     *            entries whenever the AWS KMS key for the DB cluster is
     *            accessed.
     *            </p>
     */
    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the AWS KMS
     * key for the DB cluster is accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbClusterResourceId <p>
     *            The AWS Region-unique, immutable identifier for the DB
     *            cluster. This identifier is found in AWS CloudTrail log
     *            entries whenever the AWS KMS key for the DB cluster is
     *            accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the DB cluster.
     *         </p>
     */
    public String getDBClusterArn() {
        return dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     *
     * @param dBClusterArn <p>
     *            The Amazon Resource Name (ARN) for the DB cluster.
     *            </p>
     */
    public void setDBClusterArn(String dBClusterArn) {
        this.dBClusterArn = dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterArn <p>
     *            The Amazon Resource Name (ARN) for the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDBClusterArn(String dBClusterArn) {
        this.dBClusterArn = dBClusterArn;
        return this;
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. IAM roles that are associated
     * with a DB cluster grant permission for the DB cluster to access other AWS
     * services on your behalf.
     * </p>
     *
     * @return <p>
     *         Provides a list of the AWS Identity and Access Management (IAM)
     *         roles that are associated with the DB cluster. IAM roles that are
     *         associated with a DB cluster grant permission for the DB cluster
     *         to access other AWS services on your behalf.
     *         </p>
     */
    public java.util.List<DBClusterRole> getAssociatedRoles() {
        return associatedRoles;
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. IAM roles that are associated
     * with a DB cluster grant permission for the DB cluster to access other AWS
     * services on your behalf.
     * </p>
     *
     * @param associatedRoles <p>
     *            Provides a list of the AWS Identity and Access Management
     *            (IAM) roles that are associated with the DB cluster. IAM roles
     *            that are associated with a DB cluster grant permission for the
     *            DB cluster to access other AWS services on your behalf.
     *            </p>
     */
    public void setAssociatedRoles(java.util.Collection<DBClusterRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new java.util.ArrayList<DBClusterRole>(associatedRoles);
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. IAM roles that are associated
     * with a DB cluster grant permission for the DB cluster to access other AWS
     * services on your behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRoles <p>
     *            Provides a list of the AWS Identity and Access Management
     *            (IAM) roles that are associated with the DB cluster. IAM roles
     *            that are associated with a DB cluster grant permission for the
     *            DB cluster to access other AWS services on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withAssociatedRoles(DBClusterRole... associatedRoles) {
        if (getAssociatedRoles() == null) {
            this.associatedRoles = new java.util.ArrayList<DBClusterRole>(associatedRoles.length);
        }
        for (DBClusterRole value : associatedRoles) {
            this.associatedRoles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of the AWS Identity and Access Management (IAM) roles
     * that are associated with the DB cluster. IAM roles that are associated
     * with a DB cluster grant permission for the DB cluster to access other AWS
     * services on your behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedRoles <p>
     *            Provides a list of the AWS Identity and Access Management
     *            (IAM) roles that are associated with the DB cluster. IAM roles
     *            that are associated with a DB cluster grant permission for the
     *            DB cluster to access other AWS services on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withAssociatedRoles(java.util.Collection<DBClusterRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access
     * Management (IAM) accounts to database accounts is enabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the mapping of AWS Identity and
     *         Access Management (IAM) accounts to database accounts is enabled.
     *         </p>
     */
    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access
     * Management (IAM) accounts to database accounts is enabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the mapping of AWS Identity and
     *         Access Management (IAM) accounts to database accounts is enabled.
     *         </p>
     */
    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access
     * Management (IAM) accounts to database accounts is enabled.
     * </p>
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            A value that indicates whether the mapping of AWS Identity and
     *            Access Management (IAM) accounts to database accounts is
     *            enabled.
     *            </p>
     */
    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the mapping of AWS Identity and Access
     * Management (IAM) accounts to database accounts is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            A value that indicates whether the mapping of AWS Identity and
     *            Access Management (IAM) accounts to database accounts is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
        return this;
    }

    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     *
     * @return <p>
     *         Identifies the clone group to which the DB cluster is associated.
     *         </p>
     */
    public String getCloneGroupId() {
        return cloneGroupId;
    }

    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     *
     * @param cloneGroupId <p>
     *            Identifies the clone group to which the DB cluster is
     *            associated.
     *            </p>
     */
    public void setCloneGroupId(String cloneGroupId) {
        this.cloneGroupId = cloneGroupId;
    }

    /**
     * <p>
     * Identifies the clone group to which the DB cluster is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloneGroupId <p>
     *            Identifies the clone group to which the DB cluster is
     *            associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withCloneGroupId(String cloneGroupId) {
        this.cloneGroupId = cloneGroupId;
        return this;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     * </p>
     *
     * @return <p>
     *         Specifies the time when the DB cluster was created, in Universal
     *         Coordinated Time (UTC).
     *         </p>
     */
    public java.util.Date getClusterCreateTime() {
        return clusterCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     * </p>
     *
     * @param clusterCreateTime <p>
     *            Specifies the time when the DB cluster was created, in
     *            Universal Coordinated Time (UTC).
     *            </p>
     */
    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterCreateTime <p>
     *            Specifies the time when the DB cluster was created, in
     *            Universal Coordinated Time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }

    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     *
     * @return <p>
     *         The earliest time to which a DB cluster can be backtracked.
     *         </p>
     */
    public java.util.Date getEarliestBacktrackTime() {
        return earliestBacktrackTime;
    }

    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     *
     * @param earliestBacktrackTime <p>
     *            The earliest time to which a DB cluster can be backtracked.
     *            </p>
     */
    public void setEarliestBacktrackTime(java.util.Date earliestBacktrackTime) {
        this.earliestBacktrackTime = earliestBacktrackTime;
    }

    /**
     * <p>
     * The earliest time to which a DB cluster can be backtracked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param earliestBacktrackTime <p>
     *            The earliest time to which a DB cluster can be backtracked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withEarliestBacktrackTime(java.util.Date earliestBacktrackTime) {
        this.earliestBacktrackTime = earliestBacktrackTime;
        return this;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0,
     * backtracking is disabled for the DB cluster. Otherwise, backtracking is
     * enabled.
     * </p>
     *
     * @return <p>
     *         The target backtrack window, in seconds. If this value is set to
     *         0, backtracking is disabled for the DB cluster. Otherwise,
     *         backtracking is enabled.
     *         </p>
     */
    public Long getBacktrackWindow() {
        return backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0,
     * backtracking is disabled for the DB cluster. Otherwise, backtracking is
     * enabled.
     * </p>
     *
     * @param backtrackWindow <p>
     *            The target backtrack window, in seconds. If this value is set
     *            to 0, backtracking is disabled for the DB cluster. Otherwise,
     *            backtracking is enabled.
     *            </p>
     */
    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. If this value is set to 0,
     * backtracking is disabled for the DB cluster. Otherwise, backtracking is
     * enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackWindow <p>
     *            The target backtrack window, in seconds. If this value is set
     *            to 0, backtracking is disabled for the DB cluster. Otherwise,
     *            backtracking is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
        return this;
    }

    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     *
     * @return <p>
     *         The number of change records stored for Backtrack.
     *         </p>
     */
    public Long getBacktrackConsumedChangeRecords() {
        return backtrackConsumedChangeRecords;
    }

    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     *
     * @param backtrackConsumedChangeRecords <p>
     *            The number of change records stored for Backtrack.
     *            </p>
     */
    public void setBacktrackConsumedChangeRecords(Long backtrackConsumedChangeRecords) {
        this.backtrackConsumedChangeRecords = backtrackConsumedChangeRecords;
    }

    /**
     * <p>
     * The number of change records stored for Backtrack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackConsumedChangeRecords <p>
     *            The number of change records stored for Backtrack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withBacktrackConsumedChangeRecords(Long backtrackConsumedChangeRecords) {
        this.backtrackConsumedChangeRecords = backtrackConsumedChangeRecords;
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of log types that this DB cluster is configured to export
     *         to CloudWatch Logs.
     *         </p>
     *         <p>
     *         Log types vary by DB engine. For information about the log types
     *         for each DB engine, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     *         >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora User
     *         Guide.</i>
     *         </p>
     */
    public java.util.List<String> getEnabledCloudwatchLogsExports() {
        return enabledCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that this DB cluster is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     *
     * @param enabledCloudwatchLogsExports <p>
     *            A list of log types that this DB cluster is configured to
     *            export to CloudWatch Logs.
     *            </p>
     *            <p>
     *            Log types vary by DB engine. For information about the log
     *            types for each DB engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     *            >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora
     *            User Guide.</i>
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
     * A list of log types that this DB cluster is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledCloudwatchLogsExports <p>
     *            A list of log types that this DB cluster is configured to
     *            export to CloudWatch Logs.
     *            </p>
     *            <p>
     *            Log types vary by DB engine. For information about the log
     *            types for each DB engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     *            >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora
     *            User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withEnabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
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
     * A list of log types that this DB cluster is configured to export to
     * CloudWatch Logs.
     * </p>
     * <p>
     * Log types vary by DB engine. For information about the log types for each
     * DB engine, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     * >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledCloudwatchLogsExports <p>
     *            A list of log types that this DB cluster is configured to
     *            export to CloudWatch Logs.
     *            </p>
     *            <p>
     *            Log types vary by DB engine. For information about the log
     *            types for each DB engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html"
     *            >Amazon RDS Database Log Files</a> in the <i>Amazon Aurora
     *            User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withEnabledCloudwatchLogsExports(
            java.util.Collection<String> enabledCloudwatchLogsExports) {
        setEnabledCloudwatchLogsExports(enabledCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is
     * 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The current capacity of an Aurora Serverless DB cluster. The
     *         capacity is 0 (zero) when the cluster is paused.
     *         </p>
     *         <p>
     *         For more information about Aurora Serverless, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     *         >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     *         Guide</i>.
     *         </p>
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is
     * 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     *
     * @param capacity <p>
     *            The current capacity of an Aurora Serverless DB cluster. The
     *            capacity is 0 (zero) when the cluster is paused.
     *            </p>
     *            <p>
     *            For more information about Aurora Serverless, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     *            >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora
     *            User Guide</i>.
     *            </p>
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The current capacity of an Aurora Serverless DB cluster. The capacity is
     * 0 (zero) when the cluster is paused.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacity <p>
     *            The current capacity of an Aurora Serverless DB cluster. The
     *            capacity is 0 (zero) when the cluster is paused.
     *            </p>
     *            <p>
     *            For more information about Aurora Serverless, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     *            >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>,
     * <code>serverless</code>, <code>parallelquery</code>, <code>global</code>,
     * or <code>multimaster</code>.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode. To check if a DB cluster is part of a global database, use
     * <code>DescribeGlobalClusters</code> instead of checking the
     * <code>EngineMode</code> return value from <code>DescribeDBClusters</code>
     * .
     * </p>
     * </note>
     *
     * @return <p>
     *         The DB engine mode of the DB cluster, either
     *         <code>provisioned</code>, <code>serverless</code>,
     *         <code>parallelquery</code>, <code>global</code>, or
     *         <code>multimaster</code>.
     *         </p>
     *         <note>
     *         <p>
     *         <code>global</code> engine mode only applies for global database
     *         clusters created with Aurora MySQL version 5.6.10a. For higher
     *         Aurora MySQL versions, the clusters in a global database use
     *         <code>provisioned</code> engine mode. To check if a DB cluster is
     *         part of a global database, use
     *         <code>DescribeGlobalClusters</code> instead of checking the
     *         <code>EngineMode</code> return value from
     *         <code>DescribeDBClusters</code>.
     *         </p>
     *         </note>
     */
    public String getEngineMode() {
        return engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>,
     * <code>serverless</code>, <code>parallelquery</code>, <code>global</code>,
     * or <code>multimaster</code>.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode. To check if a DB cluster is part of a global database, use
     * <code>DescribeGlobalClusters</code> instead of checking the
     * <code>EngineMode</code> return value from <code>DescribeDBClusters</code>
     * .
     * </p>
     * </note>
     *
     * @param engineMode <p>
     *            The DB engine mode of the DB cluster, either
     *            <code>provisioned</code>, <code>serverless</code>,
     *            <code>parallelquery</code>, <code>global</code>, or
     *            <code>multimaster</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode. To check if
     *            a DB cluster is part of a global database, use
     *            <code>DescribeGlobalClusters</code> instead of checking the
     *            <code>EngineMode</code> return value from
     *            <code>DescribeDBClusters</code>.
     *            </p>
     *            </note>
     */
    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>,
     * <code>serverless</code>, <code>parallelquery</code>, <code>global</code>,
     * or <code>multimaster</code>.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode. To check if a DB cluster is part of a global database, use
     * <code>DescribeGlobalClusters</code> instead of checking the
     * <code>EngineMode</code> return value from <code>DescribeDBClusters</code>
     * .
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineMode <p>
     *            The DB engine mode of the DB cluster, either
     *            <code>provisioned</code>, <code>serverless</code>,
     *            <code>parallelquery</code>, <code>global</code>, or
     *            <code>multimaster</code>.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode. To check if
     *            a DB cluster is part of a global database, use
     *            <code>DescribeGlobalClusters</code> instead of checking the
     *            <code>EngineMode</code> return value from
     *            <code>DescribeDBClusters</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withEngineMode(String engineMode) {
        this.engineMode = engineMode;
        return this;
    }

    /**
     * <p>
     * Shows the scaling configuration for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Shows the scaling configuration for an Aurora DB cluster in
     *         <code>serverless</code> DB engine mode.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     *         >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     *         Guide</i>.
     *         </p>
     */
    public ScalingConfigurationInfo getScalingConfigurationInfo() {
        return scalingConfigurationInfo;
    }

    /**
     * <p>
     * Shows the scaling configuration for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     *
     * @param scalingConfigurationInfo <p>
     *            Shows the scaling configuration for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     *            >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora
     *            User Guide</i>.
     *            </p>
     */
    public void setScalingConfigurationInfo(ScalingConfigurationInfo scalingConfigurationInfo) {
        this.scalingConfigurationInfo = scalingConfigurationInfo;
    }

    /**
     * <p>
     * Shows the scaling configuration for an Aurora DB cluster in
     * <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingConfigurationInfo <p>
     *            Shows the scaling configuration for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
     *            >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withScalingConfigurationInfo(ScalingConfigurationInfo scalingConfigurationInfo) {
        this.scalingConfigurationInfo = scalingConfigurationInfo;
        return this;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database
     * can't be deleted when deletion protection is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates if the DB cluster has deletion protection enabled. The
     *         database can't be deleted when deletion protection is enabled.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database
     * can't be deleted when deletion protection is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates if the DB cluster has deletion protection enabled. The
     *         database can't be deleted when deletion protection is enabled.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database
     * can't be deleted when deletion protection is enabled.
     * </p>
     *
     * @param deletionProtection <p>
     *            Indicates if the DB cluster has deletion protection enabled.
     *            The database can't be deleted when deletion protection is
     *            enabled.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB cluster has deletion protection enabled. The database
     * can't be deleted when deletion protection is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            Indicates if the DB cluster has deletion protection enabled.
     *            The database can't be deleted when deletion protection is
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless
     * DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API
     * for running SQL queries on the Aurora Serverless DB cluster. You can also
     * query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     * >Using the Data API for Aurora Serverless</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the HTTP endpoint for an Aurora
     *         Serverless DB cluster is enabled.
     *         </p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web
     *         service API for running SQL queries on the Aurora Serverless DB
     *         cluster. You can also query your database from inside the RDS
     *         console with the query editor.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     *         >Using the Data API for Aurora Serverless</a> in the <i>Amazon
     *         Aurora User Guide</i>.
     *         </p>
     */
    public Boolean isHttpEndpointEnabled() {
        return httpEndpointEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless
     * DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API
     * for running SQL queries on the Aurora Serverless DB cluster. You can also
     * query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     * >Using the Data API for Aurora Serverless</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the HTTP endpoint for an Aurora
     *         Serverless DB cluster is enabled.
     *         </p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web
     *         service API for running SQL queries on the Aurora Serverless DB
     *         cluster. You can also query your database from inside the RDS
     *         console with the query editor.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     *         >Using the Data API for Aurora Serverless</a> in the <i>Amazon
     *         Aurora User Guide</i>.
     *         </p>
     */
    public Boolean getHttpEndpointEnabled() {
        return httpEndpointEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless
     * DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API
     * for running SQL queries on the Aurora Serverless DB cluster. You can also
     * query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     * >Using the Data API for Aurora Serverless</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     *
     * @param httpEndpointEnabled <p>
     *            A value that indicates whether the HTTP endpoint for an Aurora
     *            Serverless DB cluster is enabled.
     *            </p>
     *            <p>
     *            When enabled, the HTTP endpoint provides a connectionless web
     *            service API for running SQL queries on the Aurora Serverless
     *            DB cluster. You can also query your database from inside the
     *            RDS console with the query editor.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     *            >Using the Data API for Aurora Serverless</a> in the <i>Amazon
     *            Aurora User Guide</i>.
     *            </p>
     */
    public void setHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        this.httpEndpointEnabled = httpEndpointEnabled;
    }

    /**
     * <p>
     * A value that indicates whether the HTTP endpoint for an Aurora Serverless
     * DB cluster is enabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API
     * for running SQL queries on the Aurora Serverless DB cluster. You can also
     * query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     * >Using the Data API for Aurora Serverless</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpEndpointEnabled <p>
     *            A value that indicates whether the HTTP endpoint for an Aurora
     *            Serverless DB cluster is enabled.
     *            </p>
     *            <p>
     *            When enabled, the HTTP endpoint provides a connectionless web
     *            service API for running SQL queries on the Aurora Serverless
     *            DB cluster. You can also query your database from inside the
     *            RDS console with the query editor.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html"
     *            >Using the Data API for Aurora Serverless</a> in the <i>Amazon
     *            Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withHttpEndpointEnabled(Boolean httpEndpointEnabled) {
        this.httpEndpointEnabled = httpEndpointEnabled;
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a
     * change or access generate an activity stream event. The database session
     * can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @return <p>
     *         The mode of the database activity stream. Database events such as
     *         a change or access generate an activity stream event. The
     *         database session can handle these events either synchronously or
     *         asynchronously.
     *         </p>
     * @see ActivityStreamMode
     */
    public String getActivityStreamMode() {
        return activityStreamMode;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a
     * change or access generate an activity stream event. The database session
     * can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param activityStreamMode <p>
     *            The mode of the database activity stream. Database events such
     *            as a change or access generate an activity stream event. The
     *            database session can handle these events either synchronously
     *            or asynchronously.
     *            </p>
     * @see ActivityStreamMode
     */
    public void setActivityStreamMode(String activityStreamMode) {
        this.activityStreamMode = activityStreamMode;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a
     * change or access generate an activity stream event. The database session
     * can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param activityStreamMode <p>
     *            The mode of the database activity stream. Database events such
     *            as a change or access generate an activity stream event. The
     *            database session can handle these events either synchronously
     *            or asynchronously.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamMode
     */
    public DBCluster withActivityStreamMode(String activityStreamMode) {
        this.activityStreamMode = activityStreamMode;
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a
     * change or access generate an activity stream event. The database session
     * can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param activityStreamMode <p>
     *            The mode of the database activity stream. Database events such
     *            as a change or access generate an activity stream event. The
     *            database session can handle these events either synchronously
     *            or asynchronously.
     *            </p>
     * @see ActivityStreamMode
     */
    public void setActivityStreamMode(ActivityStreamMode activityStreamMode) {
        this.activityStreamMode = activityStreamMode.toString();
    }

    /**
     * <p>
     * The mode of the database activity stream. Database events such as a
     * change or access generate an activity stream event. The database session
     * can handle these events either synchronously or asynchronously.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param activityStreamMode <p>
     *            The mode of the database activity stream. Database events such
     *            as a change or access generate an activity stream event. The
     *            database session can handle these events either synchronously
     *            or asynchronously.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamMode
     */
    public DBCluster withActivityStreamMode(ActivityStreamMode activityStreamMode) {
        this.activityStreamMode = activityStreamMode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @return <p>
     *         The status of the database activity stream.
     *         </p>
     * @see ActivityStreamStatus
     */
    public String getActivityStreamStatus() {
        return activityStreamStatus;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param activityStreamStatus <p>
     *            The status of the database activity stream.
     *            </p>
     * @see ActivityStreamStatus
     */
    public void setActivityStreamStatus(String activityStreamStatus) {
        this.activityStreamStatus = activityStreamStatus;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param activityStreamStatus <p>
     *            The status of the database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamStatus
     */
    public DBCluster withActivityStreamStatus(String activityStreamStatus) {
        this.activityStreamStatus = activityStreamStatus;
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param activityStreamStatus <p>
     *            The status of the database activity stream.
     *            </p>
     * @see ActivityStreamStatus
     */
    public void setActivityStreamStatus(ActivityStreamStatus activityStreamStatus) {
        this.activityStreamStatus = activityStreamStatus.toString();
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param activityStreamStatus <p>
     *            The status of the database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamStatus
     */
    public DBCluster withActivityStreamStatus(ActivityStreamStatus activityStreamStatus) {
        this.activityStreamStatus = activityStreamStatus.toString();
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database
     * activity stream.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier used for encrypting messages in the
     *         database activity stream.
     *         </p>
     */
    public String getActivityStreamKmsKeyId() {
        return activityStreamKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database
     * activity stream.
     * </p>
     *
     * @param activityStreamKmsKeyId <p>
     *            The AWS KMS key identifier used for encrypting messages in the
     *            database activity stream.
     *            </p>
     */
    public void setActivityStreamKmsKeyId(String activityStreamKmsKeyId) {
        this.activityStreamKmsKeyId = activityStreamKmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier used for encrypting messages in the database
     * activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activityStreamKmsKeyId <p>
     *            The AWS KMS key identifier used for encrypting messages in the
     *            database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withActivityStreamKmsKeyId(String activityStreamKmsKeyId) {
        this.activityStreamKmsKeyId = activityStreamKmsKeyId;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity
     * stream.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon Kinesis data stream used for the database
     *         activity stream.
     *         </p>
     */
    public String getActivityStreamKinesisStreamName() {
        return activityStreamKinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity
     * stream.
     * </p>
     *
     * @param activityStreamKinesisStreamName <p>
     *            The name of the Amazon Kinesis data stream used for the
     *            database activity stream.
     *            </p>
     */
    public void setActivityStreamKinesisStreamName(String activityStreamKinesisStreamName) {
        this.activityStreamKinesisStreamName = activityStreamKinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream used for the database activity
     * stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activityStreamKinesisStreamName <p>
     *            The name of the Amazon Kinesis data stream used for the
     *            database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withActivityStreamKinesisStreamName(String activityStreamKinesisStreamName) {
        this.activityStreamKinesisStreamName = activityStreamKinesisStreamName;
        return this;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the
     * DB cluster.
     * </p>
     *
     * @return <p>
     *         Specifies whether tags are copied from the DB cluster to
     *         snapshots of the DB cluster.
     *         </p>
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the
     * DB cluster.
     * </p>
     *
     * @return <p>
     *         Specifies whether tags are copied from the DB cluster to
     *         snapshots of the DB cluster.
     *         </p>
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the
     * DB cluster.
     * </p>
     *
     * @param copyTagsToSnapshot <p>
     *            Specifies whether tags are copied from the DB cluster to
     *            snapshots of the DB cluster.
     *            </p>
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether tags are copied from the DB cluster to snapshots of the
     * DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToSnapshot <p>
     *            Specifies whether tags are copied from the DB cluster to
     *            snapshots of the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a
     * different AWS account.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster is a clone of a DB cluster owned
     *         by a different AWS account.
     *         </p>
     */
    public Boolean isCrossAccountClone() {
        return crossAccountClone;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a
     * different AWS account.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster is a clone of a DB cluster owned
     *         by a different AWS account.
     *         </p>
     */
    public Boolean getCrossAccountClone() {
        return crossAccountClone;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a
     * different AWS account.
     * </p>
     *
     * @param crossAccountClone <p>
     *            Specifies whether the DB cluster is a clone of a DB cluster
     *            owned by a different AWS account.
     *            </p>
     */
    public void setCrossAccountClone(Boolean crossAccountClone) {
        this.crossAccountClone = crossAccountClone;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is a clone of a DB cluster owned by a
     * different AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossAccountClone <p>
     *            Specifies whether the DB cluster is a clone of a DB cluster
     *            owned by a different AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withCrossAccountClone(Boolean crossAccountClone) {
        this.crossAccountClone = crossAccountClone;
        return this;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         The Active Directory Domain membership records associated with
     *         the DB cluster.
     *         </p>
     */
    public java.util.List<DomainMembership> getDomainMemberships() {
        return domainMemberships;
    }

    /**
     * <p>
     * The Active Directory Domain membership records associated with the DB
     * cluster.
     * </p>
     *
     * @param domainMemberships <p>
     *            The Active Directory Domain membership records associated with
     *            the DB cluster.
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
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainMemberships <p>
     *            The Active Directory Domain membership records associated with
     *            the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDomainMemberships(DomainMembership... domainMemberships) {
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
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainMemberships <p>
     *            The Active Directory Domain membership records associated with
     *            the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withDomainMemberships(java.util.Collection<DomainMembership> domainMemberships) {
        setDomainMemberships(domainMemberships);
        return this;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @return <p>
     *         Specifies whether a secondary cluster in an Aurora global
     *         database has write forwarding enabled, not enabled, or is in the
     *         process of enabling it.
     *         </p>
     * @see WriteForwardingStatus
     */
    public String getGlobalWriteForwardingStatus() {
        return globalWriteForwardingStatus;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @see WriteForwardingStatus
     */
    public void setGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WriteForwardingStatus
     */
    public DBCluster withGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus;
        return this;
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @see WriteForwardingStatus
     */
    public void setGlobalWriteForwardingStatus(WriteForwardingStatus globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus.toString();
    }

    /**
     * <p>
     * Specifies whether a secondary cluster in an Aurora global database has
     * write forwarding enabled, not enabled, or is in the process of enabling
     * it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabled, disabled, enabling, disabling, unknown
     *
     * @param globalWriteForwardingStatus <p>
     *            Specifies whether a secondary cluster in an Aurora global
     *            database has write forwarding enabled, not enabled, or is in
     *            the process of enabling it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WriteForwardingStatus
     */
    public DBCluster withGlobalWriteForwardingStatus(
            WriteForwardingStatus globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a
     * secondary cluster in an Aurora global database. Because write forwarding
     * takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has
     * completed before using the write forwarding feature for this cluster.
     * </p>
     *
     * @return <p>
     *         Specifies whether you have requested to enable write forwarding
     *         for a secondary cluster in an Aurora global database. Because
     *         write forwarding takes time to enable, check the value of
     *         <code>GlobalWriteForwardingStatus</code> to confirm that the
     *         request has completed before using the write forwarding feature
     *         for this cluster.
     *         </p>
     */
    public Boolean isGlobalWriteForwardingRequested() {
        return globalWriteForwardingRequested;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a
     * secondary cluster in an Aurora global database. Because write forwarding
     * takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has
     * completed before using the write forwarding feature for this cluster.
     * </p>
     *
     * @return <p>
     *         Specifies whether you have requested to enable write forwarding
     *         for a secondary cluster in an Aurora global database. Because
     *         write forwarding takes time to enable, check the value of
     *         <code>GlobalWriteForwardingStatus</code> to confirm that the
     *         request has completed before using the write forwarding feature
     *         for this cluster.
     *         </p>
     */
    public Boolean getGlobalWriteForwardingRequested() {
        return globalWriteForwardingRequested;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a
     * secondary cluster in an Aurora global database. Because write forwarding
     * takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has
     * completed before using the write forwarding feature for this cluster.
     * </p>
     *
     * @param globalWriteForwardingRequested <p>
     *            Specifies whether you have requested to enable write
     *            forwarding for a secondary cluster in an Aurora global
     *            database. Because write forwarding takes time to enable, check
     *            the value of <code>GlobalWriteForwardingStatus</code> to
     *            confirm that the request has completed before using the write
     *            forwarding feature for this cluster.
     *            </p>
     */
    public void setGlobalWriteForwardingRequested(Boolean globalWriteForwardingRequested) {
        this.globalWriteForwardingRequested = globalWriteForwardingRequested;
    }

    /**
     * <p>
     * Specifies whether you have requested to enable write forwarding for a
     * secondary cluster in an Aurora global database. Because write forwarding
     * takes time to enable, check the value of
     * <code>GlobalWriteForwardingStatus</code> to confirm that the request has
     * completed before using the write forwarding feature for this cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalWriteForwardingRequested <p>
     *            Specifies whether you have requested to enable write
     *            forwarding for a secondary cluster in an Aurora global
     *            database. Because write forwarding takes time to enable, check
     *            the value of <code>GlobalWriteForwardingStatus</code> to
     *            confirm that the request has completed before using the write
     *            forwarding feature for this cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBCluster withGlobalWriteForwardingRequested(Boolean globalWriteForwardingRequested) {
        this.globalWriteForwardingRequested = globalWriteForwardingRequested;
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterParameterGroup() != null)
            sb.append("DBClusterParameterGroup: " + getDBClusterParameterGroup() + ",");
        if (getDBSubnetGroup() != null)
            sb.append("DBSubnetGroup: " + getDBSubnetGroup() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (getEarliestRestorableTime() != null)
            sb.append("EarliestRestorableTime: " + getEarliestRestorableTime() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getReaderEndpoint() != null)
            sb.append("ReaderEndpoint: " + getReaderEndpoint() + ",");
        if (getCustomEndpoints() != null)
            sb.append("CustomEndpoints: " + getCustomEndpoints() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: " + getLatestRestorableTime() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBClusterOptionGroupMemberships() != null)
            sb.append("DBClusterOptionGroupMemberships: " + getDBClusterOptionGroupMemberships()
                    + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getReplicationSourceIdentifier() != null)
            sb.append("ReplicationSourceIdentifier: " + getReplicationSourceIdentifier() + ",");
        if (getReadReplicaIdentifiers() != null)
            sb.append("ReadReplicaIdentifiers: " + getReadReplicaIdentifiers() + ",");
        if (getDBClusterMembers() != null)
            sb.append("DBClusterMembers: " + getDBClusterMembers() + ",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: " + getDbClusterResourceId() + ",");
        if (getDBClusterArn() != null)
            sb.append("DBClusterArn: " + getDBClusterArn() + ",");
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: " + getAssociatedRoles() + ",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: " + getIAMDatabaseAuthenticationEnabled()
                    + ",");
        if (getCloneGroupId() != null)
            sb.append("CloneGroupId: " + getCloneGroupId() + ",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getEarliestBacktrackTime() != null)
            sb.append("EarliestBacktrackTime: " + getEarliestBacktrackTime() + ",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: " + getBacktrackWindow() + ",");
        if (getBacktrackConsumedChangeRecords() != null)
            sb.append("BacktrackConsumedChangeRecords: " + getBacktrackConsumedChangeRecords()
                    + ",");
        if (getEnabledCloudwatchLogsExports() != null)
            sb.append("EnabledCloudwatchLogsExports: " + getEnabledCloudwatchLogsExports() + ",");
        if (getCapacity() != null)
            sb.append("Capacity: " + getCapacity() + ",");
        if (getEngineMode() != null)
            sb.append("EngineMode: " + getEngineMode() + ",");
        if (getScalingConfigurationInfo() != null)
            sb.append("ScalingConfigurationInfo: " + getScalingConfigurationInfo() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getHttpEndpointEnabled() != null)
            sb.append("HttpEndpointEnabled: " + getHttpEndpointEnabled() + ",");
        if (getActivityStreamMode() != null)
            sb.append("ActivityStreamMode: " + getActivityStreamMode() + ",");
        if (getActivityStreamStatus() != null)
            sb.append("ActivityStreamStatus: " + getActivityStreamStatus() + ",");
        if (getActivityStreamKmsKeyId() != null)
            sb.append("ActivityStreamKmsKeyId: " + getActivityStreamKmsKeyId() + ",");
        if (getActivityStreamKinesisStreamName() != null)
            sb.append("ActivityStreamKinesisStreamName: " + getActivityStreamKinesisStreamName()
                    + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getCrossAccountClone() != null)
            sb.append("CrossAccountClone: " + getCrossAccountClone() + ",");
        if (getDomainMemberships() != null)
            sb.append("DomainMemberships: " + getDomainMemberships() + ",");
        if (getGlobalWriteForwardingStatus() != null)
            sb.append("GlobalWriteForwardingStatus: " + getGlobalWriteForwardingStatus() + ",");
        if (getGlobalWriteForwardingRequested() != null)
            sb.append("GlobalWriteForwardingRequested: " + getGlobalWriteForwardingRequested());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroup() == null) ? 0 : getDBClusterParameterGroup()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime
                * hashCode
                + ((getEarliestRestorableTime() == null) ? 0 : getEarliestRestorableTime()
                        .hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getReaderEndpoint() == null) ? 0 : getReaderEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getCustomEndpoints() == null) ? 0 : getCustomEndpoints().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterOptionGroupMemberships() == null) ? 0
                        : getDBClusterOptionGroupMemberships().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSourceIdentifier() == null) ? 0
                        : getReplicationSourceIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getReadReplicaIdentifiers() == null) ? 0 : getReadReplicaIdentifiers()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterMembers() == null) ? 0 : getDBClusterMembers().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterArn() == null) ? 0 : getDBClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime
                * hashCode
                + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0
                        : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCloneGroupId() == null) ? 0 : getCloneGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getEarliestBacktrackTime() == null) ? 0 : getEarliestBacktrackTime().hashCode());
        hashCode = prime * hashCode
                + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getBacktrackConsumedChangeRecords() == null) ? 0
                        : getBacktrackConsumedChangeRecords().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnabledCloudwatchLogsExports() == null) ? 0
                        : getEnabledCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getScalingConfigurationInfo() == null) ? 0 : getScalingConfigurationInfo()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode
                + ((getHttpEndpointEnabled() == null) ? 0 : getHttpEndpointEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getActivityStreamMode() == null) ? 0 : getActivityStreamMode().hashCode());
        hashCode = prime * hashCode
                + ((getActivityStreamStatus() == null) ? 0 : getActivityStreamStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getActivityStreamKmsKeyId() == null) ? 0 : getActivityStreamKmsKeyId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getActivityStreamKinesisStreamName() == null) ? 0
                        : getActivityStreamKinesisStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode
                + ((getCrossAccountClone() == null) ? 0 : getCrossAccountClone().hashCode());
        hashCode = prime * hashCode
                + ((getDomainMemberships() == null) ? 0 : getDomainMemberships().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalWriteForwardingStatus() == null) ? 0
                        : getGlobalWriteForwardingStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalWriteForwardingRequested() == null) ? 0
                        : getGlobalWriteForwardingRequested().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBCluster == false)
            return false;
        DBCluster other = (DBCluster) obj;

        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null
                && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterParameterGroup() == null ^ this.getDBClusterParameterGroup() == null)
            return false;
        if (other.getDBClusterParameterGroup() != null
                && other.getDBClusterParameterGroup().equals(this.getDBClusterParameterGroup()) == false)
            return false;
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null)
            return false;
        if (other.getDBSubnetGroup() != null
                && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null
                && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getEarliestRestorableTime() == null ^ this.getEarliestRestorableTime() == null)
            return false;
        if (other.getEarliestRestorableTime() != null
                && other.getEarliestRestorableTime().equals(this.getEarliestRestorableTime()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getReaderEndpoint() == null ^ this.getReaderEndpoint() == null)
            return false;
        if (other.getReaderEndpoint() != null
                && other.getReaderEndpoint().equals(this.getReaderEndpoint()) == false)
            return false;
        if (other.getCustomEndpoints() == null ^ this.getCustomEndpoints() == null)
            return false;
        if (other.getCustomEndpoints() != null
                && other.getCustomEndpoints().equals(this.getCustomEndpoints()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null
                && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDBClusterOptionGroupMemberships() == null
                ^ this.getDBClusterOptionGroupMemberships() == null)
            return false;
        if (other.getDBClusterOptionGroupMemberships() != null
                && other.getDBClusterOptionGroupMemberships().equals(
                        this.getDBClusterOptionGroupMemberships()) == false)
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
        if (other.getReplicationSourceIdentifier() == null
                ^ this.getReplicationSourceIdentifier() == null)
            return false;
        if (other.getReplicationSourceIdentifier() != null
                && other.getReplicationSourceIdentifier().equals(
                        this.getReplicationSourceIdentifier()) == false)
            return false;
        if (other.getReadReplicaIdentifiers() == null ^ this.getReadReplicaIdentifiers() == null)
            return false;
        if (other.getReadReplicaIdentifiers() != null
                && other.getReadReplicaIdentifiers().equals(this.getReadReplicaIdentifiers()) == false)
            return false;
        if (other.getDBClusterMembers() == null ^ this.getDBClusterMembers() == null)
            return false;
        if (other.getDBClusterMembers() != null
                && other.getDBClusterMembers().equals(this.getDBClusterMembers()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null
                && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
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
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null
                && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false)
            return false;
        if (other.getDBClusterArn() == null ^ this.getDBClusterArn() == null)
            return false;
        if (other.getDBClusterArn() != null
                && other.getDBClusterArn().equals(this.getDBClusterArn()) == false)
            return false;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null
                && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null
                ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(
                        this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getCloneGroupId() == null ^ this.getCloneGroupId() == null)
            return false;
        if (other.getCloneGroupId() != null
                && other.getCloneGroupId().equals(this.getCloneGroupId()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null
                && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getEarliestBacktrackTime() == null ^ this.getEarliestBacktrackTime() == null)
            return false;
        if (other.getEarliestBacktrackTime() != null
                && other.getEarliestBacktrackTime().equals(this.getEarliestBacktrackTime()) == false)
            return false;
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null
                && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getBacktrackConsumedChangeRecords() == null
                ^ this.getBacktrackConsumedChangeRecords() == null)
            return false;
        if (other.getBacktrackConsumedChangeRecords() != null
                && other.getBacktrackConsumedChangeRecords().equals(
                        this.getBacktrackConsumedChangeRecords()) == false)
            return false;
        if (other.getEnabledCloudwatchLogsExports() == null
                ^ this.getEnabledCloudwatchLogsExports() == null)
            return false;
        if (other.getEnabledCloudwatchLogsExports() != null
                && other.getEnabledCloudwatchLogsExports().equals(
                        this.getEnabledCloudwatchLogsExports()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null
                && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getScalingConfigurationInfo() == null
                ^ this.getScalingConfigurationInfo() == null)
            return false;
        if (other.getScalingConfigurationInfo() != null
                && other.getScalingConfigurationInfo().equals(this.getScalingConfigurationInfo()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getHttpEndpointEnabled() == null ^ this.getHttpEndpointEnabled() == null)
            return false;
        if (other.getHttpEndpointEnabled() != null
                && other.getHttpEndpointEnabled().equals(this.getHttpEndpointEnabled()) == false)
            return false;
        if (other.getActivityStreamMode() == null ^ this.getActivityStreamMode() == null)
            return false;
        if (other.getActivityStreamMode() != null
                && other.getActivityStreamMode().equals(this.getActivityStreamMode()) == false)
            return false;
        if (other.getActivityStreamStatus() == null ^ this.getActivityStreamStatus() == null)
            return false;
        if (other.getActivityStreamStatus() != null
                && other.getActivityStreamStatus().equals(this.getActivityStreamStatus()) == false)
            return false;
        if (other.getActivityStreamKmsKeyId() == null ^ this.getActivityStreamKmsKeyId() == null)
            return false;
        if (other.getActivityStreamKmsKeyId() != null
                && other.getActivityStreamKmsKeyId().equals(this.getActivityStreamKmsKeyId()) == false)
            return false;
        if (other.getActivityStreamKinesisStreamName() == null
                ^ this.getActivityStreamKinesisStreamName() == null)
            return false;
        if (other.getActivityStreamKinesisStreamName() != null
                && other.getActivityStreamKinesisStreamName().equals(
                        this.getActivityStreamKinesisStreamName()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null
                && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getCrossAccountClone() == null ^ this.getCrossAccountClone() == null)
            return false;
        if (other.getCrossAccountClone() != null
                && other.getCrossAccountClone().equals(this.getCrossAccountClone()) == false)
            return false;
        if (other.getDomainMemberships() == null ^ this.getDomainMemberships() == null)
            return false;
        if (other.getDomainMemberships() != null
                && other.getDomainMemberships().equals(this.getDomainMemberships()) == false)
            return false;
        if (other.getGlobalWriteForwardingStatus() == null
                ^ this.getGlobalWriteForwardingStatus() == null)
            return false;
        if (other.getGlobalWriteForwardingStatus() != null
                && other.getGlobalWriteForwardingStatus().equals(
                        this.getGlobalWriteForwardingStatus()) == false)
            return false;
        if (other.getGlobalWriteForwardingRequested() == null
                ^ this.getGlobalWriteForwardingRequested() == null)
            return false;
        if (other.getGlobalWriteForwardingRequested() != null
                && other.getGlobalWriteForwardingRequested().equals(
                        this.getGlobalWriteForwardingRequested()) == false)
            return false;
        return true;
    }
}
