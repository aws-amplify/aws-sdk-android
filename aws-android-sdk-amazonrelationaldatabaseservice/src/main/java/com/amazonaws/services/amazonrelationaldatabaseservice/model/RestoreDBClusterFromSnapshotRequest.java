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
 * Creates a new DB cluster from a DB snapshot or DB cluster snapshot. This
 * action only applies to Aurora DB clusters.
 * </p>
 * <p>
 * The target DB cluster is created from the source snapshot with a default
 * configuration. If you don't specify a security group, the new DB cluster is
 * associated with the default security group.
 * </p>
 * <note>
 * <p>
 * This action only restores the DB cluster, not the DB instances for that DB
 * cluster. You must invoke the <code>CreateDBInstance</code> action to create
 * DB instances for the restored DB cluster, specifying the identifier of the
 * restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB
 * instances only after the <code>RestoreDBClusterFromSnapshot</code> action has
 * completed and the DB cluster is available.
 * </p>
 * </note>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 */
public class RestoreDBClusterFromSnapshotRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the
     * restored DB cluster can be created.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster
     * snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore
     * from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify
     * a DB cluster snapshot. However, you can use only the ARN to specify a DB
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for
     * MySQL 5.6-compatible Aurora), use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <note>
     * <p>
     * If you aren't using the default engine version, then you must specify the
     * engine version.
     * </p>
     * </note>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>,
     * <code>5.7.12</code>, <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet
     * group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB
     * snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> isn't encrypted, then the restored DB
     * cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72
     * hours).
     * </p>
     * </li>
     * </ul>
     */
    private Long backtrackWindow;

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon
     * CloudWatch Logs. The values in the list depend on the DB engine being
     * used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     */
    private java.util.List<String> enableCloudwatchLogsExports;

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>,
     * <code>serverless</code>, <code>parallelquery</code>, <code>global</code>,
     * or <code>multimaster</code>.
     * </p>
     */
    private String engineMode;

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling
     * properties of the DB cluster.
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, the default DB cluster parameter
     * group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster
     * parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     */
    private String dBClusterParameterGroupName;

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * cluster to snapshots of the restored DB cluster. The default is not to
     * copy them.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in.
     * The domain must be created prior to this operation.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     */
    private String domainIAMRoleName;

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the
     * restored DB cluster can be created.
     * </p>
     *
     * @return <p>
     *         Provides the list of Availability Zones (AZs) where instances in
     *         the restored DB cluster can be created.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the
     * restored DB cluster can be created.
     * </p>
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the restored DB cluster can be created.
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
     * Provides the list of Availability Zones (AZs) where instances in the
     * restored DB cluster can be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the restored DB cluster can be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(String... availabilityZones) {
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
     * Provides the list of Availability Zones (AZs) where instances in the
     * restored DB cluster can be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the restored DB cluster can be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster
     * snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     *
     * @return <p>
     *         The name of the DB cluster to create from the DB snapshot or DB
     *         cluster snapshot. This parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-snapshot-id</code>
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster
     * snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The name of the DB cluster to create from the DB snapshot or
     *            DB cluster snapshot. This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-snapshot-id</code>
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster
     * snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The name of the DB cluster to create from the DB snapshot or
     *            DB cluster snapshot. This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-snapshot-id</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore
     * from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify
     * a DB cluster snapshot. However, you can use only the ARN to specify a DB
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier for the DB snapshot or DB cluster snapshot to
     *         restore from.
     *         </p>
     *         <p>
     *         You can use either the name or the Amazon Resource Name (ARN) to
     *         specify a DB cluster snapshot. However, you can use only the ARN
     *         to specify a DB snapshot.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing Snapshot.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore
     * from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify
     * a DB cluster snapshot. However, you can use only the ARN to specify a DB
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     *
     * @param snapshotIdentifier <p>
     *            The identifier for the DB snapshot or DB cluster snapshot to
     *            restore from.
     *            </p>
     *            <p>
     *            You can use either the name or the Amazon Resource Name (ARN)
     *            to specify a DB cluster snapshot. However, you can use only
     *            the ARN to specify a DB snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing Snapshot.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore
     * from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify
     * a DB cluster snapshot. However, you can use only the ARN to specify a DB
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing Snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The identifier for the DB snapshot or DB cluster snapshot to
     *            restore from.
     *            </p>
     *            <p>
     *            You can use either the name or the Amazon Resource Name (ARN)
     *            to specify a DB cluster snapshot. However, you can use only
     *            the ARN to specify a DB snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing Snapshot.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     *
     * @return <p>
     *         The database engine to use for the new DB cluster.
     *         </p>
     *         <p>
     *         Default: The same as source
     *         </p>
     *         <p>
     *         Constraint: Must be compatible with the engine of the source
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     *
     * @param engine <p>
     *            The database engine to use for the new DB cluster.
     *            </p>
     *            <p>
     *            Default: The same as source
     *            </p>
     *            <p>
     *            Constraint: Must be compatible with the engine of the source
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The database engine to use for the new DB cluster.
     *            </p>
     *            <p>
     *            Default: The same as source
     *            </p>
     *            <p>
     *            Constraint: Must be compatible with the engine of the source
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for
     * MySQL 5.6-compatible Aurora), use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <note>
     * <p>
     * If you aren't using the default engine version, then you must specify the
     * engine version.
     * </p>
     * </note>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>,
     * <code>5.7.12</code>, <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     *
     * @return <p>
     *         The version of the database engine to use for the new DB cluster.
     *         </p>
     *         <p>
     *         To list all of the available engine versions for
     *         <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     *         following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for
     *         <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     *         the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for
     *         <code>aurora-postgresql</code>, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <note>
     *         <p>
     *         If you aren't using the default engine version, then you must
     *         specify the engine version.
     *         </p>
     *         </note>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         Example: <code>5.6.10a</code>,
     *         <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     *         <code>5.7.mysql_aurora.2.04.5</code>
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         Example: <code>9.6.3</code>, <code>10.7</code>
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for
     * MySQL 5.6-compatible Aurora), use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <note>
     * <p>
     * If you aren't using the default engine version, then you must specify the
     * engine version.
     * </p>
     * </note>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>,
     * <code>5.7.12</code>, <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     *
     * @param engineVersion <p>
     *            The version of the database engine to use for the new DB
     *            cluster.
     *            </p>
     *            <p>
     *            To list all of the available engine versions for
     *            <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     *            following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *            </p>
     *            <p>
     *            To list all of the available engine versions for
     *            <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora),
     *            use the following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *            </p>
     *            <p>
     *            To list all of the available engine versions for
     *            <code>aurora-postgresql</code>, use the following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *            </p>
     *            <note>
     *            <p>
     *            If you aren't using the default engine version, then you must
     *            specify the engine version.
     *            </p>
     *            </note>
     *            <p>
     *            <b>Aurora MySQL</b>
     *            </p>
     *            <p>
     *            Example: <code>5.6.10a</code>,
     *            <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     *            <code>5.7.mysql_aurora.2.04.5</code>
     *            </p>
     *            <p>
     *            <b>Aurora PostgreSQL</b>
     *            </p>
     *            <p>
     *            Example: <code>9.6.3</code>, <code>10.7</code>
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for
     * MySQL 5.6-compatible Aurora), use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for
     * <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <note>
     * <p>
     * If you aren't using the default engine version, then you must specify the
     * engine version.
     * </p>
     * </note>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Example: <code>5.6.10a</code>, <code>5.6.mysql_aurora.1.19.2</code>,
     * <code>5.7.12</code>, <code>5.7.mysql_aurora.2.04.5</code>
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Example: <code>9.6.3</code>, <code>10.7</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version of the database engine to use for the new DB
     *            cluster.
     *            </p>
     *            <p>
     *            To list all of the available engine versions for
     *            <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     *            following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *            </p>
     *            <p>
     *            To list all of the available engine versions for
     *            <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora),
     *            use the following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *            </p>
     *            <p>
     *            To list all of the available engine versions for
     *            <code>aurora-postgresql</code>, use the following command:
     *            </p>
     *            <p>
     *            <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *            </p>
     *            <note>
     *            <p>
     *            If you aren't using the default engine version, then you must
     *            specify the engine version.
     *            </p>
     *            </note>
     *            <p>
     *            <b>Aurora MySQL</b>
     *            </p>
     *            <p>
     *            Example: <code>5.6.10a</code>,
     *            <code>5.6.mysql_aurora.1.19.2</code>, <code>5.7.12</code>,
     *            <code>5.7.mysql_aurora.2.04.5</code>
     *            </p>
     *            <p>
     *            <b>Aurora PostgreSQL</b>
     *            </p>
     *            <p>
     *            Example: <code>9.6.3</code>, <code>10.7</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     *
     * @return <p>
     *         The port number on which the new DB cluster accepts connections.
     *         </p>
     *         <p>
     *         Constraints: This value must be <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Default: The same port as the original DB cluster.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     *
     * @param port <p>
     *            The port number on which the new DB cluster accepts
     *            connections.
     *            </p>
     *            <p>
     *            Constraints: This value must be <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Default: The same port as the original DB cluster.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which the new DB cluster accepts
     *            connections.
     *            </p>
     *            <p>
     *            Constraints: This value must be <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Default: The same port as the original DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet
     * group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         The name of the DB subnet group to use for the new DB cluster.
     *         </p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing DB
     *         subnet group.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     *         </p>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet
     * group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            The name of the DB subnet group to use for the new DB cluster.
     *            </p>
     *            <p>
     *            Constraints: If supplied, must match the name of an existing
     *            DB subnet group.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DB subnet
     * group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            The name of the DB subnet group to use for the new DB cluster.
     *            </p>
     *            <p>
     *            Constraints: If supplied, must match the name of an existing
     *            DB subnet group.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     *
     * @return <p>
     *         The database name for the restored DB cluster.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     *
     * @param databaseName <p>
     *            The database name for the restored DB cluster.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The database name for the restored DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     *
     * @return <p>
     *         The name of the option group to use for the restored DB cluster.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     *
     * @param optionGroupName <p>
     *            The name of the option group to use for the restored DB
     *            cluster.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The name of the option group to use for the restored DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     *
     * @return <p>
     *         A list of VPC security groups that the new DB cluster will belong
     *         to.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the new DB cluster will
     *            belong to.
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
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the new DB cluster will
     *            belong to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(
            String... vpcSecurityGroupIds) {
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
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the new DB cluster will
     *            belong to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     *
     * @return <p>
     *         The tags to be assigned to the restored DB cluster.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     *
     * @param tags <p>
     *            The tags to be assigned to the restored DB cluster.
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
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be assigned to the restored DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withTags(Tag... tags) {
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
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be assigned to the restored DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB
     * snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> isn't encrypted, then the restored DB
     * cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The AWS KMS key identifier to use when restoring an encrypted DB
     *         cluster from a DB snapshot or DB cluster snapshot.
     *         </p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the
     *         KMS encryption key. If you are restoring a DB cluster with the
     *         same AWS account that owns the KMS encryption key used to encrypt
     *         the new DB cluster, then you can use the KMS key alias instead of
     *         the ARN for the KMS encryption key.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code>
     *         parameter, then the following occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the DB snapshot or DB cluster snapshot in
     *         <code>SnapshotIdentifier</code> is encrypted, then the restored
     *         DB cluster is encrypted using the KMS key that was used to
     *         encrypt the DB snapshot or DB cluster snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DB snapshot or DB cluster snapshot in
     *         <code>SnapshotIdentifier</code> isn't encrypted, then the
     *         restored DB cluster isn't encrypted.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB
     * snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> isn't encrypted, then the restored DB
     * cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier to use when restoring an encrypted
     *            DB cluster from a DB snapshot or DB cluster snapshot.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are restoring a DB cluster with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB cluster, then you can use the KMS key alias
     *            instead of the ARN for the KMS encryption key.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then the following occurs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the DB snapshot or DB cluster snapshot in
     *            <code>SnapshotIdentifier</code> is encrypted, then the
     *            restored DB cluster is encrypted using the KMS key that was
     *            used to encrypt the DB snapshot or DB cluster snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the DB snapshot or DB cluster snapshot in
     *            <code>SnapshotIdentifier</code> isn't encrypted, then the
     *            restored DB cluster isn't encrypted.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB
     * snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in
     * <code>SnapshotIdentifier</code> isn't encrypted, then the restored DB
     * cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier to use when restoring an encrypted
     *            DB cluster from a DB snapshot or DB cluster snapshot.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are restoring a DB cluster with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB cluster, then you can use the KMS key alias
     *            instead of the ARN for the KMS encryption key.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then the following occurs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the DB snapshot or DB cluster snapshot in
     *            <code>SnapshotIdentifier</code> is encrypted, then the
     *            restored DB cluster is encrypted using the KMS key that was
     *            used to encrypt the DB snapshot or DB cluster snapshot.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the DB snapshot or DB cluster snapshot in
     *            <code>SnapshotIdentifier</code> isn't encrypted, then the
     *            restored DB cluster isn't encrypted.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     *         > IAM Database Authentication</a> in the <i>Amazon Aurora User
     *         Guide.</i>
     *         </p>
     */
    public Boolean isEnableIAMDatabaseAuthentication() {
        return enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     *         > IAM Database Authentication</a> in the <i>Amazon Aurora User
     *         Guide.</i>
     *         </p>
     */
    public Boolean getEnableIAMDatabaseAuthentication() {
        return enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     *
     * @param enableIAMDatabaseAuthentication <p>
     *            A value that indicates whether to enable mapping of AWS
     *            Identity and Access Management (IAM) accounts to database
     *            accounts. By default, mapping is disabled.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     *            > IAM Database Authentication</a> in the <i>Amazon Aurora User
     *            Guide.</i>
     *            </p>
     */
    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableIAMDatabaseAuthentication <p>
     *            A value that indicates whether to enable mapping of AWS
     *            Identity and Access Management (IAM) accounts to database
     *            accounts. By default, mapping is disabled.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"
     *            > IAM Database Authentication</a> in the <i>Amazon Aurora User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withEnableIAMDatabaseAuthentication(
            Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
        return this;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72
     * hours).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The target backtrack window, in seconds. To disable backtracking,
     *         set this value to 0.
     *         </p>
     *         <p>
     *         Default: 0
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If specified, this value must be set to a number from 0 to
     *         259,200 (72 hours).
     *         </p>
     *         </li>
     *         </ul>
     */
    public Long getBacktrackWindow() {
        return backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72
     * hours).
     * </p>
     * </li>
     * </ul>
     *
     * @param backtrackWindow <p>
     *            The target backtrack window, in seconds. To disable
     *            backtracking, set this value to 0.
     *            </p>
     *            <p>
     *            Default: 0
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If specified, this value must be set to a number from 0 to
     *            259,200 (72 hours).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set
     * this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72
     * hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backtrackWindow <p>
     *            The target backtrack window, in seconds. To disable
     *            backtracking, set this value to 0.
     *            </p>
     *            <p>
     *            Default: 0
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If specified, this value must be set to a number from 0 to
     *            259,200 (72 hours).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon
     * CloudWatch Logs. The values in the list depend on the DB engine being
     * used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of logs that the restored DB cluster is to export to
     *         Amazon CloudWatch Logs. The values in the list depend on the DB
     *         engine being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs </a> in the
     *         <i>Amazon Aurora User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getEnableCloudwatchLogsExports() {
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon
     * CloudWatch Logs. The values in the list depend on the DB engine being
     * used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB cluster is to export to
     *            Amazon CloudWatch Logs. The values in the list depend on the
     *            DB engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs </a> in
     *            the <i>Amazon Aurora User Guide</i>.
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
     * The list of logs that the restored DB cluster is to export to Amazon
     * CloudWatch Logs. The values in the list depend on the DB engine being
     * used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB cluster is to export to
     *            Amazon CloudWatch Logs. The values in the list depend on the
     *            DB engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs </a> in
     *            the <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(
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
     * The list of logs that the restored DB cluster is to export to Amazon
     * CloudWatch Logs. The values in the list depend on the DB engine being
     * used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB cluster is to export to
     *            Amazon CloudWatch Logs. The values in the list depend on the
     *            DB engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs </a> in
     *            the <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(
            java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>,
     * <code>serverless</code>, <code>parallelquery</code>, <code>global</code>,
     * or <code>multimaster</code>.
     * </p>
     *
     * @return <p>
     *         The DB engine mode of the DB cluster, either
     *         <code>provisioned</code>, <code>serverless</code>,
     *         <code>parallelquery</code>, <code>global</code>, or
     *         <code>multimaster</code>.
     *         </p>
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
     *
     * @param engineMode <p>
     *            The DB engine mode of the DB cluster, either
     *            <code>provisioned</code>, <code>serverless</code>,
     *            <code>parallelquery</code>, <code>global</code>, or
     *            <code>multimaster</code>.
     *            </p>
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withEngineMode(String engineMode) {
        this.engineMode = engineMode;
        return this;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling
     * properties of the DB cluster.
     * </p>
     *
     * @return <p>
     *         For DB clusters in <code>serverless</code> DB engine mode, the
     *         scaling properties of the DB cluster.
     *         </p>
     */
    public ScalingConfiguration getScalingConfiguration() {
        return scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling
     * properties of the DB cluster.
     * </p>
     *
     * @param scalingConfiguration <p>
     *            For DB clusters in <code>serverless</code> DB engine mode, the
     *            scaling properties of the DB cluster.
     *            </p>
     */
    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling
     * properties of the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingConfiguration <p>
     *            For DB clusters in <code>serverless</code> DB engine mode, the
     *            scaling properties of the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withScalingConfiguration(
            ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, the default DB cluster parameter
     * group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster
     * parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     *
     * @return <p>
     *         The name of the DB cluster parameter group to associate with this
     *         DB cluster. If this argument is omitted, the default DB cluster
     *         parameter group for the specified engine is used.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing default DB
     *         cluster parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
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
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, the default DB cluster parameter
     * group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster
     * parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to associate with
     *            this DB cluster. If this argument is omitted, the default DB
     *            cluster parameter group for the specified engine is used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the name of an existing default DB
     *            cluster parameter group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
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
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, the default DB cluster parameter
     * group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster
     * parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to associate with
     *            this DB cluster. If this argument is omitted, the default DB
     *            cluster parameter group for the specified engine is used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the name of an existing default DB
     *            cluster parameter group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB cluster has deletion
     *         protection enabled. The database can't be deleted when deletion
     *         protection is enabled. By default, deletion protection is
     *         disabled.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB cluster has deletion
     *         protection enabled. The database can't be deleted when deletion
     *         protection is enabled. By default, deletion protection is
     *         disabled.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled.
     * </p>
     *
     * @param deletionProtection <p>
     *            A value that indicates whether the DB cluster has deletion
     *            protection enabled. The database can't be deleted when
     *            deletion protection is enabled. By default, deletion
     *            protection is disabled.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            A value that indicates whether the DB cluster has deletion
     *            protection enabled. The database can't be deleted when
     *            deletion protection is enabled. By default, deletion
     *            protection is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * cluster to snapshots of the restored DB cluster. The default is not to
     * copy them.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the restored
     *         DB cluster to snapshots of the restored DB cluster. The default
     *         is not to copy them.
     *         </p>
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * cluster to snapshots of the restored DB cluster. The default is not to
     * copy them.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the restored
     *         DB cluster to snapshots of the restored DB cluster. The default
     *         is not to copy them.
     *         </p>
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * cluster to snapshots of the restored DB cluster. The default is not to
     * copy them.
     * </p>
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the
     *            restored DB cluster to snapshots of the restored DB cluster.
     *            The default is not to copy them.
     *            </p>
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * cluster to snapshots of the restored DB cluster. The default is not to
     * copy them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the
     *            restored DB cluster to snapshots of the restored DB cluster.
     *            The default is not to copy them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in.
     * The domain must be created prior to this operation.
     * </p>
     *
     * @return <p>
     *         Specify the Active Directory directory ID to restore the DB
     *         cluster in. The domain must be created prior to this operation.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in.
     * The domain must be created prior to this operation.
     * </p>
     *
     * @param domain <p>
     *            Specify the Active Directory directory ID to restore the DB
     *            cluster in. The domain must be created prior to this
     *            operation.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in.
     * The domain must be created prior to this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            Specify the Active Directory directory ID to restore the DB
     *            cluster in. The domain must be created prior to this
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     *
     * @return <p>
     *         Specify the name of the IAM role to be used when making API calls
     *         to the Directory Service.
     *         </p>
     */
    public String getDomainIAMRoleName() {
        return domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     *
     * @param domainIAMRoleName <p>
     *            Specify the name of the IAM role to be used when making API
     *            calls to the Directory Service.
     *            </p>
     */
    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainIAMRoleName <p>
     *            Specify the name of the IAM role to be used when making API
     *            calls to the Directory Service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterFromSnapshotRequest withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: " + getEnableIAMDatabaseAuthentication()
                    + ",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: " + getBacktrackWindow() + ",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: " + getEnableCloudwatchLogsExports() + ",");
        if (getEngineMode() != null)
            sb.append("EngineMode: " + getEngineMode() + ",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: " + getScalingConfiguration() + ",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: " + getDomainIAMRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableIAMDatabaseAuthentication() == null) ? 0
                        : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode
                + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableCloudwatchLogsExports() == null) ? 0
                        : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode
                + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroupName() == null) ? 0
                        : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBClusterFromSnapshotRequest == false)
            return false;
        RestoreDBClusterFromSnapshotRequest other = (RestoreDBClusterFromSnapshotRequest) obj;

        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
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
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null
                ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(
                        this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null
                && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null
                ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null
                && other.getEnableCloudwatchLogsExports().equals(
                        this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null
                && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null
                && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getDBClusterParameterGroupName() == null
                ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null
                && other.getDBClusterParameterGroupName().equals(
                        this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null
                && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null
                && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        return true;
    }
}
