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
 * Creates a new Amazon Aurora DB cluster.
 * </p>
 * <p>
 * You can use the <code>ReplicationSourceIdentifier</code> parameter to create
 * the DB cluster as a read replica of another DB cluster or Amazon RDS MySQL DB
 * instance. For cross-region replication where the DB cluster identified by
 * <code>ReplicationSourceIdentifier</code> is encrypted, you must also specify
 * the <code>PreSignedUrl</code> parameter.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class CreateDBClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can
     * be created. For information on AWS Regions and Availability Zones, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     */
    private String characterSetName;

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do
     * not provide a name, Amazon RDS doesn't create a database in the DB
     * cluster you are creating.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
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
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If you do not specify a value, then the default DB cluster
     * parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterParameterGroupName;

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), and
     * <code>aurora-postgresql</code>
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version number of the database engine to use.
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
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code> if engine is set as aurora or
     * <code>5432</code> if set to aurora-postgresql.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The name of the master user for the DB cluster.
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
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group
     * can't be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
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
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week. To
     * see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if
     * this DB cluster is created as a read replica.
     * </p>
     */
    private String replicationSourceIdentifier;

    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If an encryption key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted
     * source, then Amazon RDS will use the encryption key used to encrypt the
     * source. Otherwise, Amazon RDS will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and
     * <code>ReplicationSourceIdentifier</code> isn't specified, then Amazon RDS
     * will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS
     * Region, you must set <code>KmsKeyId</code> to a KMS key ID that is valid
     * in the destination AWS Region. This key is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBCluster</code> action to be called in the source AWS Region
     * where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region
     * replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CreateDBCluster</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster in the destination AWS Region. This
     * should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> action that is called in the destination AWS
     * Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora
     * read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for
     * the encrypted DB cluster to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB cluster from the us-west-2 AWS Region,
     * then your <code>ReplicationSourceIdentifier</code> would look like
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     */
    private String preSignedUrl;

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
     * The list of log types that need to be enabled for exporting to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
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
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more
     * information, see the following sections in the <i>Amazon Aurora User
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Requirements for Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
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
     * A value that indicates whether the DB cluster has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary
     * cluster in the new global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora
     * Serverless DB cluster. By default, the HTTP endpoint is disabled.
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
    private Boolean enableHttpEndpoint;

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to
     * snapshots of the DB cluster. The default is not to copy them.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication
     * to authenticate users that connect to the DB cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html"
     * >Kerberos Authentication</a> in the <i>Amazon Aurora User Guide</i>.
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
     * A list of Availability Zones (AZs) where instances in the DB cluster can
     * be created. For information on AWS Regions and Availability Zones, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of Availability Zones (AZs) where instances in the DB
     *         cluster can be created. For information on AWS Regions and
     *         Availability Zones, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Choosing the Regions and Availability Zones</a> in the <i>Amazon
     *         Aurora User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where instances in the DB cluster can
     * be created. For information on AWS Regions and Availability Zones, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     *
     * @param availabilityZones <p>
     *            A list of Availability Zones (AZs) where instances in the DB
     *            cluster can be created. For information on AWS Regions and
     *            Availability Zones, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Choosing the Regions and Availability Zones</a> in the
     *            <i>Amazon Aurora User Guide</i>.
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
     * A list of Availability Zones (AZs) where instances in the DB cluster can
     * be created. For information on AWS Regions and Availability Zones, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of Availability Zones (AZs) where instances in the DB
     *            cluster can be created. For information on AWS Regions and
     *            Availability Zones, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Choosing the Regions and Availability Zones</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withAvailabilityZones(String... availabilityZones) {
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
     * A list of Availability Zones (AZs) where instances in the DB cluster can
     * be created. For information on AWS Regions and Availability Zones, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of Availability Zones (AZs) where instances in the DB
     *            cluster can be created. For information on AWS Regions and
     *            Availability Zones, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Choosing the Regions and Availability Zones</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of days for which automated backups are retained.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 1 to 35
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be a value from 1 to 35
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be a value from 1 to 35
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     *
     * @return <p>
     *         A value that indicates that the DB cluster should be associated
     *         with the specified CharacterSet.
     *         </p>
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     *
     * @param characterSetName <p>
     *            A value that indicates that the DB cluster should be
     *            associated with the specified CharacterSet.
     *            </p>
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified CharacterSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterSetName <p>
     *            A value that indicates that the DB cluster should be
     *            associated with the specified CharacterSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do
     * not provide a name, Amazon RDS doesn't create a database in the DB
     * cluster you are creating.
     * </p>
     *
     * @return <p>
     *         The name for your database of up to 64 alphanumeric characters.
     *         If you do not provide a name, Amazon RDS doesn't create a
     *         database in the DB cluster you are creating.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do
     * not provide a name, Amazon RDS doesn't create a database in the DB
     * cluster you are creating.
     * </p>
     *
     * @param databaseName <p>
     *            The name for your database of up to 64 alphanumeric
     *            characters. If you do not provide a name, Amazon RDS doesn't
     *            create a database in the DB cluster you are creating.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do
     * not provide a name, Amazon RDS doesn't create a database in the DB
     * cluster you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The name for your database of up to 64 alphanumeric
     *            characters. If you do not provide a name, Amazon RDS doesn't
     *            create a database in the DB cluster you are creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
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
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier. This parameter is stored as a
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
     *         Example: <code>my-cluster1</code>
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
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
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier. This parameter is stored as a
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
     *            Example: <code>my-cluster1</code>
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase
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
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier. This parameter is stored as a
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
     *            Example: <code>my-cluster1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If you do not specify a value, then the default DB cluster
     * parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the DB cluster parameter group to associate with this
     *         DB cluster. If you do not specify a value, then the default DB
     *         cluster parameter group for the specified DB engine and version
     *         is used.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DB cluster
     *         parameter group.
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
     * cluster. If you do not specify a value, then the default DB cluster
     * parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to associate with
     *            this DB cluster. If you do not specify a value, then the
     *            default DB cluster parameter group for the specified DB engine
     *            and version is used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the name of an existing DB cluster
     *            parameter group.
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
     * cluster. If you do not specify a value, then the default DB cluster
     * parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to associate with
     *            this DB cluster. If you do not specify a value, then the
     *            default DB cluster parameter group for the specified DB engine
     *            and version is used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the name of an existing DB cluster
     *            parameter group.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     *
     * @return <p>
     *         A list of EC2 VPC security groups to associate with this DB
     *         cluster.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of EC2 VPC security groups to associate with this DB
     *            cluster.
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
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of EC2 VPC security groups to associate with this DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of EC2 VPC security groups to associate with this DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         A DB subnet group to associate with this DB cluster.
     *         </p>
     *         <p>
     *         Constraints: Must match the name of an existing DBSubnetGroup.
     *         Must not be default.
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
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            A DB subnet group to associate with this DB cluster.
     *            </p>
     *            <p>
     *            Constraints: Must match the name of an existing DBSubnetGroup.
     *            Must not be default.
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
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            A DB subnet group to associate with this DB cluster.
     *            </p>
     *            <p>
     *            Constraints: Must match the name of an existing DBSubnetGroup.
     *            Must not be default.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), and
     * <code>aurora-postgresql</code>
     * </p>
     *
     * @return <p>
     *         The name of the database engine to be used for this DB cluster.
     *         </p>
     *         <p>
     *         Valid Values: <code>aurora</code> (for MySQL 5.6-compatible
     *         Aurora), <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *         Aurora), and <code>aurora-postgresql</code>
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), and
     * <code>aurora-postgresql</code>
     * </p>
     *
     * @param engine <p>
     *            The name of the database engine to be used for this DB
     *            cluster.
     *            </p>
     *            <p>
     *            Valid Values: <code>aurora</code> (for MySQL 5.6-compatible
     *            Aurora), <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *            Aurora), and <code>aurora-postgresql</code>
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), and
     * <code>aurora-postgresql</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the database engine to be used for this DB
     *            cluster.
     *            </p>
     *            <p>
     *            Valid Values: <code>aurora</code> (for MySQL 5.6-compatible
     *            Aurora), <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *            Aurora), and <code>aurora-postgresql</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use.
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
     *         The version number of the database engine to use.
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
     * The version number of the database engine to use.
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
     *            The version number of the database engine to use.
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
     * The version number of the database engine to use.
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
     *            The version number of the database engine to use.
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
    public CreateDBClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code> if engine is set as aurora or
     * <code>5432</code> if set to aurora-postgresql.
     * </p>
     *
     * @return <p>
     *         The port number on which the instances in the DB cluster accept
     *         connections.
     *         </p>
     *         <p>
     *         Default: <code>3306</code> if engine is set as aurora or
     *         <code>5432</code> if set to aurora-postgresql.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code> if engine is set as aurora or
     * <code>5432</code> if set to aurora-postgresql.
     * </p>
     *
     * @param port <p>
     *            The port number on which the instances in the DB cluster
     *            accept connections.
     *            </p>
     *            <p>
     *            Default: <code>3306</code> if engine is set as aurora or
     *            <code>5432</code> if set to aurora-postgresql.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept
     * connections.
     * </p>
     * <p>
     * Default: <code>3306</code> if engine is set as aurora or
     * <code>5432</code> if set to aurora-postgresql.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which the instances in the DB cluster
     *            accept connections.
     *            </p>
     *            <p>
     *            Default: <code>3306</code> if engine is set as aurora or
     *            <code>5432</code> if set to aurora-postgresql.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
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
     *         The name of the master user for the DB cluster.
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
     * The name of the master user for the DB cluster.
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
     *            The name of the master user for the DB cluster.
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
     * The name of the master user for the DB cluster.
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
     *            The name of the master user for the DB cluster.
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
    public CreateDBClusterRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     *
     * @return <p>
     *         The password for the master database user. This password can
     *         contain any printable ASCII character except "/", """, or "@".
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
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     *
     * @param masterUserPassword <p>
     *            The password for the master database user. This password can
     *            contain any printable ASCII character except "/", """, or "@".
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
     * The password for the master database user. This password can contain any
     * printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            The password for the master database user. This password can
     *            contain any printable ASCII character except "/", """, or "@".
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group
     * can't be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         A value that indicates that the DB cluster should be associated
     *         with the specified option group.
     *         </p>
     *         <p>
     *         Permanent options can't be removed from an option group. The
     *         option group can't be removed from a DB cluster once it is
     *         associated with a DB cluster.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group
     * can't be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     *
     * @param optionGroupName <p>
     *            A value that indicates that the DB cluster should be
     *            associated with the specified option group.
     *            </p>
     *            <p>
     *            Permanent options can't be removed from an option group. The
     *            option group can't be removed from a DB cluster once it is
     *            associated with a DB cluster.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group
     * can't be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            A value that indicates that the DB cluster should be
     *            associated with the specified option group.
     *            </p>
     *            <p>
     *            Permanent options can't be removed from an option group. The
     *            option group can't be removed from a DB cluster once it is
     *            associated with a DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
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
     *         The daily time range during which automated backups are created
     *         if automated backups are enabled using the
     *         <code>BackupRetentionPeriod</code> parameter.
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an
     *         8-hour block of time for each AWS Region. To see the time blocks
     *         available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *         > Adjusting the Preferred DB Cluster Maintenance Window</a> in
     *         the <i>Amazon Aurora User Guide.</i>
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
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
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
     *            The daily time range during which automated backups are
     *            created if automated backups are enabled using the
     *            <code>BackupRetentionPeriod</code> parameter.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. To see the time
     *            blocks available, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *            > Adjusting the Preferred DB Cluster Maintenance Window</a> in
     *            the <i>Amazon Aurora User Guide.</i>
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
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
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
     *            The daily time range during which automated backups are
     *            created if automated backups are enabled using the
     *            <code>BackupRetentionPeriod</code> parameter.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. To see the time
     *            blocks available, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *            > Adjusting the Preferred DB Cluster Maintenance Window</a> in
     *            the <i>Amazon Aurora User Guide.</i>
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
    public CreateDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week. To
     * see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @return <p>
     *         The weekly time range during which system maintenance can occur,
     *         in Universal Coordinated Time (UTC).
     *         </p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an
     *         8-hour block of time for each AWS Region, occurring on a random
     *         day of the week. To see the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *         > Adjusting the Preferred DB Cluster Maintenance Window</a> in
     *         the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     *         </p>
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week. To
     * see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC).
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region, occurring on a
     *            random day of the week. To see the time blocks available, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *            > Adjusting the Preferred DB Cluster Maintenance Window</a> in
     *            the <i>Amazon Aurora User Guide.</i>
     *            </p>
     *            <p>
     *            Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *            </p>
     *            <p>
     *            Constraints: Minimum 30-minute window.
     *            </p>
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week. To
     * see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the
     * <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMaintenanceWindow <p>
     *            The weekly time range during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC).
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region, occurring on a
     *            random day of the week. To see the time blocks available, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *            > Adjusting the Preferred DB Cluster Maintenance Window</a> in
     *            the <i>Amazon Aurora User Guide.</i>
     *            </p>
     *            <p>
     *            Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *            </p>
     *            <p>
     *            Constraints: Minimum 30-minute window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if
     * this DB cluster is created as a read replica.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source DB instance or DB
     *         cluster if this DB cluster is created as a read replica.
     *         </p>
     */
    public String getReplicationSourceIdentifier() {
        return replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if
     * this DB cluster is created as a read replica.
     * </p>
     *
     * @param replicationSourceIdentifier <p>
     *            The Amazon Resource Name (ARN) of the source DB instance or DB
     *            cluster if this DB cluster is created as a read replica.
     *            </p>
     */
    public void setReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if
     * this DB cluster is created as a read replica.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationSourceIdentifier <p>
     *            The Amazon Resource Name (ARN) of the source DB instance or DB
     *            cluster if this DB cluster is created as a read replica.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     *
     * @return <p>
     *         Tags to assign to the DB cluster.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     *
     * @param tags <p>
     *            Tags to assign to the DB cluster.
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
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withTags(Tag... tags) {
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
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB cluster is encrypted.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB cluster is encrypted.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     *
     * @param storageEncrypted <p>
     *            A value that indicates whether the DB cluster is encrypted.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            A value that indicates whether the DB cluster is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If an encryption key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted
     * source, then Amazon RDS will use the encryption key used to encrypt the
     * source. Otherwise, Amazon RDS will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and
     * <code>ReplicationSourceIdentifier</code> isn't specified, then Amazon RDS
     * will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS
     * Region, you must set <code>KmsKeyId</code> to a KMS key ID that is valid
     * in the destination AWS Region. This key is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier for an encrypted DB cluster.
     *         </p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the
     *         KMS encryption key. If you are creating a DB cluster with the
     *         same AWS account that owns the KMS encryption key used to encrypt
     *         the new DB cluster, then you can use the KMS key alias instead of
     *         the ARN for the KMS encryption key.
     *         </p>
     *         <p>
     *         If an encryption key isn't specified in <code>KmsKeyId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ReplicationSourceIdentifier</code> identifies an
     *         encrypted source, then Amazon RDS will use the encryption key
     *         used to encrypt the source. Otherwise, Amazon RDS will use your
     *         default encryption key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the <code>StorageEncrypted</code> parameter is enabled and
     *         <code>ReplicationSourceIdentifier</code> isn't specified, then
     *         Amazon RDS will use your default encryption key.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS KMS creates the default encryption key for your AWS account.
     *         Your AWS account has a different default encryption key for each
     *         AWS Region.
     *         </p>
     *         <p>
     *         If you create a read replica of an encrypted DB cluster in
     *         another AWS Region, you must set <code>KmsKeyId</code> to a KMS
     *         key ID that is valid in the destination AWS Region. This key is
     *         used to encrypt the read replica in that AWS Region.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If an encryption key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted
     * source, then Amazon RDS will use the encryption key used to encrypt the
     * source. Otherwise, Amazon RDS will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and
     * <code>ReplicationSourceIdentifier</code> isn't specified, then Amazon RDS
     * will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS
     * Region, you must set <code>KmsKeyId</code> to a KMS key ID that is valid
     * in the destination AWS Region. This key is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for an encrypted DB cluster.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are creating a DB cluster with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB cluster, then you can use the KMS key alias
     *            instead of the ARN for the KMS encryption key.
     *            </p>
     *            <p>
     *            If an encryption key isn't specified in <code>KmsKeyId</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>ReplicationSourceIdentifier</code> identifies an
     *            encrypted source, then Amazon RDS will use the encryption key
     *            used to encrypt the source. Otherwise, Amazon RDS will use
     *            your default encryption key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the <code>StorageEncrypted</code> parameter is enabled and
     *            <code>ReplicationSourceIdentifier</code> isn't specified, then
     *            Amazon RDS will use your default encryption key.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     *            <p>
     *            If you create a read replica of an encrypted DB cluster in
     *            another AWS Region, you must set <code>KmsKeyId</code> to a
     *            KMS key ID that is valid in the destination AWS Region. This
     *            key is used to encrypt the read replica in that AWS Region.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are creating a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * If an encryption key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted
     * source, then Amazon RDS will use the encryption key used to encrypt the
     * source. Otherwise, Amazon RDS will use your default encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and
     * <code>ReplicationSourceIdentifier</code> isn't specified, then Amazon RDS
     * will use your default encryption key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS KMS creates the default encryption key for your AWS account. Your AWS
     * account has a different default encryption key for each AWS Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another AWS
     * Region, you must set <code>KmsKeyId</code> to a KMS key ID that is valid
     * in the destination AWS Region. This key is used to encrypt the read
     * replica in that AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for an encrypted DB cluster.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are creating a DB cluster with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB cluster, then you can use the KMS key alias
     *            instead of the ARN for the KMS encryption key.
     *            </p>
     *            <p>
     *            If an encryption key isn't specified in <code>KmsKeyId</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>ReplicationSourceIdentifier</code> identifies an
     *            encrypted source, then Amazon RDS will use the encryption key
     *            used to encrypt the source. Otherwise, Amazon RDS will use
     *            your default encryption key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the <code>StorageEncrypted</code> parameter is enabled and
     *            <code>ReplicationSourceIdentifier</code> isn't specified, then
     *            Amazon RDS will use your default encryption key.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS KMS creates the default encryption key for your AWS
     *            account. Your AWS account has a different default encryption
     *            key for each AWS Region.
     *            </p>
     *            <p>
     *            If you create a read replica of an encrypted DB cluster in
     *            another AWS Region, you must set <code>KmsKeyId</code> to a
     *            KMS key ID that is valid in the destination AWS Region. This
     *            key is used to encrypt the read replica in that AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBCluster</code> action to be called in the source AWS Region
     * where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region
     * replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CreateDBCluster</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster in the destination AWS Region. This
     * should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> action that is called in the destination AWS
     * Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora
     * read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for
     * the encrypted DB cluster to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB cluster from the us-west-2 AWS Region,
     * then your <code>ReplicationSourceIdentifier</code> would look like
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     *
     * @return <p>
     *         A URL that contains a Signature Version 4 signed request for the
     *         <code>CreateDBCluster</code> action to be called in the source
     *         AWS Region where the DB cluster is replicated from. You only need
     *         to specify <code>PreSignedUrl</code> when you are performing
     *         cross-region replication from an encrypted DB cluster.
     *         </p>
     *         <p>
     *         The pre-signed URL must be a valid request for the
     *         <code>CreateDBCluster</code> API action that can be executed in
     *         the source AWS Region that contains the encrypted DB cluster to
     *         be copied.
     *         </p>
     *         <p>
     *         The pre-signed URL request must contain the following parameter
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The AWS KMS key identifier for the key to
     *         use to encrypt the copy of the DB cluster in the destination AWS
     *         Region. This should refer to the same KMS key for both the
     *         <code>CreateDBCluster</code> action that is called in the
     *         destination AWS Region, and the action contained in the
     *         pre-signed URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The name of the AWS Region that
     *         Aurora read replica will be created in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReplicationSourceIdentifier</code> - The DB cluster
     *         identifier for the encrypted DB cluster to be copied. This
     *         identifier must be in the Amazon Resource Name (ARN) format for
     *         the source AWS Region. For example, if you are copying an
     *         encrypted DB cluster from the us-west-2 AWS Region, then your
     *         <code>ReplicationSourceIdentifier</code> would look like Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *         > Authenticating Requests: Using Query Parameters (AWS Signature
     *         Version 4)</a> and <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *         > Signature Version 4 Signing Process</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using an AWS SDK tool or the AWS CLI, you can specify
     *         <code>SourceRegion</code> (or <code>--source-region</code> for
     *         the AWS CLI) instead of specifying <code>PreSignedUrl</code>
     *         manually. Specifying <code>SourceRegion</code> autogenerates a
     *         pre-signed URL that is a valid request for the operation that can
     *         be executed in the source AWS Region.
     *         </p>
     *         </note>
     */
    public String getPreSignedUrl() {
        return preSignedUrl;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBCluster</code> action to be called in the source AWS Region
     * where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region
     * replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CreateDBCluster</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster in the destination AWS Region. This
     * should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> action that is called in the destination AWS
     * Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora
     * read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for
     * the encrypted DB cluster to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB cluster from the us-west-2 AWS Region,
     * then your <code>ReplicationSourceIdentifier</code> would look like
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     *
     * @param preSignedUrl <p>
     *            A URL that contains a Signature Version 4 signed request for
     *            the <code>CreateDBCluster</code> action to be called in the
     *            source AWS Region where the DB cluster is replicated from. You
     *            only need to specify <code>PreSignedUrl</code> when you are
     *            performing cross-region replication from an encrypted DB
     *            cluster.
     *            </p>
     *            <p>
     *            The pre-signed URL must be a valid request for the
     *            <code>CreateDBCluster</code> API action that can be executed
     *            in the source AWS Region that contains the encrypted DB
     *            cluster to be copied.
     *            </p>
     *            <p>
     *            The pre-signed URL request must contain the following
     *            parameter values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsKeyId</code> - The AWS KMS key identifier for the key
     *            to use to encrypt the copy of the DB cluster in the
     *            destination AWS Region. This should refer to the same KMS key
     *            for both the <code>CreateDBCluster</code> action that is
     *            called in the destination AWS Region, and the action contained
     *            in the pre-signed URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DestinationRegion</code> - The name of the AWS Region
     *            that Aurora read replica will be created in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReplicationSourceIdentifier</code> - The DB cluster
     *            identifier for the encrypted DB cluster to be copied. This
     *            identifier must be in the Amazon Resource Name (ARN) format
     *            for the source AWS Region. For example, if you are copying an
     *            encrypted DB cluster from the us-west-2 AWS Region, then your
     *            <code>ReplicationSourceIdentifier</code> would look like
     *            Example:
     *            <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To learn how to generate a Signature Version 4 signed request,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            > Authenticating Requests: Using Query Parameters (AWS
     *            Signature Version 4)</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            > Signature Version 4 Signing Process</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using an AWS SDK tool or the AWS CLI, you can
     *            specify <code>SourceRegion</code> (or
     *            <code>--source-region</code> for the AWS CLI) instead of
     *            specifying <code>PreSignedUrl</code> manually. Specifying
     *            <code>SourceRegion</code> autogenerates a pre-signed URL that
     *            is a valid request for the operation that can be executed in
     *            the source AWS Region.
     *            </p>
     *            </note>
     */
    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBCluster</code> action to be called in the source AWS Region
     * where the DB cluster is replicated from. You only need to specify
     * <code>PreSignedUrl</code> when you are performing cross-region
     * replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CreateDBCluster</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster in the destination AWS Region. This
     * should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> action that is called in the destination AWS
     * Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that Aurora
     * read replica will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for
     * the encrypted DB cluster to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB cluster from the us-west-2 AWS Region,
     * then your <code>ReplicationSourceIdentifier</code> would look like
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preSignedUrl <p>
     *            A URL that contains a Signature Version 4 signed request for
     *            the <code>CreateDBCluster</code> action to be called in the
     *            source AWS Region where the DB cluster is replicated from. You
     *            only need to specify <code>PreSignedUrl</code> when you are
     *            performing cross-region replication from an encrypted DB
     *            cluster.
     *            </p>
     *            <p>
     *            The pre-signed URL must be a valid request for the
     *            <code>CreateDBCluster</code> API action that can be executed
     *            in the source AWS Region that contains the encrypted DB
     *            cluster to be copied.
     *            </p>
     *            <p>
     *            The pre-signed URL request must contain the following
     *            parameter values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsKeyId</code> - The AWS KMS key identifier for the key
     *            to use to encrypt the copy of the DB cluster in the
     *            destination AWS Region. This should refer to the same KMS key
     *            for both the <code>CreateDBCluster</code> action that is
     *            called in the destination AWS Region, and the action contained
     *            in the pre-signed URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DestinationRegion</code> - The name of the AWS Region
     *            that Aurora read replica will be created in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReplicationSourceIdentifier</code> - The DB cluster
     *            identifier for the encrypted DB cluster to be copied. This
     *            identifier must be in the Amazon Resource Name (ARN) format
     *            for the source AWS Region. For example, if you are copying an
     *            encrypted DB cluster from the us-west-2 AWS Region, then your
     *            <code>ReplicationSourceIdentifier</code> would look like
     *            Example:
     *            <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To learn how to generate a Signature Version 4 signed request,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            > Authenticating Requests: Using Query Parameters (AWS
     *            Signature Version 4)</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            > Signature Version 4 Signing Process</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using an AWS SDK tool or the AWS CLI, you can
     *            specify <code>SourceRegion</code> (or
     *            <code>--source-region</code> for the AWS CLI) instead of
     *            specifying <code>PreSignedUrl</code> manually. Specifying
     *            <code>SourceRegion</code> autogenerates a pre-signed URL that
     *            is a valid request for the operation that can be executed in
     *            the source AWS Region.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
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
    public CreateDBClusterRequest withEnableIAMDatabaseAuthentication(
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
    public CreateDBClusterRequest withBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of log types that need to be enabled for exporting to
     *         CloudWatch Logs. The values in the list depend on the DB engine
     *         being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *         <i>Amazon Aurora User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getEnableCloudwatchLogsExports() {
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of log types that need to be enabled for exporting to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon Aurora User Guide</i>.
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
     * The list of log types that need to be enabled for exporting to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of log types that need to be enabled for exporting to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withEnableCloudwatchLogsExports(
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
     * The list of log types that need to be enabled for exporting to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of log types that need to be enabled for exporting to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withEnableCloudwatchLogsExports(
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
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more
     * information, see the following sections in the <i>Amazon Aurora User
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Requirements for Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
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
     *         <code>provisioned</code> engine mode.
     *         </p>
     *         </note>
     *         <p>
     *         Limitations and requirements apply to some DB engine modes. For
     *         more information, see the following sections in the <i>Amazon
     *         Aurora User Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *         > Limitations of Aurora Serverless</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *         > Limitations of Parallel Query</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *         > Requirements for Aurora Global Databases</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *         > Limitations of Multi-Master Clusters</a>
     *         </p>
     *         </li>
     *         </ul>
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
     * engine mode.
     * </p>
     * </note>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more
     * information, see the following sections in the <i>Amazon Aurora User
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Requirements for Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
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
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     *            <p>
     *            Limitations and requirements apply to some DB engine modes.
     *            For more information, see the following sections in the
     *            <i>Amazon Aurora User Guide</i>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *            > Limitations of Aurora Serverless</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *            > Limitations of Parallel Query</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *            > Requirements for Aurora Global Databases</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *            > Limitations of Multi-Master Clusters</a>
     *            </p>
     *            </li>
     *            </ul>
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
     * engine mode.
     * </p>
     * </note>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more
     * information, see the following sections in the <i>Amazon Aurora User
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * > Limitations of Aurora Serverless</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * > Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * > Requirements for Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * > Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
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
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     *            <p>
     *            Limitations and requirements apply to some DB engine modes.
     *            For more information, see the following sections in the
     *            <i>Amazon Aurora User Guide</i>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *            > Limitations of Aurora Serverless</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *            > Limitations of Parallel Query</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *            > Requirements for Aurora Global Databases</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *            > Limitations of Multi-Master Clusters</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withEngineMode(String engineMode) {
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
    public CreateDBClusterRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
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
    public CreateDBClusterRequest withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary
     * cluster in the new global database cluster.
     * </p>
     *
     * @return <p>
     *         The global cluster ID of an Aurora cluster that becomes the
     *         primary cluster in the new global database cluster.
     *         </p>
     */
    public String getGlobalClusterIdentifier() {
        return globalClusterIdentifier;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary
     * cluster in the new global database cluster.
     * </p>
     *
     * @param globalClusterIdentifier <p>
     *            The global cluster ID of an Aurora cluster that becomes the
     *            primary cluster in the new global database cluster.
     *            </p>
     */
    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary
     * cluster in the new global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterIdentifier <p>
     *            The global cluster ID of an Aurora cluster that becomes the
     *            primary cluster in the new global database cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora
     * Serverless DB cluster. By default, the HTTP endpoint is disabled.
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
     *         A value that indicates whether to enable the HTTP endpoint for an
     *         Aurora Serverless DB cluster. By default, the HTTP endpoint is
     *         disabled.
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
    public Boolean isEnableHttpEndpoint() {
        return enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora
     * Serverless DB cluster. By default, the HTTP endpoint is disabled.
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
     *         A value that indicates whether to enable the HTTP endpoint for an
     *         Aurora Serverless DB cluster. By default, the HTTP endpoint is
     *         disabled.
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
    public Boolean getEnableHttpEndpoint() {
        return enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora
     * Serverless DB cluster. By default, the HTTP endpoint is disabled.
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
     * @param enableHttpEndpoint <p>
     *            A value that indicates whether to enable the HTTP endpoint for
     *            an Aurora Serverless DB cluster. By default, the HTTP endpoint
     *            is disabled.
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
    public void setEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        this.enableHttpEndpoint = enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora
     * Serverless DB cluster. By default, the HTTP endpoint is disabled.
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
     * @param enableHttpEndpoint <p>
     *            A value that indicates whether to enable the HTTP endpoint for
     *            an Aurora Serverless DB cluster. By default, the HTTP endpoint
     *            is disabled.
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
    public CreateDBClusterRequest withEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        this.enableHttpEndpoint = enableHttpEndpoint;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to
     * snapshots of the DB cluster. The default is not to copy them.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the DB
     *         cluster to snapshots of the DB cluster. The default is not to
     *         copy them.
     *         </p>
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to
     * snapshots of the DB cluster. The default is not to copy them.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the DB
     *         cluster to snapshots of the DB cluster. The default is not to
     *         copy them.
     *         </p>
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to
     * snapshots of the DB cluster. The default is not to copy them.
     * </p>
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the DB
     *            cluster to snapshots of the DB cluster. The default is not to
     *            copy them.
     *            </p>
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to
     * snapshots of the DB cluster. The default is not to copy them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the DB
     *            cluster to snapshots of the DB cluster. The default is not to
     *            copy them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication
     * to authenticate users that connect to the DB cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html"
     * >Kerberos Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Active Directory directory ID to create the DB cluster in.
     *         </p>
     *         <p>
     *         For Amazon Aurora DB clusters, Amazon RDS can use Kerberos
     *         Authentication to authenticate users that connect to the DB
     *         cluster. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html"
     *         >Kerberos Authentication</a> in the <i>Amazon Aurora User
     *         Guide</i>.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication
     * to authenticate users that connect to the DB cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html"
     * >Kerberos Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     *
     * @param domain <p>
     *            The Active Directory directory ID to create the DB cluster in.
     *            </p>
     *            <p>
     *            For Amazon Aurora DB clusters, Amazon RDS can use Kerberos
     *            Authentication to authenticate users that connect to the DB
     *            cluster. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html"
     *            >Kerberos Authentication</a> in the <i>Amazon Aurora User
     *            Guide</i>.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication
     * to authenticate users that connect to the DB cluster. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html"
     * >Kerberos Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            The Active Directory directory ID to create the DB cluster in.
     *            </p>
     *            <p>
     *            For Amazon Aurora DB clusters, Amazon RDS can use Kerberos
     *            Authentication to authenticate users that connect to the DB
     *            cluster. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html"
     *            >Kerberos Authentication</a> in the <i>Amazon Aurora User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterRequest withDomain(String domain) {
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
    public CreateDBClusterRequest withDomainIAMRoleName(String domainIAMRoleName) {
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
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getReplicationSourceIdentifier() != null)
            sb.append("ReplicationSourceIdentifier: " + getReplicationSourceIdentifier() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: " + getPreSignedUrl() + ",");
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
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: " + getGlobalClusterIdentifier() + ",");
        if (getEnableHttpEndpoint() != null)
            sb.append("EnableHttpEndpoint: " + getEnableHttpEndpoint() + ",");
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
                + ((getDBClusterParameterGroupName() == null) ? 0
                        : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
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
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEnableHttpEndpoint() == null) ? 0 : getEnableHttpEndpoint().hashCode());
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

        if (obj instanceof CreateDBClusterRequest == false)
            return false;
        CreateDBClusterRequest other = (CreateDBClusterRequest) obj;

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
        if (other.getDBClusterParameterGroupName() == null
                ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null
                && other.getDBClusterParameterGroupName().equals(
                        this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
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
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null
                && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
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
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null
                && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getEnableHttpEndpoint() == null ^ this.getEnableHttpEndpoint() == null)
            return false;
        if (other.getEnableHttpEndpoint() != null
                && other.getEnableHttpEndpoint().equals(this.getEnableHttpEndpoint()) == false)
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
